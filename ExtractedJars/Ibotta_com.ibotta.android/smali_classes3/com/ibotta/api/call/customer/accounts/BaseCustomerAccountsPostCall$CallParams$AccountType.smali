.class public final enum Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;
.super Ljava/lang/Enum;
.source "BaseCustomerAccountsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AccountType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum AMER:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum CHECKING:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum DISC:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum JCB:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum MASTERCARD:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum SAVINGS:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field public static final enum VISA:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 76
    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "VISA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->VISA:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "MASTERCARD"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->MASTERCARD:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "AMER"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->AMER:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "DISC"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->DISC:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "JCB"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->JCB:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "SAVINGS"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->SAVINGS:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    new-instance v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const-string v1, "CHECKING"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->CHECKING:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    const/4 v0, 0x7

    .line 75
    new-array v0, v0, [Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->VISA:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->MASTERCARD:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->AMER:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->DISC:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->JCB:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->SAVINGS:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->CHECKING:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->$VALUES:[Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;
    .locals 1

    .line 75
    const-class v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;
    .locals 1

    .line 75
    sget-object v0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->$VALUES:[Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    return-object v0
.end method
