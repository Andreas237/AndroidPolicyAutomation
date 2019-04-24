.class public final enum Lcom/ibotta/api/model/customer/HistoryItemType;
.super Ljava/lang/Enum;
.source "HistoryItemType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/HistoryItemType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum ADJUSTMENT:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum CUSTOMER_ACCT_PAYPAL:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum CUSTOMER_ACCT_SCHOOL:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum CUSTOMER_ACCT_UW:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum CUSTOMER_BONUS:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum CUSTOMER_INVITE:Lcom/ibotta/api/model/customer/HistoryItemType;

.field public static final enum RECEIPT:Lcom/ibotta/api/model/customer/HistoryItemType;


# instance fields
.field private apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 4
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "RECEIPT"

    const-string v2, "Receipt"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->RECEIPT:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 5
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "CUSTOMER_ACCT_PAYPAL"

    const-string v2, "CustomerAccount::Paypal"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_PAYPAL:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 6
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "CUSTOMER_ACCT_SCHOOL"

    const-string v2, "CustomerAccount::SchoolDonation"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_SCHOOL:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 7
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "CUSTOMER_ACCT_UW"

    const-string v2, "CustomerAccount::UnitedWay"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_UW:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "CUSTOMER_INVITE"

    const-string v2, "CustomerInvite"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_INVITE:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "CUSTOMER_BONUS"

    const-string v2, "CustomerBonus"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_BONUS:Lcom/ibotta/api/model/customer/HistoryItemType;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    const-string v1, "ADJUSTMENT"

    const-string v2, ""

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/api/model/customer/HistoryItemType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->ADJUSTMENT:Lcom/ibotta/api/model/customer/HistoryItemType;

    const/4 v0, 0x7

    .line 3
    new-array v0, v0, [Lcom/ibotta/api/model/customer/HistoryItemType;

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->RECEIPT:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_PAYPAL:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_SCHOOL:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_ACCT_UW:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_INVITE:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->CUSTOMER_BONUS:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryItemType;->ADJUSTMENT:Lcom/ibotta/api/model/customer/HistoryItemType;

    aput-object v1, v0, v9

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryItemType;

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

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput-object p3, p0, Lcom/ibotta/api/model/customer/HistoryItemType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryItemType;
    .locals 5

    .line 25
    invoke-static {}, Lcom/ibotta/api/model/customer/HistoryItemType;->values()[Lcom/ibotta/api/model/customer/HistoryItemType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 26
    invoke-virtual {v3}, Lcom/ibotta/api/model/customer/HistoryItemType;->getApiName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    .line 33
    sget-object v3, Lcom/ibotta/api/model/customer/HistoryItemType;->ADJUSTMENT:Lcom/ibotta/api/model/customer/HistoryItemType;

    :cond_2
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryItemType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/api/model/customer/HistoryItemType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/HistoryItemType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/HistoryItemType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/api/model/customer/HistoryItemType;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryItemType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/HistoryItemType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/HistoryItemType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/model/customer/HistoryItemType;->apiName:Ljava/lang/String;

    return-object v0
.end method
