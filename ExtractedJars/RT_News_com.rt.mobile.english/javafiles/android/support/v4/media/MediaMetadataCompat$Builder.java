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
	//*   3    7:ifeq            67
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_2        
	//*  10   24:icmpeq          67
		{
			bitmap = ((Bitmap) (new StringBuilder()));
	//   11   27:new             #108 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #109 <Method void StringBuilder()>
	//   14   34:astore_2        
			((StringBuilder) (bitmap)).append("The ");
	//   15   35:aload_2         
	//   16   36:ldc1            #111 <String "The ">
	//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			((StringBuilder) (bitmap)).append(s);
	//   19   42:aload_2         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			((StringBuilder) (bitmap)).append(" key cannot be used to put a Bitmap");
	//   23   48:aload_2         
	//   24   49:ldc1            #117 <String " key cannot be used to put a Bitmap">
	//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			throw new IllegalArgumentException(((StringBuilder) (bitmap)).toString());
	//   27   55:new             #119 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (bitmap)));
	//   33   67:aload_0         
	//   34   68:getfield        #18  <Field Bundle mBundle>
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   38   76:aload_0         
	//   39   77:areturn         
		}
	}

	public MediaMetadataCompat$Builder putLong(String s, long l)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            71
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:ifeq            71
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   26:new             #108 <Class StringBuilder>
	//   11   29:dup             
	//   12   30:invokespecial   #109 <Method void StringBuilder()>
	//   13   33:astore          4
			stringbuilder.append("The ");
	//   14   35:aload           4
	//   15   37:ldc1            #111 <String "The ">
	//   16   39:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   17   42:pop             
			stringbuilder.append(s);
	//   18   43:aload           4
	//   19   45:aload_1         
	//   20   46:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:pop             
			stringbuilder.append(" key cannot be used to put a long");
	//   22   50:aload           4
	//   23   52:ldc1            #134 <String " key cannot be used to put a long">
	//   24   54:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   26   58:new             #119 <Class IllegalArgumentException>
	//   27   61:dup             
	//   28   62:aload           4
	//   29   64:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   30   67:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   31   70:athrow          
		} else
		{
			mBundle.putLong(s, l);
	//   32   71:aload_0         
	//   33   72:getfield        #18  <Field Bundle mBundle>
	//   34   75:aload_1         
	//   35   76:lload_2         
	//   36   77:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
			return this;
	//   37   80:aload_0         
	//   38   81:areturn         
		}
	}

	public MediaMetadataCompat$Builder putRating(String s, RatingCompat ratingcompat)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            67
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_3        
	//*  10   24:icmpeq          67
		{
			ratingcompat = ((RatingCompat) (new StringBuilder()));
	//   11   27:new             #108 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #109 <Method void StringBuilder()>
	//   14   34:astore_2        
			((StringBuilder) (ratingcompat)).append("The ");
	//   15   35:aload_2         
	//   16   36:ldc1            #111 <String "The ">
	//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			((StringBuilder) (ratingcompat)).append(s);
	//   19   42:aload_2         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			((StringBuilder) (ratingcompat)).append(" key cannot be used to put a Rating");
	//   23   48:aload_2         
	//   24   49:ldc1            #141 <String " key cannot be used to put a Rating">
	//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			throw new IllegalArgumentException(((StringBuilder) (ratingcompat)).toString());
	//   27   55:new             #119 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  33   67:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   70:bipush          19
	//*  35   72:icmplt          92
		{
			mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
	//   36   75:aload_0         
	//   37   76:getfield        #18  <Field Bundle mBundle>
	//   38   79:aload_1         
	//   39   80:aload_2         
	//   40   81:invokevirtual   #152 <Method Object RatingCompat.getRating()>
	//   41   84:checkcast       #154 <Class Parcelable>
	//   42   87:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   43   90:aload_0         
	//   44   91:areturn         
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (ratingcompat)));
	//   45   92:aload_0         
	//   46   93:getfield        #18  <Field Bundle mBundle>
	//   47   96:aload_1         
	//   48   97:aload_2         
	//   49   98:invokevirtual   #130 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   50  101:aload_0         
	//   51  102:areturn         
		}
	}

	public MediaMetadataCompat$Builder putString(String s, String s1)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            67
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          67
		{
			s1 = ((String) (new StringBuilder()));
	//   11   27:new             #108 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #109 <Method void StringBuilder()>
	//   14   34:astore_2        
			((StringBuilder) (s1)).append("The ");
	//   15   35:aload_2         
	//   16   36:ldc1            #111 <String "The ">
	//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			((StringBuilder) (s1)).append(s);
	//   19   42:aload_2         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			((StringBuilder) (s1)).append(" key cannot be used to put a String");
	//   23   48:aload_2         
	//   24   49:ldc1            #158 <String " key cannot be used to put a String">
	//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			throw new IllegalArgumentException(((StringBuilder) (s1)).toString());
	//   27   55:new             #119 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		} else
		{
			mBundle.putCharSequence(s, ((CharSequence) (s1)));
	//   33   67:aload_0         
	//   34   68:getfield        #18  <Field Bundle mBundle>
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   38   76:aload_0         
	//   39   77:areturn         
		}
	}

	public MediaMetadataCompat$Builder putText(String s, CharSequence charsequence)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            67
	//*   4   10:getstatic       #92  <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #101 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #103 <Class Integer>
	//*   8   20:invokevirtual   #106 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          67
		{
			charsequence = ((CharSequence) (new StringBuilder()));
	//   11   27:new             #108 <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #109 <Method void StringBuilder()>
	//   14   34:astore_2        
			((StringBuilder) (charsequence)).append("The ");
	//   15   35:aload_2         
	//   16   36:ldc1            #111 <String "The ">
	//   17   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			((StringBuilder) (charsequence)).append(s);
	//   19   42:aload_2         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			((StringBuilder) (charsequence)).append(" key cannot be used to put a CharSequence");
	//   23   48:aload_2         
	//   24   49:ldc1            #166 <String " key cannot be used to put a CharSequence">
	//   25   51:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			throw new IllegalArgumentException(((StringBuilder) (charsequence)).toString());
	//   27   55:new             #119 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #126 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		} else
		{
			mBundle.putCharSequence(s, charsequence);
	//   33   67:aload_0         
	//   34   68:getfield        #18  <Field Bundle mBundle>
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:invokevirtual   #162 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   38   76:aload_0         
	//   39   77:areturn         
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
