.class final enum Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;
.super Ljava/lang/Enum;
.source "RedeemReqsPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ReceiptVerificationType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

.field public static final enum BARCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

.field public static final enum IMAGE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

.field public static final enum QRCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 78
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->IMAGE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const-string v1, "BARCODE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->BARCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    .line 80
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const-string v1, "QRCODE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->QRCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const/4 v0, 0x3

    .line 77
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->IMAGE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->BARCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->QRCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 77
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;
    .locals 1

    .line 77
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;
    .locals 1

    .line 77
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    return-object v0
.end method
