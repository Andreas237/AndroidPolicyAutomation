.class public Lcom/shopkick/comm/DefaultAPIEndpoint;
.super Ljava/lang/Object;
.source "DefaultAPIEndpoint.java"

# interfaces
.implements Lcom/shopkick/comm/IAPIEndpoint;


# instance fields
.field private final authenticationType:I

.field private domain:Ljava/lang/String;

.field private final modifiesSession:Z

.field private final path:Ljava/lang/String;

.field private final responseClass:Ljava/lang/String;

.field private final useHttps:Z

.field private final usePost:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/comm/IAPIEndpoint;)V
    .locals 7

    .line 80
    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->getAuthenticationType()I

    move-result v2

    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->usePost()Z

    move-result v3

    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->useHttps()Z

    move-result v4

    .line 81
    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->modifiesSession()Z

    move-result v5

    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->getResponseClass()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    .line 80
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 82
    invoke-interface {p1}, Lcom/shopkick/comm/IAPIEndpoint;->getDomain()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 83
    iget-object p1, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->domain:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/comm/DefaultAPIEndpoint;->setDomain(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZZLjava/lang/String;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p6}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    iput-object p1, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->path:Ljava/lang/String;

    .line 33
    iput p2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->authenticationType:I

    .line 34
    iput-boolean p3, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->usePost:Z

    .line 35
    iput-boolean p4, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->useHttps:Z

    .line 36
    iput-boolean p5, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->modifiesSession:Z

    .line 37
    iput-object p6, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->responseClass:Ljava/lang/String;

    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty path or responseClass"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/comm/DefaultAPIEndpoint;-><init>(Ljava/lang/String;IZZZLjava/lang/String;)V

    .line 51
    invoke-virtual {p0, p7}, Lcom/shopkick/comm/DefaultAPIEndpoint;->setDomain(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "path"

    .line 64
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->path:Ljava/lang/String;

    const-string v0, "authenticationType"

    .line 65
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->authenticationType:I

    const-string/jumbo v0, "usePost"

    .line 66
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->usePost:Z

    const-string/jumbo v0, "useHttps"

    .line 67
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->useHttps:Z

    const-string v0, "modifiesSession"

    const/4 v1, 0x0

    .line 68
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->modifiesSession:Z

    const-string v0, "responseClass"

    .line 69
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->responseClass:Ljava/lang/String;

    const-string v0, "domain"

    .line 70
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->domain:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAuthenticationType()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->authenticationType:I

    return v0
.end method

.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->domain:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseClass()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->responseClass:Ljava/lang/String;

    return-object v0
.end method

.method public modifiesSession()Z
    .locals 1

    .line 114
    iget-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->modifiesSession:Z

    return v0
.end method

.method public setDomain(Ljava/lang/String;)V
    .locals 1

    .line 135
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    iput-object p1, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->domain:Ljava/lang/String;

    return-void

    .line 136
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "domain should not be null or empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultAPIEndpoint{path=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", authenticationType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->authenticationType:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", usePost="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->usePost:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", useHttps="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->useHttps:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", modifiesSession="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->modifiesSession:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", responseClass=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->responseClass:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", domain=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->domain:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public useHttps()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->useHttps:Z

    return v0
.end method

.method public usePost()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/shopkick/comm/DefaultAPIEndpoint;->usePost:Z

    return v0
.end method
