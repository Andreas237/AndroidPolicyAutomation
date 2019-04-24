.class final Lo/boj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/boj$a;


# direct methods
.method constructor <init>(Lo/boj$a;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lo/boj$4;->d:Lo/boj$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 604
    iget-object v0, p0, Lo/boj$4;->d:Lo/boj$a;

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lo/boj$4;->d:Lo/boj$a;

    invoke-interface {v0, p2}, Lo/boj$a;->d(I)V

    .line 608
    :cond_0
    return-void
.end method
