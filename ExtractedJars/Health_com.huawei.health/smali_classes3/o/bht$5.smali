.class Lo/bht$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bht;->b(JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:J

.field final synthetic c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:J

.field final synthetic i:Lo/bht;


# direct methods
.method constructor <init>(Lo/bht;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;JJ)V
    .locals 0

    .line 707
    iput-object p1, p0, Lo/bht$5;->i:Lo/bht;

    iput-object p2, p0, Lo/bht$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p3, p0, Lo/bht$5;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    iput-wide p5, p0, Lo/bht$5;->e:J

    iput-wide p7, p0, Lo/bht$5;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 19

    .line 710
    if-nez p1, :cond_0

    .line 711
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get step distances calories HiAggregateListener onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bht$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 713
    return-void

    .line 715
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas is : \n "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " \nerrorCode is : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " anchor is : "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    const/4 v7, 0x0

    .line 717
    const/4 v8, 0x0

    .line 718
    const/4 v9, 0x0

    .line 719
    const/4 v10, 0x0

    .line 720
    const/4 v11, 0x0

    .line 722
    move-object/from16 v12, p1

    check-cast v12, Landroid/util/SparseArray;

    .line 723
    invoke-virtual {v12}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 724
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get step distances calories HiAggregateListener onResult sparseArray size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bht$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 726
    return-void

    .line 729
    :cond_1
    const v0, 0xa476

    invoke-virtual {v12, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    .line 730
    const v0, 0x9c42

    invoke-virtual {v12, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    .line 731
    const v0, 0xa4a8

    invoke-virtual {v12, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/util/List;

    .line 732
    const v0, 0xa4da

    invoke-virtual {v12, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/List;

    .line 735
    if-eqz v15, :cond_2

    .line 736
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 737
    int-to-double v0, v9

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int v9, v0

    .line 738
    goto :goto_0

    .line 742
    :cond_2
    if-eqz v16, :cond_3

    .line 743
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 744
    int-to-double v0, v10

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int v10, v0

    .line 745
    goto :goto_1

    .line 749
    :cond_3
    if-eqz v13, :cond_4

    .line 750
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 751
    int-to-double v0, v8

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int v8, v0

    .line 752
    goto :goto_2

    .line 779
    :cond_4
    if-eqz v14, :cond_5

    .line 780
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 781
    int-to-double v0, v7

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int v7, v0

    .line 782
    goto :goto_3

    .line 785
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bht$5;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 786
    const-string v0, "riding"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bht$5;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 787
    move v11, v9

    goto :goto_4

    .line 788
    :cond_6
    const-string v0, "swimming"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bht$5;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 789
    move v11, v10

    goto :goto_4

    .line 791
    :cond_7
    move v11, v8

    goto :goto_4

    .line 794
    :cond_8
    move v11, v8

    .line 797
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-virtual {v0, v7}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->setStepSum(I)V

    .line 798
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-virtual {v0, v11}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->setTrackDistanceSum(I)V

    .line 801
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/bht$5;->e:J

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/bht$5;->b:J

    new-instance v5, Lo/bht$5$5;

    move-object/from16 v6, p0

    invoke-direct {v5, v6}, Lo/bht$5$5;-><init>(Lo/bht$5;)V

    invoke-virtual/range {v0 .. v5}, Lo/brt;->d(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 816
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportsDataBean = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    return-void
.end method
