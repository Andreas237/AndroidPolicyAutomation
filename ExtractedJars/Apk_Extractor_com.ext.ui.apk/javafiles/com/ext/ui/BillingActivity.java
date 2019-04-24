// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.*;

// Referenced classes of package com.ext.ui:
//			BaseActivity

public class BillingActivity extends BaseActivity
{

	public BillingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void BaseActivity()>
		c = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #27  <String "">
	//    4    7:putfield        #29  <Field String c>
		d = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #31  <Field boolean d>
		e = "";
	//    8   15:aload_0         
	//    9   16:ldc1            #27  <String "">
	//   10   18:putfield        #33  <Field String e>
		a = new android.support.v7.bz.c() {

			public void a(ca ca1, cb cb1)
			{
				if(BillingActivity.a(a) == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field BillingActivity a>
			//*   2    4:invokestatic    #22  <Method bz BillingActivity.a(BillingActivity)>
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
			//   19   41:invokevirtual   #48  <Method cc cb.a(String)>
			//   20   44:astore_1        
				cb1 = ((cb) (a));
			//   21   45:aload_0         
			//   22   46:getfield        #14  <Field BillingActivity a>
			//   23   49:astore_2        
				boolean flag;
				if(ca1 != null && a.a(((cc) (ca1))))
			//*  24   50:aload_1         
			//*  25   51:ifnull          155
			//*  26   54:aload_0         
			//*  27   55:getfield        #14  <Field BillingActivity a>
			//*  28   58:aload_1         
			//*  29   59:invokevirtual   #51  <Method boolean BillingActivity.a(cc)>
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

			
			{
				a = BillingActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BillingActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   21:aload_0         
	//   12   22:new             #6   <Class BillingActivity$1>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #36  <Method void BillingActivity$1(BillingActivity)>
	//   16   30:putfield        #38  <Field android.support.v7.bz$c a>
		b = new android.support.v7.bz.a() {

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
			//*  16   37:invokestatic    #47  <Method bz BillingActivity.a(BillingActivity)>
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

			
			{
				a = BillingActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field BillingActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   17   33:aload_0         
	//   18   34:new             #8   <Class BillingActivity$2>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #39  <Method void BillingActivity$2(BillingActivity)>
	//   22   42:putfield        #41  <Field android.support.v7.bz$a b>
	//   23   45:return          
	}

	static bz a(BillingActivity billingactivity)
	{
		return billingactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field bz f>
	//    2    4:areturn         
	}

	static boolean a(BillingActivity billingactivity, boolean flag)
	{
		billingactivity.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String b(BillingActivity billingactivity)
	{
		return billingactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String c>
	//    2    4:areturn         
	}

	static boolean c(BillingActivity billingactivity)
	{
		return billingactivity.d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean d>
	//    2    4:ireturn         
	}

	public void a()
	{
		ci.a("BillingActivity", "goPremium button clicked; launching purchase flow for goPremium.");
	//    0    0:ldc1            #50  <String "BillingActivity">
	//    1    2:ldc1            #52  <String "goPremium button clicked; launching purchase flow for goPremium.">
	//    2    4:invokestatic    #57  <Method void ci.a(String, String)>
		String s = e.substring(15, 60);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field String e>
	//    5   11:bipush          15
	//    6   13:bipush          60
	//    7   15:invokevirtual   #63  <Method String String.substring(int, int)>
	//    8   18:astore_1        
		f.a(((android.app.Activity) (this)), c, 10001, b, s);
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field bz f>
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field String c>
	//   14   28:sipush          10001
	//   15   31:aload_0         
	//   16   32:getfield        #41  <Field android.support.v7.bz$a b>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #68  <Method void bz.a(android.app.Activity, String, int, android.support.v7.bz$a, String)>
	//   19   39:return          
	}

	boolean a(cc cc)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void b(String s)
	{
		ci.a("BillingActivity", (new StringBuilder()).append("**** TrivialDrive Error: ").append(s).toString());
	//    0    0:ldc1            #50  <String "BillingActivity">
	//    1    2:new             #72  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #73  <Method void StringBuilder()>
	//    4    9:ldc1            #75  <String "**** TrivialDrive Error: ">
	//    5   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:invokevirtual   #83  <Method String StringBuilder.toString()>
	//    9   21:invokestatic    #57  <Method void ci.a(String, String)>
		c((new StringBuilder()).append("Error: ").append(s).toString());
	//   10   24:aload_0         
	//   11   25:new             #72  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #73  <Method void StringBuilder()>
	//   14   32:ldc1            #85  <String "Error: ">
	//   15   34:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   19   44:invokevirtual   #87  <Method void c(String)>
	//   20   47:return          
	}

	public boolean b()
	{
		return cj.a().b(cj.g, false);
	//    0    0:invokestatic    #93  <Method cj cj.a()>
	//    1    3:getstatic       #96  <Field String cj.g>
	//    2    6:iconst_0        
	//    3    7:invokevirtual   #99  <Method boolean cj.b(String, boolean)>
	//    4   10:ireturn         
	}

	void c(String s)
	{
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (this)));
	//    0    0:new             #101 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:astore_2        
		builder.setMessage(((CharSequence) (s)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #108 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   14:pop             
		builder.setNeutralButton("OK", ((android.content.DialogInterface.OnClickListener) (null)));
	//    9   15:aload_2         
	//   10   16:ldc1            #110 <String "OK">
	//   11   18:aconst_null     
	//   12   19:invokevirtual   #114 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   13   22:pop             
		ci.a("BillingActivity", (new StringBuilder()).append("Showing alert dialog: ").append(s).toString());
	//   14   23:ldc1            #50  <String "BillingActivity">
	//   15   25:new             #72  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #73  <Method void StringBuilder()>
	//   18   32:ldc1            #116 <String "Showing alert dialog: ">
	//   19   34:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   23   44:invokestatic    #57  <Method void ci.a(String, String)>
		builder.create().show();
	//   24   47:aload_2         
	//   25   48:invokevirtual   #120 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   26   51:invokevirtual   #125 <Method void AlertDialog.show()>
	//   27   54:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		ci.a("BillingActivity", (new StringBuilder()).append("onActivityResult(").append(i).append(",").append(j).append(",").append(((Object) (intent))).toString());
	//    0    0:ldc1            #50  <String "BillingActivity">
	//    1    2:new             #72  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #73  <Method void StringBuilder()>
	//    4    9:ldc1            #129 <String "onActivityResult(">
	//    5   11:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//    8   18:ldc1            #134 <String ",">
	//    9   20:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:iload_2         
	//   11   24:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   12   27:ldc1            #134 <String ",">
	//   13   29:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_3         
	//   15   33:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   16   36:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   17   39:invokestatic    #57  <Method void ci.a(String, String)>
		if(f == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #45  <Field bz f>
	//*  20   46:ifnonnull       50
			return;
	//   21   49:return          
		if(!f.a(i, j, intent))
	//*  22   50:aload_0         
	//*  23   51:getfield        #45  <Field bz f>
	//*  24   54:iload_1         
	//*  25   55:iload_2         
	//*  26   56:aload_3         
	//*  27   57:invokevirtual   #140 <Method boolean bz.a(int, int, Intent)>
	//*  28   60:ifne            71
		{
			super.onActivityResult(i, j, intent);
	//   29   63:aload_0         
	//   30   64:iload_1         
	//   31   65:iload_2         
	//   32   66:aload_3         
	//   33   67:invokespecial   #142 <Method void BaseActivity.onActivityResult(int, int, Intent)>
			return;
	//   34   70:return          
		} else
		{
			ci.a("BillingActivity", "onActivityResult handled by IABUtil.");
	//   35   71:ldc1            #50  <String "BillingActivity">
	//   36   73:ldc1            #144 <String "onActivityResult handled by IABUtil.">
	//   37   75:invokestatic    #57  <Method void ci.a(String, String)>
			return;
	//   38   78:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void BaseActivity.onCreate(Bundle)>
		e = getResources().getString(0x7f0d0033);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #152 <Method Resources getResources()>
	//    6   10:ldc1            #153 <Int 0x7f0d0033>
	//    7   12:invokevirtual   #159 <Method String Resources.getString(int)>
	//    8   15:putfield        #33  <Field String e>
		c = getResources().getString(0x7f0d0064);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #152 <Method Resources getResources()>
	//   12   23:ldc1            #160 <Int 0x7f0d0064>
	//   13   25:invokevirtual   #159 <Method String Resources.getString(int)>
	//   14   28:putfield        #29  <Field String c>
		ci.a("BillingActivity", "Creating IAB helper.");
	//   15   31:ldc1            #50  <String "BillingActivity">
	//   16   33:ldc1            #162 <String "Creating IAB helper.">
	//   17   35:invokestatic    #57  <Method void ci.a(String, String)>
		f = new bz(((android.content.Context) (this)), e);
	//   18   38:aload_0         
	//   19   39:new             #65  <Class bz>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #33  <Field String e>
	//   24   48:invokespecial   #165 <Method void bz(android.content.Context, String)>
	//   25   51:putfield        #45  <Field bz f>
		f.a(false);
	//   26   54:aload_0         
	//   27   55:getfield        #45  <Field bz f>
	//   28   58:iconst_0        
	//   29   59:invokevirtual   #168 <Method void bz.a(boolean)>
		ci.a("BillingActivity", "Starting setup.");
	//   30   62:ldc1            #50  <String "BillingActivity">
	//   31   64:ldc1            #170 <String "Starting setup.">
	//   32   66:invokestatic    #57  <Method void ci.a(String, String)>
		f.a(new android.support.v7.bz.b() {

			public void a(ca ca1)
			{
				ci.a("BillingActivity", "Setup finished.");
			//    0    0:ldc1            #24  <String "BillingActivity">
			//    1    2:ldc1            #26  <String "Setup finished.">
			//    2    4:invokestatic    #31  <Method void ci.a(String, String)>
				while(!ca1.b() || BillingActivity.a(a) == null) 
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #37  <Method boolean ca.b()>
			//*   5   11:ifne            15
					return;
			//    6   14:return          
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field BillingActivity a>
			//    9   19:invokestatic    #40  <Method bz BillingActivity.a(BillingActivity)>
			//   10   22:ifnull          14
				ci.a("BillingActivity", "Setup successful. Querying inventory.");
			//   11   25:ldc1            #24  <String "BillingActivity">
			//   12   27:ldc1            #42  <String "Setup successful. Querying inventory.">
			//   13   29:invokestatic    #31  <Method void ci.a(String, String)>
				BillingActivity.a(a).a(a.a);
			//   14   32:aload_0         
			//   15   33:getfield        #17  <Field BillingActivity a>
			//   16   36:invokestatic    #40  <Method bz BillingActivity.a(BillingActivity)>
			//   17   39:aload_0         
			//   18   40:getfield        #17  <Field BillingActivity a>
			//   19   43:getfield        #45  <Field android.support.v7.bz$c BillingActivity.a>
			//   20   46:invokevirtual   #50  <Method void bz.a(android.support.v7.bz$c)>
			//   21   49:return          
			}

			final BillingActivity a;

			
			{
				a = BillingActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BillingActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   33   69:aload_0         
	//   34   70:getfield        #45  <Field bz f>
	//   35   73:new             #10  <Class BillingActivity$3>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #171 <Method void BillingActivity$3(BillingActivity)>
	//   39   81:invokevirtual   #174 <Method void bz.a(android.support.v7.bz$b)>
	//   40   84:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void BaseActivity.onDestroy()>
		ci.a("BillingActivity", "Destroying helper.");
	//    2    4:ldc1            #50  <String "BillingActivity">
	//    3    6:ldc1            #179 <String "Destroying helper.">
	//    4    8:invokestatic    #57  <Method void ci.a(String, String)>
		if(f != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field bz f>
	//*   7   15:ifnull          30
		{
			f.a();
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field bz f>
	//   10   22:invokevirtual   #181 <Method void bz.a()>
			f = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #45  <Field bz f>
		}
	//   14   30:return          
	}

	android.support.v7.bz.c a;
	android.support.v7.bz.a b;
	private String c;
	private boolean d;
	private String e;
	private bz f;
}
