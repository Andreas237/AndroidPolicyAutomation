.class Lo/ale$48$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$48;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale$48;


# direct methods
.method constructor <init>(Lo/ale$48;)V
    .locals 0

    .line 3633
    iput-object p1, p0, Lo/ale$48$5;->a:Lo/ale$48;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 3636
    iget-object v0, p0, Lo/ale$48$5;->a:Lo/ale$48;

    iget-object v0, v0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->K(Lo/ale;)V

    .line 3637
    return-void
.end method
