.class Lo/ego$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ego$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/ego$a;


# direct methods
.method constructor <init>(Lo/ego$a;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/ego$a$d;->d:Lo/ego$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 206
    iget-object v0, p0, Lo/ego$a$d;->d:Lo/ego$a;

    iget-object v0, v0, Lo/ego$a;->b:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 207
    const-string v0, "CustomProgressDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customProgressDialog.dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/ego$a$d;->d:Lo/ego$a;

    iget-object v0, v0, Lo/ego$a;->b:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->dismiss()V

    .line 210
    :cond_0
    iget-object v0, p0, Lo/ego$a$d;->d:Lo/ego$a;

    invoke-static {v0}, Lo/ego$a;->e(Lo/ego$a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 211
    iget-object v0, p0, Lo/ego$a$d;->d:Lo/ego$a;

    invoke-static {v0}, Lo/ego$a;->e(Lo/ego$a;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 213
    :cond_1
    return-void
.end method
