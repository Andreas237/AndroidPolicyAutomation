.class public Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;


# instance fields
.field private A:J

.field private B:Z

.field private C:I

.field private D:I

.field private F:I

.field private G:Landroid/view/View;

.field private H:B

.field private a:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ListView;

.field private f:Lo/acn;

.field private g:Landroid/widget/TextView;

.field private h:Lo/acu;

.field private i:Landroid/widget/TextView;

.field private j:I

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/ImageView;

.field private o:Lo/emg;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/view/View;

.field private r:Landroid/view/View;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/view/View;

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/TextView;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private y:Landroid/widget/LinearLayout;

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 74
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 82
    new-instance v0, Lo/acn;

    invoke-direct {v0}, Lo/acn;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    return-void
.end method

.method private a()V
    .locals 7

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 495
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWeightFragment: has no parent Activity or view null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 497
    return-void

    .line 500
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->s:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 501
    if-nez v4, :cond_1

    .line 502
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "screenCut is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 504
    return-void

    .line 507
    :cond_1
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v5

    .line 508
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 509
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The path is invalid, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    return-void

    .line 514
    :cond_2
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 515
    new-instance v6, Lo/dav;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Lo/dav;-><init>(I)V

    .line 516
    invoke-virtual {v6, v4}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 518
    :cond_3
    new-instance v6, Lo/dav;

    const/4 v0, 0x4

    invoke-direct {v6, v0}, Lo/dav;-><init>(I)V

    .line 519
    invoke-virtual {v6, v5}, Lo/dav;->b(Ljava/lang/String;)V

    .line 523
    :goto_0
    sget-object v0, Lo/dae;->gO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dav;->d(Ljava/lang/String;)V

    .line 524
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dav;->e(I)V

    .line 525
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/dav;->d(Z)V

    .line 526
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/dav;->a(I)V

    .line 527
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c(Lo/dav;)V

    .line 528
    return-void
.end method

