.class public Lcom/launchdarkly/eventsource/EventParser;
.super Ljava/lang/Object;
.source "EventParser.java"


# static fields
.field private static final DIGITS_ONLY:Ljava/util/regex/Pattern;

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private final connectionHandler:Lcom/launchdarkly/eventsource/ConnectionHandler;

.field private data:Ljava/lang/StringBuffer;

.field private eventName:Ljava/lang/String;

.field private final handler:Lcom/launchdarkly/eventsource/EventHandler;

.field private lastEventId:Ljava/lang/String;

.field private final origin:Ljava/net/URI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const-class v0, Lcom/launchdarkly/eventsource/EventParser;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/eventsource/EventParser;->logger:Lorg/slf4j/Logger;

    const-string v0, "^[\\d]+$"

    .line 21
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/launchdarkly/eventsource/EventParser;->DIGITS_ONLY:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Ljava/net/URI;Lcom/launchdarkly/eventsource/EventHandler;Lcom/launchdarkly/eventsource/ConnectionHandler;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->data:Ljava/lang/StringBuffer;

    const-string v0, "message"

    .line 29
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->eventName:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Lcom/launchdarkly/eventsource/EventParser;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    .line 33
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventParser;->origin:Ljava/net/URI;

    .line 34
    iput-object p3, p0, Lcom/launchdarkly/eventsource/EventParser;->connectionHandler:Lcom/launchdarkly/eventsource/ConnectionHandler;

    return-void
.end method

.method private dispatchEvent()V
    .locals 4

    .line 81
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->data:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->data:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 88
    :cond_1
    new-instance v1, Lcom/launchdarkly/eventsource/MessageEvent;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventParser;->lastEventId:Ljava/lang/String;

    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventParser;->origin:Ljava/net/URI;

    invoke-direct {v1, v0, v2, v3}, Lcom/launchdarkly/eventsource/MessageEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V

    .line 89
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->connectionHandler:Lcom/launchdarkly/eventsource/ConnectionHandler;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventParser;->lastEventId:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/launchdarkly/eventsource/ConnectionHandler;->setLastEventId(Ljava/lang/String;)V

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    iget-object v2, p0, Lcom/launchdarkly/eventsource/EventParser;->eventName:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Lcom/launchdarkly/eventsource/EventHandler;->onMessage(Ljava/lang/String;Lcom/launchdarkly/eventsource/MessageEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 93
    iget-object v1, p0, Lcom/launchdarkly/eventsource/EventParser;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v1, v0}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    .line 95
    :goto_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->data:Ljava/lang/StringBuffer;

    const-string v0, "message"

    .line 96
    iput-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->eventName:Ljava/lang/String;

    return-void
.end method

.method private isNumber(Ljava/lang/String;)Z
    .locals 1

    .line 77
    sget-object v0, Lcom/launchdarkly/eventsource/EventParser;->DIGITS_ONLY:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method private processComment(Ljava/lang/String;)V
    .locals 1

    .line 58
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v0, p1}, Lcom/launchdarkly/eventsource/EventHandler;->onComment(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 60
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventParser;->handler:Lcom/launchdarkly/eventsource/EventHandler;

    invoke-interface {v0, p1}, Lcom/launchdarkly/eventsource/EventHandler;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private processField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "data"

    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iget-object p1, p0, Lcom/launchdarkly/eventsource/EventParser;->data:Ljava/lang/StringBuffer;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    const-string v0, "id"

    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    iput-object p2, p0, Lcom/launchdarkly/eventsource/EventParser;->lastEventId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v0, "event"

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    iput-object p2, p0, Lcom/launchdarkly/eventsource/EventParser;->eventName:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, "retry"

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0, p2}, Lcom/launchdarkly/eventsource/EventParser;->isNumber(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 72
    iget-object p1, p0, Lcom/launchdarkly/eventsource/EventParser;->connectionHandler:Lcom/launchdarkly/eventsource/ConnectionHandler;

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/launchdarkly/eventsource/ConnectionHandler;->setReconnectionTimeMs(J)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public line(Ljava/lang/String;)V
    .locals 4

    .line 38
    sget-object v0, Lcom/launchdarkly/eventsource/EventParser;->logger:Lorg/slf4j/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parsing line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-direct {p0}, Lcom/launchdarkly/eventsource/EventParser;->dispatchEvent()V

    goto :goto_0

    :cond_0
    const-string v0, ":"

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/launchdarkly/eventsource/EventParser;->processComment(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, ":"

    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x0

    .line 45
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/2addr v0, v1

    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    const-string v0, " "

    const-string v1, ""

    .line 48
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 50
    :cond_2
    invoke-direct {p0, v3, p1}, Lcom/launchdarkly/eventsource/EventParser;->processField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/launchdarkly/eventsource/EventParser;->processField(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
