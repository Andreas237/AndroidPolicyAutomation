.class public Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "TrackingClientsConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 15
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    return-object p1
.end method

.method protected bridge synthetic parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfigParser;->parseJsonValueIntoObject(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/tracking/TrackingClientsConfig;

    move-result-object p1

    return-object p1
.end method
