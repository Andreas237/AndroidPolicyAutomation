.class public Lcom/huawei/hwid/core/b/a/a$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/huawei/hwid/core/helper/handler/a;


# direct methods
.method public constructor <init>(Lcom/huawei/hwid/core/helper/handler/a;)V
    .locals 0

    .line 510
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 511
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a$b;->a:Lcom/huawei/hwid/core/helper/handler/a;

    .line 512
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 515
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a$b;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 516
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 519
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 520
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a$b;->a:Lcom/huawei/hwid/core/helper/handler/a;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/helper/handler/a;->e(Landroid/os/Bundle;)V

    .line 521
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a$b;->a()V

    .line 523
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 524
    return-void
.end method
