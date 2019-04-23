// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//			h

public final class WebImage extends AbstractSafeParcelable
{

	WebImage(int i, Uri uri, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int a>
		b = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Uri b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #30  <Field int c>
		d = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #32  <Field int d>
	//   14   25:return          
	}

	public WebImage(Uri uri)
	{
		this(uri, 0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #36  <Method void WebImage(Uri, int, int)>
	//    5    7:return          
	}

	public WebImage(Uri uri, int i, int j)
	{
		this(1, uri, i, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #38  <Method void WebImage(int, Uri, int, int)>
		if(uri != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          31
		{
			if(i >= 0 && j >= 0)
	//*   8   12:iload_2         
	//*   9   13:iflt            21
	//*  10   16:iload_3         
	//*  11   17:iflt            21
				return;
	//   12   20:return          
			else
				throw new IllegalArgumentException("width and height must not be negative");
	//   13   21:new             #40  <Class IllegalArgumentException>
	//   14   24:dup             
	//   15   25:ldc1            #42  <String "width and height must not be negative">
	//   16   27:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   17   30:athrow          
		} else
		{
			throw new IllegalArgumentException("url cannot be null");
	//   18   31:new             #40  <Class IllegalArgumentException>
	//   19   34:dup             
	//   20   35:ldc1            #47  <String "url cannot be null">
	//   21   37:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   22   40:athrow          
		}
	}

	public WebImage(JSONObject jsonobject)
	{
		this(a(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #51  <Method Uri a(JSONObject)>
	//    3    5:aload_1         
	//    4    6:ldc1            #53  <String "width">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #59  <Method int JSONObject.optInt(String, int)>
	//    7   12:aload_1         
	//    8   13:ldc1            #61  <String "height">
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #59  <Method int JSONObject.optInt(String, int)>
	//   11   19:invokespecial   #36  <Method void WebImage(Uri, int, int)>
	//   12   22:return          
	}

	private static Uri a(JSONObject jsonobject)
	{
		if(!jsonobject.has("url"))
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "url">
	//    2    3:invokevirtual   #69  <Method boolean JSONObject.has(String)>
	//    3    6:ifeq            21
		jsonobject = ((JSONObject) (Uri.parse(jsonobject.getString("url"))));
	//    4    9:aload_0         
	//    5   10:ldc1            #65  <String "url">
	//    6   12:invokevirtual   #73  <Method String JSONObject.getString(String)>
	//    7   15:invokestatic    #79  <Method Uri Uri.parse(String)>
	//    8   18:astore_0        
		return ((Uri) (jsonobject));
	//    9   19:aload_0         
	//   10   20:areturn         
_L2:
		return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		jsonobject;
	//   13   23:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  14   24:goto            21
	}

	public final Uri a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Uri b>
	//    2    4:areturn         
	}

	public final int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int c>
	//    2    4:ireturn         
	}

	public final int c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int d>
	//    2    4:ireturn         
	}

	public final JSONObject d()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #55  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("url", ((Object) (b.toString())));
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "url">
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field Uri b>
	//    8   15:invokevirtual   #87  <Method String Uri.toString()>
	//    9   18:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
			jsonobject.put("width", c);
	//   11   22:aload_1         
	//   12   23:ldc1            #53  <String "width">
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field int c>
	//   15   29:invokevirtual   #94  <Method JSONObject JSONObject.put(String, int)>
	//   16   32:pop             
			jsonobject.put("height", d);
	//   17   33:aload_1         
	//   18   34:ldc1            #61  <String "height">
	//   19   36:aload_0         
	//   20   37:getfield        #32  <Field int d>
	//   21   40:invokevirtual   #94  <Method JSONObject JSONObject.put(String, int)>
	//   22   43:pop             
		}
	//*  23   44:aload_1         
	//*  24   45:areturn         
		catch(JSONException jsonexception)
	//*  25   46:astore_2        
		{
			return jsonobject;
	//   26   47:aload_1         
	//   27   48:areturn         
		}
		return jsonobject;
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          65
		{
			if(!(obj instanceof WebImage))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class WebImage>
	//*   9   15:ifne            20
				return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
			obj = ((Object) ((WebImage)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class WebImage>
	//   14   24:astore_1        
			return ak.a(((Object) (b)), ((Object) (((WebImage) (obj)).b))) && c == ((WebImage) (obj)).c && d == ((WebImage) (obj)).d;
	//   15   25:aload_0         
	//   16   26:getfield        #28  <Field Uri b>
	//   17   29:aload_1         
	//   18   30:getfield        #28  <Field Uri b>
	//   19   33:invokestatic    #101 <Method boolean ak.a(Object, Object)>
	//   20   36:ifeq            63
	//   21   39:aload_0         
	//   22   40:getfield        #30  <Field int c>
	//   23   43:aload_1         
	//   24   44:getfield        #30  <Field int c>
	//   25   47:icmpne          63
	//   26   50:aload_0         
	//   27   51:getfield        #32  <Field int d>
	//   28   54:aload_1         
	//   29   55:getfield        #32  <Field int d>
	//   30   58:icmpne          63
	//   31   61:iconst_1        
	//   32   62:ireturn         
	//   33   63:iconst_0        
	//   34   64:ireturn         
		} else
		{
			return false;
	//   35   65:iconst_0        
	//   36   66:ireturn         
		}
	}

	public final int hashCode()
	{
		return ak.a(new Object[] {
			b, Integer.valueOf(c), Integer.valueOf(d)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field Uri b>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #30  <Field int c>
	//   11   17:invokestatic    #110 <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #32  <Field int d>
	//   17   27:invokestatic    #110 <Method Integer Integer.valueOf(int)>
	//   18   30:aastore         
	//   19   31:invokestatic    #113 <Method int ak.a(Object[])>
	//   20   34:ireturn         
	}

	public final String toString()
	{
		return String.format(Locale.US, "Image %dx%d %s", new Object[] {
			Integer.valueOf(c), Integer.valueOf(d), b.toString()
		});
	//    0    0:getstatic       #119 <Field Locale Locale.US>
	//    1    3:ldc1            #121 <String "Image %dx%d %s">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #30  <Field int c>
	//    8   15:invokestatic    #110 <Method Integer Integer.valueOf(int)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #32  <Field int d>
	//   14   25:invokestatic    #110 <Method Integer Integer.valueOf(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #28  <Field Uri b>
	//   20   35:invokevirtual   #87  <Method String Uri.toString()>
	//   21   38:aastore         
	//   22   39:invokestatic    #127 <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int a>
	//    7   11:invokestatic    #137 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (a())), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #139 <Method Uri a()>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #142 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #144 <Method int b()>
	//   19   31:invokestatic    #137 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #146 <Method int c()>
	//   24   40:invokestatic    #137 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #148 <Method void c.a(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new h();
	private final int a;
	private final Uri b;
	private final int c;
	private final int d;

	static 
	{
	//    0    0:new             #16  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void h()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
