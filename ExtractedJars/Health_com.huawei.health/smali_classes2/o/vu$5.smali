.class Lo/vu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/vu;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/vu;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/vu;Landroid/content/Context;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lo/vu$5;->a:Lo/vu;

    iput-object p2, p0, Lo/vu$5;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 261
    iget-object v0, p0, Lo/vu$5;->e:Landroid/content/Context;

    const-string v1, "20004"

    const-string v2, "key_time_of_assistent"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v4}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lo/vu$5;->a:Lo/vu;

    invoke-static {v2}, Lo/vu;->b(Lo/vu;)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 263
    iget-object v0, p0, Lo/vu$5;->a:Lo/vu;

    invoke-static {v0}, Lo/vu;->c(Lo/vu;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAssistent social broadcast run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 265
    const-string v0, "com.huawei.bone.social.login_expire"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    const-string v0, "bundle_task"

    const/16 v1, 0x76

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 267
    iget-object v0, p0, Lo/vu$5;->e:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 270
    :cond_0
    return-void
.end method
