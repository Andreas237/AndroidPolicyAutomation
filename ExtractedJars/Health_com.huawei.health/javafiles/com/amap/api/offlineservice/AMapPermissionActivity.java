// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.offlineservice;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AMapPermissionActivity extends Activity
{

	public AMapPermissionActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Activity()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:anewarray       String[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:ldc1            #20  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:ldc1            #22  <String "android.permission.READ_EXTERNAL_STORAGE">
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:ldc1            #24  <String "android.permission.READ_PHONE_STATE">
	//   16   23:aastore         
	//   17   24:putfield        #26  <Field String[] needPermissions>
		a = true;
	//   18   27:aload_0         
	//   19   28:iconst_1        
	//   20   29:putfield        #28  <Field boolean a>
	//   21   32:return          
	}

	private int a(String s)
	{
		int i;
		try
		{
			i = ((Integer)((Object)this).getClass().getMethod("checkSelfPermission", new Class[] {
				java/lang/String
			}).invoke(((Object) (this)), new Object[] {
				s
			})).intValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Class Object.getClass()>
	//    2    4:ldc1            #40  <String "checkSelfPermission">
	//    3    6:iconst_1        
	//    4    7:anewarray       Class[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #18  <Class String>
	//    8   14:aastore         
	//    9   15:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:aload_1         
	//   16   26:aastore         
	//   17   27:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   18   30:checkcast       #54  <Class Integer>
	//   19   33:invokevirtual   #58  <Method int Integer.intValue()>
	//   20   36:istore_2        
		}
	//*  21   37:iload_2         
	//*  22   38:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   39:astore_1        
		{
			return -1;
	//   24   40:iconst_m1       
	//   25   41:ireturn         
		}
		return i;
	}

	private void a()
	{
		try
		{
			android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (this)));
	//    0    0:new             #60  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #63  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:astore_1        
			builder.setTitle("\u63D0\u793A");
	//    5    9:aload_1         
	//    6   10:ldc1            #65  <String "\u63D0\u793A">
	//    7   12:invokevirtual   #69  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    8   15:pop             
			builder.setMessage("\u5F53\u524D\u5E94\u7528\u7F3A\u5C11\u5FC5\u8981\u6743\u9650\u3002\\n\\n\u8BF7\u70B9\u51FB\\\"\u8BBE\u7F6E\\\"-\\\"\u6743\u9650\\\"-\u6253\u5F00\u6240\u9700\u6743\u9650");
	//    9   16:aload_1         
	//   10   17:ldc1            #71  <String "\u5F53\u524D\u5E94\u7528\u7F3A\u5C11\u5FC5\u8981\u6743\u9650\u3002\\n\\n\u8BF7\u70B9\u51FB\\\"\u8BBE\u7F6E\\\"-\\\"\u6743\u9650\\\"-\u6253\u5F00\u6240\u9700\u6743\u9650">
	//   11   19:invokevirtual   #74  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   12   22:pop             
			builder.setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					try
					{
						a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AMapPermissionActivity a>
				//    2    4:invokevirtual   #26  <Method void AMapPermissionActivity.finish()>
						return;
				//    3    7:return          
					}
					// Misplaced declaration of an exception variable
					catch(DialogInterface dialoginterface)
				//*   4    8:astore_1        
					{
						((Throwable) (dialoginterface)).printStackTrace();
				//    5    9:aload_1         
				//    6   10:invokevirtual   #29  <Method void Throwable.printStackTrace()>
					}
				//    7   13:return          
				}

				final AMapPermissionActivity a;

			
			{
				a = AMapPermissionActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AMapPermissionActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   13   23:aload_1         
	//   14   24:ldc1            #76  <String "\u53D6\u6D88">
	//   15   26:new             #6   <Class AMapPermissionActivity$1>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:invokespecial   #79  <Method void AMapPermissionActivity$1(AMapPermissionActivity)>
	//   19   34:invokevirtual   #83  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   20   37:pop             
			builder.setPositiveButton("\u8BBE\u7F6E", new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i)
				{
					try
					{
						AMapPermissionActivity.a(a);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field AMapPermissionActivity a>
				//    2    4:invokestatic    #25  <Method void AMapPermissionActivity.a(AMapPermissionActivity)>
						return;
				//    3    7:return          
					}
					// Misplaced declaration of an exception variable
					catch(DialogInterface dialoginterface)
				//*   4    8:astore_1        
					{
						((Throwable) (dialoginterface)).printStackTrace();
				//    5    9:aload_1         
				//    6   10:invokevirtual   #28  <Method void Throwable.printStackTrace()>
					}
				//    7   13:return          
				}

				final AMapPermissionActivity a;

			
			{
				a = AMapPermissionActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AMapPermissionActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   38:aload_1         
	//   22   39:ldc1            #85  <String "\u8BBE\u7F6E">
	//   23   41:new             #8   <Class AMapPermissionActivity$2>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokespecial   #86  <Method void AMapPermissionActivity$2(AMapPermissionActivity)>
	//   27   49:invokevirtual   #89  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   28   52:pop             
			builder.setCancelable(false);
	//   29   53:aload_1         
	//   30   54:iconst_0        
	//   31   55:invokevirtual   #93  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   32   58:pop             
			builder.show();
	//   33   59:aload_1         
	//   34   60:invokevirtual   #97  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   35   63:pop             
			return;
	//   36   64:return          
		}
		catch(Throwable throwable)
	//*  37   65:astore_1        
		{
			throwable.printStackTrace();
	//   38   66:aload_1         
	//   39   67:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		}
	//   40   70:return          
	}

	static void a(AMapPermissionActivity amappermissionactivity)
	{
		amappermissionactivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void b()>
	//    2    4:return          
	}

	private transient void a(String as[])
	{
		if(android.os.Build.VERSION.SDK_INT < 23 || getApplicationInfo().targetSdkVersion < 23)
			break MISSING_BLOCK_LABEL_108;
	//    0    0:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          108
	//    3    8:aload_0         
	//    4    9:invokevirtual   #117 <Method ApplicationInfo getApplicationInfo()>
	//    5   12:getfield        #122 <Field int ApplicationInfo.targetSdkVersion>
	//    6   15:bipush          23
	//    7   17:icmplt          108
		as = ((String []) (b(as)));
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokespecial   #125 <Method List b(String[])>
	//   11   25:astore_1        
		if(as != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          108
		{
			int i;
			try
			{
				i = ((List) (as)).size();
	//   14   30:aload_1         
	//   15   31:invokeinterface #130 <Method int List.size()>
	//   16   36:istore_2        
			}
	//*  17   37:iload_2         
	//*  18   38:ifle            108
	//*  19   41:aload_1         
	//*  20   42:aload_1         
	//*  21   43:invokeinterface #130 <Method int List.size()>
	//*  22   48:anewarray       String[]
	//*  23   51:invokeinterface #134 <Method Object[] List.toArray(Object[])>
	//*  24   56:checkcast       #135 <Class String[]>
	//*  25   59:astore_1        
	//*  26   60:aload_0         
	//*  27   61:invokevirtual   #38  <Method Class Object.getClass()>
	//*  28   64:ldc1            #137 <String "requestPermissions">
	//*  29   66:iconst_2        
	//*  30   67:anewarray       Class[]
	//*  31   70:dup             
	//*  32   71:iconst_0        
	//*  33   72:ldc1            #135 <Class String[]>
	//*  34   74:aastore         
	//*  35   75:dup             
	//*  36   76:iconst_1        
	//*  37   77:getstatic       #141 <Field Class Integer.TYPE>
	//*  38   80:aastore         
	//*  39   81:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//*  40   84:aload_0         
	//*  41   85:iconst_2        
	//*  42   86:anewarray       Object[]
	//*  43   89:dup             
	//*  44   90:iconst_0        
	//*  45   91:aload_1         
	//*  46   92:aastore         
	//*  47   93:dup             
	//*  48   94:iconst_1        
	//*  49   95:iconst_0        
	//*  50   96:invokestatic    #145 <Method Integer Integer.valueOf(int)>
	//*  51   99:aastore         
	//*  52  100:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//*  53  103:pop             
	//*  54  104:goto            108
	//*  55  107:astore_1        
	//*  56  108:return          
			// Misplaced declaration of an exception variable
			catch(String as[])
	//*  57  109:astore_1        
			{
				((Throwable) (as)).printStackTrace();
	//   58  110:aload_1         
	//   59  111:invokevirtual   #100 <Method void Throwable.printStackTrace()>
				return;
	//   60  114:return          
			}
			if(i > 0)
				try
				{
					as = (String[])((List) (as)).toArray(((Object []) (new String[((List) (as)).size()])));
					((Object)this).getClass().getMethod("requestPermissions", new Class[] {
						[Ljava/lang/String;, Integer.TYPE
					}).invoke(((Object) (this)), new Object[] {
						as, Integer.valueOf(0)
					});
				}
				// Misplaced declaration of an exception variable
				catch(String as[]) { }
		}
	}

	private boolean a(int ai[])
	{
		int j = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          29
		{
			int k = ai[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:iaload          
	//   11   13:istore          4
			if(k != 0)
	//*  12   15:iload           4
	//*  13   17:ifeq            22
				return false;
	//   14   20:iconst_0        
	//   15   21:ireturn         
		}

	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_2        
		break MISSING_BLOCK_LABEL_37;
	//   20   26:goto            5
	//*  21   29:goto            37
		ai;
	//   22   32:astore_1        
		((Throwable) (ai)).printStackTrace();
	//   23   33:aload_1         
	//   24   34:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		return true;
	//   25   37:iconst_1        
	//   26   38:ireturn         
	}

	private List b(String as[])
	{
		int j;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #149 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #150 <Method void ArrayList()>
	//    3    7:astore          4
		if(android.os.Build.VERSION.SDK_INT < 23 || getApplicationInfo().targetSdkVersion < 23)
			break MISSING_BLOCK_LABEL_79;
	//    4    9:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//    5   12:bipush          23
	//    6   14:icmplt          79
	//    7   17:aload_0         
	//    8   18:invokevirtual   #117 <Method ApplicationInfo getApplicationInfo()>
	//    9   21:getfield        #122 <Field int ApplicationInfo.targetSdkVersion>
	//   10   24:bipush          23
	//   11   26:icmplt          79
		j = as.length;
	//   12   29:aload_1         
	//   13   30:arraylength     
	//   14   31:istore_3        
		int i = 0;
	//   15   32:iconst_0        
	//   16   33:istore_2        
		while(i < j) 
	//*  17   34:iload_2         
	//*  18   35:iload_3         
	//*  19   36:icmpge          79
		{
			String s = as[i];
	//   20   39:aload_1         
	//   21   40:iload_2         
	//   22   41:aaload          
	//   23   42:astore          5
			try
			{
				if(a(s) != 0 || b(s))
	//*  24   44:aload_0         
	//*  25   45:aload           5
	//*  26   47:invokespecial   #152 <Method int a(String)>
	//*  27   50:ifne            62
	//*  28   53:aload_0         
	//*  29   54:aload           5
	//*  30   56:invokespecial   #155 <Method boolean b(String)>
	//*  31   59:ifeq            72
					((List) (arraylist)).add(((Object) (s)));
	//   32   62:aload           4
	//   33   64:aload           5
	//   34   66:invokeinterface #159 <Method boolean List.add(Object)>
	//   35   71:pop             
			}
	//*  36   72:iload_2         
	//*  37   73:iconst_1        
	//*  38   74:iadd            
	//*  39   75:istore_2        
	//*  40   76:goto            34
	//*  41   79:aload           4
	//*  42   81:areturn         
			// Misplaced declaration of an exception variable
			catch(String as[])
	//*  43   82:astore_1        
			{
				((Throwable) (as)).printStackTrace();
	//   44   83:aload_1         
	//   45   84:invokevirtual   #100 <Method void Throwable.printStackTrace()>
				return null;
	//   46   87:aconst_null     
	//   47   88:areturn         
			}
			i++;
		}
		return ((List) (arraylist));
	}

	private void b()
	{
		try
		{
			Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
	//    0    0:new             #163 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #165 <String "android.settings.APPLICATION_DETAILS_SETTINGS">
	//    3    6:invokespecial   #168 <Method void Intent(String)>
	//    4    9:astore_1        
			intent.setData(Uri.parse((new StringBuilder()).append("package:").append(getPackageName()).toString()));
	//    5   10:aload_1         
	//    6   11:new             #170 <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #171 <Method void StringBuilder()>
	//    9   18:ldc1            #173 <String "package:">
	//   10   20:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #181 <Method String getPackageName()>
	//   13   27:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   15   33:invokestatic    #190 <Method Uri Uri.parse(String)>
	//   16   36:invokevirtual   #194 <Method Intent Intent.setData(Uri)>
	//   17   39:pop             
			startActivity(intent);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokevirtual   #198 <Method void startActivity(Intent)>
			return;
	//   21   45:return          
		}
		catch(Throwable throwable)
	//*  22   46:astore_1        
		{
			throwable.printStackTrace();
	//   23   47:aload_1         
	//   24   48:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		}
	//   25   51:return          
	}

	private boolean b(String s)
	{
		boolean flag;
		try
		{
			flag = ((Boolean)((Object)this).getClass().getMethod("shouldShowRequestPermissionRationale", new Class[] {
				java/lang/String
			}).invoke(((Object) (this)), new Object[] {
				s
			})).booleanValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Class Object.getClass()>
	//    2    4:ldc1            #200 <String "shouldShowRequestPermissionRationale">
	//    3    6:iconst_1        
	//    4    7:anewarray       Class[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #18  <Class String>
	//    8   14:aastore         
	//    9   15:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:aload_1         
	//   16   26:aastore         
	//   17   27:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   18   30:checkcast       #202 <Class Boolean>
	//   19   33:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//   20   36:istore_2        
		}
	//*  21   37:iload_2         
	//*  22   38:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   39:astore_1        
		{
			return false;
	//   24   40:iconst_0        
	//   25   41:ireturn         
		}
		return flag;
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		if(android.os.Build.VERSION.SDK_INT < 23 || i != 0)
			break MISSING_BLOCK_LABEL_29;
	//    0    0:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          29
	//    3    8:iload_1         
	//    4    9:ifne            29
		if(!a(ai))
	//*   5   12:aload_0         
	//*   6   13:aload_3         
	//*   7   14:invokespecial   #210 <Method boolean a(int[])>
	//*   8   17:ifne            29
		{
			a();
	//    9   20:aload_0         
	//   10   21:invokespecial   #212 <Method void a()>
			a = false;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #28  <Field boolean a>
		}
		return;
	//   14   29:return          
		as;
	//   15   30:astore_2        
		((Throwable) (as)).printStackTrace();
	//   16   31:aload_2         
	//   17   32:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		return;
	//   18   35:return          
	}

	protected void onResume()
	{
		try
		{
			super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method void Activity.onResume()>
			if(android.os.Build.VERSION.SDK_INT >= 23 && a)
	//*   2    4:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          23
	//*   4    9:icmplt          27
	//*   5   12:aload_0         
	//*   6   13:getfield        #28  <Field boolean a>
	//*   7   16:ifeq            27
				a(needPermissions);
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field String[] needPermissions>
	//   11   24:invokespecial   #217 <Method void a(String[])>
			return;
	//   12   27:return          
		}
		catch(Throwable throwable)
	//*  13   28:astore_1        
		{
			throwable.printStackTrace();
	//   14   29:aload_1         
	//   15   30:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		}
	//   16   33:return          
	}

	private boolean a;
	protected String needPermissions[] = {
		"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE"
	};
}
