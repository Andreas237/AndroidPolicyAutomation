.class public Lo/ffi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ffi$b;,
        Lo/ffi$c;
    }
.end annotation


# static fields
.field private static final J:I


# instance fields
.field protected A:Ljava/lang/String;

.field protected B:I

.field protected C:I

.field protected D:Z

.field protected E:Ljava/lang/String;

.field protected F:Ljava/lang/String;

.field protected G:Ljava/lang/String;

.field protected H:Ljava/lang/String;

.field protected I:Ljava/lang/String;

.field private K:Landroid/content/Context;

.field private L:I

.field protected M:Landroid/os/Handler;

.field protected N:Ljava/lang/String;

.field private O:Landroid/view/View;

.field private P:Landroid/view/View;

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chj;>;"
        }
    .end annotation
.end field

.field private R:Lo/ffi$b;

.field private S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chj;>;"
        }
    .end annotation
.end field

.field protected a:Lo/che;

.field protected b:Lo/che;

.field protected c:Landroid/widget/TextView;

.field protected d:Landroid/widget/TextView;

.field protected e:Landroid/widget/TextView;

.field protected f:Landroid/widget/TextView;

.field protected g:Landroid/widget/TextView;

.field protected h:Lo/chj;

.field protected i:Lo/chj;

.field protected j:Lcom/huawei/hihealth/HiHealthData;

.field protected k:Landroid/widget/TextView;

.field protected l:Lo/chj;

.field protected m:Lo/chj;

.field protected n:Lo/chj;

.field protected o:Lo/chj;

.field protected p:Lo/chj;

.field protected q:Lo/chj;

.field protected r:Lo/chj;

.field protected s:Lo/chj;

.field protected t:Lo/chj;

.field protected u:Lo/chj;

.field protected v:Lo/chj;

.field protected w:Lo/chj;

.field protected x:Landroid/content/res/Resources;

.field protected y:Z

.field protected z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 56
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/ffi;->J:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const-string v0, "--"

    iput-object v0, p0, Lo/ffi;->A:Ljava/lang/String;

    .line 67
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffi;->D:Z

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    .line 80
    new-instance v0, Lo/ffi$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ffi$c;-><init>(Lo/ffi;Lo/ffi$5;)V

    iput-object v0, p0, Lo/ffi;->M:Landroid/os/Handler;

    .line 115
    iput-object p1, p0, Lo/ffi;->K:Landroid/content/Context;

    .line 116
    return-void
.end method

.method private a()V
    .locals 4

    .line 293
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    if-nez v0, :cond_0

    .line 294
    iget-object v0, p0, Lo/ffi;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 297
    iget-object v0, p0, Lo/ffi;->m:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lo/ffi;->m:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lo/ffi;->o:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 300
    iget-object v0, p0, Lo/ffi;->o:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lo/ffi;->h:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 302
    iget-object v0, p0, Lo/ffi;->l:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 303
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lo/ffi;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lo/ffi;->v:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Lo/ffi;->v:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lo/ffi;->w:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lo/ffi;->w:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 311
    iget-object v0, p0, Lo/ffi;->r:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lo/ffi;->t:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 314
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffi;->D:Z

    goto :goto_0

    .line 316
    :cond_0
    invoke-direct {p0}, Lo/ffi;->b()V

    .line 319
    :goto_0
    iget-boolean v0, p0, Lo/ffi;->D:Z

    if-eqz v0, :cond_1

    .line 320
    iget-object v0, p0, Lo/ffi;->P:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lo/ffi;->O:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/che;->setVisibility(I)V

    goto :goto_1

    .line 324
    :cond_1
    iget-object v0, p0, Lo/ffi;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lo/ffi;->O:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/che;->setVisibility(I)V

    .line 329
    :goto_1
    return-void
.end method

