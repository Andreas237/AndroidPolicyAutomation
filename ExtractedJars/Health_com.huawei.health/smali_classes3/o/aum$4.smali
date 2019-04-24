.class Lo/aum$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aum;->f(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aum;

.field final synthetic d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/aum;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 517
    iput-object p1, p0, Lo/aum$4;->c:Lo/aum;

    iput-object p2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCanceled()V
    .locals 4

    .line 581
    const-string v0, "MediaDownload"

    const-string v1, "getChatVoiceDownloadListener onCanceled"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 583
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 584
    return-void
.end method

.method public onCompleted(Ljava/lang/String;)V
    .locals 4

    .line 570
    const-string v0, "MediaDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getChatVoiceDownloadListener onCompleted filePath="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 572
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 573
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 574
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/apm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 576
    return-void
.end method

.method public onFailed(Ljava/lang/String;I)V
    .locals 7

    .line 538
    const-string v0, "MediaDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getChatVoiceDownloadListener onFailed msg = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",errCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0, p2, p1}, Lo/aum;->e(Lo/aum;ILjava/lang/String;)[I

    move-result-object v4

    .line 541
    array-length v0, v4

    if-nez v0, :cond_0

    .line 543
    return-void

    .line 545
    :cond_0
    const/4 v0, 0x0

    aget v5, v4, v0

    .line 546
    const/4 v0, 0x1

    aget v6, v4, v0

    .line 549
    const/16 v0, 0xcd

    if-ne v6, v0, :cond_1

    .line 551
    const-string v0, "MediaDownload"

    const-string v1, "getChatVoiceDownloadListener retry load original voice."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    return-void

    .line 558
    :cond_1
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 560
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 561
    const/4 v0, 0x2

    if-eq v5, v0, :cond_2

    const/4 v0, 0x6

    if-ne v5, v0, :cond_3

    .line 563
    :cond_2
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v2}, Lo/apm;->d(Ljava/lang/String;IZ)V

    .line 565
    :cond_3
    return-void
.end method

.method public onProgressChanged(I)V
    .locals 4

    .line 529
    const-string v0, "MediaDownload"

    const-string v1, "getChatVoiceDownloadListener onProgressChanged"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 531
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 532
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 533
    return-void
.end method

.method public onStarted()V
    .locals 4

    .line 521
    const-string v0, "MediaDownload"

    const-string v1, "getChatVoiceDownloadListener onStarted"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    iget-object v0, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setDownloadStatus(I)V

    .line 523
    iget-object v0, p0, Lo/aum$4;->c:Lo/aum;

    invoke-static {v0}, Lo/aum;->a(Lo/aum;)Lo/aur;

    move-result-object v0

    iget-object v1, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/aum$4;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lo/aur;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    .line 524
    return-void
.end method
