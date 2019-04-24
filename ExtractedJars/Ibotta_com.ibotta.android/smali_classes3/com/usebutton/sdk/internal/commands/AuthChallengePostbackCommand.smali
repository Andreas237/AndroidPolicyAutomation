.class public Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "AuthChallengePostbackCommand.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AuthChallengePostback"


# instance fields
.field private final mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

.field private final mAuthResult:Ljava/lang/String;

.field private final mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field private final mSourceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/models/AuthChallenge;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p6}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 24
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 25
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    .line 27
    iput-object p4, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    .line 28
    iput-object p5, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_3

    .line 47
    :cond_1
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 49
    :cond_2
    check-cast p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;

    .line 51
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz v2, :cond_3

    iget-object v3, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    .line 54
    :cond_4
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    .line 57
    :cond_6
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object p1, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_7
    iget-object p1, p1, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_9
    :goto_3
    return v1
.end method

.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->execute()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public execute()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mButtonApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->reportAuthChallengeResult(Lcom/usebutton/sdk/internal/models/AuthChallenge;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AuthChallengePostback"

    const-string v2, "Posted auth challenge result (%s}"

    const/4 v3, 0x1

    .line 34
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 62
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 63
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 64
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mAuthResult:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 65
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;->mSourceToken:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    return v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 40
    const-class v0, Lcom/usebutton/sdk/internal/commands/AuthChallengePostbackCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
