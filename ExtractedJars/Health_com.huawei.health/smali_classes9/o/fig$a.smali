.class public Lo/fig$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field final synthetic d:Lo/fig;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lo/fig;Landroid/view/View;I)V
    .locals 8

    .line 353
    iput-object p1, p0, Lo/fig$a;->d:Lo/fig;

    .line 354
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 357
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 358
    invoke-static {p1}, Lo/fig;->c(Lo/fig;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 359
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 361
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 363
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 364
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 365
    sget v0, Lcom/huawei/ui/main/R$id;->item_padding_left:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fig$a;->i:Landroid/view/View;

    .line 366
    sget v0, Lcom/huawei/ui/main/R$id;->item_padding_right:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fig$a;->h:Landroid/view/View;

    .line 367
    goto/16 :goto_1

    .line 369
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 370
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 372
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 377
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 378
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 380
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 383
    invoke-static {p1}, Lo/fig;->c(Lo/fig;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {p1, v0, v1}, Lo/fig;->c(Lo/fig;Landroid/content/Context;F)I

    move-result v0

    sub-int v0, v5, v0

    int-to-float v0, v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float v7, v0, v1

    .line 384
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    invoke-static {p1}, Lo/fig;->c(Lo/fig;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {p1, v1, v2}, Lo/fig;->c(Lo/fig;Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 385
    invoke-virtual {p2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 386
    const-string v0, "SocialMessageAdapter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialMessageHodler width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", height = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    goto/16 :goto_1

    .line 390
    :pswitch_3
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 391
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 393
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 396
    invoke-static {p1}, Lo/fig;->c(Lo/fig;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {p1, v0, v1}, Lo/fig;->c(Lo/fig;Landroid/content/Context;F)I

    move-result v0

    sub-int v0, v5, v0

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float v7, v0, v1

    .line 397
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v7, v0

    invoke-static {p1}, Lo/fig;->c(Lo/fig;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {p1, v1, v2}, Lo/fig;->c(Lo/fig;Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 398
    invoke-virtual {p2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 399
    const-string v0, "SocialMessageAdapter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialMessageHodler width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", height = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    goto/16 :goto_1

    .line 403
    :pswitch_4
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 404
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 405
    sget v0, Lcom/huawei/ui/main/R$id;->tv_item_describe:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fig$a;->a:Landroid/widget/TextView;

    .line 406
    sget v0, Lcom/huawei/ui/main/R$id;->tv_item_date:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fig$a;->b:Landroid/widget/TextView;

    .line 407
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->k:Landroid/widget/ImageView;

    .line 408
    sget v0, Lcom/huawei/ui/main/R$id;->item_padding_top:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fig$a;->f:Landroid/view/View;

    .line 409
    goto :goto_1

    .line 411
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->item_social_message_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    .line 412
    sget v0, Lcom/huawei/ui/main/R$id;->img_item_social:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    .line 413
    sget v0, Lcom/huawei/ui/main/R$id;->item_padding_left:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fig$a;->i:Landroid/view/View;

    .line 414
    sget v0, Lcom/huawei/ui/main/R$id;->item_padding_right:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fig$a;->h:Landroid/view/View;

    .line 417
    :cond_0
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic a(Lo/fig$a;)Landroid/widget/TextView;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/fig$a;)Landroid/widget/LinearLayout;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->e:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lo/fig$a;)Landroid/widget/TextView;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/fig$a;)Landroid/widget/ImageView;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lo/fig$a;)Landroid/widget/ImageView;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic f(Lo/fig$a;)Landroid/view/View;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->f:Landroid/view/View;

    return-object v0
.end method

.method static synthetic g(Lo/fig$a;)Landroid/view/View;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->h:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lo/fig$a;)Landroid/view/View;
    .locals 1

    .line 342
    iget-object v0, p0, Lo/fig$a;->i:Landroid/view/View;

    return-object v0
.end method
