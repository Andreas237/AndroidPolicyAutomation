// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzaqw, zzakk, zzmw, 
//			zzajm, zzzz, zzaaa

public final class zzzy extends zzaal
{

	public zzzy(zzaqw zzaqw1, Map map)
	{
		super(zzaqw1, "createCalendarEvent");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #21  <String "createCalendarEvent">
	//    3    4:invokespecial   #24  <Method void zzaal(zzaqw, String)>
		zzbgp = map;
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:putfield        #26  <Field Map zzbgp>
		mContext = ((Context) (zzaqw1.zzto()));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokeinterface #32  <Method android.app.Activity zzaqw.zzto()>
	//   10   19:putfield        #34  <Field Context mContext>
		zzbvs = zzbu("description");
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:ldc1            #36  <String "description">
	//   14   26:invokespecial   #40  <Method String zzbu(String)>
	//   15   29:putfield        #42  <Field String zzbvs>
		zzbvv = zzbu("summary");
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:ldc1            #44  <String "summary">
	//   19   36:invokespecial   #40  <Method String zzbu(String)>
	//   20   39:putfield        #46  <Field String zzbvv>
		zzbvt = zzbv("start_ticks");
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:ldc1            #48  <String "start_ticks">
	//   24   46:invokespecial   #52  <Method long zzbv(String)>
	//   25   49:putfield        #54  <Field long zzbvt>
		zzbvu = zzbv("end_ticks");
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:ldc1            #56  <String "end_ticks">
	//   29   56:invokespecial   #52  <Method long zzbv(String)>
	//   30   59:putfield        #58  <Field long zzbvu>
		zzbvw = zzbu("location");
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:ldc1            #60  <String "location">
	//   34   66:invokespecial   #40  <Method String zzbu(String)>
	//   35   69:putfield        #62  <Field String zzbvw>
	//   36   72:return          
	}

	static Context zza(zzzy zzzy1)
	{
		return zzzy1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context mContext>
	//    2    4:areturn         
	}

