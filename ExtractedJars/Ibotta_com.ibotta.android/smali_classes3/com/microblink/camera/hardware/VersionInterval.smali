.class public Lcom/microblink/camera/hardware/VersionInterval;
.super Ljava/lang/Object;


# instance fields
.field private mAllVersions:Z

.field private mEqualLowerBound:Z

.field private mEqualUpperBound:Z

.field private mLowerBound:Lcom/microblink/camera/hardware/Version;

.field private mUpperBound:Lcom/microblink/camera/hardware/Version;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/camera/hardware/VersionInterval;->mLowerBound:Lcom/microblink/camera/hardware/Version;

    iput-object v0, p0, Lcom/microblink/camera/hardware/VersionInterval;->mUpperBound:Lcom/microblink/camera/hardware/Version;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/VersionInterval;->mAllVersions:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualLowerBound:Z

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualUpperBound:Z

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v2, "*"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mAllVersions:Z

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_1

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualLowerBound:Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_7

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualLowerBound:Z

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5d

    if-ne v3, v4, :cond_2

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualUpperBound:Z

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3e

    if-ne v3, v4, :cond_6

    iput-boolean v0, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualUpperBound:Z

    :goto_1
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const-string p1, "*"

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Lcom/microblink/camera/hardware/Version;

    aget-object v0, v2, v0

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/Version;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mLowerBound:Lcom/microblink/camera/hardware/Version;

    :cond_3
    const-string p1, "*"

    aget-object v0, v2, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Lcom/microblink/camera/hardware/Version;

    aget-object v0, v2, v1

    invoke-direct {p1, v0}, Lcom/microblink/camera/hardware/Version;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mUpperBound:Lcom/microblink/camera/hardware/Version;

    :cond_4
    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Invalid version interval: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Invalid version interval: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Invalid version interval: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Interval expression cannot be null nor empty!"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public contains(Lcom/microblink/camera/hardware/Version;)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mAllVersions:Z

    if-eqz v1, :cond_1

    return v0

    :cond_1
    iget-object v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mLowerBound:Lcom/microblink/camera/hardware/Version;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    iget-boolean v3, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualLowerBound:Z

    if-eqz v3, :cond_2

    invoke-virtual {p1, v1}, Lcom/microblink/camera/hardware/Version;->greaterOrEqualThan(Lcom/microblink/camera/hardware/Version;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1}, Lcom/microblink/camera/hardware/Version;->greaterThan(Lcom/microblink/camera/hardware/Version;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mUpperBound:Lcom/microblink/camera/hardware/Version;

    if-eqz v1, :cond_8

    iget-boolean v3, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualUpperBound:Z

    if-eqz v3, :cond_6

    invoke-virtual {v1, p1}, Lcom/microblink/camera/hardware/Version;->greaterOrEqualThan(Lcom/microblink/camera/hardware/Version;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_6
    invoke-virtual {v1, p1}, Lcom/microblink/camera/hardware/Version;->greaterThan(Lcom/microblink/camera/hardware/Version;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    return v2

    :cond_8
    :goto_2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mAllVersions:Z

    const/16 v2, 0x2a

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_0
    iget-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualLowerBound:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x5b

    goto :goto_0

    :cond_1
    const/16 v1, 0x3c

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mLowerBound:Lcom/microblink/camera/hardware/Version;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/Version;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mUpperBound:Lcom/microblink/camera/hardware/Version;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/microblink/camera/hardware/Version;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    iget-boolean v1, p0, Lcom/microblink/camera/hardware/VersionInterval;->mEqualUpperBound:Z

    if-eqz v1, :cond_4

    const/16 v1, 0x5d

    goto :goto_3

    :cond_4
    const/16 v1, 0x3e

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
