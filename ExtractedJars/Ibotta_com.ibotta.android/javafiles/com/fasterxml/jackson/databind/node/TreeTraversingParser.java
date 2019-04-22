// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NodeCursor, POJONode, BinaryNode, NumericNode

public class TreeTraversingParser extends ParserMinimalBase
{

	public TreeTraversingParser(JsonNode jsonnode)
	{
		this(jsonnode, ((ObjectCodec) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//    4    6:return          
	}

	public TreeTraversingParser(JsonNode jsonnode, ObjectCodec objectcodec)
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #24  <Method void ParserMinimalBase(int)>
		_objectCodec = objectcodec;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field ObjectCodec _objectCodec>
		if(jsonnode.isArray())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #32  <Method boolean JsonNode.isArray()>
	//*   8   14:ifeq            38
		{
			_nextToken = JsonToken.START_ARRAY;
	//    9   17:aload_0         
	//   10   18:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//   11   21:putfield        #39  <Field JsonToken _nextToken>
			_nodeCursor = ((NodeCursor) (new NodeCursor.ArrayCursor(jsonnode, ((NodeCursor) (null)))));
	//   12   24:aload_0         
	//   13   25:new             #41  <Class NodeCursor$ArrayCursor>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aconst_null     
	//   17   31:invokespecial   #44  <Method void NodeCursor$ArrayCursor(JsonNode, NodeCursor)>
	//   18   34:putfield        #46  <Field NodeCursor _nodeCursor>
			return;
	//   19   37:return          
		}
		if(jsonnode.isObject())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #49  <Method boolean JsonNode.isObject()>
	//*  22   42:ifeq            66
		{
			_nextToken = JsonToken.START_OBJECT;
	//   23   45:aload_0         
	//   24   46:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//   25   49:putfield        #39  <Field JsonToken _nextToken>
			_nodeCursor = ((NodeCursor) (new NodeCursor.ObjectCursor(jsonnode, ((NodeCursor) (null)))));
	//   26   52:aload_0         
	//   27   53:new             #54  <Class NodeCursor$ObjectCursor>
	//   28   56:dup             
	//   29   57:aload_1         
	//   30   58:aconst_null     
	//   31   59:invokespecial   #55  <Method void NodeCursor$ObjectCursor(JsonNode, NodeCursor)>
	//   32   62:putfield        #46  <Field NodeCursor _nodeCursor>
			return;
	//   33   65:return          
		} else
		{
			_nodeCursor = ((NodeCursor) (new NodeCursor.RootCursor(jsonnode, ((NodeCursor) (null)))));
	//   34   66:aload_0         
	//   35   67:new             #57  <Class NodeCursor$RootCursor>
	//   36   70:dup             
	//   37   71:aload_1         
	//   38   72:aconst_null     
	//   39   73:invokespecial   #58  <Method void NodeCursor$RootCursor(JsonNode, NodeCursor)>
	//   40   76:putfield        #46  <Field NodeCursor _nodeCursor>
			return;
	//   41   79:return          
		}
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		_throwInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method void _throwInternal()>
	//    2    4:return          
	}

	public void close()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifne            22
		{
			_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #71  <Field boolean _closed>
			_nodeCursor = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #46  <Field NodeCursor _nodeCursor>
			_currToken = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #74  <Field JsonToken _currToken>
		}
	//   12   22:return          
	}

