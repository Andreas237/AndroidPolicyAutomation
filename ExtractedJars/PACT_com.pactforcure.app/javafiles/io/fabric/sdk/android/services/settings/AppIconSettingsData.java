// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.settings;


class AppIconSettingsData
{

	public AppIconSettingsData(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		hash = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String hash>
		width = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int width>
		height = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int height>
	//   11   19:return          
	}

	public final String hash;
	public final int height;
	public final int width;
}
