.class final Lo/dnj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnj;->o(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 813
    iput-object p1, p0, Lo/dnj$5;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 35

    .line 816
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 817
    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_1b

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1b

    .line 818
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 819
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel, data.size() = "

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

    .line 833
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 834
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 835
    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    .line 836
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 837
    const/16 v0, 0x2716

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 838
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_0

    .line 839
    move-object/from16 v6, v22

    check-cast v6, Ljava/util/List;

    .line 840
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,Weight.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " Weight = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v22, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    move-object/from16 v0, v18

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 844
    :cond_0
    const/16 v0, 0x7d8

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v23

    .line 845
    const/4 v0, 0x0

    move-object/from16 v1, v23

    if-eq v0, v1, :cond_1

    .line 846
    move-object/from16 v7, v23

    check-cast v7, Ljava/util/List;

    .line 847
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar1.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar1 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v23, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    move-object/from16 v0, v19

    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 850
    :cond_1
    const/16 v0, 0x7d9

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v24

    .line 851
    const/4 v0, 0x0

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_2

    .line 852
    move-object/from16 v8, v24

    check-cast v8, Ljava/util/List;

    .line 853
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar2.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar2 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v24, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    move-object/from16 v0, v19

    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 856
    :cond_2
    const/16 v0, 0x7da

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v25

    .line 857
    const/4 v0, 0x0

    move-object/from16 v1, v25

    if-eq v0, v1, :cond_3

    .line 858
    move-object/from16 v9, v25

    check-cast v9, Ljava/util/List;

    .line 859
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar3.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar3 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v25, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    move-object/from16 v0, v19

    invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 862
    :cond_3
    const/16 v0, 0x7db

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v26

    .line 863
    const/4 v0, 0x0

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_4

    .line 864
    move-object/from16 v10, v26

    check-cast v10, Ljava/util/List;

    .line 865
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar4.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar4 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v26, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    move-object/from16 v0, v19

    invoke-interface {v0, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 868
    :cond_4
    const/16 v0, 0x7dc

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v27

    .line 869
    const/4 v0, 0x0

    move-object/from16 v1, v27

    if-eq v0, v1, :cond_5

    .line 870
    move-object/from16 v11, v27

    check-cast v11, Ljava/util/List;

    .line 871
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar5.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar5 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v27, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    move-object/from16 v0, v19

    invoke-interface {v0, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 874
    :cond_5
    const/16 v0, 0x7dd

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v28

    .line 875
    const/4 v0, 0x0

    move-object/from16 v1, v28

    if-eq v0, v1, :cond_6

    .line 876
    move-object/from16 v12, v28

    check-cast v12, Ljava/util/List;

    .line 877
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar6.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar6 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v28, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    move-object/from16 v0, v19

    invoke-interface {v0, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 880
    :cond_6
    const/16 v0, 0x7de

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v29

    .line 881
    const/4 v0, 0x0

    move-object/from16 v1, v29

    if-eq v0, v1, :cond_7

    .line 882
    move-object/from16 v13, v29

    check-cast v13, Ljava/util/List;

    .line 883
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar7.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodsugar7 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v29, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 884
    move-object/from16 v0, v19

    invoke-interface {v0, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 886
    :cond_7
    const/16 v0, 0x7df

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v30

    .line 887
    const/4 v0, 0x0

    move-object/from16 v1, v30

    if-eq v0, v1, :cond_8

    .line 888
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar8 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v30, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    move-object/from16 v14, v30

    check-cast v14, Ljava/util/List;

    .line 890
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodsugar8.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 891
    move-object/from16 v0, v19

    invoke-interface {v0, v14}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 893
    :cond_8
    const/16 v0, 0x7d6

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v31

    .line 894
    const/4 v0, 0x0

    move-object/from16 v1, v31

    if-eq v0, v1, :cond_9

    .line 895
    move-object/from16 v15, v31

    check-cast v15, Ljava/util/List;

    .line 896
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodpressure_1.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodpressure_1 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v31, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    move-object/from16 v0, v20

    invoke-interface {v0, v15}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 900
    :cond_9
    const/16 v0, 0x7d7

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v32

    .line 901
    const/4 v0, 0x0

    move-object/from16 v1, v32

    if-eq v0, v1, :cond_a

    .line 902
    move-object/from16 v16, v32

    check-cast v16, Ljava/util/List;

    .line 903
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateDeviceTypeUpLabel,bloodpressure_0.size() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " bloodpressure_0 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v32, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 906
    :cond_a
    const v0, 0xb3bf

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v33

    .line 907
    const/4 v0, 0x0

    move-object/from16 v1, v33

    if-eq v0, v1, :cond_b

    .line 908
    move-object/from16 v17, v33

    check-cast v17, Ljava/util/List;

    .line 909
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter generateDeviceTypeUpLabel,heart_rate.sie() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " heart_rate = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v33, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 912
    :cond_b
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 913
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Weight is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 915
    :cond_c
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Weight have data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 916
    const/16 v34, 0x0

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v34

    if-ge v1, v0, :cond_f

    .line 918
    move-object/from16 v0, v18

    move/from16 v1, v34

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "trackdata_deviceType"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_e

    .line 919
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_d

    .line 920
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    :cond_d
    const-string v0, "weight"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    goto :goto_1

    .line 916
    :cond_e
    add-int/lit8 v34, v34, 0x1

    goto :goto_0

    .line 928
    :cond_f
    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 929
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Blood_Sugar is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 931
    :cond_10
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Blood_Sugar have data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    const/16 v34, 0x0

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v34

    if-ge v1, v0, :cond_13

    .line 934
    move-object/from16 v0, v19

    move/from16 v1, v34

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "trackdata_deviceType"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_12

    .line 935
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 936
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 938
    :cond_11
    const-string v0, "blood_sugar"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    goto :goto_3

    .line 932
    :cond_12
    add-int/lit8 v34, v34, 0x1

    goto :goto_2

    .line 944
    :cond_13
    :goto_3
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 945
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Blood_Pressure is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 947
    :cond_14
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Blood_Pressure have data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 948
    const/16 v34, 0x0

    :goto_4
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v34

    if-ge v1, v0, :cond_17

    .line 950
    move-object/from16 v0, v20

    move/from16 v1, v34

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "trackdata_deviceType"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_16

    .line 951
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 952
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 954
    :cond_15
    const-string v0, "blood_pressure"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 955
    goto :goto_5

    .line 948
    :cond_16
    add-int/lit8 v34, v34, 0x1

    goto :goto_4

    .line 960
    :cond_17
    :goto_5
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 961
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Heart_Rate is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    .line 963
    :cond_18
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Heart_Rate have data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 964
    const/16 v34, 0x0

    :goto_6
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v34

    if-ge v1, v0, :cond_1b

    .line 966
    move-object/from16 v0, v21

    move/from16 v1, v34

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "trackdata_deviceType"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_1a

    .line 967
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 968
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 970
    :cond_19
    const-string v0, "heart_rate"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    goto :goto_7

    .line 964
    :cond_1a
    add-int/lit8 v34, v34, 0x1

    goto :goto_6

    .line 976
    :cond_1b
    :goto_7
    const-string v0, "BIUserLabelMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthDataList_Heart_Rate ,deviceTypeUp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dnj$5;->d:Landroid/content/Context;

    const-string v1, "health_device_type_up"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dnj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 978
    return-void
.end method
