// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

final class yg
	implements android.content.DialogInterface.OnClickListener
{

	private yg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
	//    0    0:return          
	}

	static final android.content.DialogInterface.OnClickListener a = new yg();

	static 
	{
	//    0    0:new             #2   <Class yg>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void yg()>
	//    3    7:putstatic       #15  <Field android.content.DialogInterface$OnClickListener a>
	//*   4   10:return          
	}
}
