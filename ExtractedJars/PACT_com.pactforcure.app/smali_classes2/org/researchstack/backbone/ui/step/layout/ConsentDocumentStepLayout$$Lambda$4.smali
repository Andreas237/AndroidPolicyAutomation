.class final synthetic Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final instance:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;

    invoke-direct {v0}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;->instance:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static lambdaFactory$()Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    sget-object v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;->instance:Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout$$Lambda$4;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p1, p2}, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;->lambda$showDialog$32(Landroid/content/DialogInterface;I)V

    return-void
.end method
