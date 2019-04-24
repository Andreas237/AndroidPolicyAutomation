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
	//   13   17:invokestatic    #103 <Method float Math.min(float, float)>
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
	//   31   41:invokestatic    #107 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   32   44:areturn         
	}

	public MediaMetadataCompat build()
	{
		return new MediaMetadataCompat(mBundle);
	//    0    0:new             #6   <Class MediaMetadataCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Bundle mBundle>
	//    4    8:invokespecial   #110 <Method void MediaMetadataCompat(Bundle)>
	//    5   11:areturn         
	}

	public MediaMetadataCompat$Builder putBitmap(String s, Bitmap bitmap)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 2)
	//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #124 <Class Integer>
	//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
	//*   9   23:iconst_2        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Bitmap").toString());
	//   11   27:new             #129 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #131 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #132 <Method void StringBuilder()>
	//   16   38:ldc1            #134 <String "The ">
	//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #140 <String " key cannot be used to put a Bitmap">
	//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putParcelable(s, ((Parcelable) (bitmap)));
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   30   68:aload_0         
	//   31   69:areturn         
		}
	}

	public MediaMetadataCompat$Builder putLong(String s, long l)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 0)
	//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            58
	//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #124 <Class Integer>
	//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
	//*   9   23:ifeq            58
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a long").toString());
	//   10   26:new             #129 <Class IllegalArgumentException>
	//   11   29:dup             
	//   12   30:new             #131 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #132 <Method void StringBuilder()>
	//   15   37:ldc1            #134 <String "The ">
	//   16   39:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   17   42:aload_1         
	//   18   43:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:ldc1            #155 <String " key cannot be used to put a long">
	//   20   48:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   22   54:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   23   57:athrow          
		} else
		{
			mBundle.putLong(s, l);
	//   24   58:aload_0         
	//   25   59:getfield        #18  <Field Bundle mBundle>
	//   26   62:aload_1         
	//   27   63:lload_2         
	//   28   64:invokevirtual   #158 <Method void Bundle.putLong(String, long)>
			return this;
	//   29   67:aload_0         
	//   30   68:areturn         
		}
	}

	public MediaMetadataCompat$Builder putRating(String s, RatingCompat ratingcompat)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 3)
	//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #124 <Class Integer>
	//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
	//*   9   23:iconst_3        
	//*  10   24:icmpeq          59
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a Rating").toString());
	//   11   27:new             #129 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #131 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #132 <Method void StringBuilder()>
	//   16   38:ldc1            #134 <String "The ">
	//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #162 <String " key cannot be used to put a Rating">
	//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  25   59:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   62:bipush          19
	//*  27   64:icmplt          84
		{
			mBundle.putParcelable(s, (Parcelable)ratingcompat.getRating());
	//   28   67:aload_0         
	//   29   68:getfield        #18  <Field Bundle mBundle>
	//   30   71:aload_1         
	//   31   72:aload_2         
	//   32   73:invokevirtual   #167 <Method Object RatingCompat.getRating()>
	//   33   76:checkcast       #169 <Class Parcelable>
	//   34   79:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
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
	//   41   90:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
			return this;
	//   42   93:aload_0         
	//   43   94:areturn         
		}
	}

	public MediaMetadataCompat$Builder putString(String s, String s1)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #124 <Class Integer>
	//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a String").toString());
	//   11   27:new             #129 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #131 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #132 <Method void StringBuilder()>
	//   16   38:ldc1            #134 <String "The ">
	//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #173 <String " key cannot be used to put a String">
	//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putCharSequence(s, ((CharSequence) (s1)));
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #177 <Method void Bundle.putCharSequence(String, CharSequence)>
			return this;
	//   30   68:aload_0         
	//   31   69:areturn         
		}
	}

	public MediaMetadataCompat$Builder putText(String s, CharSequence charsequence)
	{
		if(MediaMetadataCompat.METADATA_KEYS_TYPE.containsKey(((Object) (s))) && ((Integer)MediaMetadataCompat.METADATA_KEYS_TYPE.get(((Object) (s)))).intValue() != 1)
	//*   0    0:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #119 <Method boolean ArrayMap.containsKey(Object)>
	//*   3    7:ifeq            59
	//*   4   10:getstatic       #114 <Field ArrayMap MediaMetadataCompat.METADATA_KEYS_TYPE>
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #122 <Method Object ArrayMap.get(Object)>
	//*   7   17:checkcast       #124 <Class Integer>
	//*   8   20:invokevirtual   #127 <Method int Integer.intValue()>
	//*   9   23:iconst_1        
	//*  10   24:icmpeq          59
		{
			throw new IllegalArgumentException((new StringBuilder()).append("The ").append(s).append(" key cannot be used to put a CharSequence").toString());
	//   11   27:new             #129 <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #131 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #132 <Method void StringBuilder()>
	//   16   38:ldc1            #134 <String "The ">
	//   17   40:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #181 <String " key cannot be used to put a CharSequence">
	//   21   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #147 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		} else
		{
			mBundle.putCharSequence(s, charsequence);
	//   25   59:aload_0         
	//   26   60:getfield        #18  <Field Bundle mBundle>
	//   27   63:aload_1         
	//   28   64:aload_2         
	//   29   65:invokevirtual   #177 <Method void Bundle.putCharSequence(String, CharSequence)>
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
	//   10   24:ifeq            147
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
			if(obj != null && (obj instanceof Bitmap))
	//*  20   47:aload           4
	//*  21   49:ifnull          144
	//*  22   52:aload           4
	//*  23   54:instanceof      #59  <Class Bitmap>
	//*  24   57:ifeq            144
			{
				obj = ((Object) ((Bitmap)obj));
	//   25   60:aload           4
	//   26   62:checkcast       #59  <Class Bitmap>
	//   27   65:astore          4
				if(((Bitmap) (obj)).getHeight() > i || ((Bitmap) (obj)).getWidth() > i)
	//*  28   67:aload           4
	//*  29   69:invokevirtual   #63  <Method int Bitmap.getHeight()>
	//*  30   72:iload_2         
	//*  31   73:icmpgt          85
	//*  32   76:aload           4
	//*  33   78:invokevirtual   #66  <Method int Bitmap.getWidth()>
	//*  34   81:iload_2         
	//*  35   82:icmple          101
					putBitmap(s, scaleBitmap(((Bitmap) (obj)), i));
	//   36   85:aload_0         
	//   37   86:aload_3         
	//   38   87:aload_0         
	//   39   88:aload           4
	//   40   90:iload_2         
	//   41   91:invokespecial   #70  <Method Bitmap scaleBitmap(Bitmap, int)>
	//   42   94:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
	//   43   97:pop             
				else
	//*  44   98:goto            144
				if(android.os.Build.VERSION.SDK_INT >= 14 && (s.equals("android.media.metadata.ART") || s.equals("android.media.metadata.ALBUM_ART")))
	//*  45  101:getstatic       #80  <Field int android.os.Build$VERSION.SDK_INT>
	//*  46  104:bipush          14
	//*  47  106:icmplt          144
	//*  48  109:aload_3         
	//*  49  110:ldc1            #82  <String "android.media.metadata.ART">
	//*  50  112:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  51  115:ifne            127
	//*  52  118:aload_3         
	//*  53  119:ldc1            #88  <String "android.media.metadata.ALBUM_ART">
	//*  54  121:invokevirtual   #86  <Method boolean String.equals(Object)>
	//*  55  124:ifeq            144
					putBitmap(s, ((Bitmap) (obj)).copy(((Bitmap) (obj)).getConfig(), false));
	//   56  127:aload_0         
	//   57  128:aload_3         
	//   58  129:aload           4
	//   59  131:aload           4
	//   60  133:invokevirtual   #92  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   61  136:iconst_0        
	//   62  137:invokevirtual   #96  <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   63  140:invokevirtual   #74  <Method MediaMetadataCompat$Builder putBitmap(String, Bitmap)>
	//   64  143:pop             
			}
		} while(true);
	//   65  144:goto            18
	//   66  147:return          
	}
}
