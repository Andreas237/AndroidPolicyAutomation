// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.graphics;


// Referenced classes of package android.graphics:
//			Rect

public class Insets
{

	private Insets(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		left = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int left>
		top = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int top>
		right = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int right>
		bottom = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #30  <Field int bottom>
	//   14   25:return          
	}

	public static Insets of(int i, int j, int k, int l)
	{
		if(i == 0 && j == 0 && k == 0 && l == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            20
	//*   2    4:iload_1         
	//*   3    5:ifne            20
	//*   4    8:iload_2         
	//*   5    9:ifne            20
	//*   6   12:iload_3         
	//*   7   13:ifne            20
			return NONE;
	//    8   16:getstatic       #19  <Field Insets NONE>
	//    9   19:areturn         
		else
			return new Insets(i, j, k, l);
	//   10   20:new             #2   <Class Insets>
	//   11   23:dup             
	//   12   24:iload_0         
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iload_3         
	//   16   28:invokespecial   #17  <Method void Insets(int, int, int, int)>
	//   17   31:areturn         
	}

	public static Insets of(Rect rect)
	{
		if(rect == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return NONE;
	//    2    4:getstatic       #19  <Field Insets NONE>
	//    3    7:areturn         
		else
			return of(rect.left, rect.top, rect.right, rect.bottom);
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int Rect.left>
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field int Rect.top>
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field int Rect.right>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field int Rect.bottom>
	//   12   24:invokestatic    #41  <Method Insets of(int, int, int, int)>
	//   13   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #47  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #47  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((Insets)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class Insets>
	//   16   28:astore_1        
		if(bottom != ((Insets) (obj)).bottom)
	//*  17   29:aload_0         
	//*  18   30:getfield        #30  <Field int bottom>
	//*  19   33:aload_1         
	//*  20   34:getfield        #30  <Field int bottom>
	//*  21   37:icmpeq          42
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		if(left != ((Insets) (obj)).left)
	//*  24   42:aload_0         
	//*  25   43:getfield        #24  <Field int left>
	//*  26   46:aload_1         
	//*  27   47:getfield        #24  <Field int left>
	//*  28   50:icmpeq          55
			return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		if(right != ((Insets) (obj)).right)
	//*  31   55:aload_0         
	//*  32   56:getfield        #28  <Field int right>
	//*  33   59:aload_1         
	//*  34   60:getfield        #28  <Field int right>
	//*  35   63:icmpeq          68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		return top == ((Insets) (obj)).top;
	//   38   68:aload_0         
	//   39   69:getfield        #26  <Field int top>
	//   40   72:aload_1         
	//   41   73:getfield        #26  <Field int top>
	//   42   76:icmpeq          81
	//   43   79:iconst_0        
	//   44   80:ireturn         
	//   45   81:iconst_1        
	//   46   82:ireturn         
	}

	public int hashCode()
	{
		return ((left * 31 + top) * 31 + right) * 31 + bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int left>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #26  <Field int top>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field int right>
	//   11   19:iadd            
	//   12   20:bipush          31
	//   13   22:imul            
	//   14   23:aload_0         
	//   15   24:getfield        #30  <Field int bottom>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Insets{left=").append(left).append(", top=").append(top).append(", right=").append(right).append(", bottom=").append(bottom).append('}').toString();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:ldc1            #56  <String "Insets{left=">
	//    4    9:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #24  <Field int left>
	//    7   16:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #65  <String ", top=">
	//    9   21:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #26  <Field int top>
	//   12   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #67  <String ", right=">
	//   14   33:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #28  <Field int right>
	//   17   40:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #69  <String ", bottom=">
	//   19   45:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #30  <Field int bottom>
	//   22   52:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:bipush          125
	//   24   57:invokevirtual   #72  <Method StringBuilder StringBuilder.append(char)>
	//   25   60:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   26   63:areturn         
	}

	public static final Insets NONE = new Insets(0, 0, 0, 0);
	public final int bottom;
	public final int left;
	public final int right;
	public final int top;

	static 
	{
	//    0    0:new             #2   <Class Insets>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:invokespecial   #17  <Method void Insets(int, int, int, int)>
	//    7   11:putstatic       #19  <Field Insets NONE>
	//*   8   14:return          
	}
}
