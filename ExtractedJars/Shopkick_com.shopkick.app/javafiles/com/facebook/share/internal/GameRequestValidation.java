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
		boolean flag2 = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		boolean flag;
		if(s != null)
	//*   9   17:aload           4
	//*  10   19:ifnull          27
			flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_1        
		else
	//*  13   24:goto            29
			flag = false;
	//   14   27:iconst_0        
	//   15   28:istore_1        
		boolean flag1;
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
			flag1 = false;
	//   25   52:iconst_0        
	//   26   53:istore_2        
		else
	//*  27   54:goto            59
			flag1 = true;
	//   28   57:iconst_1        
	//   29   58:istore_2        
		if(!(flag ^ flag1))
	//*  30   59:iload_1         
	//*  31   60:iload_2         
	//*  32   61:ixor            
	//*  33   62:ifne            118
		{
			int j = ((int) (flag2));
	//   34   65:iload_3         
	//   35   66:istore_2        
			if(gamerequestcontent.getRecipients() != null)
	//*  36   67:aload_0         
	//*  37   68:invokevirtual   #45  <Method java.util.List GameRequestContent.getRecipients()>
	//*  38   71:ifnull          76
				j = 1;
	//   39   74:iconst_1        
	//   40   75:istore_2        
			int i = j;
	//   41   76:iload_2         
	//   42   77:istore_1        
			if(gamerequestcontent.getSuggestions() != null)
	//*  43   78:aload_0         
	//*  44   79:invokevirtual   #48  <Method java.util.List GameRequestContent.getSuggestions()>
	//*  45   82:ifnull          89
				i = j + 1;
	//   46   85:iload_2         
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:istore_1        
			j = i;
	//   50   89:iload_1         
	//   51   90:istore_2        
			if(gamerequestcontent.getFilters() != null)
	//*  52   91:aload_0         
	//*  53   92:invokevirtual   #52  <Method com.facebook.share.model.GameRequestContent$Filters GameRequestContent.getFilters()>
	//*  54   95:ifnull          102
				j = i + 1;
	//   55   98:iload_1         
	//   56   99:iconst_1        
	//   57  100:iadd            
	//   58  101:istore_2        
			if(j <= 1)
	//*  59  102:iload_2         
	//*  60  103:iconst_1        
	//*  61  104:icmpgt          108
				return;
	//   62  107:return          
			else
				throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
	//   63  108:new             #54  <Class IllegalArgumentException>
	//   64  111:dup             
	//   65  112:ldc1            #56  <String "Parameters to, filters and suggestions are mutually exclusive">
	//   66  114:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   67  117:athrow          
		} else
		{
			throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
	//   68  118:new             #54  <Class IllegalArgumentException>
	//   69  121:dup             
	//   70  122:ldc1            #61  <String "Object id should be provided if and only if action type is send or askfor">
	//   71  124:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   72  127:athrow          
		}
	}
}
