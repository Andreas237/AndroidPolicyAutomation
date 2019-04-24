.class final Lo/buc$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buc;->b(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lfi/firstbeat/coach/CoachVars;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bui;


# direct methods
.method constructor <init>(Lo/bui;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lo/buc$4;->a:Lo/bui;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lo/buc$4;->a:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 37
    return-void
.end method

.method public c(Lfi/firstbeat/coach/CoachVars;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lo/buc$4;->a:Lo/bui;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 42
    invoke-static {p1}, Lo/buc;->e(Lfi/firstbeat/coach/CoachVars;)Lfi/firstbeat/coach/CoachVars;

    .line 43
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 33
    move-object v0, p1

    check-cast v0, Lfi/firstbeat/coach/CoachVars;

    invoke-virtual {p0, v0}, Lo/buc$4;->c(Lfi/firstbeat/coach/CoachVars;)V

    return-void
.end method
