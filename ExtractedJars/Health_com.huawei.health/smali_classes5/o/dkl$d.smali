.class Lo/dkl$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/dkl;


# direct methods
.method public constructor <init>(Lo/dkl;Landroid/os/Looper;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lo/dkl$d;->a:Lo/dkl;

    .line 332
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 333
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 337
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 338
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 340
    :sswitch_0
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_ACTION_WEATHER_REPORT_DELAY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkl;->a(Landroid/location/Location;)Landroid/location/Location;

    .line 343
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->k(Lo/dkl;)V

    .line 344
    goto/16 :goto_0

    .line 346
    :sswitch_1
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_LOCATION_TIME_OUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->g(Lo/dkl;)V

    .line 349
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_GET_LOCATION_TIME_OUT retryNum : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->h(Lo/dkl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->c(Lo/dkl;Z)Z

    .line 351
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ask location time out ,gps registe:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->i(Lo/dkl;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "locationTimeOutFrom:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->f(Lo/dkl;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "sendLocationTimeOut:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->l(Lo/dkl;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->f(Lo/dkl;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->l(Lo/dkl;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 354
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->d(Lo/dkl;I)I

    .line 356
    :cond_0
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    iget-object v1, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->l(Lo/dkl;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkl;->e(Lo/dkl;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->h(Lo/dkl;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 358
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    iget-object v1, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->h(Lo/dkl;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/dkl;->d(Lo/dkl;I)I

    .line 360
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x12c

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 362
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;I)V

    goto/16 :goto_0

    .line 364
    :cond_1
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_LOCATION_TIME_OUT retryNum > 3 ,do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;Z)Z

    .line 366
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->d(Lo/dkl;I)I

    .line 367
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 369
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;I)V

    .line 371
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->n(Lo/dkl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "WEATHER_LATITUDE_KEY"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 372
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->n(Lo/dkl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "WEATHER_LONGITUDE_KEY"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 373
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 374
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 375
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 376
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0, v6, v7, v8, v9}, Lo/dkl;->d(Lo/dkl;DD)V

    .line 380
    :cond_2
    goto/16 :goto_0

    .line 382
    :sswitch_2
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_LOCATION_TIME_OUT_RETRY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->i(Lo/dkl;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 384
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "request location,have send GPS ask "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    return-void

    .line 387
    :cond_3
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dkl;->c(Lo/dkl;Z)Z

    .line 388
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->g(Lo/dkl;)V

    .line 390
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->m(Lo/dkl;)Lo/dhg;

    move-result-object v0

    iget-object v1, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->p(Lo/dkl;)Lo/dhj;

    move-result-object v1

    const-string v2, "wearWeatherLocation"

    invoke-virtual {v0, v1, v2}, Lo/dhg;->e(Lo/dhj;Ljava/lang/String;)V

    .line 392
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc8

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 393
    goto :goto_0

    .line 395
    :sswitch_3
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MSG_GET_WEATHER_FAILED_RETRY retryNetWorkNum: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->o(Lo/dkl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->o(Lo/dkl;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_4

    invoke-static {}, Lo/dkl;->a()Landroid/location/Location;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 397
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->r(Lo/dkl;)V

    .line 399
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;I)V

    goto :goto_0

    .line 401
    :cond_4
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_WEATHER_FAILED_RETRY retryNetWorkNum > 3 , do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->a(Lo/dkl;I)I

    .line 404
    iget-object v0, p0, Lo/dkl$d;->a:Lo/dkl;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;I)V

    .line 406
    .line 410
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0xc8 -> :sswitch_1
        0x12c -> :sswitch_2
        0x190 -> :sswitch_3
    .end sparse-switch
.end method
