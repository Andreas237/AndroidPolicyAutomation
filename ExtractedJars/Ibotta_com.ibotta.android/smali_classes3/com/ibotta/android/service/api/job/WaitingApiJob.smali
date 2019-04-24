.class public Lcom/ibotta/android/service/api/job/WaitingApiJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "WaitingApiJob.java"


# static fields
.field private static final UNIQUE_ID:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private cancelled:Z

.field private signaled:Z

.field private uniqueId:J

.field private final waitCondition:Ljava/util/concurrent/locks/Condition;

.field private final waitLock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->UNIQUE_ID:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 25
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->initUniqueId()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    .line 25
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->initUniqueId()V

    return-void
.end method

.method private initUniqueId()V
    .locals 2

    .line 42
    sget-object v0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->UNIQUE_ID:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->uniqueId:J

    return-void
.end method


# virtual methods
.method public call()Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 63
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signaled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :try_start_1
    const-string v1, "Waiting for signal..."

    .line 65
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    const-wide/16 v2, 0x5

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "Failed to wait for signal to execute api call."

    .line 68
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    new-instance v0, Lcom/ibotta/api/ApiException;

    const-string v2, "Failed to wait for signal to execute ApiCall"

    invoke-direct {v0, v2, v1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 73
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->cancelled:Z

    if-nez v0, :cond_1

    .line 74
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->call()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    goto :goto_1

    .line 76
    :cond_1
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->notifyJobFinished()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x0

    .line 79
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->call()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copyOutcome(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method public copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 87
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->copyOutcome(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 88
    instance-of v0, p1, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    if-eqz v0, :cond_0

    .line 89
    check-cast p1, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->cancelled:Z

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 112
    :cond_1
    instance-of v1, p1, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    if-nez v1, :cond_2

    return v0

    .line 116
    :cond_2
    check-cast p1, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    .line 117
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    .line 118
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->appendSuper(Z)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->uniqueId:J

    iget-wide v3, p1, Lcom/ibotta/android/service/api/job/WaitingApiJob;->uniqueId:J

    .line 119
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(JJ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    .line 125
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x6c65

    const v2, 0x15af1

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    .line 126
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->appendSuper(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->uniqueId:J

    .line 127
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(J)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    .line 95
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->reset()V

    .line 96
    iget-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signaled:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 97
    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    :cond_0
    const/4 v0, 0x0

    .line 100
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signaled:Z

    .line 101
    iput-boolean v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->cancelled:Z

    return-void
.end method

.method public signal(Z)V
    .locals 5

    const-string v0, "SIGNAL !!! - cancel=%1$b"

    const/4 v1, 0x1

    .line 46
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iput-boolean v1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signaled:Z

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 50
    :try_start_0
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->cancelled:Z

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    iget-object p1, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/WaitingApiJob;->waitLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
