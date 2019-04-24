.class public final Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;
.super Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
.source "Phonemetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 205
    invoke-direct {p0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .locals 0

    .prologue
    .line 207
    return-object p0
.end method

.method public mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;
    .locals 2
    .param p1, "other"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .prologue
    .line 211
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 212
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;->setNationalNumberPattern(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 214
    :cond_0
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasPossibleNumberPattern()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 215
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleNumberPattern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;->setPossibleNumberPattern(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 217
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 218
    invoke-virtual {p1, v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLength(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;->addPossibleLength(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 217
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 220
    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthLocalOnlyCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 221
    invoke-virtual {p1, v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthLocalOnly(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;->addPossibleLengthLocalOnly(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 220
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 223
    :cond_3
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 224
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc$Builder;->setExampleNumber(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 226
    :cond_4
    return-object p0
.end method
