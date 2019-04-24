.class public Lcom/huawei/qrcode/logic/jump/JumpManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/jump/JumpManager$SingletoneHolder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/jump/JumpManager$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/jump/JumpManager;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/jump/JumpManager;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/logic/jump/JumpManager$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/jump/JumpManager;

    return-object v0
.end method


# virtual methods
.method public jumpToActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "JumpManager jumpToActivity context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.QRCODE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "qrcode_intent_key"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "intent_external_value"

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_1
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string v0, "JumpManager jumpToActivity."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "JumpManager ActivityNotFoundException."

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "JumpManager SecurityException."

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-void
.end method
