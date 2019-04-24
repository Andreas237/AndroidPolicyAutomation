.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 163
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7528\u6237\u70b9\u51fb\u65ad\u5f00QQHealth."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    new-instance v4, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    .line 165
    invoke-virtual {v4}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->delete()I

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->cancelAuthorize(Lo/cyx;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lo/fjk;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;Landroid/app/Activity;Lo/fjk;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->logout()V

    goto :goto_0

    .line 177
    :cond_0
    const-string v0, "QQHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mQQLoginMgr is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->finish()V

    .line 181
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;->startActivity(Landroid/content/Intent;)V

    .line 183
    return-void
.end method
