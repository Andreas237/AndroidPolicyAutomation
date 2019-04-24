.class final Lo/boj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILo/boj$d;)Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/boj$d;


# direct methods
.method constructor <init>(Lo/boj$d;)V
    .locals 0

    .line 569
    iput-object p1, p0, Lo/boj$3;->c:Lo/boj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 572
    if-eqz p1, :cond_0

    .line 574
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 576
    :cond_0
    iget-object v0, p0, Lo/boj$3;->c:Lo/boj$d;

    if-eqz v0, :cond_1

    .line 578
    iget-object v0, p0, Lo/boj$3;->c:Lo/boj$d;

    invoke-interface {v0}, Lo/boj$d;->b()V

    .line 580
    :cond_1
    return-void
.end method
