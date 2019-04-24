.class public abstract Lkotlinx/coroutines/internal/AtomicOp;
.super Lkotlinx/coroutines/internal/OpDescriptor;
.source "Atomic.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/OpDescriptor;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n*L\n1#1,75:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008&\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00028\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/AtomicOp;",
        "T",
        "Lkotlinx/coroutines/internal/OpDescriptor;",
        "()V",
        "_consensus",
        "Lkotlinx/atomicfu/AtomicRef;",
        "",
        "isDecided",
        "",
        "()Z",
        "complete",
        "",
        "affected",
        "failure",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "decide",
        "decision",
        "perform",
        "prepare",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "tryDecide",
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
.field private static final _consensus$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _consensus:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/internal/AtomicOp;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_consensus"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lkotlinx/coroutines/internal/OpDescriptor;-><init>()V

    .line 37
    invoke-static {}, Lkotlinx/coroutines/internal/AtomicKt;->access$getNO_DECISION$p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus:Ljava/lang/Object;

    return-void
.end method

.method private final decide(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/AtomicOp;->tryDecide(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus:Ljava/lang/Object;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public abstract complete(Ljava/lang/Object;Ljava/lang/Object;)V
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method

.method public final isDecided()Z
    .locals 2

    .line 39
    iget-object v0, p0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus:Ljava/lang/Object;

    invoke-static {}, Lkotlinx/coroutines/internal/AtomicKt;->access$getNO_DECISION$p()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final perform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 56
    iget-object v0, p0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus:Ljava/lang/Object;

    .line 57
    invoke-static {}, Lkotlinx/coroutines/internal/AtomicKt;->access$getNO_DECISION$p()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 58
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/AtomicOp;->prepare(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lkotlinx/coroutines/internal/AtomicOp;->decide(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 61
    :cond_0
    invoke-virtual {p0, p1, v0}, Lkotlinx/coroutines/internal/AtomicOp;->complete(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract prepare(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final tryDecide(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-static {}, Lkotlinx/coroutines/internal/AtomicKt;->access$getNO_DECISION$p()Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 43
    sget-object v0, Lkotlinx/coroutines/internal/AtomicOp;->_consensus$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlinx/coroutines/internal/AtomicKt;->access$getNO_DECISION$p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method
