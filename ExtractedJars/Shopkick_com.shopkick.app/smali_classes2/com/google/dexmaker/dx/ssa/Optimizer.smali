.class public Lcom/google/dexmaker/dx/ssa/Optimizer;
.super Ljava/lang/Object;
.source "Optimizer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;
    }
.end annotation


# static fields
.field private static advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice; = null

.field private static preserveLocals:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static debugDeadCodeRemover(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 231
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 232
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 234
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 235
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    return-object p0
.end method

.method public static debugEdgeSplit(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 199
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 200
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 202
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->testEdgeSplit(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    return-object p0
.end method

.method public static debugNoRegisterAllocation(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/RopMethod;",
            "IZZ",
            "Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;",
            "Ljava/util/EnumSet<",
            "Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/google/dexmaker/dx/ssa/SsaMethod;"
        }
    .end annotation

    .line 246
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 247
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 249
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 251
    invoke-static {p0, p5}, Lcom/google/dexmaker/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/google/dexmaker/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    .line 253
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/back/LivenessAnalyzer;->constructInterferenceGraph(Lcom/google/dexmaker/dx/ssa/SsaMethod;)Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;

    return-object p0
.end method

.method public static debugPhiPlacement(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 209
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 210
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 212
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->testPhiPlacement(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    return-object p0
.end method

.method public static debugRenaming(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 219
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 220
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 222
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    return-object p0
.end method

.method public static getAdvice()Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;
    .locals 1

    .line 53
    sget-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    return-object v0
.end method

.method public static getPreserveLocals()Z
    .locals 1

    .line 46
    sget-boolean v0, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    return v0
.end method

.method public static optimize(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;)Lcom/google/dexmaker/dx/rop/code/RopMethod;
    .locals 7

    .line 73
    const-class v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v6}, Lcom/google/dexmaker/dx/ssa/Optimizer;->optimize(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object p0

    return-object p0
.end method

.method public static optimize(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZZLcom/google/dexmaker/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/google/dexmaker/dx/rop/code/RopMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/RopMethod;",
            "IZZ",
            "Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;",
            "Ljava/util/EnumSet<",
            "Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/google/dexmaker/dx/rop/code/RopMethod;"
        }
    .end annotation

    .line 96
    sput-boolean p3, Lcom/google/dexmaker/dx/ssa/Optimizer;->preserveLocals:Z

    .line 97
    sput-object p4, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    .line 99
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p3

    .line 100
    invoke-static {p3, p5}, Lcom/google/dexmaker/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/google/dexmaker/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    const/4 p4, 0x0

    .line 102
    invoke-static {p3, p4}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convertToRopMethod(Lcom/google/dexmaker/dx/ssa/SsaMethod;Z)Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object p3

    .line 104
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getRegCount()I

    move-result p4

    sget-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer;->advice:Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;

    invoke-interface {v0}, Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;->getMaxOptimalRegisterCount()I

    move-result v0

    if-le p4, v0, :cond_0

    .line 107
    invoke-static {p0, p1, p2, p5}, Lcom/google/dexmaker/dx/ssa/Optimizer;->optimizeMinimizeRegisters(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZLjava/util/EnumSet;)Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object p3

    :cond_0
    return-object p3
.end method

.method private static optimizeMinimizeRegisters(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZLjava/util/EnumSet;)Lcom/google/dexmaker/dx/rop/code/RopMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/RopMethod;",
            "IZ",
            "Ljava/util/EnumSet<",
            "Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/google/dexmaker/dx/rop/code/RopMethod;"
        }
    .end annotation

    .line 134
    invoke-static {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/google/dexmaker/dx/rop/code/RopMethod;IZ)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object p0

    .line 137
    invoke-virtual {p3}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    move-result-object p1

    .line 143
    sget-object p2, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, p2}, Ljava/util/EnumSet;->remove(Ljava/lang/Object;)Z

    .line 145
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/google/dexmaker/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    const/4 p1, 0x1

    .line 147
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/ssa/back/SsaToRop;->convertToRopMethod(Lcom/google/dexmaker/dx/ssa/SsaMethod;Z)Lcom/google/dexmaker/dx/rop/code/RopMethod;

    move-result-object p0

    return-object p0
.end method

.method private static runSsaFormSteps(Lcom/google/dexmaker/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/ssa/SsaMethod;",
            "Ljava/util/EnumSet<",
            "Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;",
            ">;)V"
        }
    .end annotation

    .line 155
    sget-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->MOVE_PARAM_COMBINER:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 159
    :cond_0
    sget-object v0, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->SCCP:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 160
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SCCP;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 161
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 165
    :goto_0
    sget-object v2, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->LITERAL_UPGRADE:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v2}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 166
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/LiteralOpUpgrader;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 167
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    move v0, v1

    .line 174
    :cond_2
    sget-object v2, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->ESCAPE_ANALYSIS:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v2}, Ljava/util/EnumSet;->remove(Ljava/lang/Object;)Z

    .line 175
    sget-object v2, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->ESCAPE_ANALYSIS:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v2}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 176
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/EscapeAnalysis;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 177
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    move v0, v1

    .line 181
    :cond_3
    sget-object v2, Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/google/dexmaker/dx/ssa/Optimizer$OptionalStep;

    invoke-virtual {p1, v2}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 182
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/ConstCollector;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 183
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    move v0, v1

    :cond_4
    if-eqz v0, :cond_5

    .line 189
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/DeadCodeRemover;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 192
    :cond_5
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/PhiTypeResolver;->process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    return-void
.end method
