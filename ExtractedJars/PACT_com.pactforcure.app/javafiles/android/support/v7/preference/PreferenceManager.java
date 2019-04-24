// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.BuildCompat;

// Referenced classes of package android.support.v7.preference:
//			PreferenceScreen, PreferenceInflater, Preference

public class PreferenceManager
{
	public static interface OnDisplayPreferenceDialogListener
	{

		public abstract void onDisplayPreferenceDialog(Preference preference);
	}

	public static interface OnNavigateToScreenListener
	{

		public abstract void onNavigateToScreen(PreferenceScreen preferencescreen);
	}

	public static interface OnPreferenceTreeClickListener
	{

		public abstract boolean onPreferenceTreeClick(Preference preference);
	}


	public PreferenceManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		mNextId = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #57  <Field long mNextId>
		mStorage = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #59  <Field int mStorage>
		mContext = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #61  <Field Context mContext>
		setSharedPreferencesName(getDefaultSharedPreferencesName(context));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #65  <Method String getDefaultSharedPreferencesName(Context)>
	//   14   24:invokevirtual   #69  <Method void setSharedPreferencesName(String)>
	//   15   27:return          
	}

	public static SharedPreferences getDefaultSharedPreferences(Context context)
	{
		return context.getSharedPreferences(getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #65  <Method String getDefaultSharedPreferencesName(Context)>
	//    3    5:invokestatic    #77  <Method int getDefaultSharedPreferencesMode()>
	//    4    8:invokevirtual   #83  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   11:areturn         
	}

	private static int getDefaultSharedPreferencesMode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static String getDefaultSharedPreferencesName(Context context)
	{
		return (new StringBuilder()).append(context.getPackageName()).append("_preferences").toString();
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #90  <Method String Context.getPackageName()>
	//    5   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #96  <String "_preferences">
	//    7   16:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #99  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	public static void setDefaultValues(Context context, int i, boolean flag)
	{
		setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #65  <Method String getDefaultSharedPreferencesName(Context)>
	//    3    5:invokestatic    #77  <Method int getDefaultSharedPreferencesMode()>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #104 <Method void setDefaultValues(Context, String, int, int, boolean)>
	//    7   13:return          
	}

	public static void setDefaultValues(Context context, String s, int i, int j, boolean flag)
	{
		SharedPreferences sharedpreferences = context.getSharedPreferences("_has_set_default_values", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <String "_has_set_default_values">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #83  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:astore          5
		if(flag || !sharedpreferences.getBoolean("_has_set_default_values", false))
	//*   5    9:iload           4
	//*   6   11:ifne            27
	//*   7   14:aload           5
	//*   8   16:ldc1            #17  <String "_has_set_default_values">
	//*   9   18:iconst_0        
	//*  10   19:invokeinterface #110 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  11   24:ifne            81
		{
			PreferenceManager preferencemanager = new PreferenceManager(context);
	//   12   27:new             #2   <Class PreferenceManager>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:invokespecial   #112 <Method void PreferenceManager(Context)>
	//   16   35:astore          6
			preferencemanager.setSharedPreferencesName(s);
	//   17   37:aload           6
	//   18   39:aload_1         
	//   19   40:invokevirtual   #69  <Method void setSharedPreferencesName(String)>
			preferencemanager.setSharedPreferencesMode(i);
	//   20   43:aload           6
	//   21   45:iload_2         
	//   22   46:invokevirtual   #116 <Method void setSharedPreferencesMode(int)>
			preferencemanager.inflateFromResource(context, j, ((PreferenceScreen) (null)));
	//   23   49:aload           6
	//   24   51:aload_0         
	//   25   52:iload_3         
	//   26   53:aconst_null     
	//   27   54:invokevirtual   #120 <Method PreferenceScreen inflateFromResource(Context, int, PreferenceScreen)>
	//   28   57:pop             
			context = ((Context) (sharedpreferences.edit().putBoolean("_has_set_default_values", true)));
	//   29   58:aload           5
	//   30   60:invokeinterface #124 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   31   65:ldc1            #17  <String "_has_set_default_values">
	//   32   67:iconst_1        
	//   33   68:invokeinterface #130 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   34   73:astore_0        
			android.support.v4.content.SharedPreferencesCompat.EditorCompat.getInstance().apply(((android.content.SharedPreferences.Editor) (context)));
	//   35   74:invokestatic    #136 <Method android.support.v4.content.SharedPreferencesCompat$EditorCompat android.support.v4.content.SharedPreferencesCompat$EditorCompat.getInstance()>
	//   36   77:aload_0         
	//   37   78:invokevirtual   #140 <Method void android.support.v4.content.SharedPreferencesCompat$EditorCompat.apply(android.content.SharedPreferences$Editor)>
		}
	//   38   81:return          
	}

	private void setNoCommit(boolean flag)
	{
		if(!flag && mEditor != null)
	//*   0    0:iload_1         
	//*   1    1:ifne            21
	//*   2    4:aload_0         
	//*   3    5:getfield        #144 <Field android.content.SharedPreferences$Editor mEditor>
	//*   4    8:ifnull          21
			android.support.v4.content.SharedPreferencesCompat.EditorCompat.getInstance().apply(mEditor);
	//    5   11:invokestatic    #136 <Method android.support.v4.content.SharedPreferencesCompat$EditorCompat android.support.v4.content.SharedPreferencesCompat$EditorCompat.getInstance()>
	//    6   14:aload_0         
	//    7   15:getfield        #144 <Field android.content.SharedPreferences$Editor mEditor>
	//    8   18:invokevirtual   #140 <Method void android.support.v4.content.SharedPreferencesCompat$EditorCompat.apply(android.content.SharedPreferences$Editor)>
		mNoCommit = flag;
	//    9   21:aload_0         
	//   10   22:iload_1         
	//   11   23:putfield        #146 <Field boolean mNoCommit>
	//   12   26:return          
	}

	public PreferenceScreen createPreferenceScreen(Context context)
	{
		context = ((Context) (new PreferenceScreen(context, ((android.util.AttributeSet) (null)))));
	//    0    0:new             #150 <Class PreferenceScreen>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #153 <Method void PreferenceScreen(Context, android.util.AttributeSet)>
	//    5    9:astore_1        
		((PreferenceScreen) (context)).onAttachedToHierarchy(this);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #157 <Method void PreferenceScreen.onAttachedToHierarchy(PreferenceManager)>
		return ((PreferenceScreen) (context));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public Preference findPreference(CharSequence charsequence)
	{
		if(mPreferenceScreen == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mPreferenceScreen.findPreference(charsequence);
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #163 <Method Preference PreferenceScreen.findPreference(CharSequence)>
	//    9   17:areturn         
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Context mContext>
	//    2    4:areturn         
	}

	android.content.SharedPreferences.Editor getEditor()
	{
		if(mNoCommit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field boolean mNoCommit>
	//*   2    4:ifeq            32
		{
			if(mEditor == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #144 <Field android.content.SharedPreferences$Editor mEditor>
	//*   5   11:ifnonnull       27
				mEditor = getSharedPreferences().edit();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #169 <Method SharedPreferences getSharedPreferences()>
	//    9   19:invokeinterface #124 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   24:putfield        #144 <Field android.content.SharedPreferences$Editor mEditor>
			return mEditor;
	//   11   27:aload_0         
	//   12   28:getfield        #144 <Field android.content.SharedPreferences$Editor mEditor>
	//   13   31:areturn         
		} else
		{
			return getSharedPreferences().edit();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #169 <Method SharedPreferences getSharedPreferences()>
	//   16   36:invokeinterface #124 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   17   41:areturn         
		}
	}

	long getNextId()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		l = mNextId;
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field long mNextId>
	//    4    6:lstore_1        
		mNextId = 1L + l;
	//    5    7:aload_0         
	//    6    8:lconst_1        
	//    7    9:lload_1         
	//    8   10:ladd            
	//    9   11:putfield        #57  <Field long mNextId>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return l;
	//   12   16:lload_1         
	//   13   17:lreturn         
		Exception exception;
		exception;
	//   14   18:astore_3        
		this;
	//   15   19:aload_0         
		JVM INSTR monitorexit ;
	//   16   20:monitorexit     
		throw exception;
	//   17   21:aload_3         
	//   18   22:athrow          
	}

	public OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener()
	{
		return mOnDisplayPreferenceDialogListener;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field PreferenceManager$OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener>
	//    2    4:areturn         
	}

	public OnNavigateToScreenListener getOnNavigateToScreenListener()
	{
		return mOnNavigateToScreenListener;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field PreferenceManager$OnNavigateToScreenListener mOnNavigateToScreenListener>
	//    2    4:areturn         
	}

	public OnPreferenceTreeClickListener getOnPreferenceTreeClickListener()
	{
		return mOnPreferenceTreeClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field PreferenceManager$OnPreferenceTreeClickListener mOnPreferenceTreeClickListener>
	//    2    4:areturn         
	}

	public PreferenceScreen getPreferenceScreen()
	{
		return mPreferenceScreen;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//    2    4:areturn         
	}

	public SharedPreferences getSharedPreferences()
	{
		if(mSharedPreferences != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field SharedPreferences mSharedPreferences>
	//    2    4:ifnonnull       49
_L1:
		mStorage;
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field int mStorage>
		JVM INSTR tableswitch 1 1: default 28
	//	               1 54;
	//    5   11:tableswitch     1 1: default 28
	//	               1 54
		   goto _L3 _L4
_L3:
		Context context = mContext;
	//    6   28:aload_0         
	//    7   29:getfield        #61  <Field Context mContext>
	//    8   32:astore_1        
_L6:
		mSharedPreferences = context.getSharedPreferences(mSharedPreferencesName, mSharedPreferencesMode);
	//    9   33:aload_0         
	//   10   34:aload_1         
	//   11   35:aload_0         
	//   12   36:getfield        #189 <Field String mSharedPreferencesName>
	//   13   39:aload_0         
	//   14   40:getfield        #191 <Field int mSharedPreferencesMode>
	//   15   43:invokevirtual   #83  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   16   46:putfield        #187 <Field SharedPreferences mSharedPreferences>
_L2:
		return mSharedPreferences;
	//   17   49:aload_0         
	//   18   50:getfield        #187 <Field SharedPreferences mSharedPreferences>
	//   19   53:areturn         
_L4:
		context = ContextCompat.createDeviceProtectedStorageContext(mContext);
	//   20   54:aload_0         
	//   21   55:getfield        #61  <Field Context mContext>
	//   22   58:invokestatic    #197 <Method Context ContextCompat.createDeviceProtectedStorageContext(Context)>
	//   23   61:astore_1        
		if(true) goto _L6; else goto _L5
	//   24   62:goto            33
_L5:
	}

	public int getSharedPreferencesMode()
	{
		return mSharedPreferencesMode;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field int mSharedPreferencesMode>
	//    2    4:ireturn         
	}

	public String getSharedPreferencesName()
	{
		return mSharedPreferencesName;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field String mSharedPreferencesName>
	//    2    4:areturn         
	}

	public PreferenceScreen inflateFromResource(Context context, int i, PreferenceScreen preferencescreen)
	{
		setNoCommit(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #201 <Method void setNoCommit(boolean)>
		context = ((Context) ((PreferenceScreen)(new PreferenceInflater(context, this)).inflate(i, ((PreferenceGroup) (preferencescreen)))));
	//    3    5:new             #203 <Class PreferenceInflater>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #206 <Method void PreferenceInflater(Context, PreferenceManager)>
	//    8   14:iload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #210 <Method Preference PreferenceInflater.inflate(int, PreferenceGroup)>
	//   11   19:checkcast       #150 <Class PreferenceScreen>
	//   12   22:astore_1        
		((PreferenceScreen) (context)).onAttachedToHierarchy(this);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #157 <Method void PreferenceScreen.onAttachedToHierarchy(PreferenceManager)>
		setNoCommit(false);
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:invokespecial   #201 <Method void setNoCommit(boolean)>
		return ((PreferenceScreen) (context));
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	public boolean isStorageDefault()
	{
		return !BuildCompat.isAtLeastN() || mStorage == 0;
	//    0    0:invokestatic    #217 <Method boolean BuildCompat.isAtLeastN()>
	//    1    3:ifeq            13
	//    2    6:aload_0         
	//    3    7:getfield        #59  <Field int mStorage>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isStorageDeviceProtected()
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #217 <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            18
			return mStorage == 1;
	//    2    6:aload_0         
	//    3    7:getfield        #59  <Field int mStorage>
	//    4   10:iconst_1        
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
		else
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void setOnDisplayPreferenceDialogListener(OnDisplayPreferenceDialogListener ondisplaypreferencedialoglistener)
	{
		mOnDisplayPreferenceDialogListener = ondisplaypreferencedialoglistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field PreferenceManager$OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener>
	//    3    5:return          
	}

	public void setOnNavigateToScreenListener(OnNavigateToScreenListener onnavigatetoscreenlistener)
	{
		mOnNavigateToScreenListener = onnavigatetoscreenlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field PreferenceManager$OnNavigateToScreenListener mOnNavigateToScreenListener>
	//    3    5:return          
	}

	public void setOnPreferenceTreeClickListener(OnPreferenceTreeClickListener onpreferencetreeclicklistener)
	{
		mOnPreferenceTreeClickListener = onpreferencetreeclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #183 <Field PreferenceManager$OnPreferenceTreeClickListener mOnPreferenceTreeClickListener>
	//    3    5:return          
	}

	public boolean setPreferences(PreferenceScreen preferencescreen)
	{
		if(preferencescreen != mPreferenceScreen)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//*   3    5:if_acmpeq       29
		{
			if(mPreferenceScreen != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//*   6   12:ifnull          22
				mPreferenceScreen.onDetached();
	//    7   15:aload_0         
	//    8   16:getfield        #161 <Field PreferenceScreen mPreferenceScreen>
	//    9   19:invokevirtual   #229 <Method void PreferenceScreen.onDetached()>
			mPreferenceScreen = preferencescreen;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #161 <Field PreferenceScreen mPreferenceScreen>
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		} else
		{
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		}
	}

	public void setSharedPreferencesMode(int i)
	{
		mSharedPreferencesMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #191 <Field int mSharedPreferencesMode>
		mSharedPreferences = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #187 <Field SharedPreferences mSharedPreferences>
	//    6   10:return          
	}

	public void setSharedPreferencesName(String s)
	{
		mSharedPreferencesName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #189 <Field String mSharedPreferencesName>
		mSharedPreferences = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #187 <Field SharedPreferences mSharedPreferences>
	//    6   10:return          
	}

	public void setStorageDefault()
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #217 <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            16
		{
			mStorage = 0;
	//    2    6:aload_0         
	//    3    7:iconst_0        
	//    4    8:putfield        #59  <Field int mStorage>
			mSharedPreferences = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #187 <Field SharedPreferences mSharedPreferences>
		}
	//    8   16:return          
	}

	public void setStorageDeviceEncrypted()
	{
		setStorageDeviceProtected();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method void setStorageDeviceProtected()>
	//    2    4:return          
	}

	public void setStorageDeviceProtected()
	{
		if(BuildCompat.isAtLeastN())
	//*   0    0:invokestatic    #217 <Method boolean BuildCompat.isAtLeastN()>
	//*   1    3:ifeq            16
		{
			mStorage = 1;
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:putfield        #59  <Field int mStorage>
			mSharedPreferences = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #187 <Field SharedPreferences mSharedPreferences>
		}
	//    8   16:return          
	}

	boolean shouldCommit()
	{
		return !mNoCommit;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean mNoCommit>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void showDialog(Preference preference)
	{
		if(mOnDisplayPreferenceDialogListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field PreferenceManager$OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener>
	//*   2    4:ifnull          17
			mOnDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
	//    3    7:aload_0         
	//    4    8:getfield        #175 <Field PreferenceManager$OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #242 <Method void PreferenceManager$OnDisplayPreferenceDialogListener.onDisplayPreferenceDialog(Preference)>
	//    7   17:return          
	}

	public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
	private static final int STORAGE_DEFAULT = 0;
	private static final int STORAGE_DEVICE_PROTECTED = 1;
	private static final String TAG = "PreferenceManager";
	private Context mContext;
	private android.content.SharedPreferences.Editor mEditor;
	private long mNextId;
	private boolean mNoCommit;
	private OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener;
	private OnNavigateToScreenListener mOnNavigateToScreenListener;
	private OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
	private PreferenceScreen mPreferenceScreen;
	private SharedPreferences mSharedPreferences;
	private int mSharedPreferencesMode;
	private String mSharedPreferencesName;
	private int mStorage;
}
