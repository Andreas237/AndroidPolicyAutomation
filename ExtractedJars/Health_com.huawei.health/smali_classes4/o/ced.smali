.class public Lo/ced;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cej;
.implements Lo/cel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ced$e;
    }
.end annotation


# instance fields
.field private a:Lo/cbk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ced;->a:Lo/cbk;

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 707
    invoke-direct {p0}, Lo/ced;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 708
    sget-object v0, Lo/ced$e;->af:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 709
    return-void

    .line 711
    :cond_0
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lo/ced;->d(I)I

    move-result v1

    .line 712
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 715
    :pswitch_0
    sget-object v0, Lo/ced$e;->aj:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 716
    goto/16 :goto_1

    .line 718
    :pswitch_1
    sget-object v0, Lo/ced$e;->ai:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 719
    goto/16 :goto_1

    .line 721
    :pswitch_2
    sget-object v0, Lo/ced$e;->aq:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 722
    goto/16 :goto_1

    .line 724
    :pswitch_3
    sget-object v0, Lo/ced$e;->an:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 725
    goto :goto_1

    .line 727
    :pswitch_4
    sget-object v0, Lo/ced$e;->ag:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 728
    goto :goto_1

    .line 730
    :pswitch_5
    sget-object v0, Lo/ced$e;->am:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    goto :goto_1

    .line 733
    :pswitch_6
    sget-object v0, Lo/ced$e;->ak:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 734
    goto :goto_1

    .line 736
    :pswitch_7
    sget-object v0, Lo/ced$e;->ae:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 737
    goto :goto_1

    .line 740
    :goto_0
    invoke-direct {p0}, Lo/ced;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 741
    sget-object v0, Lo/ced$e;->al:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 744
    :cond_1
    sget-object v0, Lo/ced$e;->aj:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 748
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private a(Ljava/util/List;F)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;F)V"
        }
    .end annotation

    .line 821
    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 822
    int-to-float v0, v4

    sub-float v0, p2, v0

    float-to-double v5, v0

    .line 825
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v5, v6}, Ljava/math/BigDecimal;-><init>(D)V

    .line 826
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v7, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v5

    .line 828
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "int="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " float="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    invoke-static {v5, v6}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v8

    .line 831
    const/16 v0, 0x2e

    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    .line 832
    const/4 v10, 0x0

    .line 833
    if-ltz v9, :cond_0

    .line 835
    add-int/lit8 v0, v9, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 836
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 839
    :cond_0
    if-ltz v9, :cond_1

    if-gtz v10, :cond_3

    .line 841
    :cond_1
    if-nez v4, :cond_2

    .line 842
    sget-object v0, Lo/ced$e;->H:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 844
    :cond_2
    invoke-direct {p0, p1, v4}, Lo/ced;->d(Ljava/util/List;I)V

    goto :goto_2

    .line 849
    :cond_3
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_4

    .line 850
    sget-object v0, Lo/ced$e;->H:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 852
    :cond_4
    invoke-direct {p0, p1, v4}, Lo/ced;->d(Ljava/util/List;I)V

    .line 855
    :goto_0
    sget-object v0, Lo/ced$e;->E:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 857
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_5

    .line 858
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    .line 860
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_5

    .line 861
    invoke-virtual {v8, v12}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lo/ced;->b(Ljava/util/List;I)V

    .line 860
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 867
    :cond_5
    :goto_2
    sget-object v0, Lo/ced$e;->n:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 868
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 367
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 371
    :sswitch_0
    goto/16 :goto_0

    .line 373
    :sswitch_1
    sget-object v0, Lo/ced$e;->aa:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 374
    goto :goto_0

    .line 376
    :sswitch_2
    sget-object v0, Lo/ced$e;->W:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    goto :goto_0

    .line 379
    :sswitch_3
    sget-object v0, Lo/ced$e;->T:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 380
    goto :goto_0

    .line 382
    :sswitch_4
    sget-object v0, Lo/ced$e;->V:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 383
    goto :goto_0

    .line 385
    :sswitch_5
    sget-object v0, Lo/ced$e;->Y:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    goto :goto_0

    .line 388
    :sswitch_6
    sget-object v0, Lo/ced$e;->y:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    goto :goto_0

    .line 391
    :sswitch_7
    sget-object v0, Lo/ced$e;->Z:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 392
    .line 398
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x3c -> :sswitch_4
        0x46 -> :sswitch_5
        0x50 -> :sswitch_6
        0x5a -> :sswitch_7
    .end sparse-switch
