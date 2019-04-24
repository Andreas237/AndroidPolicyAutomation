// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.Intent;
import android.support.v7.*;

// Referenced classes of package com.ext.ui:
//			BillingActivity

class BillingActivity$1
	implements android.support.v7.bz.c
{

	public void a(ca ca1, cb cb1)
	{
		if(BillingActivity.a(a) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field BillingActivity a>
	//*   2    4:invokestatic    #22  <Method android.support.v7.bz BillingActivity.a(BillingActivity)>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		if(ca1.c())
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #28  <Method boolean ca.c()>
	//*   7   15:ifeq            26
		{
			ci.a("BillingActivity", "Failed to query Inventory");
	//    8   18:ldc1            #30  <String "BillingActivity">
	//    9   20:ldc1            #32  <String "Failed to query Inventory">
	//   10   22:invokestatic    #37  <Method void ci.a(String, String)>
			return;
	//   11   25:return          
		}
		ci.a("BillingActivity", "Query inventory was successful.");
	//   12   26:ldc1            #30  <String "BillingActivity">
	//   13   28:ldc1            #39  <String "Query inventory was successful.">
	//   14   30:invokestatic    #37  <Method void ci.a(String, String)>
		ca1 = ((ca) (cb1.a(BillingActivity.b(a))));
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #14  <Field BillingActivity a>
	//   18   38:invokestatic    #43  <Method String BillingActivity.b(BillingActivity)>
	//   19   41:invokevirtual   #48  <Method android.support.v7.cc cb.a(String)>
	//   20   44:astore_1        
		cb1 = ((cb) (a));
	//   21   45:aload_0         
	//   22   46:getfield        #14  <Field BillingActivity a>
	//   23   49:astore_2        
		boolean flag;
		if(ca1 != null && a.a(((android.support.v7.cc) (ca1))))
	//*  24   50:aload_1         
	//*  25   51:ifnull          155
	//*  26   54:aload_0         
	//*  27   55:getfield        #14  <Field BillingActivity a>
	//*  28   58:aload_1         
	//*  29   59:invokevirtual   #51  <Method boolean BillingActivity.a(android.support.v7.cc)>
	//*  30   62:ifeq            155
			flag = true;
	//   31   65:iconst_1        
	//   32   66:istore_3        
		else
	//*  33   67:aload_2         
	//*  34   68:iload_3         
	//*  35   69:invokestatic    #54  <Method boolean BillingActivity.a(BillingActivity, boolean)>
	//*  36   72:pop             
	//*  37   73:new             #56  <Class StringBuilder>
	//*  38   76:dup             
	//*  39   77:invokespecial   #57  <Method void StringBuilder()>
	//*  40   80:ldc1            #59  <String "User is ">
	//*  41   82:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  42   85:astore_2        
	//*  43   86:aload_0         
	//*  44   87:getfield        #14  <Field BillingActivity a>
	//*  45   90:invokestatic    #66  <Method boolean BillingActivity.c(BillingActivity)>
	//*  46   93:ifeq            160
	//*  47   96:ldc1            #68  <String "PREMIUM">
	//*  48   98:astore_1        
	//*  49   99:ldc1            #30  <String "BillingActivity">
	//*  50  101:aload_2         
	//*  51  102:aload_1         
	//*  52  103:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//*  53  106:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  54  109:invokestatic    #37  <Method void ci.a(String, String)>
	//*  55  112:invokestatic    #77  <Method cj cj.a()>
	//*  56  115:getstatic       #81  <Field String cj.g>
	//*  57  118:aload_0         
	//*  58  119:getfield        #14  <Field BillingActivity a>
	//*  59  122:invokestatic    #66  <Method boolean BillingActivity.c(BillingActivity)>
	//*  60  125:invokevirtual   #84  <Method boolean cj.a(String, boolean)>
	//*  61  128:pop             
	//*  62  129:ldc1            #30  <String "BillingActivity">
	//*  63  131:ldc1            #86  <String "Initial inventory query finished; ">
	//*  64  133:invokestatic    #37  <Method void ci.a(String, String)>
	//*  65  136:new             #88  <Class Intent>
	//*  66  139:dup             
	//*  67  140:ldc1            #90  <String "com.ext.ui.purchase_action">
	//*  68  142:invokespecial   #93  <Method void Intent(String)>
	//*  69  145:astore_1        
	//*  70  146:aload_0         
	//*  71  147:getfield        #14  <Field BillingActivity a>
	//*  72  150:aload_1         
	//*  73  151:invokevirtual   #97  <Method void BillingActivity.sendBroadcast(Intent)>
	//*  74  154:return          
			flag = false;
	//   75  155:iconst_0        
	//   76  156:istore_3        
		BillingActivity.a(((BillingActivity) (cb1)), flag);
		cb1 = ((cb) ((new StringBuilder()).append("User is ")));
		if(BillingActivity.c(a))
			ca1 = "PREMIUM";
		else
	//*  77  157:goto            67
			ca1 = "NOT PREMIUM";
	//   78  160:ldc1            #99  <String "NOT PREMIUM">
	//   79  162:astore_1        
		ci.a("BillingActivity", ((StringBuilder) (cb1)).append(((String) (ca1))).toString());
		cj.a().a(cj.g, BillingActivity.c(a));
		ci.a("BillingActivity", "Initial inventory query finished; ");
		ca1 = ((ca) (new Intent("com.ext.ui.purchase_action")));
		a.sendBroadcast(((Intent) (ca1)));
	//*  80  163:goto            99
	}

	final BillingActivity a;

	BillingActivity$1(BillingActivity billingactivity)
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
