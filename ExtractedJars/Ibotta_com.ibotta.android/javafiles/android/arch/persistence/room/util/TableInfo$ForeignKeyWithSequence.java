// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.util;


// Referenced classes of package android.arch.persistence.room.util:
//			TableInfo

static class TableInfo$ForeignKeyWithSequence
	implements Comparable
{

	public int compareTo(TableInfo$ForeignKeyWithSequence tableinfo$foreignkeywithsequence)
	{
		int i = mId - tableinfo$foreignkeywithsequence.mId;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mId>
	//    2    4:aload_1         
	//    3    5:getfield        #27  <Field int mId>
	//    4    8:isub            
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            24
			return mSequence - tableinfo$foreignkeywithsequence.mSequence;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int mSequence>
	//   10   18:aload_1         
	//   11   19:getfield        #29  <Field int mSequence>
	//   12   22:isub            
	//   13   23:ireturn         
		else
			return i;
	//   14   24:iload_2         
	//   15   25:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((TableInfo$ForeignKeyWithSequence)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class TableInfo$ForeignKeyWithSequence>
	//    3    5:invokevirtual   #41  <Method int compareTo(TableInfo$ForeignKeyWithSequence)>
	//    4    8:ireturn         
	}

	final String mFrom;
	final int mId;
	final int mSequence;
	final String mTo;

	TableInfo$ForeignKeyWithSequence(int i, int j, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int mId>
		mSequence = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int mSequence>
		mFrom = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String mFrom>
		mTo = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field String mTo>
	//   14   25:return          
	}
}
