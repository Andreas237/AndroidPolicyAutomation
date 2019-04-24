.class abstract Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;
.super Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
.source "$AutoValue_EarningDetailParcel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;
    }
.end annotation


# instance fields
.field private final earningId:I

.field private final earningType:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningId:I

    .line 17
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningType:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 44
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 45
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    .line 46
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningId:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningType:I

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningType()I

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

.method public getEarningId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningId:I

    return v0
.end method

.method public getEarningType()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 56
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 58
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningType:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel$Builder;
    .locals 2

    .line 64
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EarningDetailParcel{earningId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", earningType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/$AutoValue_EarningDetailParcel;->earningType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
