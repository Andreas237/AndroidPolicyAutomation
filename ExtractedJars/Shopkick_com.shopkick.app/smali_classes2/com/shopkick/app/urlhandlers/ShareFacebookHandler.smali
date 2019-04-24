.class public Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ShareFacebookHandler.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "share_facebook"

.field private static final PARAM_DETAILS:Ljava/lang/String; = "sharing_details"

.field private static final PARAM_IMAGE_URL:Ljava/lang/String; = "sharing_image_url"

.field private static final PARAM_NAME:Ljava/lang/String; = "sharing_title"

.field private static final PARAM_OFFER_ID:Ljava/lang/String; = "offer_id"

.field private static final PARAM_ORIGIN_ELEMENT:Ljava/lang/String; = "origin_element"

.field private static final PARAM_URL:Ljava/lang/String; = "sharing_url"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private callbackManager:Lcom/facebook/CallbackManager;

.field private currentActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private facebookShareType:I

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private offerId:Ljava/lang/String;

.field private originElement:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->originElement:I

    .line 44
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 45
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->isAsync:Z

    .line 48
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->callbackManager:Lcom/facebook/CallbackManager;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->handleCallback(I)V

    return-void
.end method

.method private handleCallback(I)V
    .locals 2

    .line 127
    iget v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->originElement:I

    iget v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->facebookShareType:I

    invoke-direct {p0, v0, p1, v1}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logEvent(III)V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_1

    .line 129
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_0

    .line 131
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    :cond_0
    const/4 p1, 0x0

    .line 133
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    .line 135
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->finish()V

    return-void
.end method

.method private logEvent(III)V
    .locals 1

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logEvent(IIILjava/lang/String;)V

    return-void
.end method

.method private logEvent(IIILjava/lang/String;)V
    .locals 3

    .line 143
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x8d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 144
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->offerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfferId(Ljava/lang/String;)V

    .line 145
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFacebookPublishStatus(Ljava/lang/Integer;)V

    .line 146
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFacebookShareType(Ljava/lang/Integer;)V

    .line 147
    invoke-virtual {v0, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSharedObjectId(Ljava/lang/String;)V

    .line 148
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOriginElement(Ljava/lang/Integer;)V

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 58
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 63
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 3

    .line 53
    new-instance v0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/SKLogger;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 8

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->finish()V

    return-void

    .line 77
    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    .line 78
    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 80
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "sharing_title"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 81
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string/jumbo v3, "sharing_details"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 82
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string/jumbo v4, "sharing_url"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 83
    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string/jumbo v5, "sharing_image_url"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 84
    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string v6, "offer_id"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iput-object v5, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->offerId:Ljava/lang/String;

    .line 85
    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->params:Ljava/util/Map;

    const-string v6, "origin_element"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v5, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->originElement:I

    .line 88
    new-instance v5, Lcom/facebook/share/widget/ShareDialog;

    invoke-direct {v5, v0}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/app/Activity;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->callbackManager:Lcom/facebook/CallbackManager;

    new-instance v6, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;

    invoke-direct {v6, p0}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler$1;-><init>(Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;)V

    const/16 v7, 0x17

    invoke-virtual {v5, v0, v6, v7}, Lcom/facebook/share/widget/ShareDialog;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;I)V

    .line 106
    new-instance v0, Lcom/facebook/share/model/ShareLinkContent$Builder;

    invoke-direct {v0}, Lcom/facebook/share/model/ShareLinkContent$Builder;-><init>()V

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentTitle(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    .line 107
    invoke-virtual {v0, v2}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setQuote(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    if-eqz v3, :cond_1

    .line 109
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareContent$Builder;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/model/ShareLinkContent$Builder;

    :cond_1
    if-eqz v4, :cond_2

    .line 112
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setImageUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v0

    .line 114
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/share/model/ShareLinkContent$Builder;->build()Lcom/facebook/share/model/ShareLinkContent;

    move-result-object v0

    .line 116
    sget-object v1, Lcom/facebook/share/widget/ShareDialog$Mode;->NATIVE:Lcom/facebook/share/widget/ShareDialog$Mode;

    invoke-virtual {v5, v0, v1}, Lcom/facebook/share/widget/ShareDialog;->canShow(Lcom/facebook/share/model/ShareContent;Lcom/facebook/share/widget/ShareDialog$Mode;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    .line 117
    iput v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->facebookShareType:I

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    .line 119
    iput v1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->facebookShareType:I

    .line 122
    :goto_0
    invoke-virtual {v5, v0}, Lcom/facebook/share/widget/ShareDialog;->show(Ljava/lang/Object;)V

    .line 123
    iget v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->originElement:I

    const/4 v1, 0x0

    iget v2, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->facebookShareType:I

    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->logEvent(III)V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x17

    if-ne p2, v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 156
    iget-object p1, p0, Lcom/shopkick/app/urlhandlers/ShareFacebookHandler;->callbackManager:Lcom/facebook/CallbackManager;

    invoke-interface {p1, p2, p3, p4}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    :cond_0
    return-void
.end method
