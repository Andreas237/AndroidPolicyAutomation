.class Lo/cbm$d$1;
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
.field final synthetic a:Lo/ale;

.field final synthetic b:Lo/cbm$d;


# direct methods
.method constructor <init>(Lo/cbm$d;Lo/ale;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/cbm$d$1;->b:Lo/cbm$d;

    iput-object p2, p0, Lo/cbm$d$1;->a:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 137
    iget-object v0, p0, Lo/cbm$d$1;->b:Lo/cbm$d;

    iget-object v0, v0, Lo/cbm$d;->b:Lo/cbm;

    invoke-virtual {v0}, Lo/cbm;->dismiss()V

    .line 140
    iget-object v0, p0, Lo/cbm$d$1;->b:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_privacy_dlg"

    const-string v3, ""

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 142
    iget-object v0, p0, Lo/cbm$d$1;->b:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->b(Lo/cbm$d;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/cbm$d$1;->a:Lo/ale;

    iget-object v1, p0, Lo/cbm$d$1;->b:Lo/cbm$d;

    invoke-static {v1}, Lo/cbm$d;->c(Lo/cbm$d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ale;->a(Landroid/content/Context;)V

    .line 145
    :cond_0
    return-void
.end method
