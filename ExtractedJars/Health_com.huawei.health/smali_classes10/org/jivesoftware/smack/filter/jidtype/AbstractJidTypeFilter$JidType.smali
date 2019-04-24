.class public final enum Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "JidType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum BareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum DomainBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum DomainFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum DomainJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum EntityBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum EntityFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum EntityJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

.field public static final enum FullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 55
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "BareJid"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->BareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 56
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "DomainBareJid"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 57
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "DomainFullJid"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 58
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "DomainJid"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 59
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "EntityBareJid"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 60
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "EntityFullJid"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 61
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "EntityJid"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 62
    new-instance v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const-string v1, "FullJid"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->FullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    .line 54
    const/16 v0, 0x8

    new-array v0, v0, [Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->BareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->DomainJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityBareJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityFullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->EntityJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->FullJid:Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->$VALUES:[Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;
    .locals 1

    .line 54
    const-class v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;
    .locals 1

    .line 54
    sget-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->$VALUES:[Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;

    return-object v0
.end method


# virtual methods
.method public isTypeOf(Lo/fte;)Z
    .locals 2

    .line 66
    if-nez p1, :cond_0

    .line 67
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$4;->c:[I

    invoke-virtual {p0}, Lorg/jivesoftware/smack/filter/jidtype/AbstractJidTypeFilter$JidType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 71
    :pswitch_0
    invoke-interface {p1}, Lo/fte;->h()Z

    move-result v0

    return v0

    .line 73
    :pswitch_1
    invoke-interface {p1}, Lo/fte;->i()Z

    move-result v0

    return v0

    .line 75
    :pswitch_2
    invoke-interface {p1}, Lo/fte;->f()Z

    move-result v0

    return v0

    .line 77
    :pswitch_3
    invoke-interface {p1}, Lo/fte;->b()Z

    move-result v0

    return v0

    .line 79
    :pswitch_4
    invoke-interface {p1}, Lo/fte;->a()Z

    move-result v0

    return v0

    .line 81
    :pswitch_5
    invoke-interface {p1}, Lo/fte;->d()Z

    move-result v0

    return v0

    .line 83
    :pswitch_6
    invoke-interface {p1}, Lo/fte;->g()Z

    move-result v0

    return v0

    .line 85
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
