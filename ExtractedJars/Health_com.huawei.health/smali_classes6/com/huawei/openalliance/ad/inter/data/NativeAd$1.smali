.class Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/data/NativeAd;->isValid()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/openalliance/ad/inter/data/NativeAd;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;->this$0:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;->this$0:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->access$000(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;->this$0:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->access$000(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;->this$0:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->access$100(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;->call()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
