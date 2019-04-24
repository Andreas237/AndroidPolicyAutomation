// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class BottomSheetBehavior extends CoordinatorLayout.Behavior
{
	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int a>
		//    7   11:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #28  <Method BottomSheetBehavior$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method BottomSheetBehavior$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method BottomSheetBehavior$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		final int a;

		static 
		{
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #31  <Method int Parcel.readInt()>
		//    7   11:putfield        #33  <Field int a>
		//    8   14:return          
		}

		public SavedState(Parcelable parcelable, int i1)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void AbsSavedState(Parcelable)>
			a = i1;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #33  <Field int a>
		//    6   10:return          
		}
	}

	public static abstract class a
	{

		public abstract void a(View view, float f1);

		public abstract void a(View view, int i1);

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private class b
		implements Runnable
	{

		public void run()
		{
			if(a.e != null && a.e.a(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field BottomSheetBehavior a>
		//*   2    4:getfield        #31  <Field p BottomSheetBehavior.e>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #18  <Field BottomSheetBehavior a>
		//*   6   14:getfield        #31  <Field p BottomSheetBehavior.e>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #36  <Method boolean p.a(boolean)>
		//*   9   21:ifeq            33
			{
				android.support.v4.view.s.a(b, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #23  <Field View b>
		//   12   28:aload_0         
		//   13   29:invokestatic    #41  <Method void s.a(View, Runnable)>
				return;
		//   14   32:return          
			} else
			{
				a.c(c);
		//   15   33:aload_0         
		//   16   34:getfield        #18  <Field BottomSheetBehavior a>
		//   17   37:aload_0         
		//   18   38:getfield        #25  <Field int c>
		//   19   41:invokevirtual   #44  <Method void BottomSheetBehavior.c(int)>
				return;
		//   20   44:return          
			}
		}

		final BottomSheetBehavior a;
		private final View b;
		private final int c;

		b(View view, int i1)
		{
			a = BottomSheetBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BottomSheetBehavior a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			b = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field View b>
			c = i1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field int c>
		//   11   19:return          
		}
	}


	public BottomSheetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void CoordinatorLayout$Behavior()>
		d = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #56  <Field int d>
		v = ((android.support.v4.widget.p.a) (new android.support.v4.widget.p.a() {

			public int a(View view)
			{
				int i1;
				if(a.c)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior a>
			//*   2    4:getfield        #21  <Field boolean BottomSheetBehavior.c>
			//*   3    7:ifeq            28
					i1 = a.f;
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field BottomSheetBehavior a>
			//    6   14:getfield        #25  <Field int BottomSheetBehavior.f>
			//    7   17:istore_2        
				else
			//*   8   18:iload_2         
			//*   9   19:aload_0         
			//*  10   20:getfield        #12  <Field BottomSheetBehavior a>
			//*  11   23:getfield        #27  <Field int BottomSheetBehavior.a>
			//*  12   26:isub            
			//*  13   27:ireturn         
					i1 = a.b;
			//   14   28:aload_0         
			//   15   29:getfield        #12  <Field BottomSheetBehavior a>
			//   16   32:getfield        #30  <Field int BottomSheetBehavior.b>
			//   17   35:istore_2        
				return i1 - a.a;
			//*  18   36:goto            18
			}

			public int a(View view, int i1, int j1)
			{
				int k1 = a.a;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior a>
			//    2    4:getfield        #27  <Field int BottomSheetBehavior.a>
			//    3    7:istore          4
				if(a.c)
			//*   4    9:aload_0         
			//*   5   10:getfield        #12  <Field BottomSheetBehavior a>
			//*   6   13:getfield        #21  <Field boolean BottomSheetBehavior.c>
			//*   7   16:ifeq            30
					j1 = a.f;
			//    8   19:aload_0         
			//    9   20:getfield        #12  <Field BottomSheetBehavior a>
			//   10   23:getfield        #25  <Field int BottomSheetBehavior.f>
			//   11   26:istore_3        
				else
			//*  12   27:goto            38
					j1 = a.b;
			//   13   30:aload_0         
			//   14   31:getfield        #12  <Field BottomSheetBehavior a>
			//   15   34:getfield        #30  <Field int BottomSheetBehavior.b>
			//   16   37:istore_3        
				return android.support.v4.c.a.a(i1, k1, j1);
			//   17   38:iload_2         
			//   18   39:iload           4
			//   19   41:iload_3         
			//   20   42:invokestatic    #36  <Method int android.support.v4.c.a.a(int, int, int)>
			//   21   45:ireturn         
			}

			public void a(int i1)
			{
				if(i1 == 1)
			//*   0    0:iload_1         
			//*   1    1:iconst_1        
			//*   2    2:icmpne          13
					a.c(1);
			//    3    5:aload_0         
			//    4    6:getfield        #12  <Field BottomSheetBehavior a>
			//    5    9:iconst_1        
			//    6   10:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
			//    7   13:return          
			}

			public void a(View view, float f1, float f2)
			{
				byte byte0 = 4;
			//    0    0:iconst_4        
			//    1    1:istore          4
				if(f2 >= 0.0F) goto _L2; else goto _L1
			//    2    3:fload_3         
			//    3    4:fconst_0        
			//    4    5:fcmpg           
			//    5    6:ifge            24
_L1:
				int i1;
				i1 = a.a;
			//    6    9:aload_0         
			//    7   10:getfield        #12  <Field BottomSheetBehavior a>
			//    8   13:getfield        #27  <Field int BottomSheetBehavior.a>
			//    9   16:istore          5
				byte0 = 3;
			//   10   18:iconst_3        
			//   11   19:istore          4
				break MISSING_BLOCK_LABEL_114;
			//   12   21:goto            114
_L2:
				if(a.c && a.a(view, f2))
			//*  13   24:aload_0         
			//*  14   25:getfield        #12  <Field BottomSheetBehavior a>
			//*  15   28:getfield        #21  <Field boolean BottomSheetBehavior.c>
			//*  16   31:ifeq            61
			//*  17   34:aload_0         
			//*  18   35:getfield        #12  <Field BottomSheetBehavior a>
			//*  19   38:aload_1         
			//*  20   39:fload_3         
			//*  21   40:invokevirtual   #43  <Method boolean BottomSheetBehavior.a(View, float)>
			//*  22   43:ifeq            61
				{
					i1 = a.f;
			//   23   46:aload_0         
			//   24   47:getfield        #12  <Field BottomSheetBehavior a>
			//   25   50:getfield        #25  <Field int BottomSheetBehavior.f>
			//   26   53:istore          5
					byte0 = 5;
			//   27   55:iconst_5        
			//   28   56:istore          4
					break MISSING_BLOCK_LABEL_114;
			//   29   58:goto            114
				}
				if(f2 != 0.0F)
					break; /* Loop/switch isn't completed */
			//   30   61:fload_3         
			//   31   62:fconst_0        
			//   32   63:fcmpl           
			//   33   64:ifne            105
				i1 = view.getTop();
			//   34   67:aload_1         
			//   35   68:invokevirtual   #49  <Method int View.getTop()>
			//   36   71:istore          5
				if(Math.abs(i1 - a.a) >= Math.abs(i1 - a.b)) goto _L3; else goto _L1
			//   37   73:iload           5
			//   38   75:aload_0         
			//   39   76:getfield        #12  <Field BottomSheetBehavior a>
			//   40   79:getfield        #27  <Field int BottomSheetBehavior.a>
			//   41   82:isub            
			//   42   83:invokestatic    #55  <Method int Math.abs(int)>
			//   43   86:iload           5
			//   44   88:aload_0         
			//   45   89:getfield        #12  <Field BottomSheetBehavior a>
			//   46   92:getfield        #30  <Field int BottomSheetBehavior.b>
			//   47   95:isub            
			//   48   96:invokestatic    #55  <Method int Math.abs(int)>
			//   49   99:icmpge          105
			//*  50  102:goto            9
_L3:
				i1 = a.b;
			//   51  105:aload_0         
			//   52  106:getfield        #12  <Field BottomSheetBehavior a>
			//   53  109:getfield        #30  <Field int BottomSheetBehavior.b>
			//   54  112:istore          5
				if(a.e.a(view.getLeft(), i1))
			//*  55  114:aload_0         
			//*  56  115:getfield        #12  <Field BottomSheetBehavior a>
			//*  57  118:getfield        #59  <Field p BottomSheetBehavior.e>
			//*  58  121:aload_1         
			//*  59  122:invokevirtual   #62  <Method int View.getLeft()>
			//*  60  125:iload           5
			//*  61  127:invokevirtual   #67  <Method boolean p.a(int, int)>
			//*  62  130:ifeq            160
				{
					a.c(2);
			//   63  133:aload_0         
			//   64  134:getfield        #12  <Field BottomSheetBehavior a>
			//   65  137:iconst_2        
			//   66  138:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
					android.support.v4.view.s.a(view, ((Runnable) (((b) (a)). new b(view, ((int) (byte0))))));
			//   67  141:aload_1         
			//   68  142:new             #69  <Class BottomSheetBehavior$b>
			//   69  145:dup             
			//   70  146:aload_0         
			//   71  147:getfield        #12  <Field BottomSheetBehavior a>
			//   72  150:aload_1         
			//   73  151:iload           4
			//   74  153:invokespecial   #72  <Method void BottomSheetBehavior$b(BottomSheetBehavior, View, int)>
			//   75  156:invokestatic    #77  <Method void s.a(View, Runnable)>
					return;
			//   76  159:return          
				} else
				{
					a.c(((int) (byte0)));
			//   77  160:aload_0         
			//   78  161:getfield        #12  <Field BottomSheetBehavior a>
			//   79  164:iload           4
			//   80  166:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
					return;
			//   81  169:return          
				}
			}

			public void a(View view, int i1, int j1, int k1, int l1)
			{
				a.d(j1);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior a>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #81  <Method void BottomSheetBehavior.d(int)>
			//    4    8:return          
			}

			public boolean a(View view, int i1)
			{
				if(a.d == 1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior a>
			//*   2    4:getfield        #84  <Field int BottomSheetBehavior.d>
			//*   3    7:iconst_1        
			//*   4    8:icmpne          13
					return false;
			//    5   11:iconst_0        
			//    6   12:ireturn         
				if(a.j)
			//*   7   13:aload_0         
			//*   8   14:getfield        #12  <Field BottomSheetBehavior a>
			//*   9   17:getfield        #87  <Field boolean BottomSheetBehavior.j>
			//*  10   20:ifeq            25
					return false;
			//   11   23:iconst_0        
			//   12   24:ireturn         
				if(a.d == 3 && a.i == i1)
			//*  13   25:aload_0         
			//*  14   26:getfield        #12  <Field BottomSheetBehavior a>
			//*  15   29:getfield        #84  <Field int BottomSheetBehavior.d>
			//*  16   32:iconst_3        
			//*  17   33:icmpne          75
			//*  18   36:aload_0         
			//*  19   37:getfield        #12  <Field BottomSheetBehavior a>
			//*  20   40:getfield        #90  <Field int BottomSheetBehavior.i>
			//*  21   43:iload_2         
			//*  22   44:icmpne          75
				{
					View view1 = (View)a.h.get();
			//   23   47:aload_0         
			//   24   48:getfield        #12  <Field BottomSheetBehavior a>
			//   25   51:getfield        #94  <Field WeakReference BottomSheetBehavior.h>
			//   26   54:invokevirtual   #100 <Method Object WeakReference.get()>
			//   27   57:checkcast       #45  <Class View>
			//   28   60:astore_3        
					if(view1 != null && view1.canScrollVertically(-1))
			//*  29   61:aload_3         
			//*  30   62:ifnull          75
			//*  31   65:aload_3         
			//*  32   66:iconst_m1       
			//*  33   67:invokevirtual   #104 <Method boolean View.canScrollVertically(int)>
			//*  34   70:ifeq            75
						return false;
			//   35   73:iconst_0        
			//   36   74:ireturn         
				}
				return a.g != null && a.g.get() == view;
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field BottomSheetBehavior a>
			//   39   79:getfield        #107 <Field WeakReference BottomSheetBehavior.g>
			//   40   82:ifnull          101
			//   41   85:aload_0         
			//   42   86:getfield        #12  <Field BottomSheetBehavior a>
			//   43   89:getfield        #107 <Field WeakReference BottomSheetBehavior.g>
			//   44   92:invokevirtual   #100 <Method Object WeakReference.get()>
			//   45   95:aload_1         
			//   46   96:if_acmpne       101
			//   47   99:iconst_1        
			//   48  100:ireturn         
			//   49  101:iconst_0        
			//   50  102:ireturn         
			}

			public int b(View view, int i1, int j1)
			{
				return view.getLeft();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #62  <Method int View.getLeft()>
			//    2    4:ireturn         
			}

			final BottomSheetBehavior a;

			
			{
				a = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetBehavior a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v4.widget.p$a()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #9   <Class BottomSheetBehavior$2>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #59  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   10   18:putfield        #61  <Field android.support.v4.widget.p$a v>
	//   11   21:return          
	}

	public BottomSheetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #65  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		d = 4;
	//    4    6:aload_0         
	//    5    7:iconst_4        
	//    6    8:putfield        #56  <Field int d>
		v = ((android.support.v4.widget.p.a) (new _cls2()));
	//    7   11:aload_0         
	//    8   12:new             #9   <Class BottomSheetBehavior$2>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #59  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   12   20:putfield        #61  <Field android.support.v4.widget.p$a v>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.BottomSheetBehavior_Layout)));
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:getstatic       #71  <Field int[] android.support.design.a$k.BottomSheetBehavior_Layout>
	//   16   28:invokevirtual   #77  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   17   31:astore_2        
		TypedValue typedvalue = ((TypedArray) (attributeset)).peekValue(android.support.design.a.k.BottomSheetBehavior_Layout_behavior_peekHeight);
	//   18   32:aload_2         
	//   19   33:getstatic       #80  <Field int android.support.design.a$k.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   20   36:invokevirtual   #86  <Method TypedValue TypedArray.peekValue(int)>
	//   21   39:astore          4
		int i1;
		if(typedvalue != null && typedvalue.data == -1)
	//*  22   41:aload           4
	//*  23   43:ifnull          64
	//*  24   46:aload           4
	//*  25   48:getfield        #91  <Field int TypedValue.data>
	//*  26   51:iconst_m1       
	//*  27   52:icmpne          64
			i1 = typedvalue.data;
	//   28   55:aload           4
	//   29   57:getfield        #91  <Field int TypedValue.data>
	//   30   60:istore_3        
		else
	//*  31   61:goto            73
			i1 = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.a.k.BottomSheetBehavior_Layout_behavior_peekHeight, -1);
	//   32   64:aload_2         
	//   33   65:getstatic       #80  <Field int android.support.design.a$k.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   34   68:iconst_m1       
	//   35   69:invokevirtual   #95  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   36   72:istore_3        
		a(i1);
	//   37   73:aload_0         
	//   38   74:iload_3         
	//   39   75:invokevirtual   #98  <Method void a(int)>
		a(((TypedArray) (attributeset)).getBoolean(android.support.design.a.k.BottomSheetBehavior_Layout_behavior_hideable, false));
	//   40   78:aload_0         
	//   41   79:aload_2         
	//   42   80:getstatic       #101 <Field int android.support.design.a$k.BottomSheetBehavior_Layout_behavior_hideable>
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #105 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   45   87:invokevirtual   #108 <Method void a(boolean)>
		b(((TypedArray) (attributeset)).getBoolean(android.support.design.a.k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:getstatic       #111 <Field int android.support.design.a$k.BottomSheetBehavior_Layout_behavior_skipCollapsed>
	//   49   95:iconst_0        
	//   50   96:invokevirtual   #105 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   51   99:invokevirtual   #113 <Method void b(boolean)>
		((TypedArray) (attributeset)).recycle();
	//   52  102:aload_2         
	//   53  103:invokevirtual   #116 <Method void TypedArray.recycle()>
		k = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:invokestatic    #122 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   57  111:invokevirtual   #126 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   58  114:i2f             
	//   59  115:putfield        #128 <Field float k>
	//   60  118:return          
	}

	public static BottomSheetBehavior b(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(!(view instanceof CoordinatorLayout.c))
	//*   3    5:aload_0         
	//*   4    6:instanceof      #137 <Class CoordinatorLayout$c>
	//*   5    9:ifne            22
			throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
	//    6   12:new             #139 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #141 <String "The view is not a child of CoordinatorLayout">
	//    9   18:invokespecial   #144 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		view = ((View) (((CoordinatorLayout.c)view).b()));
	//   11   22:aload_0         
	//   12   23:checkcast       #137 <Class CoordinatorLayout$c>
	//   13   26:invokevirtual   #147 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
	//   14   29:astore_0        
		if(!(view instanceof BottomSheetBehavior))
	//*  15   30:aload_0         
	//*  16   31:instanceof      #2   <Class BottomSheetBehavior>
	//*  17   34:ifne            47
			throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
	//   18   37:new             #139 <Class IllegalArgumentException>
	//   19   40:dup             
	//   20   41:ldc1            #149 <String "The view is not associated with BottomSheetBehavior">
	//   21   43:invokespecial   #144 <Method void IllegalArgumentException(String)>
	//   22   46:athrow          
		else
			return (BottomSheetBehavior)view;
	//   23   47:aload_0         
	//   24   48:checkcast       #2   <Class BottomSheetBehavior>
	//   25   51:areturn         
	}

	private void b()
	{
		i = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #153 <Field int i>
		if(t != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #155 <Field VelocityTracker t>
	//*   5    9:ifnull          24
		{
			t.recycle();
	//    6   12:aload_0         
	//    7   13:getfield        #155 <Field VelocityTracker t>
	//    8   16:invokevirtual   #158 <Method void VelocityTracker.recycle()>
			t = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #155 <Field VelocityTracker t>
		}
	//   12   24:return          
	}

	private float d()
	{
		t.computeCurrentVelocity(1000, k);
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field VelocityTracker t>
	//    2    4:sipush          1000
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field float k>
	//    5   11:invokevirtual   #163 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		return t.getYVelocity(i);
	//    6   14:aload_0         
	//    7   15:getfield        #155 <Field VelocityTracker t>
	//    8   18:aload_0         
	//    9   19:getfield        #153 <Field int i>
	//   10   22:invokevirtual   #167 <Method float VelocityTracker.getYVelocity(int)>
	//   11   25:freturn         
	}

	public final int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int d>
	//    2    4:ireturn         
	}

	View a(View view)
	{
		if(android.support.v4.view.s.v(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #173 <Method boolean s.v(View)>
	//*   2    4:ifeq            9
			return view;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(view instanceof ViewGroup)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #175 <Class ViewGroup>
	//*   7   13:ifeq            59
		{
			view = ((View) ((ViewGroup)view));
	//    8   16:aload_1         
	//    9   17:checkcast       #175 <Class ViewGroup>
	//   10   20:astore_1        
			int i1 = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			for(int j1 = ((ViewGroup) (view)).getChildCount(); i1 < j1; i1++)
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #178 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_3        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          59
			{
				View view1 = a(((ViewGroup) (view)).getChildAt(i1));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #182 <Method View ViewGroup.getChildAt(int)>
	//   23   39:invokevirtual   #184 <Method View a(View)>
	//   24   42:astore          4
				if(view1 != null)
	//*  25   44:aload           4
	//*  26   46:ifnull          52
					return view1;
	//   27   49:aload           4
	//   28   51:areturn         
			}

	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
		}
	//*  33   56:goto            28
		return null;
	//   34   59:aconst_null     
	//   35   60:areturn         
	}

	public final void a(int i1)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
				if(i1 == -1)
	//*   2    2:iload_1         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          24
				{
					if(!m)
	//*   5    7:aload_0         
	//*   6    8:getfield        #186 <Field boolean m>
	//*   7   11:ifne            42
					{
						m = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #186 <Field boolean m>
						i1 = ((int) (flag));
	//   11   19:iload_2         
	//   12   20:istore_1        
						break label0;
	//   13   21:goto            73
					}
				} else
				if(m || l != i1)
	//*  14   24:aload_0         
	//*  15   25:getfield        #186 <Field boolean m>
	//*  16   28:ifne            47
	//*  17   31:aload_0         
	//*  18   32:getfield        #188 <Field int l>
	//*  19   35:iload_1         
	//*  20   36:icmpeq          42
					break label1;
	//   21   39:goto            47
				i1 = 0;
	//   22   42:iconst_0        
	//   23   43:istore_1        
				break label0;
	//   24   44:goto            73
			}
			m = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #186 <Field boolean m>
			l = Math.max(0, i1);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload_1         
	//   31   55:invokestatic    #193 <Method int Math.max(int, int)>
	//   32   58:putfield        #188 <Field int l>
			b = f - i1;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #195 <Field int f>
	//   36   66:iload_1         
	//   37   67:isub            
	//   38   68:putfield        #197 <Field int b>
			i1 = ((int) (flag));
	//   39   71:iload_2         
	//   40   72:istore_1        
		}
		if(i1 != 0 && d == 4 && g != null)
	//*  41   73:iload_1         
	//*  42   74:ifeq            111
	//*  43   77:aload_0         
	//*  44   78:getfield        #56  <Field int d>
	//*  45   81:iconst_4        
	//*  46   82:icmpne          111
	//*  47   85:aload_0         
	//*  48   86:getfield        #199 <Field WeakReference g>
	//*  49   89:ifnull          111
		{
			View view = (View)g.get();
	//   50   92:aload_0         
	//   51   93:getfield        #199 <Field WeakReference g>
	//   52   96:invokevirtual   #204 <Method Object WeakReference.get()>
	//   53   99:checkcast       #131 <Class View>
	//   54  102:astore_3        
			if(view != null)
	//*  55  103:aload_3         
	//*  56  104:ifnull          111
				view.requestLayout();
	//   57  107:aload_3         
	//   58  108:invokevirtual   #207 <Method void View.requestLayout()>
		}
	//   59  111:return          
	}

	public void a(a a1)
	{
		s = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #210 <Field BottomSheetBehavior$a s>
	//    3    5:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_3         
	//    1    1:checkcast       #11  <Class BottomSheetBehavior$SavedState>
	//    2    4:astore_3        
		super.a(coordinatorlayout, view, ((SavedState) (parcelable)).a());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #214 <Method Parcelable BottomSheetBehavior$SavedState.a()>
	//    8   12:invokespecial   #216 <Method void CoordinatorLayout$Behavior.a(CoordinatorLayout, View, Parcelable)>
		int i1;
		if(((SavedState) (parcelable)).a != 1 && ((SavedState) (parcelable)).a != 2)
	//*   9   15:aload_3         
	//*  10   16:getfield        #218 <Field int BottomSheetBehavior$SavedState.a>
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          43
	//*  13   23:aload_3         
	//*  14   24:getfield        #218 <Field int BottomSheetBehavior$SavedState.a>
	//*  15   27:iconst_2        
	//*  16   28:icmpne          34
	//*  17   31:goto            43
			i1 = ((SavedState) (parcelable)).a;
	//   18   34:aload_3         
	//   19   35:getfield        #218 <Field int BottomSheetBehavior$SavedState.a>
	//   20   38:istore          4
		else
	//*  21   40:goto            46
			i1 = 4;
	//   22   43:iconst_4        
	//   23   44:istore          4
		d = i1;
	//   24   46:aload_0         
	//   25   47:iload           4
	//   26   49:putfield        #56  <Field int d>
	//   27   52:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[])
	{
		int k1;
		if(view1 != (View)h.get())
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #222 <Field WeakReference h>
	//*   3    5:invokevirtual   #204 <Method Object WeakReference.get()>
	//*   4    8:checkcast       #131 <Class View>
	//*   5   11:if_acmpeq       15
			return;
	//    6   14:return          
		i1 = view.getTop();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #225 <Method int View.getTop()>
	//    9   19:istore          4
		k1 = i1 - j1;
	//   10   21:iload           4
	//   11   23:iload           5
	//   12   25:isub            
	//   13   26:istore          7
		if(j1 <= 0) goto _L2; else goto _L1
	//   14   28:iload           5
	//   15   30:ifle            95
_L1:
		if(k1 >= a) goto _L4; else goto _L3
	//   16   33:iload           7
	//   17   35:aload_0         
	//   18   36:getfield        #226 <Field int a>
	//   19   39:icmpge          74
_L3:
		ai[1] = i1 - a;
	//   20   42:aload           6
	//   21   44:iconst_1        
	//   22   45:iload           4
	//   23   47:aload_0         
	//   24   48:getfield        #226 <Field int a>
	//   25   51:isub            
	//   26   52:iastore         
		android.support.v4.view.s.c(view, -ai[1]);
	//   27   53:aload_2         
	//   28   54:aload           6
	//   29   56:iconst_1        
	//   30   57:iaload          
	//   31   58:ineg            
	//   32   59:invokestatic    #229 <Method void s.c(View, int)>
		i1 = 3;
	//   33   62:iconst_3        
	//   34   63:istore          4
_L8:
		c(i1);
	//   35   65:aload_0         
	//   36   66:iload           4
	//   37   68:invokevirtual   #231 <Method void c(int)>
		  goto _L5
	//*  38   71:goto            162
_L4:
		ai[1] = j1;
	//   39   74:aload           6
	//   40   76:iconst_1        
	//   41   77:iload           5
	//   42   79:iastore         
_L6:
		android.support.v4.view.s.c(view, -j1);
	//   43   80:aload_2         
	//   44   81:iload           5
	//   45   83:ineg            
	//   46   84:invokestatic    #229 <Method void s.c(View, int)>
		c(1);
	//   47   87:aload_0         
	//   48   88:iconst_1        
	//   49   89:invokevirtual   #231 <Method void c(int)>
		break; /* Loop/switch isn't completed */
	//   50   92:goto            162
_L2:
		if(j1 >= 0 || view1.canScrollVertically(-1))
			break; /* Loop/switch isn't completed */
	//   51   95:iload           5
	//   52   97:ifge            162
	//   53  100:aload_3         
	//   54  101:iconst_m1       
	//   55  102:invokevirtual   #235 <Method boolean View.canScrollVertically(int)>
	//   56  105:ifne            162
		if(k1 > b && !c)
	//*  57  108:iload           7
	//*  58  110:aload_0         
	//*  59  111:getfield        #197 <Field int b>
	//*  60  114:icmple          153
	//*  61  117:aload_0         
	//*  62  118:getfield        #237 <Field boolean c>
	//*  63  121:ifeq            127
	//*  64  124:goto            153
		{
			ai[1] = i1 - b;
	//   65  127:aload           6
	//   66  129:iconst_1        
	//   67  130:iload           4
	//   68  132:aload_0         
	//   69  133:getfield        #197 <Field int b>
	//   70  136:isub            
	//   71  137:iastore         
			android.support.v4.view.s.c(view, -ai[1]);
	//   72  138:aload_2         
	//   73  139:aload           6
	//   74  141:iconst_1        
	//   75  142:iaload          
	//   76  143:ineg            
	//   77  144:invokestatic    #229 <Method void s.c(View, int)>
			i1 = 4;
	//   78  147:iconst_4        
	//   79  148:istore          4
			continue; /* Loop/switch isn't completed */
	//   80  150:goto            65
		}
		ai[1] = j1;
	//   81  153:aload           6
	//   82  155:iconst_1        
	//   83  156:iload           5
	//   84  158:iastore         
		if(true) goto _L6; else goto _L5
	//   85  159:goto            80
_L5:
		d(view.getTop());
	//   86  162:aload_0         
	//   87  163:aload_2         
	//   88  164:invokevirtual   #225 <Method int View.getTop()>
	//   89  167:invokevirtual   #239 <Method void d(int)>
		q = j1;
	//   90  170:aload_0         
	//   91  171:iload           5
	//   92  173:putfield        #241 <Field int q>
		r = true;
	//   93  176:aload_0         
	//   94  177:iconst_1        
	//   95  178:putfield        #243 <Field boolean r>
		return;
	//   96  181:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	void a(View view, int i1)
	{
label0:
		{
			int j1;
			if(i1 == 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          13
				j1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #197 <Field int b>
	//    5    9:istore_3        
			else
	//*   6   10:goto            43
			if(i1 == 3)
	//*   7   13:iload_2         
	//*   8   14:iconst_3        
	//*   9   15:icmpne          26
			{
				j1 = a;
	//   10   18:aload_0         
	//   11   19:getfield        #226 <Field int a>
	//   12   22:istore_3        
			} else
	//*  13   23:goto            43
			{
				if(!c || i1 != 5)
					break label0;
	//   14   26:aload_0         
	//   15   27:getfield        #237 <Field boolean c>
	//   16   30:ifeq            85
	//   17   33:iload_2         
	//   18   34:iconst_5        
	//   19   35:icmpne          85
				j1 = f;
	//   20   38:aload_0         
	//   21   39:getfield        #195 <Field int f>
	//   22   42:istore_3        
			}
			if(e.a(view, view.getLeft(), j1))
	//*  23   43:aload_0         
	//*  24   44:getfield        #246 <Field p e>
	//*  25   47:aload_1         
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #249 <Method int View.getLeft()>
	//*  28   52:iload_3         
	//*  29   53:invokevirtual   #254 <Method boolean p.a(View, int, int)>
	//*  30   56:ifeq            79
			{
				c(2);
	//   31   59:aload_0         
	//   32   60:iconst_2        
	//   33   61:invokevirtual   #231 <Method void c(int)>
				android.support.v4.view.s.a(view, ((Runnable) (new b(view, i1))));
	//   34   64:aload_1         
	//   35   65:new             #19  <Class BottomSheetBehavior$b>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iload_2         
	//   40   72:invokespecial   #257 <Method void BottomSheetBehavior$b(BottomSheetBehavior, View, int)>
	//   41   75:invokestatic    #260 <Method void s.a(View, Runnable)>
				return;
	//   42   78:return          
			} else
			{
				c(i1);
	//   43   79:aload_0         
	//   44   80:iload_2         
	//   45   81:invokevirtual   #231 <Method void c(int)>
				return;
	//   46   84:return          
			}
		}
		view = ((View) (new StringBuilder()));
	//   47   85:new             #262 <Class StringBuilder>
	//   48   88:dup             
	//   49   89:invokespecial   #263 <Method void StringBuilder()>
	//   50   92:astore_1        
		((StringBuilder) (view)).append("Illegal state argument: ");
	//   51   93:aload_1         
	//   52   94:ldc2            #265 <String "Illegal state argument: ">
	//   53   97:invokevirtual   #269 <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
		((StringBuilder) (view)).append(i1);
	//   55  101:aload_1         
	//   56  102:iload_2         
	//   57  103:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//   58  106:pop             
		throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   59  107:new             #139 <Class IllegalArgumentException>
	//   60  110:dup             
	//   61  111:aload_1         
	//   62  112:invokevirtual   #276 <Method String StringBuilder.toString()>
	//   63  115:invokespecial   #144 <Method void IllegalArgumentException(String)>
	//   64  118:athrow          
	}

	public void a(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #237 <Field boolean c>
	//    3    5:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
	{
		int j1;
		if(android.support.v4.view.s.q(((View) (coordinatorlayout))) && !android.support.v4.view.s.q(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #279 <Method boolean s.q(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #279 <Method boolean s.q(View)>
	//*   5   11:ifne            19
			android.support.v4.view.s.b(view, true);
	//    6   14:aload_2         
	//    7   15:iconst_1        
	//    8   16:invokestatic    #282 <Method void s.b(View, boolean)>
		j1 = view.getTop();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #225 <Method int View.getTop()>
	//   11   23:istore          4
		coordinatorlayout.a(view, i1);
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #286 <Method void CoordinatorLayout.a(View, int)>
		f = coordinatorlayout.getHeight();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #289 <Method int CoordinatorLayout.getHeight()>
	//   19   36:putfield        #195 <Field int f>
		if(m)
	//*  20   39:aload_0         
	//*  21   40:getfield        #186 <Field boolean m>
	//*  22   43:ifeq            93
		{
			if(n == 0)
	//*  23   46:aload_0         
	//*  24   47:getfield        #291 <Field int n>
	//*  25   50:ifne            67
				n = coordinatorlayout.getResources().getDimensionPixelSize(android.support.design.a.d.design_bottom_sheet_peek_height_min);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #295 <Method Resources CoordinatorLayout.getResources()>
	//   29   58:getstatic       #300 <Field int android.support.design.a$d.design_bottom_sheet_peek_height_min>
	//   30   61:invokevirtual   #305 <Method int Resources.getDimensionPixelSize(int)>
	//   31   64:putfield        #291 <Field int n>
			i1 = Math.max(n, f - (coordinatorlayout.getWidth() * 9) / 16);
	//   32   67:aload_0         
	//   33   68:getfield        #291 <Field int n>
	//   34   71:aload_0         
	//   35   72:getfield        #195 <Field int f>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #308 <Method int CoordinatorLayout.getWidth()>
	//   38   79:bipush          9
	//   39   81:imul            
	//   40   82:bipush          16
	//   41   84:idiv            
	//   42   85:isub            
	//   43   86:invokestatic    #193 <Method int Math.max(int, int)>
	//   44   89:istore_3        
		} else
	//*  45   90:goto            98
		{
			i1 = l;
	//   46   93:aload_0         
	//   47   94:getfield        #188 <Field int l>
	//   48   97:istore_3        
		}
		a = Math.max(0, f - view.getHeight());
	//   49   98:aload_0         
	//   50   99:iconst_0        
	//   51  100:aload_0         
	//   52  101:getfield        #195 <Field int f>
	//   53  104:aload_2         
	//   54  105:invokevirtual   #309 <Method int View.getHeight()>
	//   55  108:isub            
	//   56  109:invokestatic    #193 <Method int Math.max(int, int)>
	//   57  112:putfield        #226 <Field int a>
		b = Math.max(f - i1, a);
	//   58  115:aload_0         
	//   59  116:aload_0         
	//   60  117:getfield        #195 <Field int f>
	//   61  120:iload_3         
	//   62  121:isub            
	//   63  122:aload_0         
	//   64  123:getfield        #226 <Field int a>
	//   65  126:invokestatic    #193 <Method int Math.max(int, int)>
	//   66  129:putfield        #197 <Field int b>
		if(d != 3) goto _L2; else goto _L1
	//   67  132:aload_0         
	//   68  133:getfield        #56  <Field int d>
	//   69  136:iconst_3        
	//   70  137:icmpne          153
_L1:
		i1 = a;
	//   71  140:aload_0         
	//   72  141:getfield        #226 <Field int a>
	//   73  144:istore_3        
_L4:
		android.support.v4.view.s.c(view, i1);
	//   74  145:aload_2         
	//   75  146:iload_3         
	//   76  147:invokestatic    #229 <Method void s.c(View, int)>
		break MISSING_BLOCK_LABEL_219;
	//   77  150:goto            219
_L2:
		if(c && d == 5)
	//*  78  153:aload_0         
	//*  79  154:getfield        #237 <Field boolean c>
	//*  80  157:ifeq            176
	//*  81  160:aload_0         
	//*  82  161:getfield        #56  <Field int d>
	//*  83  164:iconst_5        
	//*  84  165:icmpne          176
		{
			i1 = f;
	//   85  168:aload_0         
	//   86  169:getfield        #195 <Field int f>
	//   87  172:istore_3        
			continue; /* Loop/switch isn't completed */
	//   88  173:goto            145
		}
		if(d != 4)
			break; /* Loop/switch isn't completed */
	//   89  176:aload_0         
	//   90  177:getfield        #56  <Field int d>
	//   91  180:iconst_4        
	//   92  181:icmpne          192
		i1 = b;
	//   93  184:aload_0         
	//   94  185:getfield        #197 <Field int b>
	//   95  188:istore_3        
		if(true) goto _L4; else goto _L3
	//   96  189:goto            145
_L3:
		if(d == 1 || d == 2)
	//*  97  192:aload_0         
	//*  98  193:getfield        #56  <Field int d>
	//*  99  196:iconst_1        
	//* 100  197:icmpeq          208
	//* 101  200:aload_0         
	//* 102  201:getfield        #56  <Field int d>
	//* 103  204:iconst_2        
	//* 104  205:icmpne          219
			android.support.v4.view.s.c(view, j1 - view.getTop());
	//  105  208:aload_2         
	//  106  209:iload           4
	//  107  211:aload_2         
	//  108  212:invokevirtual   #225 <Method int View.getTop()>
	//  109  215:isub            
	//  110  216:invokestatic    #229 <Method void s.c(View, int)>
		if(e == null)
	//* 111  219:aload_0         
	//* 112  220:getfield        #246 <Field p e>
	//* 113  223:ifnonnull       238
			e = android.support.v4.widget.p.a(((ViewGroup) (coordinatorlayout)), v);
	//  114  226:aload_0         
	//  115  227:aload_1         
	//  116  228:aload_0         
	//  117  229:getfield        #61  <Field android.support.v4.widget.p$a v>
	//  118  232:invokestatic    #312 <Method p p.a(ViewGroup, android.support.v4.widget.p$a)>
	//  119  235:putfield        #246 <Field p e>
		g = new WeakReference(((Object) (view)));
	//  120  238:aload_0         
	//  121  239:new             #201 <Class WeakReference>
	//  122  242:dup             
	//  123  243:aload_2         
	//  124  244:invokespecial   #315 <Method void WeakReference(Object)>
	//  125  247:putfield        #199 <Field WeakReference g>
		h = new WeakReference(((Object) (a(view))));
	//  126  250:aload_0         
	//  127  251:new             #201 <Class WeakReference>
	//  128  254:dup             
	//  129  255:aload_0         
	//  130  256:aload_2         
	//  131  257:invokevirtual   #184 <Method View a(View)>
	//  132  260:invokespecial   #315 <Method void WeakReference(Object)>
	//  133  263:putfield        #222 <Field WeakReference h>
		return true;
	//  134  266:iconst_1        
	//  135  267:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int i1;
		boolean flag3;
		boolean flag = view.isShown();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #321 <Method boolean View.isShown()>
	//    2    4:istore          6
		flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(!flag)
	//*   5    9:iload           6
	//*   6   11:ifne            21
		{
			p = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #323 <Field boolean p>
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		}
		i1 = motionevent.getActionMasked();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #328 <Method int MotionEvent.getActionMasked()>
	//   14   25:istore          4
		if(i1 == 0)
	//*  15   27:iload           4
	//*  16   29:ifne            36
			b();
	//   17   32:aload_0         
	//   18   33:invokespecial   #330 <Method void b()>
		if(t == null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #155 <Field VelocityTracker t>
	//*  21   40:ifnonnull       50
			t = VelocityTracker.obtain();
	//   22   43:aload_0         
	//   23   44:invokestatic    #334 <Method VelocityTracker VelocityTracker.obtain()>
	//   24   47:putfield        #155 <Field VelocityTracker t>
		t.addMovement(motionevent);
	//   25   50:aload_0         
	//   26   51:getfield        #155 <Field VelocityTracker t>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #338 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i1 == 3) goto _L2; else goto _L1
	//   29   58:iload           4
	//   30   60:iconst_3        
	//   31   61:icmpeq          209
_L1:
		i1;
	//   32   64:iload           4
		JVM INSTR tableswitch 0 1: default 88
	//	               0 91
	//	               1 209;
	//   33   66:tableswitch     0 1: default 88
	//	               0 91
	//	               1 209
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   34   88:goto            233
_L4:
		int j1 = (int)motionevent.getX();
	//   35   91:aload_3         
	//   36   92:invokevirtual   #341 <Method float MotionEvent.getX()>
	//   37   95:f2i             
	//   38   96:istore          5
		u = (int)motionevent.getY();
	//   39   98:aload_0         
	//   40   99:aload_3         
	//   41  100:invokevirtual   #344 <Method float MotionEvent.getY()>
	//   42  103:f2i             
	//   43  104:putfield        #346 <Field int u>
		View view1;
		if(h != null)
	//*  44  107:aload_0         
	//*  45  108:getfield        #222 <Field WeakReference h>
	//*  46  111:ifnull          129
			view1 = (View)h.get();
	//   47  114:aload_0         
	//   48  115:getfield        #222 <Field WeakReference h>
	//   49  118:invokevirtual   #204 <Method Object WeakReference.get()>
	//   50  121:checkcast       #131 <Class View>
	//   51  124:astore          8
		else
	//*  52  126:goto            132
			view1 = null;
	//   53  129:aconst_null     
	//   54  130:astore          8
		if(view1 != null && coordinatorlayout.a(view1, j1, u))
	//*  55  132:aload           8
	//*  56  134:ifnull          169
	//*  57  137:aload_1         
	//*  58  138:aload           8
	//*  59  140:iload           5
	//*  60  142:aload_0         
	//*  61  143:getfield        #346 <Field int u>
	//*  62  146:invokevirtual   #347 <Method boolean CoordinatorLayout.a(View, int, int)>
	//*  63  149:ifeq            169
		{
			i = motionevent.getPointerId(motionevent.getActionIndex());
	//   64  152:aload_0         
	//   65  153:aload_3         
	//   66  154:aload_3         
	//   67  155:invokevirtual   #350 <Method int MotionEvent.getActionIndex()>
	//   68  158:invokevirtual   #353 <Method int MotionEvent.getPointerId(int)>
	//   69  161:putfield        #153 <Field int i>
			j = true;
	//   70  164:aload_0         
	//   71  165:iconst_1        
	//   72  166:putfield        #355 <Field boolean j>
		}
		boolean flag1;
		if(i == -1 && !coordinatorlayout.a(view, j1, u))
	//*  73  169:aload_0         
	//*  74  170:getfield        #153 <Field int i>
	//*  75  173:iconst_m1       
	//*  76  174:icmpne          197
	//*  77  177:aload_1         
	//*  78  178:aload_2         
	//*  79  179:iload           5
	//*  80  181:aload_0         
	//*  81  182:getfield        #346 <Field int u>
	//*  82  185:invokevirtual   #347 <Method boolean CoordinatorLayout.a(View, int, int)>
	//*  83  188:ifne            197
			flag1 = true;
	//   84  191:iconst_1        
	//   85  192:istore          6
		else
	//*  86  194:goto            200
			flag1 = false;
	//   87  197:iconst_0        
	//   88  198:istore          6
		p = flag1;
	//   89  200:aload_0         
	//   90  201:iload           6
	//   91  203:putfield        #323 <Field boolean p>
		break; /* Loop/switch isn't completed */
	//   92  206:goto            233
_L2:
		j = false;
	//   93  209:aload_0         
	//   94  210:iconst_0        
	//   95  211:putfield        #355 <Field boolean j>
		i = -1;
	//   96  214:aload_0         
	//   97  215:iconst_m1       
	//   98  216:putfield        #153 <Field int i>
		if(p)
	//*  99  219:aload_0         
	//* 100  220:getfield        #323 <Field boolean p>
	//* 101  223:ifeq            233
		{
			p = false;
	//  102  226:aload_0         
	//  103  227:iconst_0        
	//  104  228:putfield        #323 <Field boolean p>
			return false;
	//  105  231:iconst_0        
	//  106  232:ireturn         
		}
		if(!p && e.a(motionevent))
	//* 107  233:aload_0         
	//* 108  234:getfield        #323 <Field boolean p>
	//* 109  237:ifne            253
	//* 110  240:aload_0         
	//* 111  241:getfield        #246 <Field p e>
	//* 112  244:aload_3         
	//* 113  245:invokevirtual   #358 <Method boolean p.a(MotionEvent)>
	//* 114  248:ifeq            253
			return true;
	//  115  251:iconst_1        
	//  116  252:ireturn         
		view = (View)h.get();
	//  117  253:aload_0         
	//  118  254:getfield        #222 <Field WeakReference h>
	//  119  257:invokevirtual   #204 <Method Object WeakReference.get()>
	//  120  260:checkcast       #131 <Class View>
	//  121  263:astore_2        
		boolean flag2 = flag3;
	//  122  264:iload           7
	//  123  266:istore          6
		if(i1 == 2)
	//* 124  268:iload           4
	//* 125  270:iconst_2        
	//* 126  271:icmpne          359
		{
			flag2 = flag3;
	//  127  274:iload           7
	//  128  276:istore          6
			if(view != null)
	//* 129  278:aload_2         
	//* 130  279:ifnull          359
			{
				flag2 = flag3;
	//  131  282:iload           7
	//  132  284:istore          6
				if(!p)
	//* 133  286:aload_0         
	//* 134  287:getfield        #323 <Field boolean p>
	//* 135  290:ifne            359
				{
					flag2 = flag3;
	//  136  293:iload           7
	//  137  295:istore          6
					if(d != 1)
	//* 138  297:aload_0         
	//* 139  298:getfield        #56  <Field int d>
	//* 140  301:iconst_1        
	//* 141  302:icmpeq          359
					{
						flag2 = flag3;
	//  142  305:iload           7
	//  143  307:istore          6
						if(!coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//* 144  309:aload_1         
	//* 145  310:aload_2         
	//* 146  311:aload_3         
	//* 147  312:invokevirtual   #341 <Method float MotionEvent.getX()>
	//* 148  315:f2i             
	//* 149  316:aload_3         
	//* 150  317:invokevirtual   #344 <Method float MotionEvent.getY()>
	//* 151  320:f2i             
	//* 152  321:invokevirtual   #347 <Method boolean CoordinatorLayout.a(View, int, int)>
	//* 153  324:ifne            359
						{
							flag2 = flag3;
	//  154  327:iload           7
	//  155  329:istore          6
							if(Math.abs((float)u - motionevent.getY()) > (float)e.d())
	//* 156  331:aload_0         
	//* 157  332:getfield        #346 <Field int u>
	//* 158  335:i2f             
	//* 159  336:aload_3         
	//* 160  337:invokevirtual   #344 <Method float MotionEvent.getY()>
	//* 161  340:fsub            
	//* 162  341:invokestatic    #362 <Method float Math.abs(float)>
	//* 163  344:aload_0         
	//* 164  345:getfield        #246 <Field p e>
	//* 165  348:invokevirtual   #364 <Method int p.d()>
	//* 166  351:i2f             
	//* 167  352:fcmpl           
	//* 168  353:ifle            359
								flag2 = true;
	//  169  356:iconst_1        
	//  170  357:istore          6
						}
					}
				}
			}
		}
		return flag2;
	//  171  359:iload           6
	//  172  361:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f1, float f2)
	{
		return view1 == h.get() && (d != 3 || super.a(coordinatorlayout, view, view1, f1, f2));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #222 <Field WeakReference h>
	//    3    5:invokevirtual   #204 <Method Object WeakReference.get()>
	//    4    8:if_acmpne       35
	//    5   11:aload_0         
	//    6   12:getfield        #56  <Field int d>
	//    7   15:iconst_3        
	//    8   16:icmpne          33
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:fload           4
	//   14   25:fload           5
	//   15   27:invokespecial   #368 <Method boolean CoordinatorLayout$Behavior.a(CoordinatorLayout, View, View, float, float)>
	//   16   30:ifeq            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		q = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #241 <Field int q>
		r = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #243 <Field boolean r>
		if((i1 & 2) != 0)
	//*   8   13:iload           5
	//*   9   15:iconst_2        
	//*  10   16:iand            
	//*  11   17:ifeq            23
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          6
		return flag;
	//   14   23:iload           6
	//   15   25:ireturn         
	}

	boolean a(View view, float f1)
	{
		if(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #374 <Field boolean o>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(view.getTop() < b)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #225 <Method int View.getTop()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #197 <Field int b>
	//*   9   17:icmpge          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		return Math.abs(((float)view.getTop() + f1 * 0.1F) - (float)b) / (float)l > 0.5F;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #225 <Method int View.getTop()>
	//   14   26:i2f             
	//   15   27:fload_2         
	//   16   28:ldc2            #375 <Float 0.1F>
	//   17   31:fmul            
	//   18   32:fadd            
	//   19   33:aload_0         
	//   20   34:getfield        #197 <Field int b>
	//   21   37:i2f             
	//   22   38:fsub            
	//   23   39:invokestatic    #362 <Method float Math.abs(float)>
	//   24   42:aload_0         
	//   25   43:getfield        #188 <Field int l>
	//   26   46:i2f             
	//   27   47:fdiv            
	//   28   48:ldc2            #376 <Float 0.5F>
	//   29   51:fcmpl           
	//   30   52:ifle            57
	//   31   55:iconst_1        
	//   32   56:ireturn         
	//   33   57:iconst_0        
	//   34   58:ireturn         
	}

	public Parcelable b(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (new SavedState(super.b(coordinatorlayout, view), d)));
	//    0    0:new             #11  <Class BottomSheetBehavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #379 <Method Parcelable CoordinatorLayout$Behavior.b(CoordinatorLayout, View)>
	//    6   10:aload_0         
	//    7   11:getfield        #56  <Field int d>
	//    8   14:invokespecial   #382 <Method void BottomSheetBehavior$SavedState(Parcelable, int)>
	//    9   17:areturn         
	}

	public final void b(int i1)
	{
		if(i1 == d)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #56  <Field int d>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		if(g == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #199 <Field WeakReference g>
	//*   7   13:ifnonnull       44
		{
			if(i1 == 4 || i1 == 3 || c && i1 == 5)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:icmpeq          38
	//*  11   21:iload_1         
	//*  12   22:iconst_3        
	//*  13   23:icmpeq          38
	//*  14   26:aload_0         
	//*  15   27:getfield        #237 <Field boolean c>
	//*  16   30:ifeq            43
	//*  17   33:iload_1         
	//*  18   34:iconst_5        
	//*  19   35:icmpne          43
				d = i1;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:putfield        #56  <Field int d>
			return;
	//   23   43:return          
		}
		View view = (View)g.get();
	//   24   44:aload_0         
	//   25   45:getfield        #199 <Field WeakReference g>
	//   26   48:invokevirtual   #204 <Method Object WeakReference.get()>
	//   27   51:checkcast       #131 <Class View>
	//   28   54:astore_2        
		if(view == null)
	//*  29   55:aload_2         
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		ViewParent viewparent = view.getParent();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #387 <Method ViewParent View.getParent()>
	//   34   64:astore_3        
		if(viewparent != null && viewparent.isLayoutRequested() && android.support.v4.view.s.A(view))
	//*  35   65:aload_3         
	//*  36   66:ifnull          101
	//*  37   69:aload_3         
	//*  38   70:invokeinterface #392 <Method boolean ViewParent.isLayoutRequested()>
	//*  39   75:ifeq            101
	//*  40   78:aload_2         
	//*  41   79:invokestatic    #395 <Method boolean s.A(View)>
	//*  42   82:ifeq            101
		{
			view.post(new Runnable(view, i1) {

				public void run()
				{
					c.a(a, b);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field BottomSheetBehavior c>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field View a>
				//    4    8:aload_0         
				//    5    9:getfield        #24  <Field int b>
				//    6   12:invokevirtual   #32  <Method void BottomSheetBehavior.a(View, int)>
				//    7   15:return          
				}

				final View a;
				final int b;
				final BottomSheetBehavior c;

			
			{
				c = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field BottomSheetBehavior c>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field View a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   43   85:aload_2         
	//   44   86:new             #7   <Class BottomSheetBehavior$1>
	//   45   89:dup             
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:iload_1         
	//   49   93:invokespecial   #396 <Method void BottomSheetBehavior$1(BottomSheetBehavior, View, int)>
	//   50   96:invokevirtual   #400 <Method boolean View.post(Runnable)>
	//   51   99:pop             
			return;
	//   52  100:return          
		} else
		{
			a(view, i1);
	//   53  101:aload_0         
	//   54  102:aload_2         
	//   55  103:iload_1         
	//   56  104:invokevirtual   #401 <Method void a(View, int)>
			return;
	//   57  107:return          
		}
	}

	public void b(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #374 <Field boolean o>
	//    3    5:return          
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(!view.isShown())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #321 <Method boolean View.isShown()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i1 = motionevent.getActionMasked();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #328 <Method int MotionEvent.getActionMasked()>
	//    7   13:istore          4
		if(d == 1 && i1 == 0)
	//*   8   15:aload_0         
	//*   9   16:getfield        #56  <Field int d>
	//*  10   19:iconst_1        
	//*  11   20:icmpne          30
	//*  12   23:iload           4
	//*  13   25:ifne            30
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		e.b(motionevent);
	//   16   30:aload_0         
	//   17   31:getfield        #246 <Field p e>
	//   18   34:aload_3         
	//   19   35:invokevirtual   #403 <Method void p.b(MotionEvent)>
		if(i1 == 0)
	//*  20   38:iload           4
	//*  21   40:ifne            47
			b();
	//   22   43:aload_0         
	//   23   44:invokespecial   #330 <Method void b()>
		if(t == null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #155 <Field VelocityTracker t>
	//*  26   51:ifnonnull       61
			t = VelocityTracker.obtain();
	//   27   54:aload_0         
	//   28   55:invokestatic    #334 <Method VelocityTracker VelocityTracker.obtain()>
	//   29   58:putfield        #155 <Field VelocityTracker t>
		t.addMovement(motionevent);
	//   30   61:aload_0         
	//   31   62:getfield        #155 <Field VelocityTracker t>
	//   32   65:aload_3         
	//   33   66:invokevirtual   #338 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i1 == 2 && !p && Math.abs((float)u - motionevent.getY()) > (float)e.d())
	//*  34   69:iload           4
	//*  35   71:iconst_2        
	//*  36   72:icmpne          123
	//*  37   75:aload_0         
	//*  38   76:getfield        #323 <Field boolean p>
	//*  39   79:ifne            123
	//*  40   82:aload_0         
	//*  41   83:getfield        #346 <Field int u>
	//*  42   86:i2f             
	//*  43   87:aload_3         
	//*  44   88:invokevirtual   #344 <Method float MotionEvent.getY()>
	//*  45   91:fsub            
	//*  46   92:invokestatic    #362 <Method float Math.abs(float)>
	//*  47   95:aload_0         
	//*  48   96:getfield        #246 <Field p e>
	//*  49   99:invokevirtual   #364 <Method int p.d()>
	//*  50  102:i2f             
	//*  51  103:fcmpl           
	//*  52  104:ifle            123
			e.a(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   53  107:aload_0         
	//   54  108:getfield        #246 <Field p e>
	//   55  111:aload_2         
	//   56  112:aload_3         
	//   57  113:aload_3         
	//   58  114:invokevirtual   #350 <Method int MotionEvent.getActionIndex()>
	//   59  117:invokevirtual   #353 <Method int MotionEvent.getPointerId(int)>
	//   60  120:invokevirtual   #404 <Method void p.a(View, int)>
		return p ^ true;
	//   61  123:aload_0         
	//   62  124:getfield        #323 <Field boolean p>
	//   63  127:iconst_1        
	//   64  128:ixor            
	//   65  129:ireturn         
	}

	void c(int i1)
	{
		if(d == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field int d>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		d = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #56  <Field int d>
		View view = (View)g.get();
	//    8   14:aload_0         
	//    9   15:getfield        #199 <Field WeakReference g>
	//   10   18:invokevirtual   #204 <Method Object WeakReference.get()>
	//   11   21:checkcast       #131 <Class View>
	//   12   24:astore_2        
		if(view != null && s != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          45
	//*  15   29:aload_0         
	//*  16   30:getfield        #210 <Field BottomSheetBehavior$a s>
	//*  17   33:ifnull          45
			s.a(view, i1);
	//   18   36:aload_0         
	//   19   37:getfield        #210 <Field BottomSheetBehavior$a s>
	//   20   40:aload_2         
	//   21   41:iload_1         
	//   22   42:invokevirtual   #405 <Method void BottomSheetBehavior$a.a(View, int)>
	//   23   45:return          
	}

	public void c(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		byte byte0;
		int i1 = view.getTop();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #225 <Method int View.getTop()>
	//    2    4:istore          5
		int k1 = a;
	//    3    6:aload_0         
	//    4    7:getfield        #226 <Field int a>
	//    5   10:istore          6
		byte0 = 3;
	//    6   12:iconst_3        
	//    7   13:istore          4
		if(i1 == k1)
	//*   8   15:iload           5
	//*   9   17:iload           6
	//*  10   19:icmpne          28
		{
			c(3);
	//   11   22:aload_0         
	//   12   23:iconst_3        
	//   13   24:invokevirtual   #231 <Method void c(int)>
			return;
	//   14   27:return          
		}
		if(h == null || view1 != h.get())
			break MISSING_BLOCK_LABEL_200;
	//   15   28:aload_0         
	//   16   29:getfield        #222 <Field WeakReference h>
	//   17   32:ifnull          200
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #222 <Field WeakReference h>
	//   21   40:invokevirtual   #204 <Method Object WeakReference.get()>
	//   22   43:if_acmpne       200
		if(!r)
	//*  23   46:aload_0         
	//*  24   47:getfield        #243 <Field boolean r>
	//*  25   50:ifne            54
			return;
	//   26   53:return          
		if(q <= 0) goto _L2; else goto _L1
	//   27   54:aload_0         
	//   28   55:getfield        #241 <Field int q>
	//   29   58:ifle            70
_L1:
		int j1;
		j1 = a;
	//   30   61:aload_0         
	//   31   62:getfield        #226 <Field int a>
	//   32   65:istore          5
		break MISSING_BLOCK_LABEL_149;
	//   33   67:goto            149
_L2:
		if(c && a(view, d()))
	//*  34   70:aload_0         
	//*  35   71:getfield        #237 <Field boolean c>
	//*  36   74:ifeq            101
	//*  37   77:aload_0         
	//*  38   78:aload_2         
	//*  39   79:aload_0         
	//*  40   80:invokespecial   #408 <Method float d()>
	//*  41   83:invokevirtual   #410 <Method boolean a(View, float)>
	//*  42   86:ifeq            101
		{
			j1 = f;
	//   43   89:aload_0         
	//   44   90:getfield        #195 <Field int f>
	//   45   93:istore          5
			byte0 = 5;
	//   46   95:iconst_5        
	//   47   96:istore          4
			break MISSING_BLOCK_LABEL_149;
	//   48   98:goto            149
		}
		if(q != 0)
			break; /* Loop/switch isn't completed */
	//   49  101:aload_0         
	//   50  102:getfield        #241 <Field int q>
	//   51  105:ifne            140
		j1 = view.getTop();
	//   52  108:aload_2         
	//   53  109:invokevirtual   #225 <Method int View.getTop()>
	//   54  112:istore          5
		if(Math.abs(j1 - a) >= Math.abs(j1 - b)) goto _L3; else goto _L1
	//   55  114:iload           5
	//   56  116:aload_0         
	//   57  117:getfield        #226 <Field int a>
	//   58  120:isub            
	//   59  121:invokestatic    #412 <Method int Math.abs(int)>
	//   60  124:iload           5
	//   61  126:aload_0         
	//   62  127:getfield        #197 <Field int b>
	//   63  130:isub            
	//   64  131:invokestatic    #412 <Method int Math.abs(int)>
	//   65  134:icmpge          140
	//*  66  137:goto            61
_L3:
		j1 = b;
	//   67  140:aload_0         
	//   68  141:getfield        #197 <Field int b>
	//   69  144:istore          5
		byte0 = 4;
	//   70  146:iconst_4        
	//   71  147:istore          4
		if(e.a(view, view.getLeft(), j1))
	//*  72  149:aload_0         
	//*  73  150:getfield        #246 <Field p e>
	//*  74  153:aload_2         
	//*  75  154:aload_2         
	//*  76  155:invokevirtual   #249 <Method int View.getLeft()>
	//*  77  158:iload           5
	//*  78  160:invokevirtual   #254 <Method boolean p.a(View, int, int)>
	//*  79  163:ifeq            189
		{
			c(2);
	//   80  166:aload_0         
	//   81  167:iconst_2        
	//   82  168:invokevirtual   #231 <Method void c(int)>
			android.support.v4.view.s.a(view, ((Runnable) (new b(view, ((int) (byte0))))));
	//   83  171:aload_2         
	//   84  172:new             #19  <Class BottomSheetBehavior$b>
	//   85  175:dup             
	//   86  176:aload_0         
	//   87  177:aload_2         
	//   88  178:iload           4
	//   89  180:invokespecial   #257 <Method void BottomSheetBehavior$b(BottomSheetBehavior, View, int)>
	//   90  183:invokestatic    #260 <Method void s.a(View, Runnable)>
		} else
	//*  91  186:goto            195
		{
			c(((int) (byte0)));
	//   92  189:aload_0         
	//   93  190:iload           4
	//   94  192:invokevirtual   #231 <Method void c(int)>
		}
		r = false;
	//   95  195:aload_0         
	//   96  196:iconst_0        
	//   97  197:putfield        #243 <Field boolean r>
	//   98  200:return          
	}

	void d(int i1)
	{
		View view = (View)g.get();
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field WeakReference g>
	//    2    4:invokevirtual   #204 <Method Object WeakReference.get()>
	//    3    7:checkcast       #131 <Class View>
	//    4   10:astore          5
		if(view != null && s != null)
	//*   5   12:aload           5
	//*   6   14:ifnull          97
	//*   7   17:aload_0         
	//*   8   18:getfield        #210 <Field BottomSheetBehavior$a s>
	//*   9   21:ifnull          97
		{
			float f1;
			int j1;
			a a1;
			if(i1 > b)
	//*  10   24:iload_1         
	//*  11   25:aload_0         
	//*  12   26:getfield        #197 <Field int b>
	//*  13   29:icmple          70
			{
				a1 = s;
	//   14   32:aload_0         
	//   15   33:getfield        #210 <Field BottomSheetBehavior$a s>
	//   16   36:astore          4
				f1 = b - i1;
	//   17   38:aload_0         
	//   18   39:getfield        #197 <Field int b>
	//   19   42:iload_1         
	//   20   43:isub            
	//   21   44:i2f             
	//   22   45:fstore_2        
				i1 = f;
	//   23   46:aload_0         
	//   24   47:getfield        #195 <Field int f>
	//   25   50:istore_1        
				j1 = b;
	//   26   51:aload_0         
	//   27   52:getfield        #197 <Field int b>
	//   28   55:istore_3        
			} else
	//*  29   56:aload           4
	//*  30   58:aload           5
	//*  31   60:fload_2         
	//*  32   61:iload_1         
	//*  33   62:iload_3         
	//*  34   63:isub            
	//*  35   64:i2f             
	//*  36   65:fdiv            
	//*  37   66:invokevirtual   #416 <Method void BottomSheetBehavior$a.a(View, float)>
	//*  38   69:return          
			{
				a1 = s;
	//   39   70:aload_0         
	//   40   71:getfield        #210 <Field BottomSheetBehavior$a s>
	//   41   74:astore          4
				f1 = b - i1;
	//   42   76:aload_0         
	//   43   77:getfield        #197 <Field int b>
	//   44   80:iload_1         
	//   45   81:isub            
	//   46   82:i2f             
	//   47   83:fstore_2        
				i1 = b;
	//   48   84:aload_0         
	//   49   85:getfield        #197 <Field int b>
	//   50   88:istore_1        
				j1 = a;
	//   51   89:aload_0         
	//   52   90:getfield        #226 <Field int a>
	//   53   93:istore_3        
			}
			a1.a(view, f1 / (float)(i1 - j1));
			return;
		} else
	//*  54   94:goto            56
		{
			return;
	//   55   97:return          
		}
	}

	int a;
	int b;
	boolean c;
	int d;
	p e;
	int f;
	WeakReference g;
	WeakReference h;
	int i;
	boolean j;
	private float k;
	private int l;
	private boolean m;
	private int n;
	private boolean o;
	private boolean p;
	private int q;
	private boolean r;
	private a s;
	private VelocityTracker t;
	private int u;
	private final android.support.v4.widget.p.a v;
}
