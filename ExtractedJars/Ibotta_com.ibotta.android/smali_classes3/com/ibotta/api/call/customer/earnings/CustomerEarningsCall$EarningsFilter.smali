.class public final enum Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;
.super Ljava/lang/Enum;
.source "CustomerEarningsCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EarningsFilter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

.field public static final enum COMPLETE:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

.field public static final enum PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;


# instance fields
.field private mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 27
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    .line 28
    new-instance v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    const-string v1, "COMPLETE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->COMPLETE:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    .line 26
    new-array v0, v4, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->PENDING:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->COMPLETE:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->$VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    iput p3, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->mask:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;
    .locals 1

    .line 26
    const-class v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->$VALUES:[Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    return-object v0
.end method


# virtual methods
.method public getMask()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->mask:I

    return v0
.end method
