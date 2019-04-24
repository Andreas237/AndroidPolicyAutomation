.class Lo/fnp$4;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnp;->d()Lo/fly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fnp;


# direct methods
.method constructor <init>(Lo/fnp;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lo/fnp$4;->c:Lo/fnp;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 302
    iget-object v0, p0, Lo/fnp$4;->c:Lo/fnp;

    invoke-static {v0}, Lo/fnp;->c(Lo/fnp;)Lo/fly;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fly;->a(Z)V

    .line 303
    return-void
.end method