.method private a(D)V
    .locals 6

    .line 379
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "countChineseDtat2 mSportType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ffi;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_0

    .line 381
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 382
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "numberFormat:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lo/ffi;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 384
    iget-object v0, p0, Lo/ffi;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v0, p0, Lo/ffi;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    iget-object v0, p0, Lo/ffi;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 387
    iget-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 388
    iget-object v0, p0, Lo/ffi;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    goto/16 :goto_0

    .line 390
    :cond_0
    iget-object v0, p0, Lo/ffi;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    iget-object v0, p0, Lo/ffi;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    double-to-float v5, p1

    .line 394
    iget-boolean v0, p0, Lo/ffi;->z:Z

    if-eqz v0, :cond_1

    .line 395
    iget-object v0, p0, Lo/ffi;->e:Landroid/widget/TextView;

    float-to-double v1, v5

    const-wide v3, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    iget-object v0, p0, Lo/ffi;->g:Landroid/widget/TextView;

    float-to-double v1, v5

    const-wide v3, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    iget-object v0, p0, Lo/ffi;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 400
    :cond_1
    iget-object v0, p0, Lo/ffi;->e:Landroid/widget/TextView;

    float-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-object v0, p0, Lo/ffi;->g:Landroid/widget/TextView;

    float-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 402
    iget-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 403
    iget-object v0, p0, Lo/ffi;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 406
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 2

    .line 608
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    .line 609
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_0

    .line 610
    invoke-direct {p0, p1}, Lo/ffi;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 612
    :cond_0
    invoke-direct {p0, p1}, Lo/ffi;->e(Ljava/lang/Object;)V

    .line 614
    :goto_0
    iget-object v0, p0, Lo/ffi;->M:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 615
    return-void
.end method

