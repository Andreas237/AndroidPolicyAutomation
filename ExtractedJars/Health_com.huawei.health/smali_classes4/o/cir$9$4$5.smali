.class Lo/cir$9$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir$9$4;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir$9$4;


# direct methods
.method constructor <init>(Lo/cir$9$4;)V
    .locals 0

    .line 1023
    iput-object p1, p0, Lo/cir$9$4$5;->d:Lo/cir$9$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1026
    iget-object v0, p0, Lo/cir$9$4$5;->d:Lo/cir$9$4;

    iget-object v0, v0, Lo/cir$9$4;->a:Lo/cir$9;

    iget-object v0, v0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->l(Lo/cir;)V

    .line 1027
    return-void
.end method
