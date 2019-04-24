.class public final Lcom/huawei/wallet/logic/down/BaseCommonContext;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/wallet/logic/down/BaseCommonContext;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->a:Landroid/content/Context;

    .line 22
    return-void
.end method

.method public static d()Lcom/huawei/wallet/logic/down/BaseCommonContext;
    .locals 1

    .line 32
    sget-object v0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->b:Lcom/huawei/wallet/logic/down/BaseCommonContext;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lcom/huawei/wallet/logic/down/BaseCommonContext;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/down/BaseCommonContext;-><init>()V

    sput-object v0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->b:Lcom/huawei/wallet/logic/down/BaseCommonContext;

    .line 36
    :cond_0
    sget-object v0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->b:Lcom/huawei/wallet/logic/down/BaseCommonContext;

    return-object v0
.end method


# virtual methods
.method public d(Landroid/content/Context;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 43
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/BaseCommonContext;->a:Landroid/content/Context;

    goto :goto_0

    .line 49
    :cond_0
    const-string v0, "initBackGround applicationContext init failed! context==null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    goto :goto_0

    .line 54
    :cond_1
    const-string v0, "initBackGround applicationContext init not null!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 56
    :goto_0
    return-void
.end method
