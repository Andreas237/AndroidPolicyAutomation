// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


class DiffUtil$Range
{

	int newListEnd;
	int newListStart;
	int oldListEnd;
	int oldListStart;

	public DiffUtil$Range()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public DiffUtil$Range(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		oldListStart = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int oldListStart>
		oldListEnd = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int oldListEnd>
		newListStart = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int newListStart>
		newListEnd = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #23  <Field int newListEnd>
	//   14   25:return          
	}
}
