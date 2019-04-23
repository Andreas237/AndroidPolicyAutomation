// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yl, yj

final class yk
	implements Runnable
{

	yk(yj yj, Context context, String s, boolean flag, boolean flag1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field String b>
		c = flag;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #21  <Field boolean c>
		d = flag1;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #23  <Field boolean d>
		super();
	//   12   22:aload_0         
	//   13   23:invokespecial   #26  <Method void Object()>
	//   14   26:return          
	}

	public final void run()
	{
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
	//    0    0:new             #30  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context a>
	//    4    8:invokespecial   #33  <Method void android.app.AlertDialog$Builder(Context)>
	//    5   11:astore_1        
		builder.setMessage(((CharSequence) (b)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field String b>
	//    9   17:invokevirtual   #37  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   10   20:pop             
		if(c)
	//*  11   21:aload_0         
	//*  12   22:getfield        #21  <Field boolean c>
	//*  13   25:ifeq            38
			builder.setTitle("Error");
	//   14   28:aload_1         
	//   15   29:ldc1            #39  <String "Error">
	//   16   31:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   17   34:pop             
		else
	//*  18   35:goto            45
			builder.setTitle("Info");
	//   19   38:aload_1         
	//   20   39:ldc1            #44  <String "Info">
	//   21   41:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   22   44:pop             
		if(d)
	//*  23   45:aload_0         
	//*  24   46:getfield        #23  <Field boolean d>
	//*  25   49:ifeq            63
		{
			builder.setNeutralButton("Dismiss", ((android.content.DialogInterface.OnClickListener) (null)));
	//   26   52:aload_1         
	//   27   53:ldc1            #46  <String "Dismiss">
	//   28   55:aconst_null     
	//   29   56:invokevirtual   #50  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   30   59:pop             
		} else
	//*  31   60:goto            86
		{
			builder.setPositiveButton("Learn More", ((android.content.DialogInterface.OnClickListener) (new yl(this))));
	//   32   63:aload_1         
	//   33   64:ldc1            #52  <String "Learn More">
	//   34   66:new             #54  <Class yl>
	//   35   69:dup             
	//   36   70:aload_0         
	//   37   71:invokespecial   #57  <Method void yl(yk)>
	//   38   74:invokevirtual   #60  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   39   77:pop             
			builder.setNegativeButton("Dismiss", ((android.content.DialogInterface.OnClickListener) (null)));
	//   40   78:aload_1         
	//   41   79:ldc1            #46  <String "Dismiss">
	//   42   81:aconst_null     
	//   43   82:invokevirtual   #63  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   44   85:pop             
		}
		builder.create().show();
	//   45   86:aload_1         
	//   46   87:invokevirtual   #67  <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   47   90:invokevirtual   #72  <Method void AlertDialog.show()>
	//   48   93:return          
	}

	final Context a;
	private final String b;
	private final boolean c;
	private final boolean d;
}
