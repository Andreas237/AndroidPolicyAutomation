.class public final Lcom/squareup/haha/trove/PrimeFinder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final primeCapacities:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    const/16 v0, 0xf5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 138
    sput-object v0, Lcom/squareup/haha/trove/PrimeFinder;->primeCapacities:[I

    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 139
    return-void

    nop

    :array_0
    .array-data 4
        0x7fffffff
        0x5
        0xb
        0x17
        0x2f
        0x61
        0xc5
        0x18d
        0x31d
        0x63d
        0xc83
        0x1915
        0x3235
        0x6475
        0xc8ed
        0x191dd
        0x323bf
        0x64787
        0xc8f4d
        0x191e9d
        0x323d49
        0x647a97
        0xc8f539
        0x191ea81
        0x323d521
        0x647aa43
        0xc8f5489
        0x191ea927
        0x323d525b
        0x647aa4bf
        0x1b1
        0x36d
        0x6df
        0xdc7
        0x1b91
        0x373f
        0x6e81
        0xdd0f
        0x1ba25
        0x3744b
        0x6e897
        0xdd14f
        0x1ba2a3
        0x37454b
        0x6e8a99
        0xdd1563
        0x1ba2ac7
        0x374559b
        0x6e8ab8b
        0xdd1572b
        0x1ba2ae79
        0x37455d1b
        0x6e8aba45
        0x3b9
        0x773
        0xeed
        0x1ddb
        0x3bb7
        0x7771
        0xeef1
        0x1ddeb
        0x3bbdf
        0x777bf
        0xeef85
        0x1ddf13
        0x3bbe4d
        0x777cad
        0xeef96f
        0x1ddf2f3
        0x3bbe5ed
        0x777cbdb
        0xeef97cb
        0x1ddf2f9b
        0x3bbe5f3b
        0x777cbe79
        0x40f
        0x821
        0x1051
        0x20ab
        0x4159
        0x82b5
        0x1056b
        0x20add
        0x415c1
        0x82bb9
        0x105785
        0x20af19
        0x415e3b
        0x82bc79
        0x10578f7
        0x20af203
        0x415e415
        0x82bc82d
        0x1057909f
        0x20af2147
        0x415e428f
        0x1f
        0x43
        0x89
        0x115
        0x22d
        0x45d
        0x8bd
        0x1181
        0x2303
        0x4609
        0x8c17
        0x1183d
        0x2307b
        0x460fd
        0x8c201
        0x118411
        0x230833
        0x461069
        0x8c20e1
        0x11841cb
        0x2308397
        0x461075b    # 2.6452E-36f
        0x8c20ecb
        0x11841da5
        0x23083b61
        0x461076c7
        0x257
        0x4b1
        0x96b
        0x12df
        0x25cd
        0x4bad
        0x975b
        0x12ec5
        0x25d93
        0x4bb41
        0x9768b
        0x12ed29
        0x25da59
        0x4bb4b3
        0x976975
        0x12ed2ef
        0x25da5ef
        0x4bb4bed
        0x97697dd
        0x12ed2fbd
        0x25da5f7b
        0x4bb4bf6b    # 2.3690966E7f
        0x137
        0x277
        0x4fd
        0x9fd
        0x13ff
        0x2803
        0x501b
        0xa039
        0x14075
        0x280f9
        0x50215
        0xa042d
        0x140863
        0x2810e1
        0x5021c9
        0xa04395
        0x1408739
        0x2810e79
        0x5021d05
        0xa043a0b
        0x14087417    # 6.88914E-27f
        0x2810e841
        0x5021d089
        0x3
        0x7
        0x11
        0x25
        0x4f
        0xa3
        0x14b
        0x2a1
        0x551
        0xaa9
        0x155f
        0x2ac5
        0x5597
        0xab4d
        0x156a7
        0x2ad57
        0x55ab3
        0xab57b
        0x156af9
        0x2ad607
        0x55ac41
        0xab5893
        0x156b12f
        0x2ad6285
        0x55ac519
        0xab58a35
        0x156b14a3
        0x2ad62961
        0x55ac52c5
        0x2b
        0x59
        0xb3
        0x167
        0x2cf
        0x59f
        0xb3f
        0x1693
        0x2d3b
        0x5a77
        0xb4f7
        0x169f1
        0x2d3eb
        0x5a7e5
        0xb4fd9
        0x169fd3
        0x2d3fad
        0x5a7f87
        0xb4ff1f
        0x169fe4d
        0x2d3fca1
        0x5a7f95b
        0xb4ff2b9
        0x169fe58d
        0x2d3fcb1b
        0x5a7f9637
        0x17b
        0x2f9
        0x5f3
        0xbe9
        0x17d5
        0x2fab
        0x5f57
        0xbeb1
        0x17d71
        0x2faef
        0x5f5f7
        0xbebf5
        0x17d7f3
        0x2fb009
        0x5f6029
        0xbec0b1
        0x17d8195
        0x2fb0337
        0x5f60687
        0xbec0d15
        0x17d81a33
        0x2fb03481
        0x5f606903
    .end array-data
.end method

.method public static nextPrime(I)I
    .locals 3

    .line 150
    sget-object v0, Lcom/squareup/haha/trove/PrimeFinder;->primeCapacities:[I

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    .line 151
    move v2, v0

    if-gez v0, :cond_0

    .line 154
    neg-int v0, v2

    add-int/lit8 v2, v0, -0x1

    .line 156
    :cond_0
    sget-object v0, Lcom/squareup/haha/trove/PrimeFinder;->primeCapacities:[I

    aget v0, v0, v2

    return v0
.end method
