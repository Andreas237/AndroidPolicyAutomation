.class Lo/bpj$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:I

.field private d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(ILandroid/os/Bundle;)V
    .locals 0

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    iput p1, p0, Lo/bpj$c;->b:I

    .line 314
    iput-object p2, p0, Lo/bpj$c;->d:Landroid/os/Bundle;

    .line 315
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 320
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v6

    .line 321
    invoke-virtual {v6}, Lo/aoq;->b()Lo/axr;

    move-result-object v7

    .line 323
    if-nez v7, :cond_0

    .line 325
    const-string v0, "hwsns"

    const-string v1, "HwIDException : has not login"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    return-void

    .line 329
    :cond_0
    invoke-virtual {v6}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    .line 330
    invoke-virtual {v7}, Lo/axr;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CN"

    sget-object v1, Lo/bps$a;->e:Ljava/lang/String;

    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lo/bps$a;->a:Ljava/lang/String;

    const-string v1, "EmotionUI_"

    .line 332
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    const-string v0, "hwsns"

    iget v1, p0, Lo/bpj$c;->b:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bpj$c;->d:Landroid/os/Bundle;

    .line 335
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sns log report event "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lo/bpj$c;->b:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v5

    .line 334
    invoke-static/range {v0 .. v5}, Lcom/huawei/common/applog/AppLogApi;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Boolean;Ljava/lang/String;Landroid/content/Context;)V

    .line 337
    :cond_1
    return-void
.end method
