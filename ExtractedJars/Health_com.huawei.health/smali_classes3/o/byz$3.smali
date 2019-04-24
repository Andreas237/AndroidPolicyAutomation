.class Lo/byz$3;
.super Lo/bzc$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byz;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/byz$3;->b:Lo/byz;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 3

    .line 108
    iget-object v0, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v0, v0, Lo/byz;->h:Lo/bze$c;

    iget v0, v0, Lo/bze$c;->c:I

    if-eq v0, p1, :cond_1

    .line 109
    iget-object v0, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v0, v0, Lo/byz;->h:Lo/bze$c;

    iput p1, v0, Lo/bze$c;->c:I

    .line 110
    iget-object v0, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v0, v0, Lo/byz;->h:Lo/bze$c;

    iget v0, v0, Lo/bze$c;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v1, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v1, v1, Lo/byz;->a:Lo/bzc;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Lo/byz;->c(ILo/bzc;)V

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v1, p0, Lo/byz$3;->b:Lo/byz;

    iget-object v1, v1, Lo/byz;->a:Lo/bzc;

    const/16 v2, -0xc

    invoke-virtual {v0, v2, v1}, Lo/byz;->c(ILo/bzc;)V

    .line 116
    :cond_1
    :goto_0
    return-void
.end method
