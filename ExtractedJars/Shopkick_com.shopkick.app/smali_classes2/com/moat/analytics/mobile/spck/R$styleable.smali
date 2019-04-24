.class public final Lcom/moat/analytics/mobile/spck/R$styleable;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moat/analytics/mobile/spck/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final LoadingImageView:[I

.field public static final LoadingImageView_circleCrop:I = 0x0

.field public static final LoadingImageView_imageAspectRatio:I = 0x1

.field public static final LoadingImageView_imageAspectRatioAdjust:I = 0x2

.field public static final SignInButton:[I

.field public static final SignInButton_buttonSize:I = 0x0

.field public static final SignInButton_colorScheme:I = 0x1

.field public static final SignInButton_scopeUris:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    .line 94
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/moat/analytics/mobile/spck/R$styleable;->LoadingImageView:[I

    .line 98
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/moat/analytics/mobile/spck/R$styleable;->SignInButton:[I

    return-void

    :array_0
    .array-data 4
        0x7f0400ce
        0x7f04016c
        0x7f04016d
    .end array-data

    :array_1
    .array-data 4
        0x7f040091
        0x7f0400e5
        0x7f040207
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
