.class Lo/brt$8;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->c(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/brt;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/brt;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 975
    iput-object p1, p0, Lo/brt$8;->a:Lo/brt;

    iput-object p2, p0, Lo/brt$8;->e:Lo/bui;

    iput-object p3, p0, Lo/brt$8;->c:Ljava/lang/String;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 989
    iget-object v0, p0, Lo/brt$8;->e:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 990
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 2

    .line 978
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 979
    iget-object v0, p0, Lo/brt$8;->e:Lo/bui;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 981
    :cond_0
    iget-object v0, p0, Lo/brt$8;->e:Lo/bui;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 984
    :goto_0
    iget-object v0, p0, Lo/brt$8;->a:Lo/brt;

    invoke-static {v0}, Lo/brt;->a(Lo/brt;)Lo/bxk;

    move-result-object v0

    iget-object v1, p0, Lo/brt$8;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bxk;->c(Ljava/lang/String;)V

    .line 985
    return-void
.end method
