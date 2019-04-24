.class Lo/bhc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhc;->e(Lo/bfh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bhc;


# direct methods
.method constructor <init>(Lo/bhc;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 126
    iget-object v0, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->e(Lo/bhc;)Lo/bhc$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->c(Lo/bhc;)Landroid/widget/GridView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->e(Lo/bhc;)Lo/bhc$b;

    move-result-object v0

    iget-object v1, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-static {v1}, Lo/bhc;->c(Lo/bhc;)Landroid/widget/GridView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/GridView;->getNumColumns()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bhc$b;->b(I)V

    .line 129
    iget-object v0, p0, Lo/bhc$1;->d:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->e(Lo/bhc;)Lo/bhc$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/bhc$b;->notifyDataSetChanged()V

    .line 131
    :cond_0
    return-void
.end method
