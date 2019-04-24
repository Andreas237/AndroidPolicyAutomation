.class Lo/dgw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgw;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dgw;


# direct methods
.method constructor <init>(Lo/dgw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/dgw$2;->d:Lo/dgw;

    iput-object p2, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 12

    .line 80
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 82
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 85
    :cond_0
    return-void

    .line 87
    :cond_1
    move-object v3, p1

    check-cast v3, Landroid/util/SparseArray;

    .line 88
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 89
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 90
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 92
    :cond_2
    return-void

    .line 98
    :cond_3
    const/16 v0, 0x7d2

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 99
    move-object v4, v6

    check-cast v4, Ljava/util/List;

    .line 101
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 104
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 105
    new-instance v10, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    invoke-direct {v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;-><init>()V

    .line 106
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setTimeStamp(J)V

    .line 107
    const/16 v0, 0x258

    invoke-virtual {v10, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateType(I)V

    .line 108
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateValue(I)V

    .line 109
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    goto :goto_0

    .line 114
    :cond_4
    const/16 v0, 0x7e2

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 115
    move-object v5, v8

    check-cast v5, Ljava/util/List;

    .line 116
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 117
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 118
    new-instance v11, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    invoke-direct {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;-><init>()V

    .line 119
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setTimeStamp(J)V

    .line 120
    const/16 v0, 0x259

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateType(I)V

    .line 121
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->setHeartRateValue(I)V

    .line 122
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    goto :goto_1

    .line 126
    :cond_5
    new-instance v0, Lo/dgw$2$1;

    invoke-direct {v0, p0}, Lo/dgw$2$1;-><init>(Lo/dgw$2;)V

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 132
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 134
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 135
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 138
    :cond_6
    iget-object v0, p0, Lo/dgw$2;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 141
    :cond_7
    :goto_2
    return-void
.end method
