.class final enum Lcom/huawei/qrcode/IntentSource;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/qrcode/IntentSource;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/qrcode/IntentSource;

.field public static final enum NATIVE_APP_INTENT:Lcom/huawei/qrcode/IntentSource;

.field public static final enum NONE:Lcom/huawei/qrcode/IntentSource;

.field public static final enum PRODUCT_SEARCH_LINK:Lcom/huawei/qrcode/IntentSource;

.field public static final enum ZXING_LINK:Lcom/huawei/qrcode/IntentSource;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/qrcode/IntentSource;

    const-string v1, "NATIVE_APP_INTENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/IntentSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/IntentSource;->NATIVE_APP_INTENT:Lcom/huawei/qrcode/IntentSource;

    new-instance v0, Lcom/huawei/qrcode/IntentSource;

    const-string v1, "PRODUCT_SEARCH_LINK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/IntentSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/IntentSource;->PRODUCT_SEARCH_LINK:Lcom/huawei/qrcode/IntentSource;

    new-instance v0, Lcom/huawei/qrcode/IntentSource;

    const-string v1, "ZXING_LINK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/IntentSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/IntentSource;->ZXING_LINK:Lcom/huawei/qrcode/IntentSource;

    new-instance v0, Lcom/huawei/qrcode/IntentSource;

    const-string v1, "NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/IntentSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NATIVE_APP_INTENT:Lcom/huawei/qrcode/IntentSource;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->PRODUCT_SEARCH_LINK:Lcom/huawei/qrcode/IntentSource;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->ZXING_LINK:Lcom/huawei/qrcode/IntentSource;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/qrcode/IntentSource;->$VALUES:[Lcom/huawei/qrcode/IntentSource;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/qrcode/IntentSource;
    .locals 1

    const-class v0, Lcom/huawei/qrcode/IntentSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/IntentSource;

    return-object v0
.end method

.method public static values()[Lcom/huawei/qrcode/IntentSource;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/IntentSource;->$VALUES:[Lcom/huawei/qrcode/IntentSource;

    invoke-virtual {v0}, [Lcom/huawei/qrcode/IntentSource;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/qrcode/IntentSource;

    return-object v0
.end method
