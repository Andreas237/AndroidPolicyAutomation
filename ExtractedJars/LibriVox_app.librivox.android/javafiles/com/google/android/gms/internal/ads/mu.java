// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.aw;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ni, afn, xg, bzl, 
//			wi, mv, mw

public final class mu extends ni
{

	public mu(afn afn1, Map map)
	{
		super(afn1, "createCalendarEvent");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #20  <String "createCalendarEvent">
	//    3    4:invokespecial   #23  <Method void ni(afn, String)>
		a = map;
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:putfield        #25  <Field Map a>
		b = ((Context) (afn1.d()));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokeinterface #30  <Method android.app.Activity afn.d()>
	//   10   19:putfield        #32  <Field Context b>
		c = d("description");
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:ldc1            #34  <String "description">
	//   14   26:invokespecial   #37  <Method String d(String)>
	//   15   29:putfield        #39  <Field String c>
		f = d("summary");
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:ldc1            #41  <String "summary">
	//   19   36:invokespecial   #37  <Method String d(String)>
	//   20   39:putfield        #43  <Field String f>
		d = e("start_ticks");
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:ldc1            #45  <String "start_ticks">
	//   24   46:invokespecial   #48  <Method long e(String)>
	//   25   49:putfield        #50  <Field long d>
		e = e("end_ticks");
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:ldc1            #52  <String "end_ticks">
	//   29   56:invokespecial   #48  <Method long e(String)>
	//   30   59:putfield        #54  <Field long e>
		g = d("location");
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:ldc1            #56  <String "location">
	//   34   66:invokespecial   #37  <Method String d(String)>
	//   35   69:putfield        #58  <Field String g>
	//   36   72:return          
	}

	static Context a(mu mu1)
	{
		return mu1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Context b>
	//    2    4:areturn         
	}

