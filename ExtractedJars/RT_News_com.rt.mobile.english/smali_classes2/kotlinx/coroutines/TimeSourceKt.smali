.class public final Lkotlinx/coroutines/TimeSourceKt;
.super Ljava/lang/Object;
.source "TimeSource.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "timeSource",
        "Lkotlinx/coroutines/TimeSource;",
        "getTimeSource",
        "()Lkotlinx/coroutines/TimeSource;",
        "setTimeSource",
        "(Lkotlinx/coroutines/TimeSource;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static timeSource:Lkotlinx/coroutines/TimeSource;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    sget-object v0, Lkotlinx/coroutines/DefaultTimeSource;->INSTANCE:Lkotlinx/coroutines/DefaultTimeSource;

    check-cast v0, Lkotlinx/coroutines/TimeSource;

    sput-object v0, Lkotlinx/coroutines/TimeSourceKt;->timeSource:Lkotlinx/coroutines/TimeSource;

    return-void
.end method

.method public static final getTimeSource()Lkotlinx/coroutines/TimeSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 39
    sget-object v0, Lkotlinx/coroutines/TimeSourceKt;->timeSource:Lkotlinx/coroutines/TimeSource;

    return-object v0
.end method

.method public static final setTimeSource(Lkotlinx/coroutines/TimeSource;)V
    .locals 1
    .param p0    # Lkotlinx/coroutines/TimeSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    sput-object p0, Lkotlinx/coroutines/TimeSourceKt;->timeSource:Lkotlinx/coroutines/TimeSource;

    return-void
.end method
