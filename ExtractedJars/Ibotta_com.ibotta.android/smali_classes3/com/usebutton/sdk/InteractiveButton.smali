.class public Lcom/usebutton/sdk/InteractiveButton;
.super Lcom/usebutton/sdk/internal/views/BaseButton;
.source "InteractiveButton.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "InteractiveButton"


# instance fields
.field private mAction:Lcom/usebutton/sdk/internal/models/AppAction;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mOnInvokeAction:Lcom/usebutton/sdk/internal/util/Receiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field

.field private mStyle:Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

.field private mViewBinder:Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 92
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/InteractiveButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 96
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/InteractiveButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 240
    new-instance p1, Lcom/usebutton/sdk/InteractiveButton$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/InteractiveButton$1;-><init>(Lcom/usebutton/sdk/InteractiveButton;)V

    iput-object p1, p0, Lcom/usebutton/sdk/InteractiveButton;->mOnInvokeAction:Lcom/usebutton/sdk/internal/util/Receiver;

    .line 102
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->inflateContentView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/usebutton/sdk/internal/views/BaseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 240
    new-instance p1, Lcom/usebutton/sdk/InteractiveButton$1;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/InteractiveButton$1;-><init>(Lcom/usebutton/sdk/InteractiveButton;)V

    iput-object p1, p0, Lcom/usebutton/sdk/InteractiveButton;->mOnInvokeAction:Lcom/usebutton/sdk/internal/util/Receiver;

    .line 109
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->inflateContentView()V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/InteractiveButton;)Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 0

    .line 75
    iget-object p0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    return-object p0
.end method

.method private getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 1

    .line 237
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    return-object v0
.end method

.method private refreshPager()V
    .locals 4

    .line 224
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/InteractiveButton;->viewBinderForAction(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mViewBinder:Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;

    .line 225
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mViewBinder:Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;

    iget-object v1, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v2, p0, Lcom/usebutton/sdk/InteractiveButton;->mOnInvokeAction:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->bind(Lcom/usebutton/sdk/internal/models/AppAction;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/models/Configuration;)V

    return-void
.end method

.method private varargs reportEvent(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5

    .line 257
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 262
    :cond_0
    invoke-static {p2}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    :try_start_0
    const-string v0, "promotion_source_token"

    .line 266
    iget-object v2, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "InteractiveButton"

    const-string v3, "Exception while forming event property object"

    const/4 v4, 0x1

    .line 268
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-static {v2, v3, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    :goto_0
    invoke-direct {p0}, Lcom/usebutton/sdk/InteractiveButton;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_1
    :goto_1
    const-string p1, "InteractiveButton"

    const-string p2, "Report event without action object, missing required meta object."

    .line 258
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private viewBinderForAction(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 275
    new-instance p1, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;-><init>(Lcom/usebutton/sdk/InteractiveButton;)V

    return-object p1

    .line 277
    :cond_0
    new-instance p1, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;

    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;-><init>(Lcom/usebutton/sdk/InteractiveButton;Lcom/usebutton/sdk/internal/ImageLoader;)V

    return-object p1
.end method


# virtual methods
.method public applyStylingAttributes(Landroid/view/ViewGroup;)V
    .locals 1

    .line 147
    iget-object p1, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/InteractiveButton;->viewBinderForAction(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getStyle()Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V

    return-void
.end method

.method public getDefaultStyleResource()I
    .locals 1

    .line 141
    sget v0, Lcom/usebutton/sdk/R$style;->BtnInteractiveButton:I

    return v0
.end method

.method public getStyle()Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mStyle:Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    if-nez v0, :cond_0

    .line 116
    new-instance v0, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    invoke-direct {v0}, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mStyle:Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mStyle:Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    return-object v0
.end method

.method public bridge synthetic getStyle()Lcom/usebutton/sdk/internal/views/BaseButton$Style;
    .locals 1

    .line 75
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getStyle()Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    move-result-object v0

    return-object v0
.end method

.method public inflateContentView()V
    .locals 2

    .line 164
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_preview_interactive:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 165
    invoke-virtual {p0, p0}, Lcom/usebutton/sdk/InteractiveButton;->applyStylingAttributes(Landroid/view/ViewGroup;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 171
    invoke-super {p0}, Lcom/usebutton/sdk/internal/views/BaseButton;->onAttachedToWindow()V

    .line 172
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 173
    check-cast v0, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/InteractiveButton;->prepareWithAction(Lcom/usebutton/sdk/internal/models/AppAction;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 180
    invoke-super/range {p0 .. p5}, Lcom/usebutton/sdk/internal/views/BaseButton;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    .line 182
    invoke-direct {p0}, Lcom/usebutton/sdk/InteractiveButton;->refreshPager()V

    :cond_0
    return-void
.end method

.method public prepareWithAction(Lcom/usebutton/sdk/action/ButtonAction;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/action/ButtonAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 200
    check-cast p1, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/InteractiveButton;->prepareWithAction(Lcom/usebutton/sdk/internal/models/AppAction;)V

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ButtonAction;->getAppAction()Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/InteractiveButton;->prepareWithAction(Lcom/usebutton/sdk/internal/models/AppAction;)V

    :goto_0
    return-void
.end method

.method prepareWithAction(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 213
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->hasGroups()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    .line 214
    iput-object p1, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    goto :goto_0

    .line 216
    :cond_1
    iput-object p1, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    .line 219
    :goto_0
    invoke-direct {p0}, Lcom/usebutton/sdk/InteractiveButton;->refreshPager()V

    .line 220
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->onContent()V

    return-void
.end method

.method public readAttributes(Landroid/util/AttributeSet;)V
    .locals 5

    .line 124
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/BaseButton;->readAttributes(Landroid/util/AttributeSet;)V

    .line 125
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_InteractiveButton:[I

    .line 126
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getDefaultStyleResource()I

    move-result v2

    const/4 v3, 0x0

    .line 125
    invoke-virtual {v0, p1, v1, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 128
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 130
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 131
    sget v4, Lcom/usebutton/sdk/R$styleable;->com_usebutton_sdk_InteractiveButton_btn_inventoryLeftPadding:I

    if-ne v2, v4, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getStyle()Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    move-result-object v4

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v4, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->inventoryLeftPadding:Ljava/lang/Integer;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method protected reportViewed()V
    .locals 2

    .line 229
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "btn:inventory-button-viewed"

    const/4 v1, 0x0

    .line 232
    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/InteractiveButton;->reportEvent(Ljava/lang/String;[Ljava/lang/String;)V

    .line 233
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->onReportedView()V

    return-void
.end method

.method public setInventoryLeftPadding_Button(I)V
    .locals 1

    .line 158
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->getStyle()Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;->inventoryLeftPadding:Ljava/lang/Integer;

    .line 159
    invoke-virtual {p0}, Lcom/usebutton/sdk/InteractiveButton;->invalidateStyling()V

    return-void
.end method

.method test_getPager()Landroid/support/v4/view/ViewPager;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 284
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton;->mViewBinder:Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 287
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->getPager()Landroid/support/v4/view/ViewPager;

    move-result-object v0

    return-object v0
.end method
