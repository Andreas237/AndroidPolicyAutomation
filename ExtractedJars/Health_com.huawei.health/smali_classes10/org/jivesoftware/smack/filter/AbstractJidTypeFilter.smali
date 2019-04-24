.class public abstract Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/filter/StanzaFilter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;
    }
.end annotation


# instance fields
.field private final jidType:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;


# direct methods
.method protected constructor <init>(Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;->jidType:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    .line 36
    return-void
.end method


# virtual methods
.method public final accept(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 3

    .line 42
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Stanza;->getFrom()Lo/fte;

    move-result-object v2

    .line 44
    if-nez v2, :cond_0

    .line 45
    const/4 v0, 0x0

    return v0

    .line 48
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$5;->b:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;->jidType:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 50
    :pswitch_0
    invoke-interface {v2}, Lo/fte;->a()Z

    move-result v0

    return v0

    .line 52
    :pswitch_1
    invoke-interface {v2}, Lo/fte;->b()Z

    move-result v0

    return v0

    .line 54
    :pswitch_2
    invoke-interface {v2}, Lo/fte;->f()Z

    move-result v0

    return v0

    .line 56
    :pswitch_3
    invoke-interface {v2}, Lo/fte;->i()Z

    move-result v0

    return v0

    .line 58
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected abstract getJidToInspect(Lorg/jivesoftware/smack/packet/Stanza;)Lo/fte;
.end method
