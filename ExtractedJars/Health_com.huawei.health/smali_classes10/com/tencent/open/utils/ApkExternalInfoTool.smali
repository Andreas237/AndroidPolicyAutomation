.class public final Lcom/tencent/open/utils/ApkExternalInfoTool;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/utils/ApkExternalInfoTool$1;,
        Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;
    }
.end annotation


# static fields
.field public static final CHANNELID:Ljava/lang/String; = "channelNo"

.field private static final a:Lcom/tencent/open/utils/ZipLong;

.field private static final b:Lcom/tencent/open/utils/ZipShort;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 116
    new-instance v0, Lcom/tencent/open/utils/ZipLong;

    const-wide/32 v1, 0x6054b50

    invoke-direct {v0, v1, v2}, Lcom/tencent/open/utils/ZipLong;-><init>(J)V

    sput-object v0, Lcom/tencent/open/utils/ApkExternalInfoTool;->a:Lcom/tencent/open/utils/ZipLong;

    .line 119
    new-instance v0, Lcom/tencent/open/utils/ZipShort;

    const v1, 0x96fb

    invoke-direct {v0, v1}, Lcom/tencent/open/utils/ZipShort;-><init>(I)V

    sput-object v0, Lcom/tencent/open/utils/ApkExternalInfoTool;->b:Lcom/tencent/open/utils/ZipShort;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method

.method static synthetic a()Lcom/tencent/open/utils/ZipShort;
    .locals 1

    .line 14
    sget-object v0, Lcom/tencent/open/utils/ApkExternalInfoTool;->b:Lcom/tencent/open/utils/ZipShort;

    return-object v0
.end method

.method private static a(Ljava/io/RandomAccessFile;)[B
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 177
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x16

    sub-long v4, v0, v2

    .line 178
    invoke-virtual {p0, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 179
    sget-object v0, Lcom/tencent/open/utils/ApkExternalInfoTool;->a:Lcom/tencent/open/utils/ZipLong;

    invoke-virtual {v0}, Lcom/tencent/open/utils/ZipLong;->getBytes()[B

    move-result-object v6

    .line 180
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->read()I

    move-result v7

    .line 182
    const/4 v8, 0x0

    .line 184
    :goto_0
    const/4 v0, -0x1

    if-eq v7, v0, :cond_1

    .line 186
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    if-ne v7, v0, :cond_0

    .line 188
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->read()I

    move-result v7

    .line 189
    const/4 v0, 0x1

    aget-byte v0, v6, v0

    if-ne v7, v0, :cond_0

    .line 191
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->read()I

    move-result v7

    .line 192
    const/4 v0, 0x2

    aget-byte v0, v6, v0

    if-ne v7, v0, :cond_0

    .line 194
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->read()I

    move-result v7

    .line 195
    const/4 v0, 0x3

    aget-byte v0, v6, v0

    if-ne v7, v0, :cond_0

    .line 197
    const/4 v8, 0x1

    .line 198
    goto :goto_1

    .line 203
    :cond_0
    const-wide/16 v0, 0x1

    sub-long v0, v4, v0

    move-wide v4, v0

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 204
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->read()I

    move-result v7

    goto :goto_0

    .line 206
    :cond_1
    :goto_1
    if-nez v8, :cond_2

    .line 208
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "archive is not a ZIP archive"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :cond_2
    const-wide/16 v0, 0x10

    add-long/2addr v0, v4

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 214
    const/4 v0, 0x2

    new-array v9, v0, [B

    .line 215
    invoke-virtual {p0, v9}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 217
    new-instance v0, Lcom/tencent/open/utils/ZipShort;

    invoke-direct {v0, v9}, Lcom/tencent/open/utils/ZipShort;-><init>([B)V

    invoke-virtual {v0}, Lcom/tencent/open/utils/ZipShort;->getValue()I

    move-result v10

    .line 218
    if-nez v10, :cond_3

    .line 220
    const/4 v0, 0x0

    return-object v0

    .line 222
    :cond_3
    new-array v9, v10, [B

    .line 223
    invoke-virtual {p0, v9}, Ljava/io/RandomAccessFile;->read([B)I

    .line 224
    return-object v9
.end method

.method public static read(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 131
    const/4 v2, 0x0

    .line 134
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "r"

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v0

    .line 135
    invoke-static {v2}, Lcom/tencent/open/utils/ApkExternalInfoTool;->a(Ljava/io/RandomAccessFile;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 136
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 138
    const/4 v4, 0x0

    .line 146
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 148
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    :cond_0
    return-object v4

    .line 140
    :cond_1
    :try_start_1
    new-instance v4, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;-><init>(Lcom/tencent/open/utils/ApkExternalInfoTool$1;)V

    .line 141
    invoke-virtual {v4, v3}, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->a([B)V

    .line 142
    iget-object v0, v4, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->a:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    .line 146
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 148
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    :cond_2
    return-object v5

    .line 146
    :catchall_0
    move-exception v6

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 148
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    :cond_3
    throw v6
.end method

.method public static readChannelId(Ljava/io/File;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 163
    const-string v0, "channelNo"

    invoke-static {p0, v0}, Lcom/tencent/open/utils/ApkExternalInfoTool;->read(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
