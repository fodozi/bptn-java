package com.bptn.course_Week3_;


	
  // Interface Definition
	interface ObsidiAdmin {
		void enrolled(int amount);

	}

	//High-Level Module
	class BptnLeadership {
		private ObsidiAdmin ObsidiAdmin;

		// Constructor that accepting a ObsidiAdmin interface
		public BptnLeadership(ObsidiAdmin obsidiadmin) {
			this.ObsidiAdmin = obsidiadmin;
		}

		// Enrollment process method
		public void enrolled(int amount) { 
			ObsidiAdmin.enrolled(amount); // Delegate enrollment processing


		}
	}

	class CohortOne implements ObsidiAdmin { 
		@Override
		public void enrolled(int amount) {
			System.out.println("Students Enrolled : " + amount );
		}
	}



