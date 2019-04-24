.class public Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseUtil;
.super Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;
.source "FavoriteRetailerSettingsDatabaseUtil.java"


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

    .line 15
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseUtil;->classes:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
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

    .line 20
    new-instance p0, Ljava/io/File;

    const-string v0, "/tmp/ormlite_config_favorite_retailer_settings.txt"

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseUtil;->classes:[Ljava/lang/Class;

    invoke-static {p0, v0}, Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseUtil;->writeConfigFile(Ljava/io/File;[Ljava/lang/Class;)V

    return-void
.end method
