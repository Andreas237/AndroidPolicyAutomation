.class final enum Lcom/shopkick/app/products/ScanScreen$ScanMode;
.super Ljava/lang/Enum;
.source "ScanScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "ScanMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/products/ScanScreen$ScanMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/products/ScanScreen$ScanMode;

.field public static final enum BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

.field public static final enum ERROR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

.field public static final enum IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 217
    new-instance v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;

    const-string v1, "BARCODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/products/ScanScreen$ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 218
    new-instance v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;

    const-string v1, "IR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/products/ScanScreen$ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    .line 219
    new-instance v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;

    const-string v1, "ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/products/ScanScreen$ScanMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ERROR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    const/4 v0, 0x3

    .line 216
    new-array v0, v0, [Lcom/shopkick/app/products/ScanScreen$ScanMode;

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ERROR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->$VALUES:[Lcom/shopkick/app/products/ScanScreen$ScanMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 216
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/products/ScanScreen$ScanMode;
    .locals 1

    .line 216
    const-class v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/products/ScanScreen$ScanMode;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/products/ScanScreen$ScanMode;
    .locals 1

    .line 216
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$ScanMode;->$VALUES:[Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-virtual {v0}, [Lcom/shopkick/app/products/ScanScreen$ScanMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/products/ScanScreen$ScanMode;

    return-object v0
.end method
