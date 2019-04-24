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
		int ai[] = new int[val$permissions.length];
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String[] val$permissions>
	//    2    4:arraylength     
	//    3    5:newarray        int[]
	//    4    7:astore_3        
		PackageManager packagemanager = val$activity.getPackageManager();
	//    5    8:aload_0         
	//    6    9:getfield        #23  <Field Activity val$activity>
	//    7   12:invokevirtual   #36  <Method PackageManager Activity.getPackageManager()>
	//    8   15:astore          4
		String s = val$activity.getPackageName();
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field Activity val$activity>
	//   11   21:invokevirtual   #40  <Method String Activity.getPackageName()>
	//   12   24:astore          5
		int j = val$permissions.length;
	//   13   26:aload_0         
	//   14   27:getfield        #21  <Field String[] val$permissions>
	//   15   30:arraylength     
	//   16   31:istore_2        
		for(int i = 0; i < j; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:iload_2         
	//*  21   36:icmpge          62
			ai[i] = packagemanager.checkPermission(val$permissions[i], s);
	//   22   39:aload_3         
	//   23   40:iload_1         
	//   24   41:aload           4
	//   25   43:aload_0         
	//   26   44:getfield        #21  <Field String[] val$permissions>
	//   27   47:iload_1         
	//   28   48:aaload          
	//   29   49:aload           5
	//   30   51:invokevirtual   #46  <Method int PackageManager.checkPermission(String, String)>
	//   31   54:iastore         

	//   32   55:iload_1         
	//   33   56:iconst_1        
	//   34   57:iadd            
	//   35   58:istore_1        
	//*  36   59:goto            34
		((RequestPermissionsResultCallback)val$activity).onRequestPermissionsResult(val$requestCode, val$permissions, ai);
	//   37   62:aload_0         
	//   38   63:getfield        #23  <Field Activity val$activity>
	//   39   66:checkcast       #48  <Class ActivityCompat$OnRequestPermissionsResultCallback>
	//   40   69:aload_0         
	//   41   70:getfield        #25  <Field int val$requestCode>
	//   42   73:aload_0         
	//   43   74:getfield        #21  <Field String[] val$permissions>
	//   44   77:aload_3         
	//   45   78:invokeinterface #52  <Method void ActivityCompat$OnRequestPermissionsResultCallback.onRequestPermissionsResult(int, String[], int[])>
	//   46   83:return          
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
