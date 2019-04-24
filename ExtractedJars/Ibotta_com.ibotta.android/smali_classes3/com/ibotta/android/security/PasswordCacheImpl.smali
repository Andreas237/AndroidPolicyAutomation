.class public Lcom/ibotta/android/security/PasswordCacheImpl;
.super Ljava/lang/Object;
.source "PasswordCacheImpl.java"

# interfaces
.implements Lcom/ibotta/android/security/PasswordCache;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final CACHE_TIMEOUT:J


# instance fields
.field private confirmed:Z

.field private executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final factory:Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private password:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/security/PasswordCacheImpl;->CACHE_TIMEOUT:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/security/PasswordCacheExecutorFactory;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->factory:Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    return-void
.end method

.method private clearPassword()V
    .locals 3

    const-string v0, "Clearing password cache."

    const/4 v1, 0x0

    .line 90
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 93
    :try_start_0
    iput-boolean v1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->confirmed:Z

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->password:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public static synthetic lambda$put$0(Lcom/ibotta/android/security/PasswordCacheImpl;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/security/PasswordCacheImpl;->clearPassword()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 86
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/security/PasswordCacheImpl;->clearPassword()V

    return-void
.end method

.method public confirm()V
    .locals 2

    const-string v0, "Password confirmed."

    const/4 v1, 0x0

    .line 54
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x1

    .line 58
    :try_start_0
    iput-boolean v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->confirmed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public get()Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 70
    :try_start_0
    iget-boolean v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->confirmed:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->password:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->password:Ljava/lang/String;

    const-string v1, "Password cache HIT!"

    const/4 v2, 0x0

    .line 72
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 75
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public put(Ljava/lang/String;)V
    .locals 4

    const-string v0, "Caching password."

    const/4 v1, 0x0

    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 43
    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->password:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 48
    iget-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->factory:Lcom/ibotta/android/security/PasswordCacheExecutorFactory;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/security/PasswordCacheExecutorFactory;->newScheduledThreadPoolExecutor(I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->executor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Lcom/ibotta/android/security/-$$Lambda$PasswordCacheImpl$mKt7lY1c2TkMbm1qUpQz89uSw10;

    invoke-direct {v0, p0}, Lcom/ibotta/android/security/-$$Lambda$PasswordCacheImpl$mKt7lY1c2TkMbm1qUpQz89uSw10;-><init>(Lcom/ibotta/android/security/PasswordCacheImpl;)V

    sget-wide v1, Lcom/ibotta/android/security/PasswordCacheImpl;->CACHE_TIMEOUT:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    :catchall_0
    move-exception p1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/security/PasswordCacheImpl;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
