.class public final synthetic Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;
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

.field public static final synthetic $EnumSwitchMapping$4:[I

.field public static final synthetic $EnumSwitchMapping$5:[I

.field public static final synthetic $EnumSwitchMapping$6:[I

.field public static final synthetic $EnumSwitchMapping$7:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 18

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    const/16 v1, 0xb

    const/16 v2, 0xa

    const/16 v3, 0x9

    const/16 v4, 0x8

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/16 v12, 0xc

    const/16 v13, 0xd

    const/16 v14, 0xe

    const/16 v16, 0x10

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DNA_ACCESS_REQUESTED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v10, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DNA_ACCESS_GRANTED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v10, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DISABLED_BY_BYPASS:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v9, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_THRESHOLD:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v8, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->USAGE_QUOTA_REACHED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v7, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_RATIO:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v6, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->INVALID_STREAMROOT_KEY:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v5, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->UNAUTHORISED_STREAMROOT_KEY:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v4, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DISABLED_FOR_INSUFFICIENT_CAPACITY:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v3, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->QOS_TESTER:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v2, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v1, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v15, Lio/streamroot/dna/core/State;->LOADING_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v15, Lio/streamroot/dna/core/State;->LOADING:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v10, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v9, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v15, Lio/streamroot/dna/core/State;->LOADING_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DEFINITELY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v10, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v15, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v9, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v8, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$4:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$4:[I

    sget-object v15, Lio/streamroot/dna/core/State;->DEFINITELY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$4:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v10, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$5:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$5:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$6:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$6:[I

    sget-object v15, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    invoke-static {}, Lio/streamroot/dna/core/State;->values()[Lio/streamroot/dna/core/State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v15, Lio/streamroot/dna/core/State;->STARTING:Lio/streamroot/dna/core/State;

    invoke-virtual {v15}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v15

    aput v11, v0, v15

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v11, Lio/streamroot/dna/core/State;->DNA_ACCESS_REQUESTED:Lio/streamroot/dna/core/State;

    invoke-virtual {v11}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v11

    aput v10, v0, v11

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v10, Lio/streamroot/dna/core/State;->DNA_ACCESS_GRANTED:Lio/streamroot/dna/core/State;

    invoke-virtual {v10}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v10

    aput v9, v0, v10

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v9, Lio/streamroot/dna/core/State;->LOADING:Lio/streamroot/dna/core/State;

    invoke-virtual {v9}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v9

    aput v8, v0, v9

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v8, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    invoke-virtual {v8}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v8

    aput v7, v0, v8

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v7, Lio/streamroot/dna/core/State;->LOADING_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v7}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v7

    aput v6, v0, v7

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v6, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v6}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v6

    aput v5, v0, v6

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v5, Lio/streamroot/dna/core/State;->DISABLED_BY_BYPASS:Lio/streamroot/dna/core/State;

    invoke-virtual {v5}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v5

    aput v4, v0, v5

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v4, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_THRESHOLD:Lio/streamroot/dna/core/State;

    invoke-virtual {v4}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v4

    aput v3, v0, v4

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v3, Lio/streamroot/dna/core/State;->USAGE_QUOTA_REACHED:Lio/streamroot/dna/core/State;

    invoke-virtual {v3}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v3

    aput v2, v0, v3

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v2, Lio/streamroot/dna/core/State;->DISABLED_BY_ACTIVATION_RATIO:Lio/streamroot/dna/core/State;

    invoke-virtual {v2}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v2

    aput v1, v0, v2

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v1, Lio/streamroot/dna/core/State;->INVALID_STREAMROOT_KEY:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aput v12, v0, v1

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v1, Lio/streamroot/dna/core/State;->UNAUTHORISED_STREAMROOT_KEY:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aput v13, v0, v1

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v1, Lio/streamroot/dna/core/State;->DEFINITELY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aput v14, v0, v1

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v1, Lio/streamroot/dna/core/State;->QOS_TESTER:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    const/16 v2, 0xf

    aput v2, v0, v1

    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    sget-object v1, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aput v16, v0, v1

    return-void
.end method
