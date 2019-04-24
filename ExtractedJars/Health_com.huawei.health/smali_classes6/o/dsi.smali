.class public Lo/dsi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const/4 v0, 0x0

    sput-object v0, Lo/dsi;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 201
    const-string v1, ""

    .line 202
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 203
    :cond_0
    return-object v1

    .line 205
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/dsi;->a(Ljava/io/File;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    .line 206
    return-object v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 264
    :try_start_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 265
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 266
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lo/dsi;->d([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 271
    goto :goto_0

    .line 267
    :catch_0
    move-exception v2

    .line 268
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 271
    goto :goto_0

    .line 269
    :catch_1
    move-exception v2

    .line 270
    const-string v1, ""

    .line 272
    :goto_0
    return-object v1
.end method

.method private static a(Ljava/io/File;)Ljava/lang/StringBuffer;
    .locals 11

    .line 311
    const/4 v3, 0x0

    .line 312
    const/4 v4, 0x0

    .line 313
    const/4 v5, 0x0

    .line 314
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 316
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 317
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v3, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v4, v0

    .line 318
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v5, v0

    .line 319
    const/16 v0, 0x1000

    new-array v7, v0, [C

    .line 321
    :goto_0
    invoke-virtual {v5, v7}, Ljava/io/BufferedReader;->read([C)I

    move-result v8

    .line 322
    const/4 v0, -0x1

    if-ne v8, v0, :cond_0

    .line 323
    goto :goto_1

    .line 325
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v6, v7, v0, v8}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    goto :goto_0

    .line 337
    :goto_1
    if-eqz v3, :cond_1

    .line 338
    :try_start_1
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 342
    :cond_1
    goto :goto_2

    .line 340
    :catch_0
    move-exception v7

    .line 341
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally fis"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :goto_2
    if-eqz v4, :cond_2

    .line 345
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 349
    :cond_2
    goto :goto_3

    .line 347
    :catch_1
    move-exception v7

    .line 348
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally isr"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    :goto_3
    if-eqz v5, :cond_3

    .line 352
    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 356
    :cond_3
    goto/16 :goto_b

    .line 354
    :catch_2
    move-exception v7

    .line 355
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally br"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    goto/16 :goto_b

    .line 327
    :catch_3
    move-exception v7

    .line 328
    const-string v0, "EncryptFileUtils"

    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFileContent FileNotFoundException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 337
    if-eqz v3, :cond_4

    .line 338
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 342
    :cond_4
    goto :goto_4

    .line 340
    :catch_4
    move-exception v7

    .line 341
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally fis"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :goto_4
    if-eqz v4, :cond_5

    .line 345
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 349
    :cond_5
    goto :goto_5

    .line 347
    :catch_5
    move-exception v7

    .line 348
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally isr"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    :goto_5
    if-eqz v5, :cond_6

    .line 352
    :try_start_7
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 356
    :cond_6
    goto/16 :goto_b

    .line 354
    :catch_6
    move-exception v7

    .line 355
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally br"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    goto/16 :goto_b

    .line 329
    :catch_7
    move-exception v7

    .line 330
    const-string v0, "EncryptFileUtils"

    :try_start_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getFileContent IOException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 331
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v8

    .line 332
    if-eqz v8, :cond_7

    .line 333
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in EncryptFileUtils"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 337
    :cond_7
    if-eqz v3, :cond_8

    .line 338
    :try_start_9
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 342
    :cond_8
    goto :goto_6

    .line 340
    :catch_8
    move-exception v7

    .line 341
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally fis"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :goto_6
    if-eqz v4, :cond_9

    .line 345
    :try_start_a
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 349
    :cond_9
    goto :goto_7

    .line 347
    :catch_9
    move-exception v7

    .line 348
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally isr"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    :goto_7
    if-eqz v5, :cond_a

    .line 352
    :try_start_b
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 356
    :cond_a
    goto :goto_b

    .line 354
    :catch_a
    move-exception v7

    .line 355
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally br"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    goto :goto_b

    .line 336
    :catchall_0
    move-exception v9

    .line 337
    if-eqz v3, :cond_b

    .line 338
    :try_start_c
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 342
    :cond_b
    goto :goto_8

    .line 340
    :catch_b
    move-exception v10

    .line 341
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally fis"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :goto_8
    if-eqz v4, :cond_c

    .line 345
    :try_start_d
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_c

    .line 349
    :cond_c
    goto :goto_9

    .line 347
    :catch_c
    move-exception v10

    .line 348
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally isr"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    :goto_9
    if-eqz v5, :cond_d

    .line 352
    :try_start_e
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_d

    .line 356
    :cond_d
    goto :goto_a

    .line 354
    :catch_d
    move-exception v10

    .line 355
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException in finally br"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 356
    :goto_a
    throw v9

    .line 358
    :goto_b
    return-object v6
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 296
    new-instance v2, Ljava/io/OutputStreamWriter;

    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    const-string v1, "UTF-8"

    invoke-direct {v2, v0, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 298
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    :try_start_1
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 306
    goto :goto_1

    .line 304
    :catch_0
    move-exception v3

    .line 305
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException when close"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    goto :goto_1

    .line 299
    :catch_1
    move-exception v3

    .line 300
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException when write"

    :try_start_2
    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 303
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 306
    goto :goto_1

    .line 304
    :catch_2
    move-exception v3

    .line 305
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException when close"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    goto :goto_1

    .line 302
    :catchall_0
    move-exception v4

    .line 303
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 306
    goto :goto_0

    .line 304
    :catch_3
    move-exception v5

    .line 305
    const-string v0, "EncryptFileUtils"

    const-string v1, "IOException when close"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    :goto_0
    throw v4

    .line 308
    :goto_1
    return-void
.end method

.method private static b([CZ)[C
    .locals 7

    .line 127
    array-length v0, p0

    new-array v1, v0, [C

    .line 128
    if-eqz p1, :cond_1

    .line 129
    const/4 v2, 0x0

    .line 130
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-char v6, v3, v5

    .line 131
    add-int/lit8 v0, v6, 0x2

    int-to-char v0, v0

    aput-char v0, v1, v2

    .line 132
    add-int/lit8 v2, v2, 0x1

    .line 130
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 134
    :cond_0
    goto :goto_2

    .line 135
    :cond_1
    const/4 v2, 0x0

    .line 136
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-char v6, v3, v5

    .line 137
    add-int/lit8 v0, v6, -0x2

    int-to-char v0, v0

    aput-char v0, v1, v2

    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 136
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 141
    :cond_2
    :goto_2
    return-object v1
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)[I
    .locals 6

    .line 174
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 177
    :cond_0
    invoke-static {p1}, Lo/dsi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-static {p0, v1}, Lo/dsi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 179
    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 180
    array-length v0, v3

    if-gtz v0, :cond_1

    .line 181
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 183
    :cond_1
    array-length v0, v3

    new-array v4, v0, [I

    .line 185
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    array-length v0, v3

    if-ge v5, v0, :cond_2

    .line 186
    aget-object v0, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    aput v0, v4, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 190
    :cond_2
    goto :goto_1

    .line 188
    :catch_0
    move-exception v5

    .line 189
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 191
    :goto_1
    return-object v4
.end method

.method private static b(Ljava/lang/String;[I)[Ljava/lang/String;
    .locals 6

    .line 97
    array-length v0, p1

    new-array v2, v0, [Ljava/lang/String;

    .line 98
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 99
    :cond_0
    return-object v2

    .line 101
    :cond_1
    const/4 v3, 0x0

    .line 103
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    array-length v0, p1

    if-ge v4, v0, :cond_3

    .line 105
    array-length v0, p1

    div-int/lit8 v0, v0, 0x2

    if-ne v4, v0, :cond_2

    .line 106
    aget v0, p1, v4

    add-int/2addr v0, v3

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dsi;->b([CZ)[C

    move-result-object v5

    .line 107
    invoke-static {v5}, Ljava/lang/String;->copyValueOf([C)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v4

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    aget v0, p1, v4

    add-int/2addr v0, v3

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v4

    .line 111
    :goto_1
    aget v0, p1, v4
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v3, v0

    .line 103
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 115
    :cond_3
    goto :goto_2

    .line 113
    :catch_0
    move-exception v4

    .line 114
    return-object v2

    .line 116
    :goto_2
    return-object v2
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 236
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p0, :cond_1

    .line 237
    :cond_0
    const-string v0, ""

    return-object v0

    .line 239
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 258
    const-string v0, "SHA-256"

    invoke-static {p0, v0}, Lo/dsi;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 216
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p0, :cond_1

    .line 217
    :cond_0
    return-void

    .line 219
    :cond_1
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_2

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 222
    :try_start_0
    invoke-static {p0, v4}, Lo/dsi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aget-object v1, p1, v3

    invoke-static {v0, v1}, Lo/dsi;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    goto :goto_1

    .line 223
    :catch_0
    move-exception v5

    .line 224
    const-string v0, "EncryptFileUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveStrsToFile->saveStrs "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 227
    :cond_2
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 65
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, ""

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-static {p0, p1}, Lo/dsi;->b(Landroid/content/Context;Ljava/lang/String;)[I

    move-result-object v3

    .line 67
    array-length v0, v3

    if-gtz v0, :cond_0

    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 70
    :cond_0
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    array-length v6, v3

    .line 73
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 75
    invoke-static {p0, v4}, Lo/dsi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    const-string v0, ""

    return-object v0

    .line 79
    :cond_1
    div-int/lit8 v0, v6, 0x2

    if-ne v7, v0, :cond_2

    .line 80
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dsi;->b([CZ)[C

    move-result-object v8

    .line 81
    invoke-static {v8}, Ljava/lang/String;->copyValueOf([C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 73
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d([B)Ljava/lang/String;
    .locals 5

    .line 277
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_1

    .line 279
    aget-byte v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    .line 280
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 281
    const/16 v0, 0x30

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 285
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;[ILjava/lang/String;)V
    .locals 6

    .line 151
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    :cond_0
    return-void

    .line 154
    :cond_1
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, ""

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 155
    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_2

    .line 156
    aget v0, p1, v4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 157
    const-string v0, "/"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 155
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 159
    :cond_2
    invoke-static {p2}, Lo/dsi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 161
    :try_start_0
    invoke-static {p0, v4}, Lo/dsi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v3, v2, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsi;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_1

    .line 162
    :catch_0
    move-exception v5

    .line 163
    const-string v0, "EncryptFileUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveIndexFile->saveStrs "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    :goto_1
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 3

    .line 250
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 253
    :cond_1
    const/4 v0, 0x5

    new-array v2, v0, [I

    const/4 v0, 0x3

    const/4 v1, 0x0

    aput v0, v2, v1

    const/4 v0, 0x4

    const/4 v1, 0x1

    aput v0, v2, v1

    const/4 v0, 0x4

    const/4 v1, 0x2

    aput v0, v2, v1

    const/4 v0, 0x3

    const/4 v1, 0x3

    aput v0, v2, v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0xe

    const/4 v1, 0x4

    aput v0, v2, v1

    .line 254
    return-object v2
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 24
    sget-object v0, Lo/dsi;->a:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 25
    const/4 v1, 0x0

    .line 26
    const-string v0, "encodehwmultisim"

    invoke-static {p0, v0}, Lo/dsi;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    invoke-static {}, Lo/dsk;->b()[B

    move-result-object v3

    .line 29
    array-length v0, v3

    if-nez v0, :cond_0

    .line 30
    return-object v1

    .line 32
    :cond_0
    invoke-static {v3}, Lo/dsk;->a([B)Ljava/lang/String;

    move-result-object v1

    .line 33
    const-string v0, "encodehwmultisim"

    invoke-static {p0, v1, v0}, Lo/dsi;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    sput-object v1, Lo/dsi;->a:Ljava/lang/String;

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sput-object v2, Lo/dsi;->a:Ljava/lang/String;

    .line 39
    :cond_2
    :goto_0
    sget-object v0, Lo/dsi;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 49
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    return-void

    .line 52
    :cond_1
    invoke-static {p1, p2}, Lo/dsi;->d(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object v1

    .line 53
    invoke-static {p0, v1, p2}, Lo/dsi;->d(Landroid/content/Context;[ILjava/lang/String;)V

    .line 54
    invoke-static {p1, v1}, Lo/dsi;->b(Ljava/lang/String;[I)[Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-static {p0, v2, p2}, Lo/dsi;->c(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method
