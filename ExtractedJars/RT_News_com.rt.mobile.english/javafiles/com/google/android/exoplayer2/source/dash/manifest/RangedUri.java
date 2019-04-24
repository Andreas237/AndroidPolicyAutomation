// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.UriUtil;

public final class RangedUri
{

	public RangedUri(String s, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(s == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       15
			s1 = "";
	//    6   11:ldc1            #19  <String "">
	//    7   13:astore          6
		referenceUri = s1;
	//    8   15:aload_0         
	//    9   16:aload           6
	//   10   18:putfield        #21  <Field String referenceUri>
		start = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #23  <Field long start>
		length = l1;
	//   14   26:aload_0         
	//   15   27:lload           4
	//   16   29:putfield        #25  <Field long length>
	//   17   32:return          
	}

	public RangedUri attemptMerge(RangedUri rangeduri, String s)
	{
		String s1 = resolveUriString(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method String resolveUriString(String)>
	//    3    5:astore          7
		if(rangeduri != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          178
		{
			if(!s1.equals(((Object) (rangeduri.resolveUriString(s)))))
	//*   6   11:aload           7
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #33  <Method String resolveUriString(String)>
	//*  10   18:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*  11   21:ifne            26
				return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
			long l1 = length;
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field long length>
	//   16   30:lstore          5
			long l = -1L;
	//   17   32:ldc2w           #40  <Long -1L>
	//   18   35:lstore_3        
			if(l1 != -1L && start + length == rangeduri.start)
	//*  19   36:lload           5
	//*  20   38:ldc2w           #40  <Long -1L>
	//*  21   41:lcmp            
	//*  22   42:ifeq            105
	//*  23   45:aload_0         
	//*  24   46:getfield        #23  <Field long start>
	//*  25   49:aload_0         
	//*  26   50:getfield        #25  <Field long length>
	//*  27   53:ladd            
	//*  28   54:aload_1         
	//*  29   55:getfield        #23  <Field long start>
	//*  30   58:lcmp            
	//*  31   59:ifne            105
			{
				long l2 = start;
	//   32   62:aload_0         
	//   33   63:getfield        #23  <Field long start>
	//   34   66:lstore          5
				if(rangeduri.length != -1L)
	//*  35   68:aload_1         
	//*  36   69:getfield        #25  <Field long length>
	//*  37   72:ldc2w           #40  <Long -1L>
	//*  38   75:lcmp            
	//*  39   76:ifne            82
	//*  40   79:goto            92
					l = length + rangeduri.length;
	//   41   82:aload_0         
	//   42   83:getfield        #25  <Field long length>
	//   43   86:aload_1         
	//   44   87:getfield        #25  <Field long length>
	//   45   90:ladd            
	//   46   91:lstore_3        
				return new RangedUri(s1, l2, l);
	//   47   92:new             #2   <Class RangedUri>
	//   48   95:dup             
	//   49   96:aload           7
	//   50   98:lload           5
	//   51  100:lload_3         
	//   52  101:invokespecial   #43  <Method void RangedUri(String, long, long)>
	//   53  104:areturn         
			}
			if(rangeduri.length != -1L && rangeduri.start + rangeduri.length == start)
	//*  54  105:aload_1         
	//*  55  106:getfield        #25  <Field long length>
	//*  56  109:ldc2w           #40  <Long -1L>
	//*  57  112:lcmp            
	//*  58  113:ifeq            176
	//*  59  116:aload_1         
	//*  60  117:getfield        #23  <Field long start>
	//*  61  120:aload_1         
	//*  62  121:getfield        #25  <Field long length>
	//*  63  124:ladd            
	//*  64  125:aload_0         
	//*  65  126:getfield        #23  <Field long start>
	//*  66  129:lcmp            
	//*  67  130:ifne            176
			{
				long l3 = rangeduri.start;
	//   68  133:aload_1         
	//   69  134:getfield        #23  <Field long start>
	//   70  137:lstore          5
				if(length != -1L)
	//*  71  139:aload_0         
	//*  72  140:getfield        #25  <Field long length>
	//*  73  143:ldc2w           #40  <Long -1L>
	//*  74  146:lcmp            
	//*  75  147:ifne            153
	//*  76  150:goto            163
					l = rangeduri.length + length;
	//   77  153:aload_1         
	//   78  154:getfield        #25  <Field long length>
	//   79  157:aload_0         
	//   80  158:getfield        #25  <Field long length>
	//   81  161:ladd            
	//   82  162:lstore_3        
				return new RangedUri(s1, l3, l);
	//   83  163:new             #2   <Class RangedUri>
	//   84  166:dup             
	//   85  167:aload           7
	//   86  169:lload           5
	//   87  171:lload_3         
	//   88  172:invokespecial   #43  <Method void RangedUri(String, long, long)>
	//   89  175:areturn         
			} else
			{
				return null;
	//   90  176:aconst_null     
	//   91  177:areturn         
			}
		} else
		{
			return null;
	//   92  178:aconst_null     
	//   93  179:areturn         
		}
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          71
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #48  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #48  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((RangedUri)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class RangedUri>
	//   16   28:astore_1        
			return start == ((RangedUri) (obj)).start && length == ((RangedUri) (obj)).length && referenceUri.equals(((Object) (((RangedUri) (obj)).referenceUri)));
	//   17   29:aload_0         
	//   18   30:getfield        #23  <Field long start>
	//   19   33:aload_1         
	//   20   34:getfield        #23  <Field long start>
	//   21   37:lcmp            
	//   22   38:ifne            69
	//   23   41:aload_0         
	//   24   42:getfield        #25  <Field long length>
	//   25   45:aload_1         
	//   26   46:getfield        #25  <Field long length>
	//   27   49:lcmp            
	//   28   50:ifne            69
	//   29   53:aload_0         
	//   30   54:getfield        #21  <Field String referenceUri>
	//   31   57:aload_1         
	//   32   58:getfield        #21  <Field String referenceUri>
	//   33   61:invokevirtual   #39  <Method boolean String.equals(Object)>
	//   34   64:ifeq            69
	//   35   67:iconst_1        
	//   36   68:ireturn         
	//   37   69:iconst_0        
	//   38   70:ireturn         
		} else
		{
			return false;
	//   39   71:iconst_0        
	//   40   72:ireturn         
		}
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field int hashCode>
	//*   2    4:ifne            40
			hashCode = 31 * ((527 + (int)start) * 31 + (int)length) + referenceUri.hashCode();
	//    3    7:aload_0         
	//    4    8:bipush          31
	//    5   10:sipush          527
	//    6   13:aload_0         
	//    7   14:getfield        #23  <Field long start>
	//    8   17:l2i             
	//    9   18:iadd            
	//   10   19:bipush          31
	//   11   21:imul            
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field long length>
	//   14   26:l2i             
	//   15   27:iadd            
	//   16   28:imul            
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field String referenceUri>
	//   19   33:invokevirtual   #53  <Method int String.hashCode()>
	//   20   36:iadd            
	//   21   37:putfield        #51  <Field int hashCode>
		return hashCode;
	//   22   40:aload_0         
	//   23   41:getfield        #51  <Field int hashCode>
	//   24   44:ireturn         
	}

	public Uri resolveUri(String s)
	{
		return UriUtil.resolveToUri(s, referenceUri);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String referenceUri>
	//    3    5:invokestatic    #61  <Method Uri UriUtil.resolveToUri(String, String)>
	//    4    8:areturn         
	}

	public String resolveUriString(String s)
	{
		return UriUtil.resolve(s, referenceUri);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String referenceUri>
	//    3    5:invokestatic    #65  <Method String UriUtil.resolve(String, String)>
	//    4    8:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #69  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("RangedUri(referenceUri=");
	//    4    8:aload_1         
	//    5    9:ldc1            #72  <String "RangedUri(referenceUri=">
	//    6   11:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(referenceUri);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field String referenceUri>
	//   11   20:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", start=");
	//   13   24:aload_1         
	//   14   25:ldc1            #78  <String ", start=">
	//   15   27:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(start);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field long start>
	//   20   36:invokevirtual   #81  <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append(", length=");
	//   22   40:aload_1         
	//   23   41:ldc1            #83  <String ", length=">
	//   24   43:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(length);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field long length>
	//   29   52:invokevirtual   #81  <Method StringBuilder StringBuilder.append(long)>
	//   30   55:pop             
		stringbuilder.append(")");
	//   31   56:aload_1         
	//   32   57:ldc1            #85  <String ")">
	//   33   59:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	private int hashCode;
	public final long length;
	private final String referenceUri;
	public final long start;
}
