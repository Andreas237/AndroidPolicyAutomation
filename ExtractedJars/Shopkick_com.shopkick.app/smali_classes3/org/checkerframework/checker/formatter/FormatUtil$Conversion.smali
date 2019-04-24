.class Lorg/checkerframework/checker/formatter/FormatUtil$Conversion;
.super Ljava/lang/Object;
.source "FormatUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/checkerframework/checker/formatter/FormatUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Conversion"
.end annotation


# instance fields
.field private final cath:Lorg/checkerframework/checker/formatter/qual/ConversionCategory;

.field private final index:I


# direct methods
.method public constructor <init>(CI)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput p2, p0, Lorg/checkerframework/checker/formatter/FormatUtil$Conversion;->index:I

    .line 28
    invoke-static {p1}, Lorg/checkerframework/checker/formatter/qual/ConversionCategory;->fromConversionChar(C)Lorg/checkerframework/checker/formatter/qual/ConversionCategory;

    move-result-object p1

    iput-object p1, p0, Lorg/checkerframework/checker/formatter/FormatUtil$Conversion;->cath:Lorg/checkerframework/checker/formatter/qual/ConversionCategory;

    return-void
.end method


# virtual methods
.method category()Lorg/checkerframework/checker/formatter/qual/ConversionCategory;
    .locals 1

    .line 36
    iget-object v0, p0, Lorg/checkerframework/checker/formatter/FormatUtil$Conversion;->cath:Lorg/checkerframework/checker/formatter/qual/ConversionCategory;

    return-object v0
.end method

.method index()I
    .locals 1

    .line 32
    iget v0, p0, Lorg/checkerframework/checker/formatter/FormatUtil$Conversion;->index:I

    return v0
.end method
