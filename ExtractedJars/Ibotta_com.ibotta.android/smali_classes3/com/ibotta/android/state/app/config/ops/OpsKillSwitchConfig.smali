.class public Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;
.super Ljava/lang/Object;
.source "OpsKillSwitchConfig.java"


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;


# instance fields
.field private killSwitches:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;-><init>()V

    sput-object v0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    .line 16
    sget-object v0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->getKillSwitches()Ljava/util/Map;

    move-result-object v0

    const-string v1, "ibotta_tracking"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->killSwitches:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getKillSwitches()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->killSwitches:Ljava/util/Map;

    return-object v0
.end method

.method public setKillSwitches(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->killSwitches:Ljava/util/Map;

    return-void
.end method
