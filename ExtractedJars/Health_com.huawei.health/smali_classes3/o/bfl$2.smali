.class Lo/bfl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfl;->e(Lo/bfp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bfp;

.field final synthetic d:Lo/bfl;


# direct methods
.method constructor <init>(Lo/bfl;Lo/bfp;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/bfl$2;->d:Lo/bfl;

    iput-object p2, p0, Lo/bfl$2;->b:Lo/bfp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 102
    iget-object v0, p0, Lo/bfl$2;->b:Lo/bfp;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/bfl$2;->b:Lo/bfp;

    iget-object v1, p0, Lo/bfl$2;->d:Lo/bfl;

    invoke-interface {v0, v1}, Lo/bfp;->d(Lo/bfl;)V

    .line 106
    :cond_0
    return-void
.end method
