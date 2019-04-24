.class public Lcom/scandit/recognition/Barcode;
.super Lcom/scandit/recognition/NativeHandle;
.source "Barcode.java"


# static fields
.field public static final ALL_SYMBOLOGIES:[I

.field public static final SC_COMPOSITE_FLAG_GS1_A:I

.field public static final SC_COMPOSITE_FLAG_GS1_B:I

.field public static final SC_COMPOSITE_FLAG_GS1_C:I

.field public static final SC_COMPOSITE_FLAG_LINKED:I

.field public static final SC_COMPOSITE_FLAG_NONE:I

.field public static final SC_COMPOSITE_FLAG_UNKNOWN:I

.field public static final SYMBOLOGY_AZTEC:I

.field public static final SYMBOLOGY_CODABAR:I

.field public static final SYMBOLOGY_CODE11:I

.field public static final SYMBOLOGY_CODE128:I

.field public static final SYMBOLOGY_CODE25:I

.field public static final SYMBOLOGY_CODE39:I

.field public static final SYMBOLOGY_CODE93:I

.field public static final SYMBOLOGY_DATA_MATRIX:I

.field public static final SYMBOLOGY_DOTCODE:I

.field public static final SYMBOLOGY_EAN13:I

.field public static final SYMBOLOGY_EAN8:I

.field public static final SYMBOLOGY_FIVE_DIGIT_ADD_ON:I

.field public static final SYMBOLOGY_GS1_DATABAR:I

.field public static final SYMBOLOGY_GS1_DATABAR_EXPANDED:I

.field public static final SYMBOLOGY_GS1_DATABAR_LIMITED:I

.field public static final SYMBOLOGY_INTERLEAVED_2_OF_5:I

.field public static final SYMBOLOGY_KIX:I

.field public static final SYMBOLOGY_MAXICODE:I

.field public static final SYMBOLOGY_MICRO_PDF417:I

.field public static final SYMBOLOGY_MSI_PLESSEY:I

.field public static final SYMBOLOGY_PDF417:I

.field public static final SYMBOLOGY_QR:I

.field public static final SYMBOLOGY_RM4SCC:I

.field public static final SYMBOLOGY_TWO_DIGIT_ADD_ON:I

.field public static final SYMBOLOGY_UNKNOWN:I

.field public static final SYMBOLOGY_UPCA:I

.field public static final SYMBOLOGY_UPCE:I


# instance fields
.field private mSymbology:I

.field private mText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 35
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_UNKNOWN_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UNKNOWN:I

    .line 39
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_EAN13_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN13:I

    .line 43
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_EAN8_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN8:I

    .line 47
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_UPCA_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    .line 51
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_UPCE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCE:I

    .line 56
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODE128_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE128:I

    .line 60
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODE11_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE11:I

    .line 64
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODE25_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE25:I

    .line 68
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODE39_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE39:I

    .line 72
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODE93_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE93:I

    .line 77
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_INTERLEAVED_2_OF_5_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_INTERLEAVED_2_OF_5:I

    .line 81
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_QR_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_QR:I

    .line 85
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_DATA_MATRIX_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DATA_MATRIX:I

    .line 89
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_PDF417_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_PDF417:I

    .line 93
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_MICRO_PDF417_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MICRO_PDF417:I

    .line 97
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_MSI_PLESSEY_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MSI_PLESSEY:I

    .line 102
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_GS1_DATABAR_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR:I

    .line 107
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_GS1_DATABAR_EXPANDED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR_EXPANDED:I

    .line 112
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_GS1_DATABAR_LIMITED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR_LIMITED:I

    .line 117
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_CODABAR_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODABAR:I

    .line 121
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_AZTEC_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_AZTEC:I

    .line 125
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_MAXICODE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MAXICODE:I

    .line 135
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_TWO_DIGIT_ADD_ON_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_TWO_DIGIT_ADD_ON:I

    .line 145
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_FIVE_DIGIT_ADD_ON_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_FIVE_DIGIT_ADD_ON:I

    .line 152
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_KIX_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_KIX:I

    .line 159
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_RM4SCC_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_RM4SCC:I

    .line 166
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SYMBOLOGY_DOTCODE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DOTCODE:I

    const/16 v0, 0x18

    .line 172
    new-array v0, v0, [I

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN13:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN8:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCE:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE11:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE128:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE25:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE39:I

    const/4 v2, 0x7

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE93:I

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_INTERLEAVED_2_OF_5:I

    const/16 v2, 0x9

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_QR:I

    const/16 v2, 0xa

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DATA_MATRIX:I

    const/16 v2, 0xb

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_PDF417:I

    const/16 v2, 0xc

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MICRO_PDF417:I

    const/16 v2, 0xd

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MSI_PLESSEY:I

    const/16 v2, 0xe

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR:I

    const/16 v2, 0xf

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR_EXPANDED:I

    const/16 v2, 0x10

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_GS1_DATABAR_LIMITED:I

    const/16 v2, 0x11

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODABAR:I

    const/16 v2, 0x12

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_AZTEC:I

    const/16 v2, 0x13

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_MAXICODE:I

    const/16 v2, 0x14

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_TWO_DIGIT_ADD_ON:I

    const/16 v2, 0x15

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_FIVE_DIGIT_ADD_ON:I

    const/16 v2, 0x16

    aput v1, v0, v2

    sget v1, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_DOTCODE:I

    const/16 v2, 0x17

    aput v1, v0, v2

    sput-object v0, Lcom/scandit/recognition/Barcode;->ALL_SYMBOLOGIES:[I

    .line 206
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_NONE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_NONE:I

    .line 213
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_UNKNOWN_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_UNKNOWN:I

    .line 219
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_LINKED_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_LINKED:I

    .line 225
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_GS1_A_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_GS1_A:I

    .line 231
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_GS1_B_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_GS1_B:I

    .line 237
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_COMPOSITE_FLAG_GS1_C_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_GS1_C:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 266
    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lcom/scandit/recognition/Barcode;->mText:Ljava/lang/String;

    .line 242
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UNKNOWN:I

    iput v0, p0, Lcom/scandit/recognition/Barcode;->mSymbology:I

    .line 267
    iput p1, p0, Lcom/scandit/recognition/Barcode;->mSymbology:I

    .line 268
    iput-object p2, p0, Lcom/scandit/recognition/Barcode;->mText:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(J)V
    .locals 1

    .line 251
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lcom/scandit/recognition/Barcode;->mText:Ljava/lang/String;

    .line 242
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UNKNOWN:I

    iput v0, p0, Lcom/scandit/recognition/Barcode;->mSymbology:I

    .line 252
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_retain(J)V

    return-void
.end method

.method public constructor <init>(Lcom/scandit/recognition/TrackedObject;)V
    .locals 2

    .line 281
    invoke-virtual {p1}, Lcom/scandit/recognition/TrackedObject;->getHandle()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/Barcode;-><init>(J)V

    return-void
.end method

.method public static symbologyToString(I)Ljava/lang/String;
    .locals 0

    .line 465
    invoke-static {p0}, Lcom/scandit/recognition/Native;->sc_symbology_to_string(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getCompositeFlag()I
    .locals 5

    .line 331
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 332
    sget v0, Lcom/scandit/recognition/Barcode;->SC_COMPOSITE_FLAG_UNKNOWN:I

    return v0

    .line 333
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_composite_flag(J)I

    move-result v0

    return v0
.end method

.method public getData()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    .line 382
    iget-wide v1, v0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 383
    iget-object v1, v0, Lcom/scandit/recognition/Barcode;->mText:Ljava/lang/String;

    return-object v1

    .line 384
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/scandit/recognition/Barcode;->getRawData()[B

    move-result-object v1

    .line 385
    iget-wide v5, v0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sc_barcode_get_data_encoding(J)J

    move-result-wide v5

    .line 386
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sc_encoding_array_get_size(J)J

    move-result-wide v7

    .line 388
    array-length v2, v1

    mul-int/lit8 v2, v2, 0x3

    invoke-static {v2}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v2

    :goto_0
    cmp-long v9, v3, v7

    if-gez v9, :cond_2

    .line 390
    invoke-static {v5, v6, v3, v4}, Lcom/scandit/recognition/Native;->sc_encoding_array_get_item_at(JJ)J

    move-result-wide v9

    .line 392
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->ScEncodingRange_encoding_get(J)Ljava/lang/String;

    move-result-object v11

    .line 393
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->ScEncodingRange_start_get(J)J

    move-result-wide v12

    .line 394
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->ScEncodingRange_end_get(J)J

    move-result-wide v14

    long-to-int v0, v12

    move-wide/from16 v16, v7

    sub-long v7, v14, v12

    long-to-int v8, v7

    .line 395
    invoke-static {v1, v0, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 397
    :try_start_0
    invoke-static {v11}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v11

    .line 398
    invoke-virtual {v11}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v11

    const/4 v7, 0x1

    .line 399
    invoke-virtual {v11, v0, v2, v7}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v7, 0x1

    goto :goto_2

    :catch_0
    :goto_1
    cmp-long v0, v12, v14

    if-gez v0, :cond_1

    long-to-int v0, v12

    .line 403
    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/CharBuffer;->put(C)Ljava/nio/CharBuffer;

    const-wide/16 v7, 0x1

    add-long/2addr v12, v7

    goto :goto_1

    :cond_1
    const-wide/16 v7, 0x1

    .line 406
    :goto_2
    invoke-static {v9, v10}, Lcom/scandit/recognition/Native;->delete_ScEncodingRange(J)V

    add-long/2addr v3, v7

    move-wide/from16 v7, v16

    move-object/from16 v0, p0

    goto :goto_0

    .line 408
    :cond_2
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->sc_encoding_array_free(J)V

    .line 409
    invoke-static {v5, v6}, Lcom/scandit/recognition/Native;->delete_ScEncodingArray(J)V

    .line 410
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->array()[C

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/nio/CharBuffer;->position()I

    move-result v2

    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public getFrameId()I
    .locals 5

    .line 420
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, -0x1

    return v0

    .line 422
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_frame_id(J)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public getLocation()Lcom/scandit/recognition/Quadrilateral;
    .locals 5

    .line 438
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 439
    new-instance v0, Lcom/scandit/recognition/Quadrilateral;

    invoke-direct {v0}, Lcom/scandit/recognition/Quadrilateral;-><init>()V

    return-object v0

    .line 441
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_location(J)J

    move-result-wide v0

    .line 442
    new-instance v2, Lcom/scandit/recognition/Quadrilateral;

    invoke-direct {v2, v0, v1}, Lcom/scandit/recognition/Quadrilateral;-><init>(J)V

    .line 443
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScQuadrilateral(J)V

    return-object v2
.end method

.method public getRawData()[B
    .locals 5

    .line 363
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 364
    iget-object v0, p0, Lcom/scandit/recognition/Barcode;->mText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0

    .line 365
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_data_length(J)I

    move-result v0

    .line 366
    new-array v0, v0, [B

    .line 367
    iget-wide v1, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v1, v2, v0}, Lcom/scandit/recognition/Native;->sc_barcode_fill_data(J[B)V

    return-object v0
.end method

.method public getSymbolCount()I
    .locals 5

    .line 414
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, -0x1

    return v0

    .line 416
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_symbol_count(J)I

    move-result v0

    return v0
.end method

.method public getSymbology()I
    .locals 5

    .line 296
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 297
    sget v0, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UNKNOWN:I

    return v0

    .line 298
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_get_symbology(J)I

    move-result v0

    return v0
.end method

.method public getSymbologyName()Ljava/lang/String;
    .locals 5

    .line 307
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-string v0, "unknown"

    return-object v0

    .line 309
    :cond_0
    invoke-virtual {p0}, Lcom/scandit/recognition/Barcode;->getSymbology()I

    move-result v0

    invoke-static {v0}, Lcom/scandit/recognition/Native;->sc_symbology_to_string(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isColorInverted()Z
    .locals 6

    .line 458
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_2

    invoke-virtual {p0}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 461
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_is_color_inverted(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_2
    :goto_1
    return v2
.end method

.method public isGs1DataCarrier()Z
    .locals 6

    .line 319
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 321
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_is_gs1_data_carrier(J)I

    move-result v0

    if-lez v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public isRecognized()Z
    .locals 6

    .line 349
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 351
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/Barcode;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_is_recognized(J)I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method protected release(J)V
    .locals 0

    .line 286
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_release(J)V

    return-void
.end method
