// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import org.androidannotations.api.a.a;
import org.androidannotations.api.a.e;

// Referenced classes of package com.irobot.home:
//			BraavaMoreTableViewActivity_

public static class BraavaMoreTableViewActivity_$a extends a
{

	public BraavaMoreTableViewActivity_$a a(String s)
	{
		return (BraavaMoreTableViewActivity_$a)super.a("robotBlid", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "robotBlid">
	//    2    3:aload_1         
	//    3    4:invokespecial   #32  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class BraavaMoreTableViewActivity_$a>
	//    5   10:areturn         
	}

	public e a(int i)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field android.support.v4.app.Fragment e>
	//*   2    4:ifnull          22
			e.startActivityForResult(c, i);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field android.support.v4.app.Fragment e>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field android.content.Intent c>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #45  <Method void android.support.v4.app.Fragment.startActivityForResult(android.content.Intent, int)>
		else
	//*   9   19:goto            95
		if(d != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #25  <Field Fragment d>
	//*  12   26:ifnull          48
			d.startActivityForResult(c, i, a);
	//   13   29:aload_0         
	//   14   30:getfield        #25  <Field Fragment d>
	//   15   33:aload_0         
	//   16   34:getfield        #39  <Field android.content.Intent c>
	//   17   37:iload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #48  <Field android.os.Bundle a>
	//   20   42:invokevirtual   #51  <Method void Fragment.startActivityForResult(android.content.Intent, int, android.os.Bundle)>
		else
	//*  21   45:goto            95
		if(b instanceof Activity)
	//*  22   48:aload_0         
	//*  23   49:getfield        #55  <Field Context b>
	//*  24   52:instanceof      #57  <Class Activity>
	//*  25   55:ifeq            80
			ActivityCompat.startActivityForResult((Activity)b, c, i, a);
	//   26   58:aload_0         
	//   27   59:getfield        #55  <Field Context b>
	//   28   62:checkcast       #57  <Class Activity>
	//   29   65:aload_0         
	//   30   66:getfield        #39  <Field android.content.Intent c>
	//   31   69:iload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #48  <Field android.os.Bundle a>
	//   34   74:invokestatic    #62  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, android.os.Bundle)>
		else
	//*  35   77:goto            95
			b.startActivity(c, a);
	//   36   80:aload_0         
	//   37   81:getfield        #55  <Field Context b>
	//   38   84:aload_0         
	//   39   85:getfield        #39  <Field android.content.Intent c>
	//   40   88:aload_0         
	//   41   89:getfield        #48  <Field android.os.Bundle a>
	//   42   92:invokevirtual   #68  <Method void Context.startActivity(android.content.Intent, android.os.Bundle)>
		return new e(b);
	//   43   95:new             #70  <Class e>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:getfield        #55  <Field Context b>
	//   47  103:invokespecial   #73  <Method void e(Context)>
	//   48  106:areturn         
	}

	private Fragment d;
	private android.support.v4.app.Fragment e;

	public BraavaMoreTableViewActivity_$a(Fragment fragment)
	{
		super(((Context) (fragment.getActivity())), com/irobot/home/BraavaMoreTableViewActivity_);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method Activity Fragment.getActivity()>
	//    3    5:ldc1            #7   <Class BraavaMoreTableViewActivity_>
	//    4    7:invokespecial   #23  <Method void a(Context, Class)>
		d = fragment;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #25  <Field Fragment d>
	//    8   15:return          
	}
}