.class final enum Lcom/stripe/android/view/PaymentFlowPagerEnum;
.super Ljava/lang/Enum;
.source "PaymentFlowPagerEnum.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/view/PaymentFlowPagerEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/view/PaymentFlowPagerEnum;

.field public static final enum SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

.field public static final enum SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;


# instance fields
.field private mLayoutResId:I

.field private mTitleResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 7
    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    const-string v1, "SHIPPING_INFO"

    sget v2, Lcom/stripe/android/R$string;->title_add_an_address:I

    sget v3, Lcom/stripe/android/R$layout;->activity_enter_shipping_info:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/stripe/android/view/PaymentFlowPagerEnum;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    .line 8
    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    const-string v1, "SHIPPING_METHOD"

    sget v2, Lcom/stripe/android/R$string;->title_select_shipping_method:I

    sget v3, Lcom/stripe/android/R$layout;->activity_select_shipping_method:I

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/stripe/android/view/PaymentFlowPagerEnum;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [Lcom/stripe/android/view/PaymentFlowPagerEnum;

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_INFO:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    aput-object v1, v0, v4

    sget-object v1, Lcom/stripe/android/view/PaymentFlowPagerEnum;->SHIPPING_METHOD:Lcom/stripe/android/view/PaymentFlowPagerEnum;

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->$VALUES:[Lcom/stripe/android/view/PaymentFlowPagerEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput p3, p0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->mTitleResId:I

    .line 16
    iput p4, p0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->mLayoutResId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/view/PaymentFlowPagerEnum;
    .locals 1

    .line 5
    const-class v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/view/PaymentFlowPagerEnum;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/view/PaymentFlowPagerEnum;
    .locals 1

    .line 5
    sget-object v0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->$VALUES:[Lcom/stripe/android/view/PaymentFlowPagerEnum;

    invoke-virtual {v0}, [Lcom/stripe/android/view/PaymentFlowPagerEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/view/PaymentFlowPagerEnum;

    return-object v0
.end method


# virtual methods
.method getLayoutResId()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->mLayoutResId:I

    return v0
.end method

.method getTitleResId()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/stripe/android/view/PaymentFlowPagerEnum;->mTitleResId:I

    return v0
.end method
