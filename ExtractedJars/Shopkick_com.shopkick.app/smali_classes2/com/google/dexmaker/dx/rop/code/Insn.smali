.class public abstract Lcom/google/dexmaker/dx/rop/code/Insn;
.super Ljava/lang/Object;
.source "Insn.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/rop/code/Insn$BaseVisitor;,
        Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;
    }
.end annotation


# instance fields
.field private final opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

.field private final position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

.field private final result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

.field private final sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    .line 65
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    .line 66
    iput-object p2, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    .line 67
    iput-object p3, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 68
    iput-object p4, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-void

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "sources == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "position == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "opcode == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static equalsHandleNulls(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 267
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public abstract accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
.end method

.method public final canThrow()Z
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->canThrow()Z

    move-result v0

    return v0
.end method

.method public contentEquals(Lcom/google/dexmaker/dx/rop/code/Insn;)Z
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/code/Insn;->equalsHandleNulls(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/code/Insn;->equalsHandleNulls(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->equalContents(Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/type/TypeList;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public copy()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 1

    const/4 v0, 0x0

    .line 255
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLocalAssignment()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 3

    .line 157
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v0

    const/16 v1, 0x36

    if-ne v0, v1, :cond_0

    .line 158
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    goto :goto_0

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    .line 167
    :cond_1
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    return-object v0
.end method

.method public final getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    return-object v0
.end method

.method public final getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object v0
.end method

.method public final getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 91
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 106
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getInlineString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 339
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 341
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, ": "

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 343
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_0

    const-string v1, "("

    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 347
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ")"

    .line 348
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 351
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-nez p1, :cond_1

    const-string p1, " ."

    .line 352
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    const-string p1, " "

    .line 354
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 355
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_0
    const-string p1, " <-"

    .line 358
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 360
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result p1

    if-nez p1, :cond_2

    const-string p1, " ."

    .line 362
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_3

    const-string v2, " "

    .line 365
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 366
    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 370
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 97
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getInlineString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/Insn;->toStringWithInline(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final toStringWithInline(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 306
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v1, "Insn{"

    .line 308
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 309
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const/16 v1, 0x20

    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 311
    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->opcode:Lcom/google/dexmaker/dx/rop/code/Rop;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_0

    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 315
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string p1, " :: "

    .line 318
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 320
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->result:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    if-eqz p1, :cond_1

    .line 321
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string p1, " <- "

    .line 322
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 325
    :cond_1
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/Insn;->sources:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const/16 p1, 0x7d

    .line 326
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 328
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
.end method

.method public abstract withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
.end method

.method public abstract withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
.end method

.method public withSourceLiteral()Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 0

    return-object p0
.end method
