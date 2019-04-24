// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.*;
import android.support.v7.view.d;
import android.support.v7.view.menu.*;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

protected static final class AppCompatDelegateImplV9$PanelFeatureState
{
	private static class SavedState
		implements Parcelable
	{

		static SavedState a(Parcel parcel, ClassLoader classloader)
		{
			SavedState savedstate = new SavedState();
		//    0    0:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
		//    3    7:astore          4
			savedstate.a = parcel.readInt();
		//    4    9:aload           4
		//    5   11:aload_0         
		//    6   12:invokevirtual   #40  <Method int Parcel.readInt()>
		//    7   15:putfield        #42  <Field int a>
			int i1 = parcel.readInt();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #40  <Method int Parcel.readInt()>
		//   10   22:istore_2        
			boolean flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_3        
			if(i1 != 1)
		//*  13   25:iload_2         
		//*  14   26:iconst_1        
		//*  15   27:icmpne          33
		//*  16   30:goto            35
				flag = false;
		//   17   33:iconst_0        
		//   18   34:istore_3        
			savedstate.b = flag;
		//   19   35:aload           4
		//   20   37:iload_3         
		//   21   38:putfield        #44  <Field boolean b>
			if(savedstate.b)
		//*  22   41:aload           4
		//*  23   43:getfield        #44  <Field boolean b>
		//*  24   46:ifeq            59
				savedstate.c = parcel.readBundle(classloader);
		//   25   49:aload           4
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:invokevirtual   #48  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   29   56:putfield        #50  <Field Bundle c>
			return savedstate;
		//   30   59:aload           4
		//   31   61:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #55  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #57  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #62  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return SavedState.a(parcel, ((ClassLoader) (null)));
			//    0    0:aload_1         
			//    1    1:aconst_null     
			//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return SavedState.a(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
			//    3    5:areturn         
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
			//    2    2:invokevirtual   #30  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #36  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		boolean b;
		Bundle c;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
		//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}
	}


	p a(android.support.v7.view.menu.o.a a1)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field h j>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(k == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #54  <Field f k>
	//*   7   13:ifnonnull       53
		{
			k = new f(l, android.support.v7.a.a.g.abc_list_menu_item_layout);
	//    8   16:aload_0         
	//    9   17:new             #56  <Class f>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #58  <Field Context l>
	//   13   25:getstatic       #63  <Field int android.support.v7.a.a$g.abc_list_menu_item_layout>
	//   14   28:invokespecial   #66  <Method void f(Context, int)>
	//   15   31:putfield        #54  <Field f k>
			k.a(a1);
	//   16   34:aload_0         
	//   17   35:getfield        #54  <Field f k>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #69  <Method void f.a(android.support.v7.view.menu.o$a)>
			j.a(((android.support.v7.view.menu.o) (k)));
	//   20   42:aload_0         
	//   21   43:getfield        #52  <Field h j>
	//   22   46:aload_0         
	//   23   47:getfield        #54  <Field f k>
	//   24   50:invokevirtual   #74  <Method void h.a(android.support.v7.view.menu.o)>
		}
		return k.a(g);
	//   25   53:aload_0         
	//   26   54:getfield        #54  <Field f k>
	//   27   57:aload_0         
	//   28   58:getfield        #76  <Field ViewGroup g>
	//   29   61:invokevirtual   #79  <Method p f.a(ViewGroup)>
	//   30   64:areturn         
	}

	void a(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #82  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void TypedValue()>
	//    3    7:astore          4
		android.content.res.Resources.Theme theme = context.getResources().newTheme();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #89  <Method Resources Context.getResources()>
	//    6   13:invokevirtual   #95  <Method android.content.res.Resources$Theme Resources.newTheme()>
	//    7   16:astore_3        
		theme.setTo(context.getTheme());
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #98  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   11   22:invokevirtual   #104 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		theme.resolveAttribute(android.support.v7.a.a.a.actionBarPopupTheme, typedvalue, true);
	//   12   25:aload_3         
	//   13   26:getstatic       #109 <Field int android.support.v7.a.a$a.actionBarPopupTheme>
	//   14   29:aload           4
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #113 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   17   35:pop             
		if(typedvalue.resourceId != 0)
	//*  18   36:aload           4
	//*  19   38:getfield        #116 <Field int TypedValue.resourceId>
	//*  20   41:ifeq            54
			theme.applyStyle(typedvalue.resourceId, true);
	//   21   44:aload_3         
	//   22   45:aload           4
	//   23   47:getfield        #116 <Field int TypedValue.resourceId>
	//   24   50:iconst_1        
	//   25   51:invokevirtual   #120 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
		theme.resolveAttribute(android.support.v7.a.a.a.panelMenuListTheme, typedvalue, true);
	//   26   54:aload_3         
	//   27   55:getstatic       #123 <Field int android.support.v7.a.a$a.panelMenuListTheme>
	//   28   58:aload           4
	//   29   60:iconst_1        
	//   30   61:invokevirtual   #113 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   31   64:pop             
		int i1;
		if(typedvalue.resourceId != 0)
	//*  32   65:aload           4
	//*  33   67:getfield        #116 <Field int TypedValue.resourceId>
	//*  34   70:ifeq            88
			i1 = typedvalue.resourceId;
	//   35   73:aload           4
	//   36   75:getfield        #116 <Field int TypedValue.resourceId>
	//   37   78:istore_2        
		else
	//*  38   79:aload_3         
	//*  39   80:iload_2         
	//*  40   81:iconst_1        
	//*  41   82:invokevirtual   #120 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//*  42   85:goto            95
			i1 = android.support.v7.a.a.i.Theme_AppCompat_CompactMenu;
	//   43   88:getstatic       #128 <Field int android.support.v7.a.a$i.Theme_AppCompat_CompactMenu>
	//   44   91:istore_2        
		theme.applyStyle(i1, true);
	//*  45   92:goto            79
		context = ((Context) (new d(context, 0)));
	//   46   95:new             #130 <Class d>
	//   47   98:dup             
	//   48   99:aload_1         
	//   49  100:iconst_0        
	//   50  101:invokespecial   #131 <Method void d(Context, int)>
	//   51  104:astore_1        
		context.getTheme().setTo(theme);
	//   52  105:aload_1         
	//   53  106:invokevirtual   #98  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   54  109:aload_3         
	//   55  110:invokevirtual   #104 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		l = context;
	//   56  113:aload_0         
	//   57  114:aload_1         
	//   58  115:putfield        #58  <Field Context l>
		context = ((Context) (context.obtainStyledAttributes(android.support.v7.a.a.j.AppCompatTheme)));
	//   59  118:aload_1         
	//   60  119:getstatic       #137 <Field int[] android.support.v7.a.a$j.AppCompatTheme>
	//   61  122:invokevirtual   #141 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   62  125:astore_1        
		b = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AppCompatTheme_panelBackground, 0);
	//   63  126:aload_0         
	//   64  127:aload_1         
	//   65  128:getstatic       #144 <Field int android.support.v7.a.a$j.AppCompatTheme_panelBackground>
	//   66  131:iconst_0        
	//   67  132:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   68  135:putfield        #152 <Field int b>
		f = ((TypedArray) (context)).getResourceId(android.support.v7.a.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
	//   69  138:aload_0         
	//   70  139:aload_1         
	//   71  140:getstatic       #155 <Field int android.support.v7.a.a$j.AppCompatTheme_android_windowAnimationStyle>
	//   72  143:iconst_0        
	//   73  144:invokevirtual   #150 <Method int TypedArray.getResourceId(int, int)>
	//   74  147:putfield        #157 <Field int f>
		((TypedArray) (context)).recycle();
	//   75  150:aload_1         
	//   76  151:invokevirtual   #160 <Method void TypedArray.recycle()>
	//   77  154:return          
	}

	void a(h h1)
	{
		if(h1 == j)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field h j>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(j != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field h j>
	//*   7   13:ifnull          27
			j.b(((android.support.v7.view.menu.o) (k)));
	//    8   16:aload_0         
	//    9   17:getfield        #52  <Field h j>
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field f k>
	//   12   24:invokevirtual   #163 <Method void h.b(android.support.v7.view.menu.o)>
		j = h1;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #52  <Field h j>
		if(h1 != null && k != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          51
	//*  18   36:aload_0         
	//*  19   37:getfield        #54  <Field f k>
	//*  20   40:ifnull          51
			h1.a(((android.support.v7.view.menu.o) (k)));
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #54  <Field f k>
	//   24   48:invokevirtual   #74  <Method void h.a(android.support.v7.view.menu.o)>
	//   25   51:return          
	}

	public boolean a()
	{
		View view = h;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field View h>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(view == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(i != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #168 <Field View i>
	//*  11   17:ifnull          22
			return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         
		if(k.d().getCount() > 0)
	//*  14   22:aload_0         
	//*  15   23:getfield        #54  <Field f k>
	//*  16   26:invokevirtual   #171 <Method ListAdapter f.d()>
	//*  17   29:invokeinterface #177 <Method int ListAdapter.getCount()>
	//*  18   34:ifle            39
			flag = true;
	//   19   37:iconst_1        
	//   20   38:istore_1        
		return flag;
	//   21   39:iload_1         
	//   22   40:ireturn         
	}

	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	ViewGroup g;
	View h;
	View i;
	h j;
	f k;
	Context l;
	boolean m;
	boolean n;
	boolean o;
	public boolean p;
	boolean q;
	boolean r;
	Bundle s;

	AppCompatDelegateImplV9$PanelFeatureState(int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #46  <Field int a>
		q = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #48  <Field boolean q>
	//    8   14:return          
	}
}
