.class public abstract Lo/xs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 15

    .line 73
    new-instance v4, Ljava/lang/StringBuffer;

    const-string v0, ""

    invoke-direct {v4, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 74
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    :try_start_0
    invoke-static {p0}, Lo/xq;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v6

    .line 78
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, v6, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v0

    .line 79
    const/4 v7, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 80
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 81
    const/16 v0, 0x41

    if-lt v8, v0, :cond_0

    const/16 v0, 0x5a

    if-gt v8, v0, :cond_0

    .line 82
    add-int/lit8 v0, v8, 0x20

    int-to-char v0, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 83
    goto/16 :goto_1

    .line 85
    :cond_0
    const/16 v0, 0x61

    if-lt v8, v0, :cond_1

    const/16 v0, 0x7a

    if-gt v8, v0, :cond_1

    .line 86
    invoke-virtual {v4, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 87
    goto :goto_1

    .line 89
    :cond_1
    const/16 v0, 0x3007

    if-ne v8, v0, :cond_2

    .line 90
    const-string v0, "ling"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 91
    :cond_2
    const/16 v0, 0x4e00

    if-lt v8, v0, :cond_4

    const v0, 0x9fa5

    if-gt v8, v0, :cond_4

    .line 92
    add-int/lit16 v0, v8, -0x4e00

    mul-int/lit8 v0, v0, 0x6

    int-to-long v9, v0

    .line 93
    invoke-virtual {v5, v9, v10}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 94
    const/4 v0, 0x6

    new-array v11, v0, [B

    .line 96
    invoke-virtual {v5, v11}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v12

    .line 97
    if-lez v12, :cond_3

    .line 98
    const-string v0, "PinyinUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "res:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v11, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 109
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    :try_start_1
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    :cond_6
    goto/16 :goto_3

    .line 110
    :catch_0
    move-exception v6

    .line 111
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto/16 :goto_3

    .line 103
    :catch_1
    move-exception v6

    .line 104
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    :try_start_3
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 112
    :cond_7
    goto/16 :goto_3

    .line 110
    :catch_2
    move-exception v6

    .line 111
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto :goto_3

    .line 105
    :catch_3
    move-exception v6

    .line 106
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    :try_start_5
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 112
    :cond_8
    goto :goto_3

    .line 110
    :catch_4
    move-exception v6

    .line 111
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto :goto_3

    .line 108
    :catchall_0
    move-exception v13

    .line 109
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    :try_start_6
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 112
    :cond_9
    goto :goto_2

    .line 110
    :catch_5
    move-exception v14

    .line 111
    const-string v0, "PinyinUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v14}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    :goto_2
    throw v13

    .line 114
    :goto_3
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
