// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

public final class EdgeEffectCompat
{
	static class EdgeEffectApi21Impl extends EdgeEffectBaseImpl
	{

		public void onPull(EdgeEffect edgeeffect, float f, float f1)
		{
			edgeeffect.onPull(f, f1);
		//    0    0:aload_1         
		//    1    1:fload_2         
		//    2    2:fload_3         
		//    3    3:invokevirtual   #22  <Method void EdgeEffect.onPull(float, float)>
		//    4    6:return          
		}

		EdgeEffectApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void EdgeEffectCompat$EdgeEffectBaseImpl()>
		//    2    4:return          
		}
	}

	static class EdgeEffectBaseImpl
	{

		public void onPull(EdgeEffect edgeeffect, float f, float f1)
		{
			edgeeffect.onPull(f);
		//    0    0:aload_1         
		//    1    1:fload_2         
		//    2    2:invokevirtual   #19  <Method void EdgeEffect.onPull(float)>
		//    3    5:return          
		}

		EdgeEffectBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public EdgeEffectCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mEdgeEffect = new EdgeEffect(context);
	//    2    4:aload_0         
	//    3    5:new             #34  <Class EdgeEffect>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #36  <Method void EdgeEffect(Context)>
	//    7   13:putfield        #38  <Field EdgeEffect mEdgeEffect>
	//    8   16:return          
	}

	public static void onPull(EdgeEffect edgeeffect, float f, float f1)
	{
		IMPL.onPull(edgeeffect, f, f1);
	//    0    0:getstatic       #27  <Field EdgeEffectCompat$EdgeEffectBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #43  <Method void EdgeEffectCompat$EdgeEffectBaseImpl.onPull(EdgeEffect, float, float)>
	//    5    9:return          
	}

	public boolean draw(Canvas canvas)
	{
		return mEdgeEffect.draw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #47  <Method boolean EdgeEffect.draw(Canvas)>
	//    4    8:ireturn         
	}

	public void finish()
	{
		mEdgeEffect.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #50  <Method void EdgeEffect.finish()>
	//    3    7:return          
	}

	public boolean isFinished()
	{
		return mEdgeEffect.isFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #54  <Method boolean EdgeEffect.isFinished()>
	//    3    7:ireturn         
	}

	public boolean onAbsorb(int i)
	{
		mEdgeEffect.onAbsorb(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #59  <Method void EdgeEffect.onAbsorb(int)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean onPull(float f)
	{
		mEdgeEffect.onPull(f);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #63  <Method void EdgeEffect.onPull(float)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean onPull(float f, float f1)
	{
		IMPL.onPull(mEdgeEffect, f, f1);
	//    0    0:getstatic       #27  <Field EdgeEffectCompat$EdgeEffectBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    3    7:fload_1         
	//    4    8:fload_2         
	//    5    9:invokevirtual   #43  <Method void EdgeEffectCompat$EdgeEffectBaseImpl.onPull(EdgeEffect, float, float)>
		return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
	}

	public boolean onRelease()
	{
		mEdgeEffect.onRelease();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:invokevirtual   #67  <Method void EdgeEffect.onRelease()>
		return mEdgeEffect.isFinished();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    5   11:invokevirtual   #54  <Method boolean EdgeEffect.isFinished()>
	//    6   14:ireturn         
	}

	public void setSize(int i, int j)
	{
		mEdgeEffect.setSize(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field EdgeEffect mEdgeEffect>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #71  <Method void EdgeEffect.setSize(int, int)>
	//    5    9:return          
	}

	private static final EdgeEffectBaseImpl IMPL;
	private EdgeEffect mEdgeEffect;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((EdgeEffectBaseImpl) (new EdgeEffectApi21Impl()));
	//    3    8:new             #6   <Class EdgeEffectCompat$EdgeEffectApi21Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #25  <Method void EdgeEffectCompat$EdgeEffectApi21Impl()>
	//    6   15:putstatic       #27  <Field EdgeEffectCompat$EdgeEffectBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new EdgeEffectBaseImpl();
	//    8   19:new             #9   <Class EdgeEffectCompat$EdgeEffectBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #28  <Method void EdgeEffectCompat$EdgeEffectBaseImpl()>
	//   11   26:putstatic       #27  <Field EdgeEffectCompat$EdgeEffectBaseImpl IMPL>
	//*  12   29:return          
	}
}
