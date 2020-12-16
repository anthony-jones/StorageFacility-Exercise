# StorageFacility-Exercise

Part 1: Adding items and examining contents

Your task is creating a class called StorageFacility that can be used to keep track of storage units and their contents. The class is to implement the following methods:

 - public void add(String unit, String item) adds the parameter item to the storage unit that is also given as a parameter.

 - public ArrayList<String> contents(String storageUnit) returns a list that contains all the items in the storage unit indicated by the parameter. If there is no such storage unit or it contains no items, the method should return an empty list.


Part 2: Listing the units and removing from unit

Now the class StorageFacility contains the functionality to add an item to a storage unit and to list the contents of a unit. Next add the possibilities to remove an item from a storage unit and to list all the units.

 - public void remove(String storageUnit, String item) removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain. If the storage unit would be empty after the removal, the method also removes the unit.
 
 - public ArrayList<String> storageUnits() returns the names of the storage units as a list. NB! Only the units that contain items are listed.

        - From MOOC.fi
