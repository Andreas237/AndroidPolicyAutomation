// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;
import java.io.IOException;

class CrashlyticsFileMarker
{

	public CrashlyticsFileMarker(String s, FileStore filestore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		markerName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String markerName>
		fileStore = filestore;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field FileStore fileStore>
	//    8   14:return          
	}

	private File getMarkerFile()
	{
		return new File(fileStore.getFilesDir(), markerName);
	//    0    0:new             #22  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field FileStore fileStore>
	//    4    8:invokeinterface #27  <Method File FileStore.getFilesDir()>
	//    5   13:aload_0         
	//    6   14:getfield        #15  <Field String markerName>
	//    7   17:invokespecial   #30  <Method void File(File, String)>
	//    8   20:areturn         
	}

	public boolean create()
	{
		boolean flag;
		try
		{
			flag = getMarkerFile().createNewFile();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method File getMarkerFile()>
	//    2    4:invokevirtual   #39  <Method boolean File.createNewFile()>
	//    3    7:istore_1        
		}
	//*   4    8:iload_1         
	//*   5    9:ireturn         
		catch(IOException ioexception)
	//*   6   10:astore_2        
		{
			Logger logger = Fabric.getLogger();
	//    7   11:invokestatic    #45  <Method Logger Fabric.getLogger()>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #47  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #48  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Error creating marker: ");
	//   13   24:aload           4
	//   14   26:ldc1            #50  <String "Error creating marker: ">
	//   15   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(markerName);
	//   17   32:aload           4
	//   18   34:aload_0         
	//   19   35:getfield        #15  <Field String markerName>
	//   20   38:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			logger.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   22   42:aload_3         
	//   23   43:ldc1            #56  <String "CrashlyticsCore">
	//   24   45:aload           4
	//   25   47:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   26   50:aload_2         
	//   27   51:invokeinterface #66  <Method void Logger.e(String, String, Throwable)>
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		}
		return flag;
	}

	public boolean isPresent()
	{
		return getMarkerFile().exists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method File getMarkerFile()>
	//    2    4:invokevirtual   #70  <Method boolean File.exists()>
	//    3    7:ireturn         
	}

	public boolean remove()
	{
		return getMarkerFile().delete();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method File getMarkerFile()>
	//    2    4:invokevirtual   #74  <Method boolean File.delete()>
	//    3    7:ireturn         
	}

	private final FileStore fileStore;
	private final String markerName;
}
