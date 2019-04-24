.class public final Lcom/microblink/internal/services/linux/LinuxPhoneMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/OcrPhone;",
        "Lcom/microblink/StringType;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(Lcom/microblink/StringType;)Lcom/microblink/internal/OcrPhone;
    .locals 1
    .param p1    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/OcrPhone;

    invoke-direct {v0}, Lcom/microblink/internal/OcrPhone;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/StringType;->value()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/microblink/internal/OcrPhone;->itemText:Ljava/lang/String;

    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/StringType;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxPhoneMapper;->transform(Lcom/microblink/StringType;)Lcom/microblink/internal/OcrPhone;

    move-result-object p1

    return-object p1
.end method
