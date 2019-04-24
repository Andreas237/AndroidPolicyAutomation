.class Lo/egq$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egq$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/egq$e;


# direct methods
.method constructor <init>(Lo/egq$e;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/egq$e$b;->d:Lo/egq$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 207
    iget-object v0, p0, Lo/egq$e$b;->d:Lo/egq$e;

    invoke-static {v0}, Lo/egq$e;->a(Lo/egq$e;)Lo/egq;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/egq$e$b;->d:Lo/egq$e;

    invoke-static {v0}, Lo/egq$e;->a(Lo/egq$e;)Lo/egq;

    move-result-object v0

    invoke-virtual {v0}, Lo/egq;->dismiss()V

    .line 210
    :cond_0
    iget-object v0, p0, Lo/egq$e$b;->d:Lo/egq$e;

    invoke-static {v0}, Lo/egq$e;->c(Lo/egq$e;)Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 211
    iget-object v0, p0, Lo/egq$e$b;->d:Lo/egq$e;

    invoke-static {v0}, Lo/egq$e;->c(Lo/egq$e;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 213
    :cond_1
    return-void
.end method
