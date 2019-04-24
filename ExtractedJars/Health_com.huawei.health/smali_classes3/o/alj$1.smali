.class Lo/alj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alj;->c(Landroid/content/Context;Lo/alj$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lo/alj;

.field final synthetic e:Lo/alj$d;


# direct methods
.method constructor <init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lo/alj$1;->c:Lo/alj;

    iput-object p2, p0, Lo/alj$1;->b:Landroid/content/Context;

    iput-object p3, p0, Lo/alj$1;->e:Lo/alj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 357
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/alj$1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/alj$1;->e:Lo/alj$d;

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lo/alj;->d(Landroid/content/Context;ILo/alj$d;)V

    .line 360
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
