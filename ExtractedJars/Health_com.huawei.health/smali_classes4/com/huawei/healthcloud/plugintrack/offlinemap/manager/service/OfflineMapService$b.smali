.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 291
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 292
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Landroid/os/Message;)V
    .locals 12

    .line 297
    iget-object v4, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 298
    const/4 v5, 0x0

    .line 300
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 304
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v7

    .line 305
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 307
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler MSG_GET_DATA_SUCCESS bundle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    return-void

    .line 310
    :cond_0
    const-string v0, "TAG_MSG_SEND_INTENT"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 311
    const-string v0, "TAG_MSG_SEND_LIST"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v9

    .line 312
    instance-of v0, v9, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    if-eqz v0, :cond_1

    .line 314
    move-object v10, v9

    check-cast v10, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    .line 315
    invoke-static {p1, v8, v10}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V

    .line 317
    :cond_1
    const-string v0, "TAG_IS_CHECK_UPDATE"

    invoke-virtual {v7, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    .line 318
    if-eqz v10, :cond_8

    .line 320
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler MSG_GET_DATA_SUCCESS isInitActivity OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z

    .line 322
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z

    goto/16 :goto_0

    .line 327
    :pswitch_1
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RECEIVE_DESTROY_SERVICE11="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x6b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->stopSelf()V

    .line 329
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 330
    goto/16 :goto_0

    .line 332
    :pswitch_2
    instance-of v0, v4, Landroid/content/Intent;

    if-eqz v0, :cond_2

    .line 334
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 335
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 336
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    .line 337
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    goto/16 :goto_0

    .line 341
    :cond_2
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler MSG_RECEIVE_LOAD_CITY obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    goto/16 :goto_0

    .line 345
    :pswitch_3
    instance-of v0, v4, Landroid/content/Intent;

    if-eqz v0, :cond_4

    .line 347
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 348
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 349
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 350
    const-string v0, "TAG_BOOLEAN_ISRESTART_AS"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v11

    .line 351
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    .line 352
    if-eqz v11, :cond_3

    .line 354
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)V

    .line 356
    :cond_3
    goto/16 :goto_0

    .line 359
    :cond_4
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler RECEIVE_DELETE_CITY obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    goto/16 :goto_0

    .line 363
    :pswitch_4
    instance-of v0, v4, Landroid/content/Intent;

    if-eqz v0, :cond_5

    .line 365
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 366
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 367
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    .line 368
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    goto/16 :goto_0

    .line 372
    :cond_5
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler RECEIVE_PAUSE_CITY obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    goto/16 :goto_0

    .line 376
    :pswitch_5
    instance-of v0, v4, Landroid/content/Intent;

    if-eqz v0, :cond_6

    .line 378
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 379
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 380
    if-eqz v6, :cond_8

    .line 381
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    goto :goto_0

    .line 386
    :cond_6
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler RECEIVE_UPDATE_CITY obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    goto :goto_0

    .line 390
    :pswitch_6
    instance-of v0, v4, Landroid/content/Intent;

    if-eqz v0, :cond_7

    .line 392
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 393
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z

    .line 394
    const-string v0, "TAG_ONE_CITY_STRING_AS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 395
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    goto :goto_0

    .line 399
    :cond_7
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler RECEIVE_WAIT_CITY obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    goto :goto_0

    .line 403
    :pswitch_7
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z

    .line 404
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 405
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 406
    .line 410
    :cond_8
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_1
        :pswitch_7
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 286
    move-object v0, p1

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Landroid/os/Message;)V

    return-void
.end method
