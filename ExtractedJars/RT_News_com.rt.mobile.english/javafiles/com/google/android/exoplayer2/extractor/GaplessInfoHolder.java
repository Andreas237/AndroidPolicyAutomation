// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GaplessInfoHolder
{

	public GaplessInfoHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		encoderDelay = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #41  <Field int encoderDelay>
		encoderPadding = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #43  <Field int encoderPadding>
	//    8   14:return          
	}

	private boolean setFromComment(String s)
	{
		s = ((String) (GAPLESS_COMMENT_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #37  <Field Pattern GAPLESS_COMMENT_PATTERN>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #51  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_1        
		if(!((Matcher) (s)).find())
			break MISSING_BLOCK_LABEL_57;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #57  <Method boolean Matcher.find()>
	//    6   12:ifeq            57
		int i;
		int j;
		i = Integer.parseInt(((Matcher) (s)).group(1), 16);
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #61  <Method String Matcher.group(int)>
	//   10   20:bipush          16
	//   11   22:invokestatic    #67  <Method int Integer.parseInt(String, int)>
	//   12   25:istore_2        
		j = Integer.parseInt(((Matcher) (s)).group(2), 16);
	//   13   26:aload_1         
	//   14   27:iconst_2        
	//   15   28:invokevirtual   #61  <Method String Matcher.group(int)>
	//   16   31:bipush          16
	//   17   33:invokestatic    #67  <Method int Integer.parseInt(String, int)>
	//   18   36:istore_3        
		if(i <= 0 && j <= 0)
			break MISSING_BLOCK_LABEL_57;
	//   19   37:iload_2         
	//   20   38:ifgt            45
	//   21   41:iload_3         
	//   22   42:ifle            57
		encoderDelay = i;
	//   23   45:aload_0         
	//   24   46:iload_2         
	//   25   47:putfield        #41  <Field int encoderDelay>
		encoderPadding = j;
	//   26   50:aload_0         
	//   27   51:iload_3         
	//   28   52:putfield        #43  <Field int encoderPadding>
		return true;
	//   29   55:iconst_1        
	//   30   56:ireturn         
_L2:
		return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
		s;
	//   33   59:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  34   60:goto            57
	}

	public boolean hasGaplessInfo()
	{
		return encoderDelay != -1 && encoderPadding != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int encoderDelay>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field int encoderPadding>
	//    6   12:iconst_m1       
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean setFromMetadata(Metadata metadata)
	{
		for(int i = 0; i < metadata.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #76  <Method int Metadata.length()>
	//*   5    7:icmpge          109
		{
			Object obj = ((Object) (metadata.get(i)));
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #80  <Method com.google.android.exoplayer2.metadata.Metadata$Entry Metadata.get(int)>
	//    9   15:astore_3        
			if(obj instanceof CommentFrame)
	//*  10   16:aload_3         
	//*  11   17:instanceof      #82  <Class CommentFrame>
	//*  12   20:ifeq            53
			{
				obj = ((Object) ((CommentFrame)obj));
	//   13   23:aload_3         
	//   14   24:checkcast       #82  <Class CommentFrame>
	//   15   27:astore_3        
				if("iTunSMPB".equals(((Object) (((CommentFrame) (obj)).description))) && setFromComment(((CommentFrame) (obj)).text))
	//*  16   28:ldc1            #12  <String "iTunSMPB">
	//*  17   30:aload_3         
	//*  18   31:getfield        #85  <Field String CommentFrame.description>
	//*  19   34:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  20   37:ifeq            102
	//*  21   40:aload_0         
	//*  22   41:aload_3         
	//*  23   42:getfield        #94  <Field String CommentFrame.text>
	//*  24   45:invokespecial   #96  <Method boolean setFromComment(String)>
	//*  25   48:ifeq            102
					return true;
	//   26   51:iconst_1        
	//   27   52:ireturn         
				continue;
			}
			if(!(obj instanceof InternalFrame))
				continue;
	//   28   53:aload_3         
	//   29   54:instanceof      #98  <Class InternalFrame>
	//   30   57:ifeq            102
			obj = ((Object) ((InternalFrame)obj));
	//   31   60:aload_3         
	//   32   61:checkcast       #98  <Class InternalFrame>
	//   33   64:astore_3        
			if("com.apple.iTunes".equals(((Object) (((InternalFrame) (obj)).domain))) && "iTunSMPB".equals(((Object) (((InternalFrame) (obj)).description))) && setFromComment(((InternalFrame) (obj)).text))
	//*  34   65:ldc1            #15  <String "com.apple.iTunes">
	//*  35   67:aload_3         
	//*  36   68:getfield        #101 <Field String InternalFrame.domain>
	//*  37   71:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  38   74:ifeq            102
	//*  39   77:ldc1            #12  <String "iTunSMPB">
	//*  40   79:aload_3         
	//*  41   80:getfield        #102 <Field String InternalFrame.description>
	//*  42   83:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  43   86:ifeq            102
	//*  44   89:aload_0         
	//*  45   90:aload_3         
	//*  46   91:getfield        #103 <Field String InternalFrame.text>
	//*  47   94:invokespecial   #96  <Method boolean setFromComment(String)>
	//*  48   97:ifeq            102
				return true;
	//   49  100:iconst_1        
	//   50  101:ireturn         
		}

	//   51  102:iload_2         
	//   52  103:iconst_1        
	//   53  104:iadd            
	//   54  105:istore_2        
	//*  55  106:goto            2
		return false;
	//   56  109:iconst_0        
	//   57  110:ireturn         
	}

	public boolean setFromXingHeaderValue(int i)
	{
		int j = i >> 12;
	//    0    0:iload_1         
	//    1    1:bipush          12
	//    2    3:ishr            
	//    3    4:istore_2        
		i &= 0xfff;
	//    4    5:iload_1         
	//    5    6:sipush          4095
	//    6    9:iand            
	//    7   10:istore_1        
		if(j <= 0 && i <= 0)
	//*   8   11:iload_2         
	//*   9   12:ifgt            24
	//*  10   15:iload_1         
	//*  11   16:ifle            22
	//*  12   19:goto            24
		{
			return false;
	//   13   22:iconst_0        
	//   14   23:ireturn         
		} else
		{
			encoderDelay = j;
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:putfield        #41  <Field int encoderDelay>
			encoderPadding = i;
	//   18   29:aload_0         
	//   19   30:iload_1         
	//   20   31:putfield        #43  <Field int encoderPadding>
			return true;
	//   21   34:iconst_1        
	//   22   35:ireturn         
		}
	}

	private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
	private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
	private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
	public static final com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate GAPLESS_INFO_ID3_FRAME_PREDICATE = new com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate() {

		public boolean evaluate(int i, int j, int k, int l, int i1)
		{
			return j == 67 && k == 79 && l == 77 && (i1 == 77 || i == 2);
		//    0    0:iload_2         
		//    1    1:bipush          67
		//    2    3:icmpne          33
		//    3    6:iload_3         
		//    4    7:bipush          79
		//    5    9:icmpne          33
		//    6   12:iload           4
		//    7   14:bipush          77
		//    8   16:icmpne          33
		//    9   19:iload           5
		//   10   21:bipush          77
		//   11   23:icmpeq          31
		//   12   26:iload_1         
		//   13   27:iconst_2        
		//   14   28:icmpne          33
		//   15   31:iconst_1        
		//   16   32:ireturn         
		//   17   33:iconst_0        
		//   18   34:ireturn         
		}

	}
;
	public int encoderDelay;
	public int encoderPadding;

	static 
	{
	//    0    0:new             #6   <Class GaplessInfoHolder$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void GaplessInfoHolder$1()>
	//    3    7:putstatic       #27  <Field com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate GAPLESS_INFO_ID3_FRAME_PREDICATE>
	//    4   10:ldc1            #29  <String "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})">
	//    5   12:invokestatic    #35  <Method Pattern Pattern.compile(String)>
	//    6   15:putstatic       #37  <Field Pattern GAPLESS_COMMENT_PATTERN>
	//*   7   18:return          
	}
}
