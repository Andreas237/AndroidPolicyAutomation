.class Lcom/huawei/openalliance/ad/views/PPSWebView$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/PPSWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/PPSWebView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$2;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->b(Lcom/huawei/openalliance/ad/views/PPSWebView;)I

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
