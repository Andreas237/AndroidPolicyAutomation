// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.cards;

import bo.app.*;
import com.appboy.enums.CardType;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//			Card

public class ControlCard extends Card
{

	public ControlCard(JSONObject jsonobject, com.appboy.enums.CardKey.Provider provider, bt bt, dt dt, c c)
	{
		super(jsonobject, provider, bt, dt, c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #8   <Method void Card(JSONObject, com.appboy.enums.CardKey$Provider, bt, dt, c)>
	//    7   11:return          
	}

	public CardType getCardType()
	{
		return CardType.CONTROL;
	//    0    0:getstatic       #17  <Field CardType CardType.CONTROL>
	//    1    3:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ControlCard{");
	//    4    8:aload_1         
	//    5    9:ldc1            #26  <String "ControlCard{">
	//    6   11:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(super.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #32  <Method String Card.toString()>
	//   11   20:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("}");
	//   13   24:aload_1         
	//   14   25:ldc1            #34  <String "}">
	//   15   27:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}
}
