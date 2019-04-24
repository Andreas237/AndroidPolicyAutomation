.class public Lo/awy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awy;->d:Landroid/os/Handler;

    .line 33
    iput-object p1, p0, Lo/awy;->d:Landroid/os/Handler;

    .line 34
    return-void
.end method


# virtual methods
.method protected b(III)V
    .locals 2

    .line 76
    iget-object v0, p0, Lo/awy;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lo/awy;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/awy;->d:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 80
    :cond_0
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)Landroid/os/Message;
    .locals 3

    .line 46
    iget-object v0, p0, Lo/awy;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 47
    iput p2, v1, Landroid/os/Message;->what:I

    .line 48
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 49
    const-string v0, "bundleKeyUser"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 52
    const-string v0, "bundleKeyNotifySide"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 54
    :cond_0
    const/4 v0, -0x1

    if-eq p4, v0, :cond_1

    .line 56
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 58
    :cond_1
    const/4 v0, -0x1

    if-eq p5, v0, :cond_2

    .line 60
    const-string v0, "bundleKeyNotifyType"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 61
    const-string v0, "bundleKeyGroupNickname"

    invoke-virtual {v2, v0, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_2
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 64
    return-object v1
.end method
