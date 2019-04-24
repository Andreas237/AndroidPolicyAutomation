.class Lo/enk$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enk$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/enk$4;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/enk$4;II)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iput p2, p0, Lo/enk$4$2;->d:I

    iput p3, p0, Lo/enk$4$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 167
    iget-object v0, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v0, v0, Lo/enk$4;->c:Lo/enk;

    iget-object v1, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v1, v1, Lo/enk$4;->c:Lo/enk;

    iget v1, v1, Lo/enk;->f:I

    iget v2, p0, Lo/enk$4$2;->d:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v2, v2, Lo/enk$4;->c:Lo/enk;

    iget v2, v2, Lo/enk;->i:I

    add-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/enk;->smoothScrollTo(II)V

    .line 168
    iget-object v0, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v0, v0, Lo/enk$4;->c:Lo/enk;

    iget v1, p0, Lo/enk$4$2;->c:I

    iget-object v2, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v2, v2, Lo/enk$4;->c:Lo/enk;

    iget v2, v2, Lo/enk;->d:I

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/enk;->b:I

    .line 169
    iget-object v0, p0, Lo/enk$4$2;->a:Lo/enk$4;

    iget-object v0, v0, Lo/enk$4;->c:Lo/enk;

    invoke-static {v0}, Lo/enk;->d(Lo/enk;)V

    .line 170
    return-void
.end method
