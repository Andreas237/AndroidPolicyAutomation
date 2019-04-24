.class public Lo/cfh;
.super Lo/cfe;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cev;>;"
        }
    .end annotation
.end field

.field private b:F

.field private c:I

.field private d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation
.end field

.field private i:I

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation
.end field

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cfp;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfl;>;"
        }
    .end annotation
.end field

.field private n:I

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfj;>;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cvv;>;"
        }
    .end annotation
.end field

.field private r:I

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfk;>;"
        }
    .end annotation
.end field

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/cfe;-><init>(Landroid/content/Context;)V

    .line 40
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/cfh;->b:F

    .line 43
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/cfh;->e:F

    .line 46
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/cfh;->d:F

    .line 35
    return-void
.end method


# virtual methods
.method protected A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfk;>;"
        }
    .end annotation

    .line 226
    iget-object v0, p0, Lo/cfh;->t:Ljava/util/List;

    return-object v0
.end method

.method protected B()F
    .locals 1

    .line 108
    iget v0, p0, Lo/cfh;->d:F

    return v0
.end method

.method protected C()I
    .locals 1

    .line 256
    iget v0, p0, Lo/cfh;->u:I

    return v0
.end method

.method protected D()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cvv;>;"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lo/cfh;->q:Ljava/util/List;

    return-object v0
.end method

.method public E()V
    .locals 1

    .line 121
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/cfh;->b:F

    .line 122
    return-void
.end method

.method protected a()F
    .locals 1

    .line 91
    iget v0, p0, Lo/cfh;->b:F

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 157
    iput p1, p0, Lo/cfh;->i:I

    .line 158
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfd;>;)V"
        }
    .end annotation

    .line 130
    iput-object p1, p0, Lo/cfh;->h:Ljava/util/ArrayList;

    .line 131
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfl;>;)V"
        }
    .end annotation

    .line 193
    iput-object p1, p0, Lo/cfh;->m:Ljava/util/List;

    .line 194
    return-void
.end method

.method protected b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cev;>;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lo/cfh;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public b(F)V
    .locals 0

    .line 99
    iput p1, p0, Lo/cfh;->b:F

    .line 100
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 95
    iput p1, p0, Lo/cfh;->c:I

    .line 96
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfj;>;)V"
        }
    .end annotation

    .line 211
    iput-object p1, p0, Lo/cfh;->o:Ljava/util/List;

    .line 212
    return-void
.end method

.method protected c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lo/cfh;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c(F)V
    .locals 0

    .line 112
    iput p1, p0, Lo/cfh;->d:F

    .line 113
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 165
    iput p1, p0, Lo/cfh;->f:I

    .line 166
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cev;>;)V"
        }
    .end annotation

    .line 81
    iput-object p1, p0, Lo/cfh;->a:Ljava/util/ArrayList;

    .line 82
    return-void
.end method

.method protected d()I
    .locals 1

    .line 86
    iget v0, p0, Lo/cfh;->c:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 139
    iput p1, p0, Lo/cfh;->g:I

    .line 140
    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfb;>;)V"
        }
    .end annotation

    .line 148
    iput-object p1, p0, Lo/cfh;->k:Ljava/util/ArrayList;

    .line 149
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfk;>;)V"
        }
    .end annotation

    .line 231
    iput-object p1, p0, Lo/cfh;->t:Ljava/util/List;

    .line 232
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 103
    iput p1, p0, Lo/cfh;->e:F

    .line 104
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfp;>;)V"
        }
    .end annotation

    .line 175
    iput-object p1, p0, Lo/cfh;->l:Ljava/util/ArrayList;

    .line 176
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cvv;>;)V"
        }
    .end annotation

    .line 251
    iput-object p1, p0, Lo/cfh;->q:Ljava/util/List;

    .line 252
    return-void
.end method

.method protected f()I
    .locals 1

    .line 135
    iget v0, p0, Lo/cfh;->g:I

    return v0
.end method

.method public f(I)V
    .locals 0

    .line 202
    iput p1, p0, Lo/cfh;->n:I

    .line 203
    return-void
.end method

.method protected g()I
    .locals 1

    .line 162
    iget v0, p0, Lo/cfh;->f:I

    return v0
.end method

.method protected h()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lo/cfh;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method public h(I)V
    .locals 0

    .line 184
    iput p1, p0, Lo/cfh;->p:I

    .line 185
    return-void
.end method

.method protected i()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfp;>;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lo/cfh;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method public i(I)V
    .locals 0

    .line 221
    iput p1, p0, Lo/cfh;->r:I

    .line 222
    return-void
.end method

.method protected j()F
    .locals 1

    .line 117
    iget v0, p0, Lo/cfh;->e:F

    return v0
.end method

.method protected k()I
    .locals 1

    .line 153
    iget v0, p0, Lo/cfh;->i:I

    return v0
.end method

.method public k(I)V
    .locals 0

    .line 260
    iput p1, p0, Lo/cfh;->u:I

    .line 261
    return-void
.end method

.method protected p()I
    .locals 1

    .line 180
    iget v0, p0, Lo/cfh;->p:I

    return v0
.end method

.method protected v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfl;>;"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lo/cfh;->m:Ljava/util/List;

    return-object v0
.end method

.method protected w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfj;>;"
        }
    .end annotation

    .line 207
    iget-object v0, p0, Lo/cfh;->o:Ljava/util/List;

    return-object v0
.end method

.method protected y()I
    .locals 1

    .line 216
    iget v0, p0, Lo/cfh;->r:I

    return v0
.end method

.method protected z()I
    .locals 1

    .line 198
    iget v0, p0, Lo/cfh;->n:I

    return v0
.end method
