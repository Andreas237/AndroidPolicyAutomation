.class public Lorg/jivesoftware/smackx/ping/packet/Ping;
.super Lorg/jivesoftware/smack/packet/SimpleIQ;
.source "SourceFile"


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "ping"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:xmpp:ping"

.field public static final TAG:Ljava/lang/String; = "ping"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    const-string v0, "ping"

    const-string v1, "urn:xmpp:ping"

    invoke-direct {p0, v0, v1}, Lorg/jivesoftware/smack/packet/SimpleIQ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 47
    invoke-direct {p0}, Lorg/jivesoftware/smackx/ping/packet/Ping;-><init>()V

    .line 48
    const/4 v2, 0x0

    .line 50
    :try_start_0
    invoke-static {p1}, Lo/ftj;->b(Ljava/lang/String;)Lo/fte;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 53
    goto :goto_0

    .line 51
    :catch_0
    move-exception v3

    .line 52
    const-string v0, "ping"

    const-string v1, "JidCreate throws a XmppStringprepException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :goto_0
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smackx/ping/packet/Ping;->setTo(Lo/fte;)V

    .line 55
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smackx/ping/packet/Ping;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Lo/fte;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Lorg/jivesoftware/smackx/ping/packet/Ping;-><init>()V

    .line 37
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smackx/ping/packet/Ping;->setTo(Lo/fte;)V

    .line 38
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smackx/ping/packet/Ping;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 39
    return-void
.end method


# virtual methods
.method public getPong()Lorg/jivesoftware/smack/packet/IQ;
    .locals 1

    .line 64
    invoke-static {p0}, Lorg/jivesoftware/smackx/ping/packet/Ping;->createResultIQ(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v0

    return-object v0
.end method
