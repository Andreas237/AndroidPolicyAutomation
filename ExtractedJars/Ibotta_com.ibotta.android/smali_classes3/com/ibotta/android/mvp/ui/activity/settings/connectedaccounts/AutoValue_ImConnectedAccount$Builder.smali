.class final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.source "AutoValue_ImConnectedAccount.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private id:Ljava/lang/Integer;

.field private logoResId:Ljava/lang/Integer;

.field private logoUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private retailerId:Ljava/lang/Integer;

.field private type:Ljava/lang/Integer;

.field private username:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 132
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
    .locals 11

    const-string v0, ""

    .line 181
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->id:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 184
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 185
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " name"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 187
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 188
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " logoResId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 190
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " logoUrl"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 193
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->type:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " type"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 196
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_5

    .line 197
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->username:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 200
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " username"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 202
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 205
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->id:Ljava/lang/Integer;

    .line 206
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    .line 208
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->type:Ljava/lang/Integer;

    .line 210
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->retailerId:Ljava/lang/Integer;

    .line 211
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->username:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;-><init>(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$1;)V

    return-object v0

    .line 203
    :cond_7
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

.method public id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 0

    .line 136
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public logoResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 0

    .line 149
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    return-object p0
.end method

.method public logoUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 157
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    return-object p0

    .line 155
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null logoUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 144
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->name:Ljava/lang/String;

    return-object p0

    .line 142
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null name"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retailerId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 0

    .line 167
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public type(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 0

    .line 162
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->type:Ljava/lang/Integer;

    return-object p0
.end method

.method public username(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 175
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->username:Ljava/lang/String;

    return-object p0

    .line 173
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null username"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
