.class public Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;
.super Landroid/content/ContentProvider;


# static fields
.field private static final ATTR_NAME:Ljava/lang/String; = "name"

.field private static final ATTR_PATH:Ljava/lang/String; = "path"

.field private static final COLUMNS:[Ljava/lang/String;

.field private static final FILEPATH_RES_NAME:Ljava/lang/String; = "scanqrcode_sdk_fp_filepaths"

.field private static final META_DATA_FILE_PROVIDER_PATHS:Ljava/lang/String; = "android.support.FILE_PROVIDER_PATHS"

.field private static final TAG_AUTHORITY:Ljava/lang/String; = "authority"

.field private static final TAG_CACHE_PATH:Ljava/lang/String; = "cache-path"

.field private static final TAG_EXTERNAL:Ljava/lang/String; = "external-path"

.field private static final TAG_FILES_PATH:Ljava/lang/String; = "files-path"

.field private static sCache:Ljava/util/HashMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/qrcode/fileprovider/PathStrategy;>;"
        }
    .end annotation
.end field


# instance fields
.field private mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_display_name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "_size"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->COLUMNS:[Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->sCache:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    .locals 6

    move-object v1, p0

    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    if-eqz v5, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private checkStrategy(Landroid/net/Uri;)Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3

    new-array v2, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method private static copyOf([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    new-array v2, p1, [Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method private static dealWithFind(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/fileprovider/SimplePathStrategy;Ljava/lang/String;)V
    .locals 5

    const/4 v3, 0x0

    const-string v0, "files-path"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    goto :goto_0

    :cond_0
    const-string v0, "cache-path"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v0, "external-path"

    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    :try_start_0
    invoke-virtual {p3, p2, v3}, Lcom/huawei/qrcode/fileprovider/SimplePathStrategy;->addRoot(Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "addroot exception"

    invoke-static {v0}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private static getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;
    .locals 6

    sget-object v3, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->sCache:Ljava/util/HashMap;

    monitor-enter v3

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->sCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/qrcode/fileprovider/PathStrategy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    :try_start_1
    invoke-static {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {v0, v1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception v4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {v0, v1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_0
    sget-object v0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->sCache:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    :goto_1
    return-object v2
.end method

.method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    .locals 3

    invoke-static {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeFileProvider.getUriForFile: authority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " strategy is null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v2, p2}, Lcom/huawei/qrcode/fileprovider/PathStrategy;->getUriForFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private static modeToMode(Ljava/lang/String;)I
    .locals 4

    const-string v0, "r"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v3, 0x10000000

    goto :goto_0

    :cond_0
    const-string v0, "w"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "wt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/high16 v3, 0x2c000000

    goto :goto_0

    :cond_2
    const-string v0, "wa"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/high16 v3, 0x2a000000

    goto :goto_0

    :cond_3
    const-string v0, "rw"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/high16 v3, 0x38000000

    goto :goto_0

    :cond_4
    const-string v0, "rwt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v3, 0x3c000000    # 0.0078125f

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    return v3
.end method

.method private static parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Lcom/huawei/qrcode/fileprovider/SimplePathStrategy;

    invoke-direct {v2, p1}, Lcom/huawei/qrcode/fileprovider/SimplePathStrategy;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    const-string v0, "ScanQrcodeFileProvider parsePathStrategy context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "scanqrcode_sdk_fp_filepaths"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getXmlId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_2

    const-string v0, "ScanQrcodeFileProvider filePathId."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v8

    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    const-string v0, "ScanQrcodeFileProvider parsePathStrategy in is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_3
    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v9

    :goto_0
    const/4 v0, 0x1

    if-eq v9, v0, :cond_7

    const/4 v0, 0x2

    if-ne v9, v0, :cond_5

    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v0, "authority"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "name"

    const/4 v1, 0x0

    invoke-interface {v8, v1, v0}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    if-eqz v6, :cond_6

    const-string v0, "name"

    const/4 v1, 0x0

    invoke-interface {v8, v1, v0}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "path"

    const/4 v1, 0x0

    invoke-interface {v8, v1, v0}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v4, v2, v3}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->dealWithFind(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/fileprovider/SimplePathStrategy;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x3

    if-ne v9, v0, :cond_6

    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v0, "authority"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    invoke-interface {v8}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v9

    goto/16 :goto_0

    :cond_7
    :goto_2
    return-object v2
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Provider must not be exported"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Provider must grant uri permissions"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/fileprovider/PathStrategy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    return-void
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->checkStrategy(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeFileProvider.delete: uri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " strategy is null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/fileprovider/PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 6

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->checkStrategy(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeFileProvider.getType: uri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " strategy is null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const-string v0, "application/octet-stream"

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/fileprovider/PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ltz v3, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    return-object v5

    :cond_1
    const-string v0, "application/octet-stream"

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No external inserts"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreate()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->checkStrategy(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "no found file"

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/fileprovider/PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v2

    invoke-static {p2}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->modeToMode(Ljava/lang/String;)I

    move-result v3

    invoke-static {v2, v3}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 11

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->checkStrategy(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeFileProvider.query: uri: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " strategy is null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    new-instance v0, Landroid/database/MatrixCursor;

    sget-object v1, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->COLUMNS:[Ljava/lang/String;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->mStrategy:Lcom/huawei/qrcode/fileprovider/PathStrategy;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/fileprovider/PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v3

    if-nez p2, :cond_1

    sget-object p2, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->COLUMNS:[Ljava/lang/String;

    :cond_1
    array-length v0, p2

    new-array v4, v0, [Ljava/lang/String;

    array-length v0, p2

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    move-object v7, p2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    const-string v0, "_display_name"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "_display_name"

    aput-object v0, v4, v6

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    goto :goto_1

    :cond_2
    const-string v0, "_size"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "_size"

    aput-object v0, v4, v6

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    :cond_3
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v4, v6}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v6}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    new-instance v7, Landroid/database/MatrixCursor;

    const/4 v0, 0x1

    invoke-direct {v7, v4, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    invoke-virtual {v7, v5}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    return-object v7
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No external updates"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
