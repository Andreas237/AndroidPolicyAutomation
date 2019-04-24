.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:J

.field private C:J

.field private D:Lo/fem;

.field private E:Landroid/widget/LinearLayout;

.field private F:I

.field private G:I

.field private H:Z

.field private I:Landroid/widget/ScrollView;

.field private K:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

.field private L:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;

.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/view/View;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/TextView;

.field private m:Lo/emg;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Lo/acu;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/content/Context;

.field private u:Lo/emr;

.field private v:Lo/acn;

.field private w:Landroid/view/View;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field

.field private y:Landroid/support/v7/widget/RecyclerView;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 102
    new-instance v0, Lo/acn;

    invoke-direct {v0}, Lo/acn;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->x:Ljava/util/List;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->K:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lo/fdv;->a(Lo/acn;Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 544
    const/4 v4, -0x1

    .line 545
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 547
    move v4, v5

    .line 549
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    .line 550
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    .line 551
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 555
    :cond_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    if-eq v4, v0, :cond_4

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 558
    :cond_4
    goto :goto_1

    .line 559
    :cond_5
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "indexRecycleItems size == 0  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 563
    :cond_6
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setListItem latestBeanis null... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    :goto_1
    return-void
.end method

.method private c(FFD)V
    .locals 17

    .line 417
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 418
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainuser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    return-void

    .line 421
    :cond_0
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u8eab\u9ad8"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->c()B

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u6027\u522b"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u5e74\u9f84"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v7

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_1

    .line 428
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v8

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v9

    .line 430
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v10

    goto :goto_0

    .line 432
    :cond_1
    invoke-virtual {v7}, Lo/acu;->b()I

    move-result v8

    .line 433
    invoke-virtual {v7}, Lo/acu;->d()I

    move-result v9

    .line 434
    invoke-virtual {v7}, Lo/acu;->c()B

    move-result v10

    .line 436
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/acm;->b(D)I

    move-result v12

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    invoke-static {v10, v0, v1, v8}, Lo/acm;->a(BDI)I

    move-result v13

    .line 438
    int-to-double v0, v9

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->g()D

    move-result-wide v2

    invoke-static {v10, v0, v1, v2, v3}, Lo/acm;->c(BDD)I

    move-result v14

    .line 439
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v12, v13, v14}, Lo/acs;->a(III)Ljava/lang/String;

    move-result-object v11

    .line 441
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the health info : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_1"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_3"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the health advice is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v15

    .line 444
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->l()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 448
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->b:Landroid/widget/TextView;

    const-string v1, "%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->l()D

    move-result-wide v3

    double-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v15, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 450
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 455
    :goto_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->b()V

    .line 457
    new-instance v0, Lo/fct;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->z:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-direct {v0, v1, v2, v3}, Lo/fct;-><init>(Landroid/content/Context;Ljava/util/List;Lo/acn;)V

    move-object/from16 v16, v0

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->y:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 459
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->y:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 460
    invoke-static {}, Lo/fcz;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->A:Z

    if-eqz v0, :cond_3

    .line 461
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->x:Ljava/util/List;

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/fct;->e(Ljava/util/List;)V

    .line 464
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/fej;->c(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    .line 465
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c()Z

    .line 466
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 467
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->F:I

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->B:J

    move-object/from16 v5, p0

    iget-wide v5, v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->C:J

    invoke-virtual/range {v0 .. v6}, Lo/fem;->setBodyTypeDatas(IIJJ)V

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    goto :goto_2

    .line 470
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    .line 473
    :goto_2
    return-void
.end method

.method private c()Z
    .locals 9

    .line 481
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    .line 482
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    .line 483
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->F:I

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 486
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard  mBodyTypeDataList  size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 488
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    return v0

    .line 490
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 491
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 492
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    return v0

    .line 495
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v8, v0, -0x1

    :goto_0
    if-ltz v8, :cond_3

    .line 496
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->j:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_3

    .line 498
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowBadyTypeCard, bodyType has chenged... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    invoke-virtual {v7}, Lo/acn;->t()B

    move-result v0

    invoke-virtual {v7}, Lo/acn;->b()D

    move-result-wide v1

    invoke-virtual {v7}, Lo/acn;->g()D

    move-result-wide v3

    invoke-virtual {v7}, Lo/acn;->u()I

    move-result v5

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v5}, Lo/acn;->u()I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v6}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->F:I

    .line 501
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->B:J

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->C:J

    goto :goto_1

    .line 495
    :cond_2
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_0

    .line 507
    :cond_3
    :goto_1
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard, mStartType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mStartTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->B:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->C:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->F:I

    if-ne v0, v1, :cond_4

    .line 509
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    return v0

    .line 511
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    const/4 v0, 0x1

    return v0

    .line 514
    :cond_5
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightDetail isShowBadyTypeCard mBodyTypeDataList  is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    return v0
.end method

