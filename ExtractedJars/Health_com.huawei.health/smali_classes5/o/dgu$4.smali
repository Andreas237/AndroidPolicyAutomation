.class Lo/dgu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->c(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dgu;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 947
    iput-object p1, p0, Lo/dgu$4;->c:Lo/dgu;

    iput-object p2, p0, Lo/dgu$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 22

    .line 950
    move-object/from16 v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 951
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 952
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 953
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "map none"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 954
    return-void

    .line 965
    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 967
    const/16 v0, 0x7d8

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 968
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 969
    move-object v5, v14

    check-cast v5, Ljava/util/List;

    .line 970
    invoke-interface {v13, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 972
    :cond_2
    const/16 v0, 0x7d9

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 973
    const/4 v0, 0x0

    if-eq v0, v15, :cond_3

    .line 974
    move-object v6, v15

    check-cast v6, Ljava/util/List;

    .line 975
    invoke-interface {v13, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 977
    :cond_3
    const/16 v0, 0x7da

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 978
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_4

    .line 979
    move-object/from16 v7, v16

    check-cast v7, Ljava/util/List;

    .line 980
    invoke-interface {v13, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 983
    :cond_4
    const/16 v0, 0x7db

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 984
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    .line 985
    move-object/from16 v8, v17

    check-cast v8, Ljava/util/List;

    .line 986
    invoke-interface {v13, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 989
    :cond_5
    const/16 v0, 0x7dc

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 990
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_6

    .line 991
    move-object/from16 v9, v18

    check-cast v9, Ljava/util/List;

    .line 992
    invoke-interface {v13, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 995
    :cond_6
    const/16 v0, 0x7dd

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 996
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_7

    .line 997
    move-object/from16 v10, v19

    check-cast v10, Ljava/util/List;

    .line 998
    invoke-interface {v13, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1001
    :cond_7
    const/16 v0, 0x7de

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 1002
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_8

    .line 1003
    move-object/from16 v11, v20

    check-cast v11, Ljava/util/List;

    .line 1004
    invoke-interface {v13, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1007
    :cond_8
    const/16 v0, 0x7df

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 1008
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_9

    .line 1009
    move-object/from16 v12, v21

    check-cast v12, Ljava/util/List;

    .line 1010
    invoke-interface {v13, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1012
    :cond_9
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodSugarData hasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    const/4 v0, 0x0

    if-eq v0, v13, :cond_a

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1015
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 1017
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

    .line 1018
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v13}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1020
    :goto_0
    return-void
.end method
