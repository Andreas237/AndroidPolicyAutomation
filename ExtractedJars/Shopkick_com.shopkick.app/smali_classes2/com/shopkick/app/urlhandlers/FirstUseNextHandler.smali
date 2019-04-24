.class public Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "FirstUseNextHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "first_use_next"

.field public static final IMAGE_LOADING_BAILOUT_PARAM_KEY:Ljava/lang/String; = "timeout_triggered"


# instance fields
.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/launch/FirstUseControllerV2;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    return-void
.end method

.method private isParamTrue(Ljava/lang/String;)Z
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public execute()V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->params:Ljava/util/Map;

    const-string/jumbo v1, "timeout_triggered"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "timeout_triggered"

    invoke-direct {p0, v0}, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->isParamTrue(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->params:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->bailOutToDefaultFlow(Ljava/util/Map;)V

    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/FirstUseNextHandler;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    :cond_1
    :goto_0
    return-void
.end method
