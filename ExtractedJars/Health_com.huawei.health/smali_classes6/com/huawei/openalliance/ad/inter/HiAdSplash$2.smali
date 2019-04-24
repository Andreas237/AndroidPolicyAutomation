.class Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

.field final synthetic b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOaidAcquireFailed()V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onOaidAcquireFailed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    return-void
.end method

.method public onOaidAcquired(Ljava/lang/String;Z)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onOaidAcquired "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setOaid(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setTrackLimited(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    return-void
.end method
