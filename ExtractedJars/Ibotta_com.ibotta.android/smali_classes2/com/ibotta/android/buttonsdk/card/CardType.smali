.class public final enum Lcom/ibotta/android/buttonsdk/card/CardType;
.super Ljava/lang/Enum;
.source "CardType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/buttonsdk/card/CardType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/buttonsdk/card/CardType;

.field public static final enum HOW_IBOTTA_WORKS:Lcom/ibotta/android/buttonsdk/card/CardType;

.field public static final enum OFFER_DETAILS:Lcom/ibotta/android/buttonsdk/card/CardType;

.field public static final enum PRODUCT:Lcom/ibotta/android/buttonsdk/card/CardType;

.field public static final enum RETAILER:Lcom/ibotta/android/buttonsdk/card/CardType;

.field public static final enum SPECIAL_CONDITIONS:Lcom/ibotta/android/buttonsdk/card/CardType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 4
    new-instance v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    const-string v1, "RETAILER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/buttonsdk/card/CardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->RETAILER:Lcom/ibotta/android/buttonsdk/card/CardType;

    .line 5
    new-instance v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    const-string v1, "PRODUCT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/buttonsdk/card/CardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->PRODUCT:Lcom/ibotta/android/buttonsdk/card/CardType;

    .line 6
    new-instance v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    const-string v1, "HOW_IBOTTA_WORKS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/buttonsdk/card/CardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->HOW_IBOTTA_WORKS:Lcom/ibotta/android/buttonsdk/card/CardType;

    .line 7
    new-instance v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    const-string v1, "OFFER_DETAILS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/buttonsdk/card/CardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->OFFER_DETAILS:Lcom/ibotta/android/buttonsdk/card/CardType;

    .line 8
    new-instance v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    const-string v1, "SPECIAL_CONDITIONS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/buttonsdk/card/CardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/buttonsdk/card/CardType;

    const/4 v0, 0x5

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/buttonsdk/card/CardType;

    sget-object v1, Lcom/ibotta/android/buttonsdk/card/CardType;->RETAILER:Lcom/ibotta/android/buttonsdk/card/CardType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/buttonsdk/card/CardType;->PRODUCT:Lcom/ibotta/android/buttonsdk/card/CardType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/buttonsdk/card/CardType;->HOW_IBOTTA_WORKS:Lcom/ibotta/android/buttonsdk/card/CardType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/buttonsdk/card/CardType;->OFFER_DETAILS:Lcom/ibotta/android/buttonsdk/card/CardType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/buttonsdk/card/CardType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/buttonsdk/card/CardType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->$VALUES:[Lcom/ibotta/android/buttonsdk/card/CardType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/buttonsdk/card/CardType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/buttonsdk/card/CardType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/buttonsdk/card/CardType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/buttonsdk/card/CardType;->$VALUES:[Lcom/ibotta/android/buttonsdk/card/CardType;

    invoke-virtual {v0}, [Lcom/ibotta/android/buttonsdk/card/CardType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/buttonsdk/card/CardType;

    return-object v0
.end method
