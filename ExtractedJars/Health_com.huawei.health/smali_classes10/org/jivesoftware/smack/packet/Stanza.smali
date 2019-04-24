.class public abstract Lorg/jivesoftware/smack/packet/Stanza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/TopLevelStreamElement;


# static fields
.field protected static final DEFAULT_LANGUAGE:Ljava/lang/String;

.field public static final ITEM:Ljava/lang/String; = "item"

.field public static final TEXT:Ljava/lang/String; = "text"


# instance fields
.field private error:Lorg/jivesoftware/smack/packet/XMPPError;

.field private from:Lo/fte;

.field private id:Ljava/lang/String;

.field protected language:Ljava/lang/String;

.field private final packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/util/MultiMap<Ljava/lang/String;Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation
.end field

.field private to:Lo/fte;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 56
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/packet/Stanza;->DEFAULT_LANGUAGE:Ljava/lang/String;

    .line 55
    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 78
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>(Ljava/lang/String;)V

    .line 79
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Lorg/jivesoftware/smack/util/MultiMap;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/MultiMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    .line 82
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;->setStanzaId(Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method protected constructor <init>(Lorg/jivesoftware/smack/packet/Stanza;)V
    .locals 3

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Lorg/jivesoftware/smack/util/MultiMap;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/MultiMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    .line 86
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getTo()Lo/fte;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->to:Lo/fte;

    .line 88
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->from:Lo/fte;

    .line 89
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    .line 92
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getExtensions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 93
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Stanza;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    return-void
.end method

.method public static getDefaultLanguage()Ljava/lang/String;
    .locals 1

    .line 517
    sget-object v0, Lorg/jivesoftware/smack/packet/Stanza;->DEFAULT_LANGUAGE:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected addCommonAttributes(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V
    .locals 2

    .line 526
    const-string v0, "to"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getTo()Lo/fte;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 527
    const-string v0, "from"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 528
    const-string v0, "id"

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 529
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 530
    return-void
.end method

.method public addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    .locals 5

    .line 392
    if-nez p1, :cond_0

    return-void

    .line 393
    :cond_0
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 394
    iget-object v3, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v3

    .line 395
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v2, p1}, Lorg/jivesoftware/smack/util/MultiMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 397
    :goto_0
    return-void
.end method

.method public addExtensions(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 422
    if-nez p1, :cond_0

    return-void

    .line 423
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 424
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Stanza;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 425
    goto :goto_0

    .line 426
    :cond_1
    return-void
.end method

.method protected appendErrorIfExists(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V
    .locals 2

    .line 545
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getError()Lorg/jivesoftware/smack/packet/XMPPError;

    move-result-object v1

    .line 546
    if-eqz v1, :cond_0

    .line 547
    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/XMPPError;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 549
    :cond_0
    return-void
.end method

.method public getError()Lorg/jivesoftware/smack/packet/XMPPError;
    .locals 1

    .line 272
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    return-object v0
.end method

.method public getExtension(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 2

    .line 357
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getExtensions()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lorg/jivesoftware/smack/util/PacketUtil;->extensionElementFrom(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    return-object v0
.end method

.method public getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PE::Lorg/jivesoftware/smack/packet/ExtensionElement;>(Ljava/lang/String;Ljava/lang/String;)TPE;"
        }
    .end annotation

    .line 372
    if-nez p2, :cond_0

    .line 373
    const/4 v0, 0x0

    return-object v0

    .line 375
    :cond_0
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 377
    iget-object v3, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v3

    .line 378
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->getFirst(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/ExtensionElement;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 380
    :goto_0
    if-nez v2, :cond_1

    .line 381
    const/4 v0, 0x0

    return-object v0

    .line 383
    :cond_1
    return-object v2
.end method

.method public getExtensions()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation

    .line 323
    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v1

    .line 325
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/MultiMap;->values()Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 326
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public getExtensions(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation

    .line 341
    const-string v0, "elementName must not be null or empty"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 342
    const-string v0, "namespace must not be null or empty"

    invoke-static {p2, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 343
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 344
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->getAll(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final getExtensionsXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 4

    .line 503
    new-instance v1, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 505
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getExtensions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 506
    invoke-interface {v3}, Lorg/jivesoftware/smack/packet/ExtensionElement;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 507
    goto :goto_0

    .line 508
    :cond_0
    return-object v1
.end method

.method public getFrom()Lo/fte;
    .locals 1

    .line 222
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->from:Lo/fte;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getPacketID()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 113
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReceiver()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->to:Lo/fte;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->to:Lo/fte;

    invoke-interface {v0}, Lo/fte;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 180
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public getSender()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->from:Lo/fte;

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->from:Lo/fte;

    invoke-interface {v0}, Lo/fte;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 230
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public getStanzaId()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTo()Lo/fte;
    .locals 1

    .line 173
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->to:Lo/fte;

    return-object v0
.end method

.method public hasExtension(Ljava/lang/String;)Z
    .locals 5

    .line 455
    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v1

    .line 456
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/MultiMap;->values()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 457
    invoke-interface {v3}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    monitor-exit v1

    const/4 v0, 0x1

    return v0

    .line 460
    :cond_0
    goto :goto_0

    .line 461
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 462
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public hasExtension(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 439
    if-nez p1, :cond_0

    .line 440
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/packet/Stanza;->hasExtension(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 442
    :cond_0
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 443
    iget-object v2, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v2

    .line 444
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    .line 445
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public hasStanzaIdSet()Z
    .locals 1

    .line 148
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected logCommonAttributes(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 534
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->hasStanzaIdSet()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 535
    const-string v0, "id="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 537
    :cond_0
    return-void
.end method

.method public overrideExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 4

    .line 408
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 409
    :cond_0
    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v1

    .line 410
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;->removeExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v2

    .line 411
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 412
    monitor-exit v1

    return-object v2

    .line 413
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method public removeExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 4

    .line 473
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 474
    iget-object v2, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    monitor-enter v2

    .line 475
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->packetExtensions:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/ExtensionElement;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 476
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public removeExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 2

    .line 486
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Stanza;->removeExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    return-object v0
.end method

.method public setError(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V
    .locals 1

    .line 292
    if-nez p1, :cond_0

    .line 293
    return-void

    .line 295
    :cond_0
    invoke-virtual {p1, p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setStanza(Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 296
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->build()Lorg/jivesoftware/smack/packet/XMPPError;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    .line 297
    return-void
.end method

.method public setError(Lorg/jivesoftware/smack/packet/XMPPError;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 283
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Stanza;->error:Lorg/jivesoftware/smack/packet/XMPPError;

    .line 284
    return-void
.end method

.method public setFrom(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 246
    :try_start_0
    invoke-static {p1}, Lo/ftj;->b(Ljava/lang/String;)Lo/fte;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 250
    goto :goto_0

    .line 248
    :catch_0
    move-exception v2

    .line 249
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 251
    :goto_0
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/packet/Stanza;->setFrom(Lo/fte;)V

    .line 252
    return-void
.end method

.method public setFrom(Lo/fte;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Stanza;->from:Lo/fte;

    .line 263
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Stanza;->language:Ljava/lang/String;

    .line 315
    return-void
.end method

.method public setPacketID(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 136
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;->setStanzaId(Ljava/lang/String;)V

    .line 137
    return-void
.end method

.method public setStanzaId()Ljava/lang/String;
    .locals 1

    .line 158
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->hasStanzaIdSet()Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Stanza;->setStanzaId(Ljava/lang/String;)V

    .line 161
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setStanzaId(Ljava/lang/String;)V
    .locals 1

    .line 123
    if-eqz p1, :cond_0

    .line 124
    const-string v0, "id must either be null or not the empty String"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 126
    :cond_0
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Stanza;->id:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public setTo(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 195
    :try_start_0
    invoke-static {p1}, Lo/ftj;->b(Ljava/lang/String;)Lo/fte;
    :try_end_0
    .catch Lo/ftx; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 199
    goto :goto_0

    .line 197
    :catch_0
    move-exception v2

    .line 198
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 200
    :goto_0
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/packet/Stanza;->setTo(Lo/fte;)V

    .line 201
    return-void
.end method

.method public setTo(Lo/fte;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Stanza;->to:Lo/fte;

    .line 211
    return-void
.end method

.method public abstract toString()Ljava/lang/String;
.end method
