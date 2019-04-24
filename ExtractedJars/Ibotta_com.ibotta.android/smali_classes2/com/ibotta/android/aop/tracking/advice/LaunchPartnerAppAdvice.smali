.class public Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdvice;
.super Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;
.source "LaunchPartnerAppAdvice.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/aop/tracking/advice/AbstractTrackingAdvice;-><init>(Lcom/ibotta/android/tracking/TrackingClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    .line 26
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdviceFields;

    invoke-interface {p1}, Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdviceFields;->getMcommEscortParamsParcel()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->getProductId()Ljava/lang/String;

    move-result-object p1

    .line 37
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v2

    if-eqz v0, :cond_1

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_1
    if-eqz v1, :cond_2

    .line 43
    invoke-virtual {v2, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_2
    if-eqz p1, :cond_3

    .line 46
    invoke-virtual {v2, p1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    :cond_3
    const-string p1, "launch_partner_app"

    .line 49
    invoke-virtual {v2}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/aop/tracking/advice/LaunchPartnerAppAdvice;->logEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
