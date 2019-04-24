.class Lorg/jivesoftware/smack/AbstractXMPPConnection$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanzaWithResponseCallback(Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/filter/StanzaFilter;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field final synthetic b:Lorg/jivesoftware/smack/ExceptionCallback;

.field final synthetic d:Lorg/jivesoftware/smack/StanzaListener;

.field final synthetic e:Lorg/jivesoftware/smack/filter/StanzaFilter;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/ExceptionCallback;Lorg/jivesoftware/smack/filter/StanzaFilter;)V
    .locals 0

    .line 1313
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->d:Lorg/jivesoftware/smack/StanzaListener;

    iput-object p3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->b:Lorg/jivesoftware/smack/ExceptionCallback;

    iput-object p4, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->e:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1316
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->d:Lorg/jivesoftware/smack/StanzaListener;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->removeAsyncStanzaListener(Lorg/jivesoftware/smack/StanzaListener;)Z

    move-result v2

    .line 1319
    if-eqz v2, :cond_1

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->b:Lorg/jivesoftware/smack/ExceptionCallback;

    if-eqz v0, :cond_1

    .line 1321
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1323
    new-instance v3, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->e:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-direct {v3, v0, v1}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    goto :goto_0

    .line 1325
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->a:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->e:Lorg/jivesoftware/smack/filter/StanzaFilter;

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->newWith(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/SmackException$NoResponseException;

    move-result-object v3

    .line 1327
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$6;->b:Lorg/jivesoftware/smack/ExceptionCallback;

    invoke-interface {v0, v3}, Lorg/jivesoftware/smack/ExceptionCallback;->processException(Ljava/lang/Exception;)V

    .line 1329
    :cond_1
    return-void
.end method