.end method

.method private a(Ljava/util/List;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;J)V"
        }
    .end annotation

    .line 426
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTimeResource time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    const-wide/16 v0, 0x3e8

    div-long/2addr p2, v0

    .line 429
    invoke-direct {p0, p1, p2, p3}, Lo/ced;->e(Ljava/util/List;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    sget-object v0, Lo/ced$e;->m:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/ced;->d(Ljava/util/List;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    sget-object v0, Lo/ced$e;->k:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/ced;->b(Ljava/util/List;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 441
    sget-object v0, Lo/ced$e;->f:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 444
    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;Lo/cem;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cem;)V"
        }
    .end annotation

    .line 772
    invoke-virtual {p2}, Lo/cem;->d()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lo/cem;->a()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lo/cem;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/cem;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 773
    :cond_0
    invoke-virtual {p2}, Lo/cem;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lo/cem;->f()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    invoke-virtual {p2}, Lo/cem;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 774
    :cond_2
    sget-object v0, Lo/ced$e;->h:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 776
    :cond_3
    return-void
.end method

.method private a()Z
    .locals 4

    .line 759
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v1

    .line 760
    if-eqz v1, :cond_0

    .line 761
    invoke-virtual {v1}, Lo/dao;->b()I

    move-result v2

    .line 762
    invoke-virtual {v1}, Lo/dao;->c()I

    move-result v3

    .line 763
    if-lez v2, :cond_0

    const/16 v0, 0x19

    if-gt v2, v0, :cond_0

    if-nez v3, :cond_0

    .line 764
    const/4 v0, 0x1

    return v0

    .line 767
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 356
    sget-object v0, Lo/ced$e;->au:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    sget-object v0, Lo/ced$e;->ac:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    return-object p1
.end method

.method private b(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 614
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 617
    :pswitch_0
    sget-object v0, Lo/ced$e;->H:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 618
    goto/16 :goto_0

    .line 620
    :pswitch_1
    sget-object v0, Lo/ced$e;->l:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 621
    goto/16 :goto_0

    .line 623
    :pswitch_2
    sget-object v0, Lo/ced$e;->o:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 624
    goto/16 :goto_0

    .line 626
    :pswitch_3
    sget-object v0, Lo/ced$e;->s:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 627
    goto :goto_0

    .line 629
    :pswitch_4
    sget-object v0, Lo/ced$e;->r:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 630
    goto :goto_0

    .line 632
    :pswitch_5
    sget-object v0, Lo/ced$e;->t:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 633
    goto :goto_0

    .line 635
    :pswitch_6
    sget-object v0, Lo/ced$e;->u:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 636
    goto :goto_0

    .line 638
    :pswitch_7
    sget-object v0, Lo/ced$e;->q:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    goto :goto_0

    .line 641
    :pswitch_8
    sget-object v0, Lo/ced$e;->w:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 642
    goto :goto_0

    .line 644
    :pswitch_9
    sget-object v0, Lo/ced$e;->z:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 645
    .line 649
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method private b(Ljava/util/List;Lo/cem;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cem;)V"
        }
    .end annotation

    .line 936
    invoke-virtual {p2}, Lo/cem;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 937
    invoke-virtual {p2}, Lo/cem;->f()I

    move-result v4

    .line 938
    if-lez v4, :cond_0

    .line 939
    sget-object v0, Lo/ced$e;->O:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 940
    invoke-direct {p0, p1, v4}, Lo/ced;->d(Ljava/util/List;I)V

    goto/16 :goto_1

    .line 942
    :cond_0
    invoke-virtual {p2}, Lo/cem;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lo/cem;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lo/cem;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lo/cem;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 943
    :cond_1
    invoke-virtual {p2}, Lo/cem;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 945
    return-void

    .line 947
    :cond_2
    iget-object v0, p0, Lo/ced;->a:Lo/cbk;

    if-eqz v0, :cond_5

    .line 948
    iget-object v0, p0, Lo/ced;->a:Lo/cbk;

    invoke-interface {v0}, Lo/cbk;->d()Landroid/os/Bundle;

    move-result-object v5

    .line 949
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "launchTrackSportStateBroadcast, result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    const-string v0, "isBindedHeartRateDeviceAll"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 951
    const-string v0, "isConnectedHeartRateDeviceAll"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 952
    if-nez v6, :cond_3

    .line 954
    sget-object v0, Lo/ced$e;->ax:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 956
    :cond_3
    if-nez v7, :cond_4

    .line 958
    sget-object v0, Lo/ced$e;->ax:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 961
    :cond_4
    sget-object v0, Lo/ced$e;->O:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 962
    sget-object v0, Lo/ced$e;->az:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 965
    :goto_0
    goto :goto_1

    .line 966
    :cond_5
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "launchTrackSportStateBroadcast, mHeartRateDeviceAdapter = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    :cond_6
    :goto_1
    return-void
.end method

.method private b(Ljava/util/List;J)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;J)Z"
        }
    .end annotation

    .line 522
    const/4 v2, 0x0

    .line 524
    const-wide/16 v0, 0x3c

    rem-long v0, p2, v0

    long-to-int v3, v0

    .line 525
    div-int/lit8 v4, v3, 0xa

    .line 526
    rem-int/lit8 v5, v3, 0xa

    .line 528
    if-lez v4, :cond_1

    .line 530
    const/4 v0, 0x1

    if-le v4, v0, :cond_0

    .line 532
    invoke-direct {p0, p1, v4}, Lo/ced;->b(Ljava/util/List;I)V

    .line 534
    :cond_0
    sget-object v0, Lo/ced$e;->v:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 535
    const/4 v2, 0x1

    .line 538
    :cond_1
    if-lez v5, :cond_2

    .line 540
    invoke-direct {p0, p1, v5}, Lo/ced;->b(Ljava/util/List;I)V

    .line 541
    const/4 v2, 0x1

    .line 544
    :cond_2
    return v2
