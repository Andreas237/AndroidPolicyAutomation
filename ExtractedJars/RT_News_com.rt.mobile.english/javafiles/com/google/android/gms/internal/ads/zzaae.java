// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzaqw, zzakk, zzmw, 
//			zzajm, zzaaf, zzaag

public final class zzaae extends zzaal
{

	public zzaae(zzaqw zzaqw1, Map map)
	{
		super(zzaqw1, "storePicture");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "storePicture">
	//    3    4:invokespecial   #17  <Method void zzaal(zzaqw, String)>
		zzbgp = map;
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:putfield        #19  <Field Map zzbgp>
		mContext = ((Context) (zzaqw1.zzto()));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokeinterface #25  <Method android.app.Activity zzaqw.zzto()>
	//   10   19:putfield        #27  <Field Context mContext>
	//   11   22:return          
	}

	static Context zza(zzaae zzaae1)
	{
		return zzaae1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Context mContext>
	//    2    4:areturn         
	}

	public final void execute()
	{
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Context mContext>
	//*   2    4:ifnonnull       14
		{
			((zzaal)this).zzbw("Activity context is not available");
	//    3    7:aload_0         
	//    4    8:ldc1            #36  <String "Activity context is not available">
	//    5   10:invokevirtual   #40  <Method void zzaal.zzbw(String)>
			return;
	//    6   13:return          
		}
		zzbv.zzek();
	//    7   14:invokestatic    #46  <Method zzakk zzbv.zzek()>
	//    8   17:pop             
		if(!zzakk.zzao(mContext).zziy())
	//*   9   18:aload_0         
	//*  10   19:getfield        #27  <Field Context mContext>
	//*  11   22:invokestatic    #52  <Method zzmw zzakk.zzao(Context)>
	//*  12   25:invokevirtual   #58  <Method boolean zzmw.zziy()>
	//*  13   28:ifne            38
		{
			((zzaal)this).zzbw("Feature is not supported by the device.");
	//   14   31:aload_0         
	//   15   32:ldc1            #60  <String "Feature is not supported by the device.">
	//   16   34:invokevirtual   #40  <Method void zzaal.zzbw(String)>
			return;
	//   17   37:return          
		}
		String s3 = (String)zzbgp.get("iurl");
	//   18   38:aload_0         
	//   19   39:getfield        #19  <Field Map zzbgp>
	//   20   42:ldc1            #62  <String "iurl">
	//   21   44:invokeinterface #68  <Method Object Map.get(Object)>
	//   22   49:checkcast       #70  <Class String>
	//   23   52:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s3))))
	//*  24   53:aload_3         
	//*  25   54:invokestatic    #76  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   57:ifeq            67
		{
			((zzaal)this).zzbw("Image url cannot be empty.");
	//   27   60:aload_0         
	//   28   61:ldc1            #78  <String "Image url cannot be empty.">
	//   29   63:invokevirtual   #40  <Method void zzaal.zzbw(String)>
			return;
	//   30   66:return          
		}
		if(!URLUtil.isValidUrl(s3))
	//*  31   67:aload_3         
	//*  32   68:invokestatic    #84  <Method boolean URLUtil.isValidUrl(String)>
	//*  33   71:ifne            112
		{
			String s = String.valueOf(((Object) (s3)));
	//   34   74:aload_3         
	//   35   75:invokestatic    #88  <Method String String.valueOf(Object)>
	//   36   78:astore_1        
			if(s.length() != 0)
	//*  37   79:aload_1         
	//*  38   80:invokevirtual   #92  <Method int String.length()>
	//*  39   83:ifeq            96
				s = "Invalid image url: ".concat(s);
	//   40   86:ldc1            #94  <String "Invalid image url: ">
	//   41   88:aload_1         
	//   42   89:invokevirtual   #98  <Method String String.concat(String)>
	//   43   92:astore_1        
			else
	//*  44   93:goto            106
				s = new String("Invalid image url: ");
	//   45   96:new             #70  <Class String>
	//   46   99:dup             
	//   47  100:ldc1            #94  <String "Invalid image url: ">
	//   48  102:invokespecial   #100 <Method void String(String)>
	//   49  105:astore_1        
			((zzaal)this).zzbw(s);
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:invokevirtual   #40  <Method void zzaal.zzbw(String)>
			return;
	//   53  111:return          
		}
		String s4 = Uri.parse(s3).getLastPathSegment();
	//   54  112:aload_3         
	//   55  113:invokestatic    #106 <Method Uri Uri.parse(String)>
	//   56  116:invokevirtual   #110 <Method String Uri.getLastPathSegment()>
	//   57  119:astore          4
		zzbv.zzek();
	//   58  121:invokestatic    #46  <Method zzakk zzbv.zzek()>
	//   59  124:pop             
		if(!zzakk.zzcw(s4))
	//*  60  125:aload           4
	//*  61  127:invokestatic    #113 <Method boolean zzakk.zzcw(String)>
	//*  62  130:ifne            172
		{
			String s1 = String.valueOf(((Object) (s4)));
	//   63  133:aload           4
	//   64  135:invokestatic    #88  <Method String String.valueOf(Object)>
	//   65  138:astore_1        
			if(s1.length() != 0)
	//*  66  139:aload_1         
	//*  67  140:invokevirtual   #92  <Method int String.length()>
	//*  68  143:ifeq            156
				s1 = "Image type not recognized: ".concat(s1);
	//   69  146:ldc1            #115 <String "Image type not recognized: ">
	//   70  148:aload_1         
	//   71  149:invokevirtual   #98  <Method String String.concat(String)>
	//   72  152:astore_1        
			else
	//*  73  153:goto            166
				s1 = new String("Image type not recognized: ");
	//   74  156:new             #70  <Class String>
	//   75  159:dup             
	//   76  160:ldc1            #115 <String "Image type not recognized: ">
	//   77  162:invokespecial   #100 <Method void String(String)>
	//   78  165:astore_1        
			((zzaal)this).zzbw(s1);
	//   79  166:aload_0         
	//   80  167:aload_1         
	//   81  168:invokevirtual   #40  <Method void zzaal.zzbw(String)>
			return;
	//   82  171:return          
		}
		Resources resources = zzbv.zzeo().getResources();
	//   83  172:invokestatic    #119 <Method zzajm zzbv.zzeo()>
	//   84  175:invokevirtual   #125 <Method Resources zzajm.getResources()>
	//   85  178:astore          5
		zzbv.zzek();
	//   86  180:invokestatic    #46  <Method zzakk zzbv.zzek()>
	//   87  183:pop             
		android.app.AlertDialog.Builder builder = zzakk.zzan(mContext);
	//   88  184:aload_0         
	//   89  185:getfield        #27  <Field Context mContext>
	//   90  188:invokestatic    #129 <Method android.app.AlertDialog$Builder zzakk.zzan(Context)>
	//   91  191:astore_2        
		String s2;
		if(resources != null)
	//*  92  192:aload           5
	//*  93  194:ifnull          209
			s2 = resources.getString(com.google.android.gms.ads.impl.R.string.s1);
	//   94  197:aload           5
	//   95  199:getstatic       #135 <Field int com.google.android.gms.ads.impl.R$string.s1>
	//   96  202:invokevirtual   #141 <Method String Resources.getString(int)>
	//   97  205:astore_1        
		else
	//*  98  206:goto            212
			s2 = "Save image";
	//   99  209:ldc1            #143 <String "Save image">
	//  100  211:astore_1        
		builder.setTitle(((CharSequence) (s2)));
	//  101  212:aload_2         
	//  102  213:aload_1         
	//  103  214:invokevirtual   #149 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//  104  217:pop             
		if(resources != null)
	//* 105  218:aload           5
	//* 106  220:ifnull          235
			s2 = resources.getString(com.google.android.gms.ads.impl.R.string.s2);
	//  107  223:aload           5
	//  108  225:getstatic       #152 <Field int com.google.android.gms.ads.impl.R$string.s2>
	//  109  228:invokevirtual   #141 <Method String Resources.getString(int)>
	//  110  231:astore_1        
		else
	//* 111  232:goto            238
			s2 = "Allow Ad to store image in Picture gallery?";
	//  112  235:ldc1            #154 <String "Allow Ad to store image in Picture gallery?">
	//  113  237:astore_1        
		builder.setMessage(((CharSequence) (s2)));
	//  114  238:aload_2         
	//  115  239:aload_1         
	//  116  240:invokevirtual   #157 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  117  243:pop             
		if(resources != null)
	//* 118  244:aload           5
	//* 119  246:ifnull          261
			s2 = resources.getString(com.google.android.gms.ads.impl.R.string.s3);
	//  120  249:aload           5
	//  121  251:getstatic       #160 <Field int com.google.android.gms.ads.impl.R$string.s3>
	//  122  254:invokevirtual   #141 <Method String Resources.getString(int)>
	//  123  257:astore_1        
		else
	//* 124  258:goto            264
			s2 = "Accept";
	//  125  261:ldc1            #162 <String "Accept">
	//  126  263:astore_1        
		builder.setPositiveButton(((CharSequence) (s2)), ((android.content.DialogInterface.OnClickListener) (new zzaaf(this, s3, s4))));
	//  127  264:aload_2         
	//  128  265:aload_1         
	//  129  266:new             #164 <Class zzaaf>
	//  130  269:dup             
	//  131  270:aload_0         
	//  132  271:aload_3         
	//  133  272:aload           4
	//  134  274:invokespecial   #167 <Method void zzaaf(zzaae, String, String)>
	//  135  277:invokevirtual   #171 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  136  280:pop             
		if(resources != null)
	//* 137  281:aload           5
	//* 138  283:ifnull          298
			s2 = resources.getString(com.google.android.gms.ads.impl.R.string.s4);
	//  139  286:aload           5
	//  140  288:getstatic       #174 <Field int com.google.android.gms.ads.impl.R$string.s4>
	//  141  291:invokevirtual   #141 <Method String Resources.getString(int)>
	//  142  294:astore_1        
		else
	//* 143  295:goto            301
			s2 = "Decline";
	//  144  298:ldc1            #176 <String "Decline">
	//  145  300:astore_1        
		builder.setNegativeButton(((CharSequence) (s2)), ((android.content.DialogInterface.OnClickListener) (new zzaag(this))));
	//  146  301:aload_2         
	//  147  302:aload_1         
	//  148  303:new             #178 <Class zzaag>
	//  149  306:dup             
	//  150  307:aload_0         
	//  151  308:invokespecial   #181 <Method void zzaag(zzaae)>
	//  152  311:invokevirtual   #184 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  153  314:pop             
		builder.create().show();
	//  154  315:aload_2         
	//  155  316:invokevirtual   #188 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  156  319:invokevirtual   #193 <Method void AlertDialog.show()>
	//  157  322:return          
	}

	private final Context mContext;
	private final Map zzbgp;
}
