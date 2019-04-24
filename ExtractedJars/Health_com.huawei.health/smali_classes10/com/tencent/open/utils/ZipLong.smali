.class public final Lcom/tencent/open/utils/ZipLong;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-wide p1, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    .line 39
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 15
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/utils/ZipLong;-><init>([BI)V

    .line 16
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    add-int/lit8 v0, p2, 0x3

    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x18

    int-to-long v0, v0

    const-wide v2, 0xff000000L

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    .line 26
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    add-int/lit8 v2, p2, 0x2

    aget-byte v2, p1, v2

    shl-int/lit8 v2, v2, 0x10

    const/high16 v3, 0xff0000

    and-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    .line 27
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    add-int/lit8 v2, p2, 0x1

    aget-byte v2, p1, v2

    shl-int/lit8 v2, v2, 0x8

    const v3, 0xff00

    and-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    .line 28
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    aget-byte v2, p1, p2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    .line 29
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 49
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/tencent/open/utils/ZipLong;

    if-nez v0, :cond_1

    .line 51
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_1
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    move-object v2, p1

    check-cast v2, Lcom/tencent/open/utils/ZipLong;

    invoke-virtual {v2}, Lcom/tencent/open/utils/ZipLong;->getValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getBytes()[B
    .locals 5

    .line 63
    const/4 v0, 0x4

    new-array v4, v0, [B

    .line 64
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v4, v1

    .line 65
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    const-wide/32 v2, 0xff00

    and-long/2addr v0, v2

    const/16 v2, 0x8

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v4, v1

    .line 66
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    const-wide/32 v2, 0xff0000

    and-long/2addr v0, v2

    const/16 v2, 0x10

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, v4, v1

    .line 67
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    const-wide v2, 0xff000000L

    and-long/2addr v0, v2

    const/16 v2, 0x18

    shr-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v4, v1

    .line 68
    return-object v4
.end method

.method public getValue()J
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/tencent/open/utils/ZipLong;->a:J

    long-to-int v0, v0

    return v0
.end method
