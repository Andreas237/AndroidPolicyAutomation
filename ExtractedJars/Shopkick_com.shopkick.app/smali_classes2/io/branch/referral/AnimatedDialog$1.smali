.class Lio/branch/referral/AnimatedDialog$1;
.super Ljava/lang/Object;
.source "AnimatedDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/referral/AnimatedDialog;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/AnimatedDialog;


# direct methods
.method constructor <init>(Lio/branch/referral/AnimatedDialog;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lio/branch/referral/AnimatedDialog$1;->this$0:Lio/branch/referral/AnimatedDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    .line 82
    iget-object p1, p0, Lio/branch/referral/AnimatedDialog$1;->this$0:Lio/branch/referral/AnimatedDialog;

    invoke-static {p1}, Lio/branch/referral/AnimatedDialog;->access$000(Lio/branch/referral/AnimatedDialog;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
