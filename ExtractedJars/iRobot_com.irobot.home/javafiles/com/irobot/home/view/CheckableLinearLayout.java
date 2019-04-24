// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout
	implements Checkable
{
	static class SavedState extends android.view.View.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeValue(((Object) (Boolean.valueOf(a))));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #39  <Field boolean a>
		//    7   11:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
		//    8   14:invokevirtual   #56  <Method void Parcel.writeValue(Object)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class CheckableLinearLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void CheckableLinearLayout$SavedState(Parcel, CheckableLinearLayout$1)>
			//    5    9:areturn         
			}

			public SavedState[] a(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method CheckableLinearLayout$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (a(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method CheckableLinearLayout$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		boolean a;

		static 
		{
		//    0    0:new             #9   <Class CheckableLinearLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void CheckableLinearLayout$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
			a = ((Boolean)parcel.readValue(((ClassLoader) (null)))).booleanValue();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokevirtual   #31  <Method Object Parcel.readValue(ClassLoader)>
		//    7   11:checkcast       #33  <Class Boolean>
		//    8   14:invokevirtual   #37  <Method boolean Boolean.booleanValue()>
		//    9   17:putfield        #39  <Field boolean a>
		//   10   20:return          
		}


		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static interface a
	{

		public abstract void a(CheckableLinearLayout checkablelinearlayout, boolean flag);
	}


	public CheckableLinearLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void LinearLayout(Context, AttributeSet)>
		b = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #36  <Field boolean b>
		setClickable(true);
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #40  <Method void setClickable(boolean)>
		setFocusable(true);
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:invokevirtual   #43  <Method void setFocusable(boolean)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.CheckableLinearLayout)));
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:getstatic       #48  <Field int[] com.irobot.home.g$a.CheckableLinearLayout>
	//   16   26:invokevirtual   #54  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   17   29:astore_1        
		d = ((TypedArray) (context)).getInt(0, 1);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:iconst_0        
	//   21   33:iconst_1        
	//   22   34:invokevirtual   #60  <Method int TypedArray.getInt(int, int)>
	//   23   37:putfield        #62  <Field int d>
		((TypedArray) (context)).recycle();
	//   24   40:aload_1         
	//   25   41:invokevirtual   #65  <Method void TypedArray.recycle()>
	//   26   44:return          
	}

	protected void a(boolean flag, boolean flag1)
	{
		if(b != flag || d == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #62  <Field int d>
	//*   6   12:iconst_2        
	//*   7   13:icmpne          68
		{
			b = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #36  <Field boolean b>
			refreshDrawableState();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #69  <Method void refreshDrawableState()>
			if(!c)
	//*  13   25:aload_0         
	//*  14   26:getfield        #71  <Field boolean c>
	//*  15   29:ifne            68
			{
				if(!flag1)
	//*  16   32:iload_2         
	//*  17   33:ifne            37
					return;
	//   18   36:return          
				c = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #71  <Field boolean c>
				if(e != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #73  <Field CheckableLinearLayout$a e>
	//*  24   46:ifnull          63
					e.a(this, b);
	//   25   49:aload_0         
	//   26   50:getfield        #73  <Field CheckableLinearLayout$a e>
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #36  <Field boolean b>
	//   30   58:invokeinterface #76  <Method void CheckableLinearLayout$a.a(CheckableLinearLayout, boolean)>
				c = false;
	//   31   63:aload_0         
	//   32   64:iconst_0        
	//   33   65:putfield        #71  <Field boolean c>
			}
		}
	//   34   68:return          
	}

	public boolean isChecked()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean b>
	//    2    4:ireturn         
	}

	public int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #82  <Method int[] LinearLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #84  <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, a);
	//    9   15:aload_2         
	//   10   16:getstatic       #29  <Field int[] a>
	//   11   19:invokestatic    #88  <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
		return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #10  <Class CheckableLinearLayout$SavedState>
	//    2    4:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #94  <Method Parcelable CheckableLinearLayout$SavedState.getSuperState()>
	//    6   10:invokespecial   #96  <Method void LinearLayout.onRestoreInstanceState(Parcelable)>
		setChecked(((SavedState) (parcelable)).a);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #98  <Field boolean CheckableLinearLayout$SavedState.a>
	//   10   18:invokevirtual   #101 <Method void setChecked(boolean)>
		requestLayout();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #104 <Method void requestLayout()>
	//   13   25:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #10  <Class CheckableLinearLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method Parcelable LinearLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #109 <Method void CheckableLinearLayout$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = isChecked();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #84  <Method boolean isChecked()>
	//    9   17:putfield        #98  <Field boolean CheckableLinearLayout$SavedState.a>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public boolean performClick()
	{
		if(d != 0 && d != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int d>
	//*   2    4:ifeq            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #62  <Field int d>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          18
	//*   7   15:goto            33
		{
			if(d == 1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #62  <Field int d>
	//*  10   22:iconst_1        
	//*  11   23:icmpne          38
				toggle();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #113 <Method void toggle()>
		} else
	//*  14   30:goto            38
		{
			setChecked(true);
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:invokevirtual   #101 <Method void setChecked(boolean)>
		}
		return super.performClick();
	//   18   38:aload_0         
	//   19   39:invokespecial   #115 <Method boolean LinearLayout.performClick()>
	//   20   42:ireturn         
	}

	public void setChecked(boolean flag)
	{
		a(flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #117 <Method void a(boolean, boolean)>
	//    4    6:return          
	}

	public void setCheckedSilently(boolean flag)
	{
		a(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #117 <Method void a(boolean, boolean)>
	//    4    6:return          
	}

	public void setOnCheckedChangeListener(a a1)
	{
		e = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field CheckableLinearLayout$a e>
	//    3    5:return          
	}

	public void toggle()
	{
		setChecked(b ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field boolean b>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:invokevirtual   #101 <Method void setChecked(boolean)>
	//    6   10:return          
	}

	private static final int a[] = {
		0x10100a0
	};
	private boolean b;
	private boolean c;
	private int d;
	private a e;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #27  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #29  <Field int[] a>
	//*   7   11:return          
	}
}