.method static synthetic a(Lo/ffi;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lo/ffi;->c()V

    return-void
.end method

.method private b()V
    .locals 11

    .line 332
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffi;->D:Z

    .line 334
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_0

    .line 335
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-object v2, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v3, p0, Lo/ffi;->N:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    sub-double v4, v0, v2

    .line 339
    :goto_0
    const-wide/16 v0, 0x0

    cmpg-double v0, v4, v0

    if-gtz v0, :cond_1

    .line 340
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ffi;->D:Z

    .line 342
    :cond_1
    iget-object v0, p0, Lo/ffi;->m:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 343
    iget-object v0, p0, Lo/ffi;->m:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 344
    iget-object v0, p0, Lo/ffi;->o:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 345
    iget-object v0, p0, Lo/ffi;->o:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 346
    iget-object v0, p0, Lo/ffi;->v:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lo/ffi;->v:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lo/ffi;->w:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 349
    iget-object v0, p0, Lo/ffi;->w:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 350
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 351
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v8, v0, v2

    .line 352
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-lez v0, :cond_2

    const-wide/16 v0, 0x0

    cmpg-double v0, v8, v0

    if-gtz v0, :cond_3

    .line 353
    :cond_2
    iget-object v0, p0, Lo/ffi;->h:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 354
    iget-object v0, p0, Lo/ffi;->l:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 355
    iget-object v0, p0, Lo/ffi;->r:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lo/ffi;->t:Lo/chj;

    iget-object v1, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 359
    :cond_3
    iget-boolean v0, p0, Lo/ffi;->z:Z

    if-eqz v0, :cond_4

    .line 360
    const-wide v0, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, v8

    div-double v0, v6, v0

    double-to-float v10, v0

    goto :goto_1

    .line 362
    :cond_4
    div-double v0, v6, v8

    double-to-float v10, v0

    .line 364
    :goto_1
    iget-object v0, p0, Lo/ffi;->h:Lo/chj;

    invoke-static {v10}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lo/ffi;->l:Lo/chj;

    invoke-static {v10}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lo/ffi;->r:Lo/chj;

    invoke-static {v10}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 367
    iget-object v0, p0, Lo/ffi;->t:Lo/chj;

    invoke-static {v10}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 369
    :goto_2
    invoke-direct {p0, v6, v7}, Lo/ffi;->d(D)V

    .line 370
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_5

    .line 371
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    div-double/2addr v6, v0

    .line 372
    invoke-direct {p0, v6, v7}, Lo/ffi;->a(D)V

    goto :goto_3

    .line 374
    :cond_5
    invoke-direct {p0, v8, v9}, Lo/ffi;->a(D)V

    .line 376
    :goto_3
    return-void
.end method

.method private b(JJI)V
    .locals 8

    .line 589
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData mSportType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ffi;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v1, v0, :cond_1

    .line 591
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 592
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    iget-object v6, p0, Lo/ffi;->R:Lo/ffi$b;

    invoke-virtual/range {v0 .. v6}, Lo/brt;->d(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 594
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquire data form fitness "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 596
    :cond_0
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFitnessCourseDisplay error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 600
    :cond_1
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, p1

    const-wide/16 v3, 0x3e8

    sub-long v3, p3, v3

    move v5, p5

    iget v6, p0, Lo/ffi;->L:I

    iget-object v7, p0, Lo/ffi;->R:Lo/ffi$b;

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 604
    :goto_0
    return-void
.end method

.method private b(Landroid/app/Activity;)V
    .locals 5

    .line 152
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/ffi;->z:Z

    .line 153
    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ffi;->y:Z

    .line 155
    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    .line 157
    iget-object v0, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->A:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 159
    iget-object v0, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/ffi;->B:I

    .line 160
    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    .line 161
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v3, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lo/ffi;->C:I

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->P:Landroid/view/View;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->share_track_detail_show_distance:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->O:Landroid/view/View;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_distance:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->e:Landroid/widget/TextView;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_total:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->d:Landroid/widget/TextView;

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_distance_unit:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->share_sport_data_distance:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->g:Landroid/widget/TextView;

    .line 168
    sget v0, Lcom/huawei/ui/main/R$id;->tv_sport_title:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->k:Landroid/widget/TextView;

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->share_sport_data_distance_unit:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ffi;->f:Landroid/widget/TextView;

    .line 170
    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 172
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 173
    const/16 v0, 0xf

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 174
    iget-object v0, p0, Lo/ffi;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    iget-object v0, p0, Lo/ffi;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 177
    :cond_0
    invoke-direct {p0, p1}, Lo/ffi;->d(Landroid/app/Activity;)V

    .line 179
    invoke-direct {p0}, Lo/ffi;->a()V

    .line 180
    return-void
.end method

.method private c()V
    .locals 0

    .line 288
    invoke-direct {p0}, Lo/ffi;->a()V

    .line 289
    invoke-direct {p0}, Lo/ffi;->e()V

    .line 290
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 658
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 659
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iput-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    .line 661
    :cond_0
    return-void
.end method

.method private d()I
    .locals 1

    .line 267
    iget v0, p0, Lo/ffi;->L:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 269
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_ride:I

    return v0

    .line 271
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_walk:I

    return v0

    .line 274
    :goto_0
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_run:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private d(D)V
    .locals 11

    .line 409
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    div-double v5, p1, v0

    .line 410
    iget-boolean v0, p0, Lo/ffi;->y:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, v5, v0

    if-lez v0, :cond_0

    .line 411
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    div-double v1, v5, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 412
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    div-double v1, v5, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 416
    :cond_0
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 417
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 418
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 421
    :goto_0
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v7, v0, v2

    .line 422
    iget-boolean v0, p0, Lo/ffi;->y:Z

    if-eqz v0, :cond_1

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v7, v0

    if-ltz v0, :cond_1

    .line 424
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v7, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v7, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 427
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 429
    :cond_1
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v7, v8, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 430
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 431
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v7, v8, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 435
    :goto_1
    iget-object v0, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/ffi;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 437
    iget-boolean v0, p0, Lo/ffi;->y:Z

    if-eqz v0, :cond_2

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v9, v0

    if-ltz v0, :cond_2

    .line 438
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v9, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 439
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 440
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v9, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 441
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_2

    .line 444
    :cond_2
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v9, v10, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 445
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 446
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v9, v10, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 447
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 449
    :goto_2
    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 8

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_container:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lo/ffi;->a:Lo/che;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->share_sport_data_container:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lo/ffi;->b:Lo/che;

    .line 186
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 187
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->i:Lo/chj;

    .line 188
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 189
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->q:Lo/chj;

    .line 190
    const-string v7, "/"

    .line 191
    iget-boolean v0, p0, Lo/ffi;->z:Z

    if-eqz v0, :cond_0

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 194
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 196
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_avragepace:I

    .line 197
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v7}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->h:Lo/chj;

    .line 198
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_avragepace:I

    .line 199
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v7}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->r:Lo/chj;

    .line 200
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    .line 201
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-boolean v4, p0, Lo/ffi;->z:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    .line 202
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->l:Lo/chj;

    .line 203
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    .line 204
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-boolean v4, p0, Lo/ffi;->z:Z

    if-eqz v4, :cond_2

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    .line 205
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->t:Lo/chj;

    .line 206
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->track_ic_health_img_detail_record_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_steps:I

    .line 207
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->n:Lo/chj;

    .line 208
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->track_ic_health_img_detail_record_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_steps:I

    .line 209
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->u:Lo/chj;

    .line 210
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/ffi;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_fitness_times:I

    .line 211
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->o:Lo/chj;

    .line 212
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/ffi;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_fitness_times:I

    .line 213
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->w:Lo/chj;

    .line 214
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/ffi;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 215
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->m:Lo/chj;

    .line 216
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/ffi;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 217
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->v:Lo/chj;

    .line 218
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_calories:I

    .line 219
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->p:Lo/chj;

    .line 220
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_calories:I

    .line 221
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/ffi;->A:Ljava/lang/String;

    iget-object v4, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-direct {p0, v0}, Lo/ffi;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lo/ffi;->s:Lo/chj;

    .line 224
    invoke-direct {p0}, Lo/ffi;->e()V

    .line 225
    return-void
