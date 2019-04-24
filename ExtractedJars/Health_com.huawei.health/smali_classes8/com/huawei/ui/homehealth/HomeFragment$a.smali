.class Lcom/huawei/ui/homehealth/HomeFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/HomeFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 1

    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 463
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 464
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 468
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyWearSDKRefreshData, errCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyWearSDKRefreshData, objData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/HomeFragment;

    .line 471
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 472
    return-void

    .line 475
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/homehealth/HomeFragment;->h(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/os/Handler;

    move-result-object v5

    .line 476
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 477
    return-void

    .line 480
    :cond_1
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 482
    :sswitch_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Refresh Cards by detail data, errCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    const/16 v0, 0x3ec

    invoke-virtual {v5, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 484
    invoke-virtual {v5}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 485
    const/16 v0, 0x3ec

    iput v0, v6, Landroid/os/Message;->what:I

    .line 486
    const-wide/16 v0, 0x3e8

    invoke-virtual {v5, v6, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 487
    goto :goto_0

    .line 489
    :sswitch_1
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Refresh Cards by detail data, errCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    const/16 v0, 0x3ec

    invoke-virtual {v5, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 491
    invoke-virtual {v5}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 492
    const/16 v0, 0x3ec

    iput v0, v7, Landroid/os/Message;->what:I

    .line 493
    invoke-virtual {v5, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 494
    goto :goto_0

    .line 496
    :sswitch_2
    const/16 v0, 0x3ed

    invoke-virtual {v5, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 497
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pull Refresh Run Card by errCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-virtual {v5}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 499
    const/16 v0, 0x3ed

    iput v0, v8, Landroid/os/Message;->what:I

    .line 500
    invoke-virtual {v5, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 501
    .line 505
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_0
        0x1 -> :sswitch_1
        0x5 -> :sswitch_2
    .end sparse-switch
.end method
