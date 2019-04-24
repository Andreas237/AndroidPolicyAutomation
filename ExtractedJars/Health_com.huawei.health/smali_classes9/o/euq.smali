.class public Lo/euq;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eus;>;"
        }
    .end annotation
.end field

.field private b:Lo/euo;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eus;>;"
        }
    .end annotation
.end field

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/support/v7/widget/RecyclerView;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private n:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 88
    invoke-direct {p0, p1}, Lo/euq;->e(Landroid/content/Context;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 92
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 93
    invoke-direct {p0, p1}, Lo/euq;->e(Landroid/content/Context;)V

    .line 94
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 97
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 98
    invoke-direct {p0, p1}, Lo/euq;->e(Landroid/content/Context;)V

    .line 99
    return-void
.end method

.method public static final a(Landroid/content/Context;F)I
    .locals 3

    .line 408
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 409
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d()V
    .locals 5

    .line 344
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    if-eqz v0, :cond_2

    .line 345
    const-string v0, "ConfigureRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "to screen: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v3}, Lo/euo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->k()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->a:Ljava/util/List;

    .line 347
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 348
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 350
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->b()I

    move-result v4

    .line 351
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 353
    :pswitch_0
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    .line 354
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto/16 :goto_0

    .line 358
    :pswitch_1
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 359
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto/16 :goto_0

    .line 363
    :pswitch_2
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 364
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto/16 :goto_0

    .line 368
    :pswitch_3
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_2

    .line 369
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto :goto_0

    .line 373
    :pswitch_4
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_2

    .line 374
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto :goto_0

    .line 379
    :pswitch_5
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->d()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 380
    :cond_0
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    goto :goto_0

    .line 384
    :cond_1
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    .line 386
    goto :goto_0

    .line 388
    :pswitch_6
    iget-object v0, p0, Lo/euq;->a:Ljava/util/List;

    iput-object v0, p0, Lo/euq;->d:Ljava/util/List;

    .line 389
    .line 397
    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private e(Landroid/content/Context;)V
    .locals 2

    .line 102
    iput-object p1, p0, Lo/euq;->c:Landroid/content/Context;

    .line 103
    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->recycler_view_configure_page:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->configure_recycler_title:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euq;->e:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_more:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/euq;->k:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_arrow:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/euq;->i:Landroid/widget/ImageView;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$id;->configure_recycler_view:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    .line 108
    sget v0, Lcom/huawei/ui/main/R$id;->configure_recycler_view_out:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/euq;->f:Landroid/widget/RelativeLayout;

    .line 109
    sget v0, Lcom/huawei/ui/main/R$id;->configure_recycler_marginBottom:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/euq;->n:Landroid/view/View;

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->configure_recycler_title_layout:I

    invoke-virtual {p0, v0}, Lo/euq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/euq;->h:Landroid/widget/RelativeLayout;

    .line 111
    iget-object v0, p0, Lo/euq;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/euq;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 116
    :cond_0
    iget-object v0, p0, Lo/euq;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 119
    :goto_0
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 120
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 121
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 7

    .line 416
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->d()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->b()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    .line 417
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 419
    :cond_1
    const/4 v4, 0x0

    .line 420
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 423
    :pswitch_0
    const/4 v4, 0x1

    .line 424
    goto :goto_0

    .line 427
    :pswitch_1
    const/4 v4, 0x2

    .line 428
    goto :goto_0

    .line 431
    :pswitch_2
    const/4 v4, 0x3

    .line 432
    .line 437
    :goto_0
    const/4 v5, 0x0

    .line 438
    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    :goto_1
    if-ltz v6, :cond_2

    .line 439
    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->f()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 440
    add-int/lit8 v5, v5, 0x1

    .line 438
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 446
    :cond_2
    if-lt v5, v4, :cond_3

    .line 447
    const-string v0, "ConfigureRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show marginBottomDisplay:  name\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v3}, Lo/euo;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , layout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v3}, Lo/euo;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", bottomCardNum:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", cardNumThresh:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x1

    return v0

    .line 450
    :cond_3
    const-string v0, "ConfigureRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show marginBottomDisplay:  name\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v3}, Lo/euo;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , layout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v3}, Lo/euo;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", bottomCardNum:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", cardNumThresh:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public e()Ljava/lang/Boolean;
    .locals 2

    .line 400
    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 401
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 403
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/euo;)V
    .locals 13

    .line 127
    iput-object p1, p0, Lo/euq;->b:Lo/euo;

    .line 129
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    if-nez v0, :cond_0

    .line 130
    return-void

    .line 134
    :cond_0
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v1}, Lo/euo;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    :cond_1
    iget-object v0, p0, Lo/euq;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lo/euq;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 140
    :cond_2
    invoke-direct {p0}, Lo/euq;->d()V

    .line 141
    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/euq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 142
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->a()Ljava/lang/String;

    move-result-object v4

    .line 144
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 145
    iget-object v0, p0, Lo/euq;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v1}, Lo/euo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 147
    :cond_3
    iget-object v0, p0, Lo/euq;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 151
    :goto_0
    invoke-virtual {p0}, Lo/euq;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 152
    iget-object v0, p0, Lo/euq;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 154
    :cond_4
    iget-object v0, p0, Lo/euq;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 156
    :goto_1
    new-instance v5, Lo/euj;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/euq;->d:Ljava/util/List;

    iget-object v2, p0, Lo/euq;->b:Lo/euo;

    invoke-direct {v5, v0, v1, v2}, Lo/euj;-><init>(Landroid/content/Context;Ljava/util/List;Lo/euo;)V

    .line 157
    iget-object v0, p0, Lo/euq;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 158
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 160
    :pswitch_0
    new-instance v7, Lo/euq$3;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v7, p0, v0, v1}, Lo/euq$3;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 171
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 172
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 173
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 174
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 175
    goto/16 :goto_5

    .line 177
    :pswitch_1
    new-instance v8, Lo/euq$4;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {v8, p0, v0, v1}, Lo/euq$4;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 188
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 189
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v8}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 190
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 191
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 192
    goto/16 :goto_5

    .line 194
    :pswitch_2
    const/4 v9, 0x0

    .line 195
    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 196
    new-instance v9, Lo/euq$5;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x4

    invoke-direct {v9, p0, v0, v1}, Lo/euq$5;-><init>(Lo/euq;Landroid/content/Context;I)V

    goto :goto_2

    .line 208
    :cond_5
    new-instance v9, Lo/euq$1;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {v9, p0, v0, v1}, Lo/euq$1;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 221
    :goto_2
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 222
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v9}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 223
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 224
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 225
    goto/16 :goto_5

    .line 227
    :pswitch_3
    new-instance v10, Lo/euq$6;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-direct {v10, p0, v0, v1}, Lo/euq$6;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 240
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 241
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v10}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 242
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 243
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 244
    goto/16 :goto_5

    .line 246
    :pswitch_4
    const/4 v11, 0x0

    .line 247
    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 248
    new-instance v11, Lo/euq$9;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x6

    invoke-direct {v11, p0, v0, v1}, Lo/euq$9;-><init>(Lo/euq;Landroid/content/Context;I)V

    goto :goto_3

    .line 261
    :cond_6
    new-instance v11, Lo/euq$10;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-direct {v11, p0, v0, v1}, Lo/euq$10;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 274
    :goto_3
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 275
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v11}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 276
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 277
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 278
    goto/16 :goto_5

    .line 280
    :pswitch_5
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->d()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_7

    .line 282
    new-instance v12, Lo/euq$8;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-direct {v12, p0, v0}, Lo/euq$8;-><init>(Lo/euq;Landroid/content/Context;)V

    .line 293
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 294
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v12}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 295
    goto :goto_4

    .line 297
    :cond_7
    new-instance v12, Lo/euq$7;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v12, p0, v0, v1}, Lo/euq$7;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 308
    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {v0, v1}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lo/euq;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/euq;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 309
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v12}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 311
    :goto_4
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 312
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 313
    goto :goto_5

    .line 315
    :pswitch_6
    new-instance v12, Lo/euq$2;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v12, p0, v0, v1}, Lo/euq$2;-><init>(Lo/euq;Landroid/content/Context;I)V

    .line 326
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 327
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v12}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 328
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 329
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 330
    .line 334
    :goto_5
    iget-object v0, p0, Lo/euq;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 336
    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public getRecyclerView()Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 456
    iget-object v0, p0, Lo/euq;->g:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 462
    iget-object v0, p0, Lo/euq;->b:Lo/euo;

    invoke-virtual {v0}, Lo/euo;->g()Ljava/lang/String;

    move-result-object v2

    .line 463
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 464
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 465
    const-string v0, "url"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 470
    iget-object v0, p0, Lo/euq;->c:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 474
    :cond_0
    return-void
.end method
