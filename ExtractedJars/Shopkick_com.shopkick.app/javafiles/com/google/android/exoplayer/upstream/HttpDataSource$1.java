// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer.util.Predicate;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			HttpDataSource

static final class HttpDataSource$1
	implements Predicate
{

	public volatile boolean evaluate(Object obj)
	{
		return evaluate((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class String>
	//    3    5:invokevirtual   #21  <Method boolean evaluate(String)>
	//    4    8:ireturn         
	}

	public boolean evaluate(String s)
	{
		s = Util.toLowerInvariant(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method String Util.toLowerInvariant(String)>
	//    2    4:astore_1        
		return !TextUtils.isEmpty(((CharSequence) (s))) && (!s.contains("text") || s.contains("text/vtt")) && !s.contains("html") && !s.contains("xml");
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5    9:ifne            50
	//    6   12:aload_1         
	//    7   13:ldc1            #35  <String "text">
	//    8   15:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
	//    9   18:ifeq            30
	//   10   21:aload_1         
	//   11   22:ldc1            #40  <String "text/vtt">
	//   12   24:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
	//   13   27:ifeq            50
	//   14   30:aload_1         
	//   15   31:ldc1            #42  <String "html">
	//   16   33:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
	//   17   36:ifne            50
	//   18   39:aload_1         
	//   19   40:ldc1            #44  <String "xml">
	//   20   42:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
	//   21   45:ifne            50
	//   22   48:iconst_1        
	//   23   49:ireturn         
	//   24   50:iconst_0        
	//   25   51:ireturn         
	}

	HttpDataSource$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
