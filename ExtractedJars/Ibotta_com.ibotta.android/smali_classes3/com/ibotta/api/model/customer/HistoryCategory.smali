.class public final enum Lcom/ibotta/api/model/customer/HistoryCategory;
.super Ljava/lang/Enum;
.source "HistoryCategory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/HistoryCategory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/HistoryCategory;

.field public static final enum COMPLETED:Lcom/ibotta/api/model/customer/HistoryCategory;

.field public static final enum PENDING:Lcom/ibotta/api/model/customer/HistoryCategory;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/customer/HistoryCategory;


# instance fields
.field private apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 4
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryCategory;

    const-string v1, "PENDING"

    const-string v2, "pending"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/customer/HistoryCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryCategory;->PENDING:Lcom/ibotta/api/model/customer/HistoryCategory;

    .line 5
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryCategory;

    const-string v1, "COMPLETED"

    const-string v2, "history"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/customer/HistoryCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryCategory;->COMPLETED:Lcom/ibotta/api/model/customer/HistoryCategory;

    .line 6
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryCategory;

    const-string v1, "UNKNOWN"

    const-string v2, "unknown"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/customer/HistoryCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryCategory;->UNKNOWN:Lcom/ibotta/api/model/customer/HistoryCategory;

    const/4 v0, 0x3

    .line 3
    new-array v0, v0, [Lcom/ibotta/api/model/customer/HistoryCategory;

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryCategory;->PENDING:Lcom/ibotta/api/model/customer/HistoryCategory;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryCategory;->COMPLETED:Lcom/ibotta/api/model/customer/HistoryCategory;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryCategory;->UNKNOWN:Lcom/ibotta/api/model/customer/HistoryCategory;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryCategory;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryCategory;

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

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 11
    iput-object p3, p0, Lcom/ibotta/api/model/customer/HistoryCategory;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryCategory;
    .locals 5

    .line 20
    invoke-static {}, Lcom/ibotta/api/model/customer/HistoryCategory;->values()[Lcom/ibotta/api/model/customer/HistoryCategory;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 21
    invoke-virtual {v3}, Lcom/ibotta/api/model/customer/HistoryCategory;->getApiName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

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

    .line 28
    sget-object v3, Lcom/ibotta/api/model/customer/HistoryCategory;->UNKNOWN:Lcom/ibotta/api/model/customer/HistoryCategory;

    :cond_2
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryCategory;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/api/model/customer/HistoryCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/HistoryCategory;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/HistoryCategory;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/api/model/customer/HistoryCategory;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryCategory;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/HistoryCategory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/HistoryCategory;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/model/customer/HistoryCategory;->apiName:Ljava/lang/String;

    return-object v0
.end method
