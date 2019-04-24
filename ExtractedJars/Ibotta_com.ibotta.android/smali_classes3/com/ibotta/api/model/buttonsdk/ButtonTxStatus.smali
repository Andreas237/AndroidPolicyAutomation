.class public final enum Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;
.super Ljava/lang/Enum;
.source "ButtonTxStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum ERROR:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum NO_REBATES:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum PENDING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum PROCESSING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum TIMEOUT:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 7
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PENDING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "PROCESSING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PROCESSING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "COMPLETE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->ERROR:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "TIMEOUT"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->TIMEOUT:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    .line 13
    new-instance v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const-string v1, "NO_REBATES"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->NO_REBATES:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    const/4 v0, 0x7

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PENDING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PROCESSING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->ERROR:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->TIMEOUT:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->NO_REBATES:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->$VALUES:[Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v0, :cond_1

    .line 28
    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->$VALUES:[Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    return-object v0
.end method
