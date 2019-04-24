.class Lcom/huawei/openalliance/ad/j/j$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/j$4;->a(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/j$4;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/j$4;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j$4$1;->b:Lcom/huawei/openalliance/ad/j/j$4;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/j$4$1;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/j$4$1;->b:Lcom/huawei/openalliance/ad/j/j$4;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/j$4;->a:Lcom/huawei/openalliance/ad/j/j;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/j$4$1;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/j/j;->a(Lcom/huawei/openalliance/ad/j/j;Landroid/graphics/Bitmap;)V

    return-void
.end method
