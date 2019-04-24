.class public Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "InterceptorWrapper"
.end annotation


# instance fields
.field private final packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

.field private final packetInterceptor:Lorg/jivesoftware/smack/StanzaListener;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 0

    .line 1128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1129
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;->packetInterceptor:Lorg/jivesoftware/smack/StanzaListener;

    .line 1130
    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    .line 1131
    return-void
.end method


# virtual methods
.method public filterMatches(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 1

    .line 1134
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-interface {v0, p1}, Lorg/jivesoftware/smack/filter/StanzaFilter;->accept(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getInterceptor()Lorg/jivesoftware/smack/StanzaListener;
    .locals 1

    .line 1138
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$InterceptorWrapper;->packetInterceptor:Lorg/jivesoftware/smack/StanzaListener;

    return-object v0
.end method
