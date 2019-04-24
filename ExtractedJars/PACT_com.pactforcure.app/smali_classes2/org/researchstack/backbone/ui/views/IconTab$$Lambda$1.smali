.class final synthetic Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/ui/views/IconTab;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/ui/views/IconTab;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/views/IconTab;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/ui/views/IconTab;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;-><init>(Lorg/researchstack/backbone/ui/views/IconTab;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTab$$Lambda$1;->arg$1:Lorg/researchstack/backbone/ui/views/IconTab;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/IconTab;->lambda$adjustSelectedView$41(Lorg/researchstack/backbone/ui/views/IconTab;)V

    return-void
.end method
