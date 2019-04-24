// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.a.a.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.Space;
import android.support.v4.widget.m;
import android.support.v7.c.a.b;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.av;
import android.support.v7.widget.h;
import android.support.v7.widget.y;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			e, n, a, q, 
//			CheckableImageButton, g, TextInputEditText, o

public class TextInputLayout extends LinearLayout
{
	static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("TextInputLayout.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #60  <String "TextInputLayout.SavedState{">
		//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #70  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #76  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" error=");
		//   14   27:aload_1         
		//   15   28:ldc1            #78  <String " error=">
		//   16   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(((Object) (a)));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #42  <Field CharSequence a>
		//   21   39:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #83  <String "}">
		//   25   46:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #85  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #89  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #91  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #96  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class TextInputLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class TextInputLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void TextInputLayout$SavedState(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #28  <Method TextInputLayout$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method TextInputLayout$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method TextInputLayout$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		CharSequence a;
		boolean b;

		static 
		{
		//    0    0:new             #9   <Class TextInputLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void TextInputLayout$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
		//    4    6:aload_0         
		//    5    7:getstatic       #32  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//    6   10:aload_1         
		//    7   11:invokeinterface #38  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    8   16:checkcast       #40  <Class CharSequence>
		//    9   19:putfield        #42  <Field CharSequence a>
			int i1 = parcel.readInt();
		//   10   22:aload_1         
		//   11   23:invokevirtual   #48  <Method int Parcel.readInt()>
		//   12   26:istore_3        
			boolean flag = true;
		//   13   27:iconst_1        
		//   14   28:istore          4
			if(i1 != 1)
		//*  15   30:iload_3         
		//*  16   31:iconst_1        
		//*  17   32:icmpne          38
		//*  18   35:goto            41
				flag = false;
		//   19   38:iconst_0        
		//   20   39:istore          4
			b = flag;
		//   21   41:aload_0         
		//   22   42:iload           4
		//   23   44:putfield        #50  <Field boolean b>
		//   24   47:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #53  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	private class a extends android.support.v4.view.a
	{

		public void a(View view, android.support.v4.view.a.b b1)
		{
			super.a(view, b1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void android.support.v4.view.a.a(View, android.support.v4.view.a.b)>
			b1.b(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class TextInputLayout>
		//    6    9:invokevirtual   #25  <Method String Class.getSimpleName()>
		//    7   12:invokevirtual   #31  <Method void android.support.v4.view.a.b.b(CharSequence)>
			view = ((View) (a.d.j()));
		//    8   15:aload_0         
		//    9   16:getfield        #12  <Field TextInputLayout a>
		//   10   19:getfield        #35  <Field e TextInputLayout.d>
		//   11   22:invokevirtual   #41  <Method CharSequence e.j()>
		//   12   25:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*  13   26:aload_1         
		//*  14   27:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  15   30:ifne            38
				b1.c(((CharSequence) (view)));
		//   16   33:aload_2         
		//   17   34:aload_1         
		//   18   35:invokevirtual   #50  <Method void android.support.v4.view.a.b.c(CharSequence)>
			if(a.a != null)
		//*  19   38:aload_0         
		//*  20   39:getfield        #12  <Field TextInputLayout a>
		//*  21   42:getfield        #53  <Field EditText android.support.design.widget.TextInputLayout.a>
		//*  22   45:ifnull          59
				b1.d(((View) (a.a)));
		//   23   48:aload_2         
		//   24   49:aload_0         
		//   25   50:getfield        #12  <Field TextInputLayout a>
		//   26   53:getfield        #53  <Field EditText android.support.design.widget.TextInputLayout.a>
		//   27   56:invokevirtual   #56  <Method void android.support.v4.view.a.b.d(View)>
			if(a.b != null)
		//*  28   59:aload_0         
		//*  29   60:getfield        #12  <Field TextInputLayout a>
		//*  30   63:getfield        #59  <Field TextView android.support.design.widget.TextInputLayout.b>
		//*  31   66:ifnull          83
				view = ((View) (a.b.getText()));
		//   32   69:aload_0         
		//   33   70:getfield        #12  <Field TextInputLayout a>
		//   34   73:getfield        #59  <Field TextView android.support.design.widget.TextInputLayout.b>
		//   35   76:invokevirtual   #64  <Method CharSequence TextView.getText()>
		//   36   79:astore_1        
			else
		//*  37   80:goto            85
				view = null;
		//   38   83:aconst_null     
		//   39   84:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*  40   85:aload_1         
		//*  41   86:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  42   89:ifne            102
			{
				b1.l(true);
		//   43   92:aload_2         
		//   44   93:iconst_1        
		//   45   94:invokevirtual   #68  <Method void android.support.v4.view.a.b.l(boolean)>
				b1.e(((CharSequence) (view)));
		//   46   97:aload_2         
		//   47   98:aload_1         
		//   48   99:invokevirtual   #71  <Method void android.support.v4.view.a.b.e(CharSequence)>
			}
		//   49  102:return          
		}

		public void a(View view, AccessibilityEvent accessibilityevent)
		{
			super.a(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #74  <Method void android.support.v4.view.a.a(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class TextInputLayout>
		//    6    9:invokevirtual   #25  <Method String Class.getSimpleName()>
		//    7   12:invokevirtual   #79  <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public void b(View view, AccessibilityEvent accessibilityevent)
		{
			super.b(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #81  <Method void android.support.v4.view.a.b(View, AccessibilityEvent)>
			view = ((View) (a.d.j()));
		//    4    6:aload_0         
		//    5    7:getfield        #12  <Field TextInputLayout a>
		//    6   10:getfield        #35  <Field e TextInputLayout.d>
		//    7   13:invokevirtual   #41  <Method CharSequence e.j()>
		//    8   16:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (view))))
		//*   9   17:aload_1         
		//*  10   18:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  11   21:ifne            35
				accessibilityevent.getText().add(((Object) (view)));
		//   12   24:aload_2         
		//   13   25:invokevirtual   #84  <Method List AccessibilityEvent.getText()>
		//   14   28:aload_1         
		//   15   29:invokeinterface #90  <Method boolean List.add(Object)>
		//   16   34:pop             
		//   17   35:return          
		}

		final TextInputLayout a;

		a()
		{
			a = TextInputLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field TextInputLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void android.support.v4.view.a()>
		//    5    9:return          
		}
	}


	public TextInputLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #82  <Method void TextInputLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #86  <Method void TextInputLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TextInputLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void LinearLayout(Context, AttributeSet)>
		j = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #89  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #92  <Method void Rect()>
	//    8   14:putfield        #94  <Field Rect j>
		d = new e(((View) (this)));
	//    9   17:aload_0         
	//   10   18:new             #96  <Class e>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #99  <Method void e(View)>
	//   14   26:putfield        #101 <Field e d>
		android.support.design.widget.n.a(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #105 <Method void android.support.design.widget.n.a(Context)>
		setOrientation(1);
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #109 <Method void setOrientation(int)>
		setWillNotDraw(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #113 <Method void setWillNotDraw(boolean)>
		setAddStatesFromChildren(true);
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #116 <Method void setAddStatesFromChildren(boolean)>
		e = new FrameLayout(context);
	//   26   48:aload_0         
	//   27   49:new             #118 <Class FrameLayout>
	//   28   52:dup             
	//   29   53:aload_1         
	//   30   54:invokespecial   #120 <Method void FrameLayout(Context)>
	//   31   57:putfield        #122 <Field FrameLayout e>
		e.setAddStatesFromChildren(true);
	//   32   60:aload_0         
	//   33   61:getfield        #122 <Field FrameLayout e>
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #123 <Method void FrameLayout.setAddStatesFromChildren(boolean)>
		addView(((View) (e)));
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #122 <Field FrameLayout e>
	//   39   73:invokevirtual   #126 <Method void addView(View)>
		d.a(android.support.design.widget.a.b);
	//   40   76:aload_0         
	//   41   77:getfield        #101 <Field e d>
	//   42   80:getstatic       #131 <Field android.view.animation.Interpolator android.support.design.widget.a.b>
	//   43   83:invokevirtual   #134 <Method void android.support.design.widget.e.a(android.view.animation.Interpolator)>
		d.b(((android.view.animation.Interpolator) (new AccelerateInterpolator())));
	//   44   86:aload_0         
	//   45   87:getfield        #101 <Field e d>
	//   46   90:new             #136 <Class AccelerateInterpolator>
	//   47   93:dup             
	//   48   94:invokespecial   #137 <Method void AccelerateInterpolator()>
	//   49   97:invokevirtual   #139 <Method void android.support.design.widget.e.b(android.view.animation.Interpolator)>
		d.b(0x800033);
	//   50  100:aload_0         
	//   51  101:getfield        #101 <Field e d>
	//   52  104:ldc1            #140 <Int 0x800033>
	//   53  106:invokevirtual   #142 <Method void android.support.design.widget.e.b(int)>
		context = ((Context) (av.a(context, attributeset, android.support.design.a.k.TextInputLayout, i1, android.support.design.a.j.Widget_Design_TextInputLayout)));
	//   54  109:aload_1         
	//   55  110:aload_2         
	//   56  111:getstatic       #148 <Field int[] android.support.design.a$k.TextInputLayout>
	//   57  114:iload_3         
	//   58  115:getstatic       #153 <Field int android.support.design.a$j.Widget_Design_TextInputLayout>
	//   59  118:invokestatic    #158 <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   60  121:astore_1        
		g = ((av) (context)).a(android.support.design.a.k.TextInputLayout_hintEnabled, true);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:getstatic       #161 <Field int android.support.design.a$k.TextInputLayout_hintEnabled>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #164 <Method boolean av.a(int, boolean)>
	//   66  131:putfield        #166 <Field boolean g>
		setHint(((av) (context)).c(android.support.design.a.k.TextInputLayout_android_hint));
	//   67  134:aload_0         
	//   68  135:aload_1         
	//   69  136:getstatic       #169 <Field int android.support.design.a$k.TextInputLayout_android_hint>
	//   70  139:invokevirtual   #172 <Method CharSequence av.c(int)>
	//   71  142:invokevirtual   #176 <Method void setHint(CharSequence)>
		K = ((av) (context)).a(android.support.design.a.k.TextInputLayout_hintAnimationEnabled, true);
	//   72  145:aload_0         
	//   73  146:aload_1         
	//   74  147:getstatic       #179 <Field int android.support.design.a$k.TextInputLayout_hintAnimationEnabled>
	//   75  150:iconst_1        
	//   76  151:invokevirtual   #164 <Method boolean av.a(int, boolean)>
	//   77  154:putfield        #181 <Field boolean K>
		if(((av) (context)).g(android.support.design.a.k.TextInputLayout_android_textColorHint))
	//*  78  157:aload_1         
	//*  79  158:getstatic       #184 <Field int android.support.design.a$k.TextInputLayout_android_textColorHint>
	//*  80  161:invokevirtual   #187 <Method boolean av.g(int)>
	//*  81  164:ifeq            185
		{
			attributeset = ((AttributeSet) (((av) (context)).e(android.support.design.a.k.TextInputLayout_android_textColorHint)));
	//   82  167:aload_1         
	//   83  168:getstatic       #184 <Field int android.support.design.a$k.TextInputLayout_android_textColorHint>
	//   84  171:invokevirtual   #190 <Method ColorStateList av.e(int)>
	//   85  174:astore_2        
			I = ((ColorStateList) (attributeset));
	//   86  175:aload_0         
	//   87  176:aload_2         
	//   88  177:putfield        #192 <Field ColorStateList I>
			H = ((ColorStateList) (attributeset));
	//   89  180:aload_0         
	//   90  181:aload_2         
	//   91  182:putfield        #194 <Field ColorStateList H>
		}
		if(((av) (context)).g(android.support.design.a.k.TextInputLayout_hintTextAppearance, -1) != -1)
	//*  92  185:aload_1         
	//*  93  186:getstatic       #197 <Field int android.support.design.a$k.TextInputLayout_hintTextAppearance>
	//*  94  189:iconst_m1       
	//*  95  190:invokevirtual   #200 <Method int av.g(int, int)>
	//*  96  193:iconst_m1       
	//*  97  194:icmpeq          209
			setHintTextAppearance(((av) (context)).g(android.support.design.a.k.TextInputLayout_hintTextAppearance, 0));
	//   98  197:aload_0         
	//   99  198:aload_1         
	//  100  199:getstatic       #197 <Field int android.support.design.a$k.TextInputLayout_hintTextAppearance>
	//  101  202:iconst_0        
	//  102  203:invokevirtual   #200 <Method int av.g(int, int)>
	//  103  206:invokevirtual   #203 <Method void setHintTextAppearance(int)>
		o = ((av) (context)).g(android.support.design.a.k.TextInputLayout_errorTextAppearance, 0);
	//  104  209:aload_0         
	//  105  210:aload_1         
	//  106  211:getstatic       #206 <Field int android.support.design.a$k.TextInputLayout_errorTextAppearance>
	//  107  214:iconst_0        
	//  108  215:invokevirtual   #200 <Method int av.g(int, int)>
	//  109  218:putfield        #208 <Field int o>
		boolean flag = ((av) (context)).a(android.support.design.a.k.TextInputLayout_errorEnabled, false);
	//  110  221:aload_1         
	//  111  222:getstatic       #211 <Field int android.support.design.a$k.TextInputLayout_errorEnabled>
	//  112  225:iconst_0        
	//  113  226:invokevirtual   #164 <Method boolean av.a(int, boolean)>
	//  114  229:istore          4
		boolean flag1 = ((av) (context)).a(android.support.design.a.k.TextInputLayout_counterEnabled, false);
	//  115  231:aload_1         
	//  116  232:getstatic       #214 <Field int android.support.design.a$k.TextInputLayout_counterEnabled>
	//  117  235:iconst_0        
	//  118  236:invokevirtual   #164 <Method boolean av.a(int, boolean)>
	//  119  239:istore          5
		setCounterMaxLength(((av) (context)).a(android.support.design.a.k.TextInputLayout_counterMaxLength, -1));
	//  120  241:aload_0         
	//  121  242:aload_1         
	//  122  243:getstatic       #217 <Field int android.support.design.a$k.TextInputLayout_counterMaxLength>
	//  123  246:iconst_m1       
	//  124  247:invokevirtual   #219 <Method int av.a(int, int)>
	//  125  250:invokevirtual   #222 <Method void setCounterMaxLength(int)>
		t = ((av) (context)).g(android.support.design.a.k.TextInputLayout_counterTextAppearance, 0);
	//  126  253:aload_0         
	//  127  254:aload_1         
	//  128  255:getstatic       #225 <Field int android.support.design.a$k.TextInputLayout_counterTextAppearance>
	//  129  258:iconst_0        
	//  130  259:invokevirtual   #200 <Method int av.g(int, int)>
	//  131  262:putfield        #227 <Field int t>
		u = ((av) (context)).g(android.support.design.a.k.TextInputLayout_counterOverflowTextAppearance, 0);
	//  132  265:aload_0         
	//  133  266:aload_1         
	//  134  267:getstatic       #230 <Field int android.support.design.a$k.TextInputLayout_counterOverflowTextAppearance>
	//  135  270:iconst_0        
	//  136  271:invokevirtual   #200 <Method int av.g(int, int)>
	//  137  274:putfield        #232 <Field int u>
		w = ((av) (context)).a(android.support.design.a.k.TextInputLayout_passwordToggleEnabled, false);
	//  138  277:aload_0         
	//  139  278:aload_1         
	//  140  279:getstatic       #235 <Field int android.support.design.a$k.TextInputLayout_passwordToggleEnabled>
	//  141  282:iconst_0        
	//  142  283:invokevirtual   #164 <Method boolean av.a(int, boolean)>
	//  143  286:putfield        #237 <Field boolean w>
		x = ((av) (context)).a(android.support.design.a.k.TextInputLayout_passwordToggleDrawable);
	//  144  289:aload_0         
	//  145  290:aload_1         
	//  146  291:getstatic       #240 <Field int android.support.design.a$k.TextInputLayout_passwordToggleDrawable>
	//  147  294:invokevirtual   #243 <Method Drawable av.a(int)>
	//  148  297:putfield        #245 <Field Drawable x>
		y = ((av) (context)).c(android.support.design.a.k.TextInputLayout_passwordToggleContentDescription);
	//  149  300:aload_0         
	//  150  301:aload_1         
	//  151  302:getstatic       #248 <Field int android.support.design.a$k.TextInputLayout_passwordToggleContentDescription>
	//  152  305:invokevirtual   #172 <Method CharSequence av.c(int)>
	//  153  308:putfield        #250 <Field CharSequence y>
		if(((av) (context)).g(android.support.design.a.k.TextInputLayout_passwordToggleTint))
	//* 154  311:aload_1         
	//* 155  312:getstatic       #253 <Field int android.support.design.a$k.TextInputLayout_passwordToggleTint>
	//* 156  315:invokevirtual   #187 <Method boolean av.g(int)>
	//* 157  318:ifeq            337
		{
			E = true;
	//  158  321:aload_0         
	//  159  322:iconst_1        
	//  160  323:putfield        #255 <Field boolean E>
			D = ((av) (context)).e(android.support.design.a.k.TextInputLayout_passwordToggleTint);
	//  161  326:aload_0         
	//  162  327:aload_1         
	//  163  328:getstatic       #253 <Field int android.support.design.a$k.TextInputLayout_passwordToggleTint>
	//  164  331:invokevirtual   #190 <Method ColorStateList av.e(int)>
	//  165  334:putfield        #257 <Field ColorStateList D>
		}
		if(((av) (context)).g(android.support.design.a.k.TextInputLayout_passwordToggleTintMode))
	//* 166  337:aload_1         
	//* 167  338:getstatic       #260 <Field int android.support.design.a$k.TextInputLayout_passwordToggleTintMode>
	//* 168  341:invokevirtual   #187 <Method boolean av.g(int)>
	//* 169  344:ifeq            368
		{
			G = true;
	//  170  347:aload_0         
	//  171  348:iconst_1        
	//  172  349:putfield        #262 <Field boolean G>
			F = android.support.design.widget.q.a(((av) (context)).a(android.support.design.a.k.TextInputLayout_passwordToggleTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  173  352:aload_0         
	//  174  353:aload_1         
	//  175  354:getstatic       #260 <Field int android.support.design.a$k.TextInputLayout_passwordToggleTintMode>
	//  176  357:iconst_m1       
	//  177  358:invokevirtual   #219 <Method int av.a(int, int)>
	//  178  361:aconst_null     
	//  179  362:invokestatic    #267 <Method android.graphics.PorterDuff$Mode android.support.design.widget.q.a(int, android.graphics.PorterDuff$Mode)>
	//  180  365:putfield        #269 <Field android.graphics.PorterDuff$Mode F>
		}
		((av) (context)).a();
	//  181  368:aload_1         
	//  182  369:invokevirtual   #271 <Method void av.a()>
		setErrorEnabled(flag);
	//  183  372:aload_0         
	//  184  373:iload           4
	//  185  375:invokevirtual   #274 <Method void setErrorEnabled(boolean)>
		setCounterEnabled(flag1);
	//  186  378:aload_0         
	//  187  379:iload           5
	//  188  381:invokevirtual   #277 <Method void setCounterEnabled(boolean)>
		h();
	//  189  384:aload_0         
	//  190  385:invokespecial   #279 <Method void h()>
		if(android.support.v4.view.s.d(((View) (this))) == 0)
	//* 191  388:aload_0         
	//* 192  389:invokestatic    #284 <Method int s.d(View)>
	//* 193  392:ifne            400
			android.support.v4.view.s.a(((View) (this)), 1);
	//  194  395:aload_0         
	//  195  396:iconst_1        
	//  196  397:invokestatic    #287 <Method void s.a(View, int)>
		android.support.v4.view.s.a(((View) (this)), ((android.support.v4.view.a) (new a())));
	//  197  400:aload_0         
	//  198  401:new             #21  <Class TextInputLayout$a>
	//  199  404:dup             
	//  200  405:aload_0         
	//  201  406:invokespecial   #290 <Method void TextInputLayout$a(TextInputLayout)>
	//  202  409:invokestatic    #293 <Method void s.a(View, android.support.v4.view.a)>
	//  203  412:return          
	}

	private void a()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)e.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field FrameLayout e>
	//    2    4:invokevirtual   #297 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//    3    7:checkcast       #299 <Class android.widget.LinearLayout$LayoutParams>
	//    4   10:astore_2        
		int i1;
		if(g)
	//*   5   11:aload_0         
	//*   6   12:getfield        #166 <Field boolean g>
	//*   7   15:ifeq            78
		{
			if(i == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #301 <Field Paint i>
	//*  10   22:ifnonnull       36
				i = new Paint();
	//   11   25:aload_0         
	//   12   26:new             #303 <Class Paint>
	//   13   29:dup             
	//   14   30:invokespecial   #304 <Method void Paint()>
	//   15   33:putfield        #301 <Field Paint i>
			i.setTypeface(d.d());
	//   16   36:aload_0         
	//   17   37:getfield        #301 <Field Paint i>
	//   18   40:aload_0         
	//   19   41:getfield        #101 <Field e d>
	//   20   44:invokevirtual   #307 <Method Typeface e.d()>
	//   21   47:invokevirtual   #311 <Method Typeface Paint.setTypeface(Typeface)>
	//   22   50:pop             
			i.setTextSize(d.h());
	//   23   51:aload_0         
	//   24   52:getfield        #301 <Field Paint i>
	//   25   55:aload_0         
	//   26   56:getfield        #101 <Field e d>
	//   27   59:invokevirtual   #314 <Method float android.support.design.widget.e.h()>
	//   28   62:invokevirtual   #318 <Method void Paint.setTextSize(float)>
			i1 = (int)(-i.ascent());
	//   29   65:aload_0         
	//   30   66:getfield        #301 <Field Paint i>
	//   31   69:invokevirtual   #321 <Method float Paint.ascent()>
	//   32   72:fneg            
	//   33   73:f2i             
	//   34   74:istore_1        
		} else
	//*  35   75:goto            80
		{
			i1 = 0;
	//   36   78:iconst_0        
	//   37   79:istore_1        
		}
		if(i1 != layoutparams.topMargin)
	//*  38   80:iload_1         
	//*  39   81:aload_2         
	//*  40   82:getfield        #324 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  41   85:icmpeq          100
		{
			layoutparams.topMargin = i1;
	//   42   88:aload_2         
	//   43   89:iload_1         
	//   44   90:putfield        #324 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
			e.requestLayout();
	//   45   93:aload_0         
	//   46   94:getfield        #122 <Field FrameLayout e>
	//   47   97:invokevirtual   #327 <Method void FrameLayout.requestLayout()>
		}
	//   48  100:return          
	}

	static void a(TextInputLayout textinputlayout, boolean flag)
	{
		textinputlayout.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #330 <Method void b(boolean)>
	//    3    5:return          
	}

	private static void a(ViewGroup viewgroup, boolean flag)
	{
		int j1 = viewgroup.getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method int ViewGroup.getChildCount()>
	//    2    4:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          49
		{
			View view = viewgroup.getChildAt(i1);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #341 <Method View ViewGroup.getChildAt(int)>
	//   11   17:astore          4
			view.setEnabled(flag);
	//   12   19:aload           4
	//   13   21:iload_1         
	//   14   22:invokevirtual   #346 <Method void View.setEnabled(boolean)>
			if(view instanceof ViewGroup)
	//*  15   25:aload           4
	//*  16   27:instanceof      #333 <Class ViewGroup>
	//*  17   30:ifeq            42
				a((ViewGroup)view, flag);
	//   18   33:aload           4
	//   19   35:checkcast       #333 <Class ViewGroup>
	//   20   38:iload_1         
	//   21   39:invokestatic    #348 <Method void a(ViewGroup, boolean)>
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            7
	//   27   49:return          
	}

	private void a(TextView textview)
	{
		if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field LinearLayout k>
	//*   2    4:ifnull          40
		{
			k.removeView(((View) (textview)));
	//    3    7:aload_0         
	//    4    8:getfield        #351 <Field LinearLayout k>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #354 <Method void LinearLayout.removeView(View)>
			int i1 = l - 1;
	//    7   15:aload_0         
	//    8   16:getfield        #356 <Field int l>
	//    9   19:iconst_1        
	//   10   20:isub            
	//   11   21:istore_2        
			l = i1;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #356 <Field int l>
			if(i1 == 0)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
				k.setVisibility(8);
	//   17   31:aload_0         
	//   18   32:getfield        #351 <Field LinearLayout k>
	//   19   35:bipush          8
	//   20   37:invokevirtual   #359 <Method void LinearLayout.setVisibility(int)>
		}
	//   21   40:return          
	}

	private void a(TextView textview, int i1)
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field LinearLayout k>
	//*   2    4:ifnonnull       86
		{
			k = new LinearLayout(getContext());
	//    3    7:aload_0         
	//    4    8:new             #4   <Class LinearLayout>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #364 <Method Context getContext()>
	//    8   16:invokespecial   #365 <Method void LinearLayout(Context)>
	//    9   19:putfield        #351 <Field LinearLayout k>
			k.setOrientation(0);
	//   10   22:aload_0         
	//   11   23:getfield        #351 <Field LinearLayout k>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #366 <Method void LinearLayout.setOrientation(int)>
			addView(((View) (k)), -1, -2);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #351 <Field LinearLayout k>
	//   17   35:iconst_m1       
	//   18   36:bipush          -2
	//   19   38:invokevirtual   #369 <Method void addView(View, int, int)>
			Space space = new Space(getContext());
	//   20   41:new             #371 <Class Space>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #364 <Method Context getContext()>
	//   24   49:invokespecial   #372 <Method void Space(Context)>
	//   25   52:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
	//   26   53:new             #299 <Class android.widget.LinearLayout$LayoutParams>
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:fconst_1        
	//   31   60:invokespecial   #375 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   32   63:astore          4
			k.addView(((View) (space)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   65:aload_0         
	//   34   66:getfield        #351 <Field LinearLayout k>
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #378 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(a != null)
	//*  38   75:aload_0         
	//*  39   76:getfield        #380 <Field EditText a>
	//*  40   79:ifnull          86
				b();
	//   41   82:aload_0         
	//   42   83:invokespecial   #382 <Method void b()>
		}
		k.setVisibility(0);
	//   43   86:aload_0         
	//   44   87:getfield        #351 <Field LinearLayout k>
	//   45   90:iconst_0        
	//   46   91:invokevirtual   #359 <Method void LinearLayout.setVisibility(int)>
		k.addView(((View) (textview)), i1);
	//   47   94:aload_0         
	//   48   95:getfield        #351 <Field LinearLayout k>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:invokevirtual   #384 <Method void LinearLayout.addView(View, int)>
		l = l + 1;
	//   52  103:aload_0         
	//   53  104:aload_0         
	//   54  105:getfield        #356 <Field int l>
	//   55  108:iconst_1        
	//   56  109:iadd            
	//   57  110:putfield        #356 <Field int l>
	//   58  113:return          
	}

	private void a(CharSequence charsequence, boolean flag)
	{
		q = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #387 <Field CharSequence q>
		if(!n)
	//*   3    5:aload_0         
	//*   4    6:getfield        #389 <Field boolean n>
	//*   5    9:ifne            25
		{
			if(TextUtils.isEmpty(charsequence))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            20
				return;
	//    9   19:return          
			setErrorEnabled(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #274 <Method void setErrorEnabled(boolean)>
		}
		p = TextUtils.isEmpty(charsequence) ^ true;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   16   30:iconst_1        
	//   17   31:ixor            
	//   18   32:putfield        #397 <Field boolean p>
		b.animate().cancel();
	//   19   35:aload_0         
	//   20   36:getfield        #399 <Field TextView b>
	//   21   39:invokevirtual   #405 <Method ViewPropertyAnimator TextView.animate()>
	//   22   42:invokevirtual   #410 <Method void ViewPropertyAnimator.cancel()>
		if(!p) goto _L2; else goto _L1
	//   23   45:aload_0         
	//   24   46:getfield        #397 <Field boolean p>
	//   25   49:ifeq            145
_L1:
		b.setText(charsequence);
	//   26   52:aload_0         
	//   27   53:getfield        #399 <Field TextView b>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #413 <Method void TextView.setText(CharSequence)>
		b.setVisibility(0);
	//   30   60:aload_0         
	//   31   61:getfield        #399 <Field TextView b>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #414 <Method void TextView.setVisibility(int)>
		if(!flag) goto _L4; else goto _L3
	//   34   68:iload_2         
	//   35   69:ifeq            134
_L3:
		if(b.getAlpha() == 1.0F)
	//*  36   72:aload_0         
	//*  37   73:getfield        #399 <Field TextView b>
	//*  38   76:invokevirtual   #417 <Method float TextView.getAlpha()>
	//*  39   79:fconst_1        
	//*  40   80:fcmpl           
	//*  41   81:ifne            92
			b.setAlpha(0.0F);
	//   42   84:aload_0         
	//   43   85:getfield        #399 <Field TextView b>
	//   44   88:fconst_0        
	//   45   89:invokevirtual   #420 <Method void TextView.setAlpha(float)>
		charsequence = ((CharSequence) (b.animate().alpha(1.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.d))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationStart(Animator animator)
			{
				a.b.setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field TextInputLayout a>
			//    2    4:getfield        #24  <Field TextView android.support.design.widget.TextInputLayout.b>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #30  <Method void TextView.setVisibility(int)>
			//    5   11:return          
			}

			final TextInputLayout a;

			
			{
				a = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TextInputLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)))));
	//   46   92:aload_0         
	//   47   93:getfield        #399 <Field TextView b>
	//   48   96:invokevirtual   #405 <Method ViewPropertyAnimator TextView.animate()>
	//   49   99:fconst_1        
	//   50  100:invokevirtual   #424 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   51  103:ldc2w           #425 <Long 200L>
	//   52  106:invokevirtual   #430 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   53  109:getstatic       #432 <Field android.view.animation.Interpolator a.d>
	//   54  112:invokevirtual   #436 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   55  115:new             #8   <Class TextInputLayout$2>
	//   56  118:dup             
	//   57  119:aload_0         
	//   58  120:invokespecial   #437 <Method void TextInputLayout$2(TextInputLayout)>
	//   59  123:invokevirtual   #441 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   60  126:astore_1        
_L6:
		((ViewPropertyAnimator) (charsequence)).start();
	//   61  127:aload_1         
	//   62  128:invokevirtual   #444 <Method void ViewPropertyAnimator.start()>
		break MISSING_BLOCK_LABEL_214;
	//   63  131:goto            214
_L4:
		b.setAlpha(1.0F);
	//   64  134:aload_0         
	//   65  135:getfield        #399 <Field TextView b>
	//   66  138:fconst_1        
	//   67  139:invokevirtual   #420 <Method void TextView.setAlpha(float)>
		break MISSING_BLOCK_LABEL_214;
	//   68  142:goto            214
_L2:
		if(b.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_214;
	//   69  145:aload_0         
	//   70  146:getfield        #399 <Field TextView b>
	//   71  149:invokevirtual   #447 <Method int TextView.getVisibility()>
	//   72  152:ifne            214
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   73  155:iload_2         
	//   74  156:ifeq            198
		charsequence = ((CharSequence) (b.animate().alpha(0.0F).setDuration(200L).setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.c))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(charsequence) {

			public void onAnimationEnd(Animator animator)
			{
				b.b.setText(a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field TextInputLayout b>
			//    2    4:getfield        #27  <Field TextView android.support.design.widget.TextInputLayout.b>
			//    3    7:aload_0         
			//    4    8:getfield        #18  <Field CharSequence a>
			//    5   11:invokevirtual   #33  <Method void TextView.setText(CharSequence)>
				b.b.setVisibility(4);
			//    6   14:aload_0         
			//    7   15:getfield        #16  <Field TextInputLayout b>
			//    8   18:getfield        #27  <Field TextView android.support.design.widget.TextInputLayout.b>
			//    9   21:iconst_4        
			//   10   22:invokevirtual   #37  <Method void TextView.setVisibility(int)>
			//   11   25:return          
			}

			final CharSequence a;
			final TextInputLayout b;

			
			{
				b = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TextInputLayout b>
				a = charsequence;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field CharSequence a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
		}
)))));
	//   75  159:aload_0         
	//   76  160:getfield        #399 <Field TextView b>
	//   77  163:invokevirtual   #405 <Method ViewPropertyAnimator TextView.animate()>
	//   78  166:fconst_0        
	//   79  167:invokevirtual   #424 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   80  170:ldc2w           #425 <Long 200L>
	//   81  173:invokevirtual   #430 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   82  176:getstatic       #449 <Field android.view.animation.Interpolator a.c>
	//   83  179:invokevirtual   #436 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   84  182:new             #10  <Class TextInputLayout$3>
	//   85  185:dup             
	//   86  186:aload_0         
	//   87  187:aload_1         
	//   88  188:invokespecial   #452 <Method void TextInputLayout$3(TextInputLayout, CharSequence)>
	//   89  191:invokevirtual   #441 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   90  194:astore_1        
		if(true) goto _L6; else goto _L5
	//   91  195:goto            127
_L5:
		b.setText(charsequence);
	//   92  198:aload_0         
	//   93  199:getfield        #399 <Field TextView b>
	//   94  202:aload_1         
	//   95  203:invokevirtual   #413 <Method void TextView.setText(CharSequence)>
		b.setVisibility(4);
	//   96  206:aload_0         
	//   97  207:getfield        #399 <Field TextView b>
	//   98  210:iconst_4        
	//   99  211:invokevirtual   #414 <Method void TextView.setVisibility(int)>
		c();
	//  100  214:aload_0         
	//  101  215:invokespecial   #454 <Method void c()>
		a(flag);
	//  102  218:aload_0         
	//  103  219:iload_2         
	//  104  220:invokevirtual   #456 <Method void a(boolean)>
		return;
	//  105  223:return          
	}

	static boolean a(TextInputLayout textinputlayout)
	{
		return textinputlayout.O;
	//    0    0:aload_0         
	//    1    1:getfield        #459 <Field boolean O>
	//    2    4:ireturn         
	}

	private static boolean a(int ai[], int i1)
	{
		int k1 = ai.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          26
			if(ai[j1] == i1)
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:iaload          
	//*  11   13:iload_1         
	//*  12   14:icmpne          19
				return true;
	//   13   17:iconst_1        
	//   14   18:ireturn         

	//   15   19:iload_2         
	//   16   20:iconst_1        
	//   17   21:iadd            
	//   18   22:istore_2        
	//*  19   23:goto            5
		return false;
	//   20   26:iconst_0        
	//   21   27:ireturn         
	}

	private void b()
	{
		android.support.v4.view.s.b(((View) (k)), android.support.v4.view.s.g(((View) (a))), 0, android.support.v4.view.s.h(((View) (a))), a.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:getfield        #351 <Field LinearLayout k>
	//    2    4:aload_0         
	//    3    5:getfield        #380 <Field EditText a>
	//    4    8:invokestatic    #462 <Method int s.g(View)>
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #380 <Field EditText a>
	//    8   16:invokestatic    #464 <Method int s.h(View)>
	//    9   19:aload_0         
	//   10   20:getfield        #380 <Field EditText a>
	//   11   23:invokevirtual   #469 <Method int EditText.getPaddingBottom()>
	//   12   26:invokestatic    #472 <Method void s.b(View, int, int, int, int)>
	//   13   29:return          
	}

	private void b(boolean flag)
	{
		if(w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field boolean w>
	//*   2    4:ifeq            85
		{
			int i1 = a.getSelectionEnd();
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field EditText a>
	//    5   11:invokevirtual   #475 <Method int EditText.getSelectionEnd()>
	//    6   14:istore_2        
			boolean flag1;
			if(f())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #478 <Method boolean f()>
	//*   9   19:ifeq            40
			{
				a.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #380 <Field EditText a>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #482 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				flag1 = true;
	//   14   30:iconst_1        
	//   15   31:istore_3        
			} else
	//*  16   32:aload_0         
	//*  17   33:iload_3         
	//*  18   34:putfield        #484 <Field boolean A>
	//*  19   37:goto            55
			{
				a.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   20   40:aload_0         
	//   21   41:getfield        #380 <Field EditText a>
	//   22   44:invokestatic    #490 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   23   47:invokevirtual   #482 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
				flag1 = false;
	//   24   50:iconst_0        
	//   25   51:istore_3        
			}
			A = flag1;
	//*  26   52:goto            32
			z.setChecked(A);
	//   27   55:aload_0         
	//   28   56:getfield        #492 <Field CheckableImageButton z>
	//   29   59:aload_0         
	//   30   60:getfield        #484 <Field boolean A>
	//   31   63:invokevirtual   #497 <Method void CheckableImageButton.setChecked(boolean)>
			if(flag)
	//*  32   66:iload_1         
	//*  33   67:ifeq            77
				z.jumpDrawablesToCurrentState();
	//   34   70:aload_0         
	//   35   71:getfield        #492 <Field CheckableImageButton z>
	//   36   74:invokevirtual   #500 <Method void CheckableImageButton.jumpDrawablesToCurrentState()>
			a.setSelection(i1);
	//   37   77:aload_0         
	//   38   78:getfield        #380 <Field EditText a>
	//   39   81:iload_2         
	//   40   82:invokevirtual   #503 <Method void EditText.setSelection(int)>
		}
	//   41   85:return          
	}

	private void c()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #380 <Field EditText a>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Object obj = ((Object) (a.getBackground()));
	//    4    8:aload_0         
	//    5    9:getfield        #380 <Field EditText a>
	//    6   12:invokevirtual   #507 <Method Drawable EditText.getBackground()>
	//    7   15:astore_2        
		if(obj == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		d();
	//   11   21:aload_0         
	//   12   22:invokespecial   #509 <Method void d()>
		Drawable drawable = ((Drawable) (obj));
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(android.support.v7.widget.y.c(((Drawable) (obj))))
	//*  15   27:aload_2         
	//*  16   28:invokestatic    #514 <Method boolean y.c(Drawable)>
	//*  17   31:ifeq            39
			drawable = ((Drawable) (obj)).mutate();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #519 <Method Drawable Drawable.mutate()>
	//   20   38:astore_1        
		if(p && b != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #397 <Field boolean p>
	//*  23   43:ifeq            73
	//*  24   46:aload_0         
	//*  25   47:getfield        #399 <Field TextView b>
	//*  26   50:ifnull          73
			obj = ((Object) (b));
	//   27   53:aload_0         
	//   28   54:getfield        #399 <Field TextView b>
	//   29   57:astore_2        
		else
	//*  30   58:aload_1         
	//*  31   59:aload_2         
	//*  32   60:invokevirtual   #522 <Method int TextView.getCurrentTextColor()>
	//*  33   63:getstatic       #527 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//*  34   66:invokestatic    #532 <Method android.graphics.PorterDuffColorFilter h.a(int, android.graphics.PorterDuff$Mode)>
	//*  35   69:invokevirtual   #536 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//*  36   72:return          
		if(v && r != null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #538 <Field boolean v>
	//*  39   77:ifeq            95
	//*  40   80:aload_0         
	//*  41   81:getfield        #540 <Field TextView r>
	//*  42   84:ifnull          95
		{
			obj = ((Object) (r));
	//   43   87:aload_0         
	//   44   88:getfield        #540 <Field TextView r>
	//   45   91:astore_2        
		} else
	//*  46   92:goto            58
		{
			android.support.v4.a.a.a.f(drawable);
	//   47   95:aload_1         
	//   48   96:invokestatic    #545 <Method void a.f(Drawable)>
			a.refreshDrawableState();
	//   49   99:aload_0         
	//   50  100:getfield        #380 <Field EditText a>
	//   51  103:invokevirtual   #548 <Method void EditText.refreshDrawableState()>
			return;
	//   52  106:return          
		}
		drawable.setColorFilter(((android.graphics.ColorFilter) (android.support.v7.widget.h.a(((TextView) (obj)).getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN))));
	}

	private void c(boolean flag)
	{
		if(L != null && L.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #550 <Field ValueAnimator L>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #550 <Field ValueAnimator L>
	//*   5   11:invokevirtual   #555 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			L.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #550 <Field ValueAnimator L>
	//    9   21:invokevirtual   #556 <Method void ValueAnimator.cancel()>
		if(flag && K)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #181 <Field boolean K>
	//*  14   32:ifeq            43
			a(1.0F);
	//   15   35:aload_0         
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #558 <Method void a(float)>
		else
	//*  18   40:goto            51
			d.b(1.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #101 <Field e d>
	//   21   47:fconst_1        
	//   22   48:invokevirtual   #560 <Method void android.support.design.widget.e.b(float)>
		J = false;
	//   23   51:aload_0         
	//   24   52:iconst_0        
	//   25   53:putfield        #562 <Field boolean J>
	//   26   56:return          
	}

	private void d()
	{
		int i1 = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #567 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i1 != 21 && i1 != 22)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmpeq          17
	//*   5   10:iload_1         
	//*   6   11:bipush          22
	//*   7   13:icmpeq          17
			return;
	//    8   16:return          
		Drawable drawable = a.getBackground();
	//    9   17:aload_0         
	//   10   18:getfield        #380 <Field EditText a>
	//   11   21:invokevirtual   #507 <Method Drawable EditText.getBackground()>
	//   12   24:astore_2        
		if(drawable == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       30
			return;
	//   15   29:return          
		if(!M)
	//*  16   30:aload_0         
	//*  17   31:getfield        #569 <Field boolean M>
	//*  18   34:ifne            87
		{
			Drawable drawable1 = drawable.getConstantState().newDrawable();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #573 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   21   41:invokevirtual   #578 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   22   44:astore_3        
			if(drawable instanceof DrawableContainer)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #580 <Class DrawableContainer>
	//*  25   49:ifeq            67
				M = android.support.design.widget.g.a((DrawableContainer)drawable, drawable1.getConstantState());
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:checkcast       #580 <Class DrawableContainer>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #573 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   61:invokestatic    #585 <Method boolean android.support.design.widget.g.a(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//   32   64:putfield        #569 <Field boolean M>
			if(!M)
	//*  33   67:aload_0         
	//*  34   68:getfield        #569 <Field boolean M>
	//*  35   71:ifne            87
			{
				android.support.v4.view.s.a(((View) (a)), drawable1);
	//   36   74:aload_0         
	//   37   75:getfield        #380 <Field EditText a>
	//   38   78:aload_3         
	//   39   79:invokestatic    #588 <Method void s.a(View, Drawable)>
				M = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #569 <Field boolean M>
			}
		}
	//   43   87:return          
	}

	private void d(boolean flag)
	{
		if(L != null && L.isRunning())
	//*   0    0:aload_0         
	//*   1    1:getfield        #550 <Field ValueAnimator L>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #550 <Field ValueAnimator L>
	//*   5   11:invokevirtual   #555 <Method boolean ValueAnimator.isRunning()>
	//*   6   14:ifeq            24
			L.cancel();
	//    7   17:aload_0         
	//    8   18:getfield        #550 <Field ValueAnimator L>
	//    9   21:invokevirtual   #556 <Method void ValueAnimator.cancel()>
		if(flag && K)
	//*  10   24:iload_1         
	//*  11   25:ifeq            43
	//*  12   28:aload_0         
	//*  13   29:getfield        #181 <Field boolean K>
	//*  14   32:ifeq            43
			a(0.0F);
	//   15   35:aload_0         
	//   16   36:fconst_0        
	//   17   37:invokevirtual   #558 <Method void a(float)>
		else
	//*  18   40:goto            51
			d.b(0.0F);
	//   19   43:aload_0         
	//   20   44:getfield        #101 <Field e d>
	//   21   47:fconst_0        
	//   22   48:invokevirtual   #560 <Method void android.support.design.widget.e.b(float)>
		J = true;
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:putfield        #562 <Field boolean J>
	//   26   56:return          
	}

	private void e()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #380 <Field EditText a>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(g())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #590 <Method boolean g()>
	//*   6   12:ifeq            261
		{
			if(z == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #492 <Field CheckableImageButton z>
	//*   9   19:ifnonnull       95
			{
				z = (CheckableImageButton)LayoutInflater.from(getContext()).inflate(android.support.design.a.h.design_text_input_password_icon, ((ViewGroup) (e)), false);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #364 <Method Context getContext()>
	//   13   27:invokestatic    #596 <Method LayoutInflater LayoutInflater.from(Context)>
	//   14   30:getstatic       #601 <Field int android.support.design.a$h.design_text_input_password_icon>
	//   15   33:aload_0         
	//   16   34:getfield        #122 <Field FrameLayout e>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #605 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   19   41:checkcast       #494 <Class CheckableImageButton>
	//   20   44:putfield        #492 <Field CheckableImageButton z>
				z.setImageDrawable(x);
	//   21   47:aload_0         
	//   22   48:getfield        #492 <Field CheckableImageButton z>
	//   23   51:aload_0         
	//   24   52:getfield        #245 <Field Drawable x>
	//   25   55:invokevirtual   #608 <Method void CheckableImageButton.setImageDrawable(Drawable)>
				z.setContentDescription(y);
	//   26   58:aload_0         
	//   27   59:getfield        #492 <Field CheckableImageButton z>
	//   28   62:aload_0         
	//   29   63:getfield        #250 <Field CharSequence y>
	//   30   66:invokevirtual   #611 <Method void CheckableImageButton.setContentDescription(CharSequence)>
				e.addView(((View) (z)));
	//   31   69:aload_0         
	//   32   70:getfield        #122 <Field FrameLayout e>
	//   33   73:aload_0         
	//   34   74:getfield        #492 <Field CheckableImageButton z>
	//   35   77:invokevirtual   #612 <Method void FrameLayout.addView(View)>
				z.setOnClickListener(new android.view.View.OnClickListener() {

					public void onClick(View view)
					{
						android.support.design.widget.TextInputLayout.a(a, false);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field TextInputLayout a>
					//    2    4:iconst_0        
					//    3    5:invokestatic    #25  <Method void android.support.design.widget.TextInputLayout.a(TextInputLayout, boolean)>
					//    4    8:return          
					}

					final TextInputLayout a;

			
			{
				a = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   36   80:aload_0         
	//   37   81:getfield        #492 <Field CheckableImageButton z>
	//   38   84:new             #12  <Class TextInputLayout$4>
	//   39   87:dup             
	//   40   88:aload_0         
	//   41   89:invokespecial   #613 <Method void TextInputLayout$4(TextInputLayout)>
	//   42   92:invokevirtual   #617 <Method void CheckableImageButton.setOnClickListener(android.view.View$OnClickListener)>
			}
			if(a != null && android.support.v4.view.s.j(((View) (a))) <= 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #380 <Field EditText a>
	//*  45   99:ifnull          126
	//*  46  102:aload_0         
	//*  47  103:getfield        #380 <Field EditText a>
	//*  48  106:invokestatic    #619 <Method int s.j(View)>
	//*  49  109:ifgt            126
				a.setMinimumHeight(android.support.v4.view.s.j(((View) (z))));
	//   50  112:aload_0         
	//   51  113:getfield        #380 <Field EditText a>
	//   52  116:aload_0         
	//   53  117:getfield        #492 <Field CheckableImageButton z>
	//   54  120:invokestatic    #619 <Method int s.j(View)>
	//   55  123:invokevirtual   #622 <Method void EditText.setMinimumHeight(int)>
			z.setVisibility(0);
	//   56  126:aload_0         
	//   57  127:getfield        #492 <Field CheckableImageButton z>
	//   58  130:iconst_0        
	//   59  131:invokevirtual   #623 <Method void CheckableImageButton.setVisibility(int)>
			z.setChecked(A);
	//   60  134:aload_0         
	//   61  135:getfield        #492 <Field CheckableImageButton z>
	//   62  138:aload_0         
	//   63  139:getfield        #484 <Field boolean A>
	//   64  142:invokevirtual   #497 <Method void CheckableImageButton.setChecked(boolean)>
			if(B == null)
	//*  65  145:aload_0         
	//*  66  146:getfield        #625 <Field Drawable B>
	//*  67  149:ifnonnull       163
				B = ((Drawable) (new ColorDrawable()));
	//   68  152:aload_0         
	//   69  153:new             #627 <Class ColorDrawable>
	//   70  156:dup             
	//   71  157:invokespecial   #628 <Method void ColorDrawable()>
	//   72  160:putfield        #625 <Field Drawable B>
			B.setBounds(0, 0, z.getMeasuredWidth(), 1);
	//   73  163:aload_0         
	//   74  164:getfield        #625 <Field Drawable B>
	//   75  167:iconst_0        
	//   76  168:iconst_0        
	//   77  169:aload_0         
	//   78  170:getfield        #492 <Field CheckableImageButton z>
	//   79  173:invokevirtual   #631 <Method int CheckableImageButton.getMeasuredWidth()>
	//   80  176:iconst_1        
	//   81  177:invokevirtual   #635 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable adrawable[] = android.support.v4.widget.m.b(((TextView) (a)));
	//   82  180:aload_0         
	//   83  181:getfield        #380 <Field EditText a>
	//   84  184:invokestatic    #640 <Method Drawable[] m.b(TextView)>
	//   85  187:astore_1        
			if(adrawable[2] != B)
	//*  86  188:aload_1         
	//*  87  189:iconst_2        
	//*  88  190:aaload          
	//*  89  191:aload_0         
	//*  90  192:getfield        #625 <Field Drawable B>
	//*  91  195:if_acmpeq       205
				C = adrawable[2];
	//   92  198:aload_0         
	//   93  199:aload_1         
	//   94  200:iconst_2        
	//   95  201:aaload          
	//   96  202:putfield        #642 <Field Drawable C>
			android.support.v4.widget.m.a(((TextView) (a)), adrawable[0], adrawable[1], B, adrawable[3]);
	//   97  205:aload_0         
	//   98  206:getfield        #380 <Field EditText a>
	//   99  209:aload_1         
	//  100  210:iconst_0        
	//  101  211:aaload          
	//  102  212:aload_1         
	//  103  213:iconst_1        
	//  104  214:aaload          
	//  105  215:aload_0         
	//  106  216:getfield        #625 <Field Drawable B>
	//  107  219:aload_1         
	//  108  220:iconst_3        
	//  109  221:aaload          
	//  110  222:invokestatic    #645 <Method void m.a(TextView, Drawable, Drawable, Drawable, Drawable)>
			z.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), a.getPaddingBottom());
	//  111  225:aload_0         
	//  112  226:getfield        #492 <Field CheckableImageButton z>
	//  113  229:aload_0         
	//  114  230:getfield        #380 <Field EditText a>
	//  115  233:invokevirtual   #648 <Method int EditText.getPaddingLeft()>
	//  116  236:aload_0         
	//  117  237:getfield        #380 <Field EditText a>
	//  118  240:invokevirtual   #651 <Method int EditText.getPaddingTop()>
	//  119  243:aload_0         
	//  120  244:getfield        #380 <Field EditText a>
	//  121  247:invokevirtual   #654 <Method int EditText.getPaddingRight()>
	//  122  250:aload_0         
	//  123  251:getfield        #380 <Field EditText a>
	//  124  254:invokevirtual   #469 <Method int EditText.getPaddingBottom()>
	//  125  257:invokevirtual   #657 <Method void CheckableImageButton.setPadding(int, int, int, int)>
			return;
	//  126  260:return          
		}
		if(z != null && z.getVisibility() == 0)
	//* 127  261:aload_0         
	//* 128  262:getfield        #492 <Field CheckableImageButton z>
	//* 129  265:ifnull          287
	//* 130  268:aload_0         
	//* 131  269:getfield        #492 <Field CheckableImageButton z>
	//* 132  272:invokevirtual   #658 <Method int CheckableImageButton.getVisibility()>
	//* 133  275:ifne            287
			z.setVisibility(8);
	//  134  278:aload_0         
	//  135  279:getfield        #492 <Field CheckableImageButton z>
	//  136  282:bipush          8
	//  137  284:invokevirtual   #623 <Method void CheckableImageButton.setVisibility(int)>
		if(B != null)
	//* 138  287:aload_0         
	//* 139  288:getfield        #625 <Field Drawable B>
	//* 140  291:ifnull          337
		{
			Drawable adrawable1[] = android.support.v4.widget.m.b(((TextView) (a)));
	//  141  294:aload_0         
	//  142  295:getfield        #380 <Field EditText a>
	//  143  298:invokestatic    #640 <Method Drawable[] m.b(TextView)>
	//  144  301:astore_1        
			if(adrawable1[2] == B)
	//* 145  302:aload_1         
	//* 146  303:iconst_2        
	//* 147  304:aaload          
	//* 148  305:aload_0         
	//* 149  306:getfield        #625 <Field Drawable B>
	//* 150  309:if_acmpne       337
			{
				android.support.v4.widget.m.a(((TextView) (a)), adrawable1[0], adrawable1[1], C, adrawable1[3]);
	//  151  312:aload_0         
	//  152  313:getfield        #380 <Field EditText a>
	//  153  316:aload_1         
	//  154  317:iconst_0        
	//  155  318:aaload          
	//  156  319:aload_1         
	//  157  320:iconst_1        
	//  158  321:aaload          
	//  159  322:aload_0         
	//  160  323:getfield        #642 <Field Drawable C>
	//  161  326:aload_1         
	//  162  327:iconst_3        
	//  163  328:aaload          
	//  164  329:invokestatic    #645 <Method void m.a(TextView, Drawable, Drawable, Drawable, Drawable)>
				B = null;
	//  165  332:aload_0         
	//  166  333:aconst_null     
	//  167  334:putfield        #625 <Field Drawable B>
			}
		}
	//  168  337:return          
	}

	private boolean f()
	{
		return a != null && (a.getTransformationMethod() instanceof PasswordTransformationMethod);
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field EditText a>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field EditText a>
	//    5   11:invokevirtual   #662 <Method android.text.method.TransformationMethod EditText.getTransformationMethod()>
	//    6   14:instanceof      #486 <Class PasswordTransformationMethod>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private boolean g()
	{
		return w && (f() || A);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field boolean w>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:invokespecial   #478 <Method boolean f()>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #484 <Field boolean A>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void h()
	{
		if(x != null && (E || G))
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field Drawable x>
	//*   2    4:ifnull          103
	//*   3    7:aload_0         
	//*   4    8:getfield        #255 <Field boolean E>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #262 <Field boolean G>
	//*   8   18:ifeq            103
		{
			x = android.support.v4.a.a.a.g(x).mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #245 <Field Drawable x>
	//   12   26:invokestatic    #665 <Method Drawable a.g(Drawable)>
	//   13   29:invokevirtual   #519 <Method Drawable Drawable.mutate()>
	//   14   32:putfield        #245 <Field Drawable x>
			if(E)
	//*  15   35:aload_0         
	//*  16   36:getfield        #255 <Field boolean E>
	//*  17   39:ifeq            53
				android.support.v4.a.a.a.a(x, D);
	//   18   42:aload_0         
	//   19   43:getfield        #245 <Field Drawable x>
	//   20   46:aload_0         
	//   21   47:getfield        #257 <Field ColorStateList D>
	//   22   50:invokestatic    #668 <Method void a.a(Drawable, ColorStateList)>
			if(G)
	//*  23   53:aload_0         
	//*  24   54:getfield        #262 <Field boolean G>
	//*  25   57:ifeq            71
				android.support.v4.a.a.a.a(x, F);
	//   26   60:aload_0         
	//   27   61:getfield        #245 <Field Drawable x>
	//   28   64:aload_0         
	//   29   65:getfield        #269 <Field android.graphics.PorterDuff$Mode F>
	//   30   68:invokestatic    #671 <Method void a.a(Drawable, android.graphics.PorterDuff$Mode)>
			if(z != null && z.getDrawable() != x)
	//*  31   71:aload_0         
	//*  32   72:getfield        #492 <Field CheckableImageButton z>
	//*  33   75:ifnull          103
	//*  34   78:aload_0         
	//*  35   79:getfield        #492 <Field CheckableImageButton z>
	//*  36   82:invokevirtual   #674 <Method Drawable CheckableImageButton.getDrawable()>
	//*  37   85:aload_0         
	//*  38   86:getfield        #245 <Field Drawable x>
	//*  39   89:if_acmpeq       103
				z.setImageDrawable(x);
	//   40   92:aload_0         
	//   41   93:getfield        #492 <Field CheckableImageButton z>
	//   42   96:aload_0         
	//   43   97:getfield        #245 <Field Drawable x>
	//   44  100:invokevirtual   #608 <Method void CheckableImageButton.setImageDrawable(Drawable)>
		}
	//   45  103:return          
	}

	private void setEditText(EditText edittext)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #380 <Field EditText a>
	//*   2    4:ifnull          18
			throw new IllegalArgumentException("We already have an EditText, can only have one");
	//    3    7:new             #678 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #680 <String "We already have an EditText, can only have one">
	//    6   14:invokespecial   #683 <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(!(edittext instanceof TextInputEditText))
	//*   8   18:aload_1         
	//*   9   19:instanceof      #685 <Class TextInputEditText>
	//*  10   22:ifne            35
			Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
	//   11   25:ldc2            #686 <String "TextInputLayout">
	//   12   28:ldc2            #688 <String "EditText added is not a TextInputEditText. Please switch to using that class instead.">
	//   13   31:invokestatic    #693 <Method int Log.i(String, String)>
	//   14   34:pop             
		a = edittext;
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:putfield        #380 <Field EditText a>
		if(!f())
	//*  18   40:aload_0         
	//*  19   41:invokespecial   #478 <Method boolean f()>
	//*  20   44:ifne            61
			d.c(a.getTypeface());
	//   21   47:aload_0         
	//   22   48:getfield        #101 <Field e d>
	//   23   51:aload_0         
	//   24   52:getfield        #380 <Field EditText a>
	//   25   55:invokevirtual   #696 <Method Typeface EditText.getTypeface()>
	//   26   58:invokevirtual   #699 <Method void e.c(Typeface)>
		d.a(a.getTextSize());
	//   27   61:aload_0         
	//   28   62:getfield        #101 <Field e d>
	//   29   65:aload_0         
	//   30   66:getfield        #380 <Field EditText a>
	//   31   69:invokevirtual   #702 <Method float EditText.getTextSize()>
	//   32   72:invokevirtual   #703 <Method void android.support.design.widget.e.a(float)>
		int i1 = a.getGravity();
	//   33   75:aload_0         
	//   34   76:getfield        #380 <Field EditText a>
	//   35   79:invokevirtual   #706 <Method int EditText.getGravity()>
	//   36   82:istore_2        
		d.b(i1 & 0xffffff8f | 0x30);
	//   37   83:aload_0         
	//   38   84:getfield        #101 <Field e d>
	//   39   87:iload_2         
	//   40   88:bipush          -113
	//   41   90:iand            
	//   42   91:bipush          48
	//   43   93:ior             
	//   44   94:invokevirtual   #142 <Method void android.support.design.widget.e.b(int)>
		d.a(i1);
	//   45   97:aload_0         
	//   46   98:getfield        #101 <Field e d>
	//   47  101:iload_2         
	//   48  102:invokevirtual   #708 <Method void android.support.design.widget.e.a(int)>
		a.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				a.a(android.support.design.widget.TextInputLayout.a(a) ^ true);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TextInputLayout a>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field TextInputLayout a>
			//    4    8:invokestatic    #26  <Method boolean android.support.design.widget.TextInputLayout.a(TextInputLayout)>
			//    5   11:iconst_1        
			//    6   12:ixor            
			//    7   13:invokevirtual   #29  <Method void android.support.design.widget.TextInputLayout.a(boolean)>
				if(a.c)
			//*   8   16:aload_0         
			//*   9   17:getfield        #17  <Field TextInputLayout a>
			//*  10   20:getfield        #33  <Field boolean TextInputLayout.c>
			//*  11   23:ifeq            39
					a.a(editable.length());
			//   12   26:aload_0         
			//   13   27:getfield        #17  <Field TextInputLayout a>
			//   14   30:aload_1         
			//   15   31:invokeinterface #39  <Method int Editable.length()>
			//   16   36:invokevirtual   #42  <Method void android.support.design.widget.TextInputLayout.a(int)>
			//   17   39:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
			{
			//    0    0:return          
			}

			final TextInputLayout a;

			
			{
				a = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TextInputLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   49  105:aload_0         
	//   50  106:getfield        #380 <Field EditText a>
	//   51  109:new             #6   <Class TextInputLayout$1>
	//   52  112:dup             
	//   53  113:aload_0         
	//   54  114:invokespecial   #709 <Method void TextInputLayout$1(TextInputLayout)>
	//   55  117:invokevirtual   #713 <Method void EditText.addTextChangedListener(TextWatcher)>
		if(H == null)
	//*  56  120:aload_0         
	//*  57  121:getfield        #194 <Field ColorStateList H>
	//*  58  124:ifnonnull       138
			H = a.getHintTextColors();
	//   59  127:aload_0         
	//   60  128:aload_0         
	//   61  129:getfield        #380 <Field EditText a>
	//   62  132:invokevirtual   #717 <Method ColorStateList EditText.getHintTextColors()>
	//   63  135:putfield        #194 <Field ColorStateList H>
		if(g && TextUtils.isEmpty(h))
	//*  64  138:aload_0         
	//*  65  139:getfield        #166 <Field boolean g>
	//*  66  142:ifeq            182
	//*  67  145:aload_0         
	//*  68  146:getfield        #719 <Field CharSequence h>
	//*  69  149:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  152:ifeq            182
		{
			f = a.getHint();
	//   71  155:aload_0         
	//   72  156:aload_0         
	//   73  157:getfield        #380 <Field EditText a>
	//   74  160:invokevirtual   #723 <Method CharSequence EditText.getHint()>
	//   75  163:putfield        #725 <Field CharSequence f>
			setHint(f);
	//   76  166:aload_0         
	//   77  167:aload_0         
	//   78  168:getfield        #725 <Field CharSequence f>
	//   79  171:invokevirtual   #176 <Method void setHint(CharSequence)>
			a.setHint(((CharSequence) (null)));
	//   80  174:aload_0         
	//   81  175:getfield        #380 <Field EditText a>
	//   82  178:aconst_null     
	//   83  179:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
		}
		if(r != null)
	//*  84  182:aload_0         
	//*  85  183:getfield        #540 <Field TextView r>
	//*  86  186:ifnull          205
			a(a.getText().length());
	//   87  189:aload_0         
	//   88  190:aload_0         
	//   89  191:getfield        #380 <Field EditText a>
	//   90  194:invokevirtual   #730 <Method Editable EditText.getText()>
	//   91  197:invokeinterface #735 <Method int Editable.length()>
	//   92  202:invokevirtual   #736 <Method void a(int)>
		if(k != null)
	//*  93  205:aload_0         
	//*  94  206:getfield        #351 <Field LinearLayout k>
	//*  95  209:ifnull          216
			b();
	//   96  212:aload_0         
	//   97  213:invokespecial   #382 <Method void b()>
		e();
	//   98  216:aload_0         
	//   99  217:invokespecial   #738 <Method void e()>
		a(false, true);
	//  100  220:aload_0         
	//  101  221:iconst_0        
	//  102  222:iconst_1        
	//  103  223:invokevirtual   #741 <Method void a(boolean, boolean)>
	//  104  226:return          
	}

	private void setHintInternal(CharSequence charsequence)
	{
		h = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #719 <Field CharSequence h>
		d.a(charsequence);
	//    3    5:aload_0         
	//    4    6:getfield        #101 <Field e d>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #744 <Method void android.support.design.widget.e.a(CharSequence)>
	//    7   13:return          
	}

	void a(float f1)
	{
		if(d.g() == f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field e d>
	//*   2    4:invokevirtual   #746 <Method float e.g()>
	//*   3    7:fload_1         
	//*   4    8:fcmpl           
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(L == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #550 <Field ValueAnimator L>
	//*   9   17:ifnonnull       67
		{
			L = new ValueAnimator();
	//   10   20:aload_0         
	//   11   21:new             #552 <Class ValueAnimator>
	//   12   24:dup             
	//   13   25:invokespecial   #747 <Method void ValueAnimator()>
	//   14   28:putfield        #550 <Field ValueAnimator L>
			L.setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.a)));
	//   15   31:aload_0         
	//   16   32:getfield        #550 <Field ValueAnimator L>
	//   17   35:getstatic       #749 <Field android.view.animation.Interpolator android.support.design.widget.a.a>
	//   18   38:invokevirtual   #752 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			L.setDuration(200L);
	//   19   41:aload_0         
	//   20   42:getfield        #550 <Field ValueAnimator L>
	//   21   45:ldc2w           #425 <Long 200L>
	//   22   48:invokevirtual   #755 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   51:pop             
			L.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					a.d.b(((Float)valueanimator.getAnimatedValue()).floatValue());
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field TextInputLayout a>
				//    2    4:getfield        #26  <Field e TextInputLayout.d>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
				//    5   11:checkcast       #34  <Class Float>
				//    6   14:invokevirtual   #38  <Method float Float.floatValue()>
				//    7   17:invokevirtual   #43  <Method void android.support.design.widget.e.b(float)>
				//    8   20:return          
				}

				final TextInputLayout a;

			
			{
				a = TextInputLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TextInputLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   52:aload_0         
	//   25   53:getfield        #550 <Field ValueAnimator L>
	//   26   56:new             #14  <Class TextInputLayout$5>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #756 <Method void TextInputLayout$5(TextInputLayout)>
	//   30   64:invokevirtual   #760 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
		L.setFloatValues(new float[] {
			d.g(), f1
		});
	//   31   67:aload_0         
	//   32   68:getfield        #550 <Field ValueAnimator L>
	//   33   71:iconst_2        
	//   34   72:newarray        float[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:aload_0         
	//   38   77:getfield        #101 <Field e d>
	//   39   80:invokevirtual   #746 <Method float e.g()>
	//   40   83:fastore         
	//   41   84:dup             
	//   42   85:iconst_1        
	//   43   86:fload_1         
	//   44   87:fastore         
	//   45   88:invokevirtual   #764 <Method void ValueAnimator.setFloatValues(float[])>
		L.start();
	//   46   91:aload_0         
	//   47   92:getfield        #550 <Field ValueAnimator L>
	//   48   95:invokevirtual   #765 <Method void ValueAnimator.start()>
	//   49   98:return          
	}

	void a(int i1)
	{
		boolean flag1 = v;
	//    0    0:aload_0         
	//    1    1:getfield        #538 <Field boolean v>
	//    2    4:istore          4
		if(s == -1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #767 <Field int s>
	//*   5   10:iconst_m1       
	//*   6   11:icmpne          33
		{
			r.setText(((CharSequence) (String.valueOf(i1))));
	//    7   14:aload_0         
	//    8   15:getfield        #540 <Field TextView r>
	//    9   18:iload_1         
	//   10   19:invokestatic    #773 <Method String String.valueOf(int)>
	//   11   22:invokevirtual   #413 <Method void TextView.setText(CharSequence)>
			v = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #538 <Field boolean v>
		} else
	//*  15   30:goto            132
		{
			boolean flag;
			if(i1 > s)
	//*  16   33:iload_1         
	//*  17   34:aload_0         
	//*  18   35:getfield        #767 <Field int s>
	//*  19   38:icmple          46
				flag = true;
	//   20   41:iconst_1        
	//   21   42:istore_3        
			else
	//*  22   43:goto            48
				flag = false;
	//   23   46:iconst_0        
	//   24   47:istore_3        
			v = flag;
	//   25   48:aload_0         
	//   26   49:iload_3         
	//   27   50:putfield        #538 <Field boolean v>
			if(flag1 != v)
	//*  28   53:iload           4
	//*  29   55:aload_0         
	//*  30   56:getfield        #538 <Field boolean v>
	//*  31   59:icmpeq          94
			{
				TextView textview = r;
	//   32   62:aload_0         
	//   33   63:getfield        #540 <Field TextView r>
	//   34   66:astore          5
				int j1;
				if(v)
	//*  35   68:aload_0         
	//*  36   69:getfield        #538 <Field boolean v>
	//*  37   72:ifeq            83
					j1 = u;
	//   38   75:aload_0         
	//   39   76:getfield        #232 <Field int u>
	//   40   79:istore_2        
				else
	//*  41   80:goto            88
					j1 = t;
	//   42   83:aload_0         
	//   43   84:getfield        #227 <Field int t>
	//   44   87:istore_2        
				android.support.v4.widget.m.a(textview, j1);
	//   45   88:aload           5
	//   46   90:iload_2         
	//   47   91:invokestatic    #775 <Method void m.a(TextView, int)>
			}
			r.setText(((CharSequence) (getContext().getString(android.support.design.a.i.character_counter_pattern, new Object[] {
				Integer.valueOf(i1), Integer.valueOf(s)
			}))));
	//   48   94:aload_0         
	//   49   95:getfield        #540 <Field TextView r>
	//   50   98:aload_0         
	//   51   99:invokevirtual   #364 <Method Context getContext()>
	//   52  102:getstatic       #780 <Field int android.support.design.a$i.character_counter_pattern>
	//   53  105:iconst_2        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:iload_1         
	//   58  112:invokestatic    #787 <Method Integer Integer.valueOf(int)>
	//   59  115:aastore         
	//   60  116:dup             
	//   61  117:iconst_1        
	//   62  118:aload_0         
	//   63  119:getfield        #767 <Field int s>
	//   64  122:invokestatic    #787 <Method Integer Integer.valueOf(int)>
	//   65  125:aastore         
	//   66  126:invokevirtual   #793 <Method String Context.getString(int, Object[])>
	//   67  129:invokevirtual   #413 <Method void TextView.setText(CharSequence)>
		}
		if(a != null && flag1 != v)
	//*  68  132:aload_0         
	//*  69  133:getfield        #380 <Field EditText a>
	//*  70  136:ifnull          157
	//*  71  139:iload           4
	//*  72  141:aload_0         
	//*  73  142:getfield        #538 <Field boolean v>
	//*  74  145:icmpeq          157
		{
			a(false);
	//   75  148:aload_0         
	//   76  149:iconst_0        
	//   77  150:invokevirtual   #456 <Method void a(boolean)>
			c();
	//   78  153:aload_0         
	//   79  154:invokespecial   #454 <Method void c()>
		}
	//   80  157:return          
	}

	void a(boolean flag)
	{
		a(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #741 <Method void a(boolean, boolean)>
	//    4    6:return          
	}

	void a(boolean flag, boolean flag1)
	{
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		flag3 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #796 <Method boolean isEnabled()>
	//    2    4:istore          4
		if(a != null && !TextUtils.isEmpty(((CharSequence) (a.getText()))))
	//*   3    6:aload_0         
	//*   4    7:getfield        #380 <Field EditText a>
	//*   5   10:ifnull          31
	//*   6   13:aload_0         
	//*   7   14:getfield        #380 <Field EditText a>
	//*   8   17:invokevirtual   #730 <Method Editable EditText.getText()>
	//*   9   20:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            31
			flag2 = true;
	//   11   26:iconst_1        
	//   12   27:istore_3        
		else
	//*  13   28:goto            33
			flag2 = false;
	//   14   31:iconst_0        
	//   15   32:istore_3        
		flag4 = a(getDrawableState(), 0x101009c);
	//   16   33:aload_0         
	//   17   34:invokevirtual   #800 <Method int[] getDrawableState()>
	//   18   37:ldc2            #801 <Int 0x101009c>
	//   19   40:invokestatic    #803 <Method boolean a(int[], int)>
	//   20   43:istore          5
		flag5 = TextUtils.isEmpty(getError());
	//   21   45:aload_0         
	//   22   46:invokevirtual   #806 <Method CharSequence getError()>
	//   23   49:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   24   52:istore          6
		if(H != null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #194 <Field ColorStateList H>
	//*  27   58:ifnull          72
			d.b(H);
	//   28   61:aload_0         
	//   29   62:getfield        #101 <Field e d>
	//   30   65:aload_0         
	//   31   66:getfield        #194 <Field ColorStateList H>
	//   32   69:invokevirtual   #809 <Method void android.support.design.widget.e.b(ColorStateList)>
		if(!flag3 || !v || r == null) goto _L2; else goto _L1
	//   33   72:iload           4
	//   34   74:ifeq            116
	//   35   77:aload_0         
	//   36   78:getfield        #538 <Field boolean v>
	//   37   81:ifeq            116
	//   38   84:aload_0         
	//   39   85:getfield        #540 <Field TextView r>
	//   40   88:ifnull          116
_L1:
		e e1;
		ColorStateList colorstatelist;
		e1 = d;
	//   41   91:aload_0         
	//   42   92:getfield        #101 <Field e d>
	//   43   95:astore          7
		colorstatelist = r.getTextColors();
	//   44   97:aload_0         
	//   45   98:getfield        #540 <Field TextView r>
	//   46  101:invokevirtual   #812 <Method ColorStateList TextView.getTextColors()>
	//   47  104:astore          8
_L4:
		e1.a(colorstatelist);
	//   48  106:aload           7
	//   49  108:aload           8
	//   50  110:invokevirtual   #814 <Method void android.support.design.widget.e.a(ColorStateList)>
		break; /* Loop/switch isn't completed */
	//   51  113:goto            170
_L2:
		if(flag3 && flag4 && I != null)
	//*  52  116:iload           4
	//*  53  118:ifeq            148
	//*  54  121:iload           5
	//*  55  123:ifeq            148
	//*  56  126:aload_0         
	//*  57  127:getfield        #192 <Field ColorStateList I>
	//*  58  130:ifnull          148
		{
			e1 = d;
	//   59  133:aload_0         
	//   60  134:getfield        #101 <Field e d>
	//   61  137:astore          7
			colorstatelist = I;
	//   62  139:aload_0         
	//   63  140:getfield        #192 <Field ColorStateList I>
	//   64  143:astore          8
			continue; /* Loop/switch isn't completed */
	//   65  145:goto            106
		}
		if(H == null)
			break; /* Loop/switch isn't completed */
	//   66  148:aload_0         
	//   67  149:getfield        #194 <Field ColorStateList H>
	//   68  152:ifnull          170
		e1 = d;
	//   69  155:aload_0         
	//   70  156:getfield        #101 <Field e d>
	//   71  159:astore          7
		colorstatelist = H;
	//   72  161:aload_0         
	//   73  162:getfield        #194 <Field ColorStateList H>
	//   74  165:astore          8
		if(true) goto _L4; else goto _L3
	//   75  167:goto            106
_L3:
		if(!flag2 && (!isEnabled() || !flag4 && !(true ^ flag5)))
	//*  76  170:iload_3         
	//*  77  171:ifne            213
	//*  78  174:aload_0         
	//*  79  175:invokevirtual   #796 <Method boolean isEnabled()>
	//*  80  178:ifeq            196
	//*  81  181:iload           5
	//*  82  183:ifne            213
	//*  83  186:iconst_1        
	//*  84  187:iload           6
	//*  85  189:ixor            
	//*  86  190:ifeq            196
	//*  87  193:goto            213
		{
			if(flag1 || !J)
	//*  88  196:iload_2         
	//*  89  197:ifne            207
	//*  90  200:aload_0         
	//*  91  201:getfield        #562 <Field boolean J>
	//*  92  204:ifne            229
			{
				d(flag);
	//   93  207:aload_0         
	//   94  208:iload_1         
	//   95  209:invokespecial   #816 <Method void d(boolean)>
				return;
	//   96  212:return          
			}
		} else
		if(flag1 || J)
	//*  97  213:iload_2         
	//*  98  214:ifne            224
	//*  99  217:aload_0         
	//* 100  218:getfield        #562 <Field boolean J>
	//* 101  221:ifeq            229
			c(flag);
	//  102  224:aload_0         
	//  103  225:iload_1         
	//  104  226:invokespecial   #818 <Method void c(boolean)>
		return;
	//  105  229:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof EditText)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #466 <Class EditText>
	//*   2    4:ifeq            64
		{
			android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams);
	//    3    7:new             #821 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #824 <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   15:astore          4
			layoutparams1.gravity = layoutparams1.gravity & 0xffffff8f | 0x10;
	//    8   17:aload           4
	//    9   19:aload           4
	//   10   21:getfield        #827 <Field int android.widget.FrameLayout$LayoutParams.gravity>
	//   11   24:bipush          -113
	//   12   26:iand            
	//   13   27:bipush          16
	//   14   29:ior             
	//   15   30:putfield        #827 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			e.addView(view, ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   16   33:aload_0         
	//   17   34:getfield        #122 <Field FrameLayout e>
	//   18   37:aload_1         
	//   19   38:aload           4
	//   20   40:invokevirtual   #828 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			e.setLayoutParams(layoutparams);
	//   21   43:aload_0         
	//   22   44:getfield        #122 <Field FrameLayout e>
	//   23   47:aload_3         
	//   24   48:invokevirtual   #831 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			a();
	//   25   51:aload_0         
	//   26   52:invokespecial   #832 <Method void a()>
			setEditText((EditText)view);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:checkcast       #466 <Class EditText>
	//   30   60:invokespecial   #834 <Method void setEditText(EditText)>
			return;
	//   31   63:return          
		} else
		{
			super.addView(view, i1, layoutparams);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:iload_2         
	//   35   67:aload_3         
	//   36   68:invokespecial   #836 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   37   71:return          
		}
	}

	public void dispatchProvideAutofillStructure(ViewStructure viewstructure, int i1)
	{
		CharSequence charsequence;
		if(f == null || a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #725 <Field CharSequence f>
	//*   2    4:ifnull          62
	//*   3    7:aload_0         
	//*   4    8:getfield        #380 <Field EditText a>
	//*   5   11:ifnonnull       17
			break MISSING_BLOCK_LABEL_62;
	//    6   14:goto            62
		charsequence = a.getHint();
	//    7   17:aload_0         
	//    8   18:getfield        #380 <Field EditText a>
	//    9   21:invokevirtual   #723 <Method CharSequence EditText.getHint()>
	//   10   24:astore_3        
		a.setHint(f);
	//   11   25:aload_0         
	//   12   26:getfield        #380 <Field EditText a>
	//   13   29:aload_0         
	//   14   30:getfield        #725 <Field CharSequence f>
	//   15   33:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
		super.dispatchProvideAutofillStructure(viewstructure, i1);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iload_2         
	//   19   39:invokespecial   #840 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		a.setHint(charsequence);
	//   20   42:aload_0         
	//   21   43:getfield        #380 <Field EditText a>
	//   22   46:aload_3         
	//   23   47:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
		return;
	//   24   50:return          
		viewstructure;
	//   25   51:astore_1        
		a.setHint(charsequence);
	//   26   52:aload_0         
	//   27   53:getfield        #380 <Field EditText a>
	//   28   56:aload_3         
	//   29   57:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
		throw viewstructure;
	//   30   60:aload_1         
	//   31   61:athrow          
		super.dispatchProvideAutofillStructure(viewstructure, i1);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #840 <Method void LinearLayout.dispatchProvideAutofillStructure(ViewStructure, int)>
		return;
	//   36   68:return          
	}

	protected void dispatchRestoreInstanceState(SparseArray sparsearray)
	{
		O = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #459 <Field boolean O>
		super.dispatchRestoreInstanceState(sparsearray);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #844 <Method void LinearLayout.dispatchRestoreInstanceState(SparseArray)>
		O = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #459 <Field boolean O>
	//    9   15:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #850 <Method void LinearLayout.draw(Canvas)>
		if(g)
	//*   3    5:aload_0         
	//*   4    6:getfield        #166 <Field boolean g>
	//*   5    9:ifeq            20
			d.a(canvas);
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field e d>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #852 <Method void android.support.design.widget.e.a(Canvas)>
	//   10   20:return          
	}

	protected void drawableStateChanged()
	{
		if(N)
	//*   0    0:aload_0         
	//*   1    1:getfield        #855 <Field boolean N>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		N = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #855 <Field boolean N>
		super.drawableStateChanged();
	//    9   15:aload_0         
	//   10   16:invokespecial   #857 <Method void LinearLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #800 <Method int[] getDrawableState()>
	//   13   23:astore_3        
		if(!android.support.v4.view.s.x(((View) (this))) || !isEnabled())
	//*  14   24:aload_0         
	//*  15   25:invokestatic    #860 <Method boolean s.x(View)>
	//*  16   28:ifeq            41
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #796 <Method boolean isEnabled()>
	//*  19   35:ifeq            41
	//*  20   38:goto            43
			flag1 = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		a(flag1);
	//   23   43:aload_0         
	//   24   44:iload_2         
	//   25   45:invokevirtual   #456 <Method void a(boolean)>
		c();
	//   26   48:aload_0         
	//   27   49:invokespecial   #454 <Method void c()>
		boolean flag;
		if(d != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #101 <Field e d>
	//*  30   56:ifnull          73
			flag = d.a(ai) | false;
	//   31   59:aload_0         
	//   32   60:getfield        #101 <Field e d>
	//   33   63:aload_3         
	//   34   64:invokevirtual   #863 <Method boolean android.support.design.widget.e.a(int[])>
	//   35   67:iconst_0        
	//   36   68:ior             
	//   37   69:istore_1        
		else
	//*  38   70:goto            75
			flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_1        
		if(flag)
	//*  41   75:iload_1         
	//*  42   76:ifeq            83
			invalidate();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #866 <Method void invalidate()>
		N = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #855 <Field boolean N>
	//   48   88:return          
	}

	public int getCounterMaxLength()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #767 <Field int s>
	//    2    4:ireturn         
	}

	public EditText getEditText()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field EditText a>
	//    2    4:areturn         
	}

	public CharSequence getError()
	{
		if(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #389 <Field boolean n>
	//*   2    4:ifeq            12
			return q;
	//    3    7:aload_0         
	//    4    8:getfield        #387 <Field CharSequence q>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public CharSequence getHint()
	{
		if(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean g>
	//*   2    4:ifeq            12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #719 <Field CharSequence h>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public CharSequence getPasswordVisibilityToggleContentDescription()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field CharSequence y>
	//    2    4:areturn         
	}

	public Drawable getPasswordVisibilityToggleDrawable()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field Drawable x>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #873 <Field Typeface m>
	//    2    4:areturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #877 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		if(g && a != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #166 <Field boolean g>
	//*   9   15:ifeq            136
	//*  10   18:aload_0         
	//*  11   19:getfield        #380 <Field EditText a>
	//*  12   22:ifnull          136
		{
			Rect rect = j;
	//   13   25:aload_0         
	//   14   26:getfield        #94  <Field Rect j>
	//   15   29:astore          6
			android.support.design.widget.o.b(((ViewGroup) (this)), ((View) (a)), rect);
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:getfield        #380 <Field EditText a>
	//   19   36:aload           6
	//   20   38:invokestatic    #882 <Method void android.support.design.widget.o.b(ViewGroup, View, Rect)>
			i1 = rect.left + a.getCompoundPaddingLeft();
	//   21   41:aload           6
	//   22   43:getfield        #885 <Field int Rect.left>
	//   23   46:aload_0         
	//   24   47:getfield        #380 <Field EditText a>
	//   25   50:invokevirtual   #888 <Method int EditText.getCompoundPaddingLeft()>
	//   26   53:iadd            
	//   27   54:istore_2        
			k1 = rect.right - a.getCompoundPaddingRight();
	//   28   55:aload           6
	//   29   57:getfield        #891 <Field int Rect.right>
	//   30   60:aload_0         
	//   31   61:getfield        #380 <Field EditText a>
	//   32   64:invokevirtual   #894 <Method int EditText.getCompoundPaddingRight()>
	//   33   67:isub            
	//   34   68:istore          4
			d.a(i1, rect.top + a.getCompoundPaddingTop(), k1, rect.bottom - a.getCompoundPaddingBottom());
	//   35   70:aload_0         
	//   36   71:getfield        #101 <Field e d>
	//   37   74:iload_2         
	//   38   75:aload           6
	//   39   77:getfield        #897 <Field int Rect.top>
	//   40   80:aload_0         
	//   41   81:getfield        #380 <Field EditText a>
	//   42   84:invokevirtual   #900 <Method int EditText.getCompoundPaddingTop()>
	//   43   87:iadd            
	//   44   88:iload           4
	//   45   90:aload           6
	//   46   92:getfield        #903 <Field int Rect.bottom>
	//   47   95:aload_0         
	//   48   96:getfield        #380 <Field EditText a>
	//   49   99:invokevirtual   #906 <Method int EditText.getCompoundPaddingBottom()>
	//   50  102:isub            
	//   51  103:invokevirtual   #908 <Method void android.support.design.widget.e.a(int, int, int, int)>
			d.b(i1, getPaddingTop(), k1, l1 - j1 - getPaddingBottom());
	//   52  106:aload_0         
	//   53  107:getfield        #101 <Field e d>
	//   54  110:iload_2         
	//   55  111:aload_0         
	//   56  112:invokevirtual   #909 <Method int getPaddingTop()>
	//   57  115:iload           4
	//   58  117:iload           5
	//   59  119:iload_3         
	//   60  120:isub            
	//   61  121:aload_0         
	//   62  122:invokevirtual   #910 <Method int getPaddingBottom()>
	//   63  125:isub            
	//   64  126:invokevirtual   #912 <Method void android.support.design.widget.e.b(int, int, int, int)>
			d.i();
	//   65  129:aload_0         
	//   66  130:getfield        #101 <Field e d>
	//   67  133:invokevirtual   #914 <Method void e.i()>
		}
	//   68  136:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #738 <Method void e()>
		super.onMeasure(i1, j1);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #918 <Method void LinearLayout.onMeasure(int, int)>
	//    6   10:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class TextInputLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #922 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #16  <Class TextInputLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #925 <Method Parcelable android.support.design.widget.TextInputLayout$SavedState.a()>
	//   13   23:invokespecial   #922 <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setError(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #927 <Field CharSequence android.support.design.widget.TextInputLayout$SavedState.a>
	//   17   31:invokevirtual   #930 <Method void setError(CharSequence)>
		if(((SavedState) (parcelable)).b)
	//*  18   34:aload_1         
	//*  19   35:getfield        #932 <Field boolean android.support.design.widget.TextInputLayout$SavedState.b>
	//*  20   38:ifeq            46
			b(true);
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:invokespecial   #330 <Method void b(boolean)>
		requestLayout();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #933 <Method void requestLayout()>
	//   26   50:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #16  <Class TextInputLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #936 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #938 <Method void TextInputLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		if(p)
	//*   6   12:aload_0         
	//*   7   13:getfield        #397 <Field boolean p>
	//*   8   16:ifeq            27
			savedstate.a = getError();
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #806 <Method CharSequence getError()>
	//   12   24:putfield        #927 <Field CharSequence android.support.design.widget.TextInputLayout$SavedState.a>
		savedstate.b = A;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #484 <Field boolean A>
	//   16   32:putfield        #932 <Field boolean android.support.design.widget.TextInputLayout$SavedState.b>
		return ((Parcelable) (savedstate));
	//   17   35:aload_1         
	//   18   36:areturn         
	}

	public void setCounterEnabled(boolean flag)
	{
		Exception exception;
		if(c != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #942 <Field boolean c>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          164
		{
			if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            146
			{
				r = ((TextView) (new AppCompatTextView(getContext())));
	//    6   12:aload_0         
	//    7   13:new             #944 <Class AppCompatTextView>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #364 <Method Context getContext()>
	//   11   21:invokespecial   #945 <Method void AppCompatTextView(Context)>
	//   12   24:putfield        #540 <Field TextView r>
				r.setId(android.support.design.a.f.textinput_counter);
	//   13   27:aload_0         
	//   14   28:getfield        #540 <Field TextView r>
	//   15   31:getstatic       #950 <Field int android.support.design.a$f.textinput_counter>
	//   16   34:invokevirtual   #953 <Method void TextView.setId(int)>
				if(m != null)
	//*  17   37:aload_0         
	//*  18   38:getfield        #873 <Field Typeface m>
	//*  19   41:ifnull          55
					r.setTypeface(m);
	//   20   44:aload_0         
	//   21   45:getfield        #540 <Field TextView r>
	//   22   48:aload_0         
	//   23   49:getfield        #873 <Field Typeface m>
	//   24   52:invokevirtual   #955 <Method void TextView.setTypeface(Typeface)>
				r.setMaxLines(1);
	//   25   55:aload_0         
	//   26   56:getfield        #540 <Field TextView r>
	//   27   59:iconst_1        
	//   28   60:invokevirtual   #958 <Method void TextView.setMaxLines(int)>
				try
				{
					android.support.v4.widget.m.a(r, t);
	//   29   63:aload_0         
	//   30   64:getfield        #540 <Field TextView r>
	//   31   67:aload_0         
	//   32   68:getfield        #227 <Field int t>
	//   33   71:invokestatic    #775 <Method void m.a(TextView, int)>
				}
	//*  34   74:goto            104
	//*  35   77:aload_0         
	//*  36   78:getfield        #540 <Field TextView r>
	//*  37   81:getstatic       #963 <Field int android.support.v7.a.a$i.TextAppearance_AppCompat_Caption>
	//*  38   84:invokestatic    #775 <Method void m.a(TextView, int)>
	//*  39   87:aload_0         
	//*  40   88:getfield        #540 <Field TextView r>
	//*  41   91:aload_0         
	//*  42   92:invokevirtual   #364 <Method Context getContext()>
	//*  43   95:getstatic       #968 <Field int android.support.v7.a.a$c.error_color_material>
	//*  44   98:invokestatic    #974 <Method int android.support.v4.content.a.getColor(Context, int)>
	//*  45  101:invokevirtual   #977 <Method void TextView.setTextColor(int)>
	//*  46  104:aload_0         
	//*  47  105:aload_0         
	//*  48  106:getfield        #540 <Field TextView r>
	//*  49  109:iconst_m1       
	//*  50  110:invokespecial   #978 <Method void a(TextView, int)>
	//*  51  113:aload_0         
	//*  52  114:getfield        #380 <Field EditText a>
	//*  53  117:ifnonnull       130
	//*  54  120:iconst_0        
	//*  55  121:istore_2        
	//*  56  122:aload_0         
	//*  57  123:iload_2         
	//*  58  124:invokevirtual   #736 <Method void a(int)>
	//*  59  127:goto            159
	//*  60  130:aload_0         
	//*  61  131:getfield        #380 <Field EditText a>
	//*  62  134:invokevirtual   #730 <Method Editable EditText.getText()>
	//*  63  137:invokeinterface #735 <Method int Editable.length()>
	//*  64  142:istore_2        
	//*  65  143:goto            122
	//*  66  146:aload_0         
	//*  67  147:aload_0         
	//*  68  148:getfield        #540 <Field TextView r>
	//*  69  151:invokespecial   #980 <Method void a(TextView)>
	//*  70  154:aload_0         
	//*  71  155:aconst_null     
	//*  72  156:putfield        #540 <Field TextView r>
	//*  73  159:aload_0         
	//*  74  160:iload_1         
	//*  75  161:putfield        #942 <Field boolean c>
	//*  76  164:return          
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					android.support.v4.widget.m.a(r, android.support.v7.a.a.i.TextAppearance_AppCompat_Caption);
					r.setTextColor(android.support.v4.content.a.getColor(getContext(), android.support.v7.a.a.c.error_color_material));
				}
				a(r, -1);
				int i1;
				if(a == null)
					i1 = 0;
				else
					i1 = a.getText().length();
				a(i1);
			} else
			{
				a(r);
				r = null;
			}
			c = flag;
		}
	//*  77  165:astore_3        
	//*  78  166:goto            77
	}

	public void setCounterMaxLength(int i1)
	{
		if(s != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #767 <Field int s>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          62
		{
			if(i1 <= 0)
	//*   4    8:iload_1         
	//*   5    9:ifle            20
	//*   6   12:aload_0         
	//*   7   13:iload_1         
	//*   8   14:putfield        #767 <Field int s>
	//*   9   17:goto            25
				i1 = -1;
	//   10   20:iconst_m1       
	//   11   21:istore_1        
			s = i1;
	//*  12   22:goto            12
			if(c)
	//*  13   25:aload_0         
	//*  14   26:getfield        #942 <Field boolean c>
	//*  15   29:ifeq            62
			{
				if(a == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #380 <Field EditText a>
	//*  18   36:ifnonnull       44
					i1 = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
				else
	//*  21   41:goto            57
					i1 = a.getText().length();
	//   22   44:aload_0         
	//   23   45:getfield        #380 <Field EditText a>
	//   24   48:invokevirtual   #730 <Method Editable EditText.getText()>
	//   25   51:invokeinterface #735 <Method int Editable.length()>
	//   26   56:istore_1        
				a(i1);
	//   27   57:aload_0         
	//   28   58:iload_1         
	//   29   59:invokevirtual   #736 <Method void a(int)>
			}
		}
	//   30   62:return          
	}

	public void setEnabled(boolean flag)
	{
		a(((ViewGroup) (this)), flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #348 <Method void a(ViewGroup, boolean)>
		super.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #981 <Method void LinearLayout.setEnabled(boolean)>
	//    6   10:return          
	}

	public void setError(CharSequence charsequence)
	{
		boolean flag;
		if(android.support.v4.view.s.x(((View) (this))) && isEnabled() && (b == null || !TextUtils.equals(b.getText(), charsequence)))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #860 <Method boolean s.x(View)>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #796 <Method boolean isEnabled()>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #399 <Field TextView b>
	//*   8   18:ifnull          35
	//*   9   21:aload_0         
	//*  10   22:getfield        #399 <Field TextView b>
	//*  11   25:invokevirtual   #983 <Method CharSequence TextView.getText()>
	//*  12   28:aload_1         
	//*  13   29:invokestatic    #987 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  14   32:ifne            40
			flag = true;
	//   15   35:iconst_1        
	//   16   36:istore_2        
		else
	//*  17   37:goto            42
			flag = false;
	//   18   40:iconst_0        
	//   19   41:istore_2        
		a(charsequence, flag);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:iload_2         
	//   23   45:invokespecial   #989 <Method void a(CharSequence, boolean)>
	//   24   48:return          
	}

	public void setErrorEnabled(boolean flag)
	{
		if(n == flag) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field boolean n>
	//    2    4:iload_1         
	//    3    5:icmpeq          205
_L1:
		if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #399 <Field TextView b>
	//*   6   12:ifnull          25
			b.animate().cancel();
	//    7   15:aload_0         
	//    8   16:getfield        #399 <Field TextView b>
	//    9   19:invokevirtual   #405 <Method ViewPropertyAnimator TextView.animate()>
	//   10   22:invokevirtual   #410 <Method void ViewPropertyAnimator.cancel()>
		if(!flag) goto _L4; else goto _L3
	//   11   25:iload_1         
	//   12   26:ifeq            178
_L3:
		b = ((TextView) (new AppCompatTextView(getContext())));
	//   13   29:aload_0         
	//   14   30:new             #944 <Class AppCompatTextView>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokevirtual   #364 <Method Context getContext()>
	//   18   38:invokespecial   #945 <Method void AppCompatTextView(Context)>
	//   19   41:putfield        #399 <Field TextView b>
		b.setId(android.support.design.a.f.textinput_error);
	//   20   44:aload_0         
	//   21   45:getfield        #399 <Field TextView b>
	//   22   48:getstatic       #992 <Field int android.support.design.a$f.textinput_error>
	//   23   51:invokevirtual   #953 <Method void TextView.setId(int)>
		if(m != null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #873 <Field Typeface m>
	//*  26   58:ifnull          72
			b.setTypeface(m);
	//   27   61:aload_0         
	//   28   62:getfield        #399 <Field TextView b>
	//   29   65:aload_0         
	//   30   66:getfield        #873 <Field Typeface m>
	//   31   69:invokevirtual   #955 <Method void TextView.setTypeface(Typeface)>
		android.support.v4.widget.m.a(b, o);
	//   32   72:aload_0         
	//   33   73:getfield        #399 <Field TextView b>
	//   34   76:aload_0         
	//   35   77:getfield        #208 <Field int o>
	//   36   80:invokestatic    #775 <Method void m.a(TextView, int)>
		if(android.os.Build.VERSION.SDK_INT < 23) goto _L6; else goto _L5
	//   37   83:getstatic       #567 <Field int android.os.Build$VERSION.SDK_INT>
	//   38   86:bipush          23
	//   39   88:icmplt          112
_L5:
		int i1 = b.getTextColors().getDefaultColor();
	//   40   91:aload_0         
	//   41   92:getfield        #399 <Field TextView b>
	//   42   95:invokevirtual   #812 <Method ColorStateList TextView.getTextColors()>
	//   43   98:invokevirtual   #997 <Method int ColorStateList.getDefaultColor()>
	//   44  101:istore_2        
		if(i1 != -65281) goto _L6; else goto _L7
	//   45  102:iload_2         
	//   46  103:ldc2            #998 <Int -65281>
	//   47  106:icmpne          112
	//*  48  109:goto            117
_L6:
		boolean flag1 = false;
	//   49  112:iconst_0        
	//   50  113:istore_2        
		  goto _L8
	//*  51  114:goto            119
_L7:
		flag1 = true;
	//   52  117:iconst_1        
	//   53  118:istore_2        
_L8:
		if(flag1)
	//*  54  119:iload_2         
	//*  55  120:ifeq            150
		{
			android.support.v4.widget.m.a(b, android.support.v7.a.a.i.TextAppearance_AppCompat_Caption);
	//   56  123:aload_0         
	//   57  124:getfield        #399 <Field TextView b>
	//   58  127:getstatic       #963 <Field int android.support.v7.a.a$i.TextAppearance_AppCompat_Caption>
	//   59  130:invokestatic    #775 <Method void m.a(TextView, int)>
			b.setTextColor(android.support.v4.content.a.getColor(getContext(), android.support.v7.a.a.c.error_color_material));
	//   60  133:aload_0         
	//   61  134:getfield        #399 <Field TextView b>
	//   62  137:aload_0         
	//   63  138:invokevirtual   #364 <Method Context getContext()>
	//   64  141:getstatic       #968 <Field int android.support.v7.a.a$c.error_color_material>
	//   65  144:invokestatic    #974 <Method int android.support.v4.content.a.getColor(Context, int)>
	//   66  147:invokevirtual   #977 <Method void TextView.setTextColor(int)>
		}
		b.setVisibility(4);
	//   67  150:aload_0         
	//   68  151:getfield        #399 <Field TextView b>
	//   69  154:iconst_4        
	//   70  155:invokevirtual   #414 <Method void TextView.setVisibility(int)>
		android.support.v4.view.s.b(((View) (b)), 1);
	//   71  158:aload_0         
	//   72  159:getfield        #399 <Field TextView b>
	//   73  162:iconst_1        
	//   74  163:invokestatic    #1000 <Method void s.b(View, int)>
		a(b, 0);
	//   75  166:aload_0         
	//   76  167:aload_0         
	//   77  168:getfield        #399 <Field TextView b>
	//   78  171:iconst_0        
	//   79  172:invokespecial   #978 <Method void a(TextView, int)>
		  goto _L9
	//*  80  175:goto            200
_L4:
		p = false;
	//   81  178:aload_0         
	//   82  179:iconst_0        
	//   83  180:putfield        #397 <Field boolean p>
		c();
	//   84  183:aload_0         
	//   85  184:invokespecial   #454 <Method void c()>
		a(b);
	//   86  187:aload_0         
	//   87  188:aload_0         
	//   88  189:getfield        #399 <Field TextView b>
	//   89  192:invokespecial   #980 <Method void a(TextView)>
		b = null;
	//   90  195:aload_0         
	//   91  196:aconst_null     
	//   92  197:putfield        #399 <Field TextView b>
_L9:
		n = flag;
	//   93  200:aload_0         
	//   94  201:iload_1         
	//   95  202:putfield        #389 <Field boolean n>
_L2:
		return;
	//   96  205:return          
		Exception exception;
		exception;
	//   97  206:astore_3        
		if(true) goto _L7; else goto _L10
_L10:
	//*  98  207:goto            117
	}

	public void setErrorTextAppearance(int i1)
	{
		o = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field int o>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #399 <Field TextView b>
	//*   5    9:ifnull          20
			android.support.v4.widget.m.a(b, i1);
	//    6   12:aload_0         
	//    7   13:getfield        #399 <Field TextView b>
	//    8   16:iload_1         
	//    9   17:invokestatic    #775 <Method void m.a(TextView, int)>
	//   10   20:return          
	}

	public void setHint(CharSequence charsequence)
	{
		if(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean g>
	//*   2    4:ifeq            19
		{
			setHintInternal(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1003 <Method void setHintInternal(CharSequence)>
			sendAccessibilityEvent(2048);
	//    6   12:aload_0         
	//    7   13:sipush          2048
	//    8   16:invokevirtual   #1006 <Method void sendAccessibilityEvent(int)>
		}
	//    9   19:return          
	}

	public void setHintAnimationEnabled(boolean flag)
	{
		K = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #181 <Field boolean K>
	//    3    5:return          
	}

	public void setHintEnabled(boolean flag)
	{
		if(flag != g)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #166 <Field boolean g>
	//*   3    5:icmpeq          105
		{
			g = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #166 <Field boolean g>
			CharSequence charsequence = a.getHint();
	//    7   13:aload_0         
	//    8   14:getfield        #380 <Field EditText a>
	//    9   17:invokevirtual   #723 <Method CharSequence EditText.getHint()>
	//   10   20:astore_2        
			if(!g)
	//*  11   21:aload_0         
	//*  12   22:getfield        #166 <Field boolean g>
	//*  13   25:ifne            64
			{
				if(!TextUtils.isEmpty(h) && TextUtils.isEmpty(charsequence))
	//*  14   28:aload_0         
	//*  15   29:getfield        #719 <Field CharSequence h>
	//*  16   32:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   35:ifne            56
	//*  18   38:aload_2         
	//*  19   39:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   42:ifeq            56
					a.setHint(h);
	//   21   45:aload_0         
	//   22   46:getfield        #380 <Field EditText a>
	//   23   49:aload_0         
	//   24   50:getfield        #719 <Field CharSequence h>
	//   25   53:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
				setHintInternal(((CharSequence) (null)));
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:invokespecial   #1003 <Method void setHintInternal(CharSequence)>
			} else
	//*  29   61:goto            94
			if(!TextUtils.isEmpty(charsequence))
	//*  30   64:aload_2         
	//*  31   65:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   68:ifne            94
			{
				if(TextUtils.isEmpty(h))
	//*  33   71:aload_0         
	//*  34   72:getfield        #719 <Field CharSequence h>
	//*  35   75:invokestatic    #395 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   78:ifeq            86
					setHint(charsequence);
	//   37   81:aload_0         
	//   38   82:aload_2         
	//   39   83:invokevirtual   #176 <Method void setHint(CharSequence)>
				a.setHint(((CharSequence) (null)));
	//   40   86:aload_0         
	//   41   87:getfield        #380 <Field EditText a>
	//   42   90:aconst_null     
	//   43   91:invokevirtual   #726 <Method void EditText.setHint(CharSequence)>
			}
			if(a != null)
	//*  44   94:aload_0         
	//*  45   95:getfield        #380 <Field EditText a>
	//*  46   98:ifnull          105
				a();
	//   47  101:aload_0         
	//   48  102:invokespecial   #832 <Method void a()>
		}
	//   49  105:return          
	}

	public void setHintTextAppearance(int i1)
	{
		d.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field e d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #1010 <Method void e.c(int)>
		I = d.k();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field e d>
	//    7   13:invokevirtual   #1012 <Method ColorStateList e.k()>
	//    8   16:putfield        #192 <Field ColorStateList I>
		if(a != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #380 <Field EditText a>
	//*  11   23:ifnull          35
		{
			a(false);
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #456 <Method void a(boolean)>
			a();
	//   15   31:aload_0         
	//   16   32:invokespecial   #832 <Method void a()>
		}
	//   17   35:return          
	}

	public void setPasswordVisibilityToggleContentDescription(int i1)
	{
		CharSequence charsequence;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			charsequence = getResources().getText(i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1017 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1021 <Method CharSequence Resources.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1023 <Method void setPasswordVisibilityToggleContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleContentDescription(CharSequence charsequence)
	{
		y = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #250 <Field CharSequence y>
		if(z != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #492 <Field CheckableImageButton z>
	//*   5    9:ifnull          20
			z.setContentDescription(charsequence);
	//    6   12:aload_0         
	//    7   13:getfield        #492 <Field CheckableImageButton z>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #611 <Method void CheckableImageButton.setContentDescription(CharSequence)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleDrawable(int i1)
	{
		Drawable drawable;
		if(i1 != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = android.support.v7.c.a.b.b(getContext(), i1);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #364 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1029 <Method Drawable b.b(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setPasswordVisibilityToggleDrawable(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1031 <Method void setPasswordVisibilityToggleDrawable(Drawable)>
	//   13   23:return          
	}

	public void setPasswordVisibilityToggleDrawable(Drawable drawable)
	{
		x = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #245 <Field Drawable x>
		if(z != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #492 <Field CheckableImageButton z>
	//*   5    9:ifnull          20
			z.setImageDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #492 <Field CheckableImageButton z>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #608 <Method void CheckableImageButton.setImageDrawable(Drawable)>
	//   10   20:return          
	}

	public void setPasswordVisibilityToggleEnabled(boolean flag)
	{
		if(w != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field boolean w>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			w = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #237 <Field boolean w>
			if(!flag && A && a != null)
	//*   7   13:iload_1         
	//*   8   14:ifne            41
	//*   9   17:aload_0         
	//*  10   18:getfield        #484 <Field boolean A>
	//*  11   21:ifeq            41
	//*  12   24:aload_0         
	//*  13   25:getfield        #380 <Field EditText a>
	//*  14   28:ifnull          41
				a.setTransformationMethod(((android.text.method.TransformationMethod) (PasswordTransformationMethod.getInstance())));
	//   15   31:aload_0         
	//   16   32:getfield        #380 <Field EditText a>
	//   17   35:invokestatic    #490 <Method PasswordTransformationMethod PasswordTransformationMethod.getInstance()>
	//   18   38:invokevirtual   #482 <Method void EditText.setTransformationMethod(android.text.method.TransformationMethod)>
			A = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #484 <Field boolean A>
			e();
	//   22   46:aload_0         
	//   23   47:invokespecial   #738 <Method void e()>
		}
	//   24   50:return          
	}

	public void setPasswordVisibilityToggleTintList(ColorStateList colorstatelist)
	{
		D = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #257 <Field ColorStateList D>
		E = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #255 <Field boolean E>
		h();
	//    6   10:aload_0         
	//    7   11:invokespecial   #279 <Method void h()>
	//    8   14:return          
	}

	public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode)
	{
		F = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #269 <Field android.graphics.PorterDuff$Mode F>
		G = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #262 <Field boolean G>
		h();
	//    6   10:aload_0         
	//    7   11:invokespecial   #279 <Method void h()>
	//    8   14:return          
	}

	public void setTypeface(Typeface typeface)
	{
		if(m != null && !m.equals(((Object) (typeface))) || m == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #873 <Field Typeface m>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #873 <Field Typeface m>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #1040 <Method boolean Typeface.equals(Object)>
	//*   7   15:ifeq            29
	//*   8   18:aload_0         
	//*   9   19:getfield        #873 <Field Typeface m>
	//*  10   22:ifnonnull       72
	//*  11   25:aload_1         
	//*  12   26:ifnull          72
		{
			m = typeface;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #873 <Field Typeface m>
			d.c(typeface);
	//   16   34:aload_0         
	//   17   35:getfield        #101 <Field e d>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #699 <Method void e.c(Typeface)>
			if(r != null)
	//*  20   42:aload_0         
	//*  21   43:getfield        #540 <Field TextView r>
	//*  22   46:ifnull          57
				r.setTypeface(typeface);
	//   23   49:aload_0         
	//   24   50:getfield        #540 <Field TextView r>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #955 <Method void TextView.setTypeface(Typeface)>
			if(b != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #399 <Field TextView b>
	//*  29   61:ifnull          72
				b.setTypeface(typeface);
	//   30   64:aload_0         
	//   31   65:getfield        #399 <Field TextView b>
	//   32   68:aload_1         
	//   33   69:invokevirtual   #955 <Method void TextView.setTypeface(Typeface)>
		}
	//   34   72:return          
	}

	private boolean A;
	private Drawable B;
	private Drawable C;
	private ColorStateList D;
	private boolean E;
	private android.graphics.PorterDuff.Mode F;
	private boolean G;
	private ColorStateList H;
	private ColorStateList I;
	private boolean J;
	private boolean K;
	private ValueAnimator L;
	private boolean M;
	private boolean N;
	private boolean O;
	EditText a;
	TextView b;
	boolean c;
	final e d;
	private final FrameLayout e;
	private CharSequence f;
	private boolean g;
	private CharSequence h;
	private Paint i;
	private final Rect j;
	private LinearLayout k;
	private int l;
	private Typeface m;
	private boolean n;
	private int o;
	private boolean p;
	private CharSequence q;
	private TextView r;
	private int s;
	private int t;
	private int u;
	private boolean v;
	private boolean w;
	private Drawable x;
	private CharSequence y;
	private CheckableImageButton z;
}
