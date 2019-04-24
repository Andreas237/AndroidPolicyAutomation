.class public Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;,
        Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;
    }
.end annotation


# instance fields
.field protected a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

.field protected b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;"
        }
    .end annotation
.end field

.field protected d:Landroid/app/Activity;

.field protected e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:Z

.field protected k:Z

.field protected l:F

.field protected m:Landroid/view/View;

.field protected n:F

.field protected o:F

.field protected p:I

.field protected r:Landroid/os/Handler;

.field protected u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/animation/Animator;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;II)V
    .locals 1

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    .line 94
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->f:I

    .line 137
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$1;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->r:Landroid/os/Handler;

    .line 161
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;II)V

    .line 163
    return-void
.end method

.method private b(FLandroid/view/View;)Landroid/animation/ObjectAnimator;
    .locals 5

    .line 828
    const-string v0, "alpha"

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v0, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    .line 829
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-static {p2, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 830
    return-object v3

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private b(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;II)V
    .locals 0

    .line 166
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V

    .line 167
    invoke-virtual {p0, p4}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(I)V

    .line 168
    invoke-virtual {p0, p3}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d(I)V

    .line 169
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i()V

    .line 170
    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->h()V

    return-void
.end method

.method private c(Landroid/app/Activity;Lcom/huawei/wallet/ui/carddisplay/CardLayout;)V
    .locals 3

    .line 188
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    invoke-direct {v0}, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    .line 189
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 190
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->b:I

    .line 192
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->c:I

    .line 193
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v1, v2, Landroid/util/DisplayMetrics;->density:F

    iput v1, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    .line 195
    iput-object p2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    .line 196
    iput-object p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d:Landroid/app/Activity;

    .line 198
    return-void
.end method

.method private e(Lcom/huawei/wallet/model/unicard/UniCardInfo;)Ljava/lang/String;
    .locals 6

    .line 244
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 246
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 249
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g()Ljava/lang/String;

    move-result-object v2

    .line 250
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 252
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 253
    const/4 v0, 0x4

    if-lt v3, v0, :cond_1

    .line 256
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "**** "

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 257
    add-int/lit8 v0, v3, -0x4

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 258
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 263
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 835
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 837
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 838
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(FLandroid/view/View;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 839
    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    .line 842
    :cond_0
    return-void
.end method

.method private i()V
    .locals 3

    .line 174
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    if-lez v0, :cond_0

    .line 176
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    int-to-float v0, v0

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    const/high16 v1, 0x42480000    # 50.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    .line 182
    :goto_0
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->intValue()I

    move-result v2

    .line 183
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->setCardDisplayHeight(I)V

    .line 184
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 4

    .line 562
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->p:I

    if-nez v0, :cond_0

    .line 564
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getHeight()I

    move-result v3

    goto :goto_0

    .line 568
    :cond_0
    iget v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->p:I

    .line 570
    :goto_0
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e(I)I

    move-result v0

    sub-int v0, v3, v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public a(IIIF)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIF)Ljava/util/ArrayList<Landroid/animation/Animator;>;"
        }
    .end annotation

    .line 790
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 791
    const/4 v9, 0x0

    :goto_0
    if-ge v9, p2, :cond_0

    .line 793
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 795
    move-object v0, v10

    move v1, v9

    move v2, p1

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    move v4, p2

    move v5, p3

    iget v6, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->o:F

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->b(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 797
    new-instance v11, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v11, p0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 798
    invoke-virtual {v7, v11}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 799
    invoke-virtual {v7, v11}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 801
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 803
    :cond_0
    return-object v8
.end method

.method protected a()V
    .locals 3

    .line 851
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    .line 852
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    if-nez v0, :cond_0

    .line 854
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    .line 856
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 858
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->removeViewAt(I)V

    .line 859
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    .line 861
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->c(I)V

    .line 862
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c()V

    .line 864
    return-void
.end method

.method public a(II)V
    .locals 2

    .line 995
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 997
    :cond_0
    return-void

    .line 1000
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    .line 1001
    if-ge p1, v1, :cond_2

    if-lt p2, v1, :cond_3

    .line 1003
    :cond_2
    return-void

    .line 1006
    :cond_3
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    if-nez v0, :cond_4

    .line 1008
    return-void

    .line 1010
    :cond_4
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 237
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    .line 239
    return-void
.end method

.method public b(II)I
    .locals 3

    .line 514
    const/4 v1, 0x0

    .line 515
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 517
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 518
    invoke-virtual {p0, p1, p2, v2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c(III)I

    move-result v1

    .line 520
    :cond_0
    return v1
.end method

.method public b()V
    .locals 3

    .line 445
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "display cardContainer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 446
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    if-nez v0, :cond_0

    .line 448
    return-void

    .line 450
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    .line 451
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->removeAllViews()V

    .line 452
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-boolean v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->setAllCollapse(Z)V

    .line 453
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e()V

    .line 455
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1085
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    .line 1086
    return-void
.end method

.method public b(Landroid/view/View;ILandroid/view/View;)V
    .locals 1

    .line 652
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(Landroid/view/View;ILandroid/view/View;F)V

    .line 653
    return-void
.end method

.method public b(Landroid/view/View;ILandroid/view/View;F)V
    .locals 6

    .line 666
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onItemClick isAnimation:: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 667
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    if-eqz v0, :cond_0

    .line 670
    return-void

    .line 672
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    if-eqz v0, :cond_2

    .line 675
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 677
    return-void

    .line 680
    :cond_1
    move-object v0, p0

    move v1, p2

    move-object v2, p1

    move-object v3, p3

    iget v4, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->f:I

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e(ILandroid/view/View;Landroid/view/View;IF)V

    goto :goto_0

    .line 685
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a()V

    .line 689
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-boolean v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->setAllCollapse(Z)V

    .line 690
    return-void
.end method

.method public b(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;)V
    .locals 1

    .line 207
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e:Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$OnAnimateListener;

    .line 208
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/animation/Animator;>;)V"
        }
    .end annotation

    .line 885
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 886
    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 887
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    const/4 v1, -0x1

    invoke-direct {v0, p0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 889
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-direct {v3, v0}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 890
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 891
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    .line 892
    return-void
.end method

.method public c(III)I
    .locals 5

    .line 526
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 528
    const/4 v0, 0x0

    return v0

    .line 530
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 533
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v0, v1

    add-int/lit8 v1, p3, -0x2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v2, v2, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v3, v0

    goto :goto_0

    .line 539
    :cond_1
    add-int/lit8 v0, p3, -0x2

    sub-int v4, v0, p2

    .line 540
    if-gez v4, :cond_2

    .line 542
    const/4 v4, 0x0

    .line 545
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float/2addr v0, v1

    int-to-float v1, v4

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v2, v2, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v3, v0

    .line 549
    :goto_0
    return v3
.end method

.method public c(IIIF)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIF)Ljava/util/ArrayList<Landroid/animation/Animator;>;"
        }
    .end annotation

    .line 808
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 810
    const/4 v9, 0x0

    :goto_0
    if-ge v9, p2, :cond_0

    .line 812
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 814
    move-object v0, v10

    move v1, v9

    move v2, p1

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v3, v3, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    move v4, p2

    move v5, p3

    iget v6, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->o:F

    invoke-static/range {v0 .. v6}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->a(Landroid/view/View;IIFIIF)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 816
    new-instance v11, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v11, p0, v9}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 817
    invoke-virtual {v8, v11}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 818
    invoke-virtual {v8, v11}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 820
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 810
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 822
    :cond_0
    return-object v7
