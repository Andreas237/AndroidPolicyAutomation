.class public abstract Lcom/shopkick/app/TemplateScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TemplateScreen.java"


# static fields
.field public static final TEMPLATE_SCREEN_PARAM_FLOW_ID:Ljava/lang/String; = "flow_id"

.field public static final TEMPLATE_SCREEN_PARAM_IMAGE_URL:Ljava/lang/String; = "image_url"

.field public static final TEMPLATE_SCREEN_PARAM_LOGGING_SCREEN_NAME:Ljava/lang/String; = "screen_name"

.field public static final TEMPLATE_SCREEN_PARAM_SCREEN_TEXT:Ljava/lang/String; = "screen_text"

.field protected static final TEXT_SIZE_GREAT_THAN_THRESHOLD:I = 0x12

.field protected static final TEXT_SIZE_SCALE_DOWN_THRESHOLD:I = 0x32


# instance fields
.field protected flowId:Ljava/lang/String;

.field protected imgUrl:Ljava/lang/String;

.field protected mainImageView:Landroid/widget/ImageView;

.field protected mainText:Ljava/lang/String;

.field protected mainTextView:Lcom/shopkick/app/widget/SKTextView;

.field protected progressBar:Landroid/widget/ProgressBar;

.field protected screenName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method protected fetchImage()V
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/TemplateScreen;->progressBar:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/TemplateScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 80
    :cond_0
    new-instance v0, Lcom/shopkick/app/TemplateScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/TemplateScreen$1;-><init>(Lcom/shopkick/app/TemplateScreen;)V

    .line 94
    invoke-virtual {p0}, Lcom/shopkick/app/TemplateScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/TemplateScreen;->imgUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/TemplateScreen;->mainImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p1, "screen_text"

    .line 55
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/TemplateScreen;->mainText:Ljava/lang/String;

    const-string p1, "image_url"

    .line 56
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/TemplateScreen;->imgUrl:Ljava/lang/String;

    const-string p1, "screen_name"

    .line 57
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/TemplateScreen;->screenName:Ljava/lang/String;

    const-string p1, "flow_id"

    .line 60
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/TemplateScreen;->flowId:Ljava/lang/String;

    return-void
.end method

.method protected setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V
    .locals 2

    .line 70
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/TemplateScreen;->screenName:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    .line 72
    iget-object p2, p0, Lcom/shopkick/app/TemplateScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 99
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/TemplateScreen;->flowId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/TemplateScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/TemplateScreen;->screenName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
