// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import org.androidannotations.api.a.a;
import org.androidannotations.api.a.e;

// Referenced classes of package com.irobot.home:
//			NotificationDetailsActivity_

public static class NotificationDetailsActivity_$a extends a
{

	public NotificationDetailsActivity_$a a(long l)
	{
		return (NotificationDetailsActivity_$a)super.a("timestamp", l);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "timestamp">
	//    2    3:lload_1         
	//    3    4:invokespecial   #24  <Method org.androidannotations.api.a.d a.a(String, long)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a a(String s)
	{
		return (NotificationDetailsActivity_$a)super.a("type", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <String "type">
	//    2    3:aload_1         
	//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a a(ArrayList arraylist)
	{
		return (NotificationDetailsActivity_$a)super.a("payLoadMap", ((java.io.Serializable) (arraylist)));
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "payLoadMap">
	//    2    3:aload_1         
	//    3    4:invokespecial   #36  <Method org.androidannotations.api.a.d a.a(String, java.io.Serializable)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public e a(int i)
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Fragment e>
	//*   2    4:ifnull          22
			e.startActivityForResult(c, i);
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field Fragment e>
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field android.content.Intent c>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #51  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
		else
	//*   9   19:goto            95
		if(d != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #53  <Field android.app.Fragment d>
	//*  12   26:ifnull          48
			d.startActivityForResult(c, i, a);
	//   13   29:aload_0         
	//   14   30:getfield        #53  <Field android.app.Fragment d>
	//   15   33:aload_0         
	//   16   34:getfield        #45  <Field android.content.Intent c>
	//   17   37:iload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #56  <Field android.os.Bundle a>
	//   20   42:invokevirtual   #61  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, android.os.Bundle)>
		else
	//*  21   45:goto            95
		if(b instanceof Activity)
	//*  22   48:aload_0         
	//*  23   49:getfield        #65  <Field Context b>
	//*  24   52:instanceof      #67  <Class Activity>
	//*  25   55:ifeq            80
			ActivityCompat.startActivityForResult((Activity)b, c, i, a);
	//   26   58:aload_0         
	//   27   59:getfield        #65  <Field Context b>
	//   28   62:checkcast       #67  <Class Activity>
	//   29   65:aload_0         
	//   30   66:getfield        #45  <Field android.content.Intent c>
	//   31   69:iload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #56  <Field android.os.Bundle a>
	//   34   74:invokestatic    #72  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, android.os.Bundle)>
		else
	//*  35   77:goto            95
			b.startActivity(c, a);
	//   36   80:aload_0         
	//   37   81:getfield        #65  <Field Context b>
	//   38   84:aload_0         
	//   39   85:getfield        #45  <Field android.content.Intent c>
	//   40   88:aload_0         
	//   41   89:getfield        #56  <Field android.os.Bundle a>
	//   42   92:invokevirtual   #78  <Method void Context.startActivity(android.content.Intent, android.os.Bundle)>
		return new e(b);
	//   43   95:new             #80  <Class e>
	//   44   98:dup             
	//   45   99:aload_0         
	//   46  100:getfield        #65  <Field Context b>
	//   47  103:invokespecial   #82  <Method void e(Context)>
	//   48  106:areturn         
	}

	public NotificationDetailsActivity_$a b(int i)
	{
		return (NotificationDetailsActivity_$a)super.a("detailsContentId", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "detailsContentId">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a b(String s)
	{
		return (NotificationDetailsActivity_$a)super.a("categoryIconId", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String "categoryIconId">
	//    2    3:aload_1         
	//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a c(int i)
	{
		return (NotificationDetailsActivity_$a)super.a("detailsContentVersion", i);
	//    0    0:aload_0         
	//    1    1:ldc1            #92  <String "detailsContentVersion">
	//    2    3:iload_1         
	//    3    4:invokespecial   #88  <Method org.androidannotations.api.a.d a.a(String, int)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a c(String s)
	{
		return (NotificationDetailsActivity_$a)super.a("headlineText", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #94  <String "headlineText">
	//    2    3:aload_1         
	//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	public NotificationDetailsActivity_$a d(String s)
	{
		return (NotificationDetailsActivity_$a)super.a("eventId", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #96  <String "eventId">
	//    2    3:aload_1         
	//    3    4:invokespecial   #30  <Method org.androidannotations.api.a.d a.a(String, String)>
	//    4    7:checkcast       #2   <Class NotificationDetailsActivity_$a>
	//    5   10:areturn         
	}

	private android.app.Fragment d;
	private Fragment e;

	public NotificationDetailsActivity_$a(Context context)
	{
		super(context, com/irobot/home/NotificationDetailsActivity_);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class NotificationDetailsActivity_>
	//    3    4:invokespecial   #17  <Method void a(Context, Class)>
	//    4    7:return          
	}
}
