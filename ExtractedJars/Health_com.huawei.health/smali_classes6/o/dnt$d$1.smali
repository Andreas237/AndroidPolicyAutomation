.class Lo/dnt$d$1;
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
.field final synthetic c:Lo/dnt$d;

.field final synthetic e:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt$d;Lo/dnt;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/dnt$d$1;->c:Lo/dnt$d;

    iput-object p2, p0, Lo/dnt$d$1;->e:Lo/dnt;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lo/dnt$d$1;->c:Lo/dnt$d;

    iget-object v0, v0, Lo/dnt$d;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->e(Lo/dnt;)V

    .line 84
    return-void
.end method
