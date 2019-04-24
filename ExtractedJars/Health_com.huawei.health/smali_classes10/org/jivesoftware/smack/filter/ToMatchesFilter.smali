.class public final Lorg/jivesoftware/smack/filter/ToMatchesFilter;
.super Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;
.source "SourceFile"


# static fields
.field public static final MATCH_NO_TO_SET:Lorg/jivesoftware/smack/filter/ToMatchesFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const/4 v0, 0x0

    invoke-static {v0}, Lorg/jivesoftware/smack/filter/ToMatchesFilter;->create(Lo/fte;)Lorg/jivesoftware/smack/filter/ToMatchesFilter;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/filter/ToMatchesFilter;->MATCH_NO_TO_SET:Lorg/jivesoftware/smack/filter/ToMatchesFilter;

    return-void
.end method

.method public constructor <init>(Lo/fte;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;-><init>(Lo/fte;Z)V

    .line 28
    return-void
.end method

.method public static create(Lo/fte;)Lorg/jivesoftware/smack/filter/ToMatchesFilter;
    .locals 2

    .line 39
    new-instance v0, Lorg/jivesoftware/smack/filter/ToMatchesFilter;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lo/fte;->h()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/ToMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method

.method public static createBare(Lo/fte;)Lorg/jivesoftware/smack/filter/ToMatchesFilter;
    .locals 2

    .line 50
    new-instance v0, Lorg/jivesoftware/smack/filter/ToMatchesFilter;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/ToMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method

.method public static createFull(Lo/fte;)Lorg/jivesoftware/smack/filter/ToMatchesFilter;
    .locals 2

    .line 61
    new-instance v0, Lorg/jivesoftware/smack/filter/ToMatchesFilter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/ToMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method


# virtual methods
.method protected getAddressToCompare(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
    .locals 1

    .line 66
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getTo()Lo/fte;

    move-result-object v0

    return-object v0
.end method
