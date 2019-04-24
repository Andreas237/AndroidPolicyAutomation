.class public final Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
.super Ljava/lang/Object;
.source "LockFreeMPSCQueue.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;,
        Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeMPSCQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeMPSCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPSCQueueCore\n+ 2 LockFreeMPSCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,241:1\n233#2,3:242\n233#2,3:251\n233#2,3:256\n233#2,3:261\n233#2,3:270\n400#3,4:245\n391#3,2:249\n391#3,2:254\n391#3,2:259\n422#3,4:264\n96#3,2:268\n*E\n*S KotlinDebug\n*F\n+ 1 LockFreeMPSCQueue.kt\nkotlinx/coroutines/internal/LockFreeMPSCQueueCore\n*L\n74#1,3:242\n87#1,3:251\n133#1,3:256\n157#1,3:261\n189#1,3:270\n77#1,4:245\n87#1,2:249\n133#1,2:254\n157#1,2:259\n175#1,4:264\n181#1,2:268\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \"*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\"#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\u0008\u0012\u0004\u0012\u00028\u0000`\u00082\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\u0008\u0012\u0004\u0012\u00028\u0000`\u00082\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u000eJ1\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00082\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0008\u0010\u001c\u001a\u00020\u0016H\u0002J\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000J\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0002J,\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00082\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002R(\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;",
        "E",
        "",
        "capacity",
        "",
        "(I)V",
        "_next",
        "Lkotlinx/atomicfu/AtomicRef;",
        "Lkotlinx/coroutines/internal/Core;",
        "_state",
        "Lkotlinx/atomicfu/AtomicLong;",
        "array",
        "Ljava/util/concurrent/atomic/AtomicReferenceArray;",
        "isEmpty",
        "",
        "()Z",
        "mask",
        "addLast",
        "element",
        "(Ljava/lang/Object;)I",
        "allocateNextCopy",
        "state",
        "",
        "allocateOrGetNextCopy",
        "close",
        "fillPlaceholder",
        "index",
        "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;",
        "markFrozen",
        "next",
        "removeFirstOrNull",
        "removeSlowPath",
        "oldHead",
        "newHead",
        "Companion",
        "Placeholder",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final ADD_CLOSED:I = 0x2

.field public static final ADD_FROZEN:I = 0x1

.field public static final ADD_SUCCESS:I = 0x0

.field private static final CAPACITY_BITS:I = 0x1e

.field private static final CLOSED_MASK:J = 0x2000000000000000L

.field private static final CLOSED_SHIFT:I = 0x3d

.field public static final Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

.field private static final FROZEN_MASK:J = 0x1000000000000000L

.field private static final FROZEN_SHIFT:I = 0x3c

.field private static final HEAD_MASK:J = 0x3fffffffL

.field private static final HEAD_SHIFT:I = 0x0

.field public static final INITIAL_CAPACITY:I = 0x8

.field private static final MAX_CAPACITY_MASK:I = 0x3fffffff

.field public static final REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAIL_MASK:J = 0xfffffffc0000000L

.field private static final TAIL_SHIFT:I = 0x1e

.field private static final _next$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final _state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field private volatile _next:Ljava/lang/Object;

.field private volatile _state:J

.field private final array:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final capacity:I

.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    .line 222
    new-instance v0, Lkotlinx/coroutines/internal/Symbol;

    const-string v1, "REMOVE_FROZEN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/Symbol;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    const-class v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_next"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_next$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-class v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    const-string v1, "_state"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->capacity:I

    .line 63
    iget p1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->capacity:I

    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_next:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 65
    iput-wide v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    .line 66
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 69
    iget p1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v2, 0x3fffffff    # 1.9999999f

    if-gt p1, v2, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_3

    .line 70
    iget p1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->capacity:I

    iget v2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr p1, v2

    if-nez p1, :cond_1

    move v0, v1

    :cond_1
    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final allocateNextCopy(J)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore<",
            "TE;>;"
        }
    .end annotation

    .line 188
    new-instance v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->capacity:I

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;-><init>(I)V

    .line 189
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, p1

    const/4 v3, 0x0

    shr-long/2addr v1, v3

    long-to-int v1, v1

    const-wide v2, 0xfffffffc0000000L

    and-long/2addr v2, p1

    const/16 v4, 0x1e

    shr-long/2addr v2, v4

    long-to-int v2, v2

    .line 191
    :goto_0
    iget v3, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int v4, v1, v3

    and-int v5, v2, v3

    if-eq v4, v5, :cond_1

    .line 193
    iget-object v4, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v5, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v5, v1

    iget-object v6, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    and-int/2addr v3, v1

    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance v3, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;

    invoke-direct {v3, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;-><init>(I)V

    :goto_1
    invoke-virtual {v4, v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 196
    :cond_1
    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const-wide/high16 v2, 0x1000000000000000L

    invoke-static {v1, p1, p2, v2, v3}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;->access$wo(Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;JJ)J

    move-result-wide p1

    iput-wide p1, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    return-object v0
.end method

.method private final allocateOrGetNextCopy(J)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore<",
            "TE;>;"
        }
    .end annotation

    .line 269
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_next:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    if-eqz v0, :cond_0

    return-object v0

    .line 183
    :cond_0
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_next$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->allocateNextCopy(J)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private final fillPlaceholder(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)",
            "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore<",
            "TE;>;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 121
    instance-of v1, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;

    iget v0, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;->index:I

    if-ne v0, p1, :cond_0

    .line 122
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final markFrozen()J
    .locals 8

    .line 265
    :cond_0
    iget-wide v2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/high16 v0, 0x1000000000000000L

    and-long v4, v2, v0

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    return-wide v2

    :cond_1
    or-long v6, v2, v0

    .line 267
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide v6
.end method

.method private final removeSlowPath(II)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore<",
            "TE;>;"
        }
    .end annotation

    .line 260
    :cond_0
    iget-wide v2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    .line 158
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const-wide/32 v0, 0x3fffffff

    and-long/2addr v0, v2

    const/4 v4, 0x0

    shr-long/2addr v0, v4

    long-to-int v6, v0

    if-ne v6, p1, :cond_1

    const/4 v4, 0x1

    :cond_1
    if-eqz v4, :cond_3

    const-wide/high16 v0, 0x1000000000000000L

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    .line 162
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object p1

    return-object p1

    .line 164
    :cond_2
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    invoke-static {v1, v2, v3, p2}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;->access$updateHead(Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;JI)J

    move-result-wide v4

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object p1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget p2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr p2, v6

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v0

    .line 159
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This queue can have only one consumer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method


