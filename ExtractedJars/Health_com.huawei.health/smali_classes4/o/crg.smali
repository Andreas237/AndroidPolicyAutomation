.class public Lo/crg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crg$a;,
        Lo/crg$b;,
        Lo/crg$c;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private b:Lo/cps;

.field private c:Lo/cpz;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    sget-object v0, Lo/crg;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cps;->c(Landroid/content/Context;)Lo/cps;

    move-result-object v0

    iput-object v0, p0, Lo/crg;->b:Lo/cps;

    .line 37
    sget-object v0, Lo/crg;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpz;->b(Landroid/content/Context;)Lo/cpz;

    move-result-object v0

    iput-object v0, p0, Lo/crg;->c:Lo/cpz;

    .line 38
    return-void
.end method

.method synthetic constructor <init>(Lo/crg$1;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/crg;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;Ljava/lang/String;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;I)Z"
        }
    .end annotation

    .line 77
    const/4 v1, 0x1

    .line 78
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 81
    :pswitch_0
    invoke-direct/range {p0 .. p5}, Lo/crg;->c(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;Ljava/lang/String;I)Z

    move-result v1

    .line 82
    goto :goto_1

    .line 85
    :pswitch_1
    goto :goto_1

    .line 87
    :pswitch_2
    invoke-direct {p0, p1, p2, p4}, Lo/crg;->e(Lcom/huawei/hihealth/HiHealthData;ILjava/lang/String;)Z

    move-result v1

    .line 88
    goto :goto_1

    .line 90
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 92
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;)Lo/crg;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crg;->e:Landroid/content/Context;

    .line 50
    sget-object v0, Lo/crg$c;->b:Lo/crg;

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 188
    new-instance v1, Lo/crg$a;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lo/crg$a;-><init>(Lo/crg$1;)V

    .line 190
    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 191
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;Ljava/lang/String;I)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;I)Z"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lo/crg;->b:Lo/cps;

    move-object/from16 v1, p4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v6

    move-object/from16 v7, p3

    invoke-virtual/range {v0 .. v7}, Lo/cps;->a(Ljava/lang/String;JJILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 103
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    :cond_0
    iget-object v0, p0, Lo/crg;->b:Lo/cps;

    move-object/from16 v1, p4

    move-object/from16 v2, p1

    move/from16 v3, p2

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cps;->c(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v9

    .line 105
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 109
    :cond_2
    const/4 v9, 0x1

    .line 110
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 112
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 113
    goto :goto_1

    .line 115
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 116
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 118
    const/4 v9, 0x0

    .line 119
    .line 122
    :cond_4
    if-eqz v9, :cond_5

    .line 123
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 124
    const-string v0, "merged"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 125
    move-object/from16 v0, p1

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    :cond_5
    const/4 v0, 0x1

    move/from16 v1, p5

    if-ne v0, v1, :cond_6

    .line 128
    invoke-direct {p0, v8}, Lo/crg;->d(Ljava/util/List;)V

    goto :goto_2

    .line 130
    :cond_6
    invoke-direct {p0, v8}, Lo/crg;->c(Ljava/util/List;)V

    .line 134
    :goto_2
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 135
    iget-object v0, p0, Lo/crg;->b:Lo/cps;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    move-object/from16 v2, p4

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v10, v1, v3}, Lo/cps;->a(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v11

    .line 137
    const/4 v13, 0x1

    :goto_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_8

    .line 138
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 139
    const-string v0, "merged"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_7

    .line 140
    iget-object v0, p0, Lo/crg;->b:Lo/cps;

    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    move-object/from16 v2, p4

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v14, v1, v3}, Lo/cps;->a(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v12

    .line 141
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pointDataMerge() insertOrUpdatePointData unmerge change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    if-nez v12, :cond_7

    .line 143
    const/4 v11, 0x0

    .line 137
    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 147
    :cond_8
    return v11
.end method

.method private d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 182
    new-instance v1, Lo/crg$b;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lo/crg$b;-><init>(Lo/crg$1;)V

    .line 184
    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 185
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;ILjava/lang/String;)Z
    .locals 2

    .line 96
    iget-object v0, p0, Lo/crg;->b:Lo/cps;

    const/4 v1, 0x0

    invoke-virtual {v0, p3, p1, p2, v1}, Lo/cps;->a(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    .line 56
    invoke-static {v7}, Lo/cmi;->h(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support the type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    invoke-static {v7}, Lo/cmi;->i(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 62
    invoke-static {v8}, Lo/cmi;->d(I)[Ljava/lang/Object;

    move-result-object v9

    .line 64
    const/4 v0, 0x1

    aget-object v0, v9, v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 65
    const/4 v0, 0x2

    aget-object v0, v9, v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 66
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    const/4 v0, 0x0

    if-ne v0, v11, :cond_2

    .line 67
    :cond_1
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not set tableName or merge policy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 71
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v3, p3

    move-object v4, v12

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/crg;->a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;Ljava/lang/String;I)Z

    move-result v6

    .line 73
    return v6
.end method

.method public c(JJ[ILjava/util/List;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 210
    const/4 v0, 0x0

    aget v0, p5, v0

    invoke-static {v0}, Lo/cmi;->h(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteConfigDataTypes not support type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/4 v0, 0x0

    return v0

    .line 214
    :cond_0
    const/4 v0, 0x0

    aget v0, p5, v0

    invoke-static {v0}, Lo/cmi;->i(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 215
    const/4 v0, 0x1

    invoke-static {v8, v0}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 216
    const/4 v0, 0x0

    if-ne v0, v9, :cond_1

    .line 217
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statdata not set tablename"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const/4 v0, 0x0

    return v0

    .line 220
    :cond_1
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 221
    sget-object v0, Lo/crg;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cps;->c(Landroid/content/Context;)Lo/cps;

    move-result-object v11

    .line 222
    move-object v0, v11

    move-object v1, v10

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lo/cps;->c(Ljava/lang/String;JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v12

    .line 223
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteConfigDataTypes() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 225
    :cond_2
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteConfigDataTypes() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const/4 v0, 0x0

    return v0

    .line 229
    :cond_3
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 230
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v16

    .line 231
    if-nez v16, :cond_4

    .line 232
    move-object v0, v11

    move-object v1, v10

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v6

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lo/cps;->a(Ljava/lang/String;JJII)I

    move-result v13

    goto :goto_1

    .line 234
    :cond_4
    move-object v0, v11

    move-object v1, v10

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v2

    const/4 v4, 0x2

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/cps;->c(Ljava/lang/String;JII)I

    move-result v13

    .line 236
    :goto_1
    if-gtz v13, :cond_5

    .line 237
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteConfigDataTypes() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const/4 v0, 0x0

    return v0

    .line 240
    :cond_5
    goto :goto_0

    .line 241
    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 9

    .line 151
    if-gtz p2, :cond_0

    .line 152
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCongfigStatData() statClient <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x0

    return v0

    .line 155
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v4

    .line 156
    invoke-static {v4}, Lo/cmi;->f(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support stattype="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const/4 v0, 0x0

    return v0

    .line 160
    :cond_1
    invoke-static {v4}, Lo/cmi;->k(I)Ljava/lang/Integer;

    move-result-object v5

    .line 161
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 162
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_2
    const-string v0, "HiH_HiHealthSaveData"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCongfigStatData() type ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",who is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    new-instance v7, Lo/cob;

    invoke-direct {v7}, Lo/cob;-><init>()V

    .line 167
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/cob;->a(J)V

    .line 168
    invoke-virtual {v7, p3}, Lo/cob;->e(I)V

    .line 169
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cob;->f(I)V

    .line 170
    const-string v0, "hihealth_type"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cob;->d(I)V

    .line 171
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cob;->a(I)V

    .line 172
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cob;->i(I)V

    .line 173
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/cob;->e(D)V

    .line 174
    invoke-virtual {v7, p2}, Lo/cob;->b(I)V

    .line 175
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getModifiedTime()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/cob;->e(J)V

    .line 176
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 177
    iget-object v0, p0, Lo/crg;->c:Lo/cpz;

    invoke-virtual {v0, v8, v7}, Lo/cpz;->e(Ljava/lang/String;Lo/cob;)Z

    move-result v0

    return v0
.end method
