.class final Lo/dnj$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnj;->n(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 660
    iput-object p1, p0, Lo/dnj$8;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 34

    .line 663
    const-string v4, "FitnessFacility_0"

    .line 664
    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_f

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_f

    .line 665
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 667
    const/4 v6, 0x0

    .line 668
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter generateFitnessFacilityLabel,datas.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " data = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 681
    const/16 v0, 0x2716

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 682
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_0

    .line 683
    move-object/from16 v7, v19

    check-cast v7, Ljava/util/List;

    .line 684
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,Weight.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " Weight= "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    move-object/from16 v0, v18

    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 688
    :cond_0
    const/16 v0, 0x7d8

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 689
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_1

    .line 690
    move-object/from16 v8, v20

    check-cast v8, Ljava/util/List;

    .line 691
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarBefore.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarBefore = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    move-object/from16 v0, v18

    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 694
    :cond_1
    const/16 v0, 0x7d9

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 695
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_2

    .line 696
    move-object/from16 v9, v21

    check-cast v9, Ljava/util/List;

    .line 697
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarAfter.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarAfter = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v21, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 700
    :cond_2
    const/16 v0, 0x7da

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 701
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_3

    .line 702
    move-object/from16 v10, v22

    check-cast v10, Ljava/util/List;

    .line 703
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodsugarLCBefore.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarLCBefor = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v22, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    move-object/from16 v0, v18

    invoke-interface {v0, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 707
    :cond_3
    const/16 v0, 0x7db

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v23

    .line 708
    const/4 v0, 0x0

    move-object/from16 v1, v23

    if-eq v0, v1, :cond_4

    .line 709
    move-object/from16 v11, v23

    check-cast v11, Ljava/util/List;

    .line 710
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarLCAfter.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarLCAfter = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v23, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    move-object/from16 v0, v18

    invoke-interface {v0, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 714
    :cond_4
    const/16 v0, 0x7dc

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v24

    .line 715
    const/4 v0, 0x0

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_5

    .line 716
    move-object/from16 v12, v24

    check-cast v12, Ljava/util/List;

    .line 717
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarDNBefore.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarDNBefore = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v24, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    move-object/from16 v0, v18

    invoke-interface {v0, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 721
    :cond_5
    const/16 v0, 0x7dd

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v25

    .line 722
    const/4 v0, 0x0

    move-object/from16 v1, v25

    if-eq v0, v1, :cond_6

    .line 723
    move-object/from16 v13, v25

    check-cast v13, Ljava/util/List;

    .line 724
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarDNAfter.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarDNAfter = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v25, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    move-object/from16 v0, v18

    invoke-interface {v0, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 728
    :cond_6
    const/16 v0, 0x7de

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v26

    .line 729
    const/4 v0, 0x0

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_7

    .line 730
    move-object/from16 v14, v26

    check-cast v14, Ljava/util/List;

    .line 731
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarSLBefore.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarSLBefore = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v26, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    move-object/from16 v0, v18

    invoke-interface {v0, v14}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 735
    :cond_7
    const/16 v0, 0x7df

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v27

    .line 736
    const/4 v0, 0x0

    move-object/from16 v1, v27

    if-eq v0, v1, :cond_8

    .line 737
    move-object/from16 v15, v27

    check-cast v15, Ljava/util/List;

    .line 738
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodSugarBeforeDawn.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodSugarBeforeDawn = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v27, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    move-object/from16 v0, v18

    invoke-interface {v0, v15}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 742
    :cond_8
    const/16 v0, 0x7d6

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v28

    .line 743
    const/4 v0, 0x0

    move-object/from16 v1, v28

    if-eq v0, v1, :cond_9

    .line 744
    move-object/from16 v16, v28

    check-cast v16, Ljava/util/List;

    .line 745
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodPressureSYS.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodPressureSYS = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v28, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 749
    :cond_9
    const/16 v0, 0x7d7

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v29

    .line 750
    const/4 v0, 0x0

    move-object/from16 v1, v29

    if-eq v0, v1, :cond_a

    .line 751
    move-object/from16 v17, v29

    check-cast v17, Ljava/util/List;

    .line 752
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel,bloodPressureDIA.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodPressureDIA = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v29, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 756
    :cond_a
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 757
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 759
    :cond_b
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " healthDataList = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v18, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    const/16 v30, 0x0

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v30

    if-ge v1, v0, :cond_d

    .line 761
    move-object/from16 v0, v18

    move/from16 v1, v30

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, Lcom/huawei/hihealth/HiHealthData;

    .line 763
    const-string v0, "trackdata_deviceType"

    move-object/from16 v1, v31

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_c

    .line 764
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList() Trace Device Type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "trackdata_deviceType"

    move-object/from16 v3, v31

    invoke-virtual {v3, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    add-int/lit8 v6, v6, 0x1

    .line 760
    :cond_c
    add-int/lit8 v30, v30, 0x1

    goto :goto_0

    .line 768
    :cond_d
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel, counts = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    invoke-static {}, Lo/dnj;->g()[Lo/dnp;

    move-result-object v30

    move-object/from16 v0, v30

    array-length v0, v0

    move/from16 v31, v0

    const/16 v32, 0x0

    :goto_1
    move/from16 v0, v32

    move/from16 v1, v31

    if-ge v0, v1, :cond_f

    aget-object v33, v30, v32

    .line 770
    int-to-double v0, v6

    move-object/from16 v2, v33

    invoke-virtual {v2, v0, v1}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 771
    int-to-double v0, v6

    move-object/from16 v2, v33

    invoke-virtual {v2, v0, v1}, Lo/dnp;->a(D)Ljava/lang/String;

    move-result-object v4

    .line 772
    goto :goto_2

    .line 769
    :cond_e
    add-int/lit8 v32, v32, 0x1

    goto :goto_1

    .line 777
    :cond_f
    :goto_2
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateFitnessFacilityLabel, fitnessFacilityLabel = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dnj$8;->a:Landroid/content/Context;

    const-string v1, "health_fitness_facility_up"

    invoke-static {v0, v1, v4}, Lo/dnj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    return-void
.end method
