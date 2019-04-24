// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.ContactInfo;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_

public class ContactTableViewActivity extends BaseFragmentActivity
{

	public ContactTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void BaseFragmentActivity()>
		o = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #34  <String "">
	//    4    7:putfield        #36  <Field String o>
		t = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #34  <String "">
	//    7   13:putfield        #38  <Field String t>
		u = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #34  <String "">
	//   10   19:putfield        #40  <Field String u>
		n = false;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #42  <Field boolean n>
	//   14   27:return          
	}

	public void a(ContactInfo contactinfo)
	{
		if(!n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean n>
	//*   2    4:ifne            107
		{
			o = contactinfo.customerCarePhone;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #49  <Field String ContactInfo.customerCarePhone>
	//    6   12:putfield        #36  <Field String o>
			t = contactinfo.customerCareEmail;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #52  <Field String ContactInfo.customerCareEmail>
	//   10   20:putfield        #38  <Field String t>
			u = contactinfo.customerCareWeb;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #55  <Field String ContactInfo.customerCareWeb>
	//   14   28:putfield        #40  <Field String u>
			a(o, d, g);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #36  <Field String o>
	//   18   36:aload_0         
	//   19   37:getfield        #57  <Field View d>
	//   20   40:aload_0         
	//   21   41:getfield        #59  <Field View g>
	//   22   44:invokevirtual   #62  <Method void a(String, View, View)>
			a(t, e, h);
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #38  <Field String t>
	//   26   52:aload_0         
	//   27   53:getfield        #64  <Field View e>
	//   28   56:aload_0         
	//   29   57:getfield        #66  <Field View h>
	//   30   60:invokevirtual   #62  <Method void a(String, View, View)>
			a(u, f, i);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #40  <Field String u>
	//   34   68:aload_0         
	//   35   69:getfield        #68  <Field View f>
	//   36   72:aload_0         
	//   37   73:getfield        #70  <Field View i>
	//   38   76:invokevirtual   #62  <Method void a(String, View, View)>
			if(o != null && !TextUtils.isEmpty(((CharSequence) (o))))
	//*  39   79:aload_0         
	//*  40   80:getfield        #36  <Field String o>
	//*  41   83:ifnull          107
	//*  42   86:aload_0         
	//*  43   87:getfield        #36  <Field String o>
	//*  44   90:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  45   93:ifne            107
				a.setText(((CharSequence) (o)));
	//   46   96:aload_0         
	//   47   97:getfield        #78  <Field CustomTextView a>
	//   48  100:aload_0         
	//   49  101:getfield        #36  <Field String o>
	//   50  104:invokevirtual   #84  <Method void CustomTextView.setText(CharSequence)>
		}
	//   51  107:return          
	}

	public void a(String s, View view, View view1)
	{
		if(s != null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifne            21
		{
			view.setVisibility(0);
	//    5   11:aload_2         
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #90  <Method void View.setVisibility(int)>
			view1.setVisibility(0);
	//    8   16:aload_3         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #90  <Method void View.setVisibility(int)>
		}
	//   11   21:return          
	}

	protected void e()
	{
		a a2 = com.irobot.home.util.j.j();
	//    0    0:invokestatic    #95  <Method a j.j()>
	//    1    3:astore_2        
		a a1 = a2;
	//    2    4:aload_2         
	//    3    5:astore_1        
		if(a2 == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       18
			a1 = com.irobot.home.util.j.a(k);
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field String k>
	//    8   14:invokestatic    #100 <Method a j.a(String)>
	//    9   17:astore_1        
		if(a1 == null && (l == null || l.isEmpty()))
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       50
	//*  12   22:aload_0         
	//*  13   23:getfield        #102 <Field String l>
	//*  14   26:ifnull          39
	//*  15   29:aload_0         
	//*  16   30:getfield        #102 <Field String l>
	//*  17   33:invokevirtual   #107 <Method boolean String.isEmpty()>
	//*  18   36:ifeq            50
		{
			com.irobot.home.util.o.e("ContactTableViewAct", "init: Unable to get robot asset!");
	//   19   39:ldc1            #109 <String "ContactTableViewAct">
	//   20   41:ldc1            #111 <String "init: Unable to get robot asset!">
	//   21   43:invokestatic    #116 <Method void o.e(String, String)>
			finish();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #119 <Method void finish()>
		}
		if(l == null || l.isEmpty())
	//*  24   50:aload_0         
	//*  25   51:getfield        #102 <Field String l>
	//*  26   54:ifnull          67
	//*  27   57:aload_0         
	//*  28   58:getfield        #102 <Field String l>
	//*  29   61:invokevirtual   #107 <Method boolean String.isEmpty()>
	//*  30   64:ifeq            78
			l = a1.a().getSku();
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:invokevirtual   #124 <Method AssetInfo a.a()>
	//   34   72:invokevirtual   #130 <Method String AssetInfo.getSku()>
	//   35   75:putfield        #102 <Field String l>
		n = SkuUtils.isSkuOfType(SkuType.SanMarino, l);
	//   36   78:aload_0         
	//   37   79:getstatic       #136 <Field SkuType SkuType.SanMarino>
	//   38   82:aload_0         
	//   39   83:getfield        #102 <Field String l>
	//   40   86:invokestatic    #142 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//   41   89:putfield        #42  <Field boolean n>
		if(n)
	//*  42   92:aload_0         
	//*  43   93:getfield        #42  <Field boolean n>
	//*  44   96:ifeq            134
		{
			b(0x7f0f0230);
	//   45   99:aload_0         
	//   46  100:ldc1            #143 <Int 0x7f0f0230>
	//   47  102:invokevirtual   #145 <Method void b(int)>
			b.setText("If you have any questions about the robot or the test, contact us via email at:");
	//   48  105:aload_0         
	//   49  106:getfield        #147 <Field CustomTextView b>
	//   50  109:ldc1            #149 <String "If you have any questions about the robot or the test, contact us via email at:">
	//   51  111:invokevirtual   #84  <Method void CustomTextView.setText(CharSequence)>
			c.setVisibility(0);
	//   52  114:aload_0         
	//   53  115:getfield        #151 <Field CustomTextView c>
	//   54  118:iconst_0        
	//   55  119:invokevirtual   #152 <Method void CustomTextView.setVisibility(int)>
			j.setVisibility(8);
	//   56  122:aload_0         
	//   57  123:getfield        #154 <Field View j>
	//   58  126:bipush          8
	//   59  128:invokevirtual   #90  <Method void View.setVisibility(int)>
		} else
	//*  60  131:goto            140
		{
			b(0x7f0f0074);
	//   61  134:aload_0         
	//   62  135:ldc1            #155 <Int 0x7f0f0074>
	//   63  137:invokevirtual   #145 <Method void b(int)>
		}
		d.setVisibility(8);
	//   64  140:aload_0         
	//   65  141:getfield        #57  <Field View d>
	//   66  144:bipush          8
	//   67  146:invokevirtual   #90  <Method void View.setVisibility(int)>
		g.setVisibility(8);
	//   68  149:aload_0         
	//   69  150:getfield        #59  <Field View g>
	//   70  153:bipush          8
	//   71  155:invokevirtual   #90  <Method void View.setVisibility(int)>
		e.setVisibility(8);
	//   72  158:aload_0         
	//   73  159:getfield        #64  <Field View e>
	//   74  162:bipush          8
	//   75  164:invokevirtual   #90  <Method void View.setVisibility(int)>
		h.setVisibility(8);
	//   76  167:aload_0         
	//   77  168:getfield        #66  <Field View h>
	//   78  171:bipush          8
	//   79  173:invokevirtual   #90  <Method void View.setVisibility(int)>
		f.setVisibility(8);
	//   80  176:aload_0         
	//   81  177:getfield        #68  <Field View f>
	//   82  180:bipush          8
	//   83  182:invokevirtual   #90  <Method void View.setVisibility(int)>
		i.setVisibility(8);
	//   84  185:aload_0         
	//   85  186:getfield        #70  <Field View i>
	//   86  189:bipush          8
	//   87  191:invokevirtual   #90  <Method void View.setVisibility(int)>
		m = com.irobot.home.util.j.i(((Context) (this)));
	//   88  194:aload_0         
	//   89  195:aload_0         
	//   90  196:invokestatic    #158 <Method CustomerCareRestClient j.i(Context)>
	//   91  199:putfield        #160 <Field CustomerCareRestClient m>
		j();
	//   92  202:aload_0         
	//   93  203:invokevirtual   #162 <Method void j()>
		AnalyticsSubsystem.getInstance().trackView(ViewId.AdditionalHelp);
	//   94  206:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   95  209:getstatic       #174 <Field ViewId ViewId.AdditionalHelp>
	//   96  212:invokevirtual   #178 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//   97  215:return          
	}

	public void f()
	{
		(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f04d4).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #180 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #183 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc1            #184 <Int 0x7f0f04d4>
	//    5   10:invokevirtual   #188 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   13:ldc1            #189 <Int 0x7f0f05bb>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #193 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//    9   19:invokevirtual   #197 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   10   22:pop             
	//   11   23:return          
	}

	protected void g()
	{
		if(!Patterns.PHONE.matcher(((CharSequence) (o))).matches())
			break MISSING_BLOCK_LABEL_182;
	//    0    0:getstatic       #203 <Field Pattern Patterns.PHONE>
	//    1    3:aload_0         
	//    2    4:getfield        #36  <Field String o>
	//    3    7:invokevirtual   #209 <Method Matcher Pattern.matcher(CharSequence)>
	//    4   10:invokevirtual   #214 <Method boolean Matcher.matches()>
	//    5   13:ifeq            182
		if(((TelephonyManager)getSystemService("phone")).getPhoneType() != 0) goto _L2; else goto _L1
	//    6   16:aload_0         
	//    7   17:ldc1            #216 <String "phone">
	//    8   19:invokevirtual   #220 <Method Object getSystemService(String)>
	//    9   22:checkcast       #222 <Class TelephonyManager>
	//   10   25:invokevirtual   #226 <Method int TelephonyManager.getPhoneType()>
	//   11   28:ifne            38
_L1:
		f();
	//   12   31:aload_0         
	//   13   32:invokevirtual   #228 <Method void f()>
		break MISSING_BLOCK_LABEL_182;
	//   14   35:goto            182
_L2:
		Intent intent;
		Object obj = ((Object) (new StringBuilder()));
	//   15   38:new             #230 <Class StringBuilder>
	//   16   41:dup             
	//   17   42:invokespecial   #231 <Method void StringBuilder()>
	//   18   45:astore_1        
		((StringBuilder) (obj)).append("tel:");
	//   19   46:aload_1         
	//   20   47:ldc1            #233 <String "tel:">
	//   21   49:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:pop             
		((StringBuilder) (obj)).append(o);
	//   23   53:aload_1         
	//   24   54:aload_0         
	//   25   55:getfield        #36  <Field String o>
	//   26   58:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   62:aload_1         
	//   29   63:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   30   66:astore_1        
		intent = new Intent("android.intent.action.DIAL");
	//   31   67:new             #242 <Class Intent>
	//   32   70:dup             
	//   33   71:ldc1            #244 <String "android.intent.action.DIAL">
	//   34   73:invokespecial   #247 <Method void Intent(String)>
	//   35   76:astore_2        
		intent.setData(Uri.parse(((String) (obj))));
	//   36   77:aload_2         
	//   37   78:aload_1         
	//   38   79:invokestatic    #253 <Method Uri Uri.parse(String)>
	//   39   82:invokevirtual   #257 <Method Intent Intent.setData(Uri)>
	//   40   85:pop             
		if(!getApplicationContext().getPackageManager().queryIntentActivities(intent, 0).isEmpty()) goto _L3; else goto _L1
	//   41   86:aload_0         
	//   42   87:invokevirtual   #261 <Method Context getApplicationContext()>
	//   43   90:invokevirtual   #267 <Method PackageManager Context.getPackageManager()>
	//   44   93:aload_2         
	//   45   94:iconst_0        
	//   46   95:invokevirtual   #273 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   47   98:invokeinterface #276 <Method boolean List.isEmpty()>
	//   48  103:ifeq            109
	//*  49  106:goto            31
_L3:
		(new android.app.AlertDialog.Builder(((Context) (this)))).setTitle(((CharSequence) (getString(0x7f0f0074)))).setMessage(((CharSequence) (String.format("%s: %s", new Object[] {
			getString(0x7f0f0231), o
		})))).setNegativeButton(0x7f0f017d, ((android.content.DialogInterface.OnClickListener) (null))).setPositiveButton(0x7f0f0231, new android.content.DialogInterface.OnClickListener(intent) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				b.startActivity(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ContactTableViewActivity b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Intent a>
			//    4    8:invokevirtual   #30  <Method void ContactTableViewActivity.startActivity(Intent)>
			//    5   11:return          
			}

			final Intent a;
			final ContactTableViewActivity b;

			
			{
				b = ContactTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ContactTableViewActivity b>
				a = intent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Intent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
).show();
	//   50  109:new             #180 <Class android.app.AlertDialog$Builder>
	//   51  112:dup             
	//   52  113:aload_0         
	//   53  114:invokespecial   #183 <Method void android.app.AlertDialog$Builder(Context)>
	//   54  117:aload_0         
	//   55  118:ldc1            #155 <Int 0x7f0f0074>
	//   56  120:invokevirtual   #280 <Method String getString(int)>
	//   57  123:invokevirtual   #284 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   58  126:ldc2            #286 <String "%s: %s">
	//   59  129:iconst_2        
	//   60  130:anewarray       Object[]
	//   61  133:dup             
	//   62  134:iconst_0        
	//   63  135:aload_0         
	//   64  136:ldc2            #289 <Int 0x7f0f0231>
	//   65  139:invokevirtual   #280 <Method String getString(int)>
	//   66  142:aastore         
	//   67  143:dup             
	//   68  144:iconst_1        
	//   69  145:aload_0         
	//   70  146:getfield        #36  <Field String o>
	//   71  149:aastore         
	//   72  150:invokestatic    #293 <Method String String.format(String, Object[])>
	//   73  153:invokevirtual   #295 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   74  156:ldc2            #296 <Int 0x7f0f017d>
	//   75  159:aconst_null     
	//   76  160:invokevirtual   #299 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   77  163:ldc2            #289 <Int 0x7f0f0231>
	//   78  166:new             #6   <Class ContactTableViewActivity$1>
	//   79  169:dup             
	//   80  170:aload_0         
	//   81  171:aload_2         
	//   82  172:invokespecial   #302 <Method void ContactTableViewActivity$1(ContactTableViewActivity, Intent)>
	//   83  175:invokevirtual   #193 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   84  178:invokevirtual   #197 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   85  181:pop             
		AnalyticsSubsystem.getInstance().trackAdditionalHelpContactButtonPressed(ContactType.Call);
	//   86  182:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   87  185:getstatic       #308 <Field ContactType ContactType.Call>
	//   88  188:invokevirtual   #312 <Method void AnalyticsSubsystem.trackAdditionalHelpContactButtonPressed(ContactType)>
		return;
	//   89  191:return          
	}

	protected void h()
	{
		Intent intent;
		if(Patterns.EMAIL_ADDRESS.matcher(((CharSequence) (t))).matches())
	//*   0    0:getstatic       #315 <Field Pattern Patterns.EMAIL_ADDRESS>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field String t>
	//*   3    7:invokevirtual   #209 <Method Matcher Pattern.matcher(CharSequence)>
	//*   4   10:invokevirtual   #214 <Method boolean Matcher.matches()>
	//*   5   13:ifeq            91
		{
			intent = new Intent("android.intent.action.SEND");
	//    6   16:new             #242 <Class Intent>
	//    7   19:dup             
	//    8   20:ldc2            #317 <String "android.intent.action.SEND">
	//    9   23:invokespecial   #247 <Method void Intent(String)>
	//   10   26:astore_1        
			intent.setType("message/rfc822");
	//   11   27:aload_1         
	//   12   28:ldc2            #319 <String "message/rfc822">
	//   13   31:invokevirtual   #323 <Method Intent Intent.setType(String)>
	//   14   34:pop             
			intent.putExtra("android.intent.extra.EMAIL", new String[] {
				t
			});
	//   15   35:aload_1         
	//   16   36:ldc2            #325 <String "android.intent.extra.EMAIL">
	//   17   39:iconst_1        
	//   18   40:anewarray       String[]
	//   19   43:dup             
	//   20   44:iconst_0        
	//   21   45:aload_0         
	//   22   46:getfield        #38  <Field String t>
	//   23   49:aastore         
	//   24   50:invokevirtual   #329 <Method Intent Intent.putExtra(String, String[])>
	//   25   53:pop             
			intent.putExtra("android.intent.extra.SUBJECT", "Subject");
	//   26   54:aload_1         
	//   27   55:ldc2            #331 <String "android.intent.extra.SUBJECT">
	//   28   58:ldc2            #333 <String "Subject">
	//   29   61:invokevirtual   #336 <Method Intent Intent.putExtra(String, String)>
	//   30   64:pop             
			intent.putExtra("android.intent.extra.TEXT", "");
	//   31   65:aload_1         
	//   32   66:ldc2            #338 <String "android.intent.extra.TEXT">
	//   33   69:ldc1            #34  <String "">
	//   34   71:invokevirtual   #336 <Method Intent Intent.putExtra(String, String)>
	//   35   74:pop             
			intent = Intent.createChooser(intent, "Send mail...");
	//   36   75:aload_1         
	//   37   76:ldc2            #340 <String "Send mail...">
	//   38   79:invokestatic    #344 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   39   82:astore_1        
		} else
	//*  40   83:aload_0         
	//*  41   84:aload_1         
	//*  42   85:invokevirtual   #348 <Method void startActivity(Intent)>
	//*  43   88:goto            129
		{
			intent = new Intent(((Context) (this)), com/irobot/home/WebViewActivity_);
	//   44   91:new             #242 <Class Intent>
	//   45   94:dup             
	//   46   95:aload_0         
	//   47   96:ldc2            #350 <Class WebViewActivity_>
	//   48   99:invokespecial   #353 <Method void Intent(Context, Class)>
	//   49  102:astore_1        
			intent.putExtra("url", t);
	//   50  103:aload_1         
	//   51  104:ldc2            #355 <String "url">
	//   52  107:aload_0         
	//   53  108:getfield        #38  <Field String t>
	//   54  111:invokevirtual   #336 <Method Intent Intent.putExtra(String, String)>
	//   55  114:pop             
			intent.putExtra("headerTitleStringResourceId", 0x7f0f022e);
	//   56  115:aload_1         
	//   57  116:ldc2            #357 <String "headerTitleStringResourceId">
	//   58  119:ldc2            #358 <Int 0x7f0f022e>
	//   59  122:invokevirtual   #361 <Method Intent Intent.putExtra(String, int)>
	//   60  125:pop             
		}
		startActivity(intent);
	//*  61  126:goto            83
		AnalyticsSubsystem.getInstance().trackAdditionalHelpContactButtonPressed(ContactType.Email);
	//   62  129:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   63  132:getstatic       #364 <Field ContactType ContactType.Email>
	//   64  135:invokevirtual   #312 <Method void AnalyticsSubsystem.trackAdditionalHelpContactButtonPressed(ContactType)>
	//   65  138:return          
	}

	protected void i()
	{
		Intent intent = new Intent(((Context) (this)), com/irobot/home/WebViewActivity_);
	//    0    0:new             #242 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #350 <Class WebViewActivity_>
	//    4    8:invokespecial   #353 <Method void Intent(Context, Class)>
	//    5   11:astore_1        
		intent.putExtra("url", u);
	//    6   12:aload_1         
	//    7   13:ldc2            #355 <String "url">
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field String u>
	//   10   20:invokevirtual   #336 <Method Intent Intent.putExtra(String, String)>
	//   11   23:pop             
		intent.putExtra("headerTitleStringResourceId", 0x7f0f022e);
	//   12   24:aload_1         
	//   13   25:ldc2            #357 <String "headerTitleStringResourceId">
	//   14   28:ldc2            #358 <Int 0x7f0f022e>
	//   15   31:invokevirtual   #361 <Method Intent Intent.putExtra(String, int)>
	//   16   34:pop             
		startActivity(intent);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #348 <Method void startActivity(Intent)>
		AnalyticsSubsystem.getInstance().trackAdditionalHelpContactButtonPressed(ContactType.Online);
	//   20   40:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   21   43:getstatic       #367 <Field ContactType ContactType.Online>
	//   22   46:invokevirtual   #312 <Method void AnalyticsSubsystem.trackAdditionalHelpContactButtonPressed(ContactType)>
	//   23   49:return          
	}

	public void j()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #375 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
			a(m.getContactInfo(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((Context) (this))), l));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #160 <Field CustomerCareRestClient m>
	//    5    9:aload_1         
	//    6   10:invokestatic    #378 <Method String j.a(Locale)>
	//    7   13:aload_0         
	//    8   14:invokestatic    #381 <Method String j.h(Context)>
	//    9   17:aload_0         
	//   10   18:getfield        #102 <Field String l>
	//   11   21:invokeinterface #387 <Method ContactInfo CustomerCareRestClient.getContactInfo(String, String, String)>
	//   12   26:invokevirtual   #389 <Method void a(ContactInfo)>
			return;
	//   13   29:return          
		}
		catch(Exception exception)
	//*  14   30:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   31:new             #230 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #231 <Method void StringBuilder()>
	//   18   38:astore_2        
			stringbuilder.append("Error in getInfo: ");
	//   19   39:aload_2         
	//   20   40:ldc2            #391 <String "Error in getInfo: ">
	//   21   43:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			stringbuilder.append(exception.getMessage());
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #394 <Method String Exception.getMessage()>
	//   26   52:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			com.irobot.home.util.o.e("ContactTableViewAct", stringbuilder.toString());
	//   28   56:ldc1            #109 <String "ContactTableViewAct">
	//   29   58:aload_2         
	//   30   59:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #116 <Method void o.e(String, String)>
			return;
	//   32   65:return          
		}
	}

	protected CustomTextView a;
	protected CustomTextView b;
	protected CustomTextView c;
	View d;
	View e;
	View f;
	View g;
	View h;
	View i;
	View j;
	String k;
	String l;
	CustomerCareRestClient m;
	boolean n;
	private String o;
	private String t;
	private String u;
}
