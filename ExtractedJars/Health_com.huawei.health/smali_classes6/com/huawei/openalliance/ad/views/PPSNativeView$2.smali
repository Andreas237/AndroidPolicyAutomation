.class Lcom/huawei/openalliance/ad/views/PPSNativeView$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/PPSNativeView;
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->b(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Lcom/huawei/openalliance/ad/views/PPSNativeView;Z)Z

    const-string v0, "PPSNativeView"

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/j/a/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/b;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->c()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->d(Lcom/huawei/openalliance/ad/views/PPSNativeView;)Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$OnNativeAdClickListener;->onClick()V

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/PPSNativeView$2$1;-><init>(Lcom/huawei/openalliance/ad/views/PPSNativeView$2;)V

    const-wide/16 v1, 0x2bc

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;J)V

    return-void
.end method
