// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public final class DragAndDropPermissionsCompat
{

	private DragAndDropPermissionsCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mDragAndDropPermissions = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object mDragAndDropPermissions>
	//    5    9:return          
	}

	public static DragAndDropPermissionsCompat request(Activity activity, DragEvent dragevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          27
		{
			activity = ((Activity) (activity.requestDragAndDropPermissions(dragevent)));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #33  <Method DragAndDropPermissions Activity.requestDragAndDropPermissions(DragEvent)>
	//    6   13:astore_0        
			if(activity != null)
	//*   7   14:aload_0         
	//*   8   15:ifnull          27
				return new DragAndDropPermissionsCompat(((Object) (activity)));
	//    9   18:new             #2   <Class DragAndDropPermissionsCompat>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokespecial   #35  <Method void DragAndDropPermissionsCompat(Object)>
	//   13   26:areturn         
		}
		return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
	}

	public void release()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          18
			((DragAndDropPermissions)mDragAndDropPermissions).release();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mDragAndDropPermissions>
	//    5   12:checkcast       #39  <Class DragAndDropPermissions>
	//    6   15:invokevirtual   #41  <Method void DragAndDropPermissions.release()>
	//    7   18:return          
	}

	private Object mDragAndDropPermissions;
}
