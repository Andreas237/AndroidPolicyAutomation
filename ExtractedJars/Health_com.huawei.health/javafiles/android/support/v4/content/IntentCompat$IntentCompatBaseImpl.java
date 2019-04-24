// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//			IntentCompat

static class IntentCompat$IntentCompatBaseImpl
{

	public Intent makeMainSelectorActivity(String s, String s1)
	{
		s = ((String) (new Intent(s)));
	//    0    0:new             #16  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s)).addCategory(s1);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #23  <Method Intent Intent.addCategory(String)>
	//    8   14:pop             
		return ((Intent) (s));
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	IntentCompat$IntentCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
