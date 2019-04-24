.class public final Lorg/jivesoftware/smack/filter/FromMatchesFilter;
.super Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;
.source "SourceFile"


# static fields
.field public static final MATCH_NO_FROM_SET:Lorg/jivesoftware/smack/filter/FromMatchesFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    invoke-static {v0}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->create(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/filter/FromMatchesFilter;->MATCH_NO_FROM_SET:Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    return-void
.end method

.method public constructor <init>(Lo/fte;Z)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;-><init>(Lo/fte;Z)V

    .line 45
    return-void
.end method

.method public static create(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;
    .locals 2

    .line 56
    new-instance v0, Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lo/fte;->h()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method

.method public static createBare(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;
    .locals 2

    .line 67
    new-instance v0, Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method

.method public static createFull(Lo/fte;)Lorg/jivesoftware/smack/filter/FromMatchesFilter;
    .locals 2

    .line 78
    new-instance v0, Lorg/jivesoftware/smack/filter/FromMatchesFilter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/filter/FromMatchesFilter;-><init>(Lo/fte;Z)V

    return-object v0
.end method


# virtual methods
.method protected getAddressToCompare(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
    .locals 1

    .line 83
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v0

    return-object v0
.end method
