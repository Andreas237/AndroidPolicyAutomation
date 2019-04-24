.class public interface abstract Lorg/jivesoftware/smack/StanzaListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract processStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method
