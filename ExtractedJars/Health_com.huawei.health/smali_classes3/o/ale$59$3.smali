.class Lo/ale$59$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$59;->onSuccess(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale$59;


# direct methods
.method constructor <init>(Lo/ale$59;)V
    .locals 0

    .line 689
    iput-object p1, p0, Lo/ale$59$3;->a:Lo/ale$59;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 692
    iget-object v0, p0, Lo/ale$59$3;->a:Lo/ale$59;

    iget-object v0, v0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->i(Lo/ale;)V

    .line 693
    return-void
.end method
