.class Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->b(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$7;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->c(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)Lcom/huawei/openalliance/ad/download/app/AppStatus;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$OnDownloadStatusChangedListener;->onStatusChanged(Lcom/huawei/openalliance/ad/download/app/AppStatus;)V

    :cond_0
    return-void
.end method
