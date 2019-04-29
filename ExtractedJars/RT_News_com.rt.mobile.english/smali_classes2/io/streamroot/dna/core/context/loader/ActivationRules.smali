.class public final Lio/streamroot/dna/core/context/loader/ActivationRules;
.super Ljava/lang/Object;
.source "Payload.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/loader/ActivationRules;",
        "",
        "bypassed",
        "",
        "backendPaths",
        "Lio/streamroot/dna/core/context/loader/BackendPaths;",
        "customerProperties",
        "Lio/streamroot/dna/core/context/loader/CustomerProperties;",
        "backendCounts",
        "Lio/streamroot/dna/core/context/loader/BackendCounts;",
        "(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)V",
        "getBackendCounts",
        "()Lio/streamroot/dna/core/context/loader/BackendCounts;",
        "getBackendPaths",
        "()Lio/streamroot/dna/core/context/loader/BackendPaths;",
        "getBypassed",
        "()Z",
        "getCustomerProperties",
        "()Lio/streamroot/dna/core/context/loader/CustomerProperties;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final bypassed:Z

.field private final customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)V
    .locals 1
    .param p2    # Lio/streamroot/dna/core/context/loader/BackendPaths;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/loader/CustomerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/context/loader/BackendCounts;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "backendPaths"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backendCounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    iput-object p2, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    iput-object p3, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    iput-object p4, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    return-void
.end method

.method public static synthetic copy$default(Lio/streamroot/dna/core/context/loader/ActivationRules;ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;ILjava/lang/Object;)Lio/streamroot/dna/core/context/loader/ActivationRules;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/streamroot/dna/core/context/loader/ActivationRules;->copy(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)Lio/streamroot/dna/core/context/loader/ActivationRules;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    return v0
.end method

.method public final component2()Lio/streamroot/dna/core/context/loader/BackendPaths;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    return-object v0
.end method

.method public final component3()Lio/streamroot/dna/core/context/loader/CustomerProperties;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    return-object v0
.end method

.method public final component4()Lio/streamroot/dna/core/context/loader/BackendCounts;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    return-object v0
.end method

.method public final copy(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)Lio/streamroot/dna/core/context/loader/ActivationRules;
    .locals 1
    .param p2    # Lio/streamroot/dna/core/context/loader/BackendPaths;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/loader/CustomerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/context/loader/BackendCounts;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "backendPaths"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backendCounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/streamroot/dna/core/context/loader/ActivationRules;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/streamroot/dna/core/context/loader/ActivationRules;-><init>(ZLio/streamroot/dna/core/context/loader/BackendPaths;Lio/streamroot/dna/core/context/loader/CustomerProperties;Lio/streamroot/dna/core/context/loader/BackendCounts;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    instance-of v1, p1, Lio/streamroot/dna/core/context/loader/ActivationRules;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lio/streamroot/dna/core/context/loader/ActivationRules;

    iget-boolean v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    iget-boolean v3, p1, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    if-ne v1, v3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    iget-object v3, p1, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    iget-object v3, p1, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    iget-object p1, p1, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method public final getBackendCounts()Lio/streamroot/dna/core/context/loader/BackendCounts;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    return-object v0
.end method

.method public final getBackendPaths()Lio/streamroot/dna/core/context/loader/BackendPaths;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    return-object v0
.end method

.method public final getBypassed()Z
    .locals 1

    .line 6
    iget-boolean v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    return v0
.end method

.method public final getCustomerProperties()Lio/streamroot/dna/core/context/loader/CustomerProperties;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivationRules(bypassed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->bypassed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", backendPaths="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendPaths:Lio/streamroot/dna/core/context/loader/BackendPaths;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerProperties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backendCounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/context/loader/ActivationRules;->backendCounts:Lio/streamroot/dna/core/context/loader/BackendCounts;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
