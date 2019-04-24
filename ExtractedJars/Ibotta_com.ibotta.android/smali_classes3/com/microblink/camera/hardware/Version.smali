.class public Lcom/microblink/camera/hardware/Version;
.super Ljava/lang/Object;


# instance fields
.field private mBugfix:I

.field private mMajor:I

.field private mMinor:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    iput v0, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    iput v0, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    invoke-direct {p0, p1}, Lcom/microblink/camera/hardware/Version;->initFromVersionString(Ljava/lang/String;)V

    return-void
.end method

.method private initFromVersionString(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_2

    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-eqz v1, :cond_1

    array-length p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x0

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    array-length p1, v0

    const/4 v1, 0x2

    if-lt p1, v1, :cond_0

    const/4 p1, 0x1

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    array-length p1, v0

    const/4 v2, 0x3

    if-lt p1, v2, :cond_0

    aget-object p1, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Invalid version string "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot parse null version string!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equalTo(Lcom/microblink/camera/hardware/Version;)Z
    .locals 5

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    iget v2, p1, Lcom/microblink/camera/hardware/Version;->mMajor:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    return v3

    :cond_1
    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_6

    iget v4, p1, Lcom/microblink/camera/hardware/Version;->mMinor:I

    if-ne v4, v2, :cond_2

    goto :goto_0

    :cond_2
    if-eq v1, v4, :cond_3

    return v3

    :cond_3
    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-eq v1, v2, :cond_6

    iget p1, p1, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-ne p1, v2, :cond_4

    goto :goto_0

    :cond_4
    if-ne v1, p1, :cond_5

    return v0

    :cond_5
    return v3

    :cond_6
    :goto_0
    return v0
.end method

.method public greaterOrEqualThan(Lcom/microblink/camera/hardware/Version;)Z
    .locals 5

    if-eqz p1, :cond_d

    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    iget v1, p1, Lcom/microblink/camera/hardware/Version;->mMajor:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    :cond_1
    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    iget p1, p1, Lcom/microblink/camera/hardware/Version;->mMinor:I

    if-eq p1, v1, :cond_3

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    :goto_0
    return v3

    :cond_4
    iget v4, p1, Lcom/microblink/camera/hardware/Version;->mMinor:I

    if-ne v4, v1, :cond_5

    return v3

    :cond_5
    if-ge v0, v4, :cond_6

    return v2

    :cond_6
    if-le v0, v4, :cond_7

    return v3

    :cond_7
    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-ne v0, v1, :cond_a

    iget p1, p1, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-eq p1, v1, :cond_9

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    return v2

    :cond_9
    :goto_1
    return v3

    :cond_a
    iget p1, p1, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-ne p1, v1, :cond_b

    return v3

    :cond_b
    if-lt v0, p1, :cond_c

    return v3

    :cond_c
    return v2

    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot compare with null version!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public greaterThan(Lcom/microblink/camera/hardware/Version;)Z
    .locals 5

    if-eqz p1, :cond_b

    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    iget v1, p1, Lcom/microblink/camera/hardware/Version;->mMajor:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    :cond_1
    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    iget v4, p1, Lcom/microblink/camera/hardware/Version;->mMinor:I

    if-ne v4, v1, :cond_4

    if-nez v0, :cond_3

    return v2

    :cond_3
    return v3

    :cond_4
    if-ge v0, v4, :cond_5

    return v2

    :cond_5
    if-le v0, v4, :cond_6

    return v3

    :cond_6
    iget v0, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-ne v0, v1, :cond_7

    return v2

    :cond_7
    iget p1, p1, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-ne p1, v1, :cond_9

    if-nez v0, :cond_8

    return v2

    :cond_8
    return v3

    :cond_9
    if-le v0, p1, :cond_a

    return v3

    :cond_a
    return v2

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot compare with null version!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mMajor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/microblink/camera/hardware/Version;->mMinor:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    if-eq v3, v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/camera/hardware/Version;->mBugfix:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
