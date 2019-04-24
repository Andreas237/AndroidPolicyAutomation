.class public Lcom/shopkick/app/application/BundleFiles;
.super Ljava/lang/Object;
.source "BundleFiles.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;
    }
.end annotation


# instance fields
.field private assetManager:Landroid/content/res/AssetManager;

.field private context:Landroid/content/Context;

.field private packageAppPath:Ljava/lang/String;

.field private packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/application/BundleFiles;->packageName:Ljava/lang/String;

    .line 57
    iput-object p2, p0, Lcom/shopkick/app/application/BundleFiles;->context:Landroid/content/Context;

    .line 58
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/BundleFiles;->assetManager:Landroid/content/res/AssetManager;

    .line 60
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/application/BundleFiles;->packageAppPath:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "Unknown"

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/application/BundleFiles;->packageAppPath:Ljava/lang/String;

    :goto_0
    return-void
.end method


# virtual methods
.method public getFileDescriptor(Ljava/lang/String;)Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;
    .locals 11

    const/4 v0, 0x0

    .line 76
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/application/BundleFiles;->assetManager:Landroid/content/res/AssetManager;

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 78
    :try_start_1
    new-instance v10, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;

    iget-object v4, p0, Lcom/shopkick/app/application/BundleFiles;->packageAppPath:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v6

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v8

    move-object v2, v10

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/application/BundleFiles$BundleFileDescriptor;-><init>(Lcom/shopkick/app/application/BundleFiles;Ljava/lang/String;Ljava/lang/String;JJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v10

    :cond_0
    if-eqz v1, :cond_1

    .line 85
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_2

    :catch_0
    move-object v1, v0

    .line 81
    :catch_1
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The bundle file "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " could not be found"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_1

    goto :goto_0

    :catch_2
    :cond_1
    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    :goto_2
    if-eqz v1, :cond_2

    .line 85
    :try_start_4
    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 87
    :catch_3
    :cond_2
    throw p1
.end method

.method public open(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/application/BundleFiles;->assetManager:Landroid/content/res/AssetManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
