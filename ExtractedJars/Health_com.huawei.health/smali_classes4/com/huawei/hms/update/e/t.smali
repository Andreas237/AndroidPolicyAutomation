.class Lcom/huawei/hms/update/e/t;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/update/e/s;


# direct methods
.method constructor <init>(Lcom/huawei/hms/update/e/s;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/huawei/hms/update/e/t;->a:Lcom/huawei/hms/update/e/s;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 379
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/os/Bundle;

    .line 380
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 382
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/t;->a:Lcom/huawei/hms/update/e/s;

    invoke-static {v0, v1}, Lcom/huawei/hms/update/e/s;->a(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V

    .line 383
    goto :goto_0

    .line 386
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/t;->a:Lcom/huawei/hms/update/e/s;

    invoke-static {v0, v1}, Lcom/huawei/hms/update/e/s;->b(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V

    .line 387
    goto :goto_0

    .line 390
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/hms/update/e/t;->a:Lcom/huawei/hms/update/e/s;

    invoke-static {v0, v1}, Lcom/huawei/hms/update/e/s;->c(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V

    .line 391
    .line 396
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
