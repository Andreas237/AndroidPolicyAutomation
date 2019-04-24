.class public Lcom/ibotta/android/aop/tracking/advice/DeadEndSearchAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "DeadEndSearchAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 27
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/views/empty/EmptyViewState;

    if-eqz v1, :cond_0

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->getRows()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/empty/EmptyViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/empty/EmptyViewState;->getImageText()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/DeadEndSearchAdvice;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v2, 0x7f1105c2

    new-array v0, v0, [Ljava/lang/Object;

    .line 32
    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 34
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    const-string v0, "search"

    .line 35
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->type(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object p1

    const-string v0, "encountered_dead_end"

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/advice/DeadEndSearchAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
