.class public Lcom/usebutton/sdk/internal/views/WebControls;
.super Landroid/widget/RelativeLayout;
.source "WebControls.java"


# instance fields
.field private mBack:Landroid/widget/ImageButton;

.field private mController:Lcom/usebutton/sdk/internal/Navigable;

.field private mForward:Landroid/widget/ImageButton;

.field private mOnNavigation:Lcom/usebutton/sdk/internal/Navigable$NavigationListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/WebControls;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/WebControls;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    new-instance p1, Lcom/usebutton/sdk/internal/views/WebControls$3;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/WebControls$3;-><init>(Lcom/usebutton/sdk/internal/views/WebControls;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mOnNavigation:Lcom/usebutton/sdk/internal/Navigable$NavigationListener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/WebControls;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/WebControls;->goBack()V

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/views/WebControls;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/WebControls;->goForward()V

    return-void
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/views/WebControls;)Lcom/usebutton/sdk/internal/Navigable;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mController:Lcom/usebutton/sdk/internal/Navigable;

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mBack:Landroid/widget/ImageButton;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mForward:Landroid/widget/ImageButton;

    return-object p0
.end method

.method private goBack()V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mController:Lcom/usebutton/sdk/internal/Navigable;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->back()V

    return-void
.end method

.method private goForward()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mController:Lcom/usebutton/sdk/internal/Navigable;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->forward()V

    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 2

    .line 31
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 32
    sget v0, Lcom/usebutton/sdk/R$id;->web_back:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/WebControls;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mBack:Landroid/widget/ImageButton;

    .line 33
    sget v0, Lcom/usebutton/sdk/R$id;->web_forward:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/WebControls;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mForward:Landroid/widget/ImageButton;

    .line 34
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mBack:Landroid/widget/ImageButton;

    new-instance v1, Lcom/usebutton/sdk/internal/views/WebControls$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/views/WebControls$1;-><init>(Lcom/usebutton/sdk/internal/views/WebControls;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mForward:Landroid/widget/ImageButton;

    new-instance v1, Lcom/usebutton/sdk/internal/views/WebControls$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/views/WebControls$2;-><init>(Lcom/usebutton/sdk/internal/views/WebControls;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setController(Lcom/usebutton/sdk/internal/Navigable;)V
    .locals 1

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mController:Lcom/usebutton/sdk/internal/Navigable;

    .line 58
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mController:Lcom/usebutton/sdk/internal/Navigable;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/Navigable;->getObservable()Lcom/usebutton/sdk/internal/functional/Observable;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls;->mOnNavigation:Lcom/usebutton/sdk/internal/Navigable$NavigationListener;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/functional/Observable;->subscribeWeak(Ljava/lang/Object;)V

    return-void
.end method
