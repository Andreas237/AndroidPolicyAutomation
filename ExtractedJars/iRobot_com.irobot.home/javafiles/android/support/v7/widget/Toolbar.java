// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.support.v7.c.a.b;
import android.support.v7.view.c;
import android.support.v7.view.g;
import android.support.v7.view.menu.*;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			av, am, AppCompatImageView, ActionMenuView, 
//			AppCompatImageButton, ActionMenuPresenter, aw, bd, 
//			AppCompatTextView, v

public class Toolbar extends ViewGroup
{
	public static class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
	{

		void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			leftMargin = marginlayoutparams.leftMargin;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #38  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//    3    5:putfield        #39  <Field int leftMargin>
			topMargin = marginlayoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #42  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
		//    7   13:putfield        #43  <Field int topMargin>
			rightMargin = marginlayoutparams.rightMargin;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #46  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//   11   21:putfield        #47  <Field int rightMargin>
			bottomMargin = marginlayoutparams.bottomMargin;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:getfield        #50  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//   15   29:putfield        #51  <Field int bottomMargin>
		//   16   32:return          
		}

		int b;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #13  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
			b = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #15  <Field int b>
			a = 0x800013;
		//    7   11:aload_0         
		//    8   12:ldc1            #16  <Int 0x800013>
		//    9   14:putfield        #19  <Field int a>
		//   10   17:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void android.support.v7.app.ActionBar$LayoutParams(Context, AttributeSet)>
			b = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #15  <Field int b>
		//    7   11:return          
		}

		public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			b = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int b>
		//    6   10:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.support.v7.app.ActionBar.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			b = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int b>
			b = layoutparams.b;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #15  <Field int b>
		//    9   15:putfield        #15  <Field int b>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			b = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int b>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (marginlayoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			b = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int b>
			a(marginlayoutparams);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #33  <Method void a(android.view.ViewGroup$MarginLayoutParams)>
		//    9   15:return          
		}
	}

	public static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #44  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #46  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #51  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class Toolbar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class Toolbar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i1)
			{
				return new SavedState[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method Toolbar$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method Toolbar$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method Toolbar$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		boolean b;

		static 
		{
		//    0    0:new             #9   <Class Toolbar$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void Toolbar$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #33  <Method int Parcel.readInt()>
		//    7   11:putfield        #35  <Field int a>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #33  <Method int Parcel.readInt()>
		//*  10   18:ifeq            26
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:goto            28
				flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_3        
			b = flag;
		//   16   28:aload_0         
		//   17   29:iload_3         
		//   18   30:putfield        #37  <Field boolean b>
		//   19   33:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	private class a
		implements o
	{

		public void a(Context context, h h1)
		{
			if(a != null && b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field h a>
		//*   2    4:ifnull          26
		//*   3    7:aload_0         
		//*   4    8:getfield        #27  <Field j b>
		//*   5   11:ifnull          26
				a.d(b);
		//    6   14:aload_0         
		//    7   15:getfield        #25  <Field h a>
		//    8   18:aload_0         
		//    9   19:getfield        #27  <Field j b>
		//   10   22:invokevirtual   #33  <Method boolean h.d(j)>
		//   11   25:pop             
			a = h1;
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:putfield        #25  <Field h a>
		//   15   31:return          
		}

		public void a(Parcelable parcelable)
		{
		//    0    0:return          
		}

		public void a(h h1, boolean flag)
		{
		//    0    0:return          
		}

		public void a(android.support.v7.view.menu.o.a a1)
		{
		//    0    0:return          
		}

		public void a(boolean flag)
		{
			if(b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field j b>
		//*   2    4:ifnull          88
			{
				h h1 = a;
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field h a>
		//    5   11:astore          6
				boolean flag2 = false;
		//    6   13:iconst_0        
		//    7   14:istore          4
				boolean flag1 = flag2;
		//    8   16:iload           4
		//    9   18:istore_3        
				if(h1 != null)
		//*  10   19:aload           6
		//*  11   21:ifnull          71
				{
					int j1 = a.size();
		//   12   24:aload_0         
		//   13   25:getfield        #25  <Field h a>
		//   14   28:invokevirtual   #41  <Method int h.size()>
		//   15   31:istore          5
					int i1 = 0;
		//   16   33:iconst_0        
		//   17   34:istore_2        
					do
					{
						flag1 = flag2;
		//   18   35:iload           4
		//   19   37:istore_3        
						if(i1 >= j1)
							break;
		//   20   38:iload_2         
		//   21   39:iload           5
		//   22   41:icmpge          71
						if(a.getItem(i1) == b)
		//*  23   44:aload_0         
		//*  24   45:getfield        #25  <Field h a>
		//*  25   48:iload_2         
		//*  26   49:invokevirtual   #45  <Method MenuItem h.getItem(int)>
		//*  27   52:aload_0         
		//*  28   53:getfield        #27  <Field j b>
		//*  29   56:if_acmpne       64
						{
							flag1 = true;
		//   30   59:iconst_1        
		//   31   60:istore_3        
							break;
		//   32   61:goto            71
						}
						i1++;
		//   33   64:iload_2         
		//   34   65:iconst_1        
		//   35   66:iadd            
		//   36   67:istore_2        
					} while(true);
		//   37   68:goto            35
				}
				if(!flag1)
		//*  38   71:iload_3         
		//*  39   72:ifne            88
					b(a, b);
		//   40   75:aload_0         
		//   41   76:aload_0         
		//   42   77:getfield        #25  <Field h a>
		//   43   80:aload_0         
		//   44   81:getfield        #27  <Field j b>
		//   45   84:invokevirtual   #48  <Method boolean b(h, j)>
		//   46   87:pop             
			}
		//   47   88:return          
		}

		public boolean a()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean a(h h1, j j1)
		{
			c.i();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Toolbar c>
		//    2    4:invokevirtual   #52  <Method void Toolbar.i()>
			if(c.a.getParent() != c)
		//*   3    7:aload_0         
		//*   4    8:getfield        #18  <Field Toolbar c>
		//*   5   11:getfield        #55  <Field ImageButton Toolbar.a>
		//*   6   14:invokevirtual   #61  <Method android.view.ViewParent ImageButton.getParent()>
		//*   7   17:aload_0         
		//*   8   18:getfield        #18  <Field Toolbar c>
		//*   9   21:if_acmpeq       38
				c.addView(((View) (c.a)));
		//   10   24:aload_0         
		//   11   25:getfield        #18  <Field Toolbar c>
		//   12   28:aload_0         
		//   13   29:getfield        #18  <Field Toolbar c>
		//   14   32:getfield        #55  <Field ImageButton Toolbar.a>
		//   15   35:invokevirtual   #65  <Method void Toolbar.addView(View)>
			c.b = j1.getActionView();
		//   16   38:aload_0         
		//   17   39:getfield        #18  <Field Toolbar c>
		//   18   42:aload_2         
		//   19   43:invokevirtual   #71  <Method View j.getActionView()>
		//   20   46:putfield        #74  <Field View android.support.v7.widget.Toolbar.b>
			b = j1;
		//   21   49:aload_0         
		//   22   50:aload_2         
		//   23   51:putfield        #27  <Field j b>
			if(c.b.getParent() != c)
		//*  24   54:aload_0         
		//*  25   55:getfield        #18  <Field Toolbar c>
		//*  26   58:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//*  27   61:invokevirtual   #77  <Method android.view.ViewParent View.getParent()>
		//*  28   64:aload_0         
		//*  29   65:getfield        #18  <Field Toolbar c>
		//*  30   68:if_acmpeq       126
			{
				h1 = ((h) (c.j()));
		//   31   71:aload_0         
		//   32   72:getfield        #18  <Field Toolbar c>
		//   33   75:invokevirtual   #81  <Method Toolbar$LayoutParams android.support.v7.widget.Toolbar.j()>
		//   34   78:astore_1        
				h1.a = 0x800003 | c.c & 0x70;
		//   35   79:aload_1         
		//   36   80:ldc1            #82  <Int 0x800003>
		//   37   82:aload_0         
		//   38   83:getfield        #18  <Field Toolbar c>
		//   39   86:getfield        #85  <Field int android.support.v7.widget.Toolbar.c>
		//   40   89:bipush          112
		//   41   91:iand            
		//   42   92:ior             
		//   43   93:putfield        #89  <Field int Toolbar$LayoutParams.a>
				h1.b = 2;
		//   44   96:aload_1         
		//   45   97:iconst_2        
		//   46   98:putfield        #91  <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
				c.b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (h1)));
		//   47  101:aload_0         
		//   48  102:getfield        #18  <Field Toolbar c>
		//   49  105:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//   50  108:aload_1         
		//   51  109:invokevirtual   #95  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				c.addView(c.b);
		//   52  112:aload_0         
		//   53  113:getfield        #18  <Field Toolbar c>
		//   54  116:aload_0         
		//   55  117:getfield        #18  <Field Toolbar c>
		//   56  120:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//   57  123:invokevirtual   #65  <Method void Toolbar.addView(View)>
			}
			c.k();
		//   58  126:aload_0         
		//   59  127:getfield        #18  <Field Toolbar c>
		//   60  130:invokevirtual   #98  <Method void Toolbar.k()>
			c.requestLayout();
		//   61  133:aload_0         
		//   62  134:getfield        #18  <Field Toolbar c>
		//   63  137:invokevirtual   #101 <Method void Toolbar.requestLayout()>
			j1.e(true);
		//   64  140:aload_2         
		//   65  141:iconst_1        
		//   66  142:invokevirtual   #104 <Method void j.e(boolean)>
			if(c.b instanceof c)
		//*  67  145:aload_0         
		//*  68  146:getfield        #18  <Field Toolbar c>
		//*  69  149:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//*  70  152:instanceof      #106 <Class c>
		//*  71  155:ifeq            173
				((c)c.b).a();
		//   72  158:aload_0         
		//   73  159:getfield        #18  <Field Toolbar c>
		//   74  162:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//   75  165:checkcast       #106 <Class c>
		//   76  168:invokeinterface #108 <Method void c.a()>
			return true;
		//   77  173:iconst_1        
		//   78  174:ireturn         
		}

		public boolean a(u u1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int b()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean b(h h1, j j1)
		{
			if(c.b instanceof c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field Toolbar c>
		//*   2    4:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//*   3    7:instanceof      #106 <Class c>
		//*   4   10:ifeq            28
				((c)c.b).b();
		//    5   13:aload_0         
		//    6   14:getfield        #18  <Field Toolbar c>
		//    7   17:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//    8   20:checkcast       #106 <Class c>
		//    9   23:invokeinterface #111 <Method void c.b()>
			c.removeView(c.b);
		//   10   28:aload_0         
		//   11   29:getfield        #18  <Field Toolbar c>
		//   12   32:aload_0         
		//   13   33:getfield        #18  <Field Toolbar c>
		//   14   36:getfield        #74  <Field View android.support.v7.widget.Toolbar.b>
		//   15   39:invokevirtual   #114 <Method void Toolbar.removeView(View)>
			c.removeView(((View) (c.a)));
		//   16   42:aload_0         
		//   17   43:getfield        #18  <Field Toolbar c>
		//   18   46:aload_0         
		//   19   47:getfield        #18  <Field Toolbar c>
		//   20   50:getfield        #55  <Field ImageButton Toolbar.a>
		//   21   53:invokevirtual   #114 <Method void Toolbar.removeView(View)>
			c.b = null;
		//   22   56:aload_0         
		//   23   57:getfield        #18  <Field Toolbar c>
		//   24   60:aconst_null     
		//   25   61:putfield        #74  <Field View android.support.v7.widget.Toolbar.b>
			c.l();
		//   26   64:aload_0         
		//   27   65:getfield        #18  <Field Toolbar c>
		//   28   68:invokevirtual   #117 <Method void Toolbar.l()>
			b = null;
		//   29   71:aload_0         
		//   30   72:aconst_null     
		//   31   73:putfield        #27  <Field j b>
			c.requestLayout();
		//   32   76:aload_0         
		//   33   77:getfield        #18  <Field Toolbar c>
		//   34   80:invokevirtual   #101 <Method void Toolbar.requestLayout()>
			j1.e(false);
		//   35   83:aload_2         
		//   36   84:iconst_0        
		//   37   85:invokevirtual   #104 <Method void j.e(boolean)>
			return true;
		//   38   88:iconst_1        
		//   39   89:ireturn         
		}

		public Parcelable c()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		h a;
		j b;
		final Toolbar c;

		a()
		{
			c = Toolbar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field Toolbar c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface b
	{

		public abstract boolean a(MenuItem menuitem);
	}


	public Toolbar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #89  <Method void Toolbar(Context, AttributeSet)>
	//    4    6:return          
	}

	public Toolbar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.toolbarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #95  <Field int android.support.v7.a.a$a.toolbarStyle>
	//    4    6:invokespecial   #98  <Method void Toolbar(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public Toolbar(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #99  <Method void ViewGroup(Context, AttributeSet, int)>
		x = 0x800013;
	//    5    7:aload_0         
	//    6    8:ldc1            #100 <Int 0x800013>
	//    7   10:putfield        #102 <Field int x>
		E = new ArrayList();
	//    8   13:aload_0         
	//    9   14:new             #104 <Class ArrayList>
	//   10   17:dup             
	//   11   18:invokespecial   #107 <Method void ArrayList()>
	//   12   21:putfield        #109 <Field ArrayList E>
		F = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #104 <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #107 <Method void ArrayList()>
	//   17   32:putfield        #111 <Field ArrayList F>
		G = new int[2];
	//   18   35:aload_0         
	//   19   36:iconst_2        
	//   20   37:newarray        int[]
	//   21   39:putfield        #113 <Field int[] G>
		H = new ActionMenuView.d() {

			public boolean a(MenuItem menuitem)
			{
				if(a.d != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field Toolbar a>
			//*   2    4:getfield        #23  <Field Toolbar$b android.support.v7.widget.Toolbar.d>
			//*   3    7:ifnull          24
					return a.d.a(menuitem);
			//    4   10:aload_0         
			//    5   11:getfield        #14  <Field Toolbar a>
			//    6   14:getfield        #23  <Field Toolbar$b android.support.v7.widget.Toolbar.d>
			//    7   17:aload_1         
			//    8   18:invokeinterface #27  <Method boolean Toolbar$b.a(MenuItem)>
			//    9   23:ireturn         
				else
					return false;
			//   10   24:iconst_0        
			//   11   25:ireturn         
			}

			final Toolbar a;

			
			{
				a = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Toolbar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   22   42:aload_0         
	//   23   43:new             #6   <Class Toolbar$1>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #116 <Method void Toolbar$1(Toolbar)>
	//   27   51:putfield        #118 <Field ActionMenuView$d H>
		O = new Runnable() {

			public void run()
			{
				a.d();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Toolbar a>
			//    2    4:invokevirtual   #23  <Method boolean android.support.v7.widget.Toolbar.d()>
			//    3    7:pop             
			//    4    8:return          
			}

			final Toolbar a;

			
			{
				a = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Toolbar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   28   54:aload_0         
	//   29   55:new             #8   <Class Toolbar$2>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:invokespecial   #119 <Method void Toolbar$2(Toolbar)>
	//   33   63:putfield        #121 <Field Runnable O>
		context = ((Context) (av.a(getContext(), attributeset, android.support.v7.a.a.j.Toolbar, i1, 0)));
	//   34   66:aload_0         
	//   35   67:invokevirtual   #125 <Method Context getContext()>
	//   36   70:aload_2         
	//   37   71:getstatic       #130 <Field int[] android.support.v7.a.a$j.Toolbar>
	//   38   74:iload_3         
	//   39   75:iconst_0        
	//   40   76:invokestatic    #135 <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   41   79:astore_1        
		n = ((av) (context)).g(android.support.v7.a.a.j.Toolbar_titleTextAppearance, 0);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:getstatic       #138 <Field int android.support.v7.a.a$j.Toolbar_titleTextAppearance>
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #141 <Method int android.support.v7.widget.av.g(int, int)>
	//   47   89:putfield        #143 <Field int n>
		o = ((av) (context)).g(android.support.v7.a.a.j.Toolbar_subtitleTextAppearance, 0);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:getstatic       #146 <Field int android.support.v7.a.a$j.Toolbar_subtitleTextAppearance>
	//   51   97:iconst_0        
	//   52   98:invokevirtual   #141 <Method int android.support.v7.widget.av.g(int, int)>
	//   53  101:putfield        #148 <Field int o>
		x = ((av) (context)).c(android.support.v7.a.a.j.Toolbar_android_gravity, x);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:getstatic       #151 <Field int android.support.v7.a.a$j.Toolbar_android_gravity>
	//   57  109:aload_0         
	//   58  110:getfield        #102 <Field int x>
	//   59  113:invokevirtual   #153 <Method int android.support.v7.widget.av.c(int, int)>
	//   60  116:putfield        #102 <Field int x>
		c = ((av) (context)).c(android.support.v7.a.a.j.Toolbar_buttonGravity, 48);
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:getstatic       #156 <Field int android.support.v7.a.a$j.Toolbar_buttonGravity>
	//   64  124:bipush          48
	//   65  126:invokevirtual   #153 <Method int android.support.v7.widget.av.c(int, int)>
	//   66  129:putfield        #158 <Field int c>
		int j1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMargin, 0);
	//   67  132:aload_1         
	//   68  133:getstatic       #161 <Field int android.support.v7.a.a$j.Toolbar_titleMargin>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//   71  140:istore          4
		i1 = j1;
	//   72  142:iload           4
	//   73  144:istore_3        
		if(((av) (context)).g(android.support.v7.a.a.j.Toolbar_titleMargins))
	//*  74  145:aload_1         
	//*  75  146:getstatic       #166 <Field int android.support.v7.a.a$j.Toolbar_titleMargins>
	//*  76  149:invokevirtual   #169 <Method boolean android.support.v7.widget.av.g(int)>
	//*  77  152:ifeq            165
			i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMargins, j1);
	//   78  155:aload_1         
	//   79  156:getstatic       #166 <Field int android.support.v7.a.a$j.Toolbar_titleMargins>
	//   80  159:iload           4
	//   81  161:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//   82  164:istore_3        
		t = i1;
	//   83  165:aload_0         
	//   84  166:iload_3         
	//   85  167:putfield        #171 <Field int t>
		s = i1;
	//   86  170:aload_0         
	//   87  171:iload_3         
	//   88  172:putfield        #173 <Field int s>
		r = i1;
	//   89  175:aload_0         
	//   90  176:iload_3         
	//   91  177:putfield        #175 <Field int r>
		q = i1;
	//   92  180:aload_0         
	//   93  181:iload_3         
	//   94  182:putfield        #177 <Field int q>
		i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMarginStart, -1);
	//   95  185:aload_1         
	//   96  186:getstatic       #180 <Field int android.support.v7.a.a$j.Toolbar_titleMarginStart>
	//   97  189:iconst_m1       
	//   98  190:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//   99  193:istore_3        
		if(i1 >= 0)
	//* 100  194:iload_3         
	//* 101  195:iflt            203
			q = i1;
	//  102  198:aload_0         
	//  103  199:iload_3         
	//  104  200:putfield        #177 <Field int q>
		i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMarginEnd, -1);
	//  105  203:aload_1         
	//  106  204:getstatic       #183 <Field int android.support.v7.a.a$j.Toolbar_titleMarginEnd>
	//  107  207:iconst_m1       
	//  108  208:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  109  211:istore_3        
		if(i1 >= 0)
	//* 110  212:iload_3         
	//* 111  213:iflt            221
			r = i1;
	//  112  216:aload_0         
	//  113  217:iload_3         
	//  114  218:putfield        #175 <Field int r>
		i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMarginTop, -1);
	//  115  221:aload_1         
	//  116  222:getstatic       #186 <Field int android.support.v7.a.a$j.Toolbar_titleMarginTop>
	//  117  225:iconst_m1       
	//  118  226:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  119  229:istore_3        
		if(i1 >= 0)
	//* 120  230:iload_3         
	//* 121  231:iflt            239
			s = i1;
	//  122  234:aload_0         
	//  123  235:iload_3         
	//  124  236:putfield        #173 <Field int s>
		i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_titleMarginBottom, -1);
	//  125  239:aload_1         
	//  126  240:getstatic       #189 <Field int android.support.v7.a.a$j.Toolbar_titleMarginBottom>
	//  127  243:iconst_m1       
	//  128  244:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  129  247:istore_3        
		if(i1 >= 0)
	//* 130  248:iload_3         
	//* 131  249:iflt            257
			t = i1;
	//  132  252:aload_0         
	//  133  253:iload_3         
	//  134  254:putfield        #171 <Field int t>
		p = ((av) (context)).e(android.support.v7.a.a.j.Toolbar_maxButtonHeight, -1);
	//  135  257:aload_0         
	//  136  258:aload_1         
	//  137  259:getstatic       #192 <Field int android.support.v7.a.a$j.Toolbar_maxButtonHeight>
	//  138  262:iconst_m1       
	//  139  263:invokevirtual   #194 <Method int av.e(int, int)>
	//  140  266:putfield        #196 <Field int p>
		i1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_contentInsetStart, 0x80000000);
	//  141  269:aload_1         
	//  142  270:getstatic       #199 <Field int android.support.v7.a.a$j.Toolbar_contentInsetStart>
	//  143  273:ldc1            #200 <Int 0x80000000>
	//  144  275:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  145  278:istore_3        
		j1 = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_contentInsetEnd, 0x80000000);
	//  146  279:aload_1         
	//  147  280:getstatic       #203 <Field int android.support.v7.a.a$j.Toolbar_contentInsetEnd>
	//  148  283:ldc1            #200 <Int 0x80000000>
	//  149  285:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  150  288:istore          4
		int k1 = ((av) (context)).e(android.support.v7.a.a.j.Toolbar_contentInsetLeft, 0);
	//  151  290:aload_1         
	//  152  291:getstatic       #206 <Field int android.support.v7.a.a$j.Toolbar_contentInsetLeft>
	//  153  294:iconst_0        
	//  154  295:invokevirtual   #194 <Method int av.e(int, int)>
	//  155  298:istore          5
		int l1 = ((av) (context)).e(android.support.v7.a.a.j.Toolbar_contentInsetRight, 0);
	//  156  300:aload_1         
	//  157  301:getstatic       #209 <Field int android.support.v7.a.a$j.Toolbar_contentInsetRight>
	//  158  304:iconst_0        
	//  159  305:invokevirtual   #194 <Method int av.e(int, int)>
	//  160  308:istore          6
		s();
	//  161  310:aload_0         
	//  162  311:invokespecial   #211 <Method void s()>
		u.b(k1, l1);
	//  163  314:aload_0         
	//  164  315:getfield        #213 <Field am u>
	//  165  318:iload           5
	//  166  320:iload           6
	//  167  322:invokevirtual   #218 <Method void android.support.v7.widget.am.b(int, int)>
		if(i1 != 0x80000000 || j1 != 0x80000000)
	//* 168  325:iload_3         
	//* 169  326:ldc1            #200 <Int 0x80000000>
	//* 170  328:icmpne          338
	//* 171  331:iload           4
	//* 172  333:ldc1            #200 <Int 0x80000000>
	//* 173  335:icmpeq          348
			u.a(i1, j1);
	//  174  338:aload_0         
	//  175  339:getfield        #213 <Field am u>
	//  176  342:iload_3         
	//  177  343:iload           4
	//  178  345:invokevirtual   #220 <Method void am.a(int, int)>
		v = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_contentInsetStartWithNavigation, 0x80000000);
	//  179  348:aload_0         
	//  180  349:aload_1         
	//  181  350:getstatic       #223 <Field int android.support.v7.a.a$j.Toolbar_contentInsetStartWithNavigation>
	//  182  353:ldc1            #200 <Int 0x80000000>
	//  183  355:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  184  358:putfield        #225 <Field int v>
		w = ((av) (context)).d(android.support.v7.a.a.j.Toolbar_contentInsetEndWithActions, 0x80000000);
	//  185  361:aload_0         
	//  186  362:aload_1         
	//  187  363:getstatic       #228 <Field int android.support.v7.a.a$j.Toolbar_contentInsetEndWithActions>
	//  188  366:ldc1            #200 <Int 0x80000000>
	//  189  368:invokevirtual   #163 <Method int android.support.v7.widget.av.d(int, int)>
	//  190  371:putfield        #230 <Field int w>
		j = ((av) (context)).a(android.support.v7.a.a.j.Toolbar_collapseIcon);
	//  191  374:aload_0         
	//  192  375:aload_1         
	//  193  376:getstatic       #233 <Field int android.support.v7.a.a$j.Toolbar_collapseIcon>
	//  194  379:invokevirtual   #236 <Method Drawable av.a(int)>
	//  195  382:putfield        #238 <Field Drawable j>
		k = ((av) (context)).c(android.support.v7.a.a.j.Toolbar_collapseContentDescription);
	//  196  385:aload_0         
	//  197  386:aload_1         
	//  198  387:getstatic       #241 <Field int android.support.v7.a.a$j.Toolbar_collapseContentDescription>
	//  199  390:invokevirtual   #244 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  200  393:putfield        #246 <Field CharSequence k>
		attributeset = ((AttributeSet) (((av) (context)).c(android.support.v7.a.a.j.Toolbar_title)));
	//  201  396:aload_1         
	//  202  397:getstatic       #249 <Field int android.support.v7.a.a$j.Toolbar_title>
	//  203  400:invokevirtual   #244 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  204  403:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 205  404:aload_2         
	//* 206  405:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 207  408:ifne            416
			setTitle(((CharSequence) (attributeset)));
	//  208  411:aload_0         
	//  209  412:aload_2         
	//  210  413:invokevirtual   #259 <Method void setTitle(CharSequence)>
		attributeset = ((AttributeSet) (((av) (context)).c(android.support.v7.a.a.j.Toolbar_subtitle)));
	//  211  416:aload_1         
	//  212  417:getstatic       #262 <Field int android.support.v7.a.a$j.Toolbar_subtitle>
	//  213  420:invokevirtual   #244 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  214  423:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 215  424:aload_2         
	//* 216  425:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 217  428:ifne            436
			setSubtitle(((CharSequence) (attributeset)));
	//  218  431:aload_0         
	//  219  432:aload_2         
	//  220  433:invokevirtual   #265 <Method void setSubtitle(CharSequence)>
		l = getContext();
	//  221  436:aload_0         
	//  222  437:aload_0         
	//  223  438:invokevirtual   #125 <Method Context getContext()>
	//  224  441:putfield        #267 <Field Context l>
		setPopupTheme(((av) (context)).g(android.support.v7.a.a.j.Toolbar_popupTheme, 0));
	//  225  444:aload_0         
	//  226  445:aload_1         
	//  227  446:getstatic       #270 <Field int android.support.v7.a.a$j.Toolbar_popupTheme>
	//  228  449:iconst_0        
	//  229  450:invokevirtual   #141 <Method int android.support.v7.widget.av.g(int, int)>
	//  230  453:invokevirtual   #274 <Method void setPopupTheme(int)>
		attributeset = ((AttributeSet) (((av) (context)).a(android.support.v7.a.a.j.Toolbar_navigationIcon)));
	//  231  456:aload_1         
	//  232  457:getstatic       #277 <Field int android.support.v7.a.a$j.Toolbar_navigationIcon>
	//  233  460:invokevirtual   #236 <Method Drawable av.a(int)>
	//  234  463:astore_2        
		if(attributeset != null)
	//* 235  464:aload_2         
	//* 236  465:ifnull          473
			setNavigationIcon(((Drawable) (attributeset)));
	//  237  468:aload_0         
	//  238  469:aload_2         
	//  239  470:invokevirtual   #281 <Method void setNavigationIcon(Drawable)>
		attributeset = ((AttributeSet) (((av) (context)).c(android.support.v7.a.a.j.Toolbar_navigationContentDescription)));
	//  240  473:aload_1         
	//  241  474:getstatic       #284 <Field int android.support.v7.a.a$j.Toolbar_navigationContentDescription>
	//  242  477:invokevirtual   #244 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  243  480:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 244  481:aload_2         
	//* 245  482:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 246  485:ifne            493
			setNavigationContentDescription(((CharSequence) (attributeset)));
	//  247  488:aload_0         
	//  248  489:aload_2         
	//  249  490:invokevirtual   #287 <Method void setNavigationContentDescription(CharSequence)>
		attributeset = ((AttributeSet) (((av) (context)).a(android.support.v7.a.a.j.Toolbar_logo)));
	//  250  493:aload_1         
	//  251  494:getstatic       #290 <Field int android.support.v7.a.a$j.Toolbar_logo>
	//  252  497:invokevirtual   #236 <Method Drawable av.a(int)>
	//  253  500:astore_2        
		if(attributeset != null)
	//* 254  501:aload_2         
	//* 255  502:ifnull          510
			setLogo(((Drawable) (attributeset)));
	//  256  505:aload_0         
	//  257  506:aload_2         
	//  258  507:invokevirtual   #293 <Method void setLogo(Drawable)>
		attributeset = ((AttributeSet) (((av) (context)).c(android.support.v7.a.a.j.Toolbar_logoDescription)));
	//  259  510:aload_1         
	//  260  511:getstatic       #296 <Field int android.support.v7.a.a$j.Toolbar_logoDescription>
	//  261  514:invokevirtual   #244 <Method CharSequence android.support.v7.widget.av.c(int)>
	//  262  517:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 263  518:aload_2         
	//* 264  519:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 265  522:ifne            530
			setLogoDescription(((CharSequence) (attributeset)));
	//  266  525:aload_0         
	//  267  526:aload_2         
	//  268  527:invokevirtual   #299 <Method void setLogoDescription(CharSequence)>
		if(((av) (context)).g(android.support.v7.a.a.j.Toolbar_titleTextColor))
	//* 269  530:aload_1         
	//* 270  531:getstatic       #302 <Field int android.support.v7.a.a$j.Toolbar_titleTextColor>
	//* 271  534:invokevirtual   #169 <Method boolean android.support.v7.widget.av.g(int)>
	//* 272  537:ifeq            552
			setTitleTextColor(((av) (context)).b(android.support.v7.a.a.j.Toolbar_titleTextColor, -1));
	//  273  540:aload_0         
	//  274  541:aload_1         
	//  275  542:getstatic       #302 <Field int android.support.v7.a.a$j.Toolbar_titleTextColor>
	//  276  545:iconst_m1       
	//  277  546:invokevirtual   #304 <Method int android.support.v7.widget.av.b(int, int)>
	//  278  549:invokevirtual   #307 <Method void setTitleTextColor(int)>
		if(((av) (context)).g(android.support.v7.a.a.j.Toolbar_subtitleTextColor))
	//* 279  552:aload_1         
	//* 280  553:getstatic       #310 <Field int android.support.v7.a.a$j.Toolbar_subtitleTextColor>
	//* 281  556:invokevirtual   #169 <Method boolean android.support.v7.widget.av.g(int)>
	//* 282  559:ifeq            574
			setSubtitleTextColor(((av) (context)).b(android.support.v7.a.a.j.Toolbar_subtitleTextColor, -1));
	//  283  562:aload_0         
	//  284  563:aload_1         
	//  285  564:getstatic       #310 <Field int android.support.v7.a.a$j.Toolbar_subtitleTextColor>
	//  286  567:iconst_m1       
	//  287  568:invokevirtual   #304 <Method int android.support.v7.widget.av.b(int, int)>
	//  288  571:invokevirtual   #313 <Method void setSubtitleTextColor(int)>
		((av) (context)).a();
	//  289  574:aload_1         
	//  290  575:invokevirtual   #315 <Method void av.a()>
	//  291  578:return          
	}

	private int a(int i1)
	{
		int j1 = i1 & 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_2        
		i1 = j1;
	//    4    5:iload_2         
	//    5    6:istore_1        
		if(j1 != 16)
	//*   6    7:iload_2         
	//*   7    8:bipush          16
	//*   8   10:icmpeq          37
		{
			i1 = j1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(j1 != 48)
	//*  11   15:iload_2         
	//*  12   16:bipush          48
	//*  13   18:icmpeq          37
			{
				i1 = j1;
	//   14   21:iload_2         
	//   15   22:istore_1        
				if(j1 != 80)
	//*  16   23:iload_2         
	//*  17   24:bipush          80
	//*  18   26:icmpeq          37
					i1 = x & 0x70;
	//   19   29:aload_0         
	//   20   30:getfield        #102 <Field int x>
	//   21   33:bipush          112
	//   22   35:iand            
	//   23   36:istore_1        
			}
		}
		return i1;
	//   24   37:iload_1         
	//   25   38:ireturn         
	}

	private int a(View view, int i1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class Toolbar$LayoutParams>
	//    3    7:astore          7
		int l1 = view.getMeasuredHeight();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//    6   13:istore          4
		if(i1 > 0)
	//*   7   15:iload_2         
	//*   8   16:ifle            29
			i1 = (l1 - i1) / 2;
	//    9   19:iload           4
	//   10   21:iload_2         
	//   11   22:isub            
	//   12   23:iconst_2        
	//   13   24:idiv            
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			i1 = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		int j1 = a(layoutparams.a);
	//   18   31:aload_0         
	//   19   32:aload           7
	//   20   34:getfield        #329 <Field int Toolbar$LayoutParams.a>
	//   21   37:invokespecial   #331 <Method int a(int)>
	//   22   40:istore_3        
		if(j1 != 48)
	//*  23   41:iload_3         
	//*  24   42:bipush          48
	//*  25   44:icmpeq          168
		{
			if(j1 != 80)
	//*  26   47:iload_3         
	//*  27   48:bipush          80
	//*  28   50:icmpeq          147
			{
				int i2 = getPaddingTop();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #334 <Method int getPaddingTop()>
	//   31   57:istore          5
				i1 = getPaddingBottom();
	//   32   59:aload_0         
	//   33   60:invokevirtual   #337 <Method int getPaddingBottom()>
	//   34   63:istore_2        
				int j2 = getHeight();
	//   35   64:aload_0         
	//   36   65:invokevirtual   #340 <Method int getHeight()>
	//   37   68:istore          6
				int k1 = (j2 - i2 - i1 - l1) / 2;
	//   38   70:iload           6
	//   39   72:iload           5
	//   40   74:isub            
	//   41   75:iload_2         
	//   42   76:isub            
	//   43   77:iload           4
	//   44   79:isub            
	//   45   80:iconst_2        
	//   46   81:idiv            
	//   47   82:istore_3        
				if(k1 < layoutparams.topMargin)
	//*  48   83:iload_3         
	//*  49   84:aload           7
	//*  50   86:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//*  51   89:icmpge          101
				{
					i1 = layoutparams.topMargin;
	//   52   92:aload           7
	//   53   94:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//   54   97:istore_2        
				} else
	//*  55   98:goto            142
				{
					l1 = j2 - i1 - l1 - k1 - i2;
	//   56  101:iload           6
	//   57  103:iload_2         
	//   58  104:isub            
	//   59  105:iload           4
	//   60  107:isub            
	//   61  108:iload_3         
	//   62  109:isub            
	//   63  110:iload           5
	//   64  112:isub            
	//   65  113:istore          4
					i1 = k1;
	//   66  115:iload_3         
	//   67  116:istore_2        
					if(l1 < layoutparams.bottomMargin)
	//*  68  117:iload           4
	//*  69  119:aload           7
	//*  70  121:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  71  124:icmpge          142
						i1 = Math.max(0, k1 - (layoutparams.bottomMargin - l1));
	//   72  127:iconst_0        
	//   73  128:iload_3         
	//   74  129:aload           7
	//   75  131:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//   76  134:iload           4
	//   77  136:isub            
	//   78  137:isub            
	//   79  138:invokestatic    #351 <Method int Math.max(int, int)>
	//   80  141:istore_2        
				}
				return i2 + i1;
	//   81  142:iload           5
	//   82  144:iload_2         
	//   83  145:iadd            
	//   84  146:ireturn         
			} else
			{
				return getHeight() - getPaddingBottom() - l1 - layoutparams.bottomMargin - i1;
	//   85  147:aload_0         
	//   86  148:invokevirtual   #340 <Method int getHeight()>
	//   87  151:aload_0         
	//   88  152:invokevirtual   #337 <Method int getPaddingBottom()>
	//   89  155:isub            
	//   90  156:iload           4
	//   91  158:isub            
	//   92  159:aload           7
	//   93  161:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//   94  164:isub            
	//   95  165:iload_2         
	//   96  166:isub            
	//   97  167:ireturn         
			}
		} else
		{
			return getPaddingTop() - i1;
	//   98  168:aload_0         
	//   99  169:invokevirtual   #334 <Method int getPaddingTop()>
	//  100  172:iload_2         
	//  101  173:isub            
	//  102  174:ireturn         
		}
	}

	private int a(View view, int i1, int j1, int k1, int l1, int ai[])
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          10
		int i2 = marginlayoutparams.leftMargin - ai[0];
	//    4    9:aload           10
	//    5   11:getfield        #357 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    6   14:aload           6
	//    7   16:iconst_0        
	//    8   17:iaload          
	//    9   18:isub            
	//   10   19:istore          7
		int j2 = marginlayoutparams.rightMargin - ai[1];
	//   11   21:aload           10
	//   12   23:getfield        #360 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   13   26:aload           6
	//   14   28:iconst_1        
	//   15   29:iaload          
	//   16   30:isub            
	//   17   31:istore          8
		int k2 = Math.max(0, i2) + Math.max(0, j2);
	//   18   33:iconst_0        
	//   19   34:iload           7
	//   20   36:invokestatic    #351 <Method int Math.max(int, int)>
	//   21   39:iconst_0        
	//   22   40:iload           8
	//   23   42:invokestatic    #351 <Method int Math.max(int, int)>
	//   24   45:iadd            
	//   25   46:istore          9
		ai[0] = Math.max(0, -i2);
	//   26   48:aload           6
	//   27   50:iconst_0        
	//   28   51:iconst_0        
	//   29   52:iload           7
	//   30   54:ineg            
	//   31   55:invokestatic    #351 <Method int Math.max(int, int)>
	//   32   58:iastore         
		ai[1] = Math.max(0, -j2);
	//   33   59:aload           6
	//   34   61:iconst_1        
	//   35   62:iconst_0        
	//   36   63:iload           8
	//   37   65:ineg            
	//   38   66:invokestatic    #351 <Method int Math.max(int, int)>
	//   39   69:iastore         
		view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + k2 + j1, marginlayoutparams.width), getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height));
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:aload_0         
	//   43   73:invokevirtual   #363 <Method int getPaddingLeft()>
	//   44   76:aload_0         
	//   45   77:invokevirtual   #366 <Method int getPaddingRight()>
	//   46   80:iadd            
	//   47   81:iload           9
	//   48   83:iadd            
	//   49   84:iload_3         
	//   50   85:iadd            
	//   51   86:aload           10
	//   52   88:getfield        #369 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   53   91:invokestatic    #373 <Method int getChildMeasureSpec(int, int, int)>
	//   54   94:iload           4
	//   55   96:aload_0         
	//   56   97:invokevirtual   #334 <Method int getPaddingTop()>
	//   57  100:aload_0         
	//   58  101:invokevirtual   #337 <Method int getPaddingBottom()>
	//   59  104:iadd            
	//   60  105:aload           10
	//   61  107:getfield        #374 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   62  110:iadd            
	//   63  111:aload           10
	//   64  113:getfield        #375 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   65  116:iadd            
	//   66  117:iload           5
	//   67  119:iadd            
	//   68  120:aload           10
	//   69  122:getfield        #378 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   70  125:invokestatic    #373 <Method int getChildMeasureSpec(int, int, int)>
	//   71  128:invokevirtual   #381 <Method void View.measure(int, int)>
		return view.getMeasuredWidth() + k2;
	//   72  131:aload_1         
	//   73  132:invokevirtual   #384 <Method int View.getMeasuredWidth()>
	//   74  135:iload           9
	//   75  137:iadd            
	//   76  138:ireturn         
	}

	private int a(View view, int i1, int ai[], int j1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k1 = layoutparams.leftMargin - ai[0];
	//    4    9:aload           6
	//    5   11:getfield        #386 <Field int Toolbar$LayoutParams.leftMargin>
	//    6   14:aload_3         
	//    7   15:iconst_0        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i1 += Math.max(0, k1);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #351 <Method int Math.max(int, int)>
	//   15   27:iadd            
	//   16   28:istore_2        
		ai[0] = Math.max(0, -k1);
	//   17   29:aload_3         
	//   18   30:iconst_0        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #351 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j1 = a(view, j1);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #388 <Method int a(View, int)>
	//   28   46:istore          4
		k1 = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #384 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           4
	//   35   58:iload_2         
	//   36   59:iload           5
	//   37   61:iadd            
	//   38   62:aload_1         
	//   39   63:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #392 <Method void View.layout(int, int, int, int)>
		return i1 + (k1 + layoutparams.rightMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #393 <Field int Toolbar$LayoutParams.rightMargin>
	//   47   80:iadd            
	//   48   81:iadd            
	//   49   82:ireturn         
	}

	private int a(List list, int ai[])
	{
		int l1 = ai[0];
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:iaload          
	//    3    3:istore          6
		int k1 = ai[1];
	//    4    5:aload_2         
	//    5    6:iconst_1        
	//    6    7:iaload          
	//    7    8:istore          5
		int i2 = list.size();
	//    8   10:aload_1         
	//    9   11:invokeinterface #399 <Method int List.size()>
	//   10   16:istore          7
		int i1 = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int j1 = 0;
	//   13   20:iconst_0        
	//   14   21:istore          4
		for(; i1 < i2; i1++)
	//*  15   23:iload_3         
	//*  16   24:iload           7
	//*  17   26:icmpge          125
		{
			ai = ((int []) ((View)list.get(i1)));
	//   18   29:aload_1         
	//   19   30:iload_3         
	//   20   31:invokeinterface #403 <Method Object List.get(int)>
	//   21   36:checkcast       #319 <Class View>
	//   22   39:astore_2        
			LayoutParams layoutparams = (LayoutParams)((View) (ai)).getLayoutParams();
	//   23   40:aload_2         
	//   24   41:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   44:checkcast       #12  <Class Toolbar$LayoutParams>
	//   26   47:astore          10
			l1 = layoutparams.leftMargin - l1;
	//   27   49:aload           10
	//   28   51:getfield        #386 <Field int Toolbar$LayoutParams.leftMargin>
	//   29   54:iload           6
	//   30   56:isub            
	//   31   57:istore          6
			k1 = layoutparams.rightMargin - k1;
	//   32   59:aload           10
	//   33   61:getfield        #393 <Field int Toolbar$LayoutParams.rightMargin>
	//   34   64:iload           5
	//   35   66:isub            
	//   36   67:istore          5
			int j2 = Math.max(0, l1);
	//   37   69:iconst_0        
	//   38   70:iload           6
	//   39   72:invokestatic    #351 <Method int Math.max(int, int)>
	//   40   75:istore          8
			int k2 = Math.max(0, k1);
	//   41   77:iconst_0        
	//   42   78:iload           5
	//   43   80:invokestatic    #351 <Method int Math.max(int, int)>
	//   44   83:istore          9
			l1 = Math.max(0, -l1);
	//   45   85:iconst_0        
	//   46   86:iload           6
	//   47   88:ineg            
	//   48   89:invokestatic    #351 <Method int Math.max(int, int)>
	//   49   92:istore          6
			k1 = Math.max(0, -k1);
	//   50   94:iconst_0        
	//   51   95:iload           5
	//   52   97:ineg            
	//   53   98:invokestatic    #351 <Method int Math.max(int, int)>
	//   54  101:istore          5
			j1 += j2 + ((View) (ai)).getMeasuredWidth() + k2;
	//   55  103:iload           4
	//   56  105:iload           8
	//   57  107:aload_2         
	//   58  108:invokevirtual   #384 <Method int View.getMeasuredWidth()>
	//   59  111:iadd            
	//   60  112:iload           9
	//   61  114:iadd            
	//   62  115:iadd            
	//   63  116:istore          4
		}

	//   64  118:iload_3         
	//   65  119:iconst_1        
	//   66  120:iadd            
	//   67  121:istore_3        
	//*  68  122:goto            23
		return j1;
	//   69  125:iload           4
	//   70  127:ireturn         
	}

	private void a(View view, int i1, int j1, int k1, int l1, int i2)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          8
		int j2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
	//    4    9:iload_2         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #363 <Method int getPaddingLeft()>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #366 <Method int getPaddingRight()>
	//    9   18:iadd            
	//   10   19:aload           8
	//   11   21:getfield        #357 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   12   24:iadd            
	//   13   25:aload           8
	//   14   27:getfield        #360 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   15   30:iadd            
	//   16   31:iload_3         
	//   17   32:iadd            
	//   18   33:aload           8
	//   19   35:getfield        #369 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   20   38:invokestatic    #373 <Method int getChildMeasureSpec(int, int, int)>
	//   21   41:istore          7
		j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height);
	//   22   43:iload           4
	//   23   45:aload_0         
	//   24   46:invokevirtual   #334 <Method int getPaddingTop()>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #337 <Method int getPaddingBottom()>
	//   27   53:iadd            
	//   28   54:aload           8
	//   29   56:getfield        #374 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   30   59:iadd            
	//   31   60:aload           8
	//   32   62:getfield        #375 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   33   65:iadd            
	//   34   66:iload           5
	//   35   68:iadd            
	//   36   69:aload           8
	//   37   71:getfield        #378 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   38   74:invokestatic    #373 <Method int getChildMeasureSpec(int, int, int)>
	//   39   77:istore_3        
		k1 = android.view.View.MeasureSpec.getMode(j1);
	//   40   78:iload_3         
	//   41   79:invokestatic    #411 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   42   82:istore          4
		i1 = j1;
	//   43   84:iload_3         
	//   44   85:istore_2        
		if(k1 != 0x40000000)
	//*  45   86:iload           4
	//*  46   88:ldc2            #412 <Int 0x40000000>
	//*  47   91:icmpeq          127
		{
			i1 = j1;
	//   48   94:iload_3         
	//   49   95:istore_2        
			if(i2 >= 0)
	//*  50   96:iload           6
	//*  51   98:iflt            127
			{
				i1 = i2;
	//   52  101:iload           6
	//   53  103:istore_2        
				if(k1 != 0)
	//*  54  104:iload           4
	//*  55  106:ifeq            119
					i1 = Math.min(android.view.View.MeasureSpec.getSize(j1), i2);
	//   56  109:iload_3         
	//   57  110:invokestatic    #415 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   58  113:iload           6
	//   59  115:invokestatic    #418 <Method int Math.min(int, int)>
	//   60  118:istore_2        
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//   61  119:iload_2         
	//   62  120:ldc2            #412 <Int 0x40000000>
	//   63  123:invokestatic    #421 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   64  126:istore_2        
			}
		}
		view.measure(j2, i1);
	//   65  127:aload_1         
	//   66  128:iload           7
	//   67  130:iload_2         
	//   68  131:invokevirtual   #381 <Method void View.measure(int, int)>
	//   69  134:return          
	}

	private void a(View view, boolean flag)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       17
			obj = ((Object) (j()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #425 <Method Toolbar$LayoutParams j()>
	//    7   13:astore_3        
		else
	//*   8   14:goto            39
		if(!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
	//*   9   17:aload_0         
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #429 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  12   22:ifne            34
			obj = ((Object) (a(((android.view.ViewGroup.LayoutParams) (obj)))));
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #432 <Method Toolbar$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//   16   30:astore_3        
		else
	//*  17   31:goto            39
			obj = ((Object) ((LayoutParams)obj));
	//   18   34:aload_3         
	//   19   35:checkcast       #12  <Class Toolbar$LayoutParams>
	//   20   38:astore_3        
		obj.b = 1;
	//   21   39:aload_3         
	//   22   40:iconst_1        
	//   23   41:putfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
		if(flag && b != null)
	//*  24   44:iload_2         
	//*  25   45:ifeq            70
	//*  26   48:aload_0         
	//*  27   49:getfield        #436 <Field View b>
	//*  28   52:ifnull          70
		{
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   29   55:aload_1         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #440 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			F.add(((Object) (view)));
	//   32   60:aload_0         
	//   33   61:getfield        #111 <Field ArrayList F>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #444 <Method boolean ArrayList.add(Object)>
	//   36   68:pop             
			return;
	//   37   69:return          
		} else
		{
			addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
	//   38   70:aload_0         
	//   39   71:aload_1         
	//   40   72:aload_3         
	//   41   73:invokevirtual   #448 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   42   76:return          
		}
	}

	private void a(List list, int i1)
	{
		int j1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #454 <Method int s.e(View)>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag;
		if(j1 == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          18
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore_3        
		else
	//*  10   15:goto            20
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int l1 = getChildCount();
	//   13   20:aload_0         
	//   14   21:invokevirtual   #457 <Method int getChildCount()>
	//   15   24:istore          6
		int k1 = android.support.v4.view.d.a(i1, android.support.v4.view.s.e(((View) (this))));
	//   16   26:iload_2         
	//   17   27:aload_0         
	//   18   28:invokestatic    #454 <Method int s.e(View)>
	//   19   31:invokestatic    #461 <Method int d.a(int, int)>
	//   20   34:istore          5
		list.clear();
	//   21   36:aload_1         
	//   22   37:invokeinterface #464 <Method void List.clear()>
		i1 = ((int) (flag1));
	//   23   42:iload           4
	//   24   44:istore_2        
		if(flag)
	//*  25   45:iload_3         
	//*  26   46:ifeq            122
			for(i1 = l1 - 1; i1 >= 0; i1--)
	//*  27   49:iload           6
	//*  28   51:iconst_1        
	//*  29   52:isub            
	//*  30   53:istore_2        
	//*  31   54:iload_2         
	//*  32   55:iflt            192
			{
				View view = getChildAt(i1);
	//   33   58:aload_0         
	//   34   59:iload_2         
	//   35   60:invokevirtual   #468 <Method View getChildAt(int)>
	//   36   63:astore          7
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   65:aload           7
	//   38   67:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   70:checkcast       #12  <Class Toolbar$LayoutParams>
	//   40   73:astore          8
				if(layoutparams.b == 0 && a(view) && b(layoutparams.a) == k1)
	//*  41   75:aload           8
	//*  42   77:getfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
	//*  43   80:ifne            115
	//*  44   83:aload_0         
	//*  45   84:aload           7
	//*  46   86:invokespecial   #471 <Method boolean a(View)>
	//*  47   89:ifeq            115
	//*  48   92:aload_0         
	//*  49   93:aload           8
	//*  50   95:getfield        #329 <Field int Toolbar$LayoutParams.a>
	//*  51   98:invokespecial   #473 <Method int b(int)>
	//*  52  101:iload           5
	//*  53  103:icmpne          115
					list.add(((Object) (view)));
	//   54  106:aload_1         
	//   55  107:aload           7
	//   56  109:invokeinterface #474 <Method boolean List.add(Object)>
	//   57  114:pop             
			}

	//   58  115:iload_2         
	//   59  116:iconst_1        
	//   60  117:isub            
	//   61  118:istore_2        
		else
	//*  62  119:goto            54
			for(; i1 < l1; i1++)
	//*  63  122:iload_2         
	//*  64  123:iload           6
	//*  65  125:icmpge          192
			{
				View view1 = getChildAt(i1);
	//   66  128:aload_0         
	//   67  129:iload_2         
	//   68  130:invokevirtual   #468 <Method View getChildAt(int)>
	//   69  133:astore          7
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   70  135:aload           7
	//   71  137:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  140:checkcast       #12  <Class Toolbar$LayoutParams>
	//   73  143:astore          8
				if(layoutparams1.b == 0 && a(view1) && b(layoutparams1.a) == k1)
	//*  74  145:aload           8
	//*  75  147:getfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
	//*  76  150:ifne            185
	//*  77  153:aload_0         
	//*  78  154:aload           7
	//*  79  156:invokespecial   #471 <Method boolean a(View)>
	//*  80  159:ifeq            185
	//*  81  162:aload_0         
	//*  82  163:aload           8
	//*  83  165:getfield        #329 <Field int Toolbar$LayoutParams.a>
	//*  84  168:invokespecial   #473 <Method int b(int)>
	//*  85  171:iload           5
	//*  86  173:icmpne          185
					list.add(((Object) (view1)));
	//   87  176:aload_1         
	//   88  177:aload           7
	//   89  179:invokeinterface #474 <Method boolean List.add(Object)>
	//   90  184:pop             
			}

	//   91  185:iload_2         
	//   92  186:iconst_1        
	//   93  187:iadd            
	//   94  188:istore_2        
	//*  95  189:goto            122
	//   96  192:return          
	}

	private boolean a(View view)
	{
		return view != null && view.getParent() == this && view.getVisibility() != 8;
	//    0    0:aload_1         
	//    1    1:ifnull          23
	//    2    4:aload_1         
	//    3    5:invokevirtual   #479 <Method android.view.ViewParent View.getParent()>
	//    4    8:aload_0         
	//    5    9:if_acmpne       23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #482 <Method int View.getVisibility()>
	//    8   16:bipush          8
	//    9   18:icmpeq          23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	private int b(int i1)
	{
		int j1 = android.support.v4.view.s.e(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #454 <Method int s.e(View)>
	//    2    4:istore_2        
		int k1 = android.support.v4.view.d.a(i1, j1) & 7;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #461 <Method int d.a(int, int)>
	//    6   10:bipush          7
	//    7   12:iand            
	//    8   13:istore_3        
		if(k1 != 1)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:icmpeq          40
		{
			i1 = 3;
	//   12   19:iconst_3        
	//   13   20:istore_1        
			if(k1 != 3 && k1 != 5)
	//*  14   21:iload_3         
	//*  15   22:iconst_3        
	//*  16   23:icmpeq          40
	//*  17   26:iload_3         
	//*  18   27:iconst_5        
	//*  19   28:icmpeq          40
			{
				if(j1 == 1)
	//*  20   31:iload_2         
	//*  21   32:iconst_1        
	//*  22   33:icmpne          38
					i1 = 5;
	//   23   36:iconst_5        
	//   24   37:istore_1        
				return i1;
	//   25   38:iload_1         
	//   26   39:ireturn         
			}
		}
		return k1;
	//   27   40:iload_3         
	//   28   41:ireturn         
	}

	private int b(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return android.support.v4.view.f.a(((android.view.ViewGroup.MarginLayoutParams) (view))) + android.support.v4.view.f.b(((android.view.ViewGroup.MarginLayoutParams) (view)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #487 <Method int f.a(android.view.ViewGroup$MarginLayoutParams)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #489 <Method int f.b(android.view.ViewGroup$MarginLayoutParams)>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private int b(View view, int i1, int ai[], int j1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #12  <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k1 = layoutparams.rightMargin - ai[1];
	//    4    9:aload           6
	//    5   11:getfield        #393 <Field int Toolbar$LayoutParams.rightMargin>
	//    6   14:aload_3         
	//    7   15:iconst_1        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i1 -= Math.max(0, k1);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #351 <Method int Math.max(int, int)>
	//   15   27:isub            
	//   16   28:istore_2        
		ai[1] = Math.max(0, -k1);
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #351 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j1 = a(view, j1);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #388 <Method int a(View, int)>
	//   28   46:istore          4
		k1 = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #384 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           5
	//   35   58:isub            
	//   36   59:iload           4
	//   37   61:iload_2         
	//   38   62:aload_1         
	//   39   63:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #392 <Method void View.layout(int, int, int, int)>
		return i1 - (k1 + layoutparams.leftMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #386 <Field int Toolbar$LayoutParams.leftMargin>
	//   47   80:iadd            
	//   48   81:isub            
	//   49   82:ireturn         
	}

	private int c(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
	//    4    8:aload_1         
	//    5    9:getfield        #374 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//    6   12:aload_1         
	//    7   13:getfield        #375 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private boolean d(View view)
	{
		return view.getParent() == this || F.contains(((Object) (view)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #479 <Method android.view.ViewParent View.getParent()>
	//    2    4:aload_0         
	//    3    5:if_acmpeq       24
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field ArrayList F>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #492 <Method boolean ArrayList.contains(Object)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new g(getContext())));
	//    0    0:new             #496 <Class g>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #125 <Method Context getContext()>
	//    4    8:invokespecial   #498 <Method void g(Context)>
	//    5   11:areturn         
	}

	private void m()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #500 <Field ImageView i>
	//*   2    4:ifnonnull       22
			i = ((ImageView) (new AppCompatImageView(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #502 <Class AppCompatImageView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #125 <Method Context getContext()>
	//    8   16:invokespecial   #503 <Method void AppCompatImageView(Context)>
	//    9   19:putfield        #500 <Field ImageView i>
	//   10   22:return          
	}

	private void n()
	{
		o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #505 <Method void o()>
		if(e.d() == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #507 <Field ActionMenuView e>
	//*   4    8:invokevirtual   #512 <Method h android.support.v7.widget.ActionMenuView.d()>
	//*   5   11:ifnonnull       64
		{
			h h1 = (h)e.getMenu();
	//    6   14:aload_0         
	//    7   15:getfield        #507 <Field ActionMenuView e>
	//    8   18:invokevirtual   #516 <Method Menu ActionMenuView.getMenu()>
	//    9   21:checkcast       #518 <Class h>
	//   10   24:astore_1        
			if(K == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #520 <Field Toolbar$a K>
	//*  13   29:ifnonnull       44
				K = new a();
	//   14   32:aload_0         
	//   15   33:new             #20  <Class Toolbar$a>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #521 <Method void Toolbar$a(Toolbar)>
	//   19   41:putfield        #520 <Field Toolbar$a K>
			e.setExpandedActionViewsExclusive(true);
	//   20   44:aload_0         
	//   21   45:getfield        #507 <Field ActionMenuView e>
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #525 <Method void ActionMenuView.setExpandedActionViewsExclusive(boolean)>
			h1.a(((o) (K)), l);
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #520 <Field Toolbar$a K>
	//   27   57:aload_0         
	//   28   58:getfield        #267 <Field Context l>
	//   29   61:invokevirtual   #528 <Method void h.a(o, Context)>
		}
	//   30   64:return          
	}

	private void o()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ActionMenuView e>
	//*   2    4:ifnonnull       96
		{
			e = new ActionMenuView(getContext());
	//    3    7:aload_0         
	//    4    8:new             #509 <Class ActionMenuView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #125 <Method Context getContext()>
	//    8   16:invokespecial   #529 <Method void ActionMenuView(Context)>
	//    9   19:putfield        #507 <Field ActionMenuView e>
			e.setPopupTheme(m);
	//   10   22:aload_0         
	//   11   23:getfield        #507 <Field ActionMenuView e>
	//   12   26:aload_0         
	//   13   27:getfield        #531 <Field int m>
	//   14   30:invokevirtual   #532 <Method void ActionMenuView.setPopupTheme(int)>
			e.setOnMenuItemClickListener(H);
	//   15   33:aload_0         
	//   16   34:getfield        #507 <Field ActionMenuView e>
	//   17   37:aload_0         
	//   18   38:getfield        #118 <Field ActionMenuView$d H>
	//   19   41:invokevirtual   #536 <Method void ActionMenuView.setOnMenuItemClickListener(ActionMenuView$d)>
			e.a(L, M);
	//   20   44:aload_0         
	//   21   45:getfield        #507 <Field ActionMenuView e>
	//   22   48:aload_0         
	//   23   49:getfield        #538 <Field android.support.v7.view.menu.o$a L>
	//   24   52:aload_0         
	//   25   53:getfield        #540 <Field android.support.v7.view.menu.h$a M>
	//   26   56:invokevirtual   #543 <Method void ActionMenuView.a(android.support.v7.view.menu.o$a, android.support.v7.view.menu.h$a)>
			LayoutParams layoutparams = j();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #425 <Method Toolbar$LayoutParams j()>
	//   29   63:astore_1        
			layoutparams.a = 0x800005 | c & 0x70;
	//   30   64:aload_1         
	//   31   65:ldc2            #544 <Int 0x800005>
	//   32   68:aload_0         
	//   33   69:getfield        #158 <Field int c>
	//   34   72:bipush          112
	//   35   74:iand            
	//   36   75:ior             
	//   37   76:putfield        #329 <Field int Toolbar$LayoutParams.a>
			e.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   38   79:aload_0         
	//   39   80:getfield        #507 <Field ActionMenuView e>
	//   40   83:aload_1         
	//   41   84:invokevirtual   #545 <Method void ActionMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			a(((View) (e)), false);
	//   42   87:aload_0         
	//   43   88:aload_0         
	//   44   89:getfield        #507 <Field ActionMenuView e>
	//   45   92:iconst_0        
	//   46   93:invokespecial   #547 <Method void a(View, boolean)>
		}
	//   47   96:return          
	}

	private void p()
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #549 <Field ImageButton h>
	//*   2    4:ifnonnull       54
		{
			h = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.a.a.a.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #551 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #125 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #554 <Field int android.support.v7.a.a$a.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #555 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #549 <Field ImageButton h>
			LayoutParams layoutparams = j();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #425 <Method Toolbar$LayoutParams j()>
	//   14   30:astore_1        
			layoutparams.a = 0x800003 | c & 0x70;
	//   15   31:aload_1         
	//   16   32:ldc2            #556 <Int 0x800003>
	//   17   35:aload_0         
	//   18   36:getfield        #158 <Field int c>
	//   19   39:bipush          112
	//   20   41:iand            
	//   21   42:ior             
	//   22   43:putfield        #329 <Field int Toolbar$LayoutParams.a>
			h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   23   46:aload_0         
	//   24   47:getfield        #549 <Field ImageButton h>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #559 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   27   54:return          
	}

	private void q()
	{
		removeCallbacks(O);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #121 <Field Runnable O>
	//    3    5:invokevirtual   #563 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(O);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #121 <Field Runnable O>
	//    8   14:invokevirtual   #566 <Method boolean post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	private boolean r()
	{
		if(!N)
	//*   0    0:aload_0         
	//*   1    1:getfield        #569 <Field boolean N>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j1 = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #457 <Method int getChildCount()>
	//    7   13:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          58
		{
			View view = getChildAt(i1);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #468 <Method View getChildAt(int)>
	//   16   26:astore_3        
			if(a(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
	//*  17   27:aload_0         
	//*  18   28:aload_3         
	//*  19   29:invokespecial   #471 <Method boolean a(View)>
	//*  20   32:ifeq            51
	//*  21   35:aload_3         
	//*  22   36:invokevirtual   #384 <Method int View.getMeasuredWidth()>
	//*  23   39:ifle            51
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//*  26   46:ifle            51
				return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		}

	//   29   51:iload_1         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_1        
	//*  33   55:goto            16
		return true;
	//   34   58:iconst_1        
	//   35   59:ireturn         
	}

	private void s()
	{
		if(u == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field am u>
	//*   2    4:ifnonnull       18
			u = new am();
	//    3    7:aload_0         
	//    4    8:new             #215 <Class am>
	//    5   11:dup             
	//    6   12:invokespecial   #570 <Method void am()>
	//    7   15:putfield        #213 <Field am u>
	//    8   18:return          
	}

	public LayoutParams a(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #12  <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #125 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #572 <Method void Toolbar$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #12  <Class Toolbar$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #12  <Class Toolbar$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #12  <Class Toolbar$LayoutParams>
	//    7   15:invokespecial   #575 <Method void Toolbar$LayoutParams(Toolbar$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #577 <Class android.support.v7.app.ActionBar$LayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
	//   12   26:new             #12  <Class Toolbar$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #577 <Class android.support.v7.app.ActionBar$LayoutParams>
	//   16   34:invokespecial   #580 <Method void Toolbar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
	//   17   37:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  20   42:ifeq            57
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   21   45:new             #12  <Class Toolbar$LayoutParams>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:checkcast       #354 <Class android.view.ViewGroup$MarginLayoutParams>
	//   25   53:invokespecial   #583 <Method void Toolbar$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   26   56:areturn         
		else
			return new LayoutParams(layoutparams);
	//   27   57:new             #12  <Class Toolbar$LayoutParams>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokespecial   #585 <Method void Toolbar$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   31   65:areturn         
	}

	public void a(int i1, int j1)
	{
		s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void s()>
		u.a(i1, j1);
	//    2    4:aload_0         
	//    3    5:getfield        #213 <Field am u>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #220 <Method void am.a(int, int)>
	//    7   13:return          
	}

	public void a(Context context, int i1)
	{
		n = i1;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #143 <Field int n>
		if(f != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #588 <Field TextView f>
	//*   5    9:ifnull          21
			f.setTextAppearance(context, i1);
	//    6   12:aload_0         
	//    7   13:getfield        #588 <Field TextView f>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #593 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public void a(h h1, ActionMenuPresenter actionmenupresenter)
	{
		if(h1 == null && e == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_0         
	//*   3    5:getfield        #507 <Field ActionMenuView e>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		o();
	//    6   12:aload_0         
	//    7   13:invokespecial   #505 <Method void o()>
		h h2 = e.d();
	//    8   16:aload_0         
	//    9   17:getfield        #507 <Field ActionMenuView e>
	//   10   20:invokevirtual   #512 <Method h android.support.v7.widget.ActionMenuView.d()>
	//   11   23:astore_3        
		if(h2 == h1)
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:if_acmpne       30
			return;
	//   15   29:return          
		if(h2 != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          50
		{
			h2.b(((o) (J)));
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #596 <Field ActionMenuPresenter J>
	//   21   39:invokevirtual   #599 <Method void h.b(o)>
			h2.b(((o) (K)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #520 <Field Toolbar$a K>
	//   25   47:invokevirtual   #599 <Method void h.b(o)>
		}
		if(K == null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #520 <Field Toolbar$a K>
	//*  28   54:ifnonnull       69
			K = new a();
	//   29   57:aload_0         
	//   30   58:new             #20  <Class Toolbar$a>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #521 <Method void Toolbar$a(Toolbar)>
	//   34   66:putfield        #520 <Field Toolbar$a K>
		actionmenupresenter.d(true);
	//   35   69:aload_2         
	//   36   70:iconst_1        
	//   37   71:invokevirtual   #603 <Method void android.support.v7.widget.ActionMenuPresenter.d(boolean)>
		if(h1 != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          102
		{
			h1.a(((o) (actionmenupresenter)), l);
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload_0         
	//   43   81:getfield        #267 <Field Context l>
	//   44   84:invokevirtual   #528 <Method void h.a(o, Context)>
			h1.a(((o) (K)), l);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #520 <Field Toolbar$a K>
	//   48   92:aload_0         
	//   49   93:getfield        #267 <Field Context l>
	//   50   96:invokevirtual   #528 <Method void h.a(o, Context)>
		} else
	//*  51   99:goto            136
		{
			actionmenupresenter.a(l, ((h) (null)));
	//   52  102:aload_2         
	//   53  103:aload_0         
	//   54  104:getfield        #267 <Field Context l>
	//   55  107:aconst_null     
	//   56  108:invokevirtual   #606 <Method void ActionMenuPresenter.a(Context, h)>
			K.a(l, ((h) (null)));
	//   57  111:aload_0         
	//   58  112:getfield        #520 <Field Toolbar$a K>
	//   59  115:aload_0         
	//   60  116:getfield        #267 <Field Context l>
	//   61  119:aconst_null     
	//   62  120:invokevirtual   #607 <Method void Toolbar$a.a(Context, h)>
			actionmenupresenter.a(true);
	//   63  123:aload_2         
	//   64  124:iconst_1        
	//   65  125:invokevirtual   #609 <Method void ActionMenuPresenter.a(boolean)>
			K.a(true);
	//   66  128:aload_0         
	//   67  129:getfield        #520 <Field Toolbar$a K>
	//   68  132:iconst_1        
	//   69  133:invokevirtual   #610 <Method void Toolbar$a.a(boolean)>
		}
		e.setPopupTheme(m);
	//   70  136:aload_0         
	//   71  137:getfield        #507 <Field ActionMenuView e>
	//   72  140:aload_0         
	//   73  141:getfield        #531 <Field int m>
	//   74  144:invokevirtual   #532 <Method void ActionMenuView.setPopupTheme(int)>
		e.setPresenter(actionmenupresenter);
	//   75  147:aload_0         
	//   76  148:getfield        #507 <Field ActionMenuView e>
	//   77  151:aload_2         
	//   78  152:invokevirtual   #614 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		J = actionmenupresenter;
	//   79  155:aload_0         
	//   80  156:aload_2         
	//   81  157:putfield        #596 <Field ActionMenuPresenter J>
	//   82  160:return          
	}

	public void a(android.support.v7.view.menu.o.a a1, android.support.v7.view.menu.h.a a2)
	{
		L = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #538 <Field android.support.v7.view.menu.o$a L>
		M = a2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #540 <Field android.support.v7.view.menu.h$a M>
		if(e != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #507 <Field ActionMenuView e>
	//*   8   14:ifnull          26
			e.a(a1, a2);
	//    9   17:aload_0         
	//   10   18:getfield        #507 <Field ActionMenuView e>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #543 <Method void ActionMenuView.a(android.support.v7.view.menu.o$a, android.support.v7.view.menu.h$a)>
	//   14   26:return          
	}

	public boolean a()
	{
		return getVisibility() == 0 && e != null && e.a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #615 <Method int getVisibility()>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:ifnull          26
	//    6   14:aload_0         
	//    7   15:getfield        #507 <Field ActionMenuView e>
	//    8   18:invokevirtual   #617 <Method boolean ActionMenuView.a()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void b(Context context, int i1)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #148 <Field int o>
		if(g != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #619 <Field TextView g>
	//*   5    9:ifnull          21
			g.setTextAppearance(context, i1);
	//    6   12:aload_0         
	//    7   13:getfield        #619 <Field TextView g>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #593 <Method void TextView.setTextAppearance(Context, int)>
	//   11   21:return          
	}

	public boolean b()
	{
		return e != null && e.g();
	//    0    0:aload_0         
	//    1    1:getfield        #507 <Field ActionMenuView e>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #621 <Method boolean android.support.v7.widget.ActionMenuView.g()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean c()
	{
		return e != null && e.h();
	//    0    0:aload_0         
	//    1    1:getfield        #507 <Field ActionMenuView e>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #623 <Method boolean android.support.v7.widget.ActionMenuView.h()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #624 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:ifeq            17
	//    4    8:aload_1         
	//    5    9:instanceof      #12  <Class Toolbar$LayoutParams>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean d()
	{
		return e != null && e.e();
	//    0    0:aload_0         
	//    1    1:getfield        #507 <Field ActionMenuView e>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #626 <Method boolean ActionMenuView.e()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean e()
	{
		return e != null && e.f();
	//    0    0:aload_0         
	//    1    1:getfield        #507 <Field ActionMenuView e>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #628 <Method boolean android.support.v7.widget.ActionMenuView.f()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void f()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ActionMenuView e>
	//*   2    4:ifnull          14
			e.i();
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #630 <Method void ActionMenuView.i()>
	//    6   14:return          
	}

	public boolean g()
	{
		return K != null && K.b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field Toolbar$a K>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #520 <Field Toolbar$a K>
	//    5   11:getfield        #633 <Field j android.support.v7.widget.Toolbar$a.b>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #425 <Method Toolbar$LayoutParams j()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #638 <Method Toolbar$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #432 <Method Toolbar$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getContentInsetEnd()
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field am u>
	//*   2    4:ifnull          15
			return u.d();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field am u>
	//    5   11:invokevirtual   #642 <Method int android.support.v7.widget.am.d()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetEndWithActions()
	{
		if(w != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field int w>
	//*   2    4:ldc1            #200 <Int 0x80000000>
	//*   3    6:icmpeq          14
			return w;
	//    4    9:aload_0         
	//    5   10:getfield        #230 <Field int w>
	//    6   13:ireturn         
		else
			return getContentInsetEnd();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #645 <Method int getContentInsetEnd()>
	//    9   18:ireturn         
	}

	public int getContentInsetLeft()
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field am u>
	//*   2    4:ifnull          15
			return u.a();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field am u>
	//    5   11:invokevirtual   #648 <Method int am.a()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetRight()
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field am u>
	//*   2    4:ifnull          15
			return u.b();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field am u>
	//    5   11:invokevirtual   #651 <Method int android.support.v7.widget.am.b()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetStart()
	{
		if(u != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field am u>
	//*   2    4:ifnull          15
			return u.c();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field am u>
	//    5   11:invokevirtual   #654 <Method int android.support.v7.widget.am.c()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getContentInsetStartWithNavigation()
	{
		if(v != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field int v>
	//*   2    4:ldc1            #200 <Int 0x80000000>
	//*   3    6:icmpeq          14
			return v;
	//    4    9:aload_0         
	//    5   10:getfield        #225 <Field int v>
	//    6   13:ireturn         
		else
			return getContentInsetStart();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #657 <Method int getContentInsetStart()>
	//    9   18:ireturn         
	}

	public int getCurrentContentInsetEnd()
	{
		boolean flag;
label0:
		{
			if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ActionMenuView e>
	//*   2    4:ifnull          31
			{
				h h1 = e.d();
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ActionMenuView e>
	//    5   11:invokevirtual   #512 <Method h android.support.v7.widget.ActionMenuView.d()>
	//    6   14:astore_2        
				if(h1 != null && h1.hasVisibleItems())
	//*   7   15:aload_2         
	//*   8   16:ifnull          31
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #661 <Method boolean h.hasVisibleItems()>
	//*  11   23:ifeq            31
				{
					flag = true;
	//   12   26:iconst_1        
	//   13   27:istore_1        
					break label0;
	//   14   28:goto            33
				}
			}
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_1        
		}
		if(flag)
	//*  17   33:iload_1         
	//*  18   34:ifeq            53
			return Math.max(getContentInsetEnd(), Math.max(w, 0));
	//   19   37:aload_0         
	//   20   38:invokevirtual   #645 <Method int getContentInsetEnd()>
	//   21   41:aload_0         
	//   22   42:getfield        #230 <Field int w>
	//   23   45:iconst_0        
	//   24   46:invokestatic    #351 <Method int Math.max(int, int)>
	//   25   49:invokestatic    #351 <Method int Math.max(int, int)>
	//   26   52:ireturn         
		else
			return getContentInsetEnd();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #645 <Method int getContentInsetEnd()>
	//   29   57:ireturn         
	}

	public int getCurrentContentInsetLeft()
	{
		if(android.support.v4.view.s.e(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #454 <Method int s.e(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetEnd();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #664 <Method int getCurrentContentInsetEnd()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetStart();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #667 <Method int getCurrentContentInsetStart()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetRight()
	{
		if(android.support.v4.view.s.e(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #454 <Method int s.e(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetStart();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #667 <Method int getCurrentContentInsetStart()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetEnd();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #664 <Method int getCurrentContentInsetEnd()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetStart()
	{
		if(getNavigationIcon() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #672 <Method Drawable getNavigationIcon()>
	//*   2    4:ifnull          23
			return Math.max(getContentInsetStart(), Math.max(v, 0));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #657 <Method int getContentInsetStart()>
	//    5   11:aload_0         
	//    6   12:getfield        #225 <Field int v>
	//    7   15:iconst_0        
	//    8   16:invokestatic    #351 <Method int Math.max(int, int)>
	//    9   19:invokestatic    #351 <Method int Math.max(int, int)>
	//   10   22:ireturn         
		else
			return getContentInsetStart();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #657 <Method int getContentInsetStart()>
	//   13   27:ireturn         
	}

	public Drawable getLogo()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #500 <Field ImageView i>
	//*   2    4:ifnull          15
			return i.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #500 <Field ImageView i>
	//    5   11:invokevirtual   #678 <Method Drawable ImageView.getDrawable()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public CharSequence getLogoDescription()
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #500 <Field ImageView i>
	//*   2    4:ifnull          15
			return i.getContentDescription();
	//    3    7:aload_0         
	//    4    8:getfield        #500 <Field ImageView i>
	//    5   11:invokevirtual   #683 <Method CharSequence ImageView.getContentDescription()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Menu getMenu()
	{
		n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #685 <Method void n()>
		return e.getMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #507 <Field ActionMenuView e>
	//    4    8:invokevirtual   #516 <Method Menu ActionMenuView.getMenu()>
	//    5   11:areturn         
	}

	public CharSequence getNavigationContentDescription()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #549 <Field ImageButton h>
	//*   2    4:ifnull          15
			return h.getContentDescription();
	//    3    7:aload_0         
	//    4    8:getfield        #549 <Field ImageButton h>
	//    5   11:invokevirtual   #687 <Method CharSequence ImageButton.getContentDescription()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public Drawable getNavigationIcon()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #549 <Field ImageButton h>
	//*   2    4:ifnull          15
			return h.getDrawable();
	//    3    7:aload_0         
	//    4    8:getfield        #549 <Field ImageButton h>
	//    5   11:invokevirtual   #688 <Method Drawable ImageButton.getDrawable()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	ActionMenuPresenter getOuterActionMenuPresenter()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #596 <Field ActionMenuPresenter J>
	//    2    4:areturn         
	}

	public Drawable getOverflowIcon()
	{
		n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #685 <Method void n()>
		return e.getOverflowIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #507 <Field ActionMenuView e>
	//    4    8:invokevirtual   #693 <Method Drawable ActionMenuView.getOverflowIcon()>
	//    5   11:areturn         
	}

	Context getPopupContext()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Context l>
	//    2    4:areturn         
	}

	public int getPopupTheme()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #531 <Field int m>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #698 <Field CharSequence z>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #701 <Field CharSequence y>
	//    2    4:areturn         
	}

	public int getTitleMarginBottom()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int t>
	//    2    4:ireturn         
	}

	public int getTitleMarginEnd()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int r>
	//    2    4:ireturn         
	}

	public int getTitleMarginStart()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field int q>
	//    2    4:ireturn         
	}

	public int getTitleMarginTop()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int s>
	//    2    4:ireturn         
	}

	public v getWrapper()
	{
		if(I == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #709 <Field aw I>
	//*   2    4:ifnonnull       20
			I = new aw(this, true);
	//    3    7:aload_0         
	//    4    8:new             #711 <Class aw>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #714 <Method void aw(Toolbar, boolean)>
	//    9   17:putfield        #709 <Field aw I>
		return ((v) (I));
	//   10   20:aload_0         
	//   11   21:getfield        #709 <Field aw I>
	//   12   24:areturn         
	}

	public void h()
	{
		j j1;
		if(K == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #520 <Field Toolbar$a K>
	//*   2    4:ifnonnull       12
			j1 = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:goto            20
			j1 = K.b;
	//    6   12:aload_0         
	//    7   13:getfield        #520 <Field Toolbar$a K>
	//    8   16:getfield        #633 <Field j android.support.v7.widget.Toolbar$a.b>
	//    9   19:astore_1        
		if(j1 != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			j1.collapseActionView();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #719 <Method boolean j.collapseActionView()>
	//   14   28:pop             
	//   15   29:return          
	}

	void i()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #721 <Field ImageButton a>
	//*   2    4:ifnonnull       96
		{
			a = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.a.a.a.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #551 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #125 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #554 <Field int android.support.v7.a.a$a.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #555 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #721 <Field ImageButton a>
			a.setImageDrawable(j);
	//   12   26:aload_0         
	//   13   27:getfield        #721 <Field ImageButton a>
	//   14   30:aload_0         
	//   15   31:getfield        #238 <Field Drawable j>
	//   16   34:invokevirtual   #724 <Method void ImageButton.setImageDrawable(Drawable)>
			a.setContentDescription(k);
	//   17   37:aload_0         
	//   18   38:getfield        #721 <Field ImageButton a>
	//   19   41:aload_0         
	//   20   42:getfield        #246 <Field CharSequence k>
	//   21   45:invokevirtual   #727 <Method void ImageButton.setContentDescription(CharSequence)>
			LayoutParams layoutparams = j();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #425 <Method Toolbar$LayoutParams j()>
	//   24   52:astore_1        
			layoutparams.a = 0x800003 | c & 0x70;
	//   25   53:aload_1         
	//   26   54:ldc2            #556 <Int 0x800003>
	//   27   57:aload_0         
	//   28   58:getfield        #158 <Field int c>
	//   29   61:bipush          112
	//   30   63:iand            
	//   31   64:ior             
	//   32   65:putfield        #329 <Field int Toolbar$LayoutParams.a>
			layoutparams.b = 2;
	//   33   68:aload_1         
	//   34   69:iconst_2        
	//   35   70:putfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
			a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   36   73:aload_0         
	//   37   74:getfield        #721 <Field ImageButton a>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #559 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			a.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.h();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Toolbar a>
				//    2    4:invokevirtual   #25  <Method void android.support.v7.widget.Toolbar.h()>
				//    3    7:return          
				}

				final Toolbar a;

			
			{
				a = Toolbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Toolbar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   40   81:aload_0         
	//   41   82:getfield        #721 <Field ImageButton a>
	//   42   85:new             #10  <Class Toolbar$3>
	//   43   88:dup             
	//   44   89:aload_0         
	//   45   90:invokespecial   #728 <Method void Toolbar$3(Toolbar)>
	//   46   93:invokevirtual   #732 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		}
	//   47   96:return          
	}

	protected LayoutParams j()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #12  <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #734 <Method void Toolbar$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	void k()
	{
		for(int i1 = getChildCount() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #457 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            60
		{
			View view = getChildAt(i1);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokevirtual   #468 <Method View getChildAt(int)>
	//   10   16:astore_2        
			if(((LayoutParams)view.getLayoutParams()).b != 2 && view != e)
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  13   21:checkcast       #12  <Class Toolbar$LayoutParams>
	//*  14   24:getfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
	//*  15   27:iconst_2        
	//*  16   28:icmpeq          53
	//*  17   31:aload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #507 <Field ActionMenuView e>
	//*  20   36:if_acmpeq       53
			{
				removeViewAt(i1);
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #737 <Method void removeViewAt(int)>
				F.add(((Object) (view)));
	//   24   44:aload_0         
	//   25   45:getfield        #111 <Field ArrayList F>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #444 <Method boolean ArrayList.add(Object)>
	//   28   52:pop             
			}
		}

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:istore_1        
	//*  33   57:goto            7
	//   34   60:return          
	}

	void l()
	{
		for(int i1 = F.size() - 1; i1 >= 0; i1--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field ArrayList F>
	//*   2    4:invokevirtual   #738 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            36
			addView((View)F.get(i1));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #111 <Field ArrayList F>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #739 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #319 <Class View>
	//   14   26:invokevirtual   #742 <Method void addView(View)>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
	//*  19   33:goto            10
		F.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #111 <Field ArrayList F>
	//   22   40:invokevirtual   #743 <Method void ArrayList.clear()>
	//   23   43:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #746 <Method void ViewGroup.onDetachedFromWindow()>
		removeCallbacks(O);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #121 <Field Runnable O>
	//    5    9:invokevirtual   #563 <Method boolean removeCallbacks(Runnable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #753 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i1 == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			D = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #755 <Field boolean D>
		if(!D)
	//*   9   16:aload_0         
	//*  10   17:getfield        #755 <Field boolean D>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #757 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
	//   15   28:istore_3        
			if(i1 == 9 && !flag)
	//*  16   29:iload_2         
	//*  17   30:bipush          9
	//*  18   32:icmpne          44
	//*  19   35:iload_3         
	//*  20   36:ifne            44
				D = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #755 <Field boolean D>
		}
		if(i1 == 10 || i1 == 3)
	//*  24   44:iload_2         
	//*  25   45:bipush          10
	//*  26   47:icmpeq          55
	//*  27   50:iload_2         
	//*  28   51:iconst_3        
	//*  29   52:icmpne          60
			D = false;
	//   30   55:aload_0         
	//   31   56:iconst_0        
	//   32   57:putfield        #755 <Field boolean D>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		int i2;
		boolean flag2;
		int k4;
		int l4;
		int i5;
		int l5;
		int i6;
		boolean flag3;
		int ai[];
		int j2;
		int k3;
label0:
		{
			if(android.support.v4.view.s.e(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #454 <Method int s.e(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
				flag2 = true;
	//    4    8:iconst_1        
	//    5    9:istore          8
			else
	//*   6   11:goto            17
				flag2 = false;
	//    7   14:iconst_0        
	//    8   15:istore          8
			k4 = getWidth();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #762 <Method int getWidth()>
	//   11   21:istore          10
			l5 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #340 <Method int getHeight()>
	//   14   27:istore          13
			i2 = getPaddingLeft();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #363 <Method int getPaddingLeft()>
	//   17   33:istore          6
			l4 = getPaddingRight();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #366 <Method int getPaddingRight()>
	//   20   39:istore          11
			i5 = getPaddingTop();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #334 <Method int getPaddingTop()>
	//   23   45:istore          12
			i6 = getPaddingBottom();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #337 <Method int getPaddingBottom()>
	//   26   51:istore          14
			k3 = k4 - l4;
	//   27   53:iload           10
	//   28   55:iload           11
	//   29   57:isub            
	//   30   58:istore          9
			ai = G;
	//   31   60:aload_0         
	//   32   61:getfield        #113 <Field int[] G>
	//   33   64:astore          18
			ai[1] = 0;
	//   34   66:aload           18
	//   35   68:iconst_1        
	//   36   69:iconst_0        
	//   37   70:iastore         
			ai[0] = 0;
	//   38   71:aload           18
	//   39   73:iconst_0        
	//   40   74:iconst_0        
	//   41   75:iastore         
			i1 = android.support.v4.view.s.j(((View) (this)));
	//   42   76:aload_0         
	//   43   77:invokestatic    #764 <Method int s.j(View)>
	//   44   80:istore_2        
			if(i1 >= 0)
	//*  45   81:iload_2         
	//*  46   82:iflt            98
				l1 = Math.min(i1, l1 - j1);
	//   47   85:iload_2         
	//   48   86:iload           5
	//   49   88:iload_3         
	//   50   89:isub            
	//   51   90:invokestatic    #418 <Method int Math.min(int, int)>
	//   52   93:istore          5
			else
	//*  53   95:goto            101
				l1 = 0;
	//   54   98:iconst_0        
	//   55   99:istore          5
			if(a(((View) (h))))
	//*  56  101:aload_0         
	//*  57  102:aload_0         
	//*  58  103:getfield        #549 <Field ImageButton h>
	//*  59  106:invokespecial   #471 <Method boolean a(View)>
	//*  60  109:ifeq            159
			{
				if(flag2)
	//*  61  112:iload           8
	//*  62  114:ifeq            140
				{
					k1 = b(((View) (h)), k3, ai, l1);
	//   63  117:aload_0         
	//   64  118:aload_0         
	//   65  119:getfield        #549 <Field ImageButton h>
	//   66  122:iload           9
	//   67  124:aload           18
	//   68  126:iload           5
	//   69  128:invokespecial   #766 <Method int b(View, int, int[], int)>
	//   70  131:istore          4
					j2 = i2;
	//   71  133:iload           6
	//   72  135:istore          7
					break label0;
	//   73  137:goto            167
				}
				j2 = a(((View) (h)), i2, ai, l1);
	//   74  140:aload_0         
	//   75  141:aload_0         
	//   76  142:getfield        #549 <Field ImageButton h>
	//   77  145:iload           6
	//   78  147:aload           18
	//   79  149:iload           5
	//   80  151:invokespecial   #768 <Method int a(View, int, int[], int)>
	//   81  154:istore          7
			} else
	//*  82  156:goto            163
			{
				j2 = i2;
	//   83  159:iload           6
	//   84  161:istore          7
			}
			k1 = k3;
	//   85  163:iload           9
	//   86  165:istore          4
		}
		i1 = k1;
	//   87  167:iload           4
	//   88  169:istore_2        
		j1 = j2;
	//   89  170:iload           7
	//   90  172:istore_3        
		if(a(((View) (a))))
	//*  91  173:aload_0         
	//*  92  174:aload_0         
	//*  93  175:getfield        #721 <Field ImageButton a>
	//*  94  178:invokespecial   #471 <Method boolean a(View)>
	//*  95  181:ifeq            228
			if(flag2)
	//*  96  184:iload           8
	//*  97  186:ifeq            210
			{
				i1 = b(((View) (a)), k1, ai, l1);
	//   98  189:aload_0         
	//   99  190:aload_0         
	//  100  191:getfield        #721 <Field ImageButton a>
	//  101  194:iload           4
	//  102  196:aload           18
	//  103  198:iload           5
	//  104  200:invokespecial   #766 <Method int b(View, int, int[], int)>
	//  105  203:istore_2        
				j1 = j2;
	//  106  204:iload           7
	//  107  206:istore_3        
			} else
	//* 108  207:goto            228
			{
				j1 = a(((View) (a)), j2, ai, l1);
	//  109  210:aload_0         
	//  110  211:aload_0         
	//  111  212:getfield        #721 <Field ImageButton a>
	//  112  215:iload           7
	//  113  217:aload           18
	//  114  219:iload           5
	//  115  221:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  116  224:istore_3        
				i1 = k1;
	//  117  225:iload           4
	//  118  227:istore_2        
			}
		k1 = i1;
	//  119  228:iload_2         
	//  120  229:istore          4
		j2 = j1;
	//  121  231:iload_3         
	//  122  232:istore          7
		if(a(((View) (e))))
	//* 123  234:aload_0         
	//* 124  235:aload_0         
	//* 125  236:getfield        #507 <Field ActionMenuView e>
	//* 126  239:invokespecial   #471 <Method boolean a(View)>
	//* 127  242:ifeq            289
			if(flag2)
	//* 128  245:iload           8
	//* 129  247:ifeq            271
			{
				j2 = a(((View) (e)), j1, ai, l1);
	//  130  250:aload_0         
	//  131  251:aload_0         
	//  132  252:getfield        #507 <Field ActionMenuView e>
	//  133  255:iload_3         
	//  134  256:aload           18
	//  135  258:iload           5
	//  136  260:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  137  263:istore          7
				k1 = i1;
	//  138  265:iload_2         
	//  139  266:istore          4
			} else
	//* 140  268:goto            289
			{
				k1 = b(((View) (e)), i1, ai, l1);
	//  141  271:aload_0         
	//  142  272:aload_0         
	//  143  273:getfield        #507 <Field ActionMenuView e>
	//  144  276:iload_2         
	//  145  277:aload           18
	//  146  279:iload           5
	//  147  281:invokespecial   #766 <Method int b(View, int, int[], int)>
	//  148  284:istore          4
				j2 = j1;
	//  149  286:iload_3         
	//  150  287:istore          7
			}
		j1 = getCurrentContentInsetLeft();
	//  151  289:aload_0         
	//  152  290:invokevirtual   #770 <Method int getCurrentContentInsetLeft()>
	//  153  293:istore_3        
		i1 = getCurrentContentInsetRight();
	//  154  294:aload_0         
	//  155  295:invokevirtual   #772 <Method int getCurrentContentInsetRight()>
	//  156  298:istore_2        
		ai[0] = Math.max(0, j1 - j2);
	//  157  299:aload           18
	//  158  301:iconst_0        
	//  159  302:iconst_0        
	//  160  303:iload_3         
	//  161  304:iload           7
	//  162  306:isub            
	//  163  307:invokestatic    #351 <Method int Math.max(int, int)>
	//  164  310:iastore         
		ai[1] = Math.max(0, i1 - (k3 - k1));
	//  165  311:aload           18
	//  166  313:iconst_1        
	//  167  314:iconst_0        
	//  168  315:iload_2         
	//  169  316:iload           9
	//  170  318:iload           4
	//  171  320:isub            
	//  172  321:isub            
	//  173  322:invokestatic    #351 <Method int Math.max(int, int)>
	//  174  325:iastore         
		j1 = Math.max(j2, j1);
	//  175  326:iload           7
	//  176  328:iload_3         
	//  177  329:invokestatic    #351 <Method int Math.max(int, int)>
	//  178  332:istore_3        
		k1 = Math.min(k1, k3 - i1);
	//  179  333:iload           4
	//  180  335:iload           9
	//  181  337:iload_2         
	//  182  338:isub            
	//  183  339:invokestatic    #418 <Method int Math.min(int, int)>
	//  184  342:istore          4
		i1 = j1;
	//  185  344:iload_3         
	//  186  345:istore_2        
		j2 = k1;
	//  187  346:iload           4
	//  188  348:istore          7
		if(a(b))
	//* 189  350:aload_0         
	//* 190  351:aload_0         
	//* 191  352:getfield        #436 <Field View b>
	//* 192  355:invokespecial   #471 <Method boolean a(View)>
	//* 193  358:ifeq            405
			if(flag2)
	//* 194  361:iload           8
	//* 195  363:ifeq            387
			{
				j2 = b(b, k1, ai, l1);
	//  196  366:aload_0         
	//  197  367:aload_0         
	//  198  368:getfield        #436 <Field View b>
	//  199  371:iload           4
	//  200  373:aload           18
	//  201  375:iload           5
	//  202  377:invokespecial   #766 <Method int b(View, int, int[], int)>
	//  203  380:istore          7
				i1 = j1;
	//  204  382:iload_3         
	//  205  383:istore_2        
			} else
	//* 206  384:goto            405
			{
				i1 = a(b, j1, ai, l1);
	//  207  387:aload_0         
	//  208  388:aload_0         
	//  209  389:getfield        #436 <Field View b>
	//  210  392:iload_3         
	//  211  393:aload           18
	//  212  395:iload           5
	//  213  397:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  214  400:istore_2        
				j2 = k1;
	//  215  401:iload           4
	//  216  403:istore          7
			}
		k1 = i1;
	//  217  405:iload_2         
	//  218  406:istore          4
		j1 = j2;
	//  219  408:iload           7
	//  220  410:istore_3        
		if(a(((View) (i))))
	//* 221  411:aload_0         
	//* 222  412:aload_0         
	//* 223  413:getfield        #500 <Field ImageView i>
	//* 224  416:invokespecial   #471 <Method boolean a(View)>
	//* 225  419:ifeq            466
			if(flag2)
	//* 226  422:iload           8
	//* 227  424:ifeq            448
			{
				j1 = b(((View) (i)), j2, ai, l1);
	//  228  427:aload_0         
	//  229  428:aload_0         
	//  230  429:getfield        #500 <Field ImageView i>
	//  231  432:iload           7
	//  232  434:aload           18
	//  233  436:iload           5
	//  234  438:invokespecial   #766 <Method int b(View, int, int[], int)>
	//  235  441:istore_3        
				k1 = i1;
	//  236  442:iload_2         
	//  237  443:istore          4
			} else
	//* 238  445:goto            466
			{
				k1 = a(((View) (i)), i1, ai, l1);
	//  239  448:aload_0         
	//  240  449:aload_0         
	//  241  450:getfield        #500 <Field ImageView i>
	//  242  453:iload_2         
	//  243  454:aload           18
	//  244  456:iload           5
	//  245  458:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  246  461:istore          4
				j1 = j2;
	//  247  463:iload           7
	//  248  465:istore_3        
			}
		flag = a(((View) (f)));
	//  249  466:aload_0         
	//  250  467:aload_0         
	//  251  468:getfield        #588 <Field TextView f>
	//  252  471:invokespecial   #471 <Method boolean a(View)>
	//  253  474:istore_1        
		flag3 = a(((View) (g)));
	//  254  475:aload_0         
	//  255  476:aload_0         
	//  256  477:getfield        #619 <Field TextView g>
	//  257  480:invokespecial   #471 <Method boolean a(View)>
	//  258  483:istore          15
		if(flag)
	//* 259  485:iload_1         
	//* 260  486:ifeq            526
		{
			LayoutParams layoutparams = (LayoutParams)f.getLayoutParams();
	//  261  489:aload_0         
	//  262  490:getfield        #588 <Field TextView f>
	//  263  493:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  264  496:checkcast       #12  <Class Toolbar$LayoutParams>
	//  265  499:astore          16
			i1 = layoutparams.topMargin + f.getMeasuredHeight() + layoutparams.bottomMargin + 0;
	//  266  501:aload           16
	//  267  503:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  268  506:aload_0         
	//  269  507:getfield        #588 <Field TextView f>
	//  270  510:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  271  513:iadd            
	//  272  514:aload           16
	//  273  516:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  274  519:iadd            
	//  275  520:iconst_0        
	//  276  521:iadd            
	//  277  522:istore_2        
		} else
	//* 278  523:goto            528
		{
			i1 = 0;
	//  279  526:iconst_0        
	//  280  527:istore_2        
		}
		if(flag3)
	//* 281  528:iload           15
	//* 282  530:ifeq            570
		{
			LayoutParams layoutparams1 = (LayoutParams)g.getLayoutParams();
	//  283  533:aload_0         
	//  284  534:getfield        #619 <Field TextView g>
	//  285  537:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  286  540:checkcast       #12  <Class Toolbar$LayoutParams>
	//  287  543:astore          16
			i1 += layoutparams1.topMargin + g.getMeasuredHeight() + layoutparams1.bottomMargin;
	//  288  545:iload_2         
	//  289  546:aload           16
	//  290  548:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  291  551:aload_0         
	//  292  552:getfield        #619 <Field TextView g>
	//  293  555:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  294  558:iadd            
	//  295  559:aload           16
	//  296  561:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  297  564:iadd            
	//  298  565:iadd            
	//  299  566:istore_2        
		}
	//* 300  567:goto            570
		if(!flag && !flag3) goto _L2; else goto _L1
	//  301  570:iload_1         
	//  302  571:ifne            591
	//  303  574:iload           15
	//  304  576:ifeq            582
	//* 305  579:goto            591
_L2:
		i1 = k1;
	//  306  582:iload           4
	//  307  584:istore_2        
_L4:
		k1 = j1;
	//  308  585:iload_3         
	//  309  586:istore          4
		break MISSING_BLOCK_LABEL_1321;
	//  310  588:goto            1321
_L1:
		boolean flag1;
		Object obj;
		if(flag)
	//* 311  591:iload_1         
	//* 312  592:ifeq            604
			obj = ((Object) (f));
	//  313  595:aload_0         
	//  314  596:getfield        #588 <Field TextView f>
	//  315  599:astore          16
		else
	//* 316  601:goto            610
			obj = ((Object) (g));
	//  317  604:aload_0         
	//  318  605:getfield        #619 <Field TextView g>
	//  319  608:astore          16
		Object obj1;
		if(flag3)
	//* 320  610:iload           15
	//* 321  612:ifeq            624
			obj1 = ((Object) (g));
	//  322  615:aload_0         
	//  323  616:getfield        #619 <Field TextView g>
	//  324  619:astore          17
		else
	//* 325  621:goto            630
			obj1 = ((Object) (f));
	//  326  624:aload_0         
	//  327  625:getfield        #588 <Field TextView f>
	//  328  628:astore          17
		obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  329  630:aload           16
	//  330  632:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  331  635:checkcast       #12  <Class Toolbar$LayoutParams>
	//  332  638:astore          16
		obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
	//  333  640:aload           17
	//  334  642:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  335  645:checkcast       #12  <Class Toolbar$LayoutParams>
	//  336  648:astore          17
		if(flag && f.getMeasuredWidth() > 0 || flag3 && g.getMeasuredWidth() > 0)
	//* 337  650:iload_1         
	//* 338  651:ifeq            664
	//* 339  654:aload_0         
	//* 340  655:getfield        #588 <Field TextView f>
	//* 341  658:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//* 342  661:ifgt            679
	//* 343  664:iload           15
	//* 344  666:ifeq            685
	//* 345  669:aload_0         
	//* 346  670:getfield        #619 <Field TextView g>
	//* 347  673:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//* 348  676:ifle            685
			flag1 = true;
	//  349  679:iconst_1        
	//  350  680:istore          7
		else
	//* 351  682:goto            688
			flag1 = false;
	//  352  685:iconst_0        
	//  353  686:istore          7
		int l3 = x & 0x70;
	//  354  688:aload_0         
	//  355  689:getfield        #102 <Field int x>
	//  356  692:bipush          112
	//  357  694:iand            
	//  358  695:istore          9
		if(l3 != 48)
	//* 359  697:iload           9
	//* 360  699:bipush          48
	//* 361  701:icmpeq          838
		{
			if(l3 != 80)
	//* 362  704:iload           9
	//* 363  706:bipush          80
	//* 364  708:icmpeq          816
			{
				l3 = (l5 - i5 - i6 - i1) / 2;
	//  365  711:iload           13
	//  366  713:iload           12
	//  367  715:isub            
	//  368  716:iload           14
	//  369  718:isub            
	//  370  719:iload_2         
	//  371  720:isub            
	//  372  721:iconst_2        
	//  373  722:idiv            
	//  374  723:istore          9
				if(l3 < ((LayoutParams) (obj)).topMargin + s)
	//* 375  725:iload           9
	//* 376  727:aload           16
	//* 377  729:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//* 378  732:aload_0         
	//* 379  733:getfield        #173 <Field int s>
	//* 380  736:iadd            
	//* 381  737:icmpge          754
				{
					i1 = ((LayoutParams) (obj)).topMargin + s;
	//  382  740:aload           16
	//  383  742:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  384  745:aload_0         
	//  385  746:getfield        #173 <Field int s>
	//  386  749:iadd            
	//  387  750:istore_2        
				} else
	//* 388  751:goto            808
				{
					l5 = l5 - i6 - i1 - l3 - i5;
	//  389  754:iload           13
	//  390  756:iload           14
	//  391  758:isub            
	//  392  759:iload_2         
	//  393  760:isub            
	//  394  761:iload           9
	//  395  763:isub            
	//  396  764:iload           12
	//  397  766:isub            
	//  398  767:istore          13
					i1 = l3;
	//  399  769:iload           9
	//  400  771:istore_2        
					if(l5 < ((LayoutParams) (obj)).bottomMargin + t)
	//* 401  772:iload           13
	//* 402  774:aload           16
	//* 403  776:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 404  779:aload_0         
	//* 405  780:getfield        #171 <Field int t>
	//* 406  783:iadd            
	//* 407  784:icmpge          808
						i1 = Math.max(0, l3 - ((((LayoutParams) (obj1)).bottomMargin + t) - l5));
	//  408  787:iconst_0        
	//  409  788:iload           9
	//  410  790:aload           17
	//  411  792:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  412  795:aload_0         
	//  413  796:getfield        #171 <Field int t>
	//  414  799:iadd            
	//  415  800:iload           13
	//  416  802:isub            
	//  417  803:isub            
	//  418  804:invokestatic    #351 <Method int Math.max(int, int)>
	//  419  807:istore_2        
				}
				i1 = i5 + i1;
	//  420  808:iload           12
	//  421  810:iload_2         
	//  422  811:iadd            
	//  423  812:istore_2        
			} else
	//* 424  813:goto            854
			{
				i1 = l5 - i6 - ((LayoutParams) (obj1)).bottomMargin - t - i1;
	//  425  816:iload           13
	//  426  818:iload           14
	//  427  820:isub            
	//  428  821:aload           17
	//  429  823:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  430  826:isub            
	//  431  827:aload_0         
	//  432  828:getfield        #171 <Field int t>
	//  433  831:isub            
	//  434  832:iload_2         
	//  435  833:isub            
	//  436  834:istore_2        
			}
		} else
	//* 437  835:goto            854
		{
			i1 = getPaddingTop() + ((LayoutParams) (obj)).topMargin + s;
	//  438  838:aload_0         
	//  439  839:invokevirtual   #334 <Method int getPaddingTop()>
	//  440  842:aload           16
	//  441  844:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  442  847:iadd            
	//  443  848:aload_0         
	//  444  849:getfield        #173 <Field int s>
	//  445  852:iadd            
	//  446  853:istore_2        
		}
		if(!flag2)
			break; /* Loop/switch isn't completed */
	//  447  854:iload           8
	//  448  856:ifeq            1089
		int l2;
		if(flag1)
	//* 449  859:iload           7
	//* 450  861:ifeq            873
			l2 = q;
	//  451  864:aload_0         
	//  452  865:getfield        #177 <Field int q>
	//  453  868:istore          8
		else
	//* 454  870:goto            876
			l2 = 0;
	//  455  873:iconst_0        
	//  456  874:istore          8
		l2 -= ai[1];
	//  457  876:iload           8
	//  458  878:aload           18
	//  459  880:iconst_1        
	//  460  881:iaload          
	//  461  882:isub            
	//  462  883:istore          8
		j1 -= Math.max(0, l2);
	//  463  885:iload_3         
	//  464  886:iconst_0        
	//  465  887:iload           8
	//  466  889:invokestatic    #351 <Method int Math.max(int, int)>
	//  467  892:isub            
	//  468  893:istore_3        
		ai[1] = Math.max(0, -l2);
	//  469  894:aload           18
	//  470  896:iconst_1        
	//  471  897:iconst_0        
	//  472  898:iload           8
	//  473  900:ineg            
	//  474  901:invokestatic    #351 <Method int Math.max(int, int)>
	//  475  904:iastore         
		if(flag)
	//* 476  905:iload_1         
	//* 477  906:ifeq            977
		{
			LayoutParams layoutparams2 = (LayoutParams)f.getLayoutParams();
	//  478  909:aload_0         
	//  479  910:getfield        #588 <Field TextView f>
	//  480  913:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  481  916:checkcast       #12  <Class Toolbar$LayoutParams>
	//  482  919:astore          16
			l3 = j1 - f.getMeasuredWidth();
	//  483  921:iload_3         
	//  484  922:aload_0         
	//  485  923:getfield        #588 <Field TextView f>
	//  486  926:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//  487  929:isub            
	//  488  930:istore          9
			l2 = f.getMeasuredHeight() + i1;
	//  489  932:aload_0         
	//  490  933:getfield        #588 <Field TextView f>
	//  491  936:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  492  939:iload_2         
	//  493  940:iadd            
	//  494  941:istore          8
			f.layout(l3, i1, j1, l2);
	//  495  943:aload_0         
	//  496  944:getfield        #588 <Field TextView f>
	//  497  947:iload           9
	//  498  949:iload_2         
	//  499  950:iload_3         
	//  500  951:iload           8
	//  501  953:invokevirtual   #776 <Method void TextView.layout(int, int, int, int)>
			i1 = l3 - r;
	//  502  956:iload           9
	//  503  958:aload_0         
	//  504  959:getfield        #175 <Field int r>
	//  505  962:isub            
	//  506  963:istore_2        
			l3 = l2 + layoutparams2.bottomMargin;
	//  507  964:iload           8
	//  508  966:aload           16
	//  509  968:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  510  971:iadd            
	//  511  972:istore          9
		} else
	//* 512  974:goto            986
		{
			l2 = j1;
	//  513  977:iload_3         
	//  514  978:istore          8
			l3 = i1;
	//  515  980:iload_2         
	//  516  981:istore          9
			i1 = l2;
	//  517  983:iload           8
	//  518  985:istore_2        
		}
		if(flag3)
	//* 519  986:iload           15
	//* 520  988:ifeq            1068
		{
			LayoutParams layoutparams3 = (LayoutParams)g.getLayoutParams();
	//  521  991:aload_0         
	//  522  992:getfield        #619 <Field TextView g>
	//  523  995:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  524  998:checkcast       #12  <Class Toolbar$LayoutParams>
	//  525 1001:astore          16
			l2 = l3 + layoutparams3.topMargin;
	//  526 1003:iload           9
	//  527 1005:aload           16
	//  528 1007:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  529 1010:iadd            
	//  530 1011:istore          8
			l3 = g.getMeasuredWidth();
	//  531 1013:aload_0         
	//  532 1014:getfield        #619 <Field TextView g>
	//  533 1017:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//  534 1020:istore          9
			int j5 = g.getMeasuredHeight();
	//  535 1022:aload_0         
	//  536 1023:getfield        #619 <Field TextView g>
	//  537 1026:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  538 1029:istore          12
			g.layout(j1 - l3, l2, j1, j5 + l2);
	//  539 1031:aload_0         
	//  540 1032:getfield        #619 <Field TextView g>
	//  541 1035:iload_3         
	//  542 1036:iload           9
	//  543 1038:isub            
	//  544 1039:iload           8
	//  545 1041:iload_3         
	//  546 1042:iload           12
	//  547 1044:iload           8
	//  548 1046:iadd            
	//  549 1047:invokevirtual   #776 <Method void TextView.layout(int, int, int, int)>
			l2 = j1 - r;
	//  550 1050:iload_3         
	//  551 1051:aload_0         
	//  552 1052:getfield        #175 <Field int r>
	//  553 1055:isub            
	//  554 1056:istore          8
			l3 = layoutparams3.bottomMargin;
	//  555 1058:aload           16
	//  556 1060:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  557 1063:istore          9
		} else
	//* 558 1065:goto            1071
		{
			l2 = j1;
	//  559 1068:iload_3         
	//  560 1069:istore          8
		}
		if(flag1)
	//* 561 1071:iload           7
	//* 562 1073:ifeq            1083
			j1 = Math.min(i1, l2);
	//  563 1076:iload_2         
	//  564 1077:iload           8
	//  565 1079:invokestatic    #418 <Method int Math.min(int, int)>
	//  566 1082:istore_3        
		i1 = k1;
	//  567 1083:iload           4
	//  568 1085:istore_2        
		if(true) goto _L4; else goto _L3
	//  569 1086:goto            585
_L3:
		int i3;
		if(flag1)
	//* 570 1089:iload           7
	//* 571 1091:ifeq            1103
			i3 = q;
	//  572 1094:aload_0         
	//  573 1095:getfield        #177 <Field int q>
	//  574 1098:istore          8
		else
	//* 575 1100:goto            1106
			i3 = 0;
	//  576 1103:iconst_0        
	//  577 1104:istore          8
		i3 -= ai[0];
	//  578 1106:iload           8
	//  579 1108:aload           18
	//  580 1110:iconst_0        
	//  581 1111:iaload          
	//  582 1112:isub            
	//  583 1113:istore          8
		k1 += Math.max(0, i3);
	//  584 1115:iload           4
	//  585 1117:iconst_0        
	//  586 1118:iload           8
	//  587 1120:invokestatic    #351 <Method int Math.max(int, int)>
	//  588 1123:iadd            
	//  589 1124:istore          4
		ai[0] = Math.max(0, -i3);
	//  590 1126:aload           18
	//  591 1128:iconst_0        
	//  592 1129:iconst_0        
	//  593 1130:iload           8
	//  594 1132:ineg            
	//  595 1133:invokestatic    #351 <Method int Math.max(int, int)>
	//  596 1136:iastore         
		if(flag)
	//* 597 1137:iload_1         
	//* 598 1138:ifeq            1211
		{
			LayoutParams layoutparams4 = (LayoutParams)f.getLayoutParams();
	//  599 1141:aload_0         
	//  600 1142:getfield        #588 <Field TextView f>
	//  601 1145:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  602 1148:checkcast       #12  <Class Toolbar$LayoutParams>
	//  603 1151:astore          16
			i3 = f.getMeasuredWidth() + k1;
	//  604 1153:aload_0         
	//  605 1154:getfield        #588 <Field TextView f>
	//  606 1157:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//  607 1160:iload           4
	//  608 1162:iadd            
	//  609 1163:istore          8
			int i4 = f.getMeasuredHeight() + i1;
	//  610 1165:aload_0         
	//  611 1166:getfield        #588 <Field TextView f>
	//  612 1169:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  613 1172:iload_2         
	//  614 1173:iadd            
	//  615 1174:istore          9
			f.layout(k1, i1, i3, i4);
	//  616 1176:aload_0         
	//  617 1177:getfield        #588 <Field TextView f>
	//  618 1180:iload           4
	//  619 1182:iload_2         
	//  620 1183:iload           8
	//  621 1185:iload           9
	//  622 1187:invokevirtual   #776 <Method void TextView.layout(int, int, int, int)>
			i3 += r;
	//  623 1190:iload           8
	//  624 1192:aload_0         
	//  625 1193:getfield        #175 <Field int r>
	//  626 1196:iadd            
	//  627 1197:istore          8
			i1 = i4 + layoutparams4.bottomMargin;
	//  628 1199:iload           9
	//  629 1201:aload           16
	//  630 1203:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  631 1206:iadd            
	//  632 1207:istore_2        
		} else
	//* 633 1208:goto            1215
		{
			i3 = k1;
	//  634 1211:iload           4
	//  635 1213:istore          8
		}
		int j4;
		if(flag3)
	//* 636 1215:iload           15
	//* 637 1217:ifeq            1295
		{
			LayoutParams layoutparams5 = (LayoutParams)g.getLayoutParams();
	//  638 1220:aload_0         
	//  639 1221:getfield        #619 <Field TextView g>
	//  640 1224:invokevirtual   #773 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  641 1227:checkcast       #12  <Class Toolbar$LayoutParams>
	//  642 1230:astore          16
			i1 += layoutparams5.topMargin;
	//  643 1232:iload_2         
	//  644 1233:aload           16
	//  645 1235:getfield        #343 <Field int Toolbar$LayoutParams.topMargin>
	//  646 1238:iadd            
	//  647 1239:istore_2        
			j4 = g.getMeasuredWidth() + k1;
	//  648 1240:aload_0         
	//  649 1241:getfield        #619 <Field TextView g>
	//  650 1244:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//  651 1247:iload           4
	//  652 1249:iadd            
	//  653 1250:istore          9
			int k5 = g.getMeasuredHeight();
	//  654 1252:aload_0         
	//  655 1253:getfield        #619 <Field TextView g>
	//  656 1256:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  657 1259:istore          12
			g.layout(k1, i1, j4, k5 + i1);
	//  658 1261:aload_0         
	//  659 1262:getfield        #619 <Field TextView g>
	//  660 1265:iload           4
	//  661 1267:iload_2         
	//  662 1268:iload           9
	//  663 1270:iload           12
	//  664 1272:iload_2         
	//  665 1273:iadd            
	//  666 1274:invokevirtual   #776 <Method void TextView.layout(int, int, int, int)>
			j4 += r;
	//  667 1277:iload           9
	//  668 1279:aload_0         
	//  669 1280:getfield        #175 <Field int r>
	//  670 1283:iadd            
	//  671 1284:istore          9
			i1 = layoutparams5.bottomMargin;
	//  672 1286:aload           16
	//  673 1288:getfield        #346 <Field int Toolbar$LayoutParams.bottomMargin>
	//  674 1291:istore_2        
		} else
	//* 675 1292:goto            1299
		{
			j4 = k1;
	//  676 1295:iload           4
	//  677 1297:istore          9
		}
		i1 = k1;
	//  678 1299:iload           4
	//  679 1301:istore_2        
		k1 = j1;
	//  680 1302:iload_3         
	//  681 1303:istore          4
		if(flag1)
	//* 682 1305:iload           7
	//* 683 1307:ifeq            1321
		{
			i1 = Math.max(i3, j4);
	//  684 1310:iload           8
	//  685 1312:iload           9
	//  686 1314:invokestatic    #351 <Method int Math.max(int, int)>
	//  687 1317:istore_2        
			k1 = j1;
	//  688 1318:iload_3         
	//  689 1319:istore          4
		}
		int k2 = i2;
	//  690 1321:iload           6
	//  691 1323:istore          7
		i2 = 0;
	//  692 1325:iconst_0        
	//  693 1326:istore          6
		a(((List) (E)), 3);
	//  694 1328:aload_0         
	//  695 1329:aload_0         
	//  696 1330:getfield        #109 <Field ArrayList E>
	//  697 1333:iconst_3        
	//  698 1334:invokespecial   #778 <Method void a(List, int)>
		int j3 = E.size();
	//  699 1337:aload_0         
	//  700 1338:getfield        #109 <Field ArrayList E>
	//  701 1341:invokevirtual   #738 <Method int ArrayList.size()>
	//  702 1344:istore          8
		for(j1 = 0; j1 < j3; j1++)
	//* 703 1346:iconst_0        
	//* 704 1347:istore_3        
	//* 705 1348:iload_3         
	//* 706 1349:iload           8
	//* 707 1351:icmpge          1382
			i1 = a((View)E.get(j1), i1, ai, l1);
	//  708 1354:aload_0         
	//  709 1355:aload_0         
	//  710 1356:getfield        #109 <Field ArrayList E>
	//  711 1359:iload_3         
	//  712 1360:invokevirtual   #739 <Method Object ArrayList.get(int)>
	//  713 1363:checkcast       #319 <Class View>
	//  714 1366:iload_2         
	//  715 1367:aload           18
	//  716 1369:iload           5
	//  717 1371:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  718 1374:istore_2        

	//  719 1375:iload_3         
	//  720 1376:iconst_1        
	//  721 1377:iadd            
	//  722 1378:istore_3        
	//* 723 1379:goto            1348
		a(((List) (E)), 5);
	//  724 1382:aload_0         
	//  725 1383:aload_0         
	//  726 1384:getfield        #109 <Field ArrayList E>
	//  727 1387:iconst_5        
	//  728 1388:invokespecial   #778 <Method void a(List, int)>
		j3 = E.size();
	//  729 1391:aload_0         
	//  730 1392:getfield        #109 <Field ArrayList E>
	//  731 1395:invokevirtual   #738 <Method int ArrayList.size()>
	//  732 1398:istore          8
		for(j1 = 0; j1 < j3; j1++)
	//* 733 1400:iconst_0        
	//* 734 1401:istore_3        
	//* 735 1402:iload_3         
	//* 736 1403:iload           8
	//* 737 1405:icmpge          1438
			k1 = b((View)E.get(j1), k1, ai, l1);
	//  738 1408:aload_0         
	//  739 1409:aload_0         
	//  740 1410:getfield        #109 <Field ArrayList E>
	//  741 1413:iload_3         
	//  742 1414:invokevirtual   #739 <Method Object ArrayList.get(int)>
	//  743 1417:checkcast       #319 <Class View>
	//  744 1420:iload           4
	//  745 1422:aload           18
	//  746 1424:iload           5
	//  747 1426:invokespecial   #766 <Method int b(View, int, int[], int)>
	//  748 1429:istore          4

	//  749 1431:iload_3         
	//  750 1432:iconst_1        
	//  751 1433:iadd            
	//  752 1434:istore_3        
	//* 753 1435:goto            1402
		a(((List) (E)), 1);
	//  754 1438:aload_0         
	//  755 1439:aload_0         
	//  756 1440:getfield        #109 <Field ArrayList E>
	//  757 1443:iconst_1        
	//  758 1444:invokespecial   #778 <Method void a(List, int)>
		j3 = a(((List) (E)), ai);
	//  759 1447:aload_0         
	//  760 1448:aload_0         
	//  761 1449:getfield        #109 <Field ArrayList E>
	//  762 1452:aload           18
	//  763 1454:invokespecial   #780 <Method int a(List, int[])>
	//  764 1457:istore          8
		j1 = (k2 + (k4 - k2 - l4) / 2) - j3 / 2;
	//  765 1459:iload           7
	//  766 1461:iload           10
	//  767 1463:iload           7
	//  768 1465:isub            
	//  769 1466:iload           11
	//  770 1468:isub            
	//  771 1469:iconst_2        
	//  772 1470:idiv            
	//  773 1471:iadd            
	//  774 1472:iload           8
	//  775 1474:iconst_2        
	//  776 1475:idiv            
	//  777 1476:isub            
	//  778 1477:istore_3        
		k2 = j3 + j1;
	//  779 1478:iload           8
	//  780 1480:iload_3         
	//  781 1481:iadd            
	//  782 1482:istore          7
		if(j1 >= i1)
	//* 783 1484:iload_3         
	//* 784 1485:iload_2         
	//* 785 1486:icmpge          1492
	//* 786 1489:goto            1512
			if(k2 > k1)
	//* 787 1492:iload           7
	//* 788 1494:iload           4
	//* 789 1496:icmple          1510
				i1 = j1 - (k2 - k1);
	//  790 1499:iload_3         
	//  791 1500:iload           7
	//  792 1502:iload           4
	//  793 1504:isub            
	//  794 1505:isub            
	//  795 1506:istore_2        
			else
	//* 796 1507:goto            1512
				i1 = j1;
	//  797 1510:iload_3         
	//  798 1511:istore_2        
		k1 = E.size();
	//  799 1512:aload_0         
	//  800 1513:getfield        #109 <Field ArrayList E>
	//  801 1516:invokevirtual   #738 <Method int ArrayList.size()>
	//  802 1519:istore          4
		for(j1 = i2; j1 < k1; j1++)
	//* 803 1521:iload           6
	//* 804 1523:istore_3        
	//* 805 1524:iload_3         
	//* 806 1525:iload           4
	//* 807 1527:icmpge          1558
			i1 = a((View)E.get(j1), i1, ai, l1);
	//  808 1530:aload_0         
	//  809 1531:aload_0         
	//  810 1532:getfield        #109 <Field ArrayList E>
	//  811 1535:iload_3         
	//  812 1536:invokevirtual   #739 <Method Object ArrayList.get(int)>
	//  813 1539:checkcast       #319 <Class View>
	//  814 1542:iload_2         
	//  815 1543:aload           18
	//  816 1545:iload           5
	//  817 1547:invokespecial   #768 <Method int a(View, int, int[], int)>
	//  818 1550:istore_2        

	//  819 1551:iload_3         
	//  820 1552:iconst_1        
	//  821 1553:iadd            
	//  822 1554:istore_3        
	//* 823 1555:goto            1524
		E.clear();
	//  824 1558:aload_0         
	//  825 1559:getfield        #109 <Field ArrayList E>
	//  826 1562:invokevirtual   #743 <Method void ArrayList.clear()>
		return;
	//  827 1565:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		int ai[] = G;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int[] G>
	//    2    4:astore          12
		int k2;
		int l2;
		if(bd.a(((View) (this))))
	//*   3    6:aload_0         
	//*   4    7:invokestatic    #784 <Method boolean bd.a(View)>
	//*   5   10:ifeq            22
		{
			l2 = 1;
	//    6   13:iconst_1        
	//    7   14:istore          8
			k2 = 0;
	//    8   16:iconst_0        
	//    9   17:istore          7
		} else
	//*  10   19:goto            28
		{
			l2 = 0;
	//   11   22:iconst_0        
	//   12   23:istore          8
			k2 = 1;
	//   13   25:iconst_1        
	//   14   26:istore          7
		}
		int k1;
		int i2;
		int j2;
		if(a(((View) (h))))
	//*  15   28:aload_0         
	//*  16   29:aload_0         
	//*  17   30:getfield        #549 <Field ImageButton h>
	//*  18   33:invokespecial   #471 <Method boolean a(View)>
	//*  19   36:ifeq            110
		{
			a(((View) (h)), i1, 0, j1, 0, p);
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:getfield        #549 <Field ImageButton h>
	//   23   44:iload_1         
	//   24   45:iconst_0        
	//   25   46:iload_2         
	//   26   47:iconst_0        
	//   27   48:aload_0         
	//   28   49:getfield        #196 <Field int p>
	//   29   52:invokespecial   #786 <Method void a(View, int, int, int, int, int)>
			k1 = h.getMeasuredWidth() + b(((View) (h)));
	//   30   55:aload_0         
	//   31   56:getfield        #549 <Field ImageButton h>
	//   32   59:invokevirtual   #787 <Method int ImageButton.getMeasuredWidth()>
	//   33   62:aload_0         
	//   34   63:aload_0         
	//   35   64:getfield        #549 <Field ImageButton h>
	//   36   67:invokespecial   #789 <Method int b(View)>
	//   37   70:iadd            
	//   38   71:istore_3        
			j2 = Math.max(0, h.getMeasuredHeight() + c(((View) (h))));
	//   39   72:iconst_0        
	//   40   73:aload_0         
	//   41   74:getfield        #549 <Field ImageButton h>
	//   42   77:invokevirtual   #790 <Method int ImageButton.getMeasuredHeight()>
	//   43   80:aload_0         
	//   44   81:aload_0         
	//   45   82:getfield        #549 <Field ImageButton h>
	//   46   85:invokespecial   #792 <Method int c(View)>
	//   47   88:iadd            
	//   48   89:invokestatic    #351 <Method int Math.max(int, int)>
	//   49   92:istore          6
			i2 = View.combineMeasuredStates(0, h.getMeasuredState());
	//   50   94:iconst_0        
	//   51   95:aload_0         
	//   52   96:getfield        #549 <Field ImageButton h>
	//   53   99:invokevirtual   #795 <Method int ImageButton.getMeasuredState()>
	//   54  102:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//   55  105:istore          5
		} else
	//*  56  107:goto            118
		{
			k1 = 0;
	//   57  110:iconst_0        
	//   58  111:istore_3        
			j2 = 0;
	//   59  112:iconst_0        
	//   60  113:istore          6
			i2 = 0;
	//   61  115:iconst_0        
	//   62  116:istore          5
		}
		int i3 = k1;
	//   63  118:iload_3         
	//   64  119:istore          9
		int l1 = j2;
	//   65  121:iload           6
	//   66  123:istore          4
		k1 = i2;
	//   67  125:iload           5
	//   68  127:istore_3        
		if(a(((View) (a))))
	//*  69  128:aload_0         
	//*  70  129:aload_0         
	//*  71  130:getfield        #721 <Field ImageButton a>
	//*  72  133:invokespecial   #471 <Method boolean a(View)>
	//*  73  136:ifeq            209
		{
			a(((View) (a)), i1, 0, j1, 0, p);
	//   74  139:aload_0         
	//   75  140:aload_0         
	//   76  141:getfield        #721 <Field ImageButton a>
	//   77  144:iload_1         
	//   78  145:iconst_0        
	//   79  146:iload_2         
	//   80  147:iconst_0        
	//   81  148:aload_0         
	//   82  149:getfield        #196 <Field int p>
	//   83  152:invokespecial   #786 <Method void a(View, int, int, int, int, int)>
			i3 = a.getMeasuredWidth() + b(((View) (a)));
	//   84  155:aload_0         
	//   85  156:getfield        #721 <Field ImageButton a>
	//   86  159:invokevirtual   #787 <Method int ImageButton.getMeasuredWidth()>
	//   87  162:aload_0         
	//   88  163:aload_0         
	//   89  164:getfield        #721 <Field ImageButton a>
	//   90  167:invokespecial   #789 <Method int b(View)>
	//   91  170:iadd            
	//   92  171:istore          9
			l1 = Math.max(j2, a.getMeasuredHeight() + c(((View) (a))));
	//   93  173:iload           6
	//   94  175:aload_0         
	//   95  176:getfield        #721 <Field ImageButton a>
	//   96  179:invokevirtual   #790 <Method int ImageButton.getMeasuredHeight()>
	//   97  182:aload_0         
	//   98  183:aload_0         
	//   99  184:getfield        #721 <Field ImageButton a>
	//  100  187:invokespecial   #792 <Method int c(View)>
	//  101  190:iadd            
	//  102  191:invokestatic    #351 <Method int Math.max(int, int)>
	//  103  194:istore          4
			k1 = View.combineMeasuredStates(i2, a.getMeasuredState());
	//  104  196:iload           5
	//  105  198:aload_0         
	//  106  199:getfield        #721 <Field ImageButton a>
	//  107  202:invokevirtual   #795 <Method int ImageButton.getMeasuredState()>
	//  108  205:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  109  208:istore_3        
		}
		i2 = getCurrentContentInsetStart();
	//  110  209:aload_0         
	//  111  210:invokevirtual   #667 <Method int getCurrentContentInsetStart()>
	//  112  213:istore          5
		j2 = Math.max(i2, i3) + 0;
	//  113  215:iload           5
	//  114  217:iload           9
	//  115  219:invokestatic    #351 <Method int Math.max(int, int)>
	//  116  222:iconst_0        
	//  117  223:iadd            
	//  118  224:istore          6
		ai[l2] = Math.max(0, i2 - i3);
	//  119  226:aload           12
	//  120  228:iload           8
	//  121  230:iconst_0        
	//  122  231:iload           5
	//  123  233:iload           9
	//  124  235:isub            
	//  125  236:invokestatic    #351 <Method int Math.max(int, int)>
	//  126  239:iastore         
		if(a(((View) (e))))
	//* 127  240:aload_0         
	//* 128  241:aload_0         
	//* 129  242:getfield        #507 <Field ActionMenuView e>
	//* 130  245:invokespecial   #471 <Method boolean a(View)>
	//* 131  248:ifeq            324
		{
			a(((View) (e)), i1, j2, j1, 0, p);
	//  132  251:aload_0         
	//  133  252:aload_0         
	//  134  253:getfield        #507 <Field ActionMenuView e>
	//  135  256:iload_1         
	//  136  257:iload           6
	//  137  259:iload_2         
	//  138  260:iconst_0        
	//  139  261:aload_0         
	//  140  262:getfield        #196 <Field int p>
	//  141  265:invokespecial   #786 <Method void a(View, int, int, int, int, int)>
			i2 = e.getMeasuredWidth() + b(((View) (e)));
	//  142  268:aload_0         
	//  143  269:getfield        #507 <Field ActionMenuView e>
	//  144  272:invokevirtual   #799 <Method int ActionMenuView.getMeasuredWidth()>
	//  145  275:aload_0         
	//  146  276:aload_0         
	//  147  277:getfield        #507 <Field ActionMenuView e>
	//  148  280:invokespecial   #789 <Method int b(View)>
	//  149  283:iadd            
	//  150  284:istore          5
			l1 = Math.max(l1, e.getMeasuredHeight() + c(((View) (e))));
	//  151  286:iload           4
	//  152  288:aload_0         
	//  153  289:getfield        #507 <Field ActionMenuView e>
	//  154  292:invokevirtual   #800 <Method int ActionMenuView.getMeasuredHeight()>
	//  155  295:aload_0         
	//  156  296:aload_0         
	//  157  297:getfield        #507 <Field ActionMenuView e>
	//  158  300:invokespecial   #792 <Method int c(View)>
	//  159  303:iadd            
	//  160  304:invokestatic    #351 <Method int Math.max(int, int)>
	//  161  307:istore          4
			k1 = View.combineMeasuredStates(k1, e.getMeasuredState());
	//  162  309:iload_3         
	//  163  310:aload_0         
	//  164  311:getfield        #507 <Field ActionMenuView e>
	//  165  314:invokevirtual   #801 <Method int ActionMenuView.getMeasuredState()>
	//  166  317:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  167  320:istore_3        
		} else
	//* 168  321:goto            327
		{
			i2 = 0;
	//  169  324:iconst_0        
	//  170  325:istore          5
		}
		i3 = getCurrentContentInsetEnd();
	//  171  327:aload_0         
	//  172  328:invokevirtual   #664 <Method int getCurrentContentInsetEnd()>
	//  173  331:istore          9
		l2 = j2 + Math.max(i3, i2);
	//  174  333:iload           6
	//  175  335:iload           9
	//  176  337:iload           5
	//  177  339:invokestatic    #351 <Method int Math.max(int, int)>
	//  178  342:iadd            
	//  179  343:istore          8
		ai[k2] = Math.max(0, i3 - i2);
	//  180  345:aload           12
	//  181  347:iload           7
	//  182  349:iconst_0        
	//  183  350:iload           9
	//  184  352:iload           5
	//  185  354:isub            
	//  186  355:invokestatic    #351 <Method int Math.max(int, int)>
	//  187  358:iastore         
		k2 = l2;
	//  188  359:iload           8
	//  189  361:istore          7
		j2 = l1;
	//  190  363:iload           4
	//  191  365:istore          6
		i2 = k1;
	//  192  367:iload_3         
	//  193  368:istore          5
		if(a(b))
	//* 194  370:aload_0         
	//* 195  371:aload_0         
	//* 196  372:getfield        #436 <Field View b>
	//* 197  375:invokespecial   #471 <Method boolean a(View)>
	//* 198  378:ifeq            437
		{
			k2 = l2 + a(b, i1, l2, j1, 0, ai);
	//  199  381:iload           8
	//  200  383:aload_0         
	//  201  384:aload_0         
	//  202  385:getfield        #436 <Field View b>
	//  203  388:iload_1         
	//  204  389:iload           8
	//  205  391:iload_2         
	//  206  392:iconst_0        
	//  207  393:aload           12
	//  208  395:invokespecial   #803 <Method int a(View, int, int, int, int, int[])>
	//  209  398:iadd            
	//  210  399:istore          7
			j2 = Math.max(l1, b.getMeasuredHeight() + c(b));
	//  211  401:iload           4
	//  212  403:aload_0         
	//  213  404:getfield        #436 <Field View b>
	//  214  407:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//  215  410:aload_0         
	//  216  411:aload_0         
	//  217  412:getfield        #436 <Field View b>
	//  218  415:invokespecial   #792 <Method int c(View)>
	//  219  418:iadd            
	//  220  419:invokestatic    #351 <Method int Math.max(int, int)>
	//  221  422:istore          6
			i2 = View.combineMeasuredStates(k1, b.getMeasuredState());
	//  222  424:iload_3         
	//  223  425:aload_0         
	//  224  426:getfield        #436 <Field View b>
	//  225  429:invokevirtual   #804 <Method int View.getMeasuredState()>
	//  226  432:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  227  435:istore          5
		}
		l1 = k2;
	//  228  437:iload           7
	//  229  439:istore          4
		l2 = j2;
	//  230  441:iload           6
	//  231  443:istore          8
		k1 = i2;
	//  232  445:iload           5
	//  233  447:istore_3        
		if(a(((View) (i))))
	//* 234  448:aload_0         
	//* 235  449:aload_0         
	//* 236  450:getfield        #500 <Field ImageView i>
	//* 237  453:invokespecial   #471 <Method boolean a(View)>
	//* 238  456:ifeq            515
		{
			l1 = k2 + a(((View) (i)), i1, k2, j1, 0, ai);
	//  239  459:iload           7
	//  240  461:aload_0         
	//  241  462:aload_0         
	//  242  463:getfield        #500 <Field ImageView i>
	//  243  466:iload_1         
	//  244  467:iload           7
	//  245  469:iload_2         
	//  246  470:iconst_0        
	//  247  471:aload           12
	//  248  473:invokespecial   #803 <Method int a(View, int, int, int, int, int[])>
	//  249  476:iadd            
	//  250  477:istore          4
			l2 = Math.max(j2, i.getMeasuredHeight() + c(((View) (i))));
	//  251  479:iload           6
	//  252  481:aload_0         
	//  253  482:getfield        #500 <Field ImageView i>
	//  254  485:invokevirtual   #805 <Method int ImageView.getMeasuredHeight()>
	//  255  488:aload_0         
	//  256  489:aload_0         
	//  257  490:getfield        #500 <Field ImageView i>
	//  258  493:invokespecial   #792 <Method int c(View)>
	//  259  496:iadd            
	//  260  497:invokestatic    #351 <Method int Math.max(int, int)>
	//  261  500:istore          8
			k1 = View.combineMeasuredStates(i2, i.getMeasuredState());
	//  262  502:iload           5
	//  263  504:aload_0         
	//  264  505:getfield        #500 <Field ImageView i>
	//  265  508:invokevirtual   #806 <Method int ImageView.getMeasuredState()>
	//  266  511:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  267  514:istore_3        
		}
		int j3 = getChildCount();
	//  268  515:aload_0         
	//  269  516:invokevirtual   #457 <Method int getChildCount()>
	//  270  519:istore          10
		k2 = l2;
	//  271  521:iload           8
	//  272  523:istore          7
		i2 = 0;
	//  273  525:iconst_0        
	//  274  526:istore          5
		j2 = l1;
	//  275  528:iload           4
	//  276  530:istore          6
		for(l1 = i2; l1 < j3;)
	//* 277  532:iload           5
	//* 278  534:istore          4
	//* 279  536:iload           4
	//* 280  538:iload           10
	//* 281  540:icmpge          667
		{
			View view = getChildAt(l1);
	//  282  543:aload_0         
	//  283  544:iload           4
	//  284  546:invokevirtual   #468 <Method View getChildAt(int)>
	//  285  549:astore          13
			i3 = j2;
	//  286  551:iload           6
	//  287  553:istore          9
			l2 = k1;
	//  288  555:iload_3         
	//  289  556:istore          8
			i2 = k2;
	//  290  558:iload           7
	//  291  560:istore          5
			if(((LayoutParams)view.getLayoutParams()).b == 0)
	//* 292  562:aload           13
	//* 293  564:invokevirtual   #323 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 294  567:checkcast       #12  <Class Toolbar$LayoutParams>
	//* 295  570:getfield        #434 <Field int android.support.v7.widget.Toolbar$LayoutParams.b>
	//* 296  573:ifne            647
				if(!a(view))
	//* 297  576:aload_0         
	//* 298  577:aload           13
	//* 299  579:invokespecial   #471 <Method boolean a(View)>
	//* 300  582:ifne            599
				{
					i3 = j2;
	//  301  585:iload           6
	//  302  587:istore          9
					l2 = k1;
	//  303  589:iload_3         
	//  304  590:istore          8
					i2 = k2;
	//  305  592:iload           7
	//  306  594:istore          5
				} else
	//* 307  596:goto            647
				{
					i3 = j2 + a(view, i1, j2, j1, 0, ai);
	//  308  599:iload           6
	//  309  601:aload_0         
	//  310  602:aload           13
	//  311  604:iload_1         
	//  312  605:iload           6
	//  313  607:iload_2         
	//  314  608:iconst_0        
	//  315  609:aload           12
	//  316  611:invokespecial   #803 <Method int a(View, int, int, int, int, int[])>
	//  317  614:iadd            
	//  318  615:istore          9
					i2 = Math.max(k2, view.getMeasuredHeight() + c(view));
	//  319  617:iload           7
	//  320  619:aload           13
	//  321  621:invokevirtual   #327 <Method int View.getMeasuredHeight()>
	//  322  624:aload_0         
	//  323  625:aload           13
	//  324  627:invokespecial   #792 <Method int c(View)>
	//  325  630:iadd            
	//  326  631:invokestatic    #351 <Method int Math.max(int, int)>
	//  327  634:istore          5
					l2 = View.combineMeasuredStates(k1, view.getMeasuredState());
	//  328  636:iload_3         
	//  329  637:aload           13
	//  330  639:invokevirtual   #804 <Method int View.getMeasuredState()>
	//  331  642:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  332  645:istore          8
				}
			l1++;
	//  333  647:iload           4
	//  334  649:iconst_1        
	//  335  650:iadd            
	//  336  651:istore          4
			j2 = i3;
	//  337  653:iload           9
	//  338  655:istore          6
			k1 = l2;
	//  339  657:iload           8
	//  340  659:istore_3        
			k2 = i2;
	//  341  660:iload           5
	//  342  662:istore          7
		}

	//* 343  664:goto            536
		l2 = s + t;
	//  344  667:aload_0         
	//  345  668:getfield        #173 <Field int s>
	//  346  671:aload_0         
	//  347  672:getfield        #171 <Field int t>
	//  348  675:iadd            
	//  349  676:istore          8
		i3 = q + r;
	//  350  678:aload_0         
	//  351  679:getfield        #177 <Field int q>
	//  352  682:aload_0         
	//  353  683:getfield        #175 <Field int r>
	//  354  686:iadd            
	//  355  687:istore          9
		if(a(((View) (f))))
	//* 356  689:aload_0         
	//* 357  690:aload_0         
	//* 358  691:getfield        #588 <Field TextView f>
	//* 359  694:invokespecial   #471 <Method boolean a(View)>
	//* 360  697:ifeq            787
		{
			a(((View) (f)), i1, j2 + i3, j1, l2, ai);
	//  361  700:aload_0         
	//  362  701:aload_0         
	//  363  702:getfield        #588 <Field TextView f>
	//  364  705:iload_1         
	//  365  706:iload           6
	//  366  708:iload           9
	//  367  710:iadd            
	//  368  711:iload_2         
	//  369  712:iload           8
	//  370  714:aload           12
	//  371  716:invokespecial   #803 <Method int a(View, int, int, int, int, int[])>
	//  372  719:pop             
			l1 = f.getMeasuredWidth();
	//  373  720:aload_0         
	//  374  721:getfield        #588 <Field TextView f>
	//  375  724:invokevirtual   #775 <Method int TextView.getMeasuredWidth()>
	//  376  727:istore          4
			j3 = b(((View) (f)));
	//  377  729:aload_0         
	//  378  730:aload_0         
	//  379  731:getfield        #588 <Field TextView f>
	//  380  734:invokespecial   #789 <Method int b(View)>
	//  381  737:istore          10
			i2 = f.getMeasuredHeight();
	//  382  739:aload_0         
	//  383  740:getfield        #588 <Field TextView f>
	//  384  743:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  385  746:istore          5
			int k3 = c(((View) (f)));
	//  386  748:aload_0         
	//  387  749:aload_0         
	//  388  750:getfield        #588 <Field TextView f>
	//  389  753:invokespecial   #792 <Method int c(View)>
	//  390  756:istore          11
			k1 = View.combineMeasuredStates(k1, f.getMeasuredState());
	//  391  758:iload_3         
	//  392  759:aload_0         
	//  393  760:getfield        #588 <Field TextView f>
	//  394  763:invokevirtual   #807 <Method int TextView.getMeasuredState()>
	//  395  766:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  396  769:istore_3        
			i2 += k3;
	//  397  770:iload           5
	//  398  772:iload           11
	//  399  774:iadd            
	//  400  775:istore          5
			l1 += j3;
	//  401  777:iload           4
	//  402  779:iload           10
	//  403  781:iadd            
	//  404  782:istore          4
		} else
	//* 405  784:goto            793
		{
			l1 = 0;
	//  406  787:iconst_0        
	//  407  788:istore          4
			i2 = 0;
	//  408  790:iconst_0        
	//  409  791:istore          5
		}
		if(a(((View) (g))))
	//* 410  793:aload_0         
	//* 411  794:aload_0         
	//* 412  795:getfield        #619 <Field TextView g>
	//* 413  798:invokespecial   #471 <Method boolean a(View)>
	//* 414  801:ifeq            869
		{
			l1 = Math.max(l1, a(((View) (g)), i1, j2 + i3, j1, i2 + l2, ai));
	//  415  804:iload           4
	//  416  806:aload_0         
	//  417  807:aload_0         
	//  418  808:getfield        #619 <Field TextView g>
	//  419  811:iload_1         
	//  420  812:iload           6
	//  421  814:iload           9
	//  422  816:iadd            
	//  423  817:iload_2         
	//  424  818:iload           5
	//  425  820:iload           8
	//  426  822:iadd            
	//  427  823:aload           12
	//  428  825:invokespecial   #803 <Method int a(View, int, int, int, int, int[])>
	//  429  828:invokestatic    #351 <Method int Math.max(int, int)>
	//  430  831:istore          4
			i2 += g.getMeasuredHeight() + c(((View) (g)));
	//  431  833:iload           5
	//  432  835:aload_0         
	//  433  836:getfield        #619 <Field TextView g>
	//  434  839:invokevirtual   #774 <Method int TextView.getMeasuredHeight()>
	//  435  842:aload_0         
	//  436  843:aload_0         
	//  437  844:getfield        #619 <Field TextView g>
	//  438  847:invokespecial   #792 <Method int c(View)>
	//  439  850:iadd            
	//  440  851:iadd            
	//  441  852:istore          5
			k1 = View.combineMeasuredStates(k1, g.getMeasuredState());
	//  442  854:iload_3         
	//  443  855:aload_0         
	//  444  856:getfield        #619 <Field TextView g>
	//  445  859:invokevirtual   #807 <Method int TextView.getMeasuredState()>
	//  446  862:invokestatic    #798 <Method int View.combineMeasuredStates(int, int)>
	//  447  865:istore_3        
		}
	//* 448  866:goto            869
		i2 = Math.max(k2, i2);
	//  449  869:iload           7
	//  450  871:iload           5
	//  451  873:invokestatic    #351 <Method int Math.max(int, int)>
	//  452  876:istore          5
		i3 = getPaddingLeft();
	//  453  878:aload_0         
	//  454  879:invokevirtual   #363 <Method int getPaddingLeft()>
	//  455  882:istore          9
		j3 = getPaddingRight();
	//  456  884:aload_0         
	//  457  885:invokevirtual   #366 <Method int getPaddingRight()>
	//  458  888:istore          10
		k2 = getPaddingTop();
	//  459  890:aload_0         
	//  460  891:invokevirtual   #334 <Method int getPaddingTop()>
	//  461  894:istore          7
		l2 = getPaddingBottom();
	//  462  896:aload_0         
	//  463  897:invokevirtual   #337 <Method int getPaddingBottom()>
	//  464  900:istore          8
		l1 = View.resolveSizeAndState(Math.max(j2 + l1 + (i3 + j3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
	//  465  902:iload           6
	//  466  904:iload           4
	//  467  906:iadd            
	//  468  907:iload           9
	//  469  909:iload           10
	//  470  911:iadd            
	//  471  912:iadd            
	//  472  913:aload_0         
	//  473  914:invokevirtual   #810 <Method int getSuggestedMinimumWidth()>
	//  474  917:invokestatic    #351 <Method int Math.max(int, int)>
	//  475  920:iload_1         
	//  476  921:ldc2            #811 <Int 0xff000000>
	//  477  924:iload_3         
	//  478  925:iand            
	//  479  926:invokestatic    #814 <Method int View.resolveSizeAndState(int, int, int)>
	//  480  929:istore          4
		i1 = View.resolveSizeAndState(Math.max(i2 + (k2 + l2), getSuggestedMinimumHeight()), j1, k1 << 16);
	//  481  931:iload           5
	//  482  933:iload           7
	//  483  935:iload           8
	//  484  937:iadd            
	//  485  938:iadd            
	//  486  939:aload_0         
	//  487  940:invokevirtual   #817 <Method int getSuggestedMinimumHeight()>
	//  488  943:invokestatic    #351 <Method int Math.max(int, int)>
	//  489  946:iload_2         
	//  490  947:iload_3         
	//  491  948:bipush          16
	//  492  950:ishl            
	//  493  951:invokestatic    #814 <Method int View.resolveSizeAndState(int, int, int)>
	//  494  954:istore_1        
		if(r())
	//* 495  955:aload_0         
	//* 496  956:invokespecial   #819 <Method boolean r()>
	//* 497  959:ifeq            964
			i1 = 0;
	//  498  962:iconst_0        
	//  499  963:istore_1        
		setMeasuredDimension(l1, i1);
	//  500  964:aload_0         
	//  501  965:iload           4
	//  502  967:iload_1         
	//  503  968:invokevirtual   #822 <Method void setMeasuredDimension(int, int)>
	//  504  971:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class Toolbar$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #826 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		SavedState savedstate = (SavedState)parcelable;
	//    7   13:aload_1         
	//    8   14:checkcast       #15  <Class Toolbar$SavedState>
	//    9   17:astore_2        
		super.onRestoreInstanceState(savedstate.a());
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #829 <Method Parcelable Toolbar$SavedState.a()>
	//   13   23:invokespecial   #826 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(e != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #507 <Field ActionMenuView e>
	//*  16   30:ifnull          44
			parcelable = ((Parcelable) (e.d()));
	//   17   33:aload_0         
	//   18   34:getfield        #507 <Field ActionMenuView e>
	//   19   37:invokevirtual   #512 <Method h android.support.v7.widget.ActionMenuView.d()>
	//   20   40:astore_1        
		else
	//*  21   41:goto            46
			parcelable = null;
	//   22   44:aconst_null     
	//   23   45:astore_1        
		if(savedstate.a != 0 && K != null && parcelable != null)
	//*  24   46:aload_2         
	//*  25   47:getfield        #830 <Field int Toolbar$SavedState.a>
	//*  26   50:ifeq            86
	//*  27   53:aload_0         
	//*  28   54:getfield        #520 <Field Toolbar$a K>
	//*  29   57:ifnull          86
	//*  30   60:aload_1         
	//*  31   61:ifnull          86
		{
			parcelable = ((Parcelable) (((Menu) (parcelable)).findItem(savedstate.a)));
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:getfield        #830 <Field int Toolbar$SavedState.a>
	//   35   69:invokeinterface #836 <Method MenuItem Menu.findItem(int)>
	//   36   74:astore_1        
			if(parcelable != null)
	//*  37   75:aload_1         
	//*  38   76:ifnull          86
				((MenuItem) (parcelable)).expandActionView();
	//   39   79:aload_1         
	//   40   80:invokeinterface #841 <Method boolean MenuItem.expandActionView()>
	//   41   85:pop             
		}
		if(savedstate.b)
	//*  42   86:aload_2         
	//*  43   87:getfield        #843 <Field boolean android.support.v7.widget.Toolbar$SavedState.b>
	//*  44   90:ifeq            97
			q();
	//   45   93:aload_0         
	//   46   94:invokespecial   #845 <Method void q()>
	//   47   97:return          
	}

	public void onRtlPropertiesChanged(int i1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #851 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			super.onRtlPropertiesChanged(i1);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #853 <Method void ViewGroup.onRtlPropertiesChanged(int)>
		s();
	//    6   13:aload_0         
	//    7   14:invokespecial   #211 <Method void s()>
		am am1 = u;
	//    8   17:aload_0         
	//    9   18:getfield        #213 <Field am u>
	//   10   21:astore_3        
		boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_2        
		if(i1 != 1)
	//*  13   24:iload_1         
	//*  14   25:iconst_1        
	//*  15   26:icmpne          32
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		am1.a(flag);
	//   19   34:aload_3         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #854 <Method void am.a(boolean)>
	//   22   39:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #15  <Class Toolbar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #857 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #859 <Method void Toolbar$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(K != null && K.b != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #520 <Field Toolbar$a K>
	//*   8   16:ifnull          43
	//*   9   19:aload_0         
	//*  10   20:getfield        #520 <Field Toolbar$a K>
	//*  11   23:getfield        #633 <Field j android.support.v7.widget.Toolbar$a.b>
	//*  12   26:ifnull          43
			savedstate.a = K.b.getItemId();
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #520 <Field Toolbar$a K>
	//   16   34:getfield        #633 <Field j android.support.v7.widget.Toolbar$a.b>
	//   17   37:invokevirtual   #862 <Method int j.getItemId()>
	//   18   40:putfield        #830 <Field int Toolbar$SavedState.a>
		savedstate.b = b();
	//   19   43:aload_1         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #864 <Method boolean b()>
	//   22   48:putfield        #843 <Field boolean android.support.v7.widget.Toolbar$SavedState.b>
		return ((Parcelable) (savedstate));
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #753 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i1 == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			C = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #867 <Field boolean C>
		if(!C)
	//*   8   14:aload_0         
	//*   9   15:getfield        #867 <Field boolean C>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #869 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i1 == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				C = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #867 <Field boolean C>
		}
		if(i1 == 1 || i1 == 3)
	//*  22   40:iload_2         
	//*  23   41:iconst_1        
	//*  24   42:icmpeq          50
	//*  25   45:iload_2         
	//*  26   46:iconst_3        
	//*  27   47:icmpne          55
			C = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #867 <Field boolean C>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	public void setCollapsible(boolean flag)
	{
		N = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #569 <Field boolean N>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #873 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setContentInsetEndWithActions(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j1 = 0x80000000;
	//    4    6:ldc1            #200 <Int 0x80000000>
	//    5    8:istore_2        
		if(j1 != w)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #230 <Field int w>
	//*   9   14:icmpeq          33
		{
			w = j1;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #230 <Field int w>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #672 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #873 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setContentInsetStartWithNavigation(int i1)
	{
		int j1 = i1;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i1 < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j1 = 0x80000000;
	//    4    6:ldc1            #200 <Int 0x80000000>
	//    5    8:istore_2        
		if(j1 != v)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #225 <Field int v>
	//*   9   14:icmpeq          33
		{
			v = j1;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #225 <Field int v>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #672 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #873 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setLogo(int i1)
	{
		setLogo(android.support.v7.c.a.b.b(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #880 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #293 <Method void setLogo(Drawable)>
	//    6   12:return          
	}

	public void setLogo(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			m();
	//    2    4:aload_0         
	//    3    5:invokespecial   #882 <Method void m()>
			if(!d(((View) (i))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #500 <Field ImageView i>
	//*   7   13:invokespecial   #884 <Method boolean d(View)>
	//*   8   16:ifne            69
				a(((View) (i)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #500 <Field ImageView i>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #547 <Method void a(View, boolean)>
		} else
	//*  14   28:goto            69
		if(i != null && d(((View) (i))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #500 <Field ImageView i>
	//*  17   35:ifnull          69
	//*  18   38:aload_0         
	//*  19   39:aload_0         
	//*  20   40:getfield        #500 <Field ImageView i>
	//*  21   43:invokespecial   #884 <Method boolean d(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (i)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #500 <Field ImageView i>
	//   26   54:invokevirtual   #887 <Method void removeView(View)>
			F.remove(((Object) (i)));
	//   27   57:aload_0         
	//   28   58:getfield        #111 <Field ArrayList F>
	//   29   61:aload_0         
	//   30   62:getfield        #500 <Field ImageView i>
	//   31   65:invokevirtual   #890 <Method boolean ArrayList.remove(Object)>
	//   32   68:pop             
		}
		if(i != null)
	//*  33   69:aload_0         
	//*  34   70:getfield        #500 <Field ImageView i>
	//*  35   73:ifnull          84
			i.setImageDrawable(drawable);
	//   36   76:aload_0         
	//   37   77:getfield        #500 <Field ImageView i>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #891 <Method void ImageView.setImageDrawable(Drawable)>
	//   40   84:return          
	}

	public void setLogoDescription(int i1)
	{
		setLogoDescription(getContext().getText(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #896 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #299 <Method void setLogoDescription(CharSequence)>
	//    6   12:return          
	}

	public void setLogoDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			m();
	//    3    7:aload_0         
	//    4    8:invokespecial   #882 <Method void m()>
		if(i != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #500 <Field ImageView i>
	//*   7   15:ifnull          26
			i.setContentDescription(charsequence);
	//    8   18:aload_0         
	//    9   19:getfield        #500 <Field ImageView i>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #897 <Method void ImageView.setContentDescription(CharSequence)>
	//   12   26:return          
	}

	public void setNavigationContentDescription(int i1)
	{
		CharSequence charsequence;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			charsequence = getContext().getText(i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #125 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #896 <Method CharSequence Context.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setNavigationContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #287 <Method void setNavigationContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			p();
	//    3    7:aload_0         
	//    4    8:invokespecial   #899 <Method void p()>
		if(h != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #549 <Field ImageButton h>
	//*   7   15:ifnull          26
			h.setContentDescription(charsequence);
	//    8   18:aload_0         
	//    9   19:getfield        #549 <Field ImageButton h>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #727 <Method void ImageButton.setContentDescription(CharSequence)>
	//   12   26:return          
	}

	public void setNavigationIcon(int i1)
	{
		setNavigationIcon(android.support.v7.c.a.b.b(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #880 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #281 <Method void setNavigationIcon(Drawable)>
	//    6   12:return          
	}

	public void setNavigationIcon(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			p();
	//    2    4:aload_0         
	//    3    5:invokespecial   #899 <Method void p()>
			if(!d(((View) (h))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #549 <Field ImageButton h>
	//*   7   13:invokespecial   #884 <Method boolean d(View)>
	//*   8   16:ifne            69
				a(((View) (h)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #549 <Field ImageButton h>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #547 <Method void a(View, boolean)>
		} else
	//*  14   28:goto            69
		if(h != null && d(((View) (h))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #549 <Field ImageButton h>
	//*  17   35:ifnull          69
	//*  18   38:aload_0         
	//*  19   39:aload_0         
	//*  20   40:getfield        #549 <Field ImageButton h>
	//*  21   43:invokespecial   #884 <Method boolean d(View)>
	//*  22   46:ifeq            69
		{
			removeView(((View) (h)));
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #549 <Field ImageButton h>
	//   26   54:invokevirtual   #887 <Method void removeView(View)>
			F.remove(((Object) (h)));
	//   27   57:aload_0         
	//   28   58:getfield        #111 <Field ArrayList F>
	//   29   61:aload_0         
	//   30   62:getfield        #549 <Field ImageButton h>
	//   31   65:invokevirtual   #890 <Method boolean ArrayList.remove(Object)>
	//   32   68:pop             
		}
		if(h != null)
	//*  33   69:aload_0         
	//*  34   70:getfield        #549 <Field ImageButton h>
	//*  35   73:ifnull          84
			h.setImageDrawable(drawable);
	//   36   76:aload_0         
	//   37   77:getfield        #549 <Field ImageButton h>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #724 <Method void ImageButton.setImageDrawable(Drawable)>
	//   40   84:return          
	}

	public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #899 <Method void p()>
		h.setOnClickListener(onclicklistener);
	//    2    4:aload_0         
	//    3    5:getfield        #549 <Field ImageButton h>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #732 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
	//    6   12:return          
	}

	public void setOnMenuItemClickListener(b b1)
	{
		d = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #903 <Field Toolbar$b d>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #685 <Method void n()>
		e.setOverflowIcon(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #507 <Field ActionMenuView e>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #906 <Method void ActionMenuView.setOverflowIcon(Drawable)>
	//    6   12:return          
	}

	public void setPopupTheme(int i1)
	{
		if(m != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #531 <Field int m>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			m = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #531 <Field int m>
			if(i1 == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				l = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #125 <Method Context getContext()>
	//   12   22:putfield        #267 <Field Context l>
				return;
	//   13   25:return          
			}
			l = ((Context) (new ContextThemeWrapper(getContext(), i1)));
	//   14   26:aload_0         
	//   15   27:new             #908 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #125 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #910 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #267 <Field Context l>
		}
	//   22   42:return          
	}

	public void setSubtitle(int i1)
	{
		setSubtitle(getContext().getText(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #896 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #265 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            108
		{
			if(g == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #619 <Field TextView g>
	//*   5   11:ifnonnull       85
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #125 <Method Context getContext()>
	//    8   18:astore_2        
				g = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #912 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #913 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #619 <Field TextView g>
				g.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #619 <Field TextView g>
	//   17   35:invokevirtual   #916 <Method void TextView.setSingleLine()>
				g.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #619 <Field TextView g>
	//   20   42:getstatic       #922 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #926 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				if(o != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #148 <Field int o>
	//*  24   52:ifeq            67
					g.setTextAppearance(context, o);
	//   25   55:aload_0         
	//   26   56:getfield        #619 <Field TextView g>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #148 <Field int o>
	//   30   64:invokevirtual   #593 <Method void TextView.setTextAppearance(Context, int)>
				if(B != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #928 <Field int B>
	//*  33   71:ifeq            85
					g.setTextColor(B);
	//   34   74:aload_0         
	//   35   75:getfield        #619 <Field TextView g>
	//   36   78:aload_0         
	//   37   79:getfield        #928 <Field int B>
	//   38   82:invokevirtual   #931 <Method void TextView.setTextColor(int)>
			}
			if(!d(((View) (g))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #619 <Field TextView g>
	//*  42   90:invokespecial   #884 <Method boolean d(View)>
	//*  43   93:ifne            146
				a(((View) (g)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #619 <Field TextView g>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #547 <Method void a(View, boolean)>
		} else
	//*  49  105:goto            146
		if(g != null && d(((View) (g))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #619 <Field TextView g>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #619 <Field TextView g>
	//*  56  120:invokespecial   #884 <Method boolean d(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (g)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #619 <Field TextView g>
	//   61  131:invokevirtual   #887 <Method void removeView(View)>
			F.remove(((Object) (g)));
	//   62  134:aload_0         
	//   63  135:getfield        #111 <Field ArrayList F>
	//   64  138:aload_0         
	//   65  139:getfield        #619 <Field TextView g>
	//   66  142:invokevirtual   #890 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(g != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #619 <Field TextView g>
	//*  70  150:ifnull          161
			g.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #619 <Field TextView g>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #934 <Method void TextView.setText(CharSequence)>
		z = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #698 <Field CharSequence z>
	//   78  166:return          
	}

	public void setSubtitleTextColor(int i1)
	{
		B = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #928 <Field int B>
		if(g != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #619 <Field TextView g>
	//*   5    9:ifnull          20
			g.setTextColor(i1);
	//    6   12:aload_0         
	//    7   13:getfield        #619 <Field TextView g>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #931 <Method void TextView.setTextColor(int)>
	//   10   20:return          
	}

	public void setTitle(int i1)
	{
		setTitle(getContext().getText(i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #896 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #259 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            108
		{
			if(f == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #588 <Field TextView f>
	//*   5   11:ifnonnull       85
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #125 <Method Context getContext()>
	//    8   18:astore_2        
				f = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #912 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_2         
	//   13   25:invokespecial   #913 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #588 <Field TextView f>
				f.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #588 <Field TextView f>
	//   17   35:invokevirtual   #916 <Method void TextView.setSingleLine()>
				f.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #588 <Field TextView f>
	//   20   42:getstatic       #922 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #926 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				if(n != 0)
	//*  22   48:aload_0         
	//*  23   49:getfield        #143 <Field int n>
	//*  24   52:ifeq            67
					f.setTextAppearance(context, n);
	//   25   55:aload_0         
	//   26   56:getfield        #588 <Field TextView f>
	//   27   59:aload_2         
	//   28   60:aload_0         
	//   29   61:getfield        #143 <Field int n>
	//   30   64:invokevirtual   #593 <Method void TextView.setTextAppearance(Context, int)>
				if(A != 0)
	//*  31   67:aload_0         
	//*  32   68:getfield        #936 <Field int A>
	//*  33   71:ifeq            85
					f.setTextColor(A);
	//   34   74:aload_0         
	//   35   75:getfield        #588 <Field TextView f>
	//   36   78:aload_0         
	//   37   79:getfield        #936 <Field int A>
	//   38   82:invokevirtual   #931 <Method void TextView.setTextColor(int)>
			}
			if(!d(((View) (f))))
	//*  39   85:aload_0         
	//*  40   86:aload_0         
	//*  41   87:getfield        #588 <Field TextView f>
	//*  42   90:invokespecial   #884 <Method boolean d(View)>
	//*  43   93:ifne            146
				a(((View) (f)), true);
	//   44   96:aload_0         
	//   45   97:aload_0         
	//   46   98:getfield        #588 <Field TextView f>
	//   47  101:iconst_1        
	//   48  102:invokespecial   #547 <Method void a(View, boolean)>
		} else
	//*  49  105:goto            146
		if(f != null && d(((View) (f))))
	//*  50  108:aload_0         
	//*  51  109:getfield        #588 <Field TextView f>
	//*  52  112:ifnull          146
	//*  53  115:aload_0         
	//*  54  116:aload_0         
	//*  55  117:getfield        #588 <Field TextView f>
	//*  56  120:invokespecial   #884 <Method boolean d(View)>
	//*  57  123:ifeq            146
		{
			removeView(((View) (f)));
	//   58  126:aload_0         
	//   59  127:aload_0         
	//   60  128:getfield        #588 <Field TextView f>
	//   61  131:invokevirtual   #887 <Method void removeView(View)>
			F.remove(((Object) (f)));
	//   62  134:aload_0         
	//   63  135:getfield        #111 <Field ArrayList F>
	//   64  138:aload_0         
	//   65  139:getfield        #588 <Field TextView f>
	//   66  142:invokevirtual   #890 <Method boolean ArrayList.remove(Object)>
	//   67  145:pop             
		}
		if(f != null)
	//*  68  146:aload_0         
	//*  69  147:getfield        #588 <Field TextView f>
	//*  70  150:ifnull          161
			f.setText(charsequence);
	//   71  153:aload_0         
	//   72  154:getfield        #588 <Field TextView f>
	//   73  157:aload_1         
	//   74  158:invokevirtual   #934 <Method void TextView.setText(CharSequence)>
		y = charsequence;
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:putfield        #701 <Field CharSequence y>
	//   78  166:return          
	}

	public void setTitleMarginBottom(int i1)
	{
		t = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #171 <Field int t>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #873 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginEnd(int i1)
	{
		r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #175 <Field int r>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #873 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginStart(int i1)
	{
		q = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #177 <Field int q>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #873 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginTop(int i1)
	{
		s = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #173 <Field int s>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #873 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleTextColor(int i1)
	{
		A = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #936 <Field int A>
		if(f != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #588 <Field TextView f>
	//*   5    9:ifnull          20
			f.setTextColor(i1);
	//    6   12:aload_0         
	//    7   13:getfield        #588 <Field TextView f>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #931 <Method void TextView.setTextColor(int)>
	//   10   20:return          
	}

	private int A;
	private int B;
	private boolean C;
	private boolean D;
	private final ArrayList E;
	private final ArrayList F;
	private final int G[];
	private final ActionMenuView.d H;
	private aw I;
	private ActionMenuPresenter J;
	private a K;
	private android.support.v7.view.menu.o.a L;
	private android.support.v7.view.menu.h.a M;
	private boolean N;
	private final Runnable O;
	ImageButton a;
	View b;
	int c;
	b d;
	private ActionMenuView e;
	private TextView f;
	private TextView g;
	private ImageButton h;
	private ImageView i;
	private Drawable j;
	private CharSequence k;
	private Context l;
	private int m;
	private int n;
	private int o;
	private int p;
	private int q;
	private int r;
	private int s;
	private int t;
	private am u;
	private int v;
	private int w;
	private int x;
	private CharSequence y;
	private CharSequence z;
}
