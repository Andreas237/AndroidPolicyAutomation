.class public final Lkotlinx/coroutines/AbstractContinuationKt;
.super Ljava/lang/Object;
.source "AbstractContinuation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "ACTIVE",
        "Lkotlinx/coroutines/Active;",
        "RESUMED",
        "",
        "SUSPENDED",
        "UNDECIDED",
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
.field private static final ACTIVE:Lkotlinx/coroutines/Active;

.field private static final RESUMED:I = 0x2

.field private static final SUSPENDED:I = 0x1

.field private static final UNDECIDED:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 279
    new-instance v0, Lkotlinx/coroutines/Active;

    invoke-direct {v0}, Lkotlinx/coroutines/Active;-><init>()V

    sput-object v0, Lkotlinx/coroutines/AbstractContinuationKt;->ACTIVE:Lkotlinx/coroutines/Active;

    return-void
.end method

.method public static final synthetic access$getACTIVE$p()Lkotlinx/coroutines/Active;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lkotlinx/coroutines/AbstractContinuationKt;->ACTIVE:Lkotlinx/coroutines/Active;

    return-object v0
.end method
