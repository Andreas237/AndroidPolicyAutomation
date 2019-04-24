.class Lorg/jivesoftware/smack/AbstractXMPPConnection$3;
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
.field final synthetic c:Lorg/jivesoftware/smack/packet/Stanza;

.field final synthetic d:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field final synthetic e:Lorg/jivesoftware/smack/StanzaListener;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/StanzaListener;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0

    .line 970
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;->d:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;->e:Lorg/jivesoftware/smack/StanzaListener;

    iput-object p3, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;->c:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 974
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;->e:Lorg/jivesoftware/smack/StanzaListener;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$3;->c:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/StanzaListener;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 977
    goto :goto_0

    .line 975
    :catch_0
    move-exception v2

    .line 976
    const-string v0, "sns"

    const-string v1, "Exception in async packet listener"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 978
    :goto_0
    return-void
.end method
