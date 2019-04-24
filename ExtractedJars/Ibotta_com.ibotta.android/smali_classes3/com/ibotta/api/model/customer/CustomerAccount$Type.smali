.class public final enum Lcom/ibotta/api/model/customer/CustomerAccount$Type;
.super Ljava/lang/Enum;
.source "CustomerAccount.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/CustomerAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/CustomerAccount$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum NULL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum SCHOOL_DONATION:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum UNITED_WAY:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

.field public static final enum VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 11
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->NULL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "SCHOOL_DONATION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->SCHOOL_DONATION:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "VENMO"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "PAYPAL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "CREDIT_CARD"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "BANK_ACCOUNT"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    new-instance v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const-string v1, "UNITED_WAY"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->UNITED_WAY:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    const/4 v0, 0x7

    .line 10
    new-array v0, v0, [Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->NULL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->SCHOOL_DONATION:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->VENMO:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->PAYPAL:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->CREDIT_CARD:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->BANK_ACCOUNT:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->UNITED_WAY:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    .locals 0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->$VALUES:[Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/CustomerAccount$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-object v0
.end method


# virtual methods
.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
