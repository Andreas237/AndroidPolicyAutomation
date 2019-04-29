.class final Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "AnalyticsHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/analytics/AnalyticsHandler;->getPublicAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0086@\u00f8\u0001\u0000"
    }
    d2 = {
        "getPublicAnalytics",
        "",
        "continuation",
        "Lkotlin/coroutines/Continuation;",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io/streamroot/dna/core/analytics/AnalyticsHandler"
    f = "AnalyticsHandler.kt"
    i = {
        0x0
    }
    l = {
        0x14,
        0x14
    }
    m = "getPublicAnalytics"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/streamroot/dna/core/analytics/AnalyticsHandler;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->this$0:Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    invoke-virtual {p1, p0}, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->getPublicAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
