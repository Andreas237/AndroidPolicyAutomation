.class Lcom/huawei/openalliance/ad/h/a$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

.field final synthetic b:Lcom/huawei/openalliance/ad/h/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/a$3;->b:Lcom/huawei/openalliance/ad/h/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/h/a$3;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-string v0, "AdMediator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doAdRequest "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$3;->b:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/h/a;)Lcom/huawei/openalliance/ad/k/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/h/a$3;->b:Lcom/huawei/openalliance/ad/h/a;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/h/a;->e()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/h/a$3;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/b;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$3;->b:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v0, v5, v3, v4}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V

    return-void
.end method
