.class public final synthetic Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;
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

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    invoke-static {}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->values()[Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->PENDING:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->NO_CARD:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EXPIRED:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->EMPTY:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v5, 0x4

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->TRY_AGAIN:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v5, 0x5

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->INVALID:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v5, 0x6

    aput v5, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->VALID:Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v1

    const/4 v5, 0x7

    aput v5, v0, v1

    invoke-static {}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->values()[Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v4, v0, v1

    invoke-static {}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->values()[Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v4, v0, v1

    invoke-static {}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->values()[Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    aput v4, v0, v1

    return-void
.end method
