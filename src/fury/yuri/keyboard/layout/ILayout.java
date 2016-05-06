package fury.yuri.keyboard.layout;

import java.io.File;
import java.util.Map;

public interface ILayout {

	double getDistance(int pos1, int pos2);

	int numberOfKeys();

	void toFile(File file);
	
	String keyboardToString(Map<Integer, Character> positionKeyMap);
}