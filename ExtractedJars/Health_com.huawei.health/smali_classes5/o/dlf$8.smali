.class Lo/dlf$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dml;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lo/dlf$8;->c:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 644
    iget-object v0, p0, Lo/dlf$8;->c:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->e(Lo/dlf;)Lo/dlw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dlw;->c(Ljava/util/Map;)V

    .line 645
    iget-object v0, p0, Lo/dlf$8;->c:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dlz;->c(Ljava/util/Map;)V

    .line 646
    iget-object v0, p0, Lo/dlf$8;->c:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->g(Lo/dlf;)Lo/dlt;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlt;->h()V

    .line 647
    return-void
.end method
