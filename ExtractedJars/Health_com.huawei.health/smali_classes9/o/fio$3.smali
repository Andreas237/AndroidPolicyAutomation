.class Lo/fio$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fio;->d(Lo/fio$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/fio;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/fio;II)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/fio$3;->c:Lo/fio;

    iput p2, p0, Lo/fio$3;->a:I

    iput p3, p0, Lo/fio$3;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lo/fio$3;->c:Lo/fio;

    invoke-static {v2}, Lo/fio;->d(Lo/fio;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/fio$3;->c:Lo/fio;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/fio;->e(Lo/fio;J)J

    goto :goto_0

    .line 147
    :cond_0
    return-void

    .line 149
    :goto_0
    iget-object v0, p0, Lo/fio$3;->c:Lo/fio;

    iget v1, p0, Lo/fio$3;->a:I

    iget v2, p0, Lo/fio$3;->e:I

    invoke-static {v0, v1, v2}, Lo/fio;->d(Lo/fio;II)V

    .line 151
    iget-object v0, p0, Lo/fio$3;->c:Lo/fio;

    iget v1, p0, Lo/fio$3;->e:I

    invoke-static {v0, v1}, Lo/fio;->a(Lo/fio;I)V

    .line 152
    return-void
.end method
