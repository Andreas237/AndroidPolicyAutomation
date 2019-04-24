.class Lo/enj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enj;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enj;


# direct methods
.method constructor <init>(Lo/enj;)V
    .locals 0

    .line 429
    iput-object p1, p0, Lo/enj$5;->b:Lo/enj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 432
    iget-object v0, p0, Lo/enj$5;->b:Lo/enj;

    invoke-static {v0}, Lo/enj;->c(Lo/enj;)Lo/enj$b;

    move-result-object v0

    iget-object v1, p0, Lo/enj$5;->b:Lo/enj;

    invoke-static {v1}, Lo/enj;->a(Lo/enj;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/enj$5;->b:Lo/enj;

    invoke-static {v2}, Lo/enj;->e(Lo/enj;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/enj$b;->a(Ljava/util/List;I)V

    .line 433
    return-void
.end method
