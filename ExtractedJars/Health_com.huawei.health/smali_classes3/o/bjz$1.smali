.class Lo/bjz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjz;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bjz;


# direct methods
.method constructor <init>(Lo/bjz;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/bjz$1;->c:Lo/bjz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 164
    const-string v0, "SelfTwoDimCodeView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSelfSNSInfo errorCallback errno:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lo/bjz$1;->c:Lo/bjz;

    iget-object v0, v0, Lo/bjz;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/bjz$1;->c:Lo/bjz;

    iget-object v1, v1, Lo/bjz;->b:Landroid/os/Handler;

    const/16 v2, 0x108

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 166
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 4

    .line 152
    iget-object v0, p0, Lo/bjz$1;->c:Lo/bjz;

    iget-object v0, v0, Lo/bjz;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 153
    const/16 v0, 0x107

    iput v0, v2, Landroid/os/Message;->what:I

    .line 154
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 155
    const-string v0, "bundleKeyName"

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "bundleKeyQrCode"

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getQrCode_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 158
    iget-object v0, p0, Lo/bjz$1;->c:Lo/bjz;

    iget-object v0, v0, Lo/bjz;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 159
    return-void
.end method
