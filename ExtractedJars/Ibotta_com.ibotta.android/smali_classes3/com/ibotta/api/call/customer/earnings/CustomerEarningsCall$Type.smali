.class public final enum Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;
.super Ljava/lang/Enum;
.source "CustomerEarningsCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

.field public static final enum CUSTOMER_BONUS:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

.field public static final enum RECEIPT:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;


# instance fields
.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 42
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    const-string v1, "RECEIPT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->RECEIPT:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    .line 43
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    const-string v1, "CUSTOMER_BONUS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->CUSTOMER_BONUS:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    .line 41
    new-array v0, v4, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->RECEIPT:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->CUSTOMER_BONUS:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->$VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    iput p3, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;
    .locals 1

    .line 41
    const-class v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;
    .locals 1

    .line 41
    sget-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->$VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->value:I

    return v0
.end method
