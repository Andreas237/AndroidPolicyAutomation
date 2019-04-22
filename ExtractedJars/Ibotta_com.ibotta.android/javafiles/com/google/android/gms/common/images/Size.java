// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;


public final class Size
{

	public Size(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzps = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int zzps>
		zzpt = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #16  <Field int zzpt>
	//    8   14:return          
	}

	public static Size parseSize(String s)
		throws NumberFormatException
	{
		NumberFormatException numberformatexception;
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          67
		{
			int j = s.indexOf('*');
	//    2    4:aload_0         
	//    3    5:bipush          42
	//    4    7:invokevirtual   #27  <Method int String.indexOf(int)>
	//    5   10:istore_2        
			int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
			if(j < 0)
	//*   8   13:iload_2         
	//*   9   14:ifge            24
				i = s.indexOf('x');
	//   10   17:aload_0         
	//   11   18:bipush          120
	//   12   20:invokevirtual   #27  <Method int String.indexOf(int)>
	//   13   23:istore_1        
			if(i >= 0)
	//*  14   24:iload_1         
	//*  15   25:iflt            62
			{
				Size size;
				try
				{
					size = new Size(Integer.parseInt(s.substring(0, i)), Integer.parseInt(s.substring(i + 1)));
	//   16   28:new             #2   <Class Size>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:iload_1         
	//   21   35:invokevirtual   #31  <Method String String.substring(int, int)>
	//   22   38:invokestatic    #37  <Method int Integer.parseInt(String)>
	//   23   41:aload_0         
	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:invokevirtual   #40  <Method String String.substring(int)>
	//   28   48:invokestatic    #37  <Method int Integer.parseInt(String)>
	//   29   51:invokespecial   #42  <Method void Size(int, int)>
	//   30   54:astore_3        
				}
	//*  31   55:aload_3         
	//*  32   56:areturn         
	//*  33   57:aload_0         
	//*  34   58:invokestatic    #46  <Method NumberFormatException zzi(String)>
	//*  35   61:athrow          
	//*  36   62:aload_0         
	//*  37   63:invokestatic    #46  <Method NumberFormatException zzi(String)>
	//*  38   66:athrow          
	//*  39   67:new             #48  <Class IllegalArgumentException>
	//*  40   70:dup             
	//*  41   71:ldc1            #50  <String "string must not be null">
	//*  42   73:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//*  43   76:athrow          
				// Misplaced declaration of an exception variable
				catch(NumberFormatException numberformatexception)
				{
					throw zzi(s);
				}
				return size;
			} else
			{
				throw zzi(s);
			}
		} else
		{
			throw new IllegalArgumentException("string must not be null");
		}
	//*  44   77:astore_3        
	//*  45   78:goto            57
	}

	private static NumberFormatException zzi(String s)
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 16);
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #60  <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #64  <Method int String.length()>
	//    5   11:bipush          16
	//    6   13:iadd            
	//    7   14:invokespecial   #67  <Method void StringBuilder(int)>
	//    8   17:astore_1        
		stringbuilder.append("Invalid Size: \"");
	//    9   18:aload_1         
	//   10   19:ldc1            #69  <String "Invalid Size: \"">
	//   11   21:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(s);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append("\"");
	//   17   31:aload_1         
	//   18   32:ldc1            #75  <String "\"">
	//   19   34:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		throw new NumberFormatException(stringbuilder.toString());
	//   21   38:new             #21  <Class NumberFormatException>
	//   22   41:dup             
	//   23   42:aload_1         
	//   24   43:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   25   46:invokespecial   #80  <Method void NumberFormatException(String)>
	//   26   49:athrow          
	}

	public final boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(this == obj)
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:if_acmpne       13
			return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
		if(obj instanceof Size)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class Size>
	//*  11   17:ifeq            49
		{
			obj = ((Object) ((Size)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Size>
	//   14   24:astore_1        
			if(zzps == ((Size) (obj)).zzps && zzpt == ((Size) (obj)).zzpt)
	//*  15   25:aload_0         
	//*  16   26:getfield        #14  <Field int zzps>
	//*  17   29:aload_1         
	//*  18   30:getfield        #14  <Field int zzps>
	//*  19   33:icmpne          49
	//*  20   36:aload_0         
	//*  21   37:getfield        #16  <Field int zzpt>
	//*  22   40:aload_1         
	//*  23   41:getfield        #16  <Field int zzpt>
	//*  24   44:icmpne          49
				return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}
		return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
	}

	public final int getHeight()
	{
		return zzpt;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzpt>
	//    2    4:ireturn         
	}

	public final int getWidth()
	{
		return zzps;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int zzps>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		int i = zzpt;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzpt>
	//    2    4:istore_1        
		int j = zzps;
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field int zzps>
	//    5    9:istore_2        
		return i ^ (j >>> 16 | j << 16);
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:bipush          16
	//    9   14:iushr           
	//   10   15:iload_2         
	//   11   16:bipush          16
	//   12   18:ishl            
	//   13   19:ior             
	//   14   20:ixor            
	//   15   21:ireturn         
	}

	public final String toString()
	{
		int i = zzps;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int zzps>
	//    2    4:istore_1        
		int j = zzpt;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field int zzpt>
	//    5    9:istore_2        
		StringBuilder stringbuilder = new StringBuilder(23);
	//    6   10:new             #56  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          23
	//    9   16:invokespecial   #67  <Method void StringBuilder(int)>
	//   10   19:astore_3        
		stringbuilder.append(i);
	//   11   20:aload_3         
	//   12   21:iload_1         
	//   13   22:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   14   25:pop             
		stringbuilder.append("x");
	//   15   26:aload_3         
	//   16   27:ldc1            #90  <String "x">
	//   17   29:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		stringbuilder.append(j);
	//   19   33:aload_3         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
		return stringbuilder.toString();
	//   23   39:aload_3         
	//   24   40:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   25   43:areturn         
	}

	private final int zzps;
	private final int zzpt;
}
