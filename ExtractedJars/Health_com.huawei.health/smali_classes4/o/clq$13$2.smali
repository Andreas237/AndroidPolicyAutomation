.class Lo/clq$13$2;
.super Lo/cli$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$13;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/clq$13;


# direct methods
.method constructor <init>(Lo/clq$13;)V
    .locals 0

    .line 971
    iput-object p1, p0, Lo/clq$13$2;->e:Lo/clq$13;

    invoke-direct {p0}, Lo/cli$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 974
    iget-object v0, p0, Lo/clq$13$2;->e:Lo/clq$13;

    iget-object v0, v0, Lo/clq$13;->e:Lo/cmc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 975
    iget-object v0, p0, Lo/clq$13$2;->e:Lo/clq$13;

    iget-object v0, v0, Lo/clq$13;->e:Lo/cmc;

    invoke-interface {v0, p1}, Lo/cmc;->a(Ljava/util/List;)V

    .line 976
    :cond_0
    return-void
.end method
