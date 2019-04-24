.class public abstract Lo/bka;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lo/bjy;

.field protected b:Landroid/os/Handler;

.field protected c:Landroid/app/Activity;

.field private d:Lo/bjy$c;

.field protected e:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bka;->e:Z

    .line 111
    new-instance v0, Lo/bka$5;

    invoke-direct {v0, p0}, Lo/bka$5;-><init>(Lo/bka;)V

    iput-object v0, p0, Lo/bka;->d:Lo/bjy$c;

    .line 59
    iput-object p1, p0, Lo/bka;->c:Landroid/app/Activity;

    .line 60
    return-void
.end method

.method private b()V
    .locals 4

    .line 127
    iget-object v0, p0, Lo/bka;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lo/bka;->b:Landroid/os/Handler;

    const/16 v1, 0x106

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lo/bka;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 135
    :goto_0
    return-void
.end method

.method public static e(Landroid/content/Intent;Landroid/app/Activity;)Lo/bka;
    .locals 3

    .line 81
    const/4 v1, 0x0

    .line 82
    if-eqz p0, :cond_1

    .line 84
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 85
    if-eqz v2, :cond_1

    .line 87
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    new-instance v1, Lo/bkb;

    invoke-direct {v1, p1}, Lo/bkb;-><init>(Landroid/app/Activity;)V

    goto :goto_0

    .line 93
    :cond_0
    new-instance v1, Lo/bjz;

    invoke-direct {v1, p1}, Lo/bjz;-><init>(Landroid/app/Activity;)V

    .line 95
    :goto_0
    invoke-virtual {v1, v2}, Lo/bka;->a(Landroid/os/Bundle;)V

    .line 100
    :cond_1
    if-nez v1, :cond_2

    .line 102
    new-instance v1, Lo/bjz;

    invoke-direct {v1, p1}, Lo/bjz;-><init>(Landroid/app/Activity;)V

    .line 103
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/bka;->a(Landroid/os/Bundle;)V

    .line 105
    :cond_2
    return-object v1
.end method

.method static synthetic e(Lo/bka;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/bka;->b()V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method abstract a(Landroid/os/Bundle;)V
.end method

.method public a(Z)V
    .locals 3

    .line 150
    iget-object v0, p0, Lo/bka;->c:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bka;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    :cond_0
    return-void

    .line 154
    :cond_1
    new-instance v0, Lo/bjy;

    iget-object v1, p0, Lo/bka;->c:Landroid/app/Activity;

    iget-object v2, p0, Lo/bka;->d:Lo/bjy$c;

    invoke-direct {v0, v1, p1, v2}, Lo/bjy;-><init>(Landroid/app/Activity;ZLo/bjy$c;)V

    iput-object v0, p0, Lo/bka;->a:Lo/bjy;

    .line 155
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    invoke-virtual {v0}, Lo/bjy;->show()V

    .line 156
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bjy;->setCanceledOnTouchOutside(Z)V

    .line 157
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bjy;->setCancelable(Z)V

    .line 159
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    new-instance v1, Lo/bka$4;

    invoke-direct {v1, p0}, Lo/bka$4;-><init>(Lo/bka;)V

    invoke-virtual {v0, v1}, Lo/bjy;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 169
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    new-instance v1, Lo/bka$1;

    invoke-direct {v1, p0}, Lo/bka$1;-><init>(Lo/bka;)V

    invoke-virtual {v0, v1}, Lo/bjy;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 185
    return-void
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract c()V
.end method

.method public c(Landroid/os/Handler;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/bka;->b:Landroid/os/Handler;

    .line 70
    return-void
.end method

.method public abstract d()V
.end method

.method public d(I)V
    .locals 2

    .line 217
    iget-boolean v0, p0, Lo/bka;->e:Z

    if-eqz v0, :cond_0

    .line 219
    return-void

    .line 222
    :cond_0
    const v0, 0x14ff4

    if-ne p1, v0, :cond_1

    .line 224
    iget-object v0, p0, Lo/bka;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 228
    :cond_1
    iget-object v0, p0, Lo/bka;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_server_busy:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 230
    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    invoke-virtual {v0}, Lo/bjy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    invoke-virtual {v0}, Lo/bjy;->dismiss()V

    .line 143
    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    .line 246
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/bka;->a:Lo/bjy;

    invoke-virtual {v0}, Lo/bjy;->e()V

    .line 250
    :cond_0
    return-void
.end method
