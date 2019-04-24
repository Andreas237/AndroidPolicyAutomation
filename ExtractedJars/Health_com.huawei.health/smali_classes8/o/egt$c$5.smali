.class Lo/egt$c$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egt$c;->e()Lo/egt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/egt;

.field final synthetic e:Lo/egt$c;


# direct methods
.method constructor <init>(Lo/egt$c;Lo/egt;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lo/egt$c$5;->e:Lo/egt$c;

    iput-object p2, p0, Lo/egt$c$5;->d:Lo/egt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 261
    iget-object v0, p0, Lo/egt$c$5;->e:Lo/egt$c;

    invoke-static {v0}, Lo/egt$c;->e(Lo/egt$c;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v0

    iget-object v1, p0, Lo/egt$c$5;->d:Lo/egt;

    const/4 v2, -0x2

    invoke-interface {v0, v1, v2}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 262
    iget-object v0, p0, Lo/egt$c$5;->d:Lo/egt;

    invoke-virtual {v0}, Lo/egt;->dismiss()V

    .line 263
    return-void
.end method
