.class Lo/egy$b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egy$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/egy$b;


# direct methods
.method constructor <init>(Lo/egy$b;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lo/egy$b$d;->a:Lo/egy$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 403
    iget-object v0, p0, Lo/egy$b$d;->a:Lo/egy$b;

    iget-object v0, v0, Lo/egy$b;->e:Lo/egy;

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lo/egy$b$d;->a:Lo/egy$b;

    iget-object v0, v0, Lo/egy$b;->e:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 407
    :cond_0
    iget-object v0, p0, Lo/egy$b$d;->a:Lo/egy$b;

    invoke-static {v0}, Lo/egy$b;->a(Lo/egy$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 408
    iget-object v0, p0, Lo/egy$b$d;->a:Lo/egy$b;

    invoke-static {v0}, Lo/egy$b;->a(Lo/egy$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 410
    :cond_1
    const-string v0, "NoTitleCustomAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "negativeButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    :goto_0
    return-void
.end method