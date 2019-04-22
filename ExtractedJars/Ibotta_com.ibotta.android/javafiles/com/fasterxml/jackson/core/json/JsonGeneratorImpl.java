// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.json:
//			JsonWriteContext

public abstract class JsonGeneratorImpl extends GeneratorBase
{

	public JsonGeneratorImpl(IOContext iocontext, int i, ObjectCodec objectcodec)
	{
		super(i, objectcodec);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #33  <Method void GeneratorBase(int, ObjectCodec)>
		_outputEscapes = sOutputEscapes;
	//    4    6:aload_0         
	//    5    7:getstatic       #27  <Field int[] sOutputEscapes>
	//    6   10:putfield        #35  <Field int[] _outputEscapes>
		_rootValueSeparator = ((SerializableString) (DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
	//    7   13:aload_0         
	//    8   14:getstatic       #41  <Field com.fasterxml.jackson.core.io.SerializedString DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR>
	//    9   17:putfield        #43  <Field SerializableString _rootValueSeparator>
		_ioContext = iocontext;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #45  <Field IOContext _ioContext>
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i))
	//*  13   25:getstatic       #51  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  14   28:iload_2         
	//*  15   29:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  16   32:ifeq            41
			_maximumNonEscapedChar = 127;
	//   17   35:aload_0         
	//   18   36:bipush          127
	//   19   38:putfield        #57  <Field int _maximumNonEscapedChar>
		_cfgUnqNames = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i) ^ true;
	//   20   41:aload_0         
	//   21   42:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//   22   45:iload_2         
	//   23   46:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//   24   49:iconst_1        
	//   25   50:ixor            
	//   26   51:putfield        #62  <Field boolean _cfgUnqNames>
	//   27   54:return          
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		super._checkStdFeatureChanges(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void GeneratorBase._checkStdFeatureChanges(int, int)>
		_cfgUnqNames = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i) ^ true;
	//    4    6:aload_0         
	//    5    7:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//    6   10:iload_1         
	//    7   11:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//    8   14:iconst_1        
	//    9   15:ixor            
	//   10   16:putfield        #62  <Field boolean _cfgUnqNames>
	//   11   19:return          
	}

	protected void _reportCantWriteValueExpectName(String s)
		throws IOException
	{
		_reportError(String.format("Can not %s, expecting field name (context: %s)", new Object[] {
			s, _writeContext.typeDesc()
		}));
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "Can not %s, expecting field name (context: %s)">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:aload_0         
	//   11   14:getfield        #78  <Field JsonWriteContext _writeContext>
	//   12   17:invokevirtual   #84  <Method String JsonWriteContext.typeDesc()>
	//   13   20:aastore         
	//   14   21:invokestatic    #90  <Method String String.format(String, Object[])>
	//   15   24:invokevirtual   #93  <Method void _reportError(String)>
	//   16   27:return          
	}

	protected void _verifyPrettyValueWrite(String s, int i)
		throws IOException
	{
		if(i != 5)
	//*   0    0:iload_2         
	//*   1    1:iconst_5        
	//*   2    2:icmpeq          116
		{
			switch(i)
	//*   3    5:iload_2         
			{
	//*   4    6:tableswitch     0 3: default 36
	//	               0 74
	//	               1 63
	//	               2 52
	//	               3 41
			default:
				_throwInternal();
	//    5   36:aload_0         
	//    6   37:invokevirtual   #99  <Method void _throwInternal()>
				return;
	//    7   40:return          

			case 3: // '\003'
				_cfgPrettyPrinter.writeRootValueSeparator(((JsonGenerator) (this)));
	//    8   41:aload_0         
	//    9   42:getfield        #103 <Field PrettyPrinter _cfgPrettyPrinter>
	//   10   45:aload_0         
	//   11   46:invokeinterface #109 <Method void PrettyPrinter.writeRootValueSeparator(JsonGenerator)>
				return;
	//   12   51:return          

			case 2: // '\002'
				_cfgPrettyPrinter.writeObjectFieldValueSeparator(((JsonGenerator) (this)));
	//   13   52:aload_0         
	//   14   53:getfield        #103 <Field PrettyPrinter _cfgPrettyPrinter>
	//   15   56:aload_0         
	//   16   57:invokeinterface #112 <Method void PrettyPrinter.writeObjectFieldValueSeparator(JsonGenerator)>
				return;
	//   17   62:return          

			case 1: // '\001'
				_cfgPrettyPrinter.writeArrayValueSeparator(((JsonGenerator) (this)));
	//   18   63:aload_0         
	//   19   64:getfield        #103 <Field PrettyPrinter _cfgPrettyPrinter>
	//   20   67:aload_0         
	//   21   68:invokeinterface #115 <Method void PrettyPrinter.writeArrayValueSeparator(JsonGenerator)>
				return;
	//   22   73:return          

			case 0: // '\0'
				break;
			}
			if(_writeContext.inArray())
	//*  23   74:aload_0         
	//*  24   75:getfield        #78  <Field JsonWriteContext _writeContext>
	//*  25   78:invokevirtual   #119 <Method boolean JsonWriteContext.inArray()>
	//*  26   81:ifeq            95
			{
				_cfgPrettyPrinter.beforeArrayValues(((JsonGenerator) (this)));
	//   27   84:aload_0         
	//   28   85:getfield        #103 <Field PrettyPrinter _cfgPrettyPrinter>
	//   29   88:aload_0         
	//   30   89:invokeinterface #122 <Method void PrettyPrinter.beforeArrayValues(JsonGenerator)>
				return;
	//   31   94:return          
			}
			if(_writeContext.inObject())
	//*  32   95:aload_0         
	//*  33   96:getfield        #78  <Field JsonWriteContext _writeContext>
	//*  34   99:invokevirtual   #125 <Method boolean JsonWriteContext.inObject()>
	//*  35  102:ifeq            121
			{
				_cfgPrettyPrinter.beforeObjectEntries(((JsonGenerator) (this)));
	//   36  105:aload_0         
	//   37  106:getfield        #103 <Field PrettyPrinter _cfgPrettyPrinter>
	//   38  109:aload_0         
	//   39  110:invokeinterface #128 <Method void PrettyPrinter.beforeObjectEntries(JsonGenerator)>
				return;
	//   40  115:return          
			}
		} else
		{
			_reportCantWriteValueExpectName(s);
	//   41  116:aload_0         
	//   42  117:aload_1         
	//   43  118:invokevirtual   #130 <Method void _reportCantWriteValueExpectName(String)>
		}
	//   44  121:return          
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		super.disable(feature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method JsonGenerator GeneratorBase.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    3    5:pop             
		if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES)
	//*   4    6:aload_1         
	//*   5    7:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//*   6   10:if_acmpne       18
			_cfgUnqNames = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #62  <Field boolean _cfgUnqNames>
		return ((JsonGenerator) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
	{
		_characterEscapes = characterescapes;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field CharacterEscapes _characterEscapes>
		if(characterescapes == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       18
		{
			_outputEscapes = sOutputEscapes;
	//    5    9:aload_0         
	//    6   10:getstatic       #27  <Field int[] sOutputEscapes>
	//    7   13:putfield        #35  <Field int[] _outputEscapes>
			return ((JsonGenerator) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			_outputEscapes = characterescapes.getEscapeCodesForAscii();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #143 <Method int[] CharacterEscapes.getEscapeCodesForAscii()>
	//   13   23:putfield        #35  <Field int[] _outputEscapes>
			return ((JsonGenerator) (this));
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public JsonGenerator setHighestNonEscapedChar(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		_maximumNonEscapedChar = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #57  <Field int _maximumNonEscapedChar>
		return ((JsonGenerator) (this));
	//    9   13:aload_0         
	//   10   14:areturn         
	}

	public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
	{
		_rootValueSeparator = serializablestring;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field SerializableString _rootValueSeparator>
		return ((JsonGenerator) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Version version()
	{
		return VersionUtil.versionFor(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:invokestatic    #159 <Method Version VersionUtil.versionFor(Class)>
	//    3    7:areturn         
	}

	public final void writeStringField(String s, String s1)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #164 <Method void writeFieldName(String)>
		writeString(s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #167 <Method void writeString(String)>
	//    6   10:return          
	}

	protected static final int sOutputEscapes[] = CharTypes.get7BitOutputEscapes();
	protected boolean _cfgUnqNames;
	protected CharacterEscapes _characterEscapes;
	protected final IOContext _ioContext;
	protected int _maximumNonEscapedChar;
	protected int _outputEscapes[];
	protected SerializableString _rootValueSeparator;

	static 
	{
	//    0    0:invokestatic    #25  <Method int[] CharTypes.get7BitOutputEscapes()>
	//    1    3:putstatic       #27  <Field int[] sOutputEscapes>
	//*   2    6:return          
	}
}
