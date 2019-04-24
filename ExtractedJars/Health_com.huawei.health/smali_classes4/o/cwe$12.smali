.class Lo/cwe$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwe;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1664
    iput-object p1, p0, Lo/cwe$12;->d:Lo/cwe;

    iput-object p2, p0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 26

    .line 1667
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1668
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1669
    return-void

    .line 1672
    :cond_0
    move-object/from16 v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 1673
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1674
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackSumData The return run data is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1675
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1676
    return-void

    .line 1679
    :cond_1
    const/16 v0, 0x7532

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 1680
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 1682
    if-eqz v6, :cond_2

    .line 1683
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackSumData list size "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1685
    :cond_2
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackSumData The return run list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1686
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1687
    return-void

    .line 1690
    :goto_0
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 1691
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 1692
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 1693
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v12

    .line 1694
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v14

    .line 1696
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v15

    .line 1697
    const/16 v16, 0x0

    .line 1699
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v15, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1703
    goto :goto_2

    .line 1700
    :catch_0
    move-exception v17

    .line 1701
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackMetaData is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1702
    goto :goto_1

    .line 1704
    :goto_2
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v17

    .line 1705
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v18

    .line 1706
    if-eqz v18, :cond_3

    move/from16 v0, v18

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 1708
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportDataSource is not real"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1709
    goto :goto_1

    .line 1711
    :cond_3
    move/from16 v0, v17

    const/16 v1, 0x101

    if-ne v0, v1, :cond_4

    .line 1712
    const/16 v17, 0x5

    goto :goto_3

    .line 1713
    :cond_4
    move/from16 v0, v17

    const/16 v1, 0x102

    if-ne v0, v1, :cond_5

    .line 1714
    const/16 v17, 0x4

    goto :goto_3

    .line 1715
    :cond_5
    move/from16 v0, v17

    const/16 v1, 0x103

    if-ne v0, v1, :cond_6

    .line 1716
    const/16 v17, 0x3

    .line 1718
    :cond_6
    :goto_3
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v19

    .line 1719
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v20

    .line 1720
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v21

    .line 1721
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getPartTimeMap()Ljava/util/Map;

    move-result-object v23

    .line 1723
    new-instance v24, Lorg/json/JSONObject;

    invoke-direct/range {v24 .. v24}, Lorg/json/JSONObject;-><init>()V

    .line 1725
    const-string v0, "startTime"

    move-object/from16 v1, v24

    :try_start_1
    invoke-virtual {v1, v0, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1726
    const-string v0, "endTime"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1727
    const-string v0, "sportType"

    move-object/from16 v1, v24

    move/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1728
    const-string v0, "totalCalories"

    move-object/from16 v1, v24

    move/from16 v2, v20

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1729
    const-string v0, "totalDistance"

    move-object/from16 v1, v24

    move/from16 v2, v19

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1730
    const-string v0, "totalTime"

    move-object/from16 v1, v24

    move-wide/from16 v2, v21

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1731
    const-string v0, "timeZone"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1732
    const-string v0, "partTimeMap"

    move-object/from16 v1, v24

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1737
    goto :goto_4

    .line 1733
    :catch_1
    move-exception v25

    .line 1734
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackData jsonObject JSONException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1735
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1736
    return-void

    .line 1738
    :goto_4
    move-object/from16 v0, v24

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1740
    goto/16 :goto_1

    .line 1741
    :cond_7
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1743
    const-string v0, "data"

    :try_start_2
    invoke-virtual {v8, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1748
    goto :goto_5

    .line 1744
    :catch_2
    move-exception v9

    .line 1745
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackData dataObject JSONException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1746
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1747
    return-void

    .line 1749
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwe$12;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1750
    return-void
.end method
