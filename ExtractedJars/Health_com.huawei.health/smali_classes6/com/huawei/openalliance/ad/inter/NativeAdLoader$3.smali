.class Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->f(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;->onAdsLoaded(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
