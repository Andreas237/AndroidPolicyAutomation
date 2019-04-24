.class Lo/fha$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fha;->setSelection(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic e:Lo/fha;


# direct methods
.method constructor <init>(Lo/fha;I)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/fha$8;->e:Lo/fha;

    iput p2, p0, Lo/fha$8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 381
    iget-object v0, p0, Lo/fha$8;->e:Lo/fha;

    iget-object v1, p0, Lo/fha$8;->e:Lo/fha;

    iget v2, p0, Lo/fha$8;->a:I

    invoke-static {v1, v2}, Lo/fha;->e(Lo/fha;I)I

    move-result v1

    invoke-static {v0, v1}, Lo/fha;->d(Lo/fha;I)V

    .line 382
    iget-object v0, p0, Lo/fha$8;->e:Lo/fha;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fha;->b(Lo/fha;Z)V

    .line 383
    iget-object v0, p0, Lo/fha$8;->e:Lo/fha;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fha;->setVisibility(I)V

    .line 384
    return-void
.end method
