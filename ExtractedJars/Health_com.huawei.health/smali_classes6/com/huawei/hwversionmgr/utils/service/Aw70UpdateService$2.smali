.class Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;
.super Lo/dpq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-direct {p0}, Lo/dpq;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 305
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAW70PullChangeLogHandler pullChangeLogFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    .line 309
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 310
    const/16 v0, 0x1f

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 312
    :cond_0
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dpd;>;)V"
        }
    .end annotation

    .line 316
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAW70PullChangeLogHandler pullChangeLogSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;I)I

    .line 318
    const-string v6, ""

    .line 319
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 320
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dpd;

    invoke-virtual {v1}, Lo/dpd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dpd;

    invoke-virtual {v1}, Lo/dpd;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 324
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAW70PullChangeLogHandler pullChangeLogSuccess() i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Title = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 325
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/dpd;

    invoke-virtual {v3}, Lo/dpd;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/dpd;

    invoke-virtual {v3}, Lo/dpd;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 324
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 328
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BAND_AUTO_UPDATE()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 330
    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v2

    move-object v3, v6

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v5

    .line 329
    const/16 v0, 0xe

    invoke-static/range {v0 .. v5}, Lo/dpr;->b(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 333
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BAND_MANUAL_UPDATE()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 335
    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v1

    .line 334
    const/16 v2, 0x20

    const/4 v3, 0x0

    invoke-static {v2, v3, v6, v0, v1}, Lo/dpr;->e(IILjava/lang/String;Ljava/lang/String;I)V

    .line 337
    :cond_2
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAW70PullChangeLogHandler pullChangeLogSuccess() strFeatures = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 339
    :cond_3
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAW70PullChangeLogHandler pullChangeLogSuccess() feature is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;->a:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->stopSelf()V

    .line 343
    return-void
.end method
