// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//			MediaMetadataCompat, RatingCompat

public static final class MediaMetadataCompat$Builder
{

	private Bitmap scaleBitmap(Bitmap bitmap, int i)
	{
		float f = i;
	//    0    0:iload_2         
	//    1    1:i2f             
	//    2    2:fstore_3        
		f = Math.min(f / (float)bitmap.getWidth(), f / (float)bitmap.getHeight());
	//    3    3:fload_3         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #66  <Method int Bitmap.getWidth()>
	//    6    8:i2f             
	//    7    9:fdiv            
	//    8   10:fload_3         
	//    9   11:aload_1         
	//   10   12:invokevirtual   #63  <Method int Bitmap.getHeight()>
	//   11   15:i2f             
	//   12   16:fdiv            
	//   13   17:invokestatic    #81  <Method float Math.min(float, float)>
	//   14   20:fstore_3        
		i = (int)((float)bitmap.getHeight() * f);
	//   15   21:aload_1         
	//   16   22:invokevirtual   #63  <Method int Bitmap.getHeight()>
	//   17   25:i2f             
	//   18   26:fload_3         
	//   19   27:fmul            
	//   20   28:f2i             
	//   21   29:istore_2        
		return Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f), i, true);
	//   22   30:aload_1         
	//   23   31:aload_1         
	//   24   32:invokevirtual   #66  <Method int Bitmap.getWidth()>
	//   25   35:i2f             
	//   26   36:fload_3         
	//   27   37:fmul            
	//   28   38:f2i             
	//   29   39:iload_2         
	//   30   40:iconst_1        
	//   31   41:invokestatic    #85  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   32   44:areturn         
	}

	public MediaMetadataCompat build()
	{
		return new MediaMetadataCompat(mBundle);
	//    0    0:new             #6   <Class MediaMetadataCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Bundle mBundle>
	//    4    8:invokespecial   #88  <Method void MediaMetadataCompat(Bundle)>
	//    5   11:areturn         
	}

	public MediaMetadataCompat$Builder putBitmap(String s, Bitmap bitmap)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 2)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_2        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Bitmap").toString());
	//   11   27:new             #108 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #110 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #111 <Method void StringBuilder()>
	//   16   38:ldc1            #113 <String "The ">
	//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #119 <String " key cannot be used to put a Bitmap">
	//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (bitmap)));
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   30   68:aload_0         
	//   31   69:areturn         
		}
	}

	public MediaMetadataCompat$Builder putLong(String s, long l)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            58
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:ifeq            58
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a long").toString());
	//   10   26:new             #108 <Class IllegalArgumentException>
	//   11   29:dup             
	//   12   30:new             #110 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #111 <Method void StringBuilder()>
	//   15   37:ldc1            #113 <String "The ">
	//   16   39:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   17   42:aload_1         
	//   18   43:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:ldc1            #134 <String " key cannot be used to put a long">
	//   20   48:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   22   54:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   23   57:athrow          
		} else
		{
			mBundle.putLong(s, l);
	//   24   58:aload_0         
	//   25   59:getfield        #18  <Field Bundle mBundle>
	//   26   62:aload_1         
	//   27   63:lload_2         
	//   28   64:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
			return this;
	//   29   67:aload_0         
	//   30   68:areturn         
		}
	}

	public MediaMetadataCompat$Builder putRating(String s, RatingCompat ratingcompat)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_3        
	//*  10   24:icmpeq          59
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Rating").toString());
	//   11   27:new             #108 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #110 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #111 <Method void StringBuilder()>
	//   16   38:ldc1            #113 <String "The ">
	//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #141 <String " key cannot be used to put a Rating">
	//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  25   59:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   62:bipush          19
	//*  27   64:icmplt          84
		{
			mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
	//   28   67:aload_0         
	//   29   68:getfield        #18  <Field Bundle mBundle>
	//   30   71:aload_1         
	//   31   72:aload_2         
	//   32   73:invokevirtual   #152 <Method Object RatingCompat.getRating()>
	//   33   76:checkcast       #154 <Class Parcelable>
	//   34   79:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   35   82:aload_0         
	//   36   83:areturn         
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (ratingcompat)));
	//   37   84:aload_0         
	//   38   85:getfield        #18  <Field Bundle mBundle>
	//   39   88:aload_1         
	//   40   89:aload_2         
	//   41   90:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   42   93:aload_0         
	//   43   94:areturn         
		}
	}

	public MediaMetadataCompat$Builder putString(String s, String s1)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a String").toString());
	//   11   27:new             #108 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #110 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #111 <Method void StringBuilder()>
	//   16   38:ldc1            #113 <String "The ">
	//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #158 <String " key cannot be used to put a String">
	//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putCharSequence(s, ((CharSequence) (s1)));
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   30   68:aload_0         
	//   31   69:areturn         
		}
	}

	public MediaMetadataCompat$Builder putText(String s, CharSequence charsequence)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a CharSequence").toString());
	//   11   27:new             #108 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #110 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #111 <Method void StringBuilder()>
	//   16   38:ldc1            #113 <String "The ">
	//   17   40:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #166 <String " key cannot be used to put a CharSequence">
	//   21   49:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putCharSequence(s, charsequence);
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   30   68:aload_0         
	//   31   69:areturn         
		}
	}

	private final Bundle mBundle;

	public MediaMetadataCompat$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Bundle()>
	//    6   12:putfield        #18  <Field Bundle mBundle>
	//    7   15:return          
	}

	public MediaMetadataCompat$Builder(MediaMetadataCompat mediametadatacompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mBundle = new Bundle(mediametadatacompat.mBundle);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:getfield        #21  <Field Bundle MediaMetadataCompat.mBundle>
	//    7   13:invokespecial   #24  <Method void Bundle(Bundle)>
	//    8   16:putfield        #18  <Field Bundle mBundle>
	//    9   19:return          
	}

	public MediaMetadataCompat$Builder(MediaMetadataCompat mediametadatacompat, int i)
	{
		this(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void MediaMetadataCompat$Builder(MediaMetadataCompat)>
		mediametadatacompat = ((MediaMetadataCompat) (mBundle.keySet().iterator()));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Bundle mBundle>
	//    5    9:invokevirtual   #35  <Method Set Bundle.keySet()>
	//    6   12:invokeinterface #41  <Method Iterator Set.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!((Iterator) (mediametadatacompat)).hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            96
			String s = (String)((Iterator) (mediametadatacompat)).next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #51  <Method Object Iterator.next()>
	//   13   33:checkcast       #53  <Class String>
	//   14   36:astore_3        
			Object obj = mBundle.get(s);
	//   15   37:aload_0         
	//   16   38:getfield        #18  <Field Bundle mBundle>
	//   17   41:aload_3         
	//   18   42:invokevirtual   #57  <Method Object Bundle.get(String)>
	//   19   45:astore          4
			if(obj instanceof Bitmap)
	//*  20   47:aload           4
	//*  21   49:instanceof      #59  <Class Bitmap>
	//*  22   52:ifeq            18
			{
				obj = ((Object) ((Bitmap)obj));
	//   23   55:aload           4
	//   24   57:checkcast       #59  <Class Bitmap>
	//   25   60:astore          4
				if(((Bitmap) (obj)).getHeight() > i || ((Bitmap) (obj)).getWidth() > i)
	//*  26   62:aload           4
	//*  27   64:invokevirtual   #63  <Method int Bitmap.getHeight()>
	//*  28   67:iload_2         
	//*  29   68:icmpgt          80
	//*  30   71:aload           4
	//*  31   73:invokevirtual   #66  <Method int Bitmap.getWidth()>
	//*  32   76:iload_2         
	//*  33   77:icmple          18
					putBitmap(s, scaleBitmap(((Bitmap) (obj)), i));
	//   34   80:aload_0         
	//   35   81:aload_3         
	//   36   82:aload_0         
	//   37   83:aload           4
	//   38   85:iload_2         
	//   39   86:invokespecial   #70  <Method Bitmap scaleBitmap(Bitmap, int)>
	//   40   89:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
	//   41   92:pop             
			}
		} while(true);
	//   42   93:goto            18
	//   43   96:return          
	}
}
