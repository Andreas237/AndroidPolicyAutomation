.class public Lcom/shopkick/app/fetchers/api/skapi/Popup;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "Popup.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public alertPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/AlertPopupDetails;

.field public ballAnimationPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;

.field public frequencyCardDetails:Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;

.field public fullImagePopupDetails:Lcom/shopkick/app/fetchers/api/skapi/FullImagePopupDetails;

.field public imageAndDescriptionPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

.field public layerIdentifier:Ljava/lang/String;

.field public layeredPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;

.field public modalWebviewPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/ModalWebviewPopupDetails;

.field public pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

.field public type:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Popup;
    .locals 2

    .line 42
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/Popup;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Popup;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Popup;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Popup;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Popup;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Popup;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Popup;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Popup;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->fullImagePopupDetails:Lcom/shopkick/app/fetchers/api/skapi/FullImagePopupDetails;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/FullImagePopupDetails;->postProcess()V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->ballAnimationPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->postProcess()V

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->postProcess()V

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->imageAndDescriptionPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ImageAndDescriptionPopupDetails;->postProcess()V

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->layeredPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->postProcess()V

    .line 58
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->modalWebviewPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/ModalWebviewPopupDetails;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ModalWebviewPopupDetails;->postProcess()V

    .line 59
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->alertPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/AlertPopupDetails;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/AlertPopupDetails;->postProcess()V

    .line 60
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->frequencyCardDetails:Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;->postProcess()V

    :cond_7
    return-void
.end method
