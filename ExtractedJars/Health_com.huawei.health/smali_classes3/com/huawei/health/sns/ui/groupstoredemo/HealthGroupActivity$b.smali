.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 1

    .line 253
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 254
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 255
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 259
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    .line 261
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    return-void

    .line 264
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 266
    :sswitch_0
    goto :goto_0

    .line 268
    :sswitch_1
    goto :goto_0

    .line 270
    :sswitch_2
    goto :goto_0

    .line 272
    :sswitch_3
    goto :goto_0

    .line 275
    :sswitch_4
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Z)Z

    .line 276
    goto :goto_0

    .line 278
    :sswitch_5
    goto :goto_0

    .line 280
    :sswitch_6
    goto :goto_0

    .line 282
    :sswitch_7
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/os/Message;)V

    .line 283
    goto :goto_0

    .line 285
    :sswitch_8
    goto :goto_0

    .line 287
    :sswitch_9
    goto :goto_0

    .line 289
    :sswitch_a
    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 290
    goto :goto_0

    .line 292
    :sswitch_b
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/os/Message;)V

    .line 293
    .line 297
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_5
        0x91 -> :sswitch_4
        0x343 -> :sswitch_2
        0x348 -> :sswitch_0
        0x349 -> :sswitch_1
        0x351 -> :sswitch_3
        0x8001 -> :sswitch_6
        0x8002 -> :sswitch_7
        0x8004 -> :sswitch_8
        0x8005 -> :sswitch_9
        0x8006 -> :sswitch_a
        0x8007 -> :sswitch_b
    .end sparse-switch
.end method
