.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;
.super Lo/dpp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 702
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {p0}, Lo/dpp;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 706
    const-string v0, "UpdateService"

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

    .line 707
    const/16 v0, 0x16

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 708
    return-void
.end method

.method public c(Lo/doq;)V
    .locals 6

    .line 734
    const-string v0, "UpdateService"

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

    .line 735
    const-string v0, "UpdateService"

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

    .line 737
    iget-wide v0, p1, Lo/doq;->e:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p1, Lo/doq;->c:J

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 738
    const/16 v0, 0x15

    invoke-static {v0, v5}, Lo/dpr;->c(II)V

    .line 739
    return-void
.end method

.method public e(Lo/doq;)V
    .locals 5

    .line 712
    const-string v0, "UpdateService"

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

    .line 713
    iget-object v4, p1, Lo/doq;->a:Ljava/lang/String;

    .line 714
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", strAppStorePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 717
    :cond_0
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadSuccess APP_AUTO_UPDATE: !isSameApkSignatures(mContext, strAppStorePath) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v4}, Lo/dpr;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dpr;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 719
    const/16 v0, 0x16

    const/16 v1, 0x2f

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 720
    return-void

    .line 722
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dpb;->e(Ljava/lang/String;)V

    .line 723
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->i(Ljava/lang/String;)V

    .line 725
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 726
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dpb;->a(Ljava/lang/String;)V

    .line 727
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;->b:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/String;)V

    .line 729
    :cond_5
    const/16 v0, 0x17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 730
    return-void
.end method
