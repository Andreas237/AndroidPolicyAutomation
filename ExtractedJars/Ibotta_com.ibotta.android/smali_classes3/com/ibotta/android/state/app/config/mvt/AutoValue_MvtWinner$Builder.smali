.class final Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;
.super Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
.source "AutoValue_MvtWinner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private testName:Ljava/lang/String;

.field private variantName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
    .locals 4

    const-string v0, ""

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->testName:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " testName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->variantName:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 91
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " variantName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 96
    new-instance v0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->testName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->variantName:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$1;)V

    return-object v0

    .line 94
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

.method public testName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->testName:Ljava/lang/String;

    return-object p0

    .line 71
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null testName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public variantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;->variantName:Ljava/lang/String;

    return-object p0

    .line 79
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null variantName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
