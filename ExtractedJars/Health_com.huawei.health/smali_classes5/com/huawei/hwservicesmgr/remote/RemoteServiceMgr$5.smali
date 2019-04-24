.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 313
    const/4 v0, 0x0

    if-eq v0, p1, :cond_8

    .line 314
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 316
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 317
    const-string v0, "deviceinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 318
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 319
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver() status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const-string v0, "product_type"

    :try_start_0
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 322
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 324
    :sswitch_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1500()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;->removeMessages(I)V

    .line 325
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 326
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$400()Lcom/google/gson/Gson;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$300()Lo/dea;

    move-result-object v2

    invoke-virtual {v2}, Lo/dea;->d()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->c(Ljava/lang/String;)V

    .line 327
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$500()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/List;)V

    .line 328
    const-string v0, "state"

    const-string v1, "health_deviceInstantConnected"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 329
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notificationStateConnectionStateChanged"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/Map;)Z

    .line 331
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInstantConnected sent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1600()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 333
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x3f7

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_device_last_device"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1602(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    :cond_0
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastKnownDeviceIdentify is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1600()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceInfo.getSecUUID() is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1600()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1600()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 338
    :cond_1
    const-string v0, "state"

    const-string v1, "health_deviceDisconnected"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 339
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceDisconnected sent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notificationStateConnectionStateChanged"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/Map;)Z

    goto :goto_0

    .line 342
    :cond_2
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1600()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1100()Z

    move-result v0

    if-nez v0, :cond_3

    .line 343
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set isDisconnectedReported ======> false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1102(Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    return-void

    .line 347
    :cond_3
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0, v6}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1700(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 349
    const-string v0, "state"

    const-string v1, "health_deviceConnected"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceConnected sent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notificationStateConnectionStateChanged"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/Map;)Z

    goto :goto_2

    .line 356
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0, v6}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1700(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    .line 360
    goto :goto_2

    .line 362
    :sswitch_1
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 363
    const-string v0, "state"

    const-string v1, "health_deviceInstantDisconnected"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 364
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$500()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/List;)V

    .line 365
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notificationStateConnectionStateChanged"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/Map;)Z

    goto :goto_1

    .line 370
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    .line 373
    :goto_1
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInstantDisconnected sent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1500()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 375
    .line 381
    :goto_2
    goto :goto_3

    .line 379
    :catch_0
    move-exception v7

    .line 380
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    :cond_6
    :goto_3
    goto :goto_4

    :cond_7
    const-string v0, "com.huawei.plugin_device.am16_bind_success"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 384
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-nez v0, :cond_8

    .line 385
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    .line 389
    :cond_8
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
