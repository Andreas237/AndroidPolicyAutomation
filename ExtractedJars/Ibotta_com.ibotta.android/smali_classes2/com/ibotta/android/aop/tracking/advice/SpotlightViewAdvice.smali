.class public Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "SpotlightViewAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method private getContentModel(Ljava/lang/Object;)Lcom/ibotta/api/model/ContentModel;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 54
    instance-of v0, p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    if-eqz v0, :cond_0

    .line 55
    check-cast p1, Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/content/card/ContentCardViewState;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    return-object p1

    .line 57
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/model/ContentModel;

    if-eqz v0, :cond_1

    .line 58
    check-cast p1, Lcom/ibotta/api/model/ContentModel;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 25
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice;->getContentModel(Ljava/lang/Object;)Lcom/ibotta/api/model/ContentModel;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    .line 33
    sget-object v1, Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    return-void

    .line 42
    :pswitch_0
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getIdString()Ljava/lang/String;

    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    goto :goto_0

    .line 38
    :pswitch_1
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getIdString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->dealId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    goto :goto_0

    .line 35
    :pswitch_2
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :goto_0
    const-string p1, "view_spotlight"

    .line 49
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/SpotlightViewAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
