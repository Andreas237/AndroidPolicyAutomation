// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.irobot.core.BooleanValueType;
import com.irobot.home.util.o;

public class HideableView extends RelativeLayout
{
	public static final class a extends Enum
	{

		public static a fromInt(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 38
		//		               1 34
			default:
				o.e(HideableView.a(), "Unrecognized enum value");
		//    2   24:invokestatic    #35  <Method String HideableView.a()>
		//    3   27:ldc1            #37  <String "Unrecognized enum value">
		//    4   29:invokestatic    #43  <Method void o.e(String, String)>
				return null;
		//    5   32:aconst_null     
		//    6   33:areturn         

			case 1: // '\001'
				return removeFromLayout;
		//    7   34:getstatic       #25  <Field HideableView$a removeFromLayout>
		//    8   37:areturn         

			case 0: // '\0'
				return hideInLayout;
		//    9   38:getstatic       #22  <Field HideableView$a hideInLayout>
		//   10   41:areturn         
			}
		}

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/view/HideableView$a, s);
		//    0    0:ldc1            #2   <Class HideableView$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class HideableView$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field HideableView$a[] $VALUES>
		//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.home.view.HideableView$a_3B_.clone()>
		//    2    6:checkcast       #51  <Class HideableView$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a hideInLayout;
		public static final a removeFromLayout;

		static 
		{
			hideInLayout = new a("hideInLayout", 0);
		//    0    0:new             #2   <Class HideableView$a>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "hideInLayout">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void HideableView$a(String, int)>
		//    5   10:putstatic       #22  <Field HideableView$a hideInLayout>
			removeFromLayout = new a("removeFromLayout", 1);
		//    6   13:new             #2   <Class HideableView$a>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "removeFromLayout">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void HideableView$a(String, int)>
		//   11   23:putstatic       #25  <Field HideableView$a removeFromLayout>
			$VALUES = (new a[] {
				hideInLayout, removeFromLayout
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       a[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field HideableView$a hideInLayout>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field HideableView$a removeFromLayout>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field HideableView$a[] $VALUES>
		//*  23   45:return          
		}

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public HideableView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void RelativeLayout(Context)>
		b = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #26  <String "">
	//    5    8:putfield        #28  <Field String b>
		d = a.hideInLayout;
	//    6   11:aload_0         
	//    7   12:getstatic       #31  <Field HideableView$a HideableView$a.hideInLayout>
	//    8   15:putfield        #33  <Field HideableView$a d>
		a(context, ((AttributeSet) (null)), 0, 0);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aconst_null     
	//   12   21:iconst_0        
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #36  <Method void a(Context, AttributeSet, int, int)>
	//   15   26:return          
	}

	public HideableView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method void RelativeLayout(Context, AttributeSet)>
		b = "";
	//    4    6:aload_0         
	//    5    7:ldc1            #26  <String "">
	//    6    9:putfield        #28  <Field String b>
		d = a.hideInLayout;
	//    7   12:aload_0         
	//    8   13:getstatic       #31  <Field HideableView$a HideableView$a.hideInLayout>
	//    9   16:putfield        #33  <Field HideableView$a d>
		a(context, attributeset, 0, 0);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:iconst_0        
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #36  <Method void a(Context, AttributeSet, int, int)>
	//   16   27:return          
	}

	public HideableView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #42  <Method void RelativeLayout(Context, AttributeSet, int)>
		b = "";
	//    5    7:aload_0         
	//    6    8:ldc1            #26  <String "">
	//    7   10:putfield        #28  <Field String b>
		d = a.hideInLayout;
	//    8   13:aload_0         
	//    9   14:getstatic       #31  <Field HideableView$a HideableView$a.hideInLayout>
	//   10   17:putfield        #33  <Field HideableView$a d>
		a(context, attributeset, i, 0);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:iload_3         
	//   15   24:iconst_0        
	//   16   25:invokevirtual   #36  <Method void a(Context, AttributeSet, int, int)>
	//   17   28:return          
	}

	public HideableView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #47  <Method void RelativeLayout(Context, AttributeSet, int, int)>
		b = "";
	//    6    9:aload_0         
	//    7   10:ldc1            #26  <String "">
	//    8   12:putfield        #28  <Field String b>
		d = a.hideInLayout;
	//    9   15:aload_0         
	//   10   16:getstatic       #31  <Field HideableView$a HideableView$a.hideInLayout>
	//   11   19:putfield        #33  <Field HideableView$a d>
		a(context, attributeset, i, j);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:iload_3         
	//   16   26:iload           4
	//   17   28:invokevirtual   #36  <Method void a(Context, AttributeSet, int, int)>
	//   18   31:return          
	}

	static a a(HideableView hideableview)
	{
		return hideableview.d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field HideableView$a d>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #52  <Field String a>
	//    1    3:areturn         
	}

	protected void a(Context context, AttributeSet attributeset, int i, int j)
	{
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(attributeset, com.irobot.home.g.a.HideableView, 0, 0)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #58  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:getstatic       #63  <Field int[] com.irobot.home.g$a.HideableView>
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #69  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_2        
		d = a.fromInt(((TypedArray) (attributeset)).getInteger(0, 0));
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:iconst_0        
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #75  <Method int TypedArray.getInteger(int, int)>
	//   13   21:invokestatic    #79  <Method HideableView$a HideableView$a.fromInt(int)>
	//   14   24:putfield        #33  <Field HideableView$a d>
		b = ((TypedArray) (attributeset)).getString(1);
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #83  <Method String TypedArray.getString(int)>
	//   19   33:putfield        #28  <Field String b>
		((TypedArray) (attributeset)).recycle();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #86  <Method void TypedArray.recycle()>
		c = new Handler(context.getMainLooper());
	//   22   40:aload_0         
	//   23   41:new             #88  <Class Handler>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #92  <Method android.os.Looper Context.getMainLooper()>
	//   27   49:invokespecial   #95  <Method void Handler(android.os.Looper)>
	//   28   52:putfield        #97  <Field Handler c>
		return;
	//   29   55:return          
		context;
	//   30   56:astore_1        
		((TypedArray) (attributeset)).recycle();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #86  <Method void TypedArray.recycle()>
		throw context;
	//   33   61:aload_1         
	//   34   62:athrow          
	}

	public void a(boolean flag, BooleanValueType booleanvaluetype)
	{
		c.post(new Runnable(flag) {

			public void run()
			{
				HideableView hideableview = b;
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field HideableView b>
			//    2    4:astore_2        
				byte byte0;
				if(a)
			//*   3    5:aload_0         
			//*   4    6:getfield        #20  <Field boolean a>
			//*   5    9:ifeq            17
					byte0 = 0;
			//    6   12:iconst_0        
			//    7   13:istore_1        
				else
			//*   8   14:goto            38
				if(HideableView.a(b) == a.hideInLayout)
			//*   9   17:aload_0         
			//*  10   18:getfield        #18  <Field HideableView b>
			//*  11   21:invokestatic    #28  <Method HideableView$a HideableView.a(HideableView)>
			//*  12   24:getstatic       #34  <Field HideableView$a HideableView$a.hideInLayout>
			//*  13   27:if_acmpne       35
					byte0 = 4;
			//   14   30:iconst_4        
			//   15   31:istore_1        
				else
			//*  16   32:goto            38
					byte0 = 8;
			//   17   35:bipush          8
			//   18   37:istore_1        
				hideableview.setVisibility(((int) (byte0)));
			//   19   38:aload_2         
			//   20   39:iload_1         
			//   21   40:invokevirtual   #38  <Method void HideableView.setVisibility(int)>
			//   22   43:return          
			}

			final boolean a;
			final HideableView b;

			
			{
				b = HideableView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field HideableView b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Handler c>
	//    2    4:new             #6   <Class HideableView$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #101 <Method void HideableView$1(HideableView, boolean)>
	//    7   13:invokevirtual   #105 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void setHideableBehavior(a a1)
	{
		d = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field HideableView$a d>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #110 <Method void invalidate()>
		requestLayout();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #113 <Method void requestLayout()>
	//    7   13:return          
	}

	private static String a = "HideableView";
	private String b;
	private Handler c;
	private a d;

	static 
	{
	//    0    0:return          
	}
}
