.class public Lcom/shopkick/app/logging/EventAppenderConfig;
.super Lcom/shopkick/app/logging/SimpleAppenderConfig;
.source "EventAppenderConfig.java"


# instance fields
.field private appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZJLcom/shopkick/app/fetchers/api/skapi/LogConfig;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/logging/SimpleAppenderConfig;-><init>()V

    .line 31
    iput-boolean p1, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->enabled:Z

    .line 32
    iput-wide p2, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->activeArea:J

    .line 33
    iput-object p4, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    return-void
.end method

.method private booleanEquals(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 128
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private checkMatchRule(Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;Lcom/shopkick/logging/Message;)Z
    .locals 4

    .line 100
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;->rules:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 101
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 109
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/shopkick/logging/Message;->safelyExtractString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string/jumbo v3, "true"

    .line 115
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "false"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 119
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    .line 116
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/logging/EventAppenderConfig;->booleanEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_5
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public findMatchRule(Lcom/shopkick/logging/Message;)Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;
    .locals 7
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "event_type"

    .line 56
    const-class v2, Ljava/lang/Integer;

    invoke-virtual {p1, v0, v2}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 58
    iget-object v2, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;->businessEventEntries:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/BusinessEventEntry;

    .line 59
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/BusinessEventEntry;->eventType:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    .line 60
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/BusinessEventEntry;->matchRule:Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    invoke-direct {p0, v4, p1}, Lcom/shopkick/app/logging/EventAppenderConfig;->checkMatchRule(Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;Lcom/shopkick/logging/Message;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 61
    iget-object p1, v3, Lcom/shopkick/app/fetchers/api/skapi/BusinessEventEntry;->matchRule:Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    return-object p1

    :cond_2
    const-string v0, "element"

    .line 68
    const-class v2, Ljava/lang/Integer;

    invoke-virtual {p1, v0, v2}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v2, "screen"

    .line 69
    const-class v3, Ljava/lang/Integer;

    invoke-virtual {p1, v2, v3}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "action"

    .line 70
    const-class v4, Ljava/lang/Integer;

    invoke-virtual {p1, v3, v4}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 71
    iget-object v4, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;->uiEventEntries:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;

    .line 72
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->screen:Ljava/lang/Integer;

    if-eqz v6, :cond_4

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->screen:Ljava/lang/Integer;

    invoke-virtual {v6, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_4
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->action:Ljava/lang/Integer;

    if-eqz v6, :cond_5

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->action:Ljava/lang/Integer;

    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_5
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->element:Ljava/lang/Integer;

    if-eqz v6, :cond_6

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->element:Ljava/lang/Integer;

    .line 74
    invoke-virtual {v6, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_0

    .line 77
    :cond_6
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->matchRule:Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    invoke-direct {p0, v6, p1}, Lcom/shopkick/app/logging/EventAppenderConfig;->checkMatchRule(Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;Lcom/shopkick/logging/Message;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 78
    iget-object p1, v5, Lcom/shopkick/app/fetchers/api/skapi/UIEventEntry;->matchRule:Lcom/shopkick/app/fetchers/api/skapi/ClientEventMatchRule;

    return-object p1

    :cond_7
    return-object v1
.end method

.method public getAppenderLogConfig()Lcom/shopkick/app/fetchers/api/skapi/LogConfig;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    return-object v0
.end method

.method public final isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method setAppenderLogConfig(Lcom/shopkick/app/fetchers/api/skapi/LogConfig;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/logging/EventAppenderConfig;->appenderLogConfig:Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    return-void
.end method
