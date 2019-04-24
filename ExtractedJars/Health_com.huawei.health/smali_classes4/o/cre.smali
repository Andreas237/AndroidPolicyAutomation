.class public Lo/cre;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cre$b;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private b:Lo/crg;

.field private c:Lo/cri;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cri;->d(Landroid/content/Context;)Lo/cri;

    move-result-object v0

    iput-object v0, p0, Lo/cre;->c:Lo/cri;

    .line 40
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crg;->b(Landroid/content/Context;)Lo/crg;

    move-result-object v0

    iput-object v0, p0, Lo/cre;->b:Lo/crg;

    .line 41
    return-void
.end method

.method synthetic constructor <init>(Lo/cre$1;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/cre;-><init>()V

    return-void
.end method

.method private a(JJ[ILjava/util/List;I)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;I)Z"
        }
    .end annotation

    .line 199
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v7

    .line 200
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->c(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 201
    if-eqz v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSequenceDatas() sequences is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    return v0

    .line 205
    :cond_1
    const/4 v9, 0x0

    .line 206
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 207
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 208
    if-nez v12, :cond_2

    .line 209
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/cqe;->b(J)I

    move-result v9

    goto :goto_1

    .line 211
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cqe;->d(JII)I

    move-result v9

    .line 213
    :goto_1
    move/from16 v0, p7

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 214
    goto :goto_0

    .line 215
    :cond_3
    if-lez v9, :cond_4

    .line 216
    invoke-direct {p0, v8}, Lo/cre;->d(Ljava/util/List;)V

    .line 217
    const/4 v0, 0x1

    return v0

    .line 219
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private b(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 151
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v7

    .line 152
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->e(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 153
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 160
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 161
    if-nez v12, :cond_2

    .line 162
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lo/cqg;->a(JJII)I

    move-result v9

    goto :goto_1

    .line 164
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cqg;->e(JII)I

    move-result v9

    .line 166
    :goto_1
    if-gtz v9, :cond_3

    .line 167
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const/4 v0, 0x0

    return v0

    .line 170
    :cond_3
    goto :goto_0

    .line 171
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Landroid/content/Context;)Lo/cre;
    .locals 1

    .line 52
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cre;->d:Landroid/content/Context;

    .line 53
    sget-object v0, Lo/cre$b;->b:Lo/cre;

    return-object v0
.end method

.method private d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 223
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v1

    .line 224
    invoke-virtual {v1, p1}, Lo/crf;->c(Ljava/util/List;)V

    .line 226
    return-void
.end method

.method private d(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 127
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v7

    .line 128
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->c(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 129
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deletePointDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deletePointDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 136
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 137
    if-nez v12, :cond_2

    .line 138
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->d(JJII)I

    move-result v9

    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cpy;->b(JII)I

    move-result v9

    .line 142
    :goto_1
    if-gtz v9, :cond_3

    .line 143
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deletePointDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v0, 0x0

    return v0

    .line 146
    :cond_3
    goto :goto_0

    .line 147
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private d(JJ[ILjava/util/List;I)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;I)Z"
        }
    .end annotation

    .line 93
    if-nez p5, :cond_0

    .line 94
    const/4 v0, 0x0

    return v0

    .line 96
    :cond_0
    const/4 v0, 0x0

    aget v7, p5, v0

    .line 97
    invoke-static {v7}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v8

    .line 98
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() category = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    sget-object v0, Lo/cre$1;->a:[I

    invoke-virtual {v8}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 101
    :pswitch_0
    const/16 v0, 0x7d0

    if-ge v7, v0, :cond_1

    .line 102
    invoke-direct/range {p0 .. p6}, Lo/cre;->d(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 103
    :cond_1
    const/16 v0, 0x7e3

    if-lt v7, v0, :cond_2

    const/16 v0, 0x7e6

    if-gt v0, v7, :cond_3

    const/16 v0, 0x7f1

    if-lt v0, v7, :cond_3

    .line 105
    :cond_2
    invoke-direct/range {p0 .. p6}, Lo/cre;->b(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 107
    :cond_3
    invoke-direct/range {p0 .. p6}, Lo/cre;->e(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 110
    :pswitch_1
    const/16 v0, 0x5208

    if-gt v7, v0, :cond_4

    .line 111
    iget-object v0, p0, Lo/cre;->c:Lo/cri;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cri;->e(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 112
    :cond_4
    const/16 v0, 0x5653

    if-gt v7, v0, :cond_5

    .line 113
    iget-object v0, p0, Lo/cre;->c:Lo/cri;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cri;->c(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 115
    :cond_5
    iget-object v0, p0, Lo/cre;->c:Lo/cri;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cri;->b(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 118
    :pswitch_2
    invoke-direct/range {p0 .. p7}, Lo/cre;->a(JJ[ILjava/util/List;I)Z

    move-result v0

    return v0

    .line 120
    :pswitch_3
    iget-object v0, p0, Lo/cre;->b:Lo/crg;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/crg;->c(JJ[ILjava/util/List;)Z

    move-result v0

    return v0

    .line 122
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 175
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v7

    .line 176
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqh;->a(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 177
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointStressDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointStressDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const/4 v0, 0x0

    return v0

    .line 183
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 184
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 185
    if-nez v12, :cond_2

    .line 186
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lo/cqh;->d(JJII)I

    move-result v9

    goto :goto_1

    .line 188
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cqh;->d(JII)I

    move-result v9

    .line 190
    :goto_1
    if-gtz v9, :cond_3

    .line 191
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthPointStressDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return v0

    .line 194
    :cond_3
    goto :goto_0

    .line 195
    :cond_4
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiDataDeleteOption;I)I
    .locals 17

    .line 59
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getOwnerID()I

    move-result v1

    move/from16 v2, p2

    invoke-static {v0, v2, v1}, Lo/cqf;->e(Landroid/content/Context;II)I

    move-result v8

    .line 60
    if-gtz v8, :cond_0

    .line 61
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthData() who <= 0 app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", deleteOption = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const/16 v0, 0xa

    return v0

    .line 65
    :cond_0
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v9

    .line 67
    invoke-static {v9}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthData() clientIDs is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/16 v0, 0xa

    return v0

    .line 71
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTypes()[I

    move-result-object v10

    .line 72
    const/4 v11, 0x0

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 75
    :try_start_0
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTimes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiTimeInterval;

    .line 77
    move-object/from16 v0, p0

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    move-object v5, v10

    move-object v6, v9

    move v7, v8

    invoke-direct/range {v0 .. v7}, Lo/cre;->d(JJ[ILjava/util/List;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 78
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthData() delete fail types = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, ",timeInterval = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v15, v1, v2

    const-string v2, ",clients = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    const/16 v11, 0x9

    .line 81
    :cond_2
    goto :goto_0

    .line 86
    :cond_3
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 87
    goto :goto_1

    .line 82
    :catch_0
    move-exception v14

    .line 83
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthData e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v14}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    const/16 v11, 0xb

    .line 86
    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 87
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v16

    sget-object v0, Lo/cre;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 87
    throw v16

    .line 88
    :goto_1
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v12

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return v11
.end method
