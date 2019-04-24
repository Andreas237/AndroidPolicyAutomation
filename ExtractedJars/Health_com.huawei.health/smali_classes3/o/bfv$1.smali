.class Lo/bfv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfv;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bfv;


# direct methods
.method constructor <init>(Lo/bfv;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lo/bfv$1;->c:Lo/bfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 302
    iget-object v0, p0, Lo/bfv$1;->c:Lo/bfv;

    invoke-static {v0}, Lo/bfv;->b(Lo/bfv;)Lo/bqy;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lo/bfv$1;->c:Lo/bfv;

    invoke-static {v0}, Lo/bfv;->b(Lo/bfv;)Lo/bqy;

    move-result-object v0

    invoke-interface {v0}, Lo/bqy;->b()V

    .line 306
    :cond_0
    iget-object v0, p0, Lo/bfv$1;->c:Lo/bfv;

    invoke-static {v0}, Lo/bfv;->a(Lo/bfv;)V

    .line 307
    return-void
.end method
