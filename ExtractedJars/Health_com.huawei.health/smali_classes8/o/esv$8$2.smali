.class Lo/esv$8$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv$8;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esv$8;


# direct methods
.method constructor <init>(Lo/esv$8;)V
    .locals 0

    .line 569
    iput-object p1, p0, Lo/esv$8$2;->a:Lo/esv$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 572
    iget-object v0, p0, Lo/esv$8$2;->a:Lo/esv$8;

    iget-object v0, v0, Lo/esv$8;->a:Lo/esv;

    invoke-static {v0}, Lo/esv;->c(Lo/esv;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(ZLo/cmo;)V

    .line 573
    return-void
.end method
