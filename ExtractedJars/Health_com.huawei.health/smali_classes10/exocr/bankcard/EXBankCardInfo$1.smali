.class final Lexocr/bankcard/EXBankCardInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexocr/bankcard/EXBankCardInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lexocr/bankcard/EXBankCardInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lexocr/bankcard/EXBankCardInfo;
    .locals 2

    .line 79
    new-instance v0, Lexocr/bankcard/EXBankCardInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lexocr/bankcard/EXBankCardInfo;-><init>(Landroid/os/Parcel;Lexocr/bankcard/EXBankCardInfo$1;)V

    return-object v0
.end method

.method public a(I)[Lexocr/bankcard/EXBankCardInfo;
    .locals 1

    .line 85
    new-array v0, p1, [Lexocr/bankcard/EXBankCardInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0, p1}, Lexocr/bankcard/EXBankCardInfo$1;->a(Landroid/os/Parcel;)Lexocr/bankcard/EXBankCardInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0, p1}, Lexocr/bankcard/EXBankCardInfo$1;->a(I)[Lexocr/bankcard/EXBankCardInfo;

    move-result-object v0

    return-object v0
.end method
