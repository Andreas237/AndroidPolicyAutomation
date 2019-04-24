.class final Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1196
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1199
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1200
    const/4 v4, 0x0

    .line 1201
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1600()Ljava/lang/ref/WeakReference;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1202
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1600()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    .line 1204
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 1205
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindingFragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1206
    return-void

    .line 1208
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1209
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current fragment not attached activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1210
    return-void

    .line 1212
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 1216
    :pswitch_0
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reconnect device timeout \uff1f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1217
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 1218
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 1219
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1220
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;->removeMessages(I)V

    .line 1221
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->stopLoading()V

    .line 1223
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1224
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_connected deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1225
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    goto :goto_0

    .line 1227
    :cond_3
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_connected deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1228
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1231
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;->removeMessages(I)V

    .line 1232
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->stopLoading()V

    .line 1234
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1235
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_time_out deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    .line 1238
    :goto_0
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 1239
    goto/16 :goto_1

    .line 1241
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->notifyDataSetChanged()V

    .line 1242
    goto/16 :goto_1

    .line 1245
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1246
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1247
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$5;->removeMessages(I)V

    .line 1248
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->stopLoading()V

    .line 1249
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1250
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_disconnected deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1251
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    .line 1253
    :cond_5
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 1254
    goto :goto_1

    .line 1256
    :pswitch_3
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg_connect_change  state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "msg: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1502(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1258
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    .line 1260
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1261
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler msg_connecting deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1262
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 1263
    goto :goto_1

    .line 1265
    :pswitch_4
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Landroid/content/Context;)V

    .line 1266
    .line 1269
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method
