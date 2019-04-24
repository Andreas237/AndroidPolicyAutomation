.class Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;
.super Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;
.source "RopTranslator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/code/RopTranslator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LocalVariableAwareTranslationVisitor"
.end annotation


# instance fields
.field private locals:Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;

.field final synthetic this$0:Lcom/google/dexmaker/dx/dex/code/RopTranslator;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/code/RopTranslator;Lcom/google/dexmaker/dx/dex/code/OutputCollector;Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;)V
    .locals 0

    .line 825
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->this$0:Lcom/google/dexmaker/dx/dex/code/RopTranslator;

    .line 826
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;-><init>(Lcom/google/dexmaker/dx/dex/code/RopTranslator;Lcom/google/dexmaker/dx/dex/code/OutputCollector;)V

    .line 827
    iput-object p3, p0, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->locals:Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;

    return-void
.end method


# virtual methods
.method public addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V
    .locals 2

    .line 872
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->locals:Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->getAssignment(Lcom/google/dexmaker/dx/rop/code/Insn;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 875
    new-instance v1, Lcom/google/dexmaker/dx/dex/code/LocalStart;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalStart;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addOutput(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V

    :cond_0
    return-void
.end method

.method public visitPlainCstInsn(Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;)V
    .locals 0

    .line 840
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;->visitPlainCstInsn(Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;)V

    .line 841
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V
    .locals 0

    .line 833
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;->visitPlainInsn(Lcom/google/dexmaker/dx/rop/code/PlainInsn;)V

    .line 834
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V
    .locals 0

    .line 847
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;->visitSwitchInsn(Lcom/google/dexmaker/dx/rop/code/SwitchInsn;)V

    .line 848
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V
    .locals 0

    .line 854
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;->visitThrowingCstInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;)V

    .line 855
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V
    .locals 0

    .line 861
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$TranslationVisitor;->visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V

    .line 862
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator$LocalVariableAwareTranslationVisitor;->addIntroductionIfNecessary(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method
