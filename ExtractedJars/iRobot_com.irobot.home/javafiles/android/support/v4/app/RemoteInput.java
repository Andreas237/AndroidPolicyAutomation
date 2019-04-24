// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			RemoteInputCompatApi20, RemoteInputCompatJellybean

public final class RemoteInput extends RemoteInputCompatBase.RemoteInput
{
	public static final class Builder
	{

		public Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				mExtras.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field Bundle mExtras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #52  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public RemoteInput build()
		{
			return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormTextInput, mExtras, mAllowedDataTypes);
		//    0    0:new             #6   <Class RemoteInput>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field String mResultKey>
		//    4    8:aload_0         
		//    5    9:getfield        #56  <Field CharSequence mLabel>
		//    6   12:aload_0         
		//    7   13:getfield        #58  <Field CharSequence[] mChoices>
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field boolean mAllowFreeFormTextInput>
		//   10   20:aload_0         
		//   11   21:getfield        #32  <Field Bundle mExtras>
		//   12   24:aload_0         
		//   13   25:getfield        #37  <Field Set mAllowedDataTypes>
		//   14   28:invokespecial   #61  <Method void RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
		//   15   31:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public Builder setAllowDataType(String s, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            17
			{
				mAllowedDataTypes.add(((Object) (s)));
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field Set mAllowedDataTypes>
		//    4    8:aload_1         
		//    5    9:invokeinterface #71  <Method boolean Set.add(Object)>
		//    6   14:pop             
				return this;
		//    7   15:aload_0         
		//    8   16:areturn         
			} else
			{
				mAllowedDataTypes.remove(((Object) (s)));
		//    9   17:aload_0         
		//   10   18:getfield        #37  <Field Set mAllowedDataTypes>
		//   11   21:aload_1         
		//   12   22:invokeinterface #74  <Method boolean Set.remove(Object)>
		//   13   27:pop             
				return this;
		//   14   28:aload_0         
		//   15   29:areturn         
			}
		}

		public Builder setAllowFreeFormInput(boolean flag)
		{
			mAllowFreeFormTextInput = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #27  <Field boolean mAllowFreeFormTextInput>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setChoices(CharSequence acharsequence[])
		{
			mChoices = acharsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field CharSequence[] mChoices>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLabel(CharSequence charsequence)
		{
			mLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field CharSequence mLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mAllowFreeFormTextInput;
		private final Set mAllowedDataTypes = new HashSet();
		private CharSequence mChoices[];
		private Bundle mExtras;
		private CharSequence mLabel;
		private final String mResultKey;

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mAllowFreeFormTextInput = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #27  <Field boolean mAllowFreeFormTextInput>
			mExtras = new Bundle();
		//    5    9:aload_0         
		//    6   10:new             #29  <Class Bundle>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void Bundle()>
		//    9   17:putfield        #32  <Field Bundle mExtras>
		//   10   20:aload_0         
		//   11   21:new             #34  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #35  <Method void HashSet()>
		//   14   28:putfield        #37  <Field Set mAllowedDataTypes>
			if(s == null)
		//*  15   31:aload_1         
		//*  16   32:ifnonnull       45
			{
				throw new IllegalArgumentException("Result key can't be null");
		//   17   35:new             #39  <Class IllegalArgumentException>
		//   18   38:dup             
		//   19   39:ldc1            #41  <String "Result key can't be null">
		//   20   41:invokespecial   #43  <Method void IllegalArgumentException(String)>
		//   21   44:athrow          
			} else
			{
				mResultKey = s;
		//   22   45:aload_0         
		//   23   46:aload_1         
		//   24   47:putfield        #45  <Field String mResultKey>
				return;
		//   25   50:return          
			}
		}
	}

	static interface Impl
	{

		public abstract void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map);

		public abstract void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle);

		public abstract Map getDataResultsFromIntent(Intent intent, String s);

