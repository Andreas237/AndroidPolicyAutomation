.class Lcom/huawei/openalliance/ad/views/PPSWebView$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/PPSWebView;->b()V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$3;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$3;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->c(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$3;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->loadPage()V

    return-void
.end method
