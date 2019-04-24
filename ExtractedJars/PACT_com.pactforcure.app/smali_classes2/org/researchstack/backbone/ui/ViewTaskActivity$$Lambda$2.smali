.class final synthetic Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/ViewTaskActivity;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;-><init>(Lorg/researchstack/backbone/ui/ViewTaskActivity;)V

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewTaskActivity$$Lambda$2;->arg$1:Lorg/researchstack/backbone/ui/ViewTaskActivity;

    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/ui/ViewTaskActivity;->lambda$showConfirmExitDialog$12(Lorg/researchstack/backbone/ui/ViewTaskActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