	protected JsonNode currentNode()
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifne            24
		{
			NodeCursor nodecursor = _nodeCursor;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field NodeCursor _nodeCursor>
	//    5   11:astore_1        
			if(nodecursor != null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       19
	//*   8   16:goto            24
				return nodecursor.currentNode();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #80  <Method JsonNode NodeCursor.currentNode()>
	//   11   23:areturn         
		}
		return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	protected JsonNode currentNumericNode()
		throws JsonParseException
	{
		Object obj = ((Object) (currentNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method JsonNode currentNode()>
	//    2    4:astore_1        
		if(obj != null && ((JsonNode) (obj)).isNumber())
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #85  <Method boolean JsonNode.isNumber()>
	//*   7   13:ifne            19
	//*   8   16:goto            21
			return ((JsonNode) (obj));
	//    9   19:aload_1         
	//   10   20:areturn         
		if(obj == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       30
			obj = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		else
	//*  15   27:goto            35
			obj = ((Object) (((JsonNode) (obj)).asToken()));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #89  <Method JsonToken JsonNode.asToken()>
	//   18   34:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   19   35:new             #91  <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #93  <Method void StringBuilder()>
	//   22   42:astore_2        
		stringbuilder.append("Current token (");
	//   23   43:aload_2         
	//   24   44:ldc1            #95  <String "Current token (">
	//   25   46:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(obj);
	//   27   50:aload_2         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #102 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append(") not numeric, cannot use numeric value accessors");
	//   31   56:aload_2         
	//   32   57:ldc1            #104 <String ") not numeric, cannot use numeric value accessors">
	//   33   59:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		throw _constructError(stringbuilder.toString());
	//   35   63:aload_0         
	//   36   64:aload_2         
	//   37   65:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   38   68:invokevirtual   #112 <Method JsonParseException _constructError(String)>
	//   39   71:athrow          
	}

	public BigInteger getBigIntegerValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().bigIntegerValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #119 <Method BigInteger JsonNode.bigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException, JsonParseException
	{
		base64variant = ((Base64Variant) (currentNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method JsonNode currentNode()>
	//    2    4:astore_1        
		if(base64variant != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			byte abyte0[] = ((JsonNode) (base64variant)).binaryValue();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #125 <Method byte[] JsonNode.binaryValue()>
	//    7   13:astore_2        
			if(abyte0 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          20
				return abyte0;
	//   10   18:aload_2         
	//   11   19:areturn         
			if(((JsonNode) (base64variant)).isPojo())
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #128 <Method boolean JsonNode.isPojo()>
	//*  14   24:ifeq            47
			{
				base64variant = ((Base64Variant) (((POJONode)base64variant).getPojo()));
	//   15   27:aload_1         
	//   16   28:checkcast       #130 <Class POJONode>
	//   17   31:invokevirtual   #134 <Method Object POJONode.getPojo()>
	//   18   34:astore_1        
				if(base64variant instanceof byte[])
	//*  19   35:aload_1         
	//*  20   36:instanceof      #136 <Class byte[]>
	//*  21   39:ifeq            47
					return (byte[])base64variant;
	//   22   42:aload_1         
	//   23   43:checkcast       #136 <Class byte[]>
	//   24   46:areturn         
			}
		}
		return null;
	//   25   47:aconst_null     
	//   26   48:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return JsonLocation.NA;
	//    0    0:getstatic       #146 <Field JsonLocation JsonLocation.NA>
	//    1    3:areturn         
	}

	public String getCurrentName()
	{
		NodeCursor nodecursor = _nodeCursor;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field NodeCursor _nodeCursor>
	//    2    4:astore_1        
		if(nodecursor == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return nodecursor.getCurrentName();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #149 <Method String NodeCursor.getCurrentName()>
	//    9   15:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().decimalValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #154 <Method BigDecimal JsonNode.decimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #159 <Method double JsonNode.doubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifne            46
		{
			JsonNode jsonnode = currentNode();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #82  <Method JsonNode currentNode()>
	//    5   11:astore_1        
			if(jsonnode != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          46
			{
				if(jsonnode.isPojo())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #128 <Method boolean JsonNode.isPojo()>
	//*  10   20:ifeq            31
					return ((POJONode)jsonnode).getPojo();
	//   11   23:aload_1         
	//   12   24:checkcast       #130 <Class POJONode>
	//   13   27:invokevirtual   #134 <Method Object POJONode.getPojo()>
	//   14   30:areturn         
				if(jsonnode.isBinary())
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #163 <Method boolean JsonNode.isBinary()>
	//*  17   35:ifeq            46
					return ((Object) (((BinaryNode)jsonnode).binaryValue()));
	//   18   38:aload_1         
	//   19   39:checkcast       #165 <Class BinaryNode>
	//   20   42:invokevirtual   #166 <Method byte[] BinaryNode.binaryValue()>
	//   21   45:areturn         
			}
		}
		return ((Object) (null));
	//   22   46:aconst_null     
	//   23   47:areturn         
	}

	public float getFloatValue()
		throws IOException, JsonParseException
	{
		return (float)currentNumericNode().doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #159 <Method double JsonNode.doubleValue()>
	//    3    7:d2f             
	//    4    8:freturn         
	}

	public int getIntValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().intValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #173 <Method int JsonNode.intValue()>
	//    3    7:ireturn         
	}

	public long getLongValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #178 <Method long JsonNode.longValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException, JsonParseException
	{
		JsonNode jsonnode = currentNumericNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:astore_1        
		if(jsonnode == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return jsonnode.numberType();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #183 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonNode.numberType()>
	//    9   15:areturn         
	}

	public Number getNumberValue()
		throws IOException, JsonParseException
	{
		return currentNumericNode().numberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method JsonNode currentNumericNode()>
	//    2    4:invokevirtual   #188 <Method Number JsonNode.numberValue()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (_nodeCursor));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field NodeCursor _nodeCursor>
	//    2    4:areturn         
	}

	public String getText()
	{
		if(_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
			//    0    0:invokestatic    #18  <Method JsonToken[] JsonToken.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//    5   12:getstatic       #24  <Field JsonToken JsonToken.FIELD_NAME>
			//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  10   23:getstatic       #31  <Field JsonToken JsonToken.VALUE_STRING>
			//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  15   34:getstatic       #34  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
			//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  20   45:getstatic       #37  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
			//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  25   56:getstatic       #40  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
			//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
	//*   5    9:getstatic       #195 <Field int[] TreeTraversingParser$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*   6   12:aload_0         
	//*   7   13:getfield        #74  <Field JsonToken _currToken>
	//*   8   16:invokevirtual   #198 <Method int JsonToken.ordinal()>
	//*   9   19:iaload          
		{
	//*  10   20:tableswitch     1 5: default 56
	//	               1 99
	//	               2 91
	//	               3 80
	//	               4 80
	//	               5 59
	//*  11   56:goto            107
		case 5: // '\005'
			JsonNode jsonnode = currentNode();
	//   12   59:aload_0         
	//   13   60:invokevirtual   #82  <Method JsonNode currentNode()>
	//   14   63:astore_1        
			if(jsonnode != null && jsonnode.isBinary())
	//*  15   64:aload_1         
	//*  16   65:ifnull          107
	//*  17   68:aload_1         
	//*  18   69:invokevirtual   #163 <Method boolean JsonNode.isBinary()>
	//*  19   72:ifeq            107
				return jsonnode.asText();
	//   20   75:aload_1         
	//   21   76:invokevirtual   #201 <Method String JsonNode.asText()>
	//   22   79:areturn         
			break;

		case 3: // '\003'
		case 4: // '\004'
			return String.valueOf(((Object) (currentNode().numberValue())));
	//   23   80:aload_0         
	//   24   81:invokevirtual   #82  <Method JsonNode currentNode()>
	//   25   84:invokevirtual   #188 <Method Number JsonNode.numberValue()>
	//   26   87:invokestatic    #207 <Method String String.valueOf(Object)>
	//   27   90:areturn         

		case 2: // '\002'
			return currentNode().textValue();
	//   28   91:aload_0         
	//   29   92:invokevirtual   #82  <Method JsonNode currentNode()>
	//   30   95:invokevirtual   #210 <Method String JsonNode.textValue()>
	//   31   98:areturn         

		case 1: // '\001'
			return _nodeCursor.getCurrentName();
	//   32   99:aload_0         
	//   33  100:getfield        #46  <Field NodeCursor _nodeCursor>
	//   34  103:invokevirtual   #149 <Method String NodeCursor.getCurrentName()>
	//   35  106:areturn         
		}
		if(_currToken == null)
	//*  36  107:aload_0         
	//*  37  108:getfield        #74  <Field JsonToken _currToken>
	//*  38  111:ifnonnull       116
			return null;
	//   39  114:aconst_null     
	//   40  115:areturn         
		else
			return _currToken.asString();
	//   41  116:aload_0         
	//   42  117:getfield        #74  <Field JsonToken _currToken>
	//   43  120:invokevirtual   #213 <Method String JsonToken.asString()>
	//   44  123:areturn         
	}

	public char[] getTextCharacters()
		throws IOException, JsonParseException
	{
		return getText().toCharArray();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method String getText()>
	//    2    4:invokevirtual   #220 <Method char[] String.toCharArray()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException, JsonParseException
	{
		return getText().length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method String getText()>
	//    2    4:invokevirtual   #224 <Method int String.length()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException, JsonParseException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return JsonLocation.NA;
	//    0    0:getstatic       #146 <Field JsonLocation JsonLocation.NA>
	//    1    3:areturn         
	}

	public boolean hasTextCharacters()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNaN()
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifne            27
		{
			JsonNode jsonnode = currentNode();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #82  <Method JsonNode currentNode()>
	//    5   11:astore_1        
			if(jsonnode instanceof NumericNode)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #230 <Class NumericNode>
	//*   8   16:ifeq            27
				return ((NumericNode)jsonnode).isNaN();
	//    9   19:aload_1         
	//   10   20:checkcast       #230 <Class NumericNode>
	//   11   23:invokevirtual   #232 <Method boolean NumericNode.isNaN()>
	//   12   26:ireturn         
		}
		return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public JsonToken nextToken()
		throws IOException, JsonParseException
	{
		Object obj = ((Object) (_nextToken));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonToken _nextToken>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
		{
			_currToken = ((JsonToken) (obj));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #74  <Field JsonToken _currToken>
			_nextToken = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #39  <Field JsonToken _nextToken>
			return _currToken;
	//   11   19:aload_0         
	//   12   20:getfield        #74  <Field JsonToken _currToken>
	//   13   23:areturn         
		}
		if(_startContainer)
	//*  14   24:aload_0         
	//*  15   25:getfield        #235 <Field boolean _startContainer>
	//*  16   28:ifeq            129
		{
			_startContainer = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #235 <Field boolean _startContainer>
			if(!_nodeCursor.currentHasChildren())
	//*  20   36:aload_0         
	//*  21   37:getfield        #46  <Field NodeCursor _nodeCursor>
	//*  22   40:invokevirtual   #238 <Method boolean NodeCursor.currentHasChildren()>
	//*  23   43:ifne            77
			{
				if(_currToken == JsonToken.START_OBJECT)
	//*  24   46:aload_0         
	//*  25   47:getfield        #74  <Field JsonToken _currToken>
	//*  26   50:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  27   53:if_acmpne       63
					obj = ((Object) (JsonToken.END_OBJECT));
	//   28   56:getstatic       #241 <Field JsonToken JsonToken.END_OBJECT>
	//   29   59:astore_1        
				else
	//*  30   60:goto            67
					obj = ((Object) (JsonToken.END_ARRAY));
	//   31   63:getstatic       #244 <Field JsonToken JsonToken.END_ARRAY>
	//   32   66:astore_1        
				_currToken = ((JsonToken) (obj));
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:putfield        #74  <Field JsonToken _currToken>
				return _currToken;
	//   36   72:aload_0         
	//   37   73:getfield        #74  <Field JsonToken _currToken>
	//   38   76:areturn         
			}
			_nodeCursor = _nodeCursor.iterateChildren();
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #46  <Field NodeCursor _nodeCursor>
	//   42   82:invokevirtual   #248 <Method NodeCursor NodeCursor.iterateChildren()>
	//   43   85:putfield        #46  <Field NodeCursor _nodeCursor>
			_currToken = _nodeCursor.nextToken();
	//   44   88:aload_0         
	//   45   89:aload_0         
	//   46   90:getfield        #46  <Field NodeCursor _nodeCursor>
	//   47   93:invokevirtual   #250 <Method JsonToken NodeCursor.nextToken()>
	//   48   96:putfield        #74  <Field JsonToken _currToken>
			if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*  49   99:aload_0         
	//*  50  100:getfield        #74  <Field JsonToken _currToken>
	//*  51  103:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  52  106:if_acmpeq       119
	//*  53  109:aload_0         
	//*  54  110:getfield        #74  <Field JsonToken _currToken>
	//*  55  113:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  56  116:if_acmpne       124
				_startContainer = true;
	//   57  119:aload_0         
	//   58  120:iconst_1        
	//   59  121:putfield        #235 <Field boolean _startContainer>
			return _currToken;
	//   60  124:aload_0         
	//   61  125:getfield        #74  <Field JsonToken _currToken>
	//   62  128:areturn         
		}
		obj = ((Object) (_nodeCursor));
	//   63  129:aload_0         
	//   64  130:getfield        #46  <Field NodeCursor _nodeCursor>
	//   65  133:astore_1        
		if(obj == null)
	//*  66  134:aload_1         
	//*  67  135:ifnonnull       145
		{
			_closed = true;
	//   68  138:aload_0         
	//   69  139:iconst_1        
	//   70  140:putfield        #71  <Field boolean _closed>
			return null;
	//   71  143:aconst_null     
	//   72  144:areturn         
		}
		_currToken = ((NodeCursor) (obj)).nextToken();
	//   73  145:aload_0         
	//   74  146:aload_1         
	//   75  147:invokevirtual   #250 <Method JsonToken NodeCursor.nextToken()>
	//   76  150:putfield        #74  <Field JsonToken _currToken>
		if(_currToken != null)
	//*  77  153:aload_0         
	//*  78  154:getfield        #74  <Field JsonToken _currToken>
	//*  79  157:ifnull          190
		{
			if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*  80  160:aload_0         
	//*  81  161:getfield        #74  <Field JsonToken _currToken>
	//*  82  164:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  83  167:if_acmpeq       180
	//*  84  170:aload_0         
	//*  85  171:getfield        #74  <Field JsonToken _currToken>
	//*  86  174:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  87  177:if_acmpne       185
				_startContainer = true;
	//   88  180:aload_0         
	//   89  181:iconst_1        
	//   90  182:putfield        #235 <Field boolean _startContainer>
			return _currToken;
	//   91  185:aload_0         
	//   92  186:getfield        #74  <Field JsonToken _currToken>
	//   93  189:areturn         
		} else
		{
			_currToken = _nodeCursor.endToken();
	//   94  190:aload_0         
	//   95  191:aload_0         
	//   96  192:getfield        #46  <Field NodeCursor _nodeCursor>
	//   97  195:invokevirtual   #253 <Method JsonToken NodeCursor.endToken()>
	//   98  198:putfield        #74  <Field JsonToken _currToken>
			_nodeCursor = _nodeCursor.getParent();
	//   99  201:aload_0         
	//  100  202:aload_0         
	//  101  203:getfield        #46  <Field NodeCursor _nodeCursor>
	//  102  206:invokevirtual   #256 <Method NodeCursor NodeCursor.getParent()>
	//  103  209:putfield        #46  <Field NodeCursor _nodeCursor>
			return _currToken;
	//  104  212:aload_0         
	//  105  213:getfield        #74  <Field JsonToken _currToken>
	//  106  216:areturn         
		}
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException, JsonParseException
	{
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #260 <Method byte[] getBinaryValue(Base64Variant)>
	//    3    5:astore_1        
		if(base64variant != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          21
		{
			outputstream.write(((byte []) (base64variant)), 0, base64variant.length);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:aload_1         
	//   10   14:arraylength     
	//   11   15:invokevirtual   #266 <Method void OutputStream.write(byte[], int, int)>
			return base64variant.length;
	//   12   18:aload_1         
	//   13   19:arraylength     
	//   14   20:ireturn         
		} else
		{
			return 0;
	//   15   21:iconst_0        
	//   16   22:ireturn         
		}
	}

	public JsonParser skipChildren()
		throws IOException, JsonParseException
	{
		if(_currToken == JsonToken.START_OBJECT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field JsonToken _currToken>
	//*   2    4:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpne       24
		{
			_startContainer = false;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:putfield        #235 <Field boolean _startContainer>
			_currToken = JsonToken.END_OBJECT;
	//    7   15:aload_0         
	//    8   16:getstatic       #241 <Field JsonToken JsonToken.END_OBJECT>
	//    9   19:putfield        #74  <Field JsonToken _currToken>
			return ((JsonParser) (this));
	//   10   22:aload_0         
	//   11   23:areturn         
		}
		if(_currToken == JsonToken.START_ARRAY)
	//*  12   24:aload_0         
	//*  13   25:getfield        #74  <Field JsonToken _currToken>
	//*  14   28:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  15   31:if_acmpne       46
		{
			_startContainer = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #235 <Field boolean _startContainer>
			_currToken = JsonToken.END_ARRAY;
	//   19   39:aload_0         
	//   20   40:getstatic       #244 <Field JsonToken JsonToken.END_ARRAY>
	//   21   43:putfield        #74  <Field JsonToken _currToken>
		}
		return ((JsonParser) (this));
	//   22   46:aload_0         
	//   23   47:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #276 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected boolean _closed;
	protected JsonToken _nextToken;
	protected NodeCursor _nodeCursor;
	protected ObjectCodec _objectCodec;
	protected boolean _startContainer;
}
