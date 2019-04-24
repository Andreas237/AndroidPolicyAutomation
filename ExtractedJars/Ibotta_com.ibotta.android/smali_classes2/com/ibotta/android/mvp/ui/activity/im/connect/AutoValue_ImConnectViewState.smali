.class final Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;
.super Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
.source "AutoValue_ImConnectViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;
    }
.end annotation


# instance fields
.field private final buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field private final buttonText:Ljava/lang/String;

.field private final disclaimer:Ljava/lang/String;

.field private final imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private final linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field private final linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonText:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 29
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->disclaimer:Ljava/lang/String;

    .line 30
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 31
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 81
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 82
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonText:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getButtonText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->disclaimer:Ljava/lang/String;

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getDisclaimer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getButtonAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->getLinkAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->equals(Ljava/lang/Object;)Z

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

.method public getButtonAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object v0
.end method

.method public getButtonText()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public getDisclaimer()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object v0
.end method

.method public getLinkAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object v0
.end method

.method public getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 99
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 101
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 103
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->disclaimer:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 105
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImConnectViewState{imDetailHeaderViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkTextViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->disclaimer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
