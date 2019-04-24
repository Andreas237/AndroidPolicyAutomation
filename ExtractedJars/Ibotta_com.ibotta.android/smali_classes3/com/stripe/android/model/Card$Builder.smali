.class public Lcom/stripe/android/model/Card$Builder;
.super Ljava/lang/Object;
.source "Card.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/Card;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private addressCity:Ljava/lang/String;

.field private addressCountry:Ljava/lang/String;

.field private addressLine1:Ljava/lang/String;

.field private addressLine1Check:Ljava/lang/String;

.field private addressLine2:Ljava/lang/String;

.field private addressState:Ljava/lang/String;

.field private addressZip:Ljava/lang/String;

.field private addressZipCheck:Ljava/lang/String;

.field private brand:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private customer:Ljava/lang/String;

.field private final cvc:Ljava/lang/String;

.field private cvcCheck:Ljava/lang/String;

.field private final expMonth:Ljava/lang/Integer;

.field private final expYear:Ljava/lang/Integer;

.field private fingerprint:Ljava/lang/String;

.field private funding:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private last4:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Size;
        value = 0x4L
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private final number:Ljava/lang/String;

.field private tokenizationMethod:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x1L
            to = 0xcL
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->number:Ljava/lang/String;

    .line 198
    iput-object p2, p0, Lcom/stripe/android/model/Card$Builder;->expMonth:Ljava/lang/Integer;

    .line 199
    iput-object p3, p0, Lcom/stripe/android/model/Card$Builder;->expYear:Ljava/lang/Integer;

    .line 200
    iput-object p4, p0, Lcom/stripe/android/model/Card$Builder;->cvc:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->number:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressState:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressZip:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressZipCheck:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressCountry:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->last4:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->brand:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->fingerprint:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->funding:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1800(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1900(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->currency:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->expMonth:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->customer:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->cvcCheck:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->tokenizationMethod:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->expYear:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$400(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->cvc:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$600(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressLine1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressLine1Check:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$800(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressLine2:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;
    .locals 0

    .line 159
    iget-object p0, p0, Lcom/stripe/android/model/Card$Builder;->addressCity:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public addressCity(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 229
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressCity:Ljava/lang/String;

    return-object p0
.end method

.method public addressCountry(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 253
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressCountry:Ljava/lang/String;

    return-object p0
.end method

.method public addressLine1(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 211
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressLine1:Ljava/lang/String;

    return-object p0
.end method

.method public addressLine1Check(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 217
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressLine1Check:Ljava/lang/String;

    return-object p0
.end method

.method public addressLine2(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 223
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressLine2:Ljava/lang/String;

    return-object p0
.end method

.method public addressState(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 235
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressState:Ljava/lang/String;

    return-object p0
.end method

.method public addressZip(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 241
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressZip:Ljava/lang/String;

    return-object p0
.end method

.method public addressZipCheck(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 247
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->addressZipCheck:Ljava/lang/String;

    return-object p0
.end method

.method public brand(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 259
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->brand:Ljava/lang/String;

    return-object p0
.end method

.method public build()Lcom/stripe/android/model/Card;
    .locals 2

    .line 323
    new-instance v0, Lcom/stripe/android/model/Card;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/model/Card;-><init>(Lcom/stripe/android/model/Card$Builder;Lcom/stripe/android/model/Card$1;)V

    return-object v0
.end method

.method public country(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 277
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public currency(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 283
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->currency:Ljava/lang/String;

    return-object p0
.end method

.method public customer(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 289
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->customer:Ljava/lang/String;

    return-object p0
.end method

.method public cvcCheck(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 295
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->cvcCheck:Ljava/lang/String;

    return-object p0
.end method

.method public fingerprint(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 265
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->fingerprint:Ljava/lang/String;

    return-object p0
.end method

.method public funding(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 271
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->funding:Ljava/lang/String;

    return-object p0
.end method

.method public id(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 307
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public last4(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 301
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->last4:Ljava/lang/String;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 205
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public tokenizationMethod(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 313
    iput-object p1, p0, Lcom/stripe/android/model/Card$Builder;->tokenizationMethod:Ljava/lang/String;

    return-object p0
.end method
