.class public Lcom/huawei/hwid/core/d/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/core/d/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const-class v10, Lcom/huawei/hwid/core/d/a/b;

    monitor-enter v10

    .line 79
    const/4 v2, 0x0

    .line 80
    const/4 v3, 0x0

    .line 82
    :try_start_0
    new-instance v4, Ljava/util/Properties;

    invoke-direct {v4}, Ljava/util/Properties;-><init>()V

    .line 83
    new-instance v5, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "settings.properties"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    const-string v0, "PropertiesGrade"

    const-string v1, "getOldProperties file not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "settings.properties"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v3, v0

    .line 88
    :cond_0
    const-string v0, "settings.properties"

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v2, v0

    .line 89
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 90
    invoke-virtual {v4, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    goto :goto_0

    .line 92
    :cond_1
    const-string v0, "PropertiesGrade"

    const-string v1, "getOldProperties inStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    invoke-virtual {v4, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 105
    :try_start_1
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    :cond_2
    goto :goto_1

    .line 107
    :catch_0
    move-exception v7

    .line 108
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException "

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 112
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 116
    :cond_3
    goto :goto_2

    .line 114
    :catch_1
    move-exception v7

    .line 115
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 95
    :goto_2
    monitor-exit v10

    return-object v6

    .line 96
    :catch_2
    move-exception v4

    .line 97
    const-string v0, "PropertiesGrade"

    const-string v1, "Can not find the file settings.properties"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 105
    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 109
    :cond_4
    goto :goto_3

    .line 107
    :catch_3
    move-exception v4

    .line 108
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException "

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 111
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 112
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 116
    :cond_5
    goto/16 :goto_8

    .line 114
    :catch_4
    move-exception v4

    .line 115
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_9
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 117
    goto/16 :goto_8

    .line 98
    :catch_5
    move-exception v4

    .line 99
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_6

    .line 105
    :try_start_b
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 109
    :cond_6
    goto :goto_4

    .line 107
    :catch_6
    move-exception v4

    .line 108
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException "

    :try_start_c
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 111
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v2, :cond_7

    .line 112
    :try_start_d
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 116
    :cond_7
    goto :goto_8

    .line 114
    :catch_7
    move-exception v4

    .line 115
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_e
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 117
    goto :goto_8

    .line 100
    :catch_8
    move-exception v4

    .line 101
    const-string v0, "PropertiesGrade"

    const-string v1, "Throwable "

    :try_start_f
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_8

    .line 105
    :try_start_10
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 109
    :cond_8
    goto :goto_5

    .line 107
    :catch_9
    move-exception v4

    .line 108
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException "

    :try_start_11
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 111
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v2, :cond_9

    .line 112
    :try_start_12
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_a
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 116
    :cond_9
    goto :goto_8

    .line 114
    :catch_a
    move-exception v4

    .line 115
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_13
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 117
    goto :goto_8

    .line 103
    :catchall_0
    move-exception v8

    .line 104
    const/4 v0, 0x0

    if-eq v0, v3, :cond_a

    .line 105
    :try_start_14
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_b
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 109
    :cond_a
    goto :goto_6

    .line 107
    :catch_b
    move-exception v9

    .line 108
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException "

    :try_start_15
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 111
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v2, :cond_b

    .line 112
    :try_start_16
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_c
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 116
    :cond_b
    goto :goto_7

    .line 114
    :catch_c
    move-exception v9

    .line 115
    const-string v0, "PropertiesGrade"

    const-string v1, "IOException  "

    :try_start_17
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_7
    throw v8
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 119
    :goto_8
    const-string v0, ""

    monitor-exit v10

    return-object v0

    :catchall_1
    move-exception p0

    monitor-exit v10

    throw p0
.end method

.method private a(Landroid/content/Context;I)V
    .locals 5

    .line 52
    const-string v0, "PropertiesGrade"

    const-string v1, "begin update curName in settings.properties"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "curName"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/a/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 54
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "curName"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 56
    const-string v0, "isSDKAccountDataEncrypted"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v4

    .line 57
    if-eqz v4, :cond_0

    .line 59
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "isSDKAccountDataEncrypted"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 60
    invoke-static {p1, v3}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 62
    :cond_0
    const/4 v0, 0x3

    if-ge p2, v0, :cond_1

    .line 63
    invoke-static {p1, v3}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 66
    :cond_1
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    const-string v0, "PropertiesGrade"

    const-string v1, "update curName in settings.properties"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, "curName"

    invoke-static {p1, v0, v3}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 70
    :cond_2
    const-string v0, "PropertiesGrade"

    const-string v1, "curName ecb decrypt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :goto_1
    goto :goto_2

    .line 73
    :cond_3
    const-string v0, "PropertiesGrade"

    const-string v1, "curName is null in settings.properties"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;II)V
    .locals 2

    .line 28
    if-lt p2, p3, :cond_0

    .line 29
    const-string v0, "PropertiesGrade"

    const-string v1, "newVersion is less then oldVersion, onUpgrade error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    return-void

    .line 34
    :cond_0
    const-string v0, "PropertiesGrade"

    const-string v1, "update settings.properties when version update"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/core/d/a/b;->a(Landroid/content/Context;I)V

    .line 36
    return-void
.end method
