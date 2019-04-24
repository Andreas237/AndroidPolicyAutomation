.class public Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final INTERVAL_PERCENT:I = 0x55

.field private static final INTERVAL_TIMES:I = 0x8

.field private static final TAG:Ljava/lang/String; = "UploadHTTPSUtil"


# instance fields
.field private isCanceled:Z

.field private listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->isCanceled:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;)Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    return-object v0
.end method


# virtual methods
.method public doPostFilePool(Lo/bqb;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 92
    if-nez p1, :cond_0

    .line 94
    const-string v0, "UploadHTTPSUtil"

    const-string v1, "param requestBean is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    return-object v2

    .line 98
    :cond_0
    const-string v0, "UploadHTTPSUtil"

    const-string v1, "upload complete. read response."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const/4 v3, 0x0

    .line 103
    :try_start_0
    new-instance v0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;-><init>(Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;)V

    invoke-static {p1, v0}, Lo/bpy;->a(Lo/bqb;Lo/bqe;)Lo/bqg;

    move-result-object v0

    move-object v3, v0

    .line 124
    invoke-virtual {v3}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->d()[B

    move-result-object v2

    goto :goto_0

    .line 130
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "upload file failed, message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 131
    invoke-virtual {v3}, Lo/bqg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 130
    const v1, 0x14ffe

    invoke-static {v1, v0}, Lo/bpj;->b(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :goto_0
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 139
    goto :goto_1

    .line 138
    :catchall_0
    move-exception v4

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 139
    throw v4

    .line 141
    :goto_1
    const-string v0, "UploadHTTPSUtil"

    const-string v1, "read response complete."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    if-eqz v0, :cond_2

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    const/16 v1, 0x5f

    invoke-interface {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onProgressChanged(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    invoke-interface {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onCompleted()V

    .line 150
    :cond_2
    return-object v2
.end method

.method public isCanceled()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->isCanceled:Z

    return v0
.end method

.method public setCanceled(Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->isCanceled:Z

    .line 69
    return-void
.end method

.method public setSNSHttpListener(Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    .line 79
    return-void
.end method
