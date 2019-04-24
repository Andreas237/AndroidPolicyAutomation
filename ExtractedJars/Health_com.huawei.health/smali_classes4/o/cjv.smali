.class public abstract Lo/cjv;
.super Ljava/lang/Object;


# static fields
.field private static e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cjv;->e:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 9

    invoke-static {p0, p2}, Lo/cjv;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lo/cjv;->e:Ljava/lang/Object;

    monitor-enter v4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v3, v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/cka;->e(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    :try_start_1
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v5

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when saveInfoToFile\'s FileOutputStream close"

    :try_start_2
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_1
    move-exception v5

    const-string v0, "StorageUtil"

    const-string v1, "saveInfoToFile(): is not found file"

    :try_start_3
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v3, :cond_1

    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catch_2
    move-exception v5

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when saveInfoToFile\'s FileOutputStream close"

    :try_start_5
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catch_3
    move-exception v5

    const-string v0, "StorageUtil"

    const-string v1, "saveInfoToFile(): IOException"

    :try_start_6
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v3, :cond_1

    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    :catch_4
    move-exception v5

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when saveInfoToFile\'s FileOutputStream close"

    :try_start_8
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v6

    if-eqz v3, :cond_0

    :try_start_9
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catch_5
    move-exception v7

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when saveInfoToFile\'s FileOutputStream close"

    :try_start_a
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    throw v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :cond_1
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v8

    monitor-exit v4

    throw v8

    :goto_2
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    sget-object v1, Lo/cjv;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p0, p1}, Lo/cjv;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hianalytics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 14

    const/4 v2, 0x0

    sget-object v3, Lo/cjv;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    invoke-static {p0, p1}, Lo/cjv;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v2, v0

    new-instance v4, Lo/cjk;

    const/16 v0, 0x800

    invoke-direct {v4, v0}, Lo/cjk;-><init>(I)V

    const/16 v0, 0x800

    new-array v5, v0, [B

    :goto_0
    invoke-virtual {v2, v5}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {v4, v5, v6}, Lo/cjk;->a([BI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lo/cjk;->d()I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    const/4 v7, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v8

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_2
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    :goto_1
    monitor-exit v3

    return-object v7

    :cond_2
    :try_start_3
    new-instance v7, Ljava/lang/String;

    invoke-virtual {v4}, Lo/cjk;->e()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v7, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-static {v7, p0}, Lo/cka;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v10

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_5
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_3
    :goto_2
    monitor-exit v3

    return-object v9

    :catch_2
    move-exception v4

    const-string v0, "StorageUtil"

    const-string v1, "getInfoFromFile(): is not found file"

    :try_start_6
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_3

    :catch_3
    move-exception v6

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_8
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_4
    :goto_3
    monitor-exit v3

    return-object v5

    :catch_4
    move-exception v4

    const-string v0, "StorageUtil"

    const-string v1, "getInfoFromFile(): IOException"

    :try_start_9
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_4

    :catch_5
    move-exception v6

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_b
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :cond_5
    :goto_4
    monitor-exit v3

    return-object v5

    :catch_6
    move-exception v4

    const-string v0, "StorageUtil"

    const-string v1, "getInfoFromFile(): JSONException"

    :try_start_c
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lo/cjv;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    :try_start_d
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_5

    :catch_7
    move-exception v6

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_e
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :cond_6
    :goto_5
    monitor-exit v3

    return-object v5

    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v2, :cond_7

    :try_start_f
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_6

    :catch_8
    move-exception v12

    const-string v0, "StorageUtil"

    const-string v1, "IOException happened when getInfoFromFile\'s FileOutputStream close"

    :try_start_10
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_6
    throw v11
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :catchall_1
    move-exception v13

    monitor-exit v3

    throw v13
.end method
