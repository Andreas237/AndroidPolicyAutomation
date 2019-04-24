.class public Lo/fib$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fib;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fib$c$c;,
        Lo/fib$c$a;
    }
.end annotation


# instance fields
.field a:Landroid/widget/LinearLayout;

.field b:Landroid/widget/LinearLayout;

.field c:Lo/fib;

.field d:Landroid/widget/Button;

.field e:Landroid/widget/Button;

.field f:I

.field private g:Landroid/content/Context;

.field private h:J

.field private i:Ljava/lang/String;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;>;"
        }
    .end annotation
.end field

.field private l:Landroid/view/LayoutInflater;

.field private m:Ljava/lang/String;

.field private n:Landroid/text/SpannableString;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/view/View$OnClickListener;

.field private r:Landroid/view/View$OnClickListener;

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/fib$c;->t:I

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lo/fib$c;->u:I

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fib$c;->c:Lo/fib;

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fib$c;->b:Landroid/widget/LinearLayout;

    .line 268
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fib$c;->a:Landroid/widget/LinearLayout;

    .line 270
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fib$c;->e:Landroid/widget/Button;

    .line 271
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fib$c;->d:Landroid/widget/Button;

    .line 91
    iput-object p1, p0, Lo/fib$c;->g:Landroid/content/Context;

    .line 92
    return-void
.end method

