.class public Lo/fdi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/fdi;

.field private static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x0

    sput-object v0, Lo/fdi;->b:Lo/fdi;

    .line 29
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/fdi;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    return-void
.end method

.method private a(ILjava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v5

    .line 127
    const/4 v7, 0x0

    .line 128
    const/4 v8, 0x0

    :goto_0
    if-ge v8, p1, :cond_2

    .line 129
    int-to-long v0, v8

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long/2addr v5, v0

    .line 130
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const-wide/16 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    double-to-int v7, v0

    .line 131
    const/4 v9, 0x0

    :goto_1
    const/16 v0, 0x64

    if-ge v9, v0, :cond_1

    .line 132
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 133
    if-le v9, v7, :cond_0

    .line 134
    const/16 v0, 0x55f2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    goto :goto_2

    .line 136
    :cond_0
    const/16 v0, 0x55f1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 139
    :goto_2
    int-to-long v0, v9

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long/2addr v0, v5

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 140
    add-int/lit8 v0, v9, 0x1

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long/2addr v0, v5

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 141
    const-string v0, "-1"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 142
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 128
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 145
    :cond_2
    return-void
.end method

.method private b(J)J
    .locals 7

    .line 226
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 227
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextDouble()D

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, p1

    long-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-long v0, v0

    add-long v5, p1, v0

    .line 228
    return-wide v5
.end method

.method public static c()Lo/fdi;
    .locals 3

    .line 58
    const-class v1, Lo/fdi;

    monitor-enter v1

    .line 59
    :try_start_0
    sget-object v0, Lo/fdi;->b:Lo/fdi;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lo/fdi;

    invoke-direct {v0}, Lo/fdi;-><init>()V

    sput-object v0, Lo/fdi;->b:Lo/fdi;

    .line 62
    :cond_0
    sget-object v0, Lo/fdi;->b:Lo/fdi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 63
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(ILjava/util/List;[DJJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[DJJ)V"
        }
    .end annotation

    .line 173
    const/4 v5, 0x0

    .line 174
    const-wide/16 v6, 0x0

    .line 175
    const/4 v8, 0x0

    :goto_0
    if-ge v8, p1, :cond_3

    .line 176
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2712

    invoke-direct {v5, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 177
    const-string v0, "-1"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 178
    invoke-direct {p0, p4, p5}, Lo/fdi;->b(J)J

    move-result-wide v6

    .line 179
    :goto_1
    cmp-long v0, v6, p6

    if-nez v0, :cond_0

    .line 180
    invoke-direct {p0, p4, p5}, Lo/fdi;->b(J)J

    move-result-wide v6

    goto :goto_1

    .line 182
    :cond_0
    move-wide p6, v6

    .line 183
    const-wide/high16 v0, 0x405e000000000000L    # 120.0

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, p3, v2

    .line 184
    const-wide/high16 v0, 0x405e000000000000L    # 120.0

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, p3, v2

    .line 185
    const-wide v0, 0x4061800000000000L    # 140.0

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, p3, v2

    .line 186
    invoke-virtual {v5, v6, v7}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 187
    invoke-virtual {v5, v6, v7}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 188
    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    const/4 v3, 0x1

    aget-wide v3, p3, v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_1

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    aget-wide v1, p3, v1

    :goto_2
    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 189
    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    const/4 v3, 0x1

    aget-wide v3, p3, v3

    cmpl-double v1, v1, v3

    if-lez v1, :cond_2

    const/4 v1, 0x1

    aget-wide v1, p3, v1

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    aget-wide v1, p3, v1

    :goto_3
    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 190
    const-string v0, "heart_rate"

    const/4 v1, 0x2

    aget-wide v1, p3, v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 191
    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 193
    :cond_3
    return-void
.end method

.method private d(DD)D
    .locals 7

    .line 219
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 220
    sub-double v0, p1, p3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    .line 221
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextDouble()D

    move-result-wide v0

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    .line 222
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    sub-double v0, p1, v0

    return-wide v0
.end method

.method private e(II)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 88
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x757b12c00L

    sub-long v10, v0, v2

    .line 92
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 94
    :pswitch_0
    const/4 v0, 0x2

    new-array v9, v0, [D

    .line 95
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas TYPE_WEIGHT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const-wide/16 v12, 0x0

    .line 97
    move-object v0, p0

    move/from16 v1, p2

    move-object v2, v8

    move-object v3, v9

    move-wide v4, v10

    move-wide v6, v12

    const-wide/16 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fdi;->e(ILjava/util/List;[DJJ)V

    .line 98
    goto :goto_1

    .line 100
    :pswitch_1
    const-wide/16 v12, 0x0

    .line 101
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas TYPE_BLOODPRESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x3

    new-array v9, v0, [D

    .line 103
    move-object v0, p0

    move/from16 v1, p2

    move-object v2, v8

    move-object v3, v9

    move-wide v4, v10

    move-wide v6, v12

    const-wide/16 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/fdi;->c(ILjava/util/List;[DJJ)V

    .line 104
    goto :goto_1

    .line 106
    :pswitch_2
    const-wide/16 v12, 0x0

    .line 107
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas TYPE_BLOODSUGAR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    move-object v0, p0

    move/from16 v1, p2

    move-object v2, v8

    move-wide v3, v10

    move-wide v5, v12

    const-wide/16 v5, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fdi;->e(ILjava/util/List;JJ)V

    .line 109
    goto :goto_1

    .line 112
    :pswitch_3
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas TYPE_SLEEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    move/from16 v0, p2

    invoke-direct {p0, v0, v8}, Lo/fdi;->a(ILjava/util/List;)V

    .line 114
    goto :goto_1

    .line 116
    :goto_0
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas None"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_1
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "constructDatas size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e(ILjava/util/List;JJ)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;JJ)V"
        }
    .end annotation

    .line 149
    const/4 v4, 0x0

    .line 150
    const-wide/16 v5, 0x0

    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v9, 0x0

    :goto_0
    if-ge v9, p1, :cond_1

    .line 153
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2711

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 154
    const-string v0, "-1"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 155
    invoke-direct {p0, p3, p4}, Lo/fdi;->b(J)J

    move-result-wide v5

    .line 156
    const-wide v0, 0x409f7c0000000000L    # 2015.0

    const-wide v2, 0x409f600000000000L    # 2008.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    double-to-int v7, v0

    .line 157
    :goto_1
    invoke-static {v5, v6}, Lo/fee;->e(J)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p5 .. p6}, Lo/fee;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-ne v7, v8, :cond_0

    .line 158
    invoke-direct {p0, p3, p4}, Lo/fdi;->b(J)J

    move-result-wide v5

    .line 159
    const-wide v0, 0x409f7c0000000000L    # 2015.0

    const-wide v2, 0x409f600000000000L    # 2008.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    double-to-int v7, v0

    goto :goto_1

    .line 161
    :cond_0
    move-wide p5, v5

    .line 162
    move v8, v7

    .line 163
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 164
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 165
    invoke-virtual {v4, v7}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 166
    const-wide v0, 0x4040800000000000L    # 33.0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 167
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 169
    :cond_1
    return-void
.end method

.method private e(ILjava/util/List;[DJJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[DJJ)V"
        }
    .end annotation

    .line 197
    const/4 v4, 0x0

    .line 198
    const-wide/16 v5, 0x0

    .line 199
    const/4 v7, 0x0

    :goto_0
    if-ge v7, p1, :cond_1

    .line 200
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2716

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 201
    const-string v0, "-1"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 202
    invoke-direct {p0, p4, p5}, Lo/fdi;->b(J)J

    move-result-wide v5

    .line 203
    :goto_1
    cmp-long v0, v5, p6

    if-nez v0, :cond_0

    .line 204
    invoke-direct {p0, p4, p5}, Lo/fdi;->b(J)J

    move-result-wide v5

    goto :goto_1

    .line 206
    :cond_0
    move-wide p6, v5

    .line 207
    const-wide v0, 0x4062a00000000000L    # 149.0

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, p3, v2

    .line 208
    const-wide v0, 0x4048800000000000L    # 49.0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/fdi;->d(DD)D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, p3, v2

    .line 209
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 210
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 211
    const-string v0, "weight"

    const/4 v1, 0x0

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 212
    const-string v0, "weight_bodyfat"

    const/4 v1, 0x1

    aget-wide v1, p3, v1

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 213
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 215
    :cond_1
    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 67
    sget-object v4, Lo/fdi;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 68
    :try_start_0
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 69
    invoke-direct {p0, p3, p2}, Lo/fdi;->e(II)Ljava/util/List;

    move-result-object v6

    .line 70
    const-string v0, "UIHLH_DeveloperDataIntert"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDatas datas.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {v5, v6}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 72
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fdi$5;

    invoke-direct {v1, p0, p4}, Lo/fdi$5;-><init>(Lo/fdi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 84
    :goto_0
    return-void
.end method
