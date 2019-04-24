.class Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/down/DownloadTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ProgressRefreshHandler"
.end annotation


# instance fields
.field private d:Lcom/huawei/wallet/logic/down/DownloadTask;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/wallet/logic/down/DownloadTask;)V
    .locals 0

    .line 471
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 472
    iput-object p2, p0, Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;->d:Lcom/huawei/wallet/logic/down/DownloadTask;

    .line 473
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 478
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;->d:Lcom/huawei/wallet/logic/down/DownloadTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;->d:Lcom/huawei/wallet/logic/down/DownloadTask;

    invoke-static {v0, p1}, Lcom/huawei/wallet/logic/down/DownloadTask;->c(Lcom/huawei/wallet/logic/down/DownloadTask;Landroid/os/Message;)V

    .line 484
    :cond_0
    return-void
.end method
