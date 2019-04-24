// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.listener.AMapWidgetListener;

// Referenced classes of package com.amap.api.mapcore.util:
//			fq, fn, fr, ft

class fq$1$2
	implements Runnable
{

	public void run()
	{
		fq.b(a.a).b();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field fq$1 a>
	//    2    4:getfield        #24  <Field fq fq$1.a>
	//    3    7:invokestatic    #30  <Method fn fq.b(fq)>
	//    4   10:invokevirtual   #34  <Method void fn.b()>
	//    5   13:return          
	}

	final fq._cls1 a;

	fq$1$2(fq._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field fq$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/amap/api/mapcore/util/fq$1

/* anonymous class */
	class fq._cls1
		implements AMapWidgetListener
	{

		public void invalidateCompassView()
		{
			if(fq.b(a) == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field fq a>
		//*   2    4:invokestatic    #31  <Method fn fq.b(fq)>
		//*   3    7:ifnonnull       11
			{
				return;
		//    4   10:return          
			} else
			{
				fq.b(a).post(((Runnable) (new fq._cls1._cls2(this))));
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field fq a>
		//    7   15:invokestatic    #31  <Method fn fq.b(fq)>
		//    8   18:new             #15  <Class fq$1$2>
		//    9   21:dup             
		//   10   22:aload_0         
		//   11   23:invokespecial   #34  <Method void fq$1$2(fq$1)>
		//   12   26:invokevirtual   #40  <Method boolean fn.post(Runnable)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		public void invalidateScaleView()
		{
			if(fq.a(a) == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field fq a>
		//*   2    4:invokestatic    #44  <Method fr fq.a(fq)>
		//*   3    7:ifnonnull       11
			{
				return;
		//    4   10:return          
			} else
			{
				fq.a(a).post(new fq._cls1._cls1());
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field fq a>
		//    7   15:invokestatic    #44  <Method fr fq.a(fq)>
		//    8   18:new             #13  <Class fq$1$1>
		//    9   21:dup             
		//   10   22:aload_0         
		//   11   23:invokespecial   #45  <Method void fq$1$1(fq$1)>
		//   12   26:invokevirtual   #48  <Method boolean fr.post(Runnable)>
		//   13   29:pop             
				return;
		//   14   30:return          
			}
		}

		public void invalidateZoomController(float f)
		{
			if(fq.c(a) == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field fq a>
		//*   2    4:invokestatic    #54  <Method ft fq.c(fq)>
		//*   3    7:ifnonnull       11
			{
				return;
		//    4   10:return          
			} else
			{
				fq.c(a).post(new fq._cls1._cls3(f));
		//    5   11:aload_0         
		//    6   12:getfield        #22  <Field fq a>
		//    7   15:invokestatic    #54  <Method ft fq.c(fq)>
		//    8   18:new             #17  <Class fq$1$3>
		//    9   21:dup             
		//   10   22:aload_0         
		//   11   23:fload_1         
		//   12   24:invokespecial   #57  <Method void fq$1$3(fq$1, float)>
		//   13   27:invokevirtual   #60  <Method boolean ft.post(Runnable)>
		//   14   30:pop             
				return;
		//   15   31:return          
			}
		}

		public void setFrontViewVisibility(boolean flag)
		{
		//    0    0:return          
		}

		final fq a;

			
			{
				a = fq1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field fq a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #25  <Method void Object()>
			//    5    9:return          
			}

		// Unreferenced inner class com/amap/api/mapcore/util/fq$1$1

/* anonymous class */
		class fq._cls1._cls1
			implements Runnable
		{

			public void run()
			{
				fq.a(a.a).b();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field fq$1 a>
			//    2    4:getfield        #24  <Field fq fq$1.a>
			//    3    7:invokestatic    #29  <Method fr fq.a(fq)>
			//    4   10:invokevirtual   #34  <Method void fr.b()>
			//    5   13:return          
			}

			final fq._cls1 a;

					
					{
						a = fq._cls1.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field fq$1 a>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class com/amap/api/mapcore/util/fq$1$3

/* anonymous class */
		class fq._cls1._cls3
			implements Runnable
		{

			public void run()
			{
				fq.c(b.a).a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field fq$1 b>
			//    2    4:getfield        #29  <Field fq fq$1.a>
			//    3    7:invokestatic    #35  <Method ft fq.c(fq)>
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field float a>
			//    6   14:invokevirtual   #39  <Method void ft.a(float)>
			//    7   17:return          
			}

			final float a;
			final fq._cls1 b;

					
					{
						b = fq._cls1.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field fq$1 b>
						a = f;
					//    3    5:aload_0         
					//    4    6:fload_2         
					//    5    7:putfield        #21  <Field float a>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #24  <Method void Object()>
					//    8   14:return          
					}
		}

	}

}
