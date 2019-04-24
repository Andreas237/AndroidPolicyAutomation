.class Lcom/huawei/openalliance/ad/views/VideoView$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/VideoView$1;->a(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lcom/huawei/openalliance/ad/views/VideoView$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView$1;F)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iput p2, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getWidth()I

    move-result v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getHeight()I

    move-result v3

    if-eqz v3, :cond_0

    if-nez v2, :cond_1

    :cond_0
    return-void

    :cond_1
    int-to-float v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    int-to-float v0, v3

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->b(Lcom/huawei/openalliance/ad/views/VideoView;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Lcom/huawei/openalliance/ad/views/VideoView;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "set video scale mode as fit"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v6, v0, v1, v4, v5}, Landroid/graphics/Matrix;->setScale(FFFF)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->c(Lcom/huawei/openalliance/ad/views/VideoView;)Landroid/view/TextureView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    goto :goto_1

    :sswitch_1
    invoke-static {}, Lcom/huawei/openalliance/ad/views/VideoView;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "set video scale mode as fit with cropping"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    int-to-float v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v3

    div-float v6, v0, v1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->a:F

    cmpg-float v0, v6, v0

    if-gez v0, :cond_2

    const/high16 v8, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->a:F

    div-float v7, v0, v6

    goto :goto_0

    :cond_2
    const/high16 v7, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->a:F

    div-float v8, v6, v0

    :goto_0
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v9, v7, v8, v4, v5}, Landroid/graphics/Matrix;->setScale(FFFF)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$1$2;->b:Lcom/huawei/openalliance/ad/views/VideoView$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/VideoView$1;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->c(Lcom/huawei/openalliance/ad/views/VideoView;)Landroid/view/TextureView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
