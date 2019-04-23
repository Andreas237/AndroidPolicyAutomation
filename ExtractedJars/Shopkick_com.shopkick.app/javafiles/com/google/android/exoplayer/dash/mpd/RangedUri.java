// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import android.net.Uri;
import com.google.android.exoplayer.util.UriUtil;

public final class RangedUri
{

	public RangedUri(String s, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(s == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       15
			s1 = "";
	//    6   11:ldc1            #18  <String "">
	//    7   13:astore          6
		referenceUri = s1;
	//    8   15:aload_0         
	//    9   16:aload           6
	//   10   18:putfield        #20  <Field String referenceUri>
		start = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #22  <Field long start>
		length = l1;
	//   14   26:aload_0         
	//   15   27:lload           4
	//   16   29:putfield        #24  <Field long length>
	//   17   32:return          
	}

	public RangedUri attemptMerge(RangedUri rangeduri, String s)
	{
		String s1 = resolveUriString(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #31  <Method String resolveUriString(String)>
	//    3    5:astore          11
		if(rangeduri != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          174
		{
			if(!s1.equals(((Object) (rangeduri.resolveUriString(s)))))
	//*   6   11:aload           11
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #31  <Method String resolveUriString(String)>
	//*  10   18:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  11   21:ifne            26
				return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
			long l3 = length;
	//   14   26:aload_0         
	//   15   27:getfield        #24  <Field long length>
	//   16   30:lstore          7
			long l = -1L;
	//   17   32:ldc2w           #38  <Long -1L>
	//   18   35:lstore_3        
			if(l3 != -1L)
	//*  19   36:lload           7
	//*  20   38:ldc2w           #38  <Long -1L>
	//*  21   41:lcmp            
	//*  22   42:ifeq            101
			{
				long l1 = start;
	//   23   45:aload_0         
	//   24   46:getfield        #22  <Field long start>
	//   25   49:lstore          5
				if(l1 + l3 == rangeduri.start)
	//*  26   51:lload           5
	//*  27   53:lload           7
	//*  28   55:ladd            
	//*  29   56:aload_1         
	//*  30   57:getfield        #22  <Field long start>
	//*  31   60:lcmp            
	//*  32   61:ifne            101
				{
					long l4 = rangeduri.length;
	//   33   64:aload_1         
	//   34   65:getfield        #24  <Field long length>
	//   35   68:lstore          9
					if(l4 != -1L)
	//*  36   70:lload           9
	//*  37   72:ldc2w           #38  <Long -1L>
	//*  38   75:lcmp            
	//*  39   76:ifne            82
	//*  40   79:goto            88
						l = l3 + l4;
	//   41   82:lload           7
	//   42   84:lload           9
	//   43   86:ladd            
	//   44   87:lstore_3        
					return new RangedUri(s1, l1, l);
	//   45   88:new             #2   <Class RangedUri>
	//   46   91:dup             
	//   47   92:aload           11
	//   48   94:lload           5
	//   49   96:lload_3         
	//   50   97:invokespecial   #41  <Method void RangedUri(String, long, long)>
	//   51  100:areturn         
				}
			}
			l3 = rangeduri.length;
	//   52  101:aload_1         
	//   53  102:getfield        #24  <Field long length>
	//   54  105:lstore          7
			if(l3 != -1L)
	//*  55  107:lload           7
	//*  56  109:ldc2w           #38  <Long -1L>
	//*  57  112:lcmp            
	//*  58  113:ifeq            172
			{
				long l2 = rangeduri.start;
	//   59  116:aload_1         
	//   60  117:getfield        #22  <Field long start>
	//   61  120:lstore          5
				if(l2 + l3 == start)
	//*  62  122:lload           5
	//*  63  124:lload           7
	//*  64  126:ladd            
	//*  65  127:aload_0         
	//*  66  128:getfield        #22  <Field long start>
	//*  67  131:lcmp            
	//*  68  132:ifne            172
				{
					long l5 = length;
	//   69  135:aload_0         
	//   70  136:getfield        #24  <Field long length>
	//   71  139:lstore          9
					if(l5 != -1L)
	//*  72  141:lload           9
	//*  73  143:ldc2w           #38  <Long -1L>
	//*  74  146:lcmp            
	//*  75  147:ifne            153
	//*  76  150:goto            159
						l = l3 + l5;
	//   77  153:lload           7
	//   78  155:lload           9
	//   79  157:ladd            
	//   80  158:lstore_3        
					return new RangedUri(s1, l2, l);
	//   81  159:new             #2   <Class RangedUri>
	//   82  162:dup             
	//   83  163:aload           11
	//   84  165:lload           5
	//   85  167:lload_3         
	//   86  168:invokespecial   #41  <Method void RangedUri(String, long, long)>
	//   87  171:areturn         
				}
			}
			return null;
	//   88  172:aconst_null     
	//   89  173:areturn         
		} else
		{
			return null;
	//   90  174:aconst_null     
	//   91  175:areturn         
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
	//*   8   12:invokevirtual   #45  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #45  <Method Class Object.getClass()>
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
	//   18   30:getfield        #22  <Field long start>
	//   19   33:aload_1         
	//   20   34:getfield        #22  <Field long start>
	//   21   37:lcmp            
	//   22   38:ifne            69
	//   23   41:aload_0         
	//   24   42:getfield        #24  <Field long length>
	//   25   45:aload_1         
	//   26   46:getfield        #24  <Field long length>
	//   27   49:lcmp            
	//   28   50:ifne            69
	//   29   53:aload_0         
	//   30   54:getfield        #20  <Field String referenceUri>
	//   31   57:aload_1         
	//   32   58:getfield        #20  <Field String referenceUri>
	//   33   61:invokevirtual   #37  <Method boolean String.equals(Object)>
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
	//*   1    1:getfield        #48  <Field int hashCode>
	//*   2    4:ifne            40
			hashCode = ((527 + (int)start) * 31 + (int)length) * 31 + referenceUri.hashCode();
	//    3    7:aload_0         
	//    4    8:sipush          527
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field long start>
	//    7   15:l2i             
	//    8   16:iadd            
	//    9   17:bipush          31
	//   10   19:imul            
	//   11   20:aload_0         
	//   12   21:getfield        #24  <Field long length>
	//   13   24:l2i             
	//   14   25:iadd            
	//   15   26:bipush          31
	//   16   28:imul            
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field String referenceUri>
	//   19   33:invokevirtual   #50  <Method int String.hashCode()>
	//   20   36:iadd            
	//   21   37:putfield        #48  <Field int hashCode>
		return hashCode;
	//   22   40:aload_0         
	//   23   41:getfield        #48  <Field int hashCode>
	//   24   44:ireturn         
	}

	public Uri resolveUri(String s)
	{
		return UriUtil.resolveToUri(s, referenceUri);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field String referenceUri>
	//    3    5:invokestatic    #58  <Method Uri UriUtil.resolveToUri(String, String)>
	//    4    8:areturn         
	}

	public String resolveUriString(String s)
	{
		return UriUtil.resolve(s, referenceUri);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field String referenceUri>
	//    3    5:invokestatic    #62  <Method String UriUtil.resolve(String, String)>
	//    4    8:areturn         
	}

	private int hashCode;
	public final long length;
	private final String referenceUri;
	public final long start;
}
