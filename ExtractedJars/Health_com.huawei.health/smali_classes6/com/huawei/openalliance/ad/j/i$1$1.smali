.class Lcom/huawei/openalliance/ad/j/i$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/i$1;->a(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/i$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/i$1;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/i$1$1;->b:Lcom/huawei/openalliance/ad/j/i$1;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/i$1$1;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/i$1$1;->b:Lcom/huawei/openalliance/ad/j/i$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/i$1;->a:Lcom/huawei/openalliance/ad/j/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/i;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/i$1$1;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/b;->a(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/i$1$1;->b:Lcom/huawei/openalliance/ad/j/i$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/i$1;->a:Lcom/huawei/openalliance/ad/j/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/i;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/b;->d()V

    return-void
.end method
