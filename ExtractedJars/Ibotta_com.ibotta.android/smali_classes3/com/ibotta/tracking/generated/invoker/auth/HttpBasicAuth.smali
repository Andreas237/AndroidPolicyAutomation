.class public Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;
.super Ljava/lang/Object;
.source "HttpBasicAuth.java"

# interfaces
.implements Lcom/ibotta/tracking/generated/invoker/auth/Authentication;


# instance fields
.field private password:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public applyToParams(Ljava/util/List;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 47
    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->username:Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->password:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, "Authorization"

    .line 50
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->username:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->password:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    invoke-static {v0, v1}, Lcom/squareup/okhttp/Credentials;->basic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->username:Ljava/lang/String;

    return-object v0
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->password:Ljava/lang/String;

    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/HttpBasicAuth;->username:Ljava/lang/String;

    return-void
.end method
