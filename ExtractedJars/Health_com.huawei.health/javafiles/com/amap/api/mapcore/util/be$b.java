// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			be, bd, cb

class be$b extends Handler
{

	public void handleMessage(Message message)
	{
		message.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method android.os.Bundle Message.getData()>
	//    2    4:pop             
		message = ((Message) (message.obj));
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field Object Message.obj>
	//    5    9:astore_1        
		if(message instanceof bd)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #33  <Class bd>
	//*   8   14:ifeq            97
		{
			message = ((Message) ((bd)message));
	//    9   17:aload_1         
	//   10   18:checkcast       #33  <Class bd>
	//   11   21:astore_1        
			cb.a((new StringBuilder()).append("OfflineMapHandler handleMessage CitObj  name: ").append(((bd) (message)).getCity()).append(" complete: ").append(((bd) (message)).getcompleteCode()).append(" status: ").append(((bd) (message)).getState()).toString());
	//   12   22:new             #35  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #38  <Method void StringBuilder()>
	//   15   29:ldc1            #40  <String "OfflineMapHandler handleMessage CitObj  name: ">
	//   16   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #48  <Method String bd.getCity()>
	//   19   38:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:ldc1            #50  <String " complete: ">
	//   21   43:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #54  <Method int bd.getcompleteCode()>
	//   24   50:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   25   53:ldc1            #59  <String " status: ">
	//   26   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:aload_1         
	//   28   59:invokevirtual   #62  <Method int bd.getState()>
	//   29   62:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   30   65:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   31   68:invokestatic    #70  <Method void cb.a(String)>
			if(be.d(a) != null)
	//*  32   71:aload_0         
	//*  33   72:getfield        #13  <Field be a>
	//*  34   75:invokestatic    #74  <Method be$a be.d(be)>
	//*  35   78:ifnull          109
				be.d(a).a(((bd) (message)));
	//   36   81:aload_0         
	//   37   82:getfield        #13  <Field be a>
	//   38   85:invokestatic    #74  <Method be$a be.d(be)>
	//   39   88:aload_1         
	//   40   89:invokeinterface #79  <Method void be$a.a(bd)>
			break MISSING_BLOCK_LABEL_109;
	//   41   94:goto            109
		} else
		{
			try
			{
				cb.a("Do not callback by CityObject! ");
	//   42   97:ldc1            #81  <String "Do not callback by CityObject! ">
	//   43   99:invokestatic    #70  <Method void cb.a(String)>
				return;
	//   44  102:return          
			}
			// Misplaced declaration of an exception variable
			catch(Message message)
	//*  45  103:astore_1        
			{
				((Throwable) (message)).printStackTrace();
	//   46  104:aload_1         
	//   47  105:invokevirtual   #84  <Method void Throwable.printStackTrace()>
			}
			return;
	//   48  108:return          
		}
	//   49  109:return          
	}

	final be a;

	public be$b(be be1, Looper looper)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field be a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
