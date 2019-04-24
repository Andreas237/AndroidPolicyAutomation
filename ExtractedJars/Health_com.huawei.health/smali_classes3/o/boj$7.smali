.class final Lo/boj$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->a(ZLandroid/app/AlertDialog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 335
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 339
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 342
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 343
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 345
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
