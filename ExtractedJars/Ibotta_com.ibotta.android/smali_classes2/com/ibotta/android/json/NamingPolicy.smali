.class public final enum Lcom/ibotta/android/json/NamingPolicy;
.super Ljava/lang/Enum;
.source "NamingPolicy.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/json/NamingPolicy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/json/NamingPolicy;

.field public static final enum AS_IS:Lcom/ibotta/android/json/NamingPolicy;

.field public static final enum LOWER_CASE_WITH_UNDERSCORES:Lcom/ibotta/android/json/NamingPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 7
    new-instance v0, Lcom/ibotta/android/json/NamingPolicy;

    const-string v1, "LOWER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/json/NamingPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/json/NamingPolicy;->LOWER_CASE_WITH_UNDERSCORES:Lcom/ibotta/android/json/NamingPolicy;

    .line 8
    new-instance v0, Lcom/ibotta/android/json/NamingPolicy;

    const-string v1, "AS_IS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/json/NamingPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/json/NamingPolicy;->AS_IS:Lcom/ibotta/android/json/NamingPolicy;

    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/json/NamingPolicy;

    sget-object v1, Lcom/ibotta/android/json/NamingPolicy;->LOWER_CASE_WITH_UNDERSCORES:Lcom/ibotta/android/json/NamingPolicy;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/json/NamingPolicy;->AS_IS:Lcom/ibotta/android/json/NamingPolicy;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/json/NamingPolicy;->$VALUES:[Lcom/ibotta/android/json/NamingPolicy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/json/NamingPolicy;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/json/NamingPolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/json/NamingPolicy;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/json/NamingPolicy;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/json/NamingPolicy;->$VALUES:[Lcom/ibotta/android/json/NamingPolicy;

    invoke-virtual {v0}, [Lcom/ibotta/android/json/NamingPolicy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/json/NamingPolicy;

    return-object v0
.end method
