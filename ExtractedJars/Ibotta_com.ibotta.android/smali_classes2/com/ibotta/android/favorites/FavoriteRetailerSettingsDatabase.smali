.class public interface abstract Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabase;
.super Ljava/lang/Object;
.source "FavoriteRetailerSettingsDatabase.java"


# virtual methods
.method public abstract deleteEverything()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findFavoriteRetailerSettings()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract release()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract saveFavoriteRetailerSetting(Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract updateAfterFlush(Ljava/util/List;JZI)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;JZI)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/favorites/FavoriteRetailerSettingsDatabaseFatalException;
        }
    .end annotation
.end method
