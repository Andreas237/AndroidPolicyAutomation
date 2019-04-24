.class final Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;
.super Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
.source "AutoValue_ImConnectedAccount.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;
    }
.end annotation


# instance fields
.field private final id:I

.field private final logoResId:I

.field private final logoUrl:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final retailerId:I

.field private final type:I

.field private final username:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;-><init>()V

    .line 27
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->id:I

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->name:Ljava/lang/String;

    .line 29
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoResId:I

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoUrl:Ljava/lang/String;

    .line 31
    iput p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->type:I

    .line 32
    iput p6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->retailerId:I

    .line 33
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->username:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$1;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p7}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;-><init>(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 91
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 92
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    .line 93
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->id:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->name:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoResId:I

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getLogoResId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoUrl:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getLogoUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->type:I

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getType()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->retailerId:I

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getRetailerId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->username:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;->getUsername()Ljava/lang/String;

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

.method public getId()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->id:I

    return v0
.end method

.method public getLogoResId()I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 49
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoResId:I

    return v0
.end method

.method public getLogoUrl()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->retailerId:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->type:I

    return v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 108
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 110
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->name:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 112
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoResId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 114
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoUrl:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 116
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->type:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 118
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->retailerId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->username:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImConnectedAccount{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", logoResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", logoUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->logoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
