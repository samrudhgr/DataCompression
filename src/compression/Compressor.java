package compression;

import java.util.Map;

public class Compressor {
	private String encodedContent;
	private String content;
	private Map<String, String> dictionary;
	
	public String compress(String filename) {
		// Step 1
		FileOperation fileUtil = new FileOperation();
		content = fileUtil.readFile(filename);
		
		// step 2 => TODO
		HaffmansAlgorithm algorithm = new HaffmansAlgorithm();
		dictionary = algorithm.getDictionary(content);
		
		// step 3
		encode();
		
		// step 4
		String newFileName = fileUtil.writeFile(encodedContent, );
		
		return newFileName;
	}

	public static void main(String[] args)
	{
		Compressor compressor = new Compressor();
		String compressedFilename = compressor.compress("D://ise1//compress.txt");
	}

}
 