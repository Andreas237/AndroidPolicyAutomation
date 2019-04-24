.class Lo/dcn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dcx;

.field final synthetic b:Lo/dcn;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dcn;Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/dcn$4;->b:Lo/dcn;

    iput-object p2, p0, Lo/dcn$4;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/dcn$4;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/dcn$4;->a:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 125
    iget-object v4, p0, Lo/dcn$4;->d:Ljava/lang/String;

    .line 126
    new-instance v5, Lo/ddb;

    invoke-direct {v5}, Lo/ddb;-><init>()V

    .line 127
    iget-object v0, p0, Lo/dcn$4;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/dcn$4;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 128
    :cond_0
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "key or value is null so return PARAMS_ERROR."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const v0, 0x30d44

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    goto/16 :goto_1

    .line 131
    :cond_1
    const-string v0, "server_token"

    iget-object v1, p0, Lo/dcn$4;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "STCODE="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v1

    iget-object v2, p0, Lo/dcn$4;->d:Ljava/lang/String;

    const/16 v3, 0xe

    invoke-virtual {v1, v3, v2}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 137
    goto :goto_0

    .line 135
    :catch_0
    move-exception v6

    .line 136
    const-string v0, "setValue encryptData exception ="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :cond_2
    :goto_0
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 141
    const-string v0, "key"

    iget-object v1, p0, Lo/dcn$4;->e:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "value"

    invoke-virtual {v6, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lo/dcn$4;->b:Lo/dcn;

    iget-object v1, p0, Lo/dcn$4;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dcn;->d(Lo/dcn;Ljava/lang/String;)I

    .line 144
    iget-object v0, p0, Lo/dcn$4;->b:Lo/dcn;

    const-string v1, "keyvaldb"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v6}, Lo/dcn;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v7

    .line 145
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_3

    const-wide/32 v0, 0x31128

    cmp-long v0, v7, v0

    if-eqz v0, :cond_3

    .line 146
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    goto :goto_1

    .line 149
    :cond_3
    const-string v0, "KeyValDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const v0, 0x31128

    invoke-virtual {v5, v0}, Lo/ddb;->e(I)V

    .line 154
    :goto_1
    iget-object v0, p0, Lo/dcn$4;->a:Lo/dcx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 155
    iget-object v0, p0, Lo/dcn$4;->a:Lo/dcx;

    invoke-interface {v0, v5}, Lo/dcx;->onProcessed(Lo/ddb;)V

    .line 157
    :cond_4
    return-void
.end method
