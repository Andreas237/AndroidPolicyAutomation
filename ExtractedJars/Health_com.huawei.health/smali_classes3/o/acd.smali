.class public Lo/acd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/acd$c;
    }
.end annotation


# static fields
.field private static b:Lo/acd;


# instance fields
.field private a:Lo/acc;

.field private e:Lcom/huawei/hihealth/device/open/DeviceProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    sput-object v0, Lo/acd;->b:Lo/acd;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 490
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acd;->a:Lo/acc;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    .line 492
    return-void
.end method

.method static synthetic a(Lo/acd;)Lo/acc;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/acd;->a:Lo/acc;

    return-object v0
.end method

.method private a(Lo/acp;)Lo/acp;
    .locals 6

    .line 139
    instance-of v0, p1, Lo/aja;

    if-eqz v0, :cond_1

    .line 140
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceOtherInfo in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    move-object v4, p1

    check-cast v4, Lo/aja;

    .line 142
    move-object v0, p1

    check-cast v0, Lo/aja;

    iget-object v0, v0, Lo/aja;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->b(Ljava/lang/String;)Lo/aja;

    move-result-object v5

    .line 143
    if-eqz v5, :cond_0

    .line 144
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDeviceOtherInfo mDeviceID"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v5, Lo/aja;->c:Lo/aja$a;

    iget-object v3, v3, Lo/aja$a;->e:Ljava/lang/String;

    invoke-static {v3}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, v5, Lo/aja;->a:Ljava/util/List;

    invoke-virtual {v4, v0}, Lo/aja;->c(Ljava/util/List;)V

    .line 146
    iget-object v0, v5, Lo/aja;->c:Lo/aja$a;

    iput-object v0, v4, Lo/aja;->c:Lo/aja$a;

    .line 148
    :cond_0
    return-object v4

    .line 150
    :cond_1
    return-object p1
.end method

