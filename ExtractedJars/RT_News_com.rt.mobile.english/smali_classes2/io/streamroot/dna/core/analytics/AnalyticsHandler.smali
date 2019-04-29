.class public final Lio/streamroot/dna/core/analytics/AnalyticsHandler;
.super Ljava/lang/Object;
.source "AnalyticsHandler.kt"


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u0008\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\t\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\n\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/AnalyticsHandler;",
        "",
        "callExecutor",
        "Lio/streamroot/dna/core/js/CallExecutor;",
        "(Lio/streamroot/dna/core/js/CallExecutor;)V",
        "getControlAnalytics",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getPublicAnalytics",
        "getStatsAnalytics",
        "getTrafficAnalytics",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final callExecutor:Lio/streamroot/dna/core/js/CallExecutor;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/js/CallExecutor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/js/CallExecutor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    return-void
.end method


# virtual methods
.method public final getControlAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;

    iget v1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;

    invoke-direct {v0, p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 17
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v2, "Panama.getControlAnalytics();"

    iput-object p0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getControlAnalytics$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 16
    :cond_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getPublicAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;

    iget v1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;

    invoke-direct {v0, p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 21
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v2, "Panama.getPublicAnalytics();"

    iput-object p0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getPublicAnalytics$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 20
    :cond_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getStatsAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;

    iget v1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;

    invoke-direct {v0, p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 8
    iget v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 9
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v2, "Panama.getStatsAnalytics();"

    iput-object p0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getStatsAnalytics$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 8
    :cond_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getTrafficAnalytics(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;

    iget v1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;

    invoke-direct {v0, p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/AnalyticsHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 12
    iget v2, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;

    instance-of v0, p1, Lkotlin/Result$Failure;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    instance-of v2, p1, Lkotlin/Result$Failure;

    if-eqz v2, :cond_1

    check-cast p1, Lkotlin/Result$Failure;

    iget-object p1, p1, Lkotlin/Result$Failure;->exception:Ljava/lang/Throwable;

    throw p1

    .line 13
    :cond_1
    iget-object p1, p0, Lio/streamroot/dna/core/analytics/AnalyticsHandler;->callExecutor:Lio/streamroot/dna/core/js/CallExecutor;

    const-string v2, "Panama.getTrafficAnalytics();"

    iput-object p0, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lio/streamroot/dna/core/analytics/AnalyticsHandler$getTrafficAnalytics$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/streamroot/dna/core/js/CallExecutor;->executeString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    .line 12
    :cond_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
