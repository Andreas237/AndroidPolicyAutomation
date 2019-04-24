.class public final enum Lcom/ibotta/android/earnings/TxLedgerData$TxState;
.super Ljava/lang/Enum;
.source "TxLedgerData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/earnings/TxLedgerData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TxState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/earnings/TxLedgerData$TxState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/earnings/TxLedgerData$TxState;

.field public static final enum CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

.field public static final enum COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

.field public static final enum ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

.field public static final enum PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

.field public static final enum UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 20
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/earnings/TxLedgerData$TxState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    .line 21
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const-string v1, "COMPLETE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/earnings/TxLedgerData$TxState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    .line 22
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const-string v1, "CANCELED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/earnings/TxLedgerData$TxState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    .line 23
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/earnings/TxLedgerData$TxState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    .line 24
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const-string v1, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/earnings/TxLedgerData$TxState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const/4 v0, 0x5

    .line 19
    new-array v0, v0, [Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->$VALUES:[Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/earnings/TxLedgerData$TxState;
    .locals 1

    .line 19
    const-class v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/earnings/TxLedgerData$TxState;
    .locals 1

    .line 19
    sget-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->$VALUES:[Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0}, [Lcom/ibotta/android/earnings/TxLedgerData$TxState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    return-object v0
.end method
