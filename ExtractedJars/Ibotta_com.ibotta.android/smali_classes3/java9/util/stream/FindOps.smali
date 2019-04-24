.class final Ljava9/util/stream/FindOps;
.super Ljava/lang/Object;
.source "FindOps.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/stream/FindOps$FindTask;,
        Ljava9/util/stream/FindOps$FindSink;,
        Ljava9/util/stream/FindOps$FindOp;
    }
.end annotation


# static fields
.field private static final ANY_DOUBLE:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Double;",
            "Ljava9/util/OptionalDouble;",
            ">;"
        }
    .end annotation
.end field

.field private static final ANY_INT:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Integer;",
            "Ljava9/util/OptionalInt;",
            ">;"
        }
    .end annotation
.end field

.field private static final ANY_LONG:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Long;",
            "Ljava9/util/OptionalLong;",
            ">;"
        }
    .end annotation
.end field

.field private static final ANY_REF:Ljava9/util/stream/TerminalOp;

.field private static final DOUBLE_IS_PRESENT:Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Predicate<",
            "Ljava9/util/OptionalDouble;",
            ">;"
        }
    .end annotation
.end field

.field private static final DOUBLE_SINK_SUPP:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/stream/TerminalSink<",
            "Ljava/lang/Double;",
            "Ljava9/util/OptionalDouble;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final FIRST_DOUBLE:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Double;",
            "Ljava9/util/OptionalDouble;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIRST_INT:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Integer;",
            "Ljava9/util/OptionalInt;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIRST_LONG:Ljava9/util/stream/TerminalOp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Long;",
            "Ljava9/util/OptionalLong;",
            ">;"
        }
    .end annotation
.end field

.field private static final FIRST_REF:Ljava9/util/stream/TerminalOp;

.field private static final INT_IS_PRESENT:Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Predicate<",
            "Ljava9/util/OptionalInt;",
            ">;"
        }
    .end annotation
.end field

.field private static final INT_SINK_SUPP:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/stream/TerminalSink<",
            "Ljava/lang/Integer;",
            "Ljava9/util/OptionalInt;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final LONG_IS_PRESENT:Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Predicate<",
            "Ljava9/util/OptionalLong;",
            ">;"
        }
    .end annotation
.end field

