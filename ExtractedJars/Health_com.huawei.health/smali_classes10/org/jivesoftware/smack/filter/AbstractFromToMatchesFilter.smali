.class public abstract Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/filter/StanzaFilter;


# instance fields
.field private final address:Lo/fte;

.field private final ignoreResourcepart:Z


# direct methods
.method protected constructor <init>(Lo/fte;Z)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 42
    invoke-interface {p1}, Lo/fte;->m()Lo/ftb;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->address:Lo/fte;

    goto :goto_0

    .line 45
    :cond_0
    iput-object p1, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->address:Lo/fte;

    .line 47
    :goto_0
    iput-boolean p2, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->ignoreResourcepart:Z

    .line 48
    return-void
.end method


# virtual methods
.method public final accept(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 2

    .line 52
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->getAddressToCompare(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;

    move-result-object v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->address:Lo/fte;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 58
    :cond_1
    iget-boolean v0, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->ignoreResourcepart:Z

    if-eqz v0, :cond_2

    .line 59
    invoke-interface {v1}, Lo/fte;->m()Lo/ftb;

    move-result-object v1

    .line 62
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->address:Lo/fte;

    invoke-interface {v1, v0}, Lo/fte;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method protected abstract getAddressToCompare(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 69
    iget-boolean v0, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->ignoreResourcepart:Z

    if-eqz v0, :cond_0

    const-string v2, "ignoreResourcepart"

    goto :goto_0

    :cond_0
    const-string v2, "full"

    .line 70
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/AbstractFromToMatchesFilter;->address:Lo/fte;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
