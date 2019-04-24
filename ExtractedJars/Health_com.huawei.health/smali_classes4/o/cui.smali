.class public Lo/cui;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 86
    const/4 v0, 0x0

    sput-boolean v0, Lo/cui;->d:Z

    .line 96
    const/4 v0, -0x1

    sput v0, Lo/cui;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    .line 333
    sget v0, Lo/cui;->a:I

    return v0
.end method

.method public static a(Landroid/content/Context;III)I
    .locals 4

    .line 279
    invoke-static {p0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->b(I)I

    move-result v2

    .line 280
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p2, p3, v2}, Lo/cqd;->c(III)Lo/cob;

    move-result-object v3

    .line 281
    if-nez v3, :cond_0

    const/4 v0, 0x0

    return v0

    .line 282
    :cond_0
    invoke-virtual {v3}, Lo/cob;->d()D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method public static a(Landroid/content/Context;I)Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 206
    invoke-static {p0, p1}, Lo/cup;->c(Landroid/content/Context;I)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 186
    invoke-static {p0, p1, p2}, Lo/cug;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(II)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 237
    const/16 v0, 0xc8

    if-lt p0, v0, :cond_0

    .line 238
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadCountMaxCheck too much upload count is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    new-instance v0, Lo/csq;

    const-string v1, "SYNC_EX: UPLOAD_TOO_MUCH "

    invoke-direct {v0, v1}, Lo/csq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;II)V
    .locals 4

    .line 297
    const-string v0, "sync_record"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 298
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sportsyncrecord"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 299
    return-void
.end method

.method public static a(Landroid/content/Context;IIJ)Z
    .locals 5

    .line 214
    invoke-static {p0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p4, p2}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v4

    .line 215
    if-nez v4, :cond_0

    .line 216
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkFirstSyncByType no such data in db ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " deviceCode is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v0, 0x1

    return v0

    .line 219
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)I
    .locals 1

    .line 271
    invoke-static {p0}, Lo/cup;->a(I)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;I)I
    .locals 3

    .line 313
    const-string v0, "sync_record"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "backgroudflag"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lo/cui;->a:I

    .line 315
    sget v0, Lo/cui;->a:I

    return v0
.end method

.method public static b(Landroid/content/Context;II)I
    .locals 5

    .line 337
    invoke-static {p0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2, p2}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v4

    .line 338
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 339
    const/16 v0, 0x2720

    if-ne v0, p2, :cond_1

    .line 340
    invoke-static {p0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/16 v3, 0x271f

    invoke-virtual {v0, p1, v1, v2, v3}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v4

    .line 341
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 342
    const/4 v0, 0x0

    return v0

    .line 344
    :cond_0
    invoke-virtual {v4}, Lo/cnz;->d()I

    move-result v0

    return v0

    .line 347
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 349
    :cond_2
    invoke-virtual {v4}, Lo/cnz;->d()I

    move-result v0

    return v0
.end method

.method public static b()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 361
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cnw;->a(Landroid/content/Context;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v2

    .line 362
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lo/cuj;->b(Landroid/content/Context;I)V

    .line 363
    return-void
.end method

.method public static c(JI)J
    .locals 4

    .line 171
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v0, p0, v0

    return-wide v0
.end method

.method public static c(Landroid/content/Context;I)J
    .locals 4

    .line 324
    const-string v0, "sync_record"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 325
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "backgroudstarttime"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 252
    invoke-static/range {p0 .. p5}, Lo/cup;->d(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;II)V
    .locals 4

    .line 307
    const-string v0, "sync_record"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 308
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backgroudflag"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 309
    sput p2, Lo/cui;->a:I

    .line 310
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 265
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 266
    invoke-static {p0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    const/16 v6, 0x385

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->c(IJJII)I

    .line 267
    goto :goto_0

    .line 268
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;[D)[D
    .locals 1

    .line 293
    invoke-static {p0, p1}, Lo/cul;->b(Landroid/content/Context;[D)[D

    move-result-object v0

    return-object v0
.end method

.method public static d(JI)I
    .locals 6

    .line 166
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v4, p0, v0

    .line 167
    invoke-static {v4, v5}, Lo/cnk;->a(J)I

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;J)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 154
    invoke-static {p0, p1, p2}, Lo/cug;->c(Landroid/content/Context;J)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 353
    invoke-static {p0, p1}, Lo/cup;->a(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;II)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .line 146
    invoke-static {p0, p1, p2}, Lo/cug;->a(Landroid/content/Context;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;>;"
        }
    .end annotation

    .line 286
    invoke-static {p0, p1}, Lo/cul;->c(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(II)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 244
    const/16 v0, 0x14

    if-lt p0, v0, :cond_0

    .line 245
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSportDataCountMaxCheck too much upload count is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    new-instance v0, Lo/csq;

    const-string v1, "SYNC_EX: UPLOAD_TOO_MUCH "

    invoke-direct {v0, v1}, Lo/csq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/util/List;[II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;[II)V"
        }
    .end annotation

    .line 257
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 258
    move-object v5, p2

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_0

    aget v8, v5, v7

    .line 259
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, p3, v1, v2, v8}, Lo/cqd;->c(IJI)I

    .line 258
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 261
    :cond_0
    goto :goto_0

    .line 262
    :cond_1
    return-void
.end method

.method public static d()Z
    .locals 1

    .line 357
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    return v0
.end method

.method public static e(Landroid/content/Context;)I
    .locals 1

    .line 175
    if-nez p0, :cond_0

    .line 176
    const/4 v0, 0x0

    return v0

    .line 178
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cuz;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static e(Landroid/content/Context;I)I
    .locals 1

    .line 275
    invoke-static {}, Lo/cuj;->a()Lo/cuj;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/cuj;->e(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method public static e(JJI)Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 161
    invoke-static {p0, p1, p2, p3, p4}, Lo/cug;->e(JJI)Landroid/util/SparseArray;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;IJ)V
    .locals 4

    .line 319
    const-string v0, "sync_record"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 320
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backgroudstarttime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 321
    return-void
.end method

.method public static e(Z)V
    .locals 0

    .line 131
    sput-boolean p0, Lo/cui;->d:Z

    .line 132
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 127
    sget-boolean v0, Lo/cui;->d:Z

    return v0
.end method

.method public static e(Landroid/content/Context;ILjava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 202
    invoke-static {p0, p1, p2}, Lo/cup;->b(Landroid/content/Context;ILjava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static e(Landroid/content/Context;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DataDelConditon;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 230
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;-><init>()V

    .line 231
    invoke-virtual {v1, p1}, Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;->setDelHealthDataConditons(Ljava/util/List;)V

    .line 232
    invoke-static {p0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;

    move-result-object v2

    .line 233
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    return v0
.end method
