// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;

class ViewInfoStore
{
	static class InfoRecord
	{

		static void drainCache()
		{
			while(sPool.acquire() != null) ;
		//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    2    8:ifnull          14
		//*   3   11:goto            0
		//    4   14:return          
		}

		static InfoRecord obtain()
		{
			InfoRecord inforecord1 = (InfoRecord)sPool.acquire();
		//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    2    8:checkcast       #2   <Class ViewInfoStore$InfoRecord>
		//    3   11:astore_1        
			InfoRecord inforecord = inforecord1;
		//    4   12:aload_1         
		//    5   13:astore_0        
			if(inforecord1 == null)
		//*   6   14:aload_1         
		//*   7   15:ifnonnull       26
				inforecord = new InfoRecord();
		//    8   18:new             #2   <Class ViewInfoStore$InfoRecord>
		//    9   21:dup             
		//   10   22:invokespecial   #53  <Method void ViewInfoStore$InfoRecord()>
		//   11   25:astore_0        
			return inforecord;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		static void recycle(InfoRecord inforecord)
		{
			inforecord.flags = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #57  <Field int flags>
			inforecord.preInfo = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #59  <Field RecyclerView$ItemAnimator$ItemHolderInfo preInfo>
			inforecord.postInfo = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #61  <Field RecyclerView$ItemAnimator$ItemHolderInfo postInfo>
			sPool.release(((Object) (inforecord)));
		//    9   15:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//   10   18:aload_0         
		//   11   19:invokeinterface #65  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
		//   12   24:pop             
		//   13   25:return          
		}

		static final int FLAG_APPEAR = 2;
		static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
		static final int FLAG_APPEAR_PRE_AND_POST = 14;
		static final int FLAG_DISAPPEARED = 1;
		static final int FLAG_POST = 8;
		static final int FLAG_PRE = 4;
		static final int FLAG_PRE_AND_POST = 12;
		static android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(20);
		int flags;
		RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
		RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

		static 
		{
		//    0    0:new             #34  <Class android.support.v4.util.Pools$SimplePool>
		//    1    3:dup             
		//    2    4:bipush          20
		//    3    6:invokespecial   #38  <Method void android.support.v4.util.Pools$SimplePool(int)>
		//    4    9:putstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//*   5   12:return          
		}

		private InfoRecord()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface ProcessCallback
	{

		public abstract void processAppeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void processDisappeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void processPersistent(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void unused(RecyclerView.ViewHolder viewholder);
	}


	ViewInfoStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayMap()>
	//    6   12:putfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    7   15:aload_0         
	//    8   16:new             #31  <Class LongSparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #32  <Method void LongSparseArray()>
	//   11   23:putfield        #34  <Field LongSparseArray mOldChangedHolders>
	//   12   26:return          
	}

	private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewholder, int i)
	{
label0:
		{
label1:
			{
				int j = mLayoutHolderMap.indexOfKey(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method int ArrayMap.indexOfKey(Object)>
	//    4    8:istore_3        
				if(j < 0)
	//*   5    9:iload_3         
	//*   6   10:ifge            15
					return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
				InfoRecord inforecord = (InfoRecord)mLayoutHolderMap.valueAt(j);
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   11   19:iload_3         
	//   12   20:invokevirtual   #45  <Method Object ArrayMap.valueAt(int)>
	//   13   23:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   14   26:astore          4
				if(inforecord == null || (inforecord.flags & i) == 0)
					break label0;
	//   15   28:aload           4
	//   16   30:ifnull          120
	//   17   33:aload           4
	//   18   35:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   19   38:iload_2         
	//   20   39:iand            
	//   21   40:ifeq            120
				inforecord.flags = inforecord.flags & ~i;
	//   22   43:aload           4
	//   23   45:aload           4
	//   24   47:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   25   50:iload_2         
	//   26   51:iconst_m1       
	//   27   52:ixor            
	//   28   53:iand            
	//   29   54:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
				if(i == 4)
	//*  30   57:iload_2         
	//*  31   58:iconst_4        
	//*  32   59:icmpne          71
				{
					viewholder = ((RecyclerView.ViewHolder) (inforecord.preInfo));
	//   33   62:aload           4
	//   34   64:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   35   67:astore_1        
				} else
	//*  36   68:goto            83
				{
					if(i != 8)
						break label1;
	//   37   71:iload_2         
	//   38   72:bipush          8
	//   39   74:icmpne          110
					viewholder = ((RecyclerView.ViewHolder) (inforecord.postInfo));
	//   40   77:aload           4
	//   41   79:getfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   42   82:astore_1        
				}
				if((inforecord.flags & 0xc) == 0)
	//*  43   83:aload           4
	//*  44   85:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  45   88:bipush          12
	//*  46   90:iand            
	//*  47   91:ifne            108
				{
					mLayoutHolderMap.removeAt(j);
	//   48   94:aload_0         
	//   49   95:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   50   98:iload_3         
	//   51   99:invokevirtual   #59  <Method Object ArrayMap.removeAt(int)>
	//   52  102:pop             
					InfoRecord.recycle(inforecord);
	//   53  103:aload           4
	//   54  105:invokestatic    #63  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
				}
				return ((RecyclerView.ItemAnimator.ItemHolderInfo) (viewholder));
	//   55  108:aload_1         
	//   56  109:areturn         
			}
			throw new IllegalArgumentException("Must provide flag PRE or POST");
	//   57  110:new             #65  <Class IllegalArgumentException>
	//   58  113:dup             
	//   59  114:ldc1            #67  <String "Must provide flag PRE or POST">
	//   60  116:invokespecial   #70  <Method void IllegalArgumentException(String)>
	//   61  119:athrow          
		}
		return null;
	//   62  120:aconst_null     
	//   63  121:areturn         
	}

	void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.flags = inforecord.flags | 2;
	//   18   35:aload_3         
	//   19   36:aload_3         
	//   20   37:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   21   40:iconst_2        
	//   22   41:ior             
	//   23   42:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
		inforecord.preInfo = itemholderinfo;
	//   24   45:aload_3         
	//   25   46:aload_2         
	//   26   47:putfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   27   50:return          
	}

