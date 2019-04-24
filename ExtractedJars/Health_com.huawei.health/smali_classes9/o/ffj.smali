.class public Lo/ffj;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ffj$d;,
        Lo/ffj$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ffh;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->a:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->e:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->c:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->f:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->g:I

    .line 70
    const-string v0, "--"

    iput-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/ffj;->h:I

    .line 78
    invoke-direct {p0, p1}, Lo/ffj;->a(Landroid/content/Context;)V

    .line 79
    return-void
.end method

.method private a(D)Ljava/lang/String;
    .locals 5

    .line 345
    const-string v4, ""

    .line 346
    const-wide v0, 0x415b774000000000L    # 7200000.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    .line 347
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p1, v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 349
    :cond_0
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p1, v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v4

    .line 351
    :goto_0
    return-object v4
.end method

.method private a(DI)Ljava/lang/String;
    .locals 1

    .line 455
    const/4 v0, 0x1

    invoke-static {p1, p2, v0, p3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .line 82
    iput-object p1, p0, Lo/ffj;->b:Landroid/content/Context;

    .line 84
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_120:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->c:I

    .line 85
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_56:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->a:I

    .line 86
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_114:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->f:I

    .line 87
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_48:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->e:I

    .line 88
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_64:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->k:I

    .line 89
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_65:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffj;->g:I

    .line 90
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    .line 91
    return-void
.end method

.method private a(Lo/ffj$e;Landroid/content/Context;I)V
    .locals 4

    .line 447
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowAllSumImperialUnit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    invoke-static {p1}, Lo/ffj$e;->q(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p2}, Lo/ffj;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    invoke-static {p1}, Lo/ffj$e;->u(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p2}, Lo/ffj;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    invoke-static {p1}, Lo/ffj$e;->t(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p2}, Lo/ffj;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 451
    invoke-static {p1}, Lo/ffj$e;->r(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, p2, p3}, Lo/ffj;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 452
    return-void
.end method

.method private b(D)Ljava/lang/String;
    .locals 3

    .line 716
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 717
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 719
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(IDI)Ljava/lang/String;
    .locals 6

    .line 690
    const-wide v4, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 691
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, p2

    if-eqz v0, :cond_0

    const-wide v0, -0x40e5c91d14e3bcd3L    # -1.0E-4

    cmpl-double v0, p2, v0

    if-lez v0, :cond_3

    cmpg-double v0, p2, v4

    if-gez v0, :cond_3

    .line 692
    :cond_0
    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    .line 693
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 695
    :cond_1
    if-nez p1, :cond_2

    .line 696
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 698
    :cond_2
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 703
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 417
    const-string v4, ""

    .line 418
    if-nez p1, :cond_0

    .line 419
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumRumUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    return-object v4

    .line 422
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 423
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_run_unit_inch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 425
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_run_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 427
    :goto_0
    return-object v4
.end method

.method private b(Landroid/content/Context;I)Ljava/lang/String;
    .locals 5

    .line 432
    const-string v4, ""

    .line 433
    if-nez p1, :cond_0

    .line 434
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumFitUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    return-object v4

    .line 437
    :cond_0
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->k()J

    move-result-wide v0

    const-wide/32 v2, 0x6ddd00

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 438
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_fit_unit_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 440
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_fit_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 442
    :goto_0
    return-object v4
.end method

.method private b(Lo/ffj$d;Lo/fff;)V
    .locals 5

    .line 537
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 538
    :cond_0
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewholder or data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    return-void

    .line 542
    :cond_1
    invoke-direct {p0, p1}, Lo/ffj;->c(Lo/ffj$d;)V

    .line 544
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 546
    invoke-virtual {p2}, Lo/fff;->f()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_a

    .line 548
    invoke-virtual {p2}, Lo/fff;->g()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_2

    invoke-virtual {p2}, Lo/fff;->g()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_4

    .line 549
    :cond_2
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v1

    float-to-double v1, v1

    invoke-direct {p0, v1, v2}, Lo/ffj;->e(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 550
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {p0, v1, v2}, Lo/ffj;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 553
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    :cond_3
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v1

    float-to-double v1, v1

    invoke-direct {p0, v1, v2}, Lo/ffj;->c(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_sport_history_list_pace:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 558
    :cond_4
    invoke-virtual {p2}, Lo/fff;->g()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_7

    .line 559
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v1

    float-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 560
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1}, Lo/ffj;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 561
    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 562
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 564
    :cond_5
    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_6

    .line 565
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 567
    :cond_6
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v1

    float-to-double v1, v1

    invoke-direct {p0, v1, v2}, Lo/ffj;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    :goto_0
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_sport_history_list_climb:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 571
    :cond_7
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v1

    float-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1}, Lo/ffj;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    invoke-virtual {p2}, Lo/fff;->g()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ffj;->e(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 574
    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_8

    .line 575
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 577
    :cond_8
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v1, v2, v1

    const/high16 v2, 0x45610000    # 3600.0f

    mul-float/2addr v1, v2

    float-to-double v1, v1

    const/4 v3, 0x5

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 580
    :cond_9
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 582
    :goto_1
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_sport_history_list_pace:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 586
    :goto_2
    invoke-static {p1}, Lo/ffj$d;->h(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-virtual {p2}, Lo/fff;->g()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lo/ffj;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 587
    :cond_a
    invoke-virtual {p2}, Lo/fff;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_b

    .line 588
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 589
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 590
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    invoke-static {p1}, Lo/ffj$d;->h(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 592
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ico_health_list_calorie:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_3

    .line 595
    :cond_b
    invoke-static {p1}, Lo/ffj$d;->b(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->b()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 596
    invoke-static {p1}, Lo/ffj$d;->d(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 597
    invoke-virtual {p2}, Lo/fff;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_c

    .line 598
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->i()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_sport_history_list_heartrate:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 600
    invoke-static {p1}, Lo/ffj$d;->h(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 601
    :cond_c
    invoke-virtual {p2}, Lo/fff;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_d

    .line 602
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 603
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 604
    invoke-static {p1}, Lo/ffj$d;->h(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 608
    :cond_d
    :goto_3
    invoke-static {p1}, Lo/ffj$d;->f(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->k()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {p0, v3, v1, v2}, Lo/ffj;->d(IJ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 609
    invoke-static {p1}, Lo/ffj$d;->i(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->h()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {p0, v3, v1, v2}, Lo/ffj;->d(IJ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 611
    invoke-static {p1}, Lo/ffj$d;->k(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 612
    invoke-virtual {p2}, Lo/fff;->c()I

    move-result v0

    if-nez v0, :cond_e

    .line 613
    invoke-static {p1}, Lo/ffj$d;->n(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    .line 615
    :cond_e
    invoke-static {p1}, Lo/ffj$d;->n(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 616
    invoke-static {p1}, Lo/ffj$d;->n(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Lo/fff;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 618
    :goto_4
    return-void
.end method

.method private b(Lo/ffj$e;I)V
    .locals 5

    .line 316
    iget v0, p0, Lo/ffj;->h:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 318
    :sswitch_0
    invoke-static {p1}, Lo/ffj$e;->p(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 319
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->a()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 318
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    invoke-static {p1}, Lo/ffj$e;->l(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1, p2}, Lo/ffj;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    goto/16 :goto_0

    .line 323
    :sswitch_1
    invoke-static {p1}, Lo/ffj$e;->p(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 324
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->g()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 323
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    invoke-static {p1}, Lo/ffj$e;->l(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1, p2}, Lo/ffj;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    goto :goto_0

    .line 328
    :sswitch_2
    invoke-static {p1}, Lo/ffj$e;->p(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 329
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->h()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 328
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    invoke-static {p1}, Lo/ffj$e;->l(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1, p2}, Lo/ffj;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    goto :goto_0

    .line 333
    :sswitch_3
    invoke-static {p1}, Lo/ffj$e;->p(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 334
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->k()J

    move-result-wide v1

    long-to-double v1, v1

    .line 333
    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    invoke-static {p1}, Lo/ffj$e;->l(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, v1, p2}, Lo/ffj;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
    .line 340
    :goto_0
    invoke-static {p1}, Lo/ffj$e;->m(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->f()D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    invoke-static {p1}, Lo/ffj$e;->o(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->i()I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    return-void

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_1
        0x102 -> :sswitch_0
        0x103 -> :sswitch_2
        0x2711 -> :sswitch_3
    .end sparse-switch
.end method

.method private b(ZLandroid/view/View;Lo/ffj$e;IIID)V
    .locals 3

    .line 241
    if-eqz p1, :cond_2

    iget v0, p0, Lo/ffj;->h:I

    invoke-direct {p0, v0, p7, p8}, Lo/ffj;->c(ID)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 242
    invoke-static {p3}, Lo/ffj$e;->d(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget v1, p0, Lo/ffj;->h:I

    invoke-direct {p0, v1, p7, p8}, Lo/ffj;->c(ID)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 243
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    sget v0, Lcom/huawei/ui/main/R$id;->divider_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 247
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->divider_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 248
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 250
    :goto_1
    new-instance v2, Landroid/widget/AbsListView$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v2, v0, p4}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 251
    invoke-static {p3}, Lo/ffj$e;->d(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 254
    invoke-direct {p0, p3, p6}, Lo/ffj;->e(Lo/ffj$e;I)V

    goto :goto_2

    .line 256
    :cond_2
    invoke-static {p3}, Lo/ffj$e;->d(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 257
    new-instance v2, Landroid/widget/AbsListView$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v2, v0, p5}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 260
    :goto_2
    invoke-virtual {p2, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    return-void
.end method

.method private c(D)Ljava/lang/String;
    .locals 6

    .line 764
    double-to-float v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 765
    float-to-double v0, v5

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    float-to-double v0, v5

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    .line 766
    :cond_0
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 768
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 769
    float-to-double v0, v5

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 771
    :cond_2
    invoke-static {v5}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    .line 772
    return-object v4
.end method

.method private c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 402
    const-string v4, ""

    .line 403
    if-nez p1, :cond_0

    .line 404
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumWalkUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    return-object v4

    .line 407
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 408
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_walk_unit_inch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 410
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_walk_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 412
    :goto_0
    return-object v4
.end method

.method private c(Landroid/content/Context;I)Ljava/lang/String;
    .locals 5

    .line 355
    const-string v4, ""

    .line 356
    if-nez p1, :cond_0

    .line 357
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireCatetoryUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    return-object v4

    .line 360
    :cond_0
    iget v0, p0, Lo/ffj;->h:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 364
    :sswitch_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_mi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 369
    goto :goto_0

    .line 371
    :sswitch_1
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->k()J

    move-result-wide v0

    const-wide/32 v2, 0x6ddd00

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 372
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_catetory_time_unit_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 374
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_fit_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 376
    .line 381
    :goto_0
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_0
        0x102 -> :sswitch_0
        0x103 -> :sswitch_0
        0x2711 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Lo/ffj$d;)V
    .locals 2

    .line 626
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 627
    invoke-static {p1}, Lo/ffj$d;->a(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 628
    invoke-static {p1}, Lo/ffj$d;->g(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 629
    invoke-static {p1}, Lo/ffj$d;->h(Lo/ffj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 631
    :cond_0
    invoke-static {p1}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 632
    invoke-static {p1}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 634
    :cond_1
    invoke-static {p1}, Lo/ffj$d;->n(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 635
    invoke-static {p1}, Lo/ffj$d;->n(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 637
    :cond_2
    return-void
.end method

.method private c(ID)Z
    .locals 3

    .line 266
    const/4 v2, 0x0

    .line 267
    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    .line 269
    :sswitch_0
    const-wide/16 v0, 0x0

    cmpl-double v0, p2, v0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    .line 270
    :goto_0
    goto :goto_1

    .line 275
    :sswitch_1
    const/4 v2, 0x1

    .line 276
    .line 280
    :goto_1
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x101 -> :sswitch_1
        0x102 -> :sswitch_1
        0x103 -> :sswitch_1
        0x2711 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(IDI)Ljava/lang/String;
    .locals 7

    .line 652
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ffj;->b(IDI)Ljava/lang/String;

    move-result-object v4

    .line 653
    if-eqz v4, :cond_0

    return-object v4

    .line 654
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 656
    :pswitch_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 657
    const/4 v0, 0x3

    invoke-static {p2, p3, v0}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 658
    const-wide v0, 0x3f747ae147ae147bL    # 0.005

    cmpg-double v0, v5, v0

    if-gez v0, :cond_1

    .line 659
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 661
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v5, v6, v0}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 664
    :cond_2
    const-wide v0, 0x3f747ae147ae147bL    # 0.005

    cmpg-double v0, p2, v0

    if-gez v0, :cond_3

    .line 665
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 667
    :cond_3
    const/4 v0, 0x2

    invoke-direct {p0, p2, p3, v0}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 671
    :pswitch_1
    const-wide v0, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, p2, v0

    if-gtz v0, :cond_4

    const-wide v0, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_5

    .line 672
    :cond_4
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 674
    :cond_5
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-static {v0, v1, p2, p3}, Lo/dhb;->c(ZID)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 676
    :pswitch_2
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v1, p2, p3}, Lo/dhb;->c(ZID)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 678
    :pswitch_3
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p2, v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 680
    :pswitch_4
    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 682
    :pswitch_5
    invoke-direct {p0, p2, p3}, Lo/ffj;->a(D)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 684
    :goto_0
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method private d(IJ)Ljava/lang/String;
    .locals 3

    .line 776
    const-wide/16 v0, 0x0

    cmp-long v0, v0, p2

    if-nez v0, :cond_0

    .line 777
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    .line 779
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 781
    :sswitch_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 782
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 784
    :sswitch_1
    const-wide/16 v0, 0x3e8

    div-long v0, p2, v0

    long-to-int v0, v0

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 787
    :goto_0
    iget-object v0, p0, Lo/ffj;->i:Ljava/lang/String;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 386
    const-string v4, ""

    .line 387
    if-nez p1, :cond_0

    .line 388
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumRideUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    return-object v4

    .line 391
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 392
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_ride_unit_inch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 394
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_history_sum_ride_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 396
    :goto_0
    return-object v4
.end method

.method private d(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 792
    const-string v0, ""

    .line 793
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 798
    :pswitch_0
    invoke-direct {p0, p1}, Lo/ffj;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 799
    goto :goto_0

    .line 802
    :pswitch_1
    invoke-direct {p0, p1}, Lo/ffj;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 803
    goto :goto_0

    .line 806
    :pswitch_2
    invoke-direct {p0, p1}, Lo/ffj;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 807
    goto :goto_0

    .line 810
    :pswitch_3
    invoke-direct {p0, p1}, Lo/ffj;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 811
    .line 815
    :goto_0
    :pswitch_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private d(Lo/ffj$e;I)V
    .locals 5

    .line 304
    invoke-static {p1}, Lo/ffj$e;->h(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 305
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->a()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 304
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    invoke-static {p1}, Lo/ffj$e;->g(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 307
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->g()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 306
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    invoke-static {p1}, Lo/ffj$e;->f(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 309
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->h()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    .line 308
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    invoke-static {p1}, Lo/ffj$e;->n(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 311
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->k()J

    move-result-wide v1

    long-to-double v1, v1

    .line 310
    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lo/ffj;->d(IDI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    return-void
.end method

.method private e(D)Ljava/lang/String;
    .locals 3

    .line 708
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 709
    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 711
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/ffj;->a(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 728
    const-string v4, ""

    .line 729
    if-nez p1, :cond_0

    .line 730
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumFitUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    return-object v4

    .line 733
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 734
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 736
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 738
    :goto_0
    return-object v4
.end method

.method private e(Landroid/content/Context;I)Ljava/lang/String;
    .locals 5

    .line 749
    const-string v4, ""

    .line 750
    if-nez p1, :cond_0

    .line 751
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSumFitUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    return-object v4

    .line 754
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 755
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-virtual {v0, v1, p2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 757
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 759
    :goto_0
    return-object v4
.end method

.method private e(Lo/ffj$e;I)V
    .locals 2

    .line 287
    iget v0, p0, Lo/ffj;->h:I

    if-nez v0, :cond_0

    .line 288
    invoke-static {p1}, Lo/ffj$e;->i(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 289
    invoke-static {p1}, Lo/ffj$e;->k(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 291
    invoke-direct {p0, p1, p2}, Lo/ffj;->d(Lo/ffj$e;I)V

    .line 293
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-direct {p0, p1, v0, p2}, Lo/ffj;->a(Lo/ffj$e;Landroid/content/Context;I)V

    goto :goto_0

    .line 295
    :cond_0
    invoke-static {p1}, Lo/ffj$e;->k(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 296
    invoke-static {p1}, Lo/ffj$e;->i(Lo/ffj$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 298
    invoke-direct {p0, p1, p2}, Lo/ffj;->b(Lo/ffj$e;I)V

    .line 300
    :goto_0
    return-void
.end method

.method private e(I)Z
    .locals 1

    .line 621
    const/16 v0, 0x103

    if-eq p1, v0, :cond_0

    const/16 v0, 0x109

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 848
    const-string v4, ""

    .line 849
    if-nez p1, :cond_0

    .line 850
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireBikeUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    return-object v4

    .line 853
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 854
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 856
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 858
    :goto_0
    return-object v4
.end method

.method private g(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 834
    const-string v5, ""

    .line 835
    if-nez p1, :cond_0

    .line 836
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireSwinUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    return-object v5

    .line 839
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 840
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 842
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 844
    :goto_0
    return-object v5
.end method

.method private h(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 862
    const-string v4, ""

    .line 863
    if-nez p1, :cond_0

    .line 864
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireRunUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    return-object v4

    .line 867
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 868
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 870
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 872
    :goto_0
    return-object v4
.end method

.method private k(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 819
    const-string v4, ""

    .line 820
    if-nez p1, :cond_0

    .line 821
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireClimHillUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    return-object v4

    .line 824
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 825
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 827
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 829
    :goto_0
    return-object v4
.end method


# virtual methods
.method public e(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ffh;>;I)V"
        }
    .end annotation

    .line 99
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetGroupData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iput-object p1, p0, Lo/ffj;->d:Ljava/util/List;

    .line 101
    iput p2, p0, Lo/ffj;->h:I

    .line 103
    return-void
.end method

.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .line 131
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    .line 132
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 135
    :cond_1
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->b()I

    move-result v0

    if-gt v0, p2, :cond_2

    .line 136
    const/4 v0, 0x0

    return-object v0

    .line 139
    :cond_2
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p2}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 149
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 461
    if-nez p4, :cond_1

    .line 462
    new-instance v4, Lo/ffj$d;

    invoke-direct {v4}, Lo/ffj$d;-><init>()V

    .line 463
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_sport_history_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 465
    new-instance v5, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/ffj;->k:I

    const/4 v1, -0x1

    invoke-direct {v5, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 467
    invoke-virtual {p4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 468
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_chief_sport_data_text:I

    .line 469
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 468
    invoke-static {v4, v0}, Lo/ffj$d;->d(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 470
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_chief_sport_data_unit:I

    .line 471
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 470
    invoke-static {v4, v0}, Lo/ffj$d;->e(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 472
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_left_date_text:I

    .line 473
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 472
    invoke-static {v4, v0}, Lo/ffj$d;->c(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 474
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_center_text:I

    .line 475
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 474
    invoke-static {v4, v0}, Lo/ffj$d;->b(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 476
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_right_text:I

    .line 477
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 476
    invoke-static {v4, v0}, Lo/ffj$d;->a(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 478
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_child_item_left_img:I

    .line 479
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 478
    invoke-static {v4, v0}, Lo/ffj$d;->c(Lo/ffj$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 480
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_running_history_track_type_img:I

    .line 481
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 480
    invoke-static {v4, v0}, Lo/ffj$d;->a(Lo/ffj$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 482
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    .line 483
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 482
    invoke-static {v4, v0}, Lo/ffj$d;->e(Lo/ffj$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 485
    iget-object v0, p0, Lo/ffj;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_sport_history_child_right_button:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    .line 487
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 489
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_sport_item_accessory_sport_data_img:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/ffj$d;->d(Lo/ffj$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 490
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_sport_item_accessory_sport_data_unit:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/ffj$d;->h(Lo/ffj$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 491
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_sport_history_child_abnormal_track:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/ffj$d;->b(Lo/ffj$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 492
    invoke-virtual {p4, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 493
    goto :goto_0

    .line 494
    :cond_1
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ffj$d;

    .line 497
    :goto_0
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0, p2}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v5

    .line 498
    if-nez v5, :cond_2

    .line 499
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "child is null\'"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    return-object p4

    .line 502
    :cond_2
    invoke-direct {p0, v4, v5}, Lo/ffj;->b(Lo/ffj$d;Lo/fff;)V

    .line 504
    if-eqz p3, :cond_3

    .line 505
    invoke-static {v4}, Lo/ffj$d;->c(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 507
    :cond_3
    invoke-static {v4}, Lo/ffj$d;->c(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 509
    :goto_1
    if-nez p2, :cond_4

    .line 510
    new-instance v6, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/ffj;->g:I

    const/4 v1, -0x1

    invoke-direct {v6, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 512
    invoke-virtual {p4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 515
    :cond_4
    invoke-virtual {v5}, Lo/fff;->p()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 516
    invoke-virtual {v5}, Lo/fff;->s()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 517
    invoke-static {v4}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_repetition:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 518
    invoke-static {v4}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 520
    :cond_5
    invoke-static {v4}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 523
    :cond_6
    invoke-static {v4}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 524
    invoke-static {v4}, Lo/ffj$d;->e(Lo/ffj$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_sporthistory_abnormal_track:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 527
    :goto_2
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 1

    .line 115
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    .line 116
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 118
    :cond_1
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->b()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 124
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 126
    :cond_1
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .line 107
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 108
    const/4 v0, 0x0

    return v0

    .line 110
    :cond_0
    iget-object v0, p0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 144
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 20

    .line 160
    if-nez p3, :cond_0

    .line 161
    new-instance v9, Lo/ffj$e;

    invoke-direct {v9}, Lo/ffj$e;-><init>()V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_sport_history_father_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 173
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_running_history_father_date:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->b(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_running_history_father_distance:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->c(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 175
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_running_history_father_arrow:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v9, v0}, Lo/ffj$e;->b(Lo/ffj$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 176
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_running_history_father_line:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v9, v0}, Lo/ffj$e;->a(Lo/ffj$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_run:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->a(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_walk:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->d(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_ride:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->e(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_fit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->f(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_run_unit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->k(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_walk_unit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->i(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_ride_unit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->g(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_fit_hour_unit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->h(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_catetory_diatance_hour:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->l(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_catetory_diatance_hour_unit:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->p(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_catetory_calorie:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->n(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_catetory_times:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v9, v0}, Lo/ffj$e;->o(Lo/ffj$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_month_all_ll:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v9, v0}, Lo/ffj$e;->c(Lo/ffj$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->track_history_list_sum_catetory_ll:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v9, v0}, Lo/ffj$e;->a(Lo/ffj$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->first_item_layout:I

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v9, v0}, Lo/ffj$e;->b(Lo/ffj$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 192
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 194
    :cond_0
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/ffj$e;

    .line 199
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->d:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->h()D

    move-result-wide v10

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->d:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->a()D

    move-result-wide v12

    .line 201
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->d:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->k()J

    move-result-wide v14

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->d:Ljava/util/List;

    move/from16 v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    invoke-virtual {v0}, Lo/ffh;->g()D

    move-result-wide v16

    .line 204
    long-to-double v0, v14

    add-double/2addr v0, v12

    add-double/2addr v0, v10

    add-double v18, v0, v16

    .line 206
    if-nez p1, :cond_1

    .line 207
    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object v3, v9

    move-object/from16 v4, p0

    iget v4, v4, Lo/ffj;->f:I

    move-object/from16 v5, p0

    iget v5, v5, Lo/ffj;->e:I

    move/from16 v6, p1

    move-wide/from16 v7, v18

    invoke-direct/range {v0 .. v8}, Lo/ffj;->b(ZLandroid/view/View;Lo/ffj$e;IIID)V

    .line 208
    invoke-static {v9}, Lo/ffj$e;->b(Lo/ffj$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 210
    :cond_1
    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object v3, v9

    move-object/from16 v4, p0

    iget v4, v4, Lo/ffj;->c:I

    move-object/from16 v5, p0

    iget v5, v5, Lo/ffj;->a:I

    move/from16 v6, p1

    move-wide/from16 v7, v18

    invoke-direct/range {v0 .. v8}, Lo/ffj;->b(ZLandroid/view/View;Lo/ffj$e;IIID)V

    .line 211
    invoke-static {v9}, Lo/ffj$e;->b(Lo/ffj$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 223
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p1

    if-lt v1, v0, :cond_2

    .line 224
    const-string v0, "Track_SportHistoryExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-object p3

    .line 227
    :cond_2
    if-eqz p2, :cond_3

    .line 228
    invoke-static {v9}, Lo/ffj$e;->c(Lo/ffj$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 230
    :cond_3
    invoke-static {v9}, Lo/ffj$e;->c(Lo/ffj$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 232
    :goto_2
    invoke-static {v9}, Lo/ffj$e;->a(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    invoke-static {v9}, Lo/ffj$e;->e(Lo/ffj$e;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ffj;->d:Ljava/util/List;

    move/from16 v2, p1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffh;

    invoke-virtual {v1}, Lo/ffh;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 154
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 641
    const/4 v0, 0x1

    return v0
.end method
