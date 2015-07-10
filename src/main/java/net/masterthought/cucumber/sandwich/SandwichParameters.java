package net.masterthought.cucumber.sandwich;

import com.beust.jcommander.Parameter;

public class SandwichParameters {

    @Parameter(names = "-f", required = true, description = "Folder to monitor for cucumber.json report files")
    private String folder;

    @Parameter(names = "-o", required = true, description = "Output directory to generate the cucumber-html-reports into")
    private String outDir;
    
    @Parameter(names = "-d", required = true, description = "Device Name")
    private String deviceName;

    @Parameter(names = "-p", required = true, description = "Platform")
    private String platform;
    
    @Parameter(names = "-v", required = true, description = "Version")
    private String version;
    
    @Parameter(names = "-i", required = true, description = "Image path")
    private String imagePath;
    
    @Parameter(names = "-t", required = true, description = "Test Name")
    private String testName;

    @Parameter(names = "-n", required = false, description = "run once without file change listener")
    private Boolean withoutListener = false;
    
    @Parameter(names = "-r", required = false, description = "replace rerun result")
    private Boolean replaceRerunResult = false;
    
    @Parameter(names = "-j", required = false, description = "rerun json result")
    private String rerunJsonResult;
    
    public String getFolder(){
        return folder;
    }

    public String getOutDir(){
        return outDir;
    }

    public Boolean getWithoutListener(){
        return withoutListener;
    }

	public String getDeviceName() {
		return deviceName;
	}

	public String getPlatform() {
		return platform;
	}

	public String getVersion() {
		return version;
	}

	public String getImagePath() {
		return imagePath;
	}

	public String getTestName() {
		return testName;
	}

	public Boolean getReplaceRerunResult() {
		return replaceRerunResult;
	}

	public String getRerunJsonResult() {
		return rerunJsonResult;
	}
}
