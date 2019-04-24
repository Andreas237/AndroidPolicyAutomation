.class public Lorg/apache/commons/io/IOUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_BUFFER_SIZE:I = 0x1000

.field public static final DIR_SEPARATOR:C

.field public static final DIR_SEPARATOR_UNIX:C = '/'

.field public static final DIR_SEPARATOR_WINDOWS:C = '\\'

.field public static final EOF:I = -0x1

.field public static final LINE_SEPARATOR:Ljava/lang/String;

.field public static final LINE_SEPARATOR_UNIX:Ljava/lang/String; = "\n"

.field public static final LINE_SEPARATOR_WINDOWS:Ljava/lang/String; = "\r\n"

.field private static final SKIP_BUFFER_SIZE:I = 0x800

.field private static SKIP_BYTE_BUFFER:[B = null

.field private static SKIP_CHAR_BUFFER:[C = null


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 121
    sget-char v0, Ljava/io/File;->separatorChar:C

    sput-char v0, Lorg/apache/commons/io/IOUtils;->DIR_SEPARATOR:C

    .line 137
    new-instance v1, Lorg/apache/commons/io/output/StringBuilderWriter;

    const/4 v0, 0x4

    invoke-direct {v1, v0}, Lorg/apache/commons/io/output/StringBuilderWriter;-><init>(I)V

    const/4 v2, 0x0

    .line 138
    :try_start_0
    new-instance v3, Ljava/io/PrintWriter;

    invoke-direct {v3, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 137
    const/4 v4, 0x0

    .line 139
    :try_start_1
    invoke-virtual {v3}, Ljava/io/PrintWriter;->println()V

    .line 140
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/IOUtils;->LINE_SEPARATOR:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    if-eqz v3, :cond_2

    nop

    :try_start_2
    invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 137
    :catch_0
    move-exception v5

    move-object v4, v5

    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_1

    if-eqz v4, :cond_0

    :try_start_4
    invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catch_1
    move-exception v7

    :try_start_5
    invoke-virtual {v4, v7}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V

    :cond_1
    :goto_0
    throw v6
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_2
    :goto_1
    if-eqz v1, :cond_5

    nop

    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    goto :goto_3

    .line 137
    :catch_2
    move-exception v3

    move-object v2, v3

    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 141
    :catchall_1
    move-exception v8

    if-eqz v1, :cond_4

    if-eqz v2, :cond_3

    :try_start_7
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_2

    :catch_3
    move-exception v9

    invoke-virtual {v2, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    :cond_4
    :goto_2
    throw v8

    .line 142
    :cond_5
    :goto_3
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    return-void
.end method

.method public static buffer(Ljava/io/InputStream;)Ljava/io/BufferedInputStream;
    .locals 1

    .line 723
    if-nez p0, :cond_0

    .line 724
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 726
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/InputStream;I)Ljava/io/BufferedInputStream;
    .locals 1

    .line 742
    if-nez p0, :cond_0

    .line 743
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 745
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/OutputStream;)Ljava/io/BufferedOutputStream;
    .locals 1

    .line 686
    if-nez p0, :cond_0

    .line 687
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 689
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedOutputStream;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/OutputStream;I)Ljava/io/BufferedOutputStream;
    .locals 1

    .line 705
    if-nez p0, :cond_0

    .line 706
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 708
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedOutputStream;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/Reader;)Ljava/io/BufferedReader;
    .locals 1

    .line 631
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/Reader;I)Ljava/io/BufferedReader;
    .locals 1

    .line 645
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/Writer;)Ljava/io/BufferedWriter;
    .locals 1

    .line 658
    instance-of v0, p0, Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedWriter;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, p0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    :goto_0
    return-object v0
.end method

.method public static buffer(Ljava/io/Writer;I)Ljava/io/BufferedWriter;
    .locals 1

    .line 672
    instance-of v0, p0, Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedWriter;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    :goto_0
    return-object v0
.end method

.method public static close(Ljava/net/URLConnection;)V
    .locals 1

    .line 187
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 188
    move-object v0, p0

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 190
    :cond_0
    return-void
.end method

