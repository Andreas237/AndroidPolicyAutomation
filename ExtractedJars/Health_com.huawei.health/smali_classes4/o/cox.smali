.class public Lo/cox;
.super Lo/cof;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cox$d;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Lo/cof;-><init>()V

    .line 84
    return-void
.end method

.method synthetic constructor <init>(Lo/cox$2;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/cox;-><init>()V

    return-void
.end method

.method public static a(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 171
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 173
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseStatTablesCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 179
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    invoke-static {p0}, Lo/cox;->e(Landroid/database/Cursor;)Lo/cob;

    move-result-object v5

    .line 182
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 185
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 186
    goto :goto_1

    .line 185
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 186
    throw v6

    .line 187
    :goto_1
    return-object v4
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    const-string v0, " CREATE INDEX StatIndex ON hihealth_stat_day("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "date,"

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stat_type,"

    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id)"

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 248
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 250
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseStatCursorDays() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    const/4 v0, 0x0

    return-object v0

    .line 253
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 256
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 259
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 262
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 263
    goto :goto_1

    .line 262
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 263
    throw v6

    .line 264
    :goto_1
    return-object v4
.end method

.method public static b(Landroid/content/Context;)Lo/cox;
    .locals 1

    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cox;->b:Landroid/content/Context;

    .line 96
    sget-object v0, Lo/cox$d;->c:Lo/cox;

    return-object v0
.end method

.method public static c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 269
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 271
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregateStatCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    const/4 v0, 0x0

    return-object v0

    .line 274
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 277
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 280
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 281
    const-string v0, "stat_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 282
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 283
    const-string v0, "modified_time"

    const-string v1, "modified_time"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putLong(Ljava/lang/String;J)V

    .line 284
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 285
    invoke-interface {p0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 284
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 287
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 290
    :cond_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 291
    goto :goto_2

    .line 290
    :catchall_0
    move-exception v10

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 291
    throw v10

    .line 292
    :goto_2
    return-object v4
.end method

.method public static c(Landroid/database/Cursor;)Lo/cob;
    .locals 6

    .line 192
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 194
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseOneStatCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    const/4 v4, 0x0

    .line 199
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-static {p0}, Lo/cox;->e(Landroid/database/Cursor;)Lo/cob;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 204
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 205
    goto :goto_0

    .line 204
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 205
    throw v5

    .line 206
    :goto_0
    return-object v4
.end method

.method public static d(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 142
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 144
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseStatCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 153
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 154
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 155
    const-string v0, "hihealth_type"

    const-string v1, "hihealth_type"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 156
    const-string v0, "stat_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 157
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 158
    const-string v0, "unit_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 159
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 160
    const-string v0, "modified_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setModifiedTime(J)V

    .line 161
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 164
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 165
    goto :goto_1

    .line 164
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 165
    throw v6

    .line 166
    :goto_1
    return-object v4
.end method

.method public static d(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 297
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 299
    const-string v0, "Debug_DBStatDay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregateStatCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const/4 v0, 0x0

    return-object v0

    .line 302
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 305
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 307
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 308
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 309
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lo/cnk;->b(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 310
    const-string v0, "stat_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 311
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 312
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 313
    invoke-interface {p0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 312
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 315
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 318
    :cond_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 319
    goto :goto_2

    .line 318
    :catchall_0
    move-exception v10

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 319
    throw v10

    .line 320
    :goto_2
    return-object v4
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    const-string v0, "create table  IF NOT EXISTS hihealth_stat_day("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    const-string v0, "_id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    const-string v0, "date integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    const-string v0, "hihealth_type integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    const-string v0, "stat_type integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    const-string v0, "value double not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const-string v0, "user_id integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    const-string v0, "unit_id integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    const-string v0, "client_id integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    const-string v0, "timeZone text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    const-string v0, "sync_status integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    const-string v0, "modified_time integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Landroid/database/Cursor;)Lo/cob;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 234
    new-instance v2, Lo/cob;

    invoke-direct {v2}, Lo/cob;-><init>()V

    .line 235
    const-string v0, "date"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cob;->c(I)V

    .line 236
    const-string v0, "hihealth_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cob;->d(I)V

    .line 237
    const-string v0, "stat_type"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cob;->a(I)V

    .line 238
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/cob;->e(D)V

    .line 239
    const-string v0, "unit_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cob;->i(I)V

    .line 240
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cob;->e(Ljava/lang/String;)V

    .line 241
    const-string v0, "modified_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/cob;->e(J)V

    .line 242
    const-string v0, "sync_status"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cob;->f(I)V

    .line 243
    return-object v2
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 20
    invoke-super {p0}, Lo/cof;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 20
    invoke-super {p0, p1, p2}, Lo/cof;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 20
    invoke-super {p0, p1, p2}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 20
    invoke-super/range {p0 .. p5}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 20
    invoke-super/range {p0 .. p6}, Lo/cof;->b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroid/content/ContentValues;)J
    .locals 2

    .line 20
    invoke-super {p0, p1}, Lo/cof;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 131
    const-string v0, "hihealth_stat_day"

    return-object v0
.end method

.method public bridge synthetic d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 20
    invoke-super {p0, p1, p2, p3}, Lo/cof;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 3

    .line 136
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "date"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "hihealth_type"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stat_type"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "user_id"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "unit_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "client_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "timeZone"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sync_status"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "modified_time"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 20
    invoke-super {p0, p1, p2}, Lo/cof;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
