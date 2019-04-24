.class Lorg/jivesoftware/smack/AbstractXMPPConnection$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/StanzaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;->addOneTimeSyncCallback(Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/jivesoftware/smack/StanzaListener;

.field final synthetic d:Lorg/jivesoftware/smack/AbstractXMPPConnection;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;)V
    .locals 0

    .line 1357
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;->d:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;->b:Lorg/jivesoftware/smack/StanzaListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1361
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;->b:Lorg/jivesoftware/smack/StanzaListener;

    invoke-interface {v0, p1}, Lorg/jivesoftware/smack/StanzaListener;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1363
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;->d:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeSyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    .line 1364
    goto :goto_0

    .line 1363
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$9;->d:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeSyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    .line 1364
    throw v1

    .line 1365
    :goto_0
    return-void
.end method
