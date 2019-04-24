.class Lo/cir$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir$5;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cir$5;


# direct methods
.method constructor <init>(Lo/cir$5;)V
    .locals 0

    .line 929
    iput-object p1, p0, Lo/cir$5$5;->b:Lo/cir$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 932
    iget-object v0, p0, Lo/cir$5$5;->b:Lo/cir$5;

    iget-object v0, v0, Lo/cir$5;->a:Lo/cir;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cir;->a(Lo/cir;Z)Z

    .line 933
    return-void
.end method
