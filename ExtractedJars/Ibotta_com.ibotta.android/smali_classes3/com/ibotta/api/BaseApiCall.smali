.class public abstract Lcom/ibotta/api/BaseApiCall;
.super Ljava/lang/Object;
.source "BaseApiCall.java"

# interfaces
.implements Lcom/ibotta/api/ApiCall;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/ApiCall<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final API_VERSION_DEFAULT:Ljava/lang/String; = "v2"

.field protected static final DATE_TIME_ISO_8601_FORMAT:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"


# instance fields
.field protected apiExecution:Lcom/ibotta/api/execution/ApiExecution;

.field protected final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private progressListener:Lcom/ibotta/api/execution/ApiUploadProgressListener;

.field private requiresAuthToken:Z

.field protected success:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/BaseApiCall;->params:Ljava/util/Map;

    return-void
.end method

.method protected static fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 201
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 203
    new-instance p1, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected static fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/lang/String;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 151
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 153
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 212
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToArrayList(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 214
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/lang/String;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 163
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 165
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToHashMap(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 251
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 253
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for classes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToHashMap(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 189
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 191
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for classes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToLinkedHashMap(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 225
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToLinkedHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 227
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for classes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToLinkedHashMap(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 176
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToLinkedHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 178
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for classes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method protected static fromJsonToTreeMap(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/TreeMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 238
    :try_start_0
    invoke-interface {p0, p1, p2, p3}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToTreeMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;

    move-result-object p0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 240
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "JSON = %1$s"

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    new-instance p0, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse json for classes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 112
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaApiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/BaseApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildHeaders()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 65
    sget-object v0, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiModule;->getHttpHeaders()Lcom/ibotta/api/HttpHeaders;

    move-result-object v0

    .line 67
    iget-object v1, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/api/BaseApiCall;->isRequiresAppToken()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    iget-object v1, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v2, "X-App-Token"

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getAppToken()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 76
    iget-object v2, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v3, "X-Device-Id"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/api/BaseApiCall;->isRequiresAuthToken()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 80
    iget-object v1, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v2, "Authorization"

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getBearer()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_2
    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getUserLocation()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 85
    sget-object v3, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v4, "Writing header location: %1$s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v2

    invoke-interface {v3, v4, v5}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v2, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v3, "X-Location"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 88
    :cond_3
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "No header location to write."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v1, v3, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :goto_0
    iget-object v1, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v2, "X-App-Version"

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getAppVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getAppsFlyerId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 95
    iget-object v1, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v2, "X-AppsFlyer-Id"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->params:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public cancel()V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    if-eqz v0, :cond_0

    .line 265
    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecution;->abort()V

    :cond_0
    return-void
.end method

.method public execute()Lcom/ibotta/api/ApiResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 124
    :try_start_0
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiClient()Lcom/ibotta/api/ApiClient;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/api/ApiClient;->execute(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    const/4 v1, 0x1

    .line 125
    iput-boolean v1, p0, Lcom/ibotta/api/BaseApiCall;->success:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 127
    iput-boolean v1, p0, Lcom/ibotta/api/BaseApiCall;->success:Z

    .line 128
    instance-of v1, v0, Lcom/ibotta/api/ApiException;

    if-eqz v1, :cond_0

    .line 129
    check-cast v0, Lcom/ibotta/api/ApiException;

    throw v0

    .line 131
    :cond_0
    new-instance v1, Lcom/ibotta/api/ApiException;

    const-string v2, "Failed to parse JSON."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected formatISO8601Date(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 289
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    .line 290
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 291
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-object v0
.end method

.method public getApiVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "v2"

    return-object v0
.end method

.method public getConnectionTimeout()Ljava/lang/Long;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getFormatting()Lcom/ibotta/api/ApiFormatting;
    .locals 1

    .line 295
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getProgressListener()Lcom/ibotta/api/execution/ApiUploadProgressListener;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->progressListener:Lcom/ibotta/api/execution/ApiUploadProgressListener;

    return-object v0
.end method

.method public getSocketTimeout()Ljava/lang/Long;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getUserAgent()Ljava/lang/String;
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->headers:Ljava/util/Map;

    const-string v1, "X-App-Version"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ibotta/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecution;->isAborted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRequiresAppToken()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isRequiresAuthToken()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/ibotta/api/BaseApiCall;->requiresAuthToken:Z

    return v0
.end method

.method public isSuccess()Z
    .locals 1

    .line 260
    iget-boolean v0, p0, Lcom/ibotta/api/BaseApiCall;->success:Z

    return v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 274
    iput-object v0, p0, Lcom/ibotta/api/BaseApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    .line 275
    iget-object v0, p0, Lcom/ibotta/api/BaseApiCall;->params:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public setProgressListener(Lcom/ibotta/api/execution/ApiUploadProgressListener;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/ibotta/api/BaseApiCall;->progressListener:Lcom/ibotta/api/execution/ApiUploadProgressListener;

    return-void
.end method

.method public setRequiresAuthToken(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lcom/ibotta/api/BaseApiCall;->requiresAuthToken:Z

    return-void
.end method
