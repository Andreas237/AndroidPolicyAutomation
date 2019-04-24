.class public abstract Lo/con;
.super Lo/cof;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 87
    invoke-direct {p0}, Lo/cof;-><init>()V

    .line 88
    return-void
.end method

.method public static a(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 159
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 160
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMergePointListWithClientIdAndMerged() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 167
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 170
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setDataID(J)V

    .line 171
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 172
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 173
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 174
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 175
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 176
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 177
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 178
    const-string v0, "unit_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 179
    const-string v0, "sync_status"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 180
    const-string v0, "merged"

    const-string v1, "merged"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 181
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 184
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 185
    goto :goto_1

    .line 184
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 185
    throw v6

    .line 186
    :goto_1
    return-object v4
.end method

.method public static a(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 223
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 225
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseNoSyncHealthPointCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const/4 v0, 0x0

    return-object v0

    .line 228
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 231
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 234
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 235
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 236
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 237
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 238
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 239
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 240
    invoke-interface {p0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 239
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 242
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 245
    :cond_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 246
    goto :goto_2

    .line 245
    :catchall_0
    move-exception v10

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 246
    throw v10

    .line 247
    :goto_2
    return-object v4
.end method

.method public static b(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;
    .locals 1

    .line 317
    invoke-static {p0}, Lo/coq;->c(Landroid/database/Cursor;)Lcom/huawei/hihealthservice/sync/syncdata/HiSyncWeightData;

    move-result-object v0

    return-object v0
.end method

.method static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    const-string v0, " CREATE INDEX  IF NOT EXISTS "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ON "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "start_time,"

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "end_time,"

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type_id,"

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id)"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 252
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 253
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregateHealthPointCursor() query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, 0x0

    return-object v0

    .line 256
    :cond_0
    invoke-static {p0, p1}, Lo/con;->k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

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

    .line 322
    invoke-static {p0}, Lo/coq;->d(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 271
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 272
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregateWeightPointCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x0

    return-object v0

    .line 275
    :cond_0
    invoke-static {p0, p1}, Lo/coq;->e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 191
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 193
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseNoSyncPointList() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 200
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 202
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setDataID(J)V

    .line 203
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 204
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 205
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 206
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 207
    const-string v0, "unit_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 208
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 209
    const-string v0, "modified_time"

    const-string v1, "modified_time"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putLong(Ljava/lang/String;J)V

    .line 210
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 211
    const-string v0, "sync_status"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 212
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 213
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 216
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 217
    goto :goto_1

    .line 216
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 217
    throw v6

    .line 218
    :goto_1
    return-object v4
.end method

.method public static d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 128
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 129
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parsePointListWithDeviceUUID Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 135
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 137
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setDataID(J)V

    .line 138
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 139
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 140
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 141
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 142
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 143
    const-string v0, "unit_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 144
    const-string v0, "sync_status"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 145
    invoke-virtual {v5, p1}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 146
    const-string v0, "merged"

    const-string v1, "merged"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 147
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 148
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 149
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 152
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 153
    goto :goto_1

    .line 152
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 153
    throw v6

    .line 154
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

    .line 327
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 329
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRawSportCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    const/4 v0, 0x0

    return-object v0

    .line 332
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 335
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 337
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 338
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setDataID(J)V

    .line 339
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 340
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 341
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 342
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 343
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 344
    const-string v0, "timeZone"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 345
    const-string v0, "modified_time"

    const-string v1, "modified_time"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putLong(Ljava/lang/String;J)V

    .line 346
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 347
    invoke-interface {p0, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v5, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 346
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 349
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 352
    :cond_2
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 353
    goto :goto_2

    .line 352
    :catchall_0
    move-exception v10

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 353
    throw v10

    .line 354
    :goto_2
    return-object v4
.end method

.method static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " create table  IF NOT EXISTS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    const-string v0, "_id integer primary key  not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    const-string v0, "start_time integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    const-string v0, "end_time integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const-string v0, "type_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    const-string v0, "value double not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    const-string v0, "metadata text,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    const-string v0, "unit_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    const-string v0, "client_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    const-string v0, "merged integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    const-string v0, "sync_status integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    const-string v0, "timeZone text not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    const-string v0, "modified_time integer not null"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 261
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 263
    const-string v0, "Debug_DBPointCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseAggregatePointCursor() Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v0, 0x0

    return-object v0

    .line 266
    :cond_0
    invoke-static {p0, p1}, Lo/con;->k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static k(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 289
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 292
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 294
    new-instance v3, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 295
    const-string v0, "start_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 296
    const-string v0, "end_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 297
    const-string v0, "type_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 298
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_0

    .line 299
    const-string v0, "metadata"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 301
    :cond_0
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_1

    .line 302
    const-string v0, "client_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 304
    :cond_1
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 305
    invoke-interface {p0, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {v3, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 304
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 307
    :cond_2
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 310
    :cond_3
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 311
    goto :goto_2

    .line 310
    :catchall_0
    move-exception v8

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 311
    throw v8

    .line 312
    :goto_2
    return-object v2
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 21
    invoke-super {p0}, Lo/cof;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super/range {p0 .. p5}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super/range {p0 .. p6}, Lo/cof;->b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroid/content/ContentValues;)J
    .locals 2

    .line 21
    invoke-super {p0, p1}, Lo/cof;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 21
    invoke-super {p0, p1, p2, p3}, Lo/cof;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 3

    .line 122
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "start_time"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "end_time"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "type_id"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "metadata"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "unit_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "client_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "merged"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sync_status"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "timeZone"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "modified_time"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
