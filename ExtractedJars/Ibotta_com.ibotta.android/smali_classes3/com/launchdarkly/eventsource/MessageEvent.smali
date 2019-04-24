.class public Lcom/launchdarkly/eventsource/MessageEvent;
.super Ljava/lang/Object;
.source "MessageEvent.java"


# instance fields
.field private final data:Ljava/lang/String;

.field private final lastEventId:Ljava/lang/String;

.field private final origin:Ljava/net/URI;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->lastEventId:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcom/launchdarkly/eventsource/MessageEvent;->origin:Ljava/net/URI;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_4

    .line 37
    :cond_1
    check-cast p1, Lcom/launchdarkly/eventsource/MessageEvent;

    .line 39
    iget-object v2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 40
    :cond_3
    iget-object v2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->lastEventId:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/launchdarkly/eventsource/MessageEvent;->lastEventId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/launchdarkly/eventsource/MessageEvent;->lastEventId:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 41
    :cond_5
    iget-object v2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->origin:Ljava/net/URI;

    if-eqz v2, :cond_6

    iget-object p1, p1, Lcom/launchdarkly/eventsource/MessageEvent;->origin:Ljava/net/URI;

    invoke-virtual {v2, p1}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_2

    :cond_6
    iget-object p1, p1, Lcom/launchdarkly/eventsource/MessageEvent;->origin:Ljava/net/URI;

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v0, 0x0

    :cond_8
    :goto_3
    return v0

    :cond_9
    :goto_4
    return v1
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 47
    iget-object v0, p0, Lcom/launchdarkly/eventsource/MessageEvent;->data:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    iget-object v2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->lastEventId:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 49
    iget-object v2, p0, Lcom/launchdarkly/eventsource/MessageEvent;->origin:Ljava/net/URI;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/net/URI;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method
