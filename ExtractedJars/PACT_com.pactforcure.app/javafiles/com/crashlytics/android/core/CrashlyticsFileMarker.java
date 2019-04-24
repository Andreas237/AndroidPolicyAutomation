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
			Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Error creating marker: ").append(markerName).toString(), ((Throwable) (ioexception)));
	//    7   11:invokestatic    #45  <Method Logger Fabric.getLogger()>
	//    8   14:ldc1            #47  <String "CrashlyticsCore">
	//    9   16:new             #49  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #50  <Method void StringBuilder()>
	//   12   23:ldc1            #52  <String "Error creating marker: ">
	//   13   25:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_0         
	//   15   29:getfield        #15  <Field String markerName>
	//   16   32:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   18   38:aload_2         
	//   19   39:invokeinterface #66  <Method void Logger.e(String, String, Throwable)>
			return false;
	//   20   44:iconst_0        
	//   21   45:ireturn         
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
