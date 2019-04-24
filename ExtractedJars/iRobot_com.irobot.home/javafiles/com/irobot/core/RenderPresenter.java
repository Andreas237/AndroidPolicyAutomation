// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class RenderPresenter
{
	private static final class CppProxy extends RenderPresenter
	{

		private native void nativeDestroy(long l);

		private native void native_centerMap(long l);

		private native void native_click(long l, float f, float f1);

		private native void native_onOpenGLSetup(long l, float f);

		private native void native_onRotationEnd(long l);

		private native void native_onScalingEnd(long l);

		private native void native_onTranslationEnd(long l);

		private native void native_onTranslationStart(long l, float f, float f1);

		private native void native_renderFrame(long l);

		private native void native_rotate(long l, float f, float f1);

		private native void native_scale(long l, float f, float f1, float f2);

		private native void native_setFrameInsets(long l, int i, int j, int k, int i1);

		private native void native_setFrameSize(long l, int i, int j);

		private native void native_translate(long l, float f, float f1, float f2);

		public void centerMap()
		{
			native_centerMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #57  <Method void native_centerMap(long)>
		//    4    8:return          
		}

		public void click(float f, float f1)
		{
			native_click(nativeRef, f, f1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:invokespecial   #61  <Method void native_click(long, float, float)>
		//    6   10:return          
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #66  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #68  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #71  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #75  <Method void Object.finalize()>
		//    4    8:return          
		}

		public void onOpenGLSetup(float f)
		{
			native_onOpenGLSetup(nativeRef, f);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:invokespecial   #79  <Method void native_onOpenGLSetup(long, float)>
		//    5    9:return          
		}

		public void onRotationEnd()
		{
			native_onRotationEnd(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method void native_onRotationEnd(long)>
		//    4    8:return          
		}

		public void onScalingEnd()
		{
			native_onScalingEnd(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #85  <Method void native_onScalingEnd(long)>
		//    4    8:return          
		}

		public void onTranslationEnd()
		{
			native_onTranslationEnd(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #88  <Method void native_onTranslationEnd(long)>
		//    4    8:return          
		}

		public void onTranslationStart(float f, float f1)
		{
			native_onTranslationStart(nativeRef, f, f1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:invokespecial   #91  <Method void native_onTranslationStart(long, float, float)>
		//    6   10:return          
		}

		public void renderFrame()
		{
			native_renderFrame(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #94  <Method void native_renderFrame(long)>
		//    4    8:return          
		}

		public void rotate(float f, float f1)
		{
			native_rotate(nativeRef, f, f1);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:invokespecial   #97  <Method void native_rotate(long, float, float)>
		//    6   10:return          
		}

		public void scale(float f, float f1, float f2)
		{
			native_scale(nativeRef, f, f1, f2);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:fload_3         
		//    6    8:invokespecial   #101 <Method void native_scale(long, float, float, float)>
		//    7   11:return          
		}

		public void setFrameInsets(int i, int j, int k, int l)
		{
			native_setFrameInsets(nativeRef, i, j, k, l);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:iload_2         
		//    5    7:iload_3         
		//    6    8:iload           4
		//    7   10:invokespecial   #105 <Method void native_setFrameInsets(long, int, int, int, int)>
		//    8   13:return          
		}

		public void setFrameSize(int i, int j)
		{
			native_setFrameSize(nativeRef, i, j);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #109 <Method void native_setFrameSize(long, int, int)>
		//    6   10:return          
		}

		public void translate(float f, float f1, float f2)
		{
			native_translate(nativeRef, f, f1, f2);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:fload_3         
		//    6    8:invokespecial   #112 <Method void native_translate(long, float, float, float)>
		//    7   11:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void RenderPresenter()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public RenderPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void centerMap();

	public abstract void click(float f, float f1);

	public abstract void onOpenGLSetup(float f);

	public abstract void onRotationEnd();

	public abstract void onScalingEnd();

	public abstract void onTranslationEnd();

	public abstract void onTranslationStart(float f, float f1);

	public abstract void renderFrame();

	public abstract void rotate(float f, float f1);

	public abstract void scale(float f, float f1, float f2);

	public abstract void setFrameInsets(int i, int j, int k, int l);

	public abstract void setFrameSize(int i, int j);

	public abstract void translate(float f, float f1, float f2);
}
