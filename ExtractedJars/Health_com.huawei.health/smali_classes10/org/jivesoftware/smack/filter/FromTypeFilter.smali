.class public final Lorg/jivesoftware/smack/filter/FromTypeFilter;
.super Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;
.source "SourceFile"


# static fields
.field public static final DOMAIN_BARE_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

.field public static final DOMAIN_FULL_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

.field public static final ENTITY_BARE_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

.field public static final ENTITY_FULL_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/FromTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;->ENTITY_FULL_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

    .line 25
    new-instance v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/FromTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;->ENTITY_BARE_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

    .line 26
    new-instance v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/FromTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;->DOMAIN_FULL_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

    .line 27
    new-instance v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/filter/FromTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    sput-object v0, Lorg/jivesoftware/smack/filter/FromTypeFilter;->DOMAIN_BARE_JID:Lorg/jivesoftware/smack/filter/FromTypeFilter;

    return-void
.end method

.method private constructor <init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V

    .line 31
    return-void
.end method


# virtual methods
.method protected getJidToInspect(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
    .locals 1

    .line 35
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v0

    return-object v0
.end method
