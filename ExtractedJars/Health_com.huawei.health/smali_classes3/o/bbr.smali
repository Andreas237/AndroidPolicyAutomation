.class public Lo/bbr;
.super Lo/bbi;
.source "SourceFile"


# instance fields
.field private h:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 21
    invoke-direct {p0, p1, p2}, Lo/bbi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_nopic_white:I

    invoke-virtual {v0, v1}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bbr;->h:Landroid/graphics/Bitmap;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bbr;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 39
    invoke-super {p0, p1}, Lo/bbi;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 45
    invoke-super {p0}, Lo/bbi;->hashCode()I

    move-result v0

    return v0
.end method
