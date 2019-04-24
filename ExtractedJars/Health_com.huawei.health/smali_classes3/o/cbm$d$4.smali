.class Lo/cbm$d$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbm$d;->c(Lo/ale;)Landroid/support/v4/view/PagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbm$d;


# direct methods
.method constructor <init>(Lo/cbm$d;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 123
    iget-object v0, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    .line 124
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 125
    iget-object v0, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_wether_to_auth"

    .line 126
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 125
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 127
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dgk;->b(Z)V

    .line 128
    iget-object v0, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    .line 129
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 130
    iget-object v0, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    iget-object v1, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    invoke-static {v1}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cbm$d;->d(Lo/cbm$d;Landroid/content/Context;)V

    .line 131
    iget-object v0, p0, Lo/cbm$d$4;->a:Lo/cbm$d;

    iget-object v0, v0, Lo/cbm$d;->b:Lo/cbm;

    invoke-virtual {v0}, Lo/cbm;->dismiss()V

    .line 132
    return-void
.end method
