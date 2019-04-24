.class public Lcom/huawei/openalliance/ad/views/PPSSplashView;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/c;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# instance fields
.field a:Lcom/huawei/openalliance/ad/views/h;

.field b:Landroid/widget/RelativeLayout;

.field c:Lcom/huawei/openalliance/ad/views/f;

.field private d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

.field private e:Landroid/view/View;

.field private f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/huawei/openalliance/ad/h/a/a;

.field private i:Lcom/huawei/openalliance/ad/j/a/h;

.field private j:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->k:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->k:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->k:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Ljava/lang/String;ILjava/lang/String;Z)Lcom/huawei/openalliance/ad/views/f;
    .locals 11

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getDeviceType()I

    move-result v9

    new-instance v0, Lcom/huawei/openalliance/ad/views/f;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move v3, v8

    move v4, v9

    move v5, p2

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/huawei/openalliance/ad/views/f;-><init>(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Z)V

    move-object v10, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-virtual {v10, v0}, Lcom/huawei/openalliance/ad/views/f;->setAdMediator(Lcom/huawei/openalliance/ad/h/a/a;)V

    return-object v10
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/l;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/l;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/c;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->i:Lcom/huawei/openalliance/ad/j/a/h;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getLogo2Text()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/PPSLabelView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    invoke-virtual {v0, v4}, Lcom/huawei/openalliance/ad/views/PPSLabelView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getLogo2Pos()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowAppLogoFlag_()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/PPSLabelView;->a(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/PPSLabelView;->setVisibility(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    sget v0, Lcom/huawei/openalliance/ad/R$layout;->hiad_view_splash_ad:I

    invoke-static {p1, v0, p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->rl_splash_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b:Landroid/widget/RelativeLayout;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_ad_label:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/PPSLabelView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->f:Lcom/huawei/openalliance/ad/views/PPSLabelView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/PPSLabelView;->setVisibility(I)V

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_wifi_loaded_tip_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;I)V
    .locals 5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PPSSplashView"

    const-string v1, "addSkipAdButton - activity finished, not add view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowAppLogoFlag_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSkipText_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSkipTextPos()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-direct {p0, v2, p2, v3, v4}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a(Ljava/lang/String;ILjava/lang/String;Z)Lcom/huawei/openalliance/ad/views/f;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    sget v1, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_skip:I

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/f;->setId(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/f;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/huawei/openalliance/ad/views/interfaces/e;
    .locals 2

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lcom/huawei/openalliance/ad/views/e;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/e;-><init>(Landroid/content/Context;)V

    return-object v0

    :sswitch_1
    new-instance v0, Lcom/huawei/openalliance/ad/views/d;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/d;-><init>(Landroid/content/Context;)V

    return-object v0

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/h;->e()V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/constant/AdLoadMode;)V
    .locals 2

    invoke-static {p1, p0}, Lcom/huawei/openalliance/ad/h/b;->a(Lcom/huawei/openalliance/ad/constant/AdLoadMode;Lcom/huawei/openalliance/ad/views/interfaces/c;)Lcom/huawei/openalliance/ad/h/a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->j:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/h/a/a;->a(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/h/a/a;->j()V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->c:Lcom/huawei/openalliance/ad/views/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/f;->setVisibility(I)V

    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/views/interfaces/e;)V
    .locals 6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PPSSplashView"

    const-string v1, "showAdView - activity finished, not add view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_2

    :cond_1
    return-void

    :cond_2
    instance-of v0, p1, Lcom/huawei/openalliance/ad/views/interfaces/d;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b()V

    :cond_3
    move-object v4, p1

    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b:Landroid/widget/RelativeLayout;

    if-ne v5, v0, :cond_4

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_4
    if-eqz v5, :cond_5

    instance-of v0, v5, Landroid/view/ViewGroup;

    if-eqz v0, :cond_5

    move-object v0, v5

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_5
    if-eqz v5, :cond_6

    return-void

    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/f/a;)Z
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/h;->setSloganShowListener(Lcom/huawei/openalliance/ad/f/a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/h;->d()Z

    move-result v2

    :cond_0
    return v2
.end method

.method public getAdSlotParam()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    return-object v0
.end method

.method public isLoaded()Z
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/h/a/a;->a()Lcom/huawei/openalliance/ad/constant/AdLoadState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADED:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isLoading()Z
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->k:Z

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/h/a/a;->a()Lcom/huawei/openalliance/ad/constant/AdLoadState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADING:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public loadAd()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->i:Lcom/huawei/openalliance/ad/j/a/h;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/h;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->k:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->i:Lcom/huawei/openalliance/ad/j/a/h;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/h;->b()V

    return-void
.end method

.method public setAdListener(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->j:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->i:Lcom/huawei/openalliance/ad/j/a/h;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/h;->a(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->h:Lcom/huawei/openalliance/ad/h/a/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/h/a/a;->a(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V

    :cond_0
    return-void
.end method

.method public setAdSlotParam(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/a;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/a;->b(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setWidth(I)V

    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setHeight(I)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    return-void
.end method

.method public setLogo(Landroid/view/View;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->e:Landroid/view/View;

    return-void
.end method

.method public setLogoVisibility(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setSloganResId(I)V
    .locals 5
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "PPSSplashView"

    const-string v1, "setSloganResId - activity finished, not add view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/exception/b;

    const-string v1, "Must invoke SplashAdView\'s setAdSlotParam method before invoke setSloganResId method"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/b;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    new-instance v0, Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/PPSSplashView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->d:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v2

    invoke-direct {v0, v1, v2, p1}, Lcom/huawei/openalliance/ad/views/h;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->b:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSSplashView;->a:Lcom/huawei/openalliance/ad/views/h;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/h;->e()V

    :cond_3
    return-void
.end method
