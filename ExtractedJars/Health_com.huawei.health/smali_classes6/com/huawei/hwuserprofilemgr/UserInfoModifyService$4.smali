.class Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->e(Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;


# direct methods
.method constructor <init>(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->d:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

    iput-object p2, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 5

    .line 70
    const-string v0, "UserInfoModifyService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "modifyUserInfo operationResult is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    if-nez p3, :cond_0

    .line 74
    const-string v0, "UserInfoModifyService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo Fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    new-instance v4, Landroid/content/Intent;

    const-string v0, "action_transcation_end"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 76
    const-string v0, "uuid"

    iget-object v1, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 78
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->d:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 79
    return-void

    .line 81
    :cond_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "action_transcation_end"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 82
    const-string v0, "uuid"

    iget-object v1, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    const-string v0, "result"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 84
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->d:Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 86
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 66
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;->c(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method
