.class public final Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;
.super Ljava/lang/Object;
.source "ImConnectedDialogViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "retailerName",
        "",
        "retailerId",
        "",
        "disclaimer",
        "imConnectionViewState",
        "Lcom/ibotta/android/views/im/connection/ImConnectionViewState;",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V",
        "getDisclaimer",
        "()Ljava/lang/String;",
        "getImConnectionViewState",
        "()Lcom/ibotta/android/views/im/connection/ImConnectionViewState;",
        "getRetailerId",
        "()I",
        "getRetailerName",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState$Companion;

.field public static final EMPTY:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final disclaimer:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final retailerId:I

.field private final retailerName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->Companion:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState$Companion;

    .line 15
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->EMPTY:Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "retailerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imConnectionViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    iput p2, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    iput-object p3, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    iput-object p4, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const-string p3, ""

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 12
    sget-object p4, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;->EMPTY:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;ILjava/lang/Object;)Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->copy(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imConnectionViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

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

    instance-of v1, p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    iget v3, p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    iget-object p1, p1, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getImConnectionViewState()Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    return-object v0
.end method

.method public final getRetailerId()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    return v0
.end method

.method public final getRetailerName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImConnectedDialogViewState(retailerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", disclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->disclaimer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imConnectionViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
