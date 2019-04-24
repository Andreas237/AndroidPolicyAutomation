// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.support.v7.af;
import android.support.v7.v;
import java.io.BufferedReader;

// Referenced classes of package com.truenet.android.a:
//			g

static final class g$a extends af
	implements v
{

	public Object a()
	{
		return ((Object) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method String b()>
	//    2    4:areturn         
	}

	public final String b()
	{
		$line.a = ((Object) ($reader.readLine()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.support.v7.aj$a $line>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field BufferedReader $reader>
	//    4    8:invokevirtual   #37  <Method String BufferedReader.readLine()>
	//    5   11:putfield        #42  <Field Object android.support.v7.aj$a.a>
		return (String)$line.a;
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field android.support.v7.aj$a $line>
	//    8   18:getfield        #42  <Field Object android.support.v7.aj$a.a>
	//    9   21:checkcast       #44  <Class String>
	//   10   24:areturn         
	}

	final android.support.v7. $line;
	final BufferedReader $reader;

	g$a(android.support.v7. , BufferedReader bufferedreader)
	{
		$line = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field android.support.v7.aj$a $line>
		$reader = bufferedreader;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field BufferedReader $reader>
		super(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #25  <Method void af(int)>
	//    9   15:return          
	}
}
