.class public Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ImageAndDescriptionPopupDetails.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public backgroundImageUrl:Ljava/lang/String;

.field public closeButton:Lcom/shopkick/app/fetchers/api/skapi/PopupButton;

.field public descriptionText:Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;

.field public mainImage:Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

.field public soundFile:Ljava/lang/String;

.field public title:Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;
    .locals 2

    .line 38
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->title:Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;->postProcess()V

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->mainImage:Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->postProcess()V

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->descriptionText:Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;->postProcess()V

    .line 52
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->closeButton:Lcom/shopkick/app/fetchers/api/skapi/PopupButton;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->postProcess()V

    :cond_3
    return-void
.end method
