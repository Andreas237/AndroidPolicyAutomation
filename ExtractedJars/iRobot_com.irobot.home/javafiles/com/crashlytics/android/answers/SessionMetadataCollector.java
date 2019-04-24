// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import b.a.a.a.a.b.i;
import b.a.a.a.a.b.p;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEventMetadata

class SessionMetadataCollector
{

	public SessionMetadataCollector(Context context1, p p1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Context context>
		idManager = p1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field p idManager>
		versionCode = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String versionCode>
		versionName = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field String versionName>
	//   14   25:return          
	}

	public SessionEventMetadata getMetadata()
	{
		Object obj = ((Object) (idManager.h()));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field p idManager>
	//    2    4:invokevirtual   #33  <Method Map p.h()>
	//    3    7:astore          4
		String s = idManager.c();
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field p idManager>
	//    6   13:invokevirtual   #37  <Method String p.c()>
	//    7   16:astore_1        
		String s1 = idManager.b();
	//    8   17:aload_0         
	//    9   18:getfield        #20  <Field p idManager>
	//   10   21:invokevirtual   #40  <Method String p.b()>
	//   11   24:astore_2        
		Boolean boolean1 = idManager.j();
	//   12   25:aload_0         
	//   13   26:getfield        #20  <Field p idManager>
	//   14   29:invokevirtual   #44  <Method Boolean p.j()>
	//   15   32:astore_3        
		obj = ((Object) ((String)((Map) (obj)).get(((Object) (b.a.a.a.a.b.p.a.FONT_TOKEN)))));
	//   16   33:aload           4
	//   17   35:getstatic       #50  <Field b.a.a.a.a.b.p$a b.a.a.a.a.b.p$a.FONT_TOKEN>
	//   18   38:invokeinterface #56  <Method Object Map.get(Object)>
	//   19   43:checkcast       #58  <Class String>
	//   20   46:astore          4
		String s2 = i.m(context);
	//   21   48:aload_0         
	//   22   49:getfield        #18  <Field Context context>
	//   23   52:invokestatic    #64  <Method String i.m(Context)>
	//   24   55:astore          5
		String s3 = idManager.d();
	//   25   57:aload_0         
	//   26   58:getfield        #20  <Field p idManager>
	//   27   61:invokevirtual   #67  <Method String p.d()>
	//   28   64:astore          6
		String s4 = idManager.g();
	//   29   66:aload_0         
	//   30   67:getfield        #20  <Field p idManager>
	//   31   70:invokevirtual   #70  <Method String p.g()>
	//   32   73:astore          7
		return new SessionEventMetadata(s, UUID.randomUUID().toString(), s1, boolean1, ((String) (obj)), s2, s3, s4, versionCode, versionName);
	//   33   75:new             #72  <Class SessionEventMetadata>
	//   34   78:dup             
	//   35   79:aload_1         
	//   36   80:invokestatic    #78  <Method UUID UUID.randomUUID()>
	//   37   83:invokevirtual   #81  <Method String UUID.toString()>
	//   38   86:aload_2         
	//   39   87:aload_3         
	//   40   88:aload           4
	//   41   90:aload           5
	//   42   92:aload           6
	//   43   94:aload           7
	//   44   96:aload_0         
	//   45   97:getfield        #22  <Field String versionCode>
	//   46  100:aload_0         
	//   47  101:getfield        #24  <Field String versionName>
	//   48  104:invokespecial   #84  <Method void SessionEventMetadata(String, String, String, Boolean, String, String, String, String, String, String)>
	//   49  107:areturn         
	}

	private final Context context;
	private final p idManager;
	private final String versionCode;
	private final String versionName;
}
