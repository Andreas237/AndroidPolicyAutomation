// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.a;


// Referenced classes of package com.irobot.a:
//			h

public class h$r
{

	void a(byte byte0)
	{
		byte abyte0[] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte[] j>
	//    2    4:astore_3        
		int i1 = i;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int i>
	//    5    9:istore_2        
		i = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #39  <Field int i>
		abyte0[i1] = byte0;
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:bastore         
	//   15   21:return          
	}

	void a(byte byte0, int i1)
	{
		if(!k && i1 >= 0 && i1 <= 128)
	//*   0    0:getstatic       #42  <Field boolean k>
	//*   1    3:ifne            25
	//*   2    6:iload_2         
	//*   3    7:iflt            25
	//*   4   10:iload_2         
	//*   5   11:sipush          128
	//*   6   14:icmpgt          25
		{
			throw new AssertionError();
	//    7   17:new             #44  <Class AssertionError>
	//    8   20:dup             
	//    9   21:invokespecial   #45  <Method void AssertionError()>
	//   10   24:athrow          
		} else
		{
			h.a = byte0;
	//   11   25:aload_0         
	//   12   26:getfield        #33  <Field h$s h>
	//   13   29:iload_1         
	//   14   30:putfield        #48  <Field byte h$s.a>
			h.b = (byte)(i1 + 3);
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field h$s h>
	//   17   37:iload_2         
	//   18   38:iconst_3        
	//   19   39:iadd            
	//   20   40:int2byte        
	//   21   41:putfield        #51  <Field byte h$s.b>
			h.c = 0;
	//   22   44:aload_0         
	//   23   45:getfield        #33  <Field h$s h>
	//   24   48:iconst_0        
	//   25   49:putfield        #54  <Field byte h$s.c>
			j = new byte[h.b];
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:getfield        #33  <Field h$s h>
	//   29   57:getfield        #51  <Field byte h$s.b>
	//   30   60:newarray        byte[]
	//   31   62:putfield        #37  <Field byte[] j>
			a();
	//   32   65:aload_0         
	//   33   66:invokevirtual   #57  <Method byte[] a()>
	//   34   69:pop             
			d();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #60  <Method void d()>
			return;
	//   37   74:return          
		}
	}