.end method

.method private c(ILjava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 189
    const/4 v1, 0x0

    .line 190
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 193
    :pswitch_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 194
    sget-object v0, Lo/ced$e;->J:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    sget-object v0, Lo/ced$e;->L:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    if-eqz p2, :cond_0

    .line 197
    invoke-direct {p0, v1, p2}, Lo/ced;->e(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    goto/16 :goto_1

    .line 201
    :pswitch_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 202
    sget-object v0, Lo/ced$e;->K:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    sget-object v0, Lo/ced$e;->M:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    if-eqz p2, :cond_0

    .line 205
    invoke-direct {p0, v1, p2}, Lo/ced;->e(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    goto/16 :goto_1

    .line 209
    :pswitch_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    sget-object v0, Lo/ced$e;->Q:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    goto/16 :goto_1

    .line 213
    :pswitch_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 214
    sget-object v0, Lo/ced$e;->A:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    sget-object v0, Lo/ced$e;->j:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    goto/16 :goto_1

    .line 218
    :pswitch_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 219
    sget-object v0, Lo/ced$e;->A:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    sget-object v0, Lo/ced$e;->P:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    goto :goto_1

    .line 223
    :pswitch_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 224
    if-eqz p2, :cond_0

    .line 225
    invoke-direct {p0, v1, p2}, Lo/ced;->d(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    goto :goto_1

    .line 229
    :pswitch_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 230
    if-eqz p2, :cond_0

    .line 231
    invoke-direct {p0, v1}, Lo/ced;->b(Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 235
    :pswitch_7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 236
    invoke-direct {p0, v1}, Lo/ced;->a(Ljava/util/List;)V

    .line 237
    goto :goto_1

    .line 239
    :pswitch_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 240
    invoke-direct {p0, v1}, Lo/ced;->d(Ljava/util/List;)V

    .line 241
    goto :goto_1

    .line 243
    :goto_0
    :pswitch_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 244
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    :cond_0
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private c(Ljava/lang/Object;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 281
    instance-of v0, p1, Lo/cek;

    if-nez v0, :cond_0

    .line 283
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructCountDownVoiceContent parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 285
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    return-object v4

    .line 288
    :cond_0
    move-object v4, p1

    check-cast v4, Lo/cek;

    .line 289
    invoke-virtual {v4}, Lo/cek;->b()I

    move-result v5

    .line 290
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 291
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 294
    :pswitch_0
    sget-object v0, Lo/ced$e;->ar:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    goto :goto_0

    .line 297
    :pswitch_1
    sget-object v0, Lo/ced$e;->ao:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    goto :goto_0

    .line 300
    :pswitch_2
    sget-object v0, Lo/ced$e;->ap:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    .line 305
    :goto_0
    return-object v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private c(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 812
    if-lez p2, :cond_0

    .line 813
    invoke-direct {p0, p1, p2}, Lo/ced;->d(Ljava/util/List;I)V

    .line 814
    sget-object v0, Lo/ced$e;->n:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 816
    :cond_0
    return-void
.end method

.method private c(Ljava/util/List;Lo/cem;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cem;)V"
        }
    .end annotation

    .line 873
    invoke-virtual {p2}, Lo/cem;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 874
    invoke-virtual {p2}, Lo/cem;->i()J

    move-result-wide v4

    .line 875
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "voicePace, lastPace = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_3

    .line 877
    const-wide/16 v0, 0x3e8

    cmp-long v0, v4, v0

    if-gtz v0, :cond_1

    .line 878
    invoke-virtual {p2}, Lo/cem;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/cem;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/cem;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 879
    invoke-virtual {p2}, Lo/cem;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 881
    return-void

    .line 884
    :cond_0
    sget-object v0, Lo/ced$e;->ay:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 885
    :cond_1
    const-wide/16 v0, 0x3e8

    cmp-long v0, v4, v0

    if-lez v0, :cond_3

    .line 886
    sget-object v0, Lo/ced$e;->p:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 887
    invoke-direct {p0, p1, v4, v5}, Lo/ced;->a(Ljava/util/List;J)V

    .line 889
    invoke-virtual {p2}, Lo/cem;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 890
    sget-object v0, Lo/ced$e;->y:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 892
    :cond_2
    sget-object v0, Lo/ced$e;->g:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 897
    :cond_3
    :goto_0
    return-void
.end method

.method private c()Z
    .locals 4

    .line 751
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 752
    const-wide v0, 0x166260edc00L

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    const-wide v0, 0x1664f41bc00L

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    .line 753
    const/4 v0, 0x1

    return v0

    .line 755
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(I)I
    .locals 2

    .line 665
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 666
    invoke-virtual {v1, p1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    return v0
.end method

.method private d(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 334
    instance-of v0, p2, Lo/cek;

    if-nez v0, :cond_0

    .line 336
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructCountDownDistanceVoiceContent parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    return-object p1

    .line 339
    :cond_0
    sget-object v0, Lo/ced$e;->U:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    move-object v4, p2

    check-cast v4, Lo/cek;

    .line 341
    invoke-virtual {v4}, Lo/cek;->e()F

    move-result v5

    .line 342
    invoke-virtual {v4}, Lo/cek;->b()I

    move-result v6

    .line 343
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gtz v0, :cond_1

    .line 344
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructCountDownDistanceVoiceContent duration is less than 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-object p1

    .line 347
    :cond_1
    float-to-int v0, v5

    invoke-direct {p0, p1, v0}, Lo/ced;->d(Ljava/util/List;I)V

    .line 348
    sget-object v0, Lo/ced$e;->n:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    invoke-direct {p0, p1, v6}, Lo/ced;->a(Ljava/util/List;I)V

    .line 350
    return-object p1
.end method

.method private d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 671
    invoke-direct {p0}, Lo/ced;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 672
    sget-object v0, Lo/ced$e;->af:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 673
    return-void

    .line 675
    :cond_0
    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lo/ced;->d(I)I

    move-result v1

    .line 676
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 679
    :pswitch_0
    sget-object v0, Lo/ced$e;->aj:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 680
    goto/16 :goto_1

    .line 682
    :pswitch_1
    sget-object v0, Lo/ced$e;->ai:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 683
    goto :goto_1

    .line 685
    :pswitch_2
    sget-object v0, Lo/ced$e;->aq:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 686
    goto :goto_1

    .line 688
    :pswitch_3
    sget-object v0, Lo/ced$e;->an:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 689
    goto :goto_1

    .line 691
    :pswitch_4
    sget-object v0, Lo/ced$e;->ag:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 692
    goto :goto_1

    .line 694
    :pswitch_5
    sget-object v0, Lo/ced$e;->am:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 695
    goto :goto_1

    .line 697
    :pswitch_6
    sget-object v0, Lo/ced$e;->ak:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 698
    goto :goto_1

    .line 700
    :goto_0
    sget-object v0, Lo/ced$e;->aj:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 703
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private d(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 556
    move v2, p2

    .line 558
    const/4 v0, 0x5

    new-array v3, v0, [I

    .line 559
    const/4 v4, 0x0

    .line 562
    :goto_0
    const/16 v0, 0xa

    if-lt v2, v0, :cond_0

    .line 564
    rem-int/lit8 v0, v2, 0xa

    aput v0, v3, v4

    .line 565
    div-int/lit8 v2, v2, 0xa

    .line 566
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 570
    :cond_0
    aput v2, v3, v4

    .line 572
    const/4 v0, 0x4

    new-array v5, v0, [I

    sget-object v0, Lo/ced$e;->v:Lo/ced$e;

    .line 573
    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    const/4 v1, 0x0

    aput v0, v5, v1

    sget-object v0, Lo/ced$e;->C:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    const/4 v1, 0x1

    aput v0, v5, v1

    sget-object v0, Lo/ced$e;->B:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    const/4 v1, 0x2

    aput v0, v5, v1

    sget-object v0, Lo/ced$e;->I:Lo/ced$e;

    .line 574
    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    const/4 v1, 0x3

    aput v0, v5, v1

    .line 578
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    const/4 v0, 0x1

    aget v0, v3, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 580
    add-int/lit8 v0, v4, -0x1

    aget v0, v5, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    add-int/lit8 v4, v4, -0x1

    .line 584
    :cond_1
    :goto_1
    if-lez v4, :cond_4

    .line 586
    aget v0, v3, v4

    if-lez v0, :cond_2

    .line 589
    aget v0, v3, v4

    invoke-direct {p0, p1, v0}, Lo/ced;->b(Ljava/util/List;I)V

    .line 590
    add-int/lit8 v0, v4, -0x1

    aget v0, v5, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 591
    :cond_2
    const/4 v0, 0x1

    if-ne v4, v0, :cond_3

    const/4 v0, 0x1

    aget v0, v3, v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    aget v0, v3, v0

    if-eqz v0, :cond_3

    .line 592
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ced;->b(Ljava/util/List;I)V

    .line 594
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 597
    :cond_4
    aget v0, v3, v4

    if-lez v0, :cond_5

    .line 600
    aget v0, v3, v4

    invoke-direct {p0, p1, v0}, Lo/ced;->b(Ljava/util/List;I)V

    .line 602
    :cond_5
    return-void
.end method

.method private d(Ljava/util/List;Lo/cem;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cem;I)V"
        }
    .end annotation

    .line 782
    invoke-virtual {p2}, Lo/cem;->d()Z

    move-result v1

    .line 783
    invoke-virtual {p2}, Lo/cem;->a()Z

    move-result v2

    .line 784
    invoke-virtual {p2}, Lo/cem;->g()I

    move-result v3

    .line 785
    invoke-virtual {p2}, Lo/cem;->h()F

    move-result v4

    .line 786
    invoke-virtual {p2}, Lo/cem;->k()J

    move-result-wide v5

    .line 788
    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    .line 789
    :cond_0
    invoke-direct {p0, v3}, Lo/ced;->e(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 792
    :cond_1
    if-eqz v1, :cond_3

    .line 794
    const/16 v0, 0x9

    if-ne p3, v0, :cond_2

    .line 795
    float-to-int v0, v4

    invoke-direct {p0, p1, v0}, Lo/ced;->c(Ljava/util/List;I)V

    goto :goto_0

    .line 797
    :cond_2
    invoke-direct {p0, p1, v4}, Lo/ced;->a(Ljava/util/List;F)V

    .line 801
    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    .line 803
    sget-object v0, Lo/ced$e;->i:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 805
    :cond_4
    if-eqz v2, :cond_5

    .line 806
    invoke-direct {p0, p1, v5, v6}, Lo/ced;->a(Ljava/util/List;J)V

    .line 808
    :cond_5
    return-void
.end method

.method private d(Ljava/util/List;J)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;J)Z"
        }
    .end annotation

    .line 493
    const/4 v4, 0x0

    .line 495
    const-wide/16 v0, 0x3c

    div-long v0, p2, v0

    const-wide/16 v2, 0x3c

    rem-long/2addr v0, v2

    long-to-int v5, v0

    .line 496
    div-int/lit8 v6, v5, 0xa

    .line 497
    rem-int/lit8 v7, v5, 0xa

    .line 499
    if-lez v6, :cond_1

    .line 501
    const/4 v0, 0x1

    if-le v6, v0, :cond_0

    .line 503
    invoke-direct {p0, p1, v6}, Lo/ced;->b(Ljava/util/List;I)V

    .line 505
    :cond_0
    sget-object v0, Lo/ced$e;->v:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 506
    const/4 v4, 0x1

    .line 509
    :cond_1
    if-lez v7, :cond_2

    .line 511
    invoke-direct {p0, p1, v7}, Lo/ced;->b(Ljava/util/List;I)V

    .line 512
    const/4 v4, 0x1

    .line 515
    :cond_2
    return v4
.end method

.method private e(I)I
    .locals 2

    .line 404
    const/4 v1, -0x1

    .line 405
    packed-switch p1, :pswitch_data_0

    nop

    .line 411
    :pswitch_0
    sget-object v0, Lo/ced$e;->e:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v1

    .line 415
    return v1

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private e(Ljava/lang/Object;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 259
    instance-of v0, p1, Lo/cem;

    if-nez v0, :cond_0

    .line 261
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDistanceTimeContent parameter is invalid."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 263
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    return-object v4

    .line 267
    :cond_0
    move-object v4, p1

    check-cast v4, Lo/cem;

    .line 269
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-direct {p0, v5, v4}, Lo/ced;->a(Ljava/util/List;Lo/cem;)V

    .line 271
    invoke-direct {p0, v5, v4, p2}, Lo/ced;->d(Ljava/util/List;Lo/cem;I)V

    .line 272
    invoke-direct {p0, v5, v4}, Lo/ced;->c(Ljava/util/List;Lo/cem;)V

    .line 273
    invoke-direct {p0, v5, v4}, Lo/ced;->b(Ljava/util/List;Lo/cem;)V

    .line 274
    invoke-direct {p0, v5, v4}, Lo/ced;->e(Ljava/util/List;Lo/cem;)V

    .line 275
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    return-object v5
.end method

.method private e(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 312
    instance-of v0, p2, Lo/cek;

    if-nez v0, :cond_0

    .line 314
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDurationVoiceContent parameter is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 316
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    return-object v4

    .line 320
    :cond_0
    move-object v4, p2

    check-cast v4, Lo/cek;

    .line 321
    invoke-virtual {v4}, Lo/cek;->d()J

    move-result-wide v5

    .line 322
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 323
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDurationVoiceContent duration is less than 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    return-object p1

    .line 326
    :cond_1
    sget-object v0, Lo/ced$e;->i:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    invoke-direct {p0, p1, v5, v6}, Lo/ced;->a(Ljava/util/List;J)V

    .line 328
    return-object p1
.end method

.method private e(Ljava/util/List;Lo/cem;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/cem;)V"
        }
    .end annotation

    .line 901
    invoke-virtual {p2}, Lo/cem;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 902
    invoke-virtual {p2}, Lo/cem;->m()F

    move-result v4

    .line 903
    invoke-virtual {p2}, Lo/cem;->g()I

    move-result v5

    .line 904
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_3

    .line 906
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "voiceSpeed ,mSpeed > 0.0f "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    const/16 v0, 0x108

    if-eq v0, v5, :cond_0

    const/16 v0, 0x101

    if-eq v0, v5, :cond_0

    const/16 v0, 0x102

    if-ne v0, v5, :cond_1

    .line 908
    :cond_0
    const/high16 v0, 0x45610000    # 3600.0f

    div-float/2addr v0, v4

    float-to-int v6, v0

    .line 909
    sget-object v0, Lo/ced$e;->aw:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 910
    int-to-long v0, v6

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {p0, p1, v0, v1}, Lo/ced;->a(Ljava/util/List;J)V

    .line 911
    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x103

    if-eq v0, v5, :cond_2

    const/16 v0, 0x109

    if-ne v0, v5, :cond_8

    .line 912
    :cond_2
    invoke-static {v4}, Lo/cds;->a(F)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    .line 913
    sget-object v0, Lo/ced$e;->av:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 914
    double-to-float v0, v6

    invoke-direct {p0, p1, v0}, Lo/ced;->a(Ljava/util/List;F)V

    .line 915
    sget-object v0, Lo/ced$e;->at:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 916
    goto/16 :goto_0

    .line 918
    :cond_3
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "voiceSpeed, mSpeed = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    invoke-virtual {p2}, Lo/cem;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lo/cem;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lo/cem;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 920
    invoke-virtual {p2}, Lo/cem;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 922
    return-void

    .line 924
    :cond_4
    const/16 v0, 0x108

    if-eq v0, v5, :cond_5

    const/16 v0, 0x101

    if-eq v0, v5, :cond_5

    const/16 v0, 0x102

    if-ne v0, v5, :cond_6

    .line 925
    :cond_5
    sget-object v0, Lo/ced$e;->as:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 926
    :cond_6
    const/16 v0, 0x103

    if-eq v0, v5, :cond_7

    const/16 v0, 0x109

    if-ne v0, v5, :cond_8

    .line 927
    :cond_7
    sget-object v0, Lo/ced$e;->av:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 928
    sget-object v0, Lo/ced$e;->az:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 932
    :cond_8
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;J)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;J)Z"
        }
    .end annotation

    .line 449
    const/4 v2, 0x0

    .line 451
    const-wide/16 v0, 0xe10

    div-long v0, p2, v0

    long-to-int v3, v0

    .line 452
    div-int/lit16 v0, v3, 0x3e8

    rem-int/lit8 v4, v0, 0xa

    .line 453
    div-int/lit8 v0, v3, 0x64

    rem-int/lit8 v5, v0, 0xa

    .line 454
    div-int/lit8 v6, v3, 0xa

    .line 455
    rem-int/lit8 v7, v3, 0xa

    .line 457
    if-lez v4, :cond_0

    .line 459
    invoke-direct {p0, p1, v4}, Lo/ced;->b(Ljava/util/List;I)V

    .line 460
    sget-object v0, Lo/ced$e;->B:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    const/4 v2, 0x1

    .line 464
    :cond_0
    if-lez v5, :cond_1

    .line 466
    invoke-direct {p0, p1, v5}, Lo/ced;->b(Ljava/util/List;I)V

    .line 467
    sget-object v0, Lo/ced$e;->C:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 468
    const/4 v2, 0x1

    .line 471
    :cond_1
    if-lez v6, :cond_3

    .line 473
    if-nez v2, :cond_2

    const/4 v0, 0x1

    if-le v6, v0, :cond_2

    .line 475
    invoke-direct {p0, p1, v6}, Lo/ced;->b(Ljava/util/List;I)V

    .line 477
    :cond_2
    sget-object v0, Lo/ced$e;->v:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 478
    const/4 v2, 0x1

    .line 481
    :cond_3
    if-lez v7, :cond_4

    .line 483
    invoke-direct {p0, p1, v7}, Lo/ced;->b(Ljava/util/List;I)V

    .line 484
    const/4 v2, 0x1

    .line 486
    :cond_4
    return v2
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 655
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 656
    invoke-static {}, Lo/ced$e;->values()[Lo/ced$e;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 658
    invoke-virtual {v8}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8}, Lo/ced$e;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 660
    :cond_0
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSoundResource() map size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    return-object v4
.end method

.method public d(Lo/eab;)V
    .locals 4

    .line 973
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setmHeartRateDeviceAdapter,enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 974
    move-object v0, p1

    check-cast v0, Lo/cbk;

    iput-object v0, p0, Lo/ced;->a:Lo/cbk;

    .line 975
    return-void
.end method

.method public e(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 131
    const/4 v4, 0x0

    .line 132
    const-string v0, "Track_ChineseVoiceConstructor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructContent() type : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "   parameter : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 136
    :pswitch_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 137
    sget-object v0, Lo/ced$e;->d:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    goto/16 :goto_1

    .line 140
    :pswitch_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 141
    sget-object v0, Lo/ced$e;->c:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    goto/16 :goto_1

    .line 144
    :pswitch_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 145
    sget-object v0, Lo/ced$e;->a:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    goto/16 :goto_1

    .line 148
    :pswitch_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 149
    sget-object v0, Lo/ced$e;->x:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    goto/16 :goto_1

    .line 152
    :pswitch_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 153
    sget-object v0, Lo/ced$e;->A:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    goto/16 :goto_1

    .line 156
    :pswitch_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 157
    sget-object v0, Lo/ced$e;->b:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    goto :goto_1

    .line 160
    :pswitch_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 161
    sget-object v0, Lo/ced$e;->D:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    goto :goto_1

    .line 164
    :pswitch_7
    const/16 v0, 0x9

    invoke-direct {p0, p2, v0}, Lo/ced;->e(Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v4

    .line 165
    goto :goto_1

    .line 168
    :pswitch_8
    const/16 v0, 0xb

    invoke-direct {p0, p2, v0}, Lo/ced;->e(Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v4

    .line 169
    goto :goto_1

    .line 171
    :pswitch_9
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 172
    sget-object v0, Lo/ced$e;->J:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    sget-object v0, Lo/ced$e;->X:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    goto :goto_1

    .line 176
    :pswitch_a
    invoke-direct {p0, p2}, Lo/ced;->c(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 177
    goto :goto_1

    .line 179
    :goto_0
    :pswitch_b
    invoke-direct {p0, p1, p2}, Lo/ced;->c(ILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 182
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 183
    sget-object v0, Lo/ced$e;->ad:Lo/ced$e;

    invoke-virtual {v0}, Lo/ced$e;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    :cond_0
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_b
        :pswitch_b
        :pswitch_7
        :pswitch_b
        :pswitch_8
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method
