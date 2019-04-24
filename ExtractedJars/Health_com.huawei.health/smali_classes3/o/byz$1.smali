.class Lo/byz$1;
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
.field final synthetic c:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/byz$1;->c:Lo/byz;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 4

    .line 122
    iget-object v0, p0, Lo/byz$1;->c:Lo/byz;

    iget-object v0, v0, Lo/byz;->h:Lo/bze$c;

    iput p1, v0, Lo/bze$c;->e:I

    .line 123
    rem-int/lit8 v2, p1, 0x18

    .line 124
    iget-object v0, p0, Lo/byz$1;->c:Lo/byz;

    invoke-virtual {v0}, Lo/byz;->getHour()I

    move-result v0

    sub-int v3, v2, v0

    .line 125
    if-eqz v3, :cond_0

    .line 126
    iget-object v0, p0, Lo/byz$1;->c:Lo/byz;

    iget-object v1, p0, Lo/byz$1;->c:Lo/byz;

    iget-object v1, v1, Lo/byz;->c:Lo/bzc;

    invoke-virtual {v0, v3, v1}, Lo/byz;->c(ILo/bzc;)V

    .line 128
    :cond_0
    return-void
.end method
