.class public Lcom/ibotta/android/service/api/Consumer;
.super Ljava/lang/Object;
.source "Consumer.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/service/api/Consumer$ConsumerListener;
    }
.end annotation


# instance fields
.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final consumeCondition:Ljava/util/concurrent/locks/Condition;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private final jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final listener:Lcom/ibotta/android/service/api/Consumer$ConsumerListener;

.field private final logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

.field private final prodConLock:Ljava/util/concurrent/locks/Lock;

.field private final serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

.field private stop:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;Lcom/ibotta/android/service/api/Consumer$ConsumerListener;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/service/api/Consumer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    .line 54
    iput-object p3, p0, Lcom/ibotta/android/service/api/Consumer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 55
    iput-object p5, p0, Lcom/ibotta/android/service/api/Consumer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 56
    iput-object p4, p0, Lcom/ibotta/android/service/api/Consumer;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 57
    iput-object p6, p0, Lcom/ibotta/android/service/api/Consumer;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 58
    iput-object p7, p0, Lcom/ibotta/android/service/api/Consumer;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    .line 59
    iput-object p8, p0, Lcom/ibotta/android/service/api/Consumer;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    .line 60
    iput-object p9, p0, Lcom/ibotta/android/service/api/Consumer;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    .line 61
    iput-object p10, p0, Lcom/ibotta/android/service/api/Consumer;->listener:Lcom/ibotta/android/service/api/Consumer$ConsumerListener;

    return-void
.end method


