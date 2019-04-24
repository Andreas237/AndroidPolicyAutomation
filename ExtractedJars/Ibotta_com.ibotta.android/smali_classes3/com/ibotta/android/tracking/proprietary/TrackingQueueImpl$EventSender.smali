.class Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;
.super Ljava/lang/Object;
.source "TrackingQueueImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EventSender"
.end annotation


# instance fields
.field private stop:Z

.field final synthetic this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$1;)V
    .locals 0

    .line 154
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;-><init>(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V

    return-void
.end method

.method private closeDatabase(Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;)V
    .locals 2

    const-string v0, "closeDatabase"

    const/4 v1, 0x0

    .line 222
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return-void

    .line 228
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->release()V

    return-void
.end method

.method private openDatabase()Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;
    .locals 6

    const-string v0, "openDatabase"

    const/4 v1, 0x0

    .line 208
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    .line 213
    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$700(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v2}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$800(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v3}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$900(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v4}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$1000(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v5}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$1100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

    move-result-object v5

    .line 212
    invoke-static {v0, v2, v3, v4, v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->open(Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to open tracking database."

    .line 215
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private sendEvents(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)V"
        }
    .end annotation

    .line 187
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string v0, "Sending %1$d tracking events."

    const/4 v2, 0x1

    .line 188
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 192
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->openDatabase()Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;

    move-result-object v0

    .line 193
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 194
    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;->track(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 197
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->closeDatabase(Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;)V

    .line 200
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$500(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 197
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->closeDatabase(Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;)V

    throw p1

    :cond_1
    const-string p1, "No tracking events found to send."

    .line 202
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$600(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 164
    :goto_0
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->stop:Z

    if-eqz v0, :cond_0

    return-void

    .line 168
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 170
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 172
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$300(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v2}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$200(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$400(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$400(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Interrupted while awaiting events to send."

    const/4 v3, 0x0

    .line 177
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 182
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->sendEvents(Ljava/util/List;)V

    goto :goto_0

    .line 179
    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->this$0:Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;

    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;->access$100(Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/TrackingQueueImpl$EventSender;->stop:Z

    return-void
.end method
