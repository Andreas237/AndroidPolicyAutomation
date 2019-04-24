.class public final Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
.super Ljava/lang/Object;
.source "Dispatched.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/UndispatchedEventLoop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EventLoop"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u00060\u0006j\u0002`\u00070\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\n\u001a\u000c\u0012\u0008\u0012\u00060\u0006j\u0002`\u00070\u0005H\u00c6\u0003J\'\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u00060\u0006j\u0002`\u00070\u0005H\u00c6\u0001J\u0013\u0010\u000c\u001a\u00020\u00032\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u00060\u0006j\u0002`\u00070\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
        "",
        "isActive",
        "",
        "queue",
        "Lkotlinx/coroutines/internal/ArrayQueue;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "(ZLkotlinx/coroutines/internal/ArrayQueue;)V",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field public isActive:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final queue:Lkotlinx/coroutines/internal/ArrayQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/ArrayQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p0, v1, v0, v2, v0}, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;-><init>(ZLkotlinx/coroutines/internal/ArrayQueue;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLkotlinx/coroutines/internal/ArrayQueue;)V
    .locals 1
    .param p2    # Lkotlinx/coroutines/internal/ArrayQueue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlinx/coroutines/internal/ArrayQueue<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "queue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    iput-object p2, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlinx/coroutines/internal/ArrayQueue;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 18
    new-instance p2, Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-direct {p2}, Lkotlinx/coroutines/internal/ArrayQueue;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;-><init>(ZLkotlinx/coroutines/internal/ArrayQueue;)V

    return-void
.end method

.method public static synthetic copy$default(Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;ZLkotlinx/coroutines/internal/ArrayQueue;ILjava/lang/Object;)Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->copy(ZLkotlinx/coroutines/internal/ArrayQueue;)Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    return v0
.end method

.method public final component2()Lkotlinx/coroutines/internal/ArrayQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/internal/ArrayQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    return-object v0
.end method

.method public final copy(ZLkotlinx/coroutines/internal/ArrayQueue;)Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
    .locals 1
    .param p2    # Lkotlinx/coroutines/internal/ArrayQueue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlinx/coroutines/internal/ArrayQueue<",
            "Ljava/lang/Runnable;",
            ">;)",
            "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "queue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    invoke-direct {v0, p1, p2}, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;-><init>(ZLkotlinx/coroutines/internal/ArrayQueue;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    instance-of v1, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    iget-boolean v1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    iget-boolean v3, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    if-ne v1, v3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    iget-object p1, p1, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EventLoop(isActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->isActive:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", queue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;->queue:Lkotlinx/coroutines/internal/ArrayQueue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
