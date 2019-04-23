// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

public final class EdgeEffectCompat
{

	public EdgeEffectCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mEdgeEffect = new EdgeEffect(context);
	//    2    4:aload_0         
	//    3    5:new             #14  <Class EdgeEffect>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #16  <Method void EdgeEffect(Context)>
	//    7   13:putfield        #18  <Field EdgeEffect mEdgeEffect>
	//    8   16:return          
	}

	public static void onPull(EdgeEffect edgeeffect, float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
		{
			edgeeffect.onPull(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokevirtual   #32  <Method void EdgeEffect.onPull(float, float)>
			return;
	//    7   14:return          
		} else
		{
			edgeeffect.onPull(f);
	//    8   15:aload_0         
	//    9   16:fload_1         
	//   10   17:invokevirtual   #35  <Method void EdgeEffect.onPull(float)>
			return;
	//   11   20:return          
		}
	}

	public boolean draw(Canvas canvas)
	{
		return mEdgeEffect.draw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method boolean EdgeEffect.draw(Canvas)>
	//    4    8:ireturn         
	}

	public void finish()
	{
		mEdgeEffect.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #43  <Method void EdgeEffect.finish()>
	//    3    7:return          
	}

	public boolean isFinished()
	{
		return mEdgeEffect.isFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #47  <Method boolean EdgeEffect.isFinished()>
	//    3    7:ireturn         
	}

	public boolean onAbsorb(int i)
	{
		mEdgeEffect.onAbsorb(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #52  <Method void EdgeEffect.onAbsorb(int)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean onPull(float f)
	{
		mEdgeEffect.onPull(f);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #35  <Method void EdgeEffect.onPull(float)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean onPull(float f, float f1)
	{
		onPull(mEdgeEffect, f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #56  <Method void onPull(EdgeEffect, float, float)>
		return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public boolean onRelease()
	{
		mEdgeEffect.onRelease();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #59  <Method void EdgeEffect.onRelease()>
		return mEdgeEffect.isFinished();
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    5   11:invokevirtual   #47  <Method boolean EdgeEffect.isFinished()>
	//    6   14:ireturn         
	}

	public void setSize(int i, int j)
	{
		mEdgeEffect.setSize(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field EdgeEffect mEdgeEffect>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #63  <Method void EdgeEffect.setSize(int, int)>
	//    5    9:return          
	}

	private EdgeEffect mEdgeEffect;
}