	void a(String s, int i1)
	{
		s = ((String) (s.getBytes()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method byte[] String.getBytes()>
	//    2    4:astore_1        
		if(s.length < i1)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:iload_2         
	//*   6    8:icmpge          17
			i1 = s.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:istore_2        
		else
	//*  10   14:goto            21
			i1--;
	//   11   17:iload_2         
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:istore_2        
		System.arraycopy(((Object) (s)), 0, ((Object) (j)), i, i1);
	//   15   21:aload_1         
	//   16   22:iconst_0        
	//   17   23:aload_0         
	//   18   24:getfield        #37  <Field byte[] j>
	//   19   27:aload_0         
	//   20   28:getfield        #39  <Field int i>
	//   21   31:iload_2         
	//   22   32:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
		j[i + i1] = 0;
	//   23   35:aload_0         
	//   24   36:getfield        #37  <Field byte[] j>
	//   25   39:aload_0         
	//   26   40:getfield        #39  <Field int i>
	//   27   43:iload_2         
	//   28   44:iadd            
	//   29   45:iconst_0        
	//   30   46:bastore         
		i = i + (i1 + 1);
	//   31   47:aload_0         
	//   32   48:aload_0         
	//   33   49:getfield        #39  <Field int i>
	//   34   52:iload_2         
	//   35   53:iconst_1        
	//   36   54:iadd            
	//   37   55:iadd            
	//   38   56:putfield        #39  <Field int i>
	//   39   59:return          
	}

	void a(short word0)
	{
		byte abyte0[] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte[] j>
	//    2    4:astore_3        
		int i1 = i;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int i>
	//    5    9:istore_2        
		i = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #39  <Field int i>
		abyte0[i1] = (byte)((word0 & 0xff) >> 0);
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:iconst_0        
	//   17   25:ishr            
	//   18   26:int2byte        
	//   19   27:bastore         
		abyte0 = j;
	//   20   28:aload_0         
	//   21   29:getfield        #37  <Field byte[] j>
	//   22   32:astore_3        
		i1 = i;
	//   23   33:aload_0         
	//   24   34:getfield        #39  <Field int i>
	//   25   37:istore_2        
		i = i1 + 1;
	//   26   38:aload_0         
	//   27   39:iload_2         
	//   28   40:iconst_1        
	//   29   41:iadd            
	//   30   42:putfield        #39  <Field int i>
		abyte0[i1] = (byte)((word0 & 0xff00) >> 8);
	//   31   45:aload_3         
	//   32   46:iload_2         
	//   33   47:iload_1         
	//   34   48:ldc1            #74  <Int 65280>
	//   35   50:iand            
	//   36   51:bipush          8
	//   37   53:ishr            
	//   38   54:int2byte        
	//   39   55:bastore         
	//   40   56:return          
	}

	void a(byte abyte0[])
	{
		j = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field byte[] j>
		h.a = abyte0[0];
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field h$s h>
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:baload          
	//    8   12:putfield        #48  <Field byte h$s.a>
		h.b = (byte)abyte0.length;
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field h$s h>
	//   11   19:aload_1         
	//   12   20:arraylength     
	//   13   21:int2byte        
	//   14   22:putfield        #51  <Field byte h$s.b>
		h.c = abyte0[2];
	//   15   25:aload_0         
	//   16   26:getfield        #33  <Field h$s h>
	//   17   29:aload_1         
	//   18   30:iconst_2        
	//   19   31:baload          
	//   20   32:putfield        #54  <Field byte h$s.c>
	//   21   35:return          
	}

	public byte[] a()
	{
		i = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #39  <Field int i>
		byte abyte0[] = j;
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field byte[] j>
	//    5    9:astore_2        
		int i1 = i;
	//    6   10:aload_0         
	//    7   11:getfield        #39  <Field int i>
	//    8   14:istore_1        
		i = i1 + 1;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iconst_1        
	//   12   18:iadd            
	//   13   19:putfield        #39  <Field int i>
		abyte0[i1] = h.a;
	//   14   22:aload_2         
	//   15   23:iload_1         
	//   16   24:aload_0         
	//   17   25:getfield        #33  <Field h$s h>
	//   18   28:getfield        #48  <Field byte h$s.a>
	//   19   31:bastore         
		abyte0 = j;
	//   20   32:aload_0         
	//   21   33:getfield        #37  <Field byte[] j>
	//   22   36:astore_2        
		i1 = i;
	//   23   37:aload_0         
	//   24   38:getfield        #39  <Field int i>
	//   25   41:istore_1        
		i = i1 + 1;
	//   26   42:aload_0         
	//   27   43:iload_1         
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:putfield        #39  <Field int i>
		abyte0[i1] = h.b;
	//   31   49:aload_2         
	//   32   50:iload_1         
	//   33   51:aload_0         
	//   34   52:getfield        #33  <Field h$s h>
	//   35   55:getfield        #51  <Field byte h$s.b>
	//   36   58:bastore         
		abyte0 = j;
	//   37   59:aload_0         
	//   38   60:getfield        #37  <Field byte[] j>
	//   39   63:astore_2        
		i1 = i;
	//   40   64:aload_0         
	//   41   65:getfield        #39  <Field int i>
	//   42   68:istore_1        
		i = i1 + 1;
	//   43   69:aload_0         
	//   44   70:iload_1         
	//   45   71:iconst_1        
	//   46   72:iadd            
	//   47   73:putfield        #39  <Field int i>
		abyte0[i1] = h.c;
	//   48   76:aload_2         
	//   49   77:iload_1         
	//   50   78:aload_0         
	//   51   79:getfield        #33  <Field h$s h>
	//   52   82:getfield        #54  <Field byte h$s.c>
	//   53   85:bastore         
		return j;
	//   54   86:aload_0         
	//   55   87:getfield        #37  <Field byte[] j>
	//   56   90:areturn         
	}

	public void b()
	{
		i = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #39  <Field int i>
		h$s h$s1 = h;
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field h$s h>
	//    5    9:astore_2        
		byte abyte0[] = j;
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field byte[] j>
	//    8   14:astore_3        
		int i1 = i;
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field int i>
	//   11   19:istore_1        
		i = i1 + 1;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:putfield        #39  <Field int i>
		h$s1.a = abyte0[i1];
	//   17   27:aload_2         
	//   18   28:aload_3         
	//   19   29:iload_1         
	//   20   30:baload          
	//   21   31:putfield        #48  <Field byte h$s.a>
		h$s1 = h;
	//   22   34:aload_0         
	//   23   35:getfield        #33  <Field h$s h>
	//   24   38:astore_2        
		abyte0 = j;
	//   25   39:aload_0         
	//   26   40:getfield        #37  <Field byte[] j>
	//   27   43:astore_3        
		i1 = i;
	//   28   44:aload_0         
	//   29   45:getfield        #39  <Field int i>
	//   30   48:istore_1        
		i = i1 + 1;
	//   31   49:aload_0         
	//   32   50:iload_1         
	//   33   51:iconst_1        
	//   34   52:iadd            
	//   35   53:putfield        #39  <Field int i>
		h$s1.b = abyte0[i1];
	//   36   56:aload_2         
	//   37   57:aload_3         
	//   38   58:iload_1         
	//   39   59:baload          
	//   40   60:putfield        #51  <Field byte h$s.b>
		h$s1 = h;
	//   41   63:aload_0         
	//   42   64:getfield        #33  <Field h$s h>
	//   43   67:astore_2        
		abyte0 = j;
	//   44   68:aload_0         
	//   45   69:getfield        #37  <Field byte[] j>
	//   46   72:astore_3        
		i1 = i;
	//   47   73:aload_0         
	//   48   74:getfield        #39  <Field int i>
	//   49   77:istore_1        
		i = i1 + 1;
	//   50   78:aload_0         
	//   51   79:iload_1         
	//   52   80:iconst_1        
	//   53   81:iadd            
	//   54   82:putfield        #39  <Field int i>
		h$s1.c = abyte0[i1];
	//   55   85:aload_2         
	//   56   86:aload_3         
	//   57   87:iload_1         
	//   58   88:baload          
	//   59   89:putfield        #54  <Field byte h$s.c>
	//   60   92:return          
	}

	public byte c()
	{
		byte abyte0[] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte[] j>
	//    2    4:astore          4
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int j1;
		if(abyte0 != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          51
		{
			short word0 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
			do
			{
				j1 = ((int) (word0));
	//    9   15:iload_1         
	//   10   16:istore_3        
				if(i1 >= j.length)
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #37  <Field byte[] j>
	//   14   22:arraylength     
	//   15   23:icmpge          53
				if(i1 != 2)
	//*  16   26:iload_2         
	//*  17   27:iconst_2        
	//*  18   28:icmpne          34
	//*  19   31:goto            44
					word0 += ((short) (j[i1]));
	//   20   34:iload_1         
	//   21   35:aload_0         
	//   22   36:getfield        #37  <Field byte[] j>
	//   23   39:iload_2         
	//   24   40:baload          
	//   25   41:iadd            
	//   26   42:int2short       
	//   27   43:istore_1        
				i1++;
	//   28   44:iload_2         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_2        
			} while(true);
	//   32   48:goto            15
		} else
		{
			j1 = 0;
	//   33   51:iconst_0        
	//   34   52:istore_3        
		}
		return (byte)(j1 & 0xff);
	//   35   53:iload_3         
	//   36   54:sipush          255
	//   37   57:iand            
	//   38   58:int2byte        
	//   39   59:ireturn         
	}

	public void d()
	{
		byte byte0 = c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method byte c()>
	//    2    4:istore_1        
		if(j != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field byte[] j>
	//*   5    9:ifnull          19
			j[2] = byte0;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field byte[] j>
	//    8   16:iconst_2        
	//    9   17:iload_1         
	//   10   18:bastore         
		h.c = byte0;
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field h$s h>
	//   13   23:iload_1         
	//   14   24:putfield        #54  <Field byte h$s.c>
	//   15   27:return          
	}

	public boolean e()
	{
		byte byte0 = j[2];
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte[] j>
	//    2    4:iconst_2        
	//    3    5:baload          
	//    4    6:istore_1        
		byte byte1 = c();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #78  <Method byte c()>
	//    7   11:istore_2        
		j[2] = byte0;
	//    8   12:aload_0         
	//    9   13:getfield        #37  <Field byte[] j>
	//   10   16:iconst_2        
	//   11   17:iload_1         
	//   12   18:bastore         
		return byte0 == byte1;
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:icmpne          26
	//   16   24:iconst_1        
	//   17   25:ireturn         
	//   18   26:iconst_0        
	//   19   27:ireturn         
	}

	byte f()
	{
		if(i < j.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int i>
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field byte[] j>
	//*   4    8:arraylength     
	//*   5    9:icmpge          33
		{
			byte abyte0[] = j;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field byte[] j>
	//    8   16:astore_2        
			int i1 = i;
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field int i>
	//   11   21:istore_1        
			i = i1 + 1;
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:putfield        #39  <Field int i>
			return abyte0[i1];
	//   17   29:aload_2         
	//   18   30:iload_1         
	//   19   31:baload          
	//   20   32:ireturn         
		} else
		{
			return 0;
	//   21   33:iconst_0        
	//   22   34:ireturn         
		}
	}

	short g()
	{
		byte abyte0[] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field byte[] j>
	//    2    4:astore_3        
		int i1 = i;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int i>
	//    5    9:istore_1        
		i = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #39  <Field int i>
		i1 = ((int) ((short)abyte0[i1]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:int2short       
	//   15   21:istore_1        
		abyte0 = j;
	//   16   22:aload_0         
	//   17   23:getfield        #37  <Field byte[] j>
	//   18   26:astore_3        
		int j1 = i;
	//   19   27:aload_0         
	//   20   28:getfield        #39  <Field int i>
	//   21   31:istore_2        
		i = j1 + 1;
	//   22   32:aload_0         
	//   23   33:iload_2         
	//   24   34:iconst_1        
	//   25   35:iadd            
	//   26   36:putfield        #39  <Field int i>
		return (short)(i1 << 0 & 0xff | (short)abyte0[j1] << 8 & 0xff00);
	//   27   39:iload_1         
	//   28   40:iconst_0        
	//   29   41:ishl            
	//   30   42:sipush          255
	//   31   45:iand            
	//   32   46:aload_3         
	//   33   47:iload_2         
	//   34   48:baload          
	//   35   49:int2short       
	//   36   50:bipush          8
	//   37   52:ishl            
	//   38   53:ldc1            #74  <Int 65280>
	//   39   55:iand            
	//   40   56:ior             
	//   41   57:int2short       
	//   42   58:ireturn         
	}

	String h()
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j1 = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		for(; i1 < 128 && j[i + i1] != 0; i1++)
	//*   4    4:iload_1         
	//*   5    5:sipush          128
	//*   6    8:icmpge          39
	//*   7   11:aload_0         
	//*   8   12:getfield        #37  <Field byte[] j>
	//*   9   15:aload_0         
	//*  10   16:getfield        #39  <Field int i>
	//*  11   19:iload_1         
	//*  12   20:iadd            
	//*  13   21:baload          
	//*  14   22:ifne            28
	//*  15   25:goto            39
			j1++;
	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_2        

	//   20   32:iload_1         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_1        
	//*  24   36:goto            4
		String s = new String(j, i, j1);
	//   25   39:new             #63  <Class String>
	//   26   42:dup             
	//   27   43:aload_0         
	//   28   44:getfield        #37  <Field byte[] j>
	//   29   47:aload_0         
	//   30   48:getfield        #39  <Field int i>
	//   31   51:iload_2         
	//   32   52:invokespecial   #87  <Method void String(byte[], int, int)>
	//   33   55:astore_3        
		i = i + (j1 + 1);
	//   34   56:aload_0         
	//   35   57:aload_0         
	//   36   58:getfield        #39  <Field int i>
	//   37   61:iload_2         
	//   38   62:iconst_1        
	//   39   63:iadd            
	//   40   64:iadd            
	//   41   65:putfield        #39  <Field int i>
		return s;
	//   42   68:aload_3         
	//   43   69:areturn         
	}

	static final boolean k = true;
	public h$s h;
	int i;
	byte j[];
	final h l;

	static 
	{
	//    0    0:return          
	}

	h$r(h h1)
	{
		l = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field h l>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		h = new h$s(h1);
	//    5    9:aload_0         
	//    6   10:new             #29  <Class h$s>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #31  <Method void h$s(h)>
	//   10   18:putfield        #33  <Field h$s h>
	//   11   21:return          
	}
}
