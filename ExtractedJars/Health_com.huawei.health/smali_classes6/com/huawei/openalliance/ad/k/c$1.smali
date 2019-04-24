.class Lcom/huawei/openalliance/ad/k/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

.field final synthetic b:Lcom/huawei/openalliance/ad/k/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/c$1;->b:Lcom/huawei/openalliance/ad/k/c;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/c$1;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$1;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c$1;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$1;->b:Lcom/huawei/openalliance/ad/k/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$1;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c$1;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/k/c$1$1;

    invoke-direct {v0, p0, v2}, Lcom/huawei/openalliance/ad/k/c$1$1;-><init>(Lcom/huawei/openalliance/ad/k/c$1;Ljava/util/List;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
