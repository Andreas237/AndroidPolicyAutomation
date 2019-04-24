.class Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/utils/ApkExternalInfoTool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ApkExternalInfo"
.end annotation


# instance fields
.field a:Ljava/util/Properties;

.field b:[B


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->a:Ljava/util/Properties;

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/open/utils/ApkExternalInfoTool$1;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;-><init>()V

    return-void
.end method


# virtual methods
.method a([B)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 25
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 28
    invoke-static {}, Lcom/tencent/open/utils/ApkExternalInfoTool;->a()Lcom/tencent/open/utils/ZipShort;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/utils/ZipShort;->getBytes()[B

    move-result-object v0

    array-length v4, v0

    .line 29
    new-array v5, v4, [B

    .line 30
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 32
    invoke-static {}, Lcom/tencent/open/utils/ApkExternalInfoTool;->a()Lcom/tencent/open/utils/ZipShort;

    move-result-object v0

    new-instance v1, Lcom/tencent/open/utils/ZipShort;

    invoke-direct {v1, v5}, Lcom/tencent/open/utils/ZipShort;-><init>([B)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/ZipShort;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 34
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknow protocl ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_1
    array-length v0, p1

    sub-int/2addr v0, v4

    const/4 v1, 0x2

    if-gt v0, v1, :cond_2

    .line 38
    return-void

    .line 41
    :cond_2
    const/4 v0, 0x2

    new-array v5, v0, [B

    .line 42
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 43
    new-instance v0, Lcom/tencent/open/utils/ZipShort;

    invoke-direct {v0, v5}, Lcom/tencent/open/utils/ZipShort;-><init>([B)V

    invoke-virtual {v0}, Lcom/tencent/open/utils/ZipShort;->getValue()I

    move-result v6

    .line 45
    array-length v0, p1

    sub-int/2addr v0, v4

    add-int/lit8 v0, v0, -0x2

    if-ge v0, v6, :cond_3

    .line 47
    return-void

    .line 50
    :cond_3
    new-array v5, v6, [B

    .line 51
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 52
    iget-object v0, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->a:Ljava/util/Properties;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 54
    array-length v0, p1

    sub-int/2addr v0, v4

    sub-int/2addr v0, v6

    add-int/lit8 v7, v0, -0x2

    .line 55
    if-lez v7, :cond_4

    .line 57
    new-array v0, v7, [B

    iput-object v0, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->b:[B

    .line 58
    iget-object v0, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->b:[B

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 60
    :cond_4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApkExternalInfo [p="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->a:Ljava/util/Properties;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", otherData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/utils/ApkExternalInfoTool$ApkExternalInfo;->b:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
