// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import java.util.Set;

public final class RemoteInput
{

	static android.app.RemoteInput fromCompat(RemoteInput remoteinput)
	{
		return (new android.app.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//    0    0:new             #24  <Class android.app.RemoteInput$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #28  <Method String getResultKey()>
	//    4    8:invokespecial   #32  <Method void android.app.RemoteInput$Builder(String)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #36  <Method CharSequence getLabel()>
	//    7   15:invokevirtual   #40  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #44  <Method CharSequence[] getChoices()>
	//   10   22:invokevirtual   #48  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #52  <Method boolean getAllowFreeFormInput()>
	//   13   29:invokevirtual   #56  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #60  <Method Bundle getExtras()>
	//   16   36:invokevirtual   #64  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   17   39:invokevirtual   #68  <Method android.app.RemoteInput android.app.RemoteInput$Builder.build()>
	//   18   42:areturn         
	}

	static android.app.RemoteInput[] fromCompat(RemoteInput aremoteinput[])
	{
		if(aremoteinput == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.app.RemoteInput aremoteinput1[] = new android.app.RemoteInput[aremoteinput.length];
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:anewarray       android.app.RemoteInput[]
	//    7   11:astore_2        
		for(int i = 0; i < aremoteinput.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:aload_0         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			aremoteinput1[i] = fromCompat(aremoteinput[i]);
	//   14   20:aload_2         
	//   15   21:iload_1         
	//   16   22:aload_0         
	//   17   23:iload_1         
	//   18   24:aaload          
	//   19   25:invokestatic    #75  <Method android.app.RemoteInput fromCompat(RemoteInput)>
	//   20   28:aastore         

	//   21   29:iload_1         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_1        
	//*  25   33:goto            14
		return aremoteinput1;
	//   26   36:aload_2         
	//   27   37:areturn         
	}

	public boolean getAllowFreeFormInput()
	{
		return mAllowFreeFormTextInput;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean mAllowFreeFormTextInput>
	//    2    4:ireturn         
	}

	public Set getAllowedDataTypes()
	{
		return mAllowedDataTypes;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Set mAllowedDataTypes>
	//    2    4:areturn         
	}

	public CharSequence[] getChoices()
	{
		return mChoices;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field CharSequence[] mChoices>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public CharSequence getLabel()
	{
		return mLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field CharSequence mLabel>
	//    2    4:areturn         
	}

	public String getResultKey()
	{
		return mResultKey;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String mResultKey>
	//    2    4:areturn         
	}

	public boolean isDataOnly()
	{
		return !getAllowFreeFormInput() && (getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method boolean getAllowFreeFormInput()>
	//    2    4:ifne            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #44  <Method CharSequence[] getChoices()>
	//    5   11:ifnull          22
	//    6   14:aload_0         
	//    7   15:invokevirtual   #44  <Method CharSequence[] getChoices()>
	//    8   18:arraylength     
	//    9   19:ifne            43
	//   10   22:aload_0         
	//   11   23:invokevirtual   #94  <Method Set getAllowedDataTypes()>
	//   12   26:ifnull          43
	//   13   29:aload_0         
	//   14   30:invokevirtual   #94  <Method Set getAllowedDataTypes()>
	//   15   33:invokeinterface #99  <Method boolean Set.isEmpty()>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	private final boolean mAllowFreeFormTextInput;
	private final Set mAllowedDataTypes;
	private final CharSequence mChoices[];
	private final Bundle mExtras;
	private final CharSequence mLabel;
	private final String mResultKey;
}
