.class public Lcom/ibotta/android/state/app/config/category/CategorySettingsConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "CategorySettingsConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 19
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;

    return-object p1
.end method

.method protected bridge synthetic parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/category/CategorySettingsConfigParser;->parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/category/CategorySettingsConfig;

    move-result-object p1

    return-object p1
.end method
