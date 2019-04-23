// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			ThreadUtil

class MessageThreadUtil
	implements ThreadUtil
{

	MessageThreadUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public ThreadUtil.BackgroundCallback getBackgroundProxy(final ThreadUtil.BackgroundCallback callback)
	{
		return ((ThreadUtil.BackgroundCallback) (new _cls2()));
	//    0    0:new             #15  <Class MessageThreadUtil$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #18  <Method void MessageThreadUtil$2(MessageThreadUtil, ThreadUtil$BackgroundCallback)>
	//    5    9:areturn         
	}

	public ThreadUtil.MainThreadCallback getMainThreadProxy(final ThreadUtil.MainThreadCallback callback)
	{
		return ((ThreadUtil.MainThreadCallback) (new _cls1()));
	//    0    0:new             #22  <Class MessageThreadUtil$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #25  <Method void MessageThreadUtil$1(MessageThreadUtil, ThreadUtil$MainThreadCallback)>
	//    5    9:areturn         
	}

	private class _cls2
		implements ThreadUtil.BackgroundCallback
	{
		private class MessageQueue
		{

			SyncQueueItem next()
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				SyncQueueItem syncqueueitem = mRoot;
			//    2    2:aload_0         
			//    3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//    4    6:astore_1        
				if(syncqueueitem != null)
					break MISSING_BLOCK_LABEL_15;
			//    5    7:aload_1         
			//    6    8:ifnonnull       15
				this;
			//    7   11:aload_0         
				JVM INSTR monitorexit ;
			//    8   12:monitorexit     
				return null;
			//    9   13:aconst_null     
			//   10   14:areturn         
				syncqueueitem = mRoot;
			//   11   15:aload_0         
			//   12   16:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   13   19:astore_1        
				mRoot = mRoot.next;
			//   14   20:aload_0         
			//   15   21:aload_0         
			//   16   22:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   17   25:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   18   28:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
				this;
			//   19   31:aload_0         
				JVM INSTR monitorexit ;
			//   20   32:monitorexit     
				return syncqueueitem;
			//   21   33:aload_1         
			//   22   34:areturn         
				Exception exception;
				exception;
			//   23   35:astore_1        
			//*  24   36:aload_0         
				throw exception;
			//   25   37:monitorexit     
			//   26   38:aload_1         
			//   27   39:athrow          
			}

			void removeMessages(int i)
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				while(mRoot != null && mRoot.what == i) 
			//*   2    2:aload_0         
			//*   3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//*   4    6:ifnull          43
			//*   5    9:aload_0         
			//*   6   10:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//*   7   13:getfield        #25  <Field int MessageThreadUtil$SyncQueueItem.what>
			//*   8   16:iload_1         
			//*   9   17:icmpne          43
				{
					SyncQueueItem syncqueueitem = mRoot;
			//   10   20:aload_0         
			//   11   21:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   12   24:astore_2        
					mRoot = mRoot.next;
			//   13   25:aload_0         
			//   14   26:aload_0         
			//   15   27:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   16   30:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   17   33:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
					syncqueueitem.recycle();
			//   18   36:aload_2         
			//   19   37:invokevirtual   #28  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
				}
			//*  20   40:goto            2
				SyncQueueItem syncqueueitem1;
				SyncQueueItem syncqueueitem2;
				if(mRoot == null)
					break MISSING_BLOCK_LABEL_99;
			//   21   43:aload_0         
			//   22   44:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   23   47:ifnull          99
				syncqueueitem2 = mRoot;
			//   24   50:aload_0         
			//   25   51:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   26   54:astore_3        
				syncqueueitem1 = syncqueueitem2.next;
			//   27   55:aload_3         
			//   28   56:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   29   59:astore_2        
_L3:
				if(syncqueueitem1 == null) goto _L2; else goto _L1
			//   30   60:aload_2         
			//   31   61:ifnull          99
_L1:
				SyncQueueItem syncqueueitem3 = syncqueueitem1.next;
			//   32   64:aload_2         
			//   33   65:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   34   68:astore          4
				if(syncqueueitem1.what == i)
			//*  35   70:aload_2         
			//*  36   71:getfield        #25  <Field int MessageThreadUtil$SyncQueueItem.what>
			//*  37   74:iload_1         
			//*  38   75:icmpne          91
				{
					syncqueueitem2.next = syncqueueitem3;
			//   39   78:aload_3         
			//   40   79:aload           4
			//   41   81:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
					syncqueueitem1.recycle();
			//   42   84:aload_2         
			//   43   85:invokevirtual   #28  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
					continue; /* Loop/switch isn't completed */
			//   44   88:goto            93
				}
				syncqueueitem2 = syncqueueitem1;
			//   45   91:aload_2         
			//   46   92:astore_3        
				syncqueueitem1 = syncqueueitem3;
			//   47   93:aload           4
			//   48   95:astore_2        
				  goto _L3
			//*  49   96:goto            60
_L2:
				this;
			//   50   99:aload_0         
				JVM INSTR monitorexit ;
			//   51  100:monitorexit     
				return;
			//   52  101:return          
				Exception exception;
				exception;
			//   53  102:astore_2        
			//*  54  103:aload_0         
				throw exception;
			//   55  104:monitorexit     
			//   56  105:aload_2         
			//   57  106:athrow          
			}

			void sendMessage(SyncQueueItem syncqueueitem)
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				if(mRoot != null)
					break MISSING_BLOCK_LABEL_17;
			//    2    2:aload_0         
			//    3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//    4    6:ifnonnull       17
				mRoot = syncqueueitem;
			//    5    9:aload_0         
			//    6   10:aload_1         
			//    7   11:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
				this;
			//    8   14:aload_0         
				JVM INSTR monitorexit ;
			//    9   15:monitorexit     
				return;
			//   10   16:return          
				SyncQueueItem syncqueueitem1;
				for(syncqueueitem1 = mRoot; syncqueueitem1.next != null; syncqueueitem1 = syncqueueitem1.next);
			//   11   17:aload_0         
			//   12   18:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//   13   21:astore_2        
			//   14   22:aload_2         
			//   15   23:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   16   26:ifnull          37
			//   17   29:aload_2         
			//   18   30:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			//   19   33:astore_2        
			//*  20   34:goto            22
				syncqueueitem1.next = syncqueueitem;
			//   21   37:aload_2         
			//   22   38:aload_1         
			//   23   39:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
				this;
			//   24   42:aload_0         
				JVM INSTR monitorexit ;
			//   25   43:monitorexit     
				return;
			//   26   44:return          
				syncqueueitem;
			//   27   45:astore_1        
			//*  28   46:aload_0         
				throw syncqueueitem;
			//   29   47:monitorexit     
			//   30   48:aload_1         
			//   31   49:athrow          
			}

			void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
			{
				this;
			//    0    0:aload_0         
				JVM INSTR monitorenter ;
			//    1    1:monitorenter    
				syncqueueitem.next = mRoot;
			//    2    2:aload_1         
			//    3    3:aload_0         
			//    4    4:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			//    5    7:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
				mRoot = syncqueueitem;
			//    6   10:aload_0         
			//    7   11:aload_1         
			//    8   12:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
				this;
			//    9   15:aload_0         
				JVM INSTR monitorexit ;
			//   10   16:monitorexit     
				return;
			//   11   17:return          
				syncqueueitem;
			//   12   18:astore_1        
			//*  13   19:aload_0         
				throw syncqueueitem;
			//   14   20:monitorexit     
			//   15   21:aload_1         
			//   16   22:athrow          
			}

			private SyncQueueItem mRoot;

			MessageQueue()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}


		private void maybeExecuteBackgroundRunnable()
		{
			if(mBackgroundRunning.compareAndSet(false, true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #55  <Field AtomicBoolean mBackgroundRunning>
		//*   2    4:iconst_0        
		//*   3    5:iconst_1        
		//*   4    6:invokevirtual   #68  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
		//*   5    9:ifeq            25
				mExecutor.execute(mBackgroundRunnable);
		//    6   12:aload_0         
		//    7   13:getfield        #48  <Field Executor mExecutor>
		//    8   16:aload_0         
		//    9   17:getfield        #62  <Field Runnable mBackgroundRunnable>
		//   10   20:invokeinterface #74  <Method void Executor.execute(Runnable)>
		//   11   25:return          
		}

		private void sendMessage(SyncQueueItem syncqueueitem)
		{
			mQueue.sendMessage(syncqueueitem);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #78  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
			maybeExecuteBackgroundRunnable();
		//    4    8:aload_0         
		//    5    9:invokespecial   #80  <Method void maybeExecuteBackgroundRunnable()>
		//    6   12:return          
		}

		private void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
		{
			mQueue.sendMessageAtFrontOfQueue(syncqueueitem);
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #83  <Method void MessageThreadUtil$MessageQueue.sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
			maybeExecuteBackgroundRunnable();
		//    4    8:aload_0         
		//    5    9:invokespecial   #80  <Method void maybeExecuteBackgroundRunnable()>
		//    6   12:return          
		}

		public void loadTile(int i, int j)
		{
			sendMessage(SyncQueueItem.obtainMessage(3, i, j));
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iload_1         
		//    3    3:iload_2         
		//    4    4:invokestatic    #91  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
		//    5    7:invokespecial   #92  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		public void recycleTile(TileList.Tile tile)
		{
			sendMessage(SyncQueueItem.obtainMessage(4, 0, ((Object) (tile))));
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:iconst_0        
		//    3    3:aload_1         
		//    4    4:invokestatic    #97  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
		//    5    7:invokespecial   #92  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		public void refresh(int i)
		{
			sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, ((Object) (null))));
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:aconst_null     
		//    4    4:invokestatic    #97  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
		//    5    7:invokespecial   #100 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		public void updateRange(int i, int j, int k, int l, int i1)
		{
			sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, j, k, l, i1, ((Object) (null))));
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iload_1         
		//    3    3:iload_2         
		//    4    4:iload_3         
		//    5    5:iload           4
		//    6    7:iload           5
		//    7    9:aconst_null     
		//    8   10:invokestatic    #105 <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int, int, int, int, Object)>
		//    9   13:invokespecial   #100 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
		//   10   16:return          
		}

		static final int LOAD_TILE = 3;
		static final int RECYCLE_TILE = 4;
		static final int REFRESH = 1;
		static final int UPDATE_RANGE = 2;
		private Runnable mBackgroundRunnable;
		AtomicBoolean mBackgroundRunning;
		private final Executor mExecutor;
		final MessageQueue mQueue = new MessageQueue();
		final MessageThreadUtil this$0;
		final ThreadUtil.BackgroundCallback val$callback;

		_cls2()
		{
			this$0 = MessageThreadUtil.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field MessageThreadUtil this$0>
			callback = backgroundcallback;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #33  <Field ThreadUtil$BackgroundCallback val$callback>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #36  <Method void Object()>
		//    8   14:aload_0         
		//    9   15:new             #38  <Class MessageThreadUtil$MessageQueue>
		//   10   18:dup             
		//   11   19:invokespecial   #39  <Method void MessageThreadUtil$MessageQueue()>
		//   12   22:putfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
			mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
		//   13   25:aload_0         
		//   14   26:getstatic       #46  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
		//   15   29:putfield        #48  <Field Executor mExecutor>
			mBackgroundRunning = new AtomicBoolean(false);
		//   16   32:aload_0         
		//   17   33:new             #50  <Class AtomicBoolean>
		//   18   36:dup             
		//   19   37:iconst_0        
		//   20   38:invokespecial   #53  <Method void AtomicBoolean(boolean)>
		//   21   41:putfield        #55  <Field AtomicBoolean mBackgroundRunning>
			class _cls1
				implements Runnable
			{

				public void run()
				{
					do
					{
						SyncQueueItem syncqueueitem = mQueue.next();
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
				//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
				//    4   10:astore_1        
						if(syncqueueitem == null)
				//*   5   11:aload_1         
				//*   6   12:ifnonnull       27
						{
							mBackgroundRunning.set(false);
				//    7   15:aload_0         
				//    8   16:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//    9   19:getfield        #33  <Field AtomicBoolean MessageThreadUtil$2.mBackgroundRunning>
				//   10   22:iconst_0        
				//   11   23:invokevirtual   #39  <Method void AtomicBoolean.set(boolean)>
							return;
				//   12   26:return          
						}
						switch(syncqueueitem.what)
				//*  13   27:aload_1         
				//*  14   28:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
						{
				//*  15   31:tableswitch     1 4: default 60
				//				               1 199
				//				               2 142
				//				               3 119
				//				               4 97
						default:
							StringBuilder stringbuilder = new StringBuilder();
				//   16   60:new             #47  <Class StringBuilder>
				//   17   63:dup             
				//   18   64:invokespecial   #48  <Method void StringBuilder()>
				//   19   67:astore_2        
							stringbuilder.append("Unsupported message, what=");
				//   20   68:aload_2         
				//   21   69:ldc1            #50  <String "Unsupported message, what=">
				//   22   71:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   23   74:pop             
							stringbuilder.append(syncqueueitem.what);
				//   24   75:aload_2         
				//   25   76:aload_1         
				//   26   77:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
				//   27   80:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
				//   28   83:pop             
							Log.e("ThreadUtil", stringbuilder.toString());
				//   29   84:ldc1            #59  <String "ThreadUtil">
				//   30   86:aload_2         
				//   31   87:invokevirtual   #63  <Method String StringBuilder.toString()>
				//   32   90:invokestatic    #69  <Method int Log.e(String, String)>
				//   33   93:pop             
							break;

				//*  34   94:goto            0
						case 4: // '\004'
							callback.recycleTile((TileList.Tile)syncqueueitem.data);
				//   35   97:aload_0         
				//   36   98:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   37  101:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
				//   38  104:aload_1         
				//   39  105:getfield        #77  <Field Object MessageThreadUtil$SyncQueueItem.data>
				//   40  108:checkcast       #79  <Class TileList$Tile>
				//   41  111:invokeinterface #85  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
							break;

				//*  42  116:goto            0
						case 3: // '\003'
							callback.loadTile(syncqueueitem.arg1, syncqueueitem.arg2);
				//   43  119:aload_0         
				//   44  120:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   45  123:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
				//   46  126:aload_1         
				//   47  127:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   48  130:aload_1         
				//   49  131:getfield        #91  <Field int MessageThreadUtil$SyncQueueItem.arg2>
				//   50  134:invokeinterface #95  <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
							break;

				//*  51  139:goto            0
						case 2: // '\002'
							mQueue.removeMessages(2);
				//   52  142:aload_0         
				//   53  143:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   54  146:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
				//   55  149:iconst_2        
				//   56  150:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
							mQueue.removeMessages(3);
				//   57  153:aload_0         
				//   58  154:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   59  157:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
				//   60  160:iconst_3        
				//   61  161:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
							callback.updateRange(syncqueueitem.arg1, syncqueueitem.arg2, syncqueueitem.arg3, syncqueueitem.arg4, syncqueueitem.arg5);
				//   62  164:aload_0         
				//   63  165:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   64  168:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
				//   65  171:aload_1         
				//   66  172:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   67  175:aload_1         
				//   68  176:getfield        #91  <Field int MessageThreadUtil$SyncQueueItem.arg2>
				//   69  179:aload_1         
				//   70  180:getfield        #102 <Field int MessageThreadUtil$SyncQueueItem.arg3>
				//   71  183:aload_1         
				//   72  184:getfield        #105 <Field int MessageThreadUtil$SyncQueueItem.arg4>
				//   73  187:aload_1         
				//   74  188:getfield        #108 <Field int MessageThreadUtil$SyncQueueItem.arg5>
				//   75  191:invokeinterface #112 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
							break;

				//*  76  196:goto            0
						case 1: // '\001'
							mQueue.removeMessages(1);
				//   77  199:aload_0         
				//   78  200:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   79  203:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
				//   80  206:iconst_1        
				//   81  207:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
							callback.refresh(syncqueueitem.arg1);
				//   82  210:aload_0         
				//   83  211:getfield        #12  <Field MessageThreadUtil$2 this$1>
				//   84  214:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
				//   85  217:aload_1         
				//   86  218:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   87  221:invokeinterface #115 <Method void ThreadUtil$BackgroundCallback.refresh(int)>
							break;
						}
					} while(true);
				//*  88  226:goto            0
				}

				final _cls2 this$1;

				_cls1()
				{
					this$1 = _cls2.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field MessageThreadUtil$2 this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}

				private class SyncQueueItem
				{

					static SyncQueueItem obtainMessage(int i, int j, int k)
					{
						return obtainMessage(i, j, k, 0, 0, 0, ((Object) (null)));
					//    0    0:iload_0         
					//    1    1:iload_1         
					//    2    2:iload_2         
					//    3    3:iconst_0        
					//    4    4:iconst_0        
					//    5    5:iconst_0        
					//    6    6:aconst_null     
					//    7    7:invokestatic    #30  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
					//    8   10:areturn         
					}

					static SyncQueueItem obtainMessage(int i, int j, int k, int l, int i1, int j1, Object obj)
					{
						Object obj1 = sPoolLock;
					//    0    0:getstatic       #24  <Field Object sPoolLock>
					//    1    3:astore          8
						obj1;
					//    2    5:aload           8
						JVM INSTR monitorenter ;
					//    3    7:monitorenter    
						SyncQueueItem syncqueueitem;
						if(sPool == null)
					//*   4    8:getstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
					//*   5   11:ifnonnull       26
						{
							syncqueueitem = new SyncQueueItem();
					//    6   14:new             #2   <Class MessageThreadUtil$SyncQueueItem>
					//    7   17:dup             
					//    8   18:invokespecial   #33  <Method void MessageThreadUtil$SyncQueueItem()>
					//    9   21:astore          7
							break MISSING_BLOCK_LABEL_46;
					//   10   23:goto            46
						}
						syncqueueitem = sPool;
					//   11   26:getstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
					//   12   29:astore          7
						sPool = sPool.next;
					//   13   31:getstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
					//   14   34:getfield        #35  <Field MessageThreadUtil$SyncQueueItem next>
					//   15   37:putstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
						syncqueueitem.next = null;
					//   16   40:aload           7
					//   17   42:aconst_null     
					//   18   43:putfield        #35  <Field MessageThreadUtil$SyncQueueItem next>
						syncqueueitem.what = i;
					//   19   46:aload           7
					//   20   48:iload_0         
					//   21   49:putfield        #37  <Field int what>
						syncqueueitem.arg1 = j;
					//   22   52:aload           7
					//   23   54:iload_1         
					//   24   55:putfield        #39  <Field int arg1>
						syncqueueitem.arg2 = k;
					//   25   58:aload           7
					//   26   60:iload_2         
					//   27   61:putfield        #41  <Field int arg2>
						syncqueueitem.arg3 = l;
					//   28   64:aload           7
					//   29   66:iload_3         
					//   30   67:putfield        #43  <Field int arg3>
						syncqueueitem.arg4 = i1;
					//   31   70:aload           7
					//   32   72:iload           4
					//   33   74:putfield        #45  <Field int arg4>
						syncqueueitem.arg5 = j1;
					//   34   77:aload           7
					//   35   79:iload           5
					//   36   81:putfield        #47  <Field int arg5>
						syncqueueitem.data = obj;
					//   37   84:aload           7
					//   38   86:aload           6
					//   39   88:putfield        #49  <Field Object data>
						obj1;
					//   40   91:aload           8
						JVM INSTR monitorexit ;
					//   41   93:monitorexit     
						return syncqueueitem;
					//   42   94:aload           7
					//   43   96:areturn         
						obj;
					//   44   97:astore          6
						obj1;
					//   45   99:aload           8
						JVM INSTR monitorexit ;
					//   46  101:monitorexit     
						throw obj;
					//   47  102:aload           6
					//   48  104:athrow          
					}

					static SyncQueueItem obtainMessage(int i, int j, Object obj)
					{
						return obtainMessage(i, j, 0, 0, 0, 0, obj);
					//    0    0:iload_0         
					//    1    1:iload_1         
					//    2    2:iconst_0        
					//    3    3:iconst_0        
					//    4    4:iconst_0        
					//    5    5:iconst_0        
					//    6    6:aload_2         
					//    7    7:invokestatic    #30  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
					//    8   10:areturn         
					}

					void recycle()
					{
						next = null;
					//    0    0:aload_0         
					//    1    1:aconst_null     
					//    2    2:putfield        #35  <Field MessageThreadUtil$SyncQueueItem next>
						arg5 = 0;
					//    3    5:aload_0         
					//    4    6:iconst_0        
					//    5    7:putfield        #47  <Field int arg5>
						arg4 = 0;
					//    6   10:aload_0         
					//    7   11:iconst_0        
					//    8   12:putfield        #45  <Field int arg4>
						arg3 = 0;
					//    9   15:aload_0         
					//   10   16:iconst_0        
					//   11   17:putfield        #43  <Field int arg3>
						arg2 = 0;
					//   12   20:aload_0         
					//   13   21:iconst_0        
					//   14   22:putfield        #41  <Field int arg2>
						arg1 = 0;
					//   15   25:aload_0         
					//   16   26:iconst_0        
					//   17   27:putfield        #39  <Field int arg1>
						what = 0;
					//   18   30:aload_0         
					//   19   31:iconst_0        
					//   20   32:putfield        #37  <Field int what>
						data = null;
					//   21   35:aload_0         
					//   22   36:aconst_null     
					//   23   37:putfield        #49  <Field Object data>
						synchronized(sPoolLock)
					//*  24   40:getstatic       #24  <Field Object sPoolLock>
					//*  25   43:astore_1        
					//*  26   44:aload_1         
					//*  27   45:monitorenter    
						{
							if(sPool != null)
					//*  28   46:getstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
					//*  29   49:ifnull          59
								next = sPool;
					//   30   52:aload_0         
					//   31   53:getstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
					//   32   56:putfield        #35  <Field MessageThreadUtil$SyncQueueItem next>
							sPool = this;
					//   33   59:aload_0         
					//   34   60:putstatic       #32  <Field MessageThreadUtil$SyncQueueItem sPool>
						}
					//   35   63:aload_1         
					//   36   64:monitorexit     
						return;
					//   37   65:return          
						exception;
					//   38   66:astore_2        
						obj;
					//   39   67:aload_1         
						JVM INSTR monitorexit ;
					//   40   68:monitorexit     
						throw exception;
					//   41   69:aload_2         
					//   42   70:athrow          
					}

					private static SyncQueueItem sPool;
					private static final Object sPoolLock = new Object();
					public int arg1;
					public int arg2;
					public int arg3;
					public int arg4;
					public int arg5;
					public Object data;
					SyncQueueItem next;
					public int what;

					static 
					{
					//    0    0:new             #4   <Class Object>
					//    1    3:dup             
					//    2    4:invokespecial   #22  <Method void Object()>
					//    3    7:putstatic       #24  <Field Object sPoolLock>
					//*   4   10:return          
					}

					SyncQueueItem()
					{
					//    0    0:aload_0         
					//    1    1:invokespecial   #22  <Method void Object()>
					//    2    4:return          
					}
				}

			}

			mBackgroundRunnable = ((Runnable) (new _cls1()));
		//   22   44:aload_0         
		//   23   45:new             #57  <Class MessageThreadUtil$2$1>
		//   24   48:dup             
		//   25   49:aload_0         
		//   26   50:invokespecial   #60  <Method void MessageThreadUtil$2$1(MessageThreadUtil$2)>
		//   27   53:putfield        #62  <Field Runnable mBackgroundRunnable>
		//   28   56:return          
		}
	}


	private class _cls1
		implements ThreadUtil.MainThreadCallback
	{

		private void sendMessage(SyncQueueItem syncqueueitem)
		{
			mQueue.sendMessage(syncqueueitem);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field MessageThreadUtil$MessageQueue mQueue>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #62  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
			mMainThreadHandler.post(mMainThreadRunnable);
		//    4    8:aload_0         
		//    5    9:getfield        #50  <Field Handler mMainThreadHandler>
		//    6   12:aload_0         
		//    7   13:getfield        #57  <Field Runnable mMainThreadRunnable>
		//    8   16:invokevirtual   #66  <Method boolean Handler.post(Runnable)>
		//    9   19:pop             
		//   10   20:return          
		}

		public void addTile(int i, TileList.Tile tile)
		{
			sendMessage(SyncQueueItem.obtainMessage(2, i, ((Object) (tile))));
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iload_1         
		//    3    3:aload_2         
		//    4    4:invokestatic    #74  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
		//    5    7:invokespecial   #75  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		public void removeTile(int i, int j)
		{
			sendMessage(SyncQueueItem.obtainMessage(3, i, j));
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iload_1         
		//    3    3:iload_2         
		//    4    4:invokestatic    #80  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
		//    5    7:invokespecial   #75  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		public void updateItemCount(int i, int j)
		{
			sendMessage(SyncQueueItem.obtainMessage(1, i, j));
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:iload_2         
		//    4    4:invokestatic    #80  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
		//    5    7:invokespecial   #75  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
		//    6   10:return          
		}

		static final int ADD_TILE = 2;
		static final int REMOVE_TILE = 3;
		static final int UPDATE_ITEM_COUNT = 1;
		private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
		private Runnable mMainThreadRunnable;
		final MessageQueue mQueue = new MessageQueue();
		final MessageThreadUtil this$0;
		final ThreadUtil.MainThreadCallback val$callback;

		_cls1()
		{
			this$0 = MessageThreadUtil.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field MessageThreadUtil this$0>
			callback = mainthreadcallback;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #29  <Field ThreadUtil$MainThreadCallback val$callback>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #32  <Method void Object()>
		//    8   14:aload_0         
		//    9   15:new             #34  <Class MessageThreadUtil$MessageQueue>
		//   10   18:dup             
		//   11   19:invokespecial   #35  <Method void MessageThreadUtil$MessageQueue()>
		//   12   22:putfield        #37  <Field MessageThreadUtil$MessageQueue mQueue>
		//   13   25:aload_0         
		//   14   26:new             #39  <Class Handler>
		//   15   29:dup             
		//   16   30:invokestatic    #45  <Method Looper Looper.getMainLooper()>
		//   17   33:invokespecial   #48  <Method void Handler(Looper)>
		//   18   36:putfield        #50  <Field Handler mMainThreadHandler>
			class _cls1
				implements Runnable
			{

				public void run()
				{
					for(SyncQueueItem syncqueueitem = mQueue.next(); syncqueueitem != null; syncqueueitem = mQueue.next())
				//*   0    0:aload_0         
				//*   1    1:getfield        #12  <Field MessageThreadUtil$1 this$1>
				//*   2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
				//*   3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
				//*   4   10:astore_1        
				//*   5   11:aload_1         
				//*   6   12:ifnull          164
						switch(syncqueueitem.what)
				//*   7   15:aload_1         
				//*   8   16:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
						{
				//*   9   19:tableswitch     1 3: default 44
				//				               1 130
				//				               2 104
				//				               3 81
						default:
							StringBuilder stringbuilder = new StringBuilder();
				//   10   44:new             #37  <Class StringBuilder>
				//   11   47:dup             
				//   12   48:invokespecial   #38  <Method void StringBuilder()>
				//   13   51:astore_2        
							stringbuilder.append("Unsupported message, what=");
				//   14   52:aload_2         
				//   15   53:ldc1            #40  <String "Unsupported message, what=">
				//   16   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//   17   58:pop             
							stringbuilder.append(syncqueueitem.what);
				//   18   59:aload_2         
				//   19   60:aload_1         
				//   20   61:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
				//   21   64:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
				//   22   67:pop             
							Log.e("ThreadUtil", stringbuilder.toString());
				//   23   68:ldc1            #49  <String "ThreadUtil">
				//   24   70:aload_2         
				//   25   71:invokevirtual   #53  <Method String StringBuilder.toString()>
				//   26   74:invokestatic    #59  <Method int Log.e(String, String)>
				//   27   77:pop             
							break;

				//*  28   78:goto            150
						case 3: // '\003'
							callback.removeTile(syncqueueitem.arg1, syncqueueitem.arg2);
				//   29   81:aload_0         
				//   30   82:getfield        #12  <Field MessageThreadUtil$1 this$1>
				//   31   85:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
				//   32   88:aload_1         
				//   33   89:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   34   92:aload_1         
				//   35   93:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
				//   36   96:invokeinterface #75  <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
							break;

				//*  37  101:goto            150
						case 2: // '\002'
							callback.addTile(syncqueueitem.arg1, (TileList.Tile)syncqueueitem.data);
				//   38  104:aload_0         
				//   39  105:getfield        #12  <Field MessageThreadUtil$1 this$1>
				//   40  108:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
				//   41  111:aload_1         
				//   42  112:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   43  115:aload_1         
				//   44  116:getfield        #79  <Field Object MessageThreadUtil$SyncQueueItem.data>
				//   45  119:checkcast       #81  <Class TileList$Tile>
				//   46  122:invokeinterface #85  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
							break;

				//*  47  127:goto            150
						case 1: // '\001'
							callback.updateItemCount(syncqueueitem.arg1, syncqueueitem.arg2);
				//   48  130:aload_0         
				//   49  131:getfield        #12  <Field MessageThreadUtil$1 this$1>
				//   50  134:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
				//   51  137:aload_1         
				//   52  138:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
				//   53  141:aload_1         
				//   54  142:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
				//   55  145:invokeinterface #88  <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
							break;
						}

				//   56  150:aload_0         
				//   57  151:getfield        #12  <Field MessageThreadUtil$1 this$1>
				//   58  154:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
				//   59  157:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
				//   60  160:astore_1        
				//*  61  161:goto            11
				//   62  164:return          
				}

				final _cls1 this$1;

				_cls1()
				{
					this$1 = _cls1.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field MessageThreadUtil$1 this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}
			}

			mMainThreadRunnable = ((Runnable) (new _cls1()));
		//   19   39:aload_0         
		//   20   40:new             #52  <Class MessageThreadUtil$1$1>
		//   21   43:dup             
		//   22   44:aload_0         
		//   23   45:invokespecial   #55  <Method void MessageThreadUtil$1$1(MessageThreadUtil$1)>
		//   24   48:putfield        #57  <Field Runnable mMainThreadRunnable>
		//   25   51:return          
		}
	}

}
