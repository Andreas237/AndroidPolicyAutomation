.class public final enum Lcom/ibotta/api/model/card/GiftCard$DenominationType;
.super Ljava/lang/Enum;
.source "GiftCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/card/GiftCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DenominationType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/card/GiftCard$DenominationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/card/GiftCard$DenominationType;

.field public static final enum FIXED:Lcom/ibotta/api/model/card/GiftCard$DenominationType;

.field public static final enum RANGE:Lcom/ibotta/api/model/card/GiftCard$DenominationType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    const-string v1, "FIXED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/card/GiftCard$DenominationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->FIXED:Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    .line 33
    new-instance v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    const-string v1, "RANGE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/card/GiftCard$DenominationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->RANGE:Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    const/4 v0, 0x2

    .line 31
    new-array v0, v0, [Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    sget-object v1, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->FIXED:Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->RANGE:Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->$VALUES:[Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/card/GiftCard$DenominationType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 42
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/card/GiftCard$DenominationType;
    .locals 1

    .line 31
    const-class v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/card/GiftCard$DenominationType;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->$VALUES:[Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/card/GiftCard$DenominationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    return-object v0
.end method