# virtual methods
.method public consume()Z
    .locals 11

    const-string v0, "consume"

    const/4 v1, 0x0

    .line 65
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 70
    :cond_0
    :goto_0
    iget-boolean v3, p0, Lcom/ibotta/android/service/api/Consumer;->stop:Z

    if-eqz v3, :cond_1

    const-string v3, "Stopping consumer thread."

    .line 71
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    const-string v3, "Consumer is awaiting work..."

    .line 77
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v3, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 80
    :try_start_0
    iget-object v3, p0, Lcom/ibotta/android/service/api/Consumer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v3, :cond_2

    .line 82
    :try_start_1
    iget-object v4, p0, Lcom/ibotta/android/service/api/Consumer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    const-wide/16 v5, 0x5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v4, v5, v6, v7}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 83
    iget-object v4, p0, Lcom/ibotta/android/service/api/Consumer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    goto :goto_2

    .line 88
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_1
    move-exception v4

    const/4 v3, 0x0

    :goto_2
    :try_start_2
    const-string v5, "Interrupted waiting for jobs to consume."

    .line 86
    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v4, v5, v6}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 91
    :goto_3
    iget-boolean v4, p0, Lcom/ibotta/android/service/api/Consumer;->stop:Z

    if-eqz v4, :cond_3

    const-string v3, "Stopping consumer thread."

    .line 92
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    if-gtz v3, :cond_4

    const-string v3, "Current job count is 0"

    .line 97
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_4
    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 103
    :try_start_3
    iget-object v6, p0, Lcom/ibotta/android/service/api/Consumer;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    invoke-virtual {v6}, Lcom/ibotta/android/service/api/ExecServiceManager;->take()Ljava/util/concurrent/Future;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lcom/ibotta/android/service/api/ExecServiceException; {:try_start_3 .. :try_end_3} :catch_3

    if-eqz v6, :cond_5

    .line 106
    :try_start_4
    iget-object v7, p0, Lcom/ibotta/android/service/api/Consumer;->jobCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    move v3, v0

    const/4 v0, 0x1

    goto :goto_5

    .line 109
    :cond_5
    iget-object v7, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v7}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/ibotta/android/service/api/ExecServiceException; {:try_start_4 .. :try_end_4} :catch_3

    .line 111
    :try_start_5
    iget-object v7, p0, Lcom/ibotta/android/service/api/Consumer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    const-wide/16 v8, 0x1

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v7, v8, v9, v10}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 113
    :try_start_6
    iget-object v7, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v7}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_5

    :catchall_1
    move-exception v7

    iget-object v8, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v8}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v7
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lcom/ibotta/android/service/api/ExecServiceException; {:try_start_6 .. :try_end_6} :catch_3

    :catch_2
    move-exception v7

    goto :goto_4

    :catch_3
    move-exception v3

    const-string v4, "Exec service unavailable. Stopping consumer loop."

    .line 119
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    :catch_4
    move-exception v7

    move-object v6, v4

    :goto_4
    const-string v8, "Interrupted while taking job."

    .line 117
    new-array v9, v1, [Ljava/lang/Object;

    invoke-static {v7, v8, v9}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_5
    if-nez v6, :cond_6

    const-string v3, "No ApiJob future available yet."

    .line 124
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 130
    :cond_6
    :try_start_7
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/service/api/job/ApiJob;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    move-object v4, v6

    goto :goto_6

    :catch_5
    move-exception v6

    const-string v7, "Interrupted while getting job from future."

    .line 132
    new-array v8, v1, [Ljava/lang/Object;

    invoke-static {v6, v7, v8}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_6
    const-string v6, "Consumed (remaining=%1$d): apiJob=%2$s"

    const/4 v7, 0x2

    .line 134
    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v7, v1

    aput-object v4, v7, v5

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v4, :cond_0

    .line 137
    iget-object v3, p0, Lcom/ibotta/android/service/api/Consumer;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v3}, Lcom/ibotta/android/profile/BuildProfile;->isDebugLoadingAllowed()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 138
    invoke-static {v4}, Lcom/ibotta/android/service/api/DebugLoadingUtil;->removeApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 141
    :cond_7
    invoke-interface {v4}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v3

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->OFFER_EXPIRED:Lcom/ibotta/android/service/api/Outcome;

    if-ne v3, v6, :cond_8

    .line 143
    iget-object v2, p0, Lcom/ibotta/android/service/api/Consumer;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/GlobalEventManager;->onOfferExpired()V

    const/4 v2, 0x1

    goto :goto_7

    .line 144
    :cond_8
    invoke-interface {v4}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v3

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->AUTH_LOST:Lcom/ibotta/android/service/api/Outcome;

    if-ne v3, v6, :cond_9

    .line 146
    iget-object v2, p0, Lcom/ibotta/android/service/api/Consumer;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    invoke-interface {v2, v5}, Lcom/ibotta/android/state/user/LogOutManager;->logOut(Z)V

    const/4 v2, 0x1

    goto :goto_7

    .line 147
    :cond_9
    invoke-interface {v4}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v3

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->DEPRECATED:Lcom/ibotta/android/service/api/Outcome;

    if-ne v3, v6, :cond_a

    .line 149
    iget-object v2, p0, Lcom/ibotta/android/service/api/Consumer;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    invoke-interface {v2, v5}, Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;->setServerRequiresAppUpgrade(Z)V

    .line 150
    iget-object v2, p0, Lcom/ibotta/android/service/api/Consumer;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/GlobalEventManager;->onAppVersionDeprecated()V

    const/4 v2, 0x1

    goto :goto_7

    .line 151
    :cond_a
    invoke-interface {v4}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/service/api/Outcome;->MAINTENANCE_MODE:Lcom/ibotta/android/service/api/Outcome;

    if-ne v3, v4, :cond_b

    .line 153
    iget-object v2, p0, Lcom/ibotta/android/service/api/Consumer;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/GlobalEventManager;->onMaintenanceMode()V

    const/4 v2, 0x1

    :cond_b
    :goto_7
    if-eqz v2, :cond_0

    .line 162
    :goto_8
    iget-object v3, p0, Lcom/ibotta/android/service/api/Consumer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v3}, Lcom/ibotta/android/service/api/AsyncGroupManager;->cleanUp()V

    if-eqz v2, :cond_d

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/Consumer;->stop()V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/service/api/Consumer;->listener:Lcom/ibotta/android/service/api/Consumer$ConsumerListener;

    if-eqz v0, :cond_c

    .line 167
    invoke-interface {v0}, Lcom/ibotta/android/service/api/Consumer$ConsumerListener;->onCriticalFailure()V

    :cond_c
    const/4 v0, 0x0

    :cond_d
    return v0

    .line 88
    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public isStopped()Z
    .locals 1

    .line 187
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/Consumer;->stop:Z

    return v0
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    const-string v0, "onApiJobFinished: %1$s"

    const/4 v1, 0x1

    .line 196
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-interface {p1, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/service/api/Consumer;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/api/AsyncGroupManager;->consumed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 2

    const-string v0, "Consumer stop()"

    const/4 v1, 0x0

    .line 176
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/Consumer;->stop:Z

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/service/api/Consumer;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/Consumer;->prodConLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
