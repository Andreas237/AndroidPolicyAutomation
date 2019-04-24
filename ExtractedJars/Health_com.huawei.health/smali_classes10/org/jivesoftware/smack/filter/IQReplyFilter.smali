.class public Lorg/jivesoftware/smack/filter/IQReplyFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/filter/StanzaFilter;


# static fields
.field private static final TAG:Ljava/lang/String; = "IQReplyFilter"


# instance fields
.field private final fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

.field private final iqAndIdFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

.field private final local:Lo/fti;

.field private final packetId:Ljava/lang/String;

.field private final server:Lo/fsz;

.field private final to:Lo/fte;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/XMPPConnection;)V
    .locals 5

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->isRequestIQ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "IQ must be a request IQ, i.e. of type \'get\' or \'set\'."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_0
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getTo()Lo/fte;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->to:Lo/fte;

    .line 88
    invoke-interface {p2}, Lorg/jivesoftware/smack/XMPPConnection;->getUser()Lo/fti;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->local:Lo/fti;

    .line 89
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->local:Lo/fti;

    if-nez v0, :cond_1

    .line 90
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must have a local (user) JID set. Either you didn\'t configure one or you where not connected at least once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_1
    invoke-interface {p2}, Lorg/jivesoftware/smack/XMPPConnection;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->server:Lo/fsz;

    .line 94
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->packetId:Ljava/lang/String;

    .line 96
    new-instance v3, Lorg/jivesoftware/smack/filter/OrFilter;

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/jivesoftware/smack/filter/StanzaFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/IQTypeFilter;->ERROR:Lorg/jivesoftware/smack/filter/StanzaFilter;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/IQTypeFilter;->RESULT:Lorg/jivesoftware/smack/filter/StanzaFilter;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {v3, v0}, Lorg/jivesoftware/smack/filter/OrFilter;-><init>([Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 97
    new-instance v4, Lorg/jivesoftware/smack/filter/StanzaIdFilter;

    invoke-direct {v4, p1}, Lorg/jivesoftware/smack/filter/StanzaIdFilter;-><init>(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 98
    new-instance v0, Lorg/jivesoftware/smack/filter/AndFilter;

    const/4 v1, 0x2

    new-array v1, v1, [Lorg/jivesoftware/smack/filter/StanzaFilter;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/AndFilter;-><init>([Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->iqAndIdFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    .line 99
    new-instance v0, Lorg/jivesoftware/smack/filter/OrFilter;

    invoke-direct {v0}, Lorg/jivesoftware/smack/filter/OrFilter;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    .line 100
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->to:Lo/fte;

    invoke-static {v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->createFull(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/filter/OrFilter;->addFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 101
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->to:Lo/fte;

    if-nez v0, :cond_2

    .line 102
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->local:Lo/fti;

    invoke-static {v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->createBare(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/filter/OrFilter;->addFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 103
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->server:Lo/fsz;

    invoke-static {v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->createFull(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/filter/OrFilter;->addFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    goto :goto_0

    .line 105
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->to:Lo/fte;

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->local:Lo/fti;

    invoke-interface {v1}, Lo/fti;->m()Lo/ftb;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fte;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    const/4 v1, 0x0

    invoke-static {v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->createFull(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/filter/OrFilter;->addFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    .line 108
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public accept(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 2

    .line 113
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->iqAndIdFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-interface {v0, p1}, Lorg/jivesoftware/smack/filter/StanzaFilter;->accept(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/filter/OrFilter;->accept(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_1
    const-string v0, "IQReplyFilter"

    const-string v1, "Rejected potentially spoofed reply to IQ-packet. packetId"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    const-string v0, ": iqAndIdFilter ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->iqAndIdFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "), "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    const-string v0, ": fromFilter ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/IQReplyFilter;->fromFilter:Lorg/jivesoftware/smack/filter/OrFilter;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/filter/OrFilter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
