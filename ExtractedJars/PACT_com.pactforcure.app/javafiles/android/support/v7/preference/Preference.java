// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.preference:
//			PreferenceManager, PreferenceViewHolder

public class Preference
	implements Comparable
{
	public static class BaseSavedState extends AbsSavedState
	{

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public BaseSavedState createFromParcel(Parcel parcel)
			{
				return new BaseSavedState(parcel);
			//    0    0:new             #9   <Class Preference$BaseSavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void Preference$BaseSavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method Preference$BaseSavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public BaseSavedState[] newArray(int i)
			{
				return new BaseSavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       BaseSavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method Preference$BaseSavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;

		static 
		{
		//    0    0:new             #9   <Class Preference$BaseSavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void Preference$BaseSavedState$1()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public BaseSavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void AbsSavedState(Parcel)>
		//    3    5:return          
		}

		public BaseSavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	static interface OnPreferenceChangeInternalListener
	{

		public abstract void onPreferenceChange(Preference preference);

		public abstract void onPreferenceHierarchyChange(Preference preference);

		public abstract void onPreferenceVisibilityChange(Preference preference);
	}

	public static interface OnPreferenceChangeListener
	{

		public abstract boolean onPreferenceChange(Preference preference, Object obj);
	}

	public static interface OnPreferenceClickListener
	{

		public abstract boolean onPreferenceClick(Preference preference);
	}


	public Preference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #79  <Method void Preference(Context, AttributeSet)>
	//    4    6:return          
	}

	public Preference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.preferenceStyle, 0x101008e));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #85  <Field int R$attr.preferenceStyle>
	//    5    7:ldc1            #86  <Int 0x101008e>
	//    6    9:invokestatic    #92  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #95  <Method void Preference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public Preference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #98  <Method void Preference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public Preference(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void Object()>
		mOrder = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <Int 0x7fffffff>
	//    4    7:putfield        #103 <Field int mOrder>
		mViewId = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #105 <Field int mViewId>
		mEnabled = true;
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:putfield        #107 <Field boolean mEnabled>
		mSelectable = true;
	//   11   20:aload_0         
	//   12   21:iconst_1        
	//   13   22:putfield        #109 <Field boolean mSelectable>
		mPersistent = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #111 <Field boolean mPersistent>
		mDependencyMet = true;
	//   17   30:aload_0         
	//   18   31:iconst_1        
	//   19   32:putfield        #113 <Field boolean mDependencyMet>
		mParentDependencyMet = true;
	//   20   35:aload_0         
	//   21   36:iconst_1        
	//   22   37:putfield        #115 <Field boolean mParentDependencyMet>
		mVisible = true;
	//   23   40:aload_0         
	//   24   41:iconst_1        
	//   25   42:putfield        #117 <Field boolean mVisible>
		mShouldDisableView = true;
	//   26   45:aload_0         
	//   27   46:iconst_1        
	//   28   47:putfield        #119 <Field boolean mShouldDisableView>
		mLayoutResId = R.layout.preference;
	//   29   50:aload_0         
	//   30   51:getstatic       #124 <Field int R$layout.preference>
	//   31   54:putfield        #126 <Field int mLayoutResId>
		mClickListener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				performClick(view);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field Preference this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #23  <Method void Preference.performClick(View)>
			//    4    8:return          
			}

			final Preference this$0;

			
			{
				this$0 = Preference.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Preference this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   32   57:aload_0         
	//   33   58:new             #9   <Class Preference$1>
	//   34   61:dup             
	//   35   62:aload_0         
	//   36   63:invokespecial   #129 <Method void Preference$1(Preference)>
	//   37   66:putfield        #131 <Field android.view.View$OnClickListener mClickListener>
		mContext = context;
	//   38   69:aload_0         
	//   39   70:aload_1         
	//   40   71:putfield        #133 <Field Context mContext>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.Preference, i, j)));
	//   41   74:aload_1         
	//   42   75:aload_2         
	//   43   76:getstatic       #139 <Field int[] R$styleable.Preference>
	//   44   79:iload_3         
	//   45   80:iload           4
	//   46   82:invokevirtual   #145 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   47   85:astore_1        
		mIconResId = TypedArrayUtils.getResourceId(((TypedArray) (context)), R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
	//   48   86:aload_0         
	//   49   87:aload_1         
	//   50   88:getstatic       #148 <Field int R$styleable.Preference_icon>
	//   51   91:getstatic       #151 <Field int R$styleable.Preference_android_icon>
	//   52   94:iconst_0        
	//   53   95:invokestatic    #155 <Method int TypedArrayUtils.getResourceId(TypedArray, int, int, int)>
	//   54   98:putfield        #157 <Field int mIconResId>
		mKey = TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_key, R.styleable.Preference_android_key);
	//   55  101:aload_0         
	//   56  102:aload_1         
	//   57  103:getstatic       #160 <Field int R$styleable.Preference_key>
	//   58  106:getstatic       #163 <Field int R$styleable.Preference_android_key>
	//   59  109:invokestatic    #167 <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   60  112:putfield        #169 <Field String mKey>
		mTitle = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_title, R.styleable.Preference_android_title)));
	//   61  115:aload_0         
	//   62  116:aload_1         
	//   63  117:getstatic       #172 <Field int R$styleable.Preference_title>
	//   64  120:getstatic       #175 <Field int R$styleable.Preference_android_title>
	//   65  123:invokestatic    #167 <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   66  126:putfield        #177 <Field CharSequence mTitle>
		mSummary = ((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_summary, R.styleable.Preference_android_summary)));
	//   67  129:aload_0         
	//   68  130:aload_1         
	//   69  131:getstatic       #180 <Field int R$styleable.Preference_summary>
	//   70  134:getstatic       #183 <Field int R$styleable.Preference_android_summary>
	//   71  137:invokestatic    #167 <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   72  140:putfield        #185 <Field CharSequence mSummary>
		mOrder = TypedArrayUtils.getInt(((TypedArray) (context)), R.styleable.Preference_order, R.styleable.Preference_android_order, 0x7fffffff);
	//   73  143:aload_0         
	//   74  144:aload_1         
	//   75  145:getstatic       #188 <Field int R$styleable.Preference_order>
	//   76  148:getstatic       #191 <Field int R$styleable.Preference_android_order>
	//   77  151:ldc1            #26  <Int 0x7fffffff>
	//   78  153:invokestatic    #194 <Method int TypedArrayUtils.getInt(TypedArray, int, int, int)>
	//   79  156:putfield        #103 <Field int mOrder>
		mFragment = TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
	//   80  159:aload_0         
	//   81  160:aload_1         
	//   82  161:getstatic       #197 <Field int R$styleable.Preference_fragment>
	//   83  164:getstatic       #200 <Field int R$styleable.Preference_android_fragment>
	//   84  167:invokestatic    #167 <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   85  170:putfield        #202 <Field String mFragment>
		mLayoutResId = TypedArrayUtils.getResourceId(((TypedArray) (context)), R.styleable.Preference_layout, R.styleable.Preference_android_layout, R.layout.preference);
	//   86  173:aload_0         
	//   87  174:aload_1         
	//   88  175:getstatic       #205 <Field int R$styleable.Preference_layout>
	//   89  178:getstatic       #208 <Field int R$styleable.Preference_android_layout>
	//   90  181:getstatic       #124 <Field int R$layout.preference>
	//   91  184:invokestatic    #155 <Method int TypedArrayUtils.getResourceId(TypedArray, int, int, int)>
	//   92  187:putfield        #126 <Field int mLayoutResId>
		mWidgetLayoutResId = TypedArrayUtils.getResourceId(((TypedArray) (context)), R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
	//   93  190:aload_0         
	//   94  191:aload_1         
	//   95  192:getstatic       #211 <Field int R$styleable.Preference_widgetLayout>
	//   96  195:getstatic       #214 <Field int R$styleable.Preference_android_widgetLayout>
	//   97  198:iconst_0        
	//   98  199:invokestatic    #155 <Method int TypedArrayUtils.getResourceId(TypedArray, int, int, int)>
	//   99  202:putfield        #216 <Field int mWidgetLayoutResId>
		mEnabled = TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
	//  100  205:aload_0         
	//  101  206:aload_1         
	//  102  207:getstatic       #219 <Field int R$styleable.Preference_enabled>
	//  103  210:getstatic       #222 <Field int R$styleable.Preference_android_enabled>
	//  104  213:iconst_1        
	//  105  214:invokestatic    #226 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//  106  217:putfield        #107 <Field boolean mEnabled>
		mSelectable = TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
	//  107  220:aload_0         
	//  108  221:aload_1         
	//  109  222:getstatic       #229 <Field int R$styleable.Preference_selectable>
	//  110  225:getstatic       #232 <Field int R$styleable.Preference_android_selectable>
	//  111  228:iconst_1        
	//  112  229:invokestatic    #226 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//  113  232:putfield        #109 <Field boolean mSelectable>
		mPersistent = TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
	//  114  235:aload_0         
	//  115  236:aload_1         
	//  116  237:getstatic       #235 <Field int R$styleable.Preference_persistent>
	//  117  240:getstatic       #238 <Field int R$styleable.Preference_android_persistent>
	//  118  243:iconst_1        
	//  119  244:invokestatic    #226 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//  120  247:putfield        #111 <Field boolean mPersistent>
		mDependencyKey = TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
	//  121  250:aload_0         
	//  122  251:aload_1         
	//  123  252:getstatic       #241 <Field int R$styleable.Preference_dependency>
	//  124  255:getstatic       #244 <Field int R$styleable.Preference_android_dependency>
	//  125  258:invokestatic    #167 <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//  126  261:putfield        #246 <Field String mDependencyKey>
		if(!((TypedArray) (context)).hasValue(R.styleable.Preference_defaultValue)) goto _L2; else goto _L1
	//  127  264:aload_1         
	//  128  265:getstatic       #249 <Field int R$styleable.Preference_defaultValue>
	//  129  268:invokevirtual   #255 <Method boolean TypedArray.hasValue(int)>
	//  130  271:ifeq            306
_L1:
		mDefaultValue = onGetDefaultValue(((TypedArray) (context)), R.styleable.Preference_defaultValue);
	//  131  274:aload_0         
	//  132  275:aload_0         
	//  133  276:aload_1         
	//  134  277:getstatic       #249 <Field int R$styleable.Preference_defaultValue>
	//  135  280:invokevirtual   #259 <Method Object onGetDefaultValue(TypedArray, int)>
	//  136  283:putfield        #261 <Field Object mDefaultValue>
_L4:
		mShouldDisableView = TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
	//  137  286:aload_0         
	//  138  287:aload_1         
	//  139  288:getstatic       #264 <Field int R$styleable.Preference_shouldDisableView>
	//  140  291:getstatic       #267 <Field int R$styleable.Preference_android_shouldDisableView>
	//  141  294:iconst_1        
	//  142  295:invokestatic    #226 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//  143  298:putfield        #119 <Field boolean mShouldDisableView>
		((TypedArray) (context)).recycle();
	//  144  301:aload_1         
	//  145  302:invokevirtual   #270 <Method void TypedArray.recycle()>
		return;
	//  146  305:return          
_L2:
		if(((TypedArray) (context)).hasValue(R.styleable.Preference_android_defaultValue))
	//* 147  306:aload_1         
	//* 148  307:getstatic       #273 <Field int R$styleable.Preference_android_defaultValue>
	//* 149  310:invokevirtual   #255 <Method boolean TypedArray.hasValue(int)>
	//* 150  313:ifeq            286
			mDefaultValue = onGetDefaultValue(((TypedArray) (context)), R.styleable.Preference_android_defaultValue);
	//  151  316:aload_0         
	//  152  317:aload_0         
	//  153  318:aload_1         
	//  154  319:getstatic       #273 <Field int R$styleable.Preference_android_defaultValue>
	//  155  322:invokevirtual   #259 <Method Object onGetDefaultValue(TypedArray, int)>
	//  156  325:putfield        #261 <Field Object mDefaultValue>
		if(true) goto _L4; else goto _L3
	//  157  328:goto            286
_L3:
	}

	private void dispatchSetInitialValue()
	{
		if(!shouldPersist() || !getSharedPreferences().contains(mKey))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #282 <Method SharedPreferences getSharedPreferences()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #169 <Field String mKey>
	//*   7   15:invokeinterface #288 <Method boolean SharedPreferences.contains(String)>
	//*   8   20:ifne            40
		{
			if(mDefaultValue != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #261 <Field Object mDefaultValue>
	//*  11   27:ifnull          39
				onSetInitialValue(false, mDefaultValue);
	//   12   30:aload_0         
	//   13   31:iconst_0        
	//   14   32:aload_0         
	//   15   33:getfield        #261 <Field Object mDefaultValue>
	//   16   36:invokevirtual   #292 <Method void onSetInitialValue(boolean, Object)>
			return;
	//   17   39:return          
		} else
		{
			onSetInitialValue(true, ((Object) (null)));
	//   18   40:aload_0         
	//   19   41:iconst_1        
	//   20   42:aconst_null     
	//   21   43:invokevirtual   #292 <Method void onSetInitialValue(boolean, Object)>
			return;
	//   22   46:return          
		}
	}

	private void registerDependency()
	{
		if(TextUtils.isEmpty(((CharSequence) (mDependencyKey))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field String mDependencyKey>
	//*   2    4:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		Preference preference = findPreferenceInHierarchy(mDependencyKey);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #246 <Field String mDependencyKey>
	//    8   16:invokevirtual   #303 <Method Preference findPreferenceInHierarchy(String)>
	//    9   19:astore_1        
		if(preference != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
		{
			preference.registerDependent(this);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokespecial   #306 <Method void registerDependent(Preference)>
			return;
	//   15   29:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Dependency \"").append(mDependencyKey).append("\" not found for preference \"").append(mKey).append("\" (title: \"").append(((Object) (mTitle))).append("\"").toString());
	//   16   30:new             #308 <Class IllegalStateException>
	//   17   33:dup             
	//   18   34:new             #310 <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #311 <Method void StringBuilder()>
	//   21   41:ldc2            #313 <String "Dependency \"">
	//   22   44:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:aload_0         
	//   24   48:getfield        #246 <Field String mDependencyKey>
	//   25   51:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:ldc2            #319 <String "\" not found for preference \"">
	//   27   57:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:getfield        #169 <Field String mKey>
	//   30   64:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:ldc2            #321 <String "\" (title: \"">
	//   32   70:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:aload_0         
	//   34   74:getfield        #177 <Field CharSequence mTitle>
	//   35   77:invokevirtual   #324 <Method StringBuilder StringBuilder.append(Object)>
	//   36   80:ldc2            #326 <String "\"">
	//   37   83:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   38   86:invokevirtual   #330 <Method String StringBuilder.toString()>
	//   39   89:invokespecial   #333 <Method void IllegalStateException(String)>
	//   40   92:athrow          
		}
	}

	private void registerDependent(Preference preference)
	{
		if(mDependents == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #335 <Field List mDependents>
	//*   2    4:ifnonnull       18
			mDependents = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #337 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #338 <Method void ArrayList()>
	//    7   15:putfield        #335 <Field List mDependents>
		mDependents.add(((Object) (preference)));
	//    8   18:aload_0         
	//    9   19:getfield        #335 <Field List mDependents>
	//   10   22:aload_1         
	//   11   23:invokeinterface #344 <Method boolean List.add(Object)>
	//   12   28:pop             
		preference.onDependencyChanged(this, shouldDisableDependents());
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:invokevirtual   #347 <Method boolean shouldDisableDependents()>
	//   17   35:invokevirtual   #351 <Method void onDependencyChanged(Preference, boolean)>
	//   18   38:return          
	}

	private void setEnabledStateOnViews(View view, boolean flag)
	{
		view.setEnabled(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #359 <Method void View.setEnabled(boolean)>
		if(view instanceof ViewGroup)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #361 <Class ViewGroup>
	//*   5    9:ifeq            45
		{
			view = ((View) ((ViewGroup)view));
	//    6   12:aload_1         
	//    7   13:checkcast       #361 <Class ViewGroup>
	//    8   16:astore_1        
			for(int i = ((ViewGroup) (view)).getChildCount() - 1; i >= 0; i--)
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #365 <Method int ViewGroup.getChildCount()>
	//*  11   21:iconst_1        
	//*  12   22:isub            
	//*  13   23:istore_3        
	//*  14   24:iload_3         
	//*  15   25:iflt            45
				setEnabledStateOnViews(((ViewGroup) (view)).getChildAt(i), flag);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_3         
	//   19   31:invokevirtual   #369 <Method View ViewGroup.getChildAt(int)>
	//   20   34:iload_2         
	//   21   35:invokespecial   #371 <Method void setEnabledStateOnViews(View, boolean)>

	//   22   38:iload_3         
	//   23   39:iconst_1        
	//   24   40:isub            
	//   25   41:istore_3        
		}
	//*  26   42:goto            24
	//   27   45:return          
	}

	private void tryCommit(android.content.SharedPreferences.Editor editor)
	{
		if(mPreferenceManager.shouldCommit())
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//*   2    4:invokevirtual   #381 <Method boolean PreferenceManager.shouldCommit()>
	//*   3    7:ifeq            17
			android.support.v4.content.SharedPreferencesCompat.EditorCompat.getInstance().apply(editor);
	//    4   10:invokestatic    #387 <Method android.support.v4.content.SharedPreferencesCompat$EditorCompat android.support.v4.content.SharedPreferencesCompat$EditorCompat.getInstance()>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #390 <Method void android.support.v4.content.SharedPreferencesCompat$EditorCompat.apply(android.content.SharedPreferences$Editor)>
	//    7   17:return          
	}

	private void unregisterDependency()
	{
		if(mDependencyKey != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field String mDependencyKey>
	//*   2    4:ifnull          25
		{
			Preference preference = findPreferenceInHierarchy(mDependencyKey);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #246 <Field String mDependencyKey>
	//    6   12:invokevirtual   #303 <Method Preference findPreferenceInHierarchy(String)>
	//    7   15:astore_1        
			if(preference != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          25
				preference.unregisterDependent(this);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokespecial   #395 <Method void unregisterDependent(Preference)>
		}
	//   13   25:return          
	}

	private void unregisterDependent(Preference preference)
	{
		if(mDependents != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #335 <Field List mDependents>
	//*   2    4:ifnull          18
			mDependents.remove(((Object) (preference)));
	//    3    7:aload_0         
	//    4    8:getfield        #335 <Field List mDependents>
	//    5   11:aload_1         
	//    6   12:invokeinterface #398 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public boolean callChangeListener(Object obj)
	{
		return mOnChangeListener == null || mOnChangeListener.onPreferenceChange(this, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field Preference$OnPreferenceChangeListener mOnChangeListener>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #401 <Field Preference$OnPreferenceChangeListener mOnChangeListener>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokeinterface #405 <Method boolean Preference$OnPreferenceChangeListener.onPreferenceChange(Preference, Object)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int compareTo(Preference preference)
	{
		if(mOrder != preference.mOrder)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field int mOrder>
	//*   2    4:aload_1         
	//*   3    5:getfield        #103 <Field int mOrder>
	//*   4    8:icmpeq          21
			return mOrder - preference.mOrder;
	//    5   11:aload_0         
	//    6   12:getfield        #103 <Field int mOrder>
	//    7   15:aload_1         
	//    8   16:getfield        #103 <Field int mOrder>
	//    9   19:isub            
	//   10   20:ireturn         
		if(mTitle == preference.mTitle)
	//*  11   21:aload_0         
	//*  12   22:getfield        #177 <Field CharSequence mTitle>
	//*  13   25:aload_1         
	//*  14   26:getfield        #177 <Field CharSequence mTitle>
	//*  15   29:if_acmpne       34
			return 0;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		if(mTitle == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #177 <Field CharSequence mTitle>
	//*  20   38:ifnonnull       43
			return 1;
	//   21   41:iconst_1        
	//   22   42:ireturn         
		if(preference.mTitle == null)
	//*  23   43:aload_1         
	//*  24   44:getfield        #177 <Field CharSequence mTitle>
	//*  25   47:ifnonnull       52
			return -1;
	//   26   50:iconst_m1       
	//   27   51:ireturn         
		else
			return mTitle.toString().compareToIgnoreCase(preference.mTitle.toString());
	//   28   52:aload_0         
	//   29   53:getfield        #177 <Field CharSequence mTitle>
	//   30   56:invokeinterface #410 <Method String CharSequence.toString()>
	//   31   61:aload_1         
	//   32   62:getfield        #177 <Field CharSequence mTitle>
	//   33   65:invokeinterface #410 <Method String CharSequence.toString()>
	//   34   70:invokevirtual   #416 <Method int String.compareToIgnoreCase(String)>
	//   35   73:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Preference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Preference>
	//    3    5:invokevirtual   #419 <Method int compareTo(Preference)>
	//    4    8:ireturn         
	}

	void dispatchRestoreInstanceState(Bundle bundle)
	{
		if(hasKey())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #424 <Method boolean hasKey()>
	//*   2    4:ifeq            48
		{
			bundle = ((Bundle) (bundle.getParcelable(mKey)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #169 <Field String mKey>
	//    6   12:invokevirtual   #430 <Method Parcelable Bundle.getParcelable(String)>
	//    7   15:astore_1        
			if(bundle != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          48
			{
				mBaseMethodCalled = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #432 <Field boolean mBaseMethodCalled>
				onRestoreInstanceState(((Parcelable) (bundle)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #436 <Method void onRestoreInstanceState(Parcelable)>
				if(!mBaseMethodCalled)
	//*  16   30:aload_0         
	//*  17   31:getfield        #432 <Field boolean mBaseMethodCalled>
	//*  18   34:ifne            48
					throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
	//   19   37:new             #308 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #438 <String "Derived class did not call super.onRestoreInstanceState()">
	//   22   44:invokespecial   #333 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			}
		}
	//   24   48:return          
	}

	void dispatchSaveInstanceState(Bundle bundle)
	{
		if(hasKey())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #424 <Method boolean hasKey()>
	//*   2    4:ifeq            48
		{
			mBaseMethodCalled = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #432 <Field boolean mBaseMethodCalled>
			Parcelable parcelable = onSaveInstanceState();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #443 <Method Parcelable onSaveInstanceState()>
	//    8   16:astore_2        
			if(!mBaseMethodCalled)
	//*   9   17:aload_0         
	//*  10   18:getfield        #432 <Field boolean mBaseMethodCalled>
	//*  11   21:ifne            35
				throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
	//   12   24:new             #308 <Class IllegalStateException>
	//   13   27:dup             
	//   14   28:ldc2            #445 <String "Derived class did not call super.onSaveInstanceState()">
	//   15   31:invokespecial   #333 <Method void IllegalStateException(String)>
	//   16   34:athrow          
			if(parcelable != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          48
				bundle.putParcelable(mKey, parcelable);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #169 <Field String mKey>
	//   22   44:aload_2         
	//   23   45:invokevirtual   #449 <Method void Bundle.putParcelable(String, Parcelable)>
		}
	//   24   48:return          
	}

	protected Preference findPreferenceInHierarchy(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))) || mPreferenceManager == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return mPreferenceManager.findPreference(((CharSequence) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #453 <Method Preference PreferenceManager.findPreference(CharSequence)>
	//   12   24:areturn         
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Context mContext>
	//    2    4:areturn         
	}

	public String getDependency()
	{
		return mDependencyKey;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field String mDependencyKey>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		if(mExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #460 <Field Bundle mExtras>
	//*   2    4:ifnonnull       18
			mExtras = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #426 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #461 <Method void Bundle()>
	//    7   15:putfield        #460 <Field Bundle mExtras>
		return mExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #460 <Field Bundle mExtras>
	//   10   22:areturn         
	}

	StringBuilder getFilterableStringBuilder()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #310 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #311 <Method void StringBuilder()>
	//    3    7:astore_1        
		CharSequence charsequence = getTitle();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #467 <Method CharSequence getTitle()>
	//    6   12:astore_2        
		if(!TextUtils.isEmpty(charsequence))
	//*   7   13:aload_2         
	//*   8   14:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   17:ifne            31
			stringbuilder.append(charsequence).append(' ');
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #470 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   13   25:bipush          32
	//   14   27:invokevirtual   #473 <Method StringBuilder StringBuilder.append(char)>
	//   15   30:pop             
		charsequence = getSummary();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #476 <Method CharSequence getSummary()>
	//   18   35:astore_2        
		if(!TextUtils.isEmpty(charsequence))
	//*  19   36:aload_2         
	//*  20   37:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   40:ifne            54
			stringbuilder.append(charsequence).append(' ');
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #470 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   25   48:bipush          32
	//   26   50:invokevirtual   #473 <Method StringBuilder StringBuilder.append(char)>
	//   27   53:pop             
		if(stringbuilder.length() > 0)
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #479 <Method int StringBuilder.length()>
	//*  30   58:ifle            71
			stringbuilder.setLength(stringbuilder.length() - 1);
	//   31   61:aload_1         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #479 <Method int StringBuilder.length()>
	//   34   66:iconst_1        
	//   35   67:isub            
	//   36   68:invokevirtual   #483 <Method void StringBuilder.setLength(int)>
		return stringbuilder;
	//   37   71:aload_1         
	//   38   72:areturn         
	}

	public String getFragment()
	{
		return mFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field String mFragment>
	//    2    4:areturn         
	}

	public Drawable getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #488 <Field Drawable mIcon>
	//    2    4:areturn         
	}

	long getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #492 <Field long mId>
	//    2    4:lreturn         
	}

	public Intent getIntent()
	{
		return mIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #496 <Field Intent mIntent>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field String mKey>
	//    2    4:areturn         
	}

	public final int getLayoutResource()
	{
		return mLayoutResId;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field int mLayoutResId>
	//    2    4:ireturn         
	}

	public OnPreferenceChangeListener getOnPreferenceChangeListener()
	{
		return mOnChangeListener;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field Preference$OnPreferenceChangeListener mOnChangeListener>
	//    2    4:areturn         
	}

	public OnPreferenceClickListener getOnPreferenceClickListener()
	{
		return mOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #504 <Field Preference$OnPreferenceClickListener mOnClickListener>
	//    2    4:areturn         
	}

	public int getOrder()
	{
		return mOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int mOrder>
	//    2    4:ireturn         
	}

	protected boolean getPersistedBoolean(boolean flag)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return flag;
	//    3    7:iload_1         
	//    4    8:ireturn         
		else
			return mPreferenceManager.getSharedPreferences().getBoolean(mKey, flag);
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field String mKey>
	//   10   20:iload_1         
	//   11   21:invokeinterface #511 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   12   26:ireturn         
	}

	protected float getPersistedFloat(float f)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return f;
	//    3    7:fload_1         
	//    4    8:freturn         
		else
			return mPreferenceManager.getSharedPreferences().getFloat(mKey, f);
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field String mKey>
	//   10   20:fload_1         
	//   11   21:invokeinterface #517 <Method float SharedPreferences.getFloat(String, float)>
	//   12   26:freturn         
	}

	protected int getPersistedInt(int i)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return i;
	//    3    7:iload_1         
	//    4    8:ireturn         
		else
			return mPreferenceManager.getSharedPreferences().getInt(mKey, i);
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field String mKey>
	//   10   20:iload_1         
	//   11   21:invokeinterface #522 <Method int SharedPreferences.getInt(String, int)>
	//   12   26:ireturn         
	}

	protected long getPersistedLong(long l)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return l;
	//    3    7:lload_1         
	//    4    8:lreturn         
		else
			return mPreferenceManager.getSharedPreferences().getLong(mKey, l);
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field String mKey>
	//   10   20:lload_1         
	//   11   21:invokeinterface #528 <Method long SharedPreferences.getLong(String, long)>
	//   12   26:lreturn         
	}

	protected String getPersistedString(String s)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return mPreferenceManager.getSharedPreferences().getString(mKey, s);
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field String mKey>
	//   10   20:aload_1         
	//   11   21:invokeinterface #533 <Method String SharedPreferences.getString(String, String)>
	//   12   26:areturn         
	}

	public PreferenceManager getPreferenceManager()
	{
		return mPreferenceManager;
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    2    4:areturn         
	}

	public SharedPreferences getSharedPreferences()
	{
		if(mPreferenceManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mPreferenceManager.getSharedPreferences();
	//    5    9:aload_0         
	//    6   10:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    7   13:invokevirtual   #508 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:areturn         
	}

	public boolean getShouldDisableView()
	{
		return mShouldDisableView;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field boolean mShouldDisableView>
	//    2    4:ireturn         
	}

	public CharSequence getSummary()
	{
		return mSummary;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field CharSequence mSummary>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public final int getWidgetLayoutResource()
	{
		return mWidgetLayoutResId;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int mWidgetLayoutResId>
	//    2    4:ireturn         
	}

	public boolean hasKey()
	{
		return !TextUtils.isEmpty(((CharSequence) (mKey)));
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field String mKey>
	//    2    4:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isEnabled()
	{
		return mEnabled && mDependencyMet && mParentDependencyMet;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mEnabled>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field boolean mDependencyMet>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:getfield        #115 <Field boolean mParentDependencyMet>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean isPersistent()
	{
		return mPersistent;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean mPersistent>
	//    2    4:ireturn         
	}

	public boolean isSelectable()
	{
		return mSelectable;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean mSelectable>
	//    2    4:ireturn         
	}

	public final boolean isVisible()
	{
		return mVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean mVisible>
	//    2    4:ireturn         
	}

	protected void notifyChanged()
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//*   2    4:ifnull          17
			mListener.onPreferenceChange(this);
	//    3    7:aload_0         
	//    4    8:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//    5   11:aload_0         
	//    6   12:invokeinterface #546 <Method void Preference$OnPreferenceChangeInternalListener.onPreferenceChange(Preference)>
	//    7   17:return          
	}

	public void notifyDependencyChange(boolean flag)
	{
		List list = mDependents;
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field List mDependents>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
	//*   5   11:return          
		{
			int j = list.size();
	//    6   12:aload           4
	//    7   14:invokeinterface #550 <Method int List.size()>
	//    8   19:istore_3        
			int i = 0;
	//    9   20:iconst_0        
	//   10   21:istore_2        
			while(i < j) 
	//*  11   22:iload_2         
	//*  12   23:iload_3         
	//*  13   24:icmpge          11
			{
				((Preference)list.get(i)).onDependencyChanged(this, flag);
	//   14   27:aload           4
	//   15   29:iload_2         
	//   16   30:invokeinterface #554 <Method Object List.get(int)>
	//   17   35:checkcast       #2   <Class Preference>
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:invokevirtual   #351 <Method void onDependencyChanged(Preference, boolean)>
				i++;
	//   21   43:iload_2         
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:istore_2        
			}
		}
	//*  25   47:goto            22
	}

	protected void notifyHierarchyChanged()
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//*   2    4:ifnull          17
			mListener.onPreferenceHierarchyChange(this);
	//    3    7:aload_0         
	//    4    8:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//    5   11:aload_0         
	//    6   12:invokeinterface #558 <Method void Preference$OnPreferenceChangeInternalListener.onPreferenceHierarchyChange(Preference)>
	//    7   17:return          
	}

	public void onAttached()
	{
		registerDependency();
	//    0    0:aload_0         
	//    1    1:invokespecial   #561 <Method void registerDependency()>
	//    2    4:return          
	}

	protected void onAttachedToHierarchy(PreferenceManager preferencemanager)
	{
		mPreferenceManager = preferencemanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #376 <Field PreferenceManager mPreferenceManager>
		if(!mHasId)
	//*   3    5:aload_0         
	//*   4    6:getfield        #565 <Field boolean mHasId>
	//*   5    9:ifne            20
			mId = preferencemanager.getNextId();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #568 <Method long PreferenceManager.getNextId()>
	//    9   17:putfield        #492 <Field long mId>
		dispatchSetInitialValue();
	//   10   20:aload_0         
	//   11   21:invokespecial   #570 <Method void dispatchSetInitialValue()>
	//   12   24:return          
	}

	protected void onAttachedToHierarchy(PreferenceManager preferencemanager, long l)
	{
		mId = l;
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:putfield        #492 <Field long mId>
		mHasId = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #565 <Field boolean mHasId>
		onAttachedToHierarchy(preferencemanager);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #577 <Method void onAttachedToHierarchy(PreferenceManager)>
		mHasId = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #565 <Field boolean mHasId>
		return;
	//   12   20:return          
		preferencemanager;
	//   13   21:astore_1        
		mHasId = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #565 <Field boolean mHasId>
		throw preferencemanager;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		preferenceviewholder.itemView.setOnClickListener(mClickListener);
	//    2    2:aload_1         
	//    3    3:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//    4    6:aload_0         
	//    5    7:getfield        #131 <Field android.view.View$OnClickListener mClickListener>
	//    6   10:invokevirtual   #590 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		preferenceviewholder.itemView.setId(mViewId);
	//    7   13:aload_1         
	//    8   14:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//    9   17:aload_0         
	//   10   18:getfield        #105 <Field int mViewId>
	//   11   21:invokevirtual   #593 <Method void View.setId(int)>
		Object obj = ((Object) ((TextView)preferenceviewholder.findViewById(0x1020016)));
	//   12   24:aload_1         
	//   13   25:ldc2            #594 <Int 0x1020016>
	//   14   28:invokevirtual   #597 <Method View PreferenceViewHolder.findViewById(int)>
	//   15   31:checkcast       #599 <Class TextView>
	//   16   34:astore          5
		int i;
		if(obj != null)
	//*  17   36:aload           5
	//*  18   38:ifnull          68
		{
			Object obj1 = ((Object) (getTitle()));
	//   19   41:aload_0         
	//   20   42:invokevirtual   #467 <Method CharSequence getTitle()>
	//   21   45:astore          6
			boolean flag1;
			if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//*  22   47:aload           6
	//*  23   49:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   52:ifne            299
			{
				((TextView) (obj)).setText(((CharSequence) (obj1)));
	//   25   55:aload           5
	//   26   57:aload           6
	//   27   59:invokevirtual   #603 <Method void TextView.setText(CharSequence)>
				((TextView) (obj)).setVisibility(0);
	//   28   62:aload           5
	//   29   64:iconst_0        
	//   30   65:invokevirtual   #606 <Method void TextView.setVisibility(int)>
			} else
	//*  31   68:aload_1         
	//*  32   69:ldc2            #607 <Int 0x1020010>
	//*  33   72:invokevirtual   #597 <Method View PreferenceViewHolder.findViewById(int)>
	//*  34   75:checkcast       #599 <Class TextView>
	//*  35   78:astore          5
	//*  36   80:aload           5
	//*  37   82:ifnull          112
	//*  38   85:aload_0         
	//*  39   86:invokevirtual   #476 <Method CharSequence getSummary()>
	//*  40   89:astore          6
	//*  41   91:aload           6
	//*  42   93:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   96:ifne            309
	//*  44   99:aload           5
	//*  45  101:aload           6
	//*  46  103:invokevirtual   #603 <Method void TextView.setText(CharSequence)>
	//*  47  106:aload           5
	//*  48  108:iconst_0        
	//*  49  109:invokevirtual   #606 <Method void TextView.setVisibility(int)>
	//*  50  112:aload_1         
	//*  51  113:ldc2            #608 <Int 0x1020006>
	//*  52  116:invokevirtual   #597 <Method View PreferenceViewHolder.findViewById(int)>
	//*  53  119:checkcast       #610 <Class ImageView>
	//*  54  122:astore          5
	//*  55  124:aload           5
	//*  56  126:ifnull          196
	//*  57  129:aload_0         
	//*  58  130:getfield        #157 <Field int mIconResId>
	//*  59  133:ifne            143
	//*  60  136:aload_0         
	//*  61  137:getfield        #488 <Field Drawable mIcon>
	//*  62  140:ifnull          181
	//*  63  143:aload_0         
	//*  64  144:getfield        #488 <Field Drawable mIcon>
	//*  65  147:ifnonnull       165
	//*  66  150:aload_0         
	//*  67  151:aload_0         
	//*  68  152:invokevirtual   #612 <Method Context getContext()>
	//*  69  155:aload_0         
	//*  70  156:getfield        #157 <Field int mIconResId>
	//*  71  159:invokestatic    #618 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//*  72  162:putfield        #488 <Field Drawable mIcon>
	//*  73  165:aload_0         
	//*  74  166:getfield        #488 <Field Drawable mIcon>
	//*  75  169:ifnull          181
	//*  76  172:aload           5
	//*  77  174:aload_0         
	//*  78  175:getfield        #488 <Field Drawable mIcon>
	//*  79  178:invokevirtual   #622 <Method void ImageView.setImageDrawable(Drawable)>
	//*  80  181:aload_0         
	//*  81  182:getfield        #488 <Field Drawable mIcon>
	//*  82  185:ifnull          319
	//*  83  188:iconst_0        
	//*  84  189:istore_2        
	//*  85  190:aload           5
	//*  86  192:iload_2         
	//*  87  193:invokevirtual   #623 <Method void ImageView.setVisibility(int)>
	//*  88  196:aload_1         
	//*  89  197:getstatic       #628 <Field int R$id.icon_frame>
	//*  90  200:invokevirtual   #597 <Method View PreferenceViewHolder.findViewById(int)>
	//*  91  203:astore          6
	//*  92  205:aload           6
	//*  93  207:astore          5
	//*  94  209:aload           6
	//*  95  211:ifnonnull       223
	//*  96  214:aload_1         
	//*  97  215:ldc2            #629 <Int 0x102003e>
	//*  98  218:invokevirtual   #597 <Method View PreferenceViewHolder.findViewById(int)>
	//*  99  221:astore          5
	//* 100  223:aload           5
	//* 101  225:ifnull          243
	//* 102  228:aload_0         
	//* 103  229:getfield        #488 <Field Drawable mIcon>
	//* 104  232:ifnull          325
	//* 105  235:iload_3         
	//* 106  236:istore_2        
	//* 107  237:aload           5
	//* 108  239:iload_2         
	//* 109  240:invokevirtual   #630 <Method void View.setVisibility(int)>
	//* 110  243:aload_0         
	//* 111  244:getfield        #119 <Field boolean mShouldDisableView>
	//* 112  247:ifeq            331
	//* 113  250:aload_0         
	//* 114  251:aload_1         
	//* 115  252:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//* 116  255:aload_0         
	//* 117  256:invokevirtual   #632 <Method boolean isEnabled()>
	//* 118  259:invokespecial   #371 <Method void setEnabledStateOnViews(View, boolean)>
	//* 119  262:aload_0         
	//* 120  263:invokevirtual   #634 <Method boolean isSelectable()>
	//* 121  266:istore          4
	//* 122  268:aload_1         
	//* 123  269:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//* 124  272:iload           4
	//* 125  274:invokevirtual   #637 <Method void View.setFocusable(boolean)>
	//* 126  277:aload_1         
	//* 127  278:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//* 128  281:iload           4
	//* 129  283:invokevirtual   #640 <Method void View.setClickable(boolean)>
	//* 130  286:aload_1         
	//* 131  287:iload           4
	//* 132  289:invokevirtual   #643 <Method void PreferenceViewHolder.setDividerAllowedAbove(boolean)>
	//* 133  292:aload_1         
	//* 134  293:iload           4
	//* 135  295:invokevirtual   #646 <Method void PreferenceViewHolder.setDividerAllowedBelow(boolean)>
	//* 136  298:return          
			{
				((TextView) (obj)).setVisibility(8);
	//  137  299:aload           5
	//  138  301:bipush          8
	//  139  303:invokevirtual   #606 <Method void TextView.setVisibility(int)>
			}
		}
		obj = ((Object) ((TextView)preferenceviewholder.findViewById(0x1020010)));
		if(obj != null)
		{
			obj1 = ((Object) (getSummary()));
			if(!TextUtils.isEmpty(((CharSequence) (obj1))))
			{
				((TextView) (obj)).setText(((CharSequence) (obj1)));
				((TextView) (obj)).setVisibility(0);
			} else
	//* 140  306:goto            68
			{
				((TextView) (obj)).setVisibility(8);
	//  141  309:aload           5
	//  142  311:bipush          8
	//  143  313:invokevirtual   #606 <Method void TextView.setVisibility(int)>
			}
		}
		obj = ((Object) ((ImageView)preferenceviewholder.findViewById(0x1020006)));
		if(obj != null)
		{
			if(mIconResId != 0 || mIcon != null)
			{
				if(mIcon == null)
					mIcon = ContextCompat.getDrawable(getContext(), mIconResId);
				if(mIcon != null)
					((ImageView) (obj)).setImageDrawable(mIcon);
			}
			if(mIcon != null)
				i = 0;
			else
	//* 144  316:goto            112
				i = 8;
	//  145  319:bipush          8
	//  146  321:istore_2        
			((ImageView) (obj)).setVisibility(i);
		}
		obj1 = ((Object) (preferenceviewholder.findViewById(R.id.icon_frame)));
		obj = obj1;
		if(obj1 == null)
			obj = ((Object) (preferenceviewholder.findViewById(0x102003e)));
		if(obj != null)
		{
			if(mIcon != null)
				i = ((int) (flag));
			else
	//* 147  322:goto            190
				i = 8;
	//  148  325:bipush          8
	//  149  327:istore_2        
			((View) (obj)).setVisibility(i);
		}
		if(mShouldDisableView)
			setEnabledStateOnViews(preferenceviewholder.itemView, isEnabled());
		else
	//* 150  328:goto            237
			setEnabledStateOnViews(preferenceviewholder.itemView, true);
	//  151  331:aload_0         
	//  152  332:aload_1         
	//  153  333:getfield        #586 <Field View PreferenceViewHolder.itemView>
	//  154  336:iconst_1        
	//  155  337:invokespecial   #371 <Method void setEnabledStateOnViews(View, boolean)>
		flag1 = isSelectable();
		preferenceviewholder.itemView.setFocusable(flag1);
		preferenceviewholder.itemView.setClickable(flag1);
		preferenceviewholder.setDividerAllowedAbove(flag1);
		preferenceviewholder.setDividerAllowedBelow(flag1);
	//* 156  340:goto            262
	}

	protected void onClick()
	{
	//    0    0:return          
	}

	public void onDependencyChanged(Preference preference, boolean flag)
	{
		if(mDependencyMet == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean mDependencyMet>
	//*   2    4:iload_2         
	//*   3    5:icmpne          31
		{
			if(!flag)
	//*   4    8:iload_2         
	//*   5    9:ifne            32
				flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
			else
	//*   8   14:aload_0         
	//*   9   15:iload_2         
	//*  10   16:putfield        #113 <Field boolean mDependencyMet>
	//*  11   19:aload_0         
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #347 <Method boolean shouldDisableDependents()>
	//*  14   24:invokevirtual   #649 <Method void notifyDependencyChange(boolean)>
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #651 <Method void notifyChanged()>
	//*  17   31:return          
				flag = false;
	//   18   32:iconst_0        
	//   19   33:istore_2        
			mDependencyMet = flag;
			notifyDependencyChange(shouldDisableDependents());
			notifyChanged();
		}
	//*  20   34:goto            14
	}

	public void onDetached()
	{
		unregisterDependency();
	//    0    0:aload_0         
	//    1    1:invokespecial   #654 <Method void unregisterDependency()>
	//    2    4:return          
	}

	protected Object onGetDefaultValue(TypedArray typedarray, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
	//    0    0:return          
	}

	public void onParentChanged(Preference preference, boolean flag)
	{
		if(mParentDependencyMet == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mParentDependencyMet>
	//*   2    4:iload_2         
	//*   3    5:icmpne          31
		{
			if(!flag)
	//*   4    8:iload_2         
	//*   5    9:ifne            32
				flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
			else
	//*   8   14:aload_0         
	//*   9   15:iload_2         
	//*  10   16:putfield        #115 <Field boolean mParentDependencyMet>
	//*  11   19:aload_0         
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #347 <Method boolean shouldDisableDependents()>
	//*  14   24:invokevirtual   #649 <Method void notifyDependencyChange(boolean)>
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #651 <Method void notifyChanged()>
	//*  17   31:return          
				flag = false;
	//   18   32:iconst_0        
	//   19   33:istore_2        
			mParentDependencyMet = flag;
			notifyDependencyChange(shouldDisableDependents());
			notifyChanged();
		}
	//*  20   34:goto            14
	}

	protected void onPrepareForRemoval()
	{
		unregisterDependency();
	//    0    0:aload_0         
	//    1    1:invokespecial   #654 <Method void unregisterDependency()>
	//    2    4:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		mBaseMethodCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #432 <Field boolean mBaseMethodCalled>
		if(parcelable != BaseSavedState.EMPTY_STATE && parcelable != null)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #663 <Field AbsSavedState Preference$BaseSavedState.EMPTY_STATE>
	//*   5    9:if_acmpeq       27
	//*   6   12:aload_1         
	//*   7   13:ifnull          27
			throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
	//    8   16:new             #665 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #667 <String "Wrong state class -- expecting Preference State">
	//   11   23:invokespecial   #668 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		else
			return;
	//   13   27:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		mBaseMethodCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #432 <Field boolean mBaseMethodCalled>
		return ((Parcelable) (BaseSavedState.EMPTY_STATE));
	//    3    5:getstatic       #663 <Field AbsSavedState Preference$BaseSavedState.EMPTY_STATE>
	//    4    8:areturn         
	}

	protected void onSetInitialValue(boolean flag, Object obj)
	{
	//    0    0:return          
	}

	public Bundle peekExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #460 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public void performClick()
	{
		if(isEnabled()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #632 <Method boolean isEnabled()>
	//    2    4:ifne            8
_L1:
		return;
	//    3    7:return          
_L2:
		onClick();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #672 <Method void onClick()>
		if(mOnClickListener != null && mOnClickListener.onPreferenceClick(this)) goto _L1; else goto _L3
	//    6   12:aload_0         
	//    7   13:getfield        #504 <Field Preference$OnPreferenceClickListener mOnClickListener>
	//    8   16:ifnull          32
	//    9   19:aload_0         
	//   10   20:getfield        #504 <Field Preference$OnPreferenceClickListener mOnClickListener>
	//   11   23:aload_0         
	//   12   24:invokeinterface #676 <Method boolean Preference$OnPreferenceClickListener.onPreferenceClick(Preference)>
	//   13   29:ifne            7
_L3:
		Object obj;
		obj = ((Object) (getPreferenceManager()));
	//   14   32:aload_0         
	//   15   33:invokevirtual   #678 <Method PreferenceManager getPreferenceManager()>
	//   16   36:astore_1        
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   17   37:aload_1         
	//   18   38:ifnull          60
		obj = ((Object) (((PreferenceManager) (obj)).getOnPreferenceTreeClickListener()));
	//   19   41:aload_1         
	//   20   42:invokevirtual   #682 <Method PreferenceManager$OnPreferenceTreeClickListener PreferenceManager.getOnPreferenceTreeClickListener()>
	//   21   45:astore_1        
		if(obj != null && ((PreferenceManager.OnPreferenceTreeClickListener) (obj)).onPreferenceTreeClick(this)) goto _L1; else goto _L4
	//   22   46:aload_1         
	//   23   47:ifnull          60
	//   24   50:aload_1         
	//   25   51:aload_0         
	//   26   52:invokeinterface #687 <Method boolean PreferenceManager$OnPreferenceTreeClickListener.onPreferenceTreeClick(Preference)>
	//   27   57:ifne            7
_L4:
		if(mIntent == null) goto _L1; else goto _L5
	//   28   60:aload_0         
	//   29   61:getfield        #496 <Field Intent mIntent>
	//   30   64:ifnull          7
_L5:
		getContext().startActivity(mIntent);
	//   31   67:aload_0         
	//   32   68:invokevirtual   #612 <Method Context getContext()>
	//   33   71:aload_0         
	//   34   72:getfield        #496 <Field Intent mIntent>
	//   35   75:invokevirtual   #691 <Method void Context.startActivity(Intent)>
		return;
	//   36   78:return          
	}

	protected void performClick(View view)
	{
		performClick();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #694 <Method void performClick()>
	//    2    4:return          
	}

	protected boolean persistBoolean(boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(shouldPersist())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   4    6:ifeq            53
		{
			if(!flag)
	//*   5    9:iload_1         
	//*   6   10:ifne            15
				flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
			if(flag == getPersistedBoolean(flag1))
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:iload_2         
	//*  12   18:invokevirtual   #697 <Method boolean getPersistedBoolean(boolean)>
	//*  13   21:icmpne          26
			{
				return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = mPreferenceManager.getEditor();
	//   16   26:aload_0         
	//   17   27:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   18   30:invokevirtual   #701 <Method android.content.SharedPreferences$Editor PreferenceManager.getEditor()>
	//   19   33:astore_3        
				editor.putBoolean(mKey, flag);
	//   20   34:aload_3         
	//   21   35:aload_0         
	//   22   36:getfield        #169 <Field String mKey>
	//   23   39:iload_1         
	//   24   40:invokeinterface #707 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   45:pop             
				tryCommit(editor);
	//   26   46:aload_0         
	//   27   47:aload_3         
	//   28   48:invokespecial   #709 <Method void tryCommit(android.content.SharedPreferences$Editor)>
				return true;
	//   29   51:iconst_1        
	//   30   52:ireturn         
			}
		} else
		{
			return false;
	//   31   53:iconst_0        
	//   32   54:ireturn         
		}
	}

	protected boolean persistFloat(float f)
	{
		if(shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifeq            48
		{
			if(f == getPersistedFloat((0.0F / 0.0F)))
	//*   3    7:fload_1         
	//*   4    8:aload_0         
	//*   5    9:ldc2            #712 <Float (0.0F / 0.0F)>
	//*   6   12:invokevirtual   #714 <Method float getPersistedFloat(float)>
	//*   7   15:fcmpl           
	//*   8   16:ifne            21
			{
				return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = mPreferenceManager.getEditor();
	//   11   21:aload_0         
	//   12   22:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   13   25:invokevirtual   #701 <Method android.content.SharedPreferences$Editor PreferenceManager.getEditor()>
	//   14   28:astore_2        
				editor.putFloat(mKey, f);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #169 <Field String mKey>
	//   18   34:fload_1         
	//   19   35:invokeinterface #718 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   20   40:pop             
				tryCommit(editor);
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokespecial   #709 <Method void tryCommit(android.content.SharedPreferences$Editor)>
				return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
			}
		} else
		{
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
	}

	protected boolean persistInt(int i)
	{
		if(shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifeq            47
		{
			if(i == getPersistedInt(~i))
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:iload_1         
	//*   6   10:iconst_m1       
	//*   7   11:ixor            
	//*   8   12:invokevirtual   #721 <Method int getPersistedInt(int)>
	//*   9   15:icmpne          20
			{
				return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = mPreferenceManager.getEditor();
	//   12   20:aload_0         
	//   13   21:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   14   24:invokevirtual   #701 <Method android.content.SharedPreferences$Editor PreferenceManager.getEditor()>
	//   15   27:astore_2        
				editor.putInt(mKey, i);
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:getfield        #169 <Field String mKey>
	//   19   33:iload_1         
	//   20   34:invokeinterface #725 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   21   39:pop             
				tryCommit(editor);
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:invokespecial   #709 <Method void tryCommit(android.content.SharedPreferences$Editor)>
				return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
			}
		} else
		{
			return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		}
	}

	protected boolean persistLong(long l)
	{
		if(shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifeq            50
		{
			if(l == getPersistedLong(-1L ^ l))
	//*   3    7:lload_1         
	//*   4    8:aload_0         
	//*   5    9:ldc2w           #728 <Long -1L>
	//*   6   12:lload_1         
	//*   7   13:lxor            
	//*   8   14:invokevirtual   #731 <Method long getPersistedLong(long)>
	//*   9   17:lcmp            
	//*  10   18:ifne            23
			{
				return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = mPreferenceManager.getEditor();
	//   13   23:aload_0         
	//   14   24:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   15   27:invokevirtual   #701 <Method android.content.SharedPreferences$Editor PreferenceManager.getEditor()>
	//   16   30:astore_3        
				editor.putLong(mKey, l);
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:getfield        #169 <Field String mKey>
	//   20   36:lload_1         
	//   21   37:invokeinterface #735 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   22   42:pop             
				tryCommit(editor);
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:invokespecial   #709 <Method void tryCommit(android.content.SharedPreferences$Editor)>
				return true;
	//   26   48:iconst_1        
	//   27   49:ireturn         
			}
		} else
		{
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		}
	}

	protected boolean persistString(String s)
	{
		if(shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #278 <Method boolean shouldPersist()>
	//*   2    4:ifeq            45
		{
			if(s == getPersistedString(((String) (null))))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:aconst_null     
	//*   6   10:invokevirtual   #738 <Method String getPersistedString(String)>
	//*   7   13:if_acmpne       18
			{
				return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = mPreferenceManager.getEditor();
	//   10   18:aload_0         
	//   11   19:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//   12   22:invokevirtual   #701 <Method android.content.SharedPreferences$Editor PreferenceManager.getEditor()>
	//   13   25:astore_2        
				editor.putString(mKey, s);
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:getfield        #169 <Field String mKey>
	//   17   31:aload_1         
	//   18   32:invokeinterface #742 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   19   37:pop             
				tryCommit(editor);
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:invokespecial   #709 <Method void tryCommit(android.content.SharedPreferences$Editor)>
				return true;
	//   23   43:iconst_1        
	//   24   44:ireturn         
			}
		} else
		{
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		}
	}

	void requireKey()
	{
		if(TextUtils.isEmpty(((CharSequence) (mKey))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field String mKey>
	//*   2    4:invokestatic    #299 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            21
		{
			throw new IllegalStateException("Preference does not have a key assigned.");
	//    4   10:new             #308 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc2            #745 <String "Preference does not have a key assigned.">
	//    7   17:invokespecial   #333 <Method void IllegalStateException(String)>
	//    8   20:athrow          
		} else
		{
			mRequiresKey = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #747 <Field boolean mRequiresKey>
			return;
	//   12   26:return          
		}
	}

	public void restoreHierarchyState(Bundle bundle)
	{
		dispatchRestoreInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #750 <Method void dispatchRestoreInstanceState(Bundle)>
	//    3    5:return          
	}

	public void saveHierarchyState(Bundle bundle)
	{
		dispatchSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #753 <Method void dispatchSaveInstanceState(Bundle)>
	//    3    5:return          
	}

	public void setDefaultValue(Object obj)
	{
		mDefaultValue = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #261 <Field Object mDefaultValue>
	//    3    5:return          
	}

	public void setDependency(String s)
	{
		unregisterDependency();
	//    0    0:aload_0         
	//    1    1:invokespecial   #654 <Method void unregisterDependency()>
		mDependencyKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #246 <Field String mDependencyKey>
		registerDependency();
	//    5    9:aload_0         
	//    6   10:invokespecial   #561 <Method void registerDependency()>
	//    7   13:return          
	}

	public void setEnabled(boolean flag)
	{
		if(mEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field boolean mEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			mEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #107 <Field boolean mEnabled>
			notifyDependencyChange(shouldDisableDependents());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #347 <Method boolean shouldDisableDependents()>
	//   10   18:invokevirtual   #649 <Method void notifyDependencyChange(boolean)>
			notifyChanged();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #651 <Method void notifyChanged()>
		}
	//   13   25:return          
	}

	public void setFragment(String s)
	{
		mFragment = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #202 <Field String mFragment>
	//    3    5:return          
	}

	public void setIcon(int i)
	{
		setIcon(ContextCompat.getDrawable(mContext, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokestatic    #618 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #760 <Method void setIcon(Drawable)>
		mIconResId = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #157 <Field int mIconResId>
	//    9   17:return          
	}

	public void setIcon(Drawable drawable)
	{
		if(drawable == null && mIcon != null || drawable != null && mIcon != drawable)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
	//*   2    4:aload_0         
	//*   3    5:getfield        #488 <Field Drawable mIcon>
	//*   4    8:ifnonnull       23
	//*   5   11:aload_1         
	//*   6   12:ifnull          37
	//*   7   15:aload_0         
	//*   8   16:getfield        #488 <Field Drawable mIcon>
	//*   9   19:aload_1         
	//*  10   20:if_acmpeq       37
		{
			mIcon = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #488 <Field Drawable mIcon>
			mIconResId = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #157 <Field int mIconResId>
			notifyChanged();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #651 <Method void notifyChanged()>
		}
	//   19   37:return          
	}

	public void setIntent(Intent intent)
	{
		mIntent = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #496 <Field Intent mIntent>
	//    3    5:return          
	}

	public void setKey(String s)
	{
		mKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field String mKey>
		if(mRequiresKey && !hasKey())
	//*   3    5:aload_0         
	//*   4    6:getfield        #747 <Field boolean mRequiresKey>
	//*   5    9:ifeq            23
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #424 <Method boolean hasKey()>
	//*   8   16:ifne            23
			requireKey();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #764 <Method void requireKey()>
	//   11   23:return          
	}

	public void setLayoutResource(int i)
	{
		mLayoutResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int mLayoutResId>
	//    3    5:return          
	}

	final void setOnPreferenceChangeInternalListener(OnPreferenceChangeInternalListener onpreferencechangeinternallistener)
	{
		mListener = onpreferencechangeinternallistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//    3    5:return          
	}

	public void setOnPreferenceChangeListener(OnPreferenceChangeListener onpreferencechangelistener)
	{
		mOnChangeListener = onpreferencechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #401 <Field Preference$OnPreferenceChangeListener mOnChangeListener>
	//    3    5:return          
	}

	public void setOnPreferenceClickListener(OnPreferenceClickListener onpreferenceclicklistener)
	{
		mOnClickListener = onpreferenceclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #504 <Field Preference$OnPreferenceClickListener mOnClickListener>
	//    3    5:return          
	}

	public void setOrder(int i)
	{
		if(i != mOrder)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #103 <Field int mOrder>
	//*   3    5:icmpeq          17
		{
			mOrder = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #103 <Field int mOrder>
			notifyHierarchyChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #774 <Method void notifyHierarchyChanged()>
		}
	//    9   17:return          
	}

	public void setPersistent(boolean flag)
	{
		mPersistent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field boolean mPersistent>
	//    3    5:return          
	}

	public void setSelectable(boolean flag)
	{
		if(mSelectable != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean mSelectable>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mSelectable = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #109 <Field boolean mSelectable>
			notifyChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #651 <Method void notifyChanged()>
		}
	//    9   17:return          
	}

	public void setShouldDisableView(boolean flag)
	{
		mShouldDisableView = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #119 <Field boolean mShouldDisableView>
		notifyChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #651 <Method void notifyChanged()>
	//    5    9:return          
	}

	public void setSummary(int i)
	{
		setSummary(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #781 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #783 <Method void setSummary(CharSequence)>
	//    6   12:return          
	}

	public void setSummary(CharSequence charsequence)
	{
		if(charsequence == null && mSummary != null || charsequence != null && !((Object) (charsequence)).equals(((Object) (mSummary))))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
	//*   2    4:aload_0         
	//*   3    5:getfield        #185 <Field CharSequence mSummary>
	//*   4    8:ifnonnull       26
	//*   5   11:aload_1         
	//*   6   12:ifnull          35
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #185 <Field CharSequence mSummary>
	//*  10   20:invokevirtual   #786 <Method boolean Object.equals(Object)>
	//*  11   23:ifne            35
		{
			mSummary = charsequence;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #185 <Field CharSequence mSummary>
			notifyChanged();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #651 <Method void notifyChanged()>
		}
	//   17   35:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #781 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #789 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(charsequence == null && mTitle != null || charsequence != null && !((Object) (charsequence)).equals(((Object) (mTitle))))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
	//*   2    4:aload_0         
	//*   3    5:getfield        #177 <Field CharSequence mTitle>
	//*   4    8:ifnonnull       26
	//*   5   11:aload_1         
	//*   6   12:ifnull          35
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #177 <Field CharSequence mTitle>
	//*  10   20:invokevirtual   #786 <Method boolean Object.equals(Object)>
	//*  11   23:ifne            35
		{
			mTitle = charsequence;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #177 <Field CharSequence mTitle>
			notifyChanged();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #651 <Method void notifyChanged()>
		}
	//   17   35:return          
	}

	public void setViewId(int i)
	{
		mViewId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field int mViewId>
	//    3    5:return          
	}

	public final void setVisible(boolean flag)
	{
		if(mVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field boolean mVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          30
		{
			mVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #117 <Field boolean mVisible>
			if(mListener != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//*   9   17:ifnull          30
				mListener.onPreferenceVisibilityChange(this);
	//   10   20:aload_0         
	//   11   21:getfield        #544 <Field Preference$OnPreferenceChangeInternalListener mListener>
	//   12   24:aload_0         
	//   13   25:invokeinterface #794 <Method void Preference$OnPreferenceChangeInternalListener.onPreferenceVisibilityChange(Preference)>
		}
	//   14   30:return          
	}

	public void setWidgetLayoutResource(int i)
	{
		mWidgetLayoutResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #216 <Field int mWidgetLayoutResId>
	//    3    5:return          
	}

	public boolean shouldDisableDependents()
	{
		return !isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #632 <Method boolean isEnabled()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected boolean shouldPersist()
	{
		return mPreferenceManager != null && isPersistent() && hasKey();
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field PreferenceManager mPreferenceManager>
	//    2    4:ifnull          23
	//    3    7:aload_0         
	//    4    8:invokevirtual   #797 <Method boolean isPersistent()>
	//    5   11:ifeq            23
	//    6   14:aload_0         
	//    7   15:invokevirtual   #424 <Method boolean hasKey()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public String toString()
	{
		return getFilterableStringBuilder().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #799 <Method StringBuilder getFilterableStringBuilder()>
	//    2    4:invokevirtual   #330 <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	public static final int DEFAULT_ORDER = 0x7fffffff;
	private boolean mBaseMethodCalled;
	private final android.view.View.OnClickListener mClickListener;
	private Context mContext;
	private Object mDefaultValue;
	private String mDependencyKey;
	private boolean mDependencyMet;
	private List mDependents;
	private boolean mEnabled;
	private Bundle mExtras;
	private String mFragment;
	private boolean mHasId;
	private Drawable mIcon;
	private int mIconResId;
	private long mId;
	private Intent mIntent;
	private String mKey;
	private int mLayoutResId;
	private OnPreferenceChangeInternalListener mListener;
	private OnPreferenceChangeListener mOnChangeListener;
	private OnPreferenceClickListener mOnClickListener;
	private int mOrder;
	private boolean mParentDependencyMet;
	private boolean mPersistent;
	private PreferenceManager mPreferenceManager;
	private boolean mRequiresKey;
	private boolean mSelectable;
	private boolean mShouldDisableView;
	private CharSequence mSummary;
	private CharSequence mTitle;
	private int mViewId;
	private boolean mVisible;
	private int mWidgetLayoutResId;
}
