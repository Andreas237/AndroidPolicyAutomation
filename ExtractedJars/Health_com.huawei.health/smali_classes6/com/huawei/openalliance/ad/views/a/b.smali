.class Lcom/huawei/openalliance/ad/views/a/b;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field b:Landroid/graphics/Bitmap;

.field c:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(ILandroid/graphics/Bitmap;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    iput p3, p0, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    return-void
.end method


# virtual methods
.method a()Lcom/huawei/openalliance/ad/views/a/b;
    .locals 2

    new-instance v1, Lcom/huawei/openalliance/ad/views/a/b;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/views/a/b;-><init>()V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    iput v0, v1, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    iput v0, v1, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GifFrame{frameIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", delay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
