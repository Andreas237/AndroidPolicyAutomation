.class public final Lcom/google/dexmaker/dx/dex/code/form/Form41c;
.super Lcom/google/dexmaker/dx/dex/code/InsnFormat;
.source "Form41c.java"


# static fields
.field public static final THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/form/Form41c;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->THE_ONE:Lcom/google/dexmaker/dx/dex/code/InsnFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/code/InsnFormat;-><init>()V

    return-void
.end method


# virtual methods
.method public codeSize()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public compatibleRegs(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/util/BitSet;
    .locals 5

    .line 119
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    .line 121
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v0}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    .line 122
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    invoke-static {v3}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->unsignedFitsInByte(I)Z

    move-result v3

    const/4 v4, 0x1

    if-ne v0, v4, :cond_0

    .line 125
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    if-ne v0, p1, :cond_1

    .line 128
    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 129
    invoke-virtual {v1, v4, v3}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    :goto_0
    return-object v1
.end method

.method public insnArgString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;
    .locals 3

    .line 50
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->regString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->cstString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public insnCommentString(Lcom/google/dexmaker/dx/dex/code/DalvInsn;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 58
    invoke-static {p1}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->cstComment(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method public isCompatible(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)Z
    .locals 5

    .line 73
    sget-boolean v0, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->ALLOW_EXTENDED_OPCODES:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 77
    :cond_0
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    if-nez v0, :cond_1

    return v1

    .line 81
    :cond_1
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v2

    const/4 v3, 0x1

    packed-switch v2, :pswitch_data_0

    return v1

    .line 94
    :pswitch_0
    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 95
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    invoke-virtual {v0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    if-eq v4, v0, :cond_2

    return v1

    .line 86
    :pswitch_1
    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 105
    :cond_2
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->unsignedFitsInShort(I)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    .line 109
    :cond_3
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    .line 110
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    .line 112
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-nez v0, :cond_4

    instance-of p1, p1, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    if-eqz p1, :cond_5

    :cond_4
    move v1, v3

    :cond_5
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;Lcom/google/dexmaker/dx/dex/code/DalvInsn;)V
    .locals 3

    .line 139
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getRegisters()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v0

    .line 140
    move-object v1, p2

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/CstInsn;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/CstInsn;->getIndex()I

    move-result v1

    .line 142
    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->opcodeUnit(Lcom/google/dexmaker/dx/dex/code/DalvInsn;)S

    move-result p2

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    int-to-short v0, v0

    invoke-static {p1, p2, v1, v0}, Lcom/google/dexmaker/dx/dex/code/form/Form41c;->write(Lcom/google/dexmaker/dx/util/AnnotatedOutput;SIS)V

    return-void
.end method
