// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.*;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentManager, FragmentTransaction, Fragment

public class FragmentTabHost extends TabHost
	implements android.widget.TabHost.OnTabChangeListener
{
	static class SavedState extends android.view.View.BaseSavedState
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #39  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentTabHost.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #42  <String "FragmentTabHost.SavedState{">
		//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #52  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #58  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" curTab=");
		//   14   27:aload_1         
		//   15   28:ldc1            #60  <String " curTab=">
		//   16   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(curTab);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #33  <Field String curTab>
		//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #62  <String "}">
		//   25   46:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #68  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeString(curTab);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field String curTab>
		//    7   11:invokevirtual   #72  <Method void Parcel.writeString(String)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class FragmentTabHost$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void FragmentTabHost$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method FragmentTabHost$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method FragmentTabHost$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		String curTab;

		static 
		{
		//    0    0:new             #9   <Class FragmentTabHost$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void FragmentTabHost$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
			curTab = parcel.readString();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
		//    6   10:putfield        #33  <Field String curTab>
		//    7   13:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	static final class TabInfo
	{

		final Bundle args;
		final Class clss;
		Fragment fragment;
		final String tag;
	}


	private FragmentTransaction doTabChanged(String s, FragmentTransaction fragmenttransaction)
	{
		TabInfo tabinfo = getTabInfoForTag(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method FragmentTabHost$TabInfo getTabInfoForTag(String)>
	//    3    5:astore_3        
		s = ((String) (fragmenttransaction));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(mLastTab != tabinfo)
	//*   6    8:aload_0         
	//*   7    9:getfield        #38  <Field FragmentTabHost$TabInfo mLastTab>
	//*   8   12:aload_3         
	//*   9   13:if_acmpeq       125
		{
			s = ((String) (fragmenttransaction));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(fragmenttransaction == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       30
				s = ((String) (mFragmentManager.beginTransaction()));
	//   14   22:aload_0         
	//   15   23:getfield        #40  <Field FragmentManager mFragmentManager>
	//   16   26:invokevirtual   #46  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   17   29:astore_1        
			fragmenttransaction = ((FragmentTransaction) (mLastTab));
	//   18   30:aload_0         
	//   19   31:getfield        #38  <Field FragmentTabHost$TabInfo mLastTab>
	//   20   34:astore_2        
			if(fragmenttransaction != null && ((TabInfo) (fragmenttransaction)).fragment != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          58
	//*  23   39:aload_2         
	//*  24   40:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  25   43:ifnull          58
				((FragmentTransaction) (s)).detach(mLastTab.fragment);
	//   26   46:aload_1         
	//   27   47:aload_0         
	//   28   48:getfield        #38  <Field FragmentTabHost$TabInfo mLastTab>
	//   29   51:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   30   54:invokevirtual   #56  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   31   57:pop             
			if(tabinfo != null)
	//*  32   58:aload_3         
	//*  33   59:ifnull          120
				if(tabinfo.fragment == null)
	//*  34   62:aload_3         
	//*  35   63:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  36   66:ifnonnull       111
				{
					tabinfo.fragment = Fragment.instantiate(mContext, tabinfo.clss.getName(), tabinfo.args);
	//   37   69:aload_3         
	//   38   70:aload_0         
	//   39   71:getfield        #58  <Field Context mContext>
	//   40   74:aload_3         
	//   41   75:getfield        #62  <Field Class FragmentTabHost$TabInfo.clss>
	//   42   78:invokevirtual   #68  <Method String Class.getName()>
	//   43   81:aload_3         
	//   44   82:getfield        #72  <Field Bundle FragmentTabHost$TabInfo.args>
	//   45   85:invokestatic    #78  <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//   46   88:putfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
					((FragmentTransaction) (s)).add(mContainerId, tabinfo.fragment, tabinfo.tag);
	//   47   91:aload_1         
	//   48   92:aload_0         
	//   49   93:getfield        #80  <Field int mContainerId>
	//   50   96:aload_3         
	//   51   97:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   52  100:aload_3         
	//   53  101:getfield        #84  <Field String FragmentTabHost$TabInfo.tag>
	//   54  104:invokevirtual   #88  <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   55  107:pop             
				} else
	//*  56  108:goto            120
				{
					((FragmentTransaction) (s)).attach(tabinfo.fragment);
	//   57  111:aload_1         
	//   58  112:aload_3         
	//   59  113:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   60  116:invokevirtual   #91  <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
	//   61  119:pop             
				}
			mLastTab = tabinfo;
	//   62  120:aload_0         
	//   63  121:aload_3         
	//   64  122:putfield        #38  <Field FragmentTabHost$TabInfo mLastTab>
		}
		return ((FragmentTransaction) (s));
	//   65  125:aload_1         
	//   66  126:areturn         
	}

	private TabInfo getTabInfoForTag(String s)
	{
		int j = mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ArrayList mTabs>
	//    2    4:invokevirtual   #102 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          50
		{
			TabInfo tabinfo = (TabInfo)mTabs.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #96  <Field ArrayList mTabs>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #106 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #13  <Class FragmentTabHost$TabInfo>
	//   14   26:astore          4
			if(tabinfo.tag.equals(((Object) (s))))
	//*  15   28:aload           4
	//*  16   30:getfield        #84  <Field String FragmentTabHost$TabInfo.tag>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  19   37:ifeq            43
				return tabinfo;
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

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void TabHost.onAttachedToWindow()>
		String s = getCurrentTabTag();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #119 <Method String getCurrentTabTag()>
	//    4    8:astore          5
		int j = mTabs.size();
	//    5   10:aload_0         
	//    6   11:getfield        #96  <Field ArrayList mTabs>
	//    7   14:invokevirtual   #102 <Method int ArrayList.size()>
	//    8   17:istore_2        
		FragmentTransaction fragmenttransaction = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		for(int i = 0; i < j;)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload_2         
	//*  15   24:icmpge          144
		{
			TabInfo tabinfo = (TabInfo)mTabs.get(i);
	//   16   27:aload_0         
	//   17   28:getfield        #96  <Field ArrayList mTabs>
	//   18   31:iload_1         
	//   19   32:invokevirtual   #106 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #13  <Class FragmentTabHost$TabInfo>
	//   21   38:astore          6
			tabinfo.fragment = mFragmentManager.findFragmentByTag(tabinfo.tag);
	//   22   40:aload           6
	//   23   42:aload_0         
	//   24   43:getfield        #40  <Field FragmentManager mFragmentManager>
	//   25   46:aload           6
	//   26   48:getfield        #84  <Field String FragmentTabHost$TabInfo.tag>
	//   27   51:invokevirtual   #123 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   28   54:putfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
			FragmentTransaction fragmenttransaction1 = fragmenttransaction;
	//   29   57:aload_3         
	//   30   58:astore          4
			if(tabinfo.fragment != null)
	//*  31   60:aload           6
	//*  32   62:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  33   65:ifnull          134
			{
				fragmenttransaction1 = fragmenttransaction;
	//   34   68:aload_3         
	//   35   69:astore          4
				if(!tabinfo.fragment.isDetached())
	//*  36   71:aload           6
	//*  37   73:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  38   76:invokevirtual   #127 <Method boolean Fragment.isDetached()>
	//*  39   79:ifne            134
					if(tabinfo.tag.equals(((Object) (s))))
	//*  40   82:aload           6
	//*  41   84:getfield        #84  <Field String FragmentTabHost$TabInfo.tag>
	//*  42   87:aload           5
	//*  43   89:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  44   92:ifeq            107
					{
						mLastTab = tabinfo;
	//   45   95:aload_0         
	//   46   96:aload           6
	//   47   98:putfield        #38  <Field FragmentTabHost$TabInfo mLastTab>
						fragmenttransaction1 = fragmenttransaction;
	//   48  101:aload_3         
	//   49  102:astore          4
					} else
	//*  50  104:goto            134
					{
						fragmenttransaction1 = fragmenttransaction;
	//   51  107:aload_3         
	//   52  108:astore          4
						if(fragmenttransaction == null)
	//*  53  110:aload_3         
	//*  54  111:ifnonnull       123
							fragmenttransaction1 = mFragmentManager.beginTransaction();
	//   55  114:aload_0         
	//   56  115:getfield        #40  <Field FragmentManager mFragmentManager>
	//   57  118:invokevirtual   #46  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   58  121:astore          4
						fragmenttransaction1.detach(tabinfo.fragment);
	//   59  123:aload           4
	//   60  125:aload           6
	//   61  127:getfield        #50  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   62  130:invokevirtual   #56  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   63  133:pop             
					}
			}
			i++;
	//   64  134:iload_1         
	//   65  135:iconst_1        
	//   66  136:iadd            
	//   67  137:istore_1        
			fragmenttransaction = fragmenttransaction1;
	//   68  138:aload           4
	//   69  140:astore_3        
		}

	//*  70  141:goto            22
		mAttached = true;
	//   71  144:aload_0         
	//   72  145:iconst_1        
	//   73  146:putfield        #129 <Field boolean mAttached>
		fragmenttransaction = doTabChanged(s, fragmenttransaction);
	//   74  149:aload_0         
	//   75  150:aload           5
	//   76  152:aload_3         
	//   77  153:invokespecial   #131 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
	//   78  156:astore_3        
		if(fragmenttransaction != null)
	//*  79  157:aload_3         
	//*  80  158:ifnull          174
		{
			fragmenttransaction.commit();
	//   81  161:aload_3         
	//   82  162:invokevirtual   #134 <Method int FragmentTransaction.commit()>
	//   83  165:pop             
			mFragmentManager.executePendingTransactions();
	//   84  166:aload_0         
	//   85  167:getfield        #40  <Field FragmentManager mFragmentManager>
	//   86  170:invokevirtual   #137 <Method boolean FragmentManager.executePendingTransactions()>
	//   87  173:pop             
		}
	//   88  174:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method void TabHost.onDetachedFromWindow()>
		mAttached = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #129 <Field boolean mAttached>
	//    5    9:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class FragmentTabHost$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #144 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class FragmentTabHost$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #148 <Method Parcelable FragmentTabHost$SavedState.getSuperState()>
	//   13   23:invokespecial   #144 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			setCurrentTabByTag(((SavedState) (parcelable)).curTab);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #151 <Field String FragmentTabHost$SavedState.curTab>
	//   17   31:invokevirtual   #155 <Method void setCurrentTabByTag(String)>
			return;
	//   18   34:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #8   <Class FragmentTabHost$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #158 <Method Parcelable TabHost.onSaveInstanceState()>
	//    4    8:invokespecial   #161 <Method void FragmentTabHost$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.curTab = getCurrentTabTag();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #119 <Method String getCurrentTabTag()>
	//    9   17:putfield        #151 <Field String FragmentTabHost$SavedState.curTab>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onTabChanged(String s)
	{
		if(mAttached)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean mAttached>
	//*   2    4:ifeq            23
		{
			FragmentTransaction fragmenttransaction = doTabChanged(s, ((FragmentTransaction) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #131 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
	//    7   13:astore_2        
			if(fragmenttransaction != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				fragmenttransaction.commit();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #134 <Method int FragmentTransaction.commit()>
	//   12   22:pop             
		}
		android.widget.TabHost.OnTabChangeListener ontabchangelistener = mOnTabChangeListener;
	//   13   23:aload_0         
	//   14   24:getfield        #164 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
	//   15   27:astore_2        
		if(ontabchangelistener != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          39
			ontabchangelistener.onTabChanged(s);
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokeinterface #166 <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
	//   21   39:return          
	}

	public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
	{
		mOnTabChangeListener = ontabchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #164 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
	//    3    5:return          
	}

	public void setup()
	{
		throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
	//    0    0:new             #172 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #174 <String "Must call setup() that takes a Context and FragmentManager">
	//    3    6:invokespecial   #176 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private boolean mAttached;
	private int mContainerId;
	private Context mContext;
	private FragmentManager mFragmentManager;
	private TabInfo mLastTab;
	private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
	private final ArrayList mTabs;
}
