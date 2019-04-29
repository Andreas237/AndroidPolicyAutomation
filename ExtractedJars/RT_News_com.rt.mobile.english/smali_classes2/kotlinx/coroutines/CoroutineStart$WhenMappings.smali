.class public final synthetic Lkotlinx/coroutines/CoroutineStart$WhenMappings;
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
    .locals 6

    invoke-static {}, Lkotlinx/coroutines/CoroutineStart;->values()[Lkotlinx/coroutines/CoroutineStart;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->DEFAULT:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v5}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v5

    aput v4, v0, v5

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->ATOMIC:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v5}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v5

    aput v3, v0, v5

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v5}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v5

    aput v2, v0, v5

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v5}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v5

    aput v1, v0, v5

    invoke-static {}, Lkotlinx/coroutines/CoroutineStart;->values()[Lkotlinx/coroutines/CoroutineStart;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v5, Lkotlinx/coroutines/CoroutineStart;->DEFAULT:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v5}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v5

    aput v4, v0, v5

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v4, Lkotlinx/coroutines/CoroutineStart;->ATOMIC:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v4}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v4

    aput v3, v0, v4

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v3, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v3}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v3

    aput v2, v0, v3

    sget-object v0, Lkotlinx/coroutines/CoroutineStart$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v2, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    invoke-virtual {v2}, Lkotlinx/coroutines/CoroutineStart;->ordinal()I

    move-result v2

    aput v1, v0, v2

    return-void
.end method
