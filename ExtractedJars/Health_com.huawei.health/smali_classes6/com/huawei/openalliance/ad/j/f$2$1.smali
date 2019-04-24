.class Lcom/huawei/openalliance/ad/j/f$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/f$2;->a(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/f$2;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/f$2;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/f$2$1;->b:Lcom/huawei/openalliance/ad/j/f$2;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/f$2$1;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f$2$1;->b:Lcom/huawei/openalliance/ad/j/f$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/f$2;->b:Lcom/huawei/openalliance/ad/j/f;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/f;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/f$2$1;->b:Lcom/huawei/openalliance/ad/j/f$2;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/j/f$2;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/f$2$1;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->onPreviewImageLoaded(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V

    return-void
.end method
