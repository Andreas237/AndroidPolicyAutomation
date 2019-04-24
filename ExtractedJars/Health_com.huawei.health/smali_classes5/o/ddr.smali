.class public Lo/ddr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;)J
    .locals 3

    .line 16
    invoke-static {p0}, Lo/ddr;->d(Ljava/lang/String;)[B

    move-result-object v2

    .line 17
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 18
    invoke-static {v2}, Lo/ddr;->b([B)J

    move-result-wide v0

    return-wide v0

    .line 20
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private static b([B)J
    .locals 7

    .line 57
    const-wide/16 v4, 0x0

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    aget-byte v1, p0, v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    aget-byte v1, p0, v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x5

    aget-byte v1, p0, v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    aget-byte v1, p0, v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 61
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x100

    add-long v4, v0, v2

    .line 63
    return-wide v4
.end method

.method private static d(Ljava/lang/String;)[B
    .locals 9

    .line 24
    const/4 v2, 0x0

    .line 25
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v4, v0

    .line 28
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 29
    new-array v2, v4, [B

    .line 30
    const/4 v5, 0x0

    .line 33
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 34
    invoke-virtual {v5, v2}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    if-gez v0, :cond_0

    .line 35
    const/4 v2, 0x0

    .line 37
    :cond_0
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 45
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    goto :goto_1

    .line 46
    :catch_0
    move-exception v6

    .line 48
    goto :goto_1

    .line 38
    :catch_1
    move-exception v6

    .line 43
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 45
    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 48
    goto :goto_1

    .line 46
    :catch_2
    move-exception v6

    .line 48
    goto :goto_1

    .line 40
    :catch_3
    move-exception v6

    .line 43
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 45
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 48
    goto :goto_1

    .line 46
    :catch_4
    move-exception v6

    .line 48
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 45
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 48
    goto :goto_0

    .line 46
    :catch_5
    move-exception v8

    .line 50
    :cond_1
    :goto_0
    throw v7

    .line 54
    :cond_2
    :goto_1
    return-object v2
.end method
