.class final Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;
.super Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;
.source "AutoValue_DebugVariantRow.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;
    }
.end annotation


# instance fields
.field private final prettyVariantName:Ljava/lang/String;

.field private final variantChosen:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->prettyVariantName:Ljava/lang/String;

    .line 15
    iput-boolean p2, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->variantChosen:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$1;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 41
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 42
    check-cast p1, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->prettyVariantName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->getPrettyVariantName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->variantChosen:Z

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->isVariantChosen()Z

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getPrettyVariantName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->prettyVariantName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->prettyVariantName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 55
    iget-boolean v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->variantChosen:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public isVariantChosen()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->variantChosen:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DebugVariantRow{prettyVariantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->prettyVariantName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variantChosen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;->variantChosen:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
