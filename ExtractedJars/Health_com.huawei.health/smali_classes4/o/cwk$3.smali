.class Lo/cwk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwk;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwk;


# direct methods
.method constructor <init>(Lo/cwk;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 214
    iget-object v0, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->b(Lo/cwk;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cwm;->d(Landroid/content/Context;)V

    .line 217
    :try_start_0
    iget-object v0, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->d(Lo/cwk;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v1}, Lo/cwk;->c(Lo/cwk;)Ljava/io/File;

    move-result-object v1

    const-string v2, "HWFEEDBACKAPI_ZIP_COMMENT_KEY"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cwp;->e(Ljava/util/Collection;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    goto :goto_0

    .line 218
    :catch_0
    move-exception v4

    .line 219
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    :goto_0
    const-wide/16 v0, 0xbb8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 226
    goto :goto_1

    .line 224
    :catch_1
    move-exception v4

    .line 225
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :goto_1
    iget-object v0, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->c(Lo/cwk;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v1}, Lo/cwk;->i(Lo/cwk;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v2}, Lo/cwk;->k(Lo/cwk;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/FeedbackApi;->aesEncryptFile(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->c(Lo/cwk;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    :try_start_2
    iget-object v0, p0, Lo/cwk$3;->e:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->c(Lo/cwk;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "zipFile.delete: success. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 235
    :cond_0
    goto :goto_2

    .line 233
    :catch_2
    move-exception v4

    .line 234
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :cond_1
    :goto_2
    return-void
.end method
