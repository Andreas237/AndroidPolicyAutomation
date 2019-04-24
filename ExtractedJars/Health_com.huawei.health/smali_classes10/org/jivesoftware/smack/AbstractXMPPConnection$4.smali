.class Lorg/jivesoftware/smack/AbstractXMPPConnection$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/AbstractXMPPConnection;->processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field final synthetic e:Lorg/jivesoftware/smack/packet/Stanza;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 0

    .line 861
    iput-object p1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;->c:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iput-object p2, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;->e:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 864
    iget-object v0, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;->c:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/AbstractXMPPConnection$4;->e:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->invokeStanzaCollectorsAndNotifyRecvListeners(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 865
    return-void
.end method
