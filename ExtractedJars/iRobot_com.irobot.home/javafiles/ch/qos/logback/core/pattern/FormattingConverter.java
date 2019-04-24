// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


// Referenced classes of package ch.qos.logback.core.pattern:
//			Converter, FormatInfo, SpacePadder

public abstract class FormattingConverter extends Converter
{

	public FormattingConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Converter()>
	//    2    4:return          
	}

	public final FormatInfo getFormattingInfo()
	{
		return formattingInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FormatInfo formattingInfo>
	//    2    4:areturn         
	}

	public final void setFormattingInfo(FormatInfo formatinfo)
	{
		if(formattingInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field FormatInfo formattingInfo>
	//*   2    4:ifnull          17
		{
			throw new IllegalStateException("FormattingInfo has been already set");
	//    3    7:new             #25  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #27  <String "FormattingInfo has been already set">
	//    6   13:invokespecial   #30  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		} else
		{
			formattingInfo = formatinfo;
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:putfield        #21  <Field FormatInfo formattingInfo>
			return;
	//   11   22:return          
		}
	}

	public final void write(StringBuilder stringbuilder, Object obj)
	{
		String s = convert(obj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #36  <Method String convert(Object)>
	//    3    5:astore          6
		if(formattingInfo == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #21  <Field FormatInfo formattingInfo>
	//*   6   11:ifnonnull       22
		{
			stringbuilder.append(s);
	//    7   14:aload_1         
	//    8   15:aload           6
	//    9   17:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			return;
	//   11   21:return          
		}
		int i = formattingInfo.getMin();
	//   12   22:aload_0         
	//   13   23:getfield        #21  <Field FormatInfo formattingInfo>
	//   14   26:invokevirtual   #48  <Method int FormatInfo.getMin()>
	//   15   29:istore_3        
		int j = formattingInfo.getMax();
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field FormatInfo formattingInfo>
	//   18   34:invokevirtual   #51  <Method int FormatInfo.getMax()>
	//   19   37:istore          4
		if(s == null)
	//*  20   39:aload           6
	//*  21   41:ifnonnull       54
		{
			if(i > 0)
	//*  22   44:iload_3         
	//*  23   45:ifle            53
				SpacePadder.spacePad(stringbuilder, i);
	//   24   48:aload_1         
	//   25   49:iload_3         
	//   26   50:invokestatic    #57  <Method void SpacePadder.spacePad(StringBuilder, int)>
			return;
	//   27   53:return          
		}
		int k = s.length();
	//   28   54:aload           6
	//   29   56:invokevirtual   #62  <Method int String.length()>
	//   30   59:istore          5
		if(k > j)
	//*  31   61:iload           5
	//*  32   63:iload           4
	//*  33   65:icmple          108
		{
			if(formattingInfo.isLeftTruncate())
	//*  34   68:aload_0         
	//*  35   69:getfield        #21  <Field FormatInfo formattingInfo>
	//*  36   72:invokevirtual   #66  <Method boolean FormatInfo.isLeftTruncate()>
	//*  37   75:ifeq            96
				obj = ((Object) (s.substring(k - j)));
	//   38   78:aload           6
	//   39   80:iload           5
	//   40   82:iload           4
	//   41   84:isub            
	//   42   85:invokevirtual   #70  <Method String String.substring(int)>
	//   43   88:astore_2        
			else
	//*  44   89:aload_1         
	//*  45   90:aload_2         
	//*  46   91:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  47   94:pop             
	//*  48   95:return          
				obj = ((Object) (s.substring(0, j)));
	//   49   96:aload           6
	//   50   98:iconst_0        
	//   51   99:iload           4
	//   52  101:invokevirtual   #73  <Method String String.substring(int, int)>
	//   53  104:astore_2        
		} else
	//*  54  105:goto            89
		{
			obj = ((Object) (s));
	//   55  108:aload           6
	//   56  110:astore_2        
			if(k < i)
	//*  57  111:iload           5
	//*  58  113:iload_3         
	//*  59  114:icmpge          89
				if(formattingInfo.isLeftPad())
	//*  60  117:aload_0         
	//*  61  118:getfield        #21  <Field FormatInfo formattingInfo>
	//*  62  121:invokevirtual   #76  <Method boolean FormatInfo.isLeftPad()>
	//*  63  124:ifeq            135
				{
					SpacePadder.leftPad(stringbuilder, s, i);
	//   64  127:aload_1         
	//   65  128:aload           6
	//   66  130:iload_3         
	//   67  131:invokestatic    #80  <Method void SpacePadder.leftPad(StringBuilder, String, int)>
					return;
	//   68  134:return          
				} else
				{
					SpacePadder.rightPad(stringbuilder, s, i);
	//   69  135:aload_1         
	//   70  136:aload           6
	//   71  138:iload_3         
	//   72  139:invokestatic    #83  <Method void SpacePadder.rightPad(StringBuilder, String, int)>
					return;
	//   73  142:return          
				}
		}
		stringbuilder.append(((String) (obj)));
	}

	static final int INITIAL_BUF_SIZE = 256;
	static final int MAX_CAPACITY = 1024;
	FormatInfo formattingInfo;
}
