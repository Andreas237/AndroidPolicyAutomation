.class public Lo/bqs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

.field private d:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

.field private e:I

.field private f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-string v0, "SNSDownloadEntity"

    sput-object v0, Lo/bqs;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/bqs;->e:I

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 1

    .line 185
    iget-object v0, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 189
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 112
    const-string v0, "excuteFileDownload"

    const-string v1, "Enter excuteFileDownload"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :try_start_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v3

    .line 117
    if-nez v3, :cond_0

    .line 120
    const-string v0, "net work not connection"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/bqs;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 125
    :cond_0
    new-instance v0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    invoke-direct {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;-><init>()V

    iput-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    .line 126
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    iget-object v1, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->setListener(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 128
    iget v4, p0, Lo/bqs;->e:I

    .line 130
    if-gtz v4, :cond_1

    .line 132
    const/4 v4, 0x5

    .line 135
    :cond_1
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->addProgress(I)V

    .line 137
    iget-object v0, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    invoke-interface {v0, v4}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onProgressChanged(I)V

    .line 142
    :cond_2
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    iget-object v1, p0, Lo/bqs;->d:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->doPostDownloadMedia(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    goto :goto_1

    .line 145
    :catch_0
    move-exception v3

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/bqs;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", excuteFileDownload "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/bqs;->a(Ljava/lang/String;I)V

    .line 148
    sget-object v0, Lo/bqs;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "excuteFileDownload failed. IOException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :goto_1
    return-void
.end method

.method public b()I
    .locals 1

    .line 160
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->getCurrentProgress()I

    move-result v0

    return v0

    .line 164
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 2

    .line 196
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->setCanceled(Z)V

    .line 200
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 174
    iput p1, p0, Lo/bqs;->e:I

    .line 175
    return-void
.end method

.method public c(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/bqs;->d:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;

    .line 58
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/bqs;->a:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/bqs;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    return-object v0
.end method

.method public e(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V
    .locals 1

    .line 77
    iput-object p1, p0, Lo/bqs;->f:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    .line 79
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/bqs;->b:Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->setListener(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 83
    :cond_0
    return-void
.end method
