.class final Lcom/huawei/health/sns/ui/widget/SNSUrlSpan$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Landroid/text/style/URLSpan;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 106
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan$5;->e(Landroid/os/Parcel;)Landroid/text/style/URLSpan;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Landroid/text/style/URLSpan;
    .locals 1

    .line 117
    new-array v0, p1, [Landroid/text/style/URLSpan;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Landroid/text/style/URLSpan;
    .locals 1

    .line 111
    new-instance v0, Landroid/text/style/URLSpan;

    invoke-direct {v0, p1}, Landroid/text/style/URLSpan;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 106
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan$5;->d(I)[Landroid/text/style/URLSpan;

    move-result-object v0

    return-object v0
.end method
