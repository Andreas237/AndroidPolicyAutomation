.class public Lo/cph;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 1

    .line 490
    invoke-static {p0}, Lo/con;->b(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object v0

    return-object v0
.end method

.method public static B(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 1

    .line 474
    invoke-static {p0}, Lo/cpg;->b(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 59
    invoke-static {p0}, Lo/con;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 233
    invoke-static {p0, p1}, Lo/cos;->b(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/database/Cursor;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Z)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 252
    invoke-static {p0, p1}, Lo/cos;->a(Landroid/database/Cursor;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 104
    invoke-static {p0, p1}, Lo/con;->c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 173
    invoke-static {p0}, Lo/cow;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 140
    invoke-static {p0, p1}, Lo/cow;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 92
    invoke-static {p0, p1}, Lo/cow;->e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 63
    invoke-static {p0}, Lo/con;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 136
    invoke-static {p0, p1}, Lo/cow;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 67
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 68
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRawSportCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 74
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 76
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 77
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 78
    const-string v0, "session_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 79
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 80
    invoke-interface {p0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 79
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 85
    :cond_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 86
    goto :goto_2

    .line 85
    :catchall_0
    move-exception v10

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 86
    throw v10

    .line 88
    :goto_2
    return-object v4
.end method

.method public static d(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 238
    invoke-static {p0}, Lo/cos;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 144
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 145
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregateSessionChangeCountCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 151
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 153
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, p1, v0}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 154
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 157
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 158
    goto :goto_1

    .line 157
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 158
    throw v6

    .line 160
    :goto_1
    return-object v4
.end method

.method public static d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 100
    invoke-static {p0, p1}, Lo/con;->e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 168
    invoke-static {p0}, Lo/cow;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 52
    invoke-static {p0, p1}, Lo/con;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 96
    invoke-static {p0, p1}, Lo/con;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Double;
    .locals 6

    .line 265
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 266
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneDataValueCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x0

    return-object v0

    .line 269
    :cond_0
    const/4 v4, 0x0

    .line 271
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 272
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 275
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 276
    goto :goto_0

    .line 275
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 276
    throw v5

    .line 278
    :goto_0
    return-object v4
.end method

.method public static f(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 286
    invoke-static {p0}, Lo/cox;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 128
    invoke-static {p0, p1}, Lo/cox;->c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/database/Cursor;Ljava/lang/String;)I
    .locals 6

    .line 326
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 327
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneIntCursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_0
    const/4 v4, 0x0

    .line 332
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 333
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 336
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 337
    goto :goto_0

    .line 336
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 337
    throw v5

    .line 339
    :goto_0
    return v4
.end method

.method public static g(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 124
    invoke-static {p0, p1}, Lo/cox;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/database/Cursor;)Lo/cob;
    .locals 1

    .line 290
    invoke-static {p0}, Lo/cox;->c(Landroid/database/Cursor;)Lo/cob;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 343
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 344
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneStringCursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/4 v0, 0x0

    return-object v0

    .line 347
    :cond_0
    const/4 v4, 0x0

    .line 349
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 353
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 354
    goto :goto_0

    .line 353
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 354
    throw v5

    .line 356
    :goto_0
    return-object v4
.end method

.method public static h(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 257
    invoke-static {p0}, Lo/cos;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 116
    invoke-static {p0, p1}, Lo/cow;->b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static i(Landroid/database/Cursor;Ljava/lang/String;)J
    .locals 7

    .line 360
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 361
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneStringCursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const-wide/16 v0, 0x0

    return-wide v0

    .line 364
    :cond_0
    const-wide/16 v4, 0x0

    .line 366
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 367
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v4

    .line 370
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 371
    goto :goto_0

    .line 370
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 371
    throw v6

    .line 372
    :goto_0
    return-wide v4
.end method

.method public static i(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 243
    invoke-static {p0}, Lo/cos;->b(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static i(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 120
    invoke-static {p0, p1}, Lo/cow;->d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static j(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 494
    invoke-static {p0}, Lo/con;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static k(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 282
    invoke-static {p0}, Lo/cox;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static k(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 261
    invoke-static {p0, p1}, Lo/com;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 112
    invoke-static {p0, p1}, Lo/con;->b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static l(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 1

    .line 306
    invoke-static {p0}, Lo/cok;->a(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public static l(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 409
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 410
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseSleepLastSevenDayTime cursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const/4 v0, 0x0

    return-object v0

    .line 413
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 415
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 416
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    .line 417
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    goto :goto_0

    .line 420
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 421
    goto :goto_1

    .line 420
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 421
    throw v6

    .line 422
    :goto_1
    return-object v4
.end method

.method public static m(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiDeviceInfo;>;"
        }
    .end annotation

    .line 310
    invoke-static {p0}, Lo/cok;->c(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static n(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 298
    invoke-static {p0}, Lo/cox;->b(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static n(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 393
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 394
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseDataSourceClientCursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    const/4 v0, 0x0

    return-object v0

    .line 397
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 399
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 400
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 403
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 404
    goto :goto_1

    .line 403
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 404
    throw v5

    .line 405
    :goto_1
    return-object v4
.end method

.method public static n(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 132
    invoke-static {p0, p1}, Lo/con;->a(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static o(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 314
    invoke-static {p0}, Lo/coj;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static o(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 164
    invoke-static {p0, p1}, Lo/cos;->a(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static p(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAppInfo;
    .locals 1

    .line 302
    invoke-static {p0}, Lo/coc;->e(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v0

    return-object v0
.end method

.method public static p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 376
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 377
    const-string v0, "Debug_ParseCursorUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneIntListCursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const/4 v0, 0x0

    return-object v0

    .line 380
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 382
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 386
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 387
    goto :goto_1

    .line 386
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 387
    throw v5

    .line 389
    :goto_1
    return-object v4
.end method

.method public static q(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 432
    invoke-static {p0}, Lo/cpk;->c(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public static r(Landroid/database/Cursor;)Lo/crd;
    .locals 1

    .line 322
    invoke-static {p0}, Lo/coj;->b(Landroid/database/Cursor;)Lo/crd;

    move-result-object v0

    return-object v0
.end method

.method public static s(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lo/crd;>;"
        }
    .end annotation

    .line 318
    invoke-static {p0}, Lo/coj;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static t(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 1

    .line 436
    invoke-static {p0}, Lo/cod;->e(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    return-object v0
.end method

.method public static u(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiUserInfo;>;"
        }
    .end annotation

    .line 428
    invoke-static {p0}, Lo/cpk;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static v(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 443
    invoke-static {p0}, Lo/col;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static w(Landroid/database/Cursor;)Lo/cnz;
    .locals 1

    .line 447
    invoke-static {p0}, Lo/cpb;->d(Landroid/database/Cursor;)Lo/cnz;

    move-result-object v0

    return-object v0
.end method

.method public static x(Landroid/database/Cursor;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 470
    invoke-static {p0}, Lo/cpg;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static y(Landroid/database/Cursor;)Lo/cnz;
    .locals 1

    .line 451
    invoke-static {p0}, Lo/cpb;->e(Landroid/database/Cursor;)Lo/cnz;

    move-result-object v0

    return-object v0
.end method

.method public static z(Landroid/database/Cursor;)Z
    .locals 3

    .line 455
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 456
    const/4 v0, 0x0

    return v0

    .line 458
    :cond_0
    const/4 v1, 0x0

    .line 460
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 461
    const/4 v1, 0x1

    .line 464
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 465
    goto :goto_0

    .line 464
    :catchall_0
    move-exception v2

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 465
    throw v2

    .line 466
    :goto_0
    return v1
.end method
