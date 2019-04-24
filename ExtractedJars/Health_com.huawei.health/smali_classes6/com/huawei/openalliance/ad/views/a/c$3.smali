.class Lcom/huawei/openalliance/ad/views/a/c$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/a/c;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c$3;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$3;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;)Lcom/huawei/openalliance/ad/views/a/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$3;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;)Lcom/huawei/openalliance/ad/views/a/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/a/d;->a()V

    :cond_0
    return-void
.end method
