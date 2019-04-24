.class Lo/eih$5;
.super Lo/eih$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->e(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<TT;>.k;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;)V
    .locals 0

    .line 1582
    iput-object p1, p0, Lo/eih$5;->b:Lo/eih;

    invoke-direct {p0, p1}, Lo/eih$k;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 1585
    invoke-super {p0}, Lo/eih$k;->e()V

    .line 1586
    iget-object v0, p0, Lo/eih$5;->b:Lo/eih;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/eih;->b(I)V

    .line 1587
    return-void
.end method
