.class public final enum Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
.super Ljava/lang/Enum;
.source "Receipt.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/receipt/Receipt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ProcessingState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum CANCELED:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum COMPLETE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum DUPLICATE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum ERROR:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum PENDING:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum PENDING_VERIFICATION:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 39
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->PENDING:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 40
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "PENDING_VERIFICATION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 41
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->ERROR:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 42
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "DUPLICATE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->DUPLICATE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 43
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "COMPLETE"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->COMPLETE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 44
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "CANCELED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->CANCELED:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    .line 45
    new-instance v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const-string v1, "UNKNOWN"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    const/4 v0, 0x7

    .line 38
    new-array v0, v0, [Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->PENDING:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->ERROR:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->DUPLICATE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->COMPLETE:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->CANCELED:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->$VALUES:[Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
    .locals 0

    if-nez p0, :cond_0

    .line 53
    sget-object p0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    return-object p0

    .line 58
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 61
    :catch_0
    sget-object p0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->UNKNOWN:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
    .locals 1

    .line 38
    const-class v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
    .locals 1

    .line 38
    sget-object v0, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->$VALUES:[Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
