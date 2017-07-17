package com.mycompany.yupDev_RecyclerView;

import java.util.*;

 class ListInfo {
    String name;
    String age;
    int photo;

    ListInfo(String name, String age, int photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
		
    }


	public String getName() {
        return name;
    }
	
	public String getAge() {
        return age;
    }
	
	public int getPhoto() {
        return photo;
    }
	
}
	




//	private List<ListInfo> theListArray;
//
//// This method creates an ArrayList that has three Person objects
//// Checkout the project associated with this tutorial on Github if
//// you want to use the same images.
//	private void initializeData(){
//		theListArray = new ArrayList<>();
//		theListArray.add(new ListInfo("Emma Wilson", "23 years old", R.drawable.mask));
//		theListArray.add(new ListInfo("Lavery Maiss", "25 years old", R.drawable.mask));
//		theListArray.add(new ListInfo("Lillie Watts", "35 years old", R.drawable.mask));
//	}
