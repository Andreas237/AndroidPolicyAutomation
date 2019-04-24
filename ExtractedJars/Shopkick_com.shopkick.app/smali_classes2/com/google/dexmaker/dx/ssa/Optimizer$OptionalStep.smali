.class public final enum Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;
.super Ljava/lang/Enum;
.source "Optimizer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/Optimizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OptionalStep"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

.field public static final enum CONST_COLLECTOR:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

.field public static final enum ESCAPE_ANALYSIS:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

.field public static final enum LITERAL_UPGRADE:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

.field public static final enum MOVE_PARAM_COMBINER:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

.field public static final enum SCCP:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 37
    new-instance v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const-string v1, "MOVE_PARAM_COMBINER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->MOVE_PARAM_COMBINER:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    new-instance v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const-string v1, "SCCP"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->SCCP:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    new-instance v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const-string v1, "LITERAL_UPGRADE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->LITERAL_UPGRADE:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    new-instance v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const-string v1, "CONST_COLLECTOR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    .line 38
    new-instance v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const-string v1, "ESCAPE_ANALYSIS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->ESCAPE_ANALYSIS:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    const/4 v0, 0x5

    .line 36
    new-array v0, v0, [Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    sget-object v1, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->MOVE_PARAM_COMBINER:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->SCCP:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->LITERAL_UPGRADE:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->ESCAPE_ANALYSIS:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->$VALUES:[Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;
    .locals 1

    .line 36
    const-class v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;
    .locals 1

    .line 36
    sget-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->$VALUES:[Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    return-object v0
.end method
