// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import org.androidannotations.api.a.a;
import org.androidannotations.api.a.e;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity_

public static class PickABraavaActivity_$a extends a
{

	public e a(int i)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Fragment e>
	//*   2    4:ifnull          22
			e.startActivityForResult(c, i);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Fragment e>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field android.content.Intent c>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
		else
	//*   9   19:goto            95
		if(d != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #33  <Field android.app.Fragment d>
	//*  12   26:ifnull          48
			d.startActivityForResult(c, i, a);
	//   13   29:aload_0         
	//   14   30:getfield        #33  <Field android.app.Fragment d>
	//   15   33:aload_0         
	//   16   34:getfield        #25  <Field android.content.Intent c>
	//   17   37:iload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field android.os.Bundle a>
	//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, android.os.Bundle)>
		else
	//*  21   45:goto            95
		if(b instanceof Activity)
	//*  22   48:aload_0         
	//*  23   49:getfield        #45  <Field Context b>
	//*  24   52:instanceof      #47  <Class Activity>
	//*  25   55:ifeq            80
			ActivityCompat.startActivityForResult((Activity)b, c, i, a);
	//   26   58:aload_0         
	//   27   59:getfield        #45  <Field Context b>
	//   28   62:checkcast       #47  <Class Activity>
	//   29   65:aload_0         
	//   30   66:getfield        #25  <Field android.content.Intent c>
	//   31   69:iload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #36  <Field android.os.Bundle a>
	//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, android.os.Bundle)>
		else
	//*  35   77:goto            95
			b.startActivity(c, a);
	//   36   80:aload_0         
	//   37   81:getfield        #45  <Field Context b>
	//   38   84:aload_0         
	//   39   85:getfield        #25  <Field android.content.Intent c>
	//   40   88:aload_0         
	//   41   89:getfield        #36  <Field android.os.Bundle a>
	//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, android.os.Bundle)>
		return new e(b);
	//   43   95:new             #60  <Class e>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:getfield        #45  <Field Context b>
	//   47  103:invokespecial   #62  <Method void e(Context)>
	//   48  106:areturn         
	}

	private android.app.Fragment d;
	private Fragment e;

	public PickABraavaActivity_$a(Context context)
	{
		super(context, com/irobot/home/PickABraavaActivity_);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class PickABraavaActivity_>
	//    3    4:invokespecial   #17  <Method void a(Context, Class)>
	//    4    7:return          
	}
}
