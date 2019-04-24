.class final Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;
.super Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
.source "AutoValue_DebugVariantRow.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private prettyVariantName:Ljava/lang/String;

.field private variantChosen:Ljava/lang/Boolean;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;
    .locals 4

    const-string v0, ""

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->prettyVariantName:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " prettyVariantName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->variantChosen:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " variantChosen"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 86
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 89
    new-instance v0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;

    iget-object v1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->prettyVariantName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->variantChosen:Ljava/lang/Boolean;

    .line 91
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow;-><init>(Ljava/lang/String;ZLcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$1;)V

    return-object v0

    .line 87
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public prettyVariantName(Ljava/lang/String;)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->prettyVariantName:Ljava/lang/String;

    return-object p0

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null prettyVariantName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public variantChosen(Z)Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow$Builder;
    .locals 0

    .line 74
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/views/debug/feature/detail/AutoValue_DebugVariantRow$Builder;->variantChosen:Ljava/lang/Boolean;

    return-object p0
.end method
