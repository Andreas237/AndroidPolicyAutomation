.class public Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;
.super Landroid/content/ContentProvider;


# static fields
.field public static final AUTHORITIES_SUFFIX:Ljava/lang/String; = ".updateSdk.fileProvider"

.field private static final COLUMNS:[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "UpdateSdkFileProvider"

.field private static mWStrategy:Lcom/huawei/updatesdk/fileprovider/a; = null


# instance fields
.field private authority:Ljava/lang/String;


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

    sput-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->COLUMNS:[Ljava/lang/String;

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

.method private static declared-synchronized createWiseDistPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/fileprovider/a;
    .locals 6

    const-class v5, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;

    monitor-enter v5

    :try_start_0
    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/updatesdk/fileprovider/b;

    invoke-direct {v0, p1}, Lcom/huawei/updatesdk/fileprovider/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "/"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    const-string v1, "updatesdkapk"

    invoke-interface {v0, v1, v4}, Lcom/huawei/updatesdk/fileprovider/a;->a(Ljava/lang/String;Ljava/io/File;)V

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    .locals 1

    invoke-static {p0, p1}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->createWiseDistPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/fileprovider/a;

    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    invoke-interface {v0, p2}, Lcom/huawei/updatesdk/fileprovider/a;->a(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "WiseDist Provider must not be exported"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "WiseDist Provider must grant uri permissions"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->authority:Ljava/lang/String;

    iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->createWiseDistPathStrategy(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/fileprovider/a;

    return-void
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "No external updates"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    const-string v1, "apk"

    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
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

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :cond_2
    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    invoke-interface {v0, p1}, Lcom/huawei/updatesdk/fileprovider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "apk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "UpdateSdkFileProvider"

    const-string v1, "can not open this file."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_3
    const/high16 v3, 0x10000000

    const/high16 v0, 0x10000000

    invoke-static {v2, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 11

    sget-object v0, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->mWStrategy:Lcom/huawei/updatesdk/fileprovider/a;

    invoke-interface {v0, p1}, Lcom/huawei/updatesdk/fileprovider/a;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v3

    if-nez p2, :cond_0

    sget-object p2, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->COLUMNS:[Ljava/lang/String;

    :cond_0
    array-length v0, p2

    new-array v4, v0, [Ljava/lang/String;

    array-length v0, p2

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    move-object v7, p2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    const-string v0, "_display_name"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "_display_name"

    aput-object v0, v4, v6

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    goto :goto_1

    :cond_1
    const-string v0, "_size"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "_size"

    aput-object v0, v4, v6

    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    :cond_2
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v4, v6}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v6}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

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
