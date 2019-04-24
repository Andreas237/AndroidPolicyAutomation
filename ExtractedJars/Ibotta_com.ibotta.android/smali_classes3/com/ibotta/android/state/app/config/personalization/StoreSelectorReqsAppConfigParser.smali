.class public Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "StoreSelectorReqsAppConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 21
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-object p1
.end method

.method protected bridge synthetic parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfigParser;->parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    move-result-object p1

    return-object p1
.end method
