.class public Lo/eax;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/eax;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/eax;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eax;->d:Landroid/content/Context;

    .line 36
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 133
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 135
    const-string v0, "fileId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    const-string v0, "ver"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    goto :goto_0

    .line 137
    :catch_0
    move-exception v5

    .line 138
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
    .locals 9

    .line 164
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    new-instance v7, Lo/eax$1;

    move-object/from16 v8, p7

    invoke-direct {v7, p0, v8}, Lo/eax$1;-><init>(Lo/eax;Lo/eaz;)V

    invoke-direct/range {v0 .. v7}, Lo/eax;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V

    .line 178
    return-void
.end method

.method public static b()Lo/eax;
    .locals 4

    .line 39
    sget-object v2, Lo/eax;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 40
    :try_start_0
    sget-object v0, Lo/eax;->a:Lo/eax;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 41
    new-instance v0, Lo/eax;

    invoke-direct {v0}, Lo/eax;-><init>()V

    sput-object v0, Lo/eax;->a:Lo/eax;

    .line 43
    :cond_0
    sget-object v0, Lo/eax;->a:Lo/eax;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 44
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private b(Ljava/lang/String;Lo/eaz;Lo/eay;Lo/eba;)V
    .locals 13

    .line 265
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter create done file,path is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    const/4 v4, 0x0

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "done"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 269
    :try_start_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 270
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    invoke-virtual {v6}, Ljava/io/File;->mkdir()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 272
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file_mkdir is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 275
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 276
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file_create is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    :cond_1
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 279
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 280
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timeStamp is ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 283
    const-string v0, "UTF-8"

    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v9

    .line 284
    array-length v10, v9

    .line 285
    const/4 v0, 0x0

    invoke-virtual {v4, v9, v0, v10}, Ljava/io/FileOutputStream;->write([BII)V

    .line 286
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 287
    move-object/from16 v0, p3

    move-object/from16 v1, p4

    invoke-interface {p2, v0, v1}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 298
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 301
    goto/16 :goto_1

    .line 299
    :catch_0
    move-exception v6

    .line 300
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeFileOutputStream IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    goto/16 :goto_1

    .line 289
    :catch_1
    move-exception v6

    .line 290
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "creatrDoneFile  IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    const/4 v0, -0x1

    move-object/from16 v1, p4

    iput v0, v1, Lo/eba;->c:I

    .line 292
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 293
    move-object/from16 v0, p3

    move-object/from16 v1, p4

    invoke-interface {p2, v0, v1}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 296
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 298
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 301
    goto :goto_1

    .line 299
    :catch_2
    move-exception v6

    .line 300
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeFileOutputStream IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    goto :goto_1

    .line 296
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 298
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 301
    goto :goto_0

    .line 299
    :catch_3
    move-exception v12

    .line 300
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeFileOutputStream IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :cond_4
    :goto_0
    throw v11

    .line 304
    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/eax;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/eax;->d:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
    .locals 6

    .line 55
    new-instance v4, Lo/eay;

    invoke-direct {v4}, Lo/eay;-><init>()V

    .line 56
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lo/eax;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p4

    :goto_0
    invoke-virtual {v4, v0}, Lo/eay;->d(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p6}, Lo/eav;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eay;->a(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v4, p3}, Lo/eay;->e(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v4, p5}, Lo/eay;->k(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v4, p7}, Lo/eay;->a(Lo/eaz;)V

    .line 61
    iget-object v0, p0, Lo/eax;->d:Landroid/content/Context;

    invoke-virtual {p6}, Lo/eav;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/eay;->b(I)V

    .line 62
    invoke-virtual {p6}, Lo/eav;->e()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/eay;->d(I)V

    .line 63
    invoke-direct {p0, p2}, Lo/eax;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eay;->c(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v4, p1}, Lo/eay;->b(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v4, p2}, Lo/eay;->h(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lo/eax;->d()J

    move-result-wide v0

    invoke-virtual {p6}, Lo/eav;->e()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 67
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pull plugin task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ebb;->d(Lo/eay;)V

    goto :goto_1

    .line 70
    :cond_1
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this torage is not enough"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    new-instance v5, Lo/eba;

    invoke-direct {v5}, Lo/eba;-><init>()V

    .line 72
    const/16 v0, -0x9

    iput v0, v5, Lo/eba;->c:I

    .line 73
    invoke-interface {p7, v4, v5}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 75
    :goto_1
    return-void
.end method

.method public static d()J
    .locals 7

    .line 312
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v4

    .line 313
    const-string v0, "mounted"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    .line 316
    new-instance v6, Landroid/os/StatFs;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 317
    invoke-virtual {v6}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v0

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSizeLong()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    mul-long/2addr v0, v2

    return-wide v0

    .line 318
    :catch_0
    move-exception v5

    .line 319
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAvailCount Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const-wide/16 v0, -0x1

    return-wide v0

    .line 323
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 223
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter readFileToData: filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 225
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 229
    const/4 v6, 0x0

    .line 231
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 233
    const/16 v0, 0x400

    new-array v8, v0, [B

    .line 234
    :goto_0
    invoke-virtual {v6, v8}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 235
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    const/4 v2, 0x0

    invoke-direct {v0, v8, v2, v7, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 241
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 243
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 246
    goto/16 :goto_2

    .line 244
    :catch_0
    move-exception v7

    .line 245
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    goto :goto_2

    .line 238
    :catch_1
    move-exception v7

    .line 239
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 243
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 246
    goto :goto_2

    .line 244
    :catch_2
    move-exception v7

    .line 245
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    goto :goto_2

    .line 241
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 243
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 246
    goto :goto_1

    .line 244
    :catch_3
    move-exception v10

    .line 245
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :cond_3
    :goto_1
    throw v9

    .line 249
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
    .locals 6

    .line 118
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pull descrption task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    new-instance v4, Lo/eay;

    invoke-direct {v4}, Lo/eay;-><init>()V

    .line 120
    invoke-virtual {v4, p3}, Lo/eay;->d(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v4, p2}, Lo/eay;->e(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v4, p4}, Lo/eay;->k(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v4, p5}, Lo/eay;->a(Lo/eaz;)V

    .line 124
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/eay;->b(I)V

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_description"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 127
    invoke-virtual {v4, v5}, Lo/eay;->h(Ljava/lang/String;)V

    .line 128
    invoke-direct {p0, v5}, Lo/eax;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eay;->c(Ljava/lang/String;)V

    .line 129
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ebb;->d(Lo/eay;)V

    .line 130
    return-void
.end method

.method static synthetic d(Lo/eax;Ljava/lang/String;Lo/eaz;Lo/eay;Lo/eba;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eax;->b(Ljava/lang/String;Lo/eaz;Lo/eay;Lo/eba;)V

    return-void
.end method

.method static synthetic e(Lo/eax;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 26
    invoke-direct {p0, p1, p2}, Lo/eax;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
    .locals 5

    .line 96
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pull json task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    new-instance v4, Lo/eay;

    invoke-direct {v4}, Lo/eay;-><init>()V

    .line 98
    invoke-virtual {v4, p3}, Lo/eay;->d(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v4, p2}, Lo/eay;->e(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v4, p4}, Lo/eay;->k(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v4, p5}, Lo/eay;->a(Lo/eaz;)V

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/eay;->b(I)V

    .line 104
    invoke-direct {p0, p1}, Lo/eax;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eay;->c(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v4, p1}, Lo/eay;->h(Ljava/lang/String;)V

    .line 106
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ebb;->d(Lo/eay;)V

    .line 107
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
    .locals 8

    .line 147
    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Lo/eax;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V

    .line 148
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
    .locals 8

    .line 151
    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lo/eax;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V

    .line 152
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
    .locals 6

    .line 194
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    new-instance v5, Lo/eax$2;

    invoke-direct {v5, p0, p3, p5}, Lo/eax$2;-><init>(Lo/eax;Ljava/lang/String;Lo/eaz;)V

    invoke-direct/range {v0 .. v5}, Lo/eax;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V

    .line 217
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
    .locals 6

    .line 89
    move-object v0, p0

    const-string v1, "plugin_index"

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/eax;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V

    .line 90
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/eas;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V
    .locals 7

    .line 184
    const-string v0, "EzPlugin_EzPluginPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eneter downlodDescription"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/eas;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "description"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".json"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 187
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v6

    move-object v5, p3

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/eax;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eaz;)V

    .line 188
    return-void
.end method

.method public d(Lo/eay;)V
    .locals 1

    .line 79
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ebb;->b(Lo/eay;)V

    .line 80
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V
    .locals 8

    .line 159
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual {p0, p1}, Lo/eax;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lo/eax;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eav;Lo/eaz;)V

    .line 160
    return-void
.end method
