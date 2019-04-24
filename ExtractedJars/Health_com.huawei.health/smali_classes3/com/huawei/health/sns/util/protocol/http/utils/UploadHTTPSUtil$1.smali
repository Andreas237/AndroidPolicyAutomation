.class Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bqe;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->doPostFilePool(Lo/bqb;)[B
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field index:I

.field final synthetic this$0:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;)V
    .locals 1

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->this$0:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->index:I

    return-void
.end method


# virtual methods
.method public onProgress(JJ)V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->this$0:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->access$000(Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;)Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 112
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->index:I

    int-to-long v0, v0

    const-wide/16 v2, 0x8

    div-long v2, p3, v2

    mul-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 114
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->index:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->index:I

    .line 116
    const-wide/16 v0, 0x55

    mul-long/2addr v0, p1

    div-long/2addr v0, p3

    long-to-int v4, v0

    .line 117
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil$1;->this$0:Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;->access$000(Lcom/huawei/health/sns/util/protocol/http/utils/UploadHTTPSUtil;)Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/health/sns/util/protocol/http/utils/ISNSHttpListener;->onProgressChanged(I)V

    .line 121
    :cond_0
    return-void
.end method
