.class Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->loadAds(ILjava/lang/String;Z)V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    iput p2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->a:I

    iput-object p3, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOaidAcquireFailed()V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a()Ljava/lang/String;

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

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->a:I

    iget-object v2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->b:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->c:Z

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V

    return-void
.end method

.method public onOaidAcquired(Ljava/lang/String;Z)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a()Ljava/lang/String;

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

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->d:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->a:I

    iget-object v2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->b:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;->c:Z

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V

    return-void
.end method
