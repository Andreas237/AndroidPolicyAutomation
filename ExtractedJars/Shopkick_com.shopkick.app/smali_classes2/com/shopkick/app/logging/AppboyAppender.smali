.class public Lcom/shopkick/app/logging/AppboyAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "AppboyAppender.java"


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;


# instance fields
.field private final appContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Lcom/shopkick/app/logging/AppboyAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/logging/AppboyAppender;->APPENDER_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 30
    sget-object v0, Lcom/shopkick/app/logging/AppboyAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 3

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/logging/AppboyAppender;->shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36
    invoke-virtual {p0, p2}, Lcom/shopkick/app/logging/AppboyAppender;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/EventAppenderConfig;

    .line 37
    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/EventAppenderConfig;->findMatchRule(Lcom/shopkick/logging/Message;)Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 40
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->getCurrentUser()Lcom/appboy/AppboyUser;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    .line 42
    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->getCurrentUser()Lcom/appboy/AppboyUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/AppboyUser;->getUserId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    .line 43
    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->getCurrentUser()Lcom/appboy/AppboyUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/AppboyUser;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;)V

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/logging/AppboyAppender;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;->eventName:Ljava/lang/String;

    new-instance v1, Lcom/appboy/models/outgoing/AppboyProperties;

    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-direct {v1, v2}, Lcom/appboy/models/outgoing/AppboyProperties;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v0, p2, v1}, Lcom/appboy/Appboy;->logCustomEvent(Ljava/lang/String;Lcom/appboy/models/outgoing/AppboyProperties;)V

    :cond_2
    return-void
.end method
