.class public Lo/dnw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dny;
.implements Lo/dnx;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dnw$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/dod$b;

.field private c:Lo/dnw$d;

.field private d:Lo/dod$e;

.field private e:Lcom/huawei/up/model/UserInfomation;

.field private f:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnw;->e:Lcom/huawei/up/model/UserInfomation;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnw;->d:Lo/dod$e;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnw;->b:Lo/dod$b;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    .line 149
    new-instance v0, Lo/dnw$1;

    invoke-direct {v0, p0}, Lo/dnw$1;-><init>(Lo/dnw;)V

    iput-object v0, p0, Lo/dnw;->f:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lo/dnw;)Lo/dod$e;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dnw;->d:Lo/dod$e;

    return-object v0
.end method

.method static synthetic b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dnw;->e:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method static synthetic c(Lo/dnw;)Lo/dod$b;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dnw;->b:Lo/dod$b;

    return-object v0
.end method

.method static synthetic d(Lo/dnw;)Lo/dnw$d;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    return-object v0
.end method

.method static synthetic e(Lo/dnw;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 146
    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    invoke-virtual {v0}, Lo/dnw$d;->c()Z

    move-result v0

    return v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    .line 371
    return-void
.end method

.method public c()V
    .locals 2

    .line 374
    iget-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dnw;->f:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 375
    return-void
.end method

.method public c(Landroid/os/Message;)V
    .locals 7

    .line 62
    iget v5, p1, Landroid/os/Message;->what:I

    .line 63
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    .line 65
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lo/dnw;->e:Lcom/huawei/up/model/UserInfomation;

    .line 67
    iget-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    invoke-virtual {v0}, Lo/dog;->c()Lo/dod$e;

    move-result-object v0

    iput-object v0, p0, Lo/dnw;->d:Lo/dod$e;

    .line 68
    iget-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dog;->c(Landroid/content/Context;)Lo/dog;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dog;->d(I)Lo/dod$b;

    move-result-object v0

    iput-object v0, p0, Lo/dnw;->b:Lo/dod$b;

    .line 69
    iget-object v0, p0, Lo/dnw;->d:Lo/dod$e;

    invoke-interface {v0}, Lo/dod$e;->c()V

    .line 70
    iget-object v0, p0, Lo/dnw;->b:Lo/dod$b;

    invoke-interface {v0}, Lo/dod$b;->e()V

    .line 71
    iget-object v0, p0, Lo/dnw;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dnw;->f:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.huawei.hihealth.action_sync_data"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v3, "com.huawei.hihealth.DEFAULT_PERMISSION"

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 73
    new-instance v6, Lo/dnw$3;

    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    invoke-direct {v6, p0, v0, v5}, Lo/dnw$3;-><init>(Lo/dnw;Landroid/os/Handler;I)V

    .line 88
    new-instance v0, Lo/dnw$4;

    invoke-direct {v0, p0, v6}, Lo/dnw$4;-><init>(Lo/dnw;Lo/doi;)V

    invoke-virtual {v6, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 116
    new-instance v0, Lo/dnw$5;

    invoke-direct {v0, p0, v6}, Lo/dnw$5;-><init>(Lo/dnw;Lo/doi;)V

    invoke-virtual {v6, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 141
    invoke-virtual {v6}, Lo/doi;->b()V

    .line 142
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 57
    new-instance v0, Lo/dnw$d;

    invoke-direct {v0, p0, p1}, Lo/dnw$d;-><init>(Lo/dnw;Landroid/content/Context;)V

    iput-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    .line 58
    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    invoke-virtual {v0, p1}, Lo/dnw$d;->c(Landroid/content/Context;)V

    .line 59
    return-void
.end method

.method public e()Lcom/huawei/up/model/UserInfomation;
    .locals 2

    .line 245
    iget-object v0, p0, Lo/dnw;->e:Lcom/huawei/up/model/UserInfomation;

    iget-object v1, p0, Lo/dnw;->e:Lcom/huawei/up/model/UserInfomation;

    invoke-static {v0, v1}, Lo/dos;->e(Ljava/lang/Object;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 6

    .line 255
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget v4, p1, Landroid/os/Message;->what:I

    .line 258
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->transSelf2METRIC()V

    .line 260
    new-instance v5, Lo/dnw$2;

    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    invoke-direct {v5, p0, v0, v4, p3}, Lo/dnw$2;-><init>(Lo/dnw;Landroid/os/Handler;ILo/dod$b$d;)V

    .line 277
    new-instance v0, Lo/dnw$6;

    invoke-direct {v0, p0, p2, v5}, Lo/dnw$6;-><init>(Lo/dnw;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 298
    new-instance v0, Lo/dnw$9;

    invoke-direct {v0, p0, v5, p2}, Lo/dnw$9;-><init>(Lo/dnw;Lo/doi;Lcom/huawei/up/model/UserInfomation;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 342
    new-instance v0, Lo/dnw$7;

    invoke-direct {v0, p0, p2, v5}, Lo/dnw$7;-><init>(Lo/dnw;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 357
    invoke-virtual {v5}, Lo/doi;->b()V

    .line 358
    return-void
.end method

.method public e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 4

    .line 249
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lo/dnw;->c:Lo/dnw$d;

    invoke-virtual {v0, p1, p2}, Lo/dnw$d;->c(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 252
    return-void
.end method
