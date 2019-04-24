.class Lo/cir$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 995
    iput-object p1, p0, Lo/cir$4;->e:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 998
    iget-object v0, p0, Lo/cir$4;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->l(Lo/cir;)V

    .line 999
    iget-object v0, p0, Lo/cir$4;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->n(Lo/cir;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1000
    return-void
.end method
