.class public Lcom/shopkick/app/urlhandlers/EmailHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "EmailHandler.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "email"

.field private static final PARAM_BCC:Ljava/lang/String; = "bcc"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"

.field private static final PARAM_CC:Ljava/lang/String; = "cc"

.field public static final PARAM_SUBJECT:Ljava/lang/String; = "subject"

.field public static final PARAM_TEXT_BODY:Ljava/lang/String; = "text_body"

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
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 40
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 43
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 2

    .line 35
    new-instance v0, Lcom/shopkick/app/urlhandlers/EmailHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/EmailHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/EmailHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 8

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/EmailHandler;->finish()V

    return-void

    .line 56
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    .line 57
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 59
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "to"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 60
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->params:Ljava/util/Map;

    const-string v3, "cc"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 61
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->params:Ljava/util/Map;

    const-string v4, "bcc"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 62
    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->params:Ljava/util/Map;

    const-string/jumbo v5, "subject"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 63
    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->params:Ljava/util/Map;

    const-string/jumbo v6, "text_body"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 68
    new-instance v6, Landroid/content/Intent;

    const-string v7, "android.intent.action.SEND"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    if-eqz v1, :cond_1

    const-string v7, ";"

    .line 70
    invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 71
    array-length v7, v1

    if-lez v7, :cond_1

    const-string v7, "android.intent.extra.EMAIL"

    .line 72
    invoke-virtual {v6, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    if-eqz v2, :cond_2

    const-string v1, ";"

    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 77
    array-length v2, v1

    if-lez v2, :cond_2

    const-string v2, "android.intent.extra.CC"

    .line 78
    invoke-virtual {v6, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    if-eqz v3, :cond_3

    const-string v1, ";"

    .line 82
    invoke-virtual {v3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 83
    array-length v2, v1

    if-lez v2, :cond_3

    const-string v2, "android.intent.extra.BCC"

    .line 84
    invoke-virtual {v6, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    if-eqz v4, :cond_4

    const-string v1, "android.intent.extra.SUBJECT"

    .line 88
    invoke-virtual {v6, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_4
    if-eqz v5, :cond_5

    const-string v1, "android.intent.extra.TEXT"

    .line 91
    invoke-virtual {v6, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_5
    const-string v1, "message/rfc822"

    .line 94
    invoke-virtual {v6, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0x7f110280

    .line 95
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 96
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 97
    invoke-static {v6, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x11

    if-ne p2, p3, :cond_0

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    if-ne p2, p1, :cond_0

    .line 103
    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 p1, 0x0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/EmailHandler;->currentActivity:Landroid/app/Activity;

    const-string p1, "callback"

    const/4 p2, 0x1

    .line 106
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string p4, "sent"

    aput-object p4, p2, p3

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/urlhandlers/EmailHandler;->finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
