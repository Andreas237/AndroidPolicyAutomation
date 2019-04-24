.class final Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.source "AutoValue_ImConnectViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field private buttonText:Ljava/lang/String;

.field private disclaimer:Ljava/lang/String;

.field private imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

.field private linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field private linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 118
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
    .locals 10

    const-string v0, ""

    .line 171
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    if-nez v1, :cond_0

    .line 172
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " imDetailHeaderViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 174
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonText:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " buttonText"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 177
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    if-nez v1, :cond_2

    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " linkTextViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 180
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->disclaimer:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " disclaimer"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 183
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    if-nez v1, :cond_4

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " buttonAction"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 186
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    if-nez v1, :cond_5

    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " linkAction"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 192
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonText:Ljava/lang/String;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->disclaimer:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState;-><init>(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;Ljava/lang/String;Lcom/ibotta/android/views/base/text/LinkTextViewState;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$1;)V

    return-object v0

    .line 190
    :cond_6
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

.method public buttonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 157
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p0

    .line 155
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null buttonAction"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->buttonText:Ljava/lang/String;

    return-object p0

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null buttonText"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->disclaimer:Ljava/lang/String;

    return-object p0

    .line 147
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null disclaimer"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->imDetailHeaderViewState:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    return-object p0

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null imDetailHeaderViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public linkAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 165
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkAction:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p0

    .line 163
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkAction"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 141
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;->linkTextViewState:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    return-object p0

    .line 139
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkTextViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
