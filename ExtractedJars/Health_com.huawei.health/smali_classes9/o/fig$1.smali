.class Lo/fig$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fig;->e(Lo/fig$a;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/fig;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/fig;II)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/fig$1;->b:Lo/fig;

    iput p2, p0, Lo/fig$1;->a:I

    iput p3, p0, Lo/fig$1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lo/fig$1;->b:Lo/fig;

    invoke-static {v2}, Lo/fig;->d(Lo/fig;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 140
    iget-object v0, p0, Lo/fig$1;->b:Lo/fig;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/fig;->d(Lo/fig;J)J

    goto :goto_0

    .line 142
    :cond_0
    return-void

    .line 144
    :goto_0
    iget-object v0, p0, Lo/fig$1;->b:Lo/fig;

    iget v1, p0, Lo/fig$1;->a:I

    iget v2, p0, Lo/fig$1;->e:I

    invoke-static {v0, v1, v2}, Lo/fig;->a(Lo/fig;II)V

    .line 146
    iget-object v0, p0, Lo/fig$1;->b:Lo/fig;

    iget v1, p0, Lo/fig$1;->e:I

    invoke-static {v0, v1}, Lo/fig;->c(Lo/fig;I)V

    .line 147
    return-void
.end method
