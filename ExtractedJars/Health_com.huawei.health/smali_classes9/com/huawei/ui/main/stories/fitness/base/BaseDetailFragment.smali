.class public abstract Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected A:Landroid/widget/ImageView;

.field protected B:Landroid/view/View;

.field protected C:Landroid/view/View;

.field protected D:Landroid/os/Handler;

.field public E:Landroid/widget/ImageView;

.field public F:Landroid/graphics/drawable/AnimationDrawable;

.field protected G:Landroid/widget/LinearLayout;

.field public H:Z

.field protected I:I

.field protected J:Landroid/widget/LinearLayout;

.field protected K:Landroid/widget/LinearLayout;

.field protected L:Landroid/widget/TextView;

.field protected M:Landroid/widget/LinearLayout;

.field protected N:Landroid/widget/ImageView;

.field protected O:Landroid/widget/ImageView;

.field protected P:Landroid/widget/TextView;

.field public Q:Z

.field protected R:Landroid/widget/TextView;

.field protected S:Lo/cmj;

.field public U:Landroid/widget/TextView;

.field public W:Landroid/widget/TextView;

.field public X:Landroid/widget/TextView;

.field protected f:Lo/fab;

.field public g:Landroid/content/Context;

.field protected h:Landroid/widget/TextView;

.field protected i:Lo/fac;

.field protected j:Landroid/widget/ImageView;

.field protected k:Landroid/view/View;

.field protected l:Landroid/widget/TextView;

.field protected m:Landroid/widget/LinearLayout;

.field protected n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected o:Landroid/widget/TextView;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/LinearLayout;

.field protected r:Landroid/widget/TextView;

.field protected s:Landroid/widget/TextView;

.field protected t:Landroid/widget/LinearLayout;

.field protected u:Landroid/widget/LinearLayout;

.field protected v:Landroid/widget/TextView;

.field protected w:Landroid/widget/TextView;

.field protected x:Landroid/widget/TextView;

.field protected y:Landroid/widget/TextView;

.field protected z:Lo/eyi;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->n:Ljava/util/ArrayList;

    .line 130
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->D:Landroid/os/Handler;

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->H:Z

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->I:I

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->X:Landroid/widget/TextView;

    .line 163
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->U:Landroid/widget/TextView;

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->W:Landroid/widget/TextView;

    return-void
.end method

.method private b(D)Landroid/text/SpannableString;
    .locals 6

    .line 851
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 852
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->g:Landroid/content/Context;

    const-string v1, "[\\d]"

    sget v2, Lcom/huawei/ui/main/R$style;->fitness_detail_data_percent_number_style_num:I

    sget v3, Lcom/huawei/ui/main/R$style;->fitness_detail_data_percent_number_style_sign:I

    invoke-static {v0, v1, v4, v2, v3}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v5

    .line 854
    return-object v5
.end method

