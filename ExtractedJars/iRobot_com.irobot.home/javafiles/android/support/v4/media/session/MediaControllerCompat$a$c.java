// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, ParcelableVolumeInfo, PlaybackStateCompat

private static class MediaControllerCompat$a$c extends a.a
{

	public void a()
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_1        
		if(a1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			a1.a(8, ((Object) (null)), ((Bundle) (null)));
	//    7   15:aload_1         
	//    8   16:bipush          8
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   23:return          
	}

	public void a(int i)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			a1.a(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          9
	//    9   18:iload_1         
	//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   13   26:return          
	}

	public void a(Bundle bundle)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			a1.a(7, ((Object) (bundle)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          7
	//    9   18:aload_1         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   23:return          
	}

	public void a(MediaMetadataCompat mediametadatacompat)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			a1.a(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_3        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   22:return          
	}

	public void a(ParcelableVolumeInfo parcelablevolumeinfo)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          59
		{
			if(parcelablevolumeinfo != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          50
				parcelablevolumeinfo = ((ParcelableVolumeInfo) (new MediaControllerCompat.f(parcelablevolumeinfo.a, parcelablevolumeinfo.b, parcelablevolumeinfo.c, parcelablevolumeinfo.d, parcelablevolumeinfo.e)));
	//    9   19:new             #44  <Class MediaControllerCompat$f>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:getfield        #49  <Field int ParcelableVolumeInfo.a>
	//   13   27:aload_1         
	//   14   28:getfield        #52  <Field int ParcelableVolumeInfo.b>
	//   15   31:aload_1         
	//   16   32:getfield        #54  <Field int ParcelableVolumeInfo.c>
	//   17   35:aload_1         
	//   18   36:getfield        #57  <Field int ParcelableVolumeInfo.d>
	//   19   39:aload_1         
	//   20   40:getfield        #60  <Field int ParcelableVolumeInfo.e>
	//   21   43:invokespecial   #63  <Method void MediaControllerCompat$f(int, int, int, int, int)>
	//   22   46:astore_1        
			else
	//*  23   47:goto            52
				parcelablevolumeinfo = null;
	//   24   50:aconst_null     
	//   25   51:astore_1        
			a1.a(4, ((Object) (parcelablevolumeinfo)), ((Bundle) (null)));
	//   26   52:aload_2         
	//   27   53:iconst_4        
	//   28   54:aload_1         
	//   29   55:aconst_null     
	//   30   56:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
		}
	//   31   59:return          
	}

	public void a(PlaybackStateCompat playbackstatecompat)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			a1.a(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_2        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   22:return          
	}

	public void a(CharSequence charsequence)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			a1.a(6, ((Object) (charsequence)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          6
	//    9   18:aload_1         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   23:return          
	}

	public void a(String s, Bundle bundle)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_3        
		if(a1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          22
			a1.a(1, ((Object) (s)), bundle);
	//    7   15:aload_3         
	//    8   16:iconst_1        
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   22:return          
	}

	public void a(List list)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			a1.a(5, ((Object) (list)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_5        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   12   22:return          
	}

	public void a(boolean flag)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			a1.a(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          10
	//    9   18:iload_1         
	//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   13   26:return          
	}

	public void b(int i)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			a1.a(12, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          12
	//    9   18:iload_1         
	//   10   19:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   13   26:return          
	}

	public void b(boolean flag)
	{
		MediaControllerCompat.a a1 = (MediaControllerCompat.a)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference a>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$a>
	//    4   10:astore_2        
		if(a1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			a1.a(11, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          11
	//    9   18:iload_1         
	//   10   19:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #32  <Method void MediaControllerCompat$a.a(int, Object, Bundle)>
	//   13   26:return          
	}

	private final WeakReference a;

	MediaControllerCompat$a$c(MediaControllerCompat.a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void a$a()>
		a = new WeakReference(((Object) (a1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference a>
	//    8   16:return          
	}
}
