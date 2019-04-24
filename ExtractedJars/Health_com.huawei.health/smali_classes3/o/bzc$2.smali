.class Lo/bzc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bzc;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bzc;


# direct methods
.method constructor <init>(Lo/bzc;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 106
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getScrollY()I

    move-result v4

    .line 107
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    iget v0, v0, Lo/bzc;->g:I

    sub-int/2addr v0, v4

    if-nez v0, :cond_2

    .line 109
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    iget v0, v0, Lo/bzc;->g:I

    iget-object v1, p0, Lo/bzc$2;->e:Lo/bzc;

    iget v1, v1, Lo/bzc;->i:I

    rem-int v5, v0, v1

    .line 110
    if-eqz v5, :cond_1

    .line 111
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    iget v0, v0, Lo/bzc;->i:I

    div-int/lit8 v0, v0, 0x2

    if-le v5, v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-static {v0}, Lo/bzc;->a(Lo/bzc;)Lo/cah;

    move-result-object v0

    new-instance v1, Lo/bzc$2$5;

    invoke-direct {v1, p0, v5}, Lo/bzc$2$5;-><init>(Lo/bzc$2;I)V

    invoke-virtual {v0, v1}, Lo/cah;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-static {v0}, Lo/bzc;->a(Lo/bzc;)Lo/cah;

    move-result-object v0

    new-instance v1, Lo/bzc$2$2;

    invoke-direct {v1, p0, v5}, Lo/bzc$2$2;-><init>(Lo/bzc$2;I)V

    invoke-virtual {v0, v1}, Lo/cah;->post(Ljava/lang/Runnable;)Z

    .line 127
    :cond_1
    :goto_0
    goto :goto_1

    .line 128
    :cond_2
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    iget-object v1, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-virtual {v1}, Lo/bzc;->getScrollY()I

    move-result v1

    iput v1, v0, Lo/bzc;->g:I

    .line 129
    iget-object v0, p0, Lo/bzc$2;->e:Lo/bzc;

    invoke-static {v0}, Lo/bzc;->a(Lo/bzc;)Lo/cah;

    move-result-object v0

    iget-object v1, p0, Lo/bzc$2;->e:Lo/bzc;

    iget-object v1, v1, Lo/bzc;->f:Ljava/lang/Runnable;

    iget-object v2, p0, Lo/bzc$2;->e:Lo/bzc;

    iget v2, v2, Lo/bzc;->k:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lo/cah;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 131
    :goto_1
    return-void
.end method