	private final String zzbu(String s)
	{
		if(TextUtils.isEmpty((CharSequence)zzbgp.get(((Object) (s)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Map zzbgp>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #73  <Method Object Map.get(Object)>
	//*   4   10:checkcast       #75  <Class CharSequence>
	//*   5   13:invokestatic    #81  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   16:ifeq            22
			return "";
	//    7   19:ldc1            #83  <String "">
	//    8   21:areturn         
		else
			return (String)zzbgp.get(((Object) (s)));
	//    9   22:aload_0         
	//   10   23:getfield        #26  <Field Map zzbgp>
	//   11   26:aload_1         
	//   12   27:invokeinterface #73  <Method Object Map.get(Object)>
	//   13   32:checkcast       #85  <Class String>
	//   14   35:areturn         
	}

	private final long zzbv(String s)
	{
		s = (String)zzbgp.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map zzbgp>
	//    2    4:aload_1         
	//    3    5:invokeinterface #73  <Method Object Map.get(Object)>
	//    4   10:checkcast       #85  <Class String>
	//    5   13:astore_1        
		if(s == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       22
			return -1L;
	//    8   18:ldc2w           #88  <Long -1L>
	//    9   21:lreturn         
		long l;
		try
		{
			l = Long.parseLong(s);
	//   10   22:aload_1         
	//   11   23:invokestatic    #94  <Method long Long.parseLong(String)>
	//   12   26:lstore_2        
		}
	//*  13   27:lload_2         
	//*  14   28:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   29:astore_1        
		{
			return -1L;
	//   16   30:ldc2w           #88  <Long -1L>
	//   17   33:lreturn         
		}
		return l;
	}

	final Intent createIntent()
	{
		Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
	//    0    0:new             #101 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #103 <String "android.intent.action.EDIT">
	//    3    6:invokespecial   #106 <Method void Intent(String)>
	//    4    9:getstatic       #112 <Field android.net.Uri android.provider.CalendarContract$Events.CONTENT_URI>
	//    5   12:invokevirtual   #116 <Method Intent Intent.setData(android.net.Uri)>
	//    6   15:astore_1        
		intent.putExtra("title", zzbvs);
	//    7   16:aload_1         
	//    8   17:ldc1            #118 <String "title">
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field String zzbvs>
	//   11   23:invokevirtual   #122 <Method Intent Intent.putExtra(String, String)>
	//   12   26:pop             
		intent.putExtra("eventLocation", zzbvw);
	//   13   27:aload_1         
	//   14   28:ldc1            #124 <String "eventLocation">
	//   15   30:aload_0         
	//   16   31:getfield        #62  <Field String zzbvw>
	//   17   34:invokevirtual   #122 <Method Intent Intent.putExtra(String, String)>
	//   18   37:pop             
		intent.putExtra("description", zzbvv);
	//   19   38:aload_1         
	//   20   39:ldc1            #36  <String "description">
	//   21   41:aload_0         
	//   22   42:getfield        #46  <Field String zzbvv>
	//   23   45:invokevirtual   #122 <Method Intent Intent.putExtra(String, String)>
	//   24   48:pop             
		if(zzbvt > -1L)
	//*  25   49:aload_0         
	//*  26   50:getfield        #54  <Field long zzbvt>
	//*  27   53:ldc2w           #88  <Long -1L>
	//*  28   56:lcmp            
	//*  29   57:ifle            71
			intent.putExtra("beginTime", zzbvt);
	//   30   60:aload_1         
	//   31   61:ldc1            #126 <String "beginTime">
	//   32   63:aload_0         
	//   33   64:getfield        #54  <Field long zzbvt>
	//   34   67:invokevirtual   #129 <Method Intent Intent.putExtra(String, long)>
	//   35   70:pop             
		if(zzbvu > -1L)
	//*  36   71:aload_0         
	//*  37   72:getfield        #58  <Field long zzbvu>
	//*  38   75:ldc2w           #88  <Long -1L>
	//*  39   78:lcmp            
	//*  40   79:ifle            93
			intent.putExtra("endTime", zzbvu);
	//   41   82:aload_1         
	//   42   83:ldc1            #131 <String "endTime">
	//   43   85:aload_0         
	//   44   86:getfield        #58  <Field long zzbvu>
	//   45   89:invokevirtual   #129 <Method Intent Intent.putExtra(String, long)>
	//   46   92:pop             
		intent.setFlags(0x10000000);
	//   47   93:aload_1         
	//   48   94:ldc1            #132 <Int 0x10000000>
	//   49   96:invokevirtual   #136 <Method Intent Intent.setFlags(int)>
	//   50   99:pop             
		return intent;
	//   51  100:aload_1         
	//   52  101:areturn         
	}

	public final void execute()
	{
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Context mContext>
	//*   2    4:ifnonnull       14
		{
			((zzaal)this).zzbw("Activity context is not available.");
	//    3    7:aload_0         
	//    4    8:ldc1            #141 <String "Activity context is not available.">
	//    5   10:invokevirtual   #144 <Method void zzaal.zzbw(String)>
			return;
	//    6   13:return          
		}
		com.google.android.gms.ads.internal.zzbv.zzek();
	//    7   14:invokestatic    #150 <Method zzakk zzbv.zzek()>
	//    8   17:pop             
		if(!zzakk.zzao(mContext).zziz())
	//*   9   18:aload_0         
	//*  10   19:getfield        #34  <Field Context mContext>
	//*  11   22:invokestatic    #156 <Method zzmw zzakk.zzao(Context)>
	//*  12   25:invokevirtual   #162 <Method boolean zzmw.zziz()>
	//*  13   28:ifne            38
		{
			((zzaal)this).zzbw("This feature is not available on the device.");
	//   14   31:aload_0         
	//   15   32:ldc1            #164 <String "This feature is not available on the device.">
	//   16   34:invokevirtual   #144 <Method void zzaal.zzbw(String)>
			return;
	//   17   37:return          
		}
		com.google.android.gms.ads.internal.zzbv.zzek();
	//   18   38:invokestatic    #150 <Method zzakk zzbv.zzek()>
	//   19   41:pop             
		android.app.AlertDialog.Builder builder = zzakk.zzan(mContext);
	//   20   42:aload_0         
	//   21   43:getfield        #34  <Field Context mContext>
	//   22   46:invokestatic    #168 <Method android.app.AlertDialog$Builder zzakk.zzan(Context)>
	//   23   49:astore_2        
		Resources resources = com.google.android.gms.ads.internal.zzbv.zzeo().getResources();
	//   24   50:invokestatic    #172 <Method zzajm zzbv.zzeo()>
	//   25   53:invokevirtual   #178 <Method Resources zzajm.getResources()>
	//   26   56:astore_3        
		String s;
		if(resources != null)
	//*  27   57:aload_3         
	//*  28   58:ifnull          72
			s = resources.getString(com.google.android.gms.ads.impl.R.string.s5);
	//   29   61:aload_3         
	//   30   62:getstatic       #184 <Field int com.google.android.gms.ads.impl.R$string.s5>
	//   31   65:invokevirtual   #190 <Method String Resources.getString(int)>
	//   32   68:astore_1        
		else
	//*  33   69:goto            75
			s = "Create calendar event";
	//   34   72:ldc1            #192 <String "Create calendar event">
	//   35   74:astore_1        
		builder.setTitle(((CharSequence) (s)));
	//   36   75:aload_2         
	//   37   76:aload_1         
	//   38   77:invokevirtual   #198 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   39   80:pop             
		if(resources != null)
	//*  40   81:aload_3         
	//*  41   82:ifnull          96
			s = resources.getString(com.google.android.gms.ads.impl.R.string.s6);
	//   42   85:aload_3         
	//   43   86:getstatic       #201 <Field int com.google.android.gms.ads.impl.R$string.s6>
	//   44   89:invokevirtual   #190 <Method String Resources.getString(int)>
	//   45   92:astore_1        
		else
	//*  46   93:goto            99
			s = "Allow Ad to create a calendar event?";
	//   47   96:ldc1            #203 <String "Allow Ad to create a calendar event?">
	//   48   98:astore_1        
		builder.setMessage(((CharSequence) (s)));
	//   49   99:aload_2         
	//   50  100:aload_1         
	//   51  101:invokevirtual   #206 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   52  104:pop             
		if(resources != null)
	//*  53  105:aload_3         
	//*  54  106:ifnull          120
			s = resources.getString(com.google.android.gms.ads.impl.R.string.s3);
	//   55  109:aload_3         
	//   56  110:getstatic       #209 <Field int com.google.android.gms.ads.impl.R$string.s3>
	//   57  113:invokevirtual   #190 <Method String Resources.getString(int)>
	//   58  116:astore_1        
		else
	//*  59  117:goto            123
			s = "Accept";
	//   60  120:ldc1            #211 <String "Accept">
	//   61  122:astore_1        
		builder.setPositiveButton(((CharSequence) (s)), ((android.content.DialogInterface.OnClickListener) (new zzzz(this))));
	//   62  123:aload_2         
	//   63  124:aload_1         
	//   64  125:new             #213 <Class zzzz>
	//   65  128:dup             
	//   66  129:aload_0         
	//   67  130:invokespecial   #216 <Method void zzzz(zzzy)>
	//   68  133:invokevirtual   #220 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   69  136:pop             
		if(resources != null)
	//*  70  137:aload_3         
	//*  71  138:ifnull          152
			s = resources.getString(com.google.android.gms.ads.impl.R.string.s4);
	//   72  141:aload_3         
	//   73  142:getstatic       #223 <Field int com.google.android.gms.ads.impl.R$string.s4>
	//   74  145:invokevirtual   #190 <Method String Resources.getString(int)>
	//   75  148:astore_1        
		else
	//*  76  149:goto            155
			s = "Decline";
	//   77  152:ldc1            #225 <String "Decline">
	//   78  154:astore_1        
		builder.setNegativeButton(((CharSequence) (s)), ((android.content.DialogInterface.OnClickListener) (new zzaaa(this))));
	//   79  155:aload_2         
	//   80  156:aload_1         
	//   81  157:new             #227 <Class zzaaa>
	//   82  160:dup             
	//   83  161:aload_0         
	//   84  162:invokespecial   #228 <Method void zzaaa(zzzy)>
	//   85  165:invokevirtual   #231 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   86  168:pop             
		builder.create().show();
	//   87  169:aload_2         
	//   88  170:invokevirtual   #235 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   89  173:invokevirtual   #240 <Method void AlertDialog.show()>
	//   90  176:return          
	}

	private final Context mContext;
	private final Map zzbgp;
	private String zzbvs;
	private long zzbvt;
	private long zzbvu;
	private String zzbvv;
	private String zzbvw;
}
