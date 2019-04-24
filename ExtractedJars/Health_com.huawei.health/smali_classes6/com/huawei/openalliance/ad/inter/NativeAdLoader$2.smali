.class Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(ILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    iput p2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->a:I

    iput-object p3, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doRequestAd "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    invoke-direct {v5}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setAdIds(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->a:I

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setDeviceType(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setRequestSequence(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setOrientation(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/a;->a(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setWidth(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/a;->b(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setHeight(I)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->b(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setOaid(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setTrackLimited(Ljava/lang/Boolean;)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->c:Z

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->setTest(Z)Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;

    new-instance v6, Lcom/huawei/openalliance/ad/k/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/huawei/openalliance/ad/k/a;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam$Builder;->build()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/openalliance/ad/k/a;->b(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v7

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "doRequestAd, ad loaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->e(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Lcom/huawei/openalliance/ad/k/b/e;

    move-result-object v0

    invoke-interface {v0, v7, v3, v4}, Lcom/huawei/openalliance/ad/k/b/e;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    sget-object v1, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;->a:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;)Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    return-void
.end method
