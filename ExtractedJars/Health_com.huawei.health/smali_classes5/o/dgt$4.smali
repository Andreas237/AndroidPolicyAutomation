.class Lo/dgt$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dgt;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/dgt$4;->b:Lo/dgt;

    iput-object p2, p0, Lo/dgt$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 11

    .line 85
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 86
    iget-object v0, p0, Lo/dgt$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 87
    return-void

    .line 89
    :cond_0
    move-object v3, p1

    check-cast v3, Landroid/util/SparseArray;

    .line 90
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/dgt$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 92
    return-void

    .line 97
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 98
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 99
    new-instance v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>()V

    .line 100
    const v0, 0x9c42

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 101
    move-object v4, v7

    check-cast v4, Ljava/util/List;

    .line 102
    const/16 v0, 0xdd

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSportType(I)V

    .line 103
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 104
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setSteps(I)V

    .line 106
    :cond_2
    const v0, 0x9c43

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 107
    move-object v4, v8

    check-cast v4, Ljava/util/List;

    .line 108
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 110
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 112
    :cond_3
    const v0, 0x9c44

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 113
    move-object v4, v9

    check-cast v4, Ljava/util/List;

    .line 114
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 116
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 118
    :cond_4
    const v0, 0x9c45

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 119
    move-object v4, v10

    check-cast v4, Ljava/util/List;

    .line 120
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 122
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 125
    :cond_5
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v0, p0, Lo/dgt$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 127
    iget-object v0, p0, Lo/dgt$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 129
    :cond_6
    return-void
.end method
