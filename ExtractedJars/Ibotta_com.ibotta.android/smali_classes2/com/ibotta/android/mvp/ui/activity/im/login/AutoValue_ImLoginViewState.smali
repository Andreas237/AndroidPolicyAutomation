.class final Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;
.super Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;
.source "AutoValue_ImLoginViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;
    }
.end annotation


# instance fields
.field private final connectButtonEnabled:Z

.field private final disclaimer:Ljava/lang/String;

.field private final imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private final linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

.field private final retailerCreateAccountUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;ZLjava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 25
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->connectButtonEnabled:Z

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->retailerCreateAccountUrl:Ljava/lang/String;

    .line 27
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 28
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->disclaimer:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;ZLjava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;ZLjava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 72
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 73
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->connectButtonEnabled:Z

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->isConnectButtonEnabled()Z

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->retailerCreateAccountUrl:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getRetailerCreateAccountUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->disclaimer:Ljava/lang/String;

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getDisclaimer()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object v0
.end method

.method public getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object v0
.end method

.method public getRetailerCreateAccountUrl()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->retailerCreateAccountUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 89
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->connectButtonEnabled:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 91
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->retailerCreateAccountUrl:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 93
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->disclaimer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public isConnectButtonEnabled()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->connectButtonEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImLoginViewState{imDetailHeaderViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectButtonEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->connectButtonEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", retailerCreateAccountUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->retailerCreateAccountUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkTextViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;->disclaimer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
