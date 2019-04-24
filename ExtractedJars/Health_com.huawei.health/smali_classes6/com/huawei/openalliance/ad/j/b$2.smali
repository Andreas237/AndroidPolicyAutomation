.class Lcom/huawei/openalliance/ad/j/b$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/b;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/b$2;->b:Lcom/huawei/openalliance/ad/j/b;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/b$2;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/b$2;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->checkHash()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/b$2;->b:Lcom/huawei/openalliance/ad/j/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/b$2;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/j/b;->a(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    :cond_0
    return-void
.end method
