// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.*;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentManager, FragmentTransaction, Fragment

public class FragmentTabHost extends TabHost
	implements android.widget.TabHost.OnTabChangeListener
{
	static class DummyTabFactory
		implements android.widget.TabHost.TabContentFactory
	{

		public View createTabContent(String s)
		{
			s = ((String) (new View(mContext)));
		//    0    0:new             #23  <Class View>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Context mContext>
		//    4    8:invokespecial   #25  <Method void View(Context)>
		//    5   11:astore_1        
			((View) (s)).setMinimumWidth(0);
		//    6   12:aload_1         
		//    7   13:iconst_0        
		//    8   14:invokevirtual   #29  <Method void View.setMinimumWidth(int)>
			((View) (s)).setMinimumHeight(0);
		//    9   17:aload_1         
		//   10   18:iconst_0        
		//   11   19:invokevirtual   #32  <Method void View.setMinimumHeight(int)>
			return ((View) (s));
		//   12   22:aload_1         
		//   13   23:areturn         
		}

		private final Context mContext;

		public DummyTabFactory(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Context mContext>
		//    5    9:return          
		}
	}

	static class SavedState extends android.view.View.BaseSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" curTab=").append(curTab).append("}").toString();
		//    0    0:new             #39  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void StringBuilder()>
		//    3    7:ldc1            #42  <String "FragmentTabHost.SavedState{">
		//    4    9:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #52  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #58  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #60  <String " curTab=">
		//   10   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #33  <Field String curTab>
		//   13   31:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:ldc1            #62  <String "}">
		//   15   36:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   17   42:areturn         
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

		TabInfo(String s, Class class1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			tag = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field String tag>
			clss = class1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field Class clss>
			args = bundle;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #29  <Field Bundle args>
		//   11   19:return          
		}
	}


	public FragmentTabHost(Context context)
	{
		super(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #39  <Method void TabHost(Context, AttributeSet)>
		mTabs = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #41  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #44  <Method void ArrayList()>
	//    8   14:putfield        #46  <Field ArrayList mTabs>
		initFragmentTabHost(context, ((AttributeSet) (null)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aconst_null     
	//   12   20:invokespecial   #49  <Method void initFragmentTabHost(Context, AttributeSet)>
	//   13   23:return          
	}

	public FragmentTabHost(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method void TabHost(Context, AttributeSet)>
		mTabs = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #41  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #44  <Method void ArrayList()>
	//    8   14:putfield        #46  <Field ArrayList mTabs>
		initFragmentTabHost(context, attributeset);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #49  <Method void initFragmentTabHost(Context, AttributeSet)>
	//   13   23:return          
	}

	private FragmentTransaction doTabChanged(String s, FragmentTransaction fragmenttransaction)
	{
		TabInfo tabinfo = getTabInfoForTag(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method FragmentTabHost$TabInfo getTabInfoForTag(String)>
	//    3    5:astore_3        
		s = ((String) (fragmenttransaction));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(mLastTab != tabinfo)
	//*   6    8:aload_0         
	//*   7    9:getfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
	//*   8   12:aload_3         
	//*   9   13:if_acmpeq       114
		{
			s = ((String) (fragmenttransaction));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(fragmenttransaction == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       30
				s = ((String) (mFragmentManager.beginTransaction()));
	//   14   22:aload_0         
	//   15   23:getfield        #61  <Field FragmentManager mFragmentManager>
	//   16   26:invokevirtual   #67  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   17   29:astore_1        
			if(mLastTab != null && mLastTab.fragment != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
	//*  20   34:ifnull          59
	//*  21   37:aload_0         
	//*  22   38:getfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
	//*  23   41:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  24   44:ifnull          59
				((FragmentTransaction) (s)).detach(mLastTab.fragment);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:getfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
	//   28   52:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   29   55:invokevirtual   #77  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   30   58:pop             
			if(tabinfo != null)
	//*  31   59:aload_3         
	//*  32   60:ifnull          109
				if(tabinfo.fragment == null)
	//*  33   63:aload_3         
	//*  34   64:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  35   67:ifnonnull       116
				{
					tabinfo.fragment = Fragment.instantiate(mContext, tabinfo.clss.getName(), tabinfo.args);
	//   36   70:aload_3         
	//   37   71:aload_0         
	//   38   72:getfield        #79  <Field Context mContext>
	//   39   75:aload_3         
	//   40   76:getfield        #83  <Field Class FragmentTabHost$TabInfo.clss>
	//   41   79:invokevirtual   #89  <Method String Class.getName()>
	//   42   82:aload_3         
	//   43   83:getfield        #93  <Field Bundle FragmentTabHost$TabInfo.args>
	//   44   86:invokestatic    #99  <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//   45   89:putfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
					((FragmentTransaction) (s)).add(mContainerId, tabinfo.fragment, tabinfo.tag);
	//   46   92:aload_1         
	//   47   93:aload_0         
	//   48   94:getfield        #101 <Field int mContainerId>
	//   49   97:aload_3         
	//   50   98:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   51  101:aload_3         
	//   52  102:getfield        #105 <Field String FragmentTabHost$TabInfo.tag>
	//   53  105:invokevirtual   #109 <Method FragmentTransaction FragmentTransaction.add(int, Fragment, String)>
	//   54  108:pop             
				} else
	//*  55  109:aload_0         
	//*  56  110:aload_3         
	//*  57  111:putfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
	//*  58  114:aload_1         
	//*  59  115:areturn         
				{
					((FragmentTransaction) (s)).attach(tabinfo.fragment);
	//   60  116:aload_1         
	//   61  117:aload_3         
	//   62  118:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   63  121:invokevirtual   #112 <Method FragmentTransaction FragmentTransaction.attach(Fragment)>
	//   64  124:pop             
				}
			mLastTab = tabinfo;
		}
		return ((FragmentTransaction) (s));
	//*  65  125:goto            109
	}

	private void ensureContent()
	{
		if(mRealTabContent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field FrameLayout mRealTabContent>
	//*   2    4:ifnonnull       59
		{
			mRealTabContent = (FrameLayout)findViewById(mContainerId);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field int mContainerId>
	//    7   13:invokevirtual   #121 <Method View findViewById(int)>
	//    8   16:checkcast       #123 <Class FrameLayout>
	//    9   19:putfield        #117 <Field FrameLayout mRealTabContent>
			if(mRealTabContent == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #117 <Field FrameLayout mRealTabContent>
	//*  12   26:ifnonnull       59
				throw new IllegalStateException((new StringBuilder()).append("No tab content FrameLayout found for id ").append(mContainerId).toString());
	//   13   29:new             #125 <Class IllegalStateException>
	//   14   32:dup             
	//   15   33:new             #127 <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #128 <Method void StringBuilder()>
	//   18   40:ldc1            #130 <String "No tab content FrameLayout found for id ">
	//   19   42:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:aload_0         
	//   21   46:getfield        #101 <Field int mContainerId>
	//   22   49:invokevirtual   #137 <Method StringBuilder StringBuilder.append(int)>
	//   23   52:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   24   55:invokespecial   #143 <Method void IllegalStateException(String)>
	//   25   58:athrow          
		}
	//   26   59:return          
	}

	private void ensureHierarchy(Context context)
	{
		if(findViewById(0x1020013) == null)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #145 <Int 0x1020013>
	//*   2    3:invokevirtual   #121 <Method View findViewById(int)>
	//*   3    6:ifnonnull       143
		{
			LinearLayout linearlayout = new LinearLayout(context);
	//    4    9:new             #147 <Class LinearLayout>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #149 <Method void LinearLayout(Context)>
	//    8   17:astore_2        
			linearlayout.setOrientation(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #153 <Method void LinearLayout.setOrientation(int)>
			addView(((View) (linearlayout)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:new             #155 <Class android.widget.FrameLayout$LayoutParams>
	//   15   28:dup             
	//   16   29:iconst_m1       
	//   17   30:iconst_m1       
	//   18   31:invokespecial   #158 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   19   34:invokevirtual   #162 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			Object obj = ((Object) (new TabWidget(context)));
	//   20   37:new             #164 <Class TabWidget>
	//   21   40:dup             
	//   22   41:aload_1         
	//   23   42:invokespecial   #165 <Method void TabWidget(Context)>
	//   24   45:astore_3        
			((TabWidget) (obj)).setId(0x1020013);
	//   25   46:aload_3         
	//   26   47:ldc1            #145 <Int 0x1020013>
	//   27   49:invokevirtual   #168 <Method void TabWidget.setId(int)>
			((TabWidget) (obj)).setOrientation(0);
	//   28   52:aload_3         
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #169 <Method void TabWidget.setOrientation(int)>
			linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F))));
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:new             #171 <Class android.widget.LinearLayout$LayoutParams>
	//   34   62:dup             
	//   35   63:iconst_m1       
	//   36   64:bipush          -2
	//   37   66:fconst_0        
	//   38   67:invokespecial   #174 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   39   70:invokevirtual   #175 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			obj = ((Object) (new FrameLayout(context)));
	//   40   73:new             #123 <Class FrameLayout>
	//   41   76:dup             
	//   42   77:aload_1         
	//   43   78:invokespecial   #176 <Method void FrameLayout(Context)>
	//   44   81:astore_3        
			((FrameLayout) (obj)).setId(0x1020011);
	//   45   82:aload_3         
	//   46   83:ldc1            #177 <Int 0x1020011>
	//   47   85:invokevirtual   #178 <Method void FrameLayout.setId(int)>
			linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(0, 0, 0.0F))));
	//   48   88:aload_2         
	//   49   89:aload_3         
	//   50   90:new             #171 <Class android.widget.LinearLayout$LayoutParams>
	//   51   93:dup             
	//   52   94:iconst_0        
	//   53   95:iconst_0        
	//   54   96:fconst_0        
	//   55   97:invokespecial   #174 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   56  100:invokevirtual   #175 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			context = ((Context) (new FrameLayout(context)));
	//   57  103:new             #123 <Class FrameLayout>
	//   58  106:dup             
	//   59  107:aload_1         
	//   60  108:invokespecial   #176 <Method void FrameLayout(Context)>
	//   61  111:astore_1        
			mRealTabContent = ((FrameLayout) (context));
	//   62  112:aload_0         
	//   63  113:aload_1         
	//   64  114:putfield        #117 <Field FrameLayout mRealTabContent>
			mRealTabContent.setId(mContainerId);
	//   65  117:aload_0         
	//   66  118:getfield        #117 <Field FrameLayout mRealTabContent>
	//   67  121:aload_0         
	//   68  122:getfield        #101 <Field int mContainerId>
	//   69  125:invokevirtual   #178 <Method void FrameLayout.setId(int)>
			linearlayout.addView(((View) (context)), ((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F))));
	//   70  128:aload_2         
	//   71  129:aload_1         
	//   72  130:new             #171 <Class android.widget.LinearLayout$LayoutParams>
	//   73  133:dup             
	//   74  134:iconst_m1       
	//   75  135:iconst_0        
	//   76  136:fconst_1        
	//   77  137:invokespecial   #174 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   78  140:invokevirtual   #175 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		}
	//   79  143:return          
	}

	private TabInfo getTabInfoForTag(String s)
	{
		int j = mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ArrayList mTabs>
	//    2    4:invokevirtual   #182 <Method int ArrayList.size()>
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
	//   10   16:getfield        #46  <Field ArrayList mTabs>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #16  <Class FragmentTabHost$TabInfo>
	//   14   26:astore          4
			if(tabinfo.tag.equals(((Object) (s))))
	//*  15   28:aload           4
	//*  16   30:getfield        #105 <Field String FragmentTabHost$TabInfo.tag>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #192 <Method boolean String.equals(Object)>
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

	private void initFragmentTabHost(Context context, AttributeSet attributeset)
	{
		context = ((Context) (context.obtainStyledAttributes(attributeset, new int[] {
			0x10100f3
		}, 0, 0)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:ldc1            #193 <Int 0x10100f3>
	//    7    9:iastore         
	//    8   10:iconst_0        
	//    9   11:iconst_0        
	//   10   12:invokevirtual   #199 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   11   15:astore_1        
		mContainerId = ((TypedArray) (context)).getResourceId(0, 0);
	//   12   16:aload_0         
	//   13   17:aload_1         
	//   14   18:iconst_0        
	//   15   19:iconst_0        
	//   16   20:invokevirtual   #205 <Method int TypedArray.getResourceId(int, int)>
	//   17   23:putfield        #101 <Field int mContainerId>
		((TypedArray) (context)).recycle();
	//   18   26:aload_1         
	//   19   27:invokevirtual   #208 <Method void TypedArray.recycle()>
		super.setOnTabChangedListener(((android.widget.TabHost.OnTabChangeListener) (this)));
	//   20   30:aload_0         
	//   21   31:aload_0         
	//   22   32:invokespecial   #212 <Method void TabHost.setOnTabChangedListener(android.widget.TabHost$OnTabChangeListener)>
	//   23   35:return          
	}

	public void addTab(android.widget.TabHost.TabSpec tabspec, Class class1, Bundle bundle)
	{
		tabspec.setContent(((android.widget.TabHost.TabContentFactory) (new DummyTabFactory(mContext))));
	//    0    0:aload_1         
	//    1    1:new             #8   <Class FragmentTabHost$DummyTabFactory>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #79  <Field Context mContext>
	//    5    9:invokespecial   #216 <Method void FragmentTabHost$DummyTabFactory(Context)>
	//    6   12:invokevirtual   #222 <Method android.widget.TabHost$TabSpec android.widget.TabHost$TabSpec.setContent(android.widget.TabHost$TabContentFactory)>
	//    7   15:pop             
		String s = tabspec.getTag();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #225 <Method String android.widget.TabHost$TabSpec.getTag()>
	//   10   20:astore          4
		class1 = ((Class) (new TabInfo(s, class1, bundle)));
	//   11   22:new             #16  <Class FragmentTabHost$TabInfo>
	//   12   25:dup             
	//   13   26:aload           4
	//   14   28:aload_2         
	//   15   29:aload_3         
	//   16   30:invokespecial   #228 <Method void FragmentTabHost$TabInfo(String, Class, Bundle)>
	//   17   33:astore_2        
		if(mAttached)
	//*  18   34:aload_0         
	//*  19   35:getfield        #230 <Field boolean mAttached>
	//*  20   38:ifeq            93
		{
			class1.fragment = mFragmentManager.findFragmentByTag(s);
	//   21   41:aload_2         
	//   22   42:aload_0         
	//   23   43:getfield        #61  <Field FragmentManager mFragmentManager>
	//   24   46:aload           4
	//   25   48:invokevirtual   #234 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   26   51:putfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
			if(((TabInfo) (class1)).fragment != null && !((TabInfo) (class1)).fragment.isDetached())
	//*  27   54:aload_2         
	//*  28   55:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  29   58:ifnull          93
	//*  30   61:aload_2         
	//*  31   62:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  32   65:invokevirtual   #238 <Method boolean Fragment.isDetached()>
	//*  33   68:ifne            93
			{
				bundle = ((Bundle) (mFragmentManager.beginTransaction()));
	//   34   71:aload_0         
	//   35   72:getfield        #61  <Field FragmentManager mFragmentManager>
	//   36   75:invokevirtual   #67  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   37   78:astore_3        
				((FragmentTransaction) (bundle)).detach(((TabInfo) (class1)).fragment);
	//   38   79:aload_3         
	//   39   80:aload_2         
	//   40   81:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   41   84:invokevirtual   #77  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   42   87:pop             
				((FragmentTransaction) (bundle)).commit();
	//   43   88:aload_3         
	//   44   89:invokevirtual   #241 <Method int FragmentTransaction.commit()>
	//   45   92:pop             
			}
		}
		mTabs.add(((Object) (class1)));
	//   46   93:aload_0         
	//   47   94:getfield        #46  <Field ArrayList mTabs>
	//   48   97:aload_2         
	//   49   98:invokevirtual   #243 <Method boolean ArrayList.add(Object)>
	//   50  101:pop             
		addTab(tabspec);
	//   51  102:aload_0         
	//   52  103:aload_1         
	//   53  104:invokevirtual   #246 <Method void addTab(android.widget.TabHost$TabSpec)>
	//   54  107:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method void TabHost.onAttachedToWindow()>
		String s = getCurrentTabTag();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #254 <Method String getCurrentTabTag()>
	//    4    8:astore          5
		FragmentTransaction fragmenttransaction = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		int j = mTabs.size();
	//    7   12:aload_0         
	//    8   13:getfield        #46  <Field ArrayList mTabs>
	//    9   16:invokevirtual   #182 <Method int ArrayList.size()>
	//   10   19:istore_2        
		int i = 0;
	//   11   20:iconst_0        
	//   12   21:istore_1        
		while(i < j) 
	//*  13   22:iload_1         
	//*  14   23:iload_2         
	//*  15   24:icmpge          144
		{
			TabInfo tabinfo = (TabInfo)mTabs.get(i);
	//   16   27:aload_0         
	//   17   28:getfield        #46  <Field ArrayList mTabs>
	//   18   31:iload_1         
	//   19   32:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #16  <Class FragmentTabHost$TabInfo>
	//   21   38:astore          6
			tabinfo.fragment = mFragmentManager.findFragmentByTag(tabinfo.tag);
	//   22   40:aload           6
	//   23   42:aload_0         
	//   24   43:getfield        #61  <Field FragmentManager mFragmentManager>
	//   25   46:aload           6
	//   26   48:getfield        #105 <Field String FragmentTabHost$TabInfo.tag>
	//   27   51:invokevirtual   #234 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   28   54:putfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
			FragmentTransaction fragmenttransaction1 = fragmenttransaction;
	//   29   57:aload_3         
	//   30   58:astore          4
			if(tabinfo.fragment != null)
	//*  31   60:aload           6
	//*  32   62:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  33   65:ifnull          104
			{
				fragmenttransaction1 = fragmenttransaction;
	//   34   68:aload_3         
	//   35   69:astore          4
				if(!tabinfo.fragment.isDetached())
	//*  36   71:aload           6
	//*  37   73:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//*  38   76:invokevirtual   #238 <Method boolean Fragment.isDetached()>
	//*  39   79:ifne            104
					if(tabinfo.tag.equals(((Object) (s))))
	//*  40   82:aload           6
	//*  41   84:getfield        #105 <Field String FragmentTabHost$TabInfo.tag>
	//*  42   87:aload           5
	//*  43   89:invokevirtual   #192 <Method boolean String.equals(Object)>
	//*  44   92:ifeq            114
					{
						mLastTab = tabinfo;
	//   45   95:aload_0         
	//   46   96:aload           6
	//   47   98:putfield        #59  <Field FragmentTabHost$TabInfo mLastTab>
						fragmenttransaction1 = fragmenttransaction;
	//   48  101:aload_3         
	//   49  102:astore          4
					} else
	//*  50  104:iload_1         
	//*  51  105:iconst_1        
	//*  52  106:iadd            
	//*  53  107:istore_1        
	//*  54  108:aload           4
	//*  55  110:astore_3        
	//*  56  111:goto            22
					{
						fragmenttransaction1 = fragmenttransaction;
	//   57  114:aload_3         
	//   58  115:astore          4
						if(fragmenttransaction == null)
	//*  59  117:aload_3         
	//*  60  118:ifnonnull       130
							fragmenttransaction1 = mFragmentManager.beginTransaction();
	//   61  121:aload_0         
	//   62  122:getfield        #61  <Field FragmentManager mFragmentManager>
	//   63  125:invokevirtual   #67  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   64  128:astore          4
						fragmenttransaction1.detach(tabinfo.fragment);
	//   65  130:aload           4
	//   66  132:aload           6
	//   67  134:getfield        #71  <Field Fragment FragmentTabHost$TabInfo.fragment>
	//   68  137:invokevirtual   #77  <Method FragmentTransaction FragmentTransaction.detach(Fragment)>
	//   69  140:pop             
					}
			}
			i++;
			fragmenttransaction = fragmenttransaction1;
		}
	//*  70  141:goto            104
		mAttached = true;
	//   71  144:aload_0         
	//   72  145:iconst_1        
	//   73  146:putfield        #230 <Field boolean mAttached>
		fragmenttransaction = doTabChanged(s, fragmenttransaction);
	//   74  149:aload_0         
	//   75  150:aload           5
	//   76  152:aload_3         
	//   77  153:invokespecial   #256 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
	//   78  156:astore_3        
		if(fragmenttransaction != null)
	//*  79  157:aload_3         
	//*  80  158:ifnull          174
		{
			fragmenttransaction.commit();
	//   81  161:aload_3         
	//   82  162:invokevirtual   #241 <Method int FragmentTransaction.commit()>
	//   83  165:pop             
			mFragmentManager.executePendingTransactions();
	//   84  166:aload_0         
	//   85  167:getfield        #61  <Field FragmentManager mFragmentManager>
	//   86  170:invokevirtual   #259 <Method boolean FragmentManager.executePendingTransactions()>
	//   87  173:pop             
		}
	//   88  174:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method void TabHost.onDetachedFromWindow()>
		mAttached = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #230 <Field boolean mAttached>
	//    5    9:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #11  <Class FragmentTabHost$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #266 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #11  <Class FragmentTabHost$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #270 <Method Parcelable FragmentTabHost$SavedState.getSuperState()>
	//   13   23:invokespecial   #266 <Method void TabHost.onRestoreInstanceState(Parcelable)>
			setCurrentTabByTag(((SavedState) (parcelable)).curTab);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #273 <Field String FragmentTabHost$SavedState.curTab>
	//   17   31:invokevirtual   #276 <Method void setCurrentTabByTag(String)>
			return;
	//   18   34:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #11  <Class FragmentTabHost$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #279 <Method Parcelable TabHost.onSaveInstanceState()>
	//    4    8:invokespecial   #281 <Method void FragmentTabHost$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.curTab = getCurrentTabTag();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #254 <Method String getCurrentTabTag()>
	//    9   17:putfield        #273 <Field String FragmentTabHost$SavedState.curTab>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onTabChanged(String s)
	{
		if(mAttached)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field boolean mAttached>
	//*   2    4:ifeq            23
		{
			FragmentTransaction fragmenttransaction = doTabChanged(s, ((FragmentTransaction) (null)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #256 <Method FragmentTransaction doTabChanged(String, FragmentTransaction)>
	//    7   13:astore_2        
			if(fragmenttransaction != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				fragmenttransaction.commit();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #241 <Method int FragmentTransaction.commit()>
	//   12   22:pop             
		}
		if(mOnTabChangeListener != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #284 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
	//*  15   27:ifnull          40
			mOnTabChangeListener.onTabChanged(s);
	//   16   30:aload_0         
	//   17   31:getfield        #284 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
	//   18   34:aload_1         
	//   19   35:invokeinterface #286 <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
	//   20   40:return          
	}

	public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
	{
		mOnTabChangeListener = ontabchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #284 <Field android.widget.TabHost$OnTabChangeListener mOnTabChangeListener>
	//    3    5:return          
	}

	public void setup()
	{
		throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
	//    0    0:new             #125 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #290 <String "Must call setup() that takes a Context and FragmentManager">
	//    3    7:invokespecial   #143 <Method void IllegalStateException(String)>
	//    4   10:athrow          
	}

	public void setup(Context context, FragmentManager fragmentmanager)
	{
		ensureHierarchy(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #294 <Method void ensureHierarchy(Context)>
		super.setup();
	//    3    5:aload_0         
	//    4    6:invokespecial   #296 <Method void TabHost.setup()>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #79  <Field Context mContext>
		mFragmentManager = fragmentmanager;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #61  <Field FragmentManager mFragmentManager>
		ensureContent();
	//   11   19:aload_0         
	//   12   20:invokespecial   #298 <Method void ensureContent()>
	//   13   23:return          
	}

	public void setup(Context context, FragmentManager fragmentmanager, int i)
	{
		ensureHierarchy(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #294 <Method void ensureHierarchy(Context)>
		super.setup();
	//    3    5:aload_0         
	//    4    6:invokespecial   #296 <Method void TabHost.setup()>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #79  <Field Context mContext>
		mFragmentManager = fragmentmanager;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #61  <Field FragmentManager mFragmentManager>
		mContainerId = i;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #101 <Field int mContainerId>
		ensureContent();
	//   14   24:aload_0         
	//   15   25:invokespecial   #298 <Method void ensureContent()>
		mRealTabContent.setId(i);
	//   16   28:aload_0         
	//   17   29:getfield        #117 <Field FrameLayout mRealTabContent>
	//   18   32:iload_3         
	//   19   33:invokevirtual   #178 <Method void FrameLayout.setId(int)>
		if(getId() == -1)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #302 <Method int getId()>
	//*  22   40:iconst_m1       
	//*  23   41:icmpne          51
			setId(0x1020012);
	//   24   44:aload_0         
	//   25   45:ldc2            #303 <Int 0x1020012>
	//   26   48:invokevirtual   #304 <Method void setId(int)>
	//   27   51:return          
	}

	private boolean mAttached;
	private int mContainerId;
	private Context mContext;
	private FragmentManager mFragmentManager;
	private TabInfo mLastTab;
	private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
	private FrameLayout mRealTabContent;
	private final ArrayList mTabs;
}