.field private static final LONG_SINK_SUPP:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/stream/TerminalSink<",
            "Ljava/lang/Long;",
            "Ljava9/util/OptionalLong;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final REF_IS_PRESENT:Ljava9/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Predicate<",
            "Ljava9/util/Optional<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final REF_SINK_SUPP:Ljava9/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/function/Supplier<",
            "Ljava9/util/stream/TerminalSink<",
            "Ljava/lang/Object;",
            "Ljava9/util/Optional<",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 49
    sget-object v0, Ljava9/util/stream/-$$Lambda$fA7UtJe8fxkp4wBhKRfWLQWhNDg;->INSTANCE:Ljava9/util/stream/-$$Lambda$fA7UtJe8fxkp4wBhKRfWLQWhNDg;

    sput-object v0, Ljava9/util/stream/FindOps;->REF_IS_PRESENT:Ljava9/util/function/Predicate;

    .line 50
    sget-object v0, Ljava9/util/stream/-$$Lambda$bLrffponFY4s0yCi7NGCjL6Tv5E;->INSTANCE:Ljava9/util/stream/-$$Lambda$bLrffponFY4s0yCi7NGCjL6Tv5E;

    sput-object v0, Ljava9/util/stream/FindOps;->INT_IS_PRESENT:Ljava9/util/function/Predicate;

    .line 51
    sget-object v0, Ljava9/util/stream/-$$Lambda$4VkHdg-IUGZfJZmGf6k579ocP2A;->INSTANCE:Ljava9/util/stream/-$$Lambda$4VkHdg-IUGZfJZmGf6k579ocP2A;

    sput-object v0, Ljava9/util/stream/FindOps;->LONG_IS_PRESENT:Ljava9/util/function/Predicate;

    .line 52
    sget-object v0, Ljava9/util/stream/-$$Lambda$r5RYh_uOx5kRCpkH1UEU5t8Jg8E;->INSTANCE:Ljava9/util/stream/-$$Lambda$r5RYh_uOx5kRCpkH1UEU5t8Jg8E;

    sput-object v0, Ljava9/util/stream/FindOps;->DOUBLE_IS_PRESENT:Ljava9/util/function/Predicate;

    .line 53
    sget-object v0, Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;

    sput-object v0, Ljava9/util/stream/FindOps;->REF_SINK_SUPP:Ljava9/util/function/Supplier;

    .line 54
    sget-object v0, Ljava9/util/stream/-$$Lambda$uWCyQTED2U1HyrncQbdOYX7YAtE;->INSTANCE:Ljava9/util/stream/-$$Lambda$uWCyQTED2U1HyrncQbdOYX7YAtE;

    sput-object v0, Ljava9/util/stream/FindOps;->INT_SINK_SUPP:Ljava9/util/function/Supplier;

    .line 55
    sget-object v0, Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;->INSTANCE:Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;

    sput-object v0, Ljava9/util/stream/FindOps;->LONG_SINK_SUPP:Ljava9/util/function/Supplier;

    .line 56
    sget-object v0, Ljava9/util/stream/-$$Lambda$yNQmPHdluUPhqQqnliiZV3SjL58;->INSTANCE:Ljava9/util/stream/-$$Lambda$yNQmPHdluUPhqQqnliiZV3SjL58;

    sput-object v0, Ljava9/util/stream/FindOps;->DOUBLE_SINK_SUPP:Ljava9/util/function/Supplier;

    .line 59
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v3, Ljava9/util/stream/StreamShape;->REFERENCE:Ljava9/util/stream/StreamShape;

    invoke-static {}, Ljava9/util/Optional;->empty()Ljava9/util/Optional;

    move-result-object v4

    sget-object v5, Ljava9/util/stream/FindOps;->REF_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v6, Ljava9/util/stream/FindOps;->REF_SINK_SUPP:Ljava9/util/function/Supplier;

    const/4 v2, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->FIRST_REF:Ljava9/util/stream/TerminalOp;

    .line 62
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v9, Ljava9/util/stream/StreamShape;->REFERENCE:Ljava9/util/stream/StreamShape;

    invoke-static {}, Ljava9/util/Optional;->empty()Ljava9/util/Optional;

    move-result-object v10

    sget-object v11, Ljava9/util/stream/FindOps;->REF_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v12, Ljava9/util/stream/FindOps;->REF_SINK_SUPP:Ljava9/util/function/Supplier;

    const/4 v8, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->ANY_REF:Ljava9/util/stream/TerminalOp;

    .line 64
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v3, Ljava9/util/stream/StreamShape;->INT_VALUE:Ljava9/util/stream/StreamShape;

    .line 65
    invoke-static {}, Ljava9/util/OptionalInt;->empty()Ljava9/util/OptionalInt;

    move-result-object v4

    sget-object v5, Ljava9/util/stream/FindOps;->INT_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v6, Ljava9/util/stream/FindOps;->INT_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->FIRST_INT:Ljava9/util/stream/TerminalOp;

    .line 66
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v9, Ljava9/util/stream/StreamShape;->INT_VALUE:Ljava9/util/stream/StreamShape;

    .line 67
    invoke-static {}, Ljava9/util/OptionalInt;->empty()Ljava9/util/OptionalInt;

    move-result-object v10

    sget-object v11, Ljava9/util/stream/FindOps;->INT_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v12, Ljava9/util/stream/FindOps;->INT_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->ANY_INT:Ljava9/util/stream/TerminalOp;

    .line 68
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v3, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    .line 69
    invoke-static {}, Ljava9/util/OptionalLong;->empty()Ljava9/util/OptionalLong;

    move-result-object v4

    sget-object v5, Ljava9/util/stream/FindOps;->LONG_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v6, Ljava9/util/stream/FindOps;->LONG_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->FIRST_LONG:Ljava9/util/stream/TerminalOp;

    .line 70
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v9, Ljava9/util/stream/StreamShape;->LONG_VALUE:Ljava9/util/stream/StreamShape;

    .line 71
    invoke-static {}, Ljava9/util/OptionalLong;->empty()Ljava9/util/OptionalLong;

    move-result-object v10

    sget-object v11, Ljava9/util/stream/FindOps;->LONG_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v12, Ljava9/util/stream/FindOps;->LONG_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->ANY_LONG:Ljava9/util/stream/TerminalOp;

    .line 72
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v3, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    .line 73
    invoke-static {}, Ljava9/util/OptionalDouble;->empty()Ljava9/util/OptionalDouble;

    move-result-object v4

    sget-object v5, Ljava9/util/stream/FindOps;->DOUBLE_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v6, Ljava9/util/stream/FindOps;->DOUBLE_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->FIRST_DOUBLE:Ljava9/util/stream/TerminalOp;

    .line 74
    new-instance v0, Ljava9/util/stream/FindOps$FindOp;

    sget-object v9, Ljava9/util/stream/StreamShape;->DOUBLE_VALUE:Ljava9/util/stream/StreamShape;

    .line 75
    invoke-static {}, Ljava9/util/OptionalDouble;->empty()Ljava9/util/OptionalDouble;

    move-result-object v10

    sget-object v11, Ljava9/util/stream/FindOps;->DOUBLE_IS_PRESENT:Ljava9/util/function/Predicate;

    sget-object v12, Ljava9/util/stream/FindOps;->DOUBLE_SINK_SUPP:Ljava9/util/function/Supplier;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ljava9/util/stream/FindOps$FindOp;-><init>(ZLjava9/util/stream/StreamShape;Ljava/lang/Object;Ljava9/util/function/Predicate;Ljava9/util/function/Supplier;)V

    sput-object v0, Ljava9/util/stream/FindOps;->ANY_DOUBLE:Ljava9/util/stream/TerminalOp;

    return-void
