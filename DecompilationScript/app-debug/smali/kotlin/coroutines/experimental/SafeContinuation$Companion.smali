.class public final Lkotlin/coroutines/experimental/SafeContinuation$Companion;
.super Ljava/lang/Object;
.source "SafeContinuationJvm.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/coroutines/experimental/SafeContinuation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R`\u0010\u0003\u001aF\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003 \u0006*\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0006*\"\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003 \u0006*\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0083\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/coroutines/experimental/SafeContinuation$Companion;",
        "",
        "()V",
        "RESULT",
        "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;",
        "Lkotlin/coroutines/experimental/SafeContinuation;",
        "kotlin.jvm.PlatformType",
        "RESULT$annotations",
        "getRESULT",
        "()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;",
        "RESUMED",
        "getRESUMED",
        "()Ljava/lang/Object;",
        "UNDECIDED",
        "getUNDECIDED",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1, "$constructor_marker"    # Lkotlin/jvm/internal/DefaultConstructorMarker;

    .prologue
    .line 38
    invoke-direct {p0}, Lkotlin/coroutines/experimental/SafeContinuation$Companion;-><init>()V

    return-void
.end method

.method private static synthetic RESULT$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static final synthetic access$getRESULT$p(Lkotlin/coroutines/experimental/SafeContinuation$Companion;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/SafeContinuation$Companion;

    .prologue
    .line 38
    invoke-direct {p0}, Lkotlin/coroutines/experimental/SafeContinuation$Companion;->getRESULT()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getRESUMED$p(Lkotlin/coroutines/experimental/SafeContinuation$Companion;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/SafeContinuation$Companion;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Lkotlin/coroutines/experimental/SafeContinuation$Companion;->getRESUMED()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getUNDECIDED$p(Lkotlin/coroutines/experimental/SafeContinuation$Companion;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lkotlin/coroutines/experimental/SafeContinuation$Companion;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Lkotlin/coroutines/experimental/SafeContinuation$Companion;->getUNDECIDED()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getRESULT()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater",
            "<",
            "Lkotlin/coroutines/experimental/SafeContinuation",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    invoke-static {}, Lkotlin/coroutines/experimental/SafeContinuation;->access$getRESULT$cp()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private final getRESUMED()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    invoke-static {}, Lkotlin/coroutines/experimental/SafeContinuation;->access$getRESUMED$cp()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getUNDECIDED()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-static {}, Lkotlin/coroutines/experimental/SafeContinuation;->access$getUNDECIDED$cp()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
