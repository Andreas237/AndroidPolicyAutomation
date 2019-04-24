.class public final Lkotlinx/coroutines/internal/ArrayQueue;
.super Ljava/lang/Object;
.source "ArrayQueue.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0008\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/ArrayQueue;",
        "T",
        "",
        "()V",
        "elements",
        "",
        "[Ljava/lang/Object;",
        "head",
        "",
        "isEmpty",
        "",
        "()Z",
        "tail",
        "addLast",
        "",
        "element",
        "(Ljava/lang/Object;)V",
        "clear",
        "ensureCapacity",
        "removeFirstOrNull",
        "()Ljava/lang/Object;",
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
.field private elements:[Ljava/lang/Object;

.field private head:I

.field private tail:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    return-void
.end method

.method private final ensureCapacity()V
    .locals 6

    .line 35
    iget-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v1, v0

    shl-int/lit8 v2, v1, 0x1

    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    array-length v3, v0

    iget v4, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    sub-int/2addr v3, v4

    const/4 v5, 0x0

    .line 39
    invoke-static {v0, v4, v2, v5, v3}, Lkotlinx/coroutines/internal/ArrayCopyKt;->arraycopy([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 40
    iget-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v4, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    invoke-static {v0, v5, v2, v3, v4}, Lkotlinx/coroutines/internal/ArrayCopyKt;->arraycopy([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    .line 41
    iput-object v2, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    .line 42
    iput v5, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    .line 43
    iput v1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    return-void
.end method


# virtual methods
.method public final addLast(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    iget v1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 15
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v1

    iput p1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    .line 16
    iget p1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    iget v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/ArrayQueue;->ensureCapacity()V

    :cond_0
    return-void
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    .line 30
    iput v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    .line 31
    iget-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    return-void
.end method

.method public final isEmpty()Z
    .locals 2

    .line 11
    iget v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    iget v1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final removeFirstOrNull()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 21
    iget v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    iget v1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->tail:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return-object v2

    .line 22
    :cond_0
    iget-object v1, p0, Lkotlinx/coroutines/internal/ArrayQueue;->elements:[Ljava/lang/Object;

    aget-object v3, v1, v0

    .line 23
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 24
    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lkotlinx/coroutines/internal/ArrayQueue;->head:I

    if-eqz v3, :cond_1

    return-object v3

    .line 25
    :cond_1
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type T"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
