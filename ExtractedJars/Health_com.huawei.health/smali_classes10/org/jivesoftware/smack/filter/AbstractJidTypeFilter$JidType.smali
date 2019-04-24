.class public final enum Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "JidType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

.field public static final enum domainBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

.field public static final enum domainFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

.field public static final enum entityBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

.field public static final enum entityFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    new-instance v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const-string v1, "entityFull"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    .line 26
    new-instance v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const-string v1, "entityBare"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    .line 27
    new-instance v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const-string v1, "domainFull"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    .line 28
    new-instance v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const-string v1, "domainBare"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    .line 24
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->entityBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainFull:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->domainBare:Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->$VALUES:[Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;
    .locals 1

    .line 24
    const-class v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;
    .locals 1

    .line 24
    sget-object v0, Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->$VALUES:[Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/filter/AbstractJidTypeFilter$JidType;

    return-object v0
.end method
