.class public Lcom/shopkick/app/urlhandlers/VideoHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "VideoHandler.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "video"

.field public static final PARAM_URL:Ljava/lang/String; = "url"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private currentActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 35
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 38
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 2

    .line 30
    new-instance v0, Lcom/shopkick/app/urlhandlers/VideoHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-direct {v0, v1}, Lcom/shopkick/app/urlhandlers/VideoHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V

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
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/VideoHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/VideoHandler;->finish()V

    return-void

    .line 51
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->params:Ljava/util/Map;

    const-string/jumbo v1, "url"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/VideoHandler;->finish()V

    return-void

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 62
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, ".mp4"

    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "video/*"

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 68
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 71
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    const/16 v2, 0x15

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x15

    if-ne p2, p3, :cond_0

    .line 76
    iget-object p2, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    if-ne p2, p1, :cond_0

    .line 77
    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/VideoHandler;->currentActivity:Landroid/app/Activity;

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/VideoHandler;->finish()V

    :cond_0
    return-void
.end method
