.class Lo/eth$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eth;->d(Lo/etb;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eth;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/eth;I)V
    .locals 0

    .line 47
    iput-object p1, p0, Lo/eth$1;->a:Lo/eth;

    iput p2, p0, Lo/eth$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lo/eth$1;->a:Lo/eth;

    invoke-static {v0}, Lo/eth;->c(Lo/eth;)Lo/eth$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/eth$1;->a:Lo/eth;

    invoke-static {v0}, Lo/eth;->c(Lo/eth;)Lo/eth$b;

    move-result-object v0

    iget v1, p0, Lo/eth$1;->d:I

    invoke-interface {v0, v1}, Lo/eth$b;->d(I)V

    .line 53
    :cond_0
    return-void
.end method
