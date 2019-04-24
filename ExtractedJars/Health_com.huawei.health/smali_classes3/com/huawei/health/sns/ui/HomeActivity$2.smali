.class Lcom/huawei/health/sns/ui/HomeActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/HomeActivity;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/HomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 1040
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1044
    if-eqz p2, :cond_2

    .line 1046
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 1047
    const-string v0, "com.huawei.health.notify.unread.number"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1050
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->i(Lcom/huawei/health/sns/ui/HomeActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lo/axi;->e(Landroid/os/Handler;)V

    goto :goto_0

    .line 1052
    :cond_0
    const-string v0, "action_clear_search"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1054
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/HomeActivity;->c(Lcom/huawei/health/sns/ui/HomeActivity;Landroid/content/Intent;)V

    goto :goto_0

    .line 1057
    :cond_1
    const-string v0, "com.huawei.android.sns.action.check.match.contact"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1059
    const-string v0, "HomeActivity"

    const-string v1, "check contact match."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1060
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 1063
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->p(Lcom/huawei/health/sns/ui/HomeActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez v4, :cond_2

    .line 1066
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->a(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 1068
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1069
    const-string v0, "keyOpenContactMatchFromWhere"

    const-string v1, "openContactMatchFromFirstOpen"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1071
    const-string v0, "keyHomeTableType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->o(Lcom/huawei/health/sns/ui/HomeActivity;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1072
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$2;->a:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 1076
    :cond_2
    :goto_0
    return-void
.end method
