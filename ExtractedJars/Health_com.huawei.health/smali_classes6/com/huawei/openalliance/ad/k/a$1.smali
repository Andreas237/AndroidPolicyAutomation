.class Lcom/huawei/openalliance/ad/k/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/huawei/openalliance/ad/k/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/a;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/a$1;->b:Lcom/huawei/openalliance/ad/k/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/a$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a$1;->b:Lcom/huawei/openalliance/ad/k/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/a;->a(Lcom/huawei/openalliance/ad/k/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a$1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setKey([B)V

    new-instance v6, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a$1;->b:Lcom/huawei/openalliance/ad/k/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/a;->a(Lcom/huawei/openalliance/ad/k/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/a$1;->b:Lcom/huawei/openalliance/ad/k/a;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/k/a;->a(Lcom/huawei/openalliance/ad/k/a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v2

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    invoke-interface {v6, v5}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-interface {v6}, Lcom/huawei/openalliance/ad/k/b/d;->g()V

    goto :goto_0

    :cond_1
    return-void
.end method
