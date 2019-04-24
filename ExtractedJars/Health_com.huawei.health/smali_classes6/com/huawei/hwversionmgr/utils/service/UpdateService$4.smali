.class Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;
.super Lo/dps;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iput-object p2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->a:Ljava/lang/String;

    invoke-direct {p0}, Lo/dps;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 308
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 309
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandCheckNewVersionToActivate: FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 313
    return-void
.end method

.method public d(Lo/dow;)V
    .locals 4

    .line 302
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandCheckNewVersionToActivate: handleCheckSuccess  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V

    .line 304
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;->c:Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 305
    return-void
.end method
