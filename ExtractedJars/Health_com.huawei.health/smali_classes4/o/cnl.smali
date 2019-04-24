.class public Lo/cnl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 57
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 58
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    const/4 v5, 0x0

    .line 63
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v5, v0

    .line 65
    const/16 v0, 0x400

    new-array v7, v0, [B

    .line 66
    :goto_0
    invoke-virtual {v5, v7}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 68
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    const/4 v2, 0x0

    invoke-direct {v0, v7, v2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 77
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    goto/16 :goto_2

    .line 78
    :catch_0
    move-exception v6

    .line 79
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    goto :goto_2

    .line 71
    :catch_1
    move-exception v6

    .line 72
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 77
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 80
    goto :goto_2

    .line 78
    :catch_2
    move-exception v6

    .line 79
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    goto :goto_2

    .line 75
    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 77
    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 80
    goto :goto_1

    .line 78
    :catch_3
    move-exception v9

    .line 79
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readFiletoData final IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :cond_3
    :goto_1
    throw v8

    .line 83
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    .line 27
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 28
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 30
    :cond_1
    const/4 v4, 0x0

    .line 32
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v4, v0

    .line 33
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 34
    invoke-virtual {v4, v5}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 43
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    goto/16 :goto_3

    .line 45
    :catch_0
    move-exception v5

    .line 46
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToFile fout close error = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    goto/16 :goto_3

    .line 35
    :catch_1
    move-exception v5

    .line 36
    const/4 v6, 0x0

    .line 41
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 43
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 47
    goto :goto_0

    .line 45
    :catch_2
    move-exception v7

    .line 46
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToFile fout close error = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    :cond_2
    :goto_0
    return v6

    .line 37
    :catch_3
    move-exception v5

    .line 38
    const/4 v6, 0x0

    .line 41
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 43
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 47
    goto :goto_1

    .line 45
    :catch_4
    move-exception v7

    .line 46
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToFile fout close error = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    :cond_3
    :goto_1
    return v6

    .line 41
    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 43
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 47
    goto :goto_2

    .line 45
    :catch_5
    move-exception v9

    .line 46
    const-string v0, "Debug_HiFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToFile fout close error = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    :cond_4
    :goto_2
    throw v8

    .line 50
    :cond_5
    :goto_3
    const/4 v0, 0x1

    return v0
.end method
