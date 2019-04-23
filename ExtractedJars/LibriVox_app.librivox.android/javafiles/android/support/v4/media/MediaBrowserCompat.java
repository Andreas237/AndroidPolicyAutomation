// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			m, l, k, n, 
//			j, e

public final class MediaBrowserCompat
{

	public MediaBrowserCompat(Context context, ComponentName componentname, e e, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          29
		{
			b = ((j) (new m(context, componentname, e, bundle)));
	//    5   12:aload_0         
	//    6   13:new             #33  <Class m>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:aload_3         
	//   11   20:aload           4
	//   12   22:invokespecial   #35  <Method void m(Context, ComponentName, e, Bundle)>
	//   13   25:putfield        #37  <Field j b>
			return;
	//   14   28:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  15   29:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   32:bipush          23
	//*  17   34:icmplt          54
		{
			b = ((j) (new l(context, componentname, e, bundle)));
	//   18   37:aload_0         
	//   19   38:new             #39  <Class l>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:aload           4
	//   25   47:invokespecial   #40  <Method void l(Context, ComponentName, e, Bundle)>
	//   26   50:putfield        #37  <Field j b>
			return;
	//   27   53:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  28   54:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   57:bipush          21
	//*  30   59:icmplt          79
		{
			b = ((j) (new k(context, componentname, e, bundle)));
	//   31   62:aload_0         
	//   32   63:new             #42  <Class k>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:invokespecial   #43  <Method void k(Context, ComponentName, e, Bundle)>
	//   39   75:putfield        #37  <Field j b>
			return;
	//   40   78:return          
		} else
		{
			b = ((j) (new n(context, componentname, e, bundle)));
	//   41   79:aload_0         
	//   42   80:new             #45  <Class n>
	//   43   83:dup             
	//   44   84:aload_1         
	//   45   85:aload_2         
	//   46   86:aload_3         
	//   47   87:aload           4
	//   48   89:invokespecial   #46  <Method void n(Context, ComponentName, e, Bundle)>
	//   49   92:putfield        #37  <Field j b>
			return;
	//   50   95:return          
		}
	}

	public void a()
	{
		b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field j b>
	//    2    4:invokeinterface #51  <Method void j.d()>
	//    3    9:return          
	}

	public void b()
	{
		b.e();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field j b>
	//    2    4:invokeinterface #54  <Method void j.e()>
	//    3    9:return          
	}

	public android.support.v4.media.session.MediaSessionCompat.Token c()
	{
		return b.f();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field j b>
	//    2    4:invokeinterface #59  <Method android.support.v4.media.session.MediaSessionCompat$Token j.f()>
	//    3    9:areturn         
	}

	static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
	private final j b;

	static 
	{
	//    0    0:ldc1            #12  <String "MediaBrowserCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #18  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #20  <Field boolean a>
	//*   4    9:return          
	}
}
