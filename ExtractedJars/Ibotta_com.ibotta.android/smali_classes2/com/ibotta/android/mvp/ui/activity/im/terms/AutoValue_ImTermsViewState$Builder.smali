.class final Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
.source "AutoValue_ImTermsViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private shareInfo:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
    .locals 4

    const-string v0, ""

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    if-nez v1, :cond_0

    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " imDetailHeaderViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 89
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->shareInfo:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " shareInfo"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->shareInfo:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$1;)V

    return-object v0

    .line 93
    :cond_2
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

.method public imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object p0

    .line 70
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null imDetailHeaderViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public shareInfo(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;->shareInfo:Ljava/lang/String;

    return-object p0

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null shareInfo"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
