.class public final Lorg/jivesoftware/smack/filter/ToTypeFilter;
.super Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;
.source "SourceFile"


# static fields
.field public static final DOMAIN_BARE_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

.field public static final DOMAIN_FULL_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

.field public static final ENTITY_BARE_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

.field public static final ENTITY_FULL_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

.field public static final ENTITY_FULL_OR_BARE_JID:Lorg/jivesoftware/smack/filter/StanzaFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 24
    new-instance v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/ToTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;->ENTITY_FULL_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    .line 25
    new-instance v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/ToTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;->ENTITY_BARE_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    .line 26
    new-instance v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/ToTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;->DOMAIN_FULL_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    .line 27
    new-instance v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/ToTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;->DOMAIN_BARE_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    .line 29
    new-instance v0, Lorg/jivesoftware/smack/filter/OrFilter;

    const/4 v1, 0x2

    new-array v1, v1, [Lorg/jivesoftware/smack/filter/StanzaFilter;

    sget-object v2, Lorg/jivesoftware/smack/filter/ToTypeFilter;->ENTITY_FULL_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lorg/jivesoftware/smack/filter/ToTypeFilter;->ENTITY_BARE_JID:Lorg/jivesoftware/smack/filter/ToTypeFilter;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/OrFilter;-><init>([Lorg/jivesoftware/smack/filter/StanzaFilter;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/ToTypeFilter;->ENTITY_FULL_OR_BARE_JID:Lorg/jivesoftware/smack/filter/StanzaFilter;

    return-void
.end method

.method private constructor <init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected getJidToInspect(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
    .locals 1

    .line 37
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getTo()Lo/fte;

    move-result-object v0

    return-object v0
.end method
