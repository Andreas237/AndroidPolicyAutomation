.class Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 635
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;->c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 4

    .line 652
    const-string v0, "PrivacySettingActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSelfSNSInfo errorCallback errno:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;->c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;->c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x208

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 654
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 6

    .line 639
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;->c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 640
    const/16 v0, 0x207

    iput v0, v3, Landroid/os/Message;->what:I

    .line 641
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 642
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v5

    .line 643
    const-string v0, "PrivacySettingActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PrivacySettingActivity flags is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    invoke-virtual {v3, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 646
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;->c:Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 647
    return-void
.end method
