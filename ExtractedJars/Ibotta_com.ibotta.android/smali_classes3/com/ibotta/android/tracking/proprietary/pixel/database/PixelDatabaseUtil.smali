.class public Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseUtil;
.super Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;
.source "PixelDatabaseUtil.java"


# static fields
.field private static final classes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    .line 13
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseUtil;->classes:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 16
    new-instance p0, Ljava/io/File;

    const-string v0, "/tmp/ormlite_config_pixel.txt"

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseUtil;->classes:[Ljava/lang/Class;

    invoke-static {p0, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseUtil;->writeConfigFile(Ljava/io/File;[Ljava/lang/Class;)V

    return-void
.end method
