.class final enum Lcom/ibotta/android/state/app/config/ConfigParserType$28;
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

    .line 395
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/state/app/config/ConfigParserType;-><init>(Ljava/lang/String;ILcom/ibotta/android/state/app/config/ConfigParserType$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ConfigParser;
    .locals 0

    .line 395
    invoke-virtual/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/ConfigParserType$28;->createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;

    move-result-object p1

    return-object p1
.end method

.method public createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;
    .locals 7

    .line 403
    new-instance v6, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;

    move-object v4, p4

    check-cast v4, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;Landroid/content/SharedPreferences;)V

    return-object v6
.end method
