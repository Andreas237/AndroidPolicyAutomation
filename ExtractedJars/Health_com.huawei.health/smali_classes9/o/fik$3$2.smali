.class Lo/fik$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fik$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fik$3;


# direct methods
.method constructor <init>(Lo/fik$3;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lo/fik$3$2;->c:Lo/fik$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 438
    iget-object v0, p0, Lo/fik$3$2;->c:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->e(Lo/fik;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 439
    iget-object v0, p0, Lo/fik$3$2;->c:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    invoke-static {v0}, Lo/fik;->e(Lo/fik;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 440
    iget-object v0, p0, Lo/fik$3$2;->c:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fik;->e(Lo/fik;Lo/egy;)Lo/egy;

    .line 442
    :cond_0
    return-void
.end method
