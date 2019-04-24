// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.af;
import android.support.v7.v;
import java.io.BufferedReader;

// Referenced classes of package com.truenet.android:
//			b

static final class b$d extends af
	implements v
{

	public Object a()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method String b()>
	//    2    4:areturn         
	}

	public final String b()
	{
		$line.a = ((Object) (((BufferedReader)$reader.a).readLine()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.support.v7.aj$a $line>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field android.support.v7.aj$a $reader>
	//    4    8:getfield        #36  <Field Object android.support.v7.aj$a.a>
	//    5   11:checkcast       #38  <Class BufferedReader>
	//    6   14:invokevirtual   #41  <Method String BufferedReader.readLine()>
	//    7   17:putfield        #36  <Field Object android.support.v7.aj$a.a>
		return (String)$line.a;
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field android.support.v7.aj$a $line>
	//   10   24:getfield        #36  <Field Object android.support.v7.aj$a.a>
	//   11   27:checkcast       #43  <Class String>
	//   12   30:areturn         
	}

	final android.support.v7. $line;
	final android.support.v7. $reader;

	b$d(android.support.v7. , android.support.v7. 1)
	{
		$line = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.support.v7.aj$a $line>
		$reader = 1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.support.v7.aj$a $reader>
		super(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #24  <Method void af(int)>
	//    9   15:return          
	}
}
