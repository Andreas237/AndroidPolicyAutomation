.class abstract Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;
.source "$AutoValue_ImTermsPersistedState.java"


# instance fields
.field private final imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

.field private final retailerId:I


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;I)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;-><init>()V

    if-eqz p1, :cond_0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    .line 21
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->retailerId:I

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null imLoginParcel"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 47
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 48
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;

    .line 49
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->retailerId:I

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPersistedState;->getRetailerId()I

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

.method public getImLoginParcel()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->retailerId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 61
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->retailerId:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImTermsPersistedState{imLoginParcel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->imLoginParcel:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginParcel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/$AutoValue_ImTermsPersistedState;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