.method public static c()Lo/acd;
    .locals 3

    .line 44
    const-class v1, Lo/acd;

    monitor-enter v1

    .line 45
    :try_start_0
    sget-object v0, Lo/acd;->b:Lo/acd;

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Lo/acd;

    invoke-direct {v0}, Lo/acd;-><init>()V

    sput-object v0, Lo/acd;->b:Lo/acd;

    .line 48
    :cond_0
    sget-object v0, Lo/acd;->b:Lo/acd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 49
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 401
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager getWearDeviceSize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0}, Lo/acb;->c()I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;
    .locals 19

    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v9, 0x0

    .line 178
    const/4 v10, 0x0

    .line 181
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 182
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x7

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "name"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "uniqueId"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "mode"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "kind"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "kitUuid"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "auto"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "productId = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 185
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 187
    const/4 v0, 0x2

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 188
    const/4 v0, 0x3

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 189
    const/4 v0, 0x4

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v14

    .line 190
    const/4 v0, 0x5

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 192
    const/4 v0, 0x6

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 193
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingUniversalFragment onStateChanged:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",uniqueId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",connMode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",,kind:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",sUuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",auto:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    if-eqz v15, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    :cond_0
    const/16 v17, 0x0

    .line 231
    if-eqz v10, :cond_1

    .line 232
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 234
    :cond_1
    if-eqz v9, :cond_2

    .line 235
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 196
    :cond_2
    return-object v17

    .line 198
    :cond_3
    :try_start_1
    new-instance v0, Lo/acd$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v11, v12}, Lo/acd$4;-><init>(Lo/acd;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v8, v0

    .line 225
    goto/16 :goto_0

    .line 231
    :cond_4
    if-eqz v10, :cond_5

    .line 232
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 234
    :cond_5
    if-eqz v9, :cond_a

    .line 235
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 226
    :catch_0
    move-exception v11

    .line 227
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 231
    if-eqz v10, :cond_6

    .line 232
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 234
    :cond_6
    if-eqz v9, :cond_a

    .line 235
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 228
    :catch_1
    move-exception v11

    .line 229
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SQLiteException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 231
    if-eqz v10, :cond_7

    .line 232
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 234
    :cond_7
    if-eqz v9, :cond_a

    .line 235
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 231
    :catchall_0
    move-exception v18

    if-eqz v10, :cond_8

    .line 232
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 234
    :cond_8
    if-eqz v9, :cond_9

    .line 235
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 237
    :cond_9
    throw v18

    .line 239
    :cond_a
    :goto_1
    return-object v8
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z
    .locals 1

    .line 362
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/acb;->b(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z

    move-result v0

    return v0
.end method

.method public b(Lo/acl$a;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl$a;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 242
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v10, 0x0

    .line 247
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 248
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lo/acl$a;->b:Lo/acl$a;

    if-ne p1, v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kind = \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 249
    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v7, "addTime"

    .line 248
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 251
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 252
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 253
    if-eqz v11, :cond_1

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 254
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    :cond_1
    goto :goto_1

    .line 262
    :cond_2
    if-eqz v10, :cond_3

    .line 263
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 265
    :cond_3
    if-eqz v9, :cond_8

    .line 266
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_2

    .line 257
    :catch_0
    move-exception v11

    .line 258
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts SQLiteException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    if-eqz v10, :cond_4

    .line 263
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 265
    :cond_4
    if-eqz v9, :cond_8

    .line 266
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_2

    .line 259
    :catch_1
    move-exception v11

    .line 260
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts NumberFormatException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    if-eqz v10, :cond_5

    .line 263
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 265
    :cond_5
    if-eqz v9, :cond_8

    .line 266
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_2

    .line 262
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_6

    .line 263
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 265
    :cond_6
    if-eqz v9, :cond_7

    .line 266
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 268
    :cond_7
    throw v12

    .line 269
    :cond_8
    :goto_2
    return-object v8
.end method

.method public b()V
    .locals 9

    .line 323
    const/4 v5, 0x0

    .line 324
    const/4 v6, 0x0

    .line 326
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v5, v0

    .line 327
    const-string v0, "device"

    const-string v1, "kind = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "HDK_WEIGHT"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    move v6, v0

    .line 328
    const-string v0, "device"

    const-string v1, "kind = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "HDK_BLOOD_PRESSURE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 329
    const-string v0, "device"

    const-string v1, "kind = ? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "HDK_BLOOD_SUGAR"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 330
    const-string v0, "device"

    const-string v1, "kind = ?  and kitUuid != ? "

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "HDK_HEART_RATE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "0"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v5, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 331
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBondedProductsForDeviceOnly delete HDK_WEIGHT HDK_BLOOD_PRESSURE HDK_BLOOD_SUGAR HDK_HEART_RATE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 337
    if-eqz v5, :cond_1

    .line 338
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 332
    :catch_0
    move-exception v7

    .line 333
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SQLiteException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 337
    if-eqz v5, :cond_1

    .line 338
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 334
    :catch_1
    move-exception v7

    .line 335
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 337
    if-eqz v5, :cond_1

    .line 338
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 337
    :catchall_0
    move-exception v8

    if-eqz v5, :cond_0

    .line 338
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 340
    :cond_0
    throw v8

    .line 341
    :cond_1
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteNum:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    if-lez v6, :cond_2

    .line 343
    invoke-static {}, Lo/ajq;->b()I

    .line 345
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 155
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v4

    .line 156
    if-nez v4, :cond_0

    .line 157
    return-void

    .line 160
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager current device is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v5

    .line 162
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager kituuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hihealth/device/open/HealthDevice;->getUniqueId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v6

    .line 165
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/huawei/hihealth/device/open/MeasureKit;->getBackgroundController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 166
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager sendBroadCastToBluetoothMonitor action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    const-string v0, "productId"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {v0, v7, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 173
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 4

    .line 380
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager unbindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acb;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b(Lo/acf;Lo/ace;Lo/aby;)Z
    .locals 1

    .line 412
    iget-object v0, p0, Lo/acd;->a:Lo/acc;

    if-nez v0, :cond_0

    .line 413
    new-instance v0, Lo/acc;

    invoke-direct {v0}, Lo/acc;-><init>()V

    iput-object v0, p0, Lo/acd;->a:Lo/acc;

    .line 416
    :cond_0
    new-instance v0, Lo/acd$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/acd$c;-><init>(Lo/acd;Lo/acf;Lo/ace;Lo/aby;)V

    invoke-static {v0}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 417
    const/4 v0, 0x1

    return v0
.end method

.method public c(Lo/acl$a;)Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl$a;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 273
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 274
    const/4 v9, 0x0

    .line 275
    const/4 v10, 0x0

    .line 278
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 279
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "kitUuid"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Lo/acl$a;->b:Lo/acl$a;

    move-object/from16 v4, p1

    if-ne v4, v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "kind = \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 280
    invoke-virtual/range {p1 .. p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v7, "addTime"

    .line 279
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 282
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 283
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 284
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 285
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBondedProductsForDeviceOnly() productId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    const-string v2, ", kitUid="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    goto :goto_1

    .line 291
    :cond_1
    :try_start_1
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v13

    .line 292
    const/4 v0, 0x0

    if-ne v0, v13, :cond_2

    .line 294
    goto :goto_1

    .line 300
    :cond_2
    goto :goto_2

    .line 296
    :catch_0
    move-exception v13

    .line 298
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBondedProductsForDeviceOnly() Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :goto_2
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 303
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBondedProductsForDeviceOnly() add "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 306
    :cond_3
    goto/16 :goto_1

    .line 312
    :cond_4
    if-eqz v10, :cond_5

    .line 313
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 315
    :cond_5
    if-eqz v9, :cond_a

    .line 316
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_3

    .line 307
    :catch_1
    move-exception v11

    .line 308
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts SQLiteException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 312
    if-eqz v10, :cond_6

    .line 313
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 315
    :cond_6
    if-eqz v9, :cond_a

    .line 316
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 309
    :catch_2
    move-exception v11

    .line 310
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBondedProducts NumberFormatException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 312
    if-eqz v10, :cond_7

    .line 313
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 315
    :cond_7
    if-eqz v9, :cond_a

    .line 316
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 312
    :catchall_0
    move-exception v14

    if-eqz v10, :cond_8

    .line 313
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 315
    :cond_8
    if-eqz v9, :cond_9

    .line 316
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 318
    :cond_9
    throw v14

    .line 319
    :cond_a
    :goto_3
    return-object v8
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 385
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acb;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
    .locals 6

    .line 421
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager scanDeviceUniversl current device is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v4

    .line 423
    invoke-virtual {v4, p1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v5

    .line 425
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 426
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager scanDeviceUniversal fail,deviceKit is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    const/4 v0, 0x0

    return v0

    .line 429
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/device/open/MeasureKit;->getDeviceProvider()Lcom/huawei/hihealth/device/open/DeviceProvider;

    move-result-object v0

    iput-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    .line 430
    iget-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 431
    iget-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    invoke-interface {v0, p2}, Lcom/huawei/hihealth/device/open/DeviceProvider;->scanDevice(Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    move-result v0

    return v0

    .line 433
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
    .locals 4

    .line 370
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager bindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/acb;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    move-result v0

    return v0
.end method

.method public d()I
    .locals 4

    .line 396
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager deleteWearDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0}, Lo/acb;->a()I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Lo/acp;
    .locals 20

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 83
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v9, v0

    .line 84
    move-object v0, v9

    const-string v1, "device"

    const/4 v2, 0x7

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "name"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "uniqueId"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "mode"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "kind"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "kitUuid"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "auto"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "productId = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 87
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 88
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 89
    const/4 v0, 0x2

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 90
    const/4 v0, 0x3

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 91
    const/4 v0, 0x4

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v14

    .line 92
    const/4 v0, 0x5

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 94
    const/4 v0, 0x6

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 96
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v17

    .line 97
    const-string v0, "PluginDevice_PluginDevice"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getBondedDevice():"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " name="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v11, v1, v2

    const-string v2, " uniqueId="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v12, v1, v2

    const-string v2, " connMode="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 98
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " kind="

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    aput-object v14, v1, v2

    const-string v2, " sUuid="

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const/16 v2, 0xb

    aput-object v15, v1, v2

    const-string v2, " auto="

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " auto_status="

    const/16 v3, 0xe

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 97
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    if-eqz v17, :cond_0

    .line 100
    new-instance v0, Lo/ack;

    invoke-direct {v0, v11, v12, v12}, Lo/ack;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    goto :goto_1

    .line 102
    :cond_0
    const/4 v0, 0x1

    if-ne v13, v0, :cond_1

    .line 103
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v18

    .line 104
    invoke-static/range {v18 .. v18}, Lo/acg;->c(Landroid/bluetooth/BluetoothDevice;)Lo/acg;

    move-result-object v0

    move-object v8, v0

    .line 105
    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    if-ne v13, v0, :cond_2

    .line 106
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v18

    .line 107
    invoke-static/range {v18 .. v18}, Lo/acj;->e(Landroid/bluetooth/BluetoothDevice;)Lo/acj;

    move-result-object v0

    move-object v8, v0

    .line 108
    goto :goto_1

    :cond_2
    const/4 v0, 0x4

    if-ne v13, v0, :cond_3

    .line 109
    new-instance v0, Lo/ach;

    invoke-direct {v0}, Lo/ach;-><init>()V

    move-object v8, v0

    goto :goto_1

    .line 110
    :cond_3
    const/16 v0, 0x10

    if-ne v13, v0, :cond_4

    .line 111
    new-instance v0, Lo/aco;

    const/4 v1, 0x1

    invoke-direct {v0, v11, v12, v1}, Lo/aco;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object v8, v0

    goto :goto_1

    .line 112
    :cond_4
    const/16 v0, 0x8

    if-ne v13, v0, :cond_5

    .line 113
    new-instance v0, Lo/aja;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/aja;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 116
    :cond_5
    :goto_1
    if-eqz v8, :cond_7

    .line 117
    move/from16 v0, v16

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v8, v0}, Lo/acp;->c(Z)V

    .line 118
    invoke-virtual {v8, v11}, Lo/acp;->b(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v8, v15}, Lo/acp;->a(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v8, v14}, Lo/acp;->d(Lo/acl$a;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :cond_7
    goto/16 :goto_0

    .line 128
    :cond_8
    if-eqz v10, :cond_9

    .line 129
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_9
    if-eqz v9, :cond_e

    .line 132
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 123
    :catch_0
    move-exception v11

    .line 124
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    if-eqz v10, :cond_a

    .line 129
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_a
    if-eqz v9, :cond_e

    .line 132
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 125
    :catch_1
    move-exception v11

    .line 126
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SQLiteException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    if-eqz v10, :cond_b

    .line 129
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_b
    if-eqz v9, :cond_e

    .line 132
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 128
    :catchall_0
    move-exception v19

    if-eqz v10, :cond_c

    .line 129
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_c
    if-eqz v9, :cond_d

    .line 132
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 134
    :cond_d
    throw v19

    .line 135
    :cond_e
    :goto_3
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/acd;->a(Lo/acp;)Lo/acp;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/acp;)Z
    .locals 4

    .line 406
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager cancelBinding"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acb;->c(Lo/acp;)Z

    move-result v0

    return v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 74
    invoke-static {}, Lo/ajq;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 53
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v4

    .line 54
    if-nez v4, :cond_0

    .line 55
    return-void

    .line 58
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager current device is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v5

    .line 60
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager kituuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {v4}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/acq;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v6

    .line 63
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lo/afx;->c()Lo/afv;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Lo/acp;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceManager sendBroadCastToBluetoothMonitor action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    const-string v0, "productId"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {v0, v7, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 71
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 4

    .line 375
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager unbindWiFiDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acb;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/acp;Lo/aby;)Z
    .locals 4

    .line 357
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager bindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/acb;->d(Ljava/lang/String;Ljava/lang/String;Lo/acp;Lo/aby;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z
    .locals 1

    .line 366
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/acb;->c(Ljava/lang/String;Ljava/lang/String;Lo/aja;Lo/aby;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Lo/acl;)Z
    .locals 4

    .line 390
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager bindWearDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/acb;->a(Ljava/lang/String;Lo/acl;)Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 4

    .line 497
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_0

    .line 498
    const/4 v0, 0x1

    return v0

    .line 501
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 502
    const/4 v0, 0x0

    return v0

    .line 505
    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0xa

    if-gt v2, v0, :cond_3

    .line 507
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 510
    goto :goto_1

    .line 508
    :catch_0
    move-exception v3

    .line 509
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    :goto_1
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_2

    .line 513
    const/4 v0, 0x1

    return v0

    .line 505
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 516
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public f(Ljava/lang/String;)Z
    .locals 1

    .line 441
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acb;->d(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public h()V
    .locals 4

    .line 484
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceManager stopScanUniversal:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    if-eqz v0, :cond_0

    .line 486
    iget-object v0, p0, Lo/acd;->e:Lcom/huawei/hihealth/device/open/DeviceProvider;

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/DeviceProvider;->stopScanDevice()Z

    .line 488
    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    .line 478
    iget-object v0, p0, Lo/acd;->a:Lo/acc;

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lo/acd;->a:Lo/acc;

    invoke-virtual {v0}, Lo/acc;->e()V

    .line 481
    :cond_0
    return-void
.end method