.method private b(Lo/fad;)V
    .locals 23

    .line 475
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 476
    return-void

    .line 478
    :cond_0
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, walkTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, runTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, rideTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, climbTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, allTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    const-wide/16 v7, 0x0

    .line 485
    const-wide/16 v9, 0x0

    .line 486
    const-wide/16 v11, 0x0

    .line 488
    const-wide/16 v13, 0x0

    .line 489
    const-wide/16 v15, 0x0

    .line 490
    const-wide/16 v17, 0x0

    .line 491
    const-wide/16 v19, 0x0

    .line 492
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    if-nez v0, :cond_1

    .line 493
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    .line 494
    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 495
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 496
    return-void

    .line 497
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 499
    return-void

    .line 501
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 504
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 505
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, TotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 507
    :cond_3
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, runData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, climbData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, walkData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v7, v0

    .line 513
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, sumData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v7

    if-ltz v0, :cond_4

    .line 518
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v7, v0

    .line 519
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, sumData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  otherData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    int-to-double v0, v0

    sub-double v0, v7, v0

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v2

    int-to-double v2, v2

    sub-double v11, v0, v2

    .line 523
    const-wide/16 v0, 0x0

    cmpl-double v0, v7, v0

    if-nez v0, :cond_5

    .line 524
    const-wide/high16 v13, 0x4059000000000000L    # 100.0

    goto/16 :goto_1

    .line 526
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v15, v0

    .line 527
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v15, v0

    if-gez v0, :cond_6

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    if-lez v0, :cond_6

    .line 528
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 531
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v17, v2

    .line 532
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v17, v0

    if-gez v0, :cond_7

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    if-lez v0, :cond_7

    .line 533
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 536
    :cond_7
    const-wide/16 v0, 0x0

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v19, v2

    .line 537
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v19, v0

    if-gez v0, :cond_8

    nop

    .line 538
    .line 541
    :cond_8
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, per_cent run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " other = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    add-double v0, v15, v17

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_b

    .line 545
    add-double v0, v15, v17

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v21, v0, v2

    .line 546
    cmpl-double v0, v15, v17

    if-ltz v0, :cond_9

    cmpl-double v0, v15, v19

    if-ltz v0, :cond_9

    .line 547
    sub-double v15, v15, v21

    goto :goto_0

    .line 548
    :cond_9
    cmpl-double v0, v17, v15

    if-ltz v0, :cond_a

    cmpl-double v0, v17, v19

    if-ltz v0, :cond_a

    .line 549
    sub-double v17, v17, v21

    goto :goto_0

    .line 550
    :cond_a
    cmpl-double v0, v19, v15

    if-ltz v0, :cond_b

    cmpl-double v0, v19, v17

    if-ltz v0, :cond_b

    .line 551
    sub-double v19, v19, v21

    .line 555
    :cond_b
    :goto_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v11

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v13, v0

    .line 556
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    if-lez v0, :cond_c

    .line 557
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    sub-double/2addr v0, v15

    sub-double v0, v0, v17

    sub-double v13, v0, v19

    .line 559
    :cond_c
    const-wide/16 v0, 0x0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_d

    .line 560
    const-wide/16 v13, 0x0

    .line 562
    :cond_d
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsBottomTVs, per_cent walk="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  run="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  other="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->r:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v14}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 567
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->y:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide v2, v15

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 568
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->w:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v17

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->x:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v19

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    mul-double v1, v7, v13

    double-to-float v1, v1

    mul-double v2, v7, v15

    double-to-float v2, v2

    mul-double v3, v7, v17

    double-to-float v4, v3

    mul-double v5, v7, v19

    double-to-float v5, v5

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setViewData(FFFFF)V

    .line 577
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    invoke-virtual {v0}, Lo/eyi;->invalidate()V

    .line 578
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 2

    .line 296
    sget v0, Lcom/huawei/ui/main/R$id;->calorie_day_detail_viewpager:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fac;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->i:Lo/fac;

    .line 298
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->n:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->f:Lo/fab;

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->i:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->f:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fac;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 302
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->E:Landroid/widget/ImageView;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->E:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->E:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 307
    return-void
.end method

