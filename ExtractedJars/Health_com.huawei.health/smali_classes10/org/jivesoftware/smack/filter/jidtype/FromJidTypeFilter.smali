.class public Lorg/jivesoftware/smack/filter/jidtype/FromJidTypeFilter;
.super Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter;-><init>(Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;)V

    .line 32
    return-void
.end method


# virtual methods
.method protected getJidToMatchFrom(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
    .locals 1

    .line 36
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v0

    return-object v0
.end method
