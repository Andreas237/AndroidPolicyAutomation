// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.util.Assertions;
import java.util.Comparator;

public class Format
{
	public static final class DecreasingBandwidthComparator
		implements Comparator
	{

		public int compare(Format format, Format format1)
		{
			return format1.bitrate - format.bitrate;
		//    0    0:aload_2         
		//    1    1:getfield        #21  <Field int Format.bitrate>
		//    2    4:aload_1         
		//    3    5:getfield        #21  <Field int Format.bitrate>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Format)obj, (Format)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class Format>
		//    3    5:aload_2         
		//    4    6:checkcast       #9   <Class Format>
		//    5    9:invokevirtual   #24  <Method int compare(Format, Format)>
		//    6   12:ireturn         
		}

		public DecreasingBandwidthComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public Format(String s, String s1, int i, int j, float f, int k, int l, 
			int i1)
	{
		this(s, s1, i, j, f, k, l, i1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:fload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:aconst_null     
	//   10   15:invokespecial   #25  <Method void Format(String, String, int, int, float, int, int, int, String)>
	//   11   18:return          
	}

	public Format(String s, String s1, int i, int j, float f, int k, int l, 
			int i1, String s2)
	{
		this(s, s1, i, j, f, k, l, i1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:fload           5
	//    6    8:iload           6
	//    7   10:iload           7
	//    8   12:iload           8
	//    9   14:aload           9
	//   10   16:aconst_null     
	//   11   17:invokespecial   #29  <Method void Format(String, String, int, int, float, int, int, int, String, String)>
	//   12   20:return          
	}

	public Format(String s, String s1, int i, int j, float f, int k, int l, 
			int i1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		id = (String)Assertions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #40  <Class String>
	//    6   12:putfield        #42  <Field String id>
		mimeType = s1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #44  <Field String mimeType>
		width = i;
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:putfield        #46  <Field int width>
		height = j;
	//   13   25:aload_0         
	//   14   26:iload           4
	//   15   28:putfield        #48  <Field int height>
		frameRate = f;
	//   16   31:aload_0         
	//   17   32:fload           5
	//   18   34:putfield        #50  <Field float frameRate>
		audioChannels = k;
	//   19   37:aload_0         
	//   20   38:iload           6
	//   21   40:putfield        #52  <Field int audioChannels>
		audioSamplingRate = l;
	//   22   43:aload_0         
	//   23   44:iload           7
	//   24   46:putfield        #54  <Field int audioSamplingRate>
		bitrate = i1;
	//   25   49:aload_0         
	//   26   50:iload           8
	//   27   52:putfield        #56  <Field int bitrate>
		language = s2;
	//   28   55:aload_0         
	//   29   56:aload           9
	//   30   58:putfield        #58  <Field String language>
		codecs = s3;
	//   31   61:aload_0         
	//   32   62:aload           10
	//   33   64:putfield        #60  <Field String codecs>
	//   34   67:return          
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          40
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #66  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #66  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            40
			return ((Format)obj).id.equals(((Object) (id)));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class Format>
	//   15   29:getfield        #42  <Field String id>
	//   16   32:aload_0         
	//   17   33:getfield        #42  <Field String id>
	//   18   36:invokevirtual   #68  <Method boolean String.equals(Object)>
	//   19   39:ireturn         
		else
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public int hashCode()
	{
		return id.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String id>
	//    2    4:invokevirtual   #72  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final int audioChannels;
	public final int audioSamplingRate;
	public final int bitrate;
	public final String codecs;
	public final float frameRate;
	public final int height;
	public final String id;
	public final String language;
	public final String mimeType;
	public final int width;
}
