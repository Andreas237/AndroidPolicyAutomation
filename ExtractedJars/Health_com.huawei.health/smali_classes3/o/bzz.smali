.class public Lo/bzz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Ljava/io/File;)Z
    .locals 3

    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 72
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    .line 73
    if-nez v2, :cond_0

    .line 74
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    .line 77
    :cond_0
    return v2
.end method

.method public static c(Ljava/io/File;Ljava/io/File;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19
    invoke-static {p1}, Lo/bzz;->c(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-static {p0, p1}, Lo/bzz;->d(Ljava/io/File;Ljava/io/File;)Z

    move-result v0

    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/io/File;Ljava/io/File;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    const/high16 v4, 0x200000

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 31
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 32
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 33
    new-array v7, v4, [B

    .line 34
    invoke-virtual {v5, v7}, Ljava/io/FileInputStream;->read([B)I

    move-result v8

    .line 35
    :goto_0
    const/4 v0, -0x1

    if-eq v8, v0, :cond_0

    .line 36
    const/4 v0, 0x0

    invoke-virtual {v6, v7, v0, v8}, Ljava/io/FileOutputStream;->write([BII)V

    .line 37
    invoke-virtual {v5, v7}, Ljava/io/FileInputStream;->read([B)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    goto :goto_0

    .line 41
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 42
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    :cond_1
    goto :goto_1

    .line 44
    :catch_0
    move-exception v7

    .line 45
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in.close() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 50
    :try_start_2
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 54
    :cond_2
    goto :goto_2

    .line 52
    :catch_1
    move-exception v7

    .line 53
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out.flush() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 58
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 62
    :cond_3
    goto/16 :goto_6

    .line 60
    :catch_2
    move-exception v7

    .line 61
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out.close() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    goto :goto_6

    .line 40
    :catchall_0
    move-exception v9

    .line 41
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 42
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 46
    :cond_4
    goto :goto_3

    .line 44
    :catch_3
    move-exception v10

    .line 45
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in.close() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 50
    :try_start_5
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 54
    :cond_5
    goto :goto_4

    .line 52
    :catch_4
    move-exception v10

    .line 53
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out.flush() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 58
    :try_start_6
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 62
    :cond_6
    goto :goto_5

    .line 60
    :catch_5
    move-exception v10

    .line 61
    const-string v0, "FileMoveUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out.close() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    :goto_5
    throw v9

    .line 65
    :goto_6
    const/4 v0, 0x1

    return v0
.end method
