.class public abstract Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.super Lorg/apache/sanselan/common/BinaryFileParser;
.source "Segment.java"


# instance fields
.field public final length:I

.field public final marker:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lorg/apache/sanselan/common/BinaryFileParser;-><init>()V

    .line 32
    iput p1, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    .line 33
    iput p2, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->length:I

    return-void
.end method


# virtual methods
.method public dump(Ljava/io/PrintWriter;)V
    .locals 0

    return-void
.end method

.method public abstract getDescription()Ljava/lang/String;
.end method

.method public getSegmentType()Ljava/lang/String;
    .locals 3

    .line 50
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    const v1, 0xff01

    if-eq v0, v1, :cond_4

    const v1, 0xfffe

    if-eq v0, v1, :cond_3

    packed-switch v0, :pswitch_data_0

    const v1, 0xff02

    if-lt v0, v1, :cond_0

    const v1, 0xffbf

    if-gt v0, v1, :cond_0

    const-string v0, "Reserved"

    return-object v0

    .line 138
    :cond_0
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    const v1, 0xffe0

    if-lt v0, v1, :cond_1

    const v2, 0xffef

    if-gt v0, v2, :cond_1

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "APP"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 140
    :cond_1
    iget v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    const v2, 0xfff0

    if-lt v0, v2, :cond_2

    const v2, 0xfffd

    if-gt v0, v2, :cond_2

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JPG"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->marker:I

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "Unknown"

    return-object v0

    :pswitch_0
    const-string v0, "Expand reference component(s)"

    return-object v0

    :pswitch_1
    const-string v0, "Define hierarchical progression"

    return-object v0

    :pswitch_2
    const-string v0, "Define restart interval"

    return-object v0

    :pswitch_3
    const-string v0, "Define number of lines"

    return-object v0

    :pswitch_4
    const-string v0, "Define quantization table(s)"

    return-object v0

    :pswitch_5
    const-string v0, "Start of scan"

    return-object v0

    :pswitch_6
    const-string v0, "End of image"

    return-object v0

    :pswitch_7
    const-string v0, "Start of image"

    return-object v0

    :pswitch_8
    const-string v0, "Restart with modulo 8 count 7"

    return-object v0

    :pswitch_9
    const-string v0, "Restart with modulo 8 count 6"

    return-object v0

    :pswitch_a
    const-string v0, "Restart with modulo 8 count 5"

    return-object v0

    :pswitch_b
    const-string v0, "Restart with modulo 8 count 4"

    return-object v0

    :pswitch_c
    const-string v0, "Restart with modulo 8 count 3"

    return-object v0

    :pswitch_d
    const-string v0, "Restart with modulo 8 count 2"

    return-object v0

    :pswitch_e
    const-string v0, "Restart with modulo 8 count 1"

    return-object v0

    :pswitch_f
    const-string v0, "Restart with modulo 8 count 0"

    return-object v0

    :pswitch_10
    const-string v0, "Start Of Frame, Differential lossless (sequential), arithmetic coding"

    return-object v0

    :pswitch_11
    const-string v0, "Start Of Frame, Differential progressive DCT, arithmetic coding"

    return-object v0

    :pswitch_12
    const-string v0, "Start Of Frame, Differential sequential DCT, arithmetic coding"

    return-object v0

    :pswitch_13
    const-string v0, "Define arithmetic coding conditioning(s)"

    return-object v0

    :pswitch_14
    const-string v0, "Start Of Frame, Lossless (sequential), arithmetic coding"

    return-object v0

    :pswitch_15
    const-string v0, "Start Of Frame, Progressive DCT, arithmetic coding"

    return-object v0

    :pswitch_16
    const-string v0, "Start Of Frame, Extended sequential DCT, arithmetic coding"

    return-object v0

    :pswitch_17
    const-string v0, "Start Of Frame, Reserved for JPEG extensions, arithmetic coding"

    return-object v0

    :pswitch_18
    const-string v0, "Start Of Frame, Differential lossless (sequential), Huffman coding"

    return-object v0

    :pswitch_19
    const-string v0, "Start Of Frame, Differential progressive DCT, Huffman coding"

    return-object v0

    :pswitch_1a
    const-string v0, "Start Of Frame, Differential sequential DCT, Huffman coding"

    return-object v0

    :pswitch_1b
    const-string v0, "Define Huffman table(s)"

    return-object v0

    :pswitch_1c
    const-string v0, "Start Of Frame, Lossless (sequential), Huffman coding"

    return-object v0

    :pswitch_1d
    const-string v0, "Start Of Frame, Progressive DCT, Huffman coding"

    return-object v0

    :pswitch_1e
    const-string v0, "Start Of Frame, Extended sequential DCT, Huffman coding"

    return-object v0

    :pswitch_1f
    const-string v0, "Start Of Frame, Baseline DCT, Huffman coding"

    return-object v0

    :cond_3
    const-string v0, "Comment"

    return-object v0

    :cond_4
    const-string v0, "For temporary private use in arithmetic coding"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xffc0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Segment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
