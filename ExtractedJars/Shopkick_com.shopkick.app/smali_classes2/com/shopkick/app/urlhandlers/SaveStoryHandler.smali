.class public Lcom/shopkick/app/urlhandlers/SaveStoryHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "SaveStoryHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "save_story"

.field private static final PARAM_CACHE_KEY:Ljava/lang/String; = "cache_key"

.field private static final PARAM_CALLBACK:Ljava/lang/String; = "callback"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 27
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    .line 28
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->isAsync:Z

    return-void
.end method

.method private faveCompletedWithSuccess(Z)V
    .locals 3

    const-string v0, "callback"

    const/4 v1, 0x1

    .line 78
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private faveUpdateDidFail()V
    .locals 1

    const/4 v0, 0x0

    .line 74
    invoke-direct {p0, v0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveCompletedWithSuccess(Z)V

    return-void
.end method

.method private faveUpdateDidSucceed()V
    .locals 1

    const/4 v0, 0x1

    .line 70
    invoke-direct {p0, v0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveCompletedWithSuccess(Z)V

    return-void
.end method

.method private subscribe()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storiesSaveDoneEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string/jumbo v1, "storiesSaveFailedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private unsubscribe()V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 46
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    .line 47
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->unsubscribe()V

    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 4

    .line 35
    new-instance v0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/stories/StoriesDataSource;Lcom/shopkick/app/util/NotificationCenter;)V

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
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 3

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->finish()V

    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->params:Ljava/util/Map;

    const-string v1, "cache_key"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 59
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveUpdateDidFail()V

    .line 62
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->subscribe()V

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->params:Ljava/util/Map;

    const-string v2, "cache_key"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/stories/StoriesDataSource;->saveStory(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 64
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->unsubscribe()V

    .line 65
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveUpdateDidFail()V

    :cond_2
    return-void
.end method

.method public finish()V
    .locals 1

    .line 40
    invoke-super {p0}, Lcom/shopkick/app/url/URLHandler;->finish()V

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    .line 98
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->unsubscribe()V

    const-string/jumbo p2, "storiesSaveDoneEvent"

    if-ne p1, p2, :cond_0

    .line 100
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveUpdateDidSucceed()V

    goto :goto_0

    :cond_0
    const-string/jumbo p2, "storiesSaveFailedEvent"

    if-ne p1, p2, :cond_1

    .line 102
    invoke-direct {p0}, Lcom/shopkick/app/urlhandlers/SaveStoryHandler;->faveUpdateDidFail()V

    :cond_1
    :goto_0
    return-void
.end method
