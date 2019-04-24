.class public final Lcom/microblink/internal/phone/PhoneMatchMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/phone/PhoneMatch;",
        "[",
        "Lcom/microblink/internal/OcrPhone;",
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
.method public final transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/internal/phone/PhoneMatch;
    .locals 2
    .param p1    # [Lcom/microblink/internal/OcrPhone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object p1, p1, v0

    new-instance v0, Lcom/microblink/internal/phone/PhoneMatch;

    new-instance v1, Lcom/microblink/internal/phone/PhoneNumber;

    invoke-direct {v1}, Lcom/microblink/internal/phone/PhoneNumber;-><init>()V

    iget-object p1, p1, Lcom/microblink/internal/OcrPhone;->itemText:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->formatPhone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/microblink/internal/phone/PhoneNumber;->number(Ljava/lang/String;)Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/internal/phone/PhoneMatch;-><init>(Lcom/microblink/internal/phone/PhoneNumber;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, [Lcom/microblink/internal/OcrPhone;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/phone/PhoneMatchMapper;->transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/internal/phone/PhoneMatch;

    move-result-object p1

    return-object p1
.end method
