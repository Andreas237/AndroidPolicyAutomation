.class Lcom/sina/weibo/sdk/statistic/WBAgentHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static MAX_CACHE_SIZE:I

.field private static mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<Lcom/sina/weibo/sdk/statistic/PageLog;>;"
        }
    .end annotation
.end field

.field private static mInstance:Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

.field private static mLogTimer:Ljava/util/Timer;

.field private static mPages:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/sina/weibo/sdk/statistic/PageLog;>;"
        }
    .end annotation
.end field

.field private static mTimer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x5

    sput v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->MAX_CACHE_SIZE:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    .line 51
    const-string v0, "WBAgent"

    const-string v1, "init handler"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    return-void
.end method

.method static synthetic access$000(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;)Ljava/lang/String;
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getLogsInMemory()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private checkAppStatus(Landroid/content/Context;)V
    .locals 3

    .line 236
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->isBackground(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    sget-object v1, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v1

    .line 238
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V

    .line 239
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 242
    :cond_0
    :goto_0
    return-void
.end method

.method private checkNewSession(Landroid/content/Context;J)V
    .locals 8

    .line 285
    invoke-static {p1, p2, p3}, Lcom/sina/weibo/sdk/statistic/PageLog;->isNewSession(Landroid/content/Context;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    new-instance v4, Lcom/sina/weibo/sdk/statistic/PageLog;

    invoke-direct {v4, p1}, Lcom/sina/weibo/sdk/statistic/PageLog;-><init>(Landroid/content/Context;)V

    .line 287
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->SESSION_END:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v4, v0}, Lcom/sina/weibo/sdk/statistic/PageLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 289
    new-instance v5, Lcom/sina/weibo/sdk/statistic/PageLog;

    invoke-direct {v5, p1, p2, p3}, Lcom/sina/weibo/sdk/statistic/PageLog;-><init>(Landroid/content/Context;J)V

    .line 290
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->SESSION_START:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/statistic/PageLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 291
    sget-object v6, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v6

    .line 292
    :try_start_0
    invoke-virtual {v4}, Lcom/sina/weibo/sdk/statistic/PageLog;->getEndTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 293
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 295
    :cond_0
    const-string v0, "WBAgent"

    const-string v1, "is a new install"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    :goto_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 298
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 299
    :goto_1
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "last session--- starttime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 300
    invoke-virtual {v4}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,endtime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 301
    invoke-virtual {v4}, Lcom/sina/weibo/sdk/statistic/PageLog;->getEndTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 299
    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "is a new session--- starttime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 303
    invoke-virtual {v5}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 302
    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_2

    .line 305
    :cond_1
    const-string v0, "WBAgent"

    const-string v1, "is not a new session"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    :goto_2
    return-void
.end method

.method private closeTimer()V
    .locals 1

    .line 371
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 372
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 373
    const/4 v0, 0x0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mTimer:Ljava/util/Timer;

    .line 375
    :cond_0
    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;
    .locals 3

    const-class v1, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    monitor-enter v1

    .line 39
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mInstance:Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mInstance:Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    .line 42
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mInstance:Lcom/sina/weibo/sdk/statistic/WBAgentHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private declared-synchronized getLogsInMemory()Ljava/lang/String;
    .locals 4

    monitor-enter p0

    .line 332
    const-string v1, ""

    .line 333
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 334
    sget-object v2, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 335
    :try_start_1
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogBuilder;->getPageLogs(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/String;

    move-result-object v1

    .line 336
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 337
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 339
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private isBackground(Landroid/content/Context;)Z
    .locals 7

    .line 246
    const-string v0, "activity"

    .line 247
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/ActivityManager;

    .line 248
    .line 249
    invoke-virtual {v3}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v4

    .line 250
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 251
    iget-object v0, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    iget v0, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x190

    if-ne v0, v1, :cond_0

    .line 253
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u540e\u53f0:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x1

    return v0

    .line 256
    :cond_0
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u524d\u53f0:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const/4 v0, 0x0

    return v0

    .line 260
    :cond_1
    goto :goto_0

    .line 261
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isFirstStartBoolean(Landroid/content/Context;)Z
    .locals 5

    .line 427
    const-string v0, "third_app_is_first_tag"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 428
    const-string v0, "third_app_is_first_key"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 429
    if-eqz v3, :cond_0

    .line 430
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 431
    const-string v0, "third_app_is_first_key"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 432
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 434
    :cond_0
    return v3
.end method

.method private declared-synchronized saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/concurrent/CopyOnWriteArrayList<Lcom/sina/weibo/sdk/statistic/PageLog;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 315
    :try_start_0
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogBuilder;->getPageLogs(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/lang/String;

    move-result-object v1

    .line 316
    new-instance v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$2;

    invoke-direct {v0, p0, v1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$2;-><init>(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 324
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private timerTask(Landroid/content/Context;JJ)Ljava/util/Timer;
    .locals 8

    .line 349
    new-instance v6, Ljava/util/Timer;

    invoke-direct {v6}, Ljava/util/Timer;-><init>()V

    .line 350
    new-instance v7, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$3;

    invoke-direct {v7, p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$3;-><init>(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;Landroid/content/Context;)V

    .line 357
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    .line 359
    invoke-virtual {v6, v7, p2, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_0

    .line 362
    :cond_0
    move-object v0, v6

    move-object v1, v7

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 364
    :goto_0
    return-object v6
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 183
    new-instance v3, Lcom/sina/weibo/sdk/statistic/EventLog;

    invoke-direct {v3, p1, p2, p3}, Lcom/sina/weibo/sdk/statistic/EventLog;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 184
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->EVENT:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/statistic/EventLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 185
    sget-object v4, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v4

    .line 186
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 188
    :goto_0
    if-nez p3, :cond_0

    .line 189
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "event--- page:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,event name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 192
    :cond_0
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "event--- page:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,event name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ,extend:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 194
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 192
    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :goto_1
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    sget v1, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->MAX_CACHE_SIZE:I

    if-lt v0, v1, :cond_1

    .line 198
    sget-object v4, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v4

    .line 199
    :try_start_1
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V

    .line 200
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 201
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 203
    :cond_1
    :goto_2
    return-void
.end method

.method public onKillProcess()V
    .locals 4

    .line 268
    const-string v0, "WBAgent"

    const-string v1, "save applogs and close timer and shutdown thread executor"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    sget-object v2, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v2

    .line 271
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 273
    :goto_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mInstance:Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    .line 274
    invoke-direct {p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->closeTimer()V

    .line 275
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->shutDownExecutor()V

    .line 276
    return-void
.end method

.method public onPageEnd(Ljava/lang/String;)V
    .locals 11

    .line 80
    sget-boolean v0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->ACTIVITY_DURATION_OPEN:Z

    if-nez v0, :cond_1

    .line 81
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/sina/weibo/sdk/statistic/PageLog;

    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 84
    invoke-virtual {v6}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 83
    invoke-virtual {v6, v0, v1}, Lcom/sina/weibo/sdk/statistic/PageLog;->setDuration(J)V

    .line 85
    sget-object v7, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v7

    .line 86
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 88
    :goto_0
    sget-object v7, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    monitor-enter v7

    .line 89
    :try_start_1
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    monitor-exit v7

    goto :goto_1

    :catchall_1
    move-exception v9

    monitor-exit v7

    throw v9

    .line 91
    :goto_1
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 92
    invoke-virtual {v6}, Lcom/sina/weibo/sdk/statistic/PageLog;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    const-string v0, "WBAgent"

    const-string v1, "please call onPageStart before onPageEnd"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_2
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    sget v1, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->MAX_CACHE_SIZE:I

    if-lt v0, v1, :cond_1

    .line 99
    sget-object v6, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v6

    .line 100
    :try_start_2
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V

    .line 101
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 102
    monitor-exit v6

    goto :goto_3

    :catchall_2
    move-exception v10

    monitor-exit v6

    throw v10

    .line 105
    :cond_1
    :goto_3
    return-void
.end method

.method public onPageStart(Ljava/lang/String;)V
    .locals 9

    .line 61
    sget-boolean v0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->ACTIVITY_DURATION_OPEN:Z

    if-nez v0, :cond_0

    .line 62
    new-instance v6, Lcom/sina/weibo/sdk/statistic/PageLog;

    invoke-direct {v6, p1}, Lcom/sina/weibo/sdk/statistic/PageLog;-><init>(Ljava/lang/String;)V

    .line 63
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->FRAGMENT:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v6, v0}, Lcom/sina/weibo/sdk/statistic/PageLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 64
    sget-object v7, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    monitor-enter v7

    .line 65
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 67
    :goto_0
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :cond_0
    return-void
.end method

.method public onPause(Landroid/content/Context;)V
    .locals 14

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    .line 145
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update last page endtime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    div-long v2, v6, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lcom/sina/weibo/sdk/statistic/PageLog;->updateSession(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 148
    sget-boolean v0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->ACTIVITY_DURATION_OPEN:Z

    if-eqz v0, :cond_1

    .line 149
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/sina/weibo/sdk/statistic/PageLog;

    .line 151
    invoke-virtual {v9}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v0

    sub-long v0, v6, v0

    invoke-virtual {v9, v0, v1}, Lcom/sina/weibo/sdk/statistic/PageLog;->setDuration(J)V

    .line 152
    sget-object v10, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v10

    .line 153
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    throw v11

    .line 155
    :goto_0
    sget-object v10, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    monitor-enter v10

    .line 156
    :try_start_1
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    monitor-exit v10

    goto :goto_1

    :catchall_1
    move-exception v12

    monitor-exit v10

    throw v12

    .line 158
    :goto_1
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lcom/sina/weibo/sdk/statistic/PageLog;->getStartTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 159
    invoke-virtual {v9}, Lcom/sina/weibo/sdk/statistic/PageLog;->getDuration()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 158
    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    goto :goto_2

    .line 161
    :cond_0
    const-string v0, "WBAgent"

    const-string v1, "please call onResume before onPause"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    :goto_2
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    sget v1, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->MAX_CACHE_SIZE:I

    if-lt v0, v1, :cond_1

    .line 165
    sget-object v9, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    monitor-enter v9

    .line 166
    :try_start_2
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->saveActivePages(Ljava/util/concurrent/CopyOnWriteArrayList;)V

    .line 167
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 168
    monitor-exit v9

    goto :goto_3

    :catchall_2
    move-exception v13

    monitor-exit v9

    throw v13

    .line 171
    :cond_1
    :goto_3
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->checkAppStatus(Landroid/content/Context;)V

    .line 172
    return-void
.end method

.method public onResume(Landroid/content/Context;)V
    .locals 12

    .line 113
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/LogReport;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 114
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogReport;->setPackageName(Ljava/lang/String;)V

    .line 116
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mTimer:Ljava/util/Timer;

    if-nez v0, :cond_1

    .line 117
    move-object v0, p0

    move-object v1, p1

    invoke-static {}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->getUploadInterval()J

    move-result-wide v4

    const-wide/16 v2, 0x1f4

    invoke-direct/range {v0 .. v5}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->timerTask(Landroid/content/Context;JJ)Ljava/util/Timer;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mTimer:Ljava/util/Timer;

    .line 119
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    .line 122
    invoke-direct {p0, p1, v6, v7}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->checkNewSession(Landroid/content/Context;J)V

    .line 125
    sget-boolean v0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->ACTIVITY_DURATION_OPEN:Z

    if-eqz v0, :cond_2

    .line 126
    new-instance v9, Lcom/sina/weibo/sdk/statistic/PageLog;

    invoke-direct {v9, v8, v6, v7}, Lcom/sina/weibo/sdk/statistic/PageLog;-><init>(Ljava/lang/String;J)V

    .line 127
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->ACTIVITY:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v9, v0}, Lcom/sina/weibo/sdk/statistic/PageLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 128
    sget-object v10, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    monitor-enter v10

    .line 129
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mPages:Ljava/util/Map;

    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    throw v11

    .line 132
    :cond_2
    :goto_0
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    div-long v2, v6, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    return-void
.end method

.method public onStop(Landroid/content/Context;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->checkAppStatus(Landroid/content/Context;)V

    .line 233
    return-void
.end method

.method public registerApptoAd(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 384
    :try_start_0
    new-instance v3, Lcom/sina/weibo/sdk/statistic/AdEventLog;

    invoke-direct {v3}, Lcom/sina/weibo/sdk/statistic/AdEventLog;-><init>()V

    .line 385
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogType;->APP_AD_START:Lcom/sina/weibo/sdk/statistic/LogType;

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setType(Lcom/sina/weibo/sdk/statistic/LogType;)V

    .line 386
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->isFirstStartBoolean(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    const-string v0, "1"

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setmEvent_id(Ljava/lang/String;)V

    .line 389
    :cond_0
    invoke-static {p1}, Lcom/sina/weibo/sdk/utils/AidTask;->getImei(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setmImei(Ljava/lang/String;)V

    .line 390
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setmStart_time(J)V

    .line 391
    invoke-virtual {v3, p3}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setmExtend(Ljava/util/Map;)V

    .line 394
    invoke-static {p1, p2}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 395
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 396
    new-instance v5, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$4;

    invoke-direct {v5, p0, p1, p2, v3}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$4;-><init>(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;Landroid/content/Context;Ljava/lang/String;Lcom/sina/weibo/sdk/statistic/AdEventLog;)V

    .line 404
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mLogTimer:Ljava/util/Timer;

    .line 405
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mLogTimer:Ljava/util/Timer;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v5, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 406
    goto :goto_0

    .line 407
    :cond_1
    invoke-virtual {v3, v4}, Lcom/sina/weibo/sdk/statistic/AdEventLog;->setmAid(Ljava/lang/String;)V

    .line 408
    invoke-virtual {p0, p1, v3}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->uploadAdlog(Landroid/content/Context;Lcom/sina/weibo/sdk/statistic/AdEventLog;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    :goto_0
    goto :goto_1

    .line 410
    :catch_0
    move-exception v3

    .line 411
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 413
    :goto_1
    return-void
.end method

.method public uploadAdlog(Landroid/content/Context;Lcom/sina/weibo/sdk/statistic/AdEventLog;)V
    .locals 1

    .line 416
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->mActivePages:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    new-instance v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$5;

    invoke-direct {v0, p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$5;-><init>(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->execute(Ljava/lang/Runnable;)V

    .line 423
    return-void
.end method

.method public uploadAppLogs(Landroid/content/Context;)V
    .locals 8

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogReport;->getTime(Landroid/content/Context;)J

    move-result-wide v2

    sub-long v6, v0, v2

    .line 214
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogReport;->getTime(Landroid/content/Context;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const-wide/16 v0, 0x7530

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    .line 215
    move-object v0, p0

    move-object v1, p1

    const-wide/16 v2, 0x7530

    sub-long/2addr v2, v6

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->timerTask(Landroid/content/Context;JJ)Ljava/util/Timer;

    goto :goto_0

    .line 217
    :cond_0
    new-instance v0, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$1;

    invoke-direct {v0, p0, p1}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler$1;-><init>(Lcom/sina/weibo/sdk/statistic/WBAgentHandler;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->execute(Ljava/lang/Runnable;)V

    .line 224
    :goto_0
    return-void
.end method
