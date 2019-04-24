.class public abstract Lcom/shopkick/app/fetchers/api/IAPIObject;
.super Ljava/lang/Object;
.source "IAPIObject.java"


# instance fields
.field private clientData:Ljava/util/HashMap;
    .annotation runtime Lcom/google/gson/annotations/Expose;
        deserialize = false
        serialize = false
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public clientData()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/IAPIObject;->clientData:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/IAPIObject;->clientData:Ljava/util/HashMap;

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/IAPIObject;->clientData:Ljava/util/HashMap;

    return-object v0
.end method

.method public abstract cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
.end method

.method public toJsonTree()Lcom/google/gson/JsonObject;
    .locals 1

    .line 43
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object v0

    check-cast v0, Lcom/google/gson/JsonObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