.method public static closeQuietly(Ljava/io/Closeable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 362
    if-eqz p0, :cond_0

    .line 363
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    :cond_0
    goto :goto_0

    .line 365
    :catch_0
    move-exception v0

    .line 368
    :goto_0
    return-void
.end method

.method public static closeQuietly(Ljava/io/InputStream;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 284
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 285
    return-void
.end method

.method public static closeQuietly(Ljava/io/OutputStream;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 317
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 318
    return-void
.end method

.method public static closeQuietly(Ljava/io/Reader;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 221
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 222
    return-void
.end method

.method public static closeQuietly(Ljava/io/Writer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 252
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 253
    return-void
.end method

.method public static closeQuietly(Ljava/net/ServerSocket;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 532
    if-eqz p0, :cond_0

    .line 534
    :try_start_0
    invoke-virtual {p0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 537
    goto :goto_0

    .line 535
    :catch_0
    move-exception v0

    .line 539
    :cond_0
    :goto_0
    return-void
.end method

.method public static closeQuietly(Ljava/net/Socket;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 456
    if-eqz p0, :cond_0

    .line 458
    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 461
    goto :goto_0

    .line 459
    :catch_0
    move-exception v0

    .line 463
    :cond_0
    :goto_0
    return-void
.end method

.method public static closeQuietly(Ljava/nio/channels/Selector;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 494
    if-eqz p0, :cond_0

    .line 496
    :try_start_0
    invoke-virtual {p0}, Ljava/nio/channels/Selector;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 499
    goto :goto_0

    .line 497
    :catch_0
    move-exception v0

    .line 501
    :cond_0
    :goto_0
    return-void
.end method

.method public static varargs closeQuietly([Ljava/io/Closeable;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 419
    if-nez p0, :cond_0

    .line 420
    return-void

    .line 422
    :cond_0
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 423
    invoke-static {v4}, Lorg/apache/commons/io/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 422
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 425
    :cond_1
    return-void
.end method

.method public static contentEquals(Ljava/io/InputStream;Ljava/io/InputStream;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2721
    if-ne p0, p1, :cond_0

    .line 2722
    const/4 v0, 0x1

    return v0

    .line 2724
    :cond_0
    instance-of v0, p0, Ljava/io/BufferedInputStream;

    if-nez v0, :cond_1

    .line 2725
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p0, v0

    .line 2727
    :cond_1
    instance-of v0, p1, Ljava/io/BufferedInputStream;

    if-nez v0, :cond_2

    .line 2728
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    .line 2731
    :cond_2
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 2732
    :goto_0
    const/4 v0, -0x1

    if-eq v0, v1, :cond_4

    .line 2733
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 2734
    if-eq v1, v2, :cond_3

    .line 2735
    const/4 v0, 0x0

    return v0

    .line 2737
    :cond_3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 2738
    goto :goto_0

    .line 2740
    :cond_4
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 2741
    const/4 v0, -0x1

    if-ne v2, v0, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static contentEquals(Ljava/io/Reader;Ljava/io/Reader;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2761
    if-ne p0, p1, :cond_0

    .line 2762
    const/4 v0, 0x1

    return v0

    .line 2765
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;

    move-result-object p0

    .line 2766
    invoke-static {p1}, Lorg/apache/commons/io/IOUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;

    move-result-object p1

    .line 2768
    invoke-virtual {p0}, Ljava/io/Reader;->read()I

    move-result v1

    .line 2769
    :goto_0
    const/4 v0, -0x1

    if-eq v0, v1, :cond_2

    .line 2770
    invoke-virtual {p1}, Ljava/io/Reader;->read()I

    move-result v2

    .line 2771
    if-eq v1, v2, :cond_1

    .line 2772
    const/4 v0, 0x0

    return v0

    .line 2774
    :cond_1
    invoke-virtual {p0}, Ljava/io/Reader;->read()I

    move-result v1

    .line 2775
    goto :goto_0

    .line 2777
    :cond_2
    invoke-virtual {p1}, Ljava/io/Reader;->read()I

    move-result v2

    .line 2778
    const/4 v0, -0x1

    if-ne v2, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static contentEqualsIgnoreEOL(Ljava/io/Reader;Ljava/io/Reader;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2797
    if-ne p0, p1, :cond_0

    .line 2798
    const/4 v0, 0x1

    return v0

    .line 2800
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;

    move-result-object v1

    .line 2801
    invoke-static {p1}, Lorg/apache/commons/io/IOUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;

    move-result-object v2

    .line 2803
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .line 2804
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    .line 2805
    :goto_0
    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2806
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .line 2807
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 2809
    :cond_1
    if-nez v3, :cond_3

    if-nez v4, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_1
    return v0
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2246
    invoke-static {p0, p1}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v2

    .line 2247
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 2248
    const/4 v0, -0x1

    return v0

    .line 2250
    :cond_0
    long-to-int v0, v2

    return v0
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/Writer;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2493
    invoke-static {p0, p1}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/Reader;Ljava/io/Writer;)J

    move-result-wide v2

    .line 2494
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 2495
    const/4 v0, -0x1

    return v0

    .line 2497
    :cond_0
    long-to-int v0, v2

    return v0
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2270
    new-array v0, p2, [B

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2419
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 2420
    return-void
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2468
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 2469
    return-void
.end method

.method public static copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2440
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 2441
    invoke-static {v1, p1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 2442
    return-void
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2636
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2637
    return-void
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2699
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2700
    return-void
.end method

.method public static copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2664
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2665
    invoke-static {p0, v1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 2668
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 2669
    return-void
.end method

.method public static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2291
    const/16 v0, 0x1000

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;JJ)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2347
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    const/16 v6, 0x1000

    new-array v6, v6, [B

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;JJ[B)J

    move-result-wide v0

    return-wide v0
.end method

.method public static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;JJ[B)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2376
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    .line 2377
    invoke-static {p0, p2, p3}, Lorg/apache/commons/io/IOUtils;->skipFully(Ljava/io/InputStream;J)V

    .line 2379
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    .line 2380
    const-wide/16 v0, 0x0

    return-wide v0

    .line 2382
    :cond_1
    array-length v4, p6

    .line 2383
    move v5, v4

    .line 2384
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_2

    int-to-long v0, v4

    cmp-long v0, p4, v0

    if-gez v0, :cond_2

    .line 2385
    long-to-int v5, p4

    .line 2388
    :cond_2
    const-wide/16 v7, 0x0

    .line 2389
    :cond_3
    :goto_0
    if-lez v5, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p0, p6, v0, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 2390
    const/4 v0, 0x0

    invoke-virtual {p1, p6, v0, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 2391
    int-to-long v0, v6

    add-long/2addr v7, v0

    .line 2392
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_3

    .line 2394
    sub-long v0, p4, v7

    int-to-long v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v5, v0

    goto :goto_0

    .line 2397
    :cond_4
    return-wide v7
.end method

.method public static copyLarge(Ljava/io/InputStream;Ljava/io/OutputStream;[B)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2312
    const-wide/16 v2, 0x0

    .line 2314
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 2315
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 2316
    int-to-long v0, v4

    add-long/2addr v2, v0

    goto :goto_0

    .line 2318
    :cond_0
    return-wide v2
.end method

.method public static copyLarge(Ljava/io/Reader;Ljava/io/Writer;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2516
    const/16 v0, 0x1000

    new-array v0, v0, [C

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/Reader;Ljava/io/Writer;[C)J

    move-result-wide v0

    return-wide v0
.end method

.method public static copyLarge(Ljava/io/Reader;Ljava/io/Writer;JJ)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2565
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    const/16 v6, 0x1000

    new-array v6, v6, [C

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/io/IOUtils;->copyLarge(Ljava/io/Reader;Ljava/io/Writer;JJ[C)J

    move-result-wide v0

    return-wide v0
.end method

.method public static copyLarge(Ljava/io/Reader;Ljava/io/Writer;JJ[C)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2590
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    .line 2591
    invoke-static {p0, p2, p3}, Lorg/apache/commons/io/IOUtils;->skipFully(Ljava/io/Reader;J)V

    .line 2593
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-nez v0, :cond_1

    .line 2594
    const-wide/16 v0, 0x0

    return-wide v0

    .line 2596
    :cond_1
    array-length v4, p6

    .line 2597
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_2

    array-length v0, p6

    int-to-long v0, v0

    cmp-long v0, p4, v0

    if-gez v0, :cond_2

    .line 2598
    long-to-int v4, p4

    .line 2601
    :cond_2
    const-wide/16 v6, 0x0

    .line 2602
    :cond_3
    :goto_0
    if-lez v4, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p0, p6, v0, v4}, Ljava/io/Reader;->read([CII)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 2603
    const/4 v0, 0x0

    invoke-virtual {p1, p6, v0, v5}, Ljava/io/Writer;->write([CII)V

    .line 2604
    int-to-long v0, v5

    add-long/2addr v6, v0

    .line 2605
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_3

    .line 2607
    sub-long v0, p4, v6

    array-length v2, p6

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v4, v0

    goto :goto_0

    .line 2610
    :cond_4
    return-wide v6
.end method

.method public static copyLarge(Ljava/io/Reader;Ljava/io/Writer;[C)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2535
    const-wide/16 v2, 0x0

    .line 2537
    :goto_0
    invoke-virtual {p0, p2}, Ljava/io/Reader;->read([C)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 2538
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v4}, Ljava/io/Writer;->write([CII)V

    .line 2539
    int-to-long v0, v4

    add-long/2addr v2, v0

    goto :goto_0

    .line 2541
    :cond_0
    return-wide v2
.end method

.method public static lineIterator(Ljava/io/InputStream;Ljava/lang/String;)Lorg/apache/commons/io/LineIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1569
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->lineIterator(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lorg/apache/commons/io/LineIterator;

    move-result-object v0

    return-object v0
.end method

.method public static lineIterator(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lorg/apache/commons/io/LineIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1532
    new-instance v0, Lorg/apache/commons/io/LineIterator;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Lorg/apache/commons/io/LineIterator;-><init>(Ljava/io/Reader;)V

    return-object v0
.end method

.method public static lineIterator(Ljava/io/Reader;)Lorg/apache/commons/io/LineIterator;
    .locals 1

    .line 1498
    new-instance v0, Lorg/apache/commons/io/LineIterator;

    invoke-direct {v0, p0}, Lorg/apache/commons/io/LineIterator;-><init>(Ljava/io/Reader;)V

    return-object v0
.end method

.method public static read(Ljava/io/InputStream;[B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3099
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/IOUtils;->read(Ljava/io/InputStream;[BII)I

    move-result v0

    return v0
.end method

.method public static read(Ljava/io/InputStream;[BII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3071
    if-gez p3, :cond_0

    .line 3072
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length must not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3074
    :cond_0
    move v3, p3

    .line 3075
    :goto_0
    if-lez v3, :cond_2

    .line 3076
    sub-int v4, p3, v3

    .line 3077
    add-int v0, p2, v4

    invoke-virtual {p0, p1, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    .line 3078
    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 3079
    goto :goto_1

    .line 3081
    :cond_1
    sub-int/2addr v3, v5

    .line 3082
    goto :goto_0

    .line 3083
    :cond_2
    :goto_1
    sub-int v0, p3, v3

    return v0
.end method

.method public static read(Ljava/io/Reader;[C)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3052
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/IOUtils;->read(Ljava/io/Reader;[CII)I

    move-result v0

    return v0
.end method

.method public static read(Ljava/io/Reader;[CII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3024
    if-gez p3, :cond_0

    .line 3025
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length must not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3027
    :cond_0
    move v3, p3

    .line 3028
    :goto_0
    if-lez v3, :cond_2

    .line 3029
    sub-int v4, p3, v3

    .line 3030
    add-int v0, p2, v4

    invoke-virtual {p0, p1, v0, v3}, Ljava/io/Reader;->read([CII)I

    move-result v5

    .line 3031
    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 3032
    goto :goto_1

    .line 3034
    :cond_1
    sub-int/2addr v3, v5

    .line 3035
    goto :goto_0

    .line 3036
    :cond_2
    :goto_1
    sub-int v0, p3, v3

    return v0
.end method

.method public static read(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3116
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    .line 3117
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-lez v0, :cond_1

    .line 3118
    invoke-interface {p0, p1}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    .line 3119
    const/4 v0, -0x1

    if-ne v0, v2, :cond_0

    .line 3120
    goto :goto_1

    .line 3122
    :cond_0
    goto :goto_0

    .line 3123
    :cond_1
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    sub-int v0, v1, v0

    return v0
.end method

.method public static readFully(Ljava/io/InputStream;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3203
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/IOUtils;->readFully(Ljava/io/InputStream;[BII)V

    .line 3204
    return-void
.end method

.method public static readFully(Ljava/io/InputStream;[BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3183
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/io/IOUtils;->read(Ljava/io/InputStream;[BII)I

    move-result v3

    .line 3184
    if-eq v3, p3, :cond_0

    .line 3185
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length to read: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3187
    :cond_0
    return-void
.end method

.method public static readFully(Ljava/io/Reader;[C)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3163
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lorg/apache/commons/io/IOUtils;->readFully(Ljava/io/Reader;[CII)V

    .line 3164
    return-void
.end method

.method public static readFully(Ljava/io/Reader;[CII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3143
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/io/IOUtils;->read(Ljava/io/Reader;[CII)I

    move-result v3

    .line 3144
    if-eq v3, p3, :cond_0

    .line 3145
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length to read: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3147
    :cond_0
    return-void
.end method

.method public static readFully(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3239
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    .line 3240
    invoke-static {p0, p1}, Lorg/apache/commons/io/IOUtils;->read(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 3241
    if-eq v4, v3, :cond_0

    .line 3242
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length to read: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3244
    :cond_0
    return-void
.end method

.method public static readFully(Ljava/io/InputStream;I)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3221
    new-array v2, p1, [B

    .line 3222
    array-length v0, v2

    const/4 v1, 0x0

    invoke-static {p0, v2, v1, v0}, Lorg/apache/commons/io/IOUtils;->readFully(Ljava/io/InputStream;[BII)V

    .line 3223
    return-object v2
.end method

.method public static readLines(Ljava/io/InputStream;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/InputStream;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1397
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->readLines(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static readLines(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1440
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->readLines(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static readLines(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1415
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 1416
    invoke-static {v1}, Lorg/apache/commons/io/IOUtils;->readLines(Ljava/io/Reader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static readLines(Ljava/io/Reader;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/Reader;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1457
    invoke-static {p0}, Lorg/apache/commons/io/IOUtils;->toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;

    move-result-object v1

    .line 1458
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1459
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .line 1460
    :goto_0
    if-eqz v3, :cond_0

    .line 1461
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1462
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 1464
    :cond_0
    return-object v2
.end method

.method public static resourceToByteArray(Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1311
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->resourceToByteArray(Ljava/lang/String;Ljava/lang/ClassLoader;)[B

    move-result-object v0

    return-object v0
.end method

.method public static resourceToByteArray(Ljava/lang/String;Ljava/lang/ClassLoader;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1330
    invoke-static {p0, p1}, Lorg/apache/commons/io/IOUtils;->resourceToURL(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/net/URL;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/net/URL;)[B

    move-result-object v0

    return-object v0
.end method

.method public static resourceToString(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1272
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->resourceToString(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/ClassLoader;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static resourceToString(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/ClassLoader;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1293
    invoke-static {p0, p2}, Lorg/apache/commons/io/IOUtils;->resourceToURL(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/net/URL;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static resourceToURL(Ljava/lang/String;)Ljava/net/URL;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1348
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->resourceToURL(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public static resourceToURL(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/net/URL;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1369
    if-nez p1, :cond_0

    const-class v0, Lorg/apache/commons/io/IOUtils;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v3

    .line 1371
    :goto_0
    if-nez v3, :cond_1

    .line 1372
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Resource not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1375
    :cond_1
    return-object v3
.end method

.method public static skip(Ljava/io/InputStream;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2834
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2835
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skip count must be non-negative, actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2842
    :cond_0
    sget-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_BYTE_BUFFER:[B

    if-nez v0, :cond_1

    .line 2843
    const/16 v0, 0x800

    new-array v0, v0, [B

    sput-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_BYTE_BUFFER:[B

    .line 2845
    :cond_1
    move-wide v3, p1

    .line 2846
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_3

    .line 2848
    sget-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_BYTE_BUFFER:[B

    const-wide/16 v1, 0x800

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    int-to-long v5, v0

    .line 2849
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gez v0, :cond_2

    .line 2850
    goto :goto_1

    .line 2852
    :cond_2
    sub-long/2addr v3, v5

    .line 2853
    goto :goto_0

    .line 2854
    :cond_3
    :goto_1
    sub-long v0, p1, v3

    return-wide v0
.end method

.method public static skip(Ljava/io/Reader;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2909
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2910
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skip count must be non-negative, actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2917
    :cond_0
    sget-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_CHAR_BUFFER:[C

    if-nez v0, :cond_1

    .line 2918
    const/16 v0, 0x800

    new-array v0, v0, [C

    sput-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_CHAR_BUFFER:[C

    .line 2920
    :cond_1
    move-wide v3, p1

    .line 2921
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_3

    .line 2923
    sget-object v0, Lorg/apache/commons/io/IOUtils;->SKIP_CHAR_BUFFER:[C

    const-wide/16 v1, 0x800

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Ljava/io/Reader;->read([CII)I

    move-result v0

    int-to-long v5, v0

    .line 2924
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gez v0, :cond_2

    .line 2925
    goto :goto_1

    .line 2927
    :cond_2
    sub-long/2addr v3, v5

    .line 2928
    goto :goto_0

    .line 2929
    :cond_3
    :goto_1
    sub-long v0, p1, v3

    return-wide v0
.end method

.method public static skip(Ljava/nio/channels/ReadableByteChannel;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2870
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2871
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skip count must be non-negative, actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2873
    :cond_0
    const-wide/16 v0, 0x800

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 2874
    move-wide v4, p1

    .line 2875
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 2876
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 2877
    const-wide/16 v0, 0x800

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 2878
    invoke-interface {p0, v3}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v6

    .line 2879
    const/4 v0, -0x1

    if-ne v6, v0, :cond_1

    .line 2880
    goto :goto_1

    .line 2882
    :cond_1
    int-to-long v0, v6

    sub-long/2addr v4, v0

    .line 2883
    goto :goto_0

    .line 2884
    :cond_2
    :goto_1
    sub-long v0, p1, v4

    return-wide v0
.end method

.method public static skipFully(Ljava/io/InputStream;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2952
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2953
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bytes to skip must not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2955
    :cond_0
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/IOUtils;->skip(Ljava/io/InputStream;J)J

    move-result-wide v3

    .line 2956
    cmp-long v0, v3, p1

    if-eqz v0, :cond_1

    .line 2957
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bytes to skip: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2959
    :cond_1
    return-void
.end method

.method public static skipFully(Ljava/io/Reader;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3001
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/IOUtils;->skip(Ljava/io/Reader;J)J

    move-result-wide v3

    .line 3002
    cmp-long v0, v3, p1

    if-eqz v0, :cond_0

    .line 3003
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Chars to skip: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3005
    :cond_0
    return-void
.end method

.method public static skipFully(Ljava/nio/channels/ReadableByteChannel;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2972
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 2973
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bytes to skip must not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2975
    :cond_0
    invoke-static {p0, p1, p2}, Lorg/apache/commons/io/IOUtils;->skip(Ljava/nio/channels/ReadableByteChannel;J)J

    move-result-wide v3

    .line 2976
    cmp-long v0, v3, p1

    if-eqz v0, :cond_1

    .line 2977
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bytes to skip: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " actual: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2979
    :cond_1
    return-void
.end method

.method public static toBufferedInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 563
    invoke-static {p0}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->toBufferedInputStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toBufferedInputStream(Ljava/io/InputStream;I)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 589
    invoke-static {p0, p1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->toBufferedInputStream(Ljava/io/InputStream;I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toBufferedReader(Ljava/io/Reader;)Ljava/io/BufferedReader;
    .locals 1

    .line 603
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    return-object v0
.end method

.method public static toBufferedReader(Ljava/io/Reader;I)Ljava/io/BufferedReader;
    .locals 1

    .line 618
    instance-of v0, p0, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :goto_0
    return-object v0
.end method

.method public static toByteArray(Ljava/io/InputStream;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 764
    new-instance v1, Lorg/apache/commons/io/output/ByteArrayOutputStream;

    invoke-direct {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;-><init>()V

    const/4 v2, 0x0

    .line 765
    :try_start_0
    invoke-static {p0, v1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 766
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 767
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V

    .line 766
    :cond_0
    return-object v3

    .line 764
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 767
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toByteArray(Ljava/io/InputStream;I)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 811
    if-gez p1, :cond_0

    .line 812
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Size must be equal or greater than zero: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 815
    :cond_0
    if-nez p1, :cond_1

    .line 816
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 819
    :cond_1
    new-array v3, p1, [B

    .line 820
    const/4 v4, 0x0

    .line 823
    :goto_0
    if-ge v4, p1, :cond_2

    sub-int v0, p1, v4

    invoke-virtual {p0, v3, v4, v0}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 824
    add-int/2addr v4, v5

    goto :goto_0

    .line 827
    :cond_2
    if-eq v4, p1, :cond_3

    .line 828
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected read size. current: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 831
    :cond_3
    return-object v3
.end method

.method public static toByteArray(Ljava/io/InputStream;J)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 789
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 790
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Size cannot be greater than Integer max value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 793
    :cond_0
    long-to-int v0, p1

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/io/InputStream;I)[B

    move-result-object v0

    return-object v0
.end method

.method public static toByteArray(Ljava/io/Reader;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 849
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/io/Reader;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public static toByteArray(Ljava/io/Reader;Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 894
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/io/Reader;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public static toByteArray(Ljava/io/Reader;Ljava/nio/charset/Charset;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 867
    new-instance v1, Lorg/apache/commons/io/output/ByteArrayOutputStream;

    invoke-direct {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;-><init>()V

    const/4 v2, 0x0

    .line 868
    :try_start_0
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 869
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 870
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V

    .line 869
    :cond_0
    return-object v3

    .line 867
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 870
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/apache/commons/io/output/ByteArrayOutputStream;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toByteArray(Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 912
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public static toByteArray(Ljava/net/URI;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 925
    invoke-virtual {p0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/net/URL;)[B

    move-result-object v0

    return-object v0
.end method

.method public static toByteArray(Ljava/net/URL;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 938
    invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    .line 940
    :try_start_0
    invoke-static {v0}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/net/URLConnection;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 942
    invoke-static {v0}, Lorg/apache/commons/io/IOUtils;->close(Ljava/net/URLConnection;)V

    .line 940
    return-object v1

    .line 942
    :catchall_0
    move-exception v2

    invoke-static {v0}, Lorg/apache/commons/io/IOUtils;->close(Ljava/net/URLConnection;)V

    throw v2
.end method

.method public static toByteArray(Ljava/net/URLConnection;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 956
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x0

    .line 957
    :try_start_0
    invoke-static {v1}, Lorg/apache/commons/io/IOUtils;->toByteArray(Ljava/io/InputStream;)[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 958
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 957
    :cond_0
    return-object v3

    .line 956
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 958
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toCharArray(Ljava/io/InputStream;)[C
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 980
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toCharArray(Ljava/io/InputStream;Ljava/nio/charset/Charset;)[C

    move-result-object v0

    return-object v0
.end method

.method public static toCharArray(Ljava/io/InputStream;Ljava/lang/String;)[C
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1025
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toCharArray(Ljava/io/InputStream;Ljava/nio/charset/Charset;)[C

    move-result-object v0

    return-object v0
.end method

.method public static toCharArray(Ljava/io/InputStream;Ljava/nio/charset/Charset;)[C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 999
    new-instance v1, Ljava/io/CharArrayWriter;

    invoke-direct {v1}, Ljava/io/CharArrayWriter;-><init>()V

    .line 1000
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 1001
    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->toCharArray()[C

    move-result-object v0

    return-object v0
.end method

.method public static toCharArray(Ljava/io/Reader;)[C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1041
    new-instance v1, Ljava/io/CharArrayWriter;

    invoke-direct {v1}, Ljava/io/CharArrayWriter;-><init>()V

    .line 1042
    invoke-static {p0, v1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 1043
    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->toCharArray()[C

    move-result-object v0

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/CharSequence;)Ljava/io/InputStream;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1585
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toInputStream(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1618
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toInputStream(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Ljava/io/InputStream;
    .locals 1

    .line 1598
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/commons/io/IOUtils;->toInputStream(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1634
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toInputStream(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1667
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 1668
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public static toInputStream(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/io/InputStream;
    .locals 2

    .line 1647
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public static toString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1064
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1110
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1083
    new-instance v1, Lorg/apache/commons/io/output/StringBuilderWriter;

    invoke-direct {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;-><init>()V

    const/4 v2, 0x0

    .line 1084
    :try_start_0
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/InputStream;Ljava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 1085
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 1086
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    .line 1085
    :cond_0
    return-object v3

    .line 1083
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1086
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toString(Ljava/io/Reader;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1125
    new-instance v1, Lorg/apache/commons/io/output/StringBuilderWriter;

    invoke-direct {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;-><init>()V

    const/4 v2, 0x0

    .line 1126
    :try_start_0
    invoke-static {p0, v1}, Lorg/apache/commons/io/IOUtils;->copy(Ljava/io/Reader;Ljava/io/Writer;)I

    .line 1127
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 1128
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    .line 1127
    :cond_0
    return-object v3

    .line 1125
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1128
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/apache/commons/io/output/StringBuilderWriter;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toString(Ljava/net/URI;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1142
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URI;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/net/URI;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1171
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URI;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/net/URI;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1155
    invoke-virtual {p0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/net/URL;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1185
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/net/URL;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1216
    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1198
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x0

    .line 1199
    :try_start_0
    invoke-static {v1, p1}, Lorg/apache/commons/io/IOUtils;->toString(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 1200
    if-eqz v1, :cond_0

    nop

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 1199
    :cond_0
    return-object v3

    .line 1198
    :catch_0
    move-exception v3

    move-object v2, v3

    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1200
    :catchall_0
    move-exception v5

    if-eqz v1, :cond_2

    if-eqz v2, :cond_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v2, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    :goto_0
    throw v5
.end method

.method public static toString([B)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1232
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static toString([BLjava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1249
    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static write(Ljava/lang/CharSequence;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1926
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/CharSequence;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1927
    return-void
.end method

.method public static write(Ljava/lang/CharSequence;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1969
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/CharSequence;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1970
    return-void
.end method

.method public static write(Ljava/lang/CharSequence;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1944
    if-eqz p0, :cond_0

    .line 1945
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1947
    :cond_0
    return-void
.end method

.method public static write(Ljava/lang/CharSequence;Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1904
    if-eqz p0, :cond_0

    .line 1905
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/String;Ljava/io/Writer;)V

    .line 1907
    :cond_0
    return-void
.end method

.method public static write(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2007
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2008
    return-void
.end method

.method public static write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2049
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2050
    return-void
.end method

.method public static write(Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2024
    if-eqz p0, :cond_0

    .line 2025
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 2027
    :cond_0
    return-void
.end method

.method public static write(Ljava/lang/String;Ljava/io/Writer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1985
    if-eqz p0, :cond_0

    .line 1986
    invoke-virtual {p1, p0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1988
    :cond_0
    return-void
.end method

.method public static write(Ljava/lang/StringBuffer;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2090
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write(Ljava/lang/StringBuffer;Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 2091
    return-void
.end method

.method public static write(Ljava/lang/StringBuffer;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2115
    if-eqz p0, :cond_0

    .line 2116
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 2118
    :cond_0
    return-void
.end method

.method public static write(Ljava/lang/StringBuffer;Ljava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2068
    if-eqz p0, :cond_0

    .line 2069
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 2071
    :cond_0
    return-void
.end method

.method public static write([BLjava/io/OutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1686
    if-eqz p0, :cond_0

    .line 1687
    invoke-virtual {p1, p0}, Ljava/io/OutputStream;->write([B)V

    .line 1689
    :cond_0
    return-void
.end method

.method public static write([BLjava/io/Writer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1733
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write([BLjava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 1734
    return-void
.end method

.method public static write([BLjava/io/Writer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1777
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write([BLjava/io/Writer;Ljava/nio/charset/Charset;)V

    .line 1778
    return-void
.end method

.method public static write([BLjava/io/Writer;Ljava/nio/charset/Charset;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1751
    if-eqz p0, :cond_0

    .line 1752
    new-instance v0, Ljava/lang/String;

    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1754
    :cond_0
    return-void
.end method

.method public static write([CLjava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1842
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write([CLjava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1843
    return-void
.end method

.method public static write([CLjava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1888
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/IOUtils;->write([CLjava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1889
    return-void
.end method

.method public static write([CLjava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1861
    if-eqz p0, :cond_0

    .line 1862
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 1864
    :cond_0
    return-void
.end method

.method public static write([CLjava/io/Writer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1794
    if-eqz p0, :cond_0

    .line 1795
    invoke-virtual {p1, p0}, Ljava/io/Writer;->write([C)V

    .line 1797
    :cond_0
    return-void
.end method

.method public static writeChunked([BLjava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1705
    if-eqz p0, :cond_0

    .line 1706
    array-length v1, p0

    .line 1707
    const/4 v2, 0x0

    .line 1708
    :goto_0
    if-lez v1, :cond_0

    .line 1709
    const/16 v0, 0x1000

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1710
    invoke-virtual {p1, p0, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 1711
    sub-int/2addr v1, v3

    .line 1712
    add-int/2addr v2, v3

    .line 1713
    goto :goto_0

    .line 1715
    :cond_0
    return-void
.end method

.method public static writeChunked([CLjava/io/Writer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1812
    if-eqz p0, :cond_0

    .line 1813
    array-length v1, p0

    .line 1814
    const/4 v2, 0x0

    .line 1815
    :goto_0
    if-lez v1, :cond_0

    .line 1816
    const/16 v0, 0x1000

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1817
    invoke-virtual {p1, p0, v2, v3}, Ljava/io/Writer;->write([CII)V

    .line 1818
    sub-int/2addr v1, v3

    .line 1819
    add-int/2addr v2, v3

    .line 1820
    goto :goto_0

    .line 1822
    :cond_0
    return-void
.end method

.method public static writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;Ljava/lang/String;Ljava/io/OutputStream;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2139
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/io/IOUtils;->writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2140
    return-void
.end method

.method public static writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;Ljava/lang/String;Ljava/io/OutputStream;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2193
    invoke-static {p3}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/io/IOUtils;->writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 2194
    return-void
.end method

.method public static writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;Ljava/lang/String;Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2157
    if-nez p0, :cond_0

    .line 2158
    return-void

    .line 2160
    :cond_0
    if-nez p1, :cond_1

    .line 2161
    sget-object p1, Lorg/apache/commons/io/IOUtils;->LINE_SEPARATOR:Ljava/lang/String;

    .line 2163
    :cond_1
    invoke-static {p3}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 2164
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 2165
    if-eqz v3, :cond_2

    .line 2166
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 2168
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 2169
    goto :goto_0

    .line 2170
    :cond_3
    return-void
.end method

.method public static writeLines(Ljava/util/Collection;Ljava/lang/String;Ljava/io/Writer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;Ljava/lang/String;Ljava/io/Writer;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2209
    if-nez p0, :cond_0

    .line 2210
    return-void

    .line 2212
    :cond_0
    if-nez p1, :cond_1

    .line 2213
    sget-object p1, Lorg/apache/commons/io/IOUtils;->LINE_SEPARATOR:Ljava/lang/String;

    .line 2215
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 2216
    if-eqz v2, :cond_2

    .line 2217
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 2219
    :cond_2
    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 2220
    goto :goto_0

    .line 2221
    :cond_3
    return-void
.end method
