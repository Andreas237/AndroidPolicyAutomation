.class final Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
.source "AutoValue_ImConnectedViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private buttonText:Ljava/lang/String;

.field private imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;
    .locals 5

    const-string v0, ""

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    if-nez v1, :cond_0

    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " imDetailHeaderViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->buttonText:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " buttonText"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 114
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    if-nez v1, :cond_2

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " linkTextViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 117
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 120
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->buttonText:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$1;)V

    return-object v0

    .line 118
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->buttonText:Ljava/lang/String;

    return-object p0

    .line 92
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null buttonText"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object p0

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null imDetailHeaderViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 102
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object p0

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkTextViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
