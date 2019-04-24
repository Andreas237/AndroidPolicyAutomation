.class public final Lcom/google/dexmaker/dx/dex/file/EncodedMethod;
.super Lcom/google/dexmaker/dx/dex/file/EncodedMember;
.source "EncodedMethod.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/dexmaker/dx/dex/file/EncodedMember;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/dex/file/EncodedMethod;",
        ">;"
    }
.end annotation


# instance fields
.field private final code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

.field private final method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;ILcom/google/dexmaker/dx/dex/code/DalvCode;Lcom/google/dexmaker/dx/rop/type/TypeList;)V
    .locals 1

    .line 56
    invoke-direct {p0, p2}, Lcom/google/dexmaker/dx/dex/file/EncodedMember;-><init>(I)V

    if-eqz p1, :cond_2

    .line 62
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    .line 65
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    goto :goto_1

    :cond_0
    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 68
    :goto_0
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/CodeItem;

    invoke-direct {v0, p1, p3, p2, p4}, Lcom/google/dexmaker/dx/dex/file/CodeItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/code/DalvCode;ZLcom/google/dexmaker/dx/rop/type/TypeList;)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    :goto_1
    return-void

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    .line 117
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getMethodIds()Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;

    move-result-object v0

    .line 118
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getWordData()Lcom/google/dexmaker/dx/dex/file/MixedItemSection;

    move-result-object p1

    .line 120
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)Lcom/google/dexmaker/dx/dex/file/MethodIdItem;

    .line 122
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MixedItemSection;->add(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)V

    :cond_0
    return-void
.end method

.method public compareTo(Lcom/google/dexmaker/dx/dex/file/EncodedMethod;)I
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 33
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->compareTo(Lcom/google/dexmaker/dx/dex/file/EncodedMethod;)I

    move-result p1

    return p1
.end method

.method public debugPrint(Ljava/io/PrintWriter;Z)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    if-nez v0, :cond_0

    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->getRef()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": abstract or native"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "  "

    .line 144
    invoke-virtual {v0, p1, v1, p2}, Lcom/google/dexmaker/dx/dex/file/CodeItem;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public encode(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;II)I
    .locals 6

    .line 161
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getMethodIds()Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;

    move-result-object p1

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/MethodIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstBaseMethodRef;)I

    move-result p1

    sub-int p3, p1, p3

    .line 163
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->getAccessFlags()I

    move-result v0

    .line 164
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    invoke-static {v1}, Lcom/google/dexmaker/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/google/dexmaker/dx/dex/file/OffsettedItem;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/lit16 v5, v0, 0x500

    if-nez v5, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    if-ne v4, v5, :cond_3

    .line 178
    invoke-interface {p2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotates()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "  [%x] %s"

    const/4 v5, 0x2

    .line 179
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, v5, v3

    iget-object p4, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {p4}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object p4

    aput-object p4, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, v3, p4}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 181
    invoke-static {p3}, Lcom/google/dexmaker/dx/util/Leb128Utils;->unsignedLeb128Size(I)I

    move-result p4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    method_idx:   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, p4, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 183
    invoke-static {v0}, Lcom/google/dexmaker/dx/util/Leb128Utils;->unsignedLeb128Size(I)I

    move-result p4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    access_flags: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/AccessFlags;->methodString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, p4, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 186
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->unsignedLeb128Size(I)I

    move-result p4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "    code_off:     "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u4(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, p4, v2}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 190
    :cond_2
    invoke-interface {p2, p3}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeUleb128(I)I

    .line 191
    invoke-interface {p2, v0}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeUleb128(I)I

    .line 192
    invoke-interface {p2, v1}, Lcom/google/dexmaker/dx/util/AnnotatedOutput;->writeUleb128(I)I

    return p1

    .line 174
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "code vs. access_flags mismatch"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 74
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 78
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->compareTo(Lcom/google/dexmaker/dx/dex/file/EncodedMethod;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final getName()Lcom/google/dexmaker/dx/rop/cst/CstString;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->getNat()Lcom/google/dexmaker/dx/rop/cst/CstNat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    return-object v0
.end method

.method public final getRef()Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    return-object v0
.end method

.method public final toHuman()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 96
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v1, 0x7b

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 100
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->getAccessFlags()I

    move-result v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Hex;->u2(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v1, 0x20

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 102
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->method:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 104
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    if-eqz v2, :cond_0

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 106
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;->code:Lcom/google/dexmaker/dx/dex/file/CodeItem;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :cond_0
    const/16 v1, 0x7d

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
