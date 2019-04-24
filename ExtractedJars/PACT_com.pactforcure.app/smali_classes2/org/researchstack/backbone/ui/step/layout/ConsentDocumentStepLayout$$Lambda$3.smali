.class final synthetic Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;-><init>(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;)V

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$3;->arg$1:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;

    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->lambda$showDialog$31(Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;Landroid/content/DialogInterface;I)V

    return-void
.end method
