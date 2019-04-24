.class Lo/bwa$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->e(Lo/dgj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dgj;

.field final synthetic e:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;Lo/dgj;)V
    .locals 0

    .line 377
    iput-object p1, p0, Lo/bwa$4;->e:Lo/bwa;

    iput-object p2, p0, Lo/bwa$4;->b:Lo/dgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 385
    iget-object v0, p0, Lo/bwa$4;->b:Lo/dgj;

    invoke-virtual {v0}, Lo/dgj;->d()I

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lo/bwa$4;->e:Lo/bwa;

    iget-object v1, p0, Lo/bwa$4;->b:Lo/dgj;

    invoke-virtual {v1}, Lo/dgj;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bwa;->e(I)V

    .line 388
    :cond_0
    iget-object v0, p0, Lo/bwa$4;->e:Lo/bwa;

    iget-object v1, p0, Lo/bwa$4;->b:Lo/dgj;

    invoke-virtual {v1}, Lo/dgj;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bwa;->d(I)V

    .line 389
    return-void
.end method
