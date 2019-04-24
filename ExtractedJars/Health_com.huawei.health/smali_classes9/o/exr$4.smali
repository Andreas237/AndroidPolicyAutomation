.class Lo/exr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exr;->c(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exn$d;

.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/exr;


# direct methods
.method constructor <init>(Lo/exr;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lo/exr$4;->e:Lo/exr;

    iput-object p2, p0, Lo/exr$4;->a:Lo/exn$d;

    iput-object p3, p0, Lo/exr$4;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 14

    .line 254
    const/4 v4, 0x0

    .line 255
    const/4 v5, -0x1

    .line 256
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 257
    const/4 v5, 0x0

    .line 258
    const/4 v6, 0x0

    .line 259
    const/16 v7, 0x7d0

    .line 260
    const/4 v8, 0x0

    .line 261
    const/4 v9, 0x0

    .line 262
    const/4 v10, 0x0

    .line 263
    const/4 v11, 0x0

    .line 265
    sget-object v0, Lo/exr$10;->a:[I

    iget-object v1, p0, Lo/exr$4;->a:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 267
    :pswitch_0
    move-object/from16 v12, p2

    check-cast v12, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;

    .line 268
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMaxHeartRate()I

    move-result v6

    .line 269
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getMinHeartRate()I

    move-result v7

    .line 270
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateSummary;->getAvgRestHeartRate()I

    move-result v9

    .line 272
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->c(I)V

    .line 273
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/exm;->a(I)V

    .line 274
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/exm;->d(I)V

    .line 275
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/exm;->i(I)V

    .line 276
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v4

    .line 277
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData mHeartRateUIDataDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->c(Lo/exr;)Lo/exm;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    goto/16 :goto_0

    .line 282
    :pswitch_1
    move-object/from16 v13, p2

    check-cast v13, Ljava/util/List;

    .line 283
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    const/4 v1, 0x1

    invoke-static {v0, v13, v1}, Lo/exr;->b(Lo/exr;Ljava/util/List;I)I

    move-result v6

    .line 284
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    const/4 v1, 0x2

    invoke-static {v0, v13, v1}, Lo/exr;->b(Lo/exr;Ljava/util/List;I)I

    move-result v7

    .line 285
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    const/4 v1, 0x3

    invoke-static {v0, v13, v1}, Lo/exr;->b(Lo/exr;Ljava/util/List;I)I

    move-result v9

    .line 287
    sget-object v0, Lo/exn$d;->e:Lo/exn$d;

    iget-object v1, p0, Lo/exr$4;->a:Lo/exn$d;

    if-ne v0, v1, :cond_0

    .line 288
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->c(I)V

    .line 289
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/exm;->a(I)V

    .line 290
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/exm;->d(I)V

    .line 291
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/exm;->i(I)V

    .line 292
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/exm;->a(Ljava/util/List;)V

    .line 293
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v4

    .line 294
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData mHeartRateUIDataWeek = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->f(Lo/exr;)Lo/exm;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 295
    :cond_0
    sget-object v0, Lo/exn$d;->b:Lo/exn$d;

    iget-object v1, p0, Lo/exr$4;->a:Lo/exn$d;

    if-ne v0, v1, :cond_1

    .line 296
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->c(I)V

    .line 297
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/exm;->a(I)V

    .line 298
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/exm;->d(I)V

    .line 299
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/exm;->i(I)V

    .line 300
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/exm;->a(Ljava/util/List;)V

    .line 301
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v4

    .line 302
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData mHeartRateUIDataMonth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->i(Lo/exr;)Lo/exm;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 304
    :cond_1
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/exm;->c(I)V

    .line 305
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/exm;->a(I)V

    .line 306
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/exm;->d(I)V

    .line 307
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/exm;->i(I)V

    .line 308
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/exm;->a(Ljava/util/List;)V

    .line 309
    iget-object v0, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v0}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v4

    .line 310
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData mHeartRateUIDataYear = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exr$4;->e:Lo/exr;

    invoke-static {v3}, Lo/exr;->h(Lo/exr;)Lo/exm;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    .line 317
    :goto_0
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData maxValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  minValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " avgValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " lastValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    :cond_2
    iget-object v0, p0, Lo/exr$4;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 323
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 324
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailData callbackResponse.onResponse resultData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 326
    :cond_3
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestHeartRateDetailData callbackResponse.onResponse resultData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_1
    iget-object v0, p0, Lo/exr$4;->c:Lo/egg;

    invoke-interface {v0, v5, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 331
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
