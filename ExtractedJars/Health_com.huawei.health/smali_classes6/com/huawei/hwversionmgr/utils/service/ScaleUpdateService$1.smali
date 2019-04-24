.class Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;
.super Lo/dpp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {p0}, Lo/dpp;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 127
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadFailed: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/16 v0, 0x16

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 129
    return-void
.end method

.method public c(Lo/doq;)V
    .locals 6

    .line 146
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doInDownloadProgress: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doInDownloadProgress() total="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p1, Lo/doq;->c:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",cur="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p1, Lo/doq;->e:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-wide v0, p1, Lo/doq;->e:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p1, Lo/doq;->c:J

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 150
    const/16 v0, 0x15

    invoke-static {v0, v5}, Lo/dpr;->c(II)V

    .line 151
    return-void
.end method

.method public e(Lo/doq;)V
    .locals 5

    .line 133
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadSuccess: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v4, p1, Lo/doq;->a:Ljava/lang/String;

    .line 135
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", strAppStorePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ", mReportSuccess = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    .line 136
    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 135
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 138
    :cond_0
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dpc;->b(Ljava/lang/String;)V

    .line 139
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;->e:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpc;->e(Ljava/lang/String;)V

    .line 141
    :cond_1
    const/16 v0, 0x17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 142
    return-void
.end method
