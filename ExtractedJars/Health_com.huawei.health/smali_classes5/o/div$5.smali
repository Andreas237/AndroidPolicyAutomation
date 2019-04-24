.class Lo/div$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/div;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/div;


# direct methods
.method constructor <init>(Lo/div;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lo/div$5;->e:Lo/div;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 488
    iget-object v0, p0, Lo/div$5;->e:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Lo/div$5;->e:Lo/div;

    invoke-static {v0}, Lo/div;->a(Lo/div;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 492
    :cond_0
    if-nez p1, :cond_2

    .line 493
    if-eqz p2, :cond_1

    instance-of v0, p2, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    if-eqz v0, :cond_1

    .line 494
    iget-object v0, p0, Lo/div$5;->e:Lo/div;

    move-object v1, p2

    check-cast v1, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-static {v0, v1}, Lo/div;->c(Lo/div;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V

    goto :goto_0

    .line 496
    :cond_1
    iget-object v0, p0, Lo/div$5;->e:Lo/div;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/div;->d(Lo/div;I)V

    goto :goto_0

    .line 499
    :cond_2
    iget-object v0, p0, Lo/div$5;->e:Lo/div;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/div;->d(Lo/div;I)V

    .line 501
    :goto_0
    return-void
.end method