.method private c(Lo/fad;)Z
    .locals 2

    .line 830
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lo/fad;->e()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/fad;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 831
    invoke-virtual {p1}, Lo/fad;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/fad;->d()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    .line 832
    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 833
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-nez v0, :cond_0

    .line 834
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 836
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 837
    :cond_1
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 838
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-nez v0, :cond_2

    .line 839
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 841
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 843
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-nez v0, :cond_4

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 847
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;ILjava/lang/String;I)Landroid/text/SpannableStringBuilder;
    .locals 8

    .line 424
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 425
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v4, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 426
    new-instance v5, Landroid/text/SpannableString;

    invoke-direct {v5, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 427
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v1, 0x1

    invoke-direct {v0, p4, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v5, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 428
    new-instance v6, Landroid/text/SpannableString;

    const-string v0, " "

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 429
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/4 v1, 0x1

    invoke-direct {v0, p4, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x11

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 430
    new-instance v7, Landroid/text/SpannableStringBuilder;

    invoke-direct {v7}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 431
    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 432
    return-object v7
.end method

.method private d(Lo/fad;)V
    .locals 23

    .line 596
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 597
    return-void

    .line 600
    :cond_0
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, walkTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, runTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, rideTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, climbTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, allTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    const-wide/16 v7, 0x0

    .line 608
    const-wide/16 v9, 0x0

    .line 610
    const-wide/16 v11, 0x0

    .line 611
    const-wide/16 v13, 0x0

    .line 612
    const-wide/16 v15, 0x0

    .line 613
    const-wide/16 v17, 0x0

    .line 614
    const-wide/16 v19, 0x0

    .line 615
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 616
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    .line 617
    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 619
    return-void

    .line 620
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 621
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 622
    return-void

    .line 624
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 626
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 627
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, allTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 629
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v1

    add-int/2addr v0, v1

    .line 630
    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v7, v0

    .line 631
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, sumData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v7

    if-ltz v0, :cond_4

    .line 635
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v7, v0

    .line 637
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    int-to-double v0, v0

    sub-double v0, v7, v0

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v2

    int-to-double v2, v2

    sub-double/2addr v0, v2

    .line 638
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v2

    int-to-double v2, v2

    sub-double v9, v0, v2

    .line 639
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v7, v0

    if-gez v0, :cond_5

    .line 640
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 643
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v11, v0

    .line 644
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_6

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    if-lez v0, :cond_6

    .line 645
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 653
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v15, v0

    .line 654
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v15, v0

    if-gez v0, :cond_7

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    if-lez v0, :cond_7

    .line 655
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 657
    :cond_7
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v9

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v19, v2

    .line 658
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v19, v0

    if-gez v0, :cond_8

    const-wide/16 v0, 0x0

    cmpl-double v0, v9, v0

    if-lez v0, :cond_8

    .line 659
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 661
    :cond_8
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, per_cent run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " other = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    add-double v0, v11, v13

    add-double/2addr v0, v15

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_c

    .line 665
    add-double v0, v11, v13

    add-double/2addr v0, v15

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v21, v0, v2

    .line 666
    cmpl-double v0, v11, v13

    if-ltz v0, :cond_9

    cmpl-double v0, v11, v15

    if-ltz v0, :cond_9

    cmpl-double v0, v11, v19

    if-ltz v0, :cond_9

    .line 667
    sub-double v11, v11, v21

    goto :goto_0

    .line 668
    :cond_9
    cmpl-double v0, v13, v11

    if-ltz v0, :cond_a

    cmpl-double v0, v13, v15

    if-ltz v0, :cond_a

    cmpl-double v0, v13, v19

    if-ltz v0, :cond_a

    .line 669
    sub-double v13, v13, v21

    goto :goto_0

    .line 670
    :cond_a
    cmpl-double v0, v15, v11

    if-ltz v0, :cond_b

    cmpl-double v0, v15, v13

    if-ltz v0, :cond_b

    cmpl-double v0, v15, v19

    if-ltz v0, :cond_b

    .line 671
    sub-double v15, v15, v21

    goto :goto_0

    .line 672
    :cond_b
    cmpl-double v0, v19, v11

    if-ltz v0, :cond_c

    cmpl-double v0, v19, v13

    if-ltz v0, :cond_c

    cmpl-double v0, v19, v15

    if-ltz v0, :cond_c

    .line 673
    sub-double v19, v19, v21

    .line 677
    :cond_c
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v17, v2

    .line 678
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-lez v0, :cond_d

    .line 679
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    sub-double/2addr v0, v11

    sub-double/2addr v0, v13

    sub-double/2addr v0, v15

    sub-double v17, v0, v19

    .line 681
    :cond_d
    const-wide/16 v0, 0x0

    cmpg-double v0, v17, v0

    if-gez v0, :cond_e

    .line 682
    const-wide/16 v17, 0x0

    .line 684
    :cond_e
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceBottomTVs, per_cent walk ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->r:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v17

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 688
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->v:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v14}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 689
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->y:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v12}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 690
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->x:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v19

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 691
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->w:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide v2, v15

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 693
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    mul-double v1, v7, v17

    double-to-float v1, v1

    mul-double v2, v7, v11

    double-to-float v2, v2

    mul-double v3, v7, v13

    double-to-float v3, v3

    mul-double v4, v7, v15

    double-to-float v4, v4

    mul-double v5, v7, v19

    double-to-float v5, v5

    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setViewData(FFFFF)V

    .line 695
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    invoke-virtual {v0}, Lo/eyi;->invalidate()V

    .line 696
    return-void
.end method

.method private e(Lo/fad;)V
    .locals 23

    .line 734
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 735
    return-void

    .line 738
    :cond_0
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, walkTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, runTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, rideTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, climbTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, allTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    const-wide/16 v7, 0x0

    .line 746
    const-wide/16 v9, 0x0

    .line 748
    const-wide/16 v11, 0x0

    .line 749
    const-wide/16 v13, 0x0

    .line 750
    const-wide/16 v15, 0x0

    .line 751
    const-wide/16 v17, 0x0

    .line 752
    const-wide/16 v19, 0x0

    .line 754
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->c(Lo/fad;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 755
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 756
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, allTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 758
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v1

    add-int/2addr v0, v1

    .line 759
    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v7, v0

    .line 760
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, sumData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v7

    if-lez v0, :cond_3

    .line 763
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    sub-double v9, v0, v7

    .line 764
    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v7, v0

    .line 766
    :cond_3
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v7, v0

    if-gez v0, :cond_4

    .line 767
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 770
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v11, v0

    .line 771
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/fad;->e()I

    move-result v0

    if-lez v0, :cond_5

    .line 772
    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    .line 775
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v13, v0

    .line 776
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_6

    invoke-virtual/range {p1 .. p1}, Lo/fad;->a()I

    move-result v0

    if-lez v0, :cond_6

    .line 777
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 780
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v15, v0

    .line 781
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v15, v0

    if-gez v0, :cond_7

    invoke-virtual/range {p1 .. p1}, Lo/fad;->d()I

    move-result v0

    if-lez v0, :cond_7

    .line 782
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 784
    :cond_7
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v9

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v19, v2

    .line 785
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v19, v0

    if-gez v0, :cond_8

    const-wide/16 v0, 0x0

    cmpl-double v0, v9, v0

    if-lez v0, :cond_8

    .line 786
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 788
    :cond_8
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, per_cent run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " other = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    add-double v0, v11, v13

    add-double/2addr v0, v15

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_c

    .line 792
    add-double v0, v11, v13

    add-double/2addr v0, v15

    add-double v0, v0, v19

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v21, v0, v2

    .line 793
    cmpl-double v0, v11, v13

    if-ltz v0, :cond_9

    cmpl-double v0, v11, v15

    if-ltz v0, :cond_9

    cmpl-double v0, v11, v19

    if-ltz v0, :cond_9

    .line 794
    sub-double v11, v11, v21

    goto :goto_0

    .line 795
    :cond_9
    cmpl-double v0, v15, v11

    if-ltz v0, :cond_a

    cmpl-double v0, v15, v13

    if-ltz v0, :cond_a

    cmpl-double v0, v15, v19

    if-ltz v0, :cond_a

    .line 796
    sub-double v15, v15, v21

    goto :goto_0

    .line 797
    :cond_a
    cmpl-double v0, v13, v11

    if-ltz v0, :cond_b

    cmpl-double v0, v13, v15

    if-ltz v0, :cond_b

    cmpl-double v0, v13, v19

    if-ltz v0, :cond_b

    .line 798
    sub-double v13, v13, v21

    goto :goto_0

    .line 799
    :cond_b
    cmpl-double v0, v19, v11

    if-ltz v0, :cond_c

    cmpl-double v0, v19, v13

    if-ltz v0, :cond_c

    cmpl-double v0, v19, v15

    if-ltz v0, :cond_c

    .line 800
    sub-double v19, v19, v21

    .line 804
    :cond_c
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v17, v2

    .line 805
    invoke-virtual/range {p1 .. p1}, Lo/fad;->b()I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual/range {p1 .. p1}, Lo/fad;->c()I

    move-result v0

    if-lez v0, :cond_d

    .line 806
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    sub-double/2addr v0, v11

    sub-double/2addr v0, v13

    sub-double/2addr v0, v15

    sub-double v17, v0, v19

    .line 808
    :cond_d
    const-wide/16 v0, 0x0

    cmpg-double v0, v17, v0

    if-gez v0, :cond_e

    .line 809
    const-wide/16 v17, 0x0

    .line 811
    :cond_e
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, per_cent walk ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->r:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v17

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 815
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->y:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v12}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 816
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->v:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v14}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 817
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->w:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide v2, v15

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 818
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->x:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v19

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 820
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    mul-double v1, v7, v17

    double-to-float v1, v1

    mul-double v2, v7, v11

    double-to-float v2, v2

    mul-double v3, v7, v13

    double-to-float v3, v3

    mul-double v4, v7, v15

    double-to-float v4, v4

    mul-double v5, v7, v19

    double-to-float v5, v5

    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setViewData(FFFFF)V

    .line 826
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    invoke-virtual {v0}, Lo/eyi;->invalidate()V

    .line 827
    return-void
