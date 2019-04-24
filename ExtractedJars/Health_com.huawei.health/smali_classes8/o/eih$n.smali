.class public abstract Lo/eih$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eih$n$a;
    }
.end annotation


# instance fields
.field private a:I

.field protected c:Lo/eih$n$a;

.field private d:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 1

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih$n;->d:Lo/eih;

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    .line 223
    const/4 v0, 0x0

    iput v0, p0, Lo/eih$n;->a:I

    .line 226
    iput-object p1, p0, Lo/eih$n;->d:Lo/eih;

    .line 229
    new-instance v0, Lo/eih$n$a;

    invoke-direct {v0, p0}, Lo/eih$n$a;-><init>(Lo/eih$n;)V

    iput-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    .line 232
    return-void
.end method

.method static synthetic b(Lo/eih$n;)Lo/eih;
    .locals 1

    .line 217
    iget-object v0, p0, Lo/eih$n;->d:Lo/eih;

    return-object v0
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 235
    iput p1, p0, Lo/eih$n;->a:I

    .line 236
    return-void
.end method

.method protected abstract c(Lo/eih$n$a;Ljava/util/List;Lo/eih$g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih$n$a;Ljava/util/List<+Lo/ejl<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>;Lo/eih$g;)V"
        }
    .end annotation
.end method

.method public e()I
    .locals 1

    .line 239
    iget v0, p0, Lo/eih$n;->a:I

    return v0
.end method

.method public e(II)V
    .locals 3

    .line 245
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-virtual {v0, p1, p2}, Lo/eih$n$a;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-virtual {v0, p1, p2}, Lo/eih$n$a;->b(II)V

    .line 249
    iget-object v0, p0, Lo/eih$n;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getData()Lo/ma;

    move-result-object v0

    invoke-virtual {v0}, Lo/ma;->h()Ljava/util/List;

    move-result-object v2

    .line 250
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    new-instance v1, Lo/eih$n$5;

    invoke-direct {v1, p0}, Lo/eih$n$5;-><init>(Lo/eih$n;)V

    invoke-virtual {p0, v0, v2, v1}, Lo/eih$n;->c(Lo/eih$n$a;Ljava/util/List;Lo/eih$g;)V

    .line 261
    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    .line 291
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-virtual {v0}, Lo/eih$n$a;->c()V

    .line 292
    return-void
.end method

.method public h()Z
    .locals 7

    .line 265
    iget-object v0, p0, Lo/eih$n;->d:Lo/eih;

    iget v3, v0, Lo/eih;->aw:F

    .line 266
    iget-object v0, p0, Lo/eih$n;->d:Lo/eih;

    iget v4, v0, Lo/eih;->aA:F

    .line 268
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v0}, Lo/eih$n$a;->a(Lo/eih$n$a;)I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v0}, Lo/eih$n$a;->a(Lo/eih$n$a;)I

    move-result v0

    int-to-float v5, v0

    .line 269
    :goto_0
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v0}, Lo/eih$n$a;->c(Lo/eih$n$a;)I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_1

    move v6, v4

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v0}, Lo/eih$n$a;->c(Lo/eih$n$a;)I

    move-result v0

    int-to-float v6, v0

    .line 274
    :goto_1
    sub-float v0, v4, v3

    iget-object v1, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v1}, Lo/eih$n$a;->c(Lo/eih$n$a;)I

    move-result v1

    iget-object v2, p0, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-static {v2}, Lo/eih$n$a;->a(Lo/eih$n$a;)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    sub-float v1, v6, v5

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 278
    const/4 v0, 0x1

    return v0

    .line 281
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
