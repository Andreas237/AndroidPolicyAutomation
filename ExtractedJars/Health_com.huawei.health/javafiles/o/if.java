// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.DialogInterface;
import android.view.KeyEvent;

final class if
	implements android.content.DialogInterface.OnKeyListener
{

	if()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
	{
		return i == 4;
	//    0    0:iload_2         
	//    1    1:iconst_4        
	//    2    2:icmpne          7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}
}
