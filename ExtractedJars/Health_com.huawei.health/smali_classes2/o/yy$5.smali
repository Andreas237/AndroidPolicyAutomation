.class Lo/yy$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/yy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/yy;


# direct methods
.method constructor <init>(Lo/yy;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/yy$5;->c:Lo/yy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 240
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mServiceConnectedListener err_code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mServiceConnectedListener objData: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    const v0, 0x186a0

    if-ne v0, p1, :cond_0

    .line 243
    const-string v0, "HealthAdapter_HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServiceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    iget-object v1, p0, Lo/yy$5;->c:Lo/yy;

    invoke-static {v1}, Lo/yy;->e(Lo/yy;)Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    move-result-object v1

    invoke-interface {v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->getDeviceCapability()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v0, v1}, Lo/yy;->a(Lo/yy;Lorg/json/JSONObject;)V

    .line 245
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    invoke-virtual {v0}, Lo/yy;->a()V

    .line 247
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    invoke-static {v0}, Lo/yy;->d(Lo/yy;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    invoke-static {v0}, Lo/yy;->e(Lo/yy;)Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 249
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    invoke-static {v0}, Lo/yy;->e(Lo/yy;)Lcom/huawei/exercise/modle/IExerciseAdviceCallback;

    move-result-object v0

    iget-object v1, p0, Lo/yy$5;->c:Lo/yy;

    invoke-static {v1}, Lo/yy;->b(Lo/yy;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/exercise/modle/IExerciseAdviceCallback;->registerConnectionStatusChangeNotification(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 250
    iget-object v0, p0, Lo/yy$5;->c:Lo/yy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/yy;->d(Lo/yy;Z)Z

    .line 254
    :cond_0
    return-void
.end method
