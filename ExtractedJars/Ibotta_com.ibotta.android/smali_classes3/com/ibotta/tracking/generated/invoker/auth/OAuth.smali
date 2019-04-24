.class public Lcom/ibotta/tracking/generated/invoker/auth/OAuth;
.super Ljava/lang/Object;
.source "OAuth.java"

# interfaces
.implements Lcom/ibotta/tracking/generated/invoker/auth/Authentication;


# instance fields
.field private accessToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
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

    .line 35
    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;->accessToken:Ljava/lang/String;

    if-eqz p1, :cond_0

    const-string p1, "Authorization"

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bearer "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;->accessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/OAuth;->accessToken:Ljava/lang/String;

    return-void
.end method
