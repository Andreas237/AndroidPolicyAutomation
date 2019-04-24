.class Lo/enk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enk;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/enk;


# direct methods
.method constructor <init>(Lo/enk;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lo/enk$4;->c:Lo/enk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 154
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    const-string v1, "scrollerTask"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    invoke-virtual {v0}, Lo/enk;->getScrollY()I

    move-result v4

    .line 156
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget v0, v0, Lo/enk;->f:I

    sub-int/2addr v0, v4

    if-nez v0, :cond_2

    .line 157
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget v0, v0, Lo/enk;->f:I

    iget-object v1, p0, Lo/enk$4;->c:Lo/enk;

    iget v1, v1, Lo/enk;->i:I

    rem-int v5, v0, v1

    .line 158
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget v0, v0, Lo/enk;->f:I

    iget-object v1, p0, Lo/enk$4;->c:Lo/enk;

    iget v1, v1, Lo/enk;->i:I

    div-int v6, v0, v1

    .line 159
    if-nez v5, :cond_0

    .line 160
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget-object v1, p0, Lo/enk$4;->c:Lo/enk;

    iget v1, v1, Lo/enk;->d:I

    add-int/2addr v1, v6

    iput v1, v0, Lo/enk;->b:I

    .line 161
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    invoke-static {v0}, Lo/enk;->d(Lo/enk;)V

    goto :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget v0, v0, Lo/enk;->i:I

    div-int/lit8 v0, v0, 0x2

    if-le v5, v0, :cond_1

    .line 164
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    new-instance v1, Lo/enk$4$2;

    invoke-direct {v1, p0, v5, v6}, Lo/enk$4$2;-><init>(Lo/enk$4;II)V

    invoke-virtual {v0, v1}, Lo/enk;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 173
    :cond_1
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    new-instance v1, Lo/enk$4$1;

    invoke-direct {v1, p0, v5, v6}, Lo/enk$4$1;-><init>(Lo/enk$4;II)V

    invoke-virtual {v0, v1}, Lo/enk;->post(Ljava/lang/Runnable;)Z

    .line 183
    :goto_0
    goto :goto_1

    .line 184
    :cond_2
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget-object v1, p0, Lo/enk$4;->c:Lo/enk;

    invoke-virtual {v1}, Lo/enk;->getScrollY()I

    move-result v1

    iput v1, v0, Lo/enk;->f:I

    .line 185
    iget-object v0, p0, Lo/enk$4;->c:Lo/enk;

    iget-object v1, p0, Lo/enk$4;->c:Lo/enk;

    iget-object v1, v1, Lo/enk;->h:Ljava/lang/Runnable;

    iget-object v2, p0, Lo/enk$4;->c:Lo/enk;

    iget v2, v2, Lo/enk;->k:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lo/enk;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 187
    :goto_1
    return-void
.end method
