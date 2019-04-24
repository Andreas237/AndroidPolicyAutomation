.class final Lo/dct$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dcx;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/dcy;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Ljava/lang/String;Lo/dcx;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lo/dct$1;->c:Ljava/lang/String;

    iput-object p2, p0, Lo/dct$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/dct$1;->e:Lo/dcy;

    iput-object p4, p0, Lo/dct$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 224
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 225
    new-instance v5, Lo/ddb;

    invoke-direct {v5}, Lo/ddb;-><init>()V

    .line 226
    iget-object v0, p0, Lo/dct$1;->c:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 228
    iget-object v0, p0, Lo/dct$1;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 231
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    new-instance v8, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-direct {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;-><init>()V

    .line 233
    iget-object v0, p0, Lo/dct$1;->e:Lo/dcy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 234
    invoke-static {v4}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    iget-object v1, p0, Lo/dct$1;->e:Lo/dcy;

    iget v1, v1, Lo/dcy;->c:I

    iget-object v2, p0, Lo/dct$1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lo/dct$1;->e:Lo/dcy;

    iget v0, v0, Lo/dcy;->c:I

    invoke-virtual {v8, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setEncryptType(I)V

    goto/16 :goto_0

    .line 238
    :cond_0
    iget-object v0, p0, Lo/dct$1;->d:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 239
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setEncryptType(I)V

    goto/16 :goto_0

    .line 242
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    invoke-virtual {v0, v7, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;

    .line 243
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 244
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 245
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 246
    return-void

    .line 249
    :cond_2
    :try_start_1
    iget-object v0, p0, Lo/dct$1;->e:Lo/dcy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 250
    const v0, 0x30d44

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 251
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 252
    return-void

    .line 254
    :cond_3
    :try_start_2
    iget-object v0, p0, Lo/dct$1;->e:Lo/dcy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-virtual {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v0

    iget-object v1, p0, Lo/dct$1;->e:Lo/dcy;

    iget v1, v1, Lo/dcy;->c:I

    if-eq v0, v1, :cond_4

    .line 255
    const v0, 0x30d44

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 256
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 257
    return-void

    .line 259
    :cond_4
    :try_start_3
    invoke-static {v4}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->getEncryptType()I

    move-result v1

    iget-object v2, p0, Lo/dct$1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwdataaccessmodel/sharedpreference/SharedPreferenceModel;->setValue(Ljava/lang/String;)V

    .line 263
    :goto_0
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v9

    .line 264
    iget-object v0, p0, Lo/dct$1;->b:Ljava/lang/String;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 265
    invoke-interface {v9}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 266
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 267
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 268
    return-void

    .line 270
    :cond_5
    const v0, 0x31128

    :try_start_4
    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 271
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 272
    return-void

    .line 273
    :catch_0
    move-exception v4

    .line 274
    new-instance v5, Lo/ddb;

    invoke-direct {v5}, Lo/ddb;-><init>()V

    .line 275
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 276
    iget-object v0, p0, Lo/dct$1;->a:Lo/dcx;

    invoke-static {v0, v5}, Lo/dct;->a(Lo/dcx;Lo/ddb;)V

    .line 277
    const-string v0, "SharedPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSharedPreference exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    return-void
.end method