	private final String d(String s)
	{
		if(TextUtils.isEmpty((CharSequence)a.get(((Object) (s)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Map a>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #66  <Method Object Map.get(Object)>
	//*   4   10:checkcast       #68  <Class CharSequence>
	//*   5   13:invokestatic    #74  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   16:ifeq            22
			return "";
	//    7   19:ldc1            #76  <String "">
	//    8   21:areturn         
		else
			return (String)a.get(((Object) (s)));
	//    9   22:aload_0         
	//   10   23:getfield        #25  <Field Map a>
	//   11   26:aload_1         
	//   12   27:invokeinterface #66  <Method Object Map.get(Object)>
	//   13   32:checkcast       #78  <Class String>
	//   14   35:areturn         
	}

	private final long e(String s)
	{
		s = (String)a.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Map a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #66  <Method Object Map.get(Object)>
	//    4   10:checkcast       #78  <Class String>
	//    5   13:astore_1        
		if(s == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       22
			return -1L;
	//    8   18:ldc2w           #81  <Long -1L>
	//    9   21:lreturn         
		long l;
		try
		{
			l = Long.parseLong(s);
	//   10   22:aload_1         
	//   11   23:invokestatic    #87  <Method long Long.parseLong(String)>
	//   12   26:lstore_2        
		}
	//*  13   27:lload_2         
	//*  14   28:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   29:astore_1        
		{
			return -1L;
	//   16   30:ldc2w           #81  <Long -1L>
	//   17   33:lreturn         
		}
		return l;
	}

	public final void a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Context b>
	//*   2    4:ifnonnull       14
		{
			((ni)this).a("Activity context is not available.");
	//    3    7:aload_0         
	//    4    8:ldc1            #90  <String "Activity context is not available.">
	//    5   10:invokevirtual   #93  <Method void ni.a(String)>
			return;
	//    6   13:return          
		}
		aw.e();
	//    7   14:invokestatic    #98  <Method xg aw.e()>
	//    8   17:pop             
		if(!xg.f(b).d())
	//*   9   18:aload_0         
	//*  10   19:getfield        #32  <Field Context b>
	//*  11   22:invokestatic    #103 <Method bzl xg.f(Context)>
	//*  12   25:invokevirtual   #108 <Method boolean bzl.d()>
	//*  13   28:ifne            38
		{
			((ni)this).a("This feature is not available on the device.");
	//   14   31:aload_0         
	//   15   32:ldc1            #110 <String "This feature is not available on the device.">
	//   16   34:invokevirtual   #93  <Method void ni.a(String)>
			return;
	//   17   37:return          
		}
		aw.e();
	//   18   38:invokestatic    #98  <Method xg aw.e()>
	//   19   41:pop             
		android.app.AlertDialog.Builder builder = xg.e(b);
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field Context b>
	//   22   46:invokestatic    #113 <Method android.app.AlertDialog$Builder xg.e(Context)>
	//   23   49:astore_2        
		Resources resources = aw.i().g();
	//   24   50:invokestatic    #117 <Method wi aw.i()>
	//   25   53:invokevirtual   #122 <Method Resources wi.g()>
	//   26   56:astore_3        
		String s;
		if(resources != null)
	//*  27   57:aload_3         
	//*  28   58:ifnull          72
			s = resources.getString(b.s5);
	//   29   61:aload_3         
	//   30   62:getstatic       #128 <Field int b.s5>
	//   31   65:invokevirtual   #134 <Method String Resources.getString(int)>
	//   32   68:astore_1        
		else
	//*  33   69:goto            75
			s = "Create calendar event";
	//   34   72:ldc1            #136 <String "Create calendar event">
	//   35   74:astore_1        
		builder.setTitle(((CharSequence) (s)));
	//   36   75:aload_2         
	//   37   76:aload_1         
	//   38   77:invokevirtual   #142 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   39   80:pop             
		if(resources != null)
	//*  40   81:aload_3         
	//*  41   82:ifnull          96
			s = resources.getString(b.s6);
	//   42   85:aload_3         
	//   43   86:getstatic       #145 <Field int b.s6>
	//   44   89:invokevirtual   #134 <Method String Resources.getString(int)>
	//   45   92:astore_1        
		else
	//*  46   93:goto            99
			s = "Allow Ad to create a calendar event?";
	//   47   96:ldc1            #147 <String "Allow Ad to create a calendar event?">
	//   48   98:astore_1        
		builder.setMessage(((CharSequence) (s)));
	//   49   99:aload_2         
	//   50  100:aload_1         
	//   51  101:invokevirtual   #150 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   52  104:pop             
		if(resources != null)
	//*  53  105:aload_3         
	//*  54  106:ifnull          120
			s = resources.getString(b.s3);
	//   55  109:aload_3         
	//   56  110:getstatic       #153 <Field int b.s3>
	//   57  113:invokevirtual   #134 <Method String Resources.getString(int)>
	//   58  116:astore_1        
		else
	//*  59  117:goto            123
			s = "Accept";
	//   60  120:ldc1            #155 <String "Accept">
	//   61  122:astore_1        
		builder.setPositiveButton(((CharSequence) (s)), ((android.content.DialogInterface.OnClickListener) (new mv(this))));
	//   62  123:aload_2         
	//   63  124:aload_1         
	//   64  125:new             #157 <Class mv>
	//   65  128:dup             
	//   66  129:aload_0         
	//   67  130:invokespecial   #160 <Method void mv(mu)>
	//   68  133:invokevirtual   #164 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   69  136:pop             
		if(resources != null)
	//*  70  137:aload_3         
	//*  71  138:ifnull          152
			s = resources.getString(b.s4);
	//   72  141:aload_3         
	//   73  142:getstatic       #167 <Field int b.s4>
	//   74  145:invokevirtual   #134 <Method String Resources.getString(int)>
	//   75  148:astore_1        
		else
	//*  76  149:goto            155
			s = "Decline";
	//   77  152:ldc1            #169 <String "Decline">
	//   78  154:astore_1        
		builder.setNegativeButton(((CharSequence) (s)), ((android.content.DialogInterface.OnClickListener) (new mw(this))));
	//   79  155:aload_2         
	//   80  156:aload_1         
	//   81  157:new             #171 <Class mw>
	//   82  160:dup             
	//   83  161:aload_0         
	//   84  162:invokespecial   #172 <Method void mw(mu)>
	//   85  165:invokevirtual   #175 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   86  168:pop             
		builder.create().show();
	//   87  169:aload_2         
	//   88  170:invokevirtual   #179 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   89  173:invokevirtual   #184 <Method void AlertDialog.show()>
	//   90  176:return          
	}

	final Intent b()
	{
		Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
	//    0    0:new             #190 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #192 <String "android.intent.action.EDIT">
	//    3    6:invokespecial   #194 <Method void Intent(String)>
	//    4    9:getstatic       #200 <Field android.net.Uri android.provider.CalendarContract$Events.CONTENT_URI>
	//    5   12:invokevirtual   #204 <Method Intent Intent.setData(android.net.Uri)>
	//    6   15:astore_3        
		intent.putExtra("title", c);
	//    7   16:aload_3         
	//    8   17:ldc1            #206 <String "title">
	//    9   19:aload_0         
	//   10   20:getfield        #39  <Field String c>
	//   11   23:invokevirtual   #210 <Method Intent Intent.putExtra(String, String)>
	//   12   26:pop             
		intent.putExtra("eventLocation", g);
	//   13   27:aload_3         
	//   14   28:ldc1            #212 <String "eventLocation">
	//   15   30:aload_0         
	//   16   31:getfield        #58  <Field String g>
	//   17   34:invokevirtual   #210 <Method Intent Intent.putExtra(String, String)>
	//   18   37:pop             
		intent.putExtra("description", f);
	//   19   38:aload_3         
	//   20   39:ldc1            #34  <String "description">
	//   21   41:aload_0         
	//   22   42:getfield        #43  <Field String f>
	//   23   45:invokevirtual   #210 <Method Intent Intent.putExtra(String, String)>
	//   24   48:pop             
		long l = d;
	//   25   49:aload_0         
	//   26   50:getfield        #50  <Field long d>
	//   27   53:lstore_1        
		if(l > -1L)
	//*  28   54:lload_1         
	//*  29   55:ldc2w           #81  <Long -1L>
	//*  30   58:lcmp            
	//*  31   59:ifle            70
			intent.putExtra("beginTime", l);
	//   32   62:aload_3         
	//   33   63:ldc1            #214 <String "beginTime">
	//   34   65:lload_1         
	//   35   66:invokevirtual   #217 <Method Intent Intent.putExtra(String, long)>
	//   36   69:pop             
		l = e;
	//   37   70:aload_0         
	//   38   71:getfield        #54  <Field long e>
	//   39   74:lstore_1        
		if(l > -1L)
	//*  40   75:lload_1         
	//*  41   76:ldc2w           #81  <Long -1L>
	//*  42   79:lcmp            
	//*  43   80:ifle            91
			intent.putExtra("endTime", l);
	//   44   83:aload_3         
	//   45   84:ldc1            #219 <String "endTime">
	//   46   86:lload_1         
	//   47   87:invokevirtual   #217 <Method Intent Intent.putExtra(String, long)>
	//   48   90:pop             
		intent.setFlags(0x10000000);
	//   49   91:aload_3         
	//   50   92:ldc1            #220 <Int 0x10000000>
	//   51   94:invokevirtual   #224 <Method Intent Intent.setFlags(int)>
	//   52   97:pop             
		return intent;
	//   53   98:aload_3         
	//   54   99:areturn         
	}

	private final Map a;
	private final Context b;
	private String c;
	private long d;
	private long e;
	private String f;
	private String g;
}
