.class final enum Lcom/ibotta/android/state/app/config/ConfigParserType$16;
.super Lcom/ibotta/android/state/app/config/ConfigParserType;
.source "ConfigParserType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/ConfigParserType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 240
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/state/app/config/ConfigParserType;-><init>(Ljava/lang/String;ILcom/ibotta/android/state/app/config/ConfigParserType$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ConfigParser;
    .locals 0

    .line 240
    invoke-virtual/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/ConfigParserType$16;->createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;

    move-result-object p1

    return-object p1
.end method

.method public createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;
    .locals 9

    .line 248
    new-instance v8, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;

    move-object v4, p4

    check-cast v4, Ljava/util/List;

    sget-object p4, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 254
    invoke-virtual {p4, v0, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v6

    new-instance v7, Lcom/ibotta/android/util/SemverFactory;

    invoke-direct {v7}, Lcom/ibotta/android/util/SemverFactory;-><init>()V

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;Lcom/ibotta/android/util/SemverFactory;)V

    return-object v8
.end method
