.class public final synthetic Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->values()[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    invoke-static {}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->values()[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v1

    aput v4, v0, v1

    return-void
.end method
