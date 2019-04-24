.class Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private clientId:Ljava/lang/String;

.field private redirectUri:Ljava/lang/String;

.field private responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

.field private scope:Lcom/myfitnesspal/android/sdk/Scope;

.field private suffix:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;)V
    .locals 4

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->clientId:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->suffix:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->scope:Lcom/myfitnesspal/android/sdk/Scope;

    .line 32
    iput-object p4, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    .line 33
    const-string v0, "mfp-%s%s%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->clientId:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lcom/myfitnesspal/shared/utils/Strings;->notEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "://mfp/authorize/response"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->redirectUri:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public asBundle()Landroid/os/Bundle;
    .locals 3

    .line 51
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 52
    const-string v0, "client_id"

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->clientId:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "suffix"

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->suffix:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "redirect_uri"

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->redirectUri:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, "display"

    const-string v1, "mobile"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v0, "access_type"

    sget-object v1, Lcom/myfitnesspal/android/sdk/AccessType;->Offline:Lcom/myfitnesspal/android/sdk/AccessType;

    invoke-virtual {v1}, Lcom/myfitnesspal/android/sdk/AccessType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "scope"

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->scope:Lcom/myfitnesspal/android/sdk/Scope;

    invoke-virtual {v1}, Lcom/myfitnesspal/android/sdk/Scope;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "response_type"

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    invoke-virtual {v1}, Lcom/myfitnesspal/android/sdk/ResponseType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    return-object v2
.end method

.method public getRedirectUri()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->redirectUri:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseType()Lcom/myfitnesspal/android/sdk/ResponseType;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    return-object v0
.end method

.method public isRequestForCode()Z
    .locals 3

    .line 64
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Code:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 66
    :goto_0
    return v2
.end method

.method public isRequestForTokens()Z
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->responseType:Lcom/myfitnesspal/android/sdk/ResponseType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 73
    :goto_0
    return v2
.end method
