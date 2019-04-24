.class Lo/egw$c$a;
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
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/egw$c;


# direct methods
.method constructor <init>(Lo/egw$c;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lo/egw$c$a;->d:Lo/egw$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 350
    iget-object v0, p0, Lo/egw$c$a;->d:Lo/egw$c;

    iget-object v0, v0, Lo/egw$c;->a:Lo/egw;

    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Lo/egw$c$a;->d:Lo/egw$c;

    iget-object v0, v0, Lo/egw$c;->a:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 354
    :cond_0
    iget-object v0, p0, Lo/egw$c$a;->d:Lo/egw$c;

    invoke-static {v0}, Lo/egw$c;->e(Lo/egw$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 355
    iget-object v0, p0, Lo/egw$c$a;->d:Lo/egw$c;

    invoke-static {v0}, Lo/egw$c;->e(Lo/egw$c;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 357
    :cond_1
    return-void
.end method
