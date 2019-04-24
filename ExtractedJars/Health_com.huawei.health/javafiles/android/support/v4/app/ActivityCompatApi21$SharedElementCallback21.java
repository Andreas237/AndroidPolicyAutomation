// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v4.app:
//			ActivityCompatApi21

public static abstract class ActivityCompatApi21$SharedElementCallback21
{

	public abstract Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf);

	public abstract View onCreateSnapshotView(Context context, Parcelable parcelable);

	public abstract void onMapSharedElements(List list, Map map);

	public abstract void onRejectSharedElements(List list);

	public abstract void onSharedElementEnd(List list, List list1, List list2);

	public abstract void onSharedElementStart(List list, List list1, List list2);

	public ActivityCompatApi21$SharedElementCallback21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
