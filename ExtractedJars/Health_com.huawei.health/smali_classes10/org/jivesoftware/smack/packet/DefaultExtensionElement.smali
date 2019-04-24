.class public Lorg/jivesoftware/smack/packet/DefaultExtensionElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private elementName:Ljava/lang/String;

.field private map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private namespace:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->elementName:Ljava/lang/String;

    .line 65
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->namespace:Ljava/lang/String;

    .line 66
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->elementName:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized getNames()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Ljava/lang/String;>;"
        }
    .end annotation

    monitor-enter p0

    .line 107
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 108
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 110
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized getValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 120
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 121
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 123
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 133
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    .line 136
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->map:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public toXML()Ljava/lang/CharSequence;
    .locals 6

    .line 90
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 91
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->elementName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->namespace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 92
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->getNames()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 93
    invoke-virtual {p0, v4}, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 94
    invoke-virtual {v2, v4, v5}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/DefaultExtensionElement;->elementName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 97
    return-object v2
.end method
