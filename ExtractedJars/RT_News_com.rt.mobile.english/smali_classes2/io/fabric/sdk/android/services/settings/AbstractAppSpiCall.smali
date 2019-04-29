.class abstract Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;
.super Lio/fabric/sdk/android/services/common/AbstractSpiCall;
.source "AbstractAppSpiCall.java"

# interfaces
.implements Lio/fabric/sdk/android/services/settings/AppSpiCall;


# static fields
.field public static final APP_BUILD_VERSION_PARAM:Ljava/lang/String; = "app[build_version]"

.field public static final APP_BUILT_SDK_VERSION_PARAM:Ljava/lang/String; = "app[built_sdk_version]"

.field public static final APP_DISPLAY_VERSION_PARAM:Ljava/lang/String; = "app[display_version]"

.field public static final APP_ICON_DATA_PARAM:Ljava/lang/String; = "app[icon][data]"

.field public static final APP_ICON_HASH_PARAM:Ljava/lang/String; = "app[icon][hash]"

.field public static final APP_ICON_HEIGHT_PARAM:Ljava/lang/String; = "app[icon][height]"

.field public static final APP_ICON_PRERENDERED_PARAM:Ljava/lang/String; = "app[icon][prerendered]"

.field public static final APP_ICON_WIDTH_PARAM:Ljava/lang/String; = "app[icon][width]"

.field public static final APP_IDENTIFIER_PARAM:Ljava/lang/String; = "app[identifier]"

.field public static final APP_INSTANCE_IDENTIFIER_PARAM:Ljava/lang/String; = "app[instance_identifier]"

.field public static final APP_MIN_SDK_VERSION_PARAM:Ljava/lang/String; = "app[minimum_sdk_version]"

.field public static final APP_NAME_PARAM:Ljava/lang/String; = "app[name]"

.field public static final APP_SDK_MODULES_PARAM_BUILD_TYPE:Ljava/lang/String; = "app[build][libraries][%s][type]"

.field public static final APP_SDK_MODULES_PARAM_PREFIX:Ljava/lang/String; = "app[build][libraries][%s]"

.field public static final APP_SDK_MODULES_PARAM_VERSION:Ljava/lang/String; = "app[build][libraries][%s][version]"

.field public static final APP_SOURCE_PARAM:Ljava/lang/String; = "app[source]"

.field static final ICON_CONTENT_TYPE:Ljava/lang/String; = "application/octet-stream"

.field static final ICON_FILE_NAME:Ljava/lang/String; = "icon.png"


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lio/fabric/sdk/android/services/network/HttpMethod;)V
    .locals 0

    .line 69
    invoke-direct/range {p0 .. p5}, Lio/fabric/sdk/android/services/common/AbstractSpiCall;-><init>(Lio/fabric/sdk/android/Kit;Ljava/lang/String;Ljava/lang/String;Lio/fabric/sdk/android/services/network/HttpRequestFactory;Lio/fabric/sdk/android/services/network/HttpMethod;)V

    return-void
.end method

