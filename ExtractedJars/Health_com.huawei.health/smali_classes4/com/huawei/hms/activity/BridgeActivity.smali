.class public Lcom/huawei/hms/activity/BridgeActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final EXTRA_DELEGATE_CLASS_NAME:Ljava/lang/String; = "intent.extra.DELEGATE_CLASS_OBJECT"

.field public static final EXTRA_DELEGATE_UPDATE_INFO:Ljava/lang/String; = "intent.extra.update.info"

.field public static final EXTRA_INTENT:Ljava/lang/String; = "intent.extra.intent"

.field public static final EXTRA_IS_FULLSCREEN:Ljava/lang/String; = "intent.extra.isfullscreen"

.field public static final EXTRA_RESULT:Ljava/lang/String; = "intent.extra.RESULT"


# instance fields
.field private a:Lcom/huawei/hms/activity/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 148
    const/high16 v2, 0x4000000

    .line 150
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hms/activity/BridgeActivity;->requestWindowFeature(I)Z

    .line 152
    sget v0, Lcom/huawei/hms/a/a$a;->a:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 153
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 154
    const/high16 v0, 0x4000000

    invoke-virtual {v3, v0}, Landroid/view/Window;->addFlags(I)V

    .line 156
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/hms/activity/BridgeActivity;->a(Landroid/view/Window;Z)V

    .line 158
    :cond_0
    return-void
.end method

.method private static a(Landroid/view/Window;Z)V
    .locals 6

    .line 207
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setHwFloating"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 208
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_0

    .line 209
    :catch_0
    move-exception v5

    .line 210
    const-string v0, "BridgeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In setHwFloating, Failed to call Window.setHwFloating()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    :goto_0
    return-void
.end method

.method private b()Z
    .locals 7

    .line 165
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 166
    if-nez v3, :cond_0

    .line 167
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Must not pass in a null intent."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    const-string v0, "intent.extra.isfullscreen"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 177
    :cond_1
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 178
    if-nez v4, :cond_2

    .line 179
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Must not pass in a null or non class object."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const/4 v0, 0x0

    return v0

    .line 184
    :cond_2
    :try_start_0
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 185
    const-class v0, Lcom/huawei/hms/activity/a;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v6

    .line 187
    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/activity/a;

    iput-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    goto :goto_0

    .line 189
    :catch_0
    move-exception v5

    .line 190
    const-string v0, "BridgeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In initialize, Failed to create \'IUpdateWizard\' instance."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const/4 v0, 0x0

    return v0

    .line 194
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p0}, Lcom/huawei/hms/activity/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 196
    const/4 v0, 0x1

    return v0
.end method

.method public static getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3

    .line 222
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/hms/activity/BridgeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 223
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 224
    const-string v0, "intent.extra.isfullscreen"

    invoke-static {p0}, Lcom/huawei/hms/c/j;->a(Landroid/app/Activity;)Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 226
    return-object v2
.end method


# virtual methods
.method public finish()V
    .locals 2

    .line 139
    const-string v0, "BridgeActivity"

    const-string v1, "Enter finish."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 142
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 111
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hms/activity/a;->onBridgeActivityResult(IILandroid/content/Intent;)Z

    move-result v1

    .line 116
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    invoke-virtual {p0, p2, p3}, Lcom/huawei/hms/activity/BridgeActivity;->setResult(ILandroid/content/Intent;)V

    .line 118
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->finish()V

    .line 121
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 100
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    invoke-interface {v0}, Lcom/huawei/hms/activity/a;->onBridgeConfigurationChanged()V

    .line 104
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 61
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    invoke-direct {p0}, Lcom/huawei/hms/activity/BridgeActivity;->a()V

    .line 65
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 66
    if-nez v2, :cond_0

    .line 67
    return-void

    .line 71
    :cond_0
    invoke-static {}, Lcom/huawei/hms/c/h;->a()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 73
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/c/h;->a(Landroid/content/Context;)V

    .line 76
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/activity/BridgeActivity;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 77
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/activity/BridgeActivity;->setResult(ILandroid/content/Intent;)V

    .line 78
    invoke-virtual {p0}, Lcom/huawei/hms/activity/BridgeActivity;->finish()V

    .line 81
    :cond_2
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 88
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 90
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    invoke-interface {v0}, Lcom/huawei/hms/activity/a;->onBridgeActivityDestroy()V

    .line 93
    :cond_0
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/huawei/hms/activity/BridgeActivity;->a:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/activity/a;->onKeyUp(ILandroid/view/KeyEvent;)V

    .line 131
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
