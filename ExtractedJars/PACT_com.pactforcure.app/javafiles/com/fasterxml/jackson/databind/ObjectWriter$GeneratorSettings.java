// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Instantiatable;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectWriter

public static final class ObjectWriter$GeneratorSettings
	implements Serializable
{

	public void initialize(JsonGenerator jsongenerator)
	{
		PrettyPrinter prettyprinter1 = prettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//    2    4:astore_3        
		if(prettyPrinter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//*   5    9:ifnull          25
			if(prettyprinter1 == ObjectWriter.NULL_PRETTY_PRINTER)
	//*   6   12:aload_3         
	//*   7   13:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
	//*   8   16:if_acmpne       73
			{
				jsongenerator.setPrettyPrinter(((PrettyPrinter) (null)));
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   12   24:pop             
			} else
	//*  13   25:aload_0         
	//*  14   26:getfield        #40  <Field CharacterEscapes characterEscapes>
	//*  15   29:ifnull          41
	//*  16   32:aload_1         
	//*  17   33:aload_0         
	//*  18   34:getfield        #40  <Field CharacterEscapes characterEscapes>
	//*  19   37:invokevirtual   #57  <Method JsonGenerator JsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//*  20   40:pop             
	//*  21   41:aload_0         
	//*  22   42:getfield        #38  <Field FormatSchema schema>
	//*  23   45:ifnull          56
	//*  24   48:aload_1         
	//*  25   49:aload_0         
	//*  26   50:getfield        #38  <Field FormatSchema schema>
	//*  27   53:invokevirtual   #61  <Method void JsonGenerator.setSchema(FormatSchema)>
	//*  28   56:aload_0         
	//*  29   57:getfield        #42  <Field SerializableString rootValueSeparator>
	//*  30   60:ifnull          72
	//*  31   63:aload_1         
	//*  32   64:aload_0         
	//*  33   65:getfield        #42  <Field SerializableString rootValueSeparator>
	//*  34   68:invokevirtual   #65  <Method JsonGenerator JsonGenerator.setRootValueSeparator(SerializableString)>
	//*  35   71:pop             
	//*  36   72:return          
			{
				PrettyPrinter prettyprinter = prettyprinter1;
	//   37   73:aload_3         
	//   38   74:astore_2        
				if(prettyprinter1 instanceof Instantiatable)
	//*  39   75:aload_3         
	//*  40   76:instanceof      #67  <Class Instantiatable>
	//*  41   79:ifeq            95
					prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
	//   42   82:aload_3         
	//   43   83:checkcast       #67  <Class Instantiatable>
	//   44   86:invokeinterface #71  <Method Object Instantiatable.createInstance()>
	//   45   91:checkcast       #73  <Class PrettyPrinter>
	//   46   94:astore_2        
				jsongenerator.setPrettyPrinter(prettyprinter);
	//   47   95:aload_1         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   50  100:pop             
			}
		if(characterEscapes != null)
			jsongenerator.setCharacterEscapes(characterEscapes);
		if(schema != null)
			jsongenerator.setSchema(schema);
		if(rootValueSeparator != null)
			jsongenerator.setRootValueSeparator(rootValueSeparator);
	//*  51  101:goto            25
	}

	public ObjectWriter$GeneratorSettings with(FormatSchema formatschema)
	{
		if(schema == formatschema)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field FormatSchema schema>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ObjectWriter$GeneratorSettings(prettyPrinter, formatschema, characterEscapes, rootValueSeparator);
	//    6   10:new             #2   <Class ObjectWriter$GeneratorSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #40  <Field CharacterEscapes characterEscapes>
	//   13   23:aload_0         
	//   14   24:getfield        #42  <Field SerializableString rootValueSeparator>
	//   15   27:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   16   30:areturn         
	}

	public ObjectWriter$GeneratorSettings with(PrettyPrinter prettyprinter)
	{
		PrettyPrinter prettyprinter1 = prettyprinter;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(prettyprinter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			prettyprinter1 = ObjectWriter.NULL_PRETTY_PRINTER;
	//    4    6:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
	//    5    9:astore_2        
		if(prettyprinter1 == prettyPrinter)
	//*   6   10:aload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//*   9   15:if_acmpne       20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new ObjectWriter$GeneratorSettings(prettyprinter1, schema, characterEscapes, rootValueSeparator);
	//   12   20:new             #2   <Class ObjectWriter$GeneratorSettings>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:aload_0         
	//   16   26:getfield        #38  <Field FormatSchema schema>
	//   17   29:aload_0         
	//   18   30:getfield        #40  <Field CharacterEscapes characterEscapes>
	//   19   33:aload_0         
	//   20   34:getfield        #42  <Field SerializableString rootValueSeparator>
	//   21   37:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   22   40:areturn         
	}

	public ObjectWriter$GeneratorSettings with(CharacterEscapes characterescapes)
	{
		if(characterEscapes == characterescapes)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field CharacterEscapes characterEscapes>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ObjectWriter$GeneratorSettings(prettyPrinter, schema, characterescapes, rootValueSeparator);
	//    6   10:new             #2   <Class ObjectWriter$GeneratorSettings>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//   10   18:aload_0         
	//   11   19:getfield        #38  <Field FormatSchema schema>
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #42  <Field SerializableString rootValueSeparator>
	//   15   27:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   16   30:areturn         
	}

	public ObjectWriter$GeneratorSettings withRootValueSeparator(SerializableString serializablestring)
	{
		if(serializablestring != null ? rootValueSeparator != null && serializablestring.getValue().equals(((Object) (rootValueSeparator.getValue()))) : rootValueSeparator == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field SerializableString rootValueSeparator>
	//*   4    8:ifnonnull       41
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
	//*   7   13:aload_0         
	//*   8   14:getfield        #42  <Field SerializableString rootValueSeparator>
	//*   9   17:ifnull          41
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #85  <Method String SerializableString.getValue()>
	//*  12   26:aload_0         
	//*  13   27:getfield        #42  <Field SerializableString rootValueSeparator>
	//*  14   30:invokeinterface #85  <Method String SerializableString.getValue()>
	//*  15   35:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  16   38:ifne            11
			return new ObjectWriter$GeneratorSettings(prettyPrinter, schema, characterEscapes, serializablestring);
	//   17   41:new             #2   <Class ObjectWriter$GeneratorSettings>
	//   18   44:dup             
	//   19   45:aload_0         
	//   20   46:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//   21   49:aload_0         
	//   22   50:getfield        #38  <Field FormatSchema schema>
	//   23   53:aload_0         
	//   24   54:getfield        #40  <Field CharacterEscapes characterEscapes>
	//   25   57:aload_1         
	//   26   58:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//   27   61:areturn         
	}

	public ObjectWriter$GeneratorSettings withRootValueSeparator(String s)
	{
		if(s != null ? s.equals(((Object) (rootValueSeparator))) : rootValueSeparator == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field SerializableString rootValueSeparator>
	//*   4    8:ifnonnull       24
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field SerializableString rootValueSeparator>
	//   10   18:invokevirtual   #91  <Method boolean String.equals(Object)>
	//   11   21:ifne            11
		PrettyPrinter prettyprinter = prettyPrinter;
	//   12   24:aload_0         
	//   13   25:getfield        #36  <Field PrettyPrinter prettyPrinter>
	//   14   28:astore_2        
		FormatSchema formatschema = schema;
	//   15   29:aload_0         
	//   16   30:getfield        #38  <Field FormatSchema schema>
	//   17   33:astore_3        
		CharacterEscapes characterescapes = characterEscapes;
	//   18   34:aload_0         
	//   19   35:getfield        #40  <Field CharacterEscapes characterEscapes>
	//   20   38:astore          4
		if(s == null)
	//*  21   40:aload_1         
	//*  22   41:ifnonnull       59
			s = null;
	//   23   44:aconst_null     
	//   24   45:astore_1        
		else
	//*  25   46:new             #2   <Class ObjectWriter$GeneratorSettings>
	//*  26   49:dup             
	//*  27   50:aload_2         
	//*  28   51:aload_3         
	//*  29   52:aload           4
	//*  30   54:aload_1         
	//*  31   55:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//*  32   58:areturn         
			s = ((String) (new SerializedString(s)));
	//   33   59:new             #94  <Class SerializedString>
	//   34   62:dup             
	//   35   63:aload_1         
	//   36   64:invokespecial   #97  <Method void SerializedString(String)>
	//   37   67:astore_1        
		return new ObjectWriter$GeneratorSettings(prettyprinter, formatschema, characterescapes, ((SerializableString) (s)));
	//*  38   68:goto            46
	}

	public static final ObjectWriter$GeneratorSettings empty = new ObjectWriter$GeneratorSettings(((PrettyPrinter) (null)), ((FormatSchema) (null)), ((CharacterEscapes) (null)), ((SerializableString) (null)));
	private static final long serialVersionUID = 1L;
	public final CharacterEscapes characterEscapes;
	public final PrettyPrinter prettyPrinter;
	public final SerializableString rootValueSeparator;
	public final FormatSchema schema;

	static 
	{
	//    0    0:new             #2   <Class ObjectWriter$GeneratorSettings>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #29  <Method void ObjectWriter$GeneratorSettings(PrettyPrinter, FormatSchema, CharacterEscapes, SerializableString)>
	//    7   11:putstatic       #31  <Field ObjectWriter$GeneratorSettings empty>
	//*   8   14:return          
	}

	public ObjectWriter$GeneratorSettings(PrettyPrinter prettyprinter, FormatSchema formatschema, CharacterEscapes characterescapes, SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		prettyPrinter = prettyprinter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field PrettyPrinter prettyPrinter>
		schema = formatschema;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field FormatSchema schema>
		characterEscapes = characterescapes;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field CharacterEscapes characterEscapes>
		rootValueSeparator = serializablestring;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field SerializableString rootValueSeparator>
	//   14   25:return          
	}
}
