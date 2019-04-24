.class public Lorg/apache/commons/lang3/ArrayUtils;
.super Ljava/lang/Object;
.source "ArrayUtils.java"


# static fields
.field public static final EMPTY_BOOLEAN_ARRAY:[Z

.field public static final EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

.field public static final EMPTY_BYTE_ARRAY:[B

.field public static final EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

.field public static final EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

.field public static final EMPTY_CHAR_ARRAY:[C

.field public static final EMPTY_CLASS_ARRAY:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final EMPTY_DOUBLE_ARRAY:[D

.field public static final EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

.field public static final EMPTY_FLOAT_ARRAY:[F

.field public static final EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

.field public static final EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

.field public static final EMPTY_INT_ARRAY:[I

.field public static final EMPTY_LONG_ARRAY:[J

.field public static final EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

.field public static final EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

.field public static final EMPTY_SHORT_ARRAY:[S

.field public static final EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

.field public static final EMPTY_STRING_ARRAY:[Ljava/lang/String;

.field public static final INDEX_NOT_FOUND:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 51
    new-array v1, v0, [Ljava/lang/Object;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

    .line 55
    new-array v1, v0, [Ljava/lang/Class;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CLASS_ARRAY:[Ljava/lang/Class;

    .line 59
    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 63
    new-array v1, v0, [J

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    .line 67
    new-array v1, v0, [Ljava/lang/Long;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    .line 71
    new-array v1, v0, [I

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    .line 75
    new-array v1, v0, [Ljava/lang/Integer;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    .line 79
    new-array v1, v0, [S

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    .line 83
    new-array v1, v0, [Ljava/lang/Short;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    .line 87
    new-array v1, v0, [B

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    .line 91
    new-array v1, v0, [Ljava/lang/Byte;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    .line 95
    new-array v1, v0, [D

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    .line 99
    new-array v1, v0, [Ljava/lang/Double;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    .line 103
    new-array v1, v0, [F

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    .line 107
    new-array v1, v0, [Ljava/lang/Float;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    .line 111
    new-array v1, v0, [Z

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    .line 115
    new-array v1, v0, [Ljava/lang/Boolean;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    .line 119
    new-array v1, v0, [C

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    .line 123
    new-array v0, v0, [Ljava/lang/Character;

    sput-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    .line 5946
    invoke-static {p3, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    .line 5947
    invoke-static {p0, v0, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object p0

    .line 5944
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Index: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Length: 0"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 5950
    :cond_1
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-gt p1, v1, :cond_3

    if-ltz p1, :cond_3

    add-int/lit8 v2, v1, 0x1

    .line 5954
    invoke-static {p3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p3

    .line 5955
    invoke-static {p0, v0, p3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5956
    invoke-static {p3, p1, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    if-ge p1, v1, :cond_2

    add-int/lit8 p2, p1, 0x1

    sub-int/2addr v1, p1

    .line 5958
    invoke-static {p0, p1, p3, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    return-object p3

    .line 5952
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Index: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Length: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static add([BB)[B
    .locals 1

    .line 5417
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    .line 5418
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-byte p1, p0, v0

    return-object p0
.end method

.method public static add([BIB)[B
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5752
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static add([CC)[C
    .locals 1

    .line 5444
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    .line 5445
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-char p1, p0, v0

    return-object p0
.end method

.method public static add([CIC)[C
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5717
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    return-object p0
.end method

.method public static add([DD)[D
    .locals 1

    .line 5471
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    .line 5472
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-wide p1, p0, v0

    return-object p0
.end method

.method public static add([DID)[D
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5927
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    sget-object p3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    return-object p0
.end method

.method public static add([FF)[F
    .locals 1

    .line 5498
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    .line 5499
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput p1, p0, v0

    return-object p0
.end method

.method public static add([FIF)[F
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5892
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    return-object p0
.end method

.method public static add([II)[I
    .locals 1

    .line 5525
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    .line 5526
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput p1, p0, v0

    return-object p0
.end method

.method public static add([III)[I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5822
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0
.end method

.method public static add([JIJ)[J
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5857
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    sget-object p3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0
.end method

.method public static add([JJ)[J
    .locals 1

    .line 5552
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    .line 5553
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-wide p1, p0, v0

    return-object p0
.end method

.method public static add([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;ITT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p0, :cond_0

    .line 5639
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 5641
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 5646
    :goto_0
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0

    .line 5643
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Array and element cannot both be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static add([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 5355
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 5357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 5363
    :goto_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    .line 5364
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-object p1, p0, v0

    return-object p0

    .line 5359
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Arguments cannot both be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static add([SIS)[S
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5787
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    return-object p0
.end method

.method public static add([SS)[S
    .locals 1

    .line 5579
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    .line 5580
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-short p1, p0, v0

    return-object p0
.end method

.method public static add([ZIZ)[Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5681
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    return-object p0
.end method

.method public static add([ZZ)[Z
    .locals 1

    .line 5390
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    .line 5391
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aput-boolean p1, p0, v0

    return-object p0
.end method

.method public static varargs addAll([B[B)[B
    .locals 3

    if-nez p0, :cond_0

    .line 5168
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5170
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0

    .line 5172
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 5173
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5174
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([C[C)[C
    .locals 3

    if-nez p0, :cond_0

    .line 5139
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5141
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0

    .line 5143
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [C

    .line 5144
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5145
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([D[D)[D
    .locals 3

    if-nez p0, :cond_0

    .line 5313
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5315
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0

    .line 5317
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [D

    .line 5318
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5319
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([F[F)[F
    .locals 3

    if-nez p0, :cond_0

    .line 5284
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5286
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0

    .line 5288
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [F

    .line 5289
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5290
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([I[I)[I
    .locals 3

    if-nez p0, :cond_0

    .line 5226
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5228
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0

    .line 5230
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [I

    .line 5231
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5232
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([J[J)[J
    .locals 3

    if-nez p0, :cond_0

    .line 5255
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5257
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0

    .line 5259
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [J

    .line 5260
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5261
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[TT;)[TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 5064
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5066
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 5068
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .line 5070
    array-length v1, p0

    array-length v2, p1

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    .line 5071
    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5073
    :try_start_0
    array-length p0, p0

    array-length v2, p1

    invoke-static {p1, v3, v1, p0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    .line 5081
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    .line 5082
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 5083
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot store "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in an array of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5084
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 5086
    :cond_2
    throw p0
.end method

.method public static varargs addAll([S[S)[S
    .locals 3

    if-nez p0, :cond_0

    .line 5197
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5199
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0

    .line 5201
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [S

    .line 5202
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5203
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static varargs addAll([Z[Z)[Z
    .locals 3

    if-nez p0, :cond_0

    .line 5110
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 5112
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0

    .line 5114
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [Z

    .line 5115
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5116
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static clone([B)[B
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 408
    :cond_0
    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static clone([C)[C
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 392
    :cond_0
    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    return-object p0
.end method

.method public static clone([D)[D
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 424
    :cond_0
    invoke-virtual {p0}, [D->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    return-object p0
.end method

.method public static clone([F)[F
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 440
    :cond_0
    invoke-virtual {p0}, [F->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    return-object p0
.end method

.method public static clone([I)[I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 360
    :cond_0
    invoke-virtual {p0}, [I->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0
.end method

.method public static clone([J)[J
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 344
    :cond_0
    invoke-virtual {p0}, [J->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0
.end method

.method public static clone([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 328
    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method

.method public static clone([S)[S
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 376
    :cond_0
    invoke-virtual {p0}, [S->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    return-object p0
.end method

.method public static clone([Z)[Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 456
    :cond_0
    invoke-virtual {p0}, [Z->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    return-object p0
.end method

.method public static contains([BB)Z
    .locals 0

    .line 3822
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BB)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([CC)Z
    .locals 0

    .line 3719
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CC)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([DD)Z
    .locals 0

    .line 4029
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DD)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([DDD)Z
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .line 4046
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDID)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([FF)Z
    .locals 0

    .line 4149
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FF)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([II)Z
    .locals 0

    .line 3508
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([II)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([JJ)Z
    .locals 0

    .line 3405
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJ)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 3302
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([SS)Z
    .locals 0

    .line 3611
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SS)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([ZZ)Z
    .locals 0

    .line 4254
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZ)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 5595
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p1

    .line 5596
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v1, p1, 0x1

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    .line 5597
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    const/4 p0, 0x1

    .line 5600
    invoke-static {p1, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getLength(Ljava/lang/Object;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1387
    :cond_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static hashCode(Ljava/lang/Object;)I
    .locals 1

    .line 192
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>()V

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result p0

    return p0
.end method

.method public static indexOf([BB)I
    .locals 1

    const/4 v0, 0x0

    .line 3735
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BBI)I

    move-result p0

    return p0
.end method

.method public static indexOf([BBI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 3759
    :cond_1
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_3

    .line 3760
    aget-byte v1, p0, p2

    if-ne p1, v1, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static indexOf([CC)I
    .locals 1

    const/4 v0, 0x0

    .line 3628
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CCI)I

    move-result p0

    return p0
.end method

.method public static indexOf([CCI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 3653
    :cond_1
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_3

    .line 3654
    aget-char v1, p0, p2

    if-ne p1, v1, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static indexOf([DD)I
    .locals 1

    const/4 v0, 0x0

    .line 3838
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDI)I

    move-result p0

    return p0
.end method

.method public static indexOf([DDD)I
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .line 3855
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDID)I

    move-result p0

    return p0
.end method

.method public static indexOf([DDI)I
    .locals 4

    .line 3873
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p3, :cond_1

    const/4 p3, 0x0

    .line 3879
    :cond_1
    :goto_0
    array-length v0, p0

    if-ge p3, v0, :cond_3

    .line 3880
    aget-wide v2, p0, p3

    cmpl-double v0, p1, v2

    if-nez v0, :cond_2

    return p3

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static indexOf([DDID)I
    .locals 4

    .line 3905
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p3, :cond_1

    const/4 p3, 0x0

    :cond_1
    sub-double v2, p1, p4

    add-double/2addr p1, p4

    .line 3913
    :goto_0
    array-length p4, p0

    if-ge p3, p4, :cond_3

    .line 3914
    aget-wide p4, p0, p3

    cmpl-double v0, p4, v2

    if-ltz v0, :cond_2

    aget-wide p4, p0, p3

    cmpg-double v0, p4, p1

    if-gtz v0, :cond_2

    return p3

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static indexOf([FF)I
    .locals 1

    const/4 v0, 0x0

    .line 4062
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FFI)I

    move-result p0

    return p0
.end method

.method public static indexOf([FFI)I
    .locals 2

    .line 4080
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 4086
    :cond_1
    :goto_0
    array-length v0, p0

    if-ge p2, v0, :cond_3

    .line 4087
    aget v0, p0, p2

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static indexOf([II)I
    .locals 1

    const/4 v0, 0x0

    .line 3421
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([III)I

    move-result p0

    return p0
.end method

.method public static indexOf([III)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 3445
    :cond_1
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_3

    .line 3446
    aget v1, p0, p2

    if-ne p1, v1, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static indexOf([JJ)I
    .locals 1

    const/4 v0, 0x0

    .line 3318
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJI)I

    move-result p0

    return p0
.end method

.method public static indexOf([JJI)I
    .locals 4

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p3, :cond_1

    const/4 p3, 0x0

    .line 3342
    :cond_1
    :goto_0
    array-length v1, p0

    if-ge p3, v1, :cond_3

    .line 3343
    aget-wide v1, p0, p3

    cmp-long v3, p1, v1

    if-nez v3, :cond_2

    return p3

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const/4 v0, 0x0

    .line 3199
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result p0

    return p0
.end method

.method public static indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    :cond_1
    if-nez p1, :cond_3

    .line 3224
    :goto_0
    array-length p1, p0

    if-ge p2, p1, :cond_5

    .line 3225
    aget-object p1, p0, p2

    if-nez p1, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 3230
    :cond_3
    :goto_1
    array-length v1, p0

    if-ge p2, v1, :cond_5

    .line 3231
    aget-object v1, p0, p2

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return p2

    :cond_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    return v0
.end method

.method public static indexOf([SS)I
    .locals 1

    const/4 v0, 0x0

    .line 3524
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SSI)I

    move-result p0

    return p0
.end method

.method public static indexOf([SSI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 3548
    :cond_1
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_3

    .line 3549
    aget-short v1, p0, p2

    if-ne p1, v1, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static indexOf([ZZ)I
    .locals 1

    const/4 v0, 0x0

    .line 4165
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZI)I

    move-result p0

    return p0
.end method

.method public static indexOf([ZZI)I
    .locals 2

    .line 4184
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p2, :cond_1

    const/4 p2, 0x0

    .line 4190
    :cond_1
    :goto_0
    array-length v0, p0

    if-ge p2, v0, :cond_3

    .line 4191
    aget-boolean v0, p0, p2

    if-ne p1, v0, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static varargs insert(I[B[B)[B
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8125
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8128
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8132
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 8134
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8136
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8138
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8139
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8129
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8126
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[C[C)[C
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8167
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8170
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8174
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [C

    .line 8176
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8178
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8180
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8181
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8171
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8168
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[D[D)[D
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8209
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8212
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8216
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [D

    .line 8218
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8220
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8222
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8223
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8213
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8210
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[F[F)[F
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8251
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8254
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8258
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [F

    .line 8260
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8262
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8264
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8265
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8255
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8252
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[I[I)[I
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8293
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8296
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8300
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [I

    .line 8302
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8304
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8306
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8307
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8297
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8294
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[J[J)[J
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8335
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8338
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8342
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [J

    .line 8344
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8346
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8348
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8349
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8339
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8336
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I[TT;[TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8429
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8432
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8436
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .line 8439
    array-length v1, p1

    array-length v2, p2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 8441
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8443
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8445
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8446
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8433
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8430
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[S[S)[S
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8377
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8380
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8384
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [S

    .line 8386
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8388
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8390
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8391
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8381
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8378
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0
.end method

.method public static varargs insert(I[Z[Z)[Z
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_5

    .line 8083
    array-length v0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-ltz p0, :cond_4

    .line 8086
    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 8090
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [Z

    .line 8092
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez p0, :cond_2

    .line 8094
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8096
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 8097
    array-length p2, p2

    add-int/2addr p2, p0

    array-length v1, p1

    sub-int/2addr v1, p0

    invoke-static {p1, p0, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-object v0

    .line 8087
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", Length: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p0, p1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8084
    :cond_5
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0
.end method

.method public static isArrayIndexValid([Ljava/lang/Object;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)Z"
        }
    .end annotation

    .line 8685
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    array-length p0, p0

    if-gt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method public static isEmpty([B)Z
    .locals 0

    .line 4901
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([C)Z
    .locals 0

    .line 4890
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([D)Z
    .locals 0

    .line 4912
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([F)Z
    .locals 0

    .line 4923
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([I)Z
    .locals 0

    .line 4868
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([J)Z
    .locals 0

    .line 4857
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([Ljava/lang/Object;)Z
    .locals 0

    .line 4846
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([S)Z
    .locals 0

    .line 4879
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEmpty([Z)Z
    .locals 0

    .line 4934
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isEquals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 209
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p0

    return p0
.end method

.method public static isNotEmpty([B)Z
    .locals 0

    .line 5002
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([C)Z
    .locals 0

    .line 4991
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([D)Z
    .locals 0

    .line 5013
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([F)Z
    .locals 0

    .line 5024
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([I)Z
    .locals 0

    .line 4969
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([J)Z
    .locals 0

    .line 4958
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)Z"
        }
    .end annotation

    .line 4947
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([S)Z
    .locals 0

    .line 4980
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isNotEmpty([Z)Z
    .locals 0

    .line 5035
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static isSameLength([B[B)Z
    .locals 0

    .line 1320
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([C[C)Z
    .locals 0

    .line 1307
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([D[D)Z
    .locals 0

    .line 1333
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([F[F)Z
    .locals 0

    .line 1346
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([I[I)Z
    .locals 0

    .line 1281
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([J[J)Z
    .locals 0

    .line 1268
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([Ljava/lang/Object;[Ljava/lang/Object;)Z
    .locals 0

    .line 1255
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([S[S)Z
    .locals 0

    .line 1294
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameLength([Z[Z)Z
    .locals 0

    .line 1359
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isSameType(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 1403
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    .line 1401
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The Array must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static isSorted([B)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7650
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7654
    aget-byte v2, p0, v1

    .line 7655
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7657
    aget-byte v5, p0, v2

    .line 7658
    invoke-static {v4, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(BB)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([C)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7675
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7679
    aget-char v2, p0, v1

    .line 7680
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7682
    aget-char v5, p0, v2

    .line 7683
    invoke-static {v4, v5}, Lorg/apache/commons/lang3/CharUtils;->compare(CC)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([D)Z
    .locals 9

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7600
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7604
    aget-wide v2, p0, v1

    .line 7605
    array-length v4, p0

    move-wide v5, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v4, :cond_2

    .line 7607
    aget-wide v7, p0, v2

    .line 7608
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-lez v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-wide v5, v7

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([F)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7625
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7629
    aget v2, p0, v1

    .line 7630
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7632
    aget v5, p0, v2

    .line 7633
    invoke-static {v4, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([I)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7525
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7529
    aget v2, p0, v1

    .line 7530
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7532
    aget v5, p0, v2

    .line 7533
    invoke-static {v4, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(II)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([J)Z
    .locals 9

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7550
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7554
    aget-wide v2, p0, v1

    .line 7555
    array-length v4, p0

    move-wide v5, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v4, :cond_2

    .line 7557
    aget-wide v7, p0, v2

    .line 7558
    invoke-static {v5, v6, v7, v8}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(JJ)I

    move-result v3

    if-lez v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-wide v5, v7

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([Ljava/lang/Comparable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>([TT;)Z"
        }
    .end annotation

    .line 7477
    new-instance v0, Lorg/apache/commons/lang3/ArrayUtils$1;

    invoke-direct {v0}, Lorg/apache/commons/lang3/ArrayUtils$1;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->isSorted([Ljava/lang/Object;Ljava/util/Comparator;)Z

    move-result p0

    return p0
.end method

.method public static isSorted([Ljava/lang/Object;Ljava/util/Comparator;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/Comparator<",
            "TT;>;)Z"
        }
    .end annotation

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7500
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7504
    aget-object v2, p0, v1

    .line 7505
    array-length v3, p0

    move-object v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7507
    aget-object v5, p0, v2

    .line 7508
    invoke-interface {p1, v4, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-object v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0

    .line 7497
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Comparator should not be null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static isSorted([S)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7575
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7579
    aget-short v2, p0, v1

    .line 7580
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7582
    aget-short v5, p0, v2

    .line 7583
    invoke-static {v4, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(SS)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static isSorted([Z)Z
    .locals 6

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    .line 7701
    array-length v1, p0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 7705
    aget-boolean v2, p0, v1

    .line 7706
    array-length v3, p0

    move v4, v2

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v3, :cond_2

    .line 7708
    aget-boolean v5, p0, v2

    .line 7709
    invoke-static {v4, v5}, Lorg/apache/commons/lang3/BooleanUtils;->compare(ZZ)I

    move-result v4

    if-lez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_1
    return v0
.end method

.method public static lastIndexOf([BB)I
    .locals 1

    const v0, 0x7fffffff

    .line 3778
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([BBI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([BBI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    return v0

    .line 3801
    :cond_1
    array-length v1, p0

    if-lt p2, v1, :cond_2

    .line 3802
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 3805
    aget-byte v1, p0, p2

    if-ne p1, v1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static lastIndexOf([CC)I
    .locals 1

    const v0, 0x7fffffff

    .line 3673
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([CCI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([CCI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    return v0

    .line 3697
    :cond_1
    array-length v1, p0

    if-lt p2, v1, :cond_2

    .line 3698
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 3701
    aget-char v1, p0, p2

    if-ne p1, v1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static lastIndexOf([DD)I
    .locals 1

    const v0, 0x7fffffff

    .line 3932
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([DDI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([DDD)I
    .locals 6

    const v3, 0x7fffffff

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .line 3949
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([DDID)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([DDI)I
    .locals 4

    .line 3967
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p3, :cond_1

    return v1

    .line 3972
    :cond_1
    array-length v0, p0

    if-lt p3, v0, :cond_2

    .line 3973
    array-length p3, p0

    add-int/lit8 p3, p3, -0x1

    :cond_2
    :goto_0
    if-ltz p3, :cond_4

    .line 3976
    aget-wide v2, p0, p3

    cmpl-double v0, p1, v2

    if-nez v0, :cond_3

    return p3

    :cond_3
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static lastIndexOf([DDID)I
    .locals 4

    .line 4001
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p3, :cond_1

    return v1

    .line 4006
    :cond_1
    array-length v0, p0

    if-lt p3, v0, :cond_2

    .line 4007
    array-length p3, p0

    add-int/lit8 p3, p3, -0x1

    :cond_2
    sub-double v2, p1, p4

    add-double/2addr p1, p4

    :goto_0
    if-ltz p3, :cond_4

    .line 4012
    aget-wide p4, p0, p3

    cmpl-double v0, p4, v2

    if-ltz v0, :cond_3

    aget-wide p4, p0, p3

    cmpg-double v0, p4, p1

    if-gtz v0, :cond_3

    return p3

    :cond_3
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static lastIndexOf([FF)I
    .locals 1

    const v0, 0x7fffffff

    .line 4105
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([FFI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([FFI)I
    .locals 2

    .line 4123
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p2, :cond_1

    return v1

    .line 4128
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 4129
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 4132
    aget v0, p0, p2

    cmpl-float v0, p1, v0

    if-nez v0, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static lastIndexOf([II)I
    .locals 1

    const v0, 0x7fffffff

    .line 3464
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([III)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([III)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    return v0

    .line 3487
    :cond_1
    array-length v1, p0

    if-lt p2, v1, :cond_2

    .line 3488
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 3491
    aget v1, p0, p2

    if-ne p1, v1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static lastIndexOf([JJ)I
    .locals 1

    const v0, 0x7fffffff

    .line 3361
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([JJI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([JJI)I
    .locals 4

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p3, :cond_1

    return v0

    .line 3384
    :cond_1
    array-length v1, p0

    if-lt p3, v1, :cond_2

    .line 3385
    array-length p3, p0

    add-int/lit8 p3, p3, -0x1

    :cond_2
    :goto_0
    if-ltz p3, :cond_4

    .line 3388
    aget-wide v1, p0, p3

    cmp-long v3, p1, v1

    if-nez v3, :cond_3

    return p3

    :cond_3
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const v0, 0x7fffffff

    .line 3250
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    return v0

    .line 3273
    :cond_1
    array-length v1, p0

    if-lt p2, v1, :cond_2

    .line 3274
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    if-nez p1, :cond_4

    :goto_0
    if-ltz p2, :cond_6

    .line 3278
    aget-object p1, p0, p2

    if-nez p1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 3282
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_1
    if-ltz p2, :cond_6

    .line 3284
    aget-object v1, p0, p2

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return p2

    :cond_5
    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_6
    return v0
.end method

.method public static lastIndexOf([SS)I
    .locals 1

    const v0, 0x7fffffff

    .line 3567
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([SSI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([SSI)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-gez p2, :cond_1

    return v0

    .line 3590
    :cond_1
    array-length v1, p0

    if-lt p2, v1, :cond_2

    .line 3591
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 3594
    aget-short v1, p0, p2

    if-ne p1, v1, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static lastIndexOf([ZZ)I
    .locals 1

    const v0, 0x7fffffff

    .line 4210
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([ZZI)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([ZZI)I
    .locals 2

    .line 4228
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-gez p2, :cond_1

    return v1

    .line 4233
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 4234
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    :cond_2
    :goto_0
    if-ltz p2, :cond_4

    .line 4237
    aget-boolean v0, p0, p2

    if-ne p1, v0, :cond_3

    return p2

    :cond_3
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_4
    return v1
.end method

.method public static nullToEmpty([B)[B
    .locals 1

    .line 640
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 641
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([C)[C
    .locals 1

    .line 620
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 621
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([D)[D
    .locals 1

    .line 660
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 661
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([F)[F
    .locals 1

    .line 680
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 681
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([I)[I
    .locals 1

    .line 580
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 581
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([J)[J
    .locals 1

    .line 560
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 561
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Boolean;)[Ljava/lang/Boolean;
    .locals 1

    .line 860
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 861
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Byte;)[Ljava/lang/Byte;
    .locals 1

    .line 800
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 801
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Character;)[Ljava/lang/Character;
    .locals 1

    .line 780
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 781
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Class;)[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 520
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 521
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CLASS_ARRAY:[Ljava/lang/Class;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Double;)[Ljava/lang/Double;
    .locals 1

    .line 820
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 821
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Float;)[Ljava/lang/Float;
    .locals 1

    .line 840
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 841
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Integer;)[Ljava/lang/Integer;
    .locals 1

    .line 740
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 741
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Long;)[Ljava/lang/Long;
    .locals 1

    .line 720
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 721
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 500
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 501
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/Class<",
            "[TT;>;)[TT;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    .line 480
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0

    :cond_0
    return-object p0

    .line 476
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The type must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static nullToEmpty([Ljava/lang/Short;)[Ljava/lang/Short;
    .locals 1

    .line 760
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 761
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .line 540
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 541
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([S)[S
    .locals 1

    .line 600
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 601
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object p0

    :cond_0
    return-object p0
.end method

.method public static nullToEmpty([Z)[Z
    .locals 1

    .line 700
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object p0

    :cond_0
    return-object p0
.end method

.method private static remove(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4

    .line 6573
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-ltz p1, :cond_1

    if-ge p1, v0, :cond_1

    .line 6578
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    .line 6579
    invoke-static {p0, v3, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ge p1, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    .line 6581
    invoke-static {p0, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return-object v1

    .line 6575
    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Length: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static remove([BI)[B
    .locals 0

    .line 6125
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static remove([CI)[C
    .locals 0

    .line 6190
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    return-object p0
.end method

.method public static remove([DI)[D
    .locals 0

    .line 6255
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    return-object p0
.end method

.method public static remove([FI)[F
    .locals 0

    .line 6320
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    return-object p0
.end method

.method public static remove([II)[I
    .locals 0

    .line 6385
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0
.end method

.method public static remove([JI)[J
    .locals 0

    .line 6450
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0
.end method

.method public static remove([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)[TT;"
        }
    .end annotation

    .line 5994
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method

.method public static remove([SI)[S
    .locals 0

    .line 6515
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    return-object p0
.end method

.method public static remove([ZI)[Z
    .locals 0

    .line 6060
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    return-object p0
.end method

.method static removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;
    .locals 6

    .line 7439
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 7446
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    .line 7447
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    sub-int v1, v0, v1

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 7452
    :goto_0
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    sub-int v5, v4, v2

    if-lez v5, :cond_0

    .line 7455
    invoke-static {p0, v2, v1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v5

    .line 7458
    :cond_0
    invoke-virtual {p1, v4}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v2

    goto :goto_0

    :cond_1
    sub-int/2addr v0, v2

    if-lez v0, :cond_2

    .line 7462
    invoke-static {p0, v2, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    return-object v1
.end method

.method static varargs removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;
    .locals 8

    .line 7385
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 7387
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p1

    .line 7388
    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    .line 7391
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isNotEmpty([I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 7392
    array-length v1, p1

    move v4, v0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    .line 7395
    aget v5, p1, v1

    if-ltz v5, :cond_1

    if-ge v5, v0, :cond_1

    if-lt v5, v4, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    .line 7397
    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Length: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v3, 0x0

    .line 7408
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    sub-int v4, v0, v3

    invoke-static {v1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    if-ge v3, v0, :cond_6

    .line 7412
    array-length v3, p1

    const/4 v5, 0x1

    sub-int/2addr v3, v5

    :goto_1
    if-ltz v3, :cond_5

    .line 7413
    aget v6, p1, v3

    sub-int/2addr v0, v6

    if-le v0, v5, :cond_4

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v4, v0

    add-int/lit8 v7, v6, 0x1

    .line 7417
    invoke-static {p0, v7, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    add-int/lit8 v3, v3, -0x1

    move v0, v6

    goto :goto_1

    :cond_5
    if-lez v0, :cond_6

    .line 7423
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    return-object v1
.end method

.method public static varargs removeAll([B[I)[B
    .locals 0

    .line 6706
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static varargs removeAll([C[I)[C
    .locals 0

    .line 6970
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    return-object p0
.end method

.method public static varargs removeAll([D[I)[D
    .locals 0

    .line 7234
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    return-object p0
.end method

.method public static varargs removeAll([F[I)[F
    .locals 0

    .line 7146
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    return-object p0
.end method

.method public static varargs removeAll([I[I)[I
    .locals 0

    .line 6882
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0
.end method

.method public static varargs removeAll([J[I)[J
    .locals 0

    .line 7058
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0
.end method

.method public static varargs removeAll([Ljava/lang/Object;[I)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[I)[TT;"
        }
    .end annotation

    .line 6615
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method

.method public static varargs removeAll([S[I)[S
    .locals 0

    .line 6794
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    return-object p0
.end method

.method public static varargs removeAll([Z[I)[Z
    .locals 0

    .line 7318
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    return-object p0
.end method

.method public static removeAllOccurences([BB)[B
    .locals 6

    .line 7798
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BB)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7800
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0

    .line 7803
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7804
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7807
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BBI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7808
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7811
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([B[I)[B

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([CC)[C
    .locals 6

    .line 7766
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CC)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7768
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0

    .line 7771
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7772
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7775
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CCI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7776
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7779
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([C[I)[C

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([DD)[D
    .locals 6

    .line 7958
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DD)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7960
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0

    .line 7963
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7964
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7967
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, p2, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7968
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7971
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([D[I)[D

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([FF)[F
    .locals 6

    .line 7926
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FF)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7928
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0

    .line 7931
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7932
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7935
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FFI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7936
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7939
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([F[I)[F

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([II)[I
    .locals 6

    .line 7862
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7864
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0

    .line 7867
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7868
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7871
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([III)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7872
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7875
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([I[I)[I

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([JJ)[J
    .locals 6

    .line 7894
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJ)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7896
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0

    .line 7899
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7900
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7903
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, p2, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7904
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7907
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([J[I)[J

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .line 7991
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7993
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 7996
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7997
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 8000
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 8001
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 8004
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([Ljava/lang/Object;[I)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([SS)[S
    .locals 6

    .line 7830
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SS)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7832
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0

    .line 7835
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7836
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7839
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SSI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7840
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7843
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([S[I)[S

    move-result-object p0

    return-object p0
.end method

.method public static removeAllOccurences([ZZ)[Z
    .locals 6

    .line 7734
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZ)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7736
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0

    .line 7739
    :cond_0
    array-length v2, p0

    sub-int/2addr v2, v0

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 7740
    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x1

    :goto_0
    add-int/lit8 v4, v3, -0x1

    .line 7743
    aget v4, v2, v4

    add-int/2addr v4, v0

    invoke-static {p0, p1, v4}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZI)I

    move-result v4

    if-eq v4, v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 7744
    aput v4, v2, v3

    move v3, v5

    goto :goto_0

    .line 7747
    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll([Z[I)[Z

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([BB)[B
    .locals 1

    .line 6154
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BB)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6156
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0

    .line 6158
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([CC)[C
    .locals 1

    .line 6219
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CC)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6221
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0

    .line 6223
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([CI)[C

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([DD)[D
    .locals 0

    .line 6284
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DD)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 6286
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0

    .line 6288
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([DI)[D

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([FF)[F
    .locals 1

    .line 6349
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FF)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6351
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0

    .line 6353
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([FI)[F

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([II)[I
    .locals 1

    .line 6414
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([II)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6416
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0

    .line 6418
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([II)[I

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([JJ)[J
    .locals 0

    .line 6479
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 6481
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0

    .line 6483
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([JI)[J

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/Object;",
            ")[TT;"
        }
    .end annotation

    .line 6024
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6026
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 6028
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([SS)[S
    .locals 1

    .line 6544
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SS)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6546
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0

    .line 6548
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([SI)[S

    move-result-object p0

    return-object p0
.end method

.method public static removeElement([ZZ)[Z
    .locals 1

    .line 6089
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZ)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 6091
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0

    .line 6093
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove([ZI)[Z

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([B[B)[B
    .locals 7

    .line 6737
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6740
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6741
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-byte v4, p1, v3

    .line 6742
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    .line 6743
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 6745
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6747
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6750
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 6751
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 6752
    aget-byte v1, p0, v2

    .line 6753
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 6755
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 6756
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6758
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6761
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0

    .line 6738
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([C[C)[C
    .locals 7

    .line 7001
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 7004
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7005
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-char v4, p1, v3

    .line 7006
    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    .line 7007
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 7009
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7011
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7014
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 7015
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 7016
    aget-char v1, p0, v2

    .line 7017
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 7019
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 7020
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7022
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 7025
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    return-object p0

    .line 7002
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([D[D)[D
    .locals 7

    .line 7265
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 7268
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7269
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-wide v4, p1, v3

    .line 7270
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    .line 7271
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 7273
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7275
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7278
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 7279
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 7280
    aget-wide v3, p0, v2

    .line 7281
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v1, :cond_4

    .line 7283
    invoke-virtual {v1}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_3

    .line 7284
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7286
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 7289
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    return-object p0

    .line 7266
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([F[F)[F
    .locals 7

    .line 7177
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 7180
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7181
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget v4, p1, v3

    .line 7182
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 7183
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 7185
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7187
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7190
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 7191
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 7192
    aget v1, p0, v2

    .line 7193
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 7195
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 7196
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7198
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 7201
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [F

    return-object p0

    .line 7178
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([I[I)[I
    .locals 7

    .line 6913
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6916
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6917
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget v4, p1, v3

    .line 6918
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 6919
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 6921
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6923
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6926
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 6927
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 6928
    aget v1, p0, v2

    .line 6929
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 6931
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 6932
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6934
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6937
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0

    .line 6914
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([J[J)[J
    .locals 7

    .line 7089
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 7092
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7093
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-wide v4, p1, v3

    .line 7094
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 7095
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 7097
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7099
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7102
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 7103
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 7104
    aget-wide v3, p0, v2

    .line 7105
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v1, :cond_4

    .line 7107
    invoke-virtual {v1}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_3

    .line 7108
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7110
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 7113
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    return-object p0

    .line 7090
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 6648
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6651
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6652
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p1, v3

    .line 6653
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 6655
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6657
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6660
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 6661
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 6662
    aget-object v1, p0, v2

    .line 6663
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 6665
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 6666
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6668
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6672
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0

    .line 6649
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([S[S)[S
    .locals 7

    .line 6825
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6828
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6829
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-short v4, p1, v3

    .line 6830
    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    .line 6831
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 6833
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6835
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6838
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 6839
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 6840
    aget-short v1, p0, v2

    .line 6841
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 6843
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 6844
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6846
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6849
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [S

    return-object p0

    .line 6826
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object p0

    return-object p0
.end method

.method public static varargs removeElements([Z[Z)[Z
    .locals 7

    .line 7349
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 7352
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7353
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-boolean v4, p1, v3

    .line 7354
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 7355
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-nez v5, :cond_1

    .line 7357
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 7359
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 7362
    :cond_2
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    .line 7363
    :goto_2
    array-length v1, p0

    if-ge v2, v1, :cond_5

    .line 7364
    aget-boolean v1, p0, v2

    .line 7365
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/commons/lang3/mutable/MutableInt;

    if-eqz v3, :cond_4

    .line 7367
    invoke-virtual {v3}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v3

    if-nez v3, :cond_3

    .line 7368
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7370
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 7373
    :cond_5
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    return-object p0

    .line 7350
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object p0

    return-object p0
.end method

.method public static reverse([B)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1491
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([BII)V

    return-void
.end method

.method public static reverse([BII)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1591
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1594
    aget-byte v0, p0, p2

    .line 1595
    aget-byte v1, p0, p1

    aput-byte v1, p0, p2

    .line 1596
    aput-byte v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([C)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1477
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([CII)V

    return-void
.end method

.method public static reverse([CII)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1624
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1627
    aget-char v0, p0, p2

    .line 1628
    aget-char v1, p0, p1

    aput-char v1, p0, p2

    .line 1629
    aput-char v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([D)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1505
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([DII)V

    return-void
.end method

.method public static reverse([DII)V
    .locals 4

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1657
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1660
    aget-wide v0, p0, p2

    .line 1661
    aget-wide v2, p0, p1

    aput-wide v2, p0, p2

    .line 1662
    aput-wide v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([F)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1519
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([FII)V

    return-void
.end method

.method public static reverse([FII)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1690
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1693
    aget v0, p0, p2

    .line 1694
    aget v1, p0, p1

    aput v1, p0, p2

    .line 1695
    aput v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1449
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([III)V

    return-void
.end method

.method public static reverse([III)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1723
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1726
    aget v0, p0, p2

    .line 1727
    aget v1, p0, p1

    aput v1, p0, p2

    .line 1728
    aput v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([J)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1435
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([JII)V

    return-void
.end method

.method public static reverse([JII)V
    .locals 4

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1756
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1759
    aget-wide v0, p0, p2

    .line 1760
    aget-wide v2, p0, p1

    aput-wide v2, p0, p2

    .line 1761
    aput-wide v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([Ljava/lang/Object;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1421
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([Ljava/lang/Object;II)V

    return-void
.end method

.method public static reverse([Ljava/lang/Object;II)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1789
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1792
    aget-object v0, p0, p2

    .line 1793
    aget-object v1, p0, p1

    aput-object v1, p0, p2

    .line 1794
    aput-object v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([S)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1463
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([SII)V

    return-void
.end method

.method public static reverse([SII)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1822
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1825
    aget-short v0, p0, p2

    .line 1826
    aget-short v1, p0, p1

    aput-short v1, p0, p2

    .line 1827
    aput-short v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static reverse([Z)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1533
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([ZII)V

    return-void
.end method

.method public static reverse([ZII)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1558
    :cond_1
    array-length v0, p0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-le p2, p1, :cond_2

    .line 1561
    aget-boolean v0, p0, p2

    .line 1562
    aget-boolean v1, p0, p1

    aput-boolean v1, p0, p2

    .line 1563
    aput-boolean v0, p0, p1

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static shift([BI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2583
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([BIII)V

    return-void
.end method

.method public static shift([BIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2726
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2732
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2733
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2739
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2749
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2753
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2757
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([CI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2564
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([CIII)V

    return-void
.end method

.method public static shift([CIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2786
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2792
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2793
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2799
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2809
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2813
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2817
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([DI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2602
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([DIII)V

    return-void
.end method

.method public static shift([DIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2846
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2852
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2853
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2859
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2869
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2873
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2877
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([FI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2621
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([FIII)V

    return-void
.end method

.method public static shift([FIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2906
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2912
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2913
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2919
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2929
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2933
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2937
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([II)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2526
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([IIII)V

    return-void
.end method

.method public static shift([IIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2966
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2972
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2973
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2979
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2989
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2993
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2997
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([JI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2507
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([JIII)V

    return-void
.end method

.method public static shift([JIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 3026
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 3032
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 3033
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 3039
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 3049
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 3053
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 3057
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([Ljava/lang/Object;I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2488
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([Ljava/lang/Object;III)V

    return-void
.end method

.method public static shift([Ljava/lang/Object;III)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 3086
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 3092
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 3093
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 3099
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 3109
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 3113
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 3117
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([SI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2545
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([SIII)V

    return-void
.end method

.method public static shift([SIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 3146
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 3152
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 3153
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 3159
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 3169
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 3173
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 3177
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shift([ZI)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2640
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([ZIII)V

    return-void
.end method

.method public static shift([ZIII)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 2666
    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_9

    if-gtz p2, :cond_1

    goto :goto_1

    :cond_1
    if-gez p1, :cond_2

    const/4 p1, 0x0

    .line 2672
    :cond_2
    array-length v0, p0

    if-lt p2, v0, :cond_3

    .line 2673
    array-length p2, p0

    :cond_3
    sub-int/2addr p2, p1

    if-gt p2, v1, :cond_4

    return-void

    .line 2679
    :cond_4
    rem-int/2addr p3, p2

    if-gez p3, :cond_5

    add-int/2addr p3, p2

    :cond_5
    :goto_0
    if-le p2, v1, :cond_8

    if-lez p3, :cond_8

    sub-int v0, p2, p3

    if-le p3, v0, :cond_6

    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    .line 2689
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    sub-int p2, p3, v0

    move v2, p3

    move p3, p2

    move p2, v2

    goto :goto_0

    :cond_6
    if-ge p3, v0, :cond_7

    add-int p2, p1, v0

    .line 2693
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    add-int/2addr p1, p3

    move p2, v0

    goto :goto_0

    :cond_7
    add-int/2addr v0, p1

    .line 2697
    invoke-static {p0, p1, v0, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    :cond_8
    return-void

    :cond_9
    :goto_1
    return-void
.end method

.method public static shuffle([B)V
    .locals 1

    .line 8509
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([BLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([BLjava/util/Random;)V
    .locals 4

    .line 8521
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8522
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([C)V
    .locals 1

    .line 8534
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([CLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([CLjava/util/Random;)V
    .locals 4

    .line 8546
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8547
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([D)V
    .locals 1

    .line 8659
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([DLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([DLjava/util/Random;)V
    .locals 4

    .line 8671
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8672
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([F)V
    .locals 1

    .line 8634
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([FLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([FLjava/util/Random;)V
    .locals 4

    .line 8646
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8647
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([I)V
    .locals 1

    .line 8584
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([ILjava/util/Random;)V

    return-void
.end method

.method public static shuffle([ILjava/util/Random;)V
    .locals 4

    .line 8596
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8597
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([J)V
    .locals 1

    .line 8609
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([JLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([JLjava/util/Random;)V
    .locals 4

    .line 8621
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8622
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([Ljava/lang/Object;)V
    .locals 1

    .line 8459
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([Ljava/lang/Object;Ljava/util/Random;)V

    return-void
.end method

.method public static shuffle([Ljava/lang/Object;Ljava/util/Random;)V
    .locals 4

    .line 8471
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8472
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([S)V
    .locals 1

    .line 8559
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([SLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([SLjava/util/Random;)V
    .locals 4

    .line 8571
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8572
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static shuffle([Z)V
    .locals 1

    .line 8484
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([ZLjava/util/Random;)V

    return-void
.end method

.method public static shuffle([ZLjava/util/Random;)V
    .locals 4

    .line 8496
    array-length v0, p0

    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v2, v0, -0x1

    .line 8497
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static subarray([BII)[B
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1108
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1109
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1113
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object p0

    .line 1116
    :cond_3
    new-array v1, p2, [B

    .line 1117
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([CII)[C
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1068
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1069
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1073
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object p0

    .line 1076
    :cond_3
    new-array v1, p2, [C

    .line 1077
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([DII)[D
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1148
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1149
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1153
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object p0

    .line 1156
    :cond_3
    new-array v1, p2, [D

    .line 1157
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([FII)[F
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1188
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1189
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1193
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object p0

    .line 1196
    :cond_3
    new-array v1, p2, [F

    .line 1197
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([III)[I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 988
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 989
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 993
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object p0

    .line 996
    :cond_3
    new-array v1, p2, [I

    .line 997
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([JII)[J
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 948
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 949
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 953
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object p0

    .line 956
    :cond_3
    new-array v1, p2, [J

    .line 957
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)[TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 904
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 905
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    .line 908
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    if-gtz p2, :cond_3

    .line 911
    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0

    .line 916
    :cond_3
    invoke-static {v1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    .line 917
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([SII)[S
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1028
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1029
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1033
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object p0

    .line 1036
    :cond_3
    new-array v1, p2, [S

    .line 1037
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static subarray([ZII)[Z
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    .line 1228
    :cond_1
    array-length v1, p0

    if-le p2, v1, :cond_2

    .line 1229
    array-length p2, p0

    :cond_2
    sub-int/2addr p2, p1

    if-gtz p2, :cond_3

    .line 1233
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object p0

    .line 1236
    :cond_3
    new-array v1, p2, [Z

    .line 1237
    invoke-static {p0, p1, v1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static swap([BII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1998
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2001
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([BIII)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2155
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2164
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2166
    aget-byte v1, p0, p1

    .line 2167
    aget-byte v2, p0, p2

    aput-byte v2, p0, p1

    .line 2168
    aput-byte v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([CII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1970
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1973
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([CIII)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2197
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2206
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2208
    aget-char v1, p0, p1

    .line 2209
    aget-char v2, p0, p2

    aput-char v2, p0, p1

    .line 2210
    aput-char v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([DII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 2026
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2029
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([DIII)V
    .locals 5

    if-eqz p0, :cond_4

    .line 2239
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2248
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2250
    aget-wide v1, p0, p1

    .line 2251
    aget-wide v3, p0, p2

    aput-wide v3, p0, p1

    .line 2252
    aput-wide v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([FII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 2054
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2057
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([FIII)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2281
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2290
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2292
    aget v1, p0, p1

    .line 2293
    aget v2, p0, p2

    aput v2, p0, p1

    .line 2294
    aput v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([III)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1914
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1917
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([IIII)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2324
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2333
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2335
    aget v1, p0, p1

    .line 2336
    aget v2, p0, p2

    aput v2, p0, p1

    .line 2337
    aput v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([JII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1886
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1889
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([JIII)V
    .locals 5

    if-eqz p0, :cond_4

    .line 2366
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2375
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2377
    aget-wide v1, p0, p1

    .line 2378
    aget-wide v3, p0, p2

    aput-wide v3, p0, p1

    .line 2379
    aput-wide v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([Ljava/lang/Object;II)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1857
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1860
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([Ljava/lang/Object;III)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2408
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2417
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2419
    aget-object v1, p0, p1

    .line 2420
    aget-object v2, p0, p2

    aput-object v2, p0, p1

    .line 2421
    aput-object v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([SII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 1942
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1945
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([SIII)V
    .locals 3

    if-eqz p0, :cond_5

    .line 2450
    array-length v0, p0

    if-eqz v0, :cond_5

    array-length v0, p0

    if-ge p1, v0, :cond_5

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    :cond_2
    if-ne p1, p2, :cond_3

    return-void

    .line 2462
    :cond_3
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_4

    .line 2464
    aget-short v1, p0, p1

    .line 2465
    aget-short v2, p0, p2

    aput-short v2, p0, p1

    .line 2466
    aput-short v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method public static swap([ZII)V
    .locals 1

    if-eqz p0, :cond_1

    .line 2082
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2085
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static swap([ZIII)V
    .locals 3

    if-eqz p0, :cond_4

    .line 2113
    array-length v0, p0

    if-eqz v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-gez p2, :cond_2

    const/4 p2, 0x0

    .line 2122
    :cond_2
    array-length v1, p0

    sub-int/2addr v1, p1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ge v0, p3, :cond_3

    .line 2124
    aget-boolean v1, p0, p1

    .line 2125
    aget-boolean v2, p0, p2

    aput-boolean v2, p0, p1

    .line 2126
    aput-boolean v1, p0, p2

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public static varargs toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    return-object p0
.end method

.method public static toMap([Ljava/lang/Object;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 243
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p0

    int-to-double v1, v1

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    mul-double v1, v1, v3

    double-to-int v1, v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 244
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_4

    .line 245
    aget-object v3, p0, v2

    .line 246
    instance-of v4, v3, Ljava/util/Map$Entry;

    if-eqz v4, :cond_1

    .line 247
    check-cast v3, Ljava/util/Map$Entry;

    .line 248
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 249
    :cond_1
    instance-of v4, v3, [Ljava/lang/Object;

    if-eqz v4, :cond_3

    .line 250
    move-object v4, v3

    check-cast v4, [Ljava/lang/Object;

    .line 251
    array-length v5, v4

    const/4 v6, 0x2

    if-lt v5, v6, :cond_2

    .line 256
    aget-object v3, v4, v1

    const/4 v5, 0x1

    aget-object v4, v4, v5

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 252
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Array element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', has a length less than 2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 258
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Array element "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', is neither of type Map.Entry nor an Array"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-object v0
.end method

.method public static toObject([Z)[Ljava/lang/Boolean;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4827
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4828
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    return-object p0

    .line 4830
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Boolean;

    const/4 v1, 0x0

    .line 4831
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4832
    aget-boolean v2, p0, v1

    if-eqz v2, :cond_2

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toObject([B)[Ljava/lang/Byte;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4590
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4591
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    return-object p0

    .line 4593
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Byte;

    const/4 v1, 0x0

    .line 4594
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4595
    aget-byte v2, p0, v1

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([C)[Ljava/lang/Character;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4318
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4319
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    return-object p0

    .line 4321
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Character;

    const/4 v1, 0x0

    .line 4322
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4323
    aget-char v2, p0, v1

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([D)[Ljava/lang/Double;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4658
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4659
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    return-object p0

    .line 4661
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Double;

    const/4 v1, 0x0

    .line 4662
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4663
    aget-wide v2, p0, v1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([F)[Ljava/lang/Float;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4726
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4727
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    return-object p0

    .line 4729
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Float;

    const/4 v1, 0x0

    .line 4730
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4731
    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([I)[Ljava/lang/Integer;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4454
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4455
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    return-object p0

    .line 4457
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    .line 4458
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4459
    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([J)[Ljava/lang/Long;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4386
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4387
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    return-object p0

    .line 4389
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Long;

    const/4 v1, 0x0

    .line 4390
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4391
    aget-wide v2, p0, v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toObject([S)[Ljava/lang/Short;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4522
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4523
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    return-object p0

    .line 4525
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Short;

    const/4 v1, 0x0

    .line 4526
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4527
    aget-short v2, p0, v1

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4749
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .line 4750
    invoke-static {v0}, Lorg/apache/commons/lang3/ClassUtils;->wrapperToPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 4751
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4752
    check-cast p0, [Ljava/lang/Integer;

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Integer;)[I

    move-result-object p0

    return-object p0

    .line 4754
    :cond_1
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4755
    check-cast p0, [Ljava/lang/Long;

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Long;)[J

    move-result-object p0

    return-object p0

    .line 4757
    :cond_2
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4758
    check-cast p0, [Ljava/lang/Short;

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Short;)[S

    move-result-object p0

    return-object p0

    .line 4760
    :cond_3
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4761
    check-cast p0, [Ljava/lang/Double;

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Double;)[D

    move-result-object p0

    return-object p0

    .line 4763
    :cond_4
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4764
    check-cast p0, [Ljava/lang/Float;

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Float;)[F

    move-result-object p0

    return-object p0

    :cond_5
    return-object p0
.end method

.method public static toPrimitive([Ljava/lang/Byte;)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4546
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4547
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object p0

    .line 4549
    :cond_1
    array-length v0, p0

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 4550
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4551
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Byte;B)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4568
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4569
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object p0

    .line 4571
    :cond_1
    array-length v0, p0

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 4572
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4573
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4574
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    :goto_1
    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Character;)[C
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4274
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4275
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object p0

    .line 4277
    :cond_1
    array-length v0, p0

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 4278
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4279
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Character;C)[C
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4296
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4297
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object p0

    .line 4299
    :cond_1
    array-length v0, p0

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 4300
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4301
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4302
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    :goto_1
    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Double;)[D
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4614
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4615
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object p0

    .line 4617
    :cond_1
    array-length v0, p0

    new-array v0, v0, [D

    const/4 v1, 0x0

    .line 4618
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4619
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Double;D)[D
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4636
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4637
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object p0

    .line 4639
    :cond_1
    array-length v0, p0

    new-array v0, v0, [D

    const/4 v1, 0x0

    .line 4640
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4641
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move-wide v2, p1

    goto :goto_1

    .line 4642
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_1
    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Float;)[F
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4682
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4683
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object p0

    .line 4685
    :cond_1
    array-length v0, p0

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 4686
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4687
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Float;F)[F
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4704
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4705
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object p0

    .line 4707
    :cond_1
    array-length v0, p0

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 4708
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4709
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4710
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_1
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Integer;)[I
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4410
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4411
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object p0

    .line 4413
    :cond_1
    array-length v0, p0

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 4414
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4415
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Integer;I)[I
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4432
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4433
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object p0

    .line 4435
    :cond_1
    array-length v0, p0

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 4436
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4437
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4438
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_1
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Long;)[J
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4342
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4343
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object p0

    .line 4345
    :cond_1
    array-length v0, p0

    new-array v0, v0, [J

    const/4 v1, 0x0

    .line 4346
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4347
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Long;J)[J
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4364
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4365
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object p0

    .line 4367
    :cond_1
    array-length v0, p0

    new-array v0, v0, [J

    const/4 v1, 0x0

    .line 4368
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4369
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move-wide v2, p1

    goto :goto_1

    .line 4370
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_1
    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Short;)[S
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4478
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4479
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object p0

    .line 4481
    :cond_1
    array-length v0, p0

    new-array v0, v0, [S

    const/4 v1, 0x0

    .line 4482
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4483
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    aput-short v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Short;S)[S
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4500
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4501
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object p0

    .line 4503
    :cond_1
    array-length v0, p0

    new-array v0, v0, [S

    const/4 v1, 0x0

    .line 4504
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4505
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4506
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    :goto_1
    aput-short v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Boolean;)[Z
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4783
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4784
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object p0

    .line 4786
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Z

    const/4 v1, 0x0

    .line 4787
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 4788
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    aput-boolean v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Boolean;Z)[Z
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 4805
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 4806
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object p0

    .line 4808
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Z

    const/4 v1, 0x0

    .line 4809
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 4810
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move v2, p1

    goto :goto_1

    .line 4811
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    aput-boolean v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "{}"

    .line 161
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    .line 180
    :cond_0
    new-instance p1, Lorg/apache/commons/lang3/builder/ToStringBuilder;

    sget-object v0, Lorg/apache/commons/lang3/builder/ToStringStyle;->SIMPLE_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;

    invoke-direct {p1, p0, v0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V

    invoke-virtual {p1, p0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/ToStringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toStringArray([Ljava/lang/Object;)[Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 8021
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 8022
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object p0

    .line 8025
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 8026
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 8027
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static toStringArray([Ljava/lang/Object;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 8047
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 8048
    sget-object p0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object p0

    .line 8051
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 8052
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 8053
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    move-object v2, p1

    goto :goto_1

    .line 8054
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method
