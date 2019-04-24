// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			DiffUtil

static class DiffUtil$PostponedUpdate
{

	int currentPos;
	int posInOwnerList;
	boolean removal;

	public DiffUtil$PostponedUpdate(int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		posInOwnerList = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int posInOwnerList>
		currentPos = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int currentPos>
		removal = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field boolean removal>
	//   11   19:return          
	}
}
