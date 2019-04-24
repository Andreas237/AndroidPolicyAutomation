.class Lo/byz$6;
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
.field final synthetic e:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/byz$6;->e:Lo/byz;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 4

    .line 134
    iget-object v0, p0, Lo/byz$6;->e:Lo/byz;

    iget-object v0, v0, Lo/byz;->h:Lo/bze$c;

    iput p1, v0, Lo/bze$c;->d:I

    .line 135
    rem-int/lit8 v2, p1, 0x3c

    .line 136
    iget-object v0, p0, Lo/byz$6;->e:Lo/byz;

    invoke-virtual {v0}, Lo/byz;->getMinute()I

    move-result v0

    sub-int v3, v2, v0

    .line 137
    if-eqz v3, :cond_0

    .line 138
    iget-object v0, p0, Lo/byz$6;->e:Lo/byz;

    iget-object v1, p0, Lo/byz$6;->e:Lo/byz;

    iget-object v1, v1, Lo/byz;->e:Lo/bzc;

    invoke-virtual {v0, v3, v1}, Lo/byz;->d(ILo/bzc;)V

    .line 140
    :cond_0
    return-void
.end method
