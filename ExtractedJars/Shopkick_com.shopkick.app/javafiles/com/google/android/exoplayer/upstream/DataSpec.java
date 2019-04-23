// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import com.google.android.exoplayer.util.Assertions;
import java.util.Arrays;

public final class DataSpec
{

	public DataSpec(Uri uri1)
	{
		this(uri1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #23  <Method void DataSpec(Uri, int)>
	//    4    6:return          
	}

	public DataSpec(Uri uri1, int i)
	{
		this(uri1, 0L, -1L, ((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:ldc2w           #25  <Long -1L>
	//    4    6:aconst_null     
	//    5    7:iload_2         
	//    6    8:invokespecial   #29  <Method void DataSpec(Uri, long, long, String, int)>
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
	//    8   12:invokespecial   #33  <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
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
	//    7    9:invokespecial   #36  <Method void DataSpec(Uri, long, long, long, String, int)>
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
	//    7   10:invokespecial   #36  <Method void DataSpec(Uri, long, long, long, String, int)>
	//    8   13:return          
	}

	public DataSpec(Uri uri1, byte abyte0[], long l, long l1, long l2, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          12
		boolean flag;
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
	//   14   24:invokestatic    #45  <Method void Assertions.checkArgument(boolean)>
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
	//   25   45:invokestatic    #45  <Method void Assertions.checkArgument(boolean)>
		flag = flag1;
	//   26   48:iload           12
	//   27   50:istore          11
		if(l2 <= 0L)
	//*  28   52:lload           7
	//*  29   54:lconst_0        
	//*  30   55:lcmp            
	//*  31   56:ifgt            78
			if(l2 == -1L)
	//*  32   59:lload           7
	//*  33   61:ldc2w           #25  <Long -1L>
	//*  34   64:lcmp            
	//*  35   65:ifne            75
				flag = flag1;
	//   36   68:iload           12
	//   37   70:istore          11
			else
	//*  38   72:goto            78
				flag = false;
	//   39   75:iconst_0        
	//   40   76:istore          11
		Assertions.checkArgument(flag);
	//   41   78:iload           11
	//   42   80:invokestatic    #45  <Method void Assertions.checkArgument(boolean)>
		uri = uri1;
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:putfield        #47  <Field Uri uri>
		postBody = abyte0;
	//   46   88:aload_0         
	//   47   89:aload_2         
	//   48   90:putfield        #49  <Field byte[] postBody>
		absoluteStreamPosition = l;
	//   49   93:aload_0         
	//   50   94:lload_3         
	//   51   95:putfield        #51  <Field long absoluteStreamPosition>
		position = l1;
	//   52   98:aload_0         
	//   53   99:lload           5
	//   54  101:putfield        #53  <Field long position>
		length = l2;
	//   55  104:aload_0         
	//   56  105:lload           7
	//   57  107:putfield        #55  <Field long length>
		key = s;
	//   58  110:aload_0         
	//   59  111:aload           9
	//   60  113:putfield        #57  <Field String key>
		flags = i;
	//   61  116:aload_0         
	//   62  117:iload           10
	//   63  119:putfield        #59  <Field int flags>
	//   64  122:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataSpec[");
	//    4    8:aload_1         
	//    5    9:ldc1            #66  <String "DataSpec[">
	//    6   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (uri)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #47  <Field Uri uri>
	//   11   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_1         
	//   14   25:ldc1            #75  <String ", ">
	//   15   27:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(Arrays.toString(postBody));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #49  <Field byte[] postBody>
	//   20   36:invokestatic    #80  <Method String Arrays.toString(byte[])>
	//   21   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(", ");
	//   23   43:aload_1         
	//   24   44:ldc1            #75  <String ", ">
	//   25   46:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(absoluteStreamPosition);
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #51  <Field long absoluteStreamPosition>
	//   30   55:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   31   58:pop             
		stringbuilder.append(", ");
	//   32   59:aload_1         
	//   33   60:ldc1            #75  <String ", ">
	//   34   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		stringbuilder.append(position);
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #53  <Field long position>
	//   39   71:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   40   74:pop             
		stringbuilder.append(", ");
	//   41   75:aload_1         
	//   42   76:ldc1            #75  <String ", ">
	//   43   78:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
		stringbuilder.append(length);
	//   45   82:aload_1         
	//   46   83:aload_0         
	//   47   84:getfield        #55  <Field long length>
	//   48   87:invokevirtual   #83  <Method StringBuilder StringBuilder.append(long)>
	//   49   90:pop             
		stringbuilder.append(", ");
	//   50   91:aload_1         
	//   51   92:ldc1            #75  <String ", ">
	//   52   94:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   53   97:pop             
		stringbuilder.append(key);
	//   54   98:aload_1         
	//   55   99:aload_0         
	//   56  100:getfield        #57  <Field String key>
	//   57  103:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
		stringbuilder.append(", ");
	//   59  107:aload_1         
	//   60  108:ldc1            #75  <String ", ">
	//   61  110:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   62  113:pop             
		stringbuilder.append(flags);
	//   63  114:aload_1         
	//   64  115:aload_0         
	//   65  116:getfield        #59  <Field int flags>
	//   66  119:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   67  122:pop             
		stringbuilder.append("]");
	//   68  123:aload_1         
	//   69  124:ldc1            #88  <String "]">
	//   70  126:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   71  129:pop             
		return stringbuilder.toString();
	//   72  130:aload_1         
	//   73  131:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   74  134:areturn         
	}

	public static final int FLAG_ALLOW_GZIP = 1;
	public final long absoluteStreamPosition;
	public final int flags;
	public final String key;
	public final long length;
	public final long position;
	public final byte postBody[];
	public final Uri uri;
}
