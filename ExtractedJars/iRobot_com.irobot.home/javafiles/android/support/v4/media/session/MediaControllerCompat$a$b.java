// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

private static class MediaControllerCompat$a$b
	implements c.a
{

	public void a()
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_1        
		if(a1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          19
			a1.a();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method void MediaControllerCompat$a.a()>
	//    9   19:return          
	}

	public void a(int i, int j, int k, int l, int i1)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore          6
		if(a1 != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          36
			a1.a(new MediaControllerCompat.f(i, j, k, l, i1));
	//    7   17:aload           6
	//    8   19:new             #36  <Class MediaControllerCompat$f>
	//    9   22:dup             
	//   10   23:iload_1         
	//   11   24:iload_2         
	//   12   25:iload_3         
	//   13   26:iload           4
	//   14   28:iload           5
	//   15   30:invokespecial   #38  <Method void MediaControllerCompat$f(int, int, int, int, int)>
	//   16   33:invokevirtual   #41  <Method void MediaControllerCompat$a.a(MediaControllerCompat$f)>
	//   17   36:return          
	}

	public void a(Bundle bundle)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          20
			a1.a(bundle);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #44  <Method void MediaControllerCompat$a.a(Bundle)>
	//   10   20:return          
	}

	public void a(CharSequence charsequence)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          20
			a1.a(charsequence);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #47  <Method void MediaControllerCompat$a.a(CharSequence)>
	//   10   20:return          
	}

	public void a(Object obj)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          31
		{
			if(a1.b)
	//*   7   15:aload_2         
	//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
	//*   9   19:ifeq            23
				return;
	//   10   22:return          
			a1.a(PlaybackStateCompat.a(obj));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #55  <Method PlaybackStateCompat PlaybackStateCompat.a(Object)>
	//   14   28:invokevirtual   #58  <Method void MediaControllerCompat$a.a(PlaybackStateCompat)>
		}
	//   15   31:return          
	}

	public void a(String s, Bundle bundle)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_3        
		if(a1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
		{
			if(a1.b && android.os.Build.VERSION.SDK_INT < 23)
	//*   7   15:aload_3         
	//*   8   16:getfield        #50  <Field boolean MediaControllerCompat$a.b>
	//*   9   19:ifeq            31
	//*  10   22:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   25:bipush          23
	//*  12   27:icmpge          31
				return;
	//   13   30:return          
			a1.a(s, bundle);
	//   14   31:aload_3         
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokevirtual   #67  <Method void MediaControllerCompat$a.a(String, Bundle)>
		}
	//   18   37:return          
	}

	public void a(List list)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			a1.a(em.a(list));
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #73  <Method List MediaSessionCompat$QueueItem.a(List)>
	//   10   20:invokevirtual   #75  <Method void MediaControllerCompat$a.a(List)>
	//   11   23:return          
	}

	public void b(Object obj)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference a>
	//    2    4:invokevirtual   #31  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			a1.a(MediaMetadataCompat.a(obj));
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #82  <Method MediaMetadataCompat MediaMetadataCompat.a(Object)>
	//   10   20:invokevirtual   #85  <Method void MediaControllerCompat$a.a(MediaMetadataCompat)>
	//   11   23:return          
	}

	private final WeakReference a;

	MediaControllerCompat$a$b(MediaControllerCompat.a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = new WeakReference(((Object) (a1)));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
	//    7   13:putfield        #26  <Field WeakReference a>
	//    8   16:return          
	}
}
