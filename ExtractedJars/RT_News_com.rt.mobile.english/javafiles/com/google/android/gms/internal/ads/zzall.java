// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalm, zzalk

final class zzall
	implements Runnable
{

	zzall(zzalk zzalk, Context context, String s, boolean flag, boolean flag1)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field Context val$context>
		zzcsq = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field String zzcsq>
		zzcsr = flag;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #21  <Field boolean zzcsr>
		zzcss = flag1;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #23  <Field boolean zzcss>
		super();
	//   12   22:aload_0         
	//   13   23:invokespecial   #26  <Method void Object()>
	//   14   26:return          
	}

	public final void run()
	{
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(val$context);
	//    0    0:new             #30  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context val$context>
	//    4    8:invokespecial   #33  <Method void android.app.AlertDialog$Builder(Context)>
	//    5   11:astore_2        
		builder.setMessage(((CharSequence) (zzcsq)));
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field String zzcsq>
	//    9   17:invokevirtual   #37  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   10   20:pop             
		String s;
		if(zzcsr)
	//*  11   21:aload_0         
	//*  12   22:getfield        #21  <Field boolean zzcsr>
	//*  13   25:ifeq            40
			s = "Error";
	//   14   28:ldc1            #39  <String "Error">
	//   15   30:astore_1        
		else
	//*  16   31:aload_2         
	//*  17   32:aload_1         
	//*  18   33:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//*  19   36:pop             
	//*  20   37:goto            46
			s = "Info";
	//   21   40:ldc1            #44  <String "Info">
	//   22   42:astore_1        
		builder.setTitle(((CharSequence) (s)));
	//*  23   43:goto            31
		if(zzcss)
	//*  24   46:aload_0         
	//*  25   47:getfield        #23  <Field boolean zzcss>
	//*  26   50:ifeq            64
		{
			builder.setNeutralButton("Dismiss", ((android.content.DialogInterface.OnClickListener) (null)));
	//   27   53:aload_2         
	//   28   54:ldc1            #46  <String "Dismiss">
	//   29   56:aconst_null     
	//   30   57:invokevirtual   #50  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   31   60:pop             
		} else
	//*  32   61:goto            87
		{
			builder.setPositiveButton("Learn More", ((android.content.DialogInterface.OnClickListener) (new zzalm(this))));
	//   33   64:aload_2         
	//   34   65:ldc1            #52  <String "Learn More">
	//   35   67:new             #54  <Class zzalm>
	//   36   70:dup             
	//   37   71:aload_0         
	//   38   72:invokespecial   #57  <Method void zzalm(zzall)>
	//   39   75:invokevirtual   #60  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   40   78:pop             
			builder.setNegativeButton("Dismiss", ((android.content.DialogInterface.OnClickListener) (null)));
	//   41   79:aload_2         
	//   42   80:ldc1            #46  <String "Dismiss">
	//   43   82:aconst_null     
	//   44   83:invokevirtual   #63  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   45   86:pop             
		}
		builder.create().show();
	//   46   87:aload_2         
	//   47   88:invokevirtual   #67  <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   48   91:invokevirtual   #72  <Method void AlertDialog.show()>
	//   49   94:return          
	}

	final Context val$context;
	private final String zzcsq;
	private final boolean zzcsr;
	private final boolean zzcss;
}
