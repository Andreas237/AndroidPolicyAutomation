.class Lo/ale$9$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$9;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale$9;


# direct methods
.method constructor <init>(Lo/ale$9;)V
    .locals 0

    .line 999
    iput-object p1, p0, Lo/ale$9$5;->b:Lo/ale$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1002
    iget-object v0, p0, Lo/ale$9$5;->b:Lo/ale$9;

    iget v0, v0, Lo/ale$9;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1003
    iget-object v0, p0, Lo/ale$9$5;->b:Lo/ale$9;

    iget-object v0, v0, Lo/ale$9;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->o(Lo/ale;)V

    goto :goto_0

    .line 1004
    :cond_0
    iget-object v0, p0, Lo/ale$9$5;->b:Lo/ale$9;

    iget v0, v0, Lo/ale$9;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1005
    iget-object v0, p0, Lo/ale$9$5;->b:Lo/ale$9;

    iget-object v0, v0, Lo/ale$9;->a:Lo/ale;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;I)V

    .line 1007
    :cond_1
    :goto_0
    return-void
.end method
