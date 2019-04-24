.class Lo/ale$60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 750
    iput-object p1, p0, Lo/ale$60;->b:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 753
    iget-object v0, p0, Lo/ale$60;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->k(Lo/ale;)V

    .line 754
    iget-object v0, p0, Lo/ale$60;->b:Lo/ale;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;I)V

    .line 755
    iget-object v0, p0, Lo/ale$60;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->f(Lo/ale;)V

    .line 756
    return-void
.end method
