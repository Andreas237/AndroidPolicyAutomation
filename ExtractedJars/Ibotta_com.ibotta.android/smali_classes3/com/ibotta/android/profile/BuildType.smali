.class public final enum Lcom/ibotta/android/profile/BuildType;
.super Ljava/lang/Enum;
.source "BuildType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/profile/BuildType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/profile/BuildType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/profile/BuildType;",
        "",
        "(Ljava/lang/String;I)V",
        "IDE",
        "ALPHA",
        "BETA",
        "BETA_EXT",
        "RELEASE",
        "Companion",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/profile/BuildType;

.field public static final enum ALPHA:Lcom/ibotta/android/profile/BuildType;

.field public static final enum BETA:Lcom/ibotta/android/profile/BuildType;

.field public static final enum BETA_EXT:Lcom/ibotta/android/profile/BuildType;

.field public static final Companion:Lcom/ibotta/android/profile/BuildType$Companion;

.field public static final enum IDE:Lcom/ibotta/android/profile/BuildType;

.field public static final enum RELEASE:Lcom/ibotta/android/profile/BuildType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/ibotta/android/profile/BuildType;

    new-instance v1, Lcom/ibotta/android/profile/BuildType;

    const-string v2, "IDE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/profile/BuildType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/profile/BuildType;->IDE:Lcom/ibotta/android/profile/BuildType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/profile/BuildType;

    const-string v2, "ALPHA"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/profile/BuildType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/profile/BuildType;->ALPHA:Lcom/ibotta/android/profile/BuildType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/profile/BuildType;

    const-string v2, "BETA"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/profile/BuildType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/profile/BuildType;->BETA:Lcom/ibotta/android/profile/BuildType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/profile/BuildType;

    const-string v2, "BETA_EXT"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/profile/BuildType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/profile/BuildType;->BETA_EXT:Lcom/ibotta/android/profile/BuildType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/profile/BuildType;

    const-string v2, "RELEASE"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/profile/BuildType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/profile/BuildType;->RELEASE:Lcom/ibotta/android/profile/BuildType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/profile/BuildType;->$VALUES:[Lcom/ibotta/android/profile/BuildType;

    new-instance v0, Lcom/ibotta/android/profile/BuildType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/profile/BuildType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/profile/BuildType;->Companion:Lcom/ibotta/android/profile/BuildType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/profile/BuildType;
    .locals 1

    const-class v0, Lcom/ibotta/android/profile/BuildType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/profile/BuildType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/profile/BuildType;->$VALUES:[Lcom/ibotta/android/profile/BuildType;

    invoke-virtual {v0}, [Lcom/ibotta/android/profile/BuildType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/profile/BuildType;

    return-object v0
.end method
