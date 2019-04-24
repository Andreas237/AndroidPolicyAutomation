.class Lo/dnt$d$10;
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
.field final synthetic a:Lo/dnt$d;

.field final synthetic b:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt$d;Lo/dnt;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/dnt$d$10;->a:Lo/dnt$d;

    iput-object p2, p0, Lo/dnt$d$10;->b:Lo/dnt;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 3

    .line 123
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    .line 124
    iget-object v0, p0, Lo/dnt$d$10;->a:Lo/dnt$d;

    iget-object v0, v0, Lo/dnt$d;->b:Lo/dnt;

    const-string v1, "accountName"

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dnt;->c(Lo/dnt;Ljava/lang/String;)V

    .line 125
    return-void
.end method
