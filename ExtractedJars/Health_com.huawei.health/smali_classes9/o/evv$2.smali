.class Lo/evv$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evv;->a(Landroid/content/Context;JJLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evv;

.field final synthetic b:J

.field final synthetic c:Lo/ekr;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/evv;Lo/ekr;JJ)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/evv$2;->a:Lo/evv;

    iput-object p2, p0, Lo/evv$2;->c:Lo/ekr;

    iput-wide p3, p0, Lo/evv$2;->e:J

    iput-wide p5, p0, Lo/evv$2;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 10

    .line 251
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 252
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 253
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 255
    :cond_0
    return-void

    .line 257
    :cond_1
    move-object v7, p1

    check-cast v7, Landroid/util/SparseArray;

    .line 258
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 259
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 260
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 262
    :cond_2
    return-void

    .line 266
    :cond_3
    const v0, 0xad12

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 267
    move-object v8, v9

    check-cast v8, Ljava/util/List;

    .line 269
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 270
    iget-object v0, p0, Lo/evv$2;->c:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 273
    :cond_4
    iget-object v0, p0, Lo/evv$2;->a:Lo/evv;

    move-object v1, v8

    iget-object v2, p0, Lo/evv$2;->c:Lo/ekr;

    iget-wide v3, p0, Lo/evv$2;->e:J

    iget-wide v5, p0, Lo/evv$2;->b:J

    invoke-static/range {v0 .. v6}, Lo/evv;->a(Lo/evv;Ljava/util/List;Lo/ekr;JJ)V

    .line 274
    return-void
.end method
