// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;

// Referenced classes of package android.support.v4.app:
//			ActivityCompat

static final class ActivityCompat$1
	implements Runnable
{

	public void run()
	{
		Object aobj[] = ((Object []) (val$permissions));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String[] val$permissions>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		aobj = ((Object []) (new int[aobj.length]));
	//    5    7:aload_3         
	//    6    8:arraylength     
	//    7    9:newarray        int[]
	//    8   11:astore_3        
		PackageManager packagemanager = val$activity.getPackageManager();
	//    9   12:aload_0         
	//   10   13:getfield        #23  <Field Activity val$activity>
	//   11   16:invokevirtual   #36  <Method PackageManager Activity.getPackageManager()>
	//   12   19:astore          4
		String s = val$activity.getPackageName();
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field Activity val$activity>
	//   15   25:invokevirtual   #40  <Method String Activity.getPackageName()>
	//   16   28:astore          5
		for(int j = val$permissions.length; i < j; i++)
	//*  17   30:aload_0         
	//*  18   31:getfield        #21  <Field String[] val$permissions>
	//*  19   34:arraylength     
	//*  20   35:istore_2        
	//*  21   36:iload_1         
	//*  22   37:iload_2         
	//*  23   38:icmpge          64
			aobj[i] = packagemanager.checkPermission(val$permissions[i], s);
	//   24   41:aload_3         
	//   25   42:iload_1         
	//   26   43:aload           4
	//   27   45:aload_0         
	//   28   46:getfield        #21  <Field String[] val$permissions>
	//   29   49:iload_1         
	//   30   50:aaload          
	//   31   51:aload           5
	//   32   53:invokevirtual   #46  <Method int PackageManager.checkPermission(String, String)>
	//   33   56:iastore         

	//   34   57:iload_1         
	//   35   58:iconst_1        
	//   36   59:iadd            
	//   37   60:istore_1        
	//*  38   61:goto            36
		((RequestPermissionsResultCallback)val$activity).onRequestPermissionsResult(val$requestCode, val$permissions, ((int []) (aobj)));
	//   39   64:aload_0         
	//   40   65:getfield        #23  <Field Activity val$activity>
	//   41   68:checkcast       #48  <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//   42   71:aload_0         
	//   43   72:getfield        #25  <Field int val$requestCode>
	//   44   75:aload_0         
	//   45   76:getfield        #21  <Field String[] val$permissions>
	//   46   79:aload_3         
	//   47   80:invokeinterface #52  <Method void ActivityCompat$OnRequestPermissionsResultCallback.onRequestPermissionsResult(int, String[], int[])>
	//   48   85:return          
	}

	final Activity val$activity;
	final String val$permissions[];
	final int val$requestCode;

	ActivityCompat$1(String as[], Activity activity1, int i)
	{
		val$permissions = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String[] val$permissions>
		val$activity = activity1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Activity val$activity>
		val$requestCode = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$requestCode>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
