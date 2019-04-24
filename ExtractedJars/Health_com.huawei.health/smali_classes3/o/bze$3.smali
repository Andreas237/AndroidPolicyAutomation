.class Lo/bze$3;
.super Lo/bzc$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bze;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bze;


# direct methods
.method constructor <init>(Lo/bze;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lo/bze$3;->d:Lo/bze;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 3

    .line 109
    iget-object v0, p0, Lo/bze$3;->d:Lo/bze;

    iget-object v0, v0, Lo/bze;->h:Lo/bze$c;

    iget v0, v0, Lo/bze$c;->d:I

    sub-int v2, p1, v0

    .line 110
    if-eqz v2, :cond_0

    .line 111
    iget-object v0, p0, Lo/bze$3;->d:Lo/bze;

    iget-object v0, v0, Lo/bze;->h:Lo/bze$c;

    iput p1, v0, Lo/bze$c;->d:I

    .line 112
    iget-object v0, p0, Lo/bze$3;->d:Lo/bze;

    iget-object v1, p0, Lo/bze$3;->d:Lo/bze;

    iget-object v1, v1, Lo/bze;->e:Lo/bzc;

    invoke-virtual {v0, v2, v1}, Lo/bze;->d(ILo/bzc;)V

    .line 114
    :cond_0
    return-void
.end method
