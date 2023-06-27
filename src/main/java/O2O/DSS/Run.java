package O2O.DSS;

import java.io.IOException;

public class Run {
	public static void main (String[] args) throws InterruptedException, IOException {
//		CreatedDADEV CDEV = new CreatedDADEV();
//		WriteFileEx W = new WriteFileEx();
//		CreatedDAstaging CStaging = new CreatedDAstaging();
//		CreateNVK CNV = new CreateNVK();
//		CreatedNVDXS CDXS = new CreatedNVDXS();
//		CDEV.Dev();
//		W.Write();
//		CStaging.Staging();
//		CNV.Created();
//		CDXS.CreatedDXS();
//		VerifyTitle Vt = new VerifyTitle ();
//		Vt.Verify();
		
		GanNV job = new GanNV();
		job.run();
}
}