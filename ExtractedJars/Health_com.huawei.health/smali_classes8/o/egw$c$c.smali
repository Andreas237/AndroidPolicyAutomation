.class Lo/egw$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egw$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/egw$c;


# direct methods
.method constructor <init>(Lo/egw$c;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lo/egw$c$c;->a:Lo/egw$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 335
    iget-object v0, p0, Lo/egw$c$c;->a:Lo/egw$c;

    iget-object v0, v0, Lo/egw$c;->a:Lo/egw;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lo/egw$c$c;->a:Lo/egw$c;

    iget-object v0, v0, Lo/egw$c;->a:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 339
    :cond_0
    iget-object v0, p0, Lo/egw$c$c;->a:Lo/egw$c;

    invoke-static {v0}, Lo/egw$c;->c(Lo/egw$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 340
    iget-object v0, p0, Lo/egw$c$c;->a:Lo/egw$c;

    invoke-static {v0}, Lo/egw$c;->c(Lo/egw$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 342
    :cond_1
    const-string v0, "CustomViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positiveButtonClickListener is null in CustomViewDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    :goto_0
    return-void
.end method
