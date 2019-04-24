// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.Intent;
import android.support.v7.*;

// Referenced classes of package com.ext.ui:
//			BillingActivity

class BillingActivity$2
	implements android.support.v7.bz.a
{

	public void a(ca ca1, cc cc1)
	{
		ci.a("BillingActivity", (new StringBuilder()).append("Purchase finished: ").append(((Object) (ca1))).append(", purchase: ").append(((Object) (cc1))).toString());
	//    0    0:ldc1            #21  <String "BillingActivity">
	//    1    2:new             #23  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #24  <Method void StringBuilder()>
	//    4    9:ldc1            #26  <String "Purchase finished: ">
	//    5   11:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
	//    8   18:ldc1            #35  <String ", purchase: ">
	//    9   20:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_2         
	//   11   24:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
	//   12   27:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   13   30:invokestatic    #44  <Method void ci.a(String, String)>
		if(BillingActivity.a(a) != null)
	//*  14   33:aload_0         
	//*  15   34:getfield        #14  <Field BillingActivity a>
	//*  16   37:invokestatic    #47  <Method android.support.v7.bz BillingActivity.a(BillingActivity)>
	//*  17   40:ifnonnull       44
	//*  18   43:return          
		{
			if(ca1.c())
	//*  19   44:aload_1         
	//*  20   45:invokevirtual   #53  <Method boolean ca.c()>
	//*  21   48:ifeq            76
			{
				ci.a("BillingActivity", (new StringBuilder()).append("Error purchasing: ").append(((Object) (ca1))).toString());
	//   22   51:ldc1            #21  <String "BillingActivity">
	//   23   53:new             #23  <Class StringBuilder>
	//   24   56:dup             
	//   25   57:invokespecial   #24  <Method void StringBuilder()>
	//   26   60:ldc1            #55  <String "Error purchasing: ">
	//   27   62:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   28   65:aload_1         
	//   29   66:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
	//   30   69:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   31   72:invokestatic    #44  <Method void ci.a(String, String)>
				return;
	//   32   75:return          
			}
			if(!a.a(cc1))
	//*  33   76:aload_0         
	//*  34   77:getfield        #14  <Field BillingActivity a>
	//*  35   80:aload_2         
	//*  36   81:invokevirtual   #58  <Method boolean BillingActivity.a(cc)>
	//*  37   84:ifne            97
			{
				a.b("Error purchasing. Authenticity verification failed.");
	//   38   87:aload_0         
	//   39   88:getfield        #14  <Field BillingActivity a>
	//   40   91:ldc1            #60  <String "Error purchasing. Authenticity verification failed.">
	//   41   93:invokevirtual   #64  <Method void BillingActivity.b(String)>
				return;
	//   42   96:return          
			}
			ci.a("BillingActivity", (new StringBuilder()).append("-------- Purchase successful. ").append(cc1.b()).toString());
	//   43   97:ldc1            #21  <String "BillingActivity">
	//   44   99:new             #23  <Class StringBuilder>
	//   45  102:dup             
	//   46  103:invokespecial   #24  <Method void StringBuilder()>
	//   47  106:ldc1            #66  <String "-------- Purchase successful. ">
	//   48  108:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   49  111:aload_2         
	//   50  112:invokevirtual   #70  <Method String cc.b()>
	//   51  115:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   52  118:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   53  121:invokestatic    #44  <Method void ci.a(String, String)>
			if(cc1.b().equals(((Object) (BillingActivity.b(a)))))
	//*  54  124:aload_2         
	//*  55  125:invokevirtual   #70  <Method String cc.b()>
	//*  56  128:aload_0         
	//*  57  129:getfield        #14  <Field BillingActivity a>
	//*  58  132:invokestatic    #73  <Method String BillingActivity.b(BillingActivity)>
	//*  59  135:invokevirtual   #79  <Method boolean String.equals(Object)>
	//*  60  138:ifeq            43
			{
				ci.a("BillingActivity", "-------- PREMIUM_PRODUCT purchase successful");
	//   61  141:ldc1            #21  <String "BillingActivity">
	//   62  143:ldc1            #81  <String "-------- PREMIUM_PRODUCT purchase successful">
	//   63  145:invokestatic    #44  <Method void ci.a(String, String)>
				BillingActivity.a(a, true);
	//   64  148:aload_0         
	//   65  149:getfield        #14  <Field BillingActivity a>
	//   66  152:iconst_1        
	//   67  153:invokestatic    #84  <Method boolean BillingActivity.a(BillingActivity, boolean)>
	//   68  156:pop             
				cj.a().a(cj.g, BillingActivity.c(a));
	//   69  157:invokestatic    #89  <Method cj cj.a()>
	//   70  160:getstatic       #93  <Field String cj.g>
	//   71  163:aload_0         
	//   72  164:getfield        #14  <Field BillingActivity a>
	//   73  167:invokestatic    #96  <Method boolean BillingActivity.c(BillingActivity)>
	//   74  170:invokevirtual   #99  <Method boolean cj.a(String, boolean)>
	//   75  173:pop             
				ca1 = ((ca) (new Intent("com.ext.ui.purchase_action")));
	//   76  174:new             #101 <Class Intent>
	//   77  177:dup             
	//   78  178:ldc1            #103 <String "com.ext.ui.purchase_action">
	//   79  180:invokespecial   #105 <Method void Intent(String)>
	//   80  183:astore_1        
				a.sendBroadcast(((Intent) (ca1)));
	//   81  184:aload_0         
	//   82  185:getfield        #14  <Field BillingActivity a>
	//   83  188:aload_1         
	//   84  189:invokevirtual   #109 <Method void BillingActivity.sendBroadcast(Intent)>
				return;
	//   85  192:return          
			}
		}
	}

	final BillingActivity a;

	BillingActivity$2(BillingActivity billingactivity)
	{
		a = billingactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BillingActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
