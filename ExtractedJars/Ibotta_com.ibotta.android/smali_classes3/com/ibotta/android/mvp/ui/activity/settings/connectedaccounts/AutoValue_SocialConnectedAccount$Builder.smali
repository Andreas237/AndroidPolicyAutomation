.class final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
.source "AutoValue_SocialConnectedAccount.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private id:Ljava/lang/Integer;

.field private logoResId:Ljava/lang/Integer;

.field private logoUrl:Ljava/lang/String;

.field private nameResId:Ljava/lang/Integer;

.field private type:Ljava/lang/Integer;

.field private userName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 140
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V
    .locals 1

    .line 142
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;-><init>()V

    .line 143
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->id:Ljava/lang/Integer;

    .line 144
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getNameResId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->nameResId:Ljava/lang/Integer;

    .line 145
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getLogoResId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    .line 146
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getLogoUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->type:Ljava/lang/Integer;

    .line 148
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 149
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getUserName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->userName:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$1;)V
    .locals 0

    .line 132
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;)V

    return-void
.end method


# virtual methods
.method public authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 184
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object p0

    .line 182
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null authType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;
    .locals 11

    const-string v0, ""

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->id:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 201
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->nameResId:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " nameResId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 204
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " logoResId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 207
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 208
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " logoUrl"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 210
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->type:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " type"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 213
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    if-nez v1, :cond_5

    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " authType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 216
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->userName:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " userName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 219
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 222
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->id:Ljava/lang/Integer;

    .line 223
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->nameResId:Ljava/lang/Integer;

    .line 224
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    .line 225
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->type:Ljava/lang/Integer;

    .line 227
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->authType:Lcom/ibotta/api/model/auth/AuthType;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->userName:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;-><init>(IIILjava/lang/String;ILcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$1;)V

    return-object v0

    .line 220
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

.method public id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 0

    .line 153
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public logoResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 0

    .line 163
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoResId:Ljava/lang/Integer;

    return-object p0
.end method

.method public logoUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->logoUrl:Ljava/lang/String;

    return-object p0

    .line 169
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null logoUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public nameResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 0

    .line 158
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->nameResId:Ljava/lang/Integer;

    return-object p0
.end method

.method public type(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 0

    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->type:Ljava/lang/Integer;

    return-object p0
.end method

.method public userName(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 192
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->userName:Ljava/lang/String;

    return-object p0

    .line 190
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null userName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
