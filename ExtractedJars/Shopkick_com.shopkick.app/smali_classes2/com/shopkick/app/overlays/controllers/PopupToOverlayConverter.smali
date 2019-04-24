.class public Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;
.super Ljava/lang/Object;
.source "PopupToOverlayConverter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convert(Lcom/shopkick/app/fetchers/api/skapi/Popup;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 18
    :cond_0
    invoke-static {p0}, Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;->getOverlayClass(Lcom/shopkick/app/fetchers/api/skapi/Popup;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 23
    :cond_1
    invoke-static {v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    .line 25
    const-class v2, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->layeredPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->imageViews:Ljava/util/List;

    if-eqz v2, :cond_2

    .line 30
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->imageViews:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

    .line 31
    invoke-static {v3}, Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;->convertImageViewInfoToView(Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;)Lcom/shopkick/app/fetchers/api/skapi/View;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->textViews:Ljava/util/List;

    if-eqz v2, :cond_3

    .line 35
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->textViews:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;

    .line 36
    invoke-static {v3}, Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;->convertTextViewInfoToView(Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;)Lcom/shopkick/app/fetchers/api/skapi/View;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 40
    :cond_3
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;-><init>()V

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    .line 41
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    .line 43
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->buttons:Ljava/util/List;

    if-eqz v1, :cond_5

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->buttons:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;

    .line 46
    invoke-static {v3}, Lcom/shopkick/app/overlays/controllers/PopupToOverlayConverter;->convertPopupButtonToOverlayButton(Lcom/shopkick/app/fetchers/api/skapi/PopupButton;)Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 48
    :cond_4
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    .line 50
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->soundFile:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->soundFile:Ljava/lang/String;

    .line 51
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->webview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v1, :cond_9

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/LayeredPopupDetails;->webview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    goto :goto_4

    .line 54
    :cond_6
    const-class v2, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->ballAnimationPopupDetails:Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;

    if-eqz p0, :cond_9

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->ballDetails:Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    if-eqz v1, :cond_7

    .line 59
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->ballDetails:Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    .line 60
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->ballDetails:Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    .line 61
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->ballDetails:Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->poppable:Ljava/lang/Boolean;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->poppable:Ljava/lang/Boolean;

    .line 63
    :cond_7
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->soundFile:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->soundFile:Ljava/lang/String;

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BallAnimationPopupDetails;->pointsDetails:Lcom/shopkick/app/fetchers/api/skapi/PointsDetails;

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    goto :goto_3

    :cond_8
    const/4 p0, 0x0

    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->flyUp:Ljava/lang/Boolean;

    :cond_9
    :goto_4
    return-object v0
.end method

.method private static convertImageViewInfoToView(Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;)Lcom/shopkick/app/fetchers/api/skapi/View;
    .locals 2

    .line 71
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/View;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/View;-><init>()V

    .line 72
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    .line 73
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->imageUrl:Ljava/lang/String;

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method private static convertPopupButtonToOverlayButton(Lcom/shopkick/app/fetchers/api/skapi/PopupButton;)Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;
    .locals 3

    .line 86
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;-><init>()V

    .line 87
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->imageViewInfo:Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->imageViewInfo:Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->imageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->imageUrl:Ljava/lang/String;

    .line 89
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->buttonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 90
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->buttonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->action:Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;->type:Ljava/lang/Integer;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    .line 91
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->buttonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object v2, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->action:Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;->url:Ljava/lang/String;

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->url:Ljava/lang/String;

    .line 92
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->buttonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButton;->action:Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/PopupButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    iput-object p0, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    return-object v0
.end method

.method private static convertTextViewInfoToView(Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;)Lcom/shopkick/app/fetchers/api/skapi/View;
    .locals 2

    .line 78
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/View;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/View;-><init>()V

    .line 79
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    .line 80
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;->text:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    .line 81
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TextViewInfo;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/View;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    return-object v0
.end method

.method private static getOverlayClass(Lcom/shopkick/app/fetchers/api/skapi/Popup;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/Popup;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/Popup;->type:Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 105
    :cond_0
    const-class p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    goto :goto_0

    .line 101
    :cond_1
    const-class p0, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    :goto_0
    return-object p0
.end method
