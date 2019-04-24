// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.text.pdf:
//			LongHashtable

static class LongHashtable$LongHashtableIterator
	implements Iterator
{

	public boolean hasNext()
	{
		if(entry != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field LongHashtable$Entry entry>
	//*   2    4:ifnull          9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		do
		{
			int i = index;
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int index>
	//    7   13:istore_1        
			index = i - 1;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:putfield        #25  <Field int index>
			if(i > 0)
	//*  13   21:iload_1         
	//*  14   22:ifle            46
			{
				LongHashtable.Entry entry1 = table[index];
	//   15   25:aload_0         
	//   16   26:getfield        #23  <Field LongHashtable$Entry[] table>
	//   17   29:aload_0         
	//   18   30:getfield        #25  <Field int index>
	//   19   33:aaload          
	//   20   34:astore_2        
				entry = entry1;
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:putfield        #30  <Field LongHashtable$Entry entry>
				if(entry1 != null)
	//*  24   40:aload_2         
	//*  25   41:ifnull          9
					return true;
	//   26   44:iconst_1        
	//   27   45:ireturn         
			} else
			{
				return false;
	//   28   46:iconst_0        
	//   29   47:ireturn         
			}
		} while(true);
	}

	public LongHashtable.Entry next()
	{
		LongHashtable.Entry entry1;
		if(entry == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field LongHashtable$Entry entry>
	//*   2    4:ifnonnull       42
			do
			{
				int i = index;
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int index>
	//    5   11:istore_1        
				index = i - 1;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:putfield        #25  <Field int index>
				if(i <= 0)
					break;
	//   11   19:iload_1         
	//   12   20:ifle            42
				entry1 = table[index];
	//   13   23:aload_0         
	//   14   24:getfield        #23  <Field LongHashtable$Entry[] table>
	//   15   27:aload_0         
	//   16   28:getfield        #25  <Field int index>
	//   17   31:aaload          
	//   18   32:astore_2        
				entry = entry1;
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:putfield        #30  <Field LongHashtable$Entry entry>
			} while(entry1 == null);
	//   22   38:aload_2         
	//   23   39:ifnull          7
		if(entry != null)
	//*  24   42:aload_0         
	//*  25   43:getfield        #30  <Field LongHashtable$Entry entry>
	//*  26   46:ifnull          64
		{
			LongHashtable.Entry entry2 = entry;
	//   27   49:aload_0         
	//   28   50:getfield        #30  <Field LongHashtable$Entry entry>
	//   29   53:astore_2        
			entry = entry2.next;
	//   30   54:aload_0         
	//   31   55:aload_2         
	//   32   56:getfield        #36  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   33   59:putfield        #30  <Field LongHashtable$Entry entry>
			return entry2;
	//   34   62:aload_2         
	//   35   63:areturn         
		} else
		{
			throw new NoSuchElementException(MessageLocalization.getComposedMessage("inthashtableiterator", new Object[0]));
	//   36   64:new             #38  <Class NoSuchElementException>
	//   37   67:dup             
	//   38   68:ldc1            #40  <String "inthashtableiterator">
	//   39   70:iconst_0        
	//   40   71:anewarray       Object[]
	//   41   74:invokestatic    #46  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   42   77:invokespecial   #49  <Method void NoSuchElementException(String)>
	//   43   80:athrow          
		}
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method LongHashtable$Entry next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("remove.not.supported", new Object[0]));
	//    0    0:new             #55  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "remove.not.supported">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #46  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    6   13:invokespecial   #58  <Method void UnsupportedOperationException(String)>
	//    7   16:athrow          
	}

	LongHashtable.Entry entry;
	int index;
	LongHashtable.Entry table[];

	LongHashtable$LongHashtableIterator(LongHashtable.Entry aentry[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		table = aentry;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field LongHashtable$Entry[] table>
		index = aentry.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #25  <Field int index>
	//    9   15:return          
	}
}