.end method

.method private i(Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;)I"
        }
    .end annotation

    .line 1136
    const/4 v4, -0x1

    .line 1137
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 1138
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->b()I

    move-result v0

    if-lez v0, :cond_0

    .line 1139
    move v4, v5

    .line 1137
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1142
    :cond_1
    const-string v0, "SCUI_index"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findLastValidIndex="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    return v4
.end method


# virtual methods
.method protected a(Ljava/util/List;)D
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)D"
        }
    .end annotation

    .line 945
    const-wide/16 v4, 0x0

    .line 946
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 947
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_0

    .line 948
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 946
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 951
    :cond_1
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 952
    return-wide v4
.end method

.method public abstract a()V
.end method

.method protected a(II)V
    .locals 2

    .line 1083
    if-lez p1, :cond_0

    .line 1084
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->B:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 1087
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->B:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1090
    :goto_0
    if-lt p1, p2, :cond_1

    .line 1091
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->C:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 1094
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1096
    :goto_1
    return-void
.end method

.method protected a(Landroid/view/View;)V
    .locals 2

    .line 314
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->p:Landroid/widget/TextView;

    .line 316
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->h:Landroid/widget/TextView;

    .line 318
    sget v0, Lcom/huawei/ui/main/R$id;->total_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->s:Landroid/widget/TextView;

    .line 319
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-nez v0, :cond_1

    .line 320
    sget v0, Lcom/huawei/ui/main/R$id;->total_data_tv_bg:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyi;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->z:Lo/eyi;

    .line 322
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_walk_data:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->r:Landroid/widget/TextView;

    .line 323
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_run_data:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->y:Landroid/widget/TextView;

    .line 324
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_ride_data:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->v:Landroid/widget/TextView;

    .line 325
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_climb_data:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->w:Landroid/widget/TextView;

    .line 326
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_other_data:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->x:Landroid/widget/TextView;

    .line 328
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_ride_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->u:Landroid/widget/LinearLayout;

    .line 329
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_other_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->t:Landroid/widget/LinearLayout;

    .line 331
    sget v0, Lcom/huawei/ui/main/R$id;->rl_steps_share_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->G:Landroid/widget/LinearLayout;

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 333
    sget v0, Lcom/huawei/ui/main/R$id;->ll_origin_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->K:Landroid/widget/LinearLayout;

    .line 334
    sget v0, Lcom/huawei/ui/main/R$id;->share_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->N:Landroid/widget/ImageView;

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 336
    sget v0, Lcom/huawei/ui/main/R$id;->tv_share_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->L:Landroid/widget/TextView;

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->L:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 339
    sget v0, Lcom/huawei/ui/main/R$id;->ll_steps_detail_has_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    .line 340
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->M:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 344
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->origin_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->O:Landroid/widget/ImageView;

    .line 345
    sget v0, Lcom/huawei/ui/main/R$id;->tv_origin_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->R:Landroid/widget/TextView;

    .line 347
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->ll_steps_detail_no_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->J:Landroid/widget/LinearLayout;

    .line 348
    sget v0, Lcom/huawei/ui/main/R$id;->tv_no_detail_data_tips_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->P:Landroid/widget/TextView;

    .line 365
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_data_pannel:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->m:Landroid/widget/LinearLayout;

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 367
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_pannel:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->q:Landroid/widget/LinearLayout;

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 370
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->o:Landroid/widget/TextView;

    .line 371
    sget v0, Lcom/huawei/ui/main/R$id;->average_data_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->l:Landroid/widget/TextView;

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->l:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->j:Landroid/widget/ImageView;

    .line 374
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->A:Landroid/widget/ImageView;

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->A:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 379
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->A:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 384
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->C:Landroid/view/View;

    .line 385
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->B:Landroid/view/View;

    .line 387
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->I:I

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->B:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 390
    return-void
