.class public final synthetic Lio/streamroot/dna/core/QosModule$WhenMappings;
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
    .locals 8

    invoke-static {}, Lio/streamroot/dna/core/PlaybackState;->values()[Lio/streamroot/dna/core/PlaybackState;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x6

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v7, Lio/streamroot/dna/core/PlaybackState;->PLAYING:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v7}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v7

    aput v1, v0, v7

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->PAUSING:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->BUFFERING:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->SEEKING:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->ENDED:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sget-object v0, Lio/streamroot/dna/core/QosModule$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/streamroot/dna/core/PlaybackState;->IDLE:Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v1}, Lio/streamroot/dna/core/PlaybackState;->ordinal()I

    move-result v1

    aput v6, v0, v1

    return-void
.end method
