.class Lo/btb$4;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btb;->d(Lcom/huawei/health/suggestion/model/Media;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/btb;

.field final synthetic c:Lcom/huawei/health/suggestion/model/Media;


# direct methods
.method constructor <init>(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/btb$4;->b:Lo/btb;

    iput-object p2, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 138
    iget-object v0, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setFinished(Z)V

    .line 140
    iget-object v0, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    iget-object v1, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Media;->getLength()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/model/Media;->setDownloadLength(J)V

    .line 141
    const-string v0, "DownloadTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\u4e0b\u8f7d\u5b8c\u6210"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 144
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    iget-object v1, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-static {v0, v1}, Lo/btb;->a(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->a(Lo/btb;)Z

    goto :goto_0

    .line 147
    :cond_0
    const-string v0, "DownloadTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "MESSAGE_SUCCESS"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 150
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 123
    const-string v0, "DownloadTask"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->e(Lo/btb;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    .line 126
    const/4 v0, 0x3

    if-gt v4, v0, :cond_0

    const/4 v0, -0x2

    if-eq p1, v0, :cond_0

    .line 127
    const-string v0, "DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download error url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const-string v0, "DownloadTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download error retry times:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/model/Media;->setDownloadLength(J)V

    .line 130
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v1}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    const/4 v3, 0x5

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 134
    :goto_0
    return-void
.end method

.method public e(JJZ)V
    .locals 3

    .line 155
    iget-object v0, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    iget-object v1, p0, Lo/btb$4;->c:Lcom/huawei/health/suggestion/model/Media;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Media;->getLength()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/model/Media;->setDownloadLength(J)V

    .line 156
    iget-object v0, p0, Lo/btb$4;->b:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 157
    return-void
.end method
