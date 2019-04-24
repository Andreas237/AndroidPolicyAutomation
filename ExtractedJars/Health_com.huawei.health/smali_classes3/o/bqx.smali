.class public Lo/bqx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

.field protected c:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

.field private d:Ljava/lang/String;

.field protected e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqx;->c:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    .line 49
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/bqx;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()V
    .locals 4

    .line 125
    :try_start_0
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 127
    return-void

    .line 130
    :cond_0
    :try_start_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v2

    .line 131
    if-nez v2, :cond_1

    .line 134
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-interface {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onConnError()V

    goto :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-interface {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onStarted()V

    .line 140
    const/4 v3, 0x0

    .line 142
    new-instance v0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    invoke-direct {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;-><init>()V

    iput-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    .line 143
    iget-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    iget-object v1, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->setSNSHttpListener(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V

    .line 145
    iget-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    iget-object v1, p0, Lo/bqx;->c:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->doPostFilePool(Lo/bqb;)[B

    move-result-object v3

    .line 147
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-interface {v0, v3}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onDataReceived([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    :goto_0
    goto :goto_1

    .line 151
    :catch_0
    move-exception v2

    .line 153
    iget-object v0, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-interface {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onConnError()V

    .line 154
    const-string v0, "SNSUploadEntity"

    const-string v1, "executeFileUpload failed. IOException "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    :goto_1
    return-void
.end method

.method public d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/bqx;->c:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    .line 89
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/bqx;->d:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public e(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V
    .locals 1

    .line 98
    iput-object p1, p0, Lo/bqx;->b:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    .line 100
    iget-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/bqx;->e:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->setSNSHttpListener(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V

    .line 104
    :cond_0
    return-void
.end method
