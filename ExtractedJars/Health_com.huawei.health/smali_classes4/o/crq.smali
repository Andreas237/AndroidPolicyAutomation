.class public Lo/crq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crq$c;,
        Lo/crq$b;
    }
.end annotation


# instance fields
.field private d:Lo/cqg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {p1}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/crq;->d:Lo/cqg;

    .line 31
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 4

    .line 238
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 241
    :sswitch_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 243
    :sswitch_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 245
    :goto_1
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7d2 -> :sswitch_0
        0x7e2 -> :sswitch_0
        0x835 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;ZI)Z
    .locals 4

    .line 187
    const-wide/16 v2, 0x0

    .line 188
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 189
    if-eqz p3, :cond_0

    .line 190
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, p1, v1, p4}, Lo/cqg;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v2

    goto :goto_0

    .line 192
    :cond_0
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, p1, v1, p4}, Lo/cqg;->d(Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v2, v0

    goto :goto_0

    .line 195
    :cond_1
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, p1, v1, p4}, Lo/cqg;->d(Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v2, v0

    .line 197
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 201
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    .line 202
    const/16 v0, 0x835

    if-ne v0, v1, :cond_0

    .line 203
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 204
    return-void

    .line 207
    :cond_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 210
    :sswitch_0
    new-instance v2, Lo/crq$c;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/crq$c;-><init>(Lo/crq$4;)V

    .line 211
    goto :goto_1

    .line 213
    :goto_0
    new-instance v2, Lo/crq$b;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/crq$b;-><init>(Lo/crq$4;)V

    .line 217
    :goto_1
    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 219
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7d2 -> :sswitch_0
        0x7e2 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(I)Z
    .locals 3

    .line 102
    const/16 v1, 0x17

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    .line 110
    const/4 v2, 0x0

    :goto_0
    array-length v0, v1

    const/16 v0, 0x17

    if-ge v2, v0, :cond_1

    .line 111
    aget v0, v1, v2

    if-ne p1, v0, :cond_0

    .line 112
    const/4 v0, 0x1

    return v0

    .line 110
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 115
    :cond_1
    const/4 v0, 0x0

    return v0

    :array_0
    .array-data 4
        0x7d4
        0x7d1
        0x7ef
        0x7f0
        0x7e6
        0x7e7
        0x7e8
        0x7e9
        0x7f1
        0x7ea
        0x7eb
        0x7ec
        0x7ed
        0x7ee
        0x803
        0x804
        0x805
        0x806
        0x807
        0x808
        0x809
        0x80a
        0x80b
    .end array-data
.end method


# virtual methods
.method public a(Ljava/util/List;JJLjava/util/List;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JJLjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 120
    const/4 v7, 0x1

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crq;->d:Lo/cqg;

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v5, p1

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->a(JJILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 124
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v1, v2}, Lo/cqg;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v11

    .line 127
    goto :goto_0

    .line 128
    :cond_1
    return v7

    .line 131
    :cond_2
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 133
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 134
    const/4 v12, 0x1

    .line 135
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 136
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v13

    .line 137
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_3
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 138
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 139
    goto :goto_2

    .line 143
    :cond_4
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    if-eq v0, v13, :cond_5

    .line 144
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    goto :goto_2

    .line 148
    :cond_5
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 149
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v15, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 150
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 151
    const/4 v12, 0x0

    .line 152
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 156
    :cond_6
    if-eqz v12, :cond_7

    .line 157
    invoke-virtual {v11, v13}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 158
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 159
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_7
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lo/crq;->e(Ljava/util/List;)V

    .line 165
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 166
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v14, v11, v12, v1}, Lo/crq;->d(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;ZI)Z

    move-result v0

    if-nez v0, :cond_8

    .line 167
    const/4 v7, 0x0

    .line 169
    :cond_8
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v14, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 171
    const/16 v16, 0x1

    :goto_3
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_a

    .line 172
    move/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/hihealth/HiHealthData;

    .line 173
    const-string v0, "merged"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_9

    .line 174
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-direct {v0, v1, v11, v12, v2}, Lo/crq;->d(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;ZI)Z

    move-result v15

    .line 175
    const-string v0, "merged"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 176
    const-string v0, "Debug_HiHealthDataPointMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pointDataMerge() insertOrUpdatePointData unmerge change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    if-nez v15, :cond_9

    .line 178
    const/4 v7, 0x0

    .line 171
    :cond_9
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 182
    :cond_a
    goto/16 :goto_1

    .line 183
    :cond_b
    return v7
.end method

.method public d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object/from16 v6, p3

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->b(JJILjava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 43
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    :cond_0
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/cqg;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v8

    .line 46
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 52
    :cond_2
    const/4 v8, 0x1

    .line 53
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 55
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 56
    goto :goto_1

    .line 58
    :cond_3
    invoke-direct {p0, p1, v10}, Lo/crq;->c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 60
    const-string v0, "Debug_HiHealthDataPointMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "merge time is same and value is same, type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x1

    return v0

    .line 63
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/crq;->e(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 64
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 66
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 67
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 68
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 69
    const/4 v8, 0x0

    .line 70
    .line 73
    :cond_6
    if-eqz v8, :cond_7

    .line 74
    move/from16 v0, p2

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 75
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 76
    invoke-interface {v7, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_7
    invoke-direct {p0, v7}, Lo/crq;->e(Ljava/util/List;)V

    .line 81
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 82
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Lo/cqg;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v10

    .line 86
    const/4 v12, 0x1

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_9

    .line 87
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 88
    const-string v0, "merged"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_8

    .line 89
    iget-object v0, p0, Lo/crq;->d:Lo/cqg;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v13, v1, v2}, Lo/cqg;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v11

    .line 90
    const-string v0, "Debug_HiHealthDataPointMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pointDataMerge() insertOrUpdatePointData unmerge change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    if-nez v11, :cond_8

    .line 92
    const/4 v10, 0x0

    .line 86
    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 97
    :cond_9
    return v10
.end method
