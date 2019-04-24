.class abstract Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;
.source "$AutoValue_ImErrorPersistedState.java"


# instance fields
.field private final retailerId:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;-><init>()V

    .line 14
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;->retailerId:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 34
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 35
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;

    .line 36
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;->retailerId:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPersistedState;->getRetailerId()I

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

.method public getRetailerId()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;->retailerId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 45
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;->retailerId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImErrorPersistedState{retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/$AutoValue_ImErrorPersistedState;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
