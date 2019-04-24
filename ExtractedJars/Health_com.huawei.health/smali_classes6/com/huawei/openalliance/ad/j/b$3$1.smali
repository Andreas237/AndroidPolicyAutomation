.class Lcom/huawei/openalliance/ad/j/b$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/b$3;->a(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/b$3;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/b$3;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/b$3$1;->b:Lcom/huawei/openalliance/ad/j/b$3;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/b$3$1;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/b$3$1;->b:Lcom/huawei/openalliance/ad/j/b$3;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/b$3;->b:Lcom/huawei/openalliance/ad/j/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/b;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/activity/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/b$3$1;->b:Lcom/huawei/openalliance/ad/j/b$3;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/j/b$3;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/j/b$3$1;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/activity/a/a;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V

    return-void
.end method
