// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
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
	//    5    5:invokevirtual   #71  <Method int Bitmap.getWidth()>
	//    6    8:i2f             
	//    7    9:fdiv            
	//    8   10:fload_3         
	//    9   11:aload_1         
	//   10   12:invokevirtual   #68  <Method int Bitmap.getHeight()>
	//   11   15:i2f             
	//   12   16:fdiv            
	//   13   17:invokestatic    #86  <Method float Math.min(float, float)>
	//   14   20:fstore_3        
		i = (int)((float)bitmap.getHeight() * f);
	//   15   21:aload_1         
	//   16   22:invokevirtual   #68  <Method int Bitmap.getHeight()>
	//   17   25:i2f             
	//   18   26:fload_3         
	//   19   27:fmul            
	//   20   28:f2i             
	//   21   29:istore_2        
		return Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f), i, true);
	//   22   30:aload_1         
	//   23   31:aload_1         
	//   24   32:invokevirtual   #71  <Method int Bitmap.getWidth()>
	//   25   35:i2f             
	//   26   36:fload_3         
	//   27   37:fmul            
	//   28   38:f2i             
	//   29   39:iload_2         
	//   30   40:iconst_1        
	//   31   41:invokestatic    #90  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   32   44:areturn         
	}

	public MediaMetadataCompat build()
	{
		return new MediaMetadataCompat(mBundle);
	//    0    0:new             #6   <Class MediaMetadataCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Bundle mBundle>
	//    4    8:invokespecial   #93  <Method void MediaMetadataCompat(Bundle)>
	//    5   11:areturn         
	}

	public MediaMetadataCompat$Builder putBitmap(String s, Bitmap bitmap)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 2)
	//*   0    0:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #103 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            70
	//*   4   10:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #106 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #108 <Class Integer>
	//*   8   20:invokevirtual   #111 <Method int Integer.intValue()>
	//*   9   23:iconst_2        
	//*  10   24:icmpne          30
	//*  11   27:goto            70
		{
			bitmap = ((Bitmap) (new StringBuilder()));
	//   12   30:new             #113 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #114 <Method void StringBuilder()>
	//   15   37:astore_2        
			((StringBuilder) (bitmap)).append("The ");
	//   16   38:aload_2         
	//   17   39:ldc1            #116 <String "The ">
	//   18   41:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			((StringBuilder) (bitmap)).append(s);
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (bitmap)).append(" key cannot be used to put a Bitmap");
	//   24   51:aload_2         
	//   25   52:ldc1            #122 <String " key cannot be used to put a Bitmap">
	//   26   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (bitmap)).toString());
	//   28   58:new             #124 <Class IllegalArgumentException>
	//   29   61:dup             
	//   30   62:aload_2         
	//   31   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   66:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   33   69:athrow          
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (bitmap)));
	//   34   70:aload_0         
	//   35   71:getfield        #18  <Field Bundle mBundle>
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokevirtual   #135 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   39   79:aload_0         
	//   40   80:areturn         
		}
	}

	public MediaMetadataCompat$Builder putLong(String s, long l)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
	//*   0    0:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #103 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            74
	//*   4   10:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #106 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #108 <Class Integer>
	//*   8   20:invokevirtual   #111 <Method int Integer.intValue()>
	//*   9   23:ifne            29
	//*  10   26:goto            74
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   29:new             #113 <Class StringBuilder>
	//   12   32:dup             
	//   13   33:invokespecial   #114 <Method void StringBuilder()>
	//   14   36:astore          4
			stringbuilder.append("The ");
	//   15   38:aload           4
	//   16   40:ldc1            #116 <String "The ">
	//   17   42:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   18   45:pop             
			stringbuilder.append(s);
	//   19   46:aload           4
	//   20   48:aload_1         
	//   21   49:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:pop             
			stringbuilder.append(" key cannot be used to put a long");
	//   23   53:aload           4
	//   24   55:ldc1            #139 <String " key cannot be used to put a long">
	//   25   57:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   27   61:new             #124 <Class IllegalArgumentException>
	//   28   64:dup             
	//   29   65:aload           4
	//   30   67:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   31   70:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   32   73:athrow          
		} else
		{
			mBundle.putLong(s, l);
	//   33   74:aload_0         
	//   34   75:getfield        #18  <Field Bundle mBundle>
	//   35   78:aload_1         
	//   36   79:lload_2         
	//   37   80:invokevirtual   #142 <Method void Bundle.putLong(String, long)>
			return this;
	//   38   83:aload_0         
	//   39   84:areturn         
		}
	}

	public MediaMetadataCompat$Builder putRating(String s, RatingCompat ratingcompat)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
	//*   0    0:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #103 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            70
	//*   4   10:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #106 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #108 <Class Integer>
	//*   8   20:invokevirtual   #111 <Method int Integer.intValue()>
	//*   9   23:iconst_3        
	//*  10   24:icmpne          30
	//*  11   27:goto            70
		{
			ratingcompat = ((RatingCompat) (new StringBuilder()));
	//   12   30:new             #113 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #114 <Method void StringBuilder()>
	//   15   37:astore_2        
			((StringBuilder) (ratingcompat)).append("The ");
	//   16   38:aload_2         
	//   17   39:ldc1            #116 <String "The ">
	//   18   41:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			((StringBuilder) (ratingcompat)).append(s);
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (ratingcompat)).append(" key cannot be used to put a Rating");
	//   24   51:aload_2         
	//   25   52:ldc1            #146 <String " key cannot be used to put a Rating">
	//   26   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (ratingcompat)).toString());
	//   28   58:new             #124 <Class IllegalArgumentException>
	//   29   61:dup             
	//   30   62:aload_2         
	//   31   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   66:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   33   69:athrow          
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  34   70:getstatic       #152 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   73:bipush          19
	//*  36   75:icmplt          95
		{
			mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
	//   37   78:aload_0         
	//   38   79:getfield        #18  <Field Bundle mBundle>
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:invokevirtual   #157 <Method Object RatingCompat.getRating()>
	//   42   87:checkcast       #159 <Class Parcelable>
	//   43   90:invokevirtual   #135 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   44   93:aload_0         
	//   45   94:areturn         
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (ratingcompat)));
	//   46   95:aload_0         
	//   47   96:getfield        #18  <Field Bundle mBundle>
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:invokevirtual   #135 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   51  104:aload_0         
	//   52  105:areturn         
		}
	}

	public MediaMetadataCompat$Builder putString(String s, String s1)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #103 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            70
	//*   4   10:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #106 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #108 <Class Integer>
	//*   8   20:invokevirtual   #111 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpne          30
	//*  11   27:goto            70
		{
			s1 = ((String) (new StringBuilder()));
	//   12   30:new             #113 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #114 <Method void StringBuilder()>
	//   15   37:astore_2        
			((StringBuilder) (s1)).append("The ");
	//   16   38:aload_2         
	//   17   39:ldc1            #116 <String "The ">
	//   18   41:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			((StringBuilder) (s1)).append(s);
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (s1)).append(" key cannot be used to put a String");
	//   24   51:aload_2         
	//   25   52:ldc1            #163 <String " key cannot be used to put a String">
	//   26   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
	//   28   58:new             #124 <Class IllegalArgumentException>
	//   29   61:dup             
	//   30   62:aload_2         
	//   31   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   66:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   33   69:athrow          
		} else
		{
			mBundle.putCharSequence(s, ((CharSequence) (s1)));
	//   34   70:aload_0         
	//   35   71:getfield        #18  <Field Bundle mBundle>
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokevirtual   #167 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   39   79:aload_0         
	//   40   80:areturn         
		}
	}

	public MediaMetadataCompat$Builder putText(String s, CharSequence charsequence)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #103 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            70
	//*   4   10:getstatic       #97  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #106 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #108 <Class Integer>
	//*   8   20:invokevirtual   #111 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpne          30
	//*  11   27:goto            70
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//   12   30:new             #113 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #114 <Method void StringBuilder()>
	//   15   37:astore_2        
			((StringBuilder) (charsequence)).append("The ");
	//   16   38:aload_2         
	//   17   39:ldc1            #116 <String "The ">
	//   18   41:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			((StringBuilder) (charsequence)).append(s);
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (charsequence)).append(" key cannot be used to put a CharSequence");
	//   24   51:aload_2         
	//   25   52:ldc1            #171 <String " key cannot be used to put a CharSequence">
	//   26   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//   28   58:new             #124 <Class IllegalArgumentException>
	//   29   61:dup             
	//   30   62:aload_2         
	//   31   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   66:invokespecial   #131 <Method void IllegalArgumentException(String)>
	//   33   69:athrow          
		} else
		{
			mBundle.putCharSequence(s, charsequence);
	//   34   70:aload_0         
	//   35   71:getfield        #18  <Field Bundle mBundle>
	//   36   74:aload_1         
	//   37   75:aload_2         
	//   38   76:invokevirtual   #167 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   39   79:aload_0         
	//   40   80:areturn         
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
		MediaSessionCompat.ensureClassLoader(mBundle);
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field Bundle mBundle>
	//   11   23:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
	//   12   26:return          
	}

	public MediaMetadataCompat$Builder(MediaMetadataCompat mediametadatacompat, int i)
	{
		this(mediametadatacompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void MediaMetadataCompat$Builder(MediaMetadataCompat)>
		mediametadatacompat = ((MediaMetadataCompat) (mBundle.keySet().iterator()));
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field Bundle mBundle>
	//    5    9:invokevirtual   #40  <Method Set Bundle.keySet()>
	//    6   12:invokeinterface #46  <Method Iterator Set.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!((Iterator) (mediametadatacompat)).hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            96
			String s = (String)((Iterator) (mediametadatacompat)).next();
	//   11   27:aload_1         
	//   12   28:invokeinterface #56  <Method Object Iterator.next()>
	//   13   33:checkcast       #58  <Class String>
	//   14   36:astore_3        
			Object obj = mBundle.get(s);
	//   15   37:aload_0         
	//   16   38:getfield        #18  <Field Bundle mBundle>
	//   17   41:aload_3         
	//   18   42:invokevirtual   #62  <Method Object Bundle.get(String)>
	//   19   45:astore          4
			if(obj instanceof Bitmap)
	//*  20   47:aload           4
	//*  21   49:instanceof      #64  <Class Bitmap>
	//*  22   52:ifeq            18
			{
				obj = ((Object) ((Bitmap)obj));
	//   23   55:aload           4
	//   24   57:checkcast       #64  <Class Bitmap>
	//   25   60:astore          4
				if(((Bitmap) (obj)).getHeight() > i || ((Bitmap) (obj)).getWidth() > i)
	//*  26   62:aload           4
	//*  27   64:invokevirtual   #68  <Method int Bitmap.getHeight()>
	//*  28   67:iload_2         
	//*  29   68:icmpgt          80
	//*  30   71:aload           4
	//*  31   73:invokevirtual   #71  <Method int Bitmap.getWidth()>
	//*  32   76:iload_2         
	//*  33   77:icmple          18
					putBitmap(s, scaleBitmap(((Bitmap) (obj)), i));
	//   34   80:aload_0         
	//   35   81:aload_3         
	//   36   82:aload_0         
	//   37   83:aload           4
	//   38   85:iload_2         
	//   39   86:invokespecial   #75  <Method Bitmap scaleBitmap(Bitmap, int)>
	//   40   89:invokevirtual   #79  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
	//   41   92:pop             
			}
		} while(true);
	//   42   93:goto            18
	//   43   96:return          
	}
}
