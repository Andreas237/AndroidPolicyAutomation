.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;
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
.field final synthetic c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 674
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {p0}, Lo/dpp;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 682
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadFailed: statusCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    const/16 v0, 0x19

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 684
    return-void
.end method

.method public c(Lo/doq;)V
    .locals 0

    .line 678
    return-void
.end method

.method public e(Lo/doq;)V
    .locals 5

    .line 688
    iget-object v4, p1, Lo/doq;->a:Ljava/lang/String;

    .line 689
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoDownloadSuccess: band path: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 690
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dpb;->a(Ljava/lang/String;)V

    .line 691
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/String;)V

    .line 692
    const/16 v0, 0x1a

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 693
    return-void
.end method
