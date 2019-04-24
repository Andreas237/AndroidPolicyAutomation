.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 1

    .line 290
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 291
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 292
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 296
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    .line 298
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    :cond_0
    return-void

    .line 301
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 303
    :sswitch_0
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 304
    goto :goto_0

    .line 306
    :sswitch_1
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 307
    goto :goto_0

    .line 309
    :sswitch_2
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 310
    goto :goto_0

    .line 312
    :sswitch_3
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 313
    goto :goto_0

    .line 316
    :sswitch_4
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Z)Z

    .line 317
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 318
    goto :goto_0

    .line 320
    :sswitch_5
    const/16 v0, 0x353

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;I)V

    .line 321
    goto :goto_0

    .line 323
    :sswitch_6
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 324
    goto :goto_0

    .line 326
    :sswitch_7
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 327
    goto :goto_0

    .line 329
    :sswitch_8
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V

    .line 330
    goto :goto_0

    .line 332
    :sswitch_9
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 333
    goto :goto_0

    .line 335
    :sswitch_a
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 336
    goto :goto_0

    .line 338
    :sswitch_b
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 339
    .line 343
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_5
        0x91 -> :sswitch_4
        0x343 -> :sswitch_2
        0x348 -> :sswitch_0
        0x349 -> :sswitch_1
        0x351 -> :sswitch_3
        0x8001 -> :sswitch_7
        0x8002 -> :sswitch_8
        0x8003 -> :sswitch_6
        0x8004 -> :sswitch_9
        0x8005 -> :sswitch_a
        0x8006 -> :sswitch_b
    .end sparse-switch
.end method
