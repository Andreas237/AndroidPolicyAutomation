// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.widget.EdgeEffect;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$EdgeEffectFactory
{
	public static interface EdgeDirection
		extends Annotation
	{
	}


	protected EdgeEffect createEdgeEffect(RecyclerView recyclerview, int i)
	{
		return new EdgeEffect(recyclerview.getContext());
	//    0    0:new             #29  <Class EdgeEffect>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method android.content.Context RecyclerView.getContext()>
	//    4    8:invokespecial   #36  <Method void EdgeEffect(android.content.Context)>
	//    5   11:areturn         
	}

	public static final int DIRECTION_BOTTOM = 3;
	public static final int DIRECTION_LEFT = 0;
	public static final int DIRECTION_RIGHT = 2;
	public static final int DIRECTION_TOP = 1;

	public RecyclerView$EdgeEffectFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
