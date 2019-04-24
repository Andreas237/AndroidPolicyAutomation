.class public Lcom/shopkick/app/logging/BranchAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "BranchAppender.java"


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Lcom/shopkick/app/logging/BranchAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/logging/BranchAppender;->APPENDER_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 22
    sget-object v0, Lcom/shopkick/app/logging/BranchAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 2

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/logging/BranchAppender;->shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {p0, p2}, Lcom/shopkick/app/logging/BranchAppender;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/EventAppenderConfig;

    .line 29
    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/EventAppenderConfig;->findMatchRule(Lcom/shopkick/logging/Message;)Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 34
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/Branch;->setIdentity(Ljava/lang/String;)V

    .line 37
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 38
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;->eventName:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lio/branch/referral/Branch;->userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method
