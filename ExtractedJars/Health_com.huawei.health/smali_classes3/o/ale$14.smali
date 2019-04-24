.class Lo/ale$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;Z)V
    .locals 0

    .line 361
    iput-object p1, p0, Lo/ale$14;->d:Lo/ale;

    iput-boolean p2, p0, Lo/ale$14;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 365
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_privacy_dlg"

    const-string v3, ""

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 370
    iget-boolean v0, p0, Lo/ale$14;->a:Z

    if-eqz v0, :cond_0

    .line 371
    return-void

    .line 374
    :cond_0
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 376
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dgk;->b(Z)V

    .line 377
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 378
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 379
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_wether_to_auth"

    .line 380
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 379
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 382
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->a(Lo/ale;)V

    .line 383
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_update_terms"

    const-string v3, "5"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 385
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->e()V

    .line 386
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->b(Lo/ale;)V

    .line 388
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/IHiAd;->enableUserInfo(Z)V

    .line 390
    iget-object v0, p0, Lo/ale$14;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/IHiAd;->enableSharePd(Z)V

    .line 392
    :cond_1
    return-void
.end method
