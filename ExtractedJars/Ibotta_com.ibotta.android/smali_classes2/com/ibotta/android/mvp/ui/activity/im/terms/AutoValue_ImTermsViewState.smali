.class final Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;
.super Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
.source "AutoValue_ImTermsViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;
    }
.end annotation


# instance fields
.field private final imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private final shareInfo:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 18
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->shareInfo:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 45
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->shareInfo:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->getShareInfo()Ljava/lang/String;

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

.method public getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object v0
.end method

.method public getShareInfo()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->shareInfo:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->shareInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImTermsViewState{imDetailHeaderViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shareInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;->shareInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
