.class public Lcom/usebutton/sdk/internal/IntentStarter;
.super Ljava/lang/Object;
.source "IntentStarter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static isImplicit(Landroid/content/Intent;)Z
    .locals 0

    .line 63
    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static startIntent(Landroid/content/Context;Landroid/content/Intent;Landroid/app/Activity;)V
    .locals 2

    .line 32
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 35
    instance-of v1, p2, Lcom/usebutton/sdk/internal/WebViewActivity;

    if-nez v1, :cond_0

    instance-of v1, p2, Lcom/usebutton/sdk/internal/InstallSheetActivity;

    if-eqz v1, :cond_1

    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 41
    :cond_1
    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->shouldStartActivityForResult(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 42
    invoke-static {p1}, Lcom/usebutton/sdk/internal/IntentStarter;->isImplicit(Landroid/content/Intent;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 43
    invoke-static {p1}, Lcom/usebutton/sdk/internal/IntentStarter;->stripAuthChallengeExtra(Landroid/content/Intent;)V

    :cond_2
    if-eqz p2, :cond_4

    const/16 p0, 0x5607

    .line 47
    invoke-virtual {p2, p1, p0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private static stripAuthChallengeExtra(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "auth_challenge"

    .line 72
    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "auth_challenge"

    .line 73
    invoke-virtual {p0, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
