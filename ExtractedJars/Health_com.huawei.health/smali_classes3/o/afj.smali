.class public Lo/afj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/afj$b;,
        Lo/afj$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lo/acl$a;

.field public f:Lo/acf;

.field public g:Ljava/lang/String;

.field public h:Lo/ace;

.field public i:Ljava/lang/String;

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation
.end field

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation
.end field

.field private m:Landroid/os/Bundle;

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation
.end field

.field private o:Lo/afj$a;

.field public p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation
.end field

.field private q:Z

.field private r:I

.field private t:Z

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lo/afj;->r:I

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lo/afj;->u:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/afj;->q:Z

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/afj;->t:Z

    .line 76
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lo/afj;->m:Landroid/os/Bundle;

    .line 77
    new-instance v0, Lo/afj$a;

    invoke-direct {v0}, Lo/afj$a;-><init>()V

    iput-object v0, p0, Lo/afj;->o:Lo/afj$a;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/afj;->k:Ljava/util/ArrayList;

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/afj;->n:Ljava/util/ArrayList;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/afj;->p:Ljava/util/ArrayList;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/afj;->l:Ljava/util/ArrayList;

    .line 82
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lo/afj;->r:I

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lo/afj;->u:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/afj;->q:Z

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/afj;->t:Z

    .line 72
    iput p1, p0, Lo/afj;->r:I

    .line 73
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/afj;->u:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 119
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/afj;->g:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 161
    iget-object v0, p0, Lo/afj;->p:Ljava/util/ArrayList;

    new-instance v1, Lo/afj$b;

    invoke-direct {v1, p1, p2}, Lo/afj$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lo/afj;->q:Z

    .line 61
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 100
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/afj;->c:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 168
    iget-object v0, p0, Lo/afj;->l:Ljava/util/ArrayList;

    new-instance v1, Lo/afj$b;

    invoke-direct {v1, p1, p2}, Lo/afj$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    return-void
.end method

.method public b(Lo/acl$a;)V
    .locals 1

    .line 106
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl$a;

    iput-object v0, p0, Lo/afj;->e:Lo/acl$a;

    .line 107
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lo/afj;->t:Z

    .line 69
    return-void
.end method

.method public b()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lo/afj;->q:Z

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/afj;->u:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 157
    iget-object v0, p0, Lo/afj;->n:Ljava/util/ArrayList;

    new-instance v1, Lo/afj$b;

    invoke-direct {v1, p1, p2}, Lo/afj$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    return-void
.end method

.method public c()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lo/afj;->t:Z

    return v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lo/afj;->k:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 125
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/afj;->b:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 145
    iget-object v0, p0, Lo/afj;->k:Ljava/util/ArrayList;

    new-instance v1, Lo/afj$b;

    invoke-direct {v1, p1, p2}, Lo/afj$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    return-void
.end method

.method public e()I
    .locals 1

    .line 40
    iget v0, p0, Lo/afj;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 131
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/afj;->i:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lo/afj;->m:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lo/afj;->o:Lo/afj$a;

    iput-object p1, v0, Lo/afj$a;->b:Ljava/lang/String;

    .line 86
    iget-object v0, p0, Lo/afj;->o:Lo/afj$a;

    iput-object p2, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 87
    iget-object v0, p0, Lo/afj;->o:Lo/afj$a;

    iput-object p3, v0, Lo/afj$a;->e:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public e(Lo/acf;)V
    .locals 1

    .line 112
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acf;

    iput-object v0, p0, Lo/afj;->f:Lo/acf;

    .line 113
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lo/afj;->g:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lo/afj;->m:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/afj;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lo/afj;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public i()Lo/acf;
    .locals 1

    .line 109
    iget-object v0, p0, Lo/afj;->f:Lo/acf;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acf;

    return-object v0
.end method

.method public k()Lo/acl$a;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/afj;->e:Lo/acl$a;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acl$a;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lo/afj;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lo/afj;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public n()Lo/afj$a;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/afj;->o:Lo/afj$a;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj$a;

    return-object v0
.end method

.method public o()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/afj$b;>;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lo/afj;->i:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
