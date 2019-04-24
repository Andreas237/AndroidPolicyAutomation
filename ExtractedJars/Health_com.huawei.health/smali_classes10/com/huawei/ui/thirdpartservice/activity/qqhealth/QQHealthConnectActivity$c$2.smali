.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;
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
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->b:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 4

    .line 299
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ authorize() isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ authorize() text = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    if-eqz p3, :cond_0

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->sendQQHealthConnectSuccessBroadcast()V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 312
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 296
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;->c(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method
