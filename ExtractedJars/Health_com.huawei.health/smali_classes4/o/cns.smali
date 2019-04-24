.class public Lo/cns;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 130
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lo/cns;->c:Landroid/util/SparseIntArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;II)V
    .locals 5

    .line 298
    invoke-static {p0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v1

    .line 301
    invoke-virtual {v1, p1}, Lo/cqi;->e(I)Ljava/util/List;

    move-result-object v2

    .line 302
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 303
    :cond_0
    return-void

    .line 305
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiGoalInfo;

    .line 306
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 307
    const/4 v0, 0x0

    invoke-virtual {v1, v4, v0}, Lo/cqi;->a(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    .line 308
    goto :goto_0

    .line 309
    :cond_2
    return-void
.end method

.method private static a(Ljava/util/List;IIZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;IIZ)V"
        }
    .end annotation

    .line 397
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    :cond_0
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStatSource datas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    return-void

    .line 401
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cob;

    .line 402
    invoke-virtual {v5, v5, p1, p2, p3}, Lo/cob;->d(Lo/cob;IIZ)V

    .line 403
    goto :goto_0

    .line 404
    :cond_2
    return-void
.end method

.method private static b(Landroid/content/Context;II)V
    .locals 5

    .line 281
    invoke-static {p0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v1

    .line 282
    invoke-virtual {v1, p1}, Lo/cqp;->d(I)Ljava/util/List;

    move-result-object v2

    .line 283
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 284
    :cond_0
    return-void

    .line 288
    :cond_1
    invoke-static {p0}, Lo/cnt;->f(Landroid/content/Context;)V

    .line 290
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiUserPreference;

    .line 291
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiUserPreference;->setUserId(I)V

    .line 292
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setSyncStatus(I)V

    .line 293
    invoke-virtual {v1, v4}, Lo/cqp;->d(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 294
    goto :goto_0

    .line 295
    :cond_2
    return-void
.end method

.method public static b(Landroid/content/Context;III)V
    .locals 7

    .line 136
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 137
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  myContext = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 142
    :try_start_0
    invoke-static {v4}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 143
    invoke-static {v4, p1, p2, p3}, Lo/cns;->e(Landroid/content/Context;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    invoke-static {v4}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 148
    goto :goto_0

    .line 144
    :catch_0
    move-exception v5

    .line 145
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    invoke-static {v4}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 148
    goto :goto_0

    .line 147
    :catchall_0
    move-exception v6

    invoke-static {v4}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 148
    throw v6

    .line 149
    :goto_0
    return-void
.end method

.method private static declared-synchronized c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 18

    const-class v17, Lo/cns;

    monitor-enter v17

    .line 210
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB huidA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",huidB = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    :cond_0
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB A or B is null or A equals B"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    monitor-exit v17

    const/4 v0, 0x1

    return v0

    .line 215
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 216
    invoke-static/range {p0 .. p0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v9

    .line 217
    invoke-static/range {p0 .. p0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v10

    .line 218
    invoke-static/range {p0 .. p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v11

    .line 219
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v12

    .line 220
    if-gtz v12, :cond_2

    .line 221
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB userA is not exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    monitor-exit v17

    const/4 v0, 0x2

    return v0

    .line 225
    :cond_2
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-virtual {v11, v0, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v13

    .line 226
    if-gtz v13, :cond_3

    .line 227
    new-instance v14, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v14}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 228
    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 229
    const-wide/16 v0, 0x1

    invoke-virtual {v14, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 230
    const/4 v0, 0x0

    invoke-virtual {v11, v14, v0}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v0

    long-to-int v13, v0

    .line 232
    :cond_3
    const-string v0, "com.huawei.health"

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 233
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "move default user personal info to target userB!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    move-object/from16 v0, p0

    invoke-static {v0, v12, v13}, Lo/cns;->d(Landroid/content/Context;II)V

    .line 236
    :cond_4
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB userA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",userB = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v12, v1}, Lo/cqz;->a(III)I

    move-result v14

    .line 239
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v13, v1}, Lo/cqz;->a(III)I

    move-result v15

    .line 240
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB statClientA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClientB = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    move-object/from16 v0, p0

    move v1, v14

    move v2, v13

    move v3, v15

    move/from16 v5, p3

    const/16 v4, 0x7d0

    invoke-static/range {v0 .. v5}, Lo/cns;->d(Landroid/content/Context;IIIIZ)V

    .line 243
    invoke-virtual {v9, v12}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v16

    .line 244
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB clientsA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-static/range {v16 .. v16}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 246
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB clientsA is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-static/range {p0 .. p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/clt;->d(Lcom/huawei/hihealth/HiAppInfo;)V

    .line 248
    monitor-exit v17

    const/4 v0, 0x3

    return v0

    .line 250
    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x5

    const/16 v4, 0x7d0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 251
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x1

    const/16 v4, 0x7d0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 252
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x2

    const/16 v4, 0x7d0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 253
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x3

    const/16 v4, 0xa

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 254
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x4

    const/16 v4, 0x7d0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 255
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x6

    const/16 v4, 0x7d0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 256
    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move v3, v13

    move/from16 v6, p3

    const/4 v1, 0x7

    const/16 v4, 0x7d0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v6}, Lo/cns;->c(Landroid/content/Context;ILjava/util/List;IIZZ)V

    .line 259
    sget-object v0, Lo/cns;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 260
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-static/range {p0 .. p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/clt;->d(Lcom/huawei/hihealth/HiAppInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    monitor-exit v17

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v17

    throw p0
.end method

.method private static c(Landroid/content/Context;ILjava/util/List;IIZZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;IIZZ)V"
        }
    .end annotation

    .line 341
    const-string v0, "HiH_HiAccountSwitch"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyDatasFromOnTable table = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",clientsA = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ",userB = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",count = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ",needStat = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 344
    const/4 v7, 0x0

    .line 345
    invoke-static {p0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v8

    .line 347
    :goto_0
    invoke-static {p0, p1, p2, v7, p4}, Lo/cns;->e(Landroid/content/Context;ILjava/util/List;II)Ljava/util/List;

    move-result-object v6

    .line 348
    invoke-static {p0, v6, p3, p6}, Lo/cns;->c(Landroid/content/Context;Ljava/util/List;IZ)V

    .line 349
    invoke-virtual {v8, v6, p3}, Lo/crf;->b(Ljava/util/List;I)I

    .line 351
    if-eqz p5, :cond_0

    .line 352
    invoke-virtual {v8, v6}, Lo/crf;->c(Ljava/util/List;)V

    .line 355
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p4, :cond_2

    .line 356
    :cond_1
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyHealthDatasFromAtoB datas is null table = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",anchor = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",count = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    goto :goto_1

    .line 360
    :cond_2
    add-int/2addr v7, p4

    goto :goto_0

    .line 363
    :goto_1
    if-eqz p5, :cond_3

    .line 364
    invoke-virtual {v8}, Lo/crf;->e()V

    .line 367
    :cond_3
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyDatasFromOnTable table = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;IZ)V"
        }
    .end annotation

    .line 374
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    :cond_0
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDataSource datas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    return-void

    .line 379
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 380
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    invoke-static {p0, v0, p2}, Lo/cns;->e(Landroid/content/Context;II)I

    move-result v4

    .line 381
    if-gtz v4, :cond_2

    .line 382
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDataSource clientB <= 0 data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    goto :goto_0

    .line 385
    :cond_2
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 386
    invoke-virtual {v6, p2}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 387
    if-nez p3, :cond_3

    .line 388
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 390
    :cond_3
    goto :goto_0

    .line 391
    :cond_4
    return-void
.end method

.method private static d(Landroid/content/Context;II)V
    .locals 3

    .line 269
    invoke-static {p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v1

    .line 270
    invoke-virtual {v1, p1}, Lo/cqs;->d(I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v2

    .line 271
    const/4 v0, 0x0

    invoke-virtual {v1, v2, p2, v0}, Lo/cqs;->a(Lcom/huawei/hihealth/HiUserInfo;II)I

    .line 274
    invoke-static {p0, p1, p2}, Lo/cns;->a(Landroid/content/Context;II)V

    .line 277
    invoke-static {p0, p1, p2}, Lo/cns;->b(Landroid/content/Context;II)V

    .line 278
    return-void
.end method

.method private static d(Landroid/content/Context;IIIIZ)V
    .locals 10

    .line 315
    const-string v0, "HiH_HiAccountSwitch"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyStatData statClientA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",userB = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",statClientB = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",count = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 318
    const/4 v7, 0x0

    .line 319
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v8

    .line 320
    invoke-static {p0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v9

    .line 323
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v8, p1, v0, v7, p4}, Lo/cqd;->b(IIII)Ljava/util/List;

    move-result-object v6

    .line 324
    invoke-static {v6, p2, p3, p5}, Lo/cns;->a(Ljava/util/List;IIZ)V

    .line 325
    invoke-virtual {v9, v6}, Lo/crf;->b(Ljava/util/List;)I

    .line 327
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p4, :cond_1

    .line 328
    :cond_0
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyStatData statDatas is null anchor = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",count = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    goto :goto_1

    .line 332
    :cond_1
    add-int/2addr v7, p4

    goto :goto_0

    .line 334
    :goto_1
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyStatData totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    return-void
.end method

.method private static e(Landroid/content/Context;II)I
    .locals 7

    .line 410
    sget-object v0, Lo/cns;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    .line 411
    if-lez v4, :cond_0

    .line 413
    return v4

    .line 415
    :cond_0
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v5

    .line 416
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 417
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClientB hiHealthContext = null, clientA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    const/4 v0, 0x0

    return v0

    .line 420
    :cond_1
    invoke-static {p0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    invoke-virtual {v5}, Lo/crd;->d()I

    move-result v1

    invoke-virtual {v5}, Lo/crd;->c()I

    move-result v2

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->a(III)I

    move-result v6

    .line 421
    sget-object v0, Lo/cns;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1, v6}, Landroid/util/SparseIntArray;->append(II)V

    .line 422
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClientB 2 clientA = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", userB = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",clientB = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    return v6
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 1

    .line 206
    invoke-static {p0, p1, p2, p3}, Lo/cns;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v0

    return v0
.end method

.method private static e(Landroid/content/Context;ILjava/util/List;II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 431
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 433
    :pswitch_0
    invoke-static {p0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cpy;->a(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 434
    goto :goto_1

    .line 436
    :pswitch_1
    invoke-static {p0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cqc;->a(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 437
    goto :goto_1

    .line 439
    :pswitch_2
    invoke-static {p0}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cqe;->a(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 440
    goto :goto_1

    .line 442
    :pswitch_3
    invoke-static {p0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cqj;->c(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 443
    goto :goto_1

    .line 445
    :pswitch_4
    invoke-static {p0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cqg;->c(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 446
    goto :goto_1

    .line 448
    :pswitch_5
    invoke-static {p0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cpv;->b(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 449
    goto :goto_1

    .line 451
    :pswitch_6
    invoke-static {p0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1, p3, p4}, Lo/cqh;->c(Ljava/util/List;III)Ljava/util/List;

    move-result-object v2

    .line 452
    goto :goto_1

    .line 454
    :goto_0
    const/4 v2, 0x0

    .line 457
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static e(Landroid/content/Context;III)V
    .locals 24

    .line 152
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",oldUser = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",newUser = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    move/from16 v0, p2

    move/from16 v1, p3

    if-eq v0, v1, :cond_0

    if-lez p3, :cond_0

    if-gtz p2, :cond_1

    .line 154
    :cond_0
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  oldUser = newUser return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 157
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 158
    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 159
    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 160
    invoke-static/range {p0 .. p0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v14

    .line 161
    invoke-static/range {p0 .. p0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v15

    .line 163
    move/from16 v0, p3

    invoke-virtual {v14, v0}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v16

    .line 164
    const/4 v0, 0x0

    move/from16 v1, p3

    const/4 v2, 0x0

    invoke-virtual {v15, v0, v1, v2}, Lo/cqz;->a(III)I

    move-result v17

    .line 165
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  newClients = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    const-string v2, ",newStatClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 168
    invoke-static {}, Lo/cmk;->a()[I

    move-result-object v18

    .line 169
    invoke-static/range {p0 .. p0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    move-wide v1, v10

    move-wide v3, v12

    move-object/from16 v5, v18

    move-object/from16 v6, v16

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->b(JJ[ILjava/util/List;)I

    move-result v19

    .line 170
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  deletePoint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-static/range {p0 .. p0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    move-wide v1, v10

    move-wide v3, v12

    move-object/from16 v7, v16

    const/16 v5, 0x4e21

    const/16 v6, 0x5208

    invoke-virtual/range {v0 .. v7}, Lo/cqc;->c(JJIILjava/util/List;)I

    move-result v20

    .line 173
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser deleteSession = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    :cond_2
    invoke-static/range {p0 .. p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    move-wide v1, v10

    move-wide v3, v12

    move/from16 v7, v17

    const v5, 0x9c41

    const v6, 0xa028

    invoke-virtual/range {v0 .. v7}, Lo/cqd;->e(JJIII)I

    move-result v18

    .line 177
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  deleteStat = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    invoke-static/range {p0 .. p0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v19

    .line 181
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  oldClients = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v19, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    if-eqz v19, :cond_3

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 183
    const/4 v0, 0x0

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v15, v0, v1, v2}, Lo/cqz;->a(III)I

    move-result v20

    .line 184
    invoke-static/range {p0 .. p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/cqf;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v21

    .line 185
    move/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, v21

    invoke-virtual {v15, v0, v1, v2}, Lo/cqz;->a(III)I

    move-result v22

    .line 186
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  oldStatClient = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",newClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  deviceID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-static/range {p0 .. p0}, Lo/cqb;->e(Landroid/content/Context;)Lo/cqb;

    move-result-object v23

    .line 189
    move-object/from16 v0, v23

    move-wide v1, v10

    move-wide v3, v12

    move-object/from16 v5, v19

    move/from16 v6, v22

    invoke-virtual/range {v0 .. v6}, Lo/cqb;->c(JJLjava/util/List;I)V

    .line 190
    move-object/from16 v0, v23

    move-wide v1, v10

    move-wide v3, v12

    move-object/from16 v5, v19

    move/from16 v6, v22

    invoke-virtual/range {v0 .. v6}, Lo/cqb;->a(JJLjava/util/List;I)V

    .line 191
    move-object/from16 v0, v23

    move-wide v1, v10

    move-wide v3, v12

    move/from16 v5, p3

    move/from16 v6, v20

    move/from16 v7, v17

    invoke-virtual/range {v0 .. v7}, Lo/cqb;->a(JJIII)V

    .line 193
    :cond_3
    const-string v0, "HiH_HiAccountSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveTodaySportDataToLoginUser  end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void
.end method
