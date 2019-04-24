.class Lo/exo$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->c(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exo;

.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/exn$d;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 1272
    iput-object p1, p0, Lo/exo$9;->b:Lo/exo;

    iput-object p2, p0, Lo/exo$9;->e:Lo/exn$d;

    iput-object p3, p0, Lo/exo$9;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 1275
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1276
    const/4 v5, -0x1

    .line 1277
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$9;->e:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1279
    :sswitch_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1280
    const/4 v5, 0x0

    .line 1281
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1282
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 1283
    move-object v7, p2

    check-cast v7, Ljava/util/List;

    .line 1284
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 1285
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;

    .line 1286
    new-instance v10, Lo/eux;

    invoke-direct {v10}, Lo/eux;-><init>()V

    .line 1287
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getHeartRateValue()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/eux;->c(I)V

    .line 1288
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetail;->getTimeStamp()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/eux;->a(J)V

    .line 1289
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1290
    const-string v0, "HeartRateData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetail FitnessHistogramData value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lo/eux;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  FitnessHistogramData startPoint = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1291
    invoke-virtual {v10}, Lo/eux;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1290
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1292
    goto :goto_0

    .line 1294
    :cond_0
    move-object v4, v6

    .line 1296
    .line 1302
    :cond_1
    :goto_1
    iget-object v0, p0, Lo/exo$9;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1303
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetail callbackResponse.onResponse sucess resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1304
    iget-object v0, p0, Lo/exo$9;->c:Lo/egg;

    invoke-interface {v0, v5, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1306
    :cond_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
    .end sparse-switch
.end method
