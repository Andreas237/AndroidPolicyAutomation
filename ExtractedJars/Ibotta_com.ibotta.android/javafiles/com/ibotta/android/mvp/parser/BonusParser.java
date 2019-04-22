// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.parser;

import com.ibotta.android.notification.model.Notification;
import com.ibotta.android.notification.model.NotificationStatus;
import com.ibotta.android.tracking.proprietary.event.EventChain;
import com.ibotta.android.view.model.content.BonusItem;
import com.ibotta.api.model.BonusModel;
import com.ibotta.api.model.bonus.Bonus;
import java.util.*;

public class BonusParser
{

	public BonusParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static List fromBonusModels(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_1        
		if(list != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          76
		{
			if(list.isEmpty())
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #20  <Method boolean List.isEmpty()>
	//*   8   18:ifeq            23
				return ((List) (arraylist));
	//    9   21:aload_1         
	//   10   22:areturn         
			EventChain eventchain = new EventChain();
	//   11   23:new             #22  <Class EventChain>
	//   12   26:dup             
	//   13   27:invokespecial   #23  <Method void EventChain()>
	//   14   30:astore_2        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (new BonusItem(eventchain, (BonusModel)((Iterator) (list)).next())))));
	//   15   31:aload_0         
	//   16   32:invokeinterface #27  <Method Iterator List.iterator()>
	//   17   37:astore_0        
	//   18   38:aload_0         
	//   19   39:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   20   44:ifeq            74
	//   21   47:aload_1         
	//   22   48:new             #34  <Class BonusItem>
	//   23   51:dup             
	//   24   52:aload_2         
	//   25   53:aload_0         
	//   26   54:invokeinterface #38  <Method Object Iterator.next()>
	//   27   59:checkcast       #40  <Class BonusModel>
	//   28   62:invokespecial   #43  <Method void BonusItem(EventChain, BonusModel)>
	//   29   65:invokeinterface #47  <Method boolean List.add(Object)>
	//   30   70:pop             
	//*  31   71:goto            38
			return ((List) (arraylist));
	//   32   74:aload_1         
	//   33   75:areturn         
		} else
		{
			return ((List) (arraylist));
	//   34   76:aload_1         
	//   35   77:areturn         
		}
	}

	public static Bonus fromNotification(Notification notification)
	{
		Bonus bonus = new Bonus();
	//    0    0:new             #53  <Class Bonus>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void Bonus()>
	//    3    7:astore_1        
		bonus.setCompletedImageUrl(notification.getIconUrl());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #60  <Method String Notification.getIconUrl()>
	//    7   13:invokevirtual   #64  <Method void Bonus.setCompletedImageUrl(String)>
		bonus.setPercentComplete((short)(int)notification.getAmount());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #68  <Method float Notification.getAmount()>
	//   11   21:f2i             
	//   12   22:int2short       
	//   13   23:i2f             
	//   14   24:invokevirtual   #72  <Method void Bonus.setPercentComplete(float)>
		bonus.setLocked(false);
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #76  <Method void Bonus.setLocked(boolean)>
		if(notification.getStatusEnum() == NotificationStatus.SUCCESS)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #80  <Method NotificationStatus Notification.getStatusEnum()>
	//*  20   36:getstatic       #86  <Field NotificationStatus NotificationStatus.SUCCESS>
	//*  21   39:if_acmpne       53
			notification = ((Notification) (new Date()));
	//   22   42:new             #88  <Class Date>
	//   23   45:dup             
	//   24   46:invokespecial   #89  <Method void Date()>
	//   25   49:astore_0        
		else
	//*  26   50:goto            55
			notification = null;
	//   27   53:aconst_null     
	//   28   54:astore_0        
		bonus.setCompleted(((Date) (notification)));
	//   29   55:aload_1         
	//   30   56:aload_0         
	//   31   57:invokevirtual   #93  <Method void Bonus.setCompleted(Date)>
		return bonus;
	//   32   60:aload_1         
	//   33   61:areturn         
	}
}
