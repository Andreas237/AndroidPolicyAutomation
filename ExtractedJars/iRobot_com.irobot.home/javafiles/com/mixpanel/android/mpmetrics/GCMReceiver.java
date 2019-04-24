// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.app.*;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import com.mixpanel.android.a.f;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			h, j, o

public class GCMReceiver extends BroadcastReceiver
{
	protected static class a
	{

		public final int a;
		public final int b;
		public final int c;
		public final CharSequence d;
		public final String e;
		public final Intent f;
		public final int g;

		private a(int i, int k, int l, CharSequence charsequence, String s, Intent intent, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			a = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #24  <Field int a>
			b = k;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int b>
			c = l;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field int c>
			d = charsequence;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field CharSequence d>
			e = s;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field String e>
			f = intent;
		//   17   31:aload_0         
		//   18   32:aload           6
		//   19   34:putfield        #34  <Field Intent f>
			g = i1;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #36  <Field int g>
		//   23   43:return          
		}

	}


	public GCMReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private Intent a(Context context, String s, String s1, String s2, String s3)
	{
		if(s != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			s = ((String) (Uri.parse(s)));
	//    2    4:aload_2         
	//    3    5:invokestatic    #25  <Method Uri Uri.parse(String)>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			s = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(s == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       27
			context = ((Context) (a(context)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #28  <Method Intent a(Context)>
	//   13   23:astore_1        
		else
	//*  14   24:goto            38
			context = ((Context) (new Intent("android.intent.action.VIEW", ((Uri) (s)))));
	//   15   27:new             #30  <Class Intent>
	//   16   30:dup             
	//   17   31:ldc1            #32  <String "android.intent.action.VIEW">
	//   18   33:aload_2         
	//   19   34:invokespecial   #35  <Method void Intent(String, Uri)>
	//   20   37:astore_1        
		if(s1 != null)
	//*  21   38:aload_3         
	//*  22   39:ifnull          50
			((Intent) (context)).putExtra("mp_campaign_id", s1);
	//   23   42:aload_1         
	//   24   43:ldc1            #37  <String "mp_campaign_id">
	//   25   45:aload_3         
	//   26   46:invokevirtual   #41  <Method Intent Intent.putExtra(String, String)>
	//   27   49:pop             
		if(s2 != null)
	//*  28   50:aload           4
	//*  29   52:ifnull          64
			((Intent) (context)).putExtra("mp_message_id", s2);
	//   30   55:aload_1         
	//   31   56:ldc1            #43  <String "mp_message_id">
	//   32   58:aload           4
	//   33   60:invokevirtual   #41  <Method Intent Intent.putExtra(String, String)>
	//   34   63:pop             
		if(s3 != null)
	//*  35   64:aload           5
	//*  36   66:ifnull          78
			((Intent) (context)).putExtra("mp", s3);
	//   37   69:aload_1         
	//   38   70:ldc1            #45  <String "mp">
	//   39   72:aload           5
	//   40   74:invokevirtual   #41  <Method Intent Intent.putExtra(String, String)>
	//   41   77:pop             
		return ((Intent) (context));
	//   42   78:aload_1         
	//   43   79:areturn         
	}

	private void a(Context context, Intent intent)
	{
		String s = h.a(context).x();
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method h h.a(Context)>
	//    2    4:invokevirtual   #55  <Method String h.x()>
	//    3    7:astore          4
		Object obj = ((Object) (s));
	//    4    9:aload           4
	//    5   11:astore_3        
		if(s == null)
	//*   6   12:aload           4
	//*   7   14:ifnonnull       22
			obj = ((Object) (context.getPackageName()));
	//    8   17:aload_1         
	//    9   18:invokevirtual   #60  <Method String Context.getPackageName()>
	//   10   21:astore_3        
		obj = ((Object) (new p.a(((String) (obj)), context)));
	//   11   22:new             #62  <Class p$a>
	//   12   25:dup             
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokespecial   #65  <Method void p$a(String, Context)>
	//   16   31:astore_3        
		intent = ((Intent) (b(context.getApplicationContext(), intent, ((o) (obj)))));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #69  <Method Context Context.getApplicationContext()>
	//   20   37:aload_2         
	//   21   38:aload_3         
	//   22   39:invokespecial   #73  <Method Notification b(Context, Intent, o)>
	//   23   42:astore_2        
		if(intent != null)
	//*  24   43:aload_2         
	//*  25   44:ifnull          61
			((NotificationManager)context.getSystemService("notification")).notify(0, ((Notification) (intent)));
	//   26   47:aload_1         
	//   27   48:ldc1            #75  <String "notification">
	//   28   50:invokevirtual   #79  <Method Object Context.getSystemService(String)>
	//   29   53:checkcast       #81  <Class NotificationManager>
	//   30   56:iconst_0        
	//   31   57:aload_2         
	//   32   58:invokevirtual   #85  <Method void NotificationManager.notify(int, Notification)>
	//   33   61:return          
	}

	private void a(Intent intent)
	{
		Object obj = ((Object) (intent.getStringExtra("registration_id")));
	//    0    0:aload_1         
	//    1    1:ldc1            #88  <String "registration_id">
	//    2    3:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_2        
		if(intent.getStringExtra("error") != null)
	//*   4    7:aload_1         
	//*   5    8:ldc1            #94  <String "error">
	//*   6   10:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//*   7   13:ifnull          52
		{
			obj = ((Object) (new StringBuilder()));
	//    8   16:new             #96  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #97  <Method void StringBuilder()>
	//   11   23:astore_2        
			((StringBuilder) (obj)).append("Error when registering for GCM: ");
	//   12   24:aload_2         
	//   13   25:ldc1            #99  <String "Error when registering for GCM: ">
	//   14   27:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (obj)).append(intent.getStringExtra("error"));
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:ldc1            #94  <String "error">
	//   19   35:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   20   38:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			f.e("MixpanelAPI.GCMReceiver", ((StringBuilder) (obj)).toString());
	//   22   42:ldc1            #105 <String "MixpanelAPI.GCMReceiver">
	//   23   44:aload_2         
	//   24   45:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   25   48:invokestatic    #114 <Method void f.e(String, String)>
			return;
	//   26   51:return          
		}
		if(obj != null)
	//*  27   52:aload_2         
	//*  28   53:ifnull          101
		{
			intent = ((Intent) (new StringBuilder()));
	//   29   56:new             #96  <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #97  <Method void StringBuilder()>
	//   32   63:astore_1        
			((StringBuilder) (intent)).append("Registering GCM ID: ");
	//   33   64:aload_1         
	//   34   65:ldc1            #116 <String "Registering GCM ID: ">
	//   35   67:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			((StringBuilder) (intent)).append(((String) (obj)));
	//   37   71:aload_1         
	//   38   72:aload_2         
	//   39   73:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			f.b("MixpanelAPI.GCMReceiver", ((StringBuilder) (intent)).toString());
	//   41   77:ldc1            #105 <String "MixpanelAPI.GCMReceiver">
	//   42   79:aload_1         
	//   43   80:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   44   83:invokestatic    #118 <Method void f.b(String, String)>
			intent = ((Intent) (new j.a(((String) (obj))) {

				public void a(j j1)
				{
					j1.c().c(a);
				//    0    0:aload_1         
				//    1    1:invokevirtual   #31  <Method j$c j.c()>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field String a>
				//    4    8:invokeinterface #36  <Method void j$c.c(String)>
				//    5   13:return          
				}

				final String a;
				final GCMReceiver b;

			
			{
				b = GCMReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GCMReceiver b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   45   86:new             #6   <Class GCMReceiver$1>
	//   46   89:dup             
	//   47   90:aload_0         
	//   48   91:aload_2         
	//   49   92:invokespecial   #121 <Method void GCMReceiver$1(GCMReceiver, String)>
	//   50   95:astore_1        
		} else
	//*  51   96:aload_1         
	//*  52   97:invokestatic    #126 <Method void j.a(j$a)>
	//*  53  100:return          
		if(intent.getStringExtra("unregistered") != null)
	//*  54  101:aload_1         
	//*  55  102:ldc1            #128 <String "unregistered">
	//*  56  104:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//*  57  107:ifnull          129
		{
			f.b("MixpanelAPI.GCMReceiver", "Unregistering from GCM");
	//   58  110:ldc1            #105 <String "MixpanelAPI.GCMReceiver">
	//   59  112:ldc1            #130 <String "Unregistering from GCM">
	//   60  114:invokestatic    #118 <Method void f.b(String, String)>
			intent = ((Intent) (new j.a() {

				public void a(j j1)
				{
					j1.c().b();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #27  <Method j$c j.c()>
				//    2    4:invokeinterface #32  <Method void j$c.b()>
				//    3    9:return          
				}

				final GCMReceiver a;

			
			{
				a = GCMReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field GCMReceiver a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   61  117:new             #8   <Class GCMReceiver$2>
	//   62  120:dup             
	//   63  121:aload_0         
	//   64  122:invokespecial   #133 <Method void GCMReceiver$2(GCMReceiver)>
	//   65  125:astore_1        
		} else
	//*  66  126:goto            96
		{
			return;
	//   67  129:return          
		}
		j.a(((j.a) (intent)));
	}

	private void a(String s, String s1, String s2)
	{
		if(s != null && s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_2         
	//*   3    5:ifnull          22
			j.a(new j.a(s2, s, s1) {

				public void a(j j1)
				{
					if(!j1.f())
						break MISSING_BLOCK_LABEL_86;
				//    0    0:aload_1         
				//    1    1:invokevirtual   #39  <Method boolean com.mixpanel.android.mpmetrics.j.f()>
				//    2    4:ifeq            86
					JSONObject jsonobject1 = new JSONObject();
				//    3    7:new             #41  <Class JSONObject>
				//    4   10:dup             
				//    5   11:invokespecial   #42  <Method void JSONObject()>
				//    6   14:astore_3        
					JSONObject jsonobject = jsonobject1;
				//    7   15:aload_3         
				//    8   16:astore_2        
					try
					{
						if(a != null)
				//*   9   17:aload_0         
				//*  10   18:getfield        #22  <Field String a>
				//*  11   21:ifnull          36
							jsonobject = new JSONObject(a);
				//   12   24:new             #41  <Class JSONObject>
				//   13   27:dup             
				//   14   28:aload_0         
				//   15   29:getfield        #22  <Field String a>
				//   16   32:invokespecial   #45  <Method void JSONObject(String)>
				//   17   35:astore_2        
					}
				//*  18   36:aload_2         
				//*  19   37:ldc1            #47  <String "campaign_id">
				//*  20   39:aload_0         
				//*  21   40:getfield        #24  <Field String b>
				//*  22   43:invokestatic    #53  <Method Integer Integer.valueOf(String)>
				//*  23   46:invokevirtual   #57  <Method int Integer.intValue()>
				//*  24   49:invokevirtual   #61  <Method JSONObject JSONObject.put(String, int)>
				//*  25   52:pop             
				//*  26   53:aload_2         
				//*  27   54:ldc1            #63  <String "message_id">
				//*  28   56:aload_0         
				//*  29   57:getfield        #26  <Field String c>
				//*  30   60:invokestatic    #53  <Method Integer Integer.valueOf(String)>
				//*  31   63:invokevirtual   #57  <Method int Integer.intValue()>
				//*  32   66:invokevirtual   #61  <Method JSONObject JSONObject.put(String, int)>
				//*  33   69:pop             
				//*  34   70:aload_2         
				//*  35   71:ldc1            #65  <String "message_type">
				//*  36   73:ldc1            #67  <String "push">
				//*  37   75:invokevirtual   #70  <Method JSONObject JSONObject.put(String, Object)>
				//*  38   78:pop             
				//*  39   79:aload_1         
				//*  40   80:ldc1            #72  <String "$campaign_received">
				//*  41   82:aload_2         
				//*  42   83:invokevirtual   #75  <Method void j.a(String, JSONObject)>
				//*  43   86:return          
					catch(JSONException jsonexception)
				//*  44   87:astore_2        
					{
						jsonexception = ((JSONException) (jsonobject1));
				//   45   88:aload_3         
				//   46   89:astore_2        
					}
					jsonobject.put("campaign_id", Integer.valueOf(b).intValue());
					jsonobject.put("message_id", Integer.valueOf(c).intValue());
					jsonobject.put("message_type", "push");
					j1.a("$campaign_received", jsonobject);
					return;
				//*  47   90:goto            36
					j1;
				//   48   93:astore_1        
				//   49   94:return          
				}

				final String a;
				final String b;
				final String c;
				final GCMReceiver d;

			
			{
				d = GCMReceiver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field GCMReceiver d>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String a>
				b = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				c = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #26  <Field String c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #29  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    4    8:new             #10  <Class GCMReceiver$3>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #137 <Method void GCMReceiver$3(GCMReceiver, String, String, String)>
	//   11   19:invokestatic    #126 <Method void j.a(j$a)>
	//   12   22:return          
	}

	private Notification b(Context context, Intent intent, o o1)
	{
		intent = ((Intent) (a(context, intent, o1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #140 <Method GCMReceiver$a a(Context, Intent, o)>
	//    5    7:astore_2        
		if(intent == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		o1 = ((o) (new StringBuilder()));
	//   10   14:new             #96  <Class StringBuilder>
	//   11   17:dup             
	//   12   18:invokespecial   #97  <Method void StringBuilder()>
	//   13   21:astore_3        
		((StringBuilder) (o1)).append("MP GCM notification received: ");
	//   14   22:aload_3         
	//   15   23:ldc1            #142 <String "MP GCM notification received: ">
	//   16   25:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   17   28:pop             
		((StringBuilder) (o1)).append(((a) (intent)).e);
	//   18   29:aload_3         
	//   19   30:aload_2         
	//   20   31:getfield        #145 <Field String GCMReceiver$a.e>
	//   21   34:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   22   37:pop             
		f.b("MixpanelAPI.GCMReceiver", ((StringBuilder) (o1)).toString());
	//   23   38:ldc1            #105 <String "MixpanelAPI.GCMReceiver">
	//   24   40:aload_3         
	//   25   41:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   26   44:invokestatic    #118 <Method void f.b(String, String)>
		o1 = ((o) (PendingIntent.getActivity(context, 0, ((a) (intent)).f, 0x8000000)));
	//   27   47:aload_1         
	//   28   48:iconst_0        
	//   29   49:aload_2         
	//   30   50:getfield        #149 <Field Intent com.mixpanel.android.mpmetrics.GCMReceiver$a.f>
	//   31   53:ldc1            #150 <Int 0x8000000>
	//   32   55:invokestatic    #156 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   33   58:astore_3        
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  34   59:getstatic       #162 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   62:bipush          26
	//*  36   64:icmplt          75
			return e(context, ((PendingIntent) (o1)), ((a) (intent)));
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:aload_3         
	//   40   70:aload_2         
	//   41   71:invokevirtual   #165 <Method Notification e(Context, PendingIntent, GCMReceiver$a)>
	//   42   74:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  43   75:getstatic       #162 <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   78:bipush          21
	//*  45   80:icmplt          91
			return d(context, ((PendingIntent) (o1)), ((a) (intent)));
	//   46   83:aload_0         
	//   47   84:aload_1         
	//   48   85:aload_3         
	//   49   86:aload_2         
	//   50   87:invokevirtual   #168 <Method Notification d(Context, PendingIntent, GCMReceiver$a)>
	//   51   90:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  52   91:getstatic       #162 <Field int android.os.Build$VERSION.SDK_INT>
	//*  53   94:bipush          16
	//*  54   96:icmplt          107
			return c(context, ((PendingIntent) (o1)), ((a) (intent)));
	//   55   99:aload_0         
	//   56  100:aload_1         
	//   57  101:aload_3         
	//   58  102:aload_2         
	//   59  103:invokevirtual   #171 <Method Notification c(Context, PendingIntent, GCMReceiver$a)>
	//   60  106:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  61  107:getstatic       #162 <Field int android.os.Build$VERSION.SDK_INT>
	//*  62  110:bipush          11
	//*  63  112:icmplt          123
			return b(context, ((PendingIntent) (o1)), ((a) (intent)));
	//   64  115:aload_0         
	//   65  116:aload_1         
	//   66  117:aload_3         
	//   67  118:aload_2         
	//   68  119:invokevirtual   #173 <Method Notification b(Context, PendingIntent, GCMReceiver$a)>
	//   69  122:areturn         
		else
			return a(context, ((PendingIntent) (o1)), ((a) (intent)));
	//   70  123:aload_0         
	//   71  124:aload_1         
	//   72  125:aload_3         
	//   73  126:aload_2         
	//   74  127:invokevirtual   #175 <Method Notification a(Context, PendingIntent, GCMReceiver$a)>
	//   75  130:areturn         
	}

	protected Notification a(Context context, PendingIntent pendingintent, a a1)
	{
		pendingintent = ((PendingIntent) ((new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(a1.a).setTicker(((CharSequence) (a1.e))).setWhen(System.currentTimeMillis()).setContentTitle(a1.d).setContentText(((CharSequence) (a1.e))).setContentIntent(pendingintent).setDefaults(h.a(context).r())));
	//    0    0:new             #180 <Class android.support.v4.app.NotificationCompat$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #183 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//    4    8:aload_3         
	//    5    9:getfield        #185 <Field int GCMReceiver$a.a>
	//    6   12:invokevirtual   #189 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//    7   15:aload_3         
	//    8   16:getfield        #145 <Field String GCMReceiver$a.e>
	//    9   19:invokevirtual   #193 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//   10   22:invokestatic    #199 <Method long System.currentTimeMillis()>
	//   11   25:invokevirtual   #203 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//   12   28:aload_3         
	//   13   29:getfield        #206 <Field CharSequence GCMReceiver$a.d>
	//   14   32:invokevirtual   #209 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   15   35:aload_3         
	//   16   36:getfield        #145 <Field String GCMReceiver$a.e>
	//   17   39:invokevirtual   #212 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #216 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   20   46:aload_1         
	//   21   47:invokestatic    #51  <Method h h.a(Context)>
	//   22   50:invokevirtual   #220 <Method int h.r()>
	//   23   53:invokevirtual   #223 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setDefaults(int)>
	//   24   56:astore_2        
		if(a1.b != -1)
	//*  25   57:aload_3         
	//*  26   58:getfield        #225 <Field int GCMReceiver$a.b>
	//*  27   61:iconst_m1       
	//*  28   62:icmpeq          81
			((android.support.v4.app.NotificationCompat.Builder) (pendingintent)).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), a1.b));
	//   29   65:aload_2         
	//   30   66:aload_1         
	//   31   67:invokevirtual   #229 <Method android.content.res.Resources Context.getResources()>
	//   32   70:aload_3         
	//   33   71:getfield        #225 <Field int GCMReceiver$a.b>
	//   34   74:invokestatic    #235 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//   35   77:invokevirtual   #239 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   36   80:pop             
		context = ((Context) (((android.support.v4.app.NotificationCompat.Builder) (pendingintent)).getNotification()));
	//   37   81:aload_2         
	//   38   82:invokevirtual   #243 <Method Notification android.support.v4.app.NotificationCompat$Builder.getNotification()>
	//   39   85:astore_1        
		context.flags = ((Notification) (context)).flags | 0x10;
	//   40   86:aload_1         
	//   41   87:aload_1         
	//   42   88:getfield        #248 <Field int Notification.flags>
	//   43   91:bipush          16
	//   44   93:ior             
	//   45   94:putfield        #248 <Field int Notification.flags>
		return ((Notification) (context));
	//   46   97:aload_1         
	//   47   98:areturn         
	}

	Intent a(Context context)
	{
		return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method String Context.getPackageName()>
	//    4    8:invokevirtual   #259 <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//    5   11:areturn         
	}

	a a(Context context, Intent intent, o o1)
	{
		String s;
		String s1;
		String s2;
		String s3;
		String s4;
		String s5;
		PackageManager packagemanager;
		String s6;
		String s7;
		String s8;
		String s9;
		packagemanager = context.getPackageManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #253 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore          15
		s1 = intent.getStringExtra("mp_message");
	//    3    6:aload_2         
	//    4    7:ldc2            #265 <String "mp_message">
	//    5   10:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//    6   13:astore          10
		s6 = intent.getStringExtra("mp_icnm");
	//    7   15:aload_2         
	//    8   16:ldc2            #267 <String "mp_icnm">
	//    9   19:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   10   22:astore          16
		s7 = intent.getStringExtra("mp_icnm_l");
	//   11   24:aload_2         
	//   12   25:ldc2            #269 <String "mp_icnm_l">
	//   13   28:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   14   31:astore          17
		s8 = intent.getStringExtra("mp_icnm_w");
	//   15   33:aload_2         
	//   16   34:ldc2            #271 <String "mp_icnm_w">
	//   17   37:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   18   40:astore          18
		s2 = intent.getStringExtra("mp_cta");
	//   19   42:aload_2         
	//   20   43:ldc2            #273 <String "mp_cta">
	//   21   46:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   22   49:astore          11
		s = intent.getStringExtra("mp_title");
	//   23   51:aload_2         
	//   24   52:ldc2            #275 <String "mp_title">
	//   25   55:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   26   58:astore          9
		s9 = intent.getStringExtra("mp_color");
	//   27   60:aload_2         
	//   28   61:ldc2            #277 <String "mp_color">
	//   29   64:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   30   67:astore          19
		s3 = intent.getStringExtra("mp_campaign_id");
	//   31   69:aload_2         
	//   32   70:ldc1            #37  <String "mp_campaign_id">
	//   33   72:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   34   75:astore          12
		s4 = intent.getStringExtra("mp_message_id");
	//   35   77:aload_2         
	//   36   78:ldc1            #43  <String "mp_message_id">
	//   37   80:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   38   83:astore          13
		s5 = intent.getStringExtra("mp");
	//   39   85:aload_2         
	//   40   86:ldc1            #45  <String "mp">
	//   41   88:invokevirtual   #92  <Method String Intent.getStringExtra(String)>
	//   42   91:astore          14
		a(s3, s4, s5);
	//   43   93:aload_0         
	//   44   94:aload           12
	//   45   96:aload           13
	//   46   98:aload           14
	//   47  100:invokespecial   #279 <Method void a(String, String, String)>
		if(s9 == null) goto _L2; else goto _L1
	//   48  103:aload           19
	//   49  105:ifnull          118
_L1:
		int l = Color.parseColor(s9);
	//   50  108:aload           19
	//   51  110:invokestatic    #285 <Method int Color.parseColor(String)>
	//   52  113:istore          6
		  goto _L3
	//*  53  115:goto            121
_L2:
		l = -1;
	//   54  118:iconst_m1       
	//   55  119:istore          6
_L3:
		if(s1 == null)
	//*  56  121:aload           10
	//*  57  123:ifnonnull       128
			return null;
	//   58  126:aconst_null     
	//   59  127:areturn         
		int i;
		if(s6 != null && o1.a(s6))
	//*  60  128:aload           16
	//*  61  130:ifnull          157
	//*  62  133:aload_3         
	//*  63  134:aload           16
	//*  64  136:invokeinterface #290 <Method boolean o.a(String)>
	//*  65  141:ifeq            157
			i = o1.b(s6);
	//   66  144:aload_3         
	//   67  145:aload           16
	//   68  147:invokeinterface #292 <Method int o.b(String)>
	//   69  152:istore          4
		else
	//*  70  154:goto            160
			i = -1;
	//   71  157:iconst_m1       
	//   72  158:istore          4
		int i1;
		if(s7 != null && o1.a(s7))
	//*  73  160:aload           17
	//*  74  162:ifnull          189
	//*  75  165:aload_3         
	//*  76  166:aload           17
	//*  77  168:invokeinterface #290 <Method boolean o.a(String)>
	//*  78  173:ifeq            189
			i1 = o1.b(s7);
	//   79  176:aload_3         
	//   80  177:aload           17
	//   81  179:invokeinterface #292 <Method int o.b(String)>
	//   82  184:istore          7
		else
	//*  83  186:goto            192
			i1 = -1;
	//   84  189:iconst_m1       
	//   85  190:istore          7
		int j1;
		if(s8 != null && o1.a(s8))
	//*  86  192:aload           18
	//*  87  194:ifnull          221
	//*  88  197:aload_3         
	//*  89  198:aload           18
	//*  90  200:invokeinterface #290 <Method boolean o.a(String)>
	//*  91  205:ifeq            221
			j1 = o1.b(s8);
	//   92  208:aload_3         
	//   93  209:aload           18
	//   94  211:invokeinterface #292 <Method int o.b(String)>
	//   95  216:istore          8
		else
	//*  96  218:goto            224
			j1 = -1;
	//   97  221:iconst_m1       
	//   98  222:istore          8
		try
		{
			o1 = ((o) (packagemanager.getApplicationInfo(context.getPackageName(), 0)));
	//   99  224:aload           15
	//  100  226:aload_1         
	//  101  227:invokevirtual   #60  <Method String Context.getPackageName()>
	//  102  230:iconst_0        
	//  103  231:invokevirtual   #296 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//  104  234:astore_3        
		}
	//* 105  235:goto            240
	//* 106  238:aconst_null     
	//* 107  239:astore_3        
	//* 108  240:iload           4
	//* 109  242:istore          5
	//* 110  244:iload           4
	//* 111  246:iconst_m1       
	//* 112  247:icmpne          264
	//* 113  250:iload           4
	//* 114  252:istore          5
	//* 115  254:aload_3         
	//* 116  255:ifnull          264
	//* 117  258:aload_3         
	//* 118  259:getfield        #301 <Field int ApplicationInfo.icon>
	//* 119  262:istore          5
	//* 120  264:iload           5
	//* 121  266:iconst_m1       
	//* 122  267:icmpne          278
	//* 123  270:ldc2            #302 <Int 0x1080093>
	//* 124  273:istore          5
	//* 125  275:goto            278
	//* 126  278:aload           9
	//* 127  280:astore_2        
	//* 128  281:aload           9
	//* 129  283:ifnonnull       300
	//* 130  286:aload           9
	//* 131  288:astore_2        
	//* 132  289:aload_3         
	//* 133  290:ifnull          300
	//* 134  293:aload           15
	//* 135  295:aload_3         
	//* 136  296:invokevirtual   #306 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//* 137  299:astore_2        
	//* 138  300:aload_2         
	//* 139  301:ifnonnull       311
	//* 140  304:ldc2            #308 <String "A message for you">
	//* 141  307:astore_2        
	//* 142  308:goto            311
	//* 143  311:new             #12  <Class GCMReceiver$a>
	//* 144  314:dup             
	//* 145  315:iload           5
	//* 146  317:iload           7
	//* 147  319:iload           8
	//* 148  321:aload_2         
	//* 149  322:aload           10
	//* 150  324:aload_0         
	//* 151  325:aload_1         
	//* 152  326:aload           11
	//* 153  328:aload           12
	//* 154  330:aload           13
	//* 155  332:aload           14
	//* 156  334:invokespecial   #310 <Method Intent a(Context, String, String, String, String)>
	//* 157  337:iload           6
	//* 158  339:aconst_null     
	//* 159  340:invokespecial   #313 <Method void GCMReceiver$a(int, int, int, CharSequence, String, Intent, int, GCMReceiver$1)>
	//* 160  343:areturn         
	//* 161  344:astore_2        
	//* 162  345:goto            118
		// Misplaced declaration of an exception variable
		catch(Intent intent)
		{
			o1 = null;
		}
		int k = i;
		if(i == -1)
		{
			k = i;
			if(o1 != null)
				k = ((ApplicationInfo) (o1)).icon;
		}
		if(k == -1)
			k = 0x1080093;
		intent = ((Intent) (s));
		if(s == null)
		{
			intent = ((Intent) (s));
			if(o1 != null)
				intent = ((Intent) (packagemanager.getApplicationLabel(((ApplicationInfo) (o1)))));
		}
		if(intent == null)
			intent = "A message for you";
		return new a(k, i1, j1, ((CharSequence) (intent)), s1, a(context, s2, s3, s4, s5), l);
		intent;
		if(true) goto _L2; else goto _L4
_L4:
	//* 163  348:astore_2        
	//* 164  349:goto            238
	}

	protected Notification b(Context context, PendingIntent pendingintent, a a1)
	{
		pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setSmallIcon(a1.a).setTicker(((CharSequence) (a1.e))).setWhen(System.currentTimeMillis()).setContentTitle(a1.d).setContentText(((CharSequence) (a1.e))).setContentIntent(pendingintent).setDefaults(h.a(context).r())));
	//    0    0:new             #316 <Class android.app.Notification$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #317 <Method void android.app.Notification$Builder(Context)>
	//    4    8:aload_3         
	//    5    9:getfield        #185 <Field int GCMReceiver$a.a>
	//    6   12:invokevirtual   #320 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//    7   15:aload_3         
	//    8   16:getfield        #145 <Field String GCMReceiver$a.e>
	//    9   19:invokevirtual   #323 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence)>
	//   10   22:invokestatic    #199 <Method long System.currentTimeMillis()>
	//   11   25:invokevirtual   #326 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   12   28:aload_3         
	//   13   29:getfield        #206 <Field CharSequence GCMReceiver$a.d>
	//   14   32:invokevirtual   #328 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   15   35:aload_3         
	//   16   36:getfield        #145 <Field String GCMReceiver$a.e>
	//   17   39:invokevirtual   #330 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #333 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   20   46:aload_1         
	//   21   47:invokestatic    #51  <Method h h.a(Context)>
	//   22   50:invokevirtual   #220 <Method int h.r()>
	//   23   53:invokevirtual   #335 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   24   56:astore_2        
		if(a1.b != -1)
	//*  25   57:aload_3         
	//*  26   58:getfield        #225 <Field int GCMReceiver$a.b>
	//*  27   61:iconst_m1       
	//*  28   62:icmpeq          81
			((android.app.Notification.Builder) (pendingintent)).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), a1.b));
	//   29   65:aload_2         
	//   30   66:aload_1         
	//   31   67:invokevirtual   #229 <Method android.content.res.Resources Context.getResources()>
	//   32   70:aload_3         
	//   33   71:getfield        #225 <Field int GCMReceiver$a.b>
	//   34   74:invokestatic    #235 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//   35   77:invokevirtual   #338 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   36   80:pop             
		context = ((Context) (((android.app.Notification.Builder) (pendingintent)).getNotification()));
	//   37   81:aload_2         
	//   38   82:invokevirtual   #339 <Method Notification android.app.Notification$Builder.getNotification()>
	//   39   85:astore_1        
		context.flags = ((Notification) (context)).flags | 0x10;
	//   40   86:aload_1         
	//   41   87:aload_1         
	//   42   88:getfield        #248 <Field int Notification.flags>
	//   43   91:bipush          16
	//   44   93:ior             
	//   45   94:putfield        #248 <Field int Notification.flags>
		return ((Notification) (context));
	//   46   97:aload_1         
	//   47   98:areturn         
	}

	protected Notification c(Context context, PendingIntent pendingintent, a a1)
	{
		pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setSmallIcon(a1.a).setTicker(((CharSequence) (a1.e))).setWhen(System.currentTimeMillis()).setContentTitle(a1.d).setContentText(((CharSequence) (a1.e))).setContentIntent(pendingintent).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (a1.e)))))).setDefaults(h.a(context).r())));
	//    0    0:new             #316 <Class android.app.Notification$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #317 <Method void android.app.Notification$Builder(Context)>
	//    4    8:aload_3         
	//    5    9:getfield        #185 <Field int GCMReceiver$a.a>
	//    6   12:invokevirtual   #320 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//    7   15:aload_3         
	//    8   16:getfield        #145 <Field String GCMReceiver$a.e>
	//    9   19:invokevirtual   #323 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence)>
	//   10   22:invokestatic    #199 <Method long System.currentTimeMillis()>
	//   11   25:invokevirtual   #326 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   12   28:aload_3         
	//   13   29:getfield        #206 <Field CharSequence GCMReceiver$a.d>
	//   14   32:invokevirtual   #328 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   15   35:aload_3         
	//   16   36:getfield        #145 <Field String GCMReceiver$a.e>
	//   17   39:invokevirtual   #330 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #333 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   20   46:new             #344 <Class android.app.Notification$BigTextStyle>
	//   21   49:dup             
	//   22   50:invokespecial   #345 <Method void android.app.Notification$BigTextStyle()>
	//   23   53:aload_3         
	//   24   54:getfield        #145 <Field String GCMReceiver$a.e>
	//   25   57:invokevirtual   #349 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   26   60:invokevirtual   #353 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   27   63:aload_1         
	//   28   64:invokestatic    #51  <Method h h.a(Context)>
	//   29   67:invokevirtual   #220 <Method int h.r()>
	//   30   70:invokevirtual   #335 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   31   73:astore_2        
		if(a1.b != -1)
	//*  32   74:aload_3         
	//*  33   75:getfield        #225 <Field int GCMReceiver$a.b>
	//*  34   78:iconst_m1       
	//*  35   79:icmpeq          98
			((android.app.Notification.Builder) (pendingintent)).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), a1.b));
	//   36   82:aload_2         
	//   37   83:aload_1         
	//   38   84:invokevirtual   #229 <Method android.content.res.Resources Context.getResources()>
	//   39   87:aload_3         
	//   40   88:getfield        #225 <Field int GCMReceiver$a.b>
	//   41   91:invokestatic    #235 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//   42   94:invokevirtual   #338 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   43   97:pop             
		context = ((Context) (((android.app.Notification.Builder) (pendingintent)).build()));
	//   44   98:aload_2         
	//   45   99:invokevirtual   #356 <Method Notification android.app.Notification$Builder.build()>
	//   46  102:astore_1        
		context.flags = ((Notification) (context)).flags | 0x10;
	//   47  103:aload_1         
	//   48  104:aload_1         
	//   49  105:getfield        #248 <Field int Notification.flags>
	//   50  108:bipush          16
	//   51  110:ior             
	//   52  111:putfield        #248 <Field int Notification.flags>
		return ((Notification) (context));
	//   53  114:aload_1         
	//   54  115:areturn         
	}

	protected Notification d(Context context, PendingIntent pendingintent, a a1)
	{
		pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setTicker(((CharSequence) (a1.e))).setWhen(System.currentTimeMillis()).setContentTitle(a1.d).setContentText(((CharSequence) (a1.e))).setContentIntent(pendingintent).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (a1.e)))))).setDefaults(h.a(context).r())));
	//    0    0:new             #316 <Class android.app.Notification$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #317 <Method void android.app.Notification$Builder(Context)>
	//    4    8:aload_3         
	//    5    9:getfield        #145 <Field String GCMReceiver$a.e>
	//    6   12:invokevirtual   #323 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence)>
	//    7   15:invokestatic    #199 <Method long System.currentTimeMillis()>
	//    8   18:invokevirtual   #326 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   21:aload_3         
	//   10   22:getfield        #206 <Field CharSequence GCMReceiver$a.d>
	//   11   25:invokevirtual   #328 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   12   28:aload_3         
	//   13   29:getfield        #145 <Field String GCMReceiver$a.e>
	//   14   32:invokevirtual   #330 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   15   35:aload_2         
	//   16   36:invokevirtual   #333 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   17   39:new             #344 <Class android.app.Notification$BigTextStyle>
	//   18   42:dup             
	//   19   43:invokespecial   #345 <Method void android.app.Notification$BigTextStyle()>
	//   20   46:aload_3         
	//   21   47:getfield        #145 <Field String GCMReceiver$a.e>
	//   22   50:invokevirtual   #349 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   23   53:invokevirtual   #353 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   24   56:aload_1         
	//   25   57:invokestatic    #51  <Method h h.a(Context)>
	//   26   60:invokevirtual   #220 <Method int h.r()>
	//   27   63:invokevirtual   #335 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   28   66:astore_2        
		int i;
		if(a1.c != -1)
	//*  29   67:aload_3         
	//*  30   68:getfield        #359 <Field int GCMReceiver$a.c>
	//*  31   71:iconst_m1       
	//*  32   72:icmpeq          91
			i = a1.c;
	//   33   75:aload_3         
	//   34   76:getfield        #359 <Field int GCMReceiver$a.c>
	//   35   79:istore          4
		else
	//*  36   81:aload_2         
	//*  37   82:iload           4
	//*  38   84:invokevirtual   #320 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//*  39   87:pop             
	//*  40   88:goto            100
			i = a1.a;
	//   41   91:aload_3         
	//   42   92:getfield        #185 <Field int GCMReceiver$a.a>
	//   43   95:istore          4
		((android.app.Notification.Builder) (pendingintent)).setSmallIcon(i);
	//*  44   97:goto            81
		if(a1.b != -1)
	//*  45  100:aload_3         
	//*  46  101:getfield        #225 <Field int GCMReceiver$a.b>
	//*  47  104:iconst_m1       
	//*  48  105:icmpeq          124
			((android.app.Notification.Builder) (pendingintent)).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), a1.b));
	//   49  108:aload_2         
	//   50  109:aload_1         
	//   51  110:invokevirtual   #229 <Method android.content.res.Resources Context.getResources()>
	//   52  113:aload_3         
	//   53  114:getfield        #225 <Field int GCMReceiver$a.b>
	//   54  117:invokestatic    #235 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//   55  120:invokevirtual   #338 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//   56  123:pop             
		if(a1.g != -1)
	//*  57  124:aload_3         
	//*  58  125:getfield        #362 <Field int GCMReceiver$a.g>
	//*  59  128:iconst_m1       
	//*  60  129:icmpeq          141
			((android.app.Notification.Builder) (pendingintent)).setColor(a1.g);
	//   61  132:aload_2         
	//   62  133:aload_3         
	//   63  134:getfield        #362 <Field int GCMReceiver$a.g>
	//   64  137:invokevirtual   #365 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//   65  140:pop             
		context = ((Context) (((android.app.Notification.Builder) (pendingintent)).build()));
	//   66  141:aload_2         
	//   67  142:invokevirtual   #356 <Method Notification android.app.Notification$Builder.build()>
	//   68  145:astore_1        
		context.flags = ((Notification) (context)).flags | 0x10;
	//   69  146:aload_1         
	//   70  147:aload_1         
	//   71  148:getfield        #248 <Field int Notification.flags>
	//   72  151:bipush          16
	//   73  153:ior             
	//   74  154:putfield        #248 <Field int Notification.flags>
		return ((Notification) (context));
	//   75  157:aload_1         
	//   76  158:areturn         
	}

	protected Notification e(Context context, PendingIntent pendingintent, a a1)
	{
		NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
	//    0    0:aload_1         
	//    1    1:ldc1            #75  <String "notification">
	//    2    3:invokevirtual   #79  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #81  <Class NotificationManager>
	//    4    9:astore          5
		String s = h.a(context).u();
	//    5   11:aload_1         
	//    6   12:invokestatic    #51  <Method h h.a(Context)>
	//    7   15:invokevirtual   #369 <Method String h.u()>
	//    8   18:astore          6
		NotificationChannel notificationchannel = new NotificationChannel(s, ((CharSequence) (h.a(context).v())), h.a(context).w());
	//    9   20:new             #371 <Class NotificationChannel>
	//   10   23:dup             
	//   11   24:aload           6
	//   12   26:aload_1         
	//   13   27:invokestatic    #51  <Method h h.a(Context)>
	//   14   30:invokevirtual   #374 <Method String h.v()>
	//   15   33:aload_1         
	//   16   34:invokestatic    #51  <Method h h.a(Context)>
	//   17   37:invokevirtual   #377 <Method int h.w()>
	//   18   40:invokespecial   #380 <Method void NotificationChannel(String, CharSequence, int)>
	//   19   43:astore          7
		int i = h.a(context).r();
	//   20   45:aload_1         
	//   21   46:invokestatic    #51  <Method h h.a(Context)>
	//   22   49:invokevirtual   #220 <Method int h.r()>
	//   23   52:istore          4
		if(i == 2 || i == -1)
	//*  24   54:iload           4
	//*  25   56:iconst_2        
	//*  26   57:icmpeq          66
	//*  27   60:iload           4
	//*  28   62:iconst_m1       
	//*  29   63:icmpne          72
			notificationchannel.enableVibration(true);
	//   30   66:aload           7
	//   31   68:iconst_1        
	//   32   69:invokevirtual   #384 <Method void NotificationChannel.enableVibration(boolean)>
		if(i == 4 || i == -1)
	//*  33   72:iload           4
	//*  34   74:iconst_4        
	//*  35   75:icmpeq          84
	//*  36   78:iload           4
	//*  37   80:iconst_m1       
	//*  38   81:icmpne          96
		{
			notificationchannel.enableLights(true);
	//   39   84:aload           7
	//   40   86:iconst_1        
	//   41   87:invokevirtual   #387 <Method void NotificationChannel.enableLights(boolean)>
			notificationchannel.setLightColor(-1);
	//   42   90:aload           7
	//   43   92:iconst_m1       
	//   44   93:invokevirtual   #391 <Method void NotificationChannel.setLightColor(int)>
		}
		notificationmanager.createNotificationChannel(notificationchannel);
	//   45   96:aload           5
	//   46   98:aload           7
	//   47  100:invokevirtual   #395 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
		pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setTicker(((CharSequence) (a1.e))).setWhen(System.currentTimeMillis()).setContentTitle(a1.d).setContentText(((CharSequence) (a1.e))).setContentIntent(pendingintent).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (a1.e)))))).setChannelId(s)));
	//   48  103:new             #316 <Class android.app.Notification$Builder>
	//   49  106:dup             
	//   50  107:aload_1         
	//   51  108:invokespecial   #317 <Method void android.app.Notification$Builder(Context)>
	//   52  111:aload_3         
	//   53  112:getfield        #145 <Field String GCMReceiver$a.e>
	//   54  115:invokevirtual   #323 <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence)>
	//   55  118:invokestatic    #199 <Method long System.currentTimeMillis()>
	//   56  121:invokevirtual   #326 <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   57  124:aload_3         
	//   58  125:getfield        #206 <Field CharSequence GCMReceiver$a.d>
	//   59  128:invokevirtual   #328 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   60  131:aload_3         
	//   61  132:getfield        #145 <Field String GCMReceiver$a.e>
	//   62  135:invokevirtual   #330 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   63  138:aload_2         
	//   64  139:invokevirtual   #333 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   65  142:new             #344 <Class android.app.Notification$BigTextStyle>
	//   66  145:dup             
	//   67  146:invokespecial   #345 <Method void android.app.Notification$BigTextStyle()>
	//   68  149:aload_3         
	//   69  150:getfield        #145 <Field String GCMReceiver$a.e>
	//   70  153:invokevirtual   #349 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   71  156:invokevirtual   #353 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   72  159:aload           6
	//   73  161:invokevirtual   #399 <Method android.app.Notification$Builder android.app.Notification$Builder.setChannelId(String)>
	//   74  164:astore_2        
		if(a1.c != -1)
	//*  75  165:aload_3         
	//*  76  166:getfield        #359 <Field int GCMReceiver$a.c>
	//*  77  169:iconst_m1       
	//*  78  170:icmpeq          189
			i = a1.c;
	//   79  173:aload_3         
	//   80  174:getfield        #359 <Field int GCMReceiver$a.c>
	//   81  177:istore          4
		else
	//*  82  179:aload_2         
	//*  83  180:iload           4
	//*  84  182:invokevirtual   #320 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//*  85  185:pop             
	//*  86  186:goto            198
			i = a1.a;
	//   87  189:aload_3         
	//   88  190:getfield        #185 <Field int GCMReceiver$a.a>
	//   89  193:istore          4
		((android.app.Notification.Builder) (pendingintent)).setSmallIcon(i);
	//*  90  195:goto            179
		if(a1.b != -1)
	//*  91  198:aload_3         
	//*  92  199:getfield        #225 <Field int GCMReceiver$a.b>
	//*  93  202:iconst_m1       
	//*  94  203:icmpeq          222
			((android.app.Notification.Builder) (pendingintent)).setLargeIcon(BitmapFactory.decodeResource(context.getResources(), a1.b));
	//   95  206:aload_2         
	//   96  207:aload_1         
	//   97  208:invokevirtual   #229 <Method android.content.res.Resources Context.getResources()>
	//   98  211:aload_3         
	//   99  212:getfield        #225 <Field int GCMReceiver$a.b>
	//  100  215:invokestatic    #235 <Method android.graphics.Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
	//  101  218:invokevirtual   #338 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(android.graphics.Bitmap)>
	//  102  221:pop             
		if(a1.g != -1)
	//* 103  222:aload_3         
	//* 104  223:getfield        #362 <Field int GCMReceiver$a.g>
	//* 105  226:iconst_m1       
	//* 106  227:icmpeq          239
			((android.app.Notification.Builder) (pendingintent)).setColor(a1.g);
	//  107  230:aload_2         
	//  108  231:aload_3         
	//  109  232:getfield        #362 <Field int GCMReceiver$a.g>
	//  110  235:invokevirtual   #365 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  111  238:pop             
		context = ((Context) (((android.app.Notification.Builder) (pendingintent)).build()));
	//  112  239:aload_2         
	//  113  240:invokevirtual   #356 <Method Notification android.app.Notification$Builder.build()>
	//  114  243:astore_1        
		context.flags = ((Notification) (context)).flags | 0x10;
	//  115  244:aload_1         
	//  116  245:aload_1         
	//  117  246:getfield        #248 <Field int Notification.flags>
	//  118  249:bipush          16
	//  119  251:ior             
	//  120  252:putfield        #248 <Field int Notification.flags>
		return ((Notification) (context));
	//  121  255:aload_1         
	//  122  256:areturn         
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = intent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #403 <Method String Intent.getAction()>
	//    2    4:astore_3        
		if("com.google.android.c2dm.intent.REGISTRATION".equals(((Object) (s))))
	//*   3    5:ldc2            #405 <String "com.google.android.c2dm.intent.REGISTRATION">
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #411 <Method boolean String.equals(Object)>
	//*   6   12:ifeq            21
		{
			a(intent);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokespecial   #413 <Method void a(Intent)>
			return;
	//   10   20:return          
		}
		if("com.google.android.c2dm.intent.RECEIVE".equals(((Object) (s))))
	//*  11   21:ldc2            #415 <String "com.google.android.c2dm.intent.RECEIVE">
	//*  12   24:aload_3         
	//*  13   25:invokevirtual   #411 <Method boolean String.equals(Object)>
	//*  14   28:ifeq            37
			a(context, intent);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #417 <Method void a(Context, Intent)>
	//   19   37:return          
	}
}
