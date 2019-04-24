.class final Lcom/google/protobuf/Utf8$SafeProcessor;
.super Lcom/google/protobuf/Utf8$Processor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Utf8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "SafeProcessor"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 758
    invoke-direct {p0}, Lcom/google/protobuf/Utf8$Processor;-><init>()V

    return-void
.end method

.method private static partialIsValidUtf8([BII)I
    .locals 1

    .line 916
    :goto_0
    if-ge p1, p2, :cond_0

    aget-byte v0, p0, p1

    if-ltz v0, :cond_0

    .line 917
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 920
    :cond_0
    if-lt p1, p2, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8$SafeProcessor;->partialIsValidUtf8NonAscii([BII)I

    move-result v0

    :goto_1
    return v0
.end method

.method private static partialIsValidUtf8NonAscii([BII)I
    .locals 4

    .line 929
    :cond_0
    :goto_0
    if-lt p1, p2, :cond_1

    .line 930
    const/4 v0, 0x0

    return v0

    .line 932
    :cond_1
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    move v2, v0

    if-gez v0, :cond_0

    .line 934
    const/16 v0, -0x20

    if-ge v2, v0, :cond_4

    .line 937
    if-lt p1, p2, :cond_2

    .line 939
    return v2

    .line 944
    :cond_2
    const/16 v0, -0x3e

    if-lt v2, v0, :cond_3

    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_c

    .line 946
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 948
    :cond_4
    const/16 v0, -0x10

    if-ge v2, v0, :cond_9

    .line 951
    add-int/lit8 v0, p2, -0x1

    if-lt p1, v0, :cond_5

    .line 952
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->access$400([BII)I

    move-result v0

    return v0

    .line 954
    :cond_5
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    move v3, v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_8

    const/16 v0, -0x20

    if-ne v2, v0, :cond_6

    const/16 v0, -0x60

    if-lt v3, v0, :cond_8

    :cond_6
    const/16 v0, -0x13

    if-ne v2, v0, :cond_7

    const/16 v0, -0x60

    if-ge v3, v0, :cond_8

    :cond_7
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_c

    .line 961
    :cond_8
    const/4 v0, -0x1

    return v0

    .line 966
    :cond_9
    add-int/lit8 v0, p2, -0x2

    if-lt p1, v0, :cond_a

    .line 967
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->access$400([BII)I

    move-result v0

    return v0

    .line 969
    :cond_a
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    move v3, v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_b

    shl-int/lit8 v0, v2, 0x1c

    add-int/lit8 v1, v3, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_b

    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    const/16 v1, -0x41

    if-gt v0, v1, :cond_b

    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-byte v0, p0, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_c

    .line 979
    :cond_b
    const/4 v0, -0x1

    return v0

    .line 982
    :cond_c
    goto/16 :goto_0
.end method


# virtual methods
.method encodeUtf8(Ljava/lang/CharSequence;[BII)I
    .locals 10

    .line 855
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 856
    move v4, p3

    .line 857
    const/4 v5, 0x0

    .line 858
    add-int v6, p3, p4

    .line 861
    :goto_0
    if-ge v5, v3, :cond_0

    add-int v0, v5, v4

    if-ge v0, v6, :cond_0

    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v7, v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    .line 862
    add-int v0, v4, v5

    int-to-byte v1, v7

    aput-byte v1, p2, v0

    .line 861
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 864
    :cond_0
    if-ne v5, v3, :cond_1

    .line 865
    add-int v0, v4, v3

    return v0

    .line 867
    :cond_1
    add-int/2addr v4, v5

    .line 868
    :goto_1
    if-ge v5, v3, :cond_b

    .line 869
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    .line 870
    const/16 v0, 0x80

    if-ge v7, v0, :cond_2

    if-ge v4, v6, :cond_2

    .line 871
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    int-to-byte v1, v7

    aput-byte v1, p2, v0

    goto/16 :goto_2

    .line 872
    :cond_2
    const/16 v0, 0x800

    if-ge v7, v0, :cond_3

    add-int/lit8 v0, v6, -0x2

    if-gt v4, v0, :cond_3

    .line 873
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v7, 0x6

    or-int/lit16 v1, v1, 0x3c0

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 874
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v1, v7, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    goto/16 :goto_2

    .line 875
    :cond_3
    const v0, 0xd800

    if-lt v7, v0, :cond_4

    const v0, 0xdfff

    if-ge v0, v7, :cond_5

    :cond_4
    add-int/lit8 v0, v6, -0x3

    if-gt v4, v0, :cond_5

    .line 877
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v7, 0xc

    or-int/lit16 v1, v1, 0x1e0

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 878
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v7, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 879
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v1, v7, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    goto/16 :goto_2

    .line 880
    :cond_5
    add-int/lit8 v0, v6, -0x4

    if-gt v4, v0, :cond_8

    .line 884
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eq v0, v1, :cond_6

    add-int/lit8 v5, v5, 0x1

    .line 885
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    move v8, v0

    invoke-static {v7, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_7

    .line 886
    :cond_6
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    add-int/lit8 v1, v5, -0x1

    invoke-direct {v0, v1, v3}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 888
    :cond_7
    invoke-static {v7, v8}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v9

    .line 889
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v9, 0x12

    or-int/lit16 v1, v1, 0xf0

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 890
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v9, 0xc

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 891
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    ushr-int/lit8 v1, v9, 0x6

    and-int/lit8 v1, v1, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 892
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    and-int/lit8 v1, v9, 0x3f

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    aput-byte v1, p2, v0

    .line 893
    goto :goto_2

    .line 896
    :cond_8
    const v0, 0xd800

    if-gt v0, v7, :cond_a

    const v0, 0xdfff

    if-gt v7, v0, :cond_a

    add-int/lit8 v0, v5, 0x1

    .line 897
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eq v0, v1, :cond_9

    add-int/lit8 v0, v5, 0x1

    .line 898
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v7, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_a

    .line 899
    :cond_9
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v5, v3}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 901
    :cond_a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed writing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 868
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 904
    :cond_b
    return v4
.end method

.method encodeUtf8Direct(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 910
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/Utf8$SafeProcessor;->encodeUtf8Default(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    .line 911
    return-void
.end method

.method partialIsValidUtf8(I[BII)I
    .locals 5

    .line 761
    if-eqz p1, :cond_d

    .line 769
    if-lt p3, p4, :cond_0

    .line 770
    return p1

    .line 772
    :cond_0
    int-to-byte v2, p1

    .line 774
    const/16 v0, -0x20

    if-ge v2, v0, :cond_2

    .line 779
    const/16 v0, -0x3e

    if-lt v2, v0, :cond_1

    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v0, p2, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 782
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 784
    :cond_2
    const/16 v0, -0x10

    if-ge v2, v0, :cond_8

    .line 788
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v3, v0

    .line 789
    if-nez v3, :cond_3

    .line 790
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v3, p2, v0

    .line 791
    if-lt p3, p4, :cond_3

    .line 792
    invoke-static {v2, v3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 795
    :cond_3
    const/16 v0, -0x41

    if-gt v3, v0, :cond_6

    const/16 v0, -0x20

    if-ne v2, v0, :cond_4

    const/16 v0, -0x60

    if-lt v3, v0, :cond_6

    :cond_4
    const/16 v0, -0x13

    if-ne v2, v0, :cond_5

    const/16 v0, -0x60

    if-ge v3, v0, :cond_6

    :cond_5
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v0, p2, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_7

    .line 802
    :cond_6
    const/4 v0, -0x1

    return v0

    .line 804
    :cond_7
    goto :goto_0

    .line 808
    :cond_8
    shr-int/lit8 v0, p1, 0x8

    xor-int/lit8 v0, v0, -0x1

    int-to-byte v3, v0

    .line 809
    const/4 v4, 0x0

    .line 810
    if-nez v3, :cond_9

    .line 811
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v3, p2, v0

    .line 812
    if-lt p3, p4, :cond_a

    .line 813
    invoke-static {v2, v3}, Lcom/google/protobuf/Utf8;->access$000(II)I

    move-result v0

    return v0

    .line 816
    :cond_9
    shr-int/lit8 v0, p1, 0x10

    int-to-byte v4, v0

    .line 818
    :cond_a
    if-nez v4, :cond_b

    .line 819
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v4, p2, v0

    .line 820
    if-lt p3, p4, :cond_b

    .line 821
    invoke-static {v2, v3, v4}, Lcom/google/protobuf/Utf8;->access$100(III)I

    move-result v0

    return v0

    .line 829
    :cond_b
    const/16 v0, -0x41

    if-gt v3, v0, :cond_c

    shl-int/lit8 v0, v2, 0x1c

    add-int/lit8 v1, v3, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_c

    const/16 v0, -0x41

    if-gt v4, v0, :cond_c

    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget-byte v0, p2, v0

    const/16 v1, -0x41

    if-le v0, v1, :cond_d

    .line 839
    :cond_c
    const/4 v0, -0x1

    return v0

    .line 844
    :cond_d
    :goto_0
    invoke-static {p2, p3, p4}, Lcom/google/protobuf/Utf8$SafeProcessor;->partialIsValidUtf8([BII)I

    move-result v0

    return v0
.end method

.method partialIsValidUtf8Direct(ILjava/nio/ByteBuffer;II)I
    .locals 1

    .line 850
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/protobuf/Utf8$SafeProcessor;->partialIsValidUtf8Default(ILjava/nio/ByteBuffer;II)I

    move-result v0

    return v0
.end method
