.class public final enum Lcom/ibotta/api/model/customer/HistoryStatus;
.super Ljava/lang/Enum;
.source "HistoryStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/customer/HistoryStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/customer/HistoryStatus;

.field public static final enum COMPLETE:Lcom/ibotta/api/model/customer/HistoryStatus;

.field public static final enum DUPLICATE:Lcom/ibotta/api/model/customer/HistoryStatus;

.field public static final enum ERROR:Lcom/ibotta/api/model/customer/HistoryStatus;

.field public static final enum PENDING:Lcom/ibotta/api/model/customer/HistoryStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 4
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryStatus;

    const-string v1, "COMPLETE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/customer/HistoryStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->COMPLETE:Lcom/ibotta/api/model/customer/HistoryStatus;

    .line 5
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryStatus;

    const-string v1, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/customer/HistoryStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->PENDING:Lcom/ibotta/api/model/customer/HistoryStatus;

    .line 6
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryStatus;

    const-string v1, "ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/customer/HistoryStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->ERROR:Lcom/ibotta/api/model/customer/HistoryStatus;

    .line 7
    new-instance v0, Lcom/ibotta/api/model/customer/HistoryStatus;

    const-string v1, "DUPLICATE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/customer/HistoryStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->DUPLICATE:Lcom/ibotta/api/model/customer/HistoryStatus;

    const/4 v0, 0x4

    .line 3
    new-array v0, v0, [Lcom/ibotta/api/model/customer/HistoryStatus;

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryStatus;->COMPLETE:Lcom/ibotta/api/model/customer/HistoryStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryStatus;->PENDING:Lcom/ibotta/api/model/customer/HistoryStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryStatus;->ERROR:Lcom/ibotta/api/model/customer/HistoryStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/customer/HistoryStatus;->DUPLICATE:Lcom/ibotta/api/model/customer/HistoryStatus;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryStatus;
    .locals 5

    .line 15
    invoke-static {}, Lcom/ibotta/api/model/customer/HistoryStatus;->values()[Lcom/ibotta/api/model/customer/HistoryStatus;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 16
    invoke-virtual {v3}, Lcom/ibotta/api/model/customer/HistoryStatus;->getApiName()Ljava/lang/String;

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
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryStatus;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/api/model/customer/HistoryStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/customer/HistoryStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/customer/HistoryStatus;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/api/model/customer/HistoryStatus;->$VALUES:[Lcom/ibotta/api/model/customer/HistoryStatus;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/customer/HistoryStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/customer/HistoryStatus;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/HistoryStatus;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
