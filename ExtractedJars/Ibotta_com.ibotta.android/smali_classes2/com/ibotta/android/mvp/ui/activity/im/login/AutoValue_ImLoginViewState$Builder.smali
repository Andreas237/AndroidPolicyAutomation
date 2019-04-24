.class final Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
.source "AutoValue_ImLoginViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private connectButtonEnabled:Ljava/lang/Boolean;

.field private disclaimer:Ljava/lang/String;

.field private imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

.field private retailerCreateAccountUrl:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;
    .locals 9

    const-string v0, ""

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    if-nez v1, :cond_0

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " imDetailHeaderViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 150
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->connectButtonEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " connectButtonEnabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 153
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->retailerCreateAccountUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerCreateAccountUrl"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 156
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    if-nez v1, :cond_3

    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " linkTextViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 159
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->disclaimer:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 160
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " disclaimer"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 162
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 165
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->connectButtonEnabled:Ljava/lang/Boolean;

    .line 167
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->retailerCreateAccountUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->disclaimer:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;ZLjava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$1;)V

    return-object v0

    .line 163
    :cond_5
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

.method public connectButtonEnabled(Z)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
    .locals 0

    .line 117
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->connectButtonEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 141
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->disclaimer:Ljava/lang/String;

    return-object p0

    .line 139
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null disclaimer"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 112
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object p0

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null imDetailHeaderViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object p0

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkTextViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retailerCreateAccountUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/AutoValue_ImLoginViewState$Builder;->retailerCreateAccountUrl:Ljava/lang/String;

    return-object p0

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailerCreateAccountUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
