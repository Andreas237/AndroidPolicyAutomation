// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompat

public static final class MediaDescriptionCompat$a
{

	public MediaDescriptionCompat$a a(Bitmap bitmap)
	{
		e = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Bitmap e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a a(Uri uri)
	{
		f = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Uri f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a a(Bundle bundle)
	{
		g = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Bundle g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a a(CharSequence charsequence)
	{
		b = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field CharSequence b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat a()
	{
		return new MediaDescriptionCompat(a, b, c, d, e, f, g, h);
	//    0    0:new             #6   <Class MediaDescriptionCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field CharSequence b>
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field CharSequence c>
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field CharSequence d>
	//   10   20:aload_0         
	//   11   21:getfield        #27  <Field Bitmap e>
	//   12   24:aload_0         
	//   13   25:getfield        #30  <Field Uri f>
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field Bundle g>
	//   16   32:aload_0         
	//   17   33:getfield        #46  <Field Uri h>
	//   18   36:invokespecial   #49  <Method void MediaDescriptionCompat(String, CharSequence, CharSequence, CharSequence, Bitmap, Uri, Bundle, Uri)>
	//   19   39:areturn         
	}

	public MediaDescriptionCompat$a b(Uri uri)
	{
		h = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field Uri h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a b(CharSequence charsequence)
	{
		c = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field CharSequence c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MediaDescriptionCompat$a c(CharSequence charsequence)
	{
		d = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field CharSequence d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String a;
	private CharSequence b;
	private CharSequence c;
	private CharSequence d;
	private Bitmap e;
	private Uri f;
	private Bundle g;
	private Uri h;

	public MediaDescriptionCompat$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