	void addToDisappearedInLayout(RecyclerView.ViewHolder viewholder)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_3        
		InfoRecord inforecord = inforecord1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(inforecord1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       32
		{
			inforecord = InfoRecord.obtain();
	//   10   18:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   21:astore_2        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   31:pop             
		}
		inforecord.flags = inforecord.flags | 1;
	//   18   32:aload_2         
	//   19   33:aload_2         
	//   20   34:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   21   37:iconst_1        
	//   22   38:ior             
	//   23   39:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   42:return          
	}

	void addToOldChangeHolders(long l, RecyclerView.ViewHolder viewholder)
	{
		mOldChangedHolders.put(l, ((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #91  <Method void LongSparseArray.put(long, Object)>
	//    5    9:return          
	}

	void addToPostLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.postInfo = itemholderinfo;
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:putfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
		inforecord.flags = inforecord.flags | 8;
	//   21   40:aload_3         
	//   22   41:aload_3         
	//   23   42:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   45:bipush          8
	//   25   47:ior             
	//   26   48:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   27   51:return          
	}

	void addToPreLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.preInfo = itemholderinfo;
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:putfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
		inforecord.flags = inforecord.flags | 4;
	//   21   40:aload_3         
	//   22   41:aload_3         
	//   23   42:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   45:iconst_4        
	//   25   46:ior             
	//   26   47:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   27   50:return          
	}

	void clear()
	{
		mLayoutHolderMap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:invokevirtual   #96  <Method void ArrayMap.clear()>
		mOldChangedHolders.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    5   11:invokevirtual   #97  <Method void LongSparseArray.clear()>
	//    6   14:return          
	}

	RecyclerView.ViewHolder getFromOldChangeHolders(long l)
	{
		return (RecyclerView.ViewHolder)mOldChangedHolders.get(l);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #102 <Method Object LongSparseArray.get(long)>
	//    4    8:checkcast       #104 <Class RecyclerView$ViewHolder>
	//    5   11:areturn         
	}

	boolean isDisappearing(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		return viewholder != null && (((InfoRecord) (viewholder)).flags & 1) != 0;
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   10   20:iconst_1        
	//   11   21:iand            
	//   12   22:ifeq            27
	//   13   25:iconst_1        
	//   14   26:ireturn         
	//   15   27:iconst_0        
	//   16   28:ireturn         
	}

	boolean isInPreLayout(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		return viewholder != null && (((InfoRecord) (viewholder)).flags & 4) != 0;
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   10   20:iconst_4        
	//   11   21:iand            
	//   12   22:ifeq            27
	//   13   25:iconst_1        
	//   14   26:ireturn         
	//   15   27:iconst_0        
	//   16   28:ireturn         
	}

	void onDetach()
	{
		InfoRecord.drainCache();
	//    0    0:invokestatic    #111 <Method void ViewInfoStore$InfoRecord.drainCache()>
	//    1    3:return          
	}

	public void onViewDetached(RecyclerView.ViewHolder viewholder)
	{
		removeFromDisappearedInLayout(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method void removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewholder)
	{
		return popFromLayoutStep(viewholder, 8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          8
	//    3    4:invokespecial   #120 <Method RecyclerView$ItemAnimator$ItemHolderInfo popFromLayoutStep(RecyclerView$ViewHolder, int)>
	//    4    7:areturn         
	}

	RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewholder)
	{
		return popFromLayoutStep(viewholder, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #120 <Method RecyclerView$ItemAnimator$ItemHolderInfo popFromLayoutStep(RecyclerView$ViewHolder, int)>
	//    4    6:areturn         
	}

	void process(ProcessCallback processcallback)
	{
		for(int i = mLayoutHolderMap.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//*   2    4:invokevirtual   #128 <Method int ArrayMap.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            257
		{
			RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)mLayoutHolderMap.keyAt(i);
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #131 <Method Object ArrayMap.keyAt(int)>
	//   12   22:checkcast       #104 <Class RecyclerView$ViewHolder>
	//   13   25:astore          4
			InfoRecord inforecord = (InfoRecord)mLayoutHolderMap.removeAt(i);
	//   14   27:aload_0         
	//   15   28:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   16   31:iload_2         
	//   17   32:invokevirtual   #59  <Method Object ArrayMap.removeAt(int)>
	//   18   35:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   19   38:astore          5
			int j;
			if((inforecord.flags & 3) == 3)
	//*  20   40:aload           5
	//*  21   42:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  22   45:iconst_3        
	//*  23   46:iand            
	//*  24   47:iconst_3        
	//*  25   48:icmpne          62
				processcallback.unused(viewholder);
	//   26   51:aload_1         
	//   27   52:aload           4
	//   28   54:invokeinterface #134 <Method void ViewInfoStore$ProcessCallback.unused(RecyclerView$ViewHolder)>
			else
	//*  29   59:goto            245
			if((inforecord.flags & 1) != 0)
	//*  30   62:aload           5
	//*  31   64:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  32   67:iconst_1        
	//*  33   68:iand            
	//*  34   69:ifeq            112
			{
				if(inforecord.preInfo == null)
	//*  35   72:aload           5
	//*  36   74:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//*  37   77:ifnonnull       91
					processcallback.unused(viewholder);
	//   38   80:aload_1         
	//   39   81:aload           4
	//   40   83:invokeinterface #134 <Method void ViewInfoStore$ProcessCallback.unused(RecyclerView$ViewHolder)>
				else
	//*  41   88:goto            245
					processcallback.processDisappeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   42   91:aload_1         
	//   43   92:aload           4
	//   44   94:aload           5
	//   45   96:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   46   99:aload           5
	//   47  101:getfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   48  104:invokeinterface #138 <Method void ViewInfoStore$ProcessCallback.processDisappeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			} else
	//*  49  109:goto            245
			if((inforecord.flags & 0xe) == 14)
	//*  50  112:aload           5
	//*  51  114:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  52  117:bipush          14
	//*  53  119:iand            
	//*  54  120:bipush          14
	//*  55  122:icmpne          146
				processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   56  125:aload_1         
	//   57  126:aload           4
	//   58  128:aload           5
	//   59  130:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   60  133:aload           5
	//   61  135:getfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   62  138:invokeinterface #141 <Method void ViewInfoStore$ProcessCallback.processAppeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  63  143:goto            245
			if((inforecord.flags & 0xc) == 12)
	//*  64  146:aload           5
	//*  65  148:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  66  151:bipush          12
	//*  67  153:iand            
	//*  68  154:bipush          12
	//*  69  156:icmpne          180
				processcallback.processPersistent(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   70  159:aload_1         
	//   71  160:aload           4
	//   72  162:aload           5
	//   73  164:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   74  167:aload           5
	//   75  169:getfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   76  172:invokeinterface #144 <Method void ViewInfoStore$ProcessCallback.processPersistent(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  77  177:goto            245
			if((inforecord.flags & 4) != 0)
	//*  78  180:aload           5
	//*  79  182:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  80  185:iconst_4        
	//*  81  186:iand            
	//*  82  187:ifeq            207
				processcallback.processDisappeared(viewholder, inforecord.preInfo, ((RecyclerView.ItemAnimator.ItemHolderInfo) (null)));
	//   83  190:aload_1         
	//   84  191:aload           4
	//   85  193:aload           5
	//   86  195:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   87  198:aconst_null     
	//   88  199:invokeinterface #138 <Method void ViewInfoStore$ProcessCallback.processDisappeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  89  204:goto            245
			if((inforecord.flags & 8) != 0)
	//*  90  207:aload           5
	//*  91  209:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  92  212:bipush          8
	//*  93  214:iand            
	//*  94  215:ifeq            239
				processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   95  218:aload_1         
	//   96  219:aload           4
	//   97  221:aload           5
	//   98  223:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   99  226:aload           5
	//  100  228:getfield        #56  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//  101  231:invokeinterface #141 <Method void ViewInfoStore$ProcessCallback.processAppeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//* 102  236:goto            245
				j = inforecord.flags;
	//  103  239:aload           5
	//  104  241:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//  105  244:istore_3        
			InfoRecord.recycle(inforecord);
	//  106  245:aload           5
	//  107  247:invokestatic    #63  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
		}

	//  108  250:iload_2         
	//  109  251:iconst_1        
	//  110  252:isub            
	//  111  253:istore_2        
	//* 112  254:goto            10
	//  113  257:return          
	}

	void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		if(viewholder == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       17
		{
			return;
	//    8   16:return          
		} else
		{
			viewholder.flags = ((InfoRecord) (viewholder)).flags & -2;
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   12   22:bipush          -2
	//   13   24:iand            
	//   14   25:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
			return;
	//   15   28:return          
		}
	}

	void removeViewHolder(RecyclerView.ViewHolder viewholder)
	{
		int i = mOldChangedHolders.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:invokevirtual   #146 <Method int LongSparseArray.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		do
		{
			if(i < 0)
				break;
	//    6   10:iload_2         
	//    7   11:iflt            44
			if(viewholder == mOldChangedHolders.valueAt(i))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #147 <Method Object LongSparseArray.valueAt(int)>
	//*  13   23:if_acmpne       37
			{
				mOldChangedHolders.removeAt(i);
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #150 <Method void LongSparseArray.removeAt(int)>
				break;
	//   18   34:goto            44
			}
			i--;
	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
		} while(true);
	//   23   41:goto            10
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.remove(((Object) (viewholder)))));
	//   24   44:aload_0         
	//   25   45:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   26   48:aload_1         
	//   27   49:invokevirtual   #153 <Method Object ArrayMap.remove(Object)>
	//   28   52:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   29   55:astore_1        
		if(viewholder != null)
	//*  30   56:aload_1         
	//*  31   57:ifnull          64
			InfoRecord.recycle(((InfoRecord) (viewholder)));
	//   32   60:aload_1         
	//   33   61:invokestatic    #63  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
	//   34   64:return          
	}

	private static final boolean DEBUG = false;
	final ArrayMap mLayoutHolderMap = new ArrayMap();
	final LongSparseArray mOldChangedHolders = new LongSparseArray();
}
