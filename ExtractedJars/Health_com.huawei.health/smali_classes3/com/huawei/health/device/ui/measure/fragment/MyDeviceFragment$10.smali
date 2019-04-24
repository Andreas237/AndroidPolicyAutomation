.class final Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1210
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1213
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1214
    const/4 v4, 0x0

    .line 1215
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2800()Ljava/lang/ref/WeakReference;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1216
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2800()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    .line 1218
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 1219
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1220
    return-void

    .line 1222
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1223
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment current fragment not attached activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1224
    return-void

    .line 1226
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 1230
    :pswitch_0
    const-string v0, "MyDeviceFragment"

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

    .line 1232
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 1233
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 1234
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 1235
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;->removeMessages(I)V

    .line 1236
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->stopLoading()V

    .line 1237
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    goto :goto_0

    .line 1238
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1239
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;->removeMessages(I)V

    .line 1240
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->stopLoading()V

    .line 1241
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    .line 1242
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$502(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1244
    :cond_4
    :goto_0
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 1245
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 1246
    goto/16 :goto_1

    .line 1248
    :pswitch_1
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 1249
    goto/16 :goto_1

    .line 1252
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1253
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1254
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stop loading..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1255
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$10;->removeMessages(I)V

    .line 1256
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->stopLoading()V

    .line 1257
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    .line 1258
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$502(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    :cond_5
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fragment.mReconnectDevice : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isConnecting  :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getConnecting()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1261
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 1262
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 1263
    goto :goto_1

    .line 1265
    :pswitch_3
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg_connect_change  state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->access$400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;)Z

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

    .line 1266
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$502(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1267
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->setConnecting(Z)V

    .line 1269
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 1270
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 1271
    goto :goto_1

    .line 1273
    :pswitch_4
    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2900(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Landroid/content/Context;)V

    .line 1274
    .line 1277
    :goto_1
    return-void

    nop

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
