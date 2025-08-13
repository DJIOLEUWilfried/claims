package com.kozao.model.objet;

public class Resource {
	
		private int idResource;
		private String resource;
		private String resourceDescription;
		
		
		public Resource() {
			super();
		}

		public Resource(String resource, String resourceDescription, Category category) {
			super();
			this.resource = resource;
			this.resourceDescription = resourceDescription;
			this.category = category;
		}

		private Category category;

		public int getIdResource() {
			return idResource;
		}

		public void setIdResource(int idResource) {
			this.idResource = idResource;
		}

		public String getResource() {
			return resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public String getResourceDescription() {
			return resourceDescription;
		}

		public void setResourceDescription(String resourceDescription) {
			this.resourceDescription = resourceDescription;
		}
		
		
		
		
		

}
