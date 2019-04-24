.class public abstract Lcom/google/dexmaker/dx/dex/code/InsnFormat;
.super Ljava/lang/Object;
.source "InsnFormat.java"


# static fields
.field public static ALLOW_EXTENDED_OPCODES:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static argIndex(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)I
    .locals 1

    .line 467
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result p0

    if-ltz p0, :cond_0

    return p0

    .line 470
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus insn"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static branchComment(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 322
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    .line 323
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getTargetOffset()I

    move-result p0

    int-to-short v0, p0

    if-ne p0, v0, :cond_0

    .line 325
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->s2(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->s4(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method protected static branchString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 309
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/TargetInsn;

    .line 310
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/TargetInsn;->getTargetAddress()I

    move-result p0

    int-to-char v0, p0

    if-ne p0, v0, :cond_0

    .line 312
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method protected static codeUnit(II)S
    .locals 1

    and-int/lit16 v0, p0, 0xff

    if-ne v0, p0, :cond_1

    and-int/lit16 v0, p1, 0xff

    if-ne v0, p1, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 531
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "high out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 527
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "low out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static codeUnit(IIII)S
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne v0, p0, :cond_3

    and-int/lit8 v0, p1, 0xf

    if-ne v0, p1, :cond_2

    and-int/lit8 v0, p2, 0xf

    if-ne v0, p2, :cond_1

    and-int/lit8 v0, p3, 0xf

    if-ne v0, p3, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    shl-int/lit8 p1, p3, 0xc

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 560
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n3 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 556
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n2 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 552
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n1 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 548
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n0 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static cstComment(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 2

    .line 350
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 352
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->hasIndex()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 356
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 357
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getIndex()I

    move-result v1

    .line 359
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x40

    .line 360
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/high16 p0, 0x10000

    if-ge v1, p0, :cond_1

    .line 363
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 365
    :cond_1
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static cstString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 1

    .line 337
    check-cast p0, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 338
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    .line 340
    instance-of v0, p0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/Constant;->toHuman()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method protected static isRegListSequential(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Z
    .locals 7

    .line 439
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    .line 445
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    move v4, v3

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    .line 449
    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v5

    .line 450
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v6

    if-eq v6, v4, :cond_1

    return v2

    .line 453
    :cond_1
    invoke-virtual {v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method protected static literalBitsComment(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;I)Ljava/lang/String;
    .locals 3

    .line 275
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v1, "#"

    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 281
    instance-of v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;

    if-eqz v1, :cond_0

    .line 282
    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;->getLongBits()J

    move-result-wide v1

    goto :goto_0

    .line 284
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->getIntBits()I

    move-result p0

    int-to-long v1, p0

    :goto_0
    const/4 p0, 0x4

    if-eq p1, p0, :cond_5

    const/16 p0, 0x8

    if-eq p1, p0, :cond_4

    const/16 p0, 0x10

    if-eq p1, p0, :cond_3

    const/16 p0, 0x20

    if-eq p1, p0, :cond_2

    const/16 p0, 0x40

    if-ne p1, p0, :cond_1

    .line 292
    invoke-static {v1, v2}, Lcom/google/dexmaker/dx/util/Hex;->u8(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 294
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    const-string/jumbo p1, "shouldn\'t happen"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    long-to-int p0, v1

    .line 291
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_3
    long-to-int p0, v1

    .line 290
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_4
    long-to-int p0, v1

    .line 289
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->u1(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_5
    long-to-int p0, v1

    .line 288
    invoke-static {p0}, Lcom/google/dexmaker/dx/util/Hex;->uNibble(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 298
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static literalBitsString(Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;)Ljava/lang/String;
    .locals 2

    .line 250
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const/16 v1, 0x23

    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 254
    instance-of v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstKnownNull;

    if-eqz v1, :cond_0

    const-string p0, "null"

    .line 255
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 257
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->typeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v1, 0x20

    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 259
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstLiteralBits;->toHuman()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 262
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static makeByte(II)I
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne v0, p0, :cond_1

    and-int/lit8 v0, p1, 0xf

    if-ne v0, p1, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    return p0

    .line 579
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "high out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 575
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "low out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)S
    .locals 1

    .line 508
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/Dop;->getOpcode()I

    move-result p0

    const/16 v0, 0xff

    if-lt p0, v0, :cond_0

    const v0, 0xffff

    if-gt p0, v0, :cond_0

    int-to-short p0, p0

    return p0

    .line 511
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "extended opcode out of range 255..65535"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;I)S
    .locals 1

    and-int/lit16 v0, p1, 0xff

    if-ne v0, p1, :cond_1

    .line 489
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/Dop;->getOpcode()I

    move-result p0

    and-int/lit16 v0, p0, 0xff

    if-ne v0, p0, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 492
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "opcode out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 486
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "arg out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static regListString(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Ljava/lang/String;
    .locals 4

    .line 183
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    .line 184
    new-instance v1, Ljava/lang/StringBuffer;

    mul-int/lit8 v2, v0, 0x5

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    const/16 v2, 0x7b

    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    if-eqz v2, :cond_0

    const-string v3, ", "

    .line 190
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 192
    :cond_0
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/16 p0, 0x7d

    .line 195
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 197
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected static regRangeString(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Ljava/lang/String;
    .locals 6

    .line 208
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1e

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v2, "{"

    .line 211
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    .line 223
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 224
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 229
    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    goto :goto_0

    .line 219
    :pswitch_0
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 232
    :cond_0
    :goto_0
    invoke-virtual {p0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".."

    .line 233
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    :pswitch_1
    const-string/jumbo p0, "}"

    .line 238
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected static signedFitsInByte(I)Z
    .locals 1

    int-to-byte v0, p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static signedFitsInNibble(I)Z
    .locals 1

    const/4 v0, -0x8

    if-lt p0, v0, :cond_0

    const/4 v0, 0x7

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static signedFitsInShort(I)Z
    .locals 1

    int-to-short v0, p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static unsignedFitsInByte(I)Z
    .locals 1

    and-int/lit16 v0, p0, 0xff

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static unsignedFitsInNibble(I)Z
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static unsignedFitsInShort(I)Z
    .locals 1

    const v0, 0xffff

    and-int/2addr v0, p0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;S)V
    .locals 0

    .line 592
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SI)V
    .locals 1

    int-to-short v0, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short p2, p2

    .line 668
    invoke-static {p0, p1, v0, p2}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSS)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SIS)V
    .locals 1

    int-to-short v0, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short p2, p2

    .line 683
    invoke-static {p0, p1, v0, p2, p3}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSSS)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SISS)V
    .locals 6

    int-to-short v2, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short v3, p2

    move-object v0, p0

    move v1, p1

    move v4, p3

    move v5, p4

    .line 699
    invoke-static/range {v0 .. v5}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSSSS)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SJ)V
    .locals 7

    long-to-int v0, p2

    int-to-short v3, v0

    const/16 v0, 0x10

    shr-long v0, p2, v0

    long-to-int v0, v0

    int-to-short v4, v0

    const/16 v0, 0x20

    shr-long v0, p2, v0

    long-to-int v0, v0

    int-to-short v5, v0

    const/16 v0, 0x30

    shr-long/2addr p2, v0

    long-to-int p2, p2

    int-to-short v6, p2

    move-object v1, p0

    move v2, p1

    .line 712
    invoke-static/range {v1 .. v6}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSSSS)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SS)V
    .locals 0

    .line 603
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 604
    invoke-interface {p0, p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSS)V
    .locals 0

    .line 617
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 618
    invoke-interface {p0, p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 619
    invoke-interface {p0, p3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSSS)V
    .locals 0

    .line 633
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 634
    invoke-interface {p0, p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 635
    invoke-interface {p0, p3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 636
    invoke-interface {p0, p4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    return-void
.end method

.method protected static write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SSSSS)V
    .locals 0

    .line 651
    invoke-interface {p0, p1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 652
    invoke-interface {p0, p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 653
    invoke-interface {p0, p3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 654
    invoke-interface {p0, p4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 655
    invoke-interface {p0, p5}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    return-void
.end method


# virtual methods
.method public branchFits(Lcom/google/dexmaker/dx/dex/code/TargetInsn;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract codeSize()I
.end method

.method public compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 0

    .line 145
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    return-object p1
.end method

.method public abstract insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
.end method

.method public abstract insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
.end method

.method public abstract isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
.end method

.method public final listingString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 3

    .line 57
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getOpcode()Lcom/google/dexmaker/dx/dex/code/Dop;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/code/Dop;->getName()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;->insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;

    move-result-object p1

    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    const/16 v2, 0x64

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " // "

    .line 70
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
.end method