# virtual methods
.method public final addLast(Ljava/lang/Object;)I
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    :cond_0
    iget-wide v3, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/high16 v0, 0x3000000000000000L    # 1.727233711018889E-77

    and-long/2addr v0, v3

    const-wide/16 v7, 0x0

    cmp-long v0, v0, v7

    if-eqz v0, :cond_1

    .line 88
    sget-object p1, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    invoke-static {p1, v3, v4}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;->access$addFailReason(Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;J)I

    move-result p1

    return p1

    .line 89
    :cond_1
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, v3

    const/4 v9, 0x0

    shr-long/2addr v1, v9

    long-to-int v1, v1

    const-wide v5, 0xfffffffc0000000L

    and-long/2addr v5, v3

    const/16 v2, 0x1e

    shr-long/2addr v5, v2

    long-to-int v10, v5

    add-int/lit8 v2, v10, 0x2

    .line 92
    iget v5, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v2, v5

    and-int/2addr v1, v5

    if-ne v2, v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v1, v10, 0x1

    const v2, 0x3fffffff    # 1.9999999f

    and-int/2addr v1, v2

    .line 94
    sget-object v2, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-static {v0, v3, v4, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;->access$updateTail(Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;JI)J

    move-result-wide v5

    move-object v1, v2

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v1, v10

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 98
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    .line 100
    :goto_0
    iget-wide v1, v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/high16 v3, 0x1000000000000000L

    and-long/2addr v1, v3

    cmp-long v1, v1, v7

    if-nez v1, :cond_3

    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v0

    invoke-direct {v0, v10, p1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->fillPlaceholder(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    return v9
.end method

.method public final close()Z
    .locals 9

    .line 246
    :cond_0
    iget-wide v2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/high16 v0, 0x2000000000000000L

    and-long v4, v2, v0

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const/4 v8, 0x1

    if-eqz v4, :cond_1

    return v8

    :cond_1
    const-wide/high16 v4, 0x1000000000000000L

    and-long/2addr v4, v2

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    or-long v4, v2, v0

    .line 248
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return v8
.end method

.method public final isEmpty()Z
    .locals 7

    .line 74
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    iget-wide v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    const/4 v4, 0x0

    shr-long/2addr v2, v4

    long-to-int v2, v2

    const-wide v5, 0xfffffffc0000000L

    and-long/2addr v0, v5

    const/16 v3, 0x1e

    shr-long/2addr v0, v3

    long-to-int v0, v0

    if-ne v2, v0, :cond_0

    const/4 v4, 0x1

    :cond_0
    return v4
.end method

.method public final next()Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 172
    invoke-direct {p0}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->markFrozen()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->allocateOrGetNextCopy(J)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v0

    return-object v0
.end method

.method public final removeFirstOrNull()Ljava/lang/Object;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 255
    iget-wide v2, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state:J

    const-wide/high16 v0, 0x1000000000000000L

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-eqz v0, :cond_0

    .line 134
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->REMOVE_FROZEN:Lkotlinx/coroutines/internal/Symbol;

    return-object v0

    .line 135
    :cond_0
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    const-wide/32 v0, 0x3fffffff

    and-long/2addr v0, v2

    const/4 v4, 0x0

    shr-long/2addr v0, v4

    long-to-int v6, v0

    const-wide v0, 0xfffffffc0000000L

    and-long/2addr v0, v2

    const/16 v4, 0x1e

    shr-long/2addr v0, v4

    long-to-int v0, v0

    .line 136
    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v0, v1

    and-int v4, v6, v1

    const/4 v7, 0x0

    if-ne v0, v4, :cond_1

    return-object v7

    .line 138
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    and-int/2addr v1, v6

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 139
    instance-of v0, v8, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Placeholder;

    if-eqz v0, :cond_2

    return-object v7

    :cond_2
    add-int/lit8 v0, v6, 0x1

    const v1, 0x3fffffff    # 1.9999999f

    and-int v9, v0, v1

    .line 142
    sget-object v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->_state$FU:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    sget-object v1, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->Companion:Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;

    invoke-static {v1, v2, v3, v9}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;->access$updateHead(Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore$Companion;JI)J

    move-result-wide v4

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    iget-object v0, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->array:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, p0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->mask:I

    and-int/2addr v1, v6

    invoke-virtual {v0, v1, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v8

    .line 147
    :cond_3
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    .line 150
    :goto_0
    invoke-direct {v0, v6, v9}, Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;->removeSlowPath(II)Lkotlinx/coroutines/internal/LockFreeMPSCQueueCore;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    return-object v8

    :cond_5
    return-object v7
.end method
