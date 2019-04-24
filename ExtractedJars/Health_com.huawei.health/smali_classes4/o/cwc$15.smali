.class Lo/cwc$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->e(Lo/cez;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 875
    iput-object p1, p0, Lo/cwc$15;->c:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(II)V
    .locals 1

    .line 878
    iget-object v0, p0, Lo/cwc$15;->c:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->i(Lo/cwc;)Lo/cez;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 879
    iget-object v0, p0, Lo/cwc$15;->c:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->i(Lo/cwc;)Lo/cez;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/cez;->e(II)V

    .line 881
    :cond_0
    return-void
.end method