.end method

.method public a(Lo/fad;Ljava/lang/String;)V
    .locals 5

    .line 702
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCalorieTotalDatasUI takeAllTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 706
    invoke-virtual {p0, v4, p2}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 708
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    .line 709
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fad;->c(I)V

    .line 711
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Lo/fad;)V

    .line 712
    return-void
.end method

.method public a(Lo/fad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 715
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCalorieTotalDatasUI totalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 717
    :cond_0
    return-void

    .line 719
    :cond_1
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-double v1, v5

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 721
    invoke-virtual {p0, v6, p2}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    const/16 v0, 0x1f4

    if-ge v5, v0, :cond_2

    .line 725
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/fad;->c(I)V

    .line 727
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Lo/fad;)V

    .line 728
    return-void
.end method

.method protected declared-synchronized b(Ljava/util/List;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;I)Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation

    monitor-enter p0

    .line 1039
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1040
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1041
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 1044
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1045
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseToBarChartDataVerification fitnessHistogramDatas.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    .line 1047
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->b()I

    move-result v8

    .line 1048
    if-lt v8, p2, :cond_0

    .line 1049
    int-to-double v0, v8

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1052
    :cond_0
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1046
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1055
    :cond_1
    monitor-exit p0

    return-object v6

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public abstract b()V
.end method