		public abstract Bundle getResultsFromIntent(Intent intent);
	}

	static class ImplApi20
		implements Impl
	{

		public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
		{
			RemoteInputCompatApi20.addDataResultToIntent(((RemoteInputCompatBase.RemoteInput) (remoteinput)), intent, map);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #21  <Method void RemoteInputCompatApi20.addDataResultToIntent(RemoteInputCompatBase$RemoteInput, Intent, Map)>
		//    4    6:return          
		}

		public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
		{
			RemoteInputCompatApi20.addResultsToIntent(((RemoteInputCompatBase.RemoteInput []) (aremoteinput)), intent, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #28  <Method void RemoteInputCompatApi20.addResultsToIntent(RemoteInputCompatBase$RemoteInput[], Intent, Bundle)>
		//    4    6:return          
		}

		public Map getDataResultsFromIntent(Intent intent, String s)
		{
			return RemoteInputCompatApi20.getDataResultsFromIntent(intent, s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #32  <Method Map RemoteInputCompatApi20.getDataResultsFromIntent(Intent, String)>
		//    3    5:areturn         
		}

		public Bundle getResultsFromIntent(Intent intent)
		{
			return RemoteInputCompatApi20.getResultsFromIntent(intent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #37  <Method Bundle RemoteInputCompatApi20.getResultsFromIntent(Intent)>
		//    2    4:areturn         
		}

		ImplApi20()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ImplBase
		implements Impl
	{

		public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #18  <String "RemoteInput">
		//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #18  <String "RemoteInput">
		//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
		//    3    7:pop             
		//    4    8:return          
		}

		public Map getDataResultsFromIntent(Intent intent, String s)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #18  <String "RemoteInput">
		//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
		//    3    7:pop             
			return null;
		//    4    8:aconst_null     
		//    5    9:areturn         
		}

		public Bundle getResultsFromIntent(Intent intent)
		{
			Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
		//    0    0:ldc1            #18  <String "RemoteInput">
		//    1    2:ldc1            #20  <String "RemoteInput is only supported from API Level 16">
		//    2    4:invokestatic    #26  <Method int Log.w(String, String)>
		//    3    7:pop             
			return null;
		//    4    8:aconst_null     
		//    5    9:areturn         
		}

		ImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ImplJellybean
		implements Impl
	{

		public void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
		{
			RemoteInputCompatJellybean.addDataResultToIntent(remoteinput, intent, map);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #20  <Method void RemoteInputCompatJellybean.addDataResultToIntent(RemoteInput, Intent, Map)>
		//    4    6:return          
		}

		public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
		{
			RemoteInputCompatJellybean.addResultsToIntent(((RemoteInputCompatBase.RemoteInput []) (aremoteinput)), intent, bundle);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #27  <Method void RemoteInputCompatJellybean.addResultsToIntent(RemoteInputCompatBase$RemoteInput[], Intent, Bundle)>
		//    4    6:return          
		}

		public Map getDataResultsFromIntent(Intent intent, String s)
		{
			return RemoteInputCompatJellybean.getDataResultsFromIntent(intent, s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #31  <Method Map RemoteInputCompatJellybean.getDataResultsFromIntent(Intent, String)>
		//    3    5:areturn         
		}

		public Bundle getResultsFromIntent(Intent intent)
		{
			return RemoteInputCompatJellybean.getResultsFromIntent(intent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #36  <Method Bundle RemoteInputCompatJellybean.getResultsFromIntent(Intent)>
		//    2    4:areturn         
		}

		ImplJellybean()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	RemoteInput(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void RemoteInputCompatBase$RemoteInput()>
		mResultKey = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #73  <Field String mResultKey>
		mLabel = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #75  <Field CharSequence mLabel>
		mChoices = acharsequence;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #77  <Field CharSequence[] mChoices>
		mAllowFreeFormTextInput = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #79  <Field boolean mAllowFreeFormTextInput>
		mExtras = bundle;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #81  <Field Bundle mExtras>
		mAllowedDataTypes = set;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #83  <Field Set mAllowedDataTypes>
	//   20   37:return          
	}

	public static void addDataResultToIntent(RemoteInput remoteinput, Intent intent, Map map)
	{
		IMPL.addDataResultToIntent(remoteinput, intent, map);
	//    0    0:getstatic       #63  <Field RemoteInput$Impl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #89  <Method void RemoteInput$Impl.addDataResultToIntent(RemoteInput, Intent, Map)>
	//    5   11:return          
	}

	public static void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
	{
		IMPL.addResultsToIntent(aremoteinput, intent, bundle);
	//    0    0:getstatic       #63  <Field RemoteInput$Impl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #94  <Method void RemoteInput$Impl.addResultsToIntent(RemoteInput[], Intent, Bundle)>
	//    5   11:return          
	}

	public static Map getDataResultsFromIntent(Intent intent, String s)
	{
		return IMPL.getDataResultsFromIntent(intent, s);
	//    0    0:getstatic       #63  <Field RemoteInput$Impl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #98  <Method Map RemoteInput$Impl.getDataResultsFromIntent(Intent, String)>
	//    4   10:areturn         
	}

	public static Bundle getResultsFromIntent(Intent intent)
	{
		return IMPL.getResultsFromIntent(intent);
	//    0    0:getstatic       #63  <Field RemoteInput$Impl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #103 <Method Bundle RemoteInput$Impl.getResultsFromIntent(Intent)>
	//    3    9:areturn         
	}

	public boolean getAllowFreeFormInput()
	{
		return mAllowFreeFormTextInput;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean mAllowFreeFormTextInput>
	//    2    4:ireturn         
	}

	public Set getAllowedDataTypes()
	{
		return mAllowedDataTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Set mAllowedDataTypes>
	//    2    4:areturn         
	}

	public CharSequence[] getChoices()
	{
		return mChoices;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CharSequence[] mChoices>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public CharSequence getLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

	public String getResultKey()
	{
		return mResultKey;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String mResultKey>
	//    2    4:areturn         
	}

	public boolean isDataOnly()
	{
		return !getAllowFreeFormInput() && (getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method boolean getAllowFreeFormInput()>
	//    2    4:ifne            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #121 <Method CharSequence[] getChoices()>
	//    5   11:ifnull          22
	//    6   14:aload_0         
	//    7   15:invokevirtual   #121 <Method CharSequence[] getChoices()>
	//    8   18:arraylength     
	//    9   19:ifne            43
	//   10   22:aload_0         
	//   11   23:invokevirtual   #123 <Method Set getAllowedDataTypes()>
	//   12   26:ifnull          43
	//   13   29:aload_0         
	//   14   30:invokevirtual   #123 <Method Set getAllowedDataTypes()>
	//   15   33:invokeinterface #128 <Method boolean Set.isEmpty()>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
	public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
	public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY = new RemoteInputCompatBase.RemoteInput.Factory() {

		public RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set)
		{
			return new RemoteInput(s, charsequence, acharsequence, flag, bundle, set);
		//    0    0:new             #8   <Class RemoteInput>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:aload           5
		//    7   11:aload           6
		//    8   13:invokespecial   #18  <Method void RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
		//    9   16:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set)
		{
			return ((RemoteInputCompatBase.RemoteInput) (build(s, charsequence, acharsequence, flag, bundle, set)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:aload           5
		//    6    8:aload           6
		//    7   10:invokevirtual   #23  <Method RemoteInput build(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
		//    8   13:areturn         
		}

		public RemoteInput[] newArray(int i)
		{
			return new RemoteInput[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RemoteInput[]
		//    2    4:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput[] newArray(int i)
		{
			return ((RemoteInputCompatBase.RemoteInput []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RemoteInput[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final Impl IMPL;
	public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
	private static final String TAG = "RemoteInput";
	private final boolean mAllowFreeFormTextInput;
	private final Set mAllowedDataTypes;
	private final CharSequence mChoices[];
	private final Bundle mExtras;
	private final CharSequence mLabel;
	private final String mResultKey;

	static 
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #58  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          23
			obj = ((Object) (new ImplApi20()));
	//    3    8:new             #14  <Class RemoteInput$ImplApi20>
	//    4   11:dup             
	//    5   12:invokespecial   #61  <Method void RemoteInput$ImplApi20()>
	//    6   15:astore_0        
		else
	//*   7   16:aload_0         
	//*   8   17:putstatic       #63  <Field RemoteInput$Impl IMPL>
	//*   9   20:goto            53
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  10   23:getstatic       #58  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   26:bipush          16
	//*  12   28:icmplt          42
			obj = ((Object) (new ImplJellybean()));
	//   13   31:new             #20  <Class RemoteInput$ImplJellybean>
	//   14   34:dup             
	//   15   35:invokespecial   #64  <Method void RemoteInput$ImplJellybean()>
	//   16   38:astore_0        
		else
	//*  17   39:goto            16
			obj = ((Object) (new ImplBase()));
	//   18   42:new             #17  <Class RemoteInput$ImplBase>
	//   19   45:dup             
	//   20   46:invokespecial   #65  <Method void RemoteInput$ImplBase()>
	//   21   49:astore_0        
		IMPL = ((Impl) (obj));
	//*  22   50:goto            16
	//   23   53:new             #6   <Class RemoteInput$1>
	//   24   56:dup             
	//   25   57:invokespecial   #66  <Method void RemoteInput$1()>
	//   26   60:putstatic       #68  <Field RemoteInputCompatBase$RemoteInput$Factory FACTORY>
	//*  27   63:return          
	}
}
