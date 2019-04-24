.class Lorg/jivesoftware/smack/AbstractXMPPConnection$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/StanzaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/jivesoftware/smack/StanzaListener;

.field final synthetic d:Lorg/jivesoftware/smack/ExceptionCallback;

.field final synthetic e:Lorg/jivesoftware/smack/AbstractXMPPConnection;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;)V
    .locals 0

    .line 1293
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->e:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->b:Lorg/jivesoftware/smack/StanzaListener;

    iput-object p3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->d:Lorg/jivesoftware/smack/ExceptionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1296
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->e:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0, p0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    move-result v1

    .line 1297
    if-nez v1, :cond_0

    .line 1300
    return-void

    .line 1303
    :cond_0
    :try_start_0
    invoke-static {p1}, Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;->ifHasErrorThenThrow(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 1304
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->b:Lorg/jivesoftware/smack/StanzaListener;

    invoke-interface {v0, p1}, Lorg/jivesoftware/smack/StanzaListener;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException$XMPPErrorException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1310
    goto :goto_0

    .line 1306
    :catch_0
    move-exception v2

    .line 1307
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->d:Lorg/jivesoftware/smack/ExceptionCallback;

    if-eqz v0, :cond_1

    .line 1308
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$7;->d:Lorg/jivesoftware/smack/ExceptionCallback;

    invoke-interface {v0, v2}, Lorg/jivesoftware/smack/ExceptionCallback;->processException(Ljava/lang/Exception;)V

    .line 1311
    :cond_1
    :goto_0
    return-void
.end method
