.class public final Lcom/huawei/openalliance/ad/utils/Size;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    iput p2, p0, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    instance-of v0, p1, Lcom/huawei/openalliance/ad/utils/Size;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, Lcom/huawei/openalliance/ad/utils/Size;

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    iget v1, v2, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    iget v1, v2, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public getHeight()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    iget v1, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    shl-int/lit8 v1, v1, 0x10

    iget v2, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    ushr-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/huawei/openalliance/ad/utils/Size;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/utils/Size;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
