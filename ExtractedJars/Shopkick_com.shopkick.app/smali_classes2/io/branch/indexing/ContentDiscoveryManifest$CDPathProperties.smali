.class Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;
.super Ljava/lang/Object;
.source "ContentDiscoveryManifest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/ContentDiscoveryManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CDPathProperties"
.end annotation


# instance fields
.field private discoveryRepeatInterval_:I

.field private isClearText_:Z

.field private maxDiscoveryRepeat_:I

.field final pathInfo_:Lorg/json/JSONObject;

.field final synthetic this$0:Lio/branch/indexing/ContentDiscoveryManifest;


# direct methods
.method constructor <init>(Lio/branch/indexing/ContentDiscoveryManifest;Lorg/json/JSONObject;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->this$0:Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-object p2, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->pathInfo_:Lorg/json/JSONObject;

    const/16 p1, 0xf

    .line 189
    iput p1, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->maxDiscoveryRepeat_:I

    const-string p1, "h"

    .line 190
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    const-string p1, "h"

    .line 192
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->isClearText_:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 194
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_1
    :goto_1
    :try_start_1
    const-string p1, "dri"

    .line 198
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "dri"

    .line 199
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->discoveryRepeatInterval_:I

    :cond_2
    const-string p1, "mdr"

    .line 201
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "mdr"

    .line 202
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->maxDiscoveryRepeat_:I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 205
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method getDiscoveryRepeatInterval()I
    .locals 1

    .line 180
    iget v0, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->discoveryRepeatInterval_:I

    return v0
.end method

.method getFilteredElements()Lorg/json/JSONArray;
    .locals 2

    .line 211
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->pathInfo_:Lorg/json/JSONObject;

    const-string v1, "ck"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    :try_start_0
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->pathInfo_:Lorg/json/JSONObject;

    const-string v1, "ck"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 215
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method getMaxDiscoveryRepeatNumber()I
    .locals 1

    .line 184
    iget v0, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->maxDiscoveryRepeat_:I

    return v0
.end method

.method isClearTextRequested()Z
    .locals 1

    .line 223
    iget-boolean v0, p0, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->isClearText_:Z

    return v0
.end method

.method isSkipContentDiscovery()Z
    .locals 1

    .line 227
    invoke-virtual {p0}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;->getFilteredElements()Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
