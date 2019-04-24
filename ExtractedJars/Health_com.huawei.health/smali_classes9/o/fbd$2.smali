.class Lo/fbd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbd;->e(Lo/fbh;JJZLo/fbd$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fbh;

.field final synthetic b:Lo/fbd$b;

.field final synthetic c:Lo/fbd;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/fbd;Lo/fbd$b;Lo/fbh;Z)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/fbd$2;->c:Lo/fbd;

    iput-object p2, p0, Lo/fbd$2;->b:Lo/fbd$b;

    iput-object p3, p0, Lo/fbd$2;->a:Lo/fbh;

    iput-boolean p4, p0, Lo/fbd$2;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fbm;>;)V"
        }
    .end annotation

    .line 71
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 72
    :cond_0
    iget-object v0, p0, Lo/fbd$2;->b:Lo/fbd$b;

    invoke-interface {v0}, Lo/fbd$b;->b()V

    .line 74
    :cond_1
    iget-object v0, p0, Lo/fbd$2;->c:Lo/fbd;

    invoke-static {v0}, Lo/fbd;->d(Lo/fbd;)Lo/fbd$d;

    move-result-object v0

    iget-object v1, p0, Lo/fbd$2;->a:Lo/fbh;

    iget-boolean v2, p0, Lo/fbd$2;->e:Z

    invoke-virtual {v0, v1, p1, v2}, Lo/fbd$d;->e(Lo/fbh;Ljava/util/List;Z)V

    .line 75
    iget-object v0, p0, Lo/fbd$2;->b:Lo/fbd$b;

    invoke-interface {v0}, Lo/fbd$b;->b()V

    .line 76
    return-void
.end method
