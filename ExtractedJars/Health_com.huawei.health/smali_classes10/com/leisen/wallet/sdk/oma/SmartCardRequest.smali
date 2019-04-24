.class Lcom/leisen/wallet/sdk/oma/SmartCardRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final MAIN_CHANNEL:I = 0x0

.field private static final TAG:Ljava/lang/String; = "SmartCardRequest"


# instance fields
.field private mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

.field private mFlag:I

.field private mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    .line 21
    return-void
.end method

.method private executeApduCmd(Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->getCommand()Ljava/lang/String;

    move-result-object v4

    .line 53
    move-object v5, p1

    .line 54
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " executeApduCmd channelTypeStr : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff0ccommand \uff1a"

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
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    const-string v1, "executeApduCmd param is null "

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operFailure(ILjava/lang/String;)V

    .line 58
    return-void

    .line 60
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v6

    .line 61
    invoke-virtual {v6}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/PluginPayAdapter;

    .line 62
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 63
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    const-string v1, "executeApduCmd param is null "

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operFailure(ILjava/lang/String;)V

    .line 64
    return-void

    .line 66
    :cond_2
    invoke-interface {v7, v5, v4}, Lcom/huawei/nfc/PluginPayAdapter;->sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 67
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6267\u884cAPDU:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff0c\u8fd4\u56de\u7684RAPDU\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    invoke-direct {p0, v0, v8}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operSuccess(ILjava/lang/String;)V

    .line 69
    return-void
.end method

.method private openCurrentAvailableChannel(Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    .line 75
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openCurrentAvailableChannel aid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , channelType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const-string v4, ""

    .line 77
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v5

    .line 78
    invoke-virtual {v5}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/PluginPayAdapter;

    .line 79
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 80
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    const-string v1, "openCurrentAvailableChannel param is null "

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operFailure(ILjava/lang/String;)V

    .line 81
    return-object v4

    .line 83
    :cond_0
    invoke-interface {v6, p1, p2}, Lcom/huawei/nfc/PluginPayAdapter;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v7

    .line 84
    const-string v0, "channelID"

    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 85
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6253\u5f00\u901a\u9053channel \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-object v4
.end method

.method private operFailure(ILjava/lang/String;)V
    .locals 5

    .line 122
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " operFailure :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    if-eqz v0, :cond_0

    .line 124
    new-instance v4, Ljava/lang/Error;

    invoke-direct {v4, p2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    invoke-interface {v0, p1, v4}, Lcom/leisen/wallet/sdk/oma/SmartCardCallback;->onOperFailure(ILjava/lang/Error;)V

    .line 127
    :cond_0
    return-void
.end method

.method private operSuccess(ILjava/lang/String;)V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    invoke-interface {v0, p1, p2}, Lcom/leisen/wallet/sdk/oma/SmartCardCallback;->onOperSuccess(ILjava/lang/String;)V

    .line 113
    :cond_0
    return-void
.end method


# virtual methods
.method public closeChannelAndSession()V
    .locals 6

    .line 93
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeChannelAndSession"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v4

    .line 95
    invoke-virtual {v4}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/PluginPayAdapter;

    .line 96
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 97
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    const-string v1, "closeChannelAndSession param is null "

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operFailure(ILjava/lang/String;)V

    .line 98
    return-void

    .line 100
    :cond_0
    invoke-interface {v5}, Lcom/huawei/nfc/PluginPayAdapter;->closeChannel()V

    .line 101
    return-void
.end method

.method public run()V
    .locals 6

    .line 37
    iget-object v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    invoke-virtual {v0}, Lcom/leisen/wallet/sdk/oma/SmartCardBean;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->openCurrentAvailableChannel(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 38
    const-string v0, "SmartCardRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " run openResult : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    :cond_0
    return-void

    .line 44
    :cond_1
    :try_start_0
    invoke-direct {p0, v4}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->executeApduCmd(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_0

    .line 45
    :catch_0
    move-exception v5

    .line 46
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->closeChannelAndSession()V

    .line 47
    iget v0, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "execute apdu error\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->operFailure(ILjava/lang/String;)V

    .line 49
    :goto_0
    return-void
.end method

.method public setFlag(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mFlag:I

    .line 33
    return-void
.end method

.method public setSmartCardCallback(Lcom/leisen/wallet/sdk/oma/SmartCardCallback;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mCallback:Lcom/leisen/wallet/sdk/oma/SmartCardCallback;

    .line 29
    return-void
.end method

.method public setSmartCartBean(Lcom/leisen/wallet/sdk/oma/SmartCardBean;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/leisen/wallet/sdk/oma/SmartCardRequest;->mSmartCardBean:Lcom/leisen/wallet/sdk/oma/SmartCardBean;

    .line 25
    return-void
.end method
