.class final Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;
.super Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;
.source "AutoValue_ImConnectedViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;
    }
.end annotation


# instance fields
.field private final buttonText:Ljava/lang/String;

.field private final imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private final linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->buttonText:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 54
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 55
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    .line 56
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->buttonText:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getButtonText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->equals(Ljava/lang/Object;)Z

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

.method public getButtonText()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object v0
.end method

.method public getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 69
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->buttonText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImConnectedViewState{imDetailHeaderViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->buttonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkTextViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
