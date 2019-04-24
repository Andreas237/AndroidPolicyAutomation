.class public final Lorg/jivesoftware/smack/provider/ProviderManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final extensionProviders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;>;"
        }
    .end annotation
.end field

.field private static final iqProviders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/provider/IQProvider<Lorg/jivesoftware/smack/packet/IQ;>;>;"
        }
    .end annotation
.end field

.field private static final streamFeatureProviders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 112
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    .line 113
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    .line 114
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->streamFeatureProviders:Ljava/util/Map;

    .line 121
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getVersion()Ljava/lang/String;

    .line 122
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 259
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->validate(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->removeExtensionProvider(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 262
    instance-of v0, p2, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    if-eqz v0, :cond_0

    .line 263
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    move-object v1, p2

    check-cast v1, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 265
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Provider must be a PacketExtensionProvider"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :goto_0
    return-void
.end method

.method public static addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 197
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->validate(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->removeIQProvider(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 200
    instance-of v0, p2, Lorg/jivesoftware/smack/provider/IQProvider;

    if-eqz v0, :cond_0

    .line 201
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    move-object v1, p2

    check-cast v1, Lorg/jivesoftware/smack/provider/IQProvider;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 203
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Provider must be an IQProvider"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :goto_0
    return-void
.end method

.method public static addLoader(Lorg/jivesoftware/smack/provider/ProviderLoader;)V
    .locals 5

    .line 126
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getIQProviderInfo()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 127
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getIQProviderInfo()Ljava/util/Collection;

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

    check-cast v4, Lorg/jivesoftware/smack/provider/IQProviderInfo;

    .line 128
    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/IQProviderInfo;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/IQProviderInfo;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/IQProviderInfo;->getProvider()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    goto :goto_0

    .line 132
    :cond_0
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getExtensionProviderInfo()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 133
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getExtensionProviderInfo()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;

    .line 134
    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;->getProvider()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    goto :goto_1

    .line 138
    :cond_1
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getStreamFeatureProviderInfo()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 139
    invoke-interface {p0}, Lorg/jivesoftware/smack/provider/ProviderLoader;->getStreamFeatureProviderInfo()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;

    .line 140
    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;->getNamespace()Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-virtual {v4}, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;->getProvider()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    .line 140
    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addStreamFeatureProvider(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider;)V

    .line 142
    goto :goto_2

    .line 144
    :cond_2
    return-void
.end method

.method public static addStreamFeatureProvider(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 303
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->validate(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 305
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->streamFeatureProviders:Ljava/util/Map;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    return-void
.end method

.method public static getExtensionProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation

    .line 242
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 243
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    return-object v0
.end method

.method public static getExtensionProviders()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;>;"
        }
    .end annotation

    .line 292
    new-instance v1, Ljava/util/ArrayList;

    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 294
    return-object v1
.end method

.method public static getIQProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/IQProvider;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/IQProvider<Lorg/jivesoftware/smack/packet/IQ;>;"
        }
    .end annotation

    .line 167
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 168
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/provider/IQProvider;

    return-object v0
.end method

.method public static getIQProviders()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/jivesoftware/smack/provider/IQProvider<Lorg/jivesoftware/smack/packet/IQ;>;>;"
        }
    .end annotation

    .line 179
    new-instance v1, Ljava/util/ArrayList;

    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 180
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 181
    return-object v1
.end method

.method private static getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 314
    invoke-static {p0, p1}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStreamFeatureProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation

    .line 298
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 299
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->streamFeatureProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    return-object v0
.end method

.method public static removeExtensionProvider(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 279
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 280
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->extensionProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    return-object v1
.end method

.method public static removeIQProvider(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 217
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 218
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->iqProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    return-object v1
.end method

.method public static removeStreamFeatureProvider(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 309
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 310
    sget-object v0, Lorg/jivesoftware/smack/provider/ProviderManager;->streamFeatureProviders:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    return-void
.end method

.method private static validate(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 318
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "elementName must not be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 321
    :cond_0
    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 322
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "namespace must not be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 324
    :cond_1
    return-void
.end method
