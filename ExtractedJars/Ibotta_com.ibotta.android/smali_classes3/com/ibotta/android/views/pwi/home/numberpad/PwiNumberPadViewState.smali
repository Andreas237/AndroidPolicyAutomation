.class public final Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
.super Ljava/lang/Object;
.source "PwiNumberPadViewState.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "textColorResId",
        "",
        "enable",
        "",
        "(IZ)V",
        "getEnable",
        "()Z",
        "getTextColorResId",
        "()I",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

.field private static final DISABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ENABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final enable:Z

.field private final textColorResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    .line 11
    new-instance v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    sget v1, Lcom/ibotta/views/R$color;->blowhole_green:I

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;-><init>(IZ)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->ENABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    .line 12
    new-instance v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    sget v1, Lcom/ibotta/views/R$color;->gray_cc:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;-><init>(IZ)V

    sput-object v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->DISABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v0, v0, v1, v2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;-><init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    iput-boolean p2, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 7
    sget p1, Lcom/ibotta/views/R$color;->gray_cc:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;-><init>(IZ)V

    return-void
.end method

.method public static final synthetic access$getDISABLED$cp()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->DISABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    return-object v0
.end method

.method public static final synthetic access$getENABLED$cp()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->ENABLED:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;IZILjava/lang/Object;)Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->copy(IZ)Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    return v0
.end method

.method public final copy(IZ)Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;-><init>(IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_3

    instance-of v1, p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    iget v3, p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    iget-boolean p1, p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public final getEnable()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    return v0
.end method

.method public final getTextColorResId()I
    .locals 1

    .line 7
    iget v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PwiNumberPadViewState(textColorResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->textColorResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
