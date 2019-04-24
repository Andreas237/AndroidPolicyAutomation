.class public Lcom/shopkick/app/overlays/common/LayeredSKOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "LayeredSKOverlay.java"

# interfaces
.implements Lcom/shopkick/app/url/IURLDispatcherCallback;


# static fields
.field private static final DEBUG:Z = false

.field private static final LOG_TAG:Ljava/lang/String; = "LayeredSKOverlay"


# instance fields
.field private buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private mainView:Landroid/widget/RelativeLayout;

.field private overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

.field private overlayType:Ljava/lang/String;

.field private soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field private textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field private viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

.field private webView:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    .line 51
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 53
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayType:Ljava/lang/String;

    .line 56
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 57
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    .line 58
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 59
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 60
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 61
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 62
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/common/LayeredSKOverlay;)Lcom/shopkick/app/graphics/ButtonDrawableFactory;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    return-object p0
.end method

.method public static getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 308
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 310
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 311
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 312
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 313
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 318
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 319
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;

    .line 320
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 321
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 326
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    .line 102
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayType:Ljava/lang/String;

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090460

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 113
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getScreenScale()F

    move-result v1

    .line 118
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v3, 0x43a00000    # 320.0f

    mul-float/2addr v3, v1

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 119
    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    const v3, 0x43e38000    # 455.0f

    mul-float/2addr v1, v3

    add-float/2addr v1, v4

    float-to-int v1, v1

    .line 120
    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    const/16 v1, 0xe

    .line 121
    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 123
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    const/16 v3, 0xa

    if-eqz v1, :cond_4

    .line 124
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_2

    const/16 v1, 0xc

    .line 125
    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 126
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_3

    const/16 v1, 0xd

    .line 127
    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 128
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->verticalAlignType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_5

    .line 129
    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    .line 132
    :cond_4
    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 139
    :cond_5
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-eqz v1, :cond_7

    .line 145
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iget-object v2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    invoke-virtual {v1, p1, v2}, Lcom/shopkick/app/util/ViewBuilder;->createViewGroup(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;)Ljava/util/ArrayList;

    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;

    .line 147
    iget-boolean v3, v2, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    if-eqz v3, :cond_6

    .line 148
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    iget-object v2, v2, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 150
    :cond_6
    iget-object v2, v2, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 155
    :cond_7
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 160
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    .line 161
    new-instance v1, Lcom/shopkick/app/webview/SKWebView;

    invoke-direct {v1, p1}, Lcom/shopkick/app/webview/SKWebView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v1, v3, v4}, Lcom/shopkick/app/webview/SKWebView;->setup(Landroid/app/Activity;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    .line 164
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/webview/SKWebView;->setDispatcherCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    .line 166
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/webview/SKWebView;->setBackgroundColor(I)V

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->webviewUrl:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    .line 173
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 177
    :cond_8
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    if-eqz v1, :cond_f

    move v1, v2

    .line 178
    :goto_2
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_f

    .line 179
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;

    .line 180
    new-instance v4, Lcom/shopkick/app/widget/SKButton;

    invoke-direct {v4, p1}, Lcom/shopkick/app/widget/SKButton;-><init>(Landroid/content/Context;)V

    .line 183
    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    if-eqz v5, :cond_9

    .line 184
    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    invoke-static {v5, v4}, Lcom/shopkick/app/util/FrameConfigurator;->setFrameForView(Lcom/shopkick/app/fetchers/api/skapi/Rectangle;Landroid/view/View;)Z

    move-result v5

    goto :goto_3

    :cond_9
    move v5, v2

    :goto_3
    const/4 v6, 0x0

    .line 187
    invoke-virtual {v4, v6}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 189
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->text:Ljava/lang/String;

    if-eqz v6, :cond_b

    .line 190
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    if-eqz v6, :cond_a

    .line 191
    iget-object v6, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    iget-object v7, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    invoke-virtual {v6, v7, v4}, Lcom/shopkick/app/util/TextStyleConfigurator;->setStyleForTextView(Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;Lcom/shopkick/app/widget/SKButton;)V

    .line 193
    :cond_a
    invoke-virtual {v4}, Lcom/shopkick/app/widget/SKButton;->getButtonTextView()Landroid/widget/TextView;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/16 v6, 0x11

    .line 194
    invoke-virtual {v4, v6}, Lcom/shopkick/app/widget/SKButton;->setGravity(I)V

    .line 195
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->text:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 198
    :cond_b
    iget-object v6, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->buttonAction:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    if-eqz v6, :cond_c

    .line 200
    iget-object v7, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    invoke-virtual {v7, p0, v6, v4}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->setActionForButton(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Landroid/view/View;)V

    :cond_c
    if-eqz v5, :cond_d

    .line 208
    iget-object v5, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    .line 210
    :cond_d
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 213
    :goto_4
    iget-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->imageUrl:Ljava/lang/String;

    if-eqz v5, :cond_e

    .line 214
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlayButton;->imageUrl:Ljava/lang/String;

    invoke-virtual {v5, v3}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    new-instance v5, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;

    invoke-direct {v5, p0, v4}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay$1;-><init>(Lcom/shopkick/app/overlays/common/LayeredSKOverlay;Lcom/shopkick/app/widget/SKButton;)V

    invoke-virtual {v3, v5}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    .line 224
    invoke-virtual {v3}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    :cond_e
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 233
    :cond_f
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->bringToFront()V

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0}, Lcom/shopkick/app/webview/SKWebView;->destroy()V

    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->webView:Lcom/shopkick/app/webview/SKWebView;

    .line 87
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method public getOverlayType()Ljava/lang/String;
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayType:Ljava/lang/String;

    return-object v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0109

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public handleLink(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string p2, "close"

    .line 292
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 293
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->dismiss()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 68
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 70
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 71
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->overlayActionConfigurator:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;

    .line 72
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 73
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 74
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 75
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 76
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    return-void
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 269
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 245
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 252
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->views:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

    if-nez v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttons:Ljava/util/List;

    if-nez v0, :cond_0

    .line 253
    sget-object p1, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->LOG_TAG:Ljava/lang/String;

    const-string p2, "onOverlayShown: no views or buttons; returning"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 257
    :cond_0
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->soundFile:Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/sounds/SoundManager;->play(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
