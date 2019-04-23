// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.Queue;

// Referenced classes of package com.google.firebase.iid:
//			ae, z, FirebaseInstanceId

public class FirebaseInstanceIdService extends ae
{

	public FirebaseInstanceIdService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ae()>
	//    2    4:return          
	}

	protected final Intent a(Intent intent)
	{
		return (Intent)z.a().a.poll();
	//    0    0:invokestatic    #17  <Method z z.a()>
	//    1    3:getfield        #20  <Field Queue z.a>
	//    2    6:invokeinterface #26  <Method Object Queue.poll()>
	//    3   11:checkcast       #28  <Class Intent>
	//    4   14:areturn         
	}

	public void a()
	{
	//    0    0:return          
	}

	public final void b(Intent intent)
	{
		if("com.google.firebase.iid.TOKEN_REFRESH".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #33  <String "com.google.firebase.iid.TOKEN_REFRESH">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #37  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            17
		{
			a();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #45  <Method void a()>
			return;
	//    7   16:return          
		}
		String s = intent.getStringExtra("CMD");
	//    8   17:aload_1         
	//    9   18:ldc1            #47  <String "CMD">
	//   10   20:invokevirtual   #51  <Method String Intent.getStringExtra(String)>
	//   11   23:astore_2        
		if(s != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          151
		{
			if(Log.isLoggable("FirebaseInstanceId", 3))
	//*  14   28:ldc1            #53  <String "FirebaseInstanceId">
	//*  15   30:iconst_3        
	//*  16   31:invokestatic    #59  <Method boolean Log.isLoggable(String, int)>
	//*  17   34:ifeq            107
			{
				intent = ((Intent) (String.valueOf(((Object) (intent.getExtras())))));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #63  <Method android.os.Bundle Intent.getExtras()>
	//   20   41:invokestatic    #67  <Method String String.valueOf(Object)>
	//   21   44:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 21 + String.valueOf(((Object) (intent))).length());
	//   22   45:new             #69  <Class StringBuilder>
	//   23   48:dup             
	//   24   49:aload_2         
	//   25   50:invokestatic    #67  <Method String String.valueOf(Object)>
	//   26   53:invokevirtual   #73  <Method int String.length()>
	//   27   56:bipush          21
	//   28   58:iadd            
	//   29   59:aload_1         
	//   30   60:invokestatic    #67  <Method String String.valueOf(Object)>
	//   31   63:invokevirtual   #73  <Method int String.length()>
	//   32   66:iadd            
	//   33   67:invokespecial   #76  <Method void StringBuilder(int)>
	//   34   70:astore_3        
				stringbuilder.append("Received command: ");
	//   35   71:aload_3         
	//   36   72:ldc1            #78  <String "Received command: ">
	//   37   74:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
				stringbuilder.append(s);
	//   39   78:aload_3         
	//   40   79:aload_2         
	//   41   80:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   42   83:pop             
				stringbuilder.append(" - ");
	//   43   84:aload_3         
	//   44   85:ldc1            #84  <String " - ">
	//   45   87:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
				stringbuilder.append(((String) (intent)));
	//   47   91:aload_3         
	//   48   92:aload_1         
	//   49   93:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   50   96:pop             
				Log.d("FirebaseInstanceId", stringbuilder.toString());
	//   51   97:ldc1            #53  <String "FirebaseInstanceId">
	//   52   99:aload_3         
	//   53  100:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   54  103:invokestatic    #91  <Method int Log.d(String, String)>
	//   55  106:pop             
			}
			if(!"RST".equals(((Object) (s))) && !"RST_FULL".equals(((Object) (s))))
	//*  56  107:ldc1            #93  <String "RST">
	//*  57  109:aload_2         
	//*  58  110:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  59  113:ifne            144
	//*  60  116:ldc1            #95  <String "RST_FULL">
	//*  61  118:aload_2         
	//*  62  119:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  63  122:ifeq            128
	//*  64  125:goto            144
			{
				if("SYNC".equals(((Object) (s))))
	//*  65  128:ldc1            #97  <String "SYNC">
	//*  66  130:aload_2         
	//*  67  131:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  68  134:ifeq            151
				{
					FirebaseInstanceId.a().l();
	//   69  137:invokestatic    #102 <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//   70  140:invokevirtual   #105 <Method void FirebaseInstanceId.l()>
					return;
	//   71  143:return          
				}
			} else
			{
				FirebaseInstanceId.a().h();
	//   72  144:invokestatic    #102 <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//   73  147:invokevirtual   #108 <Method void FirebaseInstanceId.h()>
				return;
	//   74  150:return          
			}
		}
	//   75  151:return          
	}
}
