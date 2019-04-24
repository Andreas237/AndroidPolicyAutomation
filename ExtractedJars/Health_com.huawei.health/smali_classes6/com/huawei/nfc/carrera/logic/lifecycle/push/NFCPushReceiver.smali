.class public Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final ACTION_RECEIVE_PUSH_MSG:Ljava/lang/String; = "com.huawei.wallet.push.action.PUSH_MSG"

.field public static final ACTION_RECEIVE_PUSH_TOKEN:Ljava/lang/String; = "com.huawei.wallet.push.action.PUSH_TOKEN"

.field public static final EXTRA_PUSH_MSG:Ljava/lang/String; = "com.huawei.wallet.push.extra.PUSH_MSG"

.field public static final EXTRA_PUSH_TOKEN:Ljava/lang/String; = "com.huawei.wallet.push.extra.PUSH_TOKEN"

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz p2, :cond_0

    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 65
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== wallet push onReceive  action=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    const-string v0, "com.huawei.wallet.push.action.PUSH_TOKEN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.huawei.wallet.push.action.PUSH_MSG"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    :cond_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== wallet push onReceive  action is not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return-void

    .line 78
    :cond_2
    const-string v0, "com.huawei.wallet.push.action.PUSH_TOKEN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 79
    const-string v0, "com.huawei.wallet.push.extra.PUSH_TOKEN"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 80
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== wallet push recevier PushToken : token is Empty !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 85
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== wallet push receive pushtoken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->savePushToken(Ljava/lang/String;)V

    .line 87
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->receivePushToken(Ljava/lang/String;)V

    .line 88
    goto :goto_1

    :cond_4
    const-string v0, "com.huawei.wallet.push.action.PUSH_MSG"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 89
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const-string v0, "com.huawei.wallet.push.extra.PUSH_MSG"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v6

    .line 93
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 94
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 98
    :cond_5
    goto :goto_0

    .line 96
    :catch_0
    move-exception v6

    .line 97
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== wallet push onPushMsg, encoding exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushReceiver;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== wallet push receive pushmsg, content: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 102
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->receivePushMessage(Ljava/lang/String;)V

    .line 105
    :cond_6
    :goto_1
    return-void
.end method
