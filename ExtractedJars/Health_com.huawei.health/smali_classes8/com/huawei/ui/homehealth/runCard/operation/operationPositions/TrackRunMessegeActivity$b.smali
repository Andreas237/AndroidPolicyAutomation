.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 57
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 58
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 62
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 64
    :cond_0
    return-void

    .line 66
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 68
    :sswitch_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    const-string v1, "IC2"

    .line 69
    invoke-virtual {v0, v1}, Lo/eaa;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 73
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 74
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 77
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_3
    goto :goto_0

    .line 82
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

    .line 83
    if-eqz v4, :cond_5

    .line 84
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;

    invoke-direct {v0, p0, v4, v3}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;Ljava/util/List;)V

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 98
    :cond_5
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method
