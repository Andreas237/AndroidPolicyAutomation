.class public Lcom/shopkick/app/launch/TemplateOneButtonScreen;
.super Lcom/shopkick/app/TemplateScreen;
.source "TemplateOneButtonScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final TEMPLATE_SCREEN_PARAM_BUTTON_TEXT:Ljava/lang/String; = "button_text"

.field public static final TEMPLATE_SCREEN_PARAM_BUTTON_URL:Ljava/lang/String; = "button_url"


# instance fields
.field private buttonText:Ljava/lang/String;

.field private buttonUrl:Ljava/lang/String;

.field private nextButtonView:Lcom/shopkick/app/widget/SKButton;


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

    const p3, 0x7f0c01da

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09045d

    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainImageView:Landroid/widget/ImageView;

    const p2, 0x7f090461

    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f0904a8

    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->nextButtonView:Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f090306

    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 49
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const p3, 0x77a12

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->screenName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreenName(Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 52
    invoke-static {p2}, Lcom/shopkick/app/application/SIP;->setupClientLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 53
    invoke-static {p3}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->fetchImage()V

    .line 57
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p3, 0x32

    if-le p2, p3, :cond_0

    .line 58
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    const/high16 p3, 0x41900000    # 18.0f

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    .line 60
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainTextView:Lcom/shopkick/app/widget/SKTextView;

    iget-object p3, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->mainText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 63
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->nextButtonView:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->buttonText:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 64
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->nextButtonView:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    iget-object p2, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->nextButtonView:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0x1d

    invoke-virtual {p0, p2, p3}, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

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

    .line 34
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/TemplateScreen;->init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V

    const-string p1, "button_text"

    .line 35
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->buttonText:Ljava/lang/String;

    const-string p1, "button_url"

    .line 36
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->buttonUrl:Ljava/lang/String;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    const p1, 0x77a12

    .line 72
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onCancelEvent(I)V

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateOneButtonScreen;->buttonUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
