// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.io.File;
import java.net.URL;

// Referenced classes of package com.craftar:
//			CLog, CraftARError, CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager

class CraftAROnDeviceCollectionManager$2$1
	implements ollectionListener
{

	public void addCollectionFailed(CraftARError craftarerror)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//*   2    4:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//*   3    7:ifnull          23
			val$listener.addCollectionFailed(craftarerror);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//    6   14:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #29  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
	//    9   23:return          
	}

	public void addCollectionProgress(float f)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #33  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("AddCollectionProgress in sync: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #36  <String "AddCollectionProgress in sync: ">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(f);
	//    8   15:aload_3         
	//    9   16:fload_1         
	//   10   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(float)>
	//   11   20:pop             
		CLog.d(stringbuilder.toString());
	//   12   21:aload_3         
	//   13   22:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #53  <Method void CLog.d(String)>
		if(val$listener != null)
	//*  15   28:aload_0         
	//*  16   29:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//*  17   32:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//*  18   35:ifnull          68
		{
			float f1 = f / 2.0F + 0.5F;
	//   19   38:fload_1         
	//   20   39:fconst_2        
	//   21   40:fdiv            
	//   22   41:ldc1            #54  <Float 0.5F>
	//   23   43:fadd            
	//   24   44:fstore_2        
			f = f1;
	//   25   45:fload_2         
	//   26   46:fstore_1        
			if(f1 > 1.0F)
	//*  27   47:fload_2         
	//*  28   48:fconst_1        
	//*  29   49:fcmpl           
	//*  30   50:ifle            55
				f = 1.0F;
	//   31   53:fconst_1        
	//   32   54:fstore_1        
			val$listener.addCollectionProgress(f);
	//   33   55:aload_0         
	//   34   56:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//   35   59:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//   36   62:fload_1         
	//   37   63:invokeinterface #56  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
		}
	//   38   68:return          
	}

	public void collectionAdded(CraftAROnDeviceCollection craftarondevicecollection)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//*   2    4:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//*   3    7:ifnull          23
			val$listener.collectionAdded(craftarondevicecollection);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
	//    6   14:getfield        #27  <Field CraftAROnDeviceCollectionManager$AddCollectionListener CraftAROnDeviceCollectionManager$2.val$listener>
	//    7   17:aload_1         
	//    8   18:invokeinterface #60  <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.collectionAdded(CraftAROnDeviceCollection)>
	//    9   23:return          
	}

	final CraftAROnDeviceCollectionManager._cls2 this$1;

	CraftAROnDeviceCollectionManager$2$1()
	{
		this$1 = CraftAROnDeviceCollectionManager._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CraftAROnDeviceCollectionManager$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/craftar/CraftAROnDeviceCollectionManager$2

/* anonymous class */
	class CraftAROnDeviceCollectionManager._cls2
		implements ResourceDownloader.DownloadProgressHandler
	{

		public void onDownloadFinished(int i, int j, URL url, boolean flag)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #47  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #48  <Method void StringBuilder()>
		//    3    7:astore          5
			stringbuilder.append("Download finished for bundle ");
		//    4    9:aload           5
		//    5   11:ldc1            #50  <String "Download finished for bundle ">
		//    6   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(bundleURL);
		//    8   17:aload           5
		//    9   19:aload_0         
		//   10   20:getfield        #29  <Field String val$bundleURL>
		//   11   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:pop             
			stringbuilder.append("Sucesss:");
		//   13   27:aload           5
		//   14   29:ldc1            #56  <String "Sucesss:">
		//   15   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
			stringbuilder.append(flag);
		//   17   35:aload           5
		//   18   37:iload           4
		//   19   39:invokevirtual   #59  <Method StringBuilder StringBuilder.append(boolean)>
		//   20   42:pop             
			CLog.d(stringbuilder.toString());
		//   21   43:aload           5
		//   22   45:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   23   48:invokestatic    #69  <Method void CLog.d(String)>
			if(listener != null)
		//*  24   51:aload_0         
		//*  25   52:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
		//*  26   55:ifnull          170
			{
				if(flag)
		//*  27   58:iload           4
		//*  28   60:ifeq            96
				{
					url = ((URL) (new File(bundleOutputPath)));
		//   29   63:new             #71  <Class File>
		//   30   66:dup             
		//   31   67:aload_0         
		//   32   68:getfield        #33  <Field String val$bundleOutputPath>
		//   33   71:invokespecial   #73  <Method void File(String)>
		//   34   74:astore_3        
					CraftAROnDeviceCollectionManager._cls2._cls1 _lcls1 = new CraftAROnDeviceCollectionManager._cls2._cls1();
		//   35   75:new             #13  <Class CraftAROnDeviceCollectionManager$2$1>
		//   36   78:dup             
		//   37   79:aload_0         
		//   38   80:invokespecial   #76  <Method void CraftAROnDeviceCollectionManager$2$1(CraftAROnDeviceCollectionManager$2)>
		//   39   83:astore          5
					addCollection(((File) (url)), ((CraftAROnDeviceCollectionManager.AddCollectionListener) (_lcls1)));
		//   40   85:aload_0         
		//   41   86:getfield        #27  <Field CraftAROnDeviceCollectionManager this$0>
		//   42   89:aload_3         
		//   43   90:aload           5
		//   44   92:invokevirtual   #80  <Method void CraftAROnDeviceCollectionManager.addCollection(File, CraftAROnDeviceCollectionManager$AddCollectionListener)>
					return;
		//   45   95:return          
				}
				Object obj = ((Object) (CraftARError.ERROR_CODES.ERROR_NETWORK));
		//   46   96:getstatic       #86  <Field CraftARError$ERROR_CODES CraftARError$ERROR_CODES.ERROR_NETWORK>
		//   47   99:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
		//   48  101:new             #47  <Class StringBuilder>
		//   49  104:dup             
		//   50  105:invokespecial   #48  <Method void StringBuilder()>
		//   51  108:astore          6
				stringbuilder1.append("Error downloading the bundle from ");
		//   52  110:aload           6
		//   53  112:ldc1            #88  <String "Error downloading the bundle from ">
		//   54  114:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   55  117:pop             
				stringbuilder1.append(url.toString());
		//   56  118:aload           6
		//   57  120:aload_3         
		//   58  121:invokevirtual   #91  <Method String URL.toString()>
		//   59  124:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   60  127:pop             
				url = ((URL) (new CraftARError(((CraftARError.ERROR_CODES) (obj)), stringbuilder1.toString())));
		//   61  128:new             #93  <Class CraftARError>
		//   62  131:dup             
		//   63  132:aload           5
		//   64  134:aload           6
		//   65  136:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   66  139:invokespecial   #96  <Method void CraftARError(CraftARError$ERROR_CODES, String)>
		//   67  142:astore_3        
				obj = ((Object) (listener));
		//   68  143:aload_0         
		//   69  144:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
		//   70  147:astore          5
				if(obj != null)
		//*  71  149:aload           5
		//*  72  151:ifnull          163
				{
					((CraftAROnDeviceCollectionManager.AddCollectionListener) (obj)).addCollectionFailed(((CraftARError) (url)));
		//   73  154:aload           5
		//   74  156:aload_3         
		//   75  157:invokeinterface #102 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionFailed(CraftARError)>
					return;
		//   76  162:return          
				}
				CLog.e(((CraftARError) (url)).getErrorMessage());
		//   77  163:aload_3         
		//   78  164:invokevirtual   #105 <Method String CraftARError.getErrorMessage()>
		//   79  167:invokestatic    #108 <Method void CLog.e(String)>
			}
		//   80  170:return          
		}

		public void onDownloadProgress(int i, int j)
		{
			mDownloadedBytes = mDownloadedBytes + (long)j;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #38  <Field long mDownloadedBytes>
		//    3    5:iload_2         
		//    4    6:i2l             
		//    5    7:ladd            
		//    6    8:putfield        #38  <Field long mDownloadedBytes>
			float f = (float)mDownloadedBytes / (float)mTotalBytes;
		//    7   11:aload_0         
		//    8   12:getfield        #38  <Field long mDownloadedBytes>
		//    9   15:l2f             
		//   10   16:aload_0         
		//   11   17:getfield        #42  <Field long mTotalBytes>
		//   12   20:l2f             
		//   13   21:fdiv            
		//   14   22:fstore_3        
			Object obj = ((Object) (new StringBuilder()));
		//   15   23:new             #47  <Class StringBuilder>
		//   16   26:dup             
		//   17   27:invokespecial   #48  <Method void StringBuilder()>
		//   18   30:astore          4
			((StringBuilder) (obj)).append("Download progress for bundle ");
		//   19   32:aload           4
		//   20   34:ldc1            #112 <String "Download progress for bundle ">
		//   21   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   22   39:pop             
			((StringBuilder) (obj)).append(bundleURL);
		//   23   40:aload           4
		//   24   42:aload_0         
		//   25   43:getfield        #29  <Field String val$bundleURL>
		//   26   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   27   49:pop             
			((StringBuilder) (obj)).append(" downloaded ");
		//   28   50:aload           4
		//   29   52:ldc1            #114 <String " downloaded ">
		//   30   54:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   31   57:pop             
			((StringBuilder) (obj)).append(f);
		//   32   58:aload           4
		//   33   60:fload_3         
		//   34   61:invokevirtual   #117 <Method StringBuilder StringBuilder.append(float)>
		//   35   64:pop             
			CLog.d(((StringBuilder) (obj)).toString());
		//   36   65:aload           4
		//   37   67:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   38   70:invokestatic    #69  <Method void CLog.d(String)>
			obj = ((Object) (listener));
		//   39   73:aload_0         
		//   40   74:getfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
		//   41   77:astore          4
			if(obj != null)
		//*  42   79:aload           4
		//*  43   81:ifnull          94
				((CraftAROnDeviceCollectionManager.AddCollectionListener) (obj)).addCollectionProgress(f / 2.0F);
		//   44   84:aload           4
		//   45   86:fload_3         
		//   46   87:fconst_2        
		//   47   88:fdiv            
		//   48   89:invokeinterface #121 <Method void CraftAROnDeviceCollectionManager$AddCollectionListener.addCollectionProgress(float)>
		//   49   94:return          
		}

		public void onFileSizeDetermined(int i, long l)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #47  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #48  <Method void StringBuilder()>
		//    3    7:astore          4
			stringbuilder.append("File size determined for bundle ");
		//    4    9:aload           4
		//    5   11:ldc1            #125 <String "File size determined for bundle ">
		//    6   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(bundleURL);
		//    8   17:aload           4
		//    9   19:aload_0         
		//   10   20:getfield        #29  <Field String val$bundleURL>
		//   11   23:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   12   26:pop             
			stringbuilder.append(":");
		//   13   27:aload           4
		//   14   29:ldc1            #127 <String ":">
		//   15   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   16   34:pop             
			stringbuilder.append(l);
		//   17   35:aload           4
		//   18   37:lload_2         
		//   19   38:invokevirtual   #130 <Method StringBuilder StringBuilder.append(long)>
		//   20   41:pop             
			CLog.d(stringbuilder.toString());
		//   21   42:aload           4
		//   22   44:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   23   47:invokestatic    #69  <Method void CLog.d(String)>
			mTotalBytes = l;
		//   24   50:aload_0         
		//   25   51:lload_2         
		//   26   52:putfield        #42  <Field long mTotalBytes>
		//   27   55:return          
		}

		long mDownloadedBytes;
		long mTotalBytes;
		final CraftAROnDeviceCollectionManager this$0;
		final String val$bundleOutputPath;
		final String val$bundleURL;
		final CraftAROnDeviceCollectionManager.AddCollectionListener val$listener;

			
			{
				this$0 = final_craftarondevicecollectionmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field CraftAROnDeviceCollectionManager this$0>
				bundleURL = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field String val$bundleURL>
				listener = addcollectionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field CraftAROnDeviceCollectionManager$AddCollectionListener val$listener>
				bundleOutputPath = String.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field String val$bundleOutputPath>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #36  <Method void Object()>
				mDownloadedBytes = 0L;
			//   14   25:aload_0         
			//   15   26:lconst_0        
			//   16   27:putfield        #38  <Field long mDownloadedBytes>
				mTotalBytes = -1L;
			//   17   30:aload_0         
			//   18   31:ldc2w           #39  <Long -1L>
			//   19   34:putfield        #42  <Field long mTotalBytes>
			//   20   37:return          
			}
	}

}
