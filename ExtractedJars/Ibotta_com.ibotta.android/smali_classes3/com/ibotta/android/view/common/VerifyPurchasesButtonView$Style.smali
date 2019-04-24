.class public final enum Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;
.super Ljava/lang/Enum;
.source "VerifyPurchasesButtonView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

.field public static final enum APP:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

.field public static final enum LOYALTY:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

.field public static final enum ONLINE:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

.field public static final enum RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;


# instance fields
.field private final drawableId:I

.field private final labelId:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 28
    new-instance v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    const-string v1, "RECEIPT"

    const/4 v2, 0x0

    const v3, 0x7f11020b

    const v4, 0x7f080008

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 29
    new-instance v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    const-string v1, "LOYALTY"

    const/4 v4, 0x1

    const v5, 0x7f080007

    invoke-direct {v0, v1, v4, v3, v5}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->LOYALTY:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 30
    new-instance v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    const-string v1, "ONLINE"

    const/4 v5, 0x2

    const v6, 0x7f080006

    invoke-direct {v0, v1, v5, v3, v6}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->ONLINE:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 31
    new-instance v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    const-string v1, "APP"

    const/4 v3, 0x3

    const v6, 0x7f1101ea

    const v7, 0x7f0802a2

    invoke-direct {v0, v1, v3, v6, v7}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->APP:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    const/4 v0, 0x4

    .line 27
    new-array v0, v0, [Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    sget-object v1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->LOYALTY:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->ONLINE:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->APP:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->$VALUES:[Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput p3, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->labelId:I

    .line 38
    iput p4, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->drawableId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;
    .locals 1

    .line 27
    const-class v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->$VALUES:[Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    return-object v0
.end method


# virtual methods
.method public getDrawableId()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->drawableId:I

    return v0
.end method

.method public getLabelId()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->labelId:I

    return v0
.end method
