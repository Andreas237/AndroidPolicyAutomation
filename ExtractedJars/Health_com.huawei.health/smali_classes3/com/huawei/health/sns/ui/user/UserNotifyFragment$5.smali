.class Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;->e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 462
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 466
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isRequestUserNotifySucc"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 468
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 470
    if-eqz v3, :cond_0

    if-lez v4, :cond_1

    .line 472
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$5;->e:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->b(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x255

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 474
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
