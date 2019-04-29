.class public final synthetic Lkotlinx/coroutines/channels/TickerChannelsKt$WhenMappings;
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


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    invoke-static {}, Lkotlinx/coroutines/channels/TickerMode;->values()[Lkotlinx/coroutines/channels/TickerMode;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlinx/coroutines/channels/TickerChannelsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lkotlinx/coroutines/channels/TickerChannelsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v3, Lkotlinx/coroutines/channels/TickerMode;->FIXED_PERIOD:Lkotlinx/coroutines/channels/TickerMode;

    invoke-virtual {v3}, Lkotlinx/coroutines/channels/TickerMode;->ordinal()I

    move-result v3

    aput v1, v0, v3

    sget-object v0, Lkotlinx/coroutines/channels/TickerChannelsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lkotlinx/coroutines/channels/TickerMode;->FIXED_DELAY:Lkotlinx/coroutines/channels/TickerMode;

    invoke-virtual {v1}, Lkotlinx/coroutines/channels/TickerMode;->ordinal()I

    move-result v1

    aput v2, v0, v1

    return-void
.end method
