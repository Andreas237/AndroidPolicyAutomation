// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package o:
//			if

public final class hy
{

	public hy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Dialog e(Context context, String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, android.content.DialogInterface.OnClickListener onclicklistener1)
	{
		context = ((Context) (new android.app.AlertDialog.Builder(context)));
	//    0    0:new             #26  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #29  <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:astore_0        
		if(d)
	//*   5    9:getstatic       #16  <Field boolean d>
	//*   6   12:ifeq            50
		{
			if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*   7   15:aload           5
	//*   8   17:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   20:ifne            32
				((android.app.AlertDialog.Builder) (context)).setPositiveButton(((CharSequence) (s3)), onclicklistener1);
	//   10   23:aload_0         
	//   11   24:aload           5
	//   12   26:aload           6
	//   13   28:invokevirtual   #39  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   14   31:pop             
			if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  15   32:aload_3         
	//*  16   33:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   36:ifne            82
				((android.app.AlertDialog.Builder) (context)).setNegativeButton(((CharSequence) (s2)), onclicklistener);
	//   18   39:aload_0         
	//   19   40:aload_3         
	//   20   41:aload           4
	//   21   43:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   22   46:pop             
		} else
	//*  23   47:goto            82
		{
			if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  24   50:aload_3         
	//*  25   51:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   54:ifne            65
				((android.app.AlertDialog.Builder) (context)).setPositiveButton(((CharSequence) (s2)), onclicklistener);
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:aload           4
	//   30   61:invokevirtual   #39  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   31   64:pop             
			if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*  32   65:aload           5
	//*  33   67:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  34   70:ifne            82
				((android.app.AlertDialog.Builder) (context)).setNegativeButton(((CharSequence) (s3)), onclicklistener1);
	//   35   73:aload_0         
	//   36   74:aload           5
	//   37   76:aload           6
	//   38   78:invokevirtual   #42  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   39   81:pop             
		}
		((android.app.AlertDialog.Builder) (context)).setTitle(((CharSequence) (s)));
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:invokevirtual   #46  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   43   87:pop             
		((android.app.AlertDialog.Builder) (context)).setMessage(((CharSequence) (s1)));
	//   44   88:aload_0         
	//   45   89:aload_2         
	//   46   90:invokevirtual   #49  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   47   93:pop             
		context = ((Context) (((android.app.AlertDialog.Builder) (context)).create()));
	//   48   94:aload_0         
	//   49   95:invokevirtual   #53  <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   50   98:astore_0        
		((Dialog) (context)).setCanceledOnTouchOutside(false);
	//   51   99:aload_0         
	//   52  100:iconst_0        
	//   53  101:invokevirtual   #59  <Method void Dialog.setCanceledOnTouchOutside(boolean)>
		((Dialog) (context)).setOnKeyListener(((android.content.DialogInterface.OnKeyListener) (new if())));
	//   54  104:aload_0         
	//   55  105:new             #61  <Class if>
	//   56  108:dup             
	//   57  109:invokespecial   #62  <Method void if()>
	//   58  112:invokevirtual   #66  <Method void Dialog.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
		try
		{
			((Dialog) (context)).show();
	//   59  115:aload_0         
	//   60  116:invokevirtual   #69  <Method void Dialog.show()>
		}
	//*  61  119:aload_0         
	//*  62  120:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  63  121:astore_1        
		{
			return ((Dialog) (context));
	//   64  122:aload_0         
	//   65  123:areturn         
		}
		return ((Dialog) (context));
	}

	private static boolean d;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		d = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #16  <Field boolean d>
	//*  10   19:return          
	}
}
