// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnd, bdj, bkj

final class bkm
	implements bnd
{

	private bkm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	bkm(bkj bkj)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void bkm()>
	//    2    4:return          
	}

	private static Long b(Uri uri, InputStream inputstream)
	{
		uri = ((Uri) ((new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine()));
	//    0    0:new             #19  <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #21  <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #24  <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #27  <Method void BufferedReader(java.io.Reader)>
	//    7   15:invokevirtual   #31  <Method String BufferedReader.readLine()>
	//    8   18:astore_0        
		long l;
		try
		{
			inputstream = ((InputStream) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)));
	//    9   19:new             #33  <Class SimpleDateFormat>
	//   10   22:dup             
	//   11   23:ldc1            #35  <String "yyyy-MM-dd'T'HH:mm:ss'Z'">
	//   12   25:getstatic       #41  <Field Locale Locale.US>
	//   13   28:invokespecial   #44  <Method void SimpleDateFormat(String, Locale)>
	//   14   31:astore_1        
			((SimpleDateFormat) (inputstream)).setTimeZone(TimeZone.getTimeZone("UTC"));
	//   15   32:aload_1         
	//   16   33:ldc1            #46  <String "UTC">
	//   17   35:invokestatic    #52  <Method TimeZone TimeZone.getTimeZone(String)>
	//   18   38:invokevirtual   #56  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
			l = ((SimpleDateFormat) (inputstream)).parse(((String) (uri))).getTime();
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #60  <Method Date SimpleDateFormat.parse(String)>
	//   22   46:invokevirtual   #66  <Method long Date.getTime()>
	//   23   49:lstore_2        
		}
	//*  24   50:lload_2         
	//*  25   51:invokestatic    #72  <Method Long Long.valueOf(long)>
	//*  26   54:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  27   55:astore_0        
		{
			throw new bdj(((Throwable) (uri)));
	//   28   56:new             #74  <Class bdj>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:invokespecial   #77  <Method void bdj(Throwable)>
	//   32   64:athrow          
		}
		return Long.valueOf(l);
	}

	public final Object a(Uri uri, InputStream inputstream)
	{
		return ((Object) (b(uri, inputstream)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #81  <Method Long b(Uri, InputStream)>
	//    3    5:areturn         
	}
}
