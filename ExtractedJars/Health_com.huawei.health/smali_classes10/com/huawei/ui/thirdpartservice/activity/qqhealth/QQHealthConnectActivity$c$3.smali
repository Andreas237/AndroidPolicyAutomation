.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

.field final synthetic d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->d:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 245
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", UserName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    if-eqz p3, :cond_1

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->saveQQUserinfo(Landroid/content/Context;)V

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 254
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 257
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 242
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
