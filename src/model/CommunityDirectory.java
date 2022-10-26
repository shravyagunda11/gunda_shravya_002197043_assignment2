/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shravyagunda
 */
public class CommunityDirectory {
   
     ArrayList<Community> communityList;
     
     public CommunityDirectory(){
        
         this.communityList = new ArrayList();
       
     }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
     
     
     public Community addCommunity(Community newComm){
          communityList.add(newComm);
          return newComm;
     }

}
