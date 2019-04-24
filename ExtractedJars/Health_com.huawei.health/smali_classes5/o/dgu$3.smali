.class Lo/dgu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->b(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 839
    iput-object p1, p0, Lo/dgu$3;->e:Lo/dgu;

    iput-object p2, p0, Lo/dgu$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 22

    .line 842
    move-object/from16 v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 843
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 844
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 845
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    return-void

    .line 857
    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 859
    const/16 v0, 0x7d8

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 860
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 861
    move-object v5, v14

    check-cast v5, Ljava/util/List;

    .line 862
    invoke-interface {v13, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 864
    :cond_2
    const/16 v0, 0x7d9

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 865
    const/4 v0, 0x0

    if-eq v0, v15, :cond_3

    .line 866
    move-object v6, v15

    check-cast v6, Ljava/util/List;

    .line 867
    invoke-interface {v13, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 869
    :cond_3
    const/16 v0, 0x7da

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 870
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_4

    .line 871
    move-object/from16 v7, v16

    check-cast v7, Ljava/util/List;

    .line 872
    invoke-interface {v13, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 875
    :cond_4
    const/16 v0, 0x7db

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 876
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    .line 877
    move-object/from16 v8, v17

    check-cast v8, Ljava/util/List;

    .line 878
    invoke-interface {v13, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 881
    :cond_5
    const/16 v0, 0x7dc

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 882
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_6

    .line 883
    move-object/from16 v9, v18

    check-cast v9, Ljava/util/List;

    .line 884
    invoke-interface {v13, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 887
    :cond_6
    const/16 v0, 0x7dd

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 888
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_7

    .line 889
    move-object/from16 v10, v19

    check-cast v10, Ljava/util/List;

    .line 890
    invoke-interface {v13, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 893
    :cond_7
    const/16 v0, 0x7de

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 894
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_8

    .line 895
    move-object/from16 v11, v20

    check-cast v11, Ljava/util/List;

    .line 896
    invoke-interface {v13, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 899
    :cond_8
    const/16 v0, 0x7df

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 900
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_9

    .line 901
    move-object/from16 v12, v21

    check-cast v12, Ljava/util/List;

    .line 902
    invoke-interface {v13, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 904
    :cond_9
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodSugarData hasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    const/4 v0, 0x0

    if-eq v0, v13, :cond_a

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 907
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 909
    :cond_b
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v13}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 912
    :goto_0
    return-void
.end method
