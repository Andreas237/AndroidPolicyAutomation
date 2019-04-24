.class Lcom/huawei/openalliance/ad/j/i$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/i$1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/i$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/i$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/i$1$2;->a:Lcom/huawei/openalliance/ad/j/i$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/i$1$2;->a:Lcom/huawei/openalliance/ad/j/i$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/i$1;->a:Lcom/huawei/openalliance/ad/j/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/i;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/b;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/b;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/i$1$2;->a:Lcom/huawei/openalliance/ad/j/i$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/i$1;->a:Lcom/huawei/openalliance/ad/j/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/i;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/b;->a()V

    return-void
.end method
