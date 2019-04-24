.class public final Lcom/google/dexmaker/dx/dex/code/ArrayData;
.super Lcom/google/dexmaker/dx/dex/code/VariableSizeInsn;
.source "ArrayData.java"


# instance fields
.field private final arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

.field private final elemWidth:I

.field private final initLength:I

.field private final user:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

.field private final values:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/dex/code/CodeAddress;Ljava/util/ArrayList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/dx/rop/code/SourcePosition;",
            "Lcom/google/dexmaker/dx/dex/code/CodeAddress;",
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ">;",
            "Lcom/google/dexmaker/dx/rop/cst/Constant;",
            ")V"
        }
    .end annotation

    .line 62
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/dex/code/VariableSizeInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    if-eqz p2, :cond_a

    if-eqz p3, :cond_9

    .line 72
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_8

    .line 78
    iput-object p4, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 80
    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-eq p4, p1, :cond_7

    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-ne p4, p1, :cond_0

    goto :goto_3

    .line 83
    :cond_0
    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-eq p4, p1, :cond_6

    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-ne p4, p1, :cond_1

    goto :goto_2

    .line 86
    :cond_1
    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->INT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-eq p4, p1, :cond_5

    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-ne p4, p1, :cond_2

    goto :goto_1

    .line 89
    :cond_2
    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-eq p4, p1, :cond_4

    sget-object p1, Lcom/google/dexmaker/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-ne p4, p1, :cond_3

    goto :goto_0

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected constant type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    const/16 p1, 0x8

    .line 91
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    goto :goto_4

    :cond_5
    :goto_1
    const/4 p1, 0x4

    .line 88
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    goto :goto_4

    :cond_6
    :goto_2
    const/4 p1, 0x2

    .line 85
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p1, 0x1

    .line 82
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    .line 95
    :goto_4
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->user:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    .line 96
    iput-object p3, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    .line 97
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->initLength:I

    return-void

    .line 75
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Illegal number of init values"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "values == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "user == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 4

    .line 167
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 169
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    const-string v3, "\n    "

    .line 171
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 172
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v3, ": "

    .line 173
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 174
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/rop/cst/Constant;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/Constant;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public codeSize()I
    .locals 2

    .line 103
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->initLength:I

    .line 105
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    mul-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method protected listingString0(Z)Ljava/lang/String;
    .locals 3

    .line 183
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->user:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/code/CodeAddress;->getAddress()I

    move-result p1

    .line 184
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 185
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v2, "fill-array-data-payload // for fill-array-data @ "

    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 188
    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v1, :cond_0

    const-string v2, "\n  "

    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 192
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, ": "

    .line 193
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/Constant;->toHuman()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 4

    .line 161
    new-instance p1, Lcom/google/dexmaker/dx/dex/code/ArrayData;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/ArrayData;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->user:Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->arrayType:Lcom/google/dexmaker/dx/rop/cst/Constant;

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/dexmaker/dx/dex/code/ArrayData;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/dex/code/CodeAddress;Ljava/util/ArrayList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    return-object p1
.end method

.method public writeTo(Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
    .locals 6

    .line 111
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x300

    .line 113
    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 114
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    .line 115
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->initLength:I

    invoke-interface {p1, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    .line 119
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    move v1, v3

    :goto_0
    if-ge v1, v0, :cond_2

    .line 129
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 130
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;->getIntBits()I

    move-result v2

    int-to-short v2, v2

    invoke-interface {p1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeShort(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :pswitch_1
    move v1, v3

    :goto_1
    if-ge v1, v0, :cond_2

    .line 122
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 123
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;->getIntBits()I

    move-result v2

    int-to-byte v2, v2

    invoke-interface {p1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v1, v3

    :goto_2
    if-ge v1, v0, :cond_2

    .line 143
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 144
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral64;->getLongBits()J

    move-result-wide v4

    invoke-interface {p1, v4, v5}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeLong(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1
    move v1, v3

    :goto_3
    if-ge v1, v0, :cond_2

    .line 136
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->values:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 137
    check-cast v2, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/cst/CstLiteral32;->getIntBits()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeInt(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 153
    :cond_2
    :goto_4
    iget v1, p0, Lcom/google/dexmaker/dx/dex/code/ArrayData;->elemWidth:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_3

    .line 154
    invoke-interface {p1, v3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeByte(I)V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
