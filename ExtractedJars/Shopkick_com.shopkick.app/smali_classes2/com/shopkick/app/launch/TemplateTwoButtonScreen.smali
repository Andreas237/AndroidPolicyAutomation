.class public Lcom/shopkick/app/launch/TemplateTwoButtonScreen;
.super Lcom/shopkick/app/TemplateScreen;
.source "TemplateTwoButtonScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final TEMPLATE_SCREEN_PARAM_LEFT_BUTTON_SK_URL:Ljava/lang/String; = "button_url_left"

.field public static final TEMPLATE_SCREEN_PARAM_LEFT_BUTTON_TEXT:Ljava/lang/String; = "button_text_left"

.field private static final TEMPLATE_SCREEN_PARAM_RIGHT_BUTTON_SK_URL:Ljava/lang/String; = "button_url_right"

.field public static final TEMPLATE_SCREEN_PARAM_RIGHT_BUTTON_TEXT:Ljava/lang/String; = "button_text_right"


# instance fields
.field private leftButtonSKUrl:Ljava/lang/String;

.field private leftButtonText:Ljava/lang/String;

.field private leftButtonView:Lcom/shopkick/app/widget/SKButton;

.field private rightButtonSKUrl:Ljava/lang/String;

.field private rightButtonText:Ljava/lang/String;

.field private rightButtonView:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/TemplateScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c01db

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09045d

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainImageView:Landroid/widget/ImageView;

    const p2, 0x7f090461

    .line 52
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f090306

    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 56
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const p3, 0x77a12

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->screenName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 59
    invoke-static {p2}, Lcom/shopkick/app/application/SIP;->setupClientLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 60
    invoke-static {p3}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->fetchImage()V

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0x32

    if-le p2, p3, :cond_0

    .line 64
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const/high16 p3, 0x41900000    # 18.0f

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    .line 66
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object p3, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const p2, 0x7f0900be

    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonView:Lcom/shopkick/app/widget/SKButton;

    .line 69
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonView:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonView:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonView:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0xf8

    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const p2, 0x7f0900c1

    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonView:Lcom/shopkick/app/widget/SKButton;

    .line 74
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonView:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonView:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonView:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0xf9

    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    .line 40
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/TemplateScreen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    const-string p1, "button_text_left"

    .line 41
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonText:Ljava/lang/String;

    const-string p1, "button_text_right"

    .line 42
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonText:Ljava/lang/String;

    const-string p1, "button_url_left"

    .line 43
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonSKUrl:Ljava/lang/String;

    const-string p1, "button_url_right"

    .line 44
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonSKUrl:Ljava/lang/String;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    const v0, 0x77a12

    .line 83
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onCancelEvent(I)V

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 85
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonView:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v1, :cond_0

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->rightButtonSKUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto :goto_0

    .line 87
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonView:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v1, :cond_1

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateTwoButtonScreen;->leftButtonSKUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_1
    :goto_0
    return-void
.end method