.method protected b(IIIII)V
    .locals 1

    .line 1072
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 1073
    return-void

    .line 1075
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1076
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->y:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->v:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->w:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1079
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->x:Landroid/widget/TextView;

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1080
    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    return-void
.end method

.method protected b(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)Z"
        }
    .end annotation

    .line 1121
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1122
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1124
    :cond_1
    const-wide/16 v2, 0x0

    .line 1125
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1126
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    add-double/2addr v2, v0

    .line 1125
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1128
    :cond_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v2, v0

    if-lez v0, :cond_3

    .line 1129
    const/4 v0, 0x1

    return v0

    .line 1132
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method protected declared-synchronized c(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;)Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation

    monitor-enter p0

    .line 961
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 962
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 964
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 965
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseToBarChartData fitness.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 966
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 967
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->b()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 966
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 969
    :cond_0
    monitor-exit p0

    return-object v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c()V
    .locals 0

    .line 226
    return-void
.end method

.method protected c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 412
    const/16 v0, 0x1e

    const/16 v1, 0x10

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->d(Ljava/lang/String;ILjava/lang/String;I)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    return-void
.end method

.method public c(Lo/fad;Ljava/lang/String;)V
    .locals 5

    .line 585
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v0, v2

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dbf;->b(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 588
    invoke-virtual {p0, v4, p2}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->d(Lo/fad;)V

    .line 590
    return-void
.end method

.method public c(Lo/fad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 465
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsTotalDatasUI, totalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    invoke-static {p3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object p3

    .line 467
    invoke-virtual {p0, p3, p2}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(Lo/fad;)V

    .line 469
    return-void
.end method

.method protected c_()Z
    .locals 1

    .line 174
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 0

    .line 222
    return-void
.end method

.method public d(Lo/fad;Ljava/lang/String;)V
    .locals 5

    .line 456
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStepsTotalDatasUI,takeAllTotalData= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    invoke-virtual {p1}, Lo/fad;->c()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 460
    invoke-virtual {p0, v4, p2}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->b(Lo/fad;)V

    .line 462
    return-void
.end method

.method protected d(Ljava/util/Date;)Z
    .locals 8

    .line 1146
    const/4 v4, 0x0

    .line 1147
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v5

    .line 1148
    const/4 v0, -0x5

    invoke-static {v5, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 1149
    invoke-static {v6}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    .line 1150
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 1151
    const/4 v4, 0x1

    .line 1153
    :cond_0
    return v4
.end method

.method protected d(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Double;>;)Z"
        }
    .end annotation

    .line 1100
    const/4 v2, 0x0

    .line 1101
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1102
    return v2

    .line 1105
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1106
    invoke-interface {v3, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1107
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 1108
    const-wide/16 v5, 0x0

    .line 1109
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_2

    .line 1110
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    add-double/2addr v5, v0

    .line 1111
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v5, v0

    if-lez v0, :cond_1

    .line 1112
    const/4 v2, 0x1

    .line 1113
    return v2

    .line 1109
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1117
    :cond_2
    return v2
.end method

.method protected declared-synchronized e(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;)Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation

    monitor-enter p0

    .line 993
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 994
    move-object/from16 v0, p1

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 995
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 996
    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->i(Ljava/util/List;)I

    move-result v6

    .line 997
    const-wide/16 v7, 0x0

    .line 998
    const-wide/16 v9, 0x0

    .line 999
    const-wide/16 v11, 0x0

    .line 1001
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1002
    const-string v0, "SCUI_BaseDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseToBarChartDataKcal fitnessHistogramDatas.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    const/4 v14, 0x0

    :goto_0
    if-ge v14, v5, :cond_5

    .line 1004
    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eux;

    invoke-virtual {v0}, Lo/eux;->b()I

    move-result v15

    .line 1005
    int-to-double v0, v15

    add-double/2addr v7, v0

    .line 1006
    const-string v0, "SCUI_index"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " anchorList.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    const/4 v0, 0x1

    if-le v5, v0, :cond_0

    if-ge v14, v6, :cond_0

    .line 1008
    int-to-double v0, v15

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    add-double/2addr v9, v0

    .line 1010
    :cond_0
    const/4 v0, 0x1

    if-le v5, v0, :cond_2

    if-ne v14, v6, :cond_2

    .line 1011
    const-string v0, "SCUI_index"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "i == findLastValidIndex(anchorList)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1012
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v7, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v11, v0

    .line 1013
    sub-double v0, v11, v9

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 1014
    const-string v0, "SCUI_index"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalCalFormat="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " totalCalExceptLastFormated="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1015
    sub-double v0, v11, v9

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1017
    :cond_1
    if-lez v15, :cond_4

    .line 1018
    const-wide v0, 0x3fd3333333333333L    # 0.3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1022
    :cond_2
    int-to-double v0, v15

    const-wide v2, 0x407f400000000000L    # 500.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    if-lez v15, :cond_3

    .line 1023
    int-to-double v0, v15

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1025
    :cond_3
    int-to-double v0, v15

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1003
    :cond_4
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 1029
    :cond_5
    monitor-exit p0

    return-object v13

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 404
    const/16 v0, 0x1e

    const/16 v1, 0x10

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->d(Ljava/lang/String;ILjava/lang/String;I)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 406
    return-void
.end method

.method public i()V
    .locals 0

    .line 230
    return-void
.end method

.method protected k()V
    .locals 0

    .line 289
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 168
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->c_()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    .line 170
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 181
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Fragment onCreateView getActivity null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 186
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->Q:Z

    if-eqz v0, :cond_1

    .line 187
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_detail_new_step:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    goto :goto_0

    .line 189
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    .line 192
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->g:Landroid/content/Context;

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->S:Lo/cmj;

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->detail_markview_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->X:Landroid/widget/TextView;

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->detail_markview_data:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->U:Landroid/widget/TextView;

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->detail_markview_data_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->W:Landroid/widget/TextView;

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->a(Landroid/view/View;)V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->a()V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->c(Landroid/view/View;)V

    .line 203
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k()V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->D:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;->k:Landroid/view/View;

    return-object v0
.end method
