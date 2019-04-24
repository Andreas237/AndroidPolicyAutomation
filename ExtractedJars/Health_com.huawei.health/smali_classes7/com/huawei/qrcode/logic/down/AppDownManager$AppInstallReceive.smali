.class Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/logic/down/AppDownManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AppInstallReceive"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;


# direct methods
.method private constructor <init>(Lcom/huawei/qrcode/logic/down/AppDownManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/down/AppDownManager;Lcom/huawei/qrcode/logic/down/AppDownManager$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;-><init>(Lcom/huawei/qrcode/logic/down/AppDownManager;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "intentData is not null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$300(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "AppDownManager onReceive install package success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager onReceive mEventId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v1}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$400(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$400(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$500(Lcom/huawei/qrcode/logic/down/AppDownManager;)V

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-direct {v4}, Lcom/huawei/qrcode/model/QrcodeAppInfo;-><init>()V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$300(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppPackage(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$600(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->setQrcodeAppOperationInfo(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-static {v1}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$400(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyListener(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$402(Lcom/huawei/qrcode/logic/down/AppDownManager;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->unRegisterInstallReceiver()V

    :cond_2
    return-void
.end method
