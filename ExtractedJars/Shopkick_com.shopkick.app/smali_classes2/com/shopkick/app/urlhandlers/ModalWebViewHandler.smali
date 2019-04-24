.class public Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ModalWebViewHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "modalwebview"

.field private static final PARAM_TYPE:Ljava/lang/String; = "type"

.field private static final PARAM_URL:Ljava/lang/String; = "url"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private currentActivity:Lcom/shopkick/app/activities/BaseActivity;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 41
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 42
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 60
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    :cond_0
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 4

    .line 49
    new-instance v0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;Lcom/shopkick/app/util/NotificationCenter;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 23
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 6

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->finish()V

    return-void

    .line 77
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    .line 79
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;-><init>()V

    .line 80
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "url"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    .line 82
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "type"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->type:Ljava/lang/Integer;

    .line 87
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    const/16 v3, 0x13

    if-ne v1, v2, :cond_2

    .line 88
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 89
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, v1, v3}, Lcom/shopkick/app/activities/BaseActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 93
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "request_notification"

    invoke-virtual {v1, p0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 95
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v4, Lcom/shopkick/app/webview/WebViewScreen;

    const/4 v5, 0x0

    .line 97
    invoke-static {v0, v3, v5}, Lcom/shopkick/app/webview/WebViewScreen;->skParams(Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;ILjava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    invoke-direct {v1, v2, v4, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :goto_0
    return-void
.end method

.method public finish()V
    .locals 1

    .line 54
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->finish()V

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    const/16 p1, 0x13

    if-ne p2, p1, :cond_0

    .line 119
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 p1, 0x0

    .line 120
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->finish()V

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "request_notification"

    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x13

    const-string v0, "request_code"

    .line 105
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->toInteger(Ljava/lang/Object;)I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->currentActivity:Lcom/shopkick/app/activities/BaseActivity;

    .line 107
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ModalWebViewHandler;->finish()V

    :cond_0
    return-void
.end method
