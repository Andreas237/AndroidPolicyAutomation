.class final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;
.super Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;
.source "AutoValue_SocialConnectedAccount.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;
    }
.end annotation


# instance fields
.field private final authType:Lcom/ibotta/api/model/auth/AuthType;

.field private final id:I

.field private final logoResId:I

.field private final logoUrl:Ljava/lang/String;

.field private final nameResId:I

.field private final type:I

.field private final userName:Ljava/lang/String;


# direct methods
.method private constructor <init>(IIILjava/lang/String;ILcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;-><init>()V

    .line 29
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->id:I

    .line 30
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->nameResId:I

    .line 31
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoResId:I

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoUrl:Ljava/lang/String;

    .line 33
    iput p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->type:I

    .line 34
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 35
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->userName:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(IIILjava/lang/String;ILcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$1;)V
    .locals 0

    .line 11
    invoke-direct/range {p0 .. p7}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;-><init>(IIILjava/lang/String;ILcom/ibotta/api/model/auth/AuthType;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 94
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 95
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    .line 96
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->id:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->nameResId:I

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getNameResId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoResId:I

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getLogoResId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoUrl:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getLogoUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->type:I

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getType()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->userName:Ljava/lang/String;

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getUserName()Ljava/lang/String;

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

.method public getAuthType()Lcom/ibotta/api/model/auth/AuthType;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->id:I

    return v0
.end method

.method public getLogoResId()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 52
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoResId:I

    return v0
.end method

.method public getLogoUrl()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getNameResId()I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .line 46
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->nameResId:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->type:I

    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 111
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 113
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->nameResId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 115
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoResId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 117
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoUrl:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 119
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->type:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 121
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v2}, Lcom/ibotta/api/model/auth/AuthType;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->userName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 2

    .line 129
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocialConnectedAccount{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nameResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->nameResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", logoResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", logoUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->logoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", authType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount;->userName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
