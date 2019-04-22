// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			Path, CompoundWrite

public class UserWriteRecord
{

	public UserWriteRecord(long l, Path path1, CompoundWrite compoundwrite)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		writeId = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long writeId>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field Path path>
		overwrite = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #25  <Field Node overwrite>
		merge = compoundwrite;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field CompoundWrite merge>
		visible = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #29  <Field boolean visible>
	//   17   30:return          
	}

	public UserWriteRecord(long l, Path path1, Node node, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		writeId = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long writeId>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field Path path>
		overwrite = node;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #25  <Field Node overwrite>
		merge = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #27  <Field CompoundWrite merge>
		visible = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field boolean visible>
	//   17   31:return          
	}

	public boolean equals(Object obj)
	{
label0:
		{
label1:
			{
				if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
					return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
				if(obj == null)
					break label0;
	//    5    7:aload_1         
	//    6    8:ifnull          137
				if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
					return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
				obj = ((Object) ((UserWriteRecord)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class UserWriteRecord>
	//   16   28:astore_1        
				if(writeId != ((UserWriteRecord) (obj)).writeId)
	//*  17   29:aload_0         
	//*  18   30:getfield        #21  <Field long writeId>
	//*  19   33:aload_1         
	//*  20   34:getfield        #21  <Field long writeId>
	//*  21   37:lcmp            
	//*  22   38:ifeq            43
					return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
				if(!path.equals(((Object) (((UserWriteRecord) (obj)).path))))
	//*  25   43:aload_0         
	//*  26   44:getfield        #23  <Field Path path>
	//*  27   47:aload_1         
	//*  28   48:getfield        #23  <Field Path path>
	//*  29   51:invokevirtual   #41  <Method boolean Path.equals(Object)>
	//*  30   54:ifne            59
					return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
				if(visible != ((UserWriteRecord) (obj)).visible)
	//*  33   59:aload_0         
	//*  34   60:getfield        #29  <Field boolean visible>
	//*  35   63:aload_1         
	//*  36   64:getfield        #29  <Field boolean visible>
	//*  37   67:icmpeq          72
					return false;
	//   38   70:iconst_0        
	//   39   71:ireturn         
				Object obj1 = ((Object) (overwrite));
	//   40   72:aload_0         
	//   41   73:getfield        #25  <Field Node overwrite>
	//   42   76:astore_2        
				if(obj1 == null ? ((UserWriteRecord) (obj)).overwrite != null : !obj1.equals(((Object) (((UserWriteRecord) (obj)).overwrite))))
	//*  43   77:aload_2         
	//*  44   78:ifnull          95
	//*  45   81:aload_2         
	//*  46   82:aload_1         
	//*  47   83:getfield        #25  <Field Node overwrite>
	//*  48   86:invokevirtual   #42  <Method boolean Object.equals(Object)>
	//*  49   89:ifeq            102
	//*  50   92:goto            104
	//*  51   95:aload_1         
	//*  52   96:getfield        #25  <Field Node overwrite>
	//*  53   99:ifnull          104
					return false;
	//   54  102:iconst_0        
	//   55  103:ireturn         
				obj1 = ((Object) (merge));
	//   56  104:aload_0         
	//   57  105:getfield        #27  <Field CompoundWrite merge>
	//   58  108:astore_2        
				if(obj1 != null)
	//*  59  109:aload_2         
	//*  60  110:ifnull          126
				{
					if(((CompoundWrite) (obj1)).equals(((Object) (((UserWriteRecord) (obj)).merge))))
	//*  61  113:aload_2         
	//*  62  114:aload_1         
	//*  63  115:getfield        #27  <Field CompoundWrite merge>
	//*  64  118:invokevirtual   #45  <Method boolean CompoundWrite.equals(Object)>
	//*  65  121:ifeq            133
						return true;
	//   66  124:iconst_1        
	//   67  125:ireturn         
				} else
				if(((UserWriteRecord) (obj)).merge == null)
					break label1;
	//   68  126:aload_1         
	//   69  127:getfield        #27  <Field CompoundWrite merge>
	//   70  130:ifnull          135
				return false;
	//   71  133:iconst_0        
	//   72  134:ireturn         
			}
			return true;
	//   73  135:iconst_1        
	//   74  136:ireturn         
		}
		return false;
	//   75  137:iconst_0        
	//   76  138:ireturn         
	}

	public CompoundWrite getMerge()
	{
		CompoundWrite compoundwrite = merge;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CompoundWrite merge>
	//    2    4:astore_1        
		if(compoundwrite != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return compoundwrite;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
	//    7   11:new             #49  <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #51  <String "Can't access merge when write is an overwrite!">
	//   10   17:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
	}

	public Node getOverwrite()
	{
		Node node = overwrite;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Node overwrite>
	//    2    4:astore_1        
		if(node != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return node;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
	//    7   11:new             #49  <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #58  <String "Can't access overwrite when write is a merge!">
	//   10   17:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Path path>
	//    2    4:areturn         
	}

	public long getWriteId()
	{
		return writeId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long writeId>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		int k = Long.valueOf(writeId).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long writeId>
	//    2    4:invokestatic    #70  <Method Long Long.valueOf(long)>
	//    3    7:invokevirtual   #72  <Method int Long.hashCode()>
	//    4   10:istore_3        
		int l = Boolean.valueOf(visible).hashCode();
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field boolean visible>
	//    7   15:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:invokevirtual   #78  <Method int Boolean.hashCode()>
	//    9   21:istore          4
		int i1 = path.hashCode();
	//   10   23:aload_0         
	//   11   24:getfield        #23  <Field Path path>
	//   12   27:invokevirtual   #79  <Method int Path.hashCode()>
	//   13   30:istore          5
		Object obj = ((Object) (overwrite));
	//   14   32:aload_0         
	//   15   33:getfield        #25  <Field Node overwrite>
	//   16   36:astore          6
		int j = 0;
	//   17   38:iconst_0        
	//   18   39:istore_2        
		int i;
		if(obj != null)
	//*  19   40:aload           6
	//*  20   42:ifnull          54
			i = obj.hashCode();
	//   21   45:aload           6
	//   22   47:invokevirtual   #80  <Method int Object.hashCode()>
	//   23   50:istore_1        
		else
	//*  24   51:goto            56
			i = 0;
	//   25   54:iconst_0        
	//   26   55:istore_1        
		obj = ((Object) (merge));
	//   27   56:aload_0         
	//   28   57:getfield        #27  <Field CompoundWrite merge>
	//   29   60:astore          6
		if(obj != null)
	//*  30   62:aload           6
	//*  31   64:ifnull          73
			j = ((CompoundWrite) (obj)).hashCode();
	//   32   67:aload           6
	//   33   69:invokevirtual   #81  <Method int CompoundWrite.hashCode()>
	//   34   72:istore_2        
		return (((k * 31 + l) * 31 + i1) * 31 + i) * 31 + j;
	//   35   73:iload_3         
	//   36   74:bipush          31
	//   37   76:imul            
	//   38   77:iload           4
	//   39   79:iadd            
	//   40   80:bipush          31
	//   41   82:imul            
	//   42   83:iload           5
	//   43   85:iadd            
	//   44   86:bipush          31
	//   45   88:imul            
	//   46   89:iload_1         
	//   47   90:iadd            
	//   48   91:bipush          31
	//   49   93:imul            
	//   50   94:iload_2         
	//   51   95:iadd            
	//   52   96:ireturn         
	}

	public boolean isMerge()
	{
		return merge != null;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CompoundWrite merge>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isOverwrite()
	{
		return overwrite != null;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Node overwrite>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isVisible()
	{
		return visible;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean visible>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #89  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("UserWriteRecord{id=");
	//    4    8:aload_1         
	//    5    9:ldc1            #92  <String "UserWriteRecord{id=">
	//    6   11:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(writeId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field long writeId>
	//   11   20:invokevirtual   #99  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append(" path=");
	//   13   24:aload_1         
	//   14   25:ldc1            #101 <String " path=">
	//   15   27:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (path)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field Path path>
	//   20   36:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(" visible=");
	//   22   40:aload_1         
	//   23   41:ldc1            #106 <String " visible=">
	//   24   43:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(visible);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #29  <Field boolean visible>
	//   29   52:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(" overwrite=");
	//   31   56:aload_1         
	//   32   57:ldc1            #111 <String " overwrite=">
	//   33   59:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (overwrite)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #25  <Field Node overwrite>
	//   38   68:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		stringbuilder.append(" merge=");
	//   40   72:aload_1         
	//   41   73:ldc1            #113 <String " merge=">
	//   42   75:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(((Object) (merge)));
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #27  <Field CompoundWrite merge>
	//   47   84:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
		stringbuilder.append("}");
	//   49   88:aload_1         
	//   50   89:ldc1            #115 <String "}">
	//   51   91:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		return stringbuilder.toString();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   55   99:areturn         
	}

	private final CompoundWrite merge;
	private final Node overwrite;
	private final Path path;
	private final boolean visible;
	private final long writeId;
}
