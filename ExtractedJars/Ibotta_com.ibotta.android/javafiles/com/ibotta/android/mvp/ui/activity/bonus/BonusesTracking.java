// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerAdapter;
import com.ibotta.android.mvp.ui.view.bonus.picker.row.*;
import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.tracking.proprietary.event.BonusEvent;
import com.ibotta.android.tracking.proprietary.event.enums.ClickType;
import com.ibotta.android.tracking.scrolltracking.VisibilityTrackingListener;
import com.ibotta.android.views.base.title.TitleBarViewState;
import com.ibotta.api.model.BonusModel;
import java.util.Iterator;
import java.util.Set;
import timber.log.Timber;

public class BonusesTracking
	implements VisibilityTrackingListener
{

	public BonusesTracking(BonusPickerAdapter bonuspickeradapter, EventContextProvider eventcontextprovider, TrackingQueue trackingqueue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		adapter = bonuspickeradapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field BonusPickerAdapter adapter>
		eventContextProvider = eventcontextprovider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field EventContextProvider eventContextProvider>
		trackingQueue = trackingqueue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field TrackingQueue trackingQueue>
	//   11   19:return          
	}

	private BonusEvent createBasicBonusEvent(BonusModel bonusmodel, int i)
	{
		BonusEvent bonusevent = new BonusEvent();
	//    0    0:new             #28  <Class BonusEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void BonusEvent()>
	//    3    7:astore          4
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusevent)));
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    6   13:aload           4
	//    7   15:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		setModuleInfo(bonusevent, i);
	//    8   20:aload_0         
	//    9   21:aload           4
	//   10   23:iload_2         
	//   11   24:invokespecial   #39  <Method void setModuleInfo(BonusEvent, int)>
		bonusevent.setCounter(1);
	//   12   27:aload           4
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #43  <Method void BonusEvent.setCounter(int)>
		bonusevent.setBonusId(Integer.valueOf(bonusmodel.getId()));
	//   15   33:aload           4
	//   16   35:aload_1         
	//   17   36:invokeinterface #49  <Method int BonusModel.getId()>
	//   18   41:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   19   44:invokevirtual   #59  <Method void BonusEvent.setBonusId(Integer)>
		int j;
		if(bonusevent.getModuleIndex() != null && bonusevent.getModuleIndex().intValue() < i)
	//*  20   47:aload           4
	//*  21   49:invokevirtual   #63  <Method Integer BonusEvent.getModuleIndex()>
	//*  22   52:ifnull          83
	//*  23   55:aload           4
	//*  24   57:invokevirtual   #63  <Method Integer BonusEvent.getModuleIndex()>
	//*  25   60:invokevirtual   #66  <Method int Integer.intValue()>
	//*  26   63:iload_2         
	//*  27   64:icmpge          83
			j = i - bonusevent.getModuleIndex().intValue() - 1;
	//   28   67:iload_2         
	//   29   68:aload           4
	//   30   70:invokevirtual   #63  <Method Integer BonusEvent.getModuleIndex()>
	//   31   73:invokevirtual   #66  <Method int Integer.intValue()>
	//   32   76:isub            
	//   33   77:iconst_1        
	//   34   78:isub            
	//   35   79:istore_3        
		else
	//*  36   80:goto            85
			j = -1;
	//   37   83:iconst_m1       
	//   38   84:istore_3        
		if(j >= 0)
	//*  39   85:iload_3         
	//*  40   86:iflt            101
			bonusevent.setListIndex(Integer.valueOf(j));
	//   41   89:aload           4
	//   42   91:iload_3         
	//   43   92:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   44   95:invokevirtual   #69  <Method void BonusEvent.setListIndex(Integer)>
		else
	//*  45   98:goto            110
			bonusevent.setListIndex(Integer.valueOf(i));
	//   46  101:aload           4
	//   47  103:iload_2         
	//   48  104:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   49  107:invokevirtual   #69  <Method void BonusEvent.setListIndex(Integer)>
		bonusevent.setEventAt(System.currentTimeMillis());
	//   50  110:aload           4
	//   51  112:invokestatic    #75  <Method long System.currentTimeMillis()>
	//   52  115:invokevirtual   #79  <Method void BonusEvent.setEventAt(long)>
		return bonusevent;
	//   53  118:aload           4
	//   54  120:areturn         
	}

	private BonusEvent createBasicSubListBonusEvent(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		BonusEvent bonusevent = new BonusEvent();
	//    0    0:new             #28  <Class BonusEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void BonusEvent()>
	//    3    7:astore          4
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusevent)));
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    6   13:aload           4
	//    7   15:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		bonusevent.setModuleIndex(featuredbonusrow.getModuleIndex());
	//    8   20:aload           4
	//    9   22:aload_1         
	//   10   23:invokevirtual   #84  <Method Integer FeaturedBonusRow.getModuleIndex()>
	//   11   26:invokevirtual   #87  <Method void BonusEvent.setModuleIndex(Integer)>
		bonusevent.setModuleName(featuredbonusrow.getModuleName());
	//   12   29:aload           4
	//   13   31:aload_1         
	//   14   32:invokevirtual   #91  <Method String FeaturedBonusRow.getModuleName()>
	//   15   35:invokevirtual   #95  <Method void BonusEvent.setModuleName(String)>
		bonusevent.setCounter(1);
	//   16   38:aload           4
	//   17   40:iconst_1        
	//   18   41:invokevirtual   #43  <Method void BonusEvent.setCounter(int)>
		bonusevent.setBonusId(Integer.valueOf(bonusmodel.getId()));
	//   19   44:aload           4
	//   20   46:aload_2         
	//   21   47:invokeinterface #49  <Method int BonusModel.getId()>
	//   22   52:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   23   55:invokevirtual   #59  <Method void BonusEvent.setBonusId(Integer)>
		bonusevent.setListIndex(Integer.valueOf(i));
	//   24   58:aload           4
	//   25   60:iload_3         
	//   26   61:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   27   64:invokevirtual   #69  <Method void BonusEvent.setListIndex(Integer)>
		bonusevent.setEventAt(System.currentTimeMillis());
	//   28   67:aload           4
	//   29   69:invokestatic    #75  <Method long System.currentTimeMillis()>
	//   30   72:invokevirtual   #79  <Method void BonusEvent.setEventAt(long)>
		return bonusevent;
	//   31   75:aload           4
	//   32   77:areturn         
	}

	private int getBonusIndex(BonusModel bonusmodel)
	{
		for(int i = 0; i < adapter.getItemCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #19  <Field BonusPickerAdapter adapter>
	//*   5    7:invokevirtual   #102 <Method int BonusPickerAdapter.getItemCount()>
	//*   6   10:icmpge          49
		{
			AbstractBonusPickerRow abstractbonuspickerrow = adapter.getItem(i);
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field BonusPickerAdapter adapter>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #106 <Method AbstractBonusPickerRow BonusPickerAdapter.getItem(int)>
	//   11   21:astore_3        
			if((abstractbonuspickerrow instanceof BonusPickerRow) && ((BonusPickerRow)abstractbonuspickerrow).getBonusModel() == bonusmodel)
	//*  12   22:aload_3         
	//*  13   23:instanceof      #108 <Class BonusPickerRow>
	//*  14   26:ifeq            42
	//*  15   29:aload_3         
	//*  16   30:checkcast       #108 <Class BonusPickerRow>
	//*  17   33:invokevirtual   #112 <Method BonusModel BonusPickerRow.getBonusModel()>
	//*  18   36:aload_1         
	//*  19   37:if_acmpne       42
				return i;
	//   20   40:iload_2         
	//   21   41:ireturn         
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            2
		return 0;
	//   27   49:iconst_0        
	//   28   50:ireturn         
	}

	private Integer getModuleIndex(AbstractBonusPickerRow abstractbonuspickerrow)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k;
		for(int j = 0; i < adapter.getItemCount(); j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore_3        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #19  <Field BonusPickerAdapter adapter>
	//*   7    9:invokevirtual   #102 <Method int BonusPickerAdapter.getItemCount()>
	//*   8   12:icmpge          70
		{
label0:
			{
				AbstractBonusPickerRow abstractbonuspickerrow1 = adapter.getItem(i);
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field BonusPickerAdapter adapter>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #106 <Method AbstractBonusPickerRow BonusPickerAdapter.getItem(int)>
	//   13   23:astore          5
				if(!(abstractbonuspickerrow1 instanceof TitleBarRow))
	//*  14   25:aload           5
	//*  15   27:instanceof      #115 <Class TitleBarRow>
	//*  16   30:ifne            44
				{
					k = j;
	//   17   33:iload_3         
	//   18   34:istore          4
					if(!(abstractbonuspickerrow1 instanceof FeaturedBonusRow))
						break label0;
	//   19   36:aload           5
	//   20   38:instanceof      #83  <Class FeaturedBonusRow>
	//   21   41:ifeq            60
				}
				if(abstractbonuspickerrow1 == abstractbonuspickerrow)
	//*  22   44:aload           5
	//*  23   46:aload_1         
	//*  24   47:if_acmpne       55
					return Integer.valueOf(j);
	//   25   50:iload_3         
	//   26   51:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   27   54:areturn         
				k = j + 1;
	//   28   55:iload_3         
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:istore          4
			}
			i++;
	//   32   60:iload_2         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:istore_2        
		}

	//   36   64:iload           4
	//   37   66:istore_3        
	//*  38   67:goto            4
		return null;
	//   39   70:aconst_null     
	//   40   71:areturn         
	}

	private void setModuleInfo(BonusEvent bonusevent, int i)
	{
		if(i >= 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            74
		{
			int j = i;
	//    2    4:iload_2         
	//    3    5:istore_3        
			if(i >= adapter.getItemCount())
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field BonusPickerAdapter adapter>
	//*   7   11:invokevirtual   #102 <Method int BonusPickerAdapter.getItemCount()>
	//*   8   14:icmplt          18
				return;
	//    9   17:return          
			for(; j >= 0; j--)
	//*  10   18:iload_3         
	//*  11   19:iflt            73
			{
				AbstractBonusPickerRow abstractbonuspickerrow = adapter.getItem(j);
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field BonusPickerAdapter adapter>
	//   14   26:iload_3         
	//   15   27:invokevirtual   #106 <Method AbstractBonusPickerRow BonusPickerAdapter.getItem(int)>
	//   16   30:astore          4
				if(abstractbonuspickerrow instanceof TitleBarRow)
	//*  17   32:aload           4
	//*  18   34:instanceof      #115 <Class TitleBarRow>
	//*  19   37:ifeq            66
				{
					bonusevent.setModuleName(((TitleBarRow)abstractbonuspickerrow).getTitleBarViewState().getTitle());
	//   20   40:aload_1         
	//   21   41:aload           4
	//   22   43:checkcast       #115 <Class TitleBarRow>
	//   23   46:invokevirtual   #119 <Method TitleBarViewState TitleBarRow.getTitleBarViewState()>
	//   24   49:invokevirtual   #124 <Method String TitleBarViewState.getTitle()>
	//   25   52:invokevirtual   #95  <Method void BonusEvent.setModuleName(String)>
					bonusevent.setModuleIndex(getModuleIndex(abstractbonuspickerrow));
	//   26   55:aload_1         
	//   27   56:aload_0         
	//   28   57:aload           4
	//   29   59:invokespecial   #126 <Method Integer getModuleIndex(AbstractBonusPickerRow)>
	//   30   62:invokevirtual   #87  <Method void BonusEvent.setModuleIndex(Integer)>
					return;
	//   31   65:return          
				}
			}

	//   32   66:iload_3         
	//   33   67:iconst_1        
	//   34   68:isub            
	//   35   69:istore_3        
	//*  36   70:goto            18
			return;
	//   37   73:return          
		} else
		{
			return;
	//   38   74:return          
		}
	}

	private void trackBonusContentVisible(BonusModel bonusmodel, int i)
	{
		bonusmodel = ((BonusModel) (createBasicBonusEvent(bonusmodel, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #130 <Method BonusEvent createBasicBonusEvent(BonusModel, int)>
	//    4    6:astore_1        
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusmodel)));
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    7   11:aload_1         
	//    8   12:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		Timber.d("Tracking Bonus Visible: %1$s", new Object[] {
			bonusmodel
		});
	//    9   17:ldc1            #132 <String "Tracking Bonus Visible: %1$s">
	//   10   19:iconst_1        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:aastore         
	//   16   27:invokestatic    #138 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusmodel)));
	//   17   30:aload_0         
	//   18   31:getfield        #23  <Field TrackingQueue trackingQueue>
	//   19   34:aload_1         
	//   20   35:invokeinterface #143 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   21   40:return          
	}

	private void trackVisible(AbstractBonusPickerRow abstractbonuspickerrow, int i)
	{
		if(abstractbonuspickerrow instanceof BonusPickerRow)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #108 <Class BonusPickerRow>
	//*   2    4:ifeq            19
			trackBonusContentVisible(((BonusPickerRow)abstractbonuspickerrow).getBonusModel(), i);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #108 <Class BonusPickerRow>
	//    6   12:invokevirtual   #112 <Method BonusModel BonusPickerRow.getBonusModel()>
	//    7   15:iload_2         
	//    8   16:invokespecial   #147 <Method void trackBonusContentVisible(BonusModel, int)>
	//    9   19:return          
	}

	public void onInsufficientlyVisible(Set set)
	{
		set = ((Set) (set.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #155 <Method Iterator Set.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (set)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            74
			Object obj = ((Object) ((Integer)((Iterator) (set)).next()));
	//    6   16:aload_1         
	//    7   17:invokeinterface #165 <Method Object Iterator.next()>
	//    8   22:checkcast       #51  <Class Integer>
	//    9   25:astore_2        
			if(((Integer) (obj)).intValue() >= 0 && ((Integer) (obj)).intValue() < adapter.getItemCount())
	//*  10   26:aload_2         
	//*  11   27:invokevirtual   #66  <Method int Integer.intValue()>
	//*  12   30:iflt            7
	//*  13   33:aload_2         
	//*  14   34:invokevirtual   #66  <Method int Integer.intValue()>
	//*  15   37:aload_0         
	//*  16   38:getfield        #19  <Field BonusPickerAdapter adapter>
	//*  17   41:invokevirtual   #102 <Method int BonusPickerAdapter.getItemCount()>
	//*  18   44:icmplt          50
	//*  19   47:goto            7
			{
				obj = ((Object) (adapter.getItem(((Integer) (obj)).intValue())));
	//   20   50:aload_0         
	//   21   51:getfield        #19  <Field BonusPickerAdapter adapter>
	//   22   54:aload_2         
	//   23   55:invokevirtual   #66  <Method int Integer.intValue()>
	//   24   58:invokevirtual   #106 <Method AbstractBonusPickerRow BonusPickerAdapter.getItem(int)>
	//   25   61:astore_2        
				if(obj != null)
	//*  26   62:aload_2         
	//*  27   63:ifnull          7
					((AbstractBonusPickerRow) (obj)).setVisible(false);
	//   28   66:aload_2         
	//   29   67:iconst_0        
	//   30   68:invokevirtual   #171 <Method void AbstractBonusPickerRow.setVisible(boolean)>
			}
		} while(true);
	//   31   71:goto            7
	//   32   74:return          
	}

	public void onSufficientlyVisible(Set set)
	{
	//    0    0:return          
	}

	public void onTrackChildren(Set set)
	{
		set = ((Set) (set.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #155 <Method Iterator Set.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (set)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            83
			Integer integer = (Integer)((Iterator) (set)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #165 <Method Object Iterator.next()>
	//    8   22:checkcast       #51  <Class Integer>
	//    9   25:astore_2        
			if(integer.intValue() >= 0 && integer.intValue() < adapter.getItemCount())
	//*  10   26:aload_2         
	//*  11   27:invokevirtual   #66  <Method int Integer.intValue()>
	//*  12   30:iflt            7
	//*  13   33:aload_2         
	//*  14   34:invokevirtual   #66  <Method int Integer.intValue()>
	//*  15   37:aload_0         
	//*  16   38:getfield        #19  <Field BonusPickerAdapter adapter>
	//*  17   41:invokevirtual   #102 <Method int BonusPickerAdapter.getItemCount()>
	//*  18   44:icmplt          50
	//*  19   47:goto            7
			{
				AbstractBonusPickerRow abstractbonuspickerrow = adapter.getItem(integer.intValue());
	//   20   50:aload_0         
	//   21   51:getfield        #19  <Field BonusPickerAdapter adapter>
	//   22   54:aload_2         
	//   23   55:invokevirtual   #66  <Method int Integer.intValue()>
	//   24   58:invokevirtual   #106 <Method AbstractBonusPickerRow BonusPickerAdapter.getItem(int)>
	//   25   61:astore_3        
				if(abstractbonuspickerrow != null)
	//*  26   62:aload_3         
	//*  27   63:ifnull          7
				{
					abstractbonuspickerrow.setVisible(true);
	//   28   66:aload_3         
	//   29   67:iconst_1        
	//   30   68:invokevirtual   #171 <Method void AbstractBonusPickerRow.setVisible(boolean)>
					trackVisible(abstractbonuspickerrow, integer.intValue());
	//   31   71:aload_0         
	//   32   72:aload_3         
	//   33   73:aload_2         
	//   34   74:invokevirtual   #66  <Method int Integer.intValue()>
	//   35   77:invokespecial   #177 <Method void trackVisible(AbstractBonusPickerRow, int)>
				}
			}
		} while(true);
	//   36   80:goto            7
	//   37   83:return          
	}

	public void trackBonusClick(BonusModel bonusmodel)
	{
		bonusmodel = ((BonusModel) (createBasicBonusEvent(bonusmodel, getBonusIndex(bonusmodel))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #181 <Method int getBonusIndex(BonusModel)>
	//    5    7:invokespecial   #130 <Method BonusEvent createBasicBonusEvent(BonusModel, int)>
	//    6   10:astore_1        
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusmodel)));
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    9   15:aload_1         
	//   10   16:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		((BonusEvent) (bonusmodel)).setClickType(ClickType.BONUS);
	//   11   21:aload_1         
	//   12   22:getstatic       #187 <Field ClickType ClickType.BONUS>
	//   13   25:invokevirtual   #191 <Method void BonusEvent.setClickType(ClickType)>
		((BonusEvent) (bonusmodel)).setClicked(Boolean.valueOf(true));
	//   14   28:aload_1         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #196 <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:invokevirtual   #200 <Method void BonusEvent.setClicked(Boolean)>
		Timber.d("Tracking Bonus Click: %1$s", new Object[] {
			bonusmodel
		});
	//   18   36:ldc1            #202 <String "Tracking Bonus Click: %1$s">
	//   19   38:iconst_1        
	//   20   39:anewarray       Object[]
	//   21   42:dup             
	//   22   43:iconst_0        
	//   23   44:aload_1         
	//   24   45:aastore         
	//   25   46:invokestatic    #138 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (bonusmodel)));
	//   26   49:aload_0         
	//   27   50:getfield        #23  <Field TrackingQueue trackingQueue>
	//   28   53:aload_1         
	//   29   54:invokeinterface #143 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   30   59:return          
	}

	public void trackSubListContentClicked(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		featuredbonusrow = ((FeaturedBonusRow) (createBasicSubListBonusEvent(featuredbonusrow, bonusmodel, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #206 <Method BonusEvent createBasicSubListBonusEvent(FeaturedBonusRow, BonusModel, int)>
	//    5    7:astore_1        
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (featuredbonusrow)));
	//    6    8:aload_0         
	//    7    9:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    8   12:aload_1         
	//    9   13:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		((BonusEvent) (featuredbonusrow)).setClickType(ClickType.BONUS);
	//   10   18:aload_1         
	//   11   19:getstatic       #187 <Field ClickType ClickType.BONUS>
	//   12   22:invokevirtual   #191 <Method void BonusEvent.setClickType(ClickType)>
		((BonusEvent) (featuredbonusrow)).setClicked(Boolean.valueOf(true));
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #196 <Method Boolean Boolean.valueOf(boolean)>
	//   16   30:invokevirtual   #200 <Method void BonusEvent.setClicked(Boolean)>
		Timber.d("Tracking Bonus Click: %1$s", new Object[] {
			featuredbonusrow
		});
	//   17   33:ldc1            #202 <String "Tracking Bonus Click: %1$s">
	//   18   35:iconst_1        
	//   19   36:anewarray       Object[]
	//   20   39:dup             
	//   21   40:iconst_0        
	//   22   41:aload_1         
	//   23   42:aastore         
	//   24   43:invokestatic    #138 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (featuredbonusrow)));
	//   25   46:aload_0         
	//   26   47:getfield        #23  <Field TrackingQueue trackingQueue>
	//   27   50:aload_1         
	//   28   51:invokeinterface #143 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   29   56:return          
	}

	public void trackSubListContentVisible(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		featuredbonusrow = ((FeaturedBonusRow) (createBasicSubListBonusEvent(featuredbonusrow, bonusmodel, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #206 <Method BonusEvent createBasicSubListBonusEvent(FeaturedBonusRow, BonusModel, int)>
	//    5    7:astore_1        
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (featuredbonusrow)));
	//    6    8:aload_0         
	//    7    9:getfield        #21  <Field EventContextProvider eventContextProvider>
	//    8   12:aload_1         
	//    9   13:invokeinterface #35  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		Timber.d("Tracking Bonus Visible: %1$s", new Object[] {
			featuredbonusrow
		});
	//   10   18:ldc1            #132 <String "Tracking Bonus Visible: %1$s">
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_1         
	//   16   27:aastore         
	//   17   28:invokestatic    #138 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (featuredbonusrow)));
	//   18   31:aload_0         
	//   19   32:getfield        #23  <Field TrackingQueue trackingQueue>
	//   20   35:aload_1         
	//   21   36:invokeinterface #143 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   22   41:return          
	}

	private final BonusPickerAdapter adapter;
	private final EventContextProvider eventContextProvider;
	private final TrackingQueue trackingQueue;
}
