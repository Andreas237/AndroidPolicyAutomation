.class Lorg/jivesoftware/smack/AbstractXMPPConnection$5;
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

.field final synthetic c:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;

.field final synthetic d:Lorg/jivesoftware/smack/packet/IQ;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;Lorg/jivesoftware/smack/packet/IQ;)V
    .locals 0

    .line 926
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->b:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->c:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;

    iput-object p3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->d:Lorg/jivesoftware/smack/packet/IQ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 929
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->c:Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->d:Lorg/jivesoftware/smack/packet/IQ;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/iqrequest/IQRequestHandler;->handleIQRequest(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v2

    .line 930
    if-nez v2, :cond_0

    .line 936
    return-void

    .line 939
    :cond_0
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$5;->b:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0, v2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 943
    goto :goto_0

    .line 941
    :catch_0
    move-exception v3

    .line 942
    const-string v0, "sns"

    const-string v1, "Exception while sending response to IQ request"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    :goto_0
    return-void
.end method
