// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl

private class FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation extends FloatingActionButtonImpl.ShadowAnimatorImpl
{

	protected float getTargetShadowSize()
	{
		return elevation + hoveredFocusedTranslationZ;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #23  <Field float FloatingActionButtonImpl.elevation>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field FloatingActionButtonImpl this$0>
	//    5   11:getfield        #26  <Field float FloatingActionButtonImpl.hoveredFocusedTranslationZ>
	//    6   14:fadd            
	//    7   15:freturn         
	}

	final FloatingActionButtonImpl this$0;

	FloatingActionButtonImpl$ElevateToHoveredFocusedTranslationZAnimation()
	{
		this$0 = FloatingActionButtonImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field FloatingActionButtonImpl this$0>
		super(FloatingActionButtonImpl.this, ((FloatingActionButtonImpl._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #16  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl, FloatingActionButtonImpl$1)>
	//    7   11:return          
	}
}