.end method

.method private d(Ljava/lang/Object;)V
    .locals 7

    .line 636
    const/4 v4, 0x0

    .line 637
    const/4 v5, 0x0

    .line 638
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Ljava/util/List;

    if-nez v0, :cond_1

    .line 639
    :cond_0
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "objData error"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    return-void

    .line 642
    :cond_1
    move-object v5, p1

    check-cast v5, Ljava/util/List;

    .line 643
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 644
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessTrackRecords.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    return-void

    .line 647
    :cond_2
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessTrackRecords:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 649
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    .line 650
    iget-object v0, p0, Lo/ffi;->H:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTime()J

    move-result-wide v1

    long-to-float v1, v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putFloat(Ljava/lang/String;F)V

    .line 651
    iget-object v0, p0, Lo/ffi;->G:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTimes()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 652
    iget-object v0, p0, Lo/ffi;->E:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumCalorie()F

    move-result v1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putFloat(Ljava/lang/String;F)V

    .line 654
    iput-object v4, p0, Lo/ffi;->j:Lcom/huawei/hihealth/HiHealthData;

    .line 655
    return-void
.end method

.method private e(Lo/chj$b;)Lo/chj;
    .locals 3

    .line 279
    new-instance v2, Lo/chj;

    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/chj;-><init>(Landroid/content/Context;)V

    .line 280
    iget v0, p0, Lo/ffi;->C:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/ffi;->B:I

    invoke-virtual {v2, v0, v1}, Lo/chj;->setGroupSize(II)V

    .line 281
    invoke-virtual {v2, p1}, Lo/chj;->setItemView(Lo/chj$b;)V

    .line 282
    sget v0, Lo/ffi;->J:I

    invoke-virtual {v2, v0}, Lo/chj;->setTextColor(I)V

    .line 283
    invoke-virtual {v2}, Lo/chj;->d()V

    .line 284
    return-object v2
.end method