.method private d()V
    .locals 19

    .line 207
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->A:Z

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 209
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 210
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 211
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 212
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 213
    new-instance v10, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {v10}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;-><init>()V

    .line 215
    add-int/lit8 v0, v7, 0x12

    invoke-virtual {v10, v0, v8, v9}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, v7, 0x42

    invoke-virtual {v10, v0, v8, v9}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_1

    .line 216
    :cond_0
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->A:Z

    .line 220
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 222
    const-string v0, "CN"

    invoke-virtual {v7}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 223
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 225
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 228
    :goto_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->s:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->o:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 233
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 236
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 238
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$5;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 248
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v8

    .line 249
    const/4 v0, 0x0

    if-ne v0, v8, :cond_6

    .line 250
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void

    .line 254
    :cond_6
    const-string v0, "weight"

    const-wide v1, 0x4050400000000000L    # 65.0

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v9

    .line 255
    const-string v0, "bodyfat"

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v11

    .line 256
    const-string v0, "resistance"

    const-wide/16 v1, 0x0

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v13

    .line 257
    const-string v0, "userHight"

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v15

    .line 258
    const-string v0, "weighttime"

    const-wide/16 v1, 0x0

    invoke-virtual {v8, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v16

    .line 259
    const-string v0, "weightBean"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/acn;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 261
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->finish()V

    .line 262
    return-void

    .line 264
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastWeight :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastBodyfat :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v18

    .line 282
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    move-wide/from16 v3, v16

    invoke-virtual {v2, v3, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v3, v2}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 284
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e:Landroid/widget/TextView;

    invoke-static {v9, v10}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 287
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v9, v10, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_blue:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_blue:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 291
    move-wide v0, v9

    move v2, v15

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->o:Landroid/widget/TextView;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->m:Lo/emg;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-static/range {v0 .. v5}, Lo/fej;->a(DILandroid/widget/TextView;Lo/emg;Landroid/content/Context;)V

    .line 292
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser is not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    double-to-float v0, v9

    double-to-float v1, v11

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1, v13, v14}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c(FFD)V

    .line 295
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)Landroid/content/Context;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 152
    sget v0, Lcom/huawei/ui/main/R$id;->weight_scrollView:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->I:Landroid/widget/ScrollView;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->I:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 154
    sget v0, Lcom/huawei/ui/main/R$id;->weight_bodyindex_value_points_line:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->w:Landroid/view/View;

    .line 155
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_linearlayout_records:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->q:Landroid/widget/LinearLayout;

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_bodyindex_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->weight_bodyindex_value_points_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->s:Landroid/widget/RelativeLayout;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyindex_mid_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a:Landroid/widget/TextView;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyindex_mid_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_weight_bodyindex_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c:Landroid/widget/TextView;

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->c:Landroid/widget/TextView;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyindex_mid_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->o:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyindex_mid_progressbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->m:Lo/emg;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyindex_Image_progressbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->d:Landroid/widget/ImageView;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_bodyinsex_standard_des:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->h:Landroid/widget/LinearLayout;

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_week_tips_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->l:Landroid/widget/TextView;

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_week_tips_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->p:Landroid/widget/TextView;

    .line 168
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_paddind:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->i:Landroid/view/View;

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_paddind_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->n:Landroid/view/View;

    .line 170
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->f:Landroid/widget/LinearLayout;

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->k:Landroid/widget/RelativeLayout;

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->weight_bodyindex_value_points:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->b:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/huawei/ui/main/R$id;->weight_body_index_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->g:Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bodyindex_detail_recycle:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->y:Landroid/support/v7/widget/RecyclerView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_detail_body_type_card_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fem;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_inputweight_top_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    invoke-virtual {v0, p0}, Lo/fem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->d()V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 203
    return-void
