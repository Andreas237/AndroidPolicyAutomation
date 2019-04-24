.class final Lo/boj$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/boj$c;


# direct methods
.method constructor <init>(Lo/boj$c;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lo/boj$8;->e:Lo/boj$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 512
    iget-object v0, p0, Lo/boj$8;->e:Lo/boj$c;

    if-eqz v0, :cond_0

    .line 514
    iget-object v0, p0, Lo/boj$8;->e:Lo/boj$c;

    invoke-interface {v0}, Lo/boj$c;->d()V

    .line 516
    :cond_0
    return-void
.end method
