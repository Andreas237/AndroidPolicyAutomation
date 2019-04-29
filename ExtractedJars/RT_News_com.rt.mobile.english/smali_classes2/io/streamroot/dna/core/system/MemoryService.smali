.class public final Lio/streamroot/dna/core/system/MemoryService;
.super Ljava/lang/Object;
.source "MemoryService.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/system/MemoryService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMemoryService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryService.kt\nio/streamroot/dna/core/system/MemoryService\n*L\n1#1,93:1\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0008\u0010\u001d\u001a\u00020\u0012H\u0002J\u0006\u0010\u001e\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u000c\u0012\n \u000c*\u0004\u0018\u00010\u00050\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lio/streamroot/dna/core/system/MemoryService;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "isLowRam",
        "",
        "activityManager",
        "Landroid/app/ActivityManager;",
        "(ZLandroid/app/ActivityManager;)V",
        "()Z",
        "memoryInfo",
        "Landroid/app/ActivityManager$MemoryInfo;",
        "runtime",
        "Ljava/lang/Runtime;",
        "kotlin.jvm.PlatformType",
        "weakActivityManager",
        "Ljava/lang/ref/WeakReference;",
        "allocatedMemory",
        "",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "appendSupportAnalytics",
        "supportPayload",
        "freeAllocatedMemory",
        "freeMemory",
        "freeMemoryPercentage",
        "",
        "maxFreeMemory",
        "maxMemory",
        "updateMemoryInfo",
        "usedMemory",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/system/MemoryService$Companion;

.field private static final ONE_HUNDRED:Ljava/math/BigDecimal;


# instance fields
.field private final isLowRam:Z

.field private final memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

.field private final runtime:Ljava/lang/Runtime;

.field private final weakActivityManager:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/ActivityManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/streamroot/dna/core/system/MemoryService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/system/MemoryService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/system/MemoryService;->Companion:Lio/streamroot/dna/core/system/MemoryService$Companion;

    const/16 v0, 0x64

    int-to-long v0, v0

    .line 91
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    const-string v1, "BigDecimal.valueOf(this.toLong())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lio/streamroot/dna/core/system/MemoryService;->ONE_HUNDRED:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>(ZLandroid/app/ActivityManager;)V
    .locals 1
    .param p2    # Landroid/app/ActivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activityManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/streamroot/dna/core/system/MemoryService;->isLowRam:Z

    .line 19
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/streamroot/dna/core/system/MemoryService;->weakActivityManager:Ljava/lang/ref/WeakReference;

    .line 20
    new-instance p1, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {p1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/system/MemoryService;->memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

    .line 21
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    .line 24
    invoke-direct {p0}, Lio/streamroot/dna/core/system/MemoryService;->updateMemoryInfo()V

    return-void
.end method

.method public static final synthetic access$getMemoryInfo$p(Lio/streamroot/dna/core/system/MemoryService;)Landroid/app/ActivityManager$MemoryInfo;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object p0, p0, Lio/streamroot/dna/core/system/MemoryService;->memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

    return-object p0
.end method

.method private final updateMemoryInfo()V
    .locals 2

    .line 86
    iget-object v0, p0, Lio/streamroot/dna/core/system/MemoryService;->weakActivityManager:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/streamroot/dna/core/system/MemoryService;->memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final allocatedMemory()J
    .locals 2

    .line 29
    iget-object v0, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    return-wide v0
.end method

.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 61
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "system"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "memory"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "lowMemory"

    .line 63
    iget-object v1, p0, Lio/streamroot/dna/core/system/MemoryService;->memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

    iget-boolean v1, v1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "maxMemory"

    .line 64
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->maxMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "allocatedMemory"

    .line 65
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->allocatedMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "freeMemory"

    .line 66
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->freeMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "freeMemoryPercentage"

    .line 67
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->freeMemoryPercentage()D

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v0, "maxFreeMemory"

    .line 68
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->maxFreeMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "freeAllocatedMemory"

    .line 69
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->freeAllocatedMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "usedMemory"

    .line 70
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->usedMemory()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "nativeHeapSize"

    .line 71
    invoke-static {}, Landroid/os/Debug;->getNativeHeapSize()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "nativeHeapAllocatedSize"

    .line 72
    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "native"

    .line 76
    new-instance v1, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;-><init>(Lio/streamroot/dna/core/system/MemoryService;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final freeAllocatedMemory()J
    .locals 2

    .line 31
    iget-object v0, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v0

    return-wide v0
.end method

.method public final freeMemory()J
    .locals 4

    .line 37
    invoke-direct {p0}, Lio/streamroot/dna/core/system/MemoryService;->updateMemoryInfo()V

    .line 39
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->maxFreeMemory()J

    move-result-wide v0

    .line 41
    iget-object v2, p0, Lio/streamroot/dna/core/system/MemoryService;->memoryInfo:Landroid/app/ActivityManager$MemoryInfo;

    iget-wide v2, v2, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final freeMemoryPercentage()D
    .locals 8

    .line 45
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->freeMemory()J

    move-result-wide v0

    .line 46
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->maxMemory()J

    move-result-wide v2

    .line 48
    sget-object v4, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[MEMORY] freeMemory:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " nativeHeap:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Debug;->getNativeHeapAllocatedSize()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    const-string v1, "BigDecimal.valueOf(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    const-string v2, "BigDecimal.valueOf(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 52
    sget-object v1, Lio/streamroot/dna/core/system/MemoryService;->ONE_HUNDRED:Ljava/math/BigDecimal;

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 53
    sget-object v1, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->round(Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final isLowRam()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lio/streamroot/dna/core/system/MemoryService;->isLowRam:Z

    return v0
.end method

.method public final maxFreeMemory()J
    .locals 6

    .line 58
    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->maxMemory()J

    move-result-wide v0

    invoke-virtual {p0}, Lio/streamroot/dna/core/system/MemoryService;->usedMemory()J

    move-result-wide v2

    sub-long v4, v0, v2

    return-wide v4
.end method

.method public final maxMemory()J
    .locals 2

    .line 27
    iget-object v0, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    return-wide v0
.end method

.method public priority()I
    .locals 1

    .line 15
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method public final usedMemory()J
    .locals 6

    .line 33
    iget-object v0, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    iget-object v2, p0, Lio/streamroot/dna/core/system/MemoryService;->runtime:Ljava/lang/Runtime;

    invoke-virtual {v2}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v2

    sub-long v4, v0, v2

    return-wide v4
.end method
