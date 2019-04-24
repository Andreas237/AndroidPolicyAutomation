.class public Lcom/google/android/play/core/splitinstall/SplitInstallRequest;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;->a(Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;->b(Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->b:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;-><init>(Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;)V

    return-void
.end method

.method public static newBuilder()Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;
    .locals 2

    new-instance v0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest$Builder;-><init>(B)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->b:Ljava/util/List;

    return-object v0
.end method

.method public getModuleNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->a:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "SplitInstallRequest{modulesNames=%s,languages=%s}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->a:Ljava/util/List;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->b:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
