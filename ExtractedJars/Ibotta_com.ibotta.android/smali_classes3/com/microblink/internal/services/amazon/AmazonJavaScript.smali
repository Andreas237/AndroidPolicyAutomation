.class final Lcom/microblink/internal/services/amazon/AmazonJavaScript;
.super Ljava/lang/Object;


# instance fields
.field private final js:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final modTime:I


# direct methods
.method constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/microblink/internal/services/amazon/AmazonJavaScript;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->js:Ljava/lang/String;

    iput p2, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->modTime:I

    return-void
.end method


# virtual methods
.method public final js()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->js:Ljava/lang/String;

    return-object v0
.end method

.method public final modTime()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->modTime:I

    return v0
.end method

.method public final noUpdatedNeeded()Z
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->modTime:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->js:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmazonJavaScript{js=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->js:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", modTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->modTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
