.class public final enum Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;
.super Ljava/lang/Enum;
.source "WalletV2Tab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

.field public static final enum PAYMENT_METHODS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

.field public static final enum TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;


# instance fields
.field private final layoutResId:I

.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    const-string v1, "TRANSACTIONS"

    const/4 v2, 0x0

    const v3, 0x7f110545

    const v4, 0x7f0c01a1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    const-string v1, "PAYMENT_METHODS"

    const/4 v3, 0x1

    const v4, 0x7f110534

    const v5, 0x7f0c019e

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->PAYMENT_METHODS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->PAYMENT_METHODS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->nameResId:I

    .line 19
    iput p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->layoutResId:I

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 36
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    return-object v0
.end method


# virtual methods
.method public getLayoutResId()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->layoutResId:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 24
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->nameResId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
