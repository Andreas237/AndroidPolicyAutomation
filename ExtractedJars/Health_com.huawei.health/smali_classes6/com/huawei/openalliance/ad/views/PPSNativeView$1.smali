.class Lcom/huawei/openalliance/ad/views/PPSNativeView$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/PPSNativeView;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/PPSNativeView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/PPSNativeView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$1;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$1;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$1;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdStatusChangedListener;->onStatusChanged()V

    :cond_0
    return-void
.end method
