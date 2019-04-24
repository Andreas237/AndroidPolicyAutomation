// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


public class DebugUtils
{

	public DebugUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void buildShortClassTag(Object obj, StringBuilder stringbuilder)
	{
		String s;
label0:
		{
			if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			{
				stringbuilder.append("null");
	//    2    4:aload_1         
	//    3    5:ldc1            #17  <String "null">
	//    4    7:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//    5   10:pop             
				return;
	//    6   11:return          
			}
			String s1 = obj.getClass().getSimpleName();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #27  <Method Class Object.getClass()>
	//    9   16:invokevirtual   #33  <Method String Class.getSimpleName()>
	//   10   19:astore          4
			if(s1 != null)
	//*  11   21:aload           4
	//*  12   23:ifnull          37
			{
				s = s1;
	//   13   26:aload           4
	//   14   28:astore_3        
				if(s1.length() > 0)
					break label0;
	//   15   29:aload           4
	//   16   31:invokevirtual   #39  <Method int String.length()>
	//   17   34:ifgt            70
			}
			s1 = obj.getClass().getName();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #27  <Method Class Object.getClass()>
	//   20   41:invokevirtual   #42  <Method String Class.getName()>
	//   21   44:astore          4
			int i = s1.lastIndexOf('.');
	//   22   46:aload           4
	//   23   48:bipush          46
	//   24   50:invokevirtual   #46  <Method int String.lastIndexOf(int)>
	//   25   53:istore_2        
			s = s1;
	//   26   54:aload           4
	//   27   56:astore_3        
			if(i > 0)
	//*  28   57:iload_2         
	//*  29   58:ifle            70
				s = s1.substring(i + 1);
	//   30   61:aload           4
	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:invokevirtual   #50  <Method String String.substring(int)>
	//   35   69:astore_3        
		}
		stringbuilder.append(s);
	//   36   70:aload_1         
	//   37   71:aload_3         
	//   38   72:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
		stringbuilder.append('{');
	//   40   76:aload_1         
	//   41   77:bipush          123
	//   42   79:invokevirtual   #53  <Method StringBuilder StringBuilder.append(char)>
	//   43   82:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(obj)));
	//   44   83:aload_1         
	//   45   84:aload_0         
	//   46   85:invokestatic    #59  <Method int System.identityHashCode(Object)>
	//   47   88:invokestatic    #64  <Method String Integer.toHexString(int)>
	//   48   91:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
	//   50   95:return          
	}
}
