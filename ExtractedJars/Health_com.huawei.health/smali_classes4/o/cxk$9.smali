.class Lo/cxk$9;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cxk;


# direct methods
.method constructor <init>(Lo/cxk;)V
    .locals 0

    .line 1371
    iput-object p1, p0, Lo/cxk$9;->c:Lo/cxk;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 1374
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 1375
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1376
    iget-object v0, p0, Lo/cxk$9;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1377
    iget-object v0, p0, Lo/cxk$9;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v3

    .line 1378
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 1387
    :pswitch_0
    iget-object v0, p0, Lo/cxk$9;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->m(Lo/cxk;)Ljava/util/List;

    move-result-object v4

    monitor-enter v4

    .line 1388
    :try_start_0
    iget-object v0, p0, Lo/cxk$9;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->m(Lo/cxk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyf;

    .line 1389
    invoke-static {v3}, Lo/cxk;->d(I)I

    move-result v0

    invoke-interface {v6, v0}, Lo/cyf;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1390
    goto :goto_0

    .line 1391
    :cond_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 1397
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
