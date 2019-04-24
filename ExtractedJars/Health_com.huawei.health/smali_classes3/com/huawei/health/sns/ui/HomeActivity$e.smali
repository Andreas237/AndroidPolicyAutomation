.class Lcom/huawei/health/sns/ui/HomeActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/HomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/HomeActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 1

    .line 251
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 252
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 253
    return-void
.end method

.method private d(Landroid/os/Message;)I
    .locals 2

    .line 342
    const/4 v1, 0x0

    .line 343
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 347
    :cond_0
    return v1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 258
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/HomeActivity;

    .line 260
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    return-void

    .line 265
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 269
    :sswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity$e;->d(Landroid/os/Message;)I

    move-result v2

    .line 270
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->e(Lcom/huawei/health/sns/ui/HomeActivity;I)V

    goto :goto_0

    .line 278
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->c(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 279
    goto :goto_0

    .line 285
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->a(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 286
    goto :goto_0

    .line 293
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 296
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 297
    goto :goto_0

    .line 302
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->e(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 303
    goto :goto_0

    .line 308
    :sswitch_5
    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->h(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 309
    goto :goto_0

    .line 312
    :sswitch_6
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Lcom/huawei/health/sns/ui/HomeActivity;Landroid/os/Bundle;)V

    .line 313
    goto :goto_0

    .line 317
    :sswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 318
    invoke-static {v1, v2, v3}, Lcom/huawei/health/sns/ui/HomeActivity;->c(Lcom/huawei/health/sns/ui/HomeActivity;J)V

    .line 319
    goto :goto_0

    .line 323
    :sswitch_8
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/HomeActivity$e;->d(Landroid/os/Message;)I

    move-result v2

    .line 324
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 325
    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Lcom/huawei/health/sns/ui/HomeActivity;I)V

    .line 332
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x121 -> :sswitch_1
        0x122 -> :sswitch_2
        0x123 -> :sswitch_3
        0x124 -> :sswitch_4
        0x125 -> :sswitch_5
        0x126 -> :sswitch_3
        0x127 -> :sswitch_3
        0x128 -> :sswitch_2
        0x129 -> :sswitch_6
        0x130 -> :sswitch_8
        0x131 -> :sswitch_7
        0x1022 -> :sswitch_0
    .end sparse-switch
.end method
