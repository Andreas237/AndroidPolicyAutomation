// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//			zzb

public final class WebImage extends zza
{

	WebImage(int i, Uri uri, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int zzaiI>
		zzata = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Uri zzata>
		zzrC = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int zzrC>
		zzrD = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #33  <Field int zzrD>
	//   14   25:return          
	}

	public WebImage(Uri uri)
		throws IllegalArgumentException
	{
		this(uri, 0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #39  <Method void WebImage(Uri, int, int)>
	//    5    7:return          
	}

	public WebImage(Uri uri, int i, int j)
		throws IllegalArgumentException
	{
		this(1, uri, i, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #42  <Method void WebImage(int, Uri, int, int)>
		if(uri == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       22
			throw new IllegalArgumentException("url cannot be null");
	//    8   12:new             #36  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #44  <String "url cannot be null">
	//   11   18:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   12   21:athrow          
		if(i < 0 || j < 0)
	//*  13   22:iload_2         
	//*  14   23:iflt            30
	//*  15   26:iload_3         
	//*  16   27:ifge            40
			throw new IllegalArgumentException("width and height must not be negative");
	//   17   30:new             #36  <Class IllegalArgumentException>
	//   18   33:dup             
	//   19   34:ldc1            #49  <String "width and height must not be negative">
	//   20   36:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   21   39:athrow          
		else
			return;
	//   22   40:return          
	}

	public WebImage(JSONObject jsonobject)
		throws IllegalArgumentException
	{
		this(zzs(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method Uri zzs(JSONObject)>
	//    3    5:aload_1         
	//    4    6:ldc1            #56  <String "width">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #62  <Method int JSONObject.optInt(String, int)>
	//    7   12:aload_1         
	//    8   13:ldc1            #64  <String "height">
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #62  <Method int JSONObject.optInt(String, int)>
	//   11   19:invokespecial   #39  <Method void WebImage(Uri, int, int)>
	//   12   22:return          
	}

	private static Uri zzs(JSONObject jsonobject)
	{
		Uri uri = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(jsonobject.has("url"))
	//*   2    2:aload_0         
	//*   3    3:ldc1            #68  <String "url">
	//*   4    5:invokevirtual   #72  <Method boolean JSONObject.has(String)>
	//*   5    8:ifeq            21
			try
			{
				uri = Uri.parse(jsonobject.getString("url"));
	//    6   11:aload_0         
	//    7   12:ldc1            #68  <String "url">
	//    8   14:invokevirtual   #76  <Method String JSONObject.getString(String)>
	//    9   17:invokestatic    #82  <Method Uri Uri.parse(String)>
	//   10   20:astore_1        
			}
	//*  11   21:aload_1         
	//*  12   22:areturn         
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  13   23:astore_0        
			{
				return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
			}
		return uri;
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || !(obj instanceof WebImage))
	//*   5    7:aload_1         
	//*   6    8:ifnull          18
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
		return zzaa.equal(((Object) (zzata)), ((Object) (((WebImage) (obj)).zzata))) && zzrC == ((WebImage) (obj)).zzrC && zzrD == ((WebImage) (obj)).zzrD;
	//   15   25:aload_0         
	//   16   26:getfield        #29  <Field Uri zzata>
	//   17   29:aload_1         
	//   18   30:getfield        #29  <Field Uri zzata>
	//   19   33:invokestatic    #90  <Method boolean zzaa.equal(Object, Object)>
	//   20   36:ifeq            63
	//   21   39:aload_0         
	//   22   40:getfield        #31  <Field int zzrC>
	//   23   43:aload_1         
	//   24   44:getfield        #31  <Field int zzrC>
	//   25   47:icmpne          63
	//   26   50:aload_0         
	//   27   51:getfield        #33  <Field int zzrD>
	//   28   54:aload_1         
	//   29   55:getfield        #33  <Field int zzrD>
	//   30   58:icmpne          63
	//   31   61:iconst_1        
	//   32   62:ireturn         
	//   33   63:iconst_0        
	//   34   64:ireturn         
	}

	public int getHeight()
	{
		return zzrD;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzrD>
	//    2    4:ireturn         
	}

	public Uri getUrl()
	{
		return zzata;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Uri zzata>
	//    2    4:areturn         
	}

	public int getWidth()
	{
		return zzrC;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int zzrC>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzata, Integer.valueOf(zzrC), Integer.valueOf(zzrD)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field Uri zzata>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #31  <Field int zzrC>
	//   11   17:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #33  <Field int zzrD>
	//   17   27:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   18   30:aastore         
	//   19   31:invokestatic    #107 <Method int zzaa.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #58  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("url", ((Object) (zzata.toString())));
	//    4    8:aload_1         
	//    5    9:ldc1            #68  <String "url">
	//    6   11:aload_0         
	//    7   12:getfield        #29  <Field Uri zzata>
	//    8   15:invokevirtual   #114 <Method String Uri.toString()>
	//    9   18:invokevirtual   #118 <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
			jsonobject.put("width", zzrC);
	//   11   22:aload_1         
	//   12   23:ldc1            #56  <String "width">
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field int zzrC>
	//   15   29:invokevirtual   #121 <Method JSONObject JSONObject.put(String, int)>
	//   16   32:pop             
			jsonobject.put("height", zzrD);
	//   17   33:aload_1         
	//   18   34:ldc1            #64  <String "height">
	//   19   36:aload_0         
	//   20   37:getfield        #33  <Field int zzrD>
	//   21   40:invokevirtual   #121 <Method JSONObject JSONObject.put(String, int)>
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

	public String toString()
	{
		return String.format(Locale.US, "Image %dx%d %s", new Object[] {
			Integer.valueOf(zzrC), Integer.valueOf(zzrD), zzata.toString()
		});
	//    0    0:getstatic       #127 <Field Locale Locale.US>
	//    1    3:ldc1            #129 <String "Image %dx%d %s">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #31  <Field int zzrC>
	//    8   15:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #33  <Field int zzrD>
	//   14   25:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #29  <Field Uri zzata>
	//   20   35:invokevirtual   #114 <Method String Uri.toString()>
	//   21   38:aastore         
	//   22   39:invokestatic    #135 <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.images.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #141 <Method void com.google.android.gms.common.images.zzb.zza(WebImage, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	final int zzaiI;
	private final Uri zzata;
	private final int zzrC;
	private final int zzrD;

	static 
	{
	//    0    0:new             #17  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzb()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
