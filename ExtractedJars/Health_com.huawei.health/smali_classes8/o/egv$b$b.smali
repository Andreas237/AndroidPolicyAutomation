.class Lo/egv$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egv$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/egv$b;


# direct methods
.method constructor <init>(Lo/egv$b;)V
    .locals 0

    .line 448
    iput-object p1, p0, Lo/egv$b$b;->d:Lo/egv$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 451
    iget-object v0, p0, Lo/egv$b$b;->d:Lo/egv$b;

    iget-object v0, v0, Lo/egv$b;->d:Lo/egv;

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Lo/egv$b$b;->d:Lo/egv$b;

    iget-object v0, v0, Lo/egv$b;->d:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 455
    :cond_0
    iget-object v0, p0, Lo/egv$b$b;->d:Lo/egv$b;

    invoke-static {v0}, Lo/egv$b;->c(Lo/egv$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 456
    iget-object v0, p0, Lo/egv$b$b;->d:Lo/egv$b;

    invoke-static {v0}, Lo/egv$b;->c(Lo/egv$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 458
    :cond_1
    return-void
.end method
