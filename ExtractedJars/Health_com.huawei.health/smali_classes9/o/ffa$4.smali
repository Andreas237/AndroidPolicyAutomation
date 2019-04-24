.class Lo/ffa$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffa;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ffa;


# direct methods
.method constructor <init>(Lo/ffa;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lo/ffa$4;->a:Lo/ffa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 448
    iget-object v0, p0, Lo/ffa$4;->a:Lo/ffa;

    invoke-static {v0}, Lo/ffa;->d(Lo/ffa;)Lo/ffa$a;

    move-result-object v0

    iget-object v1, p0, Lo/ffa$4;->a:Lo/ffa;

    invoke-static {v1}, Lo/ffa;->a(Lo/ffa;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/ffa$4;->a:Lo/ffa;

    invoke-static {v2}, Lo/ffa;->b(Lo/ffa;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/ffa$a;->a(Ljava/util/List;I)V

    .line 449
    return-void
.end method
