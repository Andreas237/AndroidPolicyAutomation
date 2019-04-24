.class Lo/bxu$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxu$4;->onLayoutChange(Landroid/view/View;IIIIIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bxu$4;


# direct methods
.method constructor <init>(Lo/bxu$4;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lo/bxu$4$3;->c:Lo/bxu$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 425
    iget-object v0, p0, Lo/bxu$4$3;->c:Lo/bxu$4;

    iget-object v0, v0, Lo/bxu$4;->a:Lo/bxu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bxu;->e(Lo/bxu;I)V

    .line 426
    return-void
.end method