.method static synthetic a(Lo/fib$c;)Landroid/content/Context;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/fib$c;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/fib$c;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/fib$c;->q:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 454
    iget-object v0, p0, Lo/fib$c;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fib$c;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 455
    invoke-direct {p0}, Lo/fib$c;->e()V

    .line 457
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/fib$c;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/fib$c;->r:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private c()V
    .locals 20

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 377
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v12, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 381
    const/4 v13, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_3

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->l:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->commonui_custom_goods_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 384
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_name:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 385
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_cost:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 386
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_alert_dailog_img:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/ImageView;

    .line 388
    sget v0, Lcom/huawei/ui/main/R$drawable;->message_ad:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fib$c;->g:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/fis;->a(ILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v15

    .line 389
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messageCenter_ad_logo:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 391
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getOriginalPrice()Ljava/lang/String;

    move-result-object v9

    .line 392
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDiscountPrice()Ljava/lang/String;

    move-result-object v10

    .line 395
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "discountPrice = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "originalPrice = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/fib$c;->h:J

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDicountStartTime()J

    move-result-wide v2

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getDiscountEndTime()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lo/fib;->c(JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v11, v10

    goto :goto_1

    :cond_0
    move-object v11, v9

    .line 399
    :goto_1
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 400
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 402
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getName()Ljava/lang/String;

    move-result-object v17

    .line 403
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodp_last_suggest_kind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 406
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastRecommendStr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v18, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "show_service"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 408
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 410
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 411
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u00a5 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->pic_popup_device:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->pic_popup_device:I

    .line 414
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fib$c;->g:Landroid/content/Context;

    const/high16 v2, 0x42900000    # 72.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fib$c;->g:Landroid/content/Context;

    .line 415
    const/high16 v3, 0x42900000    # 72.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    .line 414
    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 415
    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->centerCrop()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/fib$c$3;

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    invoke-direct {v1, v2, v14, v15, v3}, Lo/fib$c$3;-><init>(Lo/fib$c;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    invoke-virtual {v0, v14, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    .line 431
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->k:Ljava/util/List;

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getPurchaseUrl()Ljava/lang/String;

    move-result-object v19

    .line 432
    new-instance v0, Lo/fib$c$2;

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    move-object/from16 v3, v17

    invoke-direct {v0, v1, v2, v3}, Lo/fib$c$2;-><init>(Lo/fib$c;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 381
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 449
    :cond_3
    return-void
.end method

.method private e()V
    .locals 3

    .line 460
    iget-object v0, p0, Lo/fib$c;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 462
    iget-object v0, p0, Lo/fib$c;->d:Landroid/widget/Button;

    iget-object v1, p0, Lo/fib$c;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget v0, p0, Lo/fib$c;->t:I

    if-eqz v0, :cond_0

    .line 464
    iget-object v0, p0, Lo/fib$c;->d:Landroid/widget/Button;

    iget-object v1, p0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/fib$c;->t:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    .line 466
    :cond_0
    iget v0, p0, Lo/fib$c;->f:I

    if-eqz v0, :cond_1

    .line 467
    iget-object v0, p0, Lo/fib$c;->d:Landroid/widget/Button;

    iget v1, p0, Lo/fib$c;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 470
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/fib$c;->q:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 471
    iget-object v0, p0, Lo/fib$c;->d:Landroid/widget/Button;

    new-instance v1, Lo/fib$c$a;

    invoke-direct {v1, p0}, Lo/fib$c$a;-><init>(Lo/fib$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    :cond_2
    iget-object v0, p0, Lo/fib$c;->e:Landroid/widget/Button;

    iget-object v1, p0, Lo/fib$c;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 475
    iget v0, p0, Lo/fib$c;->u:I

    if-eqz v0, :cond_3

    .line 476
    iget-object v0, p0, Lo/fib$c;->e:Landroid/widget/Button;

    iget-object v1, p0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/fib$c;->u:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_1

    .line 478
    :cond_3
    iget v0, p0, Lo/fib$c;->f:I

    if-eqz v0, :cond_4

    .line 479
    iget-object v0, p0, Lo/fib$c;->e:Landroid/widget/Button;

    iget v1, p0, Lo/fib$c;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 482
    :cond_4
    :goto_1
    iget-object v0, p0, Lo/fib$c;->r:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_5

    .line 483
    iget-object v0, p0, Lo/fib$c;->e:Landroid/widget/Button;

    new-instance v1, Lo/fib$c$c;

    invoke-direct {v1, p0}, Lo/fib$c$c;-><init>(Lo/fib$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 485
    :cond_5
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/fib$c;
    .locals 0

    .line 110
    iput-object p1, p0, Lo/fib$c;->i:Ljava/lang/String;

    .line 111
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/fib$c;
    .locals 0

    .line 130
    iput-object p1, p0, Lo/fib$c;->m:Ljava/lang/String;

    .line 131
    return-object p0
.end method

.method public b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/fib$c;
    .locals 1

    .line 181
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fib$c;->o:Ljava/lang/String;

    .line 182
    iput-object p2, p0, Lo/fib$c;->q:Landroid/view/View$OnClickListener;

    .line 183
    return-object p0
.end method

.method public b(Ljava/util/List;)Lo/fib$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;>;)Lo/fib$c;"
        }
    .end annotation

    .line 150
    iput-object p1, p0, Lo/fib$c;->k:Ljava/util/List;

    .line 151
    return-object p0
.end method

.method public d(J)Lo/fib$c;
    .locals 0

    .line 160
    iput-wide p1, p0, Lo/fib$c;->h:J

    .line 161
    return-object p0
.end method

.method public d(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/fib$c;
    .locals 1

    .line 231
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fib$c;->p:Ljava/lang/String;

    .line 232
    iput-object p2, p0, Lo/fib$c;->r:Landroid/view/View$OnClickListener;

    .line 233
    return-object p0
.end method

.method public d()Lo/fib;
    .locals 17

    .line 280
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->l:Landroid/view/LayoutInflater;

    .line 282
    new-instance v0, Lo/fib;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fib$c;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fib;-><init>(Landroid/content/Context;ILo/fib$1;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->c:Lo/fib;

    .line 283
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->l:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->commonui_custom_recommend_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 286
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 287
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v5, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 292
    iget v0, v5, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 293
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v5, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 294
    sget v0, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v9, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 295
    new-instance v10, Landroid/util/TypedValue;

    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 296
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 297
    sget v0, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v9, v0, v10}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 298
    sget v0, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition_contentTextSize:I

    invoke-virtual {v9, v0, v11}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 299
    sget v0, Lcom/huawei/ui/main/R$styleable;->customDialogDefinition_buttonTextColor:I

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_color_red1:I

    invoke-virtual {v9, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fib$c;->f:I

    .line 300
    iget v0, v10, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v6, v0

    .line 301
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    int-to-float v1, v6

    invoke-static {v0, v1}, Lo/fib;->d(Landroid/content/Context;F)I

    move-result v6

    .line 302
    iget v0, v11, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v7, v0

    .line 303
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    int-to-float v1, v7

    invoke-static {v0, v1}, Lo/fib;->d(Landroid/content/Context;F)I

    move-result v7

    .line 305
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 306
    goto :goto_0

    .line 307
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$color;->hw_show_color_red1:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fib$c;->f:I

    .line 309
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->custom_normal_titlebar_title_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->default_text_font_size_large2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 314
    :goto_0
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 317
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_title:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 318
    int-to-float v0, v6

    const/4 v1, 0x0

    invoke-virtual {v9, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->i:Ljava/lang/String;

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fib$c;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contentTextSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_text:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 326
    int-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 327
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->n:Landroid/text/SpannableString;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->n:Landroid/text/SpannableString;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto :goto_1

    .line 332
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->m:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->dialog_shop_linearlayout1:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->b:Landroid/widget/LinearLayout;

    .line 335
    sget v0, Lcom/huawei/ui/main/R$id;->custom_text_shop_dailog_container:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->a:Landroid/widget/LinearLayout;

    .line 337
    invoke-direct/range {p0 .. p0}, Lo/fib$c;->c()V

    .line 339
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->dialog_text_alert_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->e:Landroid/widget/Button;

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->dialog_text_alert_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/fib$c;->d:Landroid/widget/Button;

    .line 343
    invoke-direct/range {p0 .. p0}, Lo/fib$c;->b()V

    .line 345
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->c:Lo/fib;

    invoke-virtual {v0, v4}, Lo/fib;->setContentView(Landroid/view/View;)V

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->c:Lo/fib;

    invoke-virtual {v0}, Lo/fib;->getWindow()Landroid/view/Window;

    move-result-object v11

    .line 348
    const/16 v0, 0x50

    invoke-virtual {v11, v0}, Landroid/view/Window;->setGravity(I)V

    .line 349
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v11, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/view/WindowManager;

    .line 351
    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v13

    .line 352
    invoke-virtual {v11}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v14

    .line 353
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/fib;->d(Landroid/content/Context;F)I

    move-result v15

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->g:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/fib;->d(Landroid/content/Context;F)I

    move-result v16

    .line 355
    move/from16 v0, v16

    iput v0, v14, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 356
    invoke-virtual {v13}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v15, 0x2

    sub-int/2addr v0, v1

    iput v0, v14, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 357
    invoke-virtual {v11, v14}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 358
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v11, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 364
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fib$c;->c:Lo/fib;

    return-object v0
.end method
