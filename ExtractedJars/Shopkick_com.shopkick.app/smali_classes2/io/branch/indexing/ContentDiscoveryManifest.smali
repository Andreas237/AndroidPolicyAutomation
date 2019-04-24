.class public Lio/branch/indexing/ContentDiscoveryManifest;
.super Ljava/lang/Object;
.source "ContentDiscoveryManifest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;
    }
.end annotation


# static fields
.field public static final CONTENT_DISCOVER_KEY:Ljava/lang/String; = "cd"

.field static final DEF_MAX_DISCOVERY_REPEAT:I = 0xf

.field private static final DISCOVERY_REPEAT_INTERVAL:Ljava/lang/String; = "dri"

.field static final DRI_MINIMUM_THRESHOLD:I = 0x1f4

.field private static final FILTERED_KEYS:Ljava/lang/String; = "ck"

.field static final HASH_MODE_KEY:Ljava/lang/String; = "h"

.field private static final MANIFEST_KEY:Ljava/lang/String; = "m"

.field public static final MANIFEST_VERSION_KEY:Ljava/lang/String; = "mv"

.field private static final MAX_DISCOVERY_REPEAT:Ljava/lang/String; = "mdr"

.field private static final MAX_PACKET_SIZE_KEY:Ljava/lang/String; = "mps"

.field private static final MAX_TEXT_LEN_KEY:Ljava/lang/String; = "mtl"

.field private static final MAX_VIEW_HISTORY_LENGTH:Ljava/lang/String; = "mhl"

.field public static final PACKAGE_NAME_KEY:Ljava/lang/String; = "pn"

.field private static final PATH_KEY:Ljava/lang/String; = "p"

.field private static thisInstance_:Lio/branch/indexing/ContentDiscoveryManifest;


# instance fields
.field private final PREF_KEY:Ljava/lang/String;

.field private cdManifestObject_:Lorg/json/JSONObject;

.field private contentPaths_:Lorg/json/JSONArray;

.field private isCDEnabled_:Z

.field private manifestVersion_:Ljava/lang/String;

.field private maxPacketSize_:I

.field private maxTextLen_:I

.field private maxViewHistoryLength_:I

.field private sharedPref:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxTextLen_:I

    const/4 v1, 0x1

    .line 31
    iput v1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxViewHistoryLength_:I

    .line 33
    iput v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxPacketSize_:I

    .line 35
    iput-boolean v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->isCDEnabled_:Z

    const-string v1, "BNC_CD_MANIFEST"

    .line 57
    iput-object v1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->PREF_KEY:Ljava/lang/String;

    const-string v1, "bnc_content_discovery_manifest_storage"

    .line 60
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->sharedPref:Landroid/content/SharedPreferences;

    .line 61
    invoke-direct {p0, p1}, Lio/branch/indexing/ContentDiscoveryManifest;->retrieve(Landroid/content/Context;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lio/branch/indexing/ContentDiscoveryManifest;
    .locals 1

    .line 65
    sget-object v0, Lio/branch/indexing/ContentDiscoveryManifest;->thisInstance_:Lio/branch/indexing/ContentDiscoveryManifest;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Lio/branch/indexing/ContentDiscoveryManifest;

    invoke-direct {v0, p0}, Lio/branch/indexing/ContentDiscoveryManifest;-><init>(Landroid/content/Context;)V

    sput-object v0, Lio/branch/indexing/ContentDiscoveryManifest;->thisInstance_:Lio/branch/indexing/ContentDiscoveryManifest;

    .line 68
    :cond_0
    sget-object p0, Lio/branch/indexing/ContentDiscoveryManifest;->thisInstance_:Lio/branch/indexing/ContentDiscoveryManifest;

    return-object p0
.end method

.method private persist()V
    .locals 3

    .line 72
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->sharedPref:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "BNC_CD_MANIFEST"

    .line 73
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private retrieve(Landroid/content/Context;)V
    .locals 2

    .line 77
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->sharedPref:Landroid/content/SharedPreferences;

    const-string v0, "BNC_CD_MANIFEST"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 80
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    .line 81
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "mv"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 82
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "mv"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->manifestVersion_:Ljava/lang/String;

    .line 84
    :cond_0
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "m"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 85
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "m"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 88
    :catch_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    goto :goto_0

    .line 91
    :cond_1
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method getCDPathProperties(Landroid/app/Activity;)Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;
    .locals 4

    .line 133
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 136
    :goto_0
    :try_start_0
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 137
    iget-object v2, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "p"

    .line 138
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "p"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 139
    new-instance p1, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;

    invoke-direct {p1, p0, v2}, Lio/branch/indexing/ContentDiscoveryManifest$CDPathProperties;-><init>(Lio/branch/indexing/ContentDiscoveryManifest;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    :goto_1
    return-object v1
.end method

.method public getManifestVersion()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->manifestVersion_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "-1"

    return-object v0

    .line 170
    :cond_0
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->manifestVersion_:Ljava/lang/String;

    return-object v0
.end method

.method getMaxPacketSize()I
    .locals 1

    .line 159
    iget v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxPacketSize_:I

    return v0
.end method

.method getMaxTextLen()I
    .locals 1

    .line 155
    iget v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxTextLen_:I

    return v0
.end method

.method getMaxViewHistorySize()I
    .locals 1

    .line 163
    iget v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxViewHistoryLength_:I

    return v0
.end method

.method isCDEnabled()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->isCDEnabled_:Z

    return v0
.end method

.method public onBranchInitialised(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "cd"

    .line 97
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->isCDEnabled_:Z

    :try_start_0
    const-string v0, "cd"

    .line 100
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "mv"

    .line 102
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "mv"

    .line 103
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->manifestVersion_:Ljava/lang/String;

    :cond_0
    const-string v0, "mhl"

    .line 105
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "mhl"

    .line 106
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxViewHistoryLength_:I

    :cond_1
    const-string v0, "m"

    .line 108
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "m"

    .line 109
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;

    :cond_2
    const-string v0, "mtl"

    .line 111
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "mtl"

    .line 112
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    .line 114
    iput v0, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxTextLen_:I

    :cond_3
    const-string v0, "mps"

    .line 117
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "mps"

    .line 118
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->maxPacketSize_:I

    .line 120
    :cond_4
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "mv"

    iget-object v1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->manifestVersion_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    iget-object p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->cdManifestObject_:Lorg/json/JSONObject;

    const-string v0, "m"

    iget-object v1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->contentPaths_:Lorg/json/JSONArray;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    invoke-direct {p0}, Lio/branch/indexing/ContentDiscoveryManifest;->persist()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    .line 127
    iput-boolean p1, p0, Lio/branch/indexing/ContentDiscoveryManifest;->isCDEnabled_:Z

    :catch_0
    :goto_0
    return-void
.end method
