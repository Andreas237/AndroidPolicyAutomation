.class Lo/egv$b$c;
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
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/egv$b;


# direct methods
.method constructor <init>(Lo/egv$b;)V
    .locals 0

    .line 433
    iput-object p1, p0, Lo/egv$b$c;->c:Lo/egv$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 436
    iget-object v0, p0, Lo/egv$b$c;->c:Lo/egv$b;

    iget-object v0, v0, Lo/egv$b;->d:Lo/egv;

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lo/egv$b$c;->c:Lo/egv$b;

    iget-object v0, v0, Lo/egv$b;->d:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 440
    :cond_0
    iget-object v0, p0, Lo/egv$b$c;->c:Lo/egv$b;

    invoke-static {v0}, Lo/egv$b;->e(Lo/egv$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 441
    iget-object v0, p0, Lo/egv$b$c;->c:Lo/egv$b;

    invoke-static {v0}, Lo/egv$b;->e(Lo/egv$b;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 443
    :cond_1
    const-string v0, "CustomTextAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positiveButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    :goto_0
    return-void
.end method
