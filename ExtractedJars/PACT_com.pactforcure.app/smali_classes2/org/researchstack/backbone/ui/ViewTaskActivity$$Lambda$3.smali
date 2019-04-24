.class final synthetic Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field private final arg$1:Landroid/support/v7/app/AlertDialog;


# direct methods
.method private constructor <init>(Landroid/support/v7/app/AlertDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;->arg$1:Landroid/support/v7/app/AlertDialog;

    return-void
.end method

.method public static lambdaFactory$(Landroid/support/v7/app/AlertDialog;)Landroid/content/DialogInterface$OnShowListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;-><init>(Landroid/support/v7/app/AlertDialog;)V

    return-object v0
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$3;->arg$1:Landroid/support/v7/app/AlertDialog;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->lambda$showConfirmExitDialog$13(Landroid/support/v7/app/AlertDialog;Landroid/content/DialogInterface;)V

    return-void
.end method
