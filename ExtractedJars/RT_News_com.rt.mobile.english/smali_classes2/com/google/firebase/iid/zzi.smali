.class final Lcom/google/firebase/iid/zzi;
.super Ljava/lang/Object;


# static fields
.field private static final zzab:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/firebase/iid/zzj;->zzac:Ljava/util/concurrent/Executor;

    sput-object v0, Lcom/google/firebase/iid/zzi;->zzab:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static final synthetic zza(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method static zzd()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/google/firebase/iid/zzi;->zzab:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method static zze()Ljava/util/concurrent/Executor;
    .locals 8

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x1e

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    return-object v7
.end method
