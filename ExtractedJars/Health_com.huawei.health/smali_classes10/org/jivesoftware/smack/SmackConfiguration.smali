.class public final Lorg/jivesoftware/smack/SmackConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEBUG:Z = false

.field private static debuggerFactory:Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory; = null

.field private static defaultCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback; = null

.field private static defaultHostnameVerififer:Ljavax/net/ssl/HostnameVerifier; = null

.field private static defaultMechs:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static defaultPacketReplyTimeout:I = 0x0

.field static disabledSmackClasses:Ljava/util/Set; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static loggerFactory:Lorg/jivesoftware/smack/android/SmackLoggerFactory; = null

.field private static packetCollectorSize:I = 0x0

.field static smackInitialized:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    const/16 v0, 0x2710

    sput v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultPacketReplyTimeout:I

    .line 55
    const/16 v0, 0x1388

    sput v0, Lorg/jivesoftware/smack/SmackConfiguration;->packetCollectorSize:I

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->disabledSmackClasses:Ljava/util/Set;

    .line 61
    const/4 v0, 0x0

    sput-boolean v0, Lorg/jivesoftware/smack/SmackConfiguration;->smackInitialized:Z

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->debuggerFactory:Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;

    .line 65
    const/4 v0, 0x0

    sput-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->loggerFactory:Lorg/jivesoftware/smack/android/SmackLoggerFactory;

    .line 86
    new-instance v0, Lorg/jivesoftware/smack/parsing/ExceptionThrowingCallback;

    invoke-direct {v0}, Lorg/jivesoftware/smack/parsing/ExceptionThrowingCallback;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addDisabledSmackClass(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 308
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/SmackConfiguration;->addDisabledSmackClass(Ljava/lang/String;)V

    .line 309
    return-void
.end method

.method public static addDisabledSmackClass(Ljava/lang/String;)V
    .locals 1

    .line 321
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->disabledSmackClasses:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 322
    return-void
.end method

.method public static varargs addDisabledSmackClasses([Ljava/lang/String;)V
    .locals 5

    .line 331
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 332
    invoke-static {v4}, Lorg/jivesoftware/smack/SmackConfiguration;->addDisabledSmackClass(Ljava/lang/String;)V

    .line 331
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 334
    :cond_0
    return-void
.end method

.method public static addSaslMech(Ljava/lang/String;)V
    .locals 1

    .line 176
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    :cond_0
    return-void
.end method

.method public static addSaslMechs(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 187
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 188
    invoke-static {v2}, Lorg/jivesoftware/smack/SmackConfiguration;->addSaslMech(Ljava/lang/String;)V

    .line 189
    goto :goto_0

    .line 190
    :cond_0
    return-void
.end method

.method public static createDebugger(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)Lorg/jivesoftware/smack/debugger/SmackDebugger;
    .locals 1

    .line 212
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->debuggerFactory:Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;

    if-nez v0, :cond_0

    .line 213
    const/4 v0, 0x0

    return-object v0

    .line 215
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->debuggerFactory:Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;

    invoke-interface {v0, p0, p1, p2}, Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;->create(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)Lorg/jivesoftware/smack/debugger/SmackDebugger;

    move-result-object v0

    return-object v0
.end method

.method public static createLogger()Lorg/jivesoftware/smack/android/SmackLogger;
    .locals 1

    .line 236
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->loggerFactory:Lorg/jivesoftware/smack/android/SmackLoggerFactory;

    if-nez v0, :cond_0

    .line 237
    const/4 v0, 0x0

    return-object v0

    .line 239
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->loggerFactory:Lorg/jivesoftware/smack/android/SmackLoggerFactory;

    invoke-interface {v0}, Lorg/jivesoftware/smack/android/SmackLoggerFactory;->create()Lorg/jivesoftware/smack/android/SmackLogger;

    move-result-object v0

    return-object v0
.end method

.method static getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 370
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultHostnameVerififer:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public static getDefaultPacketReplyTimeout()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 108
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getDefaultReplyTimeout()I

    move-result v0

    return v0
.end method

.method public static getDefaultParsingExceptionCallback()Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;
    .locals 1

    .line 289
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    return-object v0
.end method

.method public static getDefaultReplyTimeout()I
    .locals 1

    .line 131
    sget v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultPacketReplyTimeout:I

    if-gtz v0, :cond_0

    .line 132
    const/16 v0, 0x2710

    sput v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultPacketReplyTimeout:I

    .line 134
    :cond_0
    sget v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultPacketReplyTimeout:I

    return v0
.end method

.method public static getSaslMechs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 269
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getStanzaCollectorSize()I
    .locals 1

    .line 157
    sget v0, Lorg/jivesoftware/smack/SmackConfiguration;->packetCollectorSize:I

    return v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    .line 96
    sget-object v0, Lorg/jivesoftware/smack/SmackInitialization;->SMACK_VERSION:Ljava/lang/String;

    return-object v0
.end method

.method public static isDisabledSmackClass(Ljava/lang/String;)Z
    .locals 4

    .line 337
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->disabledSmackClasses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 338
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    const/4 v0, 0x1

    return v0

    .line 341
    :cond_0
    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 343
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v3, :cond_1

    add-int/lit8 v0, v3, 0x1

    .line 345
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-nez v0, :cond_1

    .line 347
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 349
    const/4 v0, 0x1

    return v0

    .line 351
    :cond_1
    goto :goto_0

    .line 352
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isSmackInitialized()Z
    .locals 1

    .line 361
    sget-boolean v0, Lorg/jivesoftware/smack/SmackConfiguration;->smackInitialized:Z

    return v0
.end method

.method public static removeSaslMech(Ljava/lang/String;)V
    .locals 1

    .line 249
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 250
    return-void
.end method

.method public static removeSaslMechs(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 258
    sget-object v0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultMechs:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 259
    return-void
.end method

.method public static setDebuggerFactory(Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;)V
    .locals 0

    .line 198
    sput-object p0, Lorg/jivesoftware/smack/SmackConfiguration;->debuggerFactory:Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;

    .line 199
    return-void
.end method

.method public static setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0

    .line 299
    sput-object p0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultHostnameVerififer:Ljavax/net/ssl/HostnameVerifier;

    .line 300
    return-void
.end method

.method public static setDefaultPacketReplyTimeout(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 120
    invoke-static {p0}, Lorg/jivesoftware/smack/SmackConfiguration;->setDefaultReplyTimeout(I)V

    .line 121
    return-void
.end method

.method public static setDefaultParsingExceptionCallback(Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;)V
    .locals 0

    .line 279
    sput-object p0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultCallback:Lorg/jivesoftware/smack/parsing/ParsingExceptionCallback;

    .line 280
    return-void
.end method

.method public static setDefaultReplyTimeout(I)V
    .locals 1

    .line 144
    if-gtz p0, :cond_0

    .line 145
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 147
    :cond_0
    sput p0, Lorg/jivesoftware/smack/SmackConfiguration;->defaultPacketReplyTimeout:I

    .line 148
    return-void
.end method

.method public static setLoggerFactory(Lorg/jivesoftware/smack/android/SmackLoggerFactory;)V
    .locals 0

    .line 225
    sput-object p0, Lorg/jivesoftware/smack/SmackConfiguration;->loggerFactory:Lorg/jivesoftware/smack/android/SmackLoggerFactory;

    .line 226
    return-void
.end method

.method public static setStanzaCollectorSize(I)V
    .locals 0

    .line 167
    sput p0, Lorg/jivesoftware/smack/SmackConfiguration;->packetCollectorSize:I

    .line 168
    return-void
.end method
