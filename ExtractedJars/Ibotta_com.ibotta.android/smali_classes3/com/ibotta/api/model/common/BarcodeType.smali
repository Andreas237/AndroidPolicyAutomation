.class public final enum Lcom/ibotta/api/model/common/BarcodeType;
.super Ljava/lang/Enum;
.source "BarcodeType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/common/BarcodeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum CODE128:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum CODE39:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum CODE93:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum EAN13:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum ITF:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum PDF417:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum QR:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum UPCA:Lcom/ibotta/api/model/common/BarcodeType;

.field public static final enum UPCE:Lcom/ibotta/api/model/common/BarcodeType;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 7
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "UPCA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->UPCA:Lcom/ibotta/api/model/common/BarcodeType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "UPCE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->UPCE:Lcom/ibotta/api/model/common/BarcodeType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "EAN13"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->EAN13:Lcom/ibotta/api/model/common/BarcodeType;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "PDF417"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->PDF417:Lcom/ibotta/api/model/common/BarcodeType;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "QR"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->QR:Lcom/ibotta/api/model/common/BarcodeType;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "CODE39"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->CODE39:Lcom/ibotta/api/model/common/BarcodeType;

    .line 13
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "CODE128"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->CODE128:Lcom/ibotta/api/model/common/BarcodeType;

    .line 14
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "CODE93"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->CODE93:Lcom/ibotta/api/model/common/BarcodeType;

    .line 15
    new-instance v0, Lcom/ibotta/api/model/common/BarcodeType;

    const-string v1, "ITF"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/api/model/common/BarcodeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->ITF:Lcom/ibotta/api/model/common/BarcodeType;

    const/16 v0, 0x9

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/common/BarcodeType;

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->UPCA:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->UPCE:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->EAN13:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->PDF417:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->QR:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->CODE39:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->CODE128:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->CODE93:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/api/model/common/BarcodeType;->ITF:Lcom/ibotta/api/model/common/BarcodeType;

    aput-object v1, v0, v10

    sput-object v0, Lcom/ibotta/api/model/common/BarcodeType;->$VALUES:[Lcom/ibotta/api/model/common/BarcodeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 27
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/common/BarcodeType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static toApiName(Lcom/ibotta/api/model/common/BarcodeType;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/common/BarcodeType;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/common/BarcodeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/common/BarcodeType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/common/BarcodeType;->$VALUES:[Lcom/ibotta/api/model/common/BarcodeType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/common/BarcodeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/common/BarcodeType;

    return-object v0
.end method
