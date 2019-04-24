.class public final enum Lcom/ibotta/api/model/receipt/ReceiptFormat;
.super Ljava/lang/Enum;
.source "ReceiptFormat.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/receipt/ReceiptFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/receipt/ReceiptFormat;

.field public static final enum LETTER:Lcom/ibotta/api/model/receipt/ReceiptFormat;

.field public static final enum STANDARD:Lcom/ibotta/api/model/receipt/ReceiptFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 8
    new-instance v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;

    const-string v1, "STANDARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/receipt/ReceiptFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;->STANDARD:Lcom/ibotta/api/model/receipt/ReceiptFormat;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;

    const-string v1, "LETTER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/receipt/ReceiptFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;->LETTER:Lcom/ibotta/api/model/receipt/ReceiptFormat;

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [Lcom/ibotta/api/model/receipt/ReceiptFormat;

    sget-object v1, Lcom/ibotta/api/model/receipt/ReceiptFormat;->STANDARD:Lcom/ibotta/api/model/receipt/ReceiptFormat;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/receipt/ReceiptFormat;->LETTER:Lcom/ibotta/api/model/receipt/ReceiptFormat;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;->$VALUES:[Lcom/ibotta/api/model/receipt/ReceiptFormat;

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

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/ReceiptFormat;
    .locals 0

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/receipt/ReceiptFormat;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/ReceiptFormat;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_0

    .line 20
    sget-object p0, Lcom/ibotta/api/model/receipt/ReceiptFormat;->STANDARD:Lcom/ibotta/api/model/receipt/ReceiptFormat;

    :cond_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/ReceiptFormat;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/receipt/ReceiptFormat;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/receipt/ReceiptFormat;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/api/model/receipt/ReceiptFormat;->$VALUES:[Lcom/ibotta/api/model/receipt/ReceiptFormat;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/receipt/ReceiptFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/receipt/ReceiptFormat;

    return-object v0
.end method
