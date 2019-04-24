.class public Lo/cqg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqg$d;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private c:Lo/cou;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v0, Lo/cqg;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cou;->b(Landroid/content/Context;)Lo/cou;

    move-result-object v0

    iput-object v0, p0, Lo/cqg;->c:Lo/cou;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Lo/cqg$1;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/cqg;-><init>()V

    return-void
.end method

.method private b(JJII)[Ljava/lang/String;
    .locals 3

    .line 313
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 314
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 313
    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/cqg;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqg;->a:Landroid/content/Context;

    .line 52
    sget-object v0, Lo/cqg$d;->a:Lo/cqg;

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 321
    const-string v0, "start_time =? and end_time =? and type_id =? and client_id =? "

    return-object v0
.end method

.method private e(JJII)Z
    .locals 7

    .line 279
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-direct {p0}, Lo/cqg;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct/range {p0 .. p6}, Lo/cqg;->b(JJII)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 280
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(J)I
    .locals 4

    .line 142
    const-string v2, "_id =? "

    .line 143
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 144
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v0, v2, v3}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(JJI)I
    .locals 6

    .line 362
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 363
    const-string v0, "sync_status"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 364
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 365
    const-string v5, "_id =? and modified_time =? "

    .line 366
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v4, v5, v1}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(JJII)I
    .locals 3

    .line 59
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-direct {p0}, Lo/cqg;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct/range {p0 .. p6}, Lo/cqg;->b(JJII)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(ILjava/util/List;Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;"
        }
    .end annotation

    .line 498
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 499
    const/4 v7, 0x0

    .line 500
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 501
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 502
    add-int/lit8 v0, v6, 0x4

    new-array v7, v0, [Ljava/lang/String;

    .line 503
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 504
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 505
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 506
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 507
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 508
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "metadata"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 509
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    goto :goto_0

    .line 511
    :cond_0
    add-int/lit8 v0, v6, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 512
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 513
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 514
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 515
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 516
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 517
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 519
    :goto_0
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 520
    invoke-static {v9}, Lo/cph;->A(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object v0

    return-object v0
.end method

.method public a(JJILjava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 209
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v6

    .line 210
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 211
    add-int/lit8 v0, v6, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 212
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 214
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 215
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 216
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 217
    const-string v0, "client_id"

    move-object/from16 v1, p6

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 218
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 219
    invoke-static {v9}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 9

    .line 299
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdatePointData enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move v6, p2

    invoke-direct/range {v0 .. v6}, Lo/cqg;->e(JJII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    invoke-virtual {p0, p1, p2, p3}, Lo/cqg;->d(Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v7, v0

    goto :goto_0

    .line 304
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo/cqg;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v7

    .line 306
    :goto_0
    invoke-static {v7, v8}, Lo/cpn;->c(J)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;II)J
    .locals 3

    .line 70
    invoke-static {p1, p2, p3}, Lo/cpi;->a(Lcom/huawei/hihealth/HiHealthData;II)Landroid/content/ContentValues;

    move-result-object v2

    .line 71
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v0, v2}, Lo/cou;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(JJILjava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 195
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v6

    .line 196
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 197
    add-int/lit8 v0, v6, 0x3

    new-array v8, v0, [Ljava/lang/String;

    .line 198
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 200
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 201
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 202
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 203
    const-string v0, "client_id"

    move-object/from16 v1, p6

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 204
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 205
    invoke-static {v9}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;JJI)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;JJI)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 550
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 551
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 552
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    .line 553
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 554
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    .line 555
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 556
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 557
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 558
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 559
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 560
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 561
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 562
    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 563
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 564
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 565
    const-string v0, "client_id"

    move-object v1, p1

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 566
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 567
    const/4 v0, 0x0

    invoke-static {v9, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(ILjava/lang/String;JJJII)I
    .locals 6

    .line 415
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 416
    const-string v3, "client_id =? and start_time =? and end_time =? and type_id =? and modified_time =? and metadata =? "

    .line 422
    const/4 v0, 0x6

    new-array v4, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 423
    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {p9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const/4 v0, 0x5

    aput-object p2, v4, v0

    goto :goto_0

    .line 425
    :cond_0
    const-string v3, "client_id =? and start_time =? and end_time =? and type_id =? and modified_time =? "

    .line 430
    const/4 v0, 0x5

    new-array v4, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 431
    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {p9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 433
    :goto_0
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 434
    const-string v0, "sync_status"

    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 435
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 436
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v0, v5, v3, v4}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(ILjava/lang/String;JJLjava/util/List;I)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;JJLjava/util/List<Ljava/lang/Integer;>;I)I"
        }
    .end annotation

    .line 370
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 371
    const-string v0, "sync_status"

    invoke-static/range {p8 .. p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 372
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 374
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v7

    .line 375
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 377
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 378
    add-int/lit8 v0, v7, 0x4

    new-array v9, v0, [Ljava/lang/String;

    .line 379
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 380
    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 381
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 382
    const/4 v0, 0x3

    aput-object p2, v9, v0

    .line 383
    const-string v0, "start_time"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 384
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "metadata"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 385
    const-string v0, "type_id"

    move-object/from16 v1, p7

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    goto :goto_0

    .line 387
    :cond_0
    add-int/lit8 v0, v7, 0x3

    new-array v9, v0, [Ljava/lang/String;

    .line 388
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 389
    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 390
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 391
    const-string v0, "start_time"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 392
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 393
    const-string v0, "type_id"

    move-object/from16 v1, p7

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 395
    :goto_0
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1, v9}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(IILjava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 471
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v6

    .line 472
    add-int/lit8 v0, v6, 0x2

    new-array v7, v0, [Ljava/lang/String;

    .line 473
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 474
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 475
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 476
    const-string v0, "type_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "sync_status"

    .line 477
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 478
    const-string v0, "client_id"

    move-object v1, p3

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 479
    const/4 v0, 0x0

    const/16 v1, 0x64

    invoke-static {v8, v0, v1}, Lo/cpl;->e(Ljava/lang/StringBuffer;II)V

    .line 480
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPointDataBySyncStatus() selector = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 482
    invoke-static {v9}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 151
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v6

    .line 152
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 153
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 154
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 157
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 158
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 159
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 160
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 161
    const-string v0, "client_id"

    move-object v1, p3

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 163
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 165
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 166
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;III)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;III)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 486
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 487
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 488
    new-array v8, v6, [Ljava/lang/String;

    .line 489
    const-string v0, "client_id"

    move-object v1, p1

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 491
    const-string v0, "start_time"

    invoke-static {v0, p2, p3, p4}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 493
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 494
    const/4 v0, 0x0

    invoke-static {v10, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiHealthData;II)I
    .locals 10

    .line 234
    invoke-static {p1, p3}, Lo/cpi;->c(Lcom/huawei/hihealth/HiHealthData;I)Landroid/content/ContentValues;

    move-result-object v9

    .line 236
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 237
    const-string v0, "sync_status"

    invoke-virtual {v9, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 239
    :cond_0
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-direct {p0}, Lo/cqg;->e()Ljava/lang/String;

    move-result-object v1

    move-object v2, p0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    move v8, p2

    invoke-direct/range {v2 .. v8}, Lo/cqg;->b(JJII)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v9, v1, v2}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(ILjava/util/List;I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 328
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 329
    add-int/lit8 v0, v6, 0x2

    new-array v7, v0, [Ljava/lang/String;

    .line 330
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 331
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 333
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 334
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "sync_status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 335
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start_time DESC  limit 0 ,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 339
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 340
    invoke-static {v10}, Lo/cph;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(ILjava/util/List;JJ)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;JJ)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 344
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 345
    add-int/lit8 v0, v6, 0x4

    new-array v7, v0, [Ljava/lang/String;

    .line 346
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 347
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 348
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 349
    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 351
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 352
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "sync_status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 353
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 354
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 355
    const-string v9, "start_time DESC "

    .line 357
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 358
    invoke-static {v10}, Lo/cph;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(ILjava/util/List;Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 524
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 526
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 527
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 528
    add-int/lit8 v0, v6, 0x4

    new-array v7, v0, [Ljava/lang/String;

    .line 529
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 530
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 531
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 532
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 533
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 534
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "metadata"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 535
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    goto :goto_0

    .line 537
    :cond_0
    add-int/lit8 v0, v6, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 538
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 539
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 540
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 541
    const-string v0, "client_id"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 542
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 543
    const-string v0, "type_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v8

    move-object v4, v7

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 545
    :goto_0
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 546
    invoke-static {v9}, Lo/cph;->j(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(JJI)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 456
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 457
    const-string v0, "start_time"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 458
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 459
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 460
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 461
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 462
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 463
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 464
    const-string v0, "client_id"

    invoke-static {v6, v0}, Lo/cpn;->e(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 465
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 466
    const-string v0, "client_id"

    invoke-static {v8, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 170
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v6

    .line 171
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 172
    add-int/lit8 v0, v6, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 173
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 178
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 179
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 180
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 181
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 182
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 183
    const-string v0, "client_id"

    move-object v1, p4

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 185
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 187
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 188
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 93
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v6

    .line 94
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 95
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 96
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " != ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 100
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 101
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 102
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 103
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 104
    const-string v0, "client_id"

    move-object v1, p3

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 105
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPointDataListByClientIdsWithOrder() sbSelector = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ",sbSelector = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 107
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPointDataListByClientIdsWithOrder() order = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 109
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(IJJII)I
    .locals 6

    .line 399
    const-string v3, "client_id =? and start_time =? and end_time =? and type_id =? "

    .line 403
    const/4 v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 404
    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 406
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 407
    const-string v0, "sync_status"

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 408
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 409
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v0, v5, v3, v4}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(JII)I
    .locals 6

    .line 226
    invoke-static {p3, p4}, Lo/cpi;->e(II)Landroid/content/ContentValues;

    move-result-object v5

    .line 227
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v5, v1, v2}, Lo/cou;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(JJ[ILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 440
    move-object/from16 v0, p5

    array-length v6, v0

    .line 441
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v7

    .line 442
    add-int v0, v6, v7

    add-int/lit8 v0, v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    .line 443
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 444
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 446
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 447
    const-string v0, "start_time"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 448
    const-string v0, "type_id"

    move-object/from16 v1, p5

    move v2, v6

    move-object v3, v9

    move-object v4, v8

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->d(Ljava/lang/String;[IILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 449
    const-string v0, "client_id"

    move-object/from16 v1, p6

    move v2, v7

    move-object v3, v9

    move-object v4, v8

    add-int/lit8 v5, v6, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 451
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 452
    invoke-static {v10}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 113
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v6

    .line 114
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 115
    add-int/lit8 v0, v6, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 116
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " != ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 121
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 122
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 123
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 124
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 125
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 126
    const-string v0, "client_id"

    move-object v1, p4

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 127
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPointDataListByClientIdsWithOrder() sbSelector = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ",sbSelector = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 129
    const-string v0, "Debug_HealthDataPointManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPointDataListByClientIdsWithOrder() order = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lo/cqg;->c:Lo/cou;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cou;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 131
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
