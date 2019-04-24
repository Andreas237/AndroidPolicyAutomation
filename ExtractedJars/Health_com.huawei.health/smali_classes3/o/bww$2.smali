.class Lo/bww$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bww;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bww;


# direct methods
.method constructor <init>(Lo/bww;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/bww$2;->a:Lo/bww;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 2

    .line 125
    iget-object v0, p0, Lo/bww$2;->a:Lo/bww;

    invoke-static {v0}, Lo/bww;->d(Lo/bww;)Lo/byy;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/byy;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 126
    iget-object v0, p0, Lo/bww$2;->a:Lo/bww;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bww;->a(Lo/bww;Z)Z

    .line 127
    iget-object v0, p0, Lo/bww$2;->a:Lo/bww;

    invoke-static {v0}, Lo/bww;->e(Lo/bww;)V

    .line 128
    return-void
.end method
