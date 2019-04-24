// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;

// Referenced classes of package o:
//			dbf, dho

static final class dbf$4 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(context == null || intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       23
		{
			dho.e("CommonUtil", new Object[] {
				"update receive null,deal failed,return"
			});
	//    4    8:ldc1            #15  <String "CommonUtil">
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #19  <String "update receive null,deal failed,return">
	//   10   18:aastore         
	//   11   19:invokestatic    #25  <Method void dho.e(String, Object[])>
			return;
	//   12   22:return          
		}
		context = ((Context) (intent.getAction()));
	//   13   23:aload_2         
	//   14   24:invokevirtual   #31  <Method String Intent.getAction()>
	//   15   27:astore_1        
		if(context == null)
	//*  16   28:aload_1         
	//*  17   29:ifnonnull       47
		{
			dho.e("CommonUtil", new Object[] {
				"updateReceiver receive action null,deal failed,return"
			});
	//   18   32:ldc1            #15  <String "CommonUtil">
	//   19   34:iconst_1        
	//   20   35:anewarray       Object[]
	//   21   38:dup             
	//   22   39:iconst_0        
	//   23   40:ldc1            #33  <String "updateReceiver receive action null,deal failed,return">
	//   24   42:aastore         
	//   25   43:invokestatic    #25  <Method void dho.e(String, Object[])>
			return;
	//   26   46:return          
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("update receive,action:").append(((String) (context))).toString()
		});
	//   27   47:ldc1            #15  <String "CommonUtil">
	//   28   49:iconst_1        
	//   29   50:anewarray       Object[]
	//   30   53:dup             
	//   31   54:iconst_0        
	//   32   55:new             #35  <Class StringBuilder>
	//   33   58:dup             
	//   34   59:invokespecial   #36  <Method void StringBuilder()>
	//   35   62:ldc1            #38  <String "update receive,action:">
	//   36   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   37   67:aload_1         
	//   38   68:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   40   74:aastore         
	//   41   75:invokestatic    #48  <Method void dho.b(String, Object[])>
		intent = ((Intent) (intent.getStringExtra("update_state")));
	//   42   78:aload_2         
	//   43   79:ldc1            #50  <String "update_state">
	//   44   81:invokevirtual   #54  <Method String Intent.getStringExtra(String)>
	//   45   84:astore_2        
		if(intent == null)
	//*  46   85:aload_2         
	//*  47   86:ifnonnull       104
		{
			dho.e("CommonUtil", new Object[] {
				"updateReceiver receive state null,deal failed,return"
			});
	//   48   89:ldc1            #15  <String "CommonUtil">
	//   49   91:iconst_1        
	//   50   92:anewarray       Object[]
	//   51   95:dup             
	//   52   96:iconst_0        
	//   53   97:ldc1            #56  <String "updateReceiver receive state null,deal failed,return">
	//   54   99:aastore         
	//   55  100:invokestatic    #25  <Method void dho.e(String, Object[])>
			return;
	//   56  103:return          
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("update receive,state:").append(((String) (intent))).toString()
		});
	//   57  104:ldc1            #15  <String "CommonUtil">
	//   58  106:iconst_1        
	//   59  107:anewarray       Object[]
	//   60  110:dup             
	//   61  111:iconst_0        
	//   62  112:new             #35  <Class StringBuilder>
	//   63  115:dup             
	//   64  116:invokespecial   #36  <Method void StringBuilder()>
	//   65  119:ldc1            #58  <String "update receive,state:">
	//   66  121:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   67  124:aload_2         
	//   68  125:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   69  128:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   70  131:aastore         
	//   71  132:invokestatic    #48  <Method void dho.b(String, Object[])>
		if(((String) (context)).equals("com.huawei.health.update_commonutils_area"))
	//*  72  135:aload_1         
	//*  73  136:ldc1            #60  <String "com.huawei.health.update_commonutils_area">
	//*  74  138:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  75  141:ifeq            150
		{
			dbf.o(((String) (intent)));
	//   76  144:aload_2         
	//   77  145:invokestatic    #69  <Method String dbf.o(String)>
	//   78  148:pop             
			return;
	//   79  149:return          
		}
		if(((String) (context)).equals("com.huawei.health.update_commonutils_LOGIN"))
	//*  80  150:aload_1         
	//*  81  151:ldc1            #71  <String "com.huawei.health.update_commonutils_LOGIN">
	//*  82  153:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  83  156:ifeq            164
			dbf.l(((String) (intent)));
	//   84  159:aload_2         
	//   85  160:invokestatic    #74  <Method String dbf.l(String)>
	//   86  163:pop             
	//   87  164:return          
	}

	dbf$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void BroadcastReceiver()>
	//    2    4:return          
	}
}
