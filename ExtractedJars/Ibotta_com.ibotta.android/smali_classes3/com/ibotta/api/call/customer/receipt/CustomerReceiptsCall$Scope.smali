.class public final enum Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;
.super Ljava/lang/Enum;
.source "CustomerReceiptsCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Scope"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

.field public static final enum COMPLETE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

.field public static final enum DUPLICATE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

.field public static final enum ERROR:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

.field public static final enum PENDING:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 17
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->PENDING:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    .line 18
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    const-string v1, "ERROR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->ERROR:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    .line 19
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    const-string v1, "DUPLICATE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->DUPLICATE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    .line 20
    new-instance v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    const-string v1, "COMPLETE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->COMPLETE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    const/4 v0, 0x4

    .line 16
    new-array v0, v0, [Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    sget-object v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->PENDING:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->ERROR:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->DUPLICATE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->COMPLETE:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->$VALUES:[Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;
    .locals 1

    .line 16
    const-class v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->$VALUES:[Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    invoke-virtual {v0}, [Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