.end method

.method protected c()V
    .locals 7

    .line 869
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v3

    .line 870
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 872
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v4}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 873
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    invoke-static {v5, v4, v3, v0, v1}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->c(Landroid/view/View;IIIF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 874
    new-instance v6, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;

    invoke-direct {v6, p0, v4}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager$AnimateListener;-><init>(Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;I)V

    .line 875
    invoke-virtual {v2, v6}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 876
    invoke-virtual {v2, v6}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 878
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 870
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 880
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(Ljava/util/List;)V

    .line 881
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 1130
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->f:I

    .line 1131
    return-void
.end method

.method public d()I
    .locals 4

    .line 623
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 625
    const/4 v0, 0x0

    return v0

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 628
    if-nez v2, :cond_1

    .line 630
    const/4 v0, 0x0

    return v0

    .line 633
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    add-int/lit8 v1, v2, -0x1

    int-to-float v1, v1

    mul-float v3, v0, v1

    .line 634
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    if-nez v0, :cond_2

    .line 636
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a:Lcom/huawei/wallet/ui/carddisplay/ScreenParam;

    iget v0, v0, Lcom/huawei/wallet/ui/carddisplay/ScreenParam;->e:F

    const/high16 v1, 0x434b0000    # 203.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    .line 639
    :cond_2
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    int-to-float v0, v0

    add-float/2addr v0, v3

    float-to-int v0, v0

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 1095
    iput p1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->h:I

    .line 1096
    return-void
.end method

.method public d(II)V
    .locals 3

    .line 1021
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onDragPostionChange= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", newPosition= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1023
    invoke-virtual {p0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a(II)V

    .line 1024
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-virtual {p0, v0, p1, p2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d(Ljava/util/List;II)V

    .line 1026
    return-void
.end method

.method protected d(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;II)V"
        }
    .end annotation

    .line 1030
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 1032
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " before change card id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1033
    goto :goto_0

    .line 1035
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 1037
    if-ge p2, p3, :cond_2

    .line 1039
    move v4, p2

    :goto_1
    if-ge v4, p3, :cond_1

    .line 1042
    add-int/lit8 v0, v4, 0x1

    invoke-static {p1, v4, v0}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 1039
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    goto :goto_3

    .line 1046
    :cond_2
    if-le p2, p3, :cond_3

    .line 1048
    move v4, p2

    :goto_2
    if-le v4, p3, :cond_3

    .line 1050
    add-int/lit8 v0, v4, -0x1

    invoke-static {p1, v4, v0}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 1048
    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    .line 1054
    :cond_3
    :goto_3
    invoke-interface {p1, p3, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1056
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 1058
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " after change card id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1059
    goto :goto_4

    .line 1061
    :cond_4
    return-void
.end method

.method public e(I)I
    .locals 1

    .line 502
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getLastClickItemPos()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(II)I

    move-result v0

    return v0
.end method

.method protected e(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;
    .locals 9

    .line 409
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d:Landroid/app/Activity;

    invoke-direct {p0, p2}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e(Lcom/huawei/wallet/model/unicard/UniCardInfo;)Ljava/lang/String;

    move-result-object v2

    .line 410
    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->f()I

    move-result v4

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->i()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    move-object v7, v0

    .line 411
    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->k()I

    move-result v6

    .line 412
    const/4 v0, 0x1

    if-ne v6, v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$drawable;->card_enable:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setCardStateBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 417
    :cond_0
    const/4 v0, 0x4

    if-ne v6, v0, :cond_1

    .line 420
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$drawable;->card_nonreal:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setCardStateBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 423
    :cond_1
    const/4 v0, 0x3

    if-ne v6, v0, :cond_2

    .line 426
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->d:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/base/R$drawable;->card_unreal:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setCardStateBitmap(Landroid/graphics/Bitmap;)V

    .line 430
    :cond_2
    :goto_0
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->h:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    invoke-direct {v8, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 431
    const/16 v0, 0xe

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 432
    invoke-virtual {v7, v8}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 433
    invoke-virtual {v7, p1}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setId(I)V

    .line 434
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0, v7, p1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->addView(Landroid/view/View;I)V

    .line 435
    return-object v7
.end method

.method protected e()V
    .locals 7

    .line 268
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 270
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initCardAnimImageViewList cardAnimInfoList.SIZE="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 271
    const/4 v3, 0x0

    .line 273
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    .line 275
    invoke-virtual {p0, v3, v5}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->e(ILcom/huawei/wallet/model/unicard/UniCardInfo;)Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;

    move-result-object v6

    .line 276
    int-to-float v0, v3

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->l:F

    mul-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/wallet/ui/carddisplay/CardAnimImageView;->setY(F)V

    .line 277
    add-int/lit8 v3, v3, 0x1

    .line 278
    goto :goto_0

    .line 280
    :cond_0
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 1073
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onDragStop= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", newPosition= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1074
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b()V

    .line 1076
    return-void
.end method

.method protected e(ILandroid/view/View;Landroid/view/View;IF)V
    .locals 8

    .line 714
    iput-object p3, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->m:Landroid/view/View;

    .line 715
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    .line 716
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    if-nez v0, :cond_0

    .line 718
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    .line 723
    :cond_0
    if-eqz p3, :cond_2

    .line 725
    const/4 v0, 0x4

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 726
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 727
    if-nez v5, :cond_1

    .line 729
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v5, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 733
    :cond_1
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->h:I

    iput v0, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 734
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->g:I

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p5

    add-float v6, v0, v1

    .line 735
    invoke-virtual {p3, v6}, Landroid/view/View;->setY(F)V

    .line 736
    invoke-virtual {p3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 737
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v1

    invoke-virtual {v0, p3, v1}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->addView(Landroid/view/View;I)V

    .line 738
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 739
    goto :goto_0

    .line 742
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getChildCount()I

    move-result v4

    .line 745
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/wallet/ui/carddisplay/AnimUtil;->c(I)V

    .line 749
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->p:I

    if-nez v0, :cond_3

    .line 751
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardLayout;->getHeight()I

    move-result v5

    .line 752
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " runAnimForOneExpand firstCardDistanceToBottom is 0 and height="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 757
    :cond_3
    iget v5, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->p:I

    .line 758
    const-string v0, "CardDisplayManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " runAnimForOneExpand firstCardDistanceToBottom is not 0 and height="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 762
    :goto_1
    const/4 v0, 0x1

    if-ne p4, v0, :cond_4

    .line 764
    invoke-virtual {p0, p1, v4, v5, p5}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c(IIIF)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    goto :goto_2

    .line 766
    :cond_4
    const/4 v0, 0x2

    if-ne p4, v0, :cond_5

    .line 768
    invoke-virtual {p0, p1, v4, v5, p5}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->a(IIIF)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    .line 771
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 773
    return-void

    .line 776
    :cond_6
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v6

    .line 777
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->r:Landroid/os/Handler;

    const-wide/16 v1, 0x64

    sub-long v1, v6, v1

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 779
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->u:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->b(Ljava/util/List;)V

    .line 781
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 782
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 783
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 785
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1115
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->k:Z

    return v0
.end method

.method public g()I
    .locals 1

    .line 1140
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 1142
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 1144
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()Z
    .locals 1

    .line 1100
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/CardDisplayManager;->i:Z

    return v0
.end method
