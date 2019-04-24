.class final Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;
.super Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
.source "AutoValue_CredentialIntegration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private retailerId:Ljava/lang/Integer;

.field private status:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Lcom/ibotta/api/model/im/CredentialIntegration$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/im/CredentialIntegration;
    .locals 5

    const-string v0, ""

    .line 107
    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 110
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->status:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " status"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->username:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " username"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 116
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 119
    new-instance v0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;

    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->retailerId:Ljava/lang/Integer;

    .line 120
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->status:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->username:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$1;)V

    return-object v0

    .line 117
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

.method public retailerId(I)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .locals 0

    .line 85
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public status(Ljava/lang/String;)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->status:Ljava/lang/String;

    return-object p0

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null status"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public username(Ljava/lang/String;)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->username:Ljava/lang/String;

    return-object p0

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null username"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
