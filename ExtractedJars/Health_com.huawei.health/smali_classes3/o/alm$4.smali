.class Lo/alm$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/alm;


# direct methods
.method constructor <init>(Lo/alm;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lo/alm$4;->d:Lo/alm;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 13

    .line 298
    if-nez p2, :cond_0

    .line 299
    return-void

    .line 301
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 302
    const-string v0, "BluetoothMonitor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received action: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 305
    const-string v0, "android.bluetooth.adapter.extra.STATE"

    const/16 v1, 0xa

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 306
    const/16 v0, 0xc

    if-ne v7, v0, :cond_1

    .line 307
    iget-object v0, p0, Lo/alm$4;->d:Lo/alm;

    invoke-virtual {v0}, Lo/alm;->a()Z

    goto :goto_0

    .line 308
    :cond_1
    const/16 v0, 0xa

    if-ne v7, v0, :cond_2

    .line 309
    iget-object v0, p0, Lo/alm$4;->d:Lo/alm;

    invoke-virtual {v0}, Lo/alm;->d()V

    .line 311
    :cond_2
    :goto_0
    goto :goto_1

    :cond_3
    const-string v0, "com.huawei.health.action.DEVICE_CHANGED"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 312
    const-string v0, "operation"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 313
    const-string v0, "productId"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 314
    const/4 v0, 0x1

    if-ne v7, v0, :cond_4

    .line 315
    const-string v0, "uniqueId"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 316
    const-string v0, "mode"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v10

    .line 317
    const-string v0, "kind"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 318
    const-string v0, "name"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 319
    iget-object v0, p0, Lo/alm$4;->d:Lo/alm;

    move-object v1, v8

    move-object v2, v9

    move v3, v10

    move-object v4, v11

    move-object v5, v12

    invoke-static/range {v0 .. v5}, Lo/alm;->d(Lo/alm;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 320
    goto :goto_1

    :cond_4
    const/4 v0, -0x1

    if-ne v7, v0, :cond_5

    .line 321
    iget-object v0, p0, Lo/alm$4;->d:Lo/alm;

    invoke-static {v0, v8}, Lo/alm;->d(Lo/alm;Ljava/lang/String;)V

    .line 324
    :cond_5
    :goto_1
    return-void
.end method
