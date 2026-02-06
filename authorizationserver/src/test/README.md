## Test strategy

Unit test vs Integration test location  
Test type	Purpose	Location    
Unit test	Test use case in isolation	src/test/java/com/frodo/auth/application  
Integration	Test use case with real infrastructure (DB, JWT, etc.)	src/test/java/com/frodo/auth/infrastructure or .../integration