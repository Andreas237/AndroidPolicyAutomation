.class Lcom/huawei/openalliance/ad/j/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/i;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/i;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/i;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/i$1;->a:Lcom/huawei/openalliance/ad/j/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "PPSImageViewPresenter"

    const-string v1, "onMaterialLoaded - image load failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/i$1$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/i$1$2;-><init>(Lcom/huawei/openalliance/ad/j/i$1;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "PPSImageViewPresenter"

    const-string v1, "onMaterialLoaded - image load success"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/i$1$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/i$1$1;-><init>(Lcom/huawei/openalliance/ad/j/i$1;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
