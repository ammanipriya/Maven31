package com.facebook.test;

import java.io.IOException;

public class File_manager {
private File_manager(){
	
}

public static File_manager getInstancefm() {
	File_manager fm = new File_manager();
			return fm;
}
public static Test_Data getInstancetd() throws IOException {
	Test_Data td = new Test_Data();
	return td;
}

}
