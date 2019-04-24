.class final synthetic Lorg/researchstack/backbone/StorageAccess$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final arg$1:Lorg/researchstack/backbone/StorageAccess;


# direct methods
.method private constructor <init>(Lorg/researchstack/backbone/StorageAccess;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/StorageAccess$$Lambda$1;->arg$1:Lorg/researchstack/backbone/StorageAccess;

    return-void
.end method

.method public static lambdaFactory$(Lorg/researchstack/backbone/StorageAccess;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/StorageAccess$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/StorageAccess$$Lambda$1;-><init>(Lorg/researchstack/backbone/StorageAccess;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/StorageAccess$$Lambda$1;->arg$1:Lorg/researchstack/backbone/StorageAccess;

    invoke-static {v0}, Lorg/researchstack/backbone/StorageAccess;->access$lambda$0(Lorg/researchstack/backbone/StorageAccess;)V

    return-void
.end method
