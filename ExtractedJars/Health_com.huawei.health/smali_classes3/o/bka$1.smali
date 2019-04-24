.class Lo/bka$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bka;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bka;


# direct methods
.method constructor <init>(Lo/bka;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/bka$1;->a:Lo/bka;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 173
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 175
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 176
    iget-object v0, p0, Lo/bka$1;->a:Lo/bka;

    invoke-static {v0}, Lo/bka;->e(Lo/bka;)V

    .line 177
    const/4 v0, 0x1

    return v0

    .line 181
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
