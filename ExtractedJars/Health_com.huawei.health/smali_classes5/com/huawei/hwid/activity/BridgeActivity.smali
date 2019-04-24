.class public Lcom/huawei/hwid/activity/BridgeActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hwid/activity/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3

    .line 229
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/hwid/activity/BridgeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 230
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 231
    const-string v0, "intent.extra.isfullscreen"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 233
    return-object v2
.end method

.method private a()V
    .locals 4

    .line 140
    const/high16 v2, 0x4000000

    .line 142
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/activity/BridgeActivity;->requestWindowFeature(I)Z

    .line 144
    sget v0, Lcom/huawei/hwid/a/a$a;->a:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 145
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 146
    const/high16 v0, 0x4000000

    invoke-virtual {v3, v0}, Landroid/view/Window;->addFlags(I)V

    .line 148
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/hwid/activity/BridgeActivity;->a(Landroid/view/Window;Z)V

    .line 150
    :cond_0
    return-void
.end method

.method private static a(Landroid/view/Window;Z)V
    .locals 6

    .line 208
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

    .line 209
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 218
    goto :goto_0

    .line 210
    :catch_0
    move-exception v5

    .line 211
    const-string v0, "BridgeActivity"

    const-string v1, "In setHwFloating, Failed to call Window.setHwFloating()."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    goto :goto_0

    .line 212
    :catch_1
    move-exception v5

    .line 213
    const-string v0, "BridgeActivity"

    const-string v1, "In setHwFloating, Failed to call Window.setHwFloating()."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    goto :goto_0

    .line 214
    :catch_2
    move-exception v5

    .line 215
    const-string v0, "BridgeActivity"

    const-string v1, "In setHwFloating, Failed to call Window.setHwFloating()."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    goto :goto_0

    .line 216
    :catch_3
    move-exception v5

    .line 217
    const-string v0, "BridgeActivity"

    const-string v1, "In setHwFloating, Failed to call Window.setHwFloating()."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    :goto_0
    return-void
.end method

.method private b()Z
    .locals 7

    .line 157
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 158
    if-nez v3, :cond_0

    .line 159
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Must not pass in a null intent."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const/4 v0, 0x0

    return v0

    .line 164
    :cond_0
    const-string v0, "intent.extra.isfullscreen"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 169
    :cond_1
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 170
    if-nez v4, :cond_2

    .line 171
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Must not pass in a null or non class object."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_2
    :try_start_0
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 177
    const-class v0, Lcom/huawei/hwid/activity/a;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v6

    .line 179
    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/activity/a;

    iput-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 193
    goto :goto_0

    .line 181
    :catch_0
    move-exception v5

    .line 182
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Failed to create \'IUpdateWizard\' instance."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v0, 0x0

    return v0

    .line 184
    :catch_1
    move-exception v5

    .line 185
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Failed to create \'InstantiationException\' instance."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const/4 v0, 0x0

    return v0

    .line 187
    :catch_2
    move-exception v5

    .line 188
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Failed to create \'IllegalAccessException\' instance."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const/4 v0, 0x0

    return v0

    .line 190
    :catch_3
    move-exception v5

    .line 191
    const-string v0, "BridgeActivity"

    const-string v1, "In initialize, Failed to create \'ClassNotFoundException\' instance."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const/4 v0, 0x0

    return v0

    .line 195
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p0}, Lcom/huawei/hwid/activity/a;->a(Landroid/app/Activity;)V

    .line 197
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public finish()V
    .locals 2

    .line 131
    const-string v0, "BridgeActivity"

    const-string v1, "Enter finish."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 134
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 103
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwid/activity/a;->a(IILandroid/content/Intent;)Z

    move-result v1

    .line 108
    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    invoke-virtual {p0, p2, p3}, Lcom/huawei/hwid/activity/BridgeActivity;->setResult(ILandroid/content/Intent;)V

    .line 110
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->finish()V

    .line 113
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 92
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0}, Lcom/huawei/hwid/activity/a;->b()V

    .line 96
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 59
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    invoke-direct {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->a()V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 64
    if-nez v2, :cond_0

    .line 65
    return-void

    .line 68
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwid/activity/BridgeActivity;->setResult(ILandroid/content/Intent;)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/hwid/activity/BridgeActivity;->finish()V

    .line 73
    :cond_1
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 80
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 82
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0}, Lcom/huawei/hwid/activity/a;->a()V

    .line 85
    :cond_0
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/huawei/hwid/activity/BridgeActivity;->a:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/activity/a;->a(ILandroid/view/KeyEvent;)V

    .line 123
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
