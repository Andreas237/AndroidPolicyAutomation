.class public final enum Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;
.super Ljava/lang/Enum;
.source "EarningsDetailRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

.field public static final enum BONUS:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

.field public static final enum OFFER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

.field public static final enum TITLE:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

.field public static final enum TX_LEDGER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

.field public static final enum TX_LEDGER_FOOTER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const-string v1, "TX_LEDGER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TX_LEDGER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const-string v1, "TX_LEDGER_FOOTER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TX_LEDGER_FOOTER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const-string v1, "TITLE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const-string v1, "OFFER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->OFFER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const-string v1, "BONUS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    const/4 v0, 0x5

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TX_LEDGER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TX_LEDGER_FOOTER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->OFFER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    return-object v0
.end method
