.class public final Lio/streamroot/dna/core/context/state/StateManager;
.super Ljava/lang/Object;
.source "StateManager.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u0004H\u0016J\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "Ljava/lang/AutoCloseable;",
        "dnaDisabled",
        "Lkotlin/Function0;",
        "",
        "(Lkotlin/jvm/functions/Function0;)V",
        "currentState",
        "Lio/streamroot/dna/core/State;",
        "getCurrentState",
        "()Lio/streamroot/dna/core/State;",
        "state",
        "close",
        "isDnaEnabled",
        "",
        "isDnaRunning",
        "isInError",
        "updateState",
        "new",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final dnaDisabled:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private state:Lio/streamroot/dna/core/State;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dnaDisabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->dnaDisabled:Lkotlin/jvm/functions/Function0;

    .line 25
    sget-object p1, Lio/streamroot/dna/core/State;->STARTING:Lio/streamroot/dna/core/State;

    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 160
    sget-object v0, Lio/streamroot/dna/core/State;->TERMINATED:Lio/streamroot/dna/core/State;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/context/state/StateManager;->updateState(Lio/streamroot/dna/core/State;)V

    return-void
.end method

.method public final getCurrentState()Lio/streamroot/dna/core/State;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 28
    iget-object v0, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    return-object v0
.end method

.method public final isDnaEnabled()Z
    .locals 2

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    sget-object v1, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isDnaRunning()Z
    .locals 3

    .line 32
    sget-object v0, Lio/streamroot/dna/core/State;->RUNNING:Lio/streamroot/dna/core/State;

    invoke-virtual {v0}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v0

    sget-object v1, Lio/streamroot/dna/core/State;->TEMPORARY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    iget-object v2, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    invoke-virtual {v2}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v2

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final isInError()Z
    .locals 3

    .line 30
    sget-object v0, Lio/streamroot/dna/core/State;->ACTIVATION_FAILED:Lio/streamroot/dna/core/State;

    invoke-virtual {v0}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v0

    sget-object v1, Lio/streamroot/dna/core/State;->DEFINITELY_DISABLED:Lio/streamroot/dna/core/State;

    invoke-virtual {v1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    iget-object v2, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    invoke-virtual {v2}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v2

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final updateState(Lio/streamroot/dna/core/State;)V
    .locals 3
    .param p1    # Lio/streamroot/dna/core/State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "new"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    sget-object v1, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$7:[I

    invoke-virtual {v0}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 139
    :pswitch_0
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$6:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    .line 141
    :cond_0
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto/16 :goto_0

    .line 128
    :pswitch_1
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$5:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_1

    goto/16 :goto_0

    .line 130
    :cond_1
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto :goto_0

    .line 105
    :pswitch_2
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$4:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 111
    :pswitch_3
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto :goto_0

    .line 107
    :pswitch_4
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    .line 108
    iget-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->dnaDisabled:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 88
    :pswitch_5
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 96
    :pswitch_6
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto :goto_0

    .line 91
    :pswitch_7
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    .line 92
    iget-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->dnaDisabled:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 72
    :pswitch_8
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    goto :goto_0

    .line 79
    :pswitch_9
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto :goto_0

    .line 74
    :pswitch_a
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    .line 75
    iget-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->dnaDisabled:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 51
    :pswitch_b
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_4

    goto :goto_0

    .line 63
    :pswitch_c
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    goto :goto_0

    .line 39
    :pswitch_d
    sget-object v0, Lio/streamroot/dna/core/context/state/StateManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_5

    goto :goto_0

    .line 42
    :pswitch_e
    iput-object p1, p0, Lio/streamroot/dna/core/context/state/StateManager;->state:Lio/streamroot/dna/core/State;

    :goto_0
    :pswitch_f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_b
        :pswitch_8
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_f
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_9
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_e
        :pswitch_e
    .end packed-switch
.end method
