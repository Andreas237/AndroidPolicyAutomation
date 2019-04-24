.class Lo/dnt$d$4;
.super Lo/dot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$d;-><init>(Lo/dnt;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dnt$d;

.field final synthetic d:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt$d;Lo/dnt;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/dnt$d$4;->b:Lo/dnt$d;

    iput-object p2, p0, Lo/dnt$d$4;->d:Lo/dnt;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 2

    .line 116
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lo/dod$e$b;

    .line 117
    iget-object v0, p0, Lo/dnt$d$4;->b:Lo/dnt$d;

    iget-object v0, v0, Lo/dnt$d;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->a(Lo/dnt;)Lo/dor;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dor;->b(Lo/dod$e$b;)V

    .line 118
    return-void
.end method
