// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//			RemoteInput

static final class RemoteInput$1
	implements patBase.RemoteInput.Factory
{

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

	public volatile patBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle, Set set)
	{
		return ((patBase.RemoteInput) (build(s, charsequence, acharsequence, flag, bundle, set)));
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

	public volatile patBase.RemoteInput[] newArray(int i)
	{
		return ((patBase.RemoteInput []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method RemoteInput[] newArray(int)>
	//    3    5:areturn         
	}

	RemoteInput$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
