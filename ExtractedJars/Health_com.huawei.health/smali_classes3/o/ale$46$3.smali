.class Lo/ale$46$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$46;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale$46;


# direct methods
.method constructor <init>(Lo/ale$46;)V
    .locals 0

    .line 3610
    iput-object p1, p0, Lo/ale$46$3;->b:Lo/ale$46;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 3613
    iget-object v0, p0, Lo/ale$46$3;->b:Lo/ale$46;

    iget-object v0, v0, Lo/ale$46;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->K(Lo/ale;)V

    .line 3614
    return-void
.end method
