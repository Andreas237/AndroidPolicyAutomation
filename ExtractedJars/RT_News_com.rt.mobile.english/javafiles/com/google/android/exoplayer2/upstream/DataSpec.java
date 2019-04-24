// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Annotation;
import java.util.Arrays;

public final class DataSpec
{
	public static interface Flags
		extends Annotation
	{
	}


	public DataSpec(Uri uri1)
	{
		this(uri1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #29  <Method void DataSpec(Uri, int)>
	//    4    6:return          
	}

	public DataSpec(Uri uri1, int i)
	{
		this(uri1, 0L, -1L, ((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:ldc2w           #31  <Long -1L>
	//    4    6:aconst_null     
	//    5    7:iload_2         
	//    6    8:invokespecial   #35  <Method void DataSpec(Uri, long, long, String, int)>
	//    7   11:return          
	}

	public DataSpec(Uri uri1, long l, long l1, long l2, 
			String s, int i)
	{
		this(uri1, ((byte []) (null)), l, l1, l2, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:lload           6
	//    6    8:aload           8
	//    7   10:iload           9
	//    8   12:invokespecial   #39  <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
	//    9   15:return          
	}

	public DataSpec(Uri uri1, long l, long l1, String s)
	{
		this(uri1, l, l, l1, s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:iconst_0        
	//    7    9:invokespecial   #43  <Method void DataSpec(Uri, long, long, long, String, int)>
	//    8   12:return          
	}

	public DataSpec(Uri uri1, long l, long l1, String s, int i)
	{
		this(uri1, l, l, l1, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:iload           7
	//    7   10:invokespecial   #43  <Method void DataSpec(Uri, long, long, long, String, int)>
	//    8   13:return          
	}

	public DataSpec(Uri uri1, byte abyte0[], long l, long l1, long l2, String s, int i)
	{
		boolean flag;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
			boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          12
			if(l >= 0L)
	//*   4    7:lload_3         
	//*   5    8:lconst_0        
	//*   6    9:lcmp            
	//*   7   10:iflt            19
				flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          11
			else
	//*  10   16:goto            22
				flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          11
			Assertions.checkArgument(flag);
	//   13   22:iload           11
	//   14   24:invokestatic    #52  <Method void Assertions.checkArgument(boolean)>
			if(l1 >= 0L)
	//*  15   27:lload           5
	//*  16   29:lconst_0        
	//*  17   30:lcmp            
	//*  18   31:iflt            40
				flag = true;
	//   19   34:iconst_1        
	//   20   35:istore          11
			else
	//*  21   37:goto            43
				flag = false;
	//   22   40:iconst_0        
	//   23   41:istore          11
			Assertions.checkArgument(flag);
	//   24   43:iload           11
	//   25   45:invokestatic    #52  <Method void Assertions.checkArgument(boolean)>
			if(l2 <= 0L)
	//*  26   48:lload           7
	//*  27   50:lconst_0        
	//*  28   51:lcmp            
	//*  29   52:ifgt            68
			{
				flag = flag1;
	//   30   55:iload           12
	//   31   57:istore          11
				if(l2 != -1L)
					break label0;
	//   32   59:lload           7
	//   33   61:ldc2w           #31  <Long -1L>
	//   34   64:lcmp            
	//   35   65:ifne            71
			}
			flag = true;
	//   36   68:iconst_1        
	//   37   69:istore          11
		}
		Assertions.checkArgument(flag);
	//   38   71:iload           11
	//   39   73:invokestatic    #52  <Method void Assertions.checkArgument(boolean)>
		uri = uri1;
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:putfield        #54  <Field Uri uri>
		postBody = abyte0;
	//   43   81:aload_0         
	//   44   82:aload_2         
	//   45   83:putfield        #56  <Field byte[] postBody>
		absoluteStreamPosition = l;
	//   46   86:aload_0         
	//   47   87:lload_3         
	//   48   88:putfield        #58  <Field long absoluteStreamPosition>
		position = l1;
	//   49   91:aload_0         
	//   50   92:lload           5
	//   51   94:putfield        #60  <Field long position>
		length = l2;
	//   52   97:aload_0         
	//   53   98:lload           7
	//   54  100:putfield        #62  <Field long length>
		key = s;
	//   55  103:aload_0         
	//   56  104:aload           9
	//   57  106:putfield        #64  <Field String key>
		flags = i;
	//   58  109:aload_0         
	//   59  110:iload           10
	//   60  112:putfield        #66  <Field int flags>
	//   61  115:return          
	}

	public boolean isFlagSet(int i)
	{
		return (flags & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int flags>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public DataSpec subrange(long l)
	{
		long l2 = length;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long length>
	//    2    4:lstore          5
		long l1 = -1L;
	//    3    6:ldc2w           #31  <Long -1L>
	//    4    9:lstore_3        
		if(l2 != -1L)
	//*   5   10:lload           5
	//*   6   12:ldc2w           #31  <Long -1L>
	//*   7   15:lcmp            
	//*   8   16:ifne            22
	//*   9   19:goto            29
			l1 = length - l;
	//   10   22:aload_0         
	//   11   23:getfield        #62  <Field long length>
	//   12   26:lload_1         
	//   13   27:lsub            
	//   14   28:lstore_3        
		return subrange(l, l1);
	//   15   29:aload_0         
	//   16   30:lload_1         
	//   17   31:lload_3         
	//   18   32:invokevirtual   #73  <Method DataSpec subrange(long, long)>
	//   19   35:areturn         
	}

	public DataSpec subrange(long l, long l1)
	{
		if(l == 0L && length == l1)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            17
	//*   4    6:aload_0         
	//*   5    7:getfield        #62  <Field long length>
	//*   6   10:lload_3         
	//*   7   11:lcmp            
	//*   8   12:ifne            17
			return this;
	//    9   15:aload_0         
	//   10   16:areturn         
		else
			return new DataSpec(uri, postBody, absoluteStreamPosition + l, position + l, l1, key, flags);
	//   11   17:new             #2   <Class DataSpec>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:getfield        #54  <Field Uri uri>
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field byte[] postBody>
	//   17   29:aload_0         
	//   18   30:getfield        #58  <Field long absoluteStreamPosition>
	//   19   33:lload_1         
	//   20   34:ladd            
	//   21   35:aload_0         
	//   22   36:getfield        #60  <Field long position>
	//   23   39:lload_1         
	//   24   40:ladd            
	//   25   41:lload_3         
	//   26   42:aload_0         
	//   27   43:getfield        #64  <Field String key>
	//   28   46:aload_0         
	//   29   47:getfield        #66  <Field int flags>
	//   30   50:invokespecial   #39  <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
	//   31   53:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataSpec[");
	//    4    8:aload_1         
	//    5    9:ldc1            #80  <String "DataSpec[">
	//    6   11:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (uri)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #54  <Field Uri uri>
	//   11   20:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_1         
	//   14   25:ldc1            #89  <String ", ">
	//   15   27:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(Arrays.toString(postBody));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field byte[] postBody>
	//   20   36:invokestatic    #94  <Method String Arrays.toString(byte[])>
	//   21   39:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(", ");
	//   23   43:aload_1         
	//   24   44:ldc1            #89  <String ", ">
	//   25   46:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(absoluteStreamPosition);
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #58  <Field long absoluteStreamPosition>
	//   30   55:invokevirtual   #97  <Method StringBuilder StringBuilder.append(long)>
	//   31   58:pop             
		stringbuilder.append(", ");
	//   32   59:aload_1         
	//   33   60:ldc1            #89  <String ", ">
	//   34   62:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		stringbuilder.append(position);
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #60  <Field long position>
	//   39   71:invokevirtual   #97  <Method StringBuilder StringBuilder.append(long)>
	//   40   74:pop             
		stringbuilder.append(", ");
	//   41   75:aload_1         
	//   42   76:ldc1            #89  <String ", ">
	//   43   78:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
		stringbuilder.append(length);
	//   45   82:aload_1         
	//   46   83:aload_0         
	//   47   84:getfield        #62  <Field long length>
	//   48   87:invokevirtual   #97  <Method StringBuilder StringBuilder.append(long)>
	//   49   90:pop             
		stringbuilder.append(", ");
	//   50   91:aload_1         
	//   51   92:ldc1            #89  <String ", ">
	//   52   94:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   53   97:pop             
		stringbuilder.append(key);
	//   54   98:aload_1         
	//   55   99:aload_0         
	//   56  100:getfield        #64  <Field String key>
	//   57  103:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
		stringbuilder.append(", ");
	//   59  107:aload_1         
	//   60  108:ldc1            #89  <String ", ">
	//   61  110:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   62  113:pop             
		stringbuilder.append(flags);
	//   63  114:aload_1         
	//   64  115:aload_0         
	//   65  116:getfield        #66  <Field int flags>
	//   66  119:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   67  122:pop             
		stringbuilder.append("]");
	//   68  123:aload_1         
	//   69  124:ldc1            #102 <String "]">
	//   70  126:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   71  129:pop             
		return stringbuilder.toString();
	//   72  130:aload_1         
	//   73  131:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   74  134:areturn         
	}

	public DataSpec withUri(Uri uri1)
	{
		return new DataSpec(uri1, postBody, absoluteStreamPosition, position, length, key, flags);
	//    0    0:new             #2   <Class DataSpec>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field byte[] postBody>
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field long absoluteStreamPosition>
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field long position>
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field long length>
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field String key>
	//   13   25:aload_0         
	//   14   26:getfield        #66  <Field int flags>
	//   15   29:invokespecial   #39  <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
	//   16   32:areturn         
	}

	public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
	public static final int FLAG_ALLOW_GZIP = 1;
	public final long absoluteStreamPosition;
	public final int flags;
	public final String key;
	public final long length;
	public final long position;
	public final byte postBody[];
	public final Uri uri;
}
