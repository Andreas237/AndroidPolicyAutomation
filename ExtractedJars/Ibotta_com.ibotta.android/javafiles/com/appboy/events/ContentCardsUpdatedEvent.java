// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import com.appboy.models.cards.Card;
import java.util.Iterator;
import java.util.List;

public class ContentCardsUpdatedEvent
{

	public ContentCardsUpdatedEvent(List list, String s, long l, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #21  <Field String b>
		a = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field List a>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #25  <Field long c>
		d = flag;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #27  <Field boolean d>
	//   14   25:return          
	}

	public List getAllCards()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List a>
	//    2    4:areturn         
	}

	public int getCardCount()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List a>
	//    2    4:invokeinterface #42  <Method int List.size()>
	//    3    9:ireturn         
	}

	public long getLastUpdatedInSecondsFromEpoch()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long c>
	//    2    4:lreturn         
	}

	public int getUnviewedCardCount()
	{
		Iterator iterator = a.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List a>
	//    2    4:invokeinterface #49  <Method Iterator List.iterator()>
	//    3    9:astore_2        
		int i = 0;
	//    4   10:iconst_0        
	//    5   11:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   12:aload_2         
	//    7   13:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            43
			if(!((Card)iterator.next()).getViewed())
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #59  <Method Object Iterator.next()>
	//*  11   27:checkcast       #61  <Class Card>
	//*  12   30:invokevirtual   #64  <Method boolean Card.getViewed()>
	//*  13   33:ifne            12
				i++;
	//   14   36:iload_1         
	//   15   37:iconst_1        
	//   16   38:iadd            
	//   17   39:istore_1        
		} while(true);
	//   18   40:goto            12
		return i;
	//   19   43:iload_1         
	//   20   44:ireturn         
	}

	public String getUserId()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String b>
	//    2    4:areturn         
	}

	public boolean isEmpty()
	{
		return a.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List a>
	//    2    4:invokeinterface #69  <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public boolean isFromOfflineStorage()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean d>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ContentCardsUpdatedEvent{mContentCards=");
	//    4    8:aload_1         
	//    5    9:ldc1            #76  <String "ContentCardsUpdatedEvent{mContentCards=">
	//    6   11:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (a)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field List a>
	//   11   20:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", mUserId='");
	//   13   24:aload_1         
	//   14   25:ldc1            #85  <String ", mUserId='">
	//   15   27:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(b);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #21  <Field String b>
	//   20   36:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append('\'');
	//   22   40:aload_1         
	//   23   41:bipush          39
	//   24   43:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		stringbuilder.append(", mTimestamp=");
	//   26   47:aload_1         
	//   27   48:ldc1            #90  <String ", mTimestamp=">
	//   28   50:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(c);
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #25  <Field long c>
	//   33   59:invokevirtual   #93  <Method StringBuilder StringBuilder.append(long)>
	//   34   62:pop             
		stringbuilder.append('}');
	//   35   63:aload_1         
	//   36   64:bipush          125
	//   37   66:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
		return stringbuilder.toString();
	//   39   70:aload_1         
	//   40   71:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   41   74:areturn         
	}

	private final List a;
	private final String b;
	private final long c;
	private final boolean d;
}
