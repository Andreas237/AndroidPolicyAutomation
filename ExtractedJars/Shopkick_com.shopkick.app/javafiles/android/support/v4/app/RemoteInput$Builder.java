// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

public static final class RemoteInput$Builder
{

	public RemoteInput$Builder addExtras(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			mExtras.putAll(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Bundle mExtras>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #54  <Method void Bundle.putAll(Bundle)>
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
	//    3    5:getfield        #40  <Field String mResultKey>
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field CharSequence mLabel>
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field CharSequence[] mChoices>
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field boolean mAllowFreeFormTextInput>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Bundle mExtras>
	//   12   24:aload_0         
	//   13   25:getfield        #31  <Field Set mAllowedDataTypes>
	//   14   28:invokespecial   #64  <Method void RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, Set)>
	//   15   31:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public RemoteInput$Builder setAllowDataType(String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
		{
			mAllowedDataTypes.add(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Set mAllowedDataTypes>
	//    4    8:aload_1         
	//    5    9:invokeinterface #74  <Method boolean Set.add(Object)>
	//    6   14:pop             
			return this;
	//    7   15:aload_0         
	//    8   16:areturn         
		} else
		{
			mAllowedDataTypes.remove(((Object) (s)));
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field Set mAllowedDataTypes>
	//   11   21:aload_1         
	//   12   22:invokeinterface #77  <Method boolean Set.remove(Object)>
	//   13   27:pop             
			return this;
	//   14   28:aload_0         
	//   15   29:areturn         
		}
	}

	public RemoteInput$Builder setAllowFreeFormInput(boolean flag)
	{
		mAllowFreeFormTextInput = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean mAllowFreeFormTextInput>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RemoteInput$Builder setChoices(CharSequence acharsequence[])
	{
		mChoices = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field CharSequence[] mChoices>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RemoteInput$Builder setLabel(CharSequence charsequence)
	{
		mLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field CharSequence mLabel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean mAllowFreeFormTextInput;
	private final Set mAllowedDataTypes = new HashSet();
	private CharSequence mChoices[];
	private final Bundle mExtras = new Bundle();
	private CharSequence mLabel;
	private final String mResultKey;

	public RemoteInput$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void HashSet()>
	//    6   12:putfield        #31  <Field Set mAllowedDataTypes>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void Bundle()>
	//   11   23:putfield        #36  <Field Bundle mExtras>
		mAllowFreeFormTextInput = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #38  <Field boolean mAllowFreeFormTextInput>
		if(s != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          41
		{
			mResultKey = s;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #40  <Field String mResultKey>
			return;
	//   20   40:return          
		} else
		{
			throw new IllegalArgumentException("Result key can't be null");
	//   21   41:new             #42  <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #44  <String "Result key can't be null">
	//   24   47:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//   25   50:athrow          
		}
	}
}
