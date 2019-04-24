.class public final enum Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;
.super Ljava/lang/Enum;
.source "BgcPostTransactionCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StripePaymentType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

.field public static final enum GOOGLE_PAY_TOKEN:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

.field public static final enum STRIPE_CARD_SOURCE:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 76
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    const-string v1, "STRIPE_CARD_SOURCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->STRIPE_CARD_SOURCE:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    .line 77
    new-instance v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    const-string v1, "GOOGLE_PAY_TOKEN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->GOOGLE_PAY_TOKEN:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    const/4 v0, 0x2

    .line 75
    new-array v0, v0, [Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    sget-object v1, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->STRIPE_CARD_SOURCE:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->GOOGLE_PAY_TOKEN:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->$VALUES:[Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 75
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;
    .locals 1

    .line 75
    const-class v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;
    .locals 1

    .line 75
    sget-object v0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->$VALUES:[Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;

    return-object v0
.end method