.end method

.method public static makeDouble(Z)Ljava9/util/stream/TerminalOp;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Double;",
            "Ljava9/util/OptionalDouble;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 120
    sget-object p0, Ljava9/util/stream/FindOps;->FIRST_DOUBLE:Ljava9/util/stream/TerminalOp;

    goto :goto_0

    :cond_0
    sget-object p0, Ljava9/util/stream/FindOps;->ANY_DOUBLE:Ljava9/util/stream/TerminalOp;

    :goto_0
    return-object p0
.end method

.method public static makeInt(Z)Ljava9/util/stream/TerminalOp;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Integer;",
            "Ljava9/util/OptionalInt;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 98
    sget-object p0, Ljava9/util/stream/FindOps;->FIRST_INT:Ljava9/util/stream/TerminalOp;

    goto :goto_0

    :cond_0
    sget-object p0, Ljava9/util/stream/FindOps;->ANY_INT:Ljava9/util/stream/TerminalOp;

    :goto_0
    return-object p0
.end method

.method public static makeLong(Z)Ljava9/util/stream/TerminalOp;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava9/util/stream/TerminalOp<",
            "Ljava/lang/Long;",
            "Ljava9/util/OptionalLong;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 109
    sget-object p0, Ljava9/util/stream/FindOps;->FIRST_LONG:Ljava9/util/stream/TerminalOp;

    goto :goto_0

    :cond_0
    sget-object p0, Ljava9/util/stream/FindOps;->ANY_LONG:Ljava9/util/stream/TerminalOp;

    :goto_0
    return-object p0
.end method

.method public static makeRef(Z)Ljava9/util/stream/TerminalOp;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(Z)",
            "Ljava9/util/stream/TerminalOp<",
            "TT;",
            "Ljava9/util/Optional<",
            "TT;>;>;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 87
    sget-object p0, Ljava9/util/stream/FindOps;->FIRST_REF:Ljava9/util/stream/TerminalOp;

    goto :goto_0

    :cond_0
    sget-object p0, Ljava9/util/stream/FindOps;->ANY_REF:Ljava9/util/stream/TerminalOp;

    :goto_0
    return-object p0
.end method
