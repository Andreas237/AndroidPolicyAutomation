.class public Lcom/shopkick/app/urlhandlers/SMSHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "SMSHandler.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "sms"

.field public static final PARAM_BODY:Ljava/lang/String; = "body"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"

.field private static final PARAM_TO:Ljava/lang/String; = "to"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private currentActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 40
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 43
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 2

    .line 35
    new-instance v0, Lcom/shopkick/app/urlhandlers/SMSHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/SMSHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/SMSHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 7

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/SMSHandler;->finish()V

    return-void

    .line 56
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->params:Ljava/util/Map;

    const-string v2, "body"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_1

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/SMSHandler;->finish()V

    return-void

    .line 62
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    .line 63
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    check-cast v2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v2, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 65
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->params:Ljava/util/Map;

    const-string/jumbo v3, "to"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    const-string v3, ";"

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v3, v3

    if-eqz v3, :cond_3

    const-string v3, ";"

    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 70
    aget-object v3, v2, v3

    .line 72
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "htc"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x1

    .line 73
    :goto_0
    array-length v6, v2

    if-ge v5, v6, :cond_4

    .line 74
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v2, v5

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 75
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v2, v5

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    const-string v3, ""

    .line 79
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 80
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "sms:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string/jumbo v3, "sms_body"

    .line 81
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f1106b8

    .line 82
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-static {v2, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x12

    if-ne p2, p3, :cond_0

    .line 88
    iget-object p2, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    if-ne p2, p1, :cond_0

    .line 89
    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 p1, 0x0

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/SMSHandler;->currentActivity:Landroid/app/Activity;

    const-string p1, "callback"

    const/4 p2, 0x1

    .line 92
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string p4, "sent"

    aput-object p4, p2, p3

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/urlhandlers/SMSHandler;->finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
