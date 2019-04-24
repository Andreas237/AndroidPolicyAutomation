.class public Lcom/shopkick/app/urlhandlers/DataOptOutHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "DataOptOutHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "marketing_data_opt_out"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 23
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-static {}, Lcom/shopkick/app/controllers/UserDataOptOutController;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    .line 35
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/DataOptOutHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {v1}, Lcom/shopkick/app/controllers/UserDataOptOutController;->initialize(Lcom/shopkick/fetchers/api/APIManager;)V

    .line 37
    :cond_1
    invoke-static {}, Lcom/shopkick/app/controllers/UserDataOptOutController;->getInstance()Lcom/shopkick/app/controllers/UserDataOptOutController;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/controllers/UserDataOptOutController;->showDataOptOutFlow(Lcom/shopkick/app/activities/BaseActivity;)V

    return-void
.end method
