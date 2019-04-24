.class Lo/flx$h;
.super Lo/flx$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private final a:Lo/fmb;

.field final synthetic e:Lo/flx;


# direct methods
.method public constructor <init>(Lo/flx;Lo/fmb;Lo/fma;)V
    .locals 2

    .line 974
    iput-object p1, p0, Lo/flx$h;->e:Lo/flx;

    .line 975
    invoke-direct {p0, p1, p3}, Lo/flx$a;-><init>(Lo/flx;Lo/flq;)V

    .line 976
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 977
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "exchange must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 979
    :cond_0
    iput-object p2, p0, Lo/flx$h;->a:Lo/fmb;

    .line 980
    return-void
.end method


# virtual methods
.method public b(Lo/fow;)V
    .locals 1

    .line 984
    iget-object v0, p0, Lo/flx$h;->a:Lo/fmb;

    invoke-virtual {v0, p1}, Lo/fmb;->b(Lo/fow;)V

    .line 985
    return-void
.end method
