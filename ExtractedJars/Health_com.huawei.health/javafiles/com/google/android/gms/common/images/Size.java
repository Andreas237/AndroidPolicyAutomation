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
		zzrC = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int zzrC>
		zzrD = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #16  <Field int zzrD>
	//    8   14:return          
	}

	public static Size parseSize(String s)
		throws NumberFormatException
	{
		NumberFormatException numberformatexception;
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("string must not be null");
	//    2    4:new             #23  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #25  <String "string must not be null">
	//    5   10:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int j = s.indexOf('*');
	//    7   14:aload_0         
	//    8   15:bipush          42
	//    9   17:invokevirtual   #34  <Method int String.indexOf(int)>
	//   10   20:istore_2        
		int i = j;
	//   11   21:iload_2         
	//   12   22:istore_1        
		if(j < 0)
	//*  13   23:iload_2         
	//*  14   24:ifge            34
			i = s.indexOf('x');
	//   15   27:aload_0         
	//   16   28:bipush          120
	//   17   30:invokevirtual   #34  <Method int String.indexOf(int)>
	//   18   33:istore_1        
		if(i < 0)
	//*  19   34:iload_1         
	//*  20   35:ifge            43
			throw zzdi(s);
	//   21   38:aload_0         
	//   22   39:invokestatic    #38  <Method NumberFormatException zzdi(String)>
	//   23   42:athrow          
		Size size;
		try
		{
			size = new Size(Integer.parseInt(s.substring(0, i)), Integer.parseInt(s.substring(i + 1)));
	//   24   43:new             #2   <Class Size>
	//   25   46:dup             
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:invokevirtual   #42  <Method String String.substring(int, int)>
	//   30   53:invokestatic    #48  <Method int Integer.parseInt(String)>
	//   31   56:aload_0         
	//   32   57:iload_1         
	//   33   58:iconst_1        
	//   34   59:iadd            
	//   35   60:invokevirtual   #51  <Method String String.substring(int)>
	//   36   63:invokestatic    #48  <Method int Integer.parseInt(String)>
	//   37   66:invokespecial   #53  <Method void Size(int, int)>
	//   38   69:astore_3        
		}
	//*  39   70:aload_3         
	//*  40   71:areturn         
	//*  41   72:aload_0         
	//*  42   73:invokestatic    #38  <Method NumberFormatException zzdi(String)>
	//*  43   76:athrow          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			throw zzdi(s);
		}
		return size;
	//*  44   77:astore_3        
	//*  45   78:goto            72
	}

	private static NumberFormatException zzdi(String s)
	{
		throw new NumberFormatException((new StringBuilder(String.valueOf(((Object) (s))).length() + 16)).append("Invalid Size: \"").append(s).append("\"").toString());
	//    0    0:new             #21  <Class NumberFormatException>
	//    1    3:dup             
	//    2    4:new             #56  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokestatic    #60  <Method String String.valueOf(Object)>
	//    6   12:invokevirtual   #64  <Method int String.length()>
	//    7   15:bipush          16
	//    8   17:iadd            
	//    9   18:invokespecial   #67  <Method void StringBuilder(int)>
	//   10   21:ldc1            #69  <String "Invalid Size: \"">
	//   11   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:ldc1            #75  <String "\"">
	//   15   32:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   17   38:invokespecial   #80  <Method void NumberFormatException(String)>
	//   18   41:athrow          
	}

	public boolean equals(Object obj)
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
	//*  11   17:ifeq            51
		{
			obj = ((Object) ((Size)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Size>
	//   14   24:astore_1        
			return zzrC == ((Size) (obj)).zzrC && zzrD == ((Size) (obj)).zzrD;
	//   15   25:aload_0         
	//   16   26:getfield        #14  <Field int zzrC>
	//   17   29:aload_1         
	//   18   30:getfield        #14  <Field int zzrC>
	//   19   33:icmpne          49
	//   20   36:aload_0         
	//   21   37:getfield        #16  <Field int zzrD>
	//   22   40:aload_1         
	//   23   41:getfield        #16  <Field int zzrD>
	//   24   44:icmpne          49
	//   25   47:iconst_1        
	//   26   48:ireturn         
	//   27   49:iconst_0        
	//   28   50:ireturn         
		} else
		{
			return false;
	//   29   51:iconst_0        
	//   30   52:ireturn         
		}
	}

	public int getHeight()
	{
		return zzrD;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzrD>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		return zzrC;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int zzrC>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzrD ^ (zzrC << 16 | zzrC >>> 16);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzrD>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field int zzrC>
	//    4    8:bipush          16
	//    5   10:ishl            
	//    6   11:aload_0         
	//    7   12:getfield        #14  <Field int zzrC>
	//    8   15:bipush          16
	//    9   17:iushr           
	//   10   18:ior             
	//   11   19:ixor            
	//   12   20:ireturn         
	}

	public String toString()
	{
		int i = zzrC;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field int zzrC>
	//    2    4:istore_1        
		int j = zzrD;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field int zzrD>
	//    5    9:istore_2        
		return (new StringBuilder(23)).append(i).append("x").append(j).toString();
	//    6   10:new             #56  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          23
	//    9   16:invokespecial   #67  <Method void StringBuilder(int)>
	//   10   19:iload_1         
	//   11   20:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:ldc1            #90  <String "x">
	//   13   25:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:iload_2         
	//   15   29:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   16   32:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   17   35:areturn         
	}

	private final int zzrC;
	private final int zzrD;
}
