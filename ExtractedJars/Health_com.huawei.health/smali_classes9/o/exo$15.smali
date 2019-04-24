.class Lo/exo$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->d(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exn$d;

.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 1411
    iput-object p1, p0, Lo/exo$15;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$15;->b:Lo/exn$d;

    iput-object p3, p0, Lo/exo$15;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 1414
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1415
    const/4 v5, -0x1

    .line 1416
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1417
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$15;->b:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1422
    :pswitch_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestLastHeartRateDetail err_code 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1423
    const/4 v5, 0x0

    .line 1424
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1425
    move-object v6, p2

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    .line 1426
    new-instance v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;-><init>()V

    .line 1427
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getHeartRateValue()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->setHeartRate(I)V

    .line 1428
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getTimeStamp()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->setTimeStamp(J)V

    .line 1429
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestLastHeartRateDetail retTepData setHeartRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getHeartRateValue()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1430
    move-object v4, v7

    .line 1431
    goto :goto_1

    .line 1434
    :goto_0
    :pswitch_1
    const/4 v5, 0x0

    .line 1435
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1440
    :cond_0
    :goto_1
    iget-object v0, p0, Lo/exo$15;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1441
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestLastHeartRateDetail callbackResponse.onResponse sucess resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1442
    iget-object v0, p0, Lo/exo$15;->c:Lo/egg;

    invoke-interface {v0, v5, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1444
    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