.method private applyHeadersTo(Lio/fabric/sdk/android/services/network/HttpRequest;Lio/fabric/sdk/android/services/settings/AppRequestData;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 1

    const-string v0, "X-CRASHLYTICS-API-KEY"

    .line 98
    iget-object p2, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->apiKey:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string p2, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v0, "android"

    invoke-virtual {p1, p2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string p2, "X-CRASHLYTICS-API-CLIENT-VERSION"

    iget-object v0, p0, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v0}, Lio/fabric/sdk/android/Kit;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    return-object p1
.end method

.method private applyMultipartDataTo(Lio/fabric/sdk/android/services/network/HttpRequest;Lio/fabric/sdk/android/services/settings/AppRequestData;)Lio/fabric/sdk/android/services/network/HttpRequest;
    .locals 7

    const-string v0, "app[identifier]"

    .line 108
    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->appId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[name]"

    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->name:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[display_version]"

    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->displayVersion:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[build_version]"

    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->buildVersion:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[source]"

    iget v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->source:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[minimum_sdk_version]"

    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->minSdkVersion:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    const-string v0, "app[built_sdk_version]"

    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->builtSdkVersion:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object p1

    .line 116
    iget-object v0, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->instanceIdentifier:Ljava/lang/String;

    invoke-static {v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "app[instance_identifier]"

    .line 117
    iget-object v1, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->instanceIdentifier:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 120
    :cond_0
    iget-object v0, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 124
    :try_start_0
    iget-object v1, p0, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->kit:Lio/fabric/sdk/android/Kit;

    invoke-virtual {v1}, Lio/fabric/sdk/android/Kit;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget v2, v2, Lio/fabric/sdk/android/services/settings/IconRequest;->iconResourceId:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v0, "app[icon][hash]"

    .line 127
    iget-object v2, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget-object v2, v2, Lio/fabric/sdk/android/services/settings/IconRequest;->hash:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    const-string v2, "app[icon][data]"

    const-string v3, "icon.png"

    const-string v4, "application/octet-stream"

    invoke-virtual {v0, v2, v3, v4, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    const-string v2, "app[icon][width]"

    iget-object v3, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget v3, v3, Lio/fabric/sdk/android/services/settings/IconRequest;->width:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    const-string v2, "app[icon][height]"

    iget-object v3, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget v3, v3, Lio/fabric/sdk/android/services/settings/IconRequest;->height:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/Number;)Lio/fabric/sdk/android/services/network/HttpRequest;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 132
    :goto_0
    :try_start_2
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to find app icon with resource ID: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget v5, v5, Lio/fabric/sdk/android/services/settings/IconRequest;->iconResourceId:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    const-string v0, "Failed to close app icon InputStream."

    .line 136
    invoke-static {v1, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_3

    :catchall_1
    move-exception p1

    :goto_2
    const-string p2, "Failed to close app icon InputStream."

    invoke-static {v1, p2}, Lio/fabric/sdk/android/services/common/CommonUtils;->closeOrLog(Ljava/io/Closeable;Ljava/lang/String;)V

    throw p1

    .line 140
    :cond_1
    :goto_3
    iget-object v0, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->sdkKits:Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 141
    iget-object p2, p2, Lio/fabric/sdk/android/services/settings/AppRequestData;->sdkKits:Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/KitInfo;

    .line 142
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->getKitVersionKey(Lio/fabric/sdk/android/KitInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/fabric/sdk/android/KitInfo;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    .line 143
    invoke-virtual {p0, v0}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->getKitBuildTypeKey(Lio/fabric/sdk/android/KitInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/fabric/sdk/android/KitInfo;->getBuildType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->part(Ljava/lang/String;Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpRequest;

    goto :goto_4

    :cond_2
    return-object p1
.end method


# virtual methods
.method getKitBuildTypeKey(Lio/fabric/sdk/android/KitInfo;)Ljava/lang/String;
    .locals 4

    .line 155
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "app[build][libraries][%s][type]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lio/fabric/sdk/android/KitInfo;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method getKitVersionKey(Lio/fabric/sdk/android/KitInfo;)Ljava/lang/String;
    .locals 4

    .line 151
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "app[build][libraries][%s][version]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lio/fabric/sdk/android/KitInfo;->getIdentifier()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Lio/fabric/sdk/android/services/settings/AppRequestData;)Z
    .locals 5

    .line 74
    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->getHttpRequest()Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 75
    invoke-direct {p0, v0, p1}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->applyHeadersTo(Lio/fabric/sdk/android/services/network/HttpRequest;Lio/fabric/sdk/android/services/settings/AppRequestData;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 76
    invoke-direct {p0, v0, p1}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->applyMultipartDataTo(Lio/fabric/sdk/android/services/network/HttpRequest;Lio/fabric/sdk/android/services/settings/AppRequestData;)Lio/fabric/sdk/android/services/network/HttpRequest;

    move-result-object v0

    .line 78
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Sending app info to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/settings/AbstractAppSpiCall;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    iget-object v1, p1, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    if-eqz v1, :cond_0

    .line 80
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "App icon hash is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget-object v4, v4, Lio/fabric/sdk/android/services/settings/IconRequest;->hash:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Fabric"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "App icon size is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget v4, v4, Lio/fabric/sdk/android/services/settings/IconRequest;->width:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lio/fabric/sdk/android/services/settings/AppRequestData;->icon:Lio/fabric/sdk/android/services/settings/IconRequest;

    iget p1, p1, Lio/fabric/sdk/android/services/settings/IconRequest;->height:I

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :cond_0
    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->code()I

    move-result p1

    const-string v1, "POST"

    .line 87
    invoke-virtual {v0}, Lio/fabric/sdk/android/services/network/HttpRequest;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Create"

    goto :goto_0

    :cond_1
    const-string v1, "Update"

    .line 90
    :goto_0
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Fabric"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " app request ID: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "X-REQUEST-ID"

    invoke-virtual {v0, v1}, Lio/fabric/sdk/android/services/network/HttpRequest;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Result was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    invoke-static {p1}, Lio/fabric/sdk/android/services/common/ResponseParser;->parse(I)I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
