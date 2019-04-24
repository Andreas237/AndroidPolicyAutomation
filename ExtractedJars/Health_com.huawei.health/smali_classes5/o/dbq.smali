.class public Lo/dbq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 1

    .line 59
    const-string v0, "/system/xbin/su"

    return-object v0
.end method

.method public static b()Z
    .locals 2

    .line 29
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lo/dbq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    const/4 v0, 0x1

    return v0

    .line 34
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lo/dbq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/dbq;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    const/4 v0, 0x1

    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static c()Ljava/lang/String;
    .locals 1

    .line 49
    const-string v0, "/system/bin/su"

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 13

    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/16 v0, 0xa

    new-array v8, v0, [C

    .line 77
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ls -l "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    move-object v4, v0

    .line 79
    invoke-virtual {v4}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 80
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v6, v0

    .line 81
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v7, v0

    .line 84
    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {v7, v8, v0, v1}, Ljava/io/BufferedReader;->read([CII)I

    move-result v9

    .line 85
    const/4 v0, 0x4

    if-lt v9, v0, :cond_2

    .line 87
    const/4 v0, 0x3

    aget-char v10, v8, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    const/16 v0, 0x73

    if-eq v10, v0, :cond_0

    const/16 v0, 0x78

    if-ne v10, v0, :cond_2

    .line 89
    :cond_0
    const/4 v11, 0x1

    .line 99
    const/4 v8, 0x0

    .line 100
    invoke-static {v5}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 101
    invoke-static {v6}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 102
    invoke-static {v7}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 104
    if-eqz v4, :cond_1

    .line 106
    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V

    .line 89
    :cond_1
    return v11

    .line 99
    :cond_2
    const/4 v8, 0x0

    .line 100
    invoke-static {v5}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 101
    invoke-static {v6}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 102
    invoke-static {v7}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 104
    if-eqz v4, :cond_4

    .line 106
    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V

    goto :goto_0

    .line 92
    :catch_0
    move-exception v9

    .line 94
    const-string v0, "IOException"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    const/4 v8, 0x0

    .line 100
    invoke-static {v5}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 101
    invoke-static {v6}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 102
    invoke-static {v7}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 104
    if-eqz v4, :cond_4

    .line 106
    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V

    goto :goto_0

    .line 99
    :catchall_0
    move-exception v12

    const/4 v8, 0x0

    .line 100
    invoke-static {v5}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 101
    invoke-static {v6}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 102
    invoke-static {v7}, Lo/cwt;->c(Ljava/io/Reader;)V

    .line 104
    if-eqz v4, :cond_3

    .line 106
    invoke-virtual {v4}, Ljava/lang/Process;->destroy()V

    .line 108
    :cond_3
    throw v12

    .line 109
    :cond_4
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
