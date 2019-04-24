.class public Lcom/ibotta/android/state/app/config/ObjectConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "ObjectConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "C:",
        "Ljava/lang/Class<",
        "TT;>;>",
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final classType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;",
            "Landroid/content/SharedPreferences;",
            "TC;)V"
        }
    .end annotation

    .line 21
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    .line 22
    iput-object p6, p0, Lcom/ibotta/android/state/app/config/ObjectConfigParser;->classType:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method protected parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ObjectConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/ObjectConfigParser;->classType:Ljava/lang/Class;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
