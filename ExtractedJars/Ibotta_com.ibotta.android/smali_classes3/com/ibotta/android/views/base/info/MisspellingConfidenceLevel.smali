.class public final enum Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
.super Ljava/lang/Enum;
.source "MispellingConfidenceLevel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;",
        "",
        "(Ljava/lang/String;I)V",
        "EXACT",
        "STRONG",
        "MEDIUM",
        "WEAK",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

.field public static final Companion:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

.field public static final enum EXACT:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

.field public static final enum MEDIUM:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

.field public static final enum STRONG:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

.field public static final enum WEAK:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    new-instance v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const-string v2, "EXACT"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->EXACT:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const-string v2, "STRONG"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->STRONG:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const-string v2, "MEDIUM"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->MEDIUM:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    const-string v2, "WEAK"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->WEAK:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->$VALUES:[Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    new-instance v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->Companion:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final fromValue(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->Companion:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;->fromValue(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->$VALUES:[Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    return-object v0
.end method
