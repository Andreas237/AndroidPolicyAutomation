.class Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;
.super Ljava/lang/Object;
.source "SQLiteFavoriteRetailerSettingsDatabase.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

.field final synthetic val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;


# direct methods
.method constructor <init>(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->this$0:Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

    iput-object p2, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->this$0:Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

    .line 130
    invoke-static {v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->access$000(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v0

    const-string v1, "retailerId"

    iget-object v2, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 134
    invoke-virtual {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/Where;->queryForFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    if-eqz v0, :cond_0

    .line 139
    iget-object v1, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-virtual {v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->isFavorited()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavorited(Z)V

    .line 140
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setUpdatedAt(Ljava/util/Date;)V

    .line 141
    iget-object v1, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->this$0:Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

    invoke-static {v1}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->access$000(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;

    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setUpdatedAt(Ljava/util/Date;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->this$0:Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;

    invoke-static {v0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;->access$000(Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->val$favoriteRetailerSetting:Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/favorites/SQLiteFavoriteRetailerSettingsDatabase$1;->call()Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    move-result-object v0

    return-object v0
.end method
