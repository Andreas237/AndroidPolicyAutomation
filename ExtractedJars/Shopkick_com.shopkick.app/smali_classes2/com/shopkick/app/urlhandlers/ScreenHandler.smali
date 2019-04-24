.class public Lcom/shopkick/app/urlhandlers/ScreenHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ScreenHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "screen"


# instance fields
.field protected appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 26
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p1, 0x0

    .line 27
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 4

    .line 32
    new-instance v0, Lcom/shopkick/app/urlhandlers/ScreenHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/urlhandlers/ScreenHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ScreenHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 6

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->urlPathComponents:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    .line 43
    const-class v0, Lcom/shopkick/app/urlhandlers/ScreenHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Need at least two path components (/context/screen)."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->urlPathComponents:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 48
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->urlPathComponents:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 49
    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->params:Ljava/util/Map;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2, v3, v4}, Lcom/shopkick/app/application/SKUrlTranslator;->getScreenForSKUrl(Ljava/lang/String;Ljava/util/Map;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;

    move-result-object v3

    if-nez v3, :cond_2

    return-void

    .line 56
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 54
    invoke-static {v1, v2, v4, v5}, Lcom/shopkick/app/application/SKUrlTranslator;->getActivityForSKUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lcom/shopkick/app/application/ClientFlagsManager;)Ljava/lang/Class;

    move-result-object v1

    .line 58
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/ScreenHandler;->params:Ljava/util/Map;

    invoke-direct {v2, v1, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 60
    invoke-virtual {v0, v2}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    return-void
.end method
