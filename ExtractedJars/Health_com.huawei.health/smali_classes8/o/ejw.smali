.class public abstract Lo/ejw;
.super Lo/eih$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ejw$a;,
        Lo/ejw$e;
    }
.end annotation


# instance fields
.field private a:Lo/ejw$e;

.field private b:Lo/eih;

.field private d:Lo/ejw$e;

.field private e:Lo/ekd;


# direct methods
.method public constructor <init>(Lo/eih;Lo/ekd;)V
    .locals 2

    .line 117
    invoke-direct {p0, p1}, Lo/eih$n;-><init>(Lo/eih;)V

    .line 32
    new-instance v0, Lo/ejw$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ejw$e;-><init>(Lo/ejw$3;)V

    iput-object v0, p0, Lo/ejw;->d:Lo/ejw$e;

    .line 34
    new-instance v0, Lo/ejw$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ejw$e;-><init>(Lo/ejw$3;)V

    iput-object v0, p0, Lo/ejw;->a:Lo/ejw$e;

    .line 118
    iput-object p1, p0, Lo/ejw;->b:Lo/eih;

    .line 119
    iput-object p2, p0, Lo/ejw;->e:Lo/ekd;

    .line 120
    return-void
.end method

.method static synthetic a(Lo/ejw;)Lo/eih;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ejw;->b:Lo/eih;

    return-object v0
.end method

.method private d(Lo/ejw$e;Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 1

    .line 132
    new-instance v0, Lo/ejw$a;

    invoke-direct {v0, p4, p5, p3}, Lo/ejw$a;-><init>(Lo/eic;Lo/ehe$a;Lo/ejk;)V

    invoke-virtual {p1, p2, v0}, Lo/ejw$e;->d(Lo/eii;Lo/ejw$a;)V

    .line 133
    return-void
.end method


# virtual methods
.method public a(Lo/eii;FF)F
    .locals 1

    .line 162
    iget-object v0, p0, Lo/ejw;->e:Lo/ekd;

    invoke-interface {v0, p1, p2, p3}, Lo/ekd;->c(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method public a(Lo/eii;)Lo/ejk;
    .locals 1

    .line 142
    iget-object v0, p0, Lo/ejw;->d:Lo/ejw$e;

    invoke-virtual {v0, p1}, Lo/ejw$e;->b(Lo/eii;)Lo/ejk;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/eii;)Lo/eic;
    .locals 1

    .line 152
    iget-object v0, p0, Lo/ejw;->d:Lo/ejw$e;

    invoke-virtual {v0, p1}, Lo/ejw$e;->a(Lo/eii;)Lo/eic;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 6

    .line 126
    move-object v0, p0

    iget-object v1, p0, Lo/ejw;->d:Lo/ejw$e;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/ejw;->d(Lo/ejw$e;Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 127
    return-void
.end method

.method public c(Lo/eii;)Lo/ehe$a;
    .locals 1

    .line 147
    iget-object v0, p0, Lo/ejw;->d:Lo/ejw$e;

    invoke-virtual {v0, p1}, Lo/ejw$e;->d(Lo/eii;)Lo/ehe$a;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lo/eih$n$a;Ljava/util/List;Lo/eih$g;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih$n$a;Ljava/util/List<+Lo/ejl<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>;Lo/eih$g;)V"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lo/ejw;->b:Lo/eih;

    move-object/from16 v1, p3

    invoke-virtual {v0, p1, v1}, Lo/eih;->c(Lo/eih$n$a;Lo/eih$g;)V

    .line 176
    iget-object v0, p0, Lo/ejw;->a:Lo/ejw$e;

    invoke-virtual {v0}, Lo/ejw$e;->c()Ljava/util/Set;

    move-result-object v11

    .line 178
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/eii;

    .line 179
    move-object v0, v13

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 180
    invoke-virtual {p1}, Lo/eih$n$a;->d()I

    move-result v2

    .line 181
    invoke-virtual {p1}, Lo/eih$n$a;->b()I

    move-result v3

    .line 182
    invoke-virtual {p1}, Lo/eih$n$a;->e()I

    move-result v4

    .line 183
    invoke-virtual {p1}, Lo/eih$n$a;->a()I

    move-result v5

    iget-object v6, p0, Lo/ejw;->a:Lo/ejw$e;

    .line 185
    invoke-virtual {v6, v13}, Lo/ejw$e;->a(Lo/eii;)Lo/eic;

    move-result-object v7

    iget-object v6, p0, Lo/ejw;->a:Lo/ejw$e;

    .line 186
    invoke-virtual {v6, v13}, Lo/ejw$e;->d(Lo/eii;)Lo/ehe$a;

    move-result-object v8

    new-instance v9, Lo/ejw$3;

    invoke-direct {v9, p0}, Lo/ejw$3;-><init>(Lo/ejw;)V

    iget-object v6, p0, Lo/ejw;->a:Lo/ejw$e;

    .line 197
    invoke-virtual {v6, v13}, Lo/ejw$e;->b(Lo/eii;)Lo/ejk;

    move-result-object v10

    .line 179
    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v10}, Lo/eii;->c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V

    .line 198
    goto :goto_0

    .line 201
    :cond_0
    return-void
.end method

.method public c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 6

    .line 208
    move-object v0, p0

    iget-object v1, p0, Lo/ejw;->a:Lo/ejw$e;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/ejw;->d(Lo/ejw$e;Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 209
    return-void
.end method

.method public d(Lo/eii;)V
    .locals 1

    .line 214
    iget-object v0, p0, Lo/ejw;->a:Lo/ejw$e;

    invoke-virtual {v0, p1}, Lo/ejw$e;->e(Lo/eii;)V

    .line 215
    return-void
.end method

.method public e(Lo/eii;FF)F
    .locals 1

    .line 157
    iget-object v0, p0, Lo/ejw;->e:Lo/ekd;

    invoke-interface {v0, p1, p2, p3}, Lo/ekd;->b(Lo/eii;FF)F

    move-result v0

    return v0
.end method

.method public e(I)I
    .locals 5

    .line 219
    invoke-virtual {p0, p1}, Lo/ejw;->c(I)I

    move-result v2

    .line 220
    invoke-virtual {p0, p1}, Lo/ejw;->d(I)I

    move-result v3

    .line 221
    int-to-float v0, v3

    int-to-float v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v4, v0

    .line 223
    return v4
.end method

.method public e(Lo/eii;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lo/ejw;->d:Lo/ejw$e;

    invoke-virtual {v0, p1}, Lo/ejw$e;->e(Lo/eii;)V

    .line 138
    return-void
.end method
