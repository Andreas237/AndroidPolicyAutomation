// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdi, TagManager, zzeg

public class PreviewActivity extends Activity
{

	public PreviewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Activity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		Intent intent;
		try
		{
			super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void Activity.onCreate(Bundle)>
			zzdi.zzdm("Preview activity");
	//    3    5:ldc1            #18  <String "Preview activity">
	//    4    7:invokestatic    #24  <Method void zzdi.zzdm(String)>
			bundle = ((Bundle) (getIntent().getData()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #28  <Method Intent getIntent()>
	//    7   14:invokevirtual   #34  <Method android.net.Uri Intent.getData()>
	//    8   17:astore_1        
			if(!TagManager.getInstance(((android.content.Context) (this))).zzb(((android.net.Uri) (bundle))))
	//*   9   18:aload_0         
	//*  10   19:invokestatic    #40  <Method TagManager TagManager.getInstance(android.content.Context)>
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #44  <Method boolean TagManager.zzb(android.net.Uri)>
	//*  13   26:ifne            123
			{
				bundle = ((Bundle) (String.valueOf(((Object) (bundle)))));
	//   14   29:aload_1         
	//   15   30:invokestatic    #50  <Method String String.valueOf(Object)>
	//   16   33:astore_1        
				Object obj = ((Object) (new StringBuilder(String.valueOf(((Object) (bundle))).length() + 73)));
	//   17   34:new             #52  <Class StringBuilder>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:invokestatic    #50  <Method String String.valueOf(Object)>
	//   21   42:invokevirtual   #56  <Method int String.length()>
	//   22   45:bipush          73
	//   23   47:iadd            
	//   24   48:invokespecial   #59  <Method void StringBuilder(int)>
	//   25   51:astore_2        
				((StringBuilder) (obj)).append("Cannot preview the app with the uri: ");
	//   26   52:aload_2         
	//   27   53:ldc1            #61  <String "Cannot preview the app with the uri: ">
	//   28   55:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
				((StringBuilder) (obj)).append(((String) (bundle)));
	//   30   59:aload_2         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
				((StringBuilder) (obj)).append(". Launching current version instead.");
	//   34   65:aload_2         
	//   35   66:ldc1            #67  <String ". Launching current version instead.">
	//   36   68:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
				bundle = ((Bundle) (((StringBuilder) (obj)).toString()));
	//   38   72:aload_2         
	//   39   73:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   40   76:astore_1        
				zzdi.zzab(((String) (bundle)));
	//   41   77:aload_1         
	//   42   78:invokestatic    #74  <Method void zzdi.zzab(String)>
				obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).create()));
	//   43   81:new             #76  <Class android.app.AlertDialog$Builder>
	//   44   84:dup             
	//   45   85:aload_0         
	//   46   86:invokespecial   #79  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   47   89:invokevirtual   #83  <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   48   92:astore_2        
				((AlertDialog) (obj)).setTitle("Preview failure");
	//   49   93:aload_2         
	//   50   94:ldc1            #85  <String "Preview failure">
	//   51   96:invokevirtual   #91  <Method void AlertDialog.setTitle(CharSequence)>
				((AlertDialog) (obj)).setMessage(((CharSequence) (bundle)));
	//   52   99:aload_2         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #94  <Method void AlertDialog.setMessage(CharSequence)>
				((AlertDialog) (obj)).setButton(-1, "Continue", ((android.content.DialogInterface.OnClickListener) (new zzeg(this))));
	//   55  104:aload_2         
	//   56  105:iconst_m1       
	//   57  106:ldc1            #96  <String "Continue">
	//   58  108:new             #98  <Class zzeg>
	//   59  111:dup             
	//   60  112:aload_0         
	//   61  113:invokespecial   #101 <Method void zzeg(PreviewActivity)>
	//   62  116:invokevirtual   #105 <Method void AlertDialog.setButton(int, CharSequence, android.content.DialogInterface$OnClickListener)>
				((AlertDialog) (obj)).show();
	//   63  119:aload_2         
	//   64  120:invokevirtual   #108 <Method void AlertDialog.show()>
			}
			intent = getPackageManager().getLaunchIntentForPackage(getPackageName());
	//   65  123:aload_0         
	//   66  124:invokevirtual   #112 <Method PackageManager getPackageManager()>
	//   67  127:aload_0         
	//   68  128:invokevirtual   #115 <Method String getPackageName()>
	//   69  131:invokevirtual   #121 <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//   70  134:astore_2        
		}
	//*  71  135:aload_2         
	//*  72  136:ifnull          184
	//*  73  139:aload_0         
	//*  74  140:invokevirtual   #115 <Method String getPackageName()>
	//*  75  143:invokestatic    #50  <Method String String.valueOf(Object)>
	//*  76  146:astore_1        
	//*  77  147:aload_1         
	//*  78  148:invokevirtual   #56  <Method int String.length()>
	//*  79  151:ifeq            164
	//*  80  154:ldc1            #123 <String "Invoke the launch activity for package name: ">
	//*  81  156:aload_1         
	//*  82  157:invokevirtual   #127 <Method String String.concat(String)>
	//*  83  160:astore_1        
	//*  84  161:goto            174
	//*  85  164:new             #46  <Class String>
	//*  86  167:dup             
	//*  87  168:ldc1            #123 <String "Invoke the launch activity for package name: ">
	//*  88  170:invokespecial   #129 <Method void String(String)>
	//*  89  173:astore_1        
	//*  90  174:aload_1         
	//*  91  175:invokestatic    #24  <Method void zzdi.zzdm(String)>
	//*  92  178:aload_0         
	//*  93  179:aload_2         
	//*  94  180:invokevirtual   #133 <Method void startActivity(Intent)>
	//*  95  183:return          
	//*  96  184:aload_0         
	//*  97  185:invokevirtual   #115 <Method String getPackageName()>
	//*  98  188:invokestatic    #50  <Method String String.valueOf(Object)>
	//*  99  191:astore_1        
	//* 100  192:aload_1         
	//* 101  193:invokevirtual   #56  <Method int String.length()>
	//* 102  196:ifeq            209
	//* 103  199:ldc1            #135 <String "No launch activity found for package name: ">
	//* 104  201:aload_1         
	//* 105  202:invokevirtual   #127 <Method String String.concat(String)>
	//* 106  205:astore_1        
	//* 107  206:goto            219
	//* 108  209:new             #46  <Class String>
	//* 109  212:dup             
	//* 110  213:ldc1            #135 <String "No launch activity found for package name: ">
	//* 111  215:invokespecial   #129 <Method void String(String)>
	//* 112  218:astore_1        
	//* 113  219:aload_1         
	//* 114  220:invokestatic    #24  <Method void zzdi.zzdm(String)>
	//* 115  223:return          
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//* 116  224:astore_1        
		{
			bundle = ((Bundle) (String.valueOf(((Object) (((Exception) (bundle)).getMessage())))));
	//  117  225:aload_1         
	//  118  226:invokevirtual   #138 <Method String Exception.getMessage()>
	//  119  229:invokestatic    #50  <Method String String.valueOf(Object)>
	//  120  232:astore_1        
			if(((String) (bundle)).length() != 0)
	//* 121  233:aload_1         
	//* 122  234:invokevirtual   #56  <Method int String.length()>
	//* 123  237:ifeq            250
				bundle = ((Bundle) ("Calling preview threw an exception: ".concat(((String) (bundle)))));
	//  124  240:ldc1            #140 <String "Calling preview threw an exception: ">
	//  125  242:aload_1         
	//  126  243:invokevirtual   #127 <Method String String.concat(String)>
	//  127  246:astore_1        
			else
	//* 128  247:goto            260
				bundle = ((Bundle) (new String("Calling preview threw an exception: ")));
	//  129  250:new             #46  <Class String>
	//  130  253:dup             
	//  131  254:ldc1            #140 <String "Calling preview threw an exception: ">
	//  132  256:invokespecial   #129 <Method void String(String)>
	//  133  259:astore_1        
			zzdi.e(((String) (bundle)));
	//  134  260:aload_1         
	//  135  261:invokestatic    #143 <Method void zzdi.e(String)>
			return;
	//  136  264:return          
		}
		if(intent == null)
			break MISSING_BLOCK_LABEL_184;
		bundle = ((Bundle) (String.valueOf(((Object) (getPackageName())))));
		if(((String) (bundle)).length() != 0)
		{
			bundle = ((Bundle) ("Invoke the launch activity for package name: ".concat(((String) (bundle)))));
			break MISSING_BLOCK_LABEL_174;
		}
		bundle = ((Bundle) (new String("Invoke the launch activity for package name: ")));
		zzdi.zzdm(((String) (bundle)));
		startActivity(intent);
		return;
		bundle = ((Bundle) (String.valueOf(((Object) (getPackageName())))));
		if(((String) (bundle)).length() != 0)
		{
			bundle = ((Bundle) ("No launch activity found for package name: ".concat(((String) (bundle)))));
			break MISSING_BLOCK_LABEL_219;
		}
		bundle = ((Bundle) (new String("No launch activity found for package name: ")));
		zzdi.zzdm(((String) (bundle)));
		return;
	}
}
