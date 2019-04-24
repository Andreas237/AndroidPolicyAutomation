// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			MarginLayoutParamsCompatJellybeanMr1

public final class MarginLayoutParamsCompat
{
	static interface MarginLayoutParamsCompatImpl
	{

		public abstract int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

		public abstract int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

		public abstract int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

		public abstract boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams);

		public abstract void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

		public abstract void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

		public abstract void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);

		public abstract void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i);
	}

	static class MarginLayoutParamsCompatImplBase
		implements MarginLayoutParamsCompatImpl
	{

		public int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return marginlayoutparams.rightMargin;
		//    0    0:aload_1         
		//    1    1:getfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//    2    4:ireturn         
		}

		public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return marginlayoutparams.leftMargin;
		//    0    0:aload_1         
		//    1    1:getfield        #27  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//    2    4:ireturn         
		}

		public boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
		//    0    0:return          
		}

		public void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
		//    0    0:return          
		}

		public void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			marginlayoutparams.rightMargin = i;
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:putfield        #23  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//    3    5:return          
		}

		public void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			marginlayoutparams.leftMargin = i;
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:putfield        #27  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//    3    5:return          
		}

		MarginLayoutParamsCompatImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class MarginLayoutParamsCompatImplJbMr1
		implements MarginLayoutParamsCompatImpl
	{

		public int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return MarginLayoutParamsCompatJellybeanMr1.getLayoutDirection(marginlayoutparams);
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method int MarginLayoutParamsCompatJellybeanMr1.getLayoutDirection(android.view.ViewGroup$MarginLayoutParams)>
		//    2    4:ireturn         
		}

		public int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return MarginLayoutParamsCompatJellybeanMr1.getMarginEnd(marginlayoutparams);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method int MarginLayoutParamsCompatJellybeanMr1.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
		//    2    4:ireturn         
		}

		public int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return MarginLayoutParamsCompatJellybeanMr1.getMarginStart(marginlayoutparams);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int MarginLayoutParamsCompatJellybeanMr1.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
		//    2    4:ireturn         
		}

		public boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			return MarginLayoutParamsCompatJellybeanMr1.isMarginRelative(marginlayoutparams);
		//    0    0:aload_1         
		//    1    1:invokestatic    #30  <Method boolean MarginLayoutParamsCompatJellybeanMr1.isMarginRelative(android.view.ViewGroup$MarginLayoutParams)>
		//    2    4:ireturn         
		}

		public void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			MarginLayoutParamsCompatJellybeanMr1.resolveLayoutDirection(marginlayoutparams, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #34  <Method void MarginLayoutParamsCompatJellybeanMr1.resolveLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
		//    3    5:return          
		}

		public void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			MarginLayoutParamsCompatJellybeanMr1.setLayoutDirection(marginlayoutparams, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #37  <Method void MarginLayoutParamsCompatJellybeanMr1.setLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
		//    3    5:return          
		}

		public void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			MarginLayoutParamsCompatJellybeanMr1.setMarginEnd(marginlayoutparams, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #40  <Method void MarginLayoutParamsCompatJellybeanMr1.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
		//    3    5:return          
		}

		public void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
		{
			MarginLayoutParamsCompatJellybeanMr1.setMarginStart(marginlayoutparams, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #43  <Method void MarginLayoutParamsCompatJellybeanMr1.setMarginStart(android.view.ViewGroup$MarginLayoutParams, int)>
		//    3    5:return          
		}

		MarginLayoutParamsCompatImplJbMr1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private MarginLayoutParamsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		int j = IMPL.getLayoutDirection(marginlayoutparams);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #35  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getLayoutDirection(android.view.ViewGroup$MarginLayoutParams)>
	//    3    9:istore_2        
		int i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(j != 0)
	//*   6   12:iload_2         
	//*   7   13:ifeq            25
		{
			i = j;
	//    8   16:iload_2         
	//    9   17:istore_1        
			if(j != 1)
	//*  10   18:iload_2         
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          25
				i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_1        
		}
		return i;
	//   15   25:iload_1         
	//   16   26:ireturn         
	}

	public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return IMPL.getMarginEnd(marginlayoutparams);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #38  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//    3    9:ireturn         
	}

	public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return IMPL.getMarginStart(marginlayoutparams);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #41  <Method int MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
	//    3    9:ireturn         
	}

	public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		return IMPL.isMarginRelative(marginlayoutparams);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #45  <Method boolean MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.isMarginRelative(android.view.ViewGroup$MarginLayoutParams)>
	//    3    9:ireturn         
	}

	public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		IMPL.resolveLayoutDirection(marginlayoutparams, i);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #49  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.resolveLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
	//    4   10:return          
	}

	public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		IMPL.setLayoutDirection(marginlayoutparams, i);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #52  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setLayoutDirection(android.view.ViewGroup$MarginLayoutParams, int)>
	//    4   10:return          
	}

	public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		IMPL.setMarginEnd(marginlayoutparams, i);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #55  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
	//    4   10:return          
	}

	public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, int i)
	{
		IMPL.setMarginStart(marginlayoutparams, i);
	//    0    0:getstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #58  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl.setMarginStart(android.view.ViewGroup$MarginLayoutParams, int)>
	//    4   10:return          
	}

	static final MarginLayoutParamsCompatImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			IMPL = ((MarginLayoutParamsCompatImpl) (new MarginLayoutParamsCompatImplJbMr1()));
	//    3    8:new             #12  <Class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1()>
	//    6   15:putstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((MarginLayoutParamsCompatImpl) (new MarginLayoutParamsCompatImplBase()));
	//    8   19:new             #9   <Class MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase>
	//    9   22:dup             
	//   10   23:invokespecial   #29  <Method void MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase()>
	//   11   26:putstatic       #28  <Field MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl IMPL>
	//*  12   29:return          
	}
}
