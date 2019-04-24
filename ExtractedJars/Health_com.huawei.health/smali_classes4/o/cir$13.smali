.class Lo/cir$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cir;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cir;Ljava/lang/String;)V
    .locals 0

    .line 1231
    iput-object p1, p0, Lo/cir$13;->c:Lo/cir;

    iput-object p2, p0, Lo/cir$13;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1234
    iget-object v0, p0, Lo/cir$13;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->h()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->b()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$13;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1235
    iget-object v0, p0, Lo/cir$13;->c:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->l()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$13;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1236
    return-void
.end method
