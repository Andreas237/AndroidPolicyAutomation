.class abstract Lcom/google/common/util/concurrent/AggregateFutureState;
.super Ljava/lang/Object;
.source "AggregateFutureState.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
    emulated = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/util/concurrent/AggregateFutureState$SynchronizedAtomicHelper;,
        Lcom/google/common/util/concurrent/AggregateFutureState$SafeAtomicHelper;,
        Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;
    }
.end annotation


# static fields
.field private static final ATOMIC_HELPER:Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;

.field private static final log:Ljava/util/logging/Logger;


# instance fields
.field private volatile remaining:I

.field private volatile seenExceptions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 46
    const-class v0, Lcom/google/common/util/concurrent/AggregateFutureState;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/common/util/concurrent/AggregateFutureState;->log:Ljava/util/logging/Logger;

    .line 51
    :try_start_0
    new-instance v0, Lcom/google/common/util/concurrent/AggregateFutureState$SafeAtomicHelper;

    const-class v1, Lcom/google/common/util/concurrent/AggregateFutureState;

    const-class v2, Ljava/util/Set;

    const-string v3, "seenExceptions"

    .line 53
    invoke-static {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    const-class v2, Lcom/google/common/util/concurrent/AggregateFutureState;

    const-string v3, "remaining"

    .line 54
    invoke-static {v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/common/util/concurrent/AggregateFutureState$SafeAtomicHelper;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 60
    sget-object v1, Lcom/google/common/util/concurrent/AggregateFutureState;->log:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "SafeAtomicHelper is broken!"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    new-instance v0, Lcom/google/common/util/concurrent/AggregateFutureState$SynchronizedAtomicHelper;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/common/util/concurrent/AggregateFutureState$SynchronizedAtomicHelper;-><init>(Lcom/google/common/util/concurrent/AggregateFutureState$1;)V

    .line 63
    :goto_0
    sput-object v0, Lcom/google/common/util/concurrent/AggregateFutureState;->ATOMIC_HELPER:Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;

    return-void
.end method

.method constructor <init>(I)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->seenExceptions:Ljava/util/Set;

    .line 67
    iput p1, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->remaining:I

    return-void
.end method

.method static synthetic access$200(Lcom/google/common/util/concurrent/AggregateFutureState;)Ljava/util/Set;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->seenExceptions:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$202(Lcom/google/common/util/concurrent/AggregateFutureState;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->seenExceptions:Ljava/util/Set;

    return-object p1
.end method

.method static synthetic access$300(Lcom/google/common/util/concurrent/AggregateFutureState;)I
    .locals 0

    .line 37
    iget p0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->remaining:I

    return p0
.end method

.method static synthetic access$310(Lcom/google/common/util/concurrent/AggregateFutureState;)I
    .locals 2

    .line 37
    iget v0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->remaining:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->remaining:I

    return v0
.end method


# virtual methods
.method abstract addInitialException(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation
.end method

.method final decrementRemainingAndGet()I
    .locals 1

    .line 113
    sget-object v0, Lcom/google/common/util/concurrent/AggregateFutureState;->ATOMIC_HELPER:Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;

    invoke-virtual {v0, p0}, Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;->decrementAndGetRemainingCount(Lcom/google/common/util/concurrent/AggregateFutureState;)I

    move-result v0

    return v0
.end method

.method final getOrInitSeenExceptions()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->seenExceptions:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 89
    invoke-static {}, Lcom/google/common/collect/Sets;->newConcurrentHashSet()Ljava/util/Set;

    move-result-object v0

    .line 95
    invoke-virtual {p0, v0}, Lcom/google/common/util/concurrent/AggregateFutureState;->addInitialException(Ljava/util/Set;)V

    .line 97
    sget-object v1, Lcom/google/common/util/concurrent/AggregateFutureState;->ATOMIC_HELPER:Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v0}, Lcom/google/common/util/concurrent/AggregateFutureState$AtomicHelper;->compareAndSetSeenExceptions(Lcom/google/common/util/concurrent/AggregateFutureState;Ljava/util/Set;Ljava/util/Set;)V

    .line 104
    iget-object v0, p0, Lcom/google/common/util/concurrent/AggregateFutureState;->seenExceptions:Ljava/util/Set;

    :cond_0
    return-object v0
.end method
