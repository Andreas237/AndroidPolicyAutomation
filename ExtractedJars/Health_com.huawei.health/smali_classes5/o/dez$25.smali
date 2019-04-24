.class Lo/dez$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dez;


# direct methods
.method constructor <init>(Lo/dez;)V
    .locals 0

    .line 639
    iput-object p1, p0, Lo/dez$25;->c:Lo/dez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 642
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_2

    .line 644
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 645
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse recv bt data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 648
    :pswitch_0
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 649
    goto/16 :goto_0

    .line 651
    :pswitch_1
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x2712

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 652
    goto/16 :goto_0

    .line 654
    :pswitch_2
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->e(Lo/dez;[B)V

    .line 655
    goto/16 :goto_0

    .line 657
    :pswitch_3
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->a(Lo/dez;[B)V

    .line 658
    goto/16 :goto_0

    .line 660
    :pswitch_4
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->b(Lo/dez;[B)V

    .line 661
    goto/16 :goto_0

    .line 663
    :pswitch_5
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->d(Lo/dez;[B)V

    .line 664
    goto/16 :goto_0

    .line 666
    :pswitch_6
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/4 v1, 0x7

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 667
    goto/16 :goto_0

    .line 669
    :pswitch_7
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x2712

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 670
    goto/16 :goto_0

    .line 672
    :pswitch_8
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->c(Lo/dez;[B)V

    .line 673
    goto/16 :goto_0

    .line 675
    :pswitch_9
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->k(Lo/dez;[B)V

    .line 676
    goto/16 :goto_0

    .line 678
    :pswitch_a
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->h(Lo/dez;[B)V

    .line 679
    goto/16 :goto_0

    .line 681
    :pswitch_b
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->f(Lo/dez;[B)V

    .line 682
    goto/16 :goto_0

    .line 684
    :pswitch_c
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0xe

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 685
    goto/16 :goto_0

    .line 687
    :pswitch_d
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->i(Lo/dez;[B)V

    .line 688
    goto/16 :goto_0

    .line 690
    :pswitch_e
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x10

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 691
    goto/16 :goto_0

    .line 693
    :pswitch_f
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0}, Lo/dez;->e(Lo/dez;)V

    .line 694
    goto/16 :goto_0

    .line 696
    :pswitch_10
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x13

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 697
    goto/16 :goto_0

    .line 699
    :pswitch_11
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x16

    invoke-static {v0, v4, v1}, Lo/dez;->d(Lo/dez;[BI)V

    .line 700
    goto/16 :goto_0

    .line 702
    :pswitch_12
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->g(Lo/dez;[B)V

    .line 703
    goto/16 :goto_0

    .line 705
    :pswitch_13
    array-length v0, v4

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 706
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_0

    .line 707
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.26 return errCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 708
    :cond_0
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 709
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get command is 5.7.26"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    const/4 v5, 0x0

    .line 711
    invoke-static {v5}, Lo/dfj;->i(I)V

    .line 713
    invoke-static {v5}, Lo/dfj;->k(I)V

    .line 714
    goto/16 :goto_0

    .line 718
    :pswitch_14
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.28 response : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    goto :goto_0

    .line 721
    :pswitch_15
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.29 response : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    goto :goto_0

    .line 724
    :pswitch_16
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.7.30 response : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->p(Lo/dez;[B)V

    .line 726
    goto :goto_0

    .line 729
    :pswitch_17
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->l(Lo/dez;[B)V

    .line 730
    goto :goto_0

    .line 733
    :pswitch_18
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    invoke-static {v0, v4}, Lo/dez;->n(Lo/dez;[B)V

    .line 734
    goto :goto_0

    .line 736
    :pswitch_19
    iget-object v0, p0, Lo/dez$25;->c:Lo/dez;

    const/16 v1, 0x21

    invoke-static {v0, v4, v1}, Lo/dez;->e(Lo/dez;[BI)V

    .line 737
    .line 741
    :cond_1
    :goto_0
    :pswitch_1a
    goto :goto_1

    .line 742
    :cond_2
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse recv bt data ret="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    :goto_1
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
        :pswitch_1a
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_1a
        :pswitch_f
        :pswitch_10
        :pswitch_1a
        :pswitch_12
        :pswitch_11
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_13
        :pswitch_1a
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
    .end packed-switch
.end method
