.class public Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "OfferUsageInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public buttonFrame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

.field public buttonText:Ljava/lang/String;

.field public hideOnTap:Ljava/lang/Boolean;

.field public offerUseButtonType:Ljava/lang/Integer;

.field public requiresRegistration:Ljava/lang/Boolean;

.field public requiresUsageConfirmation:Ljava/lang/Boolean;

.field public usageConfirmationDetailText:Ljava/lang/String;

.field public usageConfirmationTitleText:Ljava/lang/String;

.field public useButtonPosition:Ljava/lang/Integer;

.field public useOfferUrl:Ljava/lang/String;

.field public webviewActionData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;
    .locals 2

    .line 43
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    if-eqz p1, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->postProcess()V
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

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;
    .locals 1

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->requiresRegistration:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->requiresRegistration:Ljava/lang/Boolean;

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->requiresUsageConfirmation:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->requiresUsageConfirmation:Ljava/lang/Boolean;

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->webviewActionData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->postProcess()V

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->hideOnTap:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->hideOnTap:Ljava/lang/Boolean;

    :cond_3
    return-void
.end method
