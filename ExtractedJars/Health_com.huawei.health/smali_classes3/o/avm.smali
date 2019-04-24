.class public Lo/avm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lo/auu$b;

.field protected b:Ljava/lang/String;

.field protected c:Z

.field protected d:J

.field protected e:I

.field protected f:Landroid/content/Intent;

.field protected h:Ljava/lang/String;

.field protected i:Lo/aye;

.field protected k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Lo/aye;

    invoke-direct {v0}, Lo/aye;-><init>()V

    iput-object v0, p0, Lo/avm;->i:Lo/aye;

    .line 83
    iput-object p1, p0, Lo/avm;->b:Ljava/lang/String;

    .line 84
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .line 136
    return-void
.end method

.method protected a(Landroid/content/Context;)V
    .locals 0

    .line 153
    return-void
.end method

.method protected a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 242
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->b()Landroid/app/Activity;

    move-result-object v2

    .line 243
    if-eqz v2, :cond_0

    .line 245
    invoke-virtual {v2}, Landroid/app/Activity;->getTaskId()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lo/avm;->e(Landroid/content/Context;I)V

    .line 246
    invoke-virtual {p0, p2}, Lo/avm;->a(Landroid/content/Intent;)V

    .line 249
    :try_start_0
    invoke-virtual {v2, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    goto :goto_0

    .line 251
    :catch_0
    move-exception v3

    .line 253
    const-string v0, ""

    const-string v1, "use current Activity to startActivity meet ActivityNotFoundException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    goto :goto_0

    .line 258
    :cond_0
    invoke-virtual {p0, p2}, Lo/avm;->b(Landroid/content/Intent;)V

    .line 261
    :try_start_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 266
    goto :goto_0

    .line 263
    :catch_1
    move-exception v3

    .line 265
    const-string v0, ""

    const-string v1, "use new Task to startActivity meet ActivityNotFoundException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    :goto_0
    return-void
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 1

    .line 190
    const/high16 v0, 0x4000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 191
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/avm;->h:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 118
    iput p1, p0, Lo/avm;->e:I

    .line 119
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    .line 169
    return-void
.end method

.method protected b(Landroid/content/Intent;)V
    .locals 1

    .line 179
    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 180
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/avm;->k:Ljava/lang/String;

    .line 129
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    .line 226
    iget-object v0, p0, Lo/avm;->i:Lo/aye;

    iget-object v1, p0, Lo/avm;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aye;->c(Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lo/avm;->i:Lo/aye;

    iget-object v1, p0, Lo/avm;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aye;->a(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lo/avm;->i:Lo/aye;

    iget v1, p0, Lo/avm;->e:I

    invoke-virtual {v0, v1}, Lo/aye;->b(I)V

    .line 229
    iget-object v0, p0, Lo/avm;->i:Lo/aye;

    iget-object v1, p0, Lo/avm;->f:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lo/aye;->e(Landroid/content/Intent;)V

    .line 231
    iget-object v0, p0, Lo/avm;->i:Lo/aye;

    invoke-static {p1, v0}, Lo/auw;->d(Landroid/content/Context;Lo/aye;)Lo/auw;

    move-result-object v2

    .line 232
    invoke-virtual {v2}, Lo/auw;->e()V

    .line 233
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 5

    .line 93
    invoke-virtual {p0}, Lo/avm;->a()V

    .line 94
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v3

    .line 95
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/avm;->c:Z

    .line 98
    iget-wide v0, p0, Lo/avm;->d:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    .line 100
    invoke-virtual {p0, p1}, Lo/avm;->e(Landroid/content/Context;)V

    .line 101
    invoke-virtual {p0, p1}, Lo/avm;->a(Landroid/content/Context;)V

    .line 103
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 0

    .line 143
    return-void
.end method

.method protected e(Landroid/content/Context;)V
    .locals 0

    .line 160
    return-void
.end method

.method protected e(Landroid/content/Context;I)V
    .locals 2

    .line 215
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/ActivityManager;

    .line 216
    const/4 v0, 0x1

    invoke-virtual {v1, p2, v0}, Landroid/app/ActivityManager;->moveTaskToFront(II)V

    .line 217
    return-void
.end method

.method protected f()V
    .locals 5

    .line 198
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/health/sns/logic/push/PushDealReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lo/avm;->f:Landroid/content/Intent;

    .line 199
    iget-object v0, p0, Lo/avm;->f:Landroid/content/Intent;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 200
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 201
    const-string v0, "pushMsg"

    iget-object v1, p0, Lo/avm;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lo/avm;->f:Landroid/content/Intent;

    const-string v1, "pushDispatchBundleKey"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 203
    iget-object v0, p0, Lo/avm;->f:Landroid/content/Intent;

    const-string v1, "extra_noti_hwid"

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 204
    return-void
.end method

.method public h()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lo/avm;->c:Z

    return v0
.end method