.method private e()V
    .locals 5

    .line 233
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 234
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 235
    invoke-direct {p0}, Lo/ffi;->i()V

    .line 236
    iget-object v0, p0, Lo/ffi;->a:Lo/che;

    invoke-virtual {v0}, Lo/che;->removeAllViews()V

    .line 237
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    invoke-virtual {v0}, Lo/che;->removeAllViews()V

    .line 238
    iget-object v0, p0, Lo/ffi;->a:Lo/che;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/che;->e(I)V

    .line 239
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/che;->e(I)V

    .line 240
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 241
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/chj;

    .line 242
    invoke-virtual {v3}, Lo/chj;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 243
    if-eqz v4, :cond_0

    .line 244
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 246
    :cond_0
    iget-object v0, p0, Lo/ffi;->a:Lo/che;

    invoke-virtual {v0, v3}, Lo/che;->addView(Landroid/view/View;)V

    .line 247
    and-int/lit8 v0, v2, 0x1

    if-nez v0, :cond_1

    .line 248
    iget-object v0, p0, Lo/ffi;->a:Lo/che;

    invoke-direct {p0}, Lo/ffi;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/che;->addView(Landroid/view/View;)V

    .line 240
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 251
    :cond_2
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 252
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/chj;

    .line 253
    invoke-virtual {v3}, Lo/chj;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 254
    if-eqz v4, :cond_3

    .line 255
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 257
    :cond_3
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    invoke-virtual {v0, v3}, Lo/che;->addView(Landroid/view/View;)V

    .line 258
    and-int/lit8 v0, v2, 0x1

    if-nez v0, :cond_4

    .line 259
    iget-object v0, p0, Lo/ffi;->b:Lo/che;

    invoke-direct {p0}, Lo/ffi;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/che;->addView(Landroid/view/View;)V

    .line 251
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 263
    :cond_5
    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 6

    .line 618
    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/util/SparseArray;

    if-nez v0, :cond_1

    .line 619
    :cond_0
    iget-object v0, p0, Lo/ffi;->M:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 620
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    return-void

    .line 624
    :cond_1
    move-object v4, p1

    :try_start_0
    check-cast v4, Landroid/util/SparseArray;

    .line 625
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 626
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sum "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    invoke-direct {p0, v5}, Lo/ffi;->c(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 632
    goto :goto_0

    .line 628
    :catch_0
    move-exception v4

    .line 629
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    goto :goto_0

    .line 630
    :catch_1
    move-exception v4

    .line 631
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/ffi;Ljava/lang/Object;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/ffi;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private g()Landroid/view/View;
    .locals 8

    .line 500
    new-instance v4, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 501
    new-instance v5, Landroid/view/View;

    iget-object v0, p0, Lo/ffi;->K:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 502
    sget v0, Lo/ffi;->J:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 503
    const v0, 0x3e99999a    # 0.3f

    invoke-virtual {v5, v0}, Landroid/view/View;->setAlpha(F)V

    .line 504
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget-object v1, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$dimen;->sport_data_cut_line_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iget-object v2, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_32:I

    .line 505
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 504
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 507
    iget-object v0, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_map_target_type_text_top:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 508
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lo/ffi;->x:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_70dp:I

    .line 509
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, -0x2

    invoke-direct {v7, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 510
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 512
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v6, v1, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 513
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 514
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 516
    return-object v4
.end method

.method private i()V
    .locals 4

    .line 452
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    .line 453
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->m:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 454
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->i:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->p:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->l:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->h:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 458
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->v:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->q:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 460
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->t:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 462
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->r:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    iget-object v0, p0, Lo/ffi;->h:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 464
    iget-object v0, p0, Lo/ffi;->r:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    goto/16 :goto_0

    .line 465
    :cond_0
    iget v0, p0, Lo/ffi;->L:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_1

    .line 466
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->o:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 467
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->p:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 468
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->w:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 471
    :cond_1
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->m:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->i:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 473
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->p:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->h:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 475
    iget-object v0, p0, Lo/ffi;->Q:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->n:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->v:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->q:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 479
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->r:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    iget-object v0, p0, Lo/ffi;->S:Ljava/util/List;

    iget-object v1, p0, Lo/ffi;->u:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 481
    iget-object v0, p0, Lo/ffi;->h:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 482
    iget-object v0, p0, Lo/ffi;->r:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 485
    :goto_0
    iget-object v0, p0, Lo/ffi;->i:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 486
    iget-object v0, p0, Lo/ffi;->l:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 487
    iget-object v0, p0, Lo/ffi;->n:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 488
    iget-object v0, p0, Lo/ffi;->m:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 489
    iget-object v0, p0, Lo/ffi;->o:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 490
    iget-object v0, p0, Lo/ffi;->p:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 491
    iget-object v0, p0, Lo/ffi;->q:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 492
    iget-object v0, p0, Lo/ffi;->t:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 493
    iget-object v0, p0, Lo/ffi;->u:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 494
    iget-object v0, p0, Lo/ffi;->v:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 495
    iget-object v0, p0, Lo/ffi;->w:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 496
    iget-object v0, p0, Lo/ffi;->s:Lo/chj;

    iget-object v1, p0, Lo/ffi;->K:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 497
    return-void
.end method


# virtual methods
.method public a(JJI)V
    .locals 4

    .line 579
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas , startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,endTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,timeUnit is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    iget-object v0, p0, Lo/ffi;->R:Lo/ffi$b;

    if-nez v0, :cond_0

    .line 582
    new-instance v0, Lo/ffi$b;

    invoke-direct {v0, p0}, Lo/ffi$b;-><init>(Lo/ffi;)V

    iput-object v0, p0, Lo/ffi;->R:Lo/ffi$b;

    .line 585
    :cond_0
    invoke-direct/range {p0 .. p5}, Lo/ffi;->b(JJI)V

    .line 586
    return-void
.end method

.method public b(I)V
    .locals 4

    .line 119
    iput p1, p0, Lo/ffi;->L:I

    .line 120
    const-string v0, "Track_SportDataInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSportType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const/16 v0, 0x103

    if-ne p1, v0, :cond_0

    .line 122
    const-string v0, "Track_Ride_Step_Sum"

    iput-object v0, p0, Lo/ffi;->I:Ljava/lang/String;

    .line 123
    const-string v0, "Track_Ride_Distance_Sum"

    iput-object v0, p0, Lo/ffi;->F:Ljava/lang/String;

    .line 124
    const-string v0, "Track_Ride_Calorie_Sum"

    iput-object v0, p0, Lo/ffi;->E:Ljava/lang/String;

    .line 125
    const-string v0, "Track_Ride_Duration_Sum"

    iput-object v0, p0, Lo/ffi;->H:Ljava/lang/String;

    .line 126
    const-string v0, "Track_Ride_Count_Sum"

    iput-object v0, p0, Lo/ffi;->G:Ljava/lang/String;

    .line 127
    const-string v0, "Track_Ride_Abnormal_Count_Sum"

    iput-object v0, p0, Lo/ffi;->N:Ljava/lang/String;

    goto :goto_0

    .line 128
    :cond_0
    const/16 v0, 0x101

    if-ne p1, v0, :cond_1

    .line 129
    const-string v0, "Track_Walk_Step_Sum"

    iput-object v0, p0, Lo/ffi;->I:Ljava/lang/String;

    .line 130
    const-string v0, "Track_Walk_Distance_Sum"

    iput-object v0, p0, Lo/ffi;->F:Ljava/lang/String;

    .line 131
    const-string v0, "Track_Walk_Calorie_Sum"

    iput-object v0, p0, Lo/ffi;->E:Ljava/lang/String;

    .line 132
    const-string v0, "Track_Walk_Duration_Sum"

    iput-object v0, p0, Lo/ffi;->H:Ljava/lang/String;

    .line 133
    const-string v0, "Track_Walk_Count_Sum"

    iput-object v0, p0, Lo/ffi;->G:Ljava/lang/String;

    .line 134
    const-string v0, "Track_Walk_Abnormal_Count_Sum"

    iput-object v0, p0, Lo/ffi;->N:Ljava/lang/String;

    goto :goto_0

    .line 136
    :cond_1
    const-string v0, "Track_Run_Step_Sum"

    iput-object v0, p0, Lo/ffi;->I:Ljava/lang/String;

    .line 137
    const-string v0, "Track_Run_Distance_Sum"

    iput-object v0, p0, Lo/ffi;->F:Ljava/lang/String;

    .line 138
    const-string v0, "Track_Run_Calorie_Sum"

    iput-object v0, p0, Lo/ffi;->E:Ljava/lang/String;

    .line 139
    const-string v0, "Track_Run_Duration_Sum"

    iput-object v0, p0, Lo/ffi;->H:Ljava/lang/String;

    .line 140
    const-string v0, "Track_Run_Count_Sum"

    iput-object v0, p0, Lo/ffi;->G:Ljava/lang/String;

    .line 141
    const-string v0, "Track_Run_Abnormal_Count_Sum"

    iput-object v0, p0, Lo/ffi;->N:Ljava/lang/String;

    .line 143
    :goto_0
    return-void
.end method

.method public e(Landroid/app/Activity;)V
    .locals 1

    .line 146
    new-instance v0, Lo/ffi$b;

    invoke-direct {v0, p0}, Lo/ffi$b;-><init>(Lo/ffi;)V

    iput-object v0, p0, Lo/ffi;->R:Lo/ffi$b;

    .line 147
    invoke-direct {p0, p1}, Lo/ffi;->b(Landroid/app/Activity;)V

    .line 149
    return-void
.end method
