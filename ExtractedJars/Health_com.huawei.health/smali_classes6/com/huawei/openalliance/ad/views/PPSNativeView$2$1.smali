.class Lcom/huawei/openalliance/ad/views/PPSNativeView$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/PPSNativeView$2;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/PPSNativeView$2;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2$1;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2$1;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/PPSNativeView$2;->a:Lcom/huawei/openalliance/ad/views/PPSNativeView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/PPSNativeView;->a(Lcom/huawei/openalliance/ad/views/PPSNativeView;Z)Z

    return-void
.end method
