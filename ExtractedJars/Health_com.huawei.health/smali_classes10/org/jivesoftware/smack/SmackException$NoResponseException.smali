.class public final Lorg/jivesoftware/smack/SmackException$NoResponseException;
.super Lorg/jivesoftware/smack/SmackException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/SmackException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoResponseException"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x5a87a4c476e25994L


# instance fields
.field private final filter:Lorg/jivesoftware/smack/filter/StanzaFilter;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 69
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/SmackException$NoResponseException;-><init>(Ljava/lang/String;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 70
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    .line 74
    iput-object p2, p0, Lorg/jivesoftware/smack/SmackException$NoResponseException;->filter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    .line 75
    return-void
.end method

.method private static getWaitingFor(Lorg/jivesoftware/smack/XMPPConnection;)Ljava/lang/StringBuilder;
    .locals 6

    .line 111
    invoke-interface {p0}, Lorg/jivesoftware/smack/XMPPConnection;->getReplyTimeout()J

    move-result-wide v3

    .line 112
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0x100

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No response received within reply timeout. Timeout was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms (~"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    div-long v1, v3, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "s)."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    return-object v5
.end method

.method public static newWith(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)Lorg/jivesoftware/smack/SmackException$NoResponseException;
    .locals 3

    .line 87
    invoke-static {p0}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->getWaitingFor(Lorg/jivesoftware/smack/XMPPConnection;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 88
    const-string v0, " While waiting for "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NoResponseException;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException$NoResponseException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static newWith(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/StanzaCollector;)Lorg/jivesoftware/smack/SmackException$NoResponseException;
    .locals 1

    .line 94
    invoke-virtual {p1}, Lorg/jivesoftware/smack/StanzaCollector;->getStanzaFilter()Lorg/jivesoftware/smack/filter/StanzaFilter;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->newWith(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/SmackException$NoResponseException;

    move-result-object v0

    return-object v0
.end method

.method public static newWith(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/SmackException$NoResponseException;
    .locals 3

    .line 98
    invoke-static {p0}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->getWaitingFor(Lorg/jivesoftware/smack/XMPPConnection;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 99
    const-string v0, " Waited for response using: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    if-eqz p1, :cond_0

    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 104
    :cond_0
    const-string v0, "No filter used or filter was \'null\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    :goto_0
    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NoResponseException;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/jivesoftware/smack/SmackException$NoResponseException;-><init>(Ljava/lang/String;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    return-object v0
.end method


# virtual methods
.method public getFilter()Lorg/jivesoftware/smack/filter/StanzaFilter;
    .locals 1

    .line 83
    iget-object v0, p0, Lorg/jivesoftware/smack/SmackException$NoResponseException;->filter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    return-object v0
.end method
