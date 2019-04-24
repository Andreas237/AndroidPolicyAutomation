.class public Lcom/usebutton/sdk/internal/models/Text;
.super Ljava/lang/Object;
.source "Text.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Text;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mColor:I

.field private final mCopy:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Text$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Text;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    .line 44
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    return-void
.end method

.method public static applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 96
    invoke-virtual {p1, p0}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    .line 98
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 106
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/TextDTO;->mColor:Ljava/lang/String;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/TextDTO;->mText:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static white(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 2

    .line 124
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    const/4 v1, -0x1

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public applyTo(Landroid/widget/TextView;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 147
    :cond_1
    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    .line 149
    iget v2, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    iget v3, p1, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    if-eq v2, v3, :cond_2

    return v1

    .line 152
    :cond_2
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public getColor()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    return v0
.end method

.method public getCopy()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 157
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    mul-int/lit8 v0, v0, 0x1f

    .line 158
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Text{mColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCopy=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 118
    iget p2, p0, Lcom/usebutton/sdk/internal/models/Text;->mColor:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/Text;->mCopy:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
