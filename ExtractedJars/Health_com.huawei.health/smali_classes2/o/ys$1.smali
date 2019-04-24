.class Lo/ys$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ys;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ys;

.field final synthetic b:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method constructor <init>(Lo/ys;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/ys$1;->a:Lo/ys;

    iput-object p2, p0, Lo/ys$1;->b:Landroid/content/DialogInterface$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lo/ys$1;->a:Lo/ys;

    invoke-static {v0}, Lo/ys;->a(Lo/ys;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lo/ys$1;->a:Lo/ys;

    invoke-virtual {v0}, Lo/ys;->dismiss()V

    .line 142
    :cond_0
    iget-object v0, p0, Lo/ys$1;->b:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v0, :cond_1

    .line 143
    iget-object v0, p0, Lo/ys$1;->b:Landroid/content/DialogInterface$OnClickListener;

    iget-object v1, p0, Lo/ys$1;->a:Lo/ys;

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 145
    :cond_1
    return-void
.end method
