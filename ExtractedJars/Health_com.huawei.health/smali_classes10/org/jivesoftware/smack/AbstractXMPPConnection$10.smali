.class Lorg/jivesoftware/smack/AbstractXMPPConnection$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;->invokeStanzaCollectorsAndNotifyRecvListeners(Lorg/jivesoftware/smack/packet/Stanza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field final synthetic c:Lorg/jivesoftware/smack/packet/Stanza;

.field final synthetic d:Ljava/util/Collection;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/util/Collection;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;->b:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;->d:Ljava/util/Collection;

    iput-object p3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;->c:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1002
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;->d:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/StanzaListener;

    .line 1004
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$10;->c:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-interface {v3, v0}, Lorg/jivesoftware/smack/StanzaListener;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1010
    goto :goto_1

    .line 1005
    :catch_0
    move-exception v4

    .line 1006
    const-string v0, "sns"

    const-string v1, "Got not connected exception, aborting"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1007
    goto :goto_2

    .line 1008
    :catch_1
    move-exception v4

    .line 1009
    const-string v0, "sns"

    const-string v1, "Exception in packet listener"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    :goto_1
    goto :goto_0

    .line 1012
    :cond_0
    :goto_2
    return-void
.end method