.end method

.method private g()V
    .locals 5

    .line 600
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDataLayout  --- onClick... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 602
    const-string v0, "weight_details_type_key"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 604
    const-string v0, "weight_details_weight_bean_key"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 605
    const-string v0, "weight_details_time"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 608
    :cond_0
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWeightDetails  lastBean is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    return-void

    .line 611
    :goto_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 569
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 571
    const-string v0, "weightBean_key"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 572
    const-string v0, "start_time"

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->B:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 573
    const-string v0, "start_type"

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->G:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 574
    const-string v0, "is_show_change"

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->H:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 577
    :cond_0
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoBodyTypeDetail  lastBean is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    return-void

    .line 580
    :goto_0
    return-void
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 5

    .line 406
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 407
    invoke-virtual {v2, p1, p2}, Ljava/util/Date;->setTime(J)V

    .line 408
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy/MM/dd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 409
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 410
    return-object v4
.end method

.method public a()V
    .locals 6

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    move-object v3, v0

    check-cast v3, Landroid/app/Activity;

    .line 299
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v4

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    .line 301
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->K:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->K:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a(Landroid/app/Activity;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->K:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a(Lo/acn;Landroid/content/Context;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->L:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 306
    const/16 v0, 0x3e8

    iput v0, v5, Landroid/os/Message;->what:I

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->L:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 309
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->D:Lo/fem;

    if-ne p1, v0, :cond_0

    .line 586
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->h()V

    goto :goto_0

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->k:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 588
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 589
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->g()V

    goto :goto_0

    .line 591
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_2

    .line 592
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 593
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_more_question:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 594
    const-string v0, "url"

    const-string v1, "https://resourcephs1.vmall.com/huawei_health/EMUI8.0/C001B001/zh-CN/content/faqs-all.html?pos=0"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 598
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 133
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_weight_body_index_detial:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->setContentView(I)V

    .line 134
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    .line 135
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->L:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;

    .line 136
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 139
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 140
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->finish()V

    .line 141
    return-void

    .line 143
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    const-string v1, "currentUser"

    invoke-virtual {v2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lo/acu;

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 144
    sget-object v0, Lo/act;->a:Lo/act;

    const-string v1, "mainUser"

    invoke-virtual {v2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lo/acu;

    invoke-virtual {v0, v1}, Lo/act;->b(Lo/acu;)V

    .line 145
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->r:Lo/acu;

    .line 147
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->e()V

    .line 148
    return-void
.end method

.method public onDestroy()V
    .locals 7

    .line 387
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 388
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/dab;->e:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no delete file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    return-void

    .line 393
    :cond_0
    new-instance v5, Ljava/io/File;

    const-string v0, "weight_share_tmp.jpg"

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 394
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 396
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 397
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 401
    :cond_1
    goto :goto_0

    .line 399
    :catch_0
    move-exception v6

    .line 400
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SecurityException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :cond_2
    :goto_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 313
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 315
    invoke-static {p0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult HasPermissions:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a()V

    .line 319
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 354
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 356
    return-void

    .line 358
    :cond_0
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bmi is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->f()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->v:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 367
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 368
    invoke-static {}, Lo/czu;->e()Z

    move-result v6

    .line 369
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChineseSimplified is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; isOversea is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->u:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 374
    if-eqz v5, :cond_2

    if-eqz v6, :cond_3

    .line 376
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 379
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->E:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 383
    :goto_0
    return-void
.end method
