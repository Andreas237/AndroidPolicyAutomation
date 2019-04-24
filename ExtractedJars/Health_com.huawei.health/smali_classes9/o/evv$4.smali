.class Lo/evv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evv;->e(Landroid/content/Context;JJLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/evv;

.field final synthetic e:Lo/ekr;


# direct methods
.method constructor <init>(Lo/evv;Lo/ekr;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/evv$4;->c:Lo/evv;

    iput-object p2, p0, Lo/evv$4;->e:Lo/ekr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 25

    .line 84
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 85
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 86
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 88
    :cond_0
    return-void

    .line 90
    :cond_1
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 91
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 92
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 95
    :cond_2
    return-void

    .line 99
    :cond_3
    const/16 v0, 0x7f2

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 100
    move-object v6, v7

    check-cast v6, Ljava/util/List;

    .line 101
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 105
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 106
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 107
    invoke-virtual {v13}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_measure_type()I

    move-result v14

    .line 108
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "measureType1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v9

    .line 110
    const-wide/32 v0, 0xea60

    div-long v15, v9, v0

    .line 111
    const-wide/16 v0, 0x2

    rem-long v0, v15, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_4

    .line 113
    const-wide/32 v0, 0xea60

    sub-long/2addr v9, v0

    .line 115
    :cond_4
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    goto/16 :goto_0

    .line 117
    :cond_5
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "before resultMap.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pressureMeasureValueList.size()1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_c

    .line 120
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 121
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v9

    .line 122
    const-wide/32 v0, 0xea60

    div-long v13, v9, v0

    .line 123
    const-wide/16 v0, 0x2

    rem-long v0, v13, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_6

    .line 125
    const-wide/32 v0, 0xea60

    sub-long/2addr v9, v0

    .line 127
    :cond_6
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 128
    invoke-virtual {v15}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_measure_type()I

    move-result v16

    .line 129
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "measureType2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    if-eqz v16, :cond_7

    move/from16 v0, v16

    const/4 v1, 0x2

    if-ne v0, v1, :cond_b

    .line 131
    :cond_7
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pressureMeasureValueList.size()2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/16 v17, 0x0

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_b

    .line 133
    move/from16 v0, v17

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 134
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 135
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_measure_type()I

    move-result v20

    .line 136
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "measureTypeTemp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    if-eqz v20, :cond_a

    move/from16 v0, v20

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    .line 138
    goto/16 :goto_3

    .line 140
    :cond_8
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v21

    .line 141
    const-wide/32 v0, 0xea60

    div-long v23, v21, v0

    .line 142
    const-wide/16 v0, 0x2

    rem-long v0, v23, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_9

    .line 144
    const-wide/32 v0, 0xea60

    sub-long v21, v21, v0

    .line 146
    :cond_9
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pressureTimeTmp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v21

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-wide/32 v0, 0x927c0

    sub-long v0, v9, v0

    cmp-long v0, v21, v0

    if-ltz v0, :cond_a

    const-wide/32 v0, 0x927c0

    add-long/2addr v0, v9

    cmp-long v0, v21, v0

    if-gtz v0, :cond_a

    cmp-long v0, v21, v9

    if-eqz v0, :cond_a

    .line 148
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in range"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 150
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    :cond_a
    :goto_3
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_2

    .line 119
    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 156
    :cond_c
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "after resultMap.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 172
    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_4

    .line 176
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$4;->e:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 179
    :cond_e
    :goto_4
    return-void
.end method
