.class Lo/asj$2;
.super Lo/asj$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asj;->d()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asj;


# direct methods
.method constructor <init>(Lo/asj;)V
    .locals 1

    .line 200
    iput-object p1, p0, Lo/asj$2;->b:Lo/asj;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/asj$e;-><init>(Lo/asj;Lo/asj$2;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 204
    invoke-static {}, Lo/asg;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 206
    iget-object v0, p0, Lo/asj$2;->b:Lo/asj;

    invoke-static {v0}, Lo/asj;->c(Lo/asj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/asg;->e(Landroid/content/Context;)V

    .line 208
    :cond_0
    return-void
.end method
