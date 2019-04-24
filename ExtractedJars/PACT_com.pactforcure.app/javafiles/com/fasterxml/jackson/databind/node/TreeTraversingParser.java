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
//			NodeCursor, POJONode, BinaryNode

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
		if(_closed || _nodeCursor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean _closed>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #46  <Field NodeCursor _nodeCursor>
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return _nodeCursor.currentNode();
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field NodeCursor _nodeCursor>
	//   10   20:invokevirtual   #80  <Method JsonNode NodeCursor.currentNode()>
	//   11   23:areturn         
	}

	protected JsonNode currentNumericNode()
		throws JsonParseException
	{
		Object obj = ((Object) (currentNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method JsonNode currentNode()>
	//    2    4:astore_1        
		if(obj == null || !((JsonNode) (obj)).isNumber())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #85  <Method boolean JsonNode.isNumber()>
	//*   7   13:ifne            59
		{
			if(obj == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       51
				obj = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
			else
	//*  12   22:aload_0         
	//*  13   23:new             #87  <Class StringBuilder>
	//*  14   26:dup             
	//*  15   27:invokespecial   #89  <Method void StringBuilder()>
	//*  16   30:ldc1            #91  <String "Current token (">
	//*  17   32:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//*  20   39:ldc1            #100 <String ") not numeric, can not use numeric value accessors">
	//*  21   41:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//*  22   44:invokevirtual   #104 <Method String StringBuilder.toString()>
	//*  23   47:invokevirtual   #108 <Method JsonParseException _constructError(String)>
	//*  24   50:athrow          
				obj = ((Object) (((JsonNode) (obj)).asToken()));
	//   25   51:aload_1         
	//   26   52:invokevirtual   #112 <Method JsonToken JsonNode.asToken()>
	//   27   55:astore_1        
			throw _constructError((new StringBuilder()).append("Current token (").append(obj).append(") not numeric, can not use numeric value accessors").toString());
		} else
	//*  28   56:goto            22
		{
			return ((JsonNode) (obj));
	//   29   59:aload_1         
	//   30   60:areturn         
		}
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
	//*   4    6:ifnull          50
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
	//*  14   24:ifeq            50
			{
				base64variant = ((Base64Variant) (((POJONode)base64variant).getPojo()));
	//   15   27:aload_1         
	//   16   28:checkcast       #130 <Class POJONode>
	//   17   31:invokevirtual   #134 <Method Object POJONode.getPojo()>
	//   18   34:astore_1        
				if(base64variant instanceof byte[])
	//*  19   35:aload_1         
	//*  20   36:instanceof      #136 <Class byte[]>
	//*  21   39:ifeq            50
					return (byte[])(byte[])base64variant;
	//   22   42:aload_1         
	//   23   43:checkcast       #136 <Class byte[]>
	//   24   46:checkcast       #136 <Class byte[]>
	//   25   49:areturn         
			}
		}
		return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
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
		if(_nodeCursor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field NodeCursor _nodeCursor>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _nodeCursor.getCurrentName();
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field NodeCursor _nodeCursor>
	//    7   13:invokevirtual   #149 <Method String NodeCursor.getCurrentName()>
	//    8   16:areturn         
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
		if(!_closed) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean _closed>
	//    2    4:ifeq            9
_L1:
		return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
_L2:
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
			//*  30   65:astore_0        
			//*  31   66:return          
			//*  32   67:astore_0        
			//*  33   68:goto            53
			//*  34   71:astore_0        
			//*  35   72:goto            42
			//*  36   75:astore_0        
			//*  37   76:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   79:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
	//    5    9:getstatic       #195 <Field int[] TreeTraversingParser$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field JsonToken _currToken>
	//    8   16:invokevirtual   #198 <Method int JsonToken.ordinal()>
	//    9   19:iaload          
		JVM INSTR tableswitch 1 5: default 56
	//	               1 71
	//	               2 79
	//	               3 87
	//	               4 87
	//	               5 98;
	//   10   20:tableswitch     1 5: default 56
	//	               1 71
	//	               2 79
	//	               3 87
	//	               4 87
	//	               5 98
		   goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
		if(_currToken != null)
	//*  11   56:aload_0         
	//*  12   57:getfield        #74  <Field JsonToken _currToken>
	//*  13   60:ifnull          7
			return _currToken.asString();
	//   14   63:aload_0         
	//   15   64:getfield        #74  <Field JsonToken _currToken>
	//   16   67:invokevirtual   #201 <Method String JsonToken.asString()>
	//   17   70:areturn         
		  goto _L8
_L4:
		return _nodeCursor.getCurrentName();
	//   18   71:aload_0         
	//   19   72:getfield        #46  <Field NodeCursor _nodeCursor>
	//   20   75:invokevirtual   #149 <Method String NodeCursor.getCurrentName()>
	//   21   78:areturn         
_L5:
		return currentNode().textValue();
	//   22   79:aload_0         
	//   23   80:invokevirtual   #82  <Method JsonNode currentNode()>
	//   24   83:invokevirtual   #204 <Method String JsonNode.textValue()>
	//   25   86:areturn         
_L6:
		return String.valueOf(((Object) (currentNode().numberValue())));
	//   26   87:aload_0         
	//   27   88:invokevirtual   #82  <Method JsonNode currentNode()>
	//   28   91:invokevirtual   #188 <Method Number JsonNode.numberValue()>
	//   29   94:invokestatic    #210 <Method String String.valueOf(Object)>
	//   30   97:areturn         
_L7:
		JsonNode jsonnode = currentNode();
	//   31   98:aload_0         
	//   32   99:invokevirtual   #82  <Method JsonNode currentNode()>
	//   33  102:astore_1        
		if(jsonnode != null && jsonnode.isBinary())
	//*  34  103:aload_1         
	//*  35  104:ifnull          56
	//*  36  107:aload_1         
	//*  37  108:invokevirtual   #163 <Method boolean JsonNode.isBinary()>
	//*  38  111:ifeq            56
			return jsonnode.asText();
	//   39  114:aload_1         
	//   40  115:invokevirtual   #213 <Method String JsonNode.asText()>
	//   41  118:areturn         
		if(true) goto _L3; else goto _L8
_L8:
		if(true) goto _L1; else goto _L9
_L9:
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

	public boolean isClosed()
	{
		return _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean _closed>
	//    2    4:ireturn         
	}

	public JsonToken nextToken()
		throws IOException, JsonParseException
	{
		if(_nextToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field JsonToken _nextToken>
	//*   2    4:ifnull          25
		{
			_currToken = _nextToken;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field JsonToken _nextToken>
	//    6   12:putfield        #74  <Field JsonToken _currToken>
			_nextToken = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #39  <Field JsonToken _nextToken>
			return _currToken;
	//   10   20:aload_0         
	//   11   21:getfield        #74  <Field JsonToken _currToken>
	//   12   24:areturn         
		}
		if(_startContainer)
	//*  13   25:aload_0         
	//*  14   26:getfield        #231 <Field boolean _startContainer>
	//*  15   29:ifeq            130
		{
			_startContainer = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #231 <Field boolean _startContainer>
			if(!_nodeCursor.currentHasChildren())
	//*  19   37:aload_0         
	//*  20   38:getfield        #46  <Field NodeCursor _nodeCursor>
	//*  21   41:invokevirtual   #234 <Method boolean NodeCursor.currentHasChildren()>
	//*  22   44:ifne            78
			{
				JsonToken jsontoken;
				if(_currToken == JsonToken.START_OBJECT)
	//*  23   47:aload_0         
	//*  24   48:getfield        #74  <Field JsonToken _currToken>
	//*  25   51:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  26   54:if_acmpne       71
					jsontoken = JsonToken.END_OBJECT;
	//   27   57:getstatic       #237 <Field JsonToken JsonToken.END_OBJECT>
	//   28   60:astore_1        
				else
	//*  29   61:aload_0         
	//*  30   62:aload_1         
	//*  31   63:putfield        #74  <Field JsonToken _currToken>
	//*  32   66:aload_0         
	//*  33   67:getfield        #74  <Field JsonToken _currToken>
	//*  34   70:areturn         
					jsontoken = JsonToken.END_ARRAY;
	//   35   71:getstatic       #240 <Field JsonToken JsonToken.END_ARRAY>
	//   36   74:astore_1        
				_currToken = jsontoken;
				return _currToken;
			}
	//*  37   75:goto            61
			_nodeCursor = _nodeCursor.iterateChildren();
	//   38   78:aload_0         
	//   39   79:aload_0         
	//   40   80:getfield        #46  <Field NodeCursor _nodeCursor>
	//   41   83:invokevirtual   #244 <Method NodeCursor NodeCursor.iterateChildren()>
	//   42   86:putfield        #46  <Field NodeCursor _nodeCursor>
			_currToken = _nodeCursor.nextToken();
	//   43   89:aload_0         
	//   44   90:aload_0         
	//   45   91:getfield        #46  <Field NodeCursor _nodeCursor>
	//   46   94:invokevirtual   #246 <Method JsonToken NodeCursor.nextToken()>
	//   47   97:putfield        #74  <Field JsonToken _currToken>
			if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*  48  100:aload_0         
	//*  49  101:getfield        #74  <Field JsonToken _currToken>
	//*  50  104:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  51  107:if_acmpeq       120
	//*  52  110:aload_0         
	//*  53  111:getfield        #74  <Field JsonToken _currToken>
	//*  54  114:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  55  117:if_acmpne       125
				_startContainer = true;
	//   56  120:aload_0         
	//   57  121:iconst_1        
	//   58  122:putfield        #231 <Field boolean _startContainer>
			return _currToken;
	//   59  125:aload_0         
	//   60  126:getfield        #74  <Field JsonToken _currToken>
	//   61  129:areturn         
		}
		if(_nodeCursor == null)
	//*  62  130:aload_0         
	//*  63  131:getfield        #46  <Field NodeCursor _nodeCursor>
	//*  64  134:ifnonnull       144
		{
			_closed = true;
	//   65  137:aload_0         
	//   66  138:iconst_1        
	//   67  139:putfield        #71  <Field boolean _closed>
			return null;
	//   68  142:aconst_null     
	//   69  143:areturn         
		}
		_currToken = _nodeCursor.nextToken();
	//   70  144:aload_0         
	//   71  145:aload_0         
	//   72  146:getfield        #46  <Field NodeCursor _nodeCursor>
	//   73  149:invokevirtual   #246 <Method JsonToken NodeCursor.nextToken()>
	//   74  152:putfield        #74  <Field JsonToken _currToken>
		if(_currToken != null)
	//*  75  155:aload_0         
	//*  76  156:getfield        #74  <Field JsonToken _currToken>
	//*  77  159:ifnull          192
		{
			if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*  78  162:aload_0         
	//*  79  163:getfield        #74  <Field JsonToken _currToken>
	//*  80  166:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  81  169:if_acmpeq       182
	//*  82  172:aload_0         
	//*  83  173:getfield        #74  <Field JsonToken _currToken>
	//*  84  176:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  85  179:if_acmpne       187
				_startContainer = true;
	//   86  182:aload_0         
	//   87  183:iconst_1        
	//   88  184:putfield        #231 <Field boolean _startContainer>
			return _currToken;
	//   89  187:aload_0         
	//   90  188:getfield        #74  <Field JsonToken _currToken>
	//   91  191:areturn         
		} else
		{
			_currToken = _nodeCursor.endToken();
	//   92  192:aload_0         
	//   93  193:aload_0         
	//   94  194:getfield        #46  <Field NodeCursor _nodeCursor>
	//   95  197:invokevirtual   #249 <Method JsonToken NodeCursor.endToken()>
	//   96  200:putfield        #74  <Field JsonToken _currToken>
			_nodeCursor = _nodeCursor.getParent();
	//   97  203:aload_0         
	//   98  204:aload_0         
	//   99  205:getfield        #46  <Field NodeCursor _nodeCursor>
	//  100  208:invokevirtual   #252 <Method NodeCursor NodeCursor.getParent()>
	//  101  211:putfield        #46  <Field NodeCursor _nodeCursor>
			return _currToken;
	//  102  214:aload_0         
	//  103  215:getfield        #74  <Field JsonToken _currToken>
	//  104  218:areturn         
		}
	}

	public void overrideCurrentName(String s)
	{
		if(_nodeCursor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field NodeCursor _nodeCursor>
	//*   2    4:ifnull          15
			_nodeCursor.overrideCurrentName(s);
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field NodeCursor _nodeCursor>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #256 <Method void NodeCursor.overrideCurrentName(String)>
	//    7   15:return          
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException, JsonParseException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #260 <Method byte[] getBinaryValue(Base64Variant)>
	//    5    7:astore_1        
		if(base64variant != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          23
		{
			outputstream.write(((byte []) (base64variant)), 0, base64variant.length);
	//    8   12:aload_2         
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:aload_1         
	//   12   16:arraylength     
	//   13   17:invokevirtual   #266 <Method void OutputStream.write(byte[], int, int)>
			i = base64variant.length;
	//   14   20:aload_1         
	//   15   21:arraylength     
	//   16   22:istore_3        
		}
		return i;
	//   17   23:iload_3         
	//   18   24:ireturn         
	}

	public void setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ObjectCodec _objectCodec>
	//    3    5:return          
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
	//    6   12:putfield        #231 <Field boolean _startContainer>
			_currToken = JsonToken.END_OBJECT;
	//    7   15:aload_0         
	//    8   16:getstatic       #237 <Field JsonToken JsonToken.END_OBJECT>
	//    9   19:putfield        #74  <Field JsonToken _currToken>
		} else
	//*  10   22:aload_0         
	//*  11   23:areturn         
		if(_currToken == JsonToken.START_ARRAY)
	//*  12   24:aload_0         
	//*  13   25:getfield        #74  <Field JsonToken _currToken>
	//*  14   28:getstatic       #37  <Field JsonToken JsonToken.START_ARRAY>
	//*  15   31:if_acmpne       22
		{
			_startContainer = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #231 <Field boolean _startContainer>
			_currToken = JsonToken.END_ARRAY;
	//   19   39:aload_0         
	//   20   40:getstatic       #240 <Field JsonToken JsonToken.END_ARRAY>
	//   21   43:putfield        #74  <Field JsonToken _currToken>
			return ((JsonParser) (this));
	//   22   46:aload_0         
	//   23   47:areturn         
		}
		return ((JsonParser) (this));
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #278 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected boolean _closed;
	protected JsonToken _nextToken;
	protected NodeCursor _nodeCursor;
	protected ObjectCodec _objectCodec;
	protected boolean _startContainer;
}
