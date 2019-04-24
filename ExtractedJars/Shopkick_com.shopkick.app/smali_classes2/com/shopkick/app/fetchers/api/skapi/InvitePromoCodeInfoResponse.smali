.class public Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "InvitePromoCodeInfoResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public CTAButtonText:Ljava/lang/String;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public facebookInviteLink:Ljava/lang/String;

.field public promoCode:Ljava/lang/String;

.field public referralEmailSubjectText:Ljava/lang/String;

.field public referralLink:Ljava/lang/String;

.field public referralSmsCopyText:Ljava/lang/String;

.field public rewardInfoDetails:Ljava/lang/String;

.field public rewardInfoSubtitle:Ljava/lang/String;

.field public rewardInfoTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;
    .locals 2

    .line 43
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    if-eqz p1, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    :cond_0
    return-void
.end method
