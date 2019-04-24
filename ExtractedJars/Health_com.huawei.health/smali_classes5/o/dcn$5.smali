.class Lo/dcn$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/dcx;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/dcn;

.field final synthetic e:Lo/dcy;


# direct methods
.method constructor <init>(Lo/dcn;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lo/dcn$5;->d:Lo/dcn;

    iput-object p2, p0, Lo/dcn$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/dcn$5;->c:Ljava/lang/String;

    iput-object p4, p0, Lo/dcn$5;->e:Lo/dcy;

    iput-object p5, p0, Lo/dcn$5;->b:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 175
    iget-object v4, p0, Lo/dcn$5;->a:Ljava/lang/String;

    .line 176
    new-instance v5, Lo/ddb;

    invoke-direct {v5}, Lo/ddb;-><init>()V

    .line 177
    iget-object v0, p0, Lo/dcn$5;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dcn$5;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 178
    :cond_0
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "key or value is null so return PARAMS_ERROR."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const v0, 0x30d44

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    goto/16 :goto_2

    .line 183
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/dcn$5;->e:Lo/dcy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dcn$5;->e:Lo/dcy;

    iget v0, v0, Lo/dcy;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 184
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    iget-object v1, p0, Lo/dcn$5;->e:Lo/dcy;

    iget v1, v1, Lo/dcy;->c:I

    iget-object v2, p0, Lo/dcn$5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 186
    :cond_2
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storageParams is not encryptDataType."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const v0, 0x30d44

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    :goto_0
    goto :goto_1

    .line 189
    :catch_0
    move-exception v6

    .line 190
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEncryptValue encryptData error."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 195
    :goto_1
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 196
    const-string v0, "key"

    iget-object v1, p0, Lo/dcn$5;->c:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "value"

    invoke-virtual {v6, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    iget-object v0, p0, Lo/dcn$5;->d:Lo/dcn;

    iget-object v1, p0, Lo/dcn$5;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dcn;->d(Lo/dcn;Ljava/lang/String;)I

    .line 200
    iget-object v0, p0, Lo/dcn$5;->d:Lo/dcn;

    const-string v1, "keyvaldb"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v6}, Lo/dcn;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v7

    .line 201
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_3

    const-wide/32 v0, 0x31128

    cmp-long v0, v7, v0

    if-eqz v0, :cond_3

    .line 202
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEncryptValue success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    goto :goto_2

    .line 205
    :cond_3
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEncryptValue failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 210
    :goto_2
    iget-object v0, p0, Lo/dcn$5;->b:Lo/dcx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 211
    iget-object v0, p0, Lo/dcn$5;->b:Lo/dcx;

    invoke-interface {v0, v5}, Lo/dcx;->onProcessed(Lo/ddb;)V

    .line 213
    :cond_4
    return-void
.end method
