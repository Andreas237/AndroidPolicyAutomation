.class final Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Dispatched.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/UndispatchedEventLoop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;

    invoke-direct {v0}, Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;-><init>()V

    sput-object v0, Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;->INSTANCE:Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lkotlinx/coroutines/UndispatchedEventLoop$threadLocalEventLoop$1;->invoke()Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    new-instance v0, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v2, v1, v3, v1}, Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;-><init>(ZLkotlinx/coroutines/internal/ArrayQueue;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
