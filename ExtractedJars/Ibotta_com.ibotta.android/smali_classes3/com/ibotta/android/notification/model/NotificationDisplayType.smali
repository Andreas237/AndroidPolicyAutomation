.class public final enum Lcom/ibotta/android/notification/model/NotificationDisplayType;
.super Ljava/lang/Enum;
.source "NotificationDisplayType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/notification/model/NotificationDisplayType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/notification/model/NotificationDisplayType;",
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0001\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/notification/model/NotificationDisplayType;",
        "",
        "apiName",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getApiName",
        "()Ljava/lang/String;",
        "RECEIPT",
        "CUSTOMER_ACCT_PAYPAL",
        "CUSTOMER_ACCT_VENMO",
        "SCHOOL",
        "CUSTOMER_ACCT_UW",
        "CUSTOMER",
        "REFERRING_CUSTOMER",
        "OFFER",
        "BONUS",
        "SYSTEM",
        "CUSTOMER_GIFT_CARD",
        "CUSTOMER_CREDIT_LEDGER",
        "ADJUSTMENT",
        "CUSTOMER_SUBMITTED_UPC",
        "BUYABLE_GIFT_CARD",
        "CUSTOMER_BUYABLE_GIFT_CARD",
        "Companion",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum ADJUSTMENT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum BONUS:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_ACCT_PAYPAL:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_ACCT_UW:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_ACCT_VENMO:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_CREDIT_LEDGER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum CUSTOMER_SUBMITTED_UPC:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final Companion:Lcom/ibotta/android/notification/model/NotificationDisplayType$Companion;

.field public static final enum OFFER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum RECEIPT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum REFERRING_CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum SCHOOL:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field public static final enum SYSTEM:Lcom/ibotta/android/notification/model/NotificationDisplayType;


# instance fields
.field private final apiName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x10

    new-array v0, v0, [Lcom/ibotta/android/notification/model/NotificationDisplayType;

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "RECEIPT"

    const-string v3, "Receipt"

    const/4 v4, 0x0

    .line 4
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->RECEIPT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_ACCT_PAYPAL"

    const-string v3, "CustomerAccount::Paypal"

    const/4 v4, 0x1

    .line 5
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_ACCT_PAYPAL:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_ACCT_VENMO"

    const-string v3, "CustomerAccount::Venmo"

    const/4 v4, 0x2

    .line 6
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_ACCT_VENMO:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "SCHOOL"

    const-string v3, "School"

    const/4 v4, 0x3

    .line 7
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->SCHOOL:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_ACCT_UW"

    const-string v3, "CustomerAccount::UnitedWay"

    const/4 v4, 0x4

    .line 8
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_ACCT_UW:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER"

    const-string v3, "Customer"

    const/4 v4, 0x5

    .line 9
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "REFERRING_CUSTOMER"

    const-string v3, "ReferringCustomer"

    const/4 v4, 0x6

    .line 10
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->REFERRING_CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "OFFER"

    const-string v3, "Offer"

    const/4 v4, 0x7

    .line 11
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->OFFER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "BONUS"

    const-string v3, "Bonus"

    const/16 v4, 0x8

    .line 12
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BONUS:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "SYSTEM"

    const-string v3, "SystemNotification"

    const/16 v4, 0x9

    .line 13
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->SYSTEM:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_GIFT_CARD"

    const-string v3, "CustomerGiftCard"

    const/16 v4, 0xa

    .line 14
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_CREDIT_LEDGER"

    const-string v3, "CustomerCreditLedger"

    const/16 v4, 0xb

    .line 15
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_CREDIT_LEDGER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "ADJUSTMENT"

    const-string v3, ""

    const/16 v4, 0xc

    .line 16
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ADJUSTMENT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_SUBMITTED_UPC"

    const-string v3, "CustomerSubmittedUpc"

    const/16 v4, 0xd

    .line 17
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_SUBMITTED_UPC:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "BUYABLE_GIFT_CARD"

    const-string v3, "BuyableGiftCard"

    const/16 v4, 0xe

    .line 18
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const-string v2, "CUSTOMER_BUYABLE_GIFT_CARD"

    const-string v3, "CustomerBuyableGiftCard"

    const/16 v4, 0xf

    .line 19
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->$VALUES:[Lcom/ibotta/android/notification/model/NotificationDisplayType;

    new-instance v0, Lcom/ibotta/android/notification/model/NotificationDisplayType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->Companion:Lcom/ibotta/android/notification/model/NotificationDisplayType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/notification/model/NotificationDisplayType;
    .locals 1

    const-class v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/model/NotificationDisplayType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/notification/model/NotificationDisplayType;
    .locals 1

    sget-object v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->$VALUES:[Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v0}, [Lcom/ibotta/android/notification/model/NotificationDisplayType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/notification/model/NotificationDisplayType;

    return-object v0
.end method


# virtual methods
.method public final getApiName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->apiName:Ljava/lang/String;

    return-object v0
.end method
