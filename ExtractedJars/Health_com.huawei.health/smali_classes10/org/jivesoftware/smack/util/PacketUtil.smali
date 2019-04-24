.class public Lorg/jivesoftware/smack/util/PacketUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static extensionElementFrom(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PE::Lorg/jivesoftware/smack/packet/ExtensionElement;>(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Ljava/lang/String;Ljava/lang/String;)TPE;"
        }
    .end annotation

    .line 52
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 53
    if-eqz p1, :cond_0

    invoke-interface {v2}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    :cond_0
    invoke-interface {v2}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    return-object v2

    .line 58
    :cond_1
    goto :goto_0

    .line 59
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static packetExtensionfromCollection(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PE::Lorg/jivesoftware/smack/packet/ExtensionElement;>(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Ljava/lang/String;Ljava/lang/String;)TPE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 38
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/PacketUtil;->extensionElementFrom(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    return-object v0
.end method
