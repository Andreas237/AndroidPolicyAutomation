.class public Lcom/huawei/nfc/util/WalletPluginClassUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "WalletPluginClassUtil"

.field private static dexPath:Ljava/lang/String; = null

.field private static sEzPlugin:Lo/eaj; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->dexPath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPluginInfo()Lo/eav;
    .locals 2

    .line 44
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    const-string v1, "33755b54-1155-4f9c-89e5-09dbe46d3388"

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    return-object v0
.end method

.method public static isPluginAvailable()Z
    .locals 2

    .line 40
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    const-string v1, "33755b54-1155-4f9c-89e5-09dbe46d3388"

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static loadPlugin()V
    .locals 5

    .line 52
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    const-string v1, "33755b54-1155-4f9c-89e5-09dbe46d3388"

    invoke-virtual {v0, v1}, Lo/eaw;->d(Ljava/lang/String;)Lo/eaj;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    .line 53
    sget-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    iget-object v0, v0, Lo/eaj;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    iget-object v1, v1, Lo/eaj;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 55
    const-string v0, "WalletPluginClassUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEX_PATH_PREIX = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "wallet_for_plugin_release.dex"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->dexPath:Ljava/lang/String;

    .line 60
    const-string v0, "WalletPluginClassUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DEX_PATH = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/huawei/nfc/util/WalletPluginClassUtil;->dexPath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :cond_0
    return-void
.end method

.method public static releasePlugin()V
    .locals 2

    .line 65
    sget-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 66
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    sget-object v1, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    invoke-virtual {v0, v1}, Lo/eaw;->d(Lo/eaj;)V

    .line 67
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/util/WalletPluginClassUtil;->sEzPlugin:Lo/eaj;

    .line 69
    :cond_0
    return-void
.end method

.method public static updateDescription(Lo/eaz;)V
    .locals 2

    .line 72
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    const-string v1, "33755b54-1155-4f9c-89e5-09dbe46d3388"

    invoke-virtual {v0, v1, p0}, Lo/eaw;->a(Ljava/lang/String;Lo/eaz;)V

    .line 73
    return-void
.end method

.method public static updatePlugin(Lo/eaz;)V
    .locals 2

    .line 48
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    const-string v1, "33755b54-1155-4f9c-89e5-09dbe46d3388"

    invoke-virtual {v0, v1, p0}, Lo/eaw;->d(Ljava/lang/String;Lo/eaz;)V

    .line 49
    return-void
.end method
