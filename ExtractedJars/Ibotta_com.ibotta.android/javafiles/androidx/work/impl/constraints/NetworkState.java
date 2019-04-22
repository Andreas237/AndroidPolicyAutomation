// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints;


public class NetworkState
{

	public NetworkState(boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mIsConnected = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field boolean mIsConnected>
		mIsValidated = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field boolean mIsValidated>
		mIsMetered = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field boolean mIsMetered>
		mIsNotRoaming = flag3;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #22  <Field boolean mIsNotRoaming>
	//   14   25:return          
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          77
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((NetworkState)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class NetworkState>
	//   16   28:astore_1        
			return mIsConnected == ((NetworkState) (obj)).mIsConnected && mIsValidated == ((NetworkState) (obj)).mIsValidated && mIsMetered == ((NetworkState) (obj)).mIsMetered && mIsNotRoaming == ((NetworkState) (obj)).mIsNotRoaming;
	//   17   29:aload_0         
	//   18   30:getfield        #16  <Field boolean mIsConnected>
	//   19   33:aload_1         
	//   20   34:getfield        #16  <Field boolean mIsConnected>
	//   21   37:icmpne          75
	//   22   40:aload_0         
	//   23   41:getfield        #18  <Field boolean mIsValidated>
	//   24   44:aload_1         
	//   25   45:getfield        #18  <Field boolean mIsValidated>
	//   26   48:icmpne          75
	//   27   51:aload_0         
	//   28   52:getfield        #20  <Field boolean mIsMetered>
	//   29   55:aload_1         
	//   30   56:getfield        #20  <Field boolean mIsMetered>
	//   31   59:icmpne          75
	//   32   62:aload_0         
	//   33   63:getfield        #22  <Field boolean mIsNotRoaming>
	//   34   66:aload_1         
	//   35   67:getfield        #22  <Field boolean mIsNotRoaming>
	//   36   70:icmpne          75
	//   37   73:iconst_1        
	//   38   74:ireturn         
	//   39   75:iconst_0        
	//   40   76:ireturn         
		} else
		{
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		}
	}

	public int hashCode()
	{
		int j;
		if(mIsConnected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean mIsConnected>
	//*   2    4:ifeq            12
			j = 1;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		int i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(mIsValidated)
	//*  10   16:aload_0         
	//*  11   17:getfield        #18  <Field boolean mIsValidated>
	//*  12   20:ifeq            28
			i = j + 16;
	//   13   23:iload_2         
	//   14   24:bipush          16
	//   15   26:iadd            
	//   16   27:istore_1        
		j = i;
	//   17   28:iload_1         
	//   18   29:istore_2        
		if(mIsMetered)
	//*  19   30:aload_0         
	//*  20   31:getfield        #20  <Field boolean mIsMetered>
	//*  21   34:ifeq            43
			j = i + 256;
	//   22   37:iload_1         
	//   23   38:sipush          256
	//   24   41:iadd            
	//   25   42:istore_2        
		i = j;
	//   26   43:iload_2         
	//   27   44:istore_1        
		if(mIsNotRoaming)
	//*  28   45:aload_0         
	//*  29   46:getfield        #22  <Field boolean mIsNotRoaming>
	//*  30   49:ifeq            58
			i = j + 4096;
	//   31   52:iload_2         
	//   32   53:sipush          4096
	//   33   56:iadd            
	//   34   57:istore_1        
		return i;
	//   35   58:iload_1         
	//   36   59:ireturn         
	}

	public boolean isConnected()
	{
		return mIsConnected;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field boolean mIsConnected>
	//    2    4:ireturn         
	}

	public boolean isMetered()
	{
		return mIsMetered;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean mIsMetered>
	//    2    4:ireturn         
	}

	public boolean isNotRoaming()
	{
		return mIsNotRoaming;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mIsNotRoaming>
	//    2    4:ireturn         
	}

	public boolean isValidated()
	{
		return mIsValidated;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean mIsValidated>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[] {
			Boolean.valueOf(mIsConnected), Boolean.valueOf(mIsValidated), Boolean.valueOf(mIsMetered), Boolean.valueOf(mIsNotRoaming)
		});
	//    0    0:ldc1            #40  <String "[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #16  <Field boolean mIsConnected>
	//    7   12:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #18  <Field boolean mIsValidated>
	//   13   22:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_0         
	//   18   29:getfield        #20  <Field boolean mIsMetered>
	//   19   32:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:aload_0         
	//   24   39:getfield        #22  <Field boolean mIsNotRoaming>
	//   25   42:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
	//   26   45:aastore         
	//   27   46:invokestatic    #52  <Method String String.format(String, Object[])>
	//   28   49:areturn         
	}

	private boolean mIsConnected;
	private boolean mIsMetered;
	private boolean mIsNotRoaming;
	private boolean mIsValidated;
}
