.class public final Lcom/tencent/open/utils/ZipShort;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    .line 37
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 15
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/utils/ZipShort;-><init>([BI)V

    .line 16
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 3

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    add-int/lit8 v0, p2, 0x1

    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    .line 26
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    aget-byte v1, p1, p2

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    .line 27
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 47
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/tencent/open/utils/ZipShort;

    if-nez v0, :cond_1

    .line 49
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 51
    :cond_1
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    move-object v1, p1

    check-cast v1, Lcom/tencent/open/utils/ZipShort;

    invoke-virtual {v1}, Lcom/tencent/open/utils/ZipShort;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getBytes()[B
    .locals 3

    .line 61
    const/4 v0, 0x2

    new-array v2, v0, [B

    .line 62
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    .line 63
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v2, v1

    .line 64
    return-object v2
.end method

.method public getValue()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/tencent/open/utils/ZipShort;->a:I

    return v0
.end method
