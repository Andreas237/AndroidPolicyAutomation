.class public Lcom/microblink/DynamicViewPort;
.super Landroid/widget/LinearLayout;


# instance fields
.field private rootView:Landroid/widget/LinearLayout;

.field private viewPortBottom:Landroid/view/View;

.field private viewPortHeight:Landroid/widget/LinearLayout;

.field private viewPortLeft:Landroid/view/View;

.field private viewPortRight:Landroid/view/View;

.field private viewPortTop:Landroid/view/View;

.field private viewPortWidth:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lcom/microblink/DynamicViewPort;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0, p1}, Lcom/microblink/DynamicViewPort;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0, p1}, Lcom/microblink/DynamicViewPort;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-direct {p0, p1}, Lcom/microblink/DynamicViewPort;->init(Landroid/content/Context;)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lcom/microblink/library/R$layout;->dynamic_view_port:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-virtual {p0, v1}, Lcom/microblink/DynamicViewPort;->setOrientation(I)V

    return-void
.end method

.method private setHeightViewPort(FF)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->rootView:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWeightSum()F

    move-result v0

    sub-float/2addr v0, p2

    sub-float/2addr v0, p1

    iget-object v1, p0, Lcom/microblink/DynamicViewPort;->viewPortTop:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortTop:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortHeight:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p2, p0, Lcom/microblink/DynamicViewPort;->viewPortHeight:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortBottom:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p2, p0, Lcom/microblink/DynamicViewPort;->viewPortBottom:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private setWidthViewPort(FF)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortHeight:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWeightSum()F

    move-result v0

    sub-float/2addr v0, p2

    sub-float/2addr v0, p1

    iget-object v1, p0, Lcom/microblink/DynamicViewPort;->viewPortLeft:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortLeft:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortWidth:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p2, p0, Lcom/microblink/DynamicViewPort;->viewPortWidth:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/microblink/DynamicViewPort;->viewPortRight:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object p2, p0, Lcom/microblink/DynamicViewPort;->viewPortRight:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 1

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    sget v0, Lcom/microblink/library/R$id;->parent_view:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->rootView:Landroid/widget/LinearLayout;

    sget v0, Lcom/microblink/library/R$id;->view_port_top:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortTop:Landroid/view/View;

    sget v0, Lcom/microblink/library/R$id;->view_port_height:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortHeight:Landroid/widget/LinearLayout;

    sget v0, Lcom/microblink/library/R$id;->view_port_bottom:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortBottom:Landroid/view/View;

    sget v0, Lcom/microblink/library/R$id;->view_port_left:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortLeft:Landroid/view/View;

    sget v0, Lcom/microblink/library/R$id;->view_port_right:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortRight:Landroid/view/View;

    sget v0, Lcom/microblink/library/R$id;->view_port_width:I

    invoke-virtual {p0, v0}, Lcom/microblink/DynamicViewPort;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortWidth:Landroid/widget/FrameLayout;

    return-void
.end method

.method public setBackgroundColorViewPort(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/DynamicViewPort;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortTop:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortLeft:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortBottom:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/microblink/DynamicViewPort;->viewPortRight:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setViewPort(FFFF)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const-string v0, "X value"

    invoke-static {p1, v0}, Lcom/microblink/internal/Validate;->validateParamValues(FLjava/lang/String;)V

    const-string v0, "Y value"

    invoke-static {p2, v0}, Lcom/microblink/internal/Validate;->validateParamValues(FLjava/lang/String;)V

    const-string v0, "Width"

    invoke-static {p3, v0}, Lcom/microblink/internal/Validate;->validateParamValues(FLjava/lang/String;)V

    const-string v0, "Height"

    invoke-static {p4, v0}, Lcom/microblink/internal/Validate;->validateParamValues(FLjava/lang/String;)V

    const-string v0, "width"

    invoke-static {p1, p3, v0}, Lcom/microblink/internal/Validate;->validateParamPairs(FFLjava/lang/String;)V

    const-string v0, "height"

    invoke-static {p2, p4, v0}, Lcom/microblink/internal/Validate;->validateParamPairs(FFLjava/lang/String;)V

    invoke-direct {p0, p2, p4}, Lcom/microblink/DynamicViewPort;->setHeightViewPort(FF)V

    invoke-direct {p0, p1, p3}, Lcom/microblink/DynamicViewPort;->setWidthViewPort(FF)V

    invoke-virtual {p0}, Lcom/microblink/DynamicViewPort;->invalidate()V

    return-void
.end method
