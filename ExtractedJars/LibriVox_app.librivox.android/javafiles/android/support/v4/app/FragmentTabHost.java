// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			bc, ae, bd, Fragment

public class FragmentTabHost extends TabHost
	implements android.widget.TabHost.OnTabChangeListener
{

	private bc a(String s)
	{
		int j = a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ArrayList a>
	//    2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          50
		{
			bc bc1 = (bc)a.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field ArrayList a>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #35  <Class bc>
	//   14   26:astore          4
			if(bc1.a.equals(((Object) (s))))
	//*  15   28:aload           4
	//*  16   30:getfield        #38  <Field String bc.a>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*  19   37:ifeq            43
				return bc1;
	//   20   40:aload           4
	//   21   42:areturn         
		}

	//   22   43:iload_2         
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore_2        
	//*  26   47:goto            10
		return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
	}

	private bd a(String s, bd bd1)
	{
		bc bc1 = a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method bc a(String)>
	//    3    5:astore_3        
		s = ((String) (bd1));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(f != bc1)
	//*   6    8:aload_0         
	//*   7    9:getfield        #50  <Field bc f>
	//*   8   12:aload_3         
	//*   9   13:if_acmpeq       125
		{
			s = ((String) (bd1));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(bd1 == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       30
				s = ((String) (c.a()));
	//   14   22:aload_0         
	//   15   23:getfield        #52  <Field ae c>
	//   16   26:invokevirtual   #57  <Method bd ae.a()>
	//   17   29:astore_1        
			bd1 = ((bd) (f));
	//   18   30:aload_0         
	//   19   31:getfield        #50  <Field bc f>
	//   20   34:astore_2        
			if(bd1 != null && ((bc) (bd1)).d != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          58
	//*  23   39:aload_2         
	//*  24   40:getfield        #60  <Field Fragment bc.d>
	//*  25   43:ifnull          58
				((bd) (s)).b(f.d);
	//   26   46:aload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #50  <Field bc f>
	//   29   51:getfield        #60  <Field Fragment bc.d>
	//   30   54:invokevirtual   #65  <Method bd bd.b(Fragment)>
	//   31   57:pop             
			if(bc1 != null)
	//*  32   58:aload_3         
	//*  33   59:ifnull          120
				if(bc1.d == null)
	//*  34   62:aload_3         
	//*  35   63:getfield        #60  <Field Fragment bc.d>
	//*  36   66:ifnonnull       111
				{
					bc1.d = Fragment.instantiate(b, bc1.b.getName(), bc1.c);
	//   37   69:aload_3         
	//   38   70:aload_0         
	//   39   71:getfield        #67  <Field Context b>
	//   40   74:aload_3         
	//   41   75:getfield        #70  <Field Class bc.b>
	//   42   78:invokevirtual   #76  <Method String Class.getName()>
	//   43   81:aload_3         
	//   44   82:getfield        #79  <Field android.os.Bundle bc.c>
	//   45   85:invokestatic    #85  <Method Fragment Fragment.instantiate(Context, String, android.os.Bundle)>
	//   46   88:putfield        #60  <Field Fragment bc.d>
					((bd) (s)).a(d, bc1.d, bc1.a);
	//   47   91:aload_1         
	//   48   92:aload_0         
	//   49   93:getfield        #87  <Field int d>
	//   50   96:aload_3         
	//   51   97:getfield        #60  <Field Fragment bc.d>
	//   52  100:aload_3         
	//   53  101:getfield        #38  <Field String bc.a>
	//   54  104:invokevirtual   #90  <Method bd bd.a(int, Fragment, String)>
	//   55  107:pop             
				} else
	//*  56  108:goto            120
				{
					((bd) (s)).c(bc1.d);
	//   57  111:aload_1         
	//   58  112:aload_3         
	//   59  113:getfield        #60  <Field Fragment bc.d>
	//   60  116:invokevirtual   #92  <Method bd bd.c(Fragment)>
	//   61  119:pop             
				}
			f = bc1;
	//   62  120:aload_0         
	//   63  121:aload_3         
	//   64  122:putfield        #50  <Field bc f>
		}
		return ((bd) (s));
	//   65  125:aload_1         
	//   66  126:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void TabHost.onAttachedToWindow()>
		String s = getCurrentTabTag();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #99  <Method String getCurrentTabTag()>
	//    4    8:astore          5
		int j = a.size();
	//    5   10:aload_0         
	//    6   11:getfield        #23  <Field ArrayList a>
	//    7   14:invokevirtual   #29  <Method int ArrayList.size()>
	//    8   17:istore_2        
		bd bd1 = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		for(int i = 0; i < j;)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload_2         
	//*  15   24:icmpge          144
		{
			bc bc1 = (bc)a.get(i);
	//   16   27:aload_0         
	//   17   28:getfield        #23  <Field ArrayList a>
	//   18   31:iload_1         
	//   19   32:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #35  <Class bc>
	//   21   38:astore          6
			bc1.d = c.a(bc1.a);
	//   22   40:aload           6
	//   23   42:aload_0         
	//   24   43:getfield        #52  <Field ae c>
	//   25   46:aload           6
	//   26   48:getfield        #38  <Field String bc.a>
	//   27   51:invokevirtual   #102 <Method Fragment ae.a(String)>
	//   28   54:putfield        #60  <Field Fragment bc.d>
			bd bd2 = bd1;
	//   29   57:aload_3         
	//   30   58:astore          4
			if(bc1.d != null)
	//*  31   60:aload           6
	//*  32   62:getfield        #60  <Field Fragment bc.d>
	//*  33   65:ifnull          134
			{
				bd2 = bd1;
	//   34   68:aload_3         
	//   35   69:astore          4
				if(!bc1.d.isDetached())
	//*  36   71:aload           6
	//*  37   73:getfield        #60  <Field Fragment bc.d>
	//*  38   76:invokevirtual   #106 <Method boolean Fragment.isDetached()>
	//*  39   79:ifne            134
					if(bc1.a.equals(((Object) (s))))
	//*  40   82:aload           6
	//*  41   84:getfield        #38  <Field String bc.a>
	//*  42   87:aload           5
	//*  43   89:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*  44   92:ifeq            107
					{
						f = bc1;
	//   45   95:aload_0         
	//   46   96:aload           6
	//   47   98:putfield        #50  <Field bc f>
						bd2 = bd1;
	//   48  101:aload_3         
	//   49  102:astore          4
					} else
	//*  50  104:goto            134
					{
						bd2 = bd1;
	//   51  107:aload_3         
	//   52  108:astore          4
						if(bd1 == null)
	//*  53  110:aload_3         
	//*  54  111:ifnonnull       123
							bd2 = c.a();
	//   55  114:aload_0         
	//   56  115:getfield        #52  <Field ae c>
	//   57  118:invokevirtual   #57  <Method bd ae.a()>
	//   58  121:astore          4
						bd2.b(bc1.d);
	//   59  123:aload           4
	//   60  125:aload           6
	//   61  127:getfield        #60  <Field Fragment bc.d>
	//   62  130:invokevirtual   #65  <Method bd bd.b(Fragment)>
	//   63  133:pop             
					}
			}
			i++;
	//   64  134:iload_1         
	//   65  135:iconst_1        
	//   66  136:iadd            
	//   67  137:istore_1        
			bd1 = bd2;
	//   68  138:aload           4
	//   69  140:astore_3        
		}

	//*  70  141:goto            22
		g = true;
	//   71  144:aload_0         
	//   72  145:iconst_1        
	//   73  146:putfield        #108 <Field boolean g>
		bd1 = a(s, bd1);
	//   74  149:aload_0         
	//   75  150:aload           5
	//   76  152:aload_3         
	//   77  153:invokespecial   #110 <Method bd a(String, bd)>
	//   78  156:astore_3        
		if(bd1 != null)
	//*  79  157:aload_3         
	//*  80  158:ifnull          174
		{
			bd1.c();
	//   81  161:aload_3         
	//   82  162:invokevirtual   #112 <Method int bd.c()>
	//   83  165:pop             
			c.b();
	//   84  166:aload_0         
	//   85  167:getfield        #52  <Field ae c>
	//   86  170:invokevirtual   #114 <Method boolean ae.b()>
	//   87  173:pop             
		}
	//   88  174:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void TabHost.onDetachedFromWindow()>
		g = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #108 <Field boolean g>
	//    5    9:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #121 <Class FragmentTabHost$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #123 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #121 <Class FragmentTabHost$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #127 <Method Parcelable FragmentTabHost$SavedState.getSuperState()>
	//   13   23:invokespecial   #123 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			setCurrentTabByTag(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #128 <Field String FragmentTabHost$SavedState.a>
	//   17   31:invokevirtual   #132 <Method void setCurrentTabByTag(String)>
			return;
	//   18   34:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #121 <Class FragmentTabHost$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #135 <Method Parcelable TabHost.onSaveInstanceState()>
	//    4    8:invokespecial   #138 <Method void FragmentTabHost$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = getCurrentTabTag();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #99  <Method String getCurrentTabTag()>
	//    9   17:putfield        #128 <Field String FragmentTabHost$SavedState.a>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onTabChanged(String s)
	{
		if(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean g>
	//*   2    4:ifeq            23
		{
			bd bd1 = a(s, ((bd) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #110 <Method bd a(String, bd)>
	//    7   13:astore_2        
			if(bd1 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				bd1.c();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #112 <Method int bd.c()>
	//   12   22:pop             
		}
		android.widget.TabHost.OnTabChangeListener ontabchangelistener = e;
	//   13   23:aload_0         
	//   14   24:getfield        #141 <Field android.widget.TabHost$OnTabChangeListener e>
	//   15   27:astore_2        
		if(ontabchangelistener != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          39
			ontabchangelistener.onTabChanged(s);
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokeinterface #143 <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
	//   21   39:return          
	}

	public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
	{
		e = ontabchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field android.widget.TabHost$OnTabChangeListener e>
	//    3    5:return          
	}

	public void setup()
	{
		throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
	//    0    0:new             #149 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #151 <String "Must call setup() that takes a Context and FragmentManager">
	//    3    6:invokespecial   #153 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private final ArrayList a;
	private Context b;
	private ae c;
	private int d;
	private android.widget.TabHost.OnTabChangeListener e;
	private bc f;
	private boolean g;

	private class SavedState extends android.view.View.BaseSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #35  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #36  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentTabHost.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #38  <String "FragmentTabHost.SavedState{">
		//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #48  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #54  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" curTab=");
		//   14   27:aload_1         
		//   15   28:ldc1            #56  <String " curTab=">
		//   16   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(a);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #29  <Field String a>
		//   21   39:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #58  <String "}">
		//   25   46:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #60  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #64  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeString(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #29  <Field String a>
		//    7   11:invokevirtual   #68  <Method void Parcel.writeString(String)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new bb();
		String a;

		static 
		{
		//    0    0:new             #12  <Class bb>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bb()>
		//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
			a = parcel.readString();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #27  <Method String Parcel.readString()>
		//    6   10:putfield        #29  <Field String a>
		//    7   13:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #32  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
