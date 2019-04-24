.class Lcom/huawei/openalliance/ad/k/c$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/c$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/huawei/openalliance/ad/k/c$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/c$1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/c$1$1;->b:Lcom/huawei/openalliance/ad/k/c$1;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/c$1$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$1$1;->b:Lcom/huawei/openalliance/ad/k/c$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/k/c$1;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c$1$1;->b:Lcom/huawei/openalliance/ad/k/c$1;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/k/c$1;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c$1$1;->a:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
