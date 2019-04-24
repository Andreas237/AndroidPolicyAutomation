.class Lo/egu$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egu$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/egu$a;


# direct methods
.method constructor <init>(Lo/egu$a;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lo/egu$a$d;->c:Lo/egu$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 261
    iget-object v0, p0, Lo/egu$a$d;->c:Lo/egu$a;

    iget-object v0, v0, Lo/egu$a;->e:Lo/egu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 262
    const-string v0, "CustomProgressDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customProgressDialog.dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lo/egu$a$d;->c:Lo/egu$a;

    iget-object v0, v0, Lo/egu$a;->e:Lo/egu;

    invoke-virtual {v0}, Lo/egu;->dismiss()V

    .line 265
    :cond_0
    iget-object v0, p0, Lo/egu$a$d;->c:Lo/egu$a;

    invoke-static {v0}, Lo/egu$a;->e(Lo/egu$a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 266
    iget-object v0, p0, Lo/egu$a$d;->c:Lo/egu$a;

    invoke-static {v0}, Lo/egu$a;->e(Lo/egu$a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 268
    :cond_1
    return-void
.end method
