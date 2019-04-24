.class final Lo/dct$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dct;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dcx;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lo/dct$4;->d:Ljava/lang/String;

    iput-object p2, p0, Lo/dct$4;->c:Ljava/lang/String;

    iput-object p3, p0, Lo/dct$4;->b:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 320
    :try_start_0
    new-instance v4, Lo/ddb;

    invoke-direct {v4}, Lo/ddb;-><init>()V

    .line 321
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 322
    iget-object v0, p0, Lo/dct$4;->d:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 323
    iget-object v0, p0, Lo/dct$4;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 324
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-virtual {v0, v7, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    .line 325
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 326
    const-string v0, ""

    invoke-virtual {v4, v0}, Lo/ddb;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 328
    :cond_0
    invoke-static {v5}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/ddb;->a(Ljava/lang/Object;)V

    .line 331
    :goto_0
    iget-object v0, p0, Lo/dct$4;->b:Lo/dcx;

    invoke-static {v0, v4}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    goto :goto_1

    .line 332
    :catch_0
    move-exception v4

    .line 333
    new-instance v5, Lo/ddb;

    invoke-direct {v5}, Lo/ddb;-><init>()V

    .line 334
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 335
    iget-object v0, p0, Lo/dct$4;->b:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V

    .line 336
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSharedPreference async exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :goto_1
    return-void
.end method
