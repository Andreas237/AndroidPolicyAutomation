.class Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fjk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public initCallback(Z)V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCallback("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fjk;->initCallback(Z)V

    .line 92
    :cond_0
    return-void
.end method

.method public loginCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 98
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginCallback() success. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loginCallback() userName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", userID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", accessToken="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/fjk;->loginCallback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_0
    return-void
.end method

.method public logoutCallback(Ljava/lang/Boolean;)V
    .locals 4

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 109
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logoutCallback("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;->this$0:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fjk;->logoutCallback(Ljava/lang/Boolean;)V

    .line 112
    :cond_0
    return-void
.end method
