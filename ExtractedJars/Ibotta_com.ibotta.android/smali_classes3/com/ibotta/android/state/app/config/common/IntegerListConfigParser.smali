.class public Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "IntegerListConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "Ljava/util/ArrayList<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/SharedPreferences;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/content/SharedPreferences;",
            ")V"
        }
    .end annotation

    .line 17
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 10
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->parseJsonValueIntoObject(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method protected parseJsonValueIntoObject(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/common/IntegerListConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Ljava/lang/Integer;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
