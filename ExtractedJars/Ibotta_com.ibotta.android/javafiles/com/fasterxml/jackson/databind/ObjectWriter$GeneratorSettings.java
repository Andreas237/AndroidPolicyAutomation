// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
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
		if(prettyprinter1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          53
			if(prettyprinter1 == ObjectWriter.NULL_PRETTY_PRINTER)
	//*   5    9:aload_3         
	//*   6   10:getstatic       #47  <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
	//*   7   13:if_acmpne       25
			{
				jsongenerator.setPrettyPrinter(((PrettyPrinter) (null)));
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   11   21:pop             
			} else
	//*  12   22:goto            53
			{
				PrettyPrinter prettyprinter = prettyprinter1;
	//   13   25:aload_3         
	//   14   26:astore_2        
				if(prettyprinter1 instanceof Instantiatable)
	//*  15   27:aload_3         
	//*  16   28:instanceof      #55  <Class Instantiatable>
	//*  17   31:ifeq            47
					prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
	//   18   34:aload_3         
	//   19   35:checkcast       #55  <Class Instantiatable>
	//   20   38:invokeinterface #59  <Method Object Instantiatable.createInstance()>
	//   21   43:checkcast       #61  <Class PrettyPrinter>
	//   22   46:astore_2        
				jsongenerator.setPrettyPrinter(prettyprinter);
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #53  <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   26   52:pop             
			}
		Object obj = ((Object) (characterEscapes));
	//   27   53:aload_0         
	//   28   54:getfield        #40  <Field CharacterEscapes characterEscapes>
	//   29   57:astore_2        
		if(obj != null)
	//*  30   58:aload_2         
	//*  31   59:ifnull          68
			jsongenerator.setCharacterEscapes(((CharacterEscapes) (obj)));
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #65  <Method JsonGenerator JsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//   35   67:pop             
		obj = ((Object) (schema));
	//   36   68:aload_0         
	//   37   69:getfield        #38  <Field FormatSchema schema>
	//   38   72:astore_2        
		if(obj != null)
	//*  39   73:aload_2         
	//*  40   74:ifnull          82
			jsongenerator.setSchema(((FormatSchema) (obj)));
	//   41   77:aload_1         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #69  <Method void JsonGenerator.setSchema(FormatSchema)>
		obj = ((Object) (rootValueSeparator));
	//   44   82:aload_0         
	//   45   83:getfield        #42  <Field SerializableString rootValueSeparator>
	//   46   86:astore_2        
		if(obj != null)
	//*  47   87:aload_2         
	//*  48   88:ifnull          97
			jsongenerator.setRootValueSeparator(((SerializableString) (obj)));
	//   49   91:aload_1         
	//   50   92:aload_2         
	//   51   93:invokevirtual   #73  <Method JsonGenerator JsonGenerator.setRootValueSeparator(SerializableString)>
	//   52   96:pop             
	//   53   97:return          
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
