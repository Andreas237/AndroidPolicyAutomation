.class public Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;
.super Ljava/lang/Object;
.source "DebugInfoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;,
        Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;
    }
.end annotation


# instance fields
.field private address:I

.field private final codesize:I

.field private final desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

.field private final encoded:[B

.field private final file:Lcom/google/dexmaker/dx/dex/file/DexFile;

.field private final isStatic:Z

.field private final lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

.field private line:I

.field private final locals:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final positions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final regSize:I

.field private final thisStringIdx:I


# direct methods
.method constructor <init>([BIIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 76
    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    const/4 v0, 0x0

    .line 79
    iput v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    if-eqz p1, :cond_0

    .line 101
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->encoded:[B

    .line 102
    iput-boolean p4, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    .line 103
    invoke-virtual {p5}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->getPrototype()Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    .line 104
    iput-object p6, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->file:Lcom/google/dexmaker/dx/dex/file/DexFile;

    .line 105
    iput p3, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->regSize:I

    .line 107
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    .line 108
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    .line 109
    iput p2, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->codesize:I

    .line 110
    new-array p1, p3, [Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    const/4 p1, -0x1

    .line 115
    :try_start_0
    invoke-virtual {p6}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getStringIds()Lcom/google/dexmaker/dx/dex/file/StringIdsSection;

    move-result-object p2

    new-instance p3, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const-string/jumbo p4, "this"

    invoke-direct {p3, p4}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/google/dexmaker/dx/dex/file/StringIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/cst/CstString;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :catch_0
    iput p1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    return-void

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "encoded == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private decode0()V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 240
    new-instance v1, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;

    iget-object v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->encoded:[B

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;-><init>([B)V

    .line 242
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    iput v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    .line 243
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    .line 244
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v3

    .line 245
    invoke-direct/range {p0 .. p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->getParamBase()I

    move-result v11

    .line 247
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v4

    if-ne v2, v4, :cond_6

    .line 252
    iget-boolean v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    if-nez v4, :cond_0

    .line 254
    new-instance v12, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    const/4 v5, 0x0

    const/4 v6, 0x1

    iget v8, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v12

    move v7, v11

    invoke-direct/range {v4 .. v10}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 256
    iget-object v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    iget-object v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v12, v4, v11

    add-int/lit8 v11, v11, 0x1

    :cond_0
    const/4 v4, 0x0

    move v12, v11

    :goto_0
    if-ge v4, v2, :cond_2

    .line 262
    invoke-virtual {v3, v4}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->getType(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v13

    .line 265
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v9

    const/4 v5, -0x1

    if-ne v9, v5, :cond_1

    .line 272
    new-instance v14, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v5, v14

    move v8, v12

    invoke-direct/range {v5 .. v11}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    goto :goto_1

    .line 275
    :cond_1
    new-instance v14, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v5, v14

    move v8, v12

    invoke-direct/range {v5 .. v11}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 278
    :goto_1
    iget-object v5, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    iget-object v5, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v14, v5, v12

    .line 280
    invoke-virtual {v13}, Lcom/google/dexmaker/dx/rop/type/Type;->getCategory()I

    move-result v5

    add-int/2addr v12, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 284
    :cond_2
    :goto_2
    :pswitch_0
    invoke-interface {v1}, Lcom/google/dexmaker/dx/util/ByteInput;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    packed-switch v2, :pswitch_data_0

    const/16 v3, 0xa

    if-lt v2, v3, :cond_5

    add-int/lit8 v2, v2, -0xa

    .line 397
    iget v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    div-int/lit8 v4, v2, 0xf

    add-int/2addr v3, v4

    iput v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    .line 398
    iget v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    rem-int/lit8 v2, v2, 0xf

    add-int/lit8 v2, v2, -0x4

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    .line 400
    iget-object v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    new-instance v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;

    iget v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    iget v5, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    invoke-direct {v3, v4, v5}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;-><init>(II)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 313
    :pswitch_1
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    .line 318
    :try_start_0
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aget-object v3, v3, v2

    .line 320
    iget-boolean v4, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    if-nez v4, :cond_3

    .line 326
    new-instance v10, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    iget v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    const/4 v5, 0x1

    iget v7, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    iget v8, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    const/4 v9, 0x0

    move-object v3, v10

    move v6, v2

    invoke-direct/range {v3 .. v9}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 333
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v10, v3, v2

    goto :goto_2

    .line 321
    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "nonsensical RESTART_LOCAL on live register v"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 329
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encountered RESTART_LOCAL on new v"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 339
    :pswitch_2
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    .line 344
    :try_start_2
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aget-object v3, v3, v2

    .line 346
    iget-boolean v4, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    if-eqz v4, :cond_4

    .line 351
    new-instance v10, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    iget v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    const/4 v5, 0x0

    iget v7, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    iget v8, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->typeIndex:I

    iget v9, v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->signatureIndex:I

    move-object v3, v10

    move v6, v2

    invoke-direct/range {v3 .. v9}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    .line 359
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v10, v3, v2

    goto/16 :goto_2

    .line 347
    :cond_4
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "nonsensical END_LOCAL on dead register v"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    .line 355
    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encountered END_LOCAL on new v"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 300
    :pswitch_3
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    .line 301
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v7

    .line 302
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v8

    .line 303
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v9

    .line 304
    new-instance v10, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    iget v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    const/4 v5, 0x1

    move-object v3, v10

    move v6, v2

    invoke-direct/range {v3 .. v9}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 307
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    iget-object v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v10, v3, v2

    goto/16 :goto_2

    .line 288
    :pswitch_4
    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v2

    .line 289
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v15

    .line 290
    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v16

    .line 291
    new-instance v3, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    iget v12, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    const/4 v13, 0x1

    const/16 v17, 0x0

    move-object v11, v3

    move v14, v2

    invoke-direct/range {v11 .. v17}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;-><init>(IZIIII)V

    .line 294
    iget-object v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    iget-object v4, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->lastEntryForReg:[Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    aput-object v3, v4, v2

    goto/16 :goto_2

    .line 373
    :pswitch_5
    iget v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readSignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->line:I

    goto/16 :goto_2

    .line 369
    :pswitch_6
    iget v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    invoke-static {v1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->address:I

    goto/16 :goto_2

    :pswitch_7
    return-void

    .line 390
    :cond_5
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid extended opcode encountered "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 248
    :cond_6
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Mismatch between parameters_size and prototype"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private getParamBase()I
    .locals 2

    .line 235
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->regSize:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->desc:Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->getWordCount()I

    move-result v1

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->isStatic:Z

    xor-int/lit8 v1, v1, 0x1

    sub-int/2addr v0, v1

    return v0
.end method

.method private readStringIndex(Lcom/google/dexmaker/dx/util/ByteInput;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 222
    invoke-static {p1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->readUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteInput;)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public static validateEncode([BLcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/code/DalvCode;Z)V
    .locals 9

    .line 420
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getPositions()Lcom/google/dexmaker/dx/dex/code/PositionList;

    move-result-object v6

    .line 421
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getLocals()Lcom/google/dexmaker/dx/dex/code/LocalList;

    move-result-object v8

    .line 422
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/dex/code/DalvCode;->getInsns()Lcom/google/dexmaker/dx/dex/code/DalvInsnList;

    move-result-object p3

    .line 423
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->codeSize()I

    move-result v1

    .line 424
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->getRegistersSize()I

    move-result v2

    move-object v0, p0

    move v3, p4

    move-object v4, p2

    move-object v5, p1

    move-object v7, v8

    .line 427
    :try_start_0
    invoke-static/range {v0 .. v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->validateEncode0([BIIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/dex/code/PositionList;Lcom/google/dexmaker/dx/dex/code/LocalList;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 430
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p4, "instructions:"

    invoke-virtual {p1, p4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 431
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const/4 p4, 0x1

    const-string v0, "  "

    invoke-virtual {p3, p1, v0, p4}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->debugPrint(Ljava/io/OutputStream;Ljava/lang/String;Z)V

    .line 432
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p3, "local list:"

    invoke-virtual {p1, p3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 433
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p3, "  "

    invoke-virtual {v8, p1, p3}, Lcom/google/dexmaker/dx/dex/code/LocalList;->debugPrint(Ljava/io/PrintStream;Ljava/lang/String;)V

    .line 434
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "while processing "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;->toHuman()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object p0

    throw p0
.end method

.method private static validateEncode0([BIIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/dex/code/PositionList;Lcom/google/dexmaker/dx/dex/code/LocalList;)V
    .locals 8

    .line 442
    new-instance v7, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;-><init>([BIIZLcom/google/dexmaker/dx/rop/cst/CstMethodRef;Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    .line 446
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->decode()V

    .line 453
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->getPositionList()Ljava/util/List;

    move-result-object p0

    .line 455
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p6}, Lcom/google/dexmaker/dx/dex/code/PositionList;->size()I

    move-result p2

    if-ne p1, p2, :cond_12

    .line 461
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;

    .line 463
    invoke-virtual {p6}, Lcom/google/dexmaker/dx/dex/code/PositionList;->size()I

    move-result p4

    sub-int/2addr p4, p3

    :goto_1
    if-ltz p4, :cond_1

    .line 464
    invoke-virtual {p6, p4}, Lcom/google/dexmaker/dx/dex/code/PositionList;->get(I)Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    move-result-object p5

    .line 466
    iget v0, p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;->line:I

    invoke-virtual {p5}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->getLine()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget v0, p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;->address:I

    invoke-virtual {p5}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->getAddress()I

    move-result p5

    if-ne v0, p5, :cond_0

    move p2, p3

    goto :goto_2

    :cond_0
    add-int/lit8 p4, p4, -0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz p2, :cond_2

    goto :goto_0

    .line 474
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Could not match position entry: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;->address:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;->line:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 484
    :cond_3
    invoke-virtual {v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->getLocals()Ljava/util/List;

    move-result-object p0

    .line 485
    iget p1, v7, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->thisStringIdx:I

    .line 486
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p4

    .line 487
    invoke-direct {v7}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->getParamBase()I

    move-result p5

    move p6, p4

    move p4, p2

    :goto_3
    if-ge p4, p6, :cond_8

    .line 495
    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 496
    iget v1, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    if-ltz v1, :cond_4

    if-ne v1, p1, :cond_7

    :cond_4
    add-int/lit8 v1, p4, 0x1

    :goto_4
    if-ge v1, p6, :cond_7

    .line 500
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 501
    iget v3, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    if-eqz v3, :cond_5

    goto :goto_5

    .line 504
    :cond_5
    iget v3, v0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    iget v4, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    if-ne v3, v4, :cond_6

    iget-boolean v3, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    if-eqz v3, :cond_6

    .line 505
    invoke-interface {p0, p4, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 506
    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 p6, p6, -0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 p4, p4, 0x1

    goto :goto_3

    .line 514
    :cond_8
    invoke-virtual {p7}, Lcom/google/dexmaker/dx/dex/code/LocalList;->size()I

    move-result p1

    move p4, p2

    move v0, p4

    :goto_6
    if-ge p4, p1, :cond_f

    .line 519
    invoke-virtual {p7, p4}, Lcom/google/dexmaker/dx/dex/code/LocalList;->get(I)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v1

    .line 521
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getDisposition()Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    move-result-object v2

    sget-object v3, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-ne v2, v3, :cond_9

    goto/16 :goto_8

    .line 533
    :cond_9
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 534
    iget v3, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->nameIndex:I

    if-ltz v3, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v0, v0, 0x1

    if-lt v0, p6, :cond_9

    .line 545
    :goto_7
    iget v3, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->address:I

    .line 547
    iget v4, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegister()I

    move-result v5

    if-eq v4, v5, :cond_b

    .line 548
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "local register mismatch at orig "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " / decoded "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_9

    .line 554
    :cond_b
    iget-boolean v4, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->isStart:Z

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v5

    if-eq v4, v5, :cond_c

    .line 555
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "local start/end mismatch at orig "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " / decoded "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_9

    .line 566
    :cond_c
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v1

    if-eq v3, v1, :cond_e

    if-nez v3, :cond_d

    iget v1, v2, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;->reg:I

    if-ge v1, p5, :cond_e

    .line 569
    :cond_d
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "local address mismatch at orig "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " / decoded "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_9

    :cond_e
    add-int/lit8 v0, v0, 0x1

    :goto_8
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_6

    :cond_f
    move p3, p2

    :goto_9
    if-eqz p3, :cond_11

    .line 579
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string p2, "decoded locals:"

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 580
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;

    .line 581
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "  "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_a

    .line 583
    :cond_10
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "local table problem"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    return-void

    .line 456
    :cond_12
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Decoded positions table not same size was "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " expected "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Lcom/google/dexmaker/dx/dex/code/PositionList;->size()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public decode()V
    .locals 2

    .line 207
    :try_start_0
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->decode0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "...while decoding debug info"

    .line 209
    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    move-result-object v0

    throw v0
.end method

.method public getLocals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$LocalEntry;",
            ">;"
        }
    .end annotation

    .line 199
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->locals:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPositionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder$PositionEntry;",
            ">;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/DebugInfoDecoder;->positions:Ljava/util/ArrayList;

    return-object v0
.end method
