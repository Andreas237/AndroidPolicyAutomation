.class public Lo/bbv;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bbv$e;,
        Lo/bbv$d;
    }
.end annotation


# static fields
.field private static c:Lo/bbv;

.field private static e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 54
    const/4 v0, 0x0

    sput-object v0, Lo/bbv;->c:Lo/bbv;

    .line 98
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/bbv;->e:J

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/bbv$e;
        }
    .end annotation

    .line 112
    move-object v0, p0

    move-object v1, p1

    invoke-static {}, Lo/bbv;->d()Ljava/lang/String;

    move-result-object v2

    move-object v5, p2

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-direct/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 113
    invoke-static {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 115
    invoke-direct {p0, p1}, Lo/bbv;->b(Landroid/content/Context;)V

    .line 116
    return-void
.end method

.method private A(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 3

    .line 1198
    const-string v0, "alter table t_user add site_id smallint default 0"

    .line 1199
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1201
    const-string v1, "alter table t_user add user_type smallint default 0"

    .line 1202
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1204
    const-string v2, "alter table t_group_notify add user_account text"

    .line 1206
    invoke-direct {p0, p1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1207
    return-void
.end method

.method private B(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 1263
    const-string v0, "alter table t_message add assist_json text"

    .line 1264
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1267
    invoke-direct {p0, p1}, Lo/bbv;->k(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1268
    return-void
.end method

.method private C(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 1230
    const-string v0, "alter table t_group add qr_code text"

    .line 1231
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1233
    const-string v1, "alter table t_group add grp_name_flag smallint default 0"

    .line 1235
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1238
    invoke-direct {p0, p1}, Lo/bbv;->n(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1239
    invoke-direct {p0, p1}, Lo/bbv;->o(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1240
    return-void
.end method

.method private D(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 3

    .line 1214
    const-string v0, "alter table t_user add set_flags text"

    .line 1215
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1217
    const-string v1, "alter table t_user add stick_time text"

    .line 1218
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1220
    const-string v2, "alter table t_group add site_id smallint default 0"

    .line 1221
    invoke-direct {p0, p1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1222
    return-void
.end method

.method private E(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 19

    .line 1357
    const-string v3, "alter table t_user add search_full_pinyin text"

    .line 1359
    const-string v4, "alter table t_user add search_short_pinyin text"

    .line 1361
    const-string v5, "alter table t_user add search_pinyin_fenci text"

    .line 1365
    const-string v6, "alter table t_group add search_full_pinyin text"

    .line 1366
    const-string v7, "alter table t_group add search_short_pinyin text"

    .line 1367
    const-string v8, "alter table t_group add search_pinyin_fenci text"

    .line 1370
    const-string v9, "alter table t_group_member add search_full_pinyin text"

    .line 1372
    const-string v10, "alter table t_group_member add search_short_pinyin text"

    .line 1374
    const-string v11, "alter table t_group_member add search_pinyin_fenci text"

    .line 1377
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v3}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1378
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v4}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1379
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v5}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1380
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v6}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1381
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v7}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1382
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1383
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v9}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1384
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1385
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v11}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1388
    const-string v12, "DROP TABLE IF EXISTS t_user_refer"

    .line 1389
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1392
    const-string v13, "alter table t_user add origin_type smallint default -1"

    .line 1395
    const-string v14, "alter table t_user add origin_desc text"

    .line 1398
    const-string v15, "alter table t_user_notify add frd_origin_type  smallint default -1"

    .line 1400
    const-string v16, "alter table t_user_notify add frd_origin_desc  text"

    .line 1404
    const-string v17, "alter table t_user_notify add my_origin_type  smallint default -1"

    .line 1406
    const-string v18, "alter table t_user_notify add my_origin_desc  text"

    .line 1409
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v13}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1410
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v14}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1411
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v15}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1412
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1413
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1414
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1417
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/bbv;->i(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1418
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/bbv;->g(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1419
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/bbv;->h(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1420
    return-void
.end method

.method private F(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 0

    .line 1463
    invoke-direct {p0, p1}, Lo/bbv;->s(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1464
    return-void
.end method

.method private G(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 1430
    const-string v0, "delete from t_assistant where _id not in ( select * from (select max(_id) from t_assistant group by user_id ) b)"

    .line 1433
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1435
    const-string v1, "alter table t_assistant rename to t_assistant_temp"

    .line 1437
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1439
    invoke-direct {p0, p1}, Lo/bbv;->f(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1441
    const-string v2, "insert into t_assistant(user_id, introduction, menu, channel, default_msg, emui_only, appid, name, package, require_version) select user_id, introduction, menu, channel, default_msg, emui_only, appid, name, package, require_version from t_assistant_temp"

    .line 1450
    invoke-direct {p0, p1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1452
    const-string v3, "drop table t_assistant_temp"

    .line 1453
    invoke-direct {p0, p1, v3}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1454
    return-void
.end method

.method private H(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 10

    .line 1276
    const-string v0, "alter table t_message add pic_forward_url text"

    .line 1277
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1279
    const-string v1, "alter table t_message add mts_thumb_flag text"

    .line 1280
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1282
    const-string v2, "alter table t_message add mts_ori_download_status integer default 0"

    .line 1284
    invoke-direct {p0, p1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1287
    const-string v3, "alter table t_message add is_reffered_self smallint default 0"

    .line 1289
    invoke-direct {p0, p1, v3}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1292
    const-string v4, "alter table t_message add sender_name text"

    .line 1294
    invoke-direct {p0, p1, v4}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1297
    const-string v5, "alter table t_conversation add unread_reffered_self_msg_number integer default 0"

    .line 1299
    invoke-direct {p0, p1, v5}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1302
    const-string v6, "alter table t_conversation add conversation_draft_message_text text default \' \'"

    .line 1304
    invoke-direct {p0, p1, v6}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1307
    const-string v7, "alter table t_conversation add last_message_sender_name text"

    .line 1309
    invoke-direct {p0, p1, v7}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1312
    const-string v8, "alter table t_group add sort_pinyin text"

    .line 1313
    invoke-direct {p0, p1, v8}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1316
    const-string v9, "alter table t_group_member add grp_nickname_sort_pinyin text"

    .line 1318
    invoke-direct {p0, p1, v9}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1321
    invoke-direct {p0, p1}, Lo/bbv;->z(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1322
    return-void
.end method

.method private I(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 7

    .line 1330
    const-string v0, "alter table t_message add msg_data1 text"

    .line 1331
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1334
    const-string v1, "alter table t_assistant add default_msg text"

    .line 1336
    const-string v2, "alter table t_assistant add emui_only text"

    .line 1337
    const-string v3, "alter table t_assistant add appid text"

    .line 1338
    const-string v4, "alter table t_assistant add name text"

    .line 1339
    const-string v5, "alter table t_assistant add package text"

    .line 1340
    const-string v6, "alter table t_assistant add require_version text"

    .line 1343
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1344
    invoke-direct {p0, p1, v2}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1345
    invoke-direct {p0, p1, v3}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1346
    invoke-direct {p0, p1, v4}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1347
    invoke-direct {p0, p1, v5}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1348
    invoke-direct {p0, p1, v6}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1349
    return-void
.end method

.method private static a()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    sput-object v0, Lo/bbv;->c:Lo/bbv;

    .line 59
    return-void
.end method

.method private static a(Landroid/content/Context;J)V
    .locals 4

    .line 202
    :try_start_0
    invoke-static {}, Lo/bby;->e()Lo/bby;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lo/bby;->e(Landroid/content/Context;J)V
    :try_end_0
    .catch Lo/ayr; {:try_start_0 .. :try_end_0} :catch_0

    .line 208
    goto :goto_0

    .line 204
    :catch_0
    move-exception v3

    .line 206
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNSSQLiteOpenHelper recordMigrateDBException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SNSSQLiteOpenHelper recordMigrateDBException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 209
    :goto_0
    return-void
.end method

.method private a(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 218
    const-string v0, "create table if not exists t_user(user_id long PRIMARY KEY,image_url text,old_image_url text,image_url_download text,phone_digest text,phone_number text,display_name text,nick_name text,remark_name text,need_verify smallint,gender smallint,national_code text,account text,province text,city text,signature text,sort_pinyin text,contact_sort_pinyin text, smallint,channel smallint,state smallint,is_friend smallint,relation smallint,registered_user smallint,last_update_time text,site_id smallint,user_type smallint,set_flags text,stick_time text default \'0\',search_full_pinyin text,search_short_pinyin text,search_pinyin_fenci text,origin_type smallint default -1,origin_desc text)"

    .line 250
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 251
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 12

    .line 1015
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1017
    invoke-virtual {p0}, Lo/bbv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    .line 1020
    invoke-static {}, Lo/bbv;->d()Ljava/lang/String;

    move-result-object v7

    .line 1022
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1025
    invoke-direct {p0, p1, v7}, Lo/bbv;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1027
    const-string v0, "sqlcipher prepare migrate data,delete encrypted db file failed."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 1029
    new-instance v0, Lo/bbv$e;

    const-string v1, "sqlcipher prepare migrate data,delete encrypted db file failed."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$e;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0

    .line 1031
    :cond_0
    const/4 v8, 0x0

    .line 1033
    invoke-static {}, Lo/ays;->a()Ljava/lang/String;

    move-result-object v9

    .line 1037
    const-string v0, ""

    const/4 v1, 0x0

    :try_start_0
    invoke-static {v6, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    move-object v8, v0

    .line 1039
    invoke-direct {p0, p1, v8, v9}, Lo/bbv;->e(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V
    :try_end_0
    .catch Lo/bbv$d; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1055
    invoke-direct {p0, v8}, Lo/bbv;->y(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1056
    goto :goto_0

    .line 1041
    :catch_0
    move-exception v10

    .line 1044
    :try_start_1
    invoke-virtual {v10}, Lo/bbv$d;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 1045
    new-instance v0, Lo/bbv$e;

    invoke-virtual {v10}, Lo/bbv$d;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$e;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0

    .line 1047
    :catch_1
    move-exception v10

    .line 1050
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sqlcipher migrate database meet Exception."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 1051
    new-instance v0, Lo/bbv$e;

    const-string v1, "sqlcipher migrate database meet Exception."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$e;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1055
    :catchall_0
    move-exception v11

    invoke-direct {p0, v8}, Lo/bbv;->y(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1056
    throw v11

    .line 1061
    :goto_0
    :try_start_2
    invoke-static {}, Lo/bby;->e()Lo/bby;

    move-result-object v0

    sget-wide v1, Lo/bbv;->e:J

    invoke-virtual {v0, v9, v1, v2}, Lo/bby;->b(Ljava/lang/String;J)V
    :try_end_2
    .catch Lo/ayr; {:try_start_2 .. :try_end_2} :catch_2

    .line 1066
    goto :goto_1

    .line 1063
    :catch_2
    move-exception v10

    .line 1065
    new-instance v0, Lo/bbv$e;

    const-string v1, "sqlcipher migrate finish.save db key failed."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$e;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0

    .line 1069
    :goto_1
    invoke-virtual {p0}, Lo/bbv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1071
    const-string v0, "sqlcipher migrate finish.delete unencrypted database meet Exception."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 1072
    new-instance v0, Lo/bbv$e;

    const-string v1, "sqlcipher migrate finish.delete unencrypted database meet Exception."

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$e;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0

    .line 1075
    :cond_1
    invoke-static {}, Lo/bby;->e()Lo/bby;

    move-result-object v0

    sget-wide v1, Lo/bbv;->e:J

    invoke-virtual {v0, v1, v2}, Lo/bby;->e(J)V

    .line 1077
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sqlcipher migrate database cost:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1078
    goto :goto_2

    .line 1081
    :cond_2
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "sqlcipher no need migrate database."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1083
    :goto_2
    return-void
.end method

.method public static b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    .locals 1

    .line 1486
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 1488
    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 1490
    :cond_0
    return-void
.end method

.method private b(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 288
    const-string v0, "create table if not exists t_user_notify_note(id INT  AUTO_INCREMENT PRIMARY KEY,user_id long,note text,sender smallint,type smallint,send_time text )"

    .line 296
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 297
    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;)Lo/bbv;
    .locals 8

    const-class v7, Lo/bbv;

    monitor-enter v7

    .line 143
    :try_start_0
    sget-object v0, Lo/bbv;->c:Lo/bbv;

    if-nez v0, :cond_1

    .line 145
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 146
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/bch;->b(Landroid/content/Context;)V

    .line 148
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 149
    invoke-static {v4, v5}, Lo/bbv;->c(J)V

    .line 151
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_0

    .line 153
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "SNSSQLiteOpenHelper getInstance: UserId is Invalid!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 159
    :cond_0
    :try_start_1
    new-instance v6, Lo/bbv$1;

    invoke-direct {v6}, Lo/bbv$1;-><init>()V

    .line 176
    new-instance v0, Lo/bbv;

    invoke-direct {v0, v3, v6}, Lo/bbv;-><init>(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V

    sput-object v0, Lo/bbv;->c:Lo/bbv;
    :try_end_1
    .catch Lo/bbv$e; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    goto :goto_0

    .line 178
    :catch_0
    move-exception v6

    .line 180
    :try_start_2
    invoke-static {v3, v4, v5}, Lo/bbv;->a(Landroid/content/Context;J)V

    .line 182
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MigrateDBException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/bbv$e;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const/4 v0, 0x0

    sput-object v0, Lo/bbv;->c:Lo/bbv;

    .line 187
    :goto_0
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNSSQLiteOpenHelper getInstance: mInstance = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/bbv;->c:Lo/bbv;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :cond_1
    sget-object v0, Lo/bbv;->c:Lo/bbv;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v7

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v7

    throw p0
.end method

.method private static c(J)V
    .locals 0

    .line 102
    sput-wide p0, Lo/bbv;->e:J

    .line 103
    return-void
.end method

.method private c(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 306
    const-string v0, "create table if not exists t_group(group_id long primary key,group_name text,group_type integer,group_image_url text,old_group_image_url text,group_image_download_url text,manager_id long,disturb_mode integer,save_to_contract_mode integer,show_nickname_mode integer,stick_time text default \'0\' ,create_time text,site_id smallint,qr_code text,qr_expire_time text,group_member_version text,grp_name_flag smallint,group_state smallint,sort_pinyin text,search_full_pinyin text,search_short_pinyin text,search_pinyin_fenci text)"

    .line 331
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 332
    return-void
.end method

.method private static d()Ljava/lang/String;
    .locals 3

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sns_e_1_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-wide v1, Lo/bbv;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 341
    const-string v0, "create table if not exists t_group_member(group_id long,user_id long,user_group_nickname text,join_time text,state integer,grp_nickname_sort_pinyin text,search_full_pinyin text,search_short_pinyin text,search_pinyin_fenci text, primary key(group_id,user_id))"

    .line 354
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 355
    return-void
.end method

.method private e(Landroid/content/Context;Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/bbv$d;
        }
    .end annotation

    .line 900
    const-wide/16 v4, 0x0

    .line 903
    const-wide/16 v6, 0x0

    .line 906
    invoke-direct {p0, p2}, Lo/bbv;->w(Lnet/sqlcipher/database/SQLiteDatabase;)Z

    move-result v8

    .line 907
    if-eqz v8, :cond_0

    .line 910
    const-string v0, "t_message"

    invoke-static {p2, v0}, Lnet/sqlcipher/DatabaseUtils;->queryNumEntries(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v4

    .line 914
    :cond_0
    invoke-static {}, Lo/bbv;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v9

    .line 916
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "sqlcipher migrate data.begin."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 918
    invoke-virtual {p2}, Lnet/sqlcipher/database/SQLiteDatabase;->getVersion()I

    move-result v10

    .line 919
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ATTACH DATABASE \'%s\' as encrypted KEY \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\';"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawExecSQL(Ljava/lang/String;)V

    .line 920
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "sqlcipher migrate data.attach and begin transaction."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 922
    invoke-virtual {p2}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    .line 923
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "sqlcipher migrate data.begin export."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    const-string v0, "SELECT sqlcipher_export(\'encrypted\');"

    invoke-virtual {p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawExecSQL(Ljava/lang/String;)V

    .line 926
    invoke-virtual {p2}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    .line 928
    invoke-virtual {p2}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 931
    const-string v0, "DETACH DATABASE encrypted;"

    invoke-virtual {p2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawExecSQL(Ljava/lang/String;)V

    .line 932
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "sqlcipher migrate data.detach finish."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 935
    const/4 v0, 0x0

    invoke-static {v9, p3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/io/File;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v11

    .line 936
    invoke-virtual {v11, v10}, Lnet/sqlcipher/database/SQLiteDatabase;->setVersion(I)V

    .line 939
    if-eqz v8, :cond_1

    .line 941
    const-string v0, "t_message"

    invoke-static {v11, v0}, Lnet/sqlcipher/DatabaseUtils;->queryNumEntries(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v6

    .line 944
    :cond_1
    invoke-direct {p0, v11}, Lo/bbv;->y(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 947
    cmp-long v0, v6, v4

    if-eqz v0, :cond_2

    .line 949
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sqlcipher migrate finish.message table num does not match.["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] isMessageTableExist is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 952
    new-instance v0, Lo/bbv$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sqlcipher migrate finish.message table num does not match.["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] isMessageTableExist is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bbv$d;-><init>(Ljava/lang/String;Lo/bbv$1;)V

    throw v0

    .line 957
    :cond_2
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sqlcipher migrate finish.message num is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " isMessageTableExist is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 959
    return-void
.end method

.method private e(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 260
    const-string v0, "create table if not exists t_user_notify(user_id long PRIMARY KEY,image_url text,old_image_url text,image_download_url text,phone_digest text,nick_name text,newly_recieved_notify smallint,type smallint,note text,state smallint,notifiedSide smallint,send_time text,frd_origin_type smallint default -1,frd_origin_desc text,my_origin_type smallint default -1,my_origin_desc text )"

    .line 278
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 279
    return-void
.end method

.method private e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V
    .locals 3

    .line 1181
    :try_start_0
    invoke-virtual {p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1188
    goto :goto_0

    .line 1183
    :catch_0
    move-exception v2

    .line 1185
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "doExecSQL SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exec sql exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lnet/sqlcipher/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 1189
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 880
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 881
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 884
    const/4 v0, 0x1

    return v0

    .line 886
    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private f(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 381
    const-string v0, "create table if not exists t_assistant(user_id long primary key,introduction text,menu text,channel text,default_msg text,emui_only text,appid text,name text,package text,require_version text,company text )"

    .line 393
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 394
    return-void
.end method

.method private g(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 425
    const-string v0, "create table if not exists t_circle_action_param(_id  integer primary key,circle_id integer,action_param_key text,action_param_value text )"

    .line 430
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 431
    return-void
.end method

.method private h(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 440
    const-string v0, "create table if not exists t_circle_content(_id  integer primary key,circle_id integer,circle_type integer,circle_content text )"

    .line 445
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 446
    return-void
.end method

.method private i(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 403
    const-string v0, "create table if not exists t_user_circle(_id  integer primary key,user_id long,circle_name text,show_download integer,app_package text,app_name text,app_version long,app_id text,app_redirect integer,redirect_url text,redirect_action text )"

    .line 415
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 416
    return-void
.end method

.method private j(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 1248
    const-string v0, "alter table t_group add qr_expire_time text"

    .line 1249
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1252
    const-string v1, "alter table t_group add group_state smallint default 0"

    .line 1254
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 1255
    return-void
.end method

.method private k(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 365
    const-string v0, "create table if not exists t_assistant(_id integer primary key,user_id long,introduction text,menu text,channel text )"

    .line 371
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 372
    return-void
.end method

.method private l(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 557
    const-string v0, "create table if not exists t_message(_id integer primary key,user_id long,chat_type integer,msg_status integer,send_msg_status integer,mts_download_status integer,mts_ori_download_status integer,msg_content_type integer,msg_content text,assist_json text,msg_date long,media_thumbnail text, msg_id text, media_id text, media_url text, media_time text, media_size long, media_remark text, played integer default 1,sender_id long, receicer_id long, seq integer default 0, previous_seq integer default 0, is_reffered_self smallint default 0, sender_name text, pic_mts_url text, pic_forward_url text, mts_thumb_flag text, msg_data1 text )"

    .line 574
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 576
    const-string v1, "create index msg_date_index on t_message(msg_date)"

    .line 577
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 578
    return-void
.end method

.method private m(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 455
    const-string v0, "create table if not exists t_group_notify(type integer,user_id long,user_account text,user_nickname integer,user_image_url text,old_user_image_url text,user_image_download_url text,group_id long,group_name text,group_image_url text,old_group_image_url text,group_image_download_url text,send_time text, primary key(group_id,user_id))"

    .line 472
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 473
    return-void
.end method

.method private n(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 482
    const-string v0, "create table if not exists t_conversation(_id integer primary key,user_id long unique,msg_id text, last_message text,last_message_date text,message_status integer,send_message_status integer,message_type integer,message_unread_number integer default 0,chat_type integer,undisturb integer default 0,is_removed integer default 0,top_time text default \'0\'  )"

    .line 491
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 493
    const-string v1, "create index t_conversation_userid_index on t_conversation(user_id)"

    .line 495
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 496
    return-void
.end method

.method private o(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 530
    const-string v0, "create table if not exists t_message(_id integer primary key,user_id long,chat_type integer,msg_status integer,send_msg_status integer,mts_download_status integer,msg_content_type integer,msg_content text,msg_date long,media_thumbnail text, msg_id text, media_id text, media_url text, media_time text, media_size long, media_remark text, played integer default 1,sender_id long, receicer_id long, seq integer default 0, previous_seq integer default 0, pic_mts_url text )"

    .line 544
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 546
    const-string v1, "create index msg_date_index on t_message(msg_date)"

    .line 547
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 548
    return-void
.end method

.method private p(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 505
    const-string v0, "create table if not exists t_conversation(_id integer primary key,user_id long unique,msg_id text, last_message text,last_message_date text,message_status integer,send_message_status integer,message_type integer,message_unread_number integer default 0,chat_type integer,undisturb integer default 0,is_removed integer default 0,last_message_sender_name text,unread_reffered_self_msg_number integer default 0,conversation_draft_message_text text default \' \',top_time text default \'0\'  )"

    .line 516
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 518
    const-string v1, "create index t_conversation_userid_index on t_conversation(user_id)"

    .line 520
    invoke-direct {p0, p1, v1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 521
    return-void
.end method

.method private q(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 669
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 670
    const-string v0, " CREATE TRIGGER message_insert_conversation_on_insert AFTER INSERT ON "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    const-string v0, "t_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    const-string v0, " WHEN NOT EXISTS(SELECT * FROM "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    const-string v0, "t_conversation"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    const-string v0, " WHERE user_id=NEW.user_id )"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    const-string v0, " BEGIN  INSERT INTO "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    const-string v0, "t_conversation ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    const-string v0, "chat_type,user_id,last_message,last_message_date,message_status,message_type,message_unread_number,send_message_status,last_message_sender_name,unread_reffered_self_msg_number,conversation_draft_message_text,msg_id,undisturb,is_removed)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    const-string v0, "values"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    const-string v0, "( NEW.chat_type,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    const-string v0, " NEW.user_id,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    const-string v0, " NEW.msg_content,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    const-string v0, " NEW.msg_date,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    const-string v0, " NEW.msg_status,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    const-string v0, " NEW.msg_content_type,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    const-string v0, " 1 ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    const-string v0, " NEW.send_msg_status,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    const-string v0, " NEW.sender_name,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    const-string v0, "(SELECT COUNT(*) FROM t_message WHERE user_id = NEW.user_id AND is_reffered_self = 1 AND msg_status = 2 AND send_msg_status = 0 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    const-string v0, "(SELECT msg_content FROM t_message WHERE user_id = NEW.user_id AND msg_status = 3  order by _id desc  LIMIT 1 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    const-string v0, " NEW.msg_id,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    const-string v0, " 0 ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    const-string v0, " 0 );"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    const-string v0, " END;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 705
    return-void
.end method

.method private r(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 625
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 626
    const-string v0, " CREATE TRIGGER message_update_conversation_on_insert AFTER INSERT ON "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    const-string v0, "t_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    const-string v0, " BEGIN UPDATE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    const-string v0, "t_conversation"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    const-string v0, " SET "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    const-string v0, "message_unread_number"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    const-string v0, " = (SELECT COUNT(*) FROM t_message WHERE user_id = NEW.user_id AND msg_status = 2 AND send_msg_status = 0 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    const-string v0, "unread_reffered_self_msg_number"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    const-string v0, " = (SELECT COUNT(*) FROM t_message WHERE user_id = NEW.user_id AND is_reffered_self = 1 AND msg_status = 2 AND send_msg_status = 0 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    const-string v0, "conversation_draft_message_text"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    const-string v0, "= (SELECT msg_content FROM t_message WHERE user_id = NEW.user_id AND msg_status = 3  order by _id desc  LIMIT 1 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    const-string v0, "last_message_sender_name"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    const-string v0, " =NEW.sender_name,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    const-string v0, "last_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    const-string v0, " =NEW.msg_content,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    const-string v0, "last_message_date"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    const-string v0, " = NEW.msg_date,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    const-string v0, "message_type"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    const-string v0, " = NEW.msg_content_type,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    const-string v0, "message_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    const-string v0, " = NEW.msg_status,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    const-string v0, "send_message_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    const-string v0, " = NEW.send_msg_status,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    const-string v0, "msg_id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    const-string v0, " = NEW.msg_id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    const-string v0, " WHERE user_id = NEW.user_id;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    const-string v0, " END;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 660
    return-void
.end method

.method private s(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 587
    const-string v0, "create table if not exists t_setting(setting_key text primary key,setting_value text )"

    .line 590
    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 591
    return-void
.end method

.method private t(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 600
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "Enter createTriggerForMessageTab "

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 602
    invoke-direct {p0, p1}, Lo/bbv;->r(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 605
    invoke-direct {p0, p1}, Lo/bbv;->q(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 608
    invoke-direct {p0, p1}, Lo/bbv;->u(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 611
    invoke-direct {p0, p1}, Lo/bbv;->v(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 614
    invoke-direct {p0, p1}, Lo/bbv;->x(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 615
    return-void
.end method

.method private u(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 715
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 716
    const-string v0, " CREATE TRIGGER message_update_conversation_on_delete AFTER DELETE ON "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    const-string v0, "t_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    const-string v0, " BEGIN UPDATE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    const-string v0, "t_conversation"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    const-string v0, " SET "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    const-string v0, "message_unread_number"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    const-string v0, " = (SELECT COUNT(*) FROM t_message WHERE user_id = OLD.user_id AND msg_status = 2 AND send_msg_status = 0 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    const-string v0, "unread_reffered_self_msg_number"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    const-string v0, " = (SELECT COUNT(*) FROM t_message WHERE user_id = OLD.user_id AND is_reffered_self = 1 AND msg_status = 2 AND send_msg_status = 0 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    const-string v0, "last_message_sender_name"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    const-string v0, "= (SELECT sender_name FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 733
    const-string v0, "conversation_draft_message_text"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    const-string v0, "= (SELECT msg_content FROM t_message WHERE user_id = OLD.user_id AND msg_status = 3  order by _id desc  LIMIT 1 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    const-string v0, "last_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    const-string v0, "= (SELECT msg_content FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1 ),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    const-string v0, "last_message_date"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    const-string v0, "= (SELECT msg_date FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    const-string v0, "message_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    const-string v0, " = (SELECT msg_status FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    const-string v0, "send_message_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    const-string v0, " = (SELECT send_msg_status FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    const-string v0, "message_type"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    const-string v0, "= (SELECT msg_content_type FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    const-string v0, " WHERE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    const-string v0, "user_id = OLD.user_id;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    const-string v0, " END;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 762
    return-void
.end method

.method private v(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 3

    .line 772
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 773
    const-string v0, " CREATE TRIGGER message_update_conversation_on_update AFTER UPDATE "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    const-string v0, " OF "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    const-string v0, "sender_name"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    const-string v0, "msg_status"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    const-string v0, " ON "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    const-string v0, "t_message"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    const-string v0, " BEGIN UPDATE "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    const-string v0, "t_conversation"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    const-string v0, " SET "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    const-string v0, "last_message_sender_name"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    const-string v0, "= (SELECT sender_name FROM t_message WHERE user_id = OLD.user_id order by _id desc  LIMIT 1 ),"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    const-string v0, "message_status = NEW.msg_status"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    const-string v0, " WHERE "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    const-string v0, "user_id = NEW.user_id AND last_message_date = NEW.msg_date;"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    const-string v0, " END;"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 793
    return-void
.end method

.method private w(Lnet/sqlcipher/database/SQLiteDatabase;)Z
    .locals 7

    .line 969
    if-nez p1, :cond_0

    .line 971
    const/4 v0, 0x0

    return v0

    .line 974
    :cond_0
    const/4 v2, 0x0

    .line 975
    const-string v3, "select count(*) from sqlite_master where type =\'table\' and name =\'t_message\';"

    .line 976
    const/4 v4, 0x0

    .line 979
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v3, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 980
    if-nez v4, :cond_2

    .line 982
    const/4 v5, 0x0

    .line 999
    if-eqz v4, :cond_1

    .line 1001
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->close()V

    .line 982
    :cond_1
    return v5

    .line 984
    :cond_2
    :try_start_1
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 986
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v5

    .line 987
    if-lez v5, :cond_3

    .line 989
    const/4 v2, 0x1

    .line 999
    :cond_3
    if-eqz v4, :cond_5

    .line 1001
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->close()V

    goto :goto_0

    .line 993
    :catch_0
    move-exception v5

    .line 995
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "query t_message is exist meet exception."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 999
    if-eqz v4, :cond_5

    .line 1001
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->close()V

    goto :goto_0

    .line 999
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_4

    .line 1001
    invoke-interface {v4}, Lnet/sqlcipher/Cursor;->close()V

    .line 1003
    :cond_4
    throw v6

    .line 1004
    :cond_5
    :goto_0
    return v2
.end method

.method private x(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 802
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 803
    const-string v0, " CREATE TRIGGER message_unread_update_conversation_on_update AFTER UPDATE OF "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    const-string v0, "send_msg_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    const-string v0, " ON "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    const-string v0, "t_message"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    const-string v0, " BEGIN UPDATE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    const-string v0, "t_conversation"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    const-string v0, " SET "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    const-string v0, "send_message_status = NEW.send_msg_status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    const-string v0, " WHERE "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    const-string v0, "user_id = NEW.user_id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    const-string v0, " AND "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    const-string v0, "NEW.msg_status = 1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    const-string v0, ";"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    const-string v0, " END;"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 818
    return-void
.end method

.method private y(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 3

    .line 1092
    if-eqz p1, :cond_0

    .line 1096
    :try_start_0
    invoke-virtual {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1101
    goto :goto_0

    .line 1098
    :catch_0
    move-exception v2

    .line 1100
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "closeDB meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1103
    :cond_0
    :goto_0
    return-void
.end method

.method private z(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    .line 827
    const-string v0, " DROP TRIGGER IF EXISTS message_update_conversation_on_insert "

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 828
    const-string v0, " DROP TRIGGER IF EXISTS message_insert_conversation_on_insert "

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 829
    const-string v0, " DROP TRIGGER IF EXISTS message_update_conversation_on_delete "

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 830
    const-string v0, " DROP TRIGGER IF EXISTS message_update_conversation_on_update "

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 831
    const-string v0, " DROP TRIGGER IF EXISTS message_unread_update_conversation_on_update "

    invoke-direct {p0, p1, v0}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 834
    invoke-direct {p0, p1}, Lo/bbv;->t(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 835
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 3

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sns_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-wide v1, Lo/bbv;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 1471
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "SNSSQLiteOpenHelper clearDB"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    sget-object v0, Lo/bbv;->c:Lo/bbv;

    invoke-virtual {v0}, Lo/bbv;->close()V

    .line 1473
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lo/bbv;->c(J)V

    .line 1474
    invoke-static {}, Lo/bbv;->a()V

    .line 1475
    return-void
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 2

    .line 843
    const-string v0, "SNSSQLiteOpenHelper"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 844
    invoke-direct {p0, p1}, Lo/bbv;->a(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 845
    invoke-direct {p0, p1}, Lo/bbv;->e(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 846
    invoke-direct {p0, p1}, Lo/bbv;->b(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 848
    invoke-direct {p0, p1}, Lo/bbv;->c(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 849
    invoke-direct {p0, p1}, Lo/bbv;->d(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 850
    invoke-direct {p0, p1}, Lo/bbv;->m(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 853
    invoke-direct {p0, p1}, Lo/bbv;->p(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 854
    invoke-direct {p0, p1}, Lo/bbv;->l(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 857
    invoke-direct {p0, p1}, Lo/bbv;->t(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 860
    invoke-direct {p0, p1}, Lo/bbv;->f(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 863
    invoke-direct {p0, p1}, Lo/bbv;->i(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 864
    invoke-direct {p0, p1}, Lo/bbv;->g(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 865
    invoke-direct {p0, p1}, Lo/bbv;->h(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 868
    invoke-direct {p0, p1}, Lo/bbv;->s(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 869
    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 3

    .line 1111
    const-string v0, "SNSSQLiteOpenHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onUpgrade:oldVersion"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",newVersion:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1112
    const/4 v0, 0x1

    if-gt p2, v0, :cond_0

    .line 1115
    invoke-direct {p0, p1}, Lo/bbv;->A(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1117
    :cond_0
    const/4 v0, 0x2

    if-gt p2, v0, :cond_1

    .line 1120
    invoke-direct {p0, p1}, Lo/bbv;->D(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1122
    :cond_1
    const/4 v0, 0x3

    if-gt p2, v0, :cond_2

    .line 1125
    invoke-direct {p0, p1}, Lo/bbv;->C(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1127
    :cond_2
    const/4 v0, 0x4

    if-gt p2, v0, :cond_3

    .line 1130
    invoke-direct {p0, p1}, Lo/bbv;->j(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1132
    :cond_3
    const/4 v0, 0x5

    if-gt p2, v0, :cond_4

    .line 1135
    invoke-direct {p0, p1}, Lo/bbv;->B(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1137
    :cond_4
    const/4 v0, 0x6

    if-gt p2, v0, :cond_5

    .line 1140
    invoke-direct {p0, p1}, Lo/bbv;->H(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1142
    :cond_5
    const/4 v0, 0x7

    if-gt p2, v0, :cond_6

    .line 1145
    invoke-direct {p0, p1}, Lo/bbv;->I(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1147
    :cond_6
    const/16 v0, 0x8

    if-gt p2, v0, :cond_7

    .line 1150
    invoke-direct {p0, p1}, Lo/bbv;->E(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1152
    :cond_7
    const/16 v0, 0x9

    if-gt p2, v0, :cond_8

    .line 1155
    invoke-direct {p0, p1}, Lo/bbv;->G(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1158
    :cond_8
    const/16 v0, 0xa

    if-gt p2, v0, :cond_9

    .line 1161
    invoke-direct {p0, p1}, Lo/bbv;->F(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1164
    :cond_9
    const/16 v0, 0xb

    if-gt p2, v0, :cond_a

    .line 1167
    invoke-direct {p0, p1}, Lo/bbv;->z(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 1169
    :cond_a
    return-void
.end method
