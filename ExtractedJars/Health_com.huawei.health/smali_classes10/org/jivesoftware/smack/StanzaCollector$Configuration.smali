.class public final Lorg/jivesoftware/smack/StanzaCollector$Configuration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/StanzaCollector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Configuration"
.end annotation


# instance fields
.field private collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

.field private packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

.field private size:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 308
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getStanzaCollectorSize()I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->size:I

    .line 312
    return-void
.end method

.method synthetic constructor <init>(Lorg/jivesoftware/smack/StanzaCollector$4;)V
    .locals 0

    .line 306
    invoke-direct {p0}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/filter/StanzaFilter;
    .locals 1

    .line 306
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    return-object v0
.end method

.method static synthetic access$100(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)I
    .locals 1

    .line 306
    iget v0, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->size:I

    return v0
.end method

.method static synthetic access$200(Lorg/jivesoftware/smack/StanzaCollector$Configuration;)Lorg/jivesoftware/smack/StanzaCollector;
    .locals 1

    .line 306
    iget-object v0, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

    return-object v0
.end method


# virtual methods
.method public setCollectorToReset(Lorg/jivesoftware/smack/StanzaCollector;)Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    .locals 0

    .line 359
    iput-object p1, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->collectorToReset:Lorg/jivesoftware/smack/StanzaCollector;

    .line 360
    return-object p0
.end method

.method public setPacketFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 324
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->setStanzaFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector$Configuration;

    move-result-object v0

    return-object v0
.end method

.method public setSize(I)Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    .locals 0

    .line 347
    iput p1, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->size:I

    .line 348
    return-object p0
.end method

.method public setStanzaFilter(Lorg/jivesoftware/smack/filter/StanzaFilter;)Lorg/jivesoftware/smack/StanzaCollector$Configuration;
    .locals 0

    .line 335
    iput-object p1, p0, Lorg/jivesoftware/smack/StanzaCollector$Configuration;->packetFilter:Lorg/jivesoftware/smack/filter/StanzaFilter;

    .line 336
    return-object p0
.end method
