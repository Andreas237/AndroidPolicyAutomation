.class public final Lcom/yandex/metrica/impl/as$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x8

    .line 54
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "/sbin/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "/system/bin/"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "/system/xbin/"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "/data/local/xbin/"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "/data/local/bin/"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "/system/sd/xbin/"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "/system/bin/failsafe/"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "/data/local/"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/yandex/metrica/impl/as$b;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a()Z
    .locals 2

    .line 69
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "/system/app/Superuser.apk"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()Z
    .locals 7

    .line 81
    sget-object v0, Lcom/yandex/metrica/impl/as$b;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .line 83
    :try_start_0
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "su"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static c()I
    .locals 1

    .line 95
    invoke-static {}, Lcom/yandex/metrica/impl/as$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/yandex/metrica/impl/as$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