.method private a(FFD)V
    .locals 12

    .line 285
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

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

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

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

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->f()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/acm;->b(D)I

    move-result v6

    .line 289
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->j:I

    invoke-static {v0, v1, v2, v3}, Lo/acm;->a(BDI)I

    move-result v7

    .line 290
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->F:I

    int-to-double v1, v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/acm;->c(BDD)I

    move-result v8

    .line 291
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, v6, v7, v8}, Lo/acs;->a(III)Ljava/lang/String;

    move-result-object v5

    .line 293
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the health info : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_3"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the health advice is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->k:Landroid/widget/TextView;

    const-string v1, "%d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->l()D

    move-result-wide v3

    double-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v9, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->l()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->u:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->r:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 306
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 308
    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 309
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "just add BMI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->f()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_2

    const-string v1, "--"

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->f()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->f()D

    move-result-wide v2

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    .line 320
    :cond_3
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "just add ALL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->f()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_4

    const-string v1, "--"

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->f()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->f()D

    move-result-wide v2

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_5

    const-string v1, "--"

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_2
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->b()D

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const/4 v2, 0x5

    invoke-direct {p0, v0, v1, v10, v2}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e(DLjava/util/List;I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->h()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_7

    .line 325
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->h()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_6

    const-string v1, "--"

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->h()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_3
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->h()D

    move-result-wide v2

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_9

    .line 328
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->e()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_8

    const-string v1, "--"

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->e()D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_4
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->e()D

    move-result-wide v2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 330
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->c()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_b

    .line 331
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->c()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_a

    const-string v1, "--"

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->c()D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_5
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->c()D

    move-result-wide v2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 334
    :cond_b
    :goto_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->i()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_d

    .line 335
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->i()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_c

    const-string v1, "--"

    goto :goto_7

    :cond_c
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->i()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_7
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->i()D

    move-result-wide v2

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->k()D

    move-result-wide v0

    const/4 v2, 0x6

    invoke-direct {p0, v0, v1, v10, v2}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e(DLjava/util/List;I)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->n()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_f

    .line 343
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->n()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_e

    const-string v1, "--"

    goto :goto_8

    :cond_e
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->n()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1, p1}, Lo/acm;->b(FF)F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_8
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->n()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-static {v2, p1}, Lo/acm;->b(FF)F

    move-result v2

    float-to-double v2, v2

    const/4 v4, 0x7

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 346
    :cond_f
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_10

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->r()D

    move-result-wide v0

    const/16 v2, 0xb

    invoke-direct {p0, v0, v1, v10, v2}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e(DLjava/util/List;I)V

    .line 355
    :cond_10
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_12

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->m()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_12

    .line 357
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->m()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_11

    const-string v1, "--"

    goto :goto_9

    :cond_11
    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->m()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_9
    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->m()D

    move-result-wide v2

    const/16 v4, 0x8

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 366
    :cond_12
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_13

    .line 367
    invoke-direct {p0, v10}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b(Ljava/util/List;)V

    .line 370
    :cond_13
    :goto_a
    new-instance v11, Lo/fcq;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-direct {v11, v10, v0, v1}, Lo/fcq;-><init>(Ljava/util/List;Landroid/content/Context;Lo/acn;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e:Landroid/widget/ListView;

    invoke-virtual {v0, v11}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 372
    invoke-virtual {v11}, Lo/fcq;->e()V

    .line 373
    return-void
.end method

.method private b()V
    .locals 7

    .line 534
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 536
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a()V

    goto/16 :goto_1

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 540
    if-eqz v4, :cond_1

    .line 541
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a()V

    .line 542
    return-void

    .line 545
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v5

    .line 546
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    if-nez v5, :cond_5

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 550
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v6, 0x1

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    .line 552
    :goto_0
    if-nez v6, :cond_4

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ene;->b(Landroid/content/Context;Z)V

    goto :goto_1

    .line 555
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    sget-object v1, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b:[Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment$5;-><init>(Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;)V

    invoke-static {v0, v1, v2}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 571
    :cond_5
    :goto_1
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .line 270
    const-string v0, "default"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    invoke-static {p1, p2}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 272
    if-eqz v1, :cond_0

    .line 273
    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 275
    :cond_0
    goto :goto_0

    .line 276
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_personal_head:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 278
    :goto_0
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fcy;>;)V"
        }
    .end annotation

    .line 668
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_0

    .line 670
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v5}, Lo/acn;->u()I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v6}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v7

    .line 671
    if-lez v7, :cond_0

    .line 672
    new-instance v0, Lo/fcy;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-static {v7, v1}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    int-to-double v2, v7

    const/16 v4, 0xc

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 675
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->F:I

    if-lez v0, :cond_1

    .line 676
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->F:I

    invoke-static {v0, v1}, Lo/acm;->e(BI)D

    move-result-wide v7

    .line 677
    const/16 v0, 0xd

    invoke-direct {p0, v7, v8, p1, v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e(DLjava/util/List;I)V

    .line 679
    :cond_1
    iget-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->j:I

    invoke-static {v0, v1}, Lo/acm;->c(BI)D

    move-result-wide v7

    .line 680
    const-wide/16 v0, 0x0

    cmpl-double v0, v7, v0

    if-lez v0, :cond_2

    .line 681
    new-instance v0, Lo/fcy;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {v7, v8, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xe

    invoke-direct {v0, v1, v7, v8, v2}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 685
    :cond_2
    return-void
.end method

.method private c(Lo/dav;)V
    .locals 5

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 476
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 477
    const-string v0, "click"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    sget-object v2, Lo/dae;->gV:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 479
    return-void
.end method

.method public static c()Z
    .locals 9

    .line 376
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v2

    .line 378
    const/4 v3, 0x0

    .line 379
    invoke-virtual {v2}, Lo/acu;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 380
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 381
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 382
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 383
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 384
    new-instance v8, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;-><init>()V

    .line 386
    add-int/lit8 v0, v5, 0x12

    invoke-virtual {v8, v0, v6, v7}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, v5, 0x42

    invoke-virtual {v8, v0, v6, v7}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_1

    .line 387
    :cond_0
    const/4 v3, 0x1

    .line 390
    :cond_1
    return v3
.end method

.method private d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 13
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 438
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/dab;->e:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 439
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 440
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 441
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:mkdirs error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    :cond_0
    new-instance v5, Ljava/io/File;

    const-string v0, "weight_share_tmp.jpg"

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 447
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v6

    .line 454
    goto :goto_0

    .line 448
    :catch_0
    move-exception v7

    .line 449
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generate ioexception when saveBitToFile:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    const-string v0, ""

    return-object v0

    .line 451
    :catch_1
    move-exception v7

    .line 452
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generate securityException when saveBitToFile:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    const-string v0, ""

    return-object v0

    .line 456
    :goto_0
    :try_start_1
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    const/4 v8, 0x0

    .line 457
    :try_start_2
    invoke-static {v5, v6}, Lo/dbf;->c(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 458
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalidate file path"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 459
    const-string v9, ""

    .line 465
    if-eqz v7, :cond_1

    nop

    :try_start_3
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 459
    :cond_1
    return-object v9

    .line 462
    :cond_2
    :try_start_4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x5a

    invoke-virtual {p1, v0, v1, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 463
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 464
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 465
    if-eqz v7, :cond_5

    nop

    :try_start_5
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_2

    .line 456
    :catch_2
    move-exception v9

    move-object v8, v9

    :try_start_6
    throw v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 465
    :catchall_0
    move-exception v11

    if-eqz v7, :cond_4

    if-eqz v8, :cond_3

    :try_start_7
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_1

    :catch_3
    move-exception v12

    :try_start_8
    invoke-virtual {v8, v12}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    :cond_4
    :goto_1
    throw v11
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 469
    :cond_5
    :goto_2
    goto :goto_3

    .line 465
    :catch_4
    move-exception v7

    .line 466
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IllegalArgumentException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    goto :goto_3

    .line 467
    :catch_5
    move-exception v7

    .line 468
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    :goto_3
    return-object v6
.end method

.method private e(DLjava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DLjava/util/List<Lo/fcy;>;I)V"
        }
    .end annotation

    .line 422
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_3

    .line 423
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    new-instance v0, Lo/fcy;

    const-wide/16 v1, 0x0

    cmpg-double v1, p1, v1

    if-gez v1, :cond_0

    const-string v1, "--"

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1, p1, p2, p4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 426
    :cond_1
    new-instance v0, Lo/fcy;

    const-wide/16 v1, 0x0

    cmpg-double v1, p1, v1

    if-gez v1, :cond_2

    const-string v1, "--"

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-direct {v0, v1, p1, p2, p4}, Lo/fcy;-><init>(Ljava/lang/String;DI)V

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 429
    :cond_3
    :goto_2
    return-void
.end method

.method public static e()Z
    .locals 6

    .line 394
    const/4 v3, 0x1

    .line 395
    const/4 v4, 0x0

    .line 404
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    const/4 v4, 0x1

    .line 408
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_only_weightandBMI"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 410
    const-string v0, "all"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    const/4 v3, 0x0

    .line 413
    :cond_1
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()Z
    .locals 9

    .line 578
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    .line 579
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->D:I

    .line 580
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 583
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard  mBodyTypeDataList  size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 585
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    return v0

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 588
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    return v0

    .line 592
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v8, v0, -0x1

    :goto_0
    if-ltz v8, :cond_3

    .line 593
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_3

    .line 595
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

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->D:I

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v5}, Lo/acn;->u()I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v6}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    .line 597
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->z:J

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->A:J

    goto :goto_1

    .line 592
    :cond_2
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_0

    .line 604
    :cond_3
    :goto_1
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard, mStartType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mStartTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->z:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->A:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->D:I

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    if-ne v0, v1, :cond_4

    .line 606
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    return v0

    .line 608
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    const/4 v0, 0x1

    return v0

    .line 611
    :cond_5
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowBadyTypeCard  mBodyTypeDataList  is  null.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    return v0
.end method

.method private k()V
    .locals 7

    .line 620
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->z:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v4

    .line 621
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->A:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 623
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 624
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_negative:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 626
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_positive:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 628
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->w:Landroid/widget/TextView;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const/4 v2, 0x1

    aput-object v5, v1, v2

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->D:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-static {v2, v3}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-static {v2, v3}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 629
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->C:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 631
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_01b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 632
    goto/16 :goto_2

    .line 634
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_02b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 635
    goto :goto_2

    .line 637
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_03b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 638
    goto :goto_2

    .line 640
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_04b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 641
    goto :goto_2

    .line 643
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_05b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 644
    goto :goto_2

    .line 646
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_06b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 647
    goto :goto_2

    .line 649
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_07b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 650
    goto :goto_2

    .line 652
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_08b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 653
    goto :goto_2

    .line 655
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_09b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 656
    goto :goto_2

    .line 658
    :goto_1
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "body type get is wrong..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 662
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 6

    .line 115
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    .line 116
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->share_scroll_view:I

    invoke-virtual {v4, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    .line 119
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 120
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->share_scroll_view_area_no_cloud:I

    invoke-virtual {v4, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    goto :goto_0

    .line 123
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->share_scroll_view_area:I

    invoke-virtual {v4, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    .line 127
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 128
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewInActivity: can\'t get rootview!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 132
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->body_fat_intro_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e:Landroid/widget/ListView;

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_share_show_health_data_weight_mid_weight:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d:Landroid/widget/TextView;

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_mid_weight_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c:Landroid/widget/TextView;

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_body_tips:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_scoring:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->k:Landroid/widget/TextView;

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_score_parent:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->r:Landroid/view/View;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_user_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->i:Landroid/widget/TextView;

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->last_weight_date:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->p:Landroid/widget/TextView;

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_des:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->m:Landroid/widget/TextView;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_share_show_health_data_weight_bodyindex_mid_progressbar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emg;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->o:Lo/emg;

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_share_show_health_data_weight_bodyindex_Image_progressbar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->l:Landroid/widget/ImageView;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->core_sleep_share_user_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_fragment:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->s:Landroid/widget/LinearLayout;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->bottom_parent_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->q:Landroid/view/View;

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_scoring_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->u:Landroid/view/View;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_short_map:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->t:Landroid/widget/ImageView;

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_body_type_card_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->y:Landroid/widget/LinearLayout;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_body_type_des:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->w:Landroid/widget/TextView;

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_share_body_type_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->v:Landroid/widget/ImageView;

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 154
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 155
    const-string v0, "CN"

    invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 159
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 164
    :goto_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->r:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 171
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 174
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_details_progressbar_3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 176
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->weight_share_bg_bigcd:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 179
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->weight_share_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 181
    :goto_3
    return-void
.end method

.method public a(Lo/acn;Landroid/content/Context;)V
    .locals 15

    .line 189
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->G:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 190
    :cond_0
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent get latestBean or parent context is null .."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    return-void

    .line 193
    :cond_1
    move-object/from16 v0, p1

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    .line 194
    invoke-virtual/range {p1 .. p1}, Lo/acn;->d()D

    move-result-wide v6

    .line 195
    invoke-virtual/range {p1 .. p1}, Lo/acn;->b()D

    move-result-wide v8

    .line 196
    invoke-virtual/range {p1 .. p1}, Lo/acn;->a()D

    move-result-wide v10

    .line 197
    invoke-virtual/range {p1 .. p1}, Lo/acn;->q()I

    move-result v12

    .line 198
    if-nez v12, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v12

    .line 201
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/acn;->p()J

    move-result-wide v13

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_3

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->j:I

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iput-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->F:I

    goto :goto_0

    .line 208
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->j:I

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    iput-byte v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->H:B

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->F:I

    goto :goto_0

    .line 213
    :cond_4
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d:Landroid/widget/TextView;

    invoke-static {v6, v7}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    move-object/from16 v2, p2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 221
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v6, v7, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 224
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 228
    :cond_6
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 234
    :cond_7
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v13, v14}, Ljava/util/Date;-><init>(J)V

    const/16 v2, 0x15

    invoke-static {v1, v2}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    move-wide v0, v6

    move v2, v12

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->m:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->o:Lo/emg;

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v5}, Lo/fej;->a(DILandroid/widget/TextView;Lo/emg;Landroid/content/Context;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 239
    const-string v0, "WeightShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser is not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    double-to-float v0, v6

    double-to-float v1, v8

    invoke-direct {p0, v0, v1, v10, v11}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a(FFD)V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    move-object/from16 v2, p2

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_3

    .line 246
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_9

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_portrait01:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 249
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 252
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->h:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/fej;->c(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->x:Ljava/util/List;

    .line 255
    :cond_a
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->f()Z

    .line 256
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->B:Z

    if-eqz v0, :cond_b

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_b

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 258
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->k()V

    goto :goto_4

    .line 260
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 262
    :goto_4
    return-void
.end method

.method public d()V
    .locals 2

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 487
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->b()V

    goto :goto_0

    .line 489
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a()V

    .line 491
    :goto_0
    return-void
.end method
