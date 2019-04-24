.class public Lcom/huawei/wallet/logic/tlv/TlvParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method private a(I[BII)Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;
    .locals 16

    .line 97
    const-string v0, "TlvParser"

    const-string v1, "enter parseWithResult"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/wallet/logic/tlv/TlvParser;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 99
    add-int v0, p3, p4

    move-object/from16 v1, p2

    array-length v1, v1

    if-le v0, v1, :cond_0

    .line 101
    const-string v0, "TlvParser"

    const-string v1, "add"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length is out of the range [offset="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",  len="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", array.length="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p2

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", level="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/tlv/TlvParser;->b([BI)I

    move-result v10

    .line 108
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v9, v1, v2, v10}, Lcom/huawei/wallet/logic/tlv/TlvParser;->a(Ljava/lang/String;[BII)Lcom/huawei/wallet/logic/tlv/TlvTag;

    move-result-object v11

    .line 111
    add-int v0, p3, v10

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lcom/huawei/wallet/logic/tlv/TlvParser;->c([BI)I

    move-result v12

    .line 112
    add-int v0, p3, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2, v0}, Lcom/huawei/wallet/logic/tlv/TlvParser;->e([BI)I

    move-result v13

    .line 115
    invoke-virtual {v11}, Lcom/huawei/wallet/logic/tlv/TlvTag;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    const-string v0, "TlvParser"

    const-string v1, "judge tag.isConstructed()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 119
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v9

    move v5, v10

    move v6, v12

    move v7, v13

    move-object v8, v14

    invoke-direct/range {v0 .. v8}, Lcom/huawei/wallet/logic/tlv/TlvParser;->a(I[BILjava/lang/String;IIILjava/util/ArrayList;)V

    .line 120
    add-int v0, p3, v10

    add-int/2addr v0, v12

    add-int v15, v0, v13

    .line 121
    new-instance v0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;

    new-instance v1, Lcom/huawei/wallet/logic/tlv/Tlv;

    invoke-direct {v1, v11, v14}, Lcom/huawei/wallet/logic/tlv/Tlv;-><init>(Lcom/huawei/wallet/logic/tlv/TlvTag;Ljava/util/List;)V

    invoke-direct {v0, v1, v15}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;-><init>(Lcom/huawei/wallet/logic/tlv/Tlv;I)V

    return-object v0

    .line 125
    :cond_1
    const-string v0, "TlvParser"

    const-string v1, "judge tag.isConstructed() else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    new-array v14, v13, [B

    .line 128
    add-int v0, p3, v10

    add-int/2addr v0, v12

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v14, v2, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    add-int v0, p3, v10

    add-int/2addr v0, v12

    add-int v15, v0, v13

    .line 130
    const-string v0, "TlvParser"

    const-string v1, "exit parseWithResult"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    new-instance v0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;

    new-instance v1, Lcom/huawei/wallet/logic/tlv/Tlv;

    invoke-direct {v1, v11, v14}, Lcom/huawei/wallet/logic/tlv/Tlv;-><init>(Lcom/huawei/wallet/logic/tlv/TlvTag;[B)V

    invoke-direct {v0, v1, v15}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;-><init>(Lcom/huawei/wallet/logic/tlv/Tlv;I)V

    return-object v0
.end method

.method private a(Ljava/lang/String;[BII)Lcom/huawei/wallet/logic/tlv/TlvTag;
    .locals 2

    .line 149
    const-string v0, "TlvParser"

    const-string v1, "enter createTag"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    new-instance v0, Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-direct {v0, p2, p3, p4}, Lcom/huawei/wallet/logic/tlv/TlvTag;-><init>([BII)V

    return-object v0
.end method

.method private a(I[BILjava/lang/String;IIILjava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BILjava/lang/String;IIILjava/util/ArrayList<Lcom/huawei/wallet/logic/tlv/Tlv;>;)V"
        }
    .end annotation

    .line 79
    const-string v0, "TlvParser"

    const-string v1, "enter addChildren"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    add-int v0, p3, p5

    add-int v2, v0, p6

    .line 81
    move v3, p7

    .line 82
    const-string v0, "TlvParser"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    :goto_0
    add-int v0, p3, p7

    if-ge v2, v0, :cond_0

    .line 85
    add-int/lit8 v0, p1, 0x1

    invoke-direct {p0, v0, p2, v2, v3}, Lcom/huawei/wallet/logic/tlv/TlvParser;->a(I[BII)Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;

    move-result-object v4

    .line 86
    invoke-static {v4}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->e(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v0

    invoke-virtual {p8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-static {v4}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->c(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)I

    move-result v2

    .line 89
    sub-int v3, p7, v2

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const-string v0, "TlvParser"

    const-string v1, "exit addChildren"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    return-void
.end method

.method private b([BI)I
    .locals 4

    .line 155
    const-string v0, "TlvParser"

    const-string v1, "enter getTagBytesCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    aget-byte v0, p1, p2

    and-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_2

    .line 158
    const-string v0, "TlvParser"

    const-string v1, "judge aByteArray"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    const/4 v2, 0x2

    .line 160
    add-int/lit8 v3, p2, 0x1

    :goto_0
    add-int/lit8 v0, p2, 0xa

    if-ge v3, v0, :cond_1

    .line 162
    aget-byte v0, p1, v3

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    .line 164
    goto :goto_1

    .line 166
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 160
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 168
    :cond_1
    :goto_1
    const-string v0, "TlvParser"

    const-string v1, "return len"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    return v2

    .line 173
    :cond_2
    const-string v0, "TlvParser"

    const-string v1, "else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    const/4 v0, 0x1

    return v0
.end method

.method private static c([BI)I
    .locals 3

    .line 180
    const-string v0, "TlvParser"

    const-string v1, "enter getLengthBytesCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    aget-byte v0, p0, p1

    and-int/lit16 v2, v0, 0xff

    .line 182
    and-int/lit16 v0, v2, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    .line 184
    const-string v0, "TlvParser"

    const-string v1, "judge len"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    and-int/lit8 v0, v2, 0x7f

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 189
    :cond_0
    const-string v0, "TlvParser"

    const-string v1, "judge else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    const/4 v0, 0x1

    return v0
.end method

.method private d(I)Ljava/lang/String;
    .locals 4

    .line 138
    const-string v0, "TlvParser"

    const-string v1, "enter createLevelPadding"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    const/4 v3, 0x0

    :goto_0
    mul-int/lit8 v0, p1, 0x4

    if-ge v3, v0, :cond_0

    .line 142
    const/16 v0, 0x20

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 140
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 144
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e([BI)I
    .locals 8

    .line 197
    const-string v0, "TlvParser"

    const-string v1, "enter getDataLength"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    aget-byte v0, p1, p2

    and-int/lit16 v5, v0, 0xff

    .line 201
    and-int/lit16 v0, v5, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_1

    .line 203
    const-string v0, "TlvParser"

    const-string v1, "judge length"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    and-int/lit8 v6, v5, 0x7f

    .line 205
    const/4 v0, 0x3

    if-le v6, v0, :cond_0

    .line 207
    const-string v0, "TlvParser"

    const-string v1, "judge numberOfBytes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "At position %d the len is more then 3 [%d]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 209
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 208
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 212
    :cond_0
    const/4 v5, 0x0

    .line 213
    add-int/lit8 v7, p2, 0x1

    :goto_0
    add-int/lit8 v0, p2, 0x1

    add-int/2addr v0, v6

    if-ge v7, v0, :cond_1

    .line 215
    mul-int/lit16 v0, v5, 0x100

    aget-byte v1, p1, v7

    and-int/lit16 v1, v1, 0xff

    add-int v5, v0, v1

    .line 213
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 219
    :cond_1
    const-string v0, "TlvParser"

    const-string v1, "exit getDataLenght"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    return v5
.end method


# virtual methods
.method public c([BII)Lcom/huawei/wallet/logic/tlv/Tlvs;
    .locals 6

    .line 33
    const-string v0, "TlvParser"

    const-string v1, "enter parse"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    if-nez p3, :cond_0

    .line 36
    new-instance v0, Lcom/huawei/wallet/logic/tlv/Tlvs;

    invoke-direct {v0, v2}, Lcom/huawei/wallet/logic/tlv/Tlvs;-><init>(Ljava/util/List;)V

    return-object v0

    .line 38
    :cond_0
    move v3, p2

    .line 39
    const-string v0, "TlvParser"

    const-string v1, "next again Loop,size 100"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x64

    if-ge v4, v0, :cond_2

    .line 42
    sub-int v0, p3, v3

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, v3, v0}, Lcom/huawei/wallet/logic/tlv/TlvParser;->a(I[BII)Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;

    move-result-object v5

    .line 44
    invoke-static {v5}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->e(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-static {v5}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->c(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)I

    move-result v0

    add-int v1, p2, p3

    if-lt v0, v1, :cond_1

    .line 48
    const-string v0, "TlvParser"

    const-string v1, "again judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v5}, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->c(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)I

    move-result v3

    .line 40
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    const-string v0, "TlvParser"

    const-string v1, "exit,parse"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    new-instance v0, Lcom/huawei/wallet/logic/tlv/Tlvs;

    invoke-direct {v0, v2}, Lcom/huawei/wallet/logic/tlv/Tlvs;-><init>(Ljava/util/List;)V

    return-object v0
.end method
