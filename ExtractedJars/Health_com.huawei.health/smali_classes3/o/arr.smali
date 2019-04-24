.class public Lo/arr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bqu;


# direct methods
.method public constructor <init>(Lo/bqu;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lo/arr;->a:Lo/bqu;

    .line 51
    return-void
.end method

.method private a(Ljava/io/File;)Z
    .locals 4

    .line 138
    const/4 v2, 0x0

    .line 141
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    const/4 v2, 0x1

    .line 149
    :cond_0
    goto :goto_0

    .line 146
    :catch_0
    move-exception v3

    .line 148
    const-string v0, "ComplainCompress"

    const-string v1, "createZipFile error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :goto_0
    return v2
.end method

.method private b(I)Z
    .locals 1

    .line 110
    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 113
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private c(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)I
    .locals 12

    .line 212
    const/4 v3, 0x0

    .line 214
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 216
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 218
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v5

    .line 219
    const-wide/16 v0, -0x2

    cmp-long v0, v5, v0

    if-nez v0, :cond_0

    .line 221
    const/4 v0, 0x3

    return v0

    .line 224
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gez v0, :cond_1

    .line 226
    const/4 v0, 0x2

    return v0

    .line 229
    :cond_1
    const/high16 v0, 0x80000

    new-array v7, v0, [B

    .line 230
    const/4 v8, 0x0

    .line 233
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/high16 v2, 0x80000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v8, v0

    .line 234
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-direct {v0, v4}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 236
    :goto_0
    invoke-virtual {v8, v7}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v9, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 238
    const/4 v0, 0x0

    invoke-virtual {p2, v7, v0, v9}, Ljava/util/zip/ZipOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 247
    :cond_2
    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 250
    :try_start_1
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 255
    goto :goto_1

    .line 252
    :catch_0
    move-exception v9

    .line 254
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    :goto_1
    :try_start_2
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 263
    goto :goto_5

    .line 260
    :catch_1
    move-exception v9

    .line 262
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    goto :goto_5

    .line 241
    :catch_2
    move-exception v9

    .line 243
    const/4 v3, 0x3

    .line 247
    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 250
    :try_start_3
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->flush()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 255
    goto :goto_2

    .line 252
    :catch_3
    move-exception v9

    .line 254
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    :goto_2
    :try_start_4
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 263
    goto :goto_5

    .line 260
    :catch_4
    move-exception v9

    .line 262
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    goto :goto_5

    .line 247
    :catchall_0
    move-exception v10

    invoke-static {v8}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 250
    :try_start_5
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->flush()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    .line 255
    goto :goto_3

    .line 252
    :catch_5
    move-exception v11

    .line 254
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    :goto_3
    :try_start_6
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 263
    goto :goto_4

    .line 260
    :catch_6
    move-exception v11

    .line 262
    const-string v0, "ComplainCompress"

    const-string v1, "zipFile fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    :goto_4
    throw v10

    .line 266
    :cond_3
    :goto_5
    return v3
.end method

.method private d()Ljava/io/File;
    .locals 3

    .line 125
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->g()Ljava/lang/String;

    move-result-object v1

    .line 126
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 127
    return-object v2
.end method

.method private e([Ljava/io/File;Ljava/io/File;)I
    .locals 14

    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    array-length v6, p1

    .line 166
    const/16 v0, 0xa

    div-int v7, v0, v6

    .line 169
    const/4 v8, 0x0

    .line 170
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/high16 v3, 0x80000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 171
    move-object v9, p1

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    .line 173
    invoke-direct {p0, v12, v5}, Lo/arr;->c(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)I

    move-result v4

    .line 174
    add-int/2addr v8, v7

    .line 175
    iget-object v0, p0, Lo/arr;->a:Lo/bqu;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/arr;->a:Lo/bqu;

    invoke-interface {v0, v8}, Lo/bqu;->d(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :cond_0
    if-eqz v4, :cond_1

    .line 181
    goto :goto_1

    .line 171
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 191
    :cond_2
    :goto_1
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 192
    goto :goto_2

    .line 185
    :catch_0
    move-exception v8

    .line 187
    const/4 v4, 0x3

    .line 191
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 192
    goto :goto_2

    .line 191
    :catchall_0
    move-exception v13

    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 192
    throw v13

    .line 194
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0x1900000

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 196
    const/4 v4, 0x4

    .line 199
    :cond_3
    return v4
.end method


# virtual methods
.method public e()I
    .locals 8

    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->f()Ljava/lang/String;

    move-result-object v3

    .line 62
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Lo/arr;->d()Ljava/io/File;

    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v6

    .line 69
    if-nez v6, :cond_0

    .line 71
    const-string v0, "ComplainCompress"

    const-string v1, "1 delete zip file false"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    .line 77
    if-eqz v6, :cond_1

    array-length v0, v6

    if-nez v0, :cond_2

    .line 79
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 82
    :cond_2
    invoke-direct {p0}, Lo/arr;->d()Ljava/io/File;

    move-result-object v5

    .line 84
    invoke-direct {p0, v5}, Lo/arr;->a(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 86
    const/4 v0, 0x6

    return v0

    .line 88
    :cond_3
    invoke-direct {p0, v6, v5}, Lo/arr;->e([Ljava/io/File;Ljava/io/File;)I

    move-result v2

    .line 91
    invoke-direct {p0, v2}, Lo/arr;->b(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 93
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v7

    .line 94
    if-nez v7, :cond_4

    .line 96
    const-string v0, "ComplainCompress"

    const-string v1, "2 delete zip file false"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :cond_4
    return v2
.end method
