.class Lo/dja$5;
.super Lo/djq$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dja;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dja;


# direct methods
.method constructor <init>(Lo/dja;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lo/dja$5;->c:Lo/dja;

    invoke-direct {p0}, Lo/djq$b;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 157
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMusicChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lo/dja$5;->c:Lo/dja;

    invoke-static {v0}, Lo/dja;->a(Lo/dja;)Lo/dir$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 159
    iget-object v0, p0, Lo/dja$5;->c:Lo/dja;

    invoke-static {v0}, Lo/dja;->a(Lo/dja;)Lo/dir$e;

    move-result-object v0

    invoke-interface {v0}, Lo/dir$e;->d()V

    .line 161
    :cond_0
    return-void
.end method
