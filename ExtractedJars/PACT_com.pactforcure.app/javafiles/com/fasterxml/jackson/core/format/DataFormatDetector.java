// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.core.format:
//			MatchStrength, DataFormatMatcher

public class DataFormatDetector
{

	public DataFormatDetector(Collection collection)
	{
		this((JsonFactory[])collection.toArray(((Object []) (new JsonFactory[collection.size()]))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokeinterface #21  <Method int Collection.size()>
	//    4    8:anewarray       JsonFactory[]
	//    5   11:invokeinterface #27  <Method Object[] Collection.toArray(Object[])>
	//    6   16:checkcast       #28  <Class JsonFactory[]>
	//    7   19:invokespecial   #31  <Method void DataFormatDetector(JsonFactory[])>
	//    8   22:return          
	}

	public transient DataFormatDetector(JsonFactory ajsonfactory[])
	{
		this(ajsonfactory, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #39  <Field MatchStrength MatchStrength.SOLID_MATCH>
	//    3    5:getstatic       #42  <Field MatchStrength MatchStrength.WEAK_MATCH>
	//    4    8:bipush          64
	//    5   10:invokespecial   #45  <Method void DataFormatDetector(JsonFactory[], MatchStrength, MatchStrength, int)>
	//    6   13:return          
	}

	private DataFormatDetector(JsonFactory ajsonfactory[], MatchStrength matchstrength, MatchStrength matchstrength1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		_detectors = ajsonfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field JsonFactory[] _detectors>
		_optimalMatch = matchstrength;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field MatchStrength _optimalMatch>
		_minimalMatch = matchstrength1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #54  <Field MatchStrength _minimalMatch>
		_maxInputLookahead = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #56  <Field int _maxInputLookahead>
	//   14   25:return          
	}

	private DataFormatMatcher _findFormat(InputAccessor.Std std)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		Object obj1;
		JsonFactory ajsonfactory[];
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		ajsonfactory = _detectors;
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field JsonFactory[] _detectors>
	//    6   10:astore          10
		j = ajsonfactory.length;
	//    7   12:aload           10
	//    8   14:arraylength     
	//    9   15:istore_3        
		i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_2        
_L2:
		Object obj2;
		Object obj3;
		MatchStrength matchstrength;
		JsonFactory jsonfactory;
		obj3 = obj1;
	//   12   18:aload           5
	//   13   20:astore          7
		obj2 = obj;
	//   14   22:aload           4
	//   15   24:astore          6
		if(i >= j)
			break MISSING_BLOCK_LABEL_165;
	//   16   26:iload_2         
	//   17   27:iload_3         
	//   18   28:icmpge          165
		jsonfactory = ajsonfactory[i];
	//   19   31:aload           10
	//   20   33:iload_2         
	//   21   34:aaload          
	//   22   35:astore          9
		std.reset();
	//   23   37:aload_1         
	//   24   38:invokevirtual   #65  <Method void InputAccessor$Std.reset()>
		matchstrength = jsonfactory.hasFormat(((InputAccessor) (std)));
	//   25   41:aload           9
	//   26   43:aload_1         
	//   27   44:invokevirtual   #69  <Method MatchStrength JsonFactory.hasFormat(InputAccessor)>
	//   28   47:astore          8
		obj2 = obj1;
	//   29   49:aload           5
	//   30   51:astore          6
		obj3 = obj;
	//   31   53:aload           4
	//   32   55:astore          7
		if(matchstrength != null)
	//*  33   57:aload           8
	//*  34   59:ifnull          85
		{
			if(matchstrength.ordinal() >= _minimalMatch.ordinal())
				break; /* Loop/switch isn't completed */
	//   35   62:aload           8
	//   36   64:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   37   67:aload_0         
	//   38   68:getfield        #54  <Field MatchStrength _minimalMatch>
	//   39   71:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   40   74:icmpge          100
			obj3 = obj;
	//   41   77:aload           4
	//   42   79:astore          7
			obj2 = obj1;
	//   43   81:aload           5
	//   44   83:astore          6
		}
_L4:
		i++;
	//   45   85:iload_2         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_2        
		obj1 = obj2;
	//   49   89:aload           6
	//   50   91:astore          5
		obj = obj3;
	//   51   93:aload           7
	//   52   95:astore          4
		if(true) goto _L2; else goto _L1
	//   53   97:goto            18
_L1:
		if(obj1 == null)
			break; /* Loop/switch isn't completed */
	//   54  100:aload           5
	//   55  102:ifnull          126
		obj2 = obj1;
	//   56  105:aload           5
	//   57  107:astore          6
		obj3 = obj;
	//   58  109:aload           4
	//   59  111:astore          7
		if(((MatchStrength) (obj)).ordinal() >= matchstrength.ordinal()) goto _L4; else goto _L3
	//   60  113:aload           4
	//   61  115:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   62  118:aload           8
	//   63  120:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   64  123:icmpge          85
_L3:
		obj = ((Object) (jsonfactory));
	//   65  126:aload           9
	//   66  128:astore          4
		obj1 = ((Object) (matchstrength));
	//   67  130:aload           8
	//   68  132:astore          5
		obj2 = obj;
	//   69  134:aload           4
	//   70  136:astore          6
		obj3 = obj1;
	//   71  138:aload           5
	//   72  140:astore          7
		if(matchstrength.ordinal() < _optimalMatch.ordinal()) goto _L4; else goto _L5
	//   73  142:aload           8
	//   74  144:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   75  147:aload_0         
	//   76  148:getfield        #52  <Field MatchStrength _optimalMatch>
	//   77  151:invokevirtual   #72  <Method int MatchStrength.ordinal()>
	//   78  154:icmplt          85
_L5:
		obj2 = obj1;
	//   79  157:aload           5
	//   80  159:astore          6
		obj3 = obj;
	//   81  161:aload           4
	//   82  163:astore          7
		return std.createMatcher(((JsonFactory) (obj3)), ((MatchStrength) (obj2)));
	//   83  165:aload_1         
	//   84  166:aload           7
	//   85  168:aload           6
	//   86  170:invokevirtual   #76  <Method DataFormatMatcher InputAccessor$Std.createMatcher(JsonFactory, MatchStrength)>
	//   87  173:areturn         
	}

	public DataFormatMatcher findFormat(InputStream inputstream)
		throws IOException
	{
		return _findFormat(new InputAccessor.Std(inputstream, new byte[_maxInputLookahead]));
	//    0    0:aload_0         
	//    1    1:new             #62  <Class InputAccessor$Std>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #56  <Field int _maxInputLookahead>
	//    6   10:newarray        byte[]
	//    7   12:invokespecial   #82  <Method void InputAccessor$Std(InputStream, byte[])>
	//    8   15:invokespecial   #84  <Method DataFormatMatcher _findFormat(InputAccessor$Std)>
	//    9   18:areturn         
	}

	public DataFormatMatcher findFormat(byte abyte0[])
		throws IOException
	{
		return _findFormat(new InputAccessor.Std(abyte0));
	//    0    0:aload_0         
	//    1    1:new             #62  <Class InputAccessor$Std>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #88  <Method void InputAccessor$Std(byte[])>
	//    5    9:invokespecial   #84  <Method DataFormatMatcher _findFormat(InputAccessor$Std)>
	//    6   12:areturn         
	}

	public DataFormatMatcher findFormat(byte abyte0[], int i, int j)
		throws IOException
	{
		return _findFormat(new InputAccessor.Std(abyte0, i, j));
	//    0    0:aload_0         
	//    1    1:new             #62  <Class InputAccessor$Std>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #92  <Method void InputAccessor$Std(byte[], int, int)>
	//    7   11:invokespecial   #84  <Method DataFormatMatcher _findFormat(InputAccessor$Std)>
	//    8   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #96  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append('[');
	//    4    8:aload_3         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		int j = _detectors.length;
	//    8   15:aload_0         
	//    9   16:getfield        #50  <Field JsonFactory[] _detectors>
	//   10   19:arraylength     
	//   11   20:istore_2        
		if(j > 0)
	//*  12   21:iload_2         
	//*  13   22:ifle            74
		{
			stringbuilder.append(_detectors[0].getFormatName());
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:getfield        #50  <Field JsonFactory[] _detectors>
	//   17   30:iconst_0        
	//   18   31:aaload          
	//   19   32:invokevirtual   #104 <Method String JsonFactory.getFormatName()>
	//   20   35:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			for(int i = 1; i < j; i++)
	//*  22   39:iconst_1        
	//*  23   40:istore_1        
	//*  24   41:iload_1         
	//*  25   42:iload_2         
	//*  26   43:icmpge          74
			{
				stringbuilder.append(", ");
	//   27   46:aload_3         
	//   28   47:ldc1            #109 <String ", ">
	//   29   49:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   30   52:pop             
				stringbuilder.append(_detectors[i].getFormatName());
	//   31   53:aload_3         
	//   32   54:aload_0         
	//   33   55:getfield        #50  <Field JsonFactory[] _detectors>
	//   34   58:iload_1         
	//   35   59:aaload          
	//   36   60:invokevirtual   #104 <Method String JsonFactory.getFormatName()>
	//   37   63:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
			}

	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:istore_1        
		}
	//*  43   71:goto            41
		stringbuilder.append(']');
	//   44   74:aload_3         
	//   45   75:bipush          93
	//   46   77:invokevirtual   #101 <Method StringBuilder StringBuilder.append(char)>
	//   47   80:pop             
		return stringbuilder.toString();
	//   48   81:aload_3         
	//   49   82:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   50   85:areturn         
	}

	public DataFormatDetector withMaxInputLookahead(int i)
	{
		if(i == _maxInputLookahead)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #56  <Field int _maxInputLookahead>
	//*   3    5:icmpne          10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatDetector(_detectors, _optimalMatch, _minimalMatch, i);
	//    6   10:new             #2   <Class DataFormatDetector>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field JsonFactory[] _detectors>
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field MatchStrength _optimalMatch>
	//   12   22:aload_0         
	//   13   23:getfield        #54  <Field MatchStrength _minimalMatch>
	//   14   26:iload_1         
	//   15   27:invokespecial   #45  <Method void DataFormatDetector(JsonFactory[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public DataFormatDetector withMinimalMatch(MatchStrength matchstrength)
	{
		if(matchstrength == _minimalMatch)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #54  <Field MatchStrength _minimalMatch>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatDetector(_detectors, _optimalMatch, matchstrength, _maxInputLookahead);
	//    6   10:new             #2   <Class DataFormatDetector>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field JsonFactory[] _detectors>
	//   10   18:aload_0         
	//   11   19:getfield        #52  <Field MatchStrength _optimalMatch>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #56  <Field int _maxInputLookahead>
	//   15   27:invokespecial   #45  <Method void DataFormatDetector(JsonFactory[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public DataFormatDetector withOptimalMatch(MatchStrength matchstrength)
	{
		if(matchstrength == _optimalMatch)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field MatchStrength _optimalMatch>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DataFormatDetector(_detectors, matchstrength, _minimalMatch, _maxInputLookahead);
	//    6   10:new             #2   <Class DataFormatDetector>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field JsonFactory[] _detectors>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field MatchStrength _minimalMatch>
	//   13   23:aload_0         
	//   14   24:getfield        #56  <Field int _maxInputLookahead>
	//   15   27:invokespecial   #45  <Method void DataFormatDetector(JsonFactory[], MatchStrength, MatchStrength, int)>
	//   16   30:areturn         
	}

	public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
	protected final JsonFactory _detectors[];
	protected final int _maxInputLookahead;
	protected final MatchStrength _minimalMatch;
	protected final MatchStrength _optimalMatch;
}
