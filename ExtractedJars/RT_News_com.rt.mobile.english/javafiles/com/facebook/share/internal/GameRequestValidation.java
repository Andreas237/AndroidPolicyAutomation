// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;

public class GameRequestValidation
{

	public GameRequestValidation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void validate(GameRequestContent gamerequestcontent)
	{
		Validate.notNull(((Object) (gamerequestcontent.getMessage())), "message");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method String GameRequestContent.getMessage()>
	//    2    4:ldc1            #19  <String "message">
	//    3    6:invokestatic    #25  <Method void Validate.notNull(Object, String)>
		String s = gamerequestcontent.getObjectId();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #28  <Method String GameRequestContent.getObjectId()>
	//    6   13:astore          4
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		int i;
		if(s != null)
	//*   9   17:aload           4
	//*  10   19:ifnull          27
			i = 1;
	//   11   22:iconst_1        
	//   12   23:istore_1        
		else
	//*  13   24:goto            29
			i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_1        
		int j;
		if(gamerequestcontent.getActionType() != com.facebook.share.model.GameRequestContent.ActionType.ASKFOR && gamerequestcontent.getActionType() != com.facebook.share.model.GameRequestContent.ActionType.SEND)
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #32  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//*  18   33:getstatic       #38  <Field com.facebook.share.model.GameRequestContent$ActionType com.facebook.share.model.GameRequestContent$ActionType.ASKFOR>
	//*  19   36:if_acmpeq       57
	//*  20   39:aload_0         
	//*  21   40:invokevirtual   #32  <Method com.facebook.share.model.GameRequestContent$ActionType GameRequestContent.getActionType()>
	//*  22   43:getstatic       #41  <Field com.facebook.share.model.GameRequestContent$ActionType com.facebook.share.model.GameRequestContent$ActionType.SEND>
	//*  23   46:if_acmpne       52
	//*  24   49:goto            57
			j = 0;
	//   25   52:iconst_0        
	//   26   53:istore_2        
		else
	//*  27   54:goto            59
			j = 1;
	//   28   57:iconst_1        
	//   29   58:istore_2        
		if(i ^ j)
	//*  30   59:iload_1         
	//*  31   60:iload_2         
	//*  32   61:ixor            
	//*  33   62:ifeq            75
			throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
	//   34   65:new             #43  <Class IllegalArgumentException>
	//   35   68:dup             
	//   36   69:ldc1            #45  <String "Object id should be provided if and only if action type is send or askfor">
	//   37   71:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   38   74:athrow          
		j = ((int) (flag));
	//   39   75:iload_3         
	//   40   76:istore_2        
		if(gamerequestcontent.getTo() != null)
	//*  41   77:aload_0         
	//*  42   78:invokevirtual   #51  <Method String GameRequestContent.getTo()>
	//*  43   81:ifnull          86
			j = 1;
	//   44   84:iconst_1        
	//   45   85:istore_2        
		i = j;
	//   46   86:iload_2         
	//   47   87:istore_1        
		if(gamerequestcontent.getSuggestions() != null)
	//*  48   88:aload_0         
	//*  49   89:invokevirtual   #55  <Method java.util.ArrayList GameRequestContent.getSuggestions()>
	//*  50   92:ifnull          99
			i = j + 1;
	//   51   95:iload_2         
	//   52   96:iconst_1        
	//   53   97:iadd            
	//   54   98:istore_1        
		j = i;
	//   55   99:iload_1         
	//   56  100:istore_2        
		if(gamerequestcontent.getFilters() != null)
	//*  57  101:aload_0         
	//*  58  102:invokevirtual   #59  <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//*  59  105:ifnull          112
			j = i + 1;
	//   60  108:iload_1         
	//   61  109:iconst_1        
	//   62  110:iadd            
	//   63  111:istore_2        
		if(j > 1)
	//*  64  112:iload_2         
	//*  65  113:iconst_1        
	//*  66  114:icmple          127
			throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
	//   67  117:new             #43  <Class IllegalArgumentException>
	//   68  120:dup             
	//   69  121:ldc1            #61  <String "Parameters to, filters and suggestions are mutually exclusive">
	//   70  123:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   71  126:athrow          
		else
			return;
	//   72  127:return          
	}
}
