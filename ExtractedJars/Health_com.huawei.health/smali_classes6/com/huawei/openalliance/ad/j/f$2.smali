.class Lcom/huawei/openalliance/ad/j/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/f;->b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/f$2;->b:Lcom/huawei/openalliance/ad/j/f;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/f$2;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "NativeVideoViewPresenter"

    const-string v1, "video cover image load failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/j/f$2$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/f$2$1;-><init>(Lcom/huawei/openalliance/ad/j/f$2;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
