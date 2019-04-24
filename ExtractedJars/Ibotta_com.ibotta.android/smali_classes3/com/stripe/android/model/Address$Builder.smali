.class public Lcom/stripe/android/model/Address$Builder;
.super Ljava/lang/Object;
.source "Address.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/Address;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mCity:Ljava/lang/String;

.field private mCountry:Ljava/lang/String;

.field private mLine1:Ljava/lang/String;

.field private mLine2:Ljava/lang/String;

.field private mPostalCode:Ljava/lang/String;

.field private mState:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mCity:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mCountry:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mLine1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mLine2:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mPostalCode:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$500(Lcom/stripe/android/model/Address$Builder;)Ljava/lang/String;
    .locals 0

    .line 188
    iget-object p0, p0, Lcom/stripe/android/model/Address$Builder;->mState:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/stripe/android/model/Address;
    .locals 1

    .line 227
    new-instance v0, Lcom/stripe/android/model/Address;

    invoke-direct {v0, p0}, Lcom/stripe/android/model/Address;-><init>(Lcom/stripe/android/model/Address$Builder;)V

    return-object v0
.end method

.method public setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mCity:Ljava/lang/String;

    return-object p0
.end method

.method public setCountry(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 202
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mCountry:Ljava/lang/String;

    return-object p0
.end method

.method public setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mLine1:Ljava/lang/String;

    return-object p0
.end method

.method public setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mLine2:Ljava/lang/String;

    return-object p0
.end method

.method public setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mPostalCode:Ljava/lang/String;

    return-object p0
.end method

.method public setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/stripe/android/model/Address$Builder;->mState:Ljava/lang/String;

    return-object p0
.end method
