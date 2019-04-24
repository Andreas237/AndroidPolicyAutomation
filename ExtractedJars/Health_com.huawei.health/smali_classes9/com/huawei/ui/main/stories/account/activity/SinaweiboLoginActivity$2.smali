.class Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/euh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 86
    return-void
.end method

.method public b(ILjava/lang/Boolean;)V
    .locals 3

    .line 113
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 114
    const-string v0, "sinaweibo_logout_isccucess"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->finish()V

    .line 118
    return-void
.end method

.method public e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 95
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 96
    const-string v0, "sinaweibo_userid"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    const-string v0, "sinaweibo_token"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    const-string v0, "sinaweibo_username"

    invoke-virtual {v2, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 104
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;->a:Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->finish()V

    .line 105
    return-void
.end method
