.class abstract Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;
.super Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;
.source "$AutoValue_ImLoginPersistedState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;
    }
.end annotation


# instance fields
.field private final accountCreationMessageAlreadyShown:Z

.field private final fromCreate:Z

.field private final retailerId:I


# direct methods
.method constructor <init>(IZZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;-><init>()V

    .line 18
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->retailerId:I

    .line 19
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->accountCreationMessageAlreadyShown:Z

    .line 20
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->fromCreate:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 52
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 53
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;

    .line 54
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->retailerId:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->getRetailerId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->accountCreationMessageAlreadyShown:Z

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isAccountCreationMessageAlreadyShown()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->fromCreate:Z

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;->isFromCreate()Z

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

    .line 25
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->retailerId:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 65
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->retailerId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 67
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->accountCreationMessageAlreadyShown:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 69
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->fromCreate:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    xor-int/2addr v0, v3

    return v0
.end method

.method public isAccountCreationMessageAlreadyShown()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->accountCreationMessageAlreadyShown:Z

    return v0
.end method

.method public isFromCreate()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->fromCreate:Z

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState$Builder;
    .locals 2

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPersistedState;Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImLoginPersistedState{retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", accountCreationMessageAlreadyShown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->accountCreationMessageAlreadyShown:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", fromCreate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/$AutoValue_ImLoginPersistedState;->fromCreate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
