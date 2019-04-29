.class final Lcom/google/android/gms/tagmanager/zzbr;
.super Ljava/lang/Object;


# direct methods
.method private static version()I
    .locals 3

    :try_start_0
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-string v0, "Invalid version number: "

    sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method static zzdb(Ljava/lang/String;)Z
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzbr;->version()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v1}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v0, v1, v1}, Ljava/io/File;->setWritable(ZZ)Z

    const/4 p0, 0x1

    invoke-virtual {v0, p0, p0}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v0, p0, p0}, Ljava/io/File;->setWritable(ZZ)Z

    return p0
.end method
